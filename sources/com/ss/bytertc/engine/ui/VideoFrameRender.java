package com.ss.bytertc.engine.ui;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglRenderer;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.ss.bytertc.engine.adapter.VideoFrameConverter;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import com.ss.bytertc.engine.mediaio.SurfaceEglRender;
import com.ss.bytertc.engine.mediaio.TextureEglRenderer;
import com.ss.bytertc.engine.ui.VideoFrameRender;
import com.ss.bytertc.engine.utils.ByteBufferUtils;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.converter.WebRTCConverter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes33.dex */
public class VideoFrameRender implements View.OnLayoutChangeListener, RendererCommon.RendererEvents, EglRenderer.FirstVideoFrameRenderListener {
    public boolean enableFixedSize;
    public volatile EglRenderer mEglRenderer;
    public boolean mHasReceivedFirstFrame;
    public long mReceiveFirstTimeStampMs;
    public final String mRenderName;
    public volatile Surface mSurface;
    public volatile SurfaceView mSurfaceView;
    public Looper mTextureProcessLooper;
    public volatile TextureView mTextureView;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;
    public int surfaceHeight;
    public int surfaceWidth;
    public final AtomicBoolean mHasInitAtomic = new AtomicBoolean(false);
    public final AtomicBoolean mHasRenderViewAtomic = new AtomicBoolean(false);
    public final AtomicBoolean mEglSurfaceCreatedAtomic = new AtomicBoolean(false);
    public final Object mRenderLock = new Object();
    public final Object mTextureProcessLock = new Object();
    public final Object mFirstFrameListenerLock = new Object();
    public final ArrayList<FirstVideoFrameRenderListener> mFirstVideoFrameListeners = new ArrayList<>();
    public final VideoFrameConverter frameConverter = new VideoFrameConverter(true);
    public final SurfaceLifecycleCallback mSurfaceLifecycleCallbackCallback = new SurfaceLifecycleCallback() { // from class: com.ss.bytertc.engine.ui.VideoFrameRender.1
        @Override // com.ss.bytertc.engine.ui.VideoFrameRender.SurfaceLifecycleCallback
        public void onCreated() {
            if (!VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(false, true)) {
                LogUtil.e("VideoFrameRender", "Already has an another surface created.");
            }
        }

        @Override // com.ss.bytertc.engine.ui.VideoFrameRender.SurfaceLifecycleCallback
        public void onDestroy() {
            if (!VideoFrameRender.this.mHasInitAtomic.get()) {
                VideoFrameRender.this.mEglSurfaceCreatedAtomic.set(false);
            } else {
                if (VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(true, false)) {
                    return;
                }
                LogUtil.e("VideoFrameRender", "Already has an another surface destroyed.");
            }
        }
    };

    /* loaded from: classes33.dex */
    public interface FirstVideoFrameRenderListener {
        void onFirstVideoFrameRender(int i);
    }

    /* loaded from: classes33.dex */
    public interface SurfaceLifecycleCallback {
        void onCreated();

        void onDestroy();
    }

    public static /* synthetic */ void lambda$renderTextureFrame$2() {
    }

    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
    }

    private void initSurfaceView() {
        if (this.mSurfaceView == null || !this.mHasInitAtomic.get()) {
            return;
        }
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer instanceof SurfaceEglRender) {
                ((SurfaceEglRender) this.mEglRenderer).bind(this.mSurfaceView);
                this.mSurfaceView.addOnLayoutChangeListener(this);
            }
        }
    }

    private void initTextureView() {
        if (this.mTextureView == null || this.mEglRenderer == null || !this.mHasInitAtomic.get()) {
            return;
        }
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer instanceof TextureEglRenderer) {
                TextureEglRenderer textureEglRenderer = (TextureEglRenderer) this.mEglRenderer;
                textureEglRenderer.bind(this.mTextureView, this.mSurfaceLifecycleCallbackCallback);
                if (this.mTextureView.isShown()) {
                    textureEglRenderer.setLayoutAspectRatio(this.mTextureView.getMeasuredWidth() / this.mTextureView.getMeasuredHeight());
                }
                this.mTextureView.addOnLayoutChangeListener(this);
            }
        }
    }

    private void notifyFristRenderCallback() {
        synchronized (this.mFirstFrameListenerLock) {
            if (this.mFirstVideoFrameListeners.isEmpty()) {
                return;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.mReceiveFirstTimeStampMs);
            Iterator<FirstVideoFrameRenderListener> it = this.mFirstVideoFrameListeners.iterator();
            while (it.hasNext()) {
                it.next().onFirstVideoFrameRender(currentTimeMillis);
            }
        }
    }

    public void disableFpsReduction() {
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.disableFpsReduction();
            }
        }
    }

    public void onDispose() {
        if (this.mHasInitAtomic.compareAndSet(true, false)) {
            synchronized (this.mRenderLock) {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.release();
                    this.mEglRenderer.createEglSurface((Surface) null);
                }
                if (this.mSurfaceView != null) {
                    this.mSurfaceView.removeOnLayoutChangeListener(this);
                } else if (this.mTextureView != null) {
                    this.mTextureView.setSurfaceTextureListener(null);
                    this.mTextureView.removeOnLayoutChangeListener(this);
                }
                this.mEglSurfaceCreatedAtomic.set(false);
            }
            synchronized (this.mFirstFrameListenerLock) {
                this.mFirstVideoFrameListeners.clear();
            }
            return;
        }
        throw new IllegalStateException("Try to dispose an not initialized VideoFrameRender");
    }

    public void onStart() {
        if (!this.mHasRenderViewAtomic.get() || !this.mHasInitAtomic.get()) {
            return;
        }
        if (this.mTextureView != null) {
            initTextureView();
        } else {
            if (this.mSurfaceView == null) {
                return;
            }
            initSurfaceView();
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (this.enableFixedSize && this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0 && this.mSurfaceView.getWidth() != 0 && this.mSurfaceView.getHeight() != 0) {
            float width = this.mSurfaceView.getWidth() / this.mSurfaceView.getHeight();
            int i = this.rotatedFrameWidth;
            int i2 = this.rotatedFrameHeight;
            if (i / i2 > width) {
                i = (int) (i2 * width);
            } else {
                i2 = (int) (i / width);
            }
            int min = Math.min(this.mSurfaceView.getWidth(), i);
            int min2 = Math.min(this.mSurfaceView.getHeight(), i2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateSurfaceSize. Layout size: ");
            LIZ.append(this.mSurfaceView.getWidth());
            LIZ.append("x");
            LIZ.append(this.mSurfaceView.getHeight());
            LIZ.append(", frame size: ");
            LIZ.append(this.rotatedFrameWidth);
            LIZ.append("x");
            LIZ.append(this.rotatedFrameHeight);
            LIZ.append(", requested surface size: ");
            LIZ.append(min);
            LIZ.append("x");
            LIZ.append(min2);
            LIZ.append(", old surface size: ");
            LIZ.append(this.surfaceWidth);
            LIZ.append("x");
            LIZ.append(this.surfaceHeight);
            LogUtil.d("VideoFrameRender", X1D.LIZIZ(LIZ));
            if (min != this.surfaceWidth || min2 != this.surfaceHeight) {
                this.surfaceWidth = min;
                this.surfaceHeight = min2;
                this.mSurfaceView.getHolder().setFixedSize(min, min2);
                return;
            }
            return;
        }
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        this.mSurfaceView.getHolder().setSizeFromLayout();
    }

    @Override // com.bytedance.realx.video.EglRenderer.FirstVideoFrameRenderListener
    public void onFirstVideoFrameRender() {
        notifyFristRenderCallback();
    }

    public void release() {
        onDispose();
    }

    public VideoFrameRender(String str) {
        this.mRenderName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(EglBase.Context context) {
        this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    private void onVideoFrame(VideoFrame videoFrame) {
        synchronized (this.mRenderLock) {
            if (!this.mEglSurfaceCreatedAtomic.get() || this.mEglRenderer == null) {
                return;
            }
            if (!this.mHasReceivedFirstFrame) {
                this.mReceiveFirstTimeStampMs = System.currentTimeMillis();
                this.mHasReceivedFirstFrame = true;
            }
            this.mEglRenderer.onFrame(videoFrame);
        }
    }

    private void postOrRun(Runnable runnable) {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            runnable.run();
        }
    }

    private void runOnUIThread(Runnable runnable) {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            runnable.run();
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(runnable);
        }
    }

    public void consumeVideoFrame(com.ss.bytertc.engine.video.VideoFrame videoFrame) {
        VideoFrame convertByteRGBAFrame2WebrtcI420Frame;
        if (videoFrame.getFrameType() == VideoFrameType.GL_TEXTURE) {
            convertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteTexFrame2WebrtcTexFrame(videoFrame, this.mTextureProcessLooper);
        } else if (videoFrame.getPixelFormat() == VideoPixelFormat.I420) {
            convertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteI420Frame2WebrtcI420Frame(videoFrame);
        } else if (videoFrame.getPixelFormat() != VideoPixelFormat.RGBA) {
            return;
        } else {
            convertByteRGBAFrame2WebrtcI420Frame = WebRTCConverter.convertByteRGBAFrame2WebrtcI420Frame(videoFrame);
        }
        if (convertByteRGBAFrame2WebrtcI420Frame != null) {
            onVideoFrame(convertByteRGBAFrame2WebrtcI420Frame);
            convertByteRGBAFrame2WebrtcI420Frame.release();
        }
    }

    public void init(final EglBase.Context context) {
        if (this.mHasInitAtomic.compareAndSet(false, true)) {
            synchronized (this.mRenderLock) {
                if (this.mSurfaceView == null && this.mSurface == null && this.mTextureView == null && this.mEglRenderer == null) {
                    return;
                }
                this.rotatedFrameWidth = 0;
                this.rotatedFrameHeight = 0;
                if (this.mEglRenderer instanceof SurfaceEglRender) {
                    ThreadUtils.invokeAtFrontUninterruptibly(new Handler(C16880lQ.LLJJJJ()), new Runnable() { // from class: X.ZVs
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoFrameRender.this.lambda$init$0(context);
                        }
                    });
                } else {
                    this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
                }
                return;
            }
        }
        throw new IllegalStateException("Already initialized");
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        if (this.mSurfaceView != null) {
            updateSurfaceSize();
        }
    }

    public void setFpsReduction(float f) {
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.setFpsReduction(f);
            }
        }
    }

    public void setFristVideoFrameRenderListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        synchronized (this.mFirstFrameListenerLock) {
            this.mFirstVideoFrameListeners.add(firstVideoFrameRenderListener);
        }
    }

    public void setMirror(boolean z) {
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.setMirror(z);
            }
        }
    }

    public void setProcessTextureLopper(Looper looper) {
        synchronized (this.mTextureProcessLock) {
            this.mTextureProcessLooper = looper;
        }
    }

    public void setRenderView(Surface surface) {
        if (this.mEglSurfaceCreatedAtomic.get() || surface == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            return;
        }
        synchronized (this.mRenderLock) {
            this.mSurface = surface;
            new EglRenderer(this.mRenderName).createEglSurface(surface);
        }
        this.mEglSurfaceCreatedAtomic.compareAndSet(false, true);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.setRenderModel(scalingType);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrameResolutionChanged$1(int i, int i2) {
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
    }

    public void setRenderView(SurfaceView surfaceView, SurfaceHolder.Callback callback) {
        if (this.mEglSurfaceCreatedAtomic.get() || surfaceView == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            return;
        }
        this.mSurfaceView = surfaceView;
        synchronized (this.mRenderLock) {
            SurfaceEglRender surfaceEglRender = new SurfaceEglRender(this.mRenderName);
            surfaceEglRender.setSurfaceHolderCallback(callback);
            surfaceEglRender.setSurfaceLifecycleLisenter(this.mSurfaceLifecycleCallbackCallback);
            this.mEglRenderer = surfaceEglRender;
            this.mEglRenderer.addFristFrameListener(this);
        }
    }

    public void setRenderView(TextureView textureView, TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (this.mEglSurfaceCreatedAtomic.get() || textureView == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            return;
        }
        synchronized (this.mRenderLock) {
            this.mTextureView = textureView;
            TextureEglRenderer textureEglRenderer = new TextureEglRenderer(this.mRenderName);
            textureEglRenderer.setSurfaceTextureListener(surfaceTextureListener);
            this.mEglRenderer = textureEglRenderer;
            this.mEglRenderer.addFristFrameListener(this);
        }
    }

    private VideoFrame.Buffer createYUV(byte[] bArr, int i, int i2) {
        if (bArr != null && bArr.length != 0) {
            int i3 = (i + 1) / 2;
            int i4 = i * i2;
            int i5 = ((i2 + 1) / 2) * i3;
            final ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer(i4);
            final ByteBuffer nativeAllocateBuffer2 = ByteBufferUtils.nativeAllocateBuffer(i5);
            final ByteBuffer nativeAllocateBuffer3 = ByteBufferUtils.nativeAllocateBuffer(i5);
            if (nativeAllocateBuffer != null) {
                if (nativeAllocateBuffer2 == null || nativeAllocateBuffer3 == null) {
                    ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer);
                } else {
                    nativeAllocateBuffer.put(bArr, 0, i4);
                    nativeAllocateBuffer2.put(bArr, i4, i5);
                    nativeAllocateBuffer3.put(bArr, i4 + i5, i5);
                    nativeAllocateBuffer.position(0);
                    nativeAllocateBuffer2.position(0);
                    nativeAllocateBuffer3.position(0);
                    if (this.mEglRenderer instanceof TextureEglRenderer) {
                        return CountDownLatchI420Buffer.wrap(i, i2, nativeAllocateBuffer, i, nativeAllocateBuffer2, i3, nativeAllocateBuffer3, i3, new Runnable() { // from class: X.ZVo
                            @Override // java.lang.Runnable
                            public final void run() {
                                VideoFrameRender.lambda$createYUV$3(nativeAllocateBuffer, nativeAllocateBuffer2, nativeAllocateBuffer3);
                            }
                        });
                    }
                    return JavaI420Buffer.wrap(i, i2, nativeAllocateBuffer, i, nativeAllocateBuffer2, i3, nativeAllocateBuffer3, i3, new Runnable() { // from class: X.ZVp
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoFrameRender.lambda$createYUV$4(nativeAllocateBuffer, nativeAllocateBuffer2, nativeAllocateBuffer3);
                        }
                    });
                }
            }
            if (nativeAllocateBuffer2 != null) {
                ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer2);
            }
            if (nativeAllocateBuffer3 != null) {
                ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer3);
            }
        }
        return null;
    }

    public static /* synthetic */ void lambda$createYUV$3(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
    }

    public static /* synthetic */ void lambda$createYUV$4(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0007, code lost:
    
        if (r5 != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
    
        if (r5 == 180) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        postOrRun(new X.RunnableC90047ZVr(r2, r1, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        return;
     */
    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFrameResolutionChanged(final int r3, int r4, int r5) {
        /*
            r2 = this;
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto L6
            if (r5 != r0) goto L15
        L6:
            r1 = r3
            if (r5 == 0) goto Lb
        L9:
            if (r5 != r0) goto Lc
        Lb:
            r3 = r4
        Lc:
            X.ZVr r0 = new X.ZVr
            r0.<init>()
            r2.postOrRun(r0)
            return
        L15:
            r1 = r4
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.ui.VideoFrameRender.onFrameResolutionChanged(int, int, int):void");
    }

    private void renderI420Frame(byte[] bArr, int i, int i2, int i3, long j) {
        VideoFrameConverter videoFrameConverter;
        VideoFrame.I420Buffer convertToJavaI420Buffer;
        if (bArr != null && bArr.length > 0 && (videoFrameConverter = this.frameConverter) != null) {
            if (this.mEglRenderer instanceof TextureEglRenderer) {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(bArr, i, i2, true);
            } else {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(bArr, i, i2, false);
            }
            if (convertToJavaI420Buffer != null) {
                VideoFrame videoFrame = new VideoFrame(convertToJavaI420Buffer, i3, j);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    private void renderI420Frame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        VideoFrameConverter videoFrameConverter;
        VideoFrame.I420Buffer convertToJavaI420Buffer;
        if (byteBuffer != null && (videoFrameConverter = this.frameConverter) != null) {
            if (this.mEglRenderer instanceof TextureEglRenderer) {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i, i2, true);
            } else {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i, i2, false);
            }
            if (convertToJavaI420Buffer != null) {
                VideoFrame videoFrame = new VideoFrame(convertToJavaI420Buffer, i3, j);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    public void consumeByteArrayFrame(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (i != VideoPixelFormat.I420.value()) {
            return;
        }
        renderI420Frame(bArr, i2, i3, i4, j);
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, long j) {
        if (i != VideoPixelFormat.I420.value()) {
            return;
        }
        renderI420Frame(byteBuffer, i2, i3, i4, j);
    }

    private void renderTextureFrame(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3, int i4, long j, float[] fArr, Looper looper) {
        VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(i2, i3, type, i, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), new Handler(looper), new YuvConverter(), new Runnable() { // from class: X.ZVq
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameRender.lambda$renderTextureFrame$2();
            }
        }), i4, j);
        onVideoFrame(videoFrame);
        videoFrame.release();
    }

    public void consumeTextureFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        if (i2 != VideoPixelFormat.I420.value()) {
            return;
        }
        synchronized (this.mTextureProcessLock) {
            if (this.mTextureProcessLooper == null) {
                this.mTextureProcessLooper = C16880lQ.LLJJJJ();
            }
            renderTextureFrame(i, VideoFrame.TextureBuffer.Type.RGB, i3, i4, i5, j, fArr, this.mTextureProcessLooper);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.mRenderLock) {
            if (this.mEglRenderer != null) {
                this.mEglRenderer.setLayoutAspectRatio((i3 - i) / (i4 - i2));
            }
            if (this.mSurfaceView != null) {
                updateSurfaceSize();
            }
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, ByteBuffer byteBuffer) {
        renderI420Frame(this.frameConverter.convertRawYUV2ByteArray(bArr, bArr2, bArr3, i, i2, i3, i4, i5), i4, i5, i6, j);
    }
}
