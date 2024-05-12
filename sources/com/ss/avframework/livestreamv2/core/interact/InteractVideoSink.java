package com.ss.avframework.livestreamv2.core.interact;

import X.AnonymousClass028;
import X.C25620zW;
import X.X1D;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.ss.avframework.livestreamv2.core.interact.media.MediaEngine;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.utils.InteractThreadUtils;
import com.ss.avframework.livestreamv2.core.interact.video.VideoSink;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpProxy;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class InteractVideoSink implements VideoSink {
    public boolean fixRemoteYuvProjection;
    public final InteractEngineBuilder mBuilder;
    public boolean mDeleteTextureWhenResize;
    public VideoFrameRenderer mFrameRenderer;
    public GlRenderDrawer mGlDrawer;
    public boolean mGlFinishAfterDrawYuv;
    public final Handler mHandler;
    public int mHeight;
    public String mInteractId;
    public boolean mIsChorusSinger;
    public boolean mIsPushStreamPause;
    public MediaEngine mMediaEngine;
    public IInputVideoStream mOutVideoStream;
    public float[] mProj;
    public VideoDumpProxy.RawVideoDumperProxy mRawVideoDumper;
    public boolean mRelease;
    public int mRtcDeliverType;
    public GlTextureFrameBuffer mTextureFrameBuffer;
    public VideoDumpProxy.RawVideoDumperProxy mTextureVideoDumper;
    public long mTimeStampUsBaseDiff;
    public final VPassInteractCfg mVPassInteractCfgCfg;
    public View mView;
    public int mWidth;
    public ByteBuffer mYuvBuffer;
    public boolean sinkValid;
    public int[] mYuvTex = {0, 0, 0};
    public boolean isRenderAble = true;

    private void dump2DTextureFrame(int i, int i2, int i3, int i4, float[] fArr, String str) {
    }

    private void dumpYuvFrame(ByteBuffer byteBuffer, int i, int i2, int i3, String str) {
    }

    private void dumpYuvFrame(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, String str) {
    }

    private void releaseRawVideoDumper() {
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
    }

    private void createOutVideoStream() {
        LiveCore liveCore;
        if (this.mOutVideoStream == null && (liveCore = this.mBuilder.getLiveCore()) != null) {
            IInputVideoStream createInputVideoStream = liveCore.createInputVideoStream();
            this.mOutVideoStream = createInputVideoStream;
            if (createInputVideoStream != null) {
                createInputVideoStream.start();
                this.mOutVideoStream.setMixerDescription(VideoMixer.VideoMixerDescription.INVISIABLE());
            }
        }
    }

    private void releaseOutVideoStream() {
        IInputVideoStream iInputVideoStream = this.mOutVideoStream;
        if (iInputVideoStream != null) {
            iInputVideoStream.stop();
            this.mOutVideoStream.release();
            this.mOutVideoStream = null;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public SurfaceView getSurfaceView() {
        View view = this.mView;
        if (view == null || !(view instanceof SurfaceView)) {
            return null;
        }
        return (SurfaceView) view;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public int getTextureID() {
        GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureFrameBuffer;
        if (glTextureFrameBuffer != null) {
            return glTextureFrameBuffer.getTextureId();
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public TextureView getTextureView() {
        View view = this.mView;
        if (view == null || !(view instanceof TextureView)) {
            return null;
        }
        return (TextureView) view;
    }

    public void releaseYuvTexturesOnGlThread() {
        int[] iArr = this.mYuvTex;
        if (iArr[0] > 0) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int i = 0;
            while (true) {
                int[] iArr2 = this.mYuvTex;
                if (i < iArr2.length) {
                    iArr2[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public IInputVideoStream getOutVideoStream() {
        createOutVideoStream();
        return this.mOutVideoStream;
    }

    public void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("begin release [");
        LIZ.append(this);
        LIZ.append("]");
        AVLog.ioi("InteractVideoSink", X1D.LIZIZ(LIZ));
        this.mRelease = true;
        this.sinkValid = false;
        this.mTimeStampUsBaseDiff = 0L;
        if (this.mGlDrawer != null || this.mTextureFrameBuffer != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractVideoSink.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$1__run$___twin___() {
                    AVLog.ioi("InteractVideoSink", "Release Yuv texture on InteractVideoSink.");
                    InteractVideoSink.this.releaseTextureOnGlThread();
                }

                public static void com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ2;
                    try {
                        anonymousClass1.com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$1__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
        VideoFrameRenderer videoFrameRenderer = this.mFrameRenderer;
        if (videoFrameRenderer != null) {
            videoFrameRenderer.release();
            this.mFrameRenderer = null;
        }
        releaseOutVideoStream();
        releaseRawVideoDumper();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("end release [");
        LIZ2.append(this);
        LIZ2.append("]");
        AVLog.ioi("InteractVideoSink", X1D.LIZIZ(LIZ2));
    }

    public void releaseTextureOnGlThread() {
        releaseYuvTexturesOnGlThread();
        GlRenderDrawer glRenderDrawer = this.mGlDrawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.mGlDrawer = null;
        }
        GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureFrameBuffer;
        if (glTextureFrameBuffer != null) {
            glTextureFrameBuffer.release();
            this.mTextureFrameBuffer = null;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public String getInteractId() {
        return this.mInteractId;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public VideoFrameRenderer getVideoFrameRender() {
        return this.mFrameRenderer;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public boolean isValid() {
        return this.sinkValid;
    }

    private long adjustVideoTimeStamp(long j) {
        if (this.mTimeStampUsBaseDiff == 0) {
            this.mTimeStampUsBaseDiff = j - TimeUtils.currentTimeMs();
        }
        return j - this.mTimeStampUsBaseDiff;
    }

    public int align(int i) {
        return (((i + 8) - 1) / 8) * 8;
    }

    public void pausePushVideo(boolean z) {
        this.mIsPushStreamPause = z;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public void setFitMode(final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractVideoSink.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$2__run$___twin___() {
                VideoFrameRenderer videoFrameRenderer = InteractVideoSink.this.mFrameRenderer;
                if (videoFrameRenderer != null) {
                    videoFrameRenderer.setFitMode(z);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void setIsChorusSinger(boolean z) {
        this.mIsChorusSinger = z;
        if (z) {
            releaseOutVideoStream();
        } else {
            createOutVideoStream();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public void setRenderAble(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("render old state:");
        LIZ.append(this.isRenderAble);
        LIZ.append(", new state:");
        LIZ.append(z);
        AVLog.ioi("InteractVideoSink", X1D.LIZIZ(LIZ));
        this.isRenderAble = z;
    }

    private void createTexture(final int i, final int i2) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractVideoSink.5
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$5__run$___twin___() {
                InteractVideoSink interactVideoSink = InteractVideoSink.this;
                if (interactVideoSink.mRelease) {
                    return;
                }
                if (interactVideoSink.mGlDrawer == null) {
                    interactVideoSink.mGlDrawer = new GlRenderDrawer();
                    InteractVideoSink interactVideoSink2 = InteractVideoSink.this;
                    interactVideoSink2.mGlDrawer.setUseVideoRangeDefault(interactVideoSink2.mVPassInteractCfgCfg.interactUseVideoRangeDefaultDrawer);
                }
                if (InteractVideoSink.this.mTextureFrameBuffer == null) {
                    GlTextureFrameBuffer.Config config = new GlTextureFrameBuffer.Config();
                    InteractVideoSink interactVideoSink3 = InteractVideoSink.this;
                    config.mDeleteTextureWhenResize = interactVideoSink3.mDeleteTextureWhenResize;
                    interactVideoSink3.mTextureFrameBuffer = new GlTextureFrameBuffer(6408, config);
                }
                InteractVideoSink.this.mTextureFrameBuffer.setSize(i, i2);
                int align = InteractVideoSink.this.align(i);
                int i3 = (align + 1) >> 1;
                int i4 = (i2 + 1) >> 1;
                InteractVideoSink.this.releaseYuvTexturesOnGlThread();
                InteractVideoSink interactVideoSink4 = InteractVideoSink.this;
                interactVideoSink4.mYuvTex[0] = interactVideoSink4.genTextureWithInit(33984, align, i2);
                InteractVideoSink interactVideoSink5 = InteractVideoSink.this;
                interactVideoSink5.mYuvTex[1] = interactVideoSink5.genTextureWithInit(33985, i3, i4);
                InteractVideoSink interactVideoSink6 = InteractVideoSink.this;
                interactVideoSink6.mYuvTex[2] = interactVideoSink6.genTextureWithInit(33986, i3, i4);
                InteractVideoSink interactVideoSink7 = InteractVideoSink.this;
                interactVideoSink7.mWidth = i;
                interactVideoSink7.mHeight = i2;
                interactVideoSink7.mProj = null;
            }

            public static void com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public int genTextureWithInit(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, GlUtil.getFilterType(9729));
        GLES20.glTexParameterf(3553, 10240, GlUtil.getFilterType(9729));
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6409, i2, i3, 0, 6409, 5121, null);
        return iArr[0];
    }

    public void updateI420Image(int[] iArr, ByteBuffer[] byteBufferArr, int[] iArr2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = (i + 1) >> 1;
        int i7 = (i2 + 1) >> 1;
        int i8 = iArr[0];
        if (iArr2 != null) {
            i3 = iArr2[0];
        } else {
            i3 = -1;
        }
        updateTexSubImage(33984, i8, i, i2, i3, byteBufferArr[0]);
        int i9 = iArr[1];
        if (iArr2 != null) {
            i4 = iArr2[1];
        } else {
            i4 = -1;
        }
        updateTexSubImage(33985, i9, i6, i7, i4, byteBufferArr[1]);
        int i10 = iArr[2];
        if (iArr2 != null) {
            i5 = iArr2[2];
        } else {
            i5 = -1;
        }
        updateTexSubImage(33986, i10, i6, i7, i5, byteBufferArr[2]);
    }

    private boolean loadYuvAndDraw(final ByteBuffer[] byteBufferArr, final int[] iArr, final int i, final int i2, final Config.VideoOutputFormat videoOutputFormat, final int i3) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this.mTextureFrameBuffer == null || this.mGlDrawer == null || this.mYuvTex[0] <= 0) {
            return atomicBoolean.get();
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractVideoSink.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$4__run$___twin___() {
                ByteBuffer slice;
                ByteBuffer slice2;
                ByteBuffer slice3;
                InteractVideoSink interactVideoSink = InteractVideoSink.this;
                if (interactVideoSink.mRelease) {
                    return;
                }
                if (videoOutputFormat != Config.VideoOutputFormat.PIXEL_FORMAT_I420) {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG!");
                    if (!AnonymousClass028.LJI(androidRuntimeException, "InteractVideoSink.loadYuvAndDraw")) {
                        return;
                    } else {
                        throw androidRuntimeException;
                    }
                }
                int align = interactVideoSink.align(i);
                ByteBuffer[] byteBufferArr2 = byteBufferArr;
                if (byteBufferArr2.length == 1) {
                    ByteBuffer byteBuffer = byteBufferArr2[0];
                    int capacity = byteBuffer.capacity();
                    int i4 = i;
                    if (capacity < ((i2 * i4) * 3) / 2) {
                        return;
                    }
                    if (align == i4 && byteBuffer.isDirect()) {
                        byteBuffer.position(0);
                        byteBuffer.limit(i * i2);
                        slice = byteBuffer.slice();
                        byteBuffer.position(i * i2);
                        byteBuffer.limit(((i * i2) * 5) / 4);
                        slice2 = byteBuffer.slice();
                        byteBuffer.position(((i * i2) * 5) / 4);
                        byteBuffer.limit(((i * i2) * 3) / 2);
                        slice3 = byteBuffer.slice();
                    } else {
                        int i5 = ((i2 * align) * 3) / 2;
                        ByteBuffer byteBuffer2 = InteractVideoSink.this.mYuvBuffer;
                        if (byteBuffer2 == null || byteBuffer2.capacity() < i5) {
                            InteractVideoSink.this.mYuvBuffer = ByteBuffer.allocateDirect(i5);
                        }
                        byteBuffer.position(0);
                        InteractVideoSink.this.mYuvBuffer.position(0);
                        InteractVideoSink.this.mYuvBuffer.limit(i2 * align);
                        slice = InteractVideoSink.this.mYuvBuffer.slice();
                        int i6 = i;
                        if (align == i6) {
                            byteBuffer.limit(i6 * i2);
                            slice.put(byteBuffer);
                        } else {
                            for (int i7 = 0; i7 < i2; i7++) {
                                byteBuffer.limit(byteBuffer.position() + i);
                                slice.put(byteBuffer);
                                if (InteractVideoSink.this.fixRemoteYuvProjection) {
                                    slice.position((slice.position() + align) - i);
                                } else {
                                    byteBuffer.position(byteBuffer.limit() - (align - i));
                                    slice.put(byteBuffer);
                                }
                            }
                        }
                        slice.position(0);
                        InteractVideoSink.this.mYuvBuffer.position(i2 * align);
                        InteractVideoSink.this.mYuvBuffer.limit(((i2 * align) * 5) / 4);
                        slice2 = InteractVideoSink.this.mYuvBuffer.slice();
                        int i8 = i;
                        if (align == i8) {
                            byteBuffer.limit(((i8 * i2) * 5) / 4);
                            slice2.put(byteBuffer);
                        } else {
                            for (int i9 = 0; i9 < i2 / 2; i9++) {
                                byteBuffer.limit((i / 2) + byteBuffer.position());
                                slice2.put(byteBuffer);
                                if (InteractVideoSink.this.fixRemoteYuvProjection) {
                                    slice2.position(((align - i) / 2) + slice2.position());
                                } else {
                                    byteBuffer.position(byteBuffer.limit() - ((align - i) / 2));
                                    slice2.put(byteBuffer);
                                }
                            }
                        }
                        slice2.position(0);
                        InteractVideoSink.this.mYuvBuffer.position(((i2 * align) * 5) / 4);
                        InteractVideoSink.this.mYuvBuffer.limit(((i2 * align) * 3) / 2);
                        slice3 = InteractVideoSink.this.mYuvBuffer.slice();
                        int i10 = i;
                        if (align == i10) {
                            byteBuffer.limit(((i10 * i2) * 3) / 2);
                            slice3.put(byteBuffer);
                        } else {
                            for (int i11 = 0; i11 < i2 / 2; i11++) {
                                byteBuffer.limit((i / 2) + byteBuffer.position());
                                slice3.put(byteBuffer);
                                if (InteractVideoSink.this.fixRemoteYuvProjection) {
                                    slice3.position(((align - i) / 2) + slice3.position());
                                } else {
                                    byteBuffer.position(byteBuffer.limit() - ((align - i) / 2));
                                    slice3.put(byteBuffer);
                                }
                            }
                        }
                        slice3.position(0);
                    }
                    InteractVideoSink interactVideoSink2 = InteractVideoSink.this;
                    interactVideoSink2.updateI420Image(interactVideoSink2.mYuvTex, new ByteBuffer[]{slice, slice2, slice3}, null, align, i2);
                } else {
                    align = i;
                    InteractVideoSink interactVideoSink3 = InteractVideoSink.this;
                    interactVideoSink3.updateI420Image(interactVideoSink3.mYuvTex, byteBufferArr2, iArr, align, i2);
                }
                InteractVideoSink.this.mTextureFrameBuffer.setSize(i, i2);
                GLES20.glBindFramebuffer(36160, InteractVideoSink.this.mTextureFrameBuffer.getFrameBufferId());
                InteractVideoSink interactVideoSink4 = InteractVideoSink.this;
                if (interactVideoSink4.mProj == null) {
                    interactVideoSink4.mProj = RendererCommon.identityMatrix();
                    int i12 = i;
                    if (align != i12) {
                        InteractVideoSink interactVideoSink5 = InteractVideoSink.this;
                        if (interactVideoSink5.fixRemoteYuvProjection) {
                            Matrix.orthoM(interactVideoSink5.mProj, 0, -1.0f, ((((i12 * 1.0f) - 0.45f) / align) * 2.0f) - 1.0f, -1.0f, 1.0f, 1.0f, -1.0f);
                        }
                    }
                }
                InteractVideoSink interactVideoSink6 = InteractVideoSink.this;
                interactVideoSink6.mGlDrawer.drawYuv(interactVideoSink6.mYuvTex, interactVideoSink6.mProj, RendererCommon.identityMatrix(), 0, 0, i, i2, i3);
                if (InteractVideoSink.this.mGlFinishAfterDrawYuv) {
                    GLES20.glFinish();
                } else {
                    GLES20.glFlush();
                }
                GLES20.glBindFramebuffer(36160, 0);
                atomicBoolean.set(true);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_avframework_livestreamv2_core_interact_InteractVideoSink$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return atomicBoolean.get();
    }

    private void updateTexSubImage(int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer) {
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, i2);
        if (GlUtil.isGLES3Support(this.mView.getContext()) && i5 >= i3) {
            GLES30.glPixelStorei(3314, i5);
        }
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6409, 5121, byteBuffer);
        if (GlUtil.isGLES3Support(this.mView.getContext()) && i5 >= i3) {
            GLES30.glPixelStorei(3314, 0);
        }
    }

    private void onTextureVideoFrameInternal(int i, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, float[] fArr, int i4, long j) {
        boolean z;
        boolean z2;
        float[] fArr2 = fArr;
        if (!this.isRenderAble) {
            return;
        }
        if (fArr2 == null) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.preTranslate(0.0f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(0.0f, -0.5f);
            fArr2 = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
        }
        VideoFrameRenderer videoFrameRenderer = this.mFrameRenderer;
        if (videoFrameRenderer != null) {
            if (videoOutputFormat == Config.VideoOutputFormat.TEXTURE_OES) {
                z2 = true;
            } else {
                z2 = false;
            }
            videoFrameRenderer.pushVideoFrame(i, z2, i2, i3, i4, fArr2, j * 1000);
        }
        IInputVideoStream iInputVideoStream = this.mOutVideoStream;
        if (iInputVideoStream != null && this.mBuilder.getMixStreamType() == Config.MixStreamType.CLIENT_MIX && !this.mIsPushStreamPause) {
            if (videoOutputFormat == Config.VideoOutputFormat.TEXTURE_OES) {
                z = true;
            } else {
                z = false;
            }
            iInputVideoStream.pushVideoFrame(i, z, i2, i3, 0, fArr2, j * 1000);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public void onTextureVideoFrame(int i, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, float[] fArr, int i4, long j) {
        onTextureVideoFrameInternal(i, videoOutputFormat, i2, i3, fArr, i4, j);
    }

    public InteractVideoSink(String str, boolean z, int i, boolean z2, MediaEngine mediaEngine, Handler handler, boolean z3, boolean z4) {
        Handler mainGlHandle;
        this.fixRemoteYuvProjection = true;
        this.mGlFinishAfterDrawYuv = true;
        this.mInteractId = str;
        InteractEngineBuilder builder = mediaEngine.getBuilder();
        this.mBuilder = builder;
        VPassInteractCfg vPassInteractCfg = builder.getVPassInteractCfg();
        this.mVPassInteractCfgCfg = vPassInteractCfg;
        this.mRtcDeliverType = i;
        this.mMediaEngine = mediaEngine;
        if (vPassInteractCfg.convert_texture_with_share_gl_thread && handler != null) {
            mainGlHandle = handler;
        } else {
            mainGlHandle = GLThreadManager.getMainGlHandle();
        }
        this.mHandler = mainGlHandle;
        this.mIsChorusSinger = z4;
        try {
            this.fixRemoteYuvProjection = vPassInteractCfg.isFixRemoteYuvProjection;
            this.mGlFinishAfterDrawYuv = vPassInteractCfg.interactVideoSinkUseGlFinish;
            this.mDeleteTextureWhenResize = vPassInteractCfg.interactDeleteTextureWhenResize;
        } catch (Exception unused) {
        }
        if (this.mBuilder.getMixStreamType() == Config.MixStreamType.CLIENT_MIX && !this.mIsChorusSinger) {
            createOutVideoStream();
        }
        if (!z2) {
            Context context = this.mBuilder.getContext();
            if (context == null) {
                AVLog.iow("InteractVideoSink", "Maybe livecore is being released.");
                return;
            } else if (z) {
                this.mView = new TextureView(context);
            } else {
                this.mView = new SurfaceView(context);
            }
        } else {
            LiveCore liveCore = this.mBuilder.getLiveCore();
            if (liveCore != null && liveCore.getLayerControl() != null) {
                this.mFrameRenderer = this.mBuilder.getLiveCore().createFrameRender(str, 0, 0);
            }
        }
        if (this.mView != null) {
            this.mFrameRenderer = this.mBuilder.getLiveCore().createFrameRender(this.mView, this.mBuilder.mVPassInteractCfg.using_share_gl_thread ? handler : null, z3);
        }
        this.sinkValid = true;
        StringBuilder LIZIZ = C25620zW.LIZIZ("new interactvideosink: uid ", str, ", view ");
        LIZIZ.append(this.mView);
        LIZIZ.append(", renderSink ");
        LIZIZ.append(this.mFrameRenderer);
        AVLog.ioi("InteractVideoSink", X1D.LIZIZ(LIZIZ));
    }

    private void drawYuvAndRender(ByteBuffer[] byteBufferArr, int[] iArr, Config.VideoOutputFormat videoOutputFormat, int i, int i2, int i3, int i4, long j) {
        GlTextureFrameBuffer glTextureFrameBuffer;
        if (loadYuvAndDraw(byteBufferArr, iArr, i2, i3, videoOutputFormat, i) && (glTextureFrameBuffer = this.mTextureFrameBuffer) != null) {
            onTextureVideoFrameInternal(glTextureFrameBuffer.getTextureId(), Config.VideoOutputFormat.TEXTURE_2D, i2, i3, null, i4, j);
        }
    }

    private void onYuvBufferFrame(ByteBuffer[] byteBufferArr, int[] iArr, Config.VideoOutputFormat videoOutputFormat, int i, int i2, int i3, int i4, long j) {
        if (this.mRelease) {
            return;
        }
        if (byteBufferArr.length == 1 && byteBufferArr[0].capacity() < ((i2 * i3) * 3) / 2) {
            return;
        }
        if (videoOutputFormat != Config.VideoOutputFormat.PIXEL_FORMAT_I420) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG!");
            if (!AnonymousClass028.LJI(androidRuntimeException, "InteractVideoSink.onYuvBufferFrame")) {
            } else {
                throw androidRuntimeException;
            }
        } else {
            if (!this.isRenderAble) {
                return;
            }
            VideoFrameRenderer videoFrameRenderer = this.mFrameRenderer;
            if (videoFrameRenderer != null) {
                videoFrameRenderer.pushVideoFrame(byteBufferArr, iArr, i2, i3, 0, j * 1000);
            }
            IInputVideoStream iInputVideoStream = this.mOutVideoStream;
            if (iInputVideoStream != null && this.mBuilder.getMixStreamType() == Config.MixStreamType.CLIENT_MIX && !this.mIsPushStreamPause) {
                iInputVideoStream.pushVideoFrame(byteBufferArr, iArr, i2, i3, 0, j * 1000);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSink
    public void onByteBufferVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, Config.VideoOutputFormat videoOutputFormat, int i, int i2, int i3, int i4, long j) {
        InteractVideoSink interactVideoSink = this;
        if (byteBufferArr.length == 1) {
            ByteBuffer byteBuffer = byteBufferArr[0];
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RtcOutput_");
            LIZ.append(interactVideoSink.mInteractId);
            interactVideoSink = interactVideoSink;
            interactVideoSink.dumpYuvFrame(byteBuffer, i2, i3, 15, X1D.LIZIZ(LIZ));
        } else {
            ByteBuffer byteBuffer2 = byteBufferArr[0];
            int i5 = iArr[0];
            ByteBuffer byteBuffer3 = byteBufferArr[1];
            int i6 = iArr[1];
            ByteBuffer byteBuffer4 = byteBufferArr[2];
            int i7 = iArr[2];
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("RtcOutput_");
            LIZ2.append(interactVideoSink.mInteractId);
            interactVideoSink.dumpYuvFrame(byteBuffer2, i5, byteBuffer3, i6, byteBuffer4, i7, i2, i3, 15, X1D.LIZIZ(LIZ2));
        }
        if (interactVideoSink.mRelease) {
            return;
        }
        int i8 = interactVideoSink.mRtcDeliverType;
        if (i8 != 0) {
            if (i8 != 1) {
                return;
            }
            interactVideoSink.onYuvBufferFrame(byteBufferArr, iArr, videoOutputFormat, i, i2, i3, i4, interactVideoSink.adjustVideoTimeStamp(j));
            return;
        }
        if (interactVideoSink.mGlDrawer == null || i2 != interactVideoSink.mWidth || i3 != interactVideoSink.mHeight) {
            interactVideoSink.createTexture(i2, i3);
        }
        interactVideoSink.drawYuvAndRender(byteBufferArr, iArr, videoOutputFormat, i, i2, i3, i4, interactVideoSink.adjustVideoTimeStamp(j));
    }
}
