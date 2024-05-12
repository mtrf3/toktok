package X;

import Y.ARunnableS10S0200100_14;
import Y.ARunnableS10S0210000_11;
import Y.ARunnableS13S0210000_14;
import Y.ARunnableS14S0210000_15;
import Y.ARunnableS17S0201000_14;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS1S0200001_11;
import Y.ARunnableS1S0400100_11;
import Y.ARunnableS22S0300000_11;
import Y.ARunnableS25S0300000_14;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS34S0200000_15;
import Y.ARunnableS3S1210000_14;
import Y.ARunnableS50S0100000_14;
import Y.ARunnableS5S0102000_14;
import Y.ARunnableS5S0202000_14;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.TEFocusParameters;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.X0y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC84152X0y {
    public static final EnumC84152X0y INSTANCE;
    public static final /* synthetic */ EnumC84152X0y[] LJZI;
    public HandlerThread LJLIL;
    public float LJLJI;
    public volatile boolean LJLJJL;
    public volatile boolean LJLJJLL;
    public C84119Wzr LJLL;
    public TECameraCapture mCameraClient;
    public volatile X10 mCameraInstance;
    public C84134X0g mCameraSettings;
    public Runnable mCheckCloseTask;
    public Handler mHandler;
    public volatile boolean mIsCameraPendingClose;
    public PDF mPictureSizeCallback;
    public InterfaceC84148X0u mSATZoomCallback;
    public volatile boolean LJLILLLLZI = true;
    public YR1 mCameraObserver = new YR2();
    public P3Q mPreviewSizeCallback = null;
    public InterfaceC84050Wyk mFpsConfigCallback = null;
    public final Object mStateLock = new Object();
    public volatile int mCurrentCameraState = 0;
    public final Object LJLJJI = new Object();
    public volatile int LJLJL = 0;
    public long mOpenTime = 0;
    public long mBeginTime = 0;
    public int mRetryCnt = -1;
    public boolean mStartPreviewError = false;
    public C63915P6p LJLJLJ = null;
    public final ConditionVariable mCameraClientCondition = new ConditionVariable(true);
    public final ConcurrentHashMap<String, String> mOpenInfoMap = new ConcurrentHashMap<>();
    public Handler mMainHandler = new Handler(C16880lQ.LLJJJJ());
    public Cert cachedOpenPrivacyCert = null;
    public Cert cachedClosePrivacyCert = null;
    public boolean LJLJLLL = false;
    public boolean mFirstEC = true;
    public boolean mFirstZoom = true;
    public boolean LJLLI = false;
    public int LJLLILLLL = 0;
    public boolean mbCameraUnitFallbackToCamera2 = false;
    public int LJLLJ = -1;
    public volatile boolean LJLLL = false;
    public int LJLLLL = 0;
    public boolean mbNeedDestroy = false;
    public YQV mCameraEvent = new C84153X0z(this);
    public final C87372YQu LJLLLLLL = new C87372YQu(this);
    public final PDC LJLZ = new PDC(this);
    public final P74 LJZ = new P74(this);

    public final synchronized void LJFF() {
        this.LJLJL++;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sClientCount = ");
        LIZ.append(this.LJLJL);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
    }

    public final synchronized void LJI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init...start, mIsInitialized = ");
        LIZ.append(this.LJLJJL);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        if (this.LJLJJL) {
            return;
        }
        this.mHandler = LJ();
        this.LJLILLLLZI = false;
        this.LJLJJL = true;
        this.mbCameraUnitFallbackToCamera2 = false;
        this.LJLJI = 0.0f;
        this.LJLJLLL = false;
        this.mMainHandler = new Handler(C16880lQ.LLJJJJ());
        this.LJLL = new C84119Wzr();
        this.mbNeedDestroy = false;
    }

    public void changeCaptureFormat() {
    }

    public synchronized int decreaseClientCount() {
        this.LJLJL--;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sClientCount = ");
        LIZ.append(this.LJLJL);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        if (this.LJLJL < 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Invalid ClientCount = ");
            LIZ2.append(this.LJLJL);
            C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ2));
            this.LJLJL = 0;
        }
        return this.LJLJL;
    }

    public synchronized int destroy() {
        C63922P6w.LIZLLL("TECameraServer", "destroy...start");
        this.LJLJJL = false;
        this.mbNeedDestroy = false;
        Runnable runnable = this.mCheckCloseTask;
        if (runnable != null) {
            this.mMainHandler.removeCallbacks(runnable);
        }
        this.mCheckCloseTask = null;
        this.mCameraClient = null;
        this.mPictureSizeCallback = null;
        this.mPreviewSizeCallback = null;
        this.mFpsConfigCallback = null;
        this.cachedClosePrivacyCert = null;
        this.cachedOpenPrivacyCert = null;
        X10 x10 = this.mCameraInstance;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new ARunnableS50S0100000_14(x10, 48));
        }
        this.mCameraInstance = null;
        HandlerThread handlerThread = this.LJLIL;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.LJLIL = null;
            this.LJLILLLLZI = true;
            this.mHandler = null;
        }
        this.mCameraObserver = YR2.LIZ();
        C63922P6w.LIZLLL("TECameraServer", "destroy...end");
        return 0;
    }

    public int getCameraState() {
        return getCameraState(false);
    }

    static {
        EnumC84152X0y enumC84152X0y = new EnumC84152X0y();
        INSTANCE = enumC84152X0y;
        LJZI = new EnumC84152X0y[]{enumC84152X0y};
    }

    public EnumC84152X0y() {
        new C87377YQz();
    }

    public static EnumC84152X0y[] values() {
        return (EnumC84152X0y[]) LJZI.clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0147, code lost:
    
        if (r13 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0199, code lost:
    
        if (r9 == null) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.X10 LIZLLL() {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC84152X0y.LIZLLL():X.X10");
    }

    public final Handler LJ() {
        Looper LLJJJJ;
        try {
            HandlerThread handlerThread = this.LJLIL;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            HandlerThread handlerThread2 = new HandlerThread("TECameraServer");
            handlerThread2.start();
            handlerThread2.getLooper().setMessageLogging(new P79());
            this.LJLIL = handlerThread2;
            return new Handler(handlerThread2.getLooper(), new X11(this));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CreateHandler failed!: ");
            LIZ.append(e.toString());
            C63922P6w.LIZIZ("TECameraServer", X1D.LIZIZ(LIZ));
            if (Looper.myLooper() != null) {
                LLJJJJ = Looper.myLooper();
            } else {
                LLJJJJ = C16880lQ.LLJJJJ();
            }
            return new Handler(LLJJJJ);
        }
    }

    public int[] getCameraCaptureSize() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.LLLLZ();
    }

    public int[] getPreviewFps() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.LLLJIL();
    }

    public void handlePreviewingFallback() {
        boolean z;
        if (this.mCameraSettings.LJLILLLLZI == 1) {
            return;
        }
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 3) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.stopCapture();
                    updateCameraState(4);
                    this.mCameraInstance.LLLILZJ(this.cachedOpenPrivacyCert);
                    C63922P6w.LIZLLL("TECameraServer", "handlePreviewingFallback cameraInstance is null");
                    this.mCameraInstance = null;
                    updateCameraState(0);
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.mCameraSettings.LJLILLLLZI = 1;
            this.mCameraEvent.LJIIIIZZ(51, 0, "need recreate surfacetexture");
            INSTANCE.open(this.mCameraClient, this.mCameraSettings, this.cachedOpenPrivacyCert);
        }
    }

    public boolean isCameraPermitted() {
        boolean z;
        try {
        } catch (Exception e) {
            C63922P6w.LIZJ("TECameraUtils", "check camera permission failed!", e);
        }
        if (C04330Ez.LIZ(this.mCameraSettings.LJLIL, "android.permission.CAMERA") == 0) {
            z = true;
            C63922P6w.LJ("TECameraUtils", "isCameraPermissionGranted = " + z);
            ConcurrentHashMap<String, String> concurrentHashMap = this.mOpenInfoMap;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CamPerm-");
            LIZ.append(this.mRetryCnt);
            concurrentHashMap.put(X1D.LIZIZ(LIZ), String.valueOf(z));
            return z;
        }
        z = false;
        C63922P6w.LJ("TECameraUtils", "isCameraPermissionGranted = " + z);
        ConcurrentHashMap<String, String> concurrentHashMap2 = this.mOpenInfoMap;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CamPerm-");
        LIZ2.append(this.mRetryCnt);
        concurrentHashMap2.put(X1D.LIZIZ(LIZ2), String.valueOf(z));
        return z;
    }

    public int startRecording() {
        return this.mCameraInstance.LLJJJJ();
    }

    public int stopRecording() {
        return this.mCameraInstance.LJJJJIZL();
    }

    public boolean isCameraSwitchState() {
        return this.LJLLL;
    }

    public static EnumC84152X0y valueOf(String str) {
        return (EnumC84152X0y) V0N.LJJJ(EnumC84152X0y.class, str);
    }

    public final boolean LIZJ(TECameraCapture tECameraCapture) {
        synchronized (this.LJLJJI) {
            TECameraCapture tECameraCapture2 = this.mCameraClient;
            if (tECameraCapture2 != tECameraCapture) {
                if (tECameraCapture2 == null) {
                    C63922P6w.LJ("TECameraServer", "Internal CameraClient is null. Must call connect first!");
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Invalid CameraClient, need : ");
                    LIZ.append(this.mCameraClient);
                    C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ));
                }
                return false;
            }
            return true;
        }
    }

    public final void LJII(C84134X0g c84134X0g) {
        C84134X0g c84134X0g2 = this.mCameraSettings;
        if (c84134X0g2 != null && c84134X0g2.LJLJJI == 0 && c84134X0g.LJLJJI == 0 && c84134X0g2.LJLILLLLZI == 11) {
            int i = c84134X0g.LJLILLLLZI;
        }
    }

    public final boolean LJIIIIZZ(C84134X0g c84134X0g) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldReOpenCamera, mCameraSettings = ");
        LIZ.append(this.mCameraSettings);
        LIZ.append(", params = ");
        LIZ.append(c84134X0g);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        C84134X0g c84134X0g2 = this.mCameraSettings;
        if (c84134X0g2 == null) {
            return false;
        }
        if (c84134X0g2.LJLILLLLZI == c84134X0g.LJLILLLLZI) {
            TEFrameSizei tEFrameSizei = c84134X0g2.LJZI;
            int i = tEFrameSizei.width;
            TEFrameSizei tEFrameSizei2 = c84134X0g.LJZI;
            if (i == tEFrameSizei2.width && tEFrameSizei.height == tEFrameSizei2.height && c84134X0g2.LJLJJI == c84134X0g.LJLJJI && c84134X0g2.LLIIJLIL == c84134X0g.LLIIJLIL && c84134X0g2.LLILL == c84134X0g.LLILL && c84134X0g2.LLII == c84134X0g.LLII && c84134X0g2.LL == c84134X0g.LL && c84134X0g2.LLFII == c84134X0g.LLFII) {
                int i2 = c84134X0g2.LLIFFJFJJ;
                int i3 = c84134X0g.LLIFFJFJJ;
                if (i2 == i3) {
                    if (i3 != 2) {
                        return false;
                    }
                    VK8 vk8 = c84134X0g2.LLJL;
                    if (vk8 != null && vk8.LIZ.ordinal() == c84134X0g.LLJL.LIZ.ordinal() && this.mCameraSettings.LLJL.LIZIZ.ordinal() == c84134X0g.LLJL.LIZIZ.ordinal() && this.mCameraSettings.LLJL.LIZJ.ordinal() == c84134X0g.LLJL.LIZJ.ordinal() && this.mCameraSettings.LLJL.LIZLLL.ordinal() == c84134X0g.LLJL.LIZLLL.ordinal() && this.mCameraSettings.LLJL.LJ.ordinal() == c84134X0g.LLJL.LJ.ordinal() && this.mCameraSettings.LLJL.LJFF.ordinal() == c84134X0g.LLJL.LJFF.ordinal()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public int abortSession(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C63922P6w.LIZIZ("TECameraServer", "abortSession, mHandler is null!");
            return -112;
        }
        handler.post(new ARunnableS50S0100000_14(this, 49));
        return 0;
    }

    public void addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            C63922P6w.LIZIZ("TECameraServer", "addCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.LLLFZ(tECameraAlgorithmParam);
        }
    }

    public void appLifeCycleChanged(boolean z) {
        this.LJLJLLL = z;
    }

    public int cancelFocus(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS33S0200000_14(this, tECameraCapture, 28));
            return 0;
        }
        C63922P6w.LIZLLL("TECameraServer", "cancelFocus...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLJJL();
            }
        }
        return 0;
    }

    public int close(Cert cert) {
        return close(true, cert);
    }

    public boolean couldForwardState(int i) {
        if (i == this.mCurrentCameraState) {
            C63922P6w.LJ("TECameraServer", "No need this");
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Invalidate camera state = ");
                    LIZ.append(i);
                    C63922P6w.LIZIZ("TECameraServer", X1D.LIZIZ(LIZ));
                    return false;
                }
                if (this.mCurrentCameraState == 1) {
                    return true;
                }
                return false;
            }
            if (this.mCurrentCameraState != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("No need open camera again, state = ");
                LIZ2.append(this.mCurrentCameraState);
                C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ2));
            }
        }
        return true;
    }

    public void downExposureCompensation(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS34S0200000_15(tECameraCapture, this, 16));
            return;
        }
        C63922P6w.LIZLLL("TECameraServer", "downExposureCompensation...");
        synchronized (this.mStateLock) {
            if ((this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) || this.mCameraInstance == null) {
                YR1 yr1 = this.mCameraObserver;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Can not set ec on state : ");
                LIZ.append(this.mCurrentCameraState);
                yr1.onError(-105, X1D.LIZIZ(LIZ));
                return;
            }
            if (this.mCameraInstance.getCameraECInfo() == null) {
                this.mCameraObserver.onError(-112, "downExposureCompensation get ec info failed");
            } else {
                this.mCameraInstance.setExposureCompensation(r0.LIZIZ - 1);
            }
        }
    }

    public int enableCaf(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS33S0200000_14(this, tECameraCapture, 29));
            return 0;
        }
        C63922P6w.LIZLLL("TECameraServer", "enableCaf...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLLLILLIL();
            }
        }
        return 0;
    }

    public long getAvgExpTime(boolean z) {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.LLLLZLLIL(z);
        }
        return 0L;
    }

    public C63824P3c getCameraECInfo(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture) || this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.getCameraECInfo();
    }

    public int getCameraState(boolean z) {
        int i;
        if (z) {
            synchronized (this.mStateLock) {
                i = this.mCurrentCameraState;
            }
            return i;
        }
        return this.mCurrentCameraState;
    }

    public int getExposureCompensation(TECameraCapture tECameraCapture) {
        if (LIZJ(tECameraCapture)) {
            synchronized (this.mStateLock) {
                if ((this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) || this.mCameraInstance == null) {
                    YR1 yr1 = this.mCameraObserver;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Can not get ec on state : ");
                    LIZ.append(this.mCurrentCameraState);
                    yr1.onError(-105, X1D.LIZIZ(LIZ));
                    return -105;
                }
                return this.mCameraInstance.LLJLIL();
            }
        }
        throw new RuntimeException("Client is not connected!!!");
    }

    public int getFlashMode(TECameraCapture tECameraCapture) {
        if (this.mCameraInstance == null) {
            return -1;
        }
        return this.mCameraInstance.getFlashMode();
    }

    public int[] getPictureSize(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture) || this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.LLLZI();
    }

    public List<TEFrameSizei> getSupportedPictureSizes(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.LLLLLLL();
        } catch (Exception e) {
            C63922P6w.LJFF("TECameraServer", "getSupportedPictureSizes, exception occured.", e);
            return null;
        }
    }

    public List<TEFrameSizei> getSupportedPreviewSizes(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.LLLJ();
        } catch (Exception e) {
            C63922P6w.LJFF("TECameraServer", "getSupportedPreviewSizes, exception occured.", e);
            return null;
        }
    }

    public boolean isAutoExposureLockSupported(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if ((this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) || this.mCameraInstance == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Can not get ae lock supported on state : ");
                LIZ.append(this.mCurrentCameraState);
                C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ));
                return false;
            }
            return this.mCameraInstance.LLLLLJLJLL();
        }
    }

    public boolean isAutoFocusLockSupported(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if ((this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) || this.mCameraInstance == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Can not get ae lock supported on state : ");
                LIZ.append(this.mCurrentCameraState);
                C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ));
                return false;
            }
            return this.mCameraInstance.LLLIIII();
        }
    }

    public boolean isSupportWhileBalance(TECameraCapture tECameraCapture) {
        boolean z = false;
        if (!LIZJ(tECameraCapture)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null && this.mCameraInstance.LLLLLJIL()) {
                z = true;
            }
        }
        return z;
    }

    public boolean isSupportedExposureCompensation(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return false;
        }
        if ((this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) || this.mCameraInstance == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Can not set ec on state : ");
            LIZ.append(this.mCurrentCameraState);
            C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ));
            return false;
        }
        return this.mCameraInstance.isSupportedExposureCompensation();
    }

    public boolean isTorchSupported(TECameraCapture tECameraCapture) {
        X10 x10;
        if (!LIZJ(tECameraCapture) || (x10 = this.mCameraInstance) == null || !x10.LLJL()) {
            return false;
        }
        return true;
    }

    public void needToReleaseSurfaceTexture(boolean z) {
        if (this.mCameraInstance == null) {
            C63922P6w.LIZIZ("TECameraServer", "can not release SurfaceTexture, cameraInstance is null");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("needToReleaseSurfaceTexture, needRelease = ");
        LIZ.append(z);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        this.mCameraInstance.LLLZLZ(z);
    }

    public P6E processAlgorithm(P6E p6e) {
        if (this.mCameraInstance == null) {
            C63922P6w.LIZIZ("TECameraServer", "processAlgorithm failed mCameraInstance is null!");
            return null;
        }
        return this.mCameraInstance.LLLLII(p6e);
    }

    public int realCloseCamera(Cert cert) {
        boolean z;
        int i;
        synchronized (this.mStateLock) {
            C84134X0g c84134X0g = this.mCameraSettings;
            if (c84134X0g != null && c84134X0g.LLJJ) {
                z = true;
            } else {
                z = false;
            }
            X10 x10 = this.mCameraInstance;
            if (this.mCurrentCameraState == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("realCloseCamera, no need to close camera, state: ");
                LIZ.append(this.mCurrentCameraState);
                C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ));
                i = -423;
            } else {
                updateCameraState(4);
                if (x10 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    i = x10.LLLILZJ(cert);
                    if (i == -114) {
                        this.mbNeedDestroy = true;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("system call close() cost: ");
                    LIZ2.append(currentTimeMillis2);
                    C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ2));
                } else {
                    i = 0;
                }
                if (z && (this.mCurrentCameraState != 4 || this.mCurrentCameraState != 0)) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("realCloseCamera, state switch err, cur: ");
                    LIZ3.append(this.mCurrentCameraState);
                    C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ3));
                }
                updateCameraState(0);
            }
        }
        return i;
    }

    public void registerFpsConfigListener(InterfaceC84050Wyk interfaceC84050Wyk) {
        this.mFpsConfigCallback = interfaceC84050Wyk;
    }

    public void registerPreviewSizeListener(P3Q p3q) {
        this.mPreviewSizeCallback = p3q;
    }

    public void removeCameraAlgorithm(int i) {
        if (this.mCameraInstance == null) {
            C63922P6w.LIZIZ("TECameraServer", "removeCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.LLLZL(i);
        }
    }

    public int removeCameraProvider(TECameraCapture tECameraCapture) {
        P7J LLLLJ;
        P7K p7k;
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS34S0200000_15(tECameraCapture, this, 14));
            return 0;
        }
        C63922P6w.LIZLLL("TECameraServer", "removeCameraProvider");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null && this.mCameraInstance.LLLLJ() != null && (p7k = (LLLLJ = this.mCameraInstance.LLLLJ()).LIZ) != null) {
                p7k.LJIILL();
                LLLLJ.LIZ = null;
            }
        }
        return 0;
    }

    public void setDeviceRotation(int i) {
        if (this.mCameraInstance != null) {
            this.mCameraInstance.setDeviceRotation(i);
        }
    }

    public void setLensCallback(InterfaceC63917P6r interfaceC63917P6r) {
        if (this.mCameraInstance == null) {
            C63922P6w.LIZIZ("TECameraServer", "setLensCallback failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.LLLLIILLL(interfaceC63917P6r);
        }
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        if (this.mCameraSettings == null || this.mCameraInstance == null) {
            return;
        }
        C84134X0g c84134X0g = this.mCameraSettings;
        c84134X0g.LJLJI = tEFrameRateRange;
        c84134X0g.LLIIL = 1;
        if (c84134X0g.LLIFFJFJJ == 1) {
            c84134X0g.LLIIL = 4;
            c84134X0g.LLILLL = false;
        }
        this.mCameraInstance.LLLZZ();
    }

    public void setPreviewFpsRangeWhenRunning(TEFrameRateRange tEFrameRateRange) {
        if (this.mCameraSettings == null || this.mCameraInstance == null) {
            return;
        }
        this.mCameraSettings.LJLJI = tEFrameRateRange;
        this.mCameraInstance.LLLLIIIILLL(tEFrameRateRange);
    }

    public void setSATZoomCallback(InterfaceC84148X0u interfaceC84148X0u) {
        this.mSATZoomCallback = interfaceC84148X0u;
    }

    public int start(TECameraCapture tECameraCapture) {
        int LLJJJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CAMERA_COST start: client ");
        LIZ.append(tECameraCapture);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        C84134X0g c84134X0g = this.mCameraSettings;
        if (c84134X0g == null || c84134X0g.LJLIL == null) {
            C63922P6w.LIZIZ("TECameraServer", "mCameraSettings has some error");
            return -100;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C63922P6w.LIZIZ("TECameraServer", "start, mHandler is null!");
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new ARunnableS33S0200000_14(this, tECameraCapture, 31));
            if (this.mCameraSettings.LJLLI) {
                long currentTimeMillis = System.currentTimeMillis();
                this.mCameraClientCondition.close();
                this.mCameraClientCondition.block(2000L);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Camera start cost: ");
                LIZ2.append(currentTimeMillis2);
                LIZ2.append("ms");
                C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ2));
            }
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("start, no need to start capture, state: ");
                    LIZ3.append(this.mCurrentCameraState);
                    C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ3));
                    if (!this.LJLJJLL && !this.mStartPreviewError) {
                        return 0;
                    }
                    if (this.mCameraSettings.LLJJL && this.mCameraInstance != null && this.mCameraInstance.LLLLJ() != null) {
                        this.mCameraInstance.LLLLJ().LJ(true);
                    }
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.stopCapture();
                    }
                    updateCameraState(2);
                    this.LJLJJLL = false;
                }
                if (this.mCurrentCameraState != 2) {
                    YR1 yr1 = this.mCameraObserver;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Invalidate state: ");
                    LIZ4.append(this.mCurrentCameraState);
                    LIZ4.append(" ==> ");
                    LIZ4.append(3);
                    yr1.onError(-105, X1D.LIZIZ(LIZ4));
                    return -105;
                }
                this.mCameraObserver.onInfo(6, this.mCurrentCameraState, "Camera state: opened");
                if (this.mCameraSettings.LLJJL && this.mCameraInstance != null && this.mCameraInstance.LLLLJ() != null) {
                    this.mCameraInstance.LLLLJ().LJ(false);
                }
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LLLIL();
                }
                updateCameraState(3);
                if (this.mCameraInstance == null) {
                    LLJJJ = this.mCameraSettings.LJLILLLLZI;
                } else {
                    LLJJJ = this.mCameraInstance.LLJJJ();
                }
                C87367YQp.LIZ("te_record_camera_type", LLJJJ);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(this.mCameraSettings.LJZI.width);
                LIZ5.append("*");
                LIZ5.append(this.mCameraSettings.LJZI.height);
                C87367YQp.LIZIZ("te_preview_camera_resolution", X1D.LIZIZ(LIZ5));
                double d = this.mCameraSettings.LJLJI.max;
                if (C87367YQp.LIZ != null) {
                    C87367YQp.LIZ.perfDouble("te_record_camera_frame_rate", d);
                }
                C87367YQp.LIZ("te_record_camera_direction", this.mCameraSettings.LJLJJI);
            }
        }
        return 0;
    }

    public int stop(TECameraCapture tECameraCapture) {
        return stop(tECameraCapture, false);
    }

    public void upExposureCompensation(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS34S0200000_15(tECameraCapture, this, 15));
            return;
        }
        C63922P6w.LIZLLL("TECameraServer", "upExposureCompensation...");
        synchronized (this.mStateLock) {
            if ((this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) || this.mCameraInstance == null) {
                YR1 yr1 = this.mCameraObserver;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Can not set ec on state : ");
                LIZ.append(this.mCurrentCameraState);
                yr1.onError(-105, X1D.LIZIZ(LIZ));
                return;
            }
            C63824P3c cameraECInfo = this.mCameraInstance.getCameraECInfo();
            if (cameraECInfo == null) {
                this.mCameraObserver.onError(-112, "upExposureCompensation get ec info failed");
            } else {
                this.mCameraInstance.setExposureCompensation(cameraECInfo.LIZIZ + 1);
            }
        }
    }

    public void updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            C63922P6w.LIZIZ("TECameraServer", "updateCameraAlgorithmParam failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.LLLLZLL(tECameraAlgorithmParam);
        }
    }

    public void updateCameraState(int i) {
        if (this.mCurrentCameraState == i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("No need update state: ");
            LIZ.append(i);
            C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[updateCameraState]: ");
        LIZ2.append(this.mCurrentCameraState);
        LIZ2.append(" -> ");
        LIZ2.append(i);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ2));
        this.mCurrentCameraState = i;
    }

    public void updateTextureId(int i) {
        P7K p7k;
        if (this.mCameraInstance == null || this.mCameraInstance.LLLLJ() == null) {
            C63922P6w.LIZIZ("TECameraServer", "camInstance or providerManager is null");
            return;
        }
        C63915P6p c63915P6p = this.mCameraInstance.LLLLJ().LIZIZ;
        if (c63915P6p != null) {
            c63915P6p.LJ = i;
        }
        if (this.mCameraInstance != null && this.mCameraInstance.LLLLJ() != null && (p7k = this.mCameraInstance.LLLLJ().LIZ) != null) {
            p7k.LJJI(i);
        }
    }

    public int addCameraProvider(TECameraCapture tECameraCapture, C63915P6p c63915P6p) {
        boolean z;
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (!this.LJLILLLLZI && Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS22S0300000_11(this, tECameraCapture, c63915P6p, 5));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance == null || this.mCameraInstance.LLLLJ() == null) {
                    this.mCameraObserver.onError(-100, "Invalidate Camera Instance or no providerManager!!");
                    return -100;
                }
                C63915P6p c63915P6p2 = this.mCameraInstance.LLLLJ().LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("addCameraProvider, last ProviderSettings = ");
                LIZ.append(c63915P6p2);
                LIZ.append(", new providerSettings = ");
                LIZ.append(c63915P6p);
                C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
                if (c63915P6p2 == null || !c63915P6p2.LIZ(c63915P6p) || this.mCameraInstance.LLLLJ().LIZ == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("cameraInstance is ");
                    LIZ2.append(this.mCameraInstance);
                    C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ2));
                    this.mCameraInstance.LLLLJ().LIZ(c63915P6p, this.mCameraInstance);
                    if (this.mCameraSettings.LJLJJI != 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJLJJLL = z;
                    if (this.LJLJLJ != null && this.mCameraInstance.LLLLJ().LIZ != null) {
                        P7K p7k = this.mCameraInstance.LLLLJ().LIZ;
                        this.LJLJLJ.getClass();
                        p7k.LJIJJ(this.LJLJLJ.LJII);
                        P7K p7k2 = this.mCameraInstance.LLLLJ().LIZ;
                        C63915P6p c63915P6p3 = this.LJLJLJ;
                        p7k2.LJJ(c63915P6p3.LIZLLL, c63915P6p3.LJII);
                    }
                    this.mCameraInstance.LLLLJ().LIZIZ = new C63915P6p(c63915P6p);
                } else {
                    this.LJLJJLL = false;
                }
            }
        }
        return 0;
    }

    public int changeCurrentControlCam(TECameraCapture tECameraCapture, int i) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (!this.LJLILLLLZI && Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS17S0201000_14(i, tECameraCapture, this, 5));
            return 0;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance == null) {
                this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                return -100;
            }
            this.mCameraInstance.LLLLLZIL(i);
            return 0;
        }
    }

    public int close(boolean z, Cert cert) {
        boolean z2;
        Handler handler = this.mHandler;
        int i = 0;
        if (handler == null) {
            this.LJLLJ = -1;
            updateCameraState(4);
            if (this.mCameraInstance != null) {
                C63922P6w.LIZIZ("TECameraServer", "call camera close process, handler is null");
                this.mCameraInstance.LLLII(this.cachedClosePrivacyCert);
                this.mCameraInstance.destroy();
                this.mCameraInstance = null;
                C63922P6w.LJ("TECameraServer", "call camera close process, handler is null, force close done");
            }
            updateCameraState(0);
            return -112;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("call camera close process...sync: ");
        LIZ.append(z);
        LIZ.append(", handler: ");
        LIZ.append(handler);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        if (!this.LJLILLLLZI && Looper.myLooper() != handler.getLooper()) {
            int hashCode = handler.hashCode();
            int i2 = this.LJLLJ;
            if (i2 != -1 && i2 != hashCode) {
                this.LJLLJ = -1;
                C63922P6w.LIZIZ("TECameraServer", "camera close task discard...handler id has changed");
                return 0;
            }
            this.LJLLJ = hashCode;
            long currentTimeMillis = System.currentTimeMillis();
            if (z) {
                this.mCameraClientCondition.block(2000L);
                this.mCameraClientCondition.close();
            }
            this.mIsCameraPendingClose = true;
            int[] iArr = new int[1];
            handler.post(new P76(this, currentTimeMillis, iArr, z, cert));
            if (z) {
                boolean z3 = !this.mCameraClientCondition.block(1500L);
                this.mIsCameraPendingClose = false;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (z3) {
                    this.LJLLJ = -1;
                    C84134X0g c84134X0g = this.mCameraSettings;
                    if (c84134X0g != null && c84134X0g.LLJJ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Camera close timeout, mCurrentCameraState ");
                    LIZ2.append(this.mCurrentCameraState);
                    LIZ2.append(", opt: ");
                    LIZ2.append(z2);
                    C63922P6w.LIZIZ("TECameraServer", X1D.LIZIZ(LIZ2));
                    if (this.mCurrentCameraState != 4 || !z2) {
                        updateCameraState(4);
                        if (this.mCameraInstance != null) {
                            this.mCameraInstance.LLLII(this.cachedClosePrivacyCert);
                        }
                    }
                    updateCameraState(0);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Camera close cost: ");
                    LIZ3.append(currentTimeMillis2);
                    LIZ3.append("ms");
                    C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ3));
                }
                return iArr[0];
            }
        } else {
            this.LJLLJ = -1;
            if (this.LJLLI) {
                this.LJLL.LIZ(new X04(EnumC79412VEq.BOOST_CPU, this.LJLLILLLL));
                i = realCloseCamera(cert);
                this.LJLL.LIZ(new X04(EnumC79412VEq.RESTORE_CPU));
            } else {
                i = realCloseCamera(cert);
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("close: remove mCheckCloseTask Callbacks, ");
            LIZ4.append(this.mCheckCloseTask);
            C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ4));
            this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
            if (!z && i != -114 && decreaseClientCount() == 0) {
                return destroy();
            }
        }
        return i;
    }

    public int disConnect(TECameraCapture tECameraCapture, Cert cert) {
        return disConnect(tECameraCapture, true, cert);
    }

    public int enableMulticamZoom(TECameraCapture tECameraCapture, boolean z) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS14S0210000_15(this, tECameraCapture, z, 0));
            return 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableMulticamZoom: ");
        LIZ.append(z);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLJL(z);
            }
        }
        return 0;
    }

    public int focusAtPoint(TECameraCapture tECameraCapture, C84151X0x c84151X0x) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS25S0300000_14(this, tECameraCapture, c84151X0x, 5));
            return 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("focusAtPoint at: ");
        LIZ.append(c84151X0x);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState != 3) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Can not set focus on state : ");
                LIZ2.append(this.mCurrentCameraState);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                C63922P6w.LJ("TECameraServer", LIZIZ);
                this.mCameraObserver.onError(-105, LIZIZ);
                return -105;
            }
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLFF(c84151X0x);
            }
            return 0;
        }
    }

    public float[] getApertureRange(TECameraCapture tECameraCapture, InterfaceC84144X0q interfaceC84144X0q) {
        float[] fArr = {0.0f};
        if (!LIZJ(tECameraCapture)) {
            return new float[]{-1.0f, -1.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS33S0200000_14(this, tECameraCapture, 27));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    fArr = this.mCameraInstance.LLLZLL();
                }
            }
        }
        return fArr;
    }

    public JSONObject getCameraCapbilitiesForBytebench(TECameraCapture tECameraCapture, InterfaceC84145X0r interfaceC84145X0r) {
        JSONObject jSONObject = new JSONObject();
        if (!LIZJ(tECameraCapture)) {
            return null;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS25S0300000_14(this, tECameraCapture, interfaceC84145X0r, 8));
        } else {
            C63922P6w.LIZLLL("TECameraServer", "getCameraCapbilitiesForBytebench");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    jSONObject = this.mCameraInstance.LLLLIILL();
                }
            }
        }
        return jSONObject;
    }

    public float[] getFOV(TECameraCapture tECameraCapture, InterfaceC84019WyF interfaceC84019WyF) {
        float[] fArr = new float[2];
        if (!LIZJ(tECameraCapture)) {
            return new float[]{-2.0f, -2.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS25S0300000_14(this, tECameraCapture, interfaceC84019WyF, 4));
        } else {
            C63922P6w.LIZLLL("TECameraServer", "getFOV");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3 || this.mCameraInstance == null) {
                    YR1 yr1 = this.mCameraObserver;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Can not getFOV on state : ");
                    LIZ.append(this.mCurrentCameraState);
                    yr1.onError(-105, X1D.LIZIZ(LIZ));
                    return new float[]{-2.0f, -2.0f};
                }
                fArr = this.mCameraInstance.LLLLLLLZIL();
            }
        }
        return fArr;
    }

    public int getISO(TECameraCapture tECameraCapture, P3H p3h) {
        int i = -1;
        if (!LIZJ(tECameraCapture)) {
            return -1;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS22S0300000_11(this, tECameraCapture, p3h, 2));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    i = this.mCameraInstance.LLLLLLLLL();
                }
            }
        }
        return i;
    }

    public int[] getISORange(TECameraCapture tECameraCapture, InterfaceC63852P4e interfaceC63852P4e) {
        int[] iArr = new int[2];
        if (!LIZJ(tECameraCapture)) {
            return new int[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS22S0300000_11(this, tECameraCapture, interfaceC63852P4e, 1));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    iArr = this.mCameraInstance.LLZIL();
                }
            }
        }
        return iArr;
    }

    public float getManualFocusAbility(TECameraCapture tECameraCapture, InterfaceC84147X0t interfaceC84147X0t) {
        float f = -1.0f;
        if (!LIZJ(tECameraCapture)) {
            return -1.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS33S0200000_14(this, tECameraCapture, 30));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    f = this.mCameraInstance.LLLLILI();
                }
            }
        }
        return f;
    }

    public long[] getShutterTimeRange(TECameraCapture tECameraCapture, InterfaceC84150X0w interfaceC84150X0w) {
        long[] jArr = new long[2];
        if (!LIZJ(tECameraCapture)) {
            return new long[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS33S0200000_14(this, tECameraCapture, 25));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    jArr = this.mCameraInstance.LLLLLLLLLL();
                }
            }
        }
        return jArr;
    }

    public void notifyHostForegroundVisible(TECameraCapture tECameraCapture, boolean z) {
        if (LIZJ(tECameraCapture)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("is foreground visible: ");
            LIZ.append(z);
            C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        }
    }

    public int process(TECameraCapture tECameraCapture, C84143X0p c84143X0p) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS25S0300000_14(this, tECameraCapture, c84143X0p, 7));
            return 0;
        }
        C63922P6w.LIZLLL("TECameraServer", "setFeatureParameters...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLLLL(c84143X0p);
            }
        }
        return 0;
    }

    public void queryFeatures(String str, Bundle bundle) {
        Object obj;
        if (this.mCameraInstance != null) {
            Bundle LLJLILLLLZIIL = this.mCameraInstance.LLJLILLLLZIIL(str);
            if (LLJLILLLLZIIL == null) {
                C63922P6w.LIZIZ("TECameraServer", "queryFeatures: getFeatures is null");
                return;
            }
            for (String str2 : bundle.keySet()) {
                if (LLJLILLLLZIIL.containsKey(str2)) {
                    HashMap hashMap = (HashMap) X12.LIZ;
                    if (hashMap.containsKey(str2)) {
                        obj = hashMap.get(str2);
                    } else {
                        obj = null;
                    }
                    if (obj == Boolean.class) {
                        bundle.putBoolean(str2, LLJLILLLLZIIL.getBoolean(str2));
                    } else if (obj == Integer.class) {
                        bundle.putInt(str2, LLJLILLLLZIIL.getInt(str2));
                    } else if (obj == Long.class) {
                        bundle.putLong(str2, LLJLILLLLZIIL.getLong(str2));
                    } else if (obj == Float.class) {
                        bundle.putFloat(str2, LLJLILLLLZIIL.getFloat(str2));
                    } else if (obj == Double.class) {
                        bundle.putDouble(str2, LLJLILLLLZIIL.getDouble(str2));
                    } else if (obj == String.class) {
                        bundle.putString(str2, LLJLILLLLZIIL.getString(str2));
                    } else if (obj == ArrayList.class) {
                        bundle.putParcelableArrayList(str2, LLJLILLLLZIIL.getParcelableArrayList(str2));
                    } else if (obj == TEFrameSizei.class) {
                        bundle.putParcelable(str2, LLJLILLLLZIIL.getParcelable(str2));
                    } else if (obj == TEFocusParameters.class) {
                        bundle.putParcelable(str2, LLJLILLLLZIIL.getParcelable(str2));
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Not supported key:");
                        LIZ.append(str2);
                        C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ));
                    }
                }
            }
            return;
        }
        C63922P6w.LIZIZ("TECameraServer", "queryFeatures: camera instance null");
    }

    public float queryShaderZoomStep(TECameraCapture tECameraCapture, InterfaceC84149X0v interfaceC84149X0v) {
        if (!LIZJ(tECameraCapture)) {
            return -108.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS25S0300000_14(this, tECameraCapture, interfaceC84149X0v, 6));
            return 0.0f;
        }
        C63922P6w.LIZLLL("TECameraServer", "queryShaderZoomStep...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLLLLZZ(interfaceC84149X0v);
            }
        }
        return 0.0f;
    }

    public void setAperture(TECameraCapture tECameraCapture, float f) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS1S0200001_11(this, tECameraCapture, f, 0));
            return;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLL(f);
            }
        }
    }

    public void setAutoExposureLock(TECameraCapture tECameraCapture, boolean z) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS14S0210000_15(this, tECameraCapture, z, 1));
            return;
        }
        C63922P6w.LIZLLL("TECameraServer", "setAutoExposureLock...");
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) {
                YR1 yr1 = this.mCameraObserver;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Can not set auto exposure lock on state : ");
                LIZ.append(this.mCurrentCameraState);
                yr1.onError(-105, X1D.LIZIZ(LIZ));
                return;
            }
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLZ(z);
            }
        }
    }

    public void setAutoFocusLock(TECameraCapture tECameraCapture, boolean z) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS13S0210000_14(tECameraCapture, this, z, 2));
            return;
        }
        C63922P6w.LIZ("TECameraServer", "setAutoExposureLock...");
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) {
                YR1 yr1 = this.mCameraObserver;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Can not set auto exposure lock on state : ");
                LIZ.append(this.mCurrentCameraState);
                yr1.onError(-105, X1D.LIZIZ(LIZ));
                return;
            }
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLIZZ(z);
            }
        }
    }

    public void setExposureCompensation(TECameraCapture tECameraCapture, int i) {
        Handler handler;
        if (!LIZJ(tECameraCapture) || (handler = this.mHandler) == null) {
            C63922P6w.LIZIZ("TECameraServer", "setExposureCompensation failed");
        } else {
            handler.post(new ARunnableS18S0101000_14(i, this, 2));
        }
    }

    public int setFeatureParameters(TECameraCapture tECameraCapture, Bundle bundle) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS22S0300000_11(this, tECameraCapture, bundle, 4));
            return 0;
        }
        C63922P6w.LIZLLL("TECameraServer", "setFeatureParameters...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLIILIL(bundle);
            }
        }
        return 0;
    }

    public void setISO(TECameraCapture tECameraCapture, int i) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS17S0201000_14(i, tECameraCapture, this, 2));
            return;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLI(i);
            }
        }
    }

    public void setManualFocusDistance(TECameraCapture tECameraCapture, float f) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS1S0200001_11(this, tECameraCapture, f, 1));
            return;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLLIL(f);
            }
        }
    }

    public void setSceneMode(TECameraCapture tECameraCapture, int i) {
        if (LIZJ(tECameraCapture)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new ARunnableS18S0101000_14(i, this, 1));
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set scnen failed: ");
        LIZ.append(i);
        C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ));
    }

    public void setShutterTime(TECameraCapture tECameraCapture, long j) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS10S0200100_14(this, tECameraCapture, j, 0));
            return;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLLZI(j);
            }
        }
    }

    public int stop(TECameraCapture tECameraCapture, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop，sync = ");
        LIZ.append(z);
        LIZ.append(", client = ");
        LIZ.append(tECameraCapture);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C63922P6w.LIZIZ("TECameraServer", "stop, mHandler is null!");
            return -112;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("TECameraServer-stop sync=");
        LIZ2.append(z);
        P7T.LIZ(X1D.LIZIZ(LIZ2));
        if (Looper.myLooper() != handler.getLooper()) {
            if (z) {
                this.mCameraClientCondition.close();
            }
            handler.post(new ARunnableS10S0210000_11(tECameraCapture, this, z, 2));
            if (z && (!this.mCameraClientCondition.block(1500L))) {
                C63922P6w.LIZIZ("TECameraServer", "Camera stop timeout!");
            }
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 2) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("stop, no need to stop capture, state: ");
                    LIZ3.append(this.mCurrentCameraState);
                    C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ3));
                    return 0;
                }
                if (this.mCurrentCameraState != 3) {
                    YR1 yr1 = this.mCameraObserver;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Invalidate state: ");
                    LIZ4.append(this.mCurrentCameraState);
                    LIZ4.append(" ==> ");
                    LIZ4.append(2);
                    yr1.onError(-105, X1D.LIZIZ(LIZ4));
                    return -105;
                }
                updateCameraState(2);
                if (this.mCameraSettings.LLJJL && this.mCameraInstance != null && this.mCameraInstance.LLLLJ() != null) {
                    this.mCameraInstance.LLLLJ().LJ(true);
                }
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.stopCapture();
                }
            }
        }
        P7T.LIZIZ();
        return 0;
    }

    public int stopZoom(TECameraCapture tECameraCapture, InterfaceC87361YQj interfaceC87361YQj) {
        if (!LIZJ(tECameraCapture)) {
            C63922P6w.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS22S0300000_11(this, tECameraCapture, interfaceC87361YQj, 3));
            return 0;
        }
        C63922P6w.LIZLLL("TECameraServer", "stopZoom...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLZIL(interfaceC87361YQj);
            }
        }
        return 0;
    }

    public int switchCameraMode(TECameraCapture tECameraCapture, int i) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        C84134X0g c84134X0g = tECameraCapture.mCameraSettings;
        if (c84134X0g.LJLILLLLZI != 1) {
            if (i != 1 && i != 0 && i != 2) {
                return -100;
            }
            if (c84134X0g.LLIFFJFJJ == i) {
                return 0;
            }
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new ARunnableS17S0201000_14(i, tECameraCapture, this, 4));
            } else {
                C63922P6w.LIZLLL("TECameraServer", "switchCameraMode");
                synchronized (this.mStateLock) {
                    if (this.mCurrentCameraState != 3) {
                        YR1 yr1 = this.mCameraObserver;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Invalidate state: ");
                        LIZ.append(this.mCurrentCameraState);
                        LIZ.append(" ==> ");
                        LIZ.append(3);
                        yr1.onError(-105, X1D.LIZIZ(LIZ));
                        return -105;
                    }
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.LLJJLIIIJLLLLLLLZ(i);
                    }
                }
            }
            return 0;
        }
        return -100;
    }

    public int switchFlashMode(TECameraCapture tECameraCapture, int i) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS17S0201000_14(i, tECameraCapture, this, 3));
            return 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchFlashMode: ");
        LIZ.append(i);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LJJJJJ(i);
                this.mCameraEvent.LJIIIIZZ(116, i, "");
            }
        }
        return 0;
    }

    public int takePicture(TECameraCapture tECameraCapture, PZA pza) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        this.mHandler.post(new ARunnableS33S0200000_14(this, pza, 26));
        return 0;
    }

    public int toggleTorch(TECameraCapture tECameraCapture, boolean z) {
        if (!LIZJ(tECameraCapture)) {
            C63922P6w.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS13S0210000_14(tECameraCapture, this, z, 3));
            return 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toggleTorch: ");
        LIZ.append(z);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLZZIL(z);
            }
        }
        return 0;
    }

    public void updateCameraProvider(TECameraCapture tECameraCapture, C63915P6p c63915P6p) {
        if (c63915P6p != null) {
            this.LJLJLJ = c63915P6p;
            if (this.mCameraInstance != null && this.mCameraInstance.LLLLJ() != null && this.mCameraInstance.LLLLJ().LIZ != null) {
                this.mCameraInstance.LLLLJ().LIZ.LJJ(c63915P6p.LIZLLL, c63915P6p.LJII);
                this.mCameraInstance.LLLLJ().LIZ.LJIJJ(c63915P6p.LJII);
                EnumC63904P6e enumC63904P6e = c63915P6p.LJII;
                if (enumC63904P6e == EnumC63904P6e.CHANGE_SURFACE || enumC63904P6e == EnumC63904P6e.REMOVE_SURFACE || enumC63904P6e == EnumC63904P6e.REMOVE_SURFACE_TEXTURE) {
                    this.mCameraInstance.LLLLLLIL();
                }
            }
        }
    }

    public int captureBurst(TECameraCapture tECameraCapture, InterfaceC84146X0s interfaceC84146X0s, YR0 yr0) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        this.mHandler.post(new ARunnableS33S0200000_14(this, yr0, 24));
        return 0;
    }

    public int changeRecorderState(TECameraCapture tECameraCapture, int i, InterfaceC87374YQw interfaceC87374YQw) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (!this.LJLILLLLZI && Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS17S0201000_14(i, tECameraCapture, this, 6));
            return 0;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance == null) {
                this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                return -100;
            }
            this.mCameraInstance.LLLLJI();
            return 0;
        }
    }

    public int disConnect(TECameraCapture tECameraCapture, boolean z, Cert cert) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("disConnect with client: ");
        LIZ.append(tECameraCapture);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        this.LJLLL = false;
        synchronized (this.LJLJJI) {
            TECameraCapture tECameraCapture2 = this.mCameraClient;
            if (tECameraCapture2 == tECameraCapture && tECameraCapture2 != null) {
                this.mCameraClient = null;
                this.mHandler.removeCallbacksAndMessages(null);
                this.cachedClosePrivacyCert = cert;
                int close = close(z, cert);
                if (z) {
                    if (decreaseClientCount() == 0) {
                        destroy();
                        return close;
                    }
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("setAsyncCloseCheckMsg: ");
                    LIZ2.append(this.mCheckCloseTask);
                    C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ2));
                    this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
                    this.mMainHandler.postDelayed(this.mCheckCloseTask, 2000L);
                }
                return close;
            }
            return -100;
        }
    }

    public TEFrameSizei getBestPreviewSize(TECameraCapture tECameraCapture, float f, TEFrameSizei tEFrameSizei) {
        if (!LIZJ(tECameraCapture) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1 || this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.LLLIIIL(f, tEFrameSizei);
    }

    public int open(TECameraCapture tECameraCapture, C84134X0g c84134X0g, Cert cert) {
        int LLLZIIL;
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (this.mIsCameraPendingClose) {
            C63922P6w.LIZIZ("TECameraServer", "pending close");
            return -105;
        }
        if (c84134X0g.LLIZ && this.LJLJLLL) {
            C63922P6w.LIZIZ("TECameraServer", "in background");
            return -105;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C63922P6w.LIZIZ("TECameraServer", "open, mHandler is null!");
            return -112;
        }
        if (this.mIsCameraPendingClose) {
            C63922P6w.LIZIZ("TECameraServer", "had called disConnect(), abandon open camera!");
            return -113;
        }
        if (!this.LJLILLLLZI && Looper.myLooper() != handler.getLooper()) {
            handler.post(new ARunnableS1S0400100_11(this, System.currentTimeMillis(), tECameraCapture, c84134X0g, cert, 0));
        } else {
            P7T.LIZ("TECameraServer-open");
            this.mCameraSettings = c84134X0g;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("is force close camera=");
            LIZ.append(this.mCameraSettings.LLIL);
            LIZ.append(", Camera2Detect=");
            LIZ.append(this.mCameraSettings.LLJJIJI);
            C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
            this.mCheckCloseTask = new ARunnableS50S0100000_14(this, 47);
            this.LJLJI = 0.0f;
            if (this.mRetryCnt < 0) {
                this.mRetryCnt = c84134X0g.LLD;
            }
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("No need open camera again, state = ");
                    LIZ2.append(this.mCurrentCameraState);
                    C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ2));
                    if (this.mCurrentCameraState != 1) {
                        this.mCameraObserver.onInfo(1, 0, "Camera features is ready");
                    }
                    P7T.LIZIZ();
                    return 0;
                }
                updateCameraState(1);
                if (this.mCameraInstance == null) {
                    this.mCameraInstance = LIZLLL();
                    if (this.mCameraInstance == null) {
                        updateCameraState(0);
                        this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                        return -1;
                    }
                    this.mCameraInstance.LLLLZIL();
                }
                this.mBeginTime = System.currentTimeMillis();
                if (this.LJLLI) {
                    this.LJLL.LIZ(new X04(EnumC79412VEq.BOOST_CPU, this.LJLLILLLL));
                    LLLZIIL = this.mCameraInstance.LLLZIIL(this.mCameraSettings, cert);
                    this.LJLL.LIZ(new X04(EnumC79412VEq.RESTORE_CPU));
                } else {
                    LLLZIIL = this.mCameraInstance.LLLZIIL(this.mCameraSettings, cert);
                }
                if (LLLZIIL != 0) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Open camera failed, ret = ");
                    LIZ3.append(LLLZIIL);
                    C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ3));
                }
                P7T.LIZIZ();
            }
        }
        return 0;
    }

    public int queryZoomAbility(TECameraCapture tECameraCapture, InterfaceC87361YQj interfaceC87361YQj, boolean z) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC63890P5q(this, tECameraCapture, interfaceC87361YQj, z));
            return 0;
        }
        C63922P6w.LIZLLL("TECameraServer", "queryZoomAbility...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLLILZ(interfaceC87361YQj, z);
            }
        }
        return 0;
    }

    public void setPictureSize(TECameraCapture tECameraCapture, int i, int i2) {
        if (LIZJ(tECameraCapture)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new ARunnableS5S0102000_14(this, i, i2, 0));
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set picture size failed, w: ");
        LIZ.append(i);
        LIZ.append(", h: ");
        LIZ.append(i2);
        C63922P6w.LJ("TECameraServer", X1D.LIZIZ(LIZ));
    }

    public void setWhileBalance(TECameraCapture tECameraCapture, boolean z, String str) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new ARunnableS3S1210000_14(this, tECameraCapture, z, str, 0));
            return;
        }
        synchronized (this.mStateLock) {
            C63922P6w.LIZLLL("TECameraServer", "setWhiteBalance...");
            if (this.mCameraInstance != null) {
                this.mCameraInstance.LLL(str, z);
            }
        }
    }

    public int startZoom(TECameraCapture tECameraCapture, float f, InterfaceC87361YQj interfaceC87361YQj) {
        Message obtainMessage;
        if (!LIZJ(tECameraCapture)) {
            C63922P6w.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        Looper.myLooper();
        this.mHandler.getLooper();
        X10 x10 = this.mCameraInstance;
        if (x10 == null) {
            C63922P6w.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -105. Reason: mCameraInstance is null");
            C63922P6w.LJ("TECameraServer", "camera is null, no need to start zoom");
            return -105;
        }
        float abs = Math.abs(f - this.LJLJI);
        if (Math.abs(f - x10.LLJJJJJIL()) < 0.1f) {
            f = x10.LLJJJJJIL();
        } else if (Math.abs(f) < 0.1f) {
            f = 0.0f;
        } else if (abs < 0.1f) {
            return 0;
        }
        this.LJLJI = f;
        Handler handler = this.mHandler;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            obtainMessage = new Message();
        } else {
            obtainMessage = handler.obtainMessage();
        }
        obtainMessage.what = 1;
        obtainMessage.arg1 = (int) (f * 100.0f);
        obtainMessage.obj = interfaceC87361YQj;
        this.mHandler.sendMessage(obtainMessage);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
    
        if (r3 != 11) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[Catch: all -> 0x015e, TryCatch #0 {, blocks: (B:24:0x007b, B:27:0x008a, B:31:0x014f, B:32:0x015b, B:34:0x0092, B:36:0x009a, B:38:0x009e, B:40:0x00a2, B:42:0x00a8, B:44:0x00ac, B:45:0x00bc, B:47:0x00c0, B:48:0x00ca, B:50:0x00d6, B:51:0x00dc, B:53:0x0103, B:54:0x0138, B:61:0x013c, B:63:0x0146), top: B:23:0x007b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int switchCamera(com.ss.android.ttvecamera.TECameraCapture r13, X.C84134X0g r14, com.bytedance.bpea.basics.Cert r15) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC84152X0y.switchCamera(com.ss.android.ttvecamera.TECameraCapture, X.X0g, com.bytedance.bpea.basics.Cert):int");
    }

    public int zoomV2(TECameraCapture tECameraCapture, float f, InterfaceC87361YQj interfaceC87361YQj) {
        if (!LIZJ(tECameraCapture)) {
            C63922P6w.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC63859P4l(this, tECameraCapture, f, interfaceC87361YQj));
        } else {
            C63922P6w.LIZLLL("TECameraServer", "zoomV2...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LLLLLZ(f, interfaceC87361YQj);
                }
                if (this.mFirstZoom) {
                    this.mCameraEvent.LJIIIIZZ(114, 0, "zoomV2");
                    this.mFirstZoom = false;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0084, code lost:
    
        if (r12.mCameraSettings.LJLJJI == 7) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int switchCamera(com.ss.android.ttvecamera.TECameraCapture r13, int r14, com.bytedance.bpea.basics.Cert r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC84152X0y.switchCamera(com.ss.android.ttvecamera.TECameraCapture, int, com.bytedance.bpea.basics.Cert):int");
    }

    public int takePicture(TECameraCapture tECameraCapture, int i, int i2, PZA pza) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        this.mHandler.post(new ARunnableS5S0202000_14(this, pza, i, i2, 0));
        return 0;
    }

    public int connect(TECameraCapture tECameraCapture, YR1 yr1, C84134X0g c84134X0g, PDF pdf, Cert cert) {
        HandlerThread handlerThread;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("connect with client: ");
        LIZ.append(tECameraCapture);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        if (tECameraCapture != null) {
            if (yr1 != null) {
                if (c84134X0g != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("connect: remove mCheckCloseTask Callbacks, ");
                    LIZ2.append(this.mCheckCloseTask);
                    C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ2));
                    this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
                    synchronized (this.LJLJJI) {
                        boolean LJIIIIZZ = LJIIIIZZ(c84134X0g);
                        if (tECameraCapture == this.mCameraClient && !LJIIIIZZ) {
                            C63922P6w.LJ("TECameraServer", "No need reconnect.");
                            return -423;
                        }
                        if (!this.LJLJJL) {
                            LJI();
                            LJIIIIZZ = false;
                        }
                        this.mCameraClient = tECameraCapture;
                        this.mCameraObserver = yr1;
                        this.mPictureSizeCallback = pdf;
                        boolean z = c84134X0g.LLILII;
                        this.LJLLI = z;
                        this.mRetryCnt = -1;
                        int i = 1;
                        if (z) {
                            this.LJLLILLLL = c84134X0g.LLILIL;
                            C84119Wzr c84119Wzr = this.LJLL;
                            C109434Rf c109434Rf = new C109434Rf();
                            c84119Wzr.LIZ = false;
                            c84119Wzr.LIZIZ = c109434Rf;
                            c84119Wzr.LIZ = true;
                        }
                        synchronized (this) {
                            if (this.mCameraObserver != null && (handlerThread = this.LJLIL) != null) {
                                int threadId = handlerThread.getThreadId();
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("ve booster TET_BOOSTER_CAMERA_SERVER_TID = ");
                                LIZ3.append(threadId);
                                C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ3));
                                this.mCameraObserver.onInfo(125, threadId, "cameraserver");
                            }
                        }
                        LJFF();
                        if (LJIIIIZZ) {
                            C63922P6w.LIZLLL("TECameraServer", "reopen camera.");
                            int close = close(cert);
                            Handler handler = this.mHandler;
                            if (handler != null) {
                                handler.post(new RunnableC65317PkH(i, this));
                            }
                            if (close == 0) {
                                decreaseClientCount();
                            }
                        }
                        this.mIsCameraPendingClose = false;
                        this.cachedOpenPrivacyCert = cert;
                        return open(tECameraCapture, c84134X0g, cert);
                    }
                }
                throw new IllegalArgumentException("mParams must not be null");
            }
            throw new IllegalArgumentException("observer must not be null");
        }
        throw new IllegalArgumentException("client must not be null");
    }
}
