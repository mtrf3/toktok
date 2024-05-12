package X;

import X.C1FM;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.view.BEFView$12;
import com.bef.effectsdk.view.BEFView$Builder;
import com.bef.effectsdk.view.BEFView$FitMode;
import com.bef.effectsdk.view.BEFView$MessageListener;
import com.bef.effectsdk.view.ViewControllerInterface;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.1FM, reason: invalid class name */
/* loaded from: classes.dex */
public class C1FM extends TextureViewSurfaceTextureListenerC05030Hr implements GLSurfaceView.Renderer, ViewControllerInterface.NativeMessageListener, MessageCenter.Listener {
    public String mAdBundlePath;
    public AssetResourceFinder mAssetResourceFinder;
    public long mAttachedEffect;
    public Queue<Runnable> mCacheMessages;
    public boolean mDestroyed;
    public long mHandle;
    public long mLastAttachedEffect;
    public long mLastTickInNanoSeconds;
    public HashSet<BEFView$MessageListener> mListeners;
    public float[] mMatrix;
    public boolean mMultipleTouchEnabled;
    public boolean mNativeInited;
    public BEFView$Builder.Params mParams;
    public int mSourceTexture;
    public int[] mTouch_ids;
    public float[] mTouch_xs;
    public float[] mTouch_ys;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    public void initRender() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1FM.initRender():void");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    @Override // X.TextureViewSurfaceTextureListenerC05030Hr
    public void onDestroy() {
        if (this.mDestroyed) {
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$8
            @Override // java.lang.Runnable
            public void run() {
                com_bef_effectsdk_view_BEFView$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bef_effectsdk_view_BEFView$8__run$___twin___() {
                C1FM.this.destoryRender();
            }

            public static void com_bef_effectsdk_view_BEFView$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$8 bEFView$8) {
                boolean LIZ;
                try {
                    bEFView$8.com_bef_effectsdk_view_BEFView$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        super.onDestroy();
        this.mDestroyed = true;
    }

    @Override // X.TextureViewSurfaceTextureListenerC05030Hr
    public void onPause() {
        if (this.mDestroyed) {
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$6
            @Override // java.lang.Runnable
            public void run() {
                com_bef_effectsdk_view_BEFView$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bef_effectsdk_view_BEFView$6__run$___twin___() {
                C1FM c1fm = C1FM.this;
                BEFView$Builder.Params params = c1fm.mParams;
                if (params.mSceneKey == BEFView$BEFViewSceneKey.GAME || params.mKeepStatusAtPause) {
                    ViewControllerInterface.nativeOnPause(c1fm.mHandle);
                } else {
                    c1fm.destoryRender();
                }
            }

            public static void com_bef_effectsdk_view_BEFView$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$6 bEFView$6) {
                boolean LIZ;
                try {
                    bEFView$6.com_bef_effectsdk_view_BEFView$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        super.onPause();
    }

    @Override // X.TextureViewSurfaceTextureListenerC05030Hr
    public void onResume() {
        if (this.mDestroyed) {
            return;
        }
        super.onResume();
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$7
            @Override // java.lang.Runnable
            public void run() {
                com_bef_effectsdk_view_BEFView$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bef_effectsdk_view_BEFView$7__run$___twin___() {
                if (!C1FM.this.getNativeInited()) {
                    C1FM.this.initRender();
                } else {
                    ViewControllerInterface.nativeOnResume(C1FM.this.mHandle);
                }
            }

            public static void com_bef_effectsdk_view_BEFView$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$7 bEFView$7) {
                boolean LIZ;
                try {
                    bEFView$7.com_bef_effectsdk_view_BEFView$7__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void destoryRender() {
        if (getNativeInited()) {
            setNativeInited(false);
            ResourceFinder resourceFinder = this.mParams.mResourceFinder;
            if (resourceFinder != null) {
                resourceFinder.release(this.mHandle);
            }
            AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
            if (assetResourceFinder != null) {
                assetResourceFinder.release(0L);
            }
            ViewControllerInterface.nativeRemoveMessageListener(this.mHandle, this);
            ViewControllerInterface.nativeDestroy(this.mHandle);
            this.mHandle = 0L;
            ViewControllerInterface.nativeDeleteTexture(this.mSourceTexture);
            this.mSourceTexture = 0;
            MessageCenter.removeListener(this);
            MessageCenter.destroy();
            this.mLastAttachedEffect = 0L;
        }
    }

    public boolean getNativeInited() {
        return this.mNativeInited;
    }

    @Override // X.TextureViewSurfaceTextureListenerC05030Hr
    public void onExitContext() {
        destoryRender();
    }

    public C1FM(Context context) {
        super(context);
        this.mAdBundlePath = "";
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        init(context);
    }

    private void dealWithTouches(MotionEvent motionEvent) {
        final int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 10) {
            pointerCount = 10;
        }
        for (int i = 0; i < pointerCount; i++) {
            this.mTouch_ids[i] = motionEvent.getPointerId(i);
            this.mTouch_xs[i] = motionEvent.getX(i);
            this.mTouch_ys[i] = motionEvent.getY(i);
        }
        convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
        int actionIndex = motionEvent.getActionIndex();
        if (this.mMultipleTouchEnabled || actionIndex == 0) {
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 5) {
                            if (action != 6) {
                                return;
                            }
                        }
                    } else {
                        final int[] iArr = new int[pointerCount];
                        final float[] fArr = new float[pointerCount];
                        final float[] fArr2 = new float[pointerCount];
                        for (int i2 = 0; i2 < pointerCount; i2++) {
                            iArr[i2] = this.mTouch_ids[i2];
                            fArr[i2] = this.mTouch_xs[i2];
                            fArr2[i2] = this.mTouch_ys[i2];
                        }
                        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$4
                            @Override // java.lang.Runnable
                            public void run() {
                                com_bef_effectsdk_view_BEFView$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_bef_effectsdk_view_BEFView$4__run$___twin___() {
                                ViewControllerInterface.touchMoveEvent(C1FM.this.mHandle, iArr, fArr, fArr2, pointerCount);
                            }

                            public static void com_bef_effectsdk_view_BEFView$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$4 bEFView$4) {
                                boolean LIZ;
                                try {
                                    bEFView$4.com_bef_effectsdk_view_BEFView$4__run$___twin___();
                                } finally {
                                    if (LIZ) {
                                    }
                                }
                            }
                        });
                        return;
                    }
                }
                final int[] iArr2 = {this.mTouch_ids[actionIndex]};
                final float[] fArr3 = {this.mTouch_xs[actionIndex]};
                final float[] fArr4 = {this.mTouch_ys[actionIndex]};
                queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$5
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bef_effectsdk_view_BEFView$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bef_effectsdk_view_BEFView$5__run$___twin___() {
                        ViewControllerInterface.touchEndEvent(C1FM.this.mHandle, iArr2, fArr3, fArr4, pointerCount);
                    }

                    public static void com_bef_effectsdk_view_BEFView$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$5 bEFView$5) {
                        boolean LIZ;
                        try {
                            bEFView$5.com_bef_effectsdk_view_BEFView$5__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                return;
            }
            final int[] iArr3 = {this.mTouch_ids[actionIndex]};
            final float[] fArr5 = {this.mTouch_xs[actionIndex]};
            final float[] fArr6 = {this.mTouch_ys[actionIndex]};
            queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$3
                @Override // java.lang.Runnable
                public void run() {
                    com_bef_effectsdk_view_BEFView$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bef_effectsdk_view_BEFView$3__run$___twin___() {
                    ViewControllerInterface.touchBeginEvent(C1FM.this.mHandle, iArr3, fArr5, fArr6, pointerCount);
                }

                public static void com_bef_effectsdk_view_BEFView$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$3 bEFView$3) {
                    boolean LIZ;
                    try {
                        bEFView$3.com_bef_effectsdk_view_BEFView$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    private void init(Context context) {
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(this);
        setRenderMode(1);
        this.mListeners = new HashSet<>();
        this.mCacheMessages = new LinkedList();
        AssetResourceFinder assetResourceFinder = new AssetResourceFinder(context.getAssets(), "");
        this.mAssetResourceFinder = assetResourceFinder;
        assetResourceFinder.createNativeResourceFinder(0L);
        this.mDestroyed = false;
    }

    public synchronized int addMessageListener(BEFView$MessageListener bEFView$MessageListener) {
        if (bEFView$MessageListener == null) {
            return -1;
        }
        this.mListeners.add(bEFView$MessageListener);
        return 0;
    }

    public synchronized void attachEffect(long j) {
        this.mAttachedEffect = j;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (!getNativeInited()) {
            return;
        }
        long j = this.mAttachedEffect;
        if (j != this.mLastAttachedEffect) {
            ViewControllerInterface.nativeAttachEffect(this.mHandle, j);
            this.mLastAttachedEffect = this.mAttachedEffect;
        }
        long nanoTime = System.nanoTime() - this.mLastTickInNanoSeconds;
        double d = (1.0d / this.mParams.mFPS) * 1.0E9d;
        double d2 = nanoTime;
        if (d2 < d) {
            try {
                Thread.sleep((long) (((d - d2) * 1.0d) / 1000000.0d));
            } catch (Exception unused) {
            }
        }
        this.mLastTickInNanoSeconds = System.nanoTime();
        while (!this.mCacheMessages.isEmpty()) {
            this.mCacheMessages.poll().run();
        }
        double nanoTime2 = System.nanoTime() / 1.0E9d;
        int width = getWidth();
        int height = getHeight();
        Matrix.setIdentityM(this.mMatrix, 0);
        BEFView$Builder.Params params = this.mParams;
        RectF rectF = new RectF(0.0f, 0.0f, params.mRenderWidth, params.mRenderHeight);
        float f = width;
        RectF rectF2 = new RectF(0.0f, 0.0f, f, height);
        PointF fitResolution = fitResolution(new PointF(0.0f, 0.0f), rectF, rectF2, this.mParams.mFitMode);
        BEFView$Builder.Params params2 = this.mParams;
        PointF fitResolution2 = fitResolution(new PointF(params2.mRenderWidth, params2.mRenderHeight), rectF, rectF2, this.mParams.mFitMode);
        if (this.mParams.mFitMode == BEFView$FitMode.FIT_WIDTH_BOTTOM) {
            fitResolution = new PointF(0.0f, 0.0f);
            BEFView$Builder.Params params3 = this.mParams;
            fitResolution2 = new PointF(f, (params3.mRenderHeight * width) / params3.mRenderWidth);
        }
        float f2 = fitResolution.x;
        float f3 = fitResolution.y;
        float[] fArr = {f2, f3, fitResolution2.x - f2, fitResolution2.y - f3};
        long j2 = this.mHandle;
        int i = this.mSourceTexture;
        BEFView$Builder.Params params4 = this.mParams;
        ViewControllerInterface.nativeProcess(j2, i, params4.mRenderWidth, params4.mRenderHeight, this.mMatrix, fArr, nanoTime2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!getNativeInited() || this.mAdBundlePath == "" || this.mParams.mNeglectTouchEvent) {
            return false;
        }
        dealWithTouches(motionEvent);
        ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public synchronized int removeMessageListener(BEFView$MessageListener bEFView$MessageListener) {
        if (bEFView$MessageListener == null) {
            return -1;
        }
        this.mListeners.remove(bEFView$MessageListener);
        return 0;
    }

    public synchronized boolean setExternalTouchEvent(MotionEvent motionEvent) {
        if (getNativeInited() && this.mAdBundlePath != "") {
            dealWithTouches(motionEvent);
            return true;
        }
        return false;
    }

    public void setNativeInited(boolean z) {
        this.mNativeInited = z;
    }

    public void setParams(BEFView$Builder.Params params) {
        this.mParams = params;
    }

    public synchronized void setStickerPath(final String str) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$1
            @Override // java.lang.Runnable
            public void run() {
                com_bef_effectsdk_view_BEFView$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bef_effectsdk_view_BEFView$1__run$___twin___() {
                if (C1FM.this.getNativeInited()) {
                    C1FM c1fm = C1FM.this;
                    String str2 = str;
                    c1fm.mAdBundlePath = str2;
                    ViewControllerInterface.nativeSetStickerPath(c1fm.mHandle, str2);
                }
            }

            public static void com_bef_effectsdk_view_BEFView$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$1 bEFView$1) {
                boolean LIZ;
                try {
                    bEFView$1.com_bef_effectsdk_view_BEFView$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public C1FM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdBundlePath = "";
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        init(context);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        initRender();
    }

    public synchronized void setRenderCacheData(final String str, final String str2) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$9
            @Override // java.lang.Runnable
            public void run() {
                com_bef_effectsdk_view_BEFView$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bef_effectsdk_view_BEFView$9__run$___twin___() {
                if (C1FM.this.getNativeInited()) {
                    ViewControllerInterface.nativeSetRenderCacheData(C1FM.this.mHandle, str, str2);
                }
            }

            public static void com_bef_effectsdk_view_BEFView$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$9 bEFView$9) {
                boolean LIZ;
                try {
                    bEFView$9.com_bef_effectsdk_view_BEFView$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public synchronized void setRenderCacheTexture(final String str, final String str2) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$10
            @Override // java.lang.Runnable
            public void run() {
                com_bef_effectsdk_view_BEFView$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bef_effectsdk_view_BEFView$10__run$___twin___() {
                if (C1FM.this.getNativeInited()) {
                    ViewControllerInterface.nativeSetRenderCacheTexture(C1FM.this.mHandle, str, str2);
                }
            }

            public static void com_bef_effectsdk_view_BEFView$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$10 bEFView$10) {
                boolean LIZ;
                try {
                    bEFView$10.com_bef_effectsdk_view_BEFView$10__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    private void convertTouchesToNormalizedPos(float[] fArr, float[] fArr2, int i) {
        PointF fitResolution;
        int width = getWidth();
        int height = getHeight();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            float f2 = fArr2[i2];
            PointF pointF = new PointF(f, f2);
            float f3 = width;
            float f4 = height;
            RectF rectF = new RectF(0.0f, 0.0f, f3, f4);
            new PointF();
            BEFView$FitMode bEFView$FitMode = this.mParams.mFitMode;
            BEFView$FitMode bEFView$FitMode2 = BEFView$FitMode.FILL_SCREEN;
            if (bEFView$FitMode == bEFView$FitMode2) {
                BEFView$Builder.Params params = this.mParams;
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, params.mRenderWidth, params.mRenderHeight), BEFView$FitMode.NO_CLIP);
            } else if (bEFView$FitMode == BEFView$FitMode.NO_CLIP) {
                BEFView$Builder.Params params2 = this.mParams;
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, params2.mRenderWidth, params2.mRenderHeight), bEFView$FitMode2);
            } else if (bEFView$FitMode == BEFView$FitMode.FIT_WIDTH_BOTTOM) {
                float f5 = ((f3 * 1.0f) / r3.mRenderWidth) * r3.mRenderHeight;
                fArr[i2] = (f * 1.0f) / f3;
                fArr2[i2] = ((f2 - (f4 - f5)) * 1.0f) / f5;
            } else {
                BEFView$Builder.Params params3 = this.mParams;
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, params3.mRenderWidth, params3.mRenderHeight), this.mParams.mFitMode);
            }
            float f6 = fitResolution.x;
            BEFView$Builder.Params params4 = this.mParams;
            fArr[i2] = f6 / params4.mRenderWidth;
            fArr2[i2] = fitResolution.y / params4.mRenderHeight;
        }
    }

    private PointF fitResolution(PointF pointF, RectF rectF, RectF rectF2, BEFView$FitMode bEFView$FitMode) {
        PointF pointF2 = new PointF();
        float f = rectF2.left;
        float f2 = rectF2.top;
        float width = rectF2.width();
        float height = rectF2.height();
        float width2 = (pointF.x - rectF.left) / rectF.width();
        float height2 = (pointF.y - rectF.top) / rectF.height();
        int i = BEFView$12.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[bEFView$FitMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (width / rectF.width() > height / rectF.height()) {
                            return fitResolution(pointF, rectF, rectF2, BEFView$FitMode.FIT_HEIGHT);
                        }
                        return fitResolution(pointF, rectF, rectF2, BEFView$FitMode.FIT_WIDTH);
                    }
                } else {
                    if (width / rectF.width() < height / rectF.height()) {
                        return fitResolution(pointF, rectF, rectF2, BEFView$FitMode.FIT_HEIGHT);
                    }
                    return fitResolution(pointF, rectF, rectF2, BEFView$FitMode.FIT_WIDTH);
                }
            } else {
                float height3 = height / rectF.height();
                pointF2.x = (int) ((rectF.width() * width2 * height3) + ((width - (rectF.width() * height3)) / 2.0f) + f);
                pointF2.y = (int) ((height2 * height) + f2);
            }
        } else {
            float width3 = width / rectF.width();
            pointF2.x = (int) ((width2 * width) + f);
            pointF2.y = (int) ((rectF.height() * height2 * width3) + ((height - (rectF.height() * width3)) / 2.0f) + f2);
        }
        return pointF2;
    }

    @Override // com.bef.effectsdk.view.ViewControllerInterface.NativeMessageListener
    public synchronized int nativeOnMsgReceived(long j, long j2, long j3, String str) {
        Iterator<BEFView$MessageListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onMessageReceived(j, j2, j3, str);
        }
        return 0;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public void onMessageReceived(int i, int i2, int i3, String str) {
        postMessage(i, i2, i3, str);
    }

    public synchronized int postMessage(final long j, final long j2, final long j3, final String str) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$2
            @Override // java.lang.Runnable
            public void run() {
                com_bef_effectsdk_view_BEFView$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bef_effectsdk_view_BEFView$2__run$___twin___() {
                C1FM.this.mCacheMessages.add(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bef_effectsdk_view_BEFView$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bef_effectsdk_view_BEFView$2$1__run$___twin___() {
                        BEFView$2 bEFView$2 = BEFView$2.this;
                        ViewControllerInterface.nativePostMessage(C1FM.this.mHandle, j, j2, j3, str);
                    }

                    public static void com_bef_effectsdk_view_BEFView$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_bef_effectsdk_view_BEFView$2$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }

            public static void com_bef_effectsdk_view_BEFView$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$2 bEFView$2) {
                boolean LIZ;
                try {
                    bEFView$2.com_bef_effectsdk_view_BEFView$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    public synchronized void setRenderCacheTextureWithBuffer(final String str, final byte[] bArr, final int i, final int i2) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView$11
            @Override // java.lang.Runnable
            public void run() {
                com_bef_effectsdk_view_BEFView$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bef_effectsdk_view_BEFView$11__run$___twin___() {
                if (C1FM.this.getNativeInited()) {
                    ViewControllerInterface.nativeSetRenderCacheTextureWithBuffer(C1FM.this.mHandle, str, bArr, i, i2);
                }
            }

            public static void com_bef_effectsdk_view_BEFView$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFView$11 bEFView$11) {
                boolean LIZ;
                try {
                    bEFView$11.com_bef_effectsdk_view_BEFView$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
