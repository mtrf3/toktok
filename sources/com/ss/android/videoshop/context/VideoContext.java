package com.ss.android.videoshop.context;

import X.AbstractC47819Ipj;
import X.C07670Rv;
import X.C16880lQ;
import X.C46886Iag;
import X.C47160If6;
import X.C47164IfA;
import X.C47620ImW;
import X.C47789IpF;
import X.C48217Iw9;
import X.C48275Ix5;
import X.C48671J8h;
import X.C48672J8i;
import X.C79376VDg;
import X.C79377VDh;
import X.C79520VIu;
import X.C79985VaH;
import X.C79994VaQ;
import X.C87426YSw;
import X.EnumC47176IfM;
import X.EnumC48190Ivi;
import X.EnumC48216Iw8;
import X.EnumC79517VIr;
import X.InterfaceC48221IwD;
import X.InterfaceC58392Mvs;
import X.InterfaceC78864UxI;
import X.InterfaceC80606VkI;
import X.InterfaceC87404YSa;
import X.InterfaceC87405YSb;
import X.KL2;
import X.PixelCopyOnPixelCopyFinishedListenerC87417YSn;
import X.UC0;
import X.VKF;
import X.X14;
import X.X1D;
import X.YD6;
import X.YDE;
import X.YDG;
import X.YNT;
import X.YS2;
import X.YS3;
import X.YS4;
import X.YS5;
import X.YS6;
import X.YS7;
import X.YS8;
import X.YSA;
import X.YSD;
import X.YSE;
import X.YSF;
import X.YSG;
import X.YSP;
import X.YT2;
import X.YT3;
import X.YT7;
import X.YT8;
import X.YT9;
import X.YTA;
import X.YTI;
import X.YTJ;
import X.YTK;
import X.YTL;
import X.Z9T;
import Y.ALAdapterS12S0100000_15;
import Y.ARunnableS51S0100000_15;
import Y.AUListenerS102S0100000_15;
import Y.IDHandlerS25S0100000_15;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.videoshop.api.stub.AutoPauseResumeLifeCycleHandler;
import com.ss.android.videoshop.controller.VideoController;
import com.ss.android.videoshop.fullscreen.FullScreenOperator;
import com.ss.android.videoshop.layer.stub.BaseVideoLayer;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes16.dex */
public class VideoContext extends YS8 implements GenericLifecycleObserver, YNT, WeakHandler.IHandler, KeyEvent.Callback, YTJ {
    public static final Map<EnumC47176IfM, String> resolutionQualityMap = new ConcurrentHashMap();
    public static int sFullscreenOperatorInterval = 400;
    public static int sSurfaceViewDismissCoverInterval = 50;
    public Context context;
    public boolean enablePortraitFullScreen;
    public ViewGroup floatScreenRoot;
    public FullScreenOperator fullScreenOperator;
    public FrameLayout fullScreenRoot;
    public ValueAnimator fullscreenAnimator;
    public long fullscreenFinishedTimeStamp;
    public int halfScreenHeight;
    public int halfScreenWidth;
    public WeakHandler handler;
    public C79376VDg headsetHelper;
    public X14 headsetHelperOpt;
    public YDE helperView;
    public Set<Integer> keepScreenOnStatus;
    public TreeSet<Integer> keyCodes;
    public YS3 layerHostMediaLayout;
    public Map<Lifecycle, LifeCycleObserver> lifeCycleVideoHandlerMap;
    public int[] location;
    public final KeyEvent.DispatcherState mKeyDispatchState;
    public Window.Callback mOldWindowCallback;
    public boolean mOnExternalConfigurationChanged;
    public boolean mVideoMethodOpt;
    public Z9T mWindowCallbackWrapper;
    public C79994VaQ playSettings;
    public List<YS3> prepareLayerHostList;
    public int screenHeight;
    public int screenWidth;
    public YS4 simpleMediaView;
    public ViewGroup userFullScreenRoot;
    public C79520VIu videoAudioFocusController;
    public List<InterfaceC87404YSa> videoPlayListeners;
    public YS5 videoPrepareManager;
    public C48275Ix5 videoScreenStateController;

    public boolean isPortraitAnimationEnable() {
        return false;
    }

    @Override // X.YS8, X.InterfaceC87408YSe
    public void onFullScreen(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z, int i, boolean z2, boolean z3) {
    }

    @Override // X.YS8, X.InterfaceC87408YSe
    public boolean onInterceptFullScreen(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z, int i, boolean z2) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // X.YS8, X.InterfaceC87408YSe
    public void onPreFullScreen(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, YTJ ytj, boolean z, int i, boolean z2, boolean z3) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onLifeCycleOnCreate(lifecycleOwner);
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onLifeCycleOnStart(lifecycleOwner);
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onLifeCycleOnResume(lifecycleOwner);
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onLifeCycleOnPause(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_STOP) {
            onLifeCycleOnStop(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onLifeCycleOnDestroy(lifecycleOwner);
        }
    }

    private void addFullScreenRootToTop() {
        if (this.userFullScreenRoot != null) {
            View childAt = this.userFullScreenRoot.getChildAt(r0.getChildCount() - 1);
            FrameLayout frameLayout = this.fullScreenRoot;
            if (childAt != frameLayout && frameLayout != null) {
                KL2.LIZIZ(frameLayout);
                this.userFullScreenRoot.addView(this.fullScreenRoot, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    private void addOrientationDetectionViewIfNull() {
        ViewGroup viewGroup;
        Activity LIZ = C48672J8i.LIZ(this.context);
        if (LIZ == null || (viewGroup = (ViewGroup) LIZ.findViewById(R.id.content)) == null) {
            return;
        }
        View findHelpViewFromContentView = findHelpViewFromContentView(viewGroup);
        if (findHelpViewFromContentView == null) {
            YDE yde = this.helperView;
            if (yde == null) {
                YDE yde2 = new YDE(this.context);
                this.helperView = yde2;
                yde2.setVideoContext(this);
                this.helperView.setId(com.zhiliaoapp.musically.R.id.n9t);
            } else {
                C48671J8h.LIZ(yde);
            }
            viewGroup.addView(this.helperView, new ViewGroup.LayoutParams(1, 1));
            return;
        }
        if (findHelpViewFromContentView instanceof YDE) {
            this.helperView = (YDE) findHelpViewFromContentView;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("find helpview is illegal type: ");
        LIZ2.append(C16880lQ.LJLLJ(findHelpViewFromContentView.getClass()));
        X1D.LIZIZ(LIZ2);
        C48671J8h.LIZ(this.helperView);
        C48671J8h.LIZ(findHelpViewFromContentView);
        YDE yde3 = new YDE(this.context);
        this.helperView = yde3;
        yde3.setVideoContext(this);
        this.helperView.setId(com.zhiliaoapp.musically.R.id.n9t);
        viewGroup.addView(this.helperView, new ViewGroup.LayoutParams(1, 1));
    }

    private void ensureScreenParams() {
        if (this.screenHeight <= 0 || this.screenWidth <= 0) {
            this.screenWidth = C48671J8h.LIZLLL(this.context);
            this.screenHeight = C48671J8h.LIZJ(this.context);
        }
    }

    private Lifecycle getActivityLifecycle() {
        Object obj = this.context;
        if (obj instanceof LifecycleOwner) {
            return ((LifecycleOwner) obj).getLifecycle();
        }
        return null;
    }

    public static EnumC48190Ivi getNetworkType() {
        return EnumC79517VIr.KEEPER.getNetworkType();
    }

    public static VideoContext getResumedVideoContext() {
        return EnumC79517VIr.KEEPER.currentVideoContext;
    }

    public static boolean isCurrentFullScreen() {
        VideoContext videoContext = EnumC79517VIr.KEEPER.currentVideoContext;
        if (videoContext != null && videoContext.isFullScreen()) {
            return true;
        }
        return false;
    }

    private void resetWindowCallback() {
        Z9T z9t;
        Activity LIZ;
        Window.Callback callback = this.mOldWindowCallback;
        if (callback == null || (z9t = this.mWindowCallbackWrapper) == null || z9t.LJLIL != callback || (LIZ = C48672J8i.LIZ(this.context)) == null) {
            return;
        }
        LIZ.getWindow().setCallback(this.mOldWindowCallback);
    }

    private void setWindowCallbackWrapper() {
        Activity LIZ = C48672J8i.LIZ(this.context);
        if (LIZ == null) {
            return;
        }
        Window.Callback callback = LIZ.getWindow().getCallback();
        if (callback == null) {
            callback = LIZ;
        }
        Z9T z9t = this.mWindowCallbackWrapper;
        if (z9t == null || callback != z9t.LJLIL) {
            this.mOldWindowCallback = callback;
            this.mWindowCallbackWrapper = new YSG(this, callback);
        }
        if (this.mWindowCallbackWrapper != null) {
            LIZ.getWindow().setCallback(this.mWindowCallbackWrapper);
        }
    }

    public void applyOptTextureAlpha() {
        YSD ysd;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && (ysd = ys3.LJLILLLLZI) != null) {
            ysd.LJFF();
        }
    }

    public void applyPreTextureAlpha() {
        YSD ysd;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && (ysd = ys3.LJLILLLLZI) != null) {
            ysd.LIZIZ();
        }
    }

    public int changeOrientationIfNeed() {
        return this.fullScreenOperator.changeOrientationIfNeed();
    }

    public void clearLayers() {
        YS6 ys6;
        TreeSet<YSA> treeSet;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null || (treeSet = (ys6 = ys3.LLIIIILZ).LJ) == null) {
            return;
        }
        Iterator<YSA> it = treeSet.iterator();
        while (it.hasNext()) {
            YSA next = it.next();
            if (next != null) {
                YS6.LJI(ys6.LIZ, next);
                YS6.LJI(ys6.LIZIZ, next);
                TreeSet<YSA> treeSet2 = ys6.LJ;
                if (treeSet2 != null && treeSet2.contains(next)) {
                    it.remove();
                    YTK ytk = ys6.LIZLLL.get(next.getLayerType());
                    if (ytk != null) {
                        ((HashMap) ys6.LJI).remove(ytk.getClass());
                    }
                    ys6.LIZLLL.remove(next.getLayerType());
                    ys6.LIZJ.delete(next.getLayerType());
                    next.onUnregister(ys6);
                }
            }
        }
    }

    public void detachLayerHostMediaLayout() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ViewParent parent = ys3.getParent();
            cleanSurfaceOnDetachIfUseSurfaceView(getLayerHostMediaLayout());
            if (parent instanceof YS4) {
                ((YS4) parent).LIZJ();
            } else {
                KL2.LIZIZ(this.layerHostMediaLayout);
            }
        }
    }

    public void dismissCaptureViewWhenSurfaceCreated() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && ys3.LJIILLIIL()) {
            YS3 ys32 = this.layerHostMediaLayout;
            if (ys32.getSurface().isValid()) {
                ys32.LJI();
            } else {
                ys32.LLIFFJFJJ = true;
            }
        }
    }

    public void dismissVideoViewIfUseSurfaceView() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && ys3.LJIILLIIL()) {
            YS3 ys32 = this.layerHostMediaLayout;
            if (ys32.LLII == null) {
                ys32.LLII = new IDHandlerS25S0100000_15(ys32, C16880lQ.LLJJJJ(), 3);
            }
            ys32.LLII.sendEmptyMessageDelayed(0, 500L);
        }
    }

    public YSP fetchVideoSnapshotInfo() {
        YS7 ys7;
        YS3 ys3 = this.layerHostMediaLayout;
        YSP ysp = null;
        if (ys3 != null && (ys7 = ys3.LJLL) != null && (ysp = ys7.fetchVideoSnapshotInfo()) != null) {
            YSD ysd = ys3.LJLILLLLZI;
            if (ysd != null && ysd.getVideoView() != null) {
                ysp.LJIIIZ = ys3.LJLILLLLZI.getVideoHeight();
                ysp.LJIIIIZZ = ys3.LJLILLLLZI.getVideoWidth();
            }
            ysp.LJIIJJI = ys3.LLIILII;
        }
        return ysp;
    }

    public Lifecycle getCurrentLifecycle() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.getObservedLifecycle();
        }
        return null;
    }

    public int getCurrentPosition() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null) {
            return 0;
        }
        return ys3.getCurrentPosition();
    }

    public int getDuration() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null) {
            return 0;
        }
        return ys3.getDuration();
    }

    public ViewGroup getFullScreenContainer() {
        FrameLayout frameLayout = this.fullScreenRoot;
        if (frameLayout == null) {
            return getFullScreenRoot(this.context);
        }
        return frameLayout;
    }

    public C46886Iag getPlayBackParams() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.getPlayBackParams();
        }
        return null;
    }

    public C79985VaH getPlayEntity() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.getPlayEntity();
        }
        return null;
    }

    public YS2 getPlayingVideoPatch() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.getPlayingVideoPatch();
        }
        return null;
    }

    public int getPortraitAnimationInterval() {
        C79994VaQ c79994VaQ = this.playSettings;
        if (c79994VaQ != null) {
            return c79994VaQ.LIZIZ;
        }
        return -1;
    }

    public List<C79985VaH> getPreparePlayEntityList() {
        YS5 ys5 = this.videoPrepareManager;
        ys5.getClass();
        return new ArrayList(ys5.LIZJ);
    }

    public TTVideoEngine getVideoEngine() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.getVideoEngine();
        }
        return null;
    }

    public Bitmap getVideoFrame() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.getVideoFrame();
        }
        return null;
    }

    public List<YS2> getVideoPatchLayouts() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.getVideoPatchLayouts();
        }
        return null;
    }

    public InterfaceC48221IwD getVideoStateInquirer() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.getVideoStateInquirer();
        }
        return null;
    }

    public int getWatchedDuration() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null) {
            return 0;
        }
        return ys3.getWatchedDuration();
    }

    public boolean isAbandonAudioFocusWhenComplete() {
        C79994VaQ c79994VaQ = this.playSettings;
        if (c79994VaQ == null || (c79994VaQ.LJIIIZ & 4) == 0) {
            return false;
        }
        return true;
    }

    public boolean isAbandonAudioFocusWhenPause() {
        C79994VaQ c79994VaQ = this.playSettings;
        if (c79994VaQ == null || (c79994VaQ.LJIIIZ & 8) == 0) {
            return false;
        }
        return true;
    }

    public boolean isEnteringFullScreen() {
        return this.fullScreenOperator.isEnteringFullScreen();
    }

    public boolean isExitingFullScreen() {
        return this.fullScreenOperator.isExitingFullScreen();
    }

    public boolean isFullScreen() {
        return this.fullScreenOperator.isFullScreen();
    }

    public boolean isFullScreening() {
        return this.fullScreenOperator.isFullScreening();
    }

    public boolean isHalfScreen() {
        return this.fullScreenOperator.isHalfScreen();
    }

    public boolean isKeepScreenOn() {
        YDE yde = this.helperView;
        if (yde != null && yde.getKeepScreenOn()) {
            return true;
        }
        return false;
    }

    public boolean isLoop() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && ys3.LJLJL.LJFF) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && ys3.LJLJL.LJ) {
            return true;
        }
        return false;
    }

    public boolean isNoAudioFocusWhenMute() {
        C79994VaQ c79994VaQ = this.playSettings;
        if (c79994VaQ == null || (c79994VaQ.LJIIIZ & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean isPaused() {
        YS7 ys7;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null || (ys7 = ys3.LJLL) == null || !ys7.isPaused()) {
            return false;
        }
        return true;
    }

    public boolean isPlayCompleted() {
        YS7 ys7;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null || (ys7 = ys3.LJLL) == null || !ys7.isVideoPlayCompleted()) {
            return false;
        }
        return true;
    }

    public boolean isPlayed() {
        YS7 ys7;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null || (ys7 = ys3.LJLL) == null || !ys7.isPlayed()) {
            return false;
        }
        return true;
    }

    public boolean isPlaying() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.LJIILJJIL();
        }
        return false;
    }

    public boolean isReleased() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null || ys3.LJIILL()) {
            return true;
        }
        return false;
    }

    public boolean isRotateToFullScreenEnable() {
        return this.fullScreenOperator.isRotateToFullScreenEnable();
    }

    public boolean isShouldPlay() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null) {
            return false;
        }
        YS7 ys7 = ys3.LJLL;
        if ((ys7 == null || !ys7.isShouldPlay()) && !ys3.LLFF) {
            return false;
        }
        return true;
    }

    public boolean isStarted() {
        YS7 ys7;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null || (ys7 = ys3.LJLL) == null || !ys7.isStarted()) {
            return false;
        }
        return true;
    }

    public boolean isUseBlackCover() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && ys3.LLD) {
            return true;
        }
        return false;
    }

    public boolean isVideoPatchPlaying() {
        List<YS2> list;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null || (list = ys3.LLIIL) == null) {
            return false;
        }
        Iterator<YS2> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILJJIL()) {
                return true;
            }
        }
        return false;
    }

    public boolean isZoomingEnabled() {
        YSD ysd;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null || (ysd = ys3.LJLILLLLZI) == null || !ysd.LIZ()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r2 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onBackPressedWhenFullScreen() {
        /*
            r3 = this;
            X.YS3 r0 = r3.layerHostMediaLayout
            if (r0 == 0) goto L3d
            X.YS6 r2 = r0.LLIIIILZ
            X.VDh r1 = new X.VDh
            r0 = 307(0x133, float:4.3E-43)
            r1.<init>(r0)
            boolean r2 = r2.LJ(r1)
            if (r2 != 0) goto L3f
        L13:
            java.util.Map<androidx.lifecycle.Lifecycle, com.ss.android.videoshop.context.LifeCycleObserver> r0 = r3.lifeCycleVideoHandlerMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            X.VIs r0 = (X.C79518VIs) r0
            if (r0 == 0) goto L1d
            if (r2 != 0) goto L39
            boolean r0 = r0.onBackPressedWhenFullScreen(r3)
            if (r0 == 0) goto L3b
        L39:
            r2 = 1
            goto L1d
        L3b:
            r2 = 0
            goto L1d
        L3d:
            r2 = 0
            goto L13
        L3f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.videoshop.context.VideoContext.onBackPressedWhenFullScreen():boolean");
    }

    public void pause() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.LJIJJLI();
        }
    }

    public void pauseVideoPatch() {
        List<YS2> list;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && (list = ys3.LLIIL) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                YS2 ys2 = (YS2) it.next();
                if (ys2.LJIILJJIL()) {
                    ys2.LJIJJLI();
                }
            }
        }
    }

    public void play() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.LJIL();
        }
    }

    public void release() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.LJJI();
        }
    }

    public void releaseAllPreparedVideoControllers() {
        YS5 ys5 = this.videoPrepareManager;
        ys5.getClass();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("releaseAllPreparedVideoControllers context:");
            LIZ.append(C16880lQ.LJLLJ(ys5.LJIIIZ.getContext().getClass()));
            LIZ.append(" size:");
            LIZ.append(((LinkedList) ys5.LIZJ).size());
            X1D.LIZIZ(LIZ);
        } catch (Exception unused) {
        }
        ((LinkedList) ys5.LIZJ).clear();
        Iterator it = ((HashMap) ys5.LIZIZ).entrySet().iterator();
        while (it.hasNext()) {
            YD6 yd6 = (YD6) ((Map.Entry) it.next()).getValue();
            if (yd6 != null) {
                yd6.setSurfaceTextureListener(null);
            }
            KL2.LIZIZ(yd6);
        }
        ((HashMap) ys5.LIZIZ).clear();
        Iterator it2 = ((HashMap) ys5.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            ((YS7) ((Map.Entry) it2.next()).getValue()).release();
        }
        ((HashMap) ys5.LIZ).clear();
    }

    public void releaseVideoPatch() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.LJJIIZ();
        }
    }

    public void resumeProgressUpdate() {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            if (ys3.LJLL == null) {
                ys3.LJLL = ys3.LJIIZILJ(ys3.LJLJLLL);
            }
            if (ys3.LJLL.isPlaying()) {
                ys3.LJLL.resumeProgressUpdate();
            }
        }
    }

    public void startTrackOrientation() {
        this.fullScreenOperator.startTrackOrientation();
    }

    public void startTrackOrientationNow() {
        this.fullScreenOperator.startTrackOrientationNow();
    }

    public void startVideoAudioFocusController() {
        int i;
        C79520VIu c79520VIu = this.videoAudioFocusController;
        if (c79520VIu != null) {
            C79994VaQ c79994VaQ = this.playSettings;
            if (c79994VaQ != null) {
                i = c79994VaQ.LJIIJ;
            } else {
                i = 1;
            }
            c79520VIu.LIZIZ(i);
        }
    }

    public void stopTrackOrientation() {
        this.fullScreenOperator.stopTrackOrientation();
    }

    public void stopTrackOrientationNow() {
        this.fullScreenOperator.stopTrackOrientationNow();
    }

    public void stopVideoAudioFocusController() {
        C79520VIu c79520VIu = this.videoAudioFocusController;
        if (c79520VIu == null || c79520VIu.LJLJI.get() == null) {
            return;
        }
        try {
            c79520VIu.LJLILLLLZI.abandonAudioFocus(c79520VIu);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        c79520VIu.LJLJJI = true;
        c79520VIu.LJLIL.removeCallbacksAndMessages(null);
    }

    public static boolean isWifiOn() {
        if (getNetworkType() == EnumC48190Ivi.WIFI) {
            return true;
        }
        return false;
    }

    public void changeFullScreenRoot() {
        if (isFullScreen()) {
            getFullScreenRoot(this.context);
            addFullScreenRootToTop();
            YS3 ys3 = this.layerHostMediaLayout;
            if (ys3 != null) {
                KL2.LIZIZ(ys3);
                this.fullScreenRoot.addView(this.layerHostMediaLayout, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    public void enterFullScreen() {
        if (!isMusic()) {
            this.fullScreenOperator.enterFullScreen();
        }
    }

    public void enterOrExitFullScreen() {
        if (!isMusic()) {
            if (isFullScreen()) {
                exitFullScreen();
            } else {
                enterFullScreen();
            }
        }
    }

    public void exitFullScreen() {
        if (!isMusic()) {
            this.fullScreenOperator.exitFullScreen();
        }
    }

    public YSE getCurrentLifeCycleVideoHandler() {
        LifeCycleObserver lifeCycleObserver;
        Lifecycle currentLifecycle = getCurrentLifecycle();
        if (currentLifecycle != null && (lifeCycleObserver = this.lifeCycleVideoHandlerMap.get(currentLifecycle)) != null) {
            return lifeCycleObserver.LJLIL;
        }
        return null;
    }

    public boolean isMusic() {
        if (getPlayEntity() != null && (!TextUtils.isEmpty(null))) {
            return true;
        }
        return false;
    }

    public void onViewPaused() {
        YSE currentLifeCycleVideoHandler = getCurrentLifeCycleVideoHandler();
        if (currentLifeCycleVideoHandler instanceof AutoPauseResumeLifeCycleHandler) {
            ((AutoPauseResumeLifeCycleHandler) currentLifeCycleVideoHandler).onViewPaused();
        }
    }

    public Context getContext() {
        return this.context;
    }

    public FullScreenOperator getFullScreenOperator() {
        return this.fullScreenOperator;
    }

    public ViewGroup getFullScreenRoot() {
        return this.userFullScreenRoot;
    }

    public long getFullscreenFinishedTimeStamp() {
        return this.fullscreenFinishedTimeStamp;
    }

    public C79376VDg getHeadsetHelper() {
        return this.headsetHelper;
    }

    public X14 getHeadsetHelperOpt() {
        return this.headsetHelperOpt;
    }

    public YS3 getLayerHostMediaLayout() {
        return this.layerHostMediaLayout;
    }

    public YS4 getSimpleMediaView() {
        return this.simpleMediaView;
    }

    public C79520VIu getVideoAudioFocusController() {
        return this.videoAudioFocusController;
    }

    public boolean isEnablePortraitFullScreen() {
        return this.enablePortraitFullScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoContext(Context context) {
        this.handler = new WeakHandler(this);
        this.location = new int[2];
        this.enablePortraitFullScreen = false;
        this.videoPrepareManager = new YS5();
        this.mVideoMethodOpt = false;
        this.headsetHelperOpt = null;
        this.mOnExternalConfigurationChanged = false;
        this.keepScreenOnStatus = new TreeSet();
        this.mKeyDispatchState = new KeyEvent.DispatcherState();
        this.context = context;
        FullScreenOperator fullScreenOperator = new FullScreenOperator(context);
        this.fullScreenOperator = fullScreenOperator;
        fullScreenOperator.setFullScreenMsgInterval(sFullscreenOperatorInterval);
        this.fullScreenOperator.setFullScreenListener(this);
        this.fullScreenOperator.setVideoContext(this);
        this.lifeCycleVideoHandlerMap = new ConcurrentHashMap();
        this.videoPlayListeners = new CopyOnWriteArrayList();
        ensureScreenParams();
        try {
            ((LifecycleOwner) context).getLifecycle().addObserver(this);
        } catch (Exception unused) {
        }
        this.keyCodes = new TreeSet<>();
        this.prepareLayerHostList = new ArrayList();
        this.videoPrepareManager.LJIIIZ = this;
        if (X14.LIZIZ == null) {
            synchronized (X14.class) {
                if (X14.LIZIZ == null) {
                    X14.LIZIZ = new X14();
                }
            }
        }
        this.headsetHelperOpt = X14.LIZIZ;
        this.headsetHelper = new C79376VDg(context, this);
    }

    private void detachFromParent(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        try {
            try {
                C16880lQ.LJLLL(view, (ViewGroup) parent);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } catch (Exception unused) {
            for (StackTraceElement stackTraceElement : C16880lQ.LLLLIIIILLL().getStackTrace()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("class:");
                LIZ.append(stackTraceElement.getClassName());
                LIZ.append(", method:");
                LIZ.append(stackTraceElement.getMethodName());
                LIZ.append(", file:");
                LIZ.append(stackTraceElement.getFileName());
                LIZ.append(", lineNum:");
                LIZ.append(stackTraceElement.getLineNumber());
                X1D.LIZIZ(LIZ);
            }
        }
    }

    private View findHelpViewFromContentView(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && com.zhiliaoapp.musically.R.id.n9t == childAt.getId() && (childAt instanceof YDE)) {
                return childAt;
            }
        }
        return null;
    }

    private ViewGroup getFullScreenRoot(Context context) {
        FrameLayout frameLayout = this.fullScreenRoot;
        if (frameLayout == null) {
            View view = null;
            if (this.userFullScreenRoot == null) {
                Activity LIZ = C48672J8i.LIZ(context);
                if (LIZ == null) {
                    return null;
                }
                this.userFullScreenRoot = (ViewGroup) LIZ.findViewById(R.id.content);
            }
            ViewGroup viewGroup = this.userFullScreenRoot;
            if (viewGroup != null) {
                view = viewGroup.findViewById(com.zhiliaoapp.musically.R.id.n9s);
            }
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout2 = (FrameLayout) view;
                this.fullScreenRoot = frameLayout2;
                return frameLayout2;
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.fullScreenRoot = frameLayout3;
            frameLayout3.setId(com.zhiliaoapp.musically.R.id.n9s);
            return this.fullScreenRoot;
        }
        return frameLayout;
    }

    public static VideoContext getVideoContext(Context context) {
        return EnumC79517VIr.KEEPER.getVideoContext(context);
    }

    public void addLayers(BaseVideoLayer... baseVideoLayerArr) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            YS6 ys6 = ys3.LLIIIILZ;
            ys6.getClass();
            Iterator it = ((ArrayList) ys6.LIZJ(Arrays.asList(baseVideoLayerArr))).iterator();
            while (it.hasNext()) {
                ys6.LIZ((YSA) it.next());
            }
        }
    }

    public void addOnScreenOrientationChangedListener(VKF vkf) {
        if (vkf != null) {
            this.fullScreenOperator.addOnScreenOrientationChangedListener(vkf);
        }
    }

    public void addPrepareLayerHostMediaLayout(YS3 ys3) {
        if (ys3 != null && !this.prepareLayerHostList.contains(ys3)) {
            this.prepareLayerHostList.add(ys3);
        }
    }

    public void attachMediaView(YS4 ys4) {
        if (ys4 != null && ys4.getObservedLifecycle() == getCurrentLifecycle()) {
            YS4 ys42 = this.simpleMediaView;
            if (ys42 == null || ys42.LJLJJLL) {
                if (isCurrentSource(ys4.getPlayEntity())) {
                    updateSimpleMediaView(ys4);
                    this.handler.removeCallbacksAndMessages(null);
                    this.handler.sendMessage(this.handler.obtainMessage(101, ys4));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("send MSG_DISPATCH_ATTACH simpleMediaView:");
                    LIZ.append(ys4.hashCode());
                    X1D.LIZIZ(LIZ);
                    return;
                }
                if (!isHalfScreen() || !isCurrentView(ys4)) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("send 0 MSG_DISPATCH_DETACH simpleMediaView:");
                LIZ2.append(ys4.hashCode());
                X1D.LIZIZ(LIZ2);
                this.handler.sendMessage(this.handler.obtainMessage(100, ys4));
            }
        }
    }

    public void cleanSurfaceOnDetachIfUseSurfaceView(YS3 ys3) {
        if (ys3 != null && ys3.LJIILLIIL() && ys3.LJLL != null && ys3.getSurface() != null && ys3.getSurface().isValid()) {
            ys3.LJLL.clearSurfaceIfUseSurfaceView();
        }
    }

    public void cleanUp(Lifecycle lifecycle) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && ys3.getObservedLifecycle() == lifecycle) {
            this.layerHostMediaLayout.LJJIIZ();
            this.layerHostMediaLayout.LJJI();
            this.layerHostMediaLayout = null;
            this.simpleMediaView = null;
        }
        for (int size = this.prepareLayerHostList.size() - 1; size >= 0; size--) {
            YS3 ys32 = (YS3) ListProtector.get(this.prepareLayerHostList, size);
            if (ys32.getObservedLifecycle() == lifecycle) {
                ys32.LJJIIZ();
                ys32.LJJI();
                this.prepareLayerHostList.remove(ys32);
            }
        }
    }

    public void detachMediaView(YS4 ys4) {
        if (ys4 != null && ys4.LJLJJLL) {
            if (isHalfScreen() || isExitingFullScreen()) {
                if ((isCurrentView(ys4) && isCurrentSource(ys4.getPlayEntity())) || !ys4.LIZLLL()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("send 200 MSG_DISPATCH_DETACH simpleMediaView:");
                    LIZ.append(ys4.hashCode());
                    X1D.LIZIZ(LIZ);
                    this.handler.sendMessage(this.handler.obtainMessage(100, ys4));
                    return;
                }
                this.handler.sendMessage(this.handler.obtainMessage(102, ys4));
            }
        }
    }

    public void dismissSurfaceCoverFrameIfUseSurfaceView(boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && ys3.LJIILLIIL()) {
            C07670Rv.LIZLLL("dismiss surface capture view. post = ", z);
            if (z) {
                this.layerHostMediaLayout.postDelayed(new ARunnableS51S0100000_15(this, 57), sSurfaceViewDismissCoverInterval);
            } else {
                this.layerHostMediaLayout.LJI();
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return keyEvent.dispatch(this, this.mKeyDispatchState, this);
    }

    public void doTransferSurfaceTaskAfterCheck(Runnable runnable) {
        int width;
        int height;
        Pair pair;
        int i;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            if (!ys3.LLIILZL.isReleased() && ys3.LJIILLIIL()) {
                YT3 yt3 = new YT3(runnable);
                if (Build.VERSION.SDK_INT >= 24) {
                    if (ys3.LJLJI.getSurface() == null || !ys3.LJLJI.getSurface().isValid()) {
                        runnable.run();
                        return;
                    }
                    YSF ysf = ys3.LJLJI;
                    if (ysf == null) {
                        width = 0;
                    } else {
                        width = ysf.getWidth();
                    }
                    YSF ysf2 = ys3.LJLJI;
                    if (ysf2 == null) {
                        height = 0;
                    } else {
                        height = ysf2.getHeight();
                    }
                    if (width == 0 || height == 0) {
                        pair = new Pair(0, 0);
                    } else {
                        int i2 = 960;
                        if (width > height) {
                            i = 960;
                        } else {
                            i = 540;
                        }
                        if (width > height) {
                            i2 = 540;
                        }
                        while (width > i) {
                            width >>= 1;
                            height >>= 1;
                        }
                        while (height > i2) {
                            width >>= 1;
                            height >>= 1;
                        }
                        pair = new Pair(Integer.valueOf(width), Integer.valueOf(height));
                    }
                    if (((Integer) pair.first).intValue() == 0 || ((Integer) pair.second).intValue() == 0) {
                        yt3.LIZ.run();
                        return;
                    } else {
                        yt3.LIZ.run();
                        return;
                    }
                }
                ys3.LJLILLLLZI.LIZJ(ys3.LJLL.captureVideoCurrentFrame());
                runnable.run();
                return;
            }
            runnable.run();
            return;
        }
        runnable.run();
    }

    public void exitFullScreen(boolean z) {
        if (!isMusic()) {
            this.fullScreenOperator.exitFullScreen(z);
        }
    }

    public int getCurrentPosition(boolean z) {
        YS7 ys7;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null || (ys7 = ys3.LJLL) == null) {
            return 0;
        }
        return ys7.getCurrentPosition(z);
    }

    public BaseVideoLayer getLayer(int i) {
        YSA ysa;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null) {
            return null;
        }
        SparseArray<YSA> sparseArray = ys3.LLIIIILZ.LIZJ;
        if (sparseArray != null) {
            ysa = sparseArray.get(i);
        } else {
            ysa = null;
        }
        if (!(ysa instanceof BaseVideoLayer)) {
            return null;
        }
        return (BaseVideoLayer) ysa;
    }

    public Bitmap getVideoFrame(Bitmap bitmap) {
        YSF ysf;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null || (ysf = ys3.LJLJI) == null) {
            return null;
        }
        return ysf.getBitmap(bitmap);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        int i = message.what;
        if (i == 100) {
            YS4 ys4 = (YS4) message.obj;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MSG_DISPATCH_DETACH simpleMediaView:");
            LIZ.append(ys4.hashCode());
            X1D.LIZIZ(LIZ);
            InterfaceC80606VkI attachListener = ys4.getAttachListener();
            if (attachListener != null) {
                attachListener.LJII(ys4);
                return;
            }
            return;
        }
        if (i == 101) {
            YS4 ys42 = (YS4) message.obj;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("MSG_DISPATCH_ATTACH simpleMediaView:");
            LIZ2.append(ys42.hashCode());
            X1D.LIZIZ(LIZ2);
            InterfaceC80606VkI attachListener2 = ys42.getAttachListener();
            if (attachListener2 == null) {
                return;
            }
            attachListener2.LIZ(ys42);
            return;
        }
        if (i != 102) {
            return;
        }
        this.videoPrepareManager.LIZJ(((YS4) message.obj).getPlayEntity());
    }

    public boolean isCurrentSource(C79985VaH c79985VaH) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && c79985VaH != null && c79985VaH.equals(ys3.getPlayEntity())) {
            return true;
        }
        return false;
    }

    public boolean isCurrentView(View view) {
        if (view != null && this.simpleMediaView == view) {
            return true;
        }
        return false;
    }

    public boolean isPrepared(String str) {
        for (C79985VaH c79985VaH : this.videoPrepareManager.LIZJ) {
            if (c79985VaH != null && !TextUtils.isEmpty(str) && str.equals(c79985VaH.LIZ)) {
                return true;
            }
        }
        return false;
    }

    public boolean notifyEvent(YT8 yt8) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && !ys3.LJIILL()) {
            return this.layerHostMediaLayout.LJJIIJZLJL(yt8);
        }
        return false;
    }

    public void observeKeyCode(int i) {
        this.keyCodes.add(Integer.valueOf(i));
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mOnExternalConfigurationChanged = true;
        this.fullScreenOperator.onConfigurationChanged(configuration);
    }

    public void onFoldScreenConfigChange(boolean z) {
        setEnablePortraitFullScreen(!z);
        if (isFullScreen() && this.fullScreenOperator.getCurrentOrientation() == 1 && z) {
            exitFullScreen();
        }
    }

    public void onInternalConfigurationChanged(Configuration configuration) {
        if (!this.mOnExternalConfigurationChanged) {
            this.fullScreenOperator.onConfigurationChanged(configuration);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onLifeCycleOnCreate(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnCreate owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
        addOrientationDetectionViewIfNull();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onLifeCycleOnDestroy(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnDestroy owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        EnumC79517VIr.KEEPER.onActDestroy(this.context, this);
        releaseAllPreparedVideoControllers();
        lifecycle.removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onLifeCycleOnPause(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnPause owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onLifeCycleOnResume(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnResume owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
        addOrientationDetectionViewIfNull();
        if (isFullScreen()) {
            this.fullScreenOperator.enterFullScreenHideNavigation();
        }
        EnumC79517VIr.KEEPER.onActResume(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onLifeCycleOnStart(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnStart owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onLifeCycleOnStop(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnStop owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
        releaseAllPreparedVideoControllers();
    }

    public void onWindowFocusChanged(boolean z) {
        Iterator<Map.Entry<Lifecycle, LifeCycleObserver>> it = this.lifeCycleVideoHandlerMap.entrySet().iterator();
        while (it.hasNext()) {
            LifeCycleObserver value = it.next().getValue();
            if (value != null) {
                value.onWindowFocusChanged(this, z);
            }
        }
        notifyEvent(new YT2());
    }

    public void prepare(C79985VaH c79985VaH) {
        this.videoPrepareManager.LIZIZ(c79985VaH, false);
    }

    public void registerVideoPlayListener(InterfaceC87404YSa interfaceC87404YSa) {
        if (interfaceC87404YSa != null && !this.videoPlayListeners.contains(interfaceC87404YSa)) {
            this.videoPlayListeners.add(interfaceC87404YSa);
        }
    }

    public void releasePreparedVideoController(C79985VaH c79985VaH) {
        this.videoPrepareManager.LIZJ(c79985VaH);
    }

    public void removeLayer(int i) {
        YSA ysa;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            YS6 ys6 = ys3.LLIIIILZ;
            SparseArray<YSA> sparseArray = ys6.LIZJ;
            if (sparseArray == null) {
                ysa = null;
            } else {
                ysa = sparseArray.get(i);
            }
            ys6.LJFF(ysa);
        }
    }

    public void removeOnScreenOrientationChangedListener(VKF vkf) {
        if (vkf != null) {
            this.fullScreenOperator.removeOnScreenOrientationChangedListener(vkf);
        }
    }

    public void removePrepareLayerHostMediaLayout(YS3 ys3) {
        if (ys3 != null) {
            this.prepareLayerHostList.remove(ys3);
        }
    }

    public void resumeVideoSnapshotInfo(YSP ysp) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            if (ysp != null) {
                ys3.LLIILII = ysp.LJIIJJI;
            }
            ys3.LLIILZL.setLayerHostMediaLayout(ys3);
            if (ysp == null) {
                return;
            }
            if (ys3.LJLL == null) {
                VideoController LJIIZILJ = ys3.LJIIZILJ(ys3.LJLJLLL);
                ys3.LJLL = LJIIZILJ;
                LJIIZILJ.setVideoViewType(ys3.LJLJLJ);
            }
            YSD ysd = ys3.LJLILLLLZI;
            if (ysd != null && ysd.getVideoView() != null) {
                ys3.LJLILLLLZI.setVideoSize(ysp.LJIIIIZZ, ysp.LJIIIZ);
            }
            ys3.LJLL.setVideoPlayListener(ys3);
            ys3.LJLL.resumeVideoSnapshotInfo(ysp);
        }
    }

    public YD6 retrievePreparedTextureVideoView(C79985VaH c79985VaH) {
        return this.videoPrepareManager.LIZLLL(c79985VaH);
    }

    public YS7 retrievePreparedVideoController(C79985VaH c79985VaH) {
        return this.videoPrepareManager.LJ(c79985VaH);
    }

    public void seekTo(long j) {
        YS7 ys7;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && j >= 0 && (ys7 = ys3.LJLL) != null) {
            ys7.seekTo(j);
        }
    }

    public void setAsyncPosition(boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setAsyncPosition(z);
        }
    }

    public void setAsyncRelease(boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setAsyncRelease(z);
        }
    }

    public void setAutoChangeOrientation(boolean z) {
        this.fullScreenOperator.setCanChangeOrientation(z);
    }

    public void setAutoUpdateUiFlags(boolean z) {
        this.fullScreenOperator.setCanAutoUpdateUiFlags(z);
    }

    public void setEnablePortraitFullScreen(boolean z) {
        this.enablePortraitFullScreen = z;
    }

    public void setFullScreenRoot(ViewGroup viewGroup) {
        if (viewGroup != null && this.userFullScreenRoot != viewGroup) {
            this.userFullScreenRoot = viewGroup;
            this.fullScreenRoot = null;
        }
    }

    public void setHideHostWhenRelease(boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setHideHostWhenRelease(z);
        }
    }

    public void setLayerHostMediaLayout(YS3 ys3) {
        int i;
        String str;
        dismissVideoViewIfUseSurfaceView();
        this.layerHostMediaLayout = ys3;
        this.prepareLayerHostList.remove(ys3);
        if (ys3 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setLayerHostMediaLayout parent hash:");
            if (ys3.getParent() != null) {
                i = ys3.getParent().hashCode();
            } else {
                i = -1;
            }
            LIZ.append(i);
            LIZ.append(" entity vid:");
            if (ys3.getPlayEntity() != null) {
                str = ys3.getPlayEntity().LIZ;
            } else {
                str = null;
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
        }
        if (this.simpleMediaView == null && ys3 != null) {
            this.simpleMediaView = ys3.getParentView();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setLayerHostMediaLayout set simpleMediaView:");
            LIZ2.append(this.simpleMediaView);
            X1D.LIZIZ(LIZ2);
        }
    }

    public void setLoop(boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setLoop(z);
        }
    }

    public void setMaxPrepareCount(int i) {
        this.videoPrepareManager.LJIIJ = i;
    }

    public void setMute(boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setMute(z);
        }
    }

    public void setOrientationMaxOffsetDegree(int i) {
        this.fullScreenOperator.setOrientationMaxOffsetDegree(i);
    }

    public void setPlayBackParams(C46886Iag c46886Iag) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setPlayBackParams(c46886Iag);
        }
    }

    public void setPlaySettings(C79994VaQ c79994VaQ) {
        this.playSettings = c79994VaQ;
        this.fullScreenOperator.setPlaySettings(c79994VaQ);
    }

    public void setPortrait(boolean z) {
        this.fullScreenOperator.setPortrait(z);
    }

    public void setPreparePlayListener(InterfaceC87404YSa interfaceC87404YSa) {
        this.videoPrepareManager.LJIIIIZZ = interfaceC87404YSa;
    }

    public void setPreparePlayUrlConstructor(YTA yta) {
        this.videoPrepareManager.LJII = yta;
    }

    public void setPrepareTtvNetClient(AbstractC47819Ipj abstractC47819Ipj) {
        this.videoPrepareManager.LJFF = abstractC47819Ipj;
    }

    public void setPrepareVideoEngineFactory(InterfaceC58392Mvs interfaceC58392Mvs) {
        this.videoPrepareManager.LJ = interfaceC58392Mvs;
    }

    public void setPrepareVideoPlayConfiger(InterfaceC87405YSb interfaceC87405YSb) {
        this.videoPrepareManager.LJI = interfaceC87405YSb;
    }

    public void setReleaseEngineEnabled(boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setReleaseEngineEnabled(z);
        }
    }

    public void setRenderMode(int i) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setRenderMode(i);
        }
    }

    public void setRotateEnabled(boolean z) {
        this.fullScreenOperator.setRotateEnabled(z);
    }

    public void setScreenOrientation(int i) {
        this.fullScreenOperator.setScreenOrientation(i);
    }

    public void setScreenOrientationChangeListener(InterfaceC78864UxI interfaceC78864UxI) {
        this.fullScreenOperator.setScreenOrientationChangeListener(interfaceC78864UxI);
    }

    public void setSimpleMediaView(YS4 ys4) {
        Integer num;
        this.simpleMediaView = ys4;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSimpleMediaView hash:");
        if (ys4 != null) {
            num = Integer.valueOf(ys4.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
    }

    public void setStartTime(int i) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setStartTime(i);
        }
    }

    public void setTextureLayout(int i) {
        setTextureLayout(i, null);
    }

    public void setTryToInterceptPlay(boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setTryToInterceptPlay(z);
        }
    }

    public void setUseBlackCover(boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setUseBlackCover(z);
        }
    }

    public void setVideoEngineFactory(InterfaceC58392Mvs interfaceC58392Mvs) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setVideoEngineFactory(interfaceC58392Mvs);
        }
    }

    public void setVideoMethodOpt(boolean z) {
        this.mVideoMethodOpt = z;
    }

    public void setZoomingEnabled(boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.setZoomingEnabled(z);
        }
    }

    public void unregisterLifeCycleVideoHandler(Lifecycle lifecycle) {
        LifeCycleObserver remove = this.lifeCycleVideoHandlerMap.remove(lifecycle);
        if (remove != null) {
            lifecycle.removeObserver(remove);
        }
    }

    public void unregisterVideoPlayListener(InterfaceC87404YSa interfaceC87404YSa) {
        if (interfaceC87404YSa != null) {
            this.videoPlayListeners.remove(interfaceC87404YSa);
        }
    }

    public void updateSimpleMediaView(YS4 ys4) {
        Integer num;
        YS3 ys3;
        if (ys4 != null && this.simpleMediaView != ys4 && (ys3 = this.layerHostMediaLayout) != null) {
            ViewParent parent = ys3.getParent();
            if (parent instanceof YS4) {
                ((YS4) parent).LIZJ();
                ys4.LIZ(this.layerHostMediaLayout);
                if (!isReleased()) {
                    KL2.LJIILLIIL(0, ys4);
                }
            }
        }
        this.simpleMediaView = ys4;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSimpleMediaView hash:");
        if (ys4 != null) {
            num = Integer.valueOf(ys4.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
    }

    public void addLayers(List<BaseVideoLayer> list) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            YS6 ys6 = ys3.LLIIIILZ;
            Iterator it = ((ArrayList) ys6.LIZJ(list)).iterator();
            while (it.hasNext()) {
                ys6.LIZ((YSA) it.next());
            }
        }
    }

    public void getVideoFrame(YT9 yt9) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.LJIIJ(yt9);
        } else {
            yt9.LIZ();
        }
    }

    public void removeLayer(BaseVideoLayer baseVideoLayer) {
        YS3 ys3;
        if (baseVideoLayer != null && (ys3 = this.layerHostMediaLayout) != null) {
            ys3.LLIIIILZ.LJFF(baseVideoLayer);
        }
    }

    public /* synthetic */ VideoContext(Context context, ARunnableS51S0100000_15 aRunnableS51S0100000_15) {
        this(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void getVideoFrame(YT9 yt9, Bitmap bitmap) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            YSF ysf = ys3.LJLJI;
            if (ysf == 0) {
                yt9.LIZ();
                return;
            }
            if (ysf instanceof SurfaceView) {
                if (Build.VERSION.SDK_INT >= 24) {
                    if (ysf.getSurface() == null || !ys3.LJLJI.getSurface().isValid()) {
                        if (yt9 == null) {
                            return;
                        }
                        yt9.LIZ();
                        return;
                    }
                    PixelCopy.request(ys3.LJLJI.getSurface(), bitmap, new PixelCopyOnPixelCopyFinishedListenerC87417YSn(bitmap), ys3.getHandler());
                    return;
                }
                if (yt9 == null) {
                    return;
                }
                ys3.LJLL.captureVideoCurrentFrame();
                yt9.LIZ();
                return;
            }
            ((TextureView) ysf).getBitmap(bitmap);
            yt9.LIZ();
            return;
        }
        yt9.LIZ();
    }

    @Override // X.YS8, X.InterfaceC87408YSe
    public void handleOtherSensorRotateAnyway(boolean z, int i) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().handleOtherSensorRotateAnyway(z, i);
        }
    }

    public boolean notifyEvent(Lifecycle lifecycle, YT8 yt8) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && !ys3.LJIILL() && this.layerHostMediaLayout.getObservedLifecycle() == lifecycle) {
            return this.layerHostMediaLayout.LJJIIJZLJL(yt8);
        }
        return false;
    }

    @Override // X.YS8, X.YS9
    public void onBufferEnd(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onBufferEnd(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onBufferStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onBufferStart(interfaceC48221IwD, c79985VaH);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        if (r0.isInteractive() != false) goto L28;
     */
    @Override // X.YS8, X.YS9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEngineInitPlay(X.InterfaceC48221IwD r4, X.C79985VaH r5) {
        /*
            r3 = this;
            X.Ix5 r2 = r3.videoScreenStateController
            if (r2 == 0) goto L20
            r1 = 1
            android.os.PowerManager r0 = r2.LIZJ     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto Lf
            boolean r0 = r0.isInteractive()     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L1a
        Lf:
            android.app.KeyguardManager r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1a
            boolean r0 = r0.isKeyguardLocked()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r2.LJ = r1
            r2.LIZIZ()
        L20:
            r3.addOrientationDetectionViewIfNull()
            r3.startTrackOrientation()
            boolean r0 = r3.isFullScreen()
            if (r0 == 0) goto L2f
            r3.addOrientationDetectionViewIfNull()
        L2f:
            java.util.List<X.YSa> r0 = r3.videoPlayListeners
            java.util.Iterator r1 = r0.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r1.next()
            X.YS9 r0 = (X.YS9) r0
            r0.onEngineInitPlay(r4, r5)
            goto L35
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.videoshop.context.VideoContext.onEngineInitPlay(X.IwD, X.VaH):void");
    }

    @Override // X.YS8, X.YS9
    public void onFirstPlayStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFirstPlayStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            keyEvent.startTracking();
            return true;
        }
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.LJJIIJZLJL(new C79377VDh(308, Integer.valueOf(i)));
        }
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.LJJIIJZLJL(new C79377VDh(310, Integer.valueOf(i)));
            return false;
        }
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (isFullScreen()) {
            if (i == 4 && keyEvent.isTracking() && !keyEvent.isCanceled()) {
                if (onBackPressedWhenFullScreen()) {
                    return true;
                }
                return false;
            }
            YS3 ys3 = this.layerHostMediaLayout;
            if (ys3 != null) {
                return ys3.LJJIIJZLJL(new C79377VDh(309, Integer.valueOf(i)));
            }
            return false;
        }
        return false;
    }

    @Override // X.YS8, X.YS9
    public void onPreRenderStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreRenderStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onPrepare(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onPrepare(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onPrepared(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onPrepared(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onRenderStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        if (isFullScreen()) {
            addOrientationDetectionViewIfNull();
        }
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoCompleted(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        if (isAbandonAudioFocusWhenComplete()) {
            stopVideoAudioFocusController();
        }
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoCompleted(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoPause(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        if (isAbandonAudioFocusWhenPause()) {
            stopVideoAudioFocusController();
        }
        boolean z = this.mVideoMethodOpt;
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoPause(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoPlay(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        boolean z = this.mVideoMethodOpt;
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoPlay(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoPreCompleted(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoPreCompleted(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoPreRelease(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        stopTrackOrientation();
        stopVideoAudioFocusController();
        C48275Ix5 c48275Ix5 = this.videoScreenStateController;
        if (c48275Ix5 != null) {
            c48275Ix5.getClass();
        }
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoPreRelease(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoReleased(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        boolean z = this.mVideoMethodOpt;
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoReleased(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoReplay(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoReplay(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoRetry(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoRetry(interfaceC48221IwD, c79985VaH);
        }
    }

    public void prepare(C79985VaH c79985VaH, boolean z) {
        this.videoPrepareManager.LIZIZ(c79985VaH, z);
    }

    public void registerLifeCycleVideoHandler(Lifecycle lifecycle, YSE yse) {
        if (lifecycle == null || yse == null) {
            return;
        }
        this.lifeCycleVideoHandlerMap.put(lifecycle, new LifeCycleObserver(lifecycle, yse, this));
    }

    public void releasePreparedIfResolutionNotMatch(C79985VaH c79985VaH, EnumC47176IfM enumC47176IfM) {
        C47160If6 LIZ;
        YS5 ys5 = this.videoPrepareManager;
        YS7 ys7 = (YS7) ((HashMap) ys5.LIZ).get(c79985VaH);
        if (ys7 != null) {
            C47164IfA videoModel = ys7.getVideoModel();
            if (enumC47176IfM == EnumC47176IfM.Auto && videoModel != null && videoModel.LJJIJ()) {
                if (ys7.getResolution() != enumC47176IfM) {
                    ys5.LIZJ(c79985VaH);
                }
            } else {
                if (ys5.LJI == null || videoModel == null || (LIZ = ys5.LIZ(ys7.getVideoStateInquirer(), videoModel, c79985VaH)) == null || LIZ.getResolution() == ys7.getResolution()) {
                    return;
                }
                ys5.LIZJ(c79985VaH);
            }
        }
    }

    public void setKeepScreenOn(int i, boolean z) {
        addOrientationDetectionViewIfNull();
        if (this.helperView != null) {
            if (z) {
                this.keepScreenOnStatus.add(Integer.valueOf(i));
            } else {
                this.keepScreenOnStatus.remove(Integer.valueOf(i));
            }
            this.helperView.setKeepScreenOn(!this.keepScreenOnStatus.isEmpty());
        }
    }

    public void setPrepareEngineOption(C79985VaH c79985VaH, YT7 yt7) {
        YS7 ys7 = (YS7) ((HashMap) this.videoPrepareManager.LIZ).get(c79985VaH);
        if (ys7 != null && yt7 != null) {
            ys7.setEngineOption(0, null);
        }
    }

    public void setResolution(int i, boolean z) {
        String enumC47176IfM;
        EnumC47176IfM[] values = EnumC47176IfM.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                EnumC47176IfM enumC47176IfM2 = values[i2];
                if (i == enumC47176IfM2.getIndex()) {
                    enumC47176IfM = enumC47176IfM2.toString(0);
                    break;
                }
                i2++;
            } else {
                enumC47176IfM = EnumC47176IfM.Standard.toString(0);
                break;
            }
        }
        setResolution(UC0.LIZIZ(enumC47176IfM), z);
    }

    public void setTextureLayout(int i, YTI yti) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            C79994VaQ c79994VaQ = ys3.LJLJL;
            if (c79994VaQ != null) {
                c79994VaQ.LJII = i;
            }
            YSD ysd = ys3.LJLILLLLZI;
            if (ysd != null) {
                ysd.LIZLLL(i);
            }
        }
    }

    public void setVolume(float f, float f2) {
        YS7 ys7;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && (ys7 = ys3.LJLL) != null) {
            ys7.setVolume(f, f2);
        }
    }

    public Bitmap getVideoFrame(int i, int i2) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            return ys3.LJIIIZ(i, i2);
        }
        return null;
    }

    public void setResolution(EnumC47176IfM enumC47176IfM, boolean z) {
        YS7 ys7;
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null && (ys7 = ys3.LJLL) != null) {
            ys7.setResolution(enumC47176IfM, z);
        }
    }

    public void getVideoFrame(YT9 yt9, int i, int i2) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            ys3.LJIIJJI(yt9, i, i2);
        } else {
            yt9.LIZ();
        }
    }

    public Bitmap getVideoFrameMax(int i, int i2, boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null) {
            return null;
        }
        ys3.getClass();
        if (i <= 0 || i2 <= 0) {
            return ys3.getVideoFrame();
        }
        YSF ysf = ys3.LJLJI;
        if (ysf == null) {
            return null;
        }
        int width = ysf.getWidth();
        int height = ys3.LJLJI.getHeight();
        if (height == 0 || !z) {
            return ys3.LJIIIZ(i, i2);
        }
        float f = width / height;
        int i3 = (int) (i2 * f);
        if (i3 <= i) {
            return ys3.LJIIIZ(i3, i2);
        }
        return ys3.LJIIIZ(i, (int) (i / f));
    }

    @Override // X.YS8, X.YS9
    public void onBufferCount(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onBufferCount(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS8, X.YS9
    public void onBufferingUpdate(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onBufferingUpdate(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS8, X.YS9
    public void onEnginePlayStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        if (!isNoAudioFocusWhenMute() || !c79985VaH.LJIIIIZZ.LJ) {
            startVideoAudioFocusController();
        }
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onEnginePlayStart(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS8, X.YS9
    public void onError(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, C47789IpF c47789IpF) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onError(interfaceC48221IwD, c79985VaH, c47789IpF);
        }
    }

    @Override // X.YS8, X.InterfaceC87404YSa
    public boolean onExecCommand(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, YTL ytl) {
        while (true) {
            boolean z = false;
            for (InterfaceC87404YSa interfaceC87404YSa : this.videoPlayListeners) {
                if (z || interfaceC87404YSa.onExecCommand(interfaceC48221IwD, c79985VaH, ytl)) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // X.YS8, X.YS9
    public void onFetchVideoModel(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFetchVideoModel(interfaceC48221IwD, c79985VaH, z);
        }
    }

    @Override // X.YNT
    public boolean onInterceptFullScreen(boolean z, int i, boolean z2) {
        Iterator<Map.Entry<Lifecycle, LifeCycleObserver>> it = this.lifeCycleVideoHandlerMap.entrySet().iterator();
        while (it.hasNext()) {
            LifeCycleObserver value = it.next().getValue();
            if (value != null && value.onInterceptFullScreen(z, i, z2)) {
                return true;
            }
        }
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null) {
            return false;
        }
        Iterator<InterfaceC87404YSa> it2 = this.videoPlayListeners.iterator();
        while (it2.hasNext()) {
            if (it2.next().onInterceptFullScreen(ys3.getVideoStateInquirer(), ys3.getPlayEntity(), z, i, z2)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.YS8, X.YS9
    public void onLoadStateChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadStateChanged(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS8, X.YS9
    public void onPlaybackStateChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onPlaybackStateChanged(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS8, X.YS9
    public void onPreVideoSeek(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, long j) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreVideoSeek(interfaceC48221IwD, c79985VaH, j);
        }
    }

    @Override // X.YS8, X.YS9
    public void onRenderSeekComplete(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderSeekComplete(interfaceC48221IwD, c79985VaH, z);
        }
    }

    @Override // X.YS8, X.YS9
    public void onStreamChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onStreamChanged(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoEngineInfos(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, C47620ImW c47620ImW) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoEngineInfos(interfaceC48221IwD, c79985VaH, c47620ImW);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoSeekComplete(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSeekComplete(interfaceC48221IwD, c79985VaH, z);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoSeekStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, long j) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSeekStart(interfaceC48221IwD, c79985VaH, j);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoStatusException(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoStatusException(interfaceC48221IwD, c79985VaH, i);
        }
    }

    public void releasePreparedIfQualityNotMatch(C79985VaH c79985VaH, String str, boolean z) {
        C47164IfA videoModel;
        C47160If6 LIZ;
        YS5 ys5 = this.videoPrepareManager;
        YS7 ys7 = (YS7) ((HashMap) ys5.LIZ).get(c79985VaH);
        if (ys7 != null) {
            if (z && !ys7.isCurrentAutoQuality()) {
                ys5.LIZJ(c79985VaH);
                return;
            }
            if (ys5.LJI == null || (videoModel = ys7.getVideoModel()) == null || (LIZ = ys5.LIZ(ys7.getVideoStateInquirer(), videoModel, c79985VaH)) == null || TextUtils.isEmpty(LIZ.LIZIZ(32)) || LIZ.LIZIZ(32).equals(ys7.getCurrentQualityDesc())) {
                return;
            }
            ys5.LIZJ(c79985VaH);
        }
    }

    public void getVideoFrameMax(YT9 yt9, int i, int i2, boolean z) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 != null) {
            if (i <= 0 || i2 <= 0) {
                ys3.LJIIJ(yt9);
                return;
            }
            YSF ysf = ys3.LJLJI;
            if (ysf != null) {
                int width = ysf.getWidth();
                int height = ys3.LJLJI.getHeight();
                if (height == 0 || !z) {
                    ys3.LJIIJJI(yt9, i, i2);
                    return;
                }
                float f = width / height;
                int i3 = (int) (i2 * f);
                if (i3 <= i) {
                    ys3.LJIIJJI(yt9, i3, i2);
                    return;
                } else {
                    ys3.LJIIJJI(yt9, i, (int) (i / f));
                    return;
                }
            }
            yt9.LIZ();
            return;
        }
        yt9.LIZ();
    }

    @Override // X.YS8, X.InterfaceC87409YSf
    public void onBarrageMaskCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, String str) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onBarrageMaskCallback(interfaceC48221IwD, c79985VaH, i, str);
        }
    }

    @Override // X.YS8, X.InterfaceC87409YSf
    public void onExternalSubtitlesCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, String str) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onExternalSubtitlesCallback(interfaceC48221IwD, c79985VaH, i, str);
        }
    }

    @Override // X.YS8, X.InterfaceC87409YSf
    public void onExternalSubtitlesPathInfoCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, String str, C47789IpF c47789IpF) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onExternalSubtitlesPathInfoCallback(interfaceC48221IwD, c79985VaH, str, c47789IpF);
        }
    }

    @Override // X.YNT
    public void onFullScreen(boolean z, int i, boolean z2, boolean z3) {
        Object obj;
        YS4 ys4;
        Object obj2;
        if (this.layerHostMediaLayout == null) {
            return;
        }
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("OnFullScreen", YDG.ENTER_FULLSCREEN, 6);
        if (LIZIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("full:");
            LIZ.append(z);
            LIZ.append(" targetOrientation:");
            LIZ.append(i);
            LIZ.append(" gravity:");
            LIZ.append(z2);
            LIZIZ.LIZ("info", X1D.LIZIZ(LIZ));
            EnumC48216Iw8.INS.addTrace(getPlayEntity(), LIZIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onFullScreen ");
        LIZ2.append(z);
        LIZ2.append(" gravity:");
        LIZ2.append(z2);
        X1D.LIZIZ(LIZ2);
        int portraitAnimationInterval = getPortraitAnimationInterval();
        if (z) {
            ViewParent parent = this.layerHostMediaLayout.getParent();
            if ((parent instanceof YS4) && ((ys4 = this.simpleMediaView) == null || parent != ys4)) {
                this.simpleMediaView = (YS4) parent;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onFullScreen SimpleMediaView hash:");
                YS4 ys42 = this.simpleMediaView;
                if (ys42 != null) {
                    obj2 = Integer.valueOf(ys42.hashCode());
                } else {
                    obj2 = "null simpleMediaView";
                }
                LIZ3.append(obj2);
                X1D.LIZIZ(LIZ3);
            }
            getFullScreenRoot(this.context);
            addFullScreenRootToTop();
            setWindowCallbackWrapper();
            if (isPortraitAnimationEnable() && portraitAnimationInterval > 0 && i == 1) {
                this.halfScreenWidth = this.layerHostMediaLayout.getWidth();
                this.halfScreenHeight = this.layerHostMediaLayout.getHeight();
                this.layerHostMediaLayout.getLocationOnScreen(this.location);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onFullScreen startBounds:");
                LIZ4.append(this.location);
                X1D.LIZIZ(LIZ4);
                YS4 ys43 = this.simpleMediaView;
                if (ys43 != null) {
                    ys43.LIZJ();
                    addOrientationDetectionViewIfNull();
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.halfScreenWidth, this.halfScreenHeight);
                marginLayoutParams.topMargin = this.location[1];
                this.fullScreenRoot.addView(this.layerHostMediaLayout, marginLayoutParams);
                ensureScreenParams();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.fullscreenAnimator = ofFloat;
                ofFloat.addUpdateListener(new AUListenerS102S0100000_15(this, 14));
                this.fullscreenAnimator.addListener(new ALAdapterS12S0100000_15(this, 12));
                this.fullscreenAnimator.setDuration(portraitAnimationInterval);
                this.playSettings.getClass();
                this.fullscreenAnimator.start();
            } else {
                if (this.simpleMediaView != null) {
                    cleanSurfaceOnDetachIfUseSurfaceView(this.layerHostMediaLayout);
                    this.simpleMediaView.LIZJ();
                    addOrientationDetectionViewIfNull();
                }
                cleanSurfaceOnDetachIfUseSurfaceView(this.layerHostMediaLayout);
                detachFromParent(this.layerHostMediaLayout);
                this.fullScreenRoot.addView(this.layerHostMediaLayout, new ViewGroup.LayoutParams(-1, -1));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("fullScreenRoot addView:");
                LIZ5.append(this.fullScreenRoot);
                X1D.LIZIZ(LIZ5);
            }
        } else {
            resetWindowCallback();
            ensureScreenParams();
            if (this.fullScreenOperator.isPortraitAnimationEnable() && portraitAnimationInterval > 0 && (this.fullScreenOperator.isPortrait() || this.enablePortraitFullScreen)) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.fullscreenAnimator = ofFloat2;
                ofFloat2.addUpdateListener(new AUListenerS102S0100000_15(this, 15));
                this.fullscreenAnimator.addListener(new ALAdapterS12S0100000_15(this, 13));
                this.fullscreenAnimator.setDuration(portraitAnimationInterval);
                this.playSettings.getClass();
                this.fullscreenAnimator.start();
            } else {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("detachFromParent fullscreen: false, parent:");
                YS3 ys3 = this.layerHostMediaLayout;
                if (ys3 != null) {
                    obj = ys3.getParent();
                } else {
                    obj = "null";
                }
                LIZ6.append(obj);
                X1D.LIZIZ(LIZ6);
                cleanSurfaceOnDetachIfUseSurfaceView(this.layerHostMediaLayout);
                detachFromParent(this.layerHostMediaLayout);
                YS4 ys44 = this.simpleMediaView;
                if (ys44 != null) {
                    ys44.LIZ(this.layerHostMediaLayout);
                }
                this.fullScreenOperator.setVideoScreenState(0);
                this.fullScreenOperator.resetLayoutInDisplayCutoutMode();
            }
        }
        this.fullscreenFinishedTimeStamp = System.currentTimeMillis();
        YS3 ys32 = this.layerHostMediaLayout;
        this.fullScreenOperator.isPortrait();
        ys32.LLIIIILZ.LJ(new C87426YSw());
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFullScreen(this.layerHostMediaLayout.getVideoStateInquirer(), this.layerHostMediaLayout.getPlayEntity(), z, i, z2, z3);
        }
        Iterator<Map.Entry<Lifecycle, LifeCycleObserver>> it2 = this.lifeCycleVideoHandlerMap.entrySet().iterator();
        while (it2.hasNext()) {
            LifeCycleObserver value = it2.next().getValue();
            if (value != null) {
                value.onFullScreen(z, i, z2);
            }
        }
    }

    @Override // X.YNT
    public void onPreFullScreen(boolean z, int i, boolean z2, boolean z3) {
        YS3 ys3 = this.layerHostMediaLayout;
        if (ys3 == null) {
            return;
        }
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreFullScreen(ys3.getVideoStateInquirer(), ys3.getPlayEntity(), this, z, i, z2, z3);
        }
    }

    @Override // X.YS8, X.YS9
    public void onProgressUpdate(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, int i2) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onProgressUpdate(interfaceC48221IwD, c79985VaH, i, i2);
        }
    }

    @Override // X.YS8, X.YS9
    public void onResolutionChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, EnumC47176IfM enumC47176IfM, boolean z) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onResolutionChanged(interfaceC48221IwD, c79985VaH, enumC47176IfM, z);
        }
    }

    @Override // X.YS8, X.InterfaceC87409YSf
    public void onSubSwitchCompletedCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, int i2) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onSubSwitchCompletedCallback(interfaceC48221IwD, c79985VaH, i, i2);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoSizeChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, int i2) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(interfaceC48221IwD, c79985VaH, i, i2);
        }
    }

    @Override // X.YS8, X.YS9
    public void onVideoStreamBitrateChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, EnumC47176IfM enumC47176IfM, int i) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoStreamBitrateChanged(interfaceC48221IwD, c79985VaH, enumC47176IfM, i);
        }
    }

    @Override // X.YS8, X.YS9
    public void onResolutionChangedByQuality(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, String str, boolean z, boolean z2) {
        Iterator<InterfaceC87404YSa> it = this.videoPlayListeners.iterator();
        while (it.hasNext()) {
            it.next().onResolutionChangedByQuality(interfaceC48221IwD, c79985VaH, str, z, z2);
        }
    }
}
