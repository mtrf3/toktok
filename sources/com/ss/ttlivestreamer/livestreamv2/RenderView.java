package com.ss.ttlivestreamer.livestreamv2;

import X.X1D;
import Y.ARunnableS6S0001000_11;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.ss.ttlivestreamer.core.buffer.JavaI420Buffer;
import com.ss.ttlivestreamer.core.buffer.TextureBufferImpl;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class RenderView extends GLRenderVideoSink implements GLRenderVideoSink.GLRenderer, VideoFrameRenderer, TextureBufferImpl.ToI420Interface {
    public int frameCount;
    public long lastTime;
    public boolean mAspectRatio;
    public ILayerControl.CatchViewPic mCallback;
    public int[] mCatchPicRect;
    public GlRenderDrawer mDrawer;
    public boolean mEnable;
    public boolean mFitMode;
    public int mFrameHeight;
    public VideoFrameRender mFrameRender;
    public int mFrameWidth;
    public boolean mMirrorX;
    public boolean mMirrorY;
    public float[] mPrj;
    public VideoFrameStatics mRealRateStatistict;
    public boolean mSizedChanged;
    public int mWindHeight;
    public int mWindWidth;

    public static /* synthetic */ void lambda$pushVideoFrame$0() {
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        AVLog.iow("RenderView", "RenderView released.");
        super.release();
    }

    private void doCatchViewPic() {
        if (this.mCatchPicRect == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.0f, 1.0f);
        matrix.preScale(1.0f, -1.0f);
        int[] iArr = this.mCatchPicRect;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        ByteBuffer allocate = ByteBuffer.allocate(i3 * i4 * 4);
        GLES20.glReadPixels(i, i2, i3, i4, 6408, 5121, allocate);
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocate);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
        createBitmap.recycle();
        this.mCallback.onSucceed(createBitmap2);
        this.mCatchPicRect = null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
    public float getRealRatePerSeconds() {
        VideoFrameStatics videoFrameStatics = this.mRealRateStatistict;
        if (videoFrameStatics != null) {
            return videoFrameStatics.getRealRatePerSecond();
        }
        return -1.0f;
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink
    public void init() {
        super.init();
        setRenderer(this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" setRenderer");
        AVLog.iod("RenderView", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GLRenderer
    public void onSurfaceCreated() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" onSurfaceCreated");
        AVLog.iow("RenderView", X1D.LIZIZ(LIZ));
        this.mDrawer = new GlRenderDrawer();
        this.mFrameRender = new VideoFrameRender();
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GLRenderer
    public void onSurfaceDestroy() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" onSurfaceDestroy");
        AVLog.iow("RenderView", X1D.LIZIZ(LIZ));
        GlRenderDrawer glRenderDrawer = this.mDrawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.mDrawer = null;
        }
        VideoFrameRender videoFrameRender = this.mFrameRender;
        if (videoFrameRender != null) {
            videoFrameRender.release();
            this.mFrameRender = null;
        }
    }

    public int getWindHeight() {
        return this.mWindHeight;
    }

    public int getWindWidth() {
        return this.mWindWidth;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
    public boolean isEnable() {
        return this.mEnable;
    }

    public boolean isFitMode() {
        return this.mFitMode;
    }

    public RenderView(View view) {
        this(view, null, false, false);
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mMirrorX;
        }
        return this.mMirrorY;
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GLRenderer
    public void onDrawFrame(VideoFrame videoFrame) {
        if (this.mDrawer == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this);
            LIZ.append(" mDrawer is null");
            AVLog2.logToIODevice2(5, "RenderView", X1D.LIZIZ(LIZ), null, 45, 10000);
            return;
        }
        VideoFrameStatics videoFrameStatics = this.mRealRateStatistict;
        if (videoFrameStatics != null) {
            videoFrameStatics.add();
        }
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (this.mSizedChanged || rotatedHeight != this.mFrameHeight || rotatedWidth != this.mFrameWidth) {
            calcViewRatio(rotatedWidth, rotatedHeight);
            this.mSizedChanged = false;
        }
        VideoFrameRender videoFrameRender = this.mFrameRender;
        GlRenderDrawer glRenderDrawer = this.mDrawer;
        if (videoFrameRender != null && glRenderDrawer != null) {
            if (!videoFrameRender.drawFrame(videoFrame, glRenderDrawer, this.mPrj, null, 0, 0, this.mWindWidth, this.mWindHeight)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this);
                LIZ2.append(" Render frame failed timestamp ");
                LIZ2.append(videoFrame.getTimestampNs());
                AVLog2.logToIODevice2(5, "RenderView", X1D.LIZIZ(LIZ2), null, 46, 10000);
            }
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this);
            LIZ3.append(" Render frame failed: render ");
            LIZ3.append(videoFrameRender);
            LIZ3.append(", drawer ");
            LIZ3.append(glRenderDrawer);
            AVLog2.logToIODevice2(5, "RenderView", X1D.LIZIZ(LIZ3), null, 47, 10000);
        }
        doCatchViewPic();
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink, com.ss.ttlivestreamer.core.engine.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.frameCount++;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastTime >= 30000) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[repeat ");
            LIZ.append(this.frameCount);
            LIZ.append(" times] ");
            LIZ.append(this);
            LIZ.append(" onFrame videoFps is: ");
            LIZ.append(getRealRatePerSeconds());
            AVLog.iow("RenderView", X1D.LIZIZ(LIZ));
            this.lastTime = currentTimeMillis;
            this.frameCount = 0;
        }
        super.onFrame(videoFrame);
    }

    public void setAutoFullAspectRatioOnFit(boolean z) {
        this.mAspectRatio = z;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
    public void setEnable(boolean z) {
        this.mEnable = z;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
    public void setFitMode(boolean z) {
        this.mFitMode = z;
        this.mSizedChanged = true;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
        throw new AndroidRuntimeException("BUG! Should not be here.");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
    public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        throw new AndroidRuntimeException("BUG! cannot updateDescription when using renderview");
    }

    public void calcViewRatio(int i, int i2) {
        int i3;
        int i4;
        boolean z = this.mFitMode;
        if (this.mAspectRatio && (i3 = this.mWindWidth) > 0 && (i4 = this.mWindHeight) > 0) {
            float f = (i3 * 1.0f) / i4;
            if (f > 0.0f && ((i > i2 && f > 1.0f) || (i < i2 && f < 1.0f))) {
                AVLog.iow("RenderView", "Using full mode instead of fit");
                z = false;
            }
        }
        this.mFrameHeight = i2;
        this.mFrameWidth = i;
        android.opengl.Matrix.setIdentityM(this.mPrj, 0);
        calcWindRatio(z, this.mMirrorX, this.mMirrorY, this.mWindWidth, this.mWindHeight, i, i2, this.mPrj);
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GLRenderer
    public void onSurfaceChanged(int i, int i2) {
        this.mWindWidth = i;
        this.mWindHeight = i2;
        this.mSizedChanged = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" onSurfaceChanged (");
        LIZ.append(i);
        LIZ.append(",");
        LIZ.append(i2);
        LIZ.append(")");
        AVLog.iow("RenderView", X1D.LIZIZ(LIZ));
    }

    public void setMirror(boolean z, boolean z2) {
        if (z2) {
            this.mMirrorX = z;
        } else {
            this.mMirrorY = z;
        }
        this.mSizedChanged = true;
    }

    public RenderView(View view, Handler handler, boolean z, boolean z2) {
        super(view, handler, z2);
        float[] fArr = new float[16];
        this.mPrj = fArr;
        this.mEnable = true;
        android.opengl.Matrix.setIdentityM(fArr, 0);
        this.mFrameRender = new VideoFrameRender();
        if (z) {
            this.mRealRateStatistict = new VideoFrameStatics(1000);
        }
    }

    private int[] getCatchRegion(float f, float f2, float f3, float f4) {
        if (f < 0.0f || f2 < 0.0f || f4 < 0.0f || f3 < 0.0f) {
            return null;
        }
        if (f + f3 > 1.0d || f2 + f4 > 1.0d) {
            f3 = 1.0f - f;
            f4 = 1.0f - f2;
        }
        int i = this.mWindWidth;
        int i2 = this.mWindHeight;
        return new int[]{(int) (f * i), (int) (((1.0d - f2) - f4) * i2), (int) (f3 * i), (int) (f4 * i2)};
    }

    public void catchViewPic(float f, float f2, float f3, float f4, ILayerControl.CatchViewPic catchViewPic) {
        this.mCallback = catchViewPic;
        int[] catchRegion = getCatchRegion(f, f2, f3, f4);
        this.mCatchPicRect = catchRegion;
        if (catchRegion == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("data is invalid x:");
            LIZ.append(f);
            LIZ.append(" y:");
            LIZ.append(f2);
            LIZ.append(" w:");
            LIZ.append(f3);
            LIZ.append(" h:");
            LIZ.append(f4);
            catchViewPic.onError(new Exception(X1D.LIZIZ(LIZ)));
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
    public int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j) {
        long j2;
        if (!this.mEnable) {
            return -1;
        }
        JavaI420Buffer[] javaI420BufferArr = {null};
        if (byteBufferArr.length == 1) {
            ByteBuffer byteBuffer = byteBufferArr[0];
            int i4 = (i + 1) / 2;
            int i5 = i * i2;
            int i6 = ((i2 + 1) / 2) * i4;
            int i7 = i5 + i6;
            byteBuffer.position(0);
            byteBuffer.limit(i5);
            ByteBuffer slice = byteBuffer.slice();
            byteBuffer.position(i5);
            byteBuffer.limit(i7);
            ByteBuffer slice2 = byteBuffer.slice();
            byteBuffer.position(i7);
            byteBuffer.limit(i7 + i6);
            j2 = 0;
            javaI420BufferArr[0] = JavaI420Buffer.wrap(i, i2, slice, i, slice2, i4, byteBuffer.slice(), i4, 0L, null);
        } else {
            j2 = 0;
            javaI420BufferArr[0] = JavaI420Buffer.wrap(i, i2, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], 0L, null);
        }
        onFrame(new VideoFrame(javaI420BufferArr[0], 0, j2));
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        Matrix convertMatrixToAndroidGraphicsMatrix;
        VideoFrame.TextureBuffer.Type type;
        if (!this.mEnable) {
            return -1;
        }
        if (fArr == null) {
            convertMatrixToAndroidGraphicsMatrix = new Matrix();
        } else {
            convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
        }
        if (z) {
            type = VideoFrame.TextureBuffer.Type.OES;
        } else {
            type = VideoFrame.TextureBuffer.Type.RGB;
        }
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i2, i3, type, i, convertMatrixToAndroidGraphicsMatrix, this, new ARunnableS6S0001000_11(1, 1));
        textureBufferImpl.updateCaptureMs(TimeUtils.currentTimeMs());
        onFrame(new VideoFrame(textureBufferImpl, i4, 1000 * j));
        return 0;
    }

    public void calcWindRatio(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, float[] fArr) {
        RendererCommon.calcWindRatio(z, z2, z3, i, i2, i3, i4, fArr);
    }
}
