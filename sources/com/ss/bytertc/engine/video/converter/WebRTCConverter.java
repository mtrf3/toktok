package com.ss.bytertc.engine.video.converter;

import X.C16880lQ;
import X.X1D;
import X.ZWH;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.utils.ByteBufferUtils;
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class WebRTCConverter {
    public static final String TAG = C16880lQ.LJLLJ(WebRTCConverter.class);

    public static VideoFrame convertByteI420Frame2WebrtcI420Frame(com.ss.bytertc.engine.video.VideoFrame videoFrame) {
        if (videoFrame.getFrameType() != VideoFrameType.RAW_MEMORY || videoFrame.getPixelFormat() != VideoPixelFormat.I420) {
            return null;
        }
        videoFrame.retain();
        int width = videoFrame.getWidth();
        int height = videoFrame.getHeight();
        ByteBuffer planeData = videoFrame.getPlaneData(0);
        ByteBuffer planeData2 = videoFrame.getPlaneData(1);
        ByteBuffer planeData3 = videoFrame.getPlaneData(2);
        try {
            return new VideoFrame(JavaI420Buffer.wrap(width, height, planeData, videoFrame.getPlaneStride(0), planeData2, videoFrame.getPlaneStride(1), planeData3, videoFrame.getPlaneStride(2), new ZWH(videoFrame)), videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
        } catch (IllegalArgumentException e) {
            videoFrame.release();
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Frame convert failed: ");
            LIZ.append(e.getMessage());
            LogUtil.e(str, X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static VideoFrame convertByteRGBAFrame2WebrtcI420Frame(com.ss.bytertc.engine.video.VideoFrame videoFrame) {
        if (videoFrame.getFrameType() != VideoFrameType.RAW_MEMORY || videoFrame.getPixelFormat() != VideoPixelFormat.RGBA) {
            return null;
        }
        int width = videoFrame.getWidth();
        int height = videoFrame.getHeight();
        int planeStride = videoFrame.getPlaneStride(0);
        int i = ((width + 63) / 64) * 64;
        int i2 = (((width >> 1) + 63) / 64) * 64;
        ByteBuffer planeData = videoFrame.getPlaneData(0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * height);
        int i3 = ((height + 1) >> 1) * i2;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i3);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i3);
        ByteBufferUtils.nativeRGBAToI420(planeData, planeStride, allocateDirect, i, allocateDirect2, i2, allocateDirect3, i2, width, height);
        return new VideoFrame(JavaI420Buffer.wrap(width, height, allocateDirect, i, allocateDirect2, i2, allocateDirect3, i2, new ZWH(videoFrame)), videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
    }

    public static VideoFrame convertByteTexFrame2WebrtcTexFrame(com.ss.bytertc.engine.video.VideoFrame videoFrame, Looper looper) {
        VideoFrame.TextureBuffer.Type type;
        if (videoFrame.getFrameType() != VideoFrameType.GL_TEXTURE || looper == null) {
            return null;
        }
        Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(videoFrame.getTextureMatrix());
        if (videoFrame.getPixelFormat() == VideoPixelFormat.TEXTURE_2D) {
            type = VideoFrame.TextureBuffer.Type.RGB;
        } else {
            type = VideoFrame.TextureBuffer.Type.OES;
        }
        videoFrame.retain();
        return new VideoFrame(new TextureBufferImpl(videoFrame.getWidth(), videoFrame.getHeight(), type, videoFrame.getTextureID(), convertMatrixToAndroidGraphicsMatrix, new Handler(looper), new YuvConverter(), new ZWH(videoFrame)), videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
    }
}
