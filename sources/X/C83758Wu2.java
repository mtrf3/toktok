package X;

import android.content.Context;
import android.view.SurfaceHolder;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVScanSettings;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.runtime.VERuntime;
import kotlin.jvm.internal.o;

/* renamed from: X.Wu2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83758Wu2 implements IQRCodeScanner {
    public C83866Wvm LIZ;
    public IQRCodeScanner.OnEnigmaScanListener LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void enableCameraScan(boolean z, long j) {
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void closeLight() {
        InterfaceC83863Wvj cameraController;
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (cameraController = c83866Wvm.getCameraController()) != null) {
            cameraController.LJJJJJ(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF.ordinal());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void openLight() {
        InterfaceC83863Wvj cameraController;
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (cameraController = c83866Wvm.getCameraController()) != null) {
            cameraController.LJJJJJ(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH.ordinal());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void release() {
        InterfaceC83759Wu3 LIZJ;
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (LIZJ = c83866Wvm.LIZJ()) != null) {
            LIZJ.release();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void stop() {
        InterfaceC83759Wu3 LIZJ;
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (LIZJ = c83866Wvm.LIZJ()) != null) {
            LIZJ.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void stopPicScan() {
        InterfaceC83759Wu3 LIZJ;
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (LIZJ = c83866Wvm.LIZJ()) != null) {
            LIZJ.stopPicScan();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void pauseEffectAudio(boolean z) {
        InterfaceC83759Wu3 LIZJ;
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (LIZJ = c83866Wvm.LIZJ()) != null) {
            LIZJ.pauseEffectAudio(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void setScanListener(IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener) {
        InterfaceC83759Wu3 LIZJ;
        this.LIZIZ = onEnigmaScanListener;
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (LIZJ = c83866Wvm.LIZJ()) != null) {
            LIZJ.LIZJ(new C84043Wyd(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void zoomByRatio(float f) {
        InterfaceC83863Wvj cameraController;
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (cameraController = c83866Wvm.getCameraController()) != null) {
            cameraController.LLJJL(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83758Wu2(Context context, SurfaceHolder surfaceHolder) {
        C83866Wvm c83866Wvm;
        InterfaceC83863Wvj cameraController;
        InterfaceC83863Wvj cameraController2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(surfaceHolder, "surfaceHolder");
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        C83617Wrl.LIZ = C19N.LJ("enable_max_zoom_optimized", true);
        C83734Wte c83734Wte = new C83734Wte();
        VERuntime.getInstance().enableRefactorRecorder(true);
        C83866Wvm LIZ = C83764Wu8.LIZ((LifecycleOwner) context, new C83760Wu4(surfaceHolder), c83734Wte, C34347Ddv.LJLIL, null);
        this.LIZ = LIZ;
        InterfaceC83863Wvj cameraController3 = LIZ.getCameraController();
        if (cameraController3 != null) {
            cameraController3.setControllerCallback(new C163326b2(""));
        }
        C83866Wvm c83866Wvm2 = this.LIZ;
        if (c83866Wvm2 != null && (cameraController2 = c83866Wvm2.getCameraController()) != null) {
            cameraController2.LJJJJ(new C83762Wu6(this));
        }
        surfaceHolder.addCallback(new SurfaceHolderCallbackC83731Wtb(this));
        if (surfaceHolder.getSurface() != null && surfaceHolder.getSurface().isValid() && (c83866Wvm = this.LIZ) != null && (cameraController = c83866Wvm.getCameraController()) != null) {
            cameraController.LJJIJIL(YZL.AS_CAMERA_LENS_BACK.ordinal(), null, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_QR_CODE_SCAN_SURFACE_HAD, WYE.QR));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void processTouchEvent(float f, float f2) {
        InterfaceC83759Wu3 LIZJ;
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (LIZJ = c83866Wvm.LIZJ()) != null) {
            LIZJ.processTouchEvent(f, f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void startPicScan(String picturePath, AVScanSettings settings, long j) {
        InterfaceC83759Wu3 LIZJ;
        o.LJIIIZ(picturePath, "picturePath");
        o.LJIIIZ(settings, "settings");
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (LIZJ = c83866Wvm.LIZJ()) != null) {
            ScanSettings scanSettings = new ScanSettings();
            scanSettings.width = settings.width;
            scanSettings.height = settings.height;
            scanSettings.detectModelDir = settings.detectModelDir;
            scanSettings.detectRectLeft = settings.detectRectLeft;
            scanSettings.detectRectTop = settings.detectRectTop;
            scanSettings.detectRectWidth = settings.detectRectWidth;
            scanSettings.detectRectHeight = settings.detectRectHeight;
            scanSettings.enableDetectRect = settings.enableDetectRect;
            scanSettings.detectRequirement = settings.detectRequirement;
            scanSettings.buildChainFlag = settings.buildChainFlag;
            LIZJ.LIZIZ(picturePath, scanSettings, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void startScan(Context context, AVCameraParams params, SurfaceHolder surfaceHolder, AVScanSettings settings) {
        InterfaceC83759Wu3 LIZJ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(surfaceHolder, "surfaceHolder");
        o.LJIIIZ(settings, "settings");
        C44172HVg.LIZJ();
        VERuntime.getInstance().setEffectResourceFinder(DownloadableModelSupport.getInstance().getResourceFinder());
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (LIZJ = c83866Wvm.LIZJ()) != null) {
            LIZJ.LIZ(settings.detectRectLeft, settings.detectRectTop, settings.detectRectWidth, settings.detectRectHeight);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void switchEffectWithTag(String strResPath, int i, int i2, String stickerTag) {
        InterfaceC83759Wu3 LIZJ;
        o.LJIIIZ(strResPath, "strResPath");
        o.LJIIIZ(stickerTag, "stickerTag");
        C83866Wvm c83866Wvm = this.LIZ;
        if (c83866Wvm != null && (LIZJ = c83866Wvm.LIZJ()) != null) {
            LIZJ.switchEffectWithTag(strResPath, i, i2, stickerTag);
        }
    }
}
