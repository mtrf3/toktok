package com.ss.ttlivestreamer.livestreamv2;

import X.AnonymousClass028;
import X.C48263Iwt;
import X.C7MY;
import X.X1D;
import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.JavaI420Buffer;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes12.dex */
public class TextureFrameAvailableSink extends VideoSink {
    public EGLContext mEGLContext11;
    public ByteBuffer mExtraBuffer;
    public ByteBuffer mJavaI420ByteBuffer;
    public ILiveStream.ITextureFrameAvailableListener mListener;

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public void OnDiscardedFrame() {
    }

    public ILiveStream.ITextureFrameAvailableListener getListener() {
        return this.mListener;
    }

    private ByteBuffer getFacePointsData(VideoFrame videoFrame) {
        RoiInfo rOIInfo = videoFrame.getBuffer().getROIInfo();
        if (rOIInfo != null) {
            rOIInfo.lockFacePointsData();
            ByteBuffer facePointsData = rOIInfo.getFacePointsData();
            rOIInfo.unlockFacePointsData();
            return facePointsData;
        }
        return null;
    }

    private ByteBuffer parseExtraData(VideoFrame videoFrame) {
        int readParcel;
        VideoFrame.IExtraData extraData = videoFrame.getExtraData();
        if (extraData != null && (extraData.getExtraDataFlag() & 1) > 0) {
            ByteBuffer byteBuffer = this.mExtraBuffer;
            if (byteBuffer == null) {
                int peekParcelSize = extraData.peekParcelSize();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(peekParcelSize);
                this.mExtraBuffer = allocateDirect;
                readParcel = extraData.readParcel(allocateDirect);
                if (readParcel > peekParcelSize || readParcel < 0) {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C48263Iwt.LIZLLL("Bug ", readParcel, " VS ", peekParcelSize));
                    if (AnonymousClass028.LJI(androidRuntimeException, "TextureFrameAvailableSink.parseExtraData@1")) {
                        throw androidRuntimeException;
                    }
                }
            } else {
                readParcel = extraData.readParcel(byteBuffer);
                if (readParcel < 0) {
                    int peekParcelSize2 = extraData.peekParcelSize();
                    if (this.mExtraBuffer.capacity() > peekParcelSize2) {
                        StringBuilder LJ = C7MY.LJ("Read parcel error. extraBuffer ", peekParcelSize2, " VS ");
                        LJ.append(this.mExtraBuffer.capacity());
                        AVLog.ioe("TextureFrameAvailableSink", X1D.LIZIZ(LJ));
                    } else {
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(peekParcelSize2);
                        this.mExtraBuffer = allocateDirect2;
                        readParcel = extraData.readParcel(allocateDirect2);
                        if (readParcel != peekParcelSize2) {
                            AndroidRuntimeException androidRuntimeException2 = new AndroidRuntimeException(C48263Iwt.LIZLLL("Bug ", readParcel, " VS ", peekParcelSize2));
                            if (AnonymousClass028.LJI(androidRuntimeException2, "TextureFrameAvailableSink.parseExtraData@2")) {
                                throw androidRuntimeException2;
                            }
                        }
                    }
                }
            }
            if (readParcel > 0) {
                this.mExtraBuffer.position(0);
                this.mExtraBuffer.limit(readParcel);
                return this.mExtraBuffer.slice();
            }
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener = this.mListener;
        if (iTextureFrameAvailableListener == null || videoFrame == null) {
            return;
        }
        if (this.mEGLContext11 == null) {
            EGL egl = EGLContext.getEGL();
            if (egl instanceof EGL10) {
                this.mEGLContext11 = ((EGL10) egl).eglGetCurrentContext();
            }
        }
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) videoFrame.getBuffer();
            Matrix transformMatrix = textureBuffer.getTransformMatrix();
            if (videoFrame.getRotation() != 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                matrix.preTranslate(0.5f, 0.5f);
                matrix.preRotate(-videoFrame.getRotation());
                matrix.preTranslate(-0.5f, -0.5f);
                if (transformMatrix != null) {
                    matrix.preConcat(transformMatrix);
                }
                transformMatrix = matrix;
            }
            EGLContext eGLContext = this.mEGLContext11;
            int textureId = textureBuffer.getTextureId();
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                z = true;
            } else {
                z = false;
            }
            iTextureFrameAvailableListener.onTextureFrameAvailable(eGLContext, textureId, z, rotatedWidth, rotatedHeight, videoFrame.getTimestampNs(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(transformMatrix), parseExtraData(videoFrame), getFacePointsData(videoFrame));
            return;
        }
        if (videoFrame.getBuffer() instanceof JavaI420Buffer) {
            if (!(iTextureFrameAvailableListener instanceof LiveCore.ILiveCoreVideoFrameAvailableListener)) {
                return;
            }
            JavaI420Buffer javaI420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
            ByteBuffer byteBuffer = this.mJavaI420ByteBuffer;
            if (byteBuffer == null || byteBuffer.capacity() < ((rotatedHeight * rotatedWidth) * 3) / 2) {
                this.mJavaI420ByteBuffer = ByteBuffer.allocateDirect(((rotatedHeight * rotatedWidth) * 3) / 2);
            }
            this.mJavaI420ByteBuffer.position(0);
            int i = rotatedHeight * rotatedWidth;
            this.mJavaI420ByteBuffer.limit(i);
            this.mJavaI420ByteBuffer.put(javaI420Buffer.getDataY());
            this.mJavaI420ByteBuffer.position(i);
            int i2 = (i * 5) / 4;
            this.mJavaI420ByteBuffer.limit(i2);
            this.mJavaI420ByteBuffer.put(javaI420Buffer.getDataU());
            this.mJavaI420ByteBuffer.position(i2);
            this.mJavaI420ByteBuffer.limit((i * 3) / 2);
            this.mJavaI420ByteBuffer.put(javaI420Buffer.getDataV());
            this.mJavaI420ByteBuffer.rewind();
            ByteBuffer byteBuffer2 = this.mJavaI420ByteBuffer;
            byteBuffer2.limit(byteBuffer2.capacity());
            ((LiveCore.ILiveCoreVideoFrameAvailableListener) iTextureFrameAvailableListener).onI420FrameAvailable(this.mJavaI420ByteBuffer, rotatedWidth, rotatedHeight, videoFrame.getTimestampNs(), parseExtraData(videoFrame), getFacePointsData(videoFrame));
            return;
        }
        AVLog.e("TextureFrameAvailableSink", "Unsupport format");
    }

    public void setListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        this.mListener = iTextureFrameAvailableListener;
    }
}
