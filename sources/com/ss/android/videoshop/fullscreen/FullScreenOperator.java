package com.ss.android.videoshop.fullscreen;

import X.C07670Rv;
import X.C16880lQ;
import X.C283719l;
import X.C48217Iw9;
import X.C48671J8h;
import X.C48672J8i;
import X.C78857UxB;
import X.C79994VaQ;
import X.C79995VaR;
import X.C81166VtK;
import X.EnumC48216Iw8;
import X.InterfaceC78864UxI;
import X.VIF;
import X.VKD;
import X.VKE;
import X.VKF;
import X.X1D;
import X.YDG;
import X.YNT;
import X.YS3;
import Y.ARunnableS3S0220000_15;
import Y.ARunnableS51S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Message;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.videoshop.context.VideoContext;

/* loaded from: classes16.dex */
public class FullScreenOperator implements WeakHandler.IHandler, VKF {
    public static boolean sFullScreenOrientation = true;
    public boolean banMultiRotate;
    public boolean byBack;
    public boolean byGravity;
    public Context context;
    public boolean fixedOrientation;
    public YNT fullScreenListener;
    public int halfScreenUiFlags;
    public boolean hasFullFlag;
    public C79994VaQ playSettings;
    public boolean portrait;
    public boolean rotateToFullScreenEnable;
    public VKE screenOrientationHelper;
    public boolean transferByMsg;
    public VideoContext videoContext;
    public final int MSG_VIDEO_SENSOR_ROTATE_FIXED = 1;
    public final int MSG_VIDEO_ENTERING_FULLSCREEN = 2;
    public final int MSG_VIDEO_EXITING_FULLSCREEN = 3;
    public WeakHandler handler = new WeakHandler(this);
    public int videoScreenState = 0;
    public int configurationOrientation = -1;
    public int actOrientation = -1;
    public int targetOrientation = -1;
    public int halfScreenLayoutInDisplayCutoutMode = 0;
    public int fullScreenMsgInterval = 200;
    public boolean autoChangeOrientation = true;
    public boolean autoUpdateUiFlags = true;
    public boolean trackOrientationForce = false;
    public boolean changeLayoutInDisplayCutoutMode = false;
    public int currentOrientation = -1;
    public InterfaceC78864UxI screenOrientationChangeListener = new C78857UxB();

    public void exitFullScreen() {
        exitFullScreen(false, false);
    }

    public boolean isPortraitAnimationEnable() {
        return false;
    }

    private void exitingFullScreen() {
        YNT ynt = this.fullScreenListener;
        if (ynt != null) {
            ynt.onFullScreen(false, this.targetOrientation, this.byGravity, this.byBack);
        }
    }

    private boolean isFixedOrientation() {
        Activity LIZ = C48672J8i.LIZ(this.context);
        if (LIZ != null) {
            try {
                ActivityInfo activityInfo = LIZ.getPackageManager().getActivityInfo(LIZ.getComponentName(), 0);
                if (activityInfo != null) {
                    int i = activityInfo.screenOrientation;
                    this.actOrientation = i;
                    if (C48671J8h.LJ(i)) {
                        return true;
                    }
                    if (C48671J8h.LJFF(i) || i == 14) {
                        return true;
                    }
                    return false;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return true;
    }

    private boolean shouldSetLayoutInDisplayCutoutMode() {
        String str = Build.MODEL;
        if (str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.equals("SM-G9910") || str.equals("SM-G9980") || str.equals("SM-G9960")) {
            return true;
        }
        return false;
    }

    public int changeOrientationIfNeed() {
        if (!this.autoChangeOrientation) {
            return -1;
        }
        if (isFullScreen()) {
            return changeOrientationIfNeed(true);
        }
        if (!isHalfScreen()) {
            return -1;
        }
        return changeOrientationIfNeed(false);
    }

    public void enterFullScreen() {
        if (this.videoScreenState != 0) {
            return;
        }
        this.videoContext.doTransferSurfaceTaskAfterCheck(new ARunnableS51S0100000_15(this, 61));
    }

    public void enterFullScreenHideNavigation() {
        C79995VaR c79995VaR;
        Window window;
        int i = 0;
        EnumC48216Iw8.INS.addTrace(this.videoContext.getPlayEntity(), C48217Iw9.LIZIZ("EnterFullScreenHideNavigation", YDG.ENTER_FULLSCREEN, 0));
        C79994VaQ c79994VaQ = this.playSettings;
        if (c79994VaQ != null) {
            c79995VaR = c79994VaQ.LJIIJJI;
        } else {
            c79995VaR = null;
        }
        Activity LIZ = C48672J8i.LIZ(this.context);
        if (LIZ == null || (window = LIZ.getWindow()) == null) {
            return;
        }
        if (c79995VaR == null || c79995VaR.LIZ) {
            i = 514;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            return;
        }
        if (C81166VtK.LIZ(window)) {
            window.clearFlags(1024);
        }
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i2 = 5124;
        if (i != 0) {
            i2 = 5124 | i;
        }
        if (systemUiVisibility == i2) {
            return;
        }
        decorView.setSystemUiVisibility(i2);
    }

    public void exitFullScreenMode() {
        Window window;
        Activity LIZ = C48672J8i.LIZ(this.context);
        if (LIZ == null || (window = LIZ.getWindow()) == null) {
            return;
        }
        EnumC48216Iw8.INS.addTrace(this.videoContext.getPlayEntity(), C48217Iw9.LIZIZ("FOExitFullScreenMode", YDG.EXIT_FULLSCREEN, 0));
        if (!this.hasFullFlag && C81166VtK.LIZ(window)) {
            window.clearFlags(1024);
        }
        if (this.autoUpdateUiFlags) {
            window.getDecorView().setSystemUiVisibility(this.halfScreenUiFlags);
        }
    }

    public int getCurrentOrientation() {
        if (this.currentOrientation < 0 || this.configurationOrientation == 2 || this.transferByMsg) {
            this.currentOrientation = C48671J8h.LIZIZ(this.context);
        }
        return this.currentOrientation;
    }

    public boolean isEnteringFullScreen() {
        if (this.videoScreenState == 1) {
            return true;
        }
        return false;
    }

    public boolean isExitingFullScreen() {
        if (this.videoScreenState == 3) {
            return true;
        }
        return false;
    }

    public boolean isFullScreen() {
        if (this.videoScreenState == 2) {
            return true;
        }
        return false;
    }

    public boolean isFullScreening() {
        int i = this.videoScreenState;
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isHalfScreen() {
        if (this.videoScreenState == 0) {
            return true;
        }
        return false;
    }

    public void resetLayoutInDisplayCutoutMode() {
        Activity LIZ = C48672J8i.LIZ(this.context);
        if (Build.VERSION.SDK_INT >= 28 && LIZ != null && LIZ.getWindow() != null && shouldSetLayoutInDisplayCutoutMode()) {
            Window window = LIZ.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = this.halfScreenLayoutInDisplayCutoutMode;
            window.setAttributes(attributes);
        }
    }

    public void startTrackOrientation() {
        if (this.rotateToFullScreenEnable && this.fixedOrientation) {
            this.screenOrientationHelper.LIZIZ.LJIJ(this);
            this.screenOrientationHelper.LIZIZ.LJIIZILJ(this);
            VKE vke = this.screenOrientationHelper;
            if (vke.LJ) {
                return;
            }
            try {
                VKD vkd = vke.LIZJ;
                if (vkd == null) {
                    return;
                }
                vkd.enable();
                vke.LJ = true;
            } catch (IllegalStateException e) {
                Logger.throwException(e);
            }
        }
    }

    public void startTrackOrientationNow() {
        VKE vke = this.screenOrientationHelper;
        if (!vke.LJ) {
            try {
                VKD vkd = vke.LIZJ;
                if (vkd != null) {
                    vkd.enable();
                    vke.LJ = true;
                }
            } catch (IllegalStateException e) {
                Logger.throwException(e);
            }
        }
        this.trackOrientationForce = true;
    }

    public void stopTrackOrientation() {
        VKD vkd;
        if (!this.trackOrientationForce) {
            VKE vke = this.screenOrientationHelper;
            if (vke.LJ && (vkd = vke.LIZJ) != null) {
                vkd.disable();
                vke.LJ = false;
            }
        }
        this.screenOrientationHelper.LIZIZ.LJIJ(this);
    }

    public void stopTrackOrientationNow() {
        VKD vkd;
        VKE vke = this.screenOrientationHelper;
        if (vke.LJ && (vkd = vke.LIZJ) != null) {
            vkd.disable();
            vke.LJ = false;
        }
        this.trackOrientationForce = false;
    }

    public VKE getScreenOrientationHelper() {
        return this.screenOrientationHelper;
    }

    public boolean isPortrait() {
        return this.portrait;
    }

    public boolean isRotateToFullScreenEnable() {
        return this.rotateToFullScreenEnable;
    }

    public FullScreenOperator(Context context) {
        if (C48672J8i.LIZ(context) != null) {
            this.context = context;
            this.fixedOrientation = isFixedOrientation();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fixedOrientation:");
            LIZ.append(this.fixedOrientation);
            X1D.LIZIZ(LIZ);
            this.screenOrientationHelper = new VKE(context);
            return;
        }
        throw new RuntimeException("FullScreenOperator context must be activity");
    }

    private int changeOrientationIfNeed(boolean z) {
        int targetOrientation = getTargetOrientation(z);
        if (needRequestOrientation(targetOrientation)) {
            requestOrientation(targetOrientation);
        }
        return targetOrientation;
    }

    private void doSurfaceViewEnterFullscreen(boolean z) {
        this.handler.sendMessageDelayed(Message.obtain(this.handler, 2, Boolean.valueOf(z)), this.fullScreenMsgInterval);
        this.transferByMsg = false;
    }

    private void doSurfaceViewExitFullscreen(Runnable runnable) {
        this.handler.post(runnable);
    }

    private void doTextureViewEnterFullscreen(boolean z) {
        enteringFullScreen(z);
    }

    private void doTextureViewExitFullscreen(Runnable runnable) {
        runnable.run();
    }

    private void enteringFullScreen(boolean z) {
        EnumC48216Iw8.INS.addTrace(this.videoContext.getPlayEntity(), C48217Iw9.LIZIZ("FOEnteringFullScreen", YDG.ENTER_FULLSCREEN, 0));
        if (this.changeLayoutInDisplayCutoutMode) {
            VIF.LIZ().post(new ARunnableS51S0100000_15(this, 62));
        } else {
            enterFullScreenHideNavigation();
        }
        YNT ynt = this.fullScreenListener;
        if (ynt != null) {
            ynt.onFullScreen(true, this.targetOrientation, z, false);
        }
        this.videoContext.dismissSurfaceCoverFrameIfUseSurfaceView(true);
    }

    private int getTargetOrientation(boolean z) {
        int i;
        int requestedOrientation;
        int i2;
        if (z) {
            if (this.videoContext.isEnablePortraitFullScreen()) {
                VKD vkd = this.screenOrientationHelper.LIZJ;
                if (vkd == null || (i2 = vkd.LIZ) == -1) {
                    int i3 = this.actOrientation;
                    if (i3 == 8 || i3 == 0) {
                        return i3;
                    }
                } else if (i2 == 8 || i2 == 0) {
                    return i2;
                }
                return this.actOrientation;
            }
            if (this.portrait) {
                if (C48671J8h.LJFF(this.actOrientation) || !C48671J8h.LJ(this.actOrientation)) {
                    return 1;
                }
                return this.actOrientation;
            }
            VKD vkd2 = this.screenOrientationHelper.LIZJ;
            if (vkd2 == null || (i = vkd2.LIZ) == -1) {
                int i4 = this.actOrientation;
                if (i4 == 8 || i4 == 0) {
                    return i4;
                }
            } else if (i == 9) {
                Activity LIZ = C48672J8i.LIZ(this.context);
                if (LIZ != null && ((requestedOrientation = LIZ.getRequestedOrientation()) == 8 || requestedOrientation == 0)) {
                    return requestedOrientation;
                }
            } else if (8 == i) {
                return 8;
            }
            return 0;
        }
        if (this.videoContext.isEnablePortraitFullScreen()) {
            return this.actOrientation;
        }
        if (C48671J8h.LJFF(this.actOrientation) || !C48671J8h.LJ(this.actOrientation)) {
            return 1;
        }
        return this.actOrientation;
    }

    private boolean needRequestOrientation(int i) {
        int currentOrientation;
        if (sFullScreenOrientation) {
            currentOrientation = C48671J8h.LIZIZ(this.context);
        } else {
            currentOrientation = getCurrentOrientation();
        }
        if (i != -1 && i != currentOrientation) {
            return true;
        }
        return false;
    }

    private void requestOrientation(int i) {
        this.banMultiRotate = true;
        this.handler.postDelayed(new ARunnableS51S0100000_15(this, 63), 300L);
        try {
            C48672J8i.LIZ(this.context).setRequestedOrientation(i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("requestOrientation orientation:");
            LIZ.append(C283719l.LIZ(i));
            X1D.LIZIZ(LIZ);
            YDG ydg = YDG.ENTER_FULLSCREEN;
            if (isExitingFullScreen()) {
                ydg = YDG.EXIT_FULLSCREEN;
            }
            C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("FORequestOrientation", ydg, 6);
            if (LIZIZ != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append(i);
                LIZIZ.LIZ("orientation", X1D.LIZIZ(LIZ2));
                EnumC48216Iw8.INS.addTrace(this.videoContext.getPlayEntity(), LIZIZ);
            }
        } catch (Throwable unused) {
        }
    }

    public void addOnScreenOrientationChangedListener(VKF vkf) {
        VKE vke = this.screenOrientationHelper;
        if (vkf != null) {
            vke.LIZIZ.LJIIZILJ(vkf);
        } else {
            vke.getClass();
        }
    }

    public void dispatchScreenOrientationChange(int i) {
        dispatchScreenOrientationChangeDelayed(i, 0L);
    }

    public void enterFullScreen(boolean z) {
        int i;
        Window window;
        View decorView;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enterfullscreen videoScreenState:");
        LIZ.append(this.videoScreenState);
        X1D.LIZIZ(LIZ);
        if (this.videoScreenState != 0) {
            return;
        }
        EnumC48216Iw8.INS.addTrace(this.videoContext.getPlayEntity(), C48217Iw9.LIZIZ("FOEnterFullScreen", YDG.ENTER_FULLSCREEN, 6));
        this.videoScreenState = 1;
        Activity LIZ2 = C48672J8i.LIZ(this.context);
        if (LIZ2 != null) {
            this.hasFullFlag = C81166VtK.LIZ(LIZ2.getWindow());
            if (Build.VERSION.SDK_INT >= 28 && LIZ2.getWindow() != null && shouldSetLayoutInDisplayCutoutMode()) {
                Window window2 = LIZ2.getWindow();
                WindowManager.LayoutParams attributes = window2.getAttributes();
                this.halfScreenLayoutInDisplayCutoutMode = attributes.layoutInDisplayCutoutMode;
                attributes.layoutInDisplayCutoutMode = 1;
                window2.setAttributes(attributes);
                this.changeLayoutInDisplayCutoutMode = true;
            } else {
                this.changeLayoutInDisplayCutoutMode = false;
            }
        } else {
            this.hasFullFlag = false;
        }
        Activity LIZ3 = C48672J8i.LIZ(this.context);
        if (LIZ3 != null && (window = LIZ3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            i = decorView.getSystemUiVisibility();
        } else {
            i = -1;
        }
        this.halfScreenUiFlags = i;
        this.byGravity = z;
        this.byBack = false;
        int targetOrientation = getTargetOrientation(true);
        this.targetOrientation = targetOrientation;
        YNT ynt = this.fullScreenListener;
        if (ynt != null) {
            ynt.onPreFullScreen(true, targetOrientation, z, false);
        }
        if (needRequestOrientation(this.targetOrientation)) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("enterfullscreen needRequestOrientation targetOrientation:");
            LIZ4.append(C283719l.LIZ(this.targetOrientation));
            LIZ4.append(" halfScreenUiFlags:");
            LIZ4.append(this.halfScreenUiFlags);
            X1D.LIZIZ(LIZ4);
            requestOrientation(this.targetOrientation);
            this.handler.sendMessageDelayed(Message.obtain(this.handler, 2, Boolean.valueOf(z)), this.fullScreenMsgInterval);
            this.transferByMsg = false;
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("enterfullscreen do not needRequestOrientation targetOrientation:");
        LIZ5.append(C283719l.LIZ(this.targetOrientation));
        LIZ5.append(" halfScreenUiFlags:");
        LIZ5.append(this.halfScreenUiFlags);
        X1D.LIZIZ(LIZ5);
        YS3 layerHostMediaLayout = this.videoContext.getLayerHostMediaLayout();
        if (layerHostMediaLayout != null && layerHostMediaLayout.LJIILLIIL() && layerHostMediaLayout.LJIILJJIL()) {
            doSurfaceViewEnterFullscreen(z);
            return;
        }
        enteringFullScreen(z);
        if (isPortraitAnimationEnable()) {
            return;
        }
        this.videoScreenState = 2;
    }

    public void exitFullScreen(boolean z) {
        exitFullScreen(false, z);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2 || this.videoScreenState != 1) {
                return;
            }
            enteringFullScreen(((Boolean) message.obj).booleanValue());
            this.videoScreenState = 2;
            this.transferByMsg = true;
            return;
        }
        int i2 = message.arg1;
        if (!isRotateToFullScreenEnable() || i2 == getCurrentOrientation() || i2 == -1 || i2 == 9) {
            YNT ynt = this.fullScreenListener;
            if (ynt == null) {
                return;
            }
            ynt.handleOtherSensorRotateAnyway(this.rotateToFullScreenEnable, i2);
            return;
        }
        if (i2 == 1 && (!this.videoContext.isEnablePortraitFullScreen() || (this.videoContext.isEnablePortraitFullScreen() && this.byGravity))) {
            if (!isFullScreen()) {
                return;
            }
            YNT ynt2 = this.fullScreenListener;
            if ((ynt2 != null && ynt2.onInterceptFullScreen(false, i2, true)) || this.portrait) {
                return;
            }
            exitFullScreen(true, false);
            return;
        }
        if (isFullScreen()) {
            if (needRequestOrientation(i2)) {
                requestOrientation(i2);
            }
            enterFullScreenHideNavigation();
        } else {
            YNT ynt3 = this.fullScreenListener;
            if ((ynt3 != null && ynt3.onInterceptFullScreen(true, i2, true)) || this.portrait) {
                return;
            }
            this.videoContext.doTransferSurfaceTaskAfterCheck(new ARunnableS51S0100000_15(this, 60));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConfigurationChanged newConfig.orientation:");
        LIZ.append(configuration.orientation);
        X1D.LIZIZ(LIZ);
        YDG ydg = YDG.ENTER_FULLSCREEN;
        if (isExitingFullScreen()) {
            ydg = YDG.EXIT_FULLSCREEN;
        }
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("FOOnConfigurationChanged", ydg, 6);
        if (LIZIZ != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" ");
            LIZ2.append(configuration.orientation);
            LIZIZ.LIZ("orientation", X1D.LIZIZ(LIZ2));
            EnumC48216Iw8.INS.addTrace(this.videoContext.getPlayEntity(), LIZIZ);
        }
        int i = this.configurationOrientation;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.configurationOrientation = i2;
            Activity LIZ3 = C48672J8i.LIZ(this.context);
            if (LIZ3 != null) {
                int requestedOrientation = LIZ3.getRequestedOrientation();
                int i3 = this.configurationOrientation;
                if (i3 == 1) {
                    if (requestedOrientation == 1) {
                        this.currentOrientation = requestedOrientation;
                    } else {
                        this.currentOrientation = -1;
                    }
                } else if (i3 == 2) {
                    if (requestedOrientation == 0 || requestedOrientation == 8) {
                        this.currentOrientation = requestedOrientation;
                    } else {
                        this.currentOrientation = -1;
                    }
                } else {
                    this.currentOrientation = -1;
                }
            }
            if (this.fixedOrientation && this.videoScreenState == 1) {
                this.handler.removeMessages(2);
                enteringFullScreen(this.byGravity);
                this.videoScreenState = 2;
            }
            this.transferByMsg = false;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("onConfigurationChanged currentOrientation:");
            LIZ4.append(this.currentOrientation);
            X1D.LIZIZ(LIZ4);
        }
    }

    @Override // X.VKF
    public void onScreenOrientationChanged(int i) {
        InterfaceC78864UxI interfaceC78864UxI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScreenOrientationChanged orientation:");
        LIZ.append(C283719l.LIZ(i));
        X1D.LIZIZ(LIZ);
        if (!isRotateToFullScreenEnable() || this.banMultiRotate || (interfaceC78864UxI = this.screenOrientationChangeListener) == null) {
            return;
        }
        getCurrentOrientation();
        VKE vke = this.screenOrientationHelper;
        boolean z = true;
        if (vke != null) {
            vke.getClass();
            try {
                if (Settings.System.getInt(vke.LIZLLL.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                }
            } catch (Exception unused) {
            }
            z = false;
        }
        interfaceC78864UxI.getClass();
        if (isPortrait() || !z) {
            return;
        }
        dispatchScreenOrientationChangeDelayed(i, 300L);
    }

    public void removeOnScreenOrientationChangedListener(VKF vkf) {
        VKE vke = this.screenOrientationHelper;
        if (vkf != null) {
            vke.LIZIZ.LJIJ(vkf);
        } else {
            vke.getClass();
        }
    }

    public void setCanAutoUpdateUiFlags(boolean z) {
        this.autoUpdateUiFlags = z;
    }

    public void setCanChangeOrientation(boolean z) {
        this.autoChangeOrientation = z;
    }

    public void setFullScreenListener(YNT ynt) {
        this.fullScreenListener = ynt;
    }

    public void setFullScreenMsgInterval(int i) {
        this.fullScreenMsgInterval = i;
    }

    public void setOrientationMaxOffsetDegree(int i) {
        this.screenOrientationHelper.LIZ = i;
    }

    public void setPlaySettings(C79994VaQ c79994VaQ) {
        this.playSettings = c79994VaQ;
    }

    public void setPortrait(boolean z) {
        this.portrait = z;
    }

    public void setRotateEnabled(boolean z) {
        this.rotateToFullScreenEnable = z;
        C07670Rv.LIZLLL("setRotateEnabled enabled:", z);
        if (!z) {
            WeakHandler weakHandler = this.handler;
            if (weakHandler != null) {
                weakHandler.removeMessages(1);
            }
            stopTrackOrientation();
            return;
        }
        startTrackOrientation();
    }

    public void setScreenOrientation(int i) {
        boolean z;
        this.actOrientation = i;
        if (C48671J8h.LJ(i) || C48671J8h.LJFF(i) || i == 14) {
            z = true;
        } else {
            z = false;
        }
        this.fixedOrientation = z;
    }

    public void setScreenOrientationChangeListener(InterfaceC78864UxI interfaceC78864UxI) {
        this.screenOrientationChangeListener = interfaceC78864UxI;
    }

    public void setVideoContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

    public void setVideoScreenState(int i) {
        this.videoScreenState = i;
    }

    private void exitFullScreen(boolean z, boolean z2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("exitfullscreen videoScreenState:");
        LIZ.append(this.videoScreenState);
        X1D.LIZIZ(LIZ);
        if (this.videoScreenState != 2) {
            return;
        }
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("FOExitFullScreen", YDG.EXIT_FULLSCREEN, 6);
        EnumC48216Iw8.INS.addTrace(this.videoContext.getPlayEntity(), LIZIZ);
        this.videoScreenState = 3;
        int targetOrientation = getTargetOrientation(false);
        this.targetOrientation = targetOrientation;
        this.byGravity = z;
        this.byBack = z2;
        YNT ynt = this.fullScreenListener;
        if (ynt != null) {
            ynt.onPreFullScreen(false, targetOrientation, z, z2);
        }
        requestOrientation(this.targetOrientation);
        ARunnableS3S0220000_15 aRunnableS3S0220000_15 = new ARunnableS3S0220000_15(LIZIZ, z, this, z2, 0);
        YS3 layerHostMediaLayout = this.videoContext.getLayerHostMediaLayout();
        if (layerHostMediaLayout != null && layerHostMediaLayout.LJIILLIIL()) {
            doSurfaceViewExitFullscreen(aRunnableS3S0220000_15);
        } else {
            doTextureViewExitFullscreen(aRunnableS3S0220000_15);
        }
    }

    public void dispatchScreenOrientationChangeDelayed(int i, long j) {
        this.handler.removeMessages(1);
        WeakHandler weakHandler = this.handler;
        weakHandler.sendMessageDelayed(Message.obtain(weakHandler, 1, i, 0), j);
    }
}
