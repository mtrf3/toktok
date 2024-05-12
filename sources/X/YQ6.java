package X;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YQ6 extends YQ5 {
    public final P9I LJJIJLIJ;
    public volatile int LJJIL;
    public CameraManager LJJIZ;
    public volatile CameraDevice LJJJ;
    public boolean LJJJI;
    public YQ7 LJJJIL;
    public final YBH LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public List<TEFrameSizei> LJJJJJ;
    public List<TEFrameSizei> LJJJJJL;
    public final ConditionVariable LJJJJL;
    public final YQE LJJJJLI;

    @Override // X.YQ5, X.X10
    public final int LLJJJ() {
        return 2;
    }

    @Override // X.X10
    public final boolean LLLLLJIL() {
        return true;
    }

    @Override // X.X10
    public final void LLLZIL(InterfaceC87361YQj interfaceC87361YQj) {
    }

    @Override // X.YQ5
    public final int LJ() {
        int i;
        CameraCharacteristics cameraCharacteristics;
        int i2 = this.LJIIJ;
        if (i2 < 0) {
            i2 = PDA.LJIIL(this.LJFF);
        }
        this.LJII = this.LJIIIIZZ;
        YQ7 yq7 = this.LJJJIL;
        if (yq7 != null && (cameraCharacteristics = yq7.LIZ) != null) {
            i = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } else {
            i = this.LIZIZ.LJLJJL;
        }
        if (this.LJII == 1) {
            int i3 = (i + i2) % 360;
            this.LJIIIZ = i3;
            this.LJIIIZ = ((360 - i3) + 180) % 360;
        } else {
            this.LJIIIZ = ((i - i2) + 360) % 360;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mDeviceRotation = ");
        LIZ.append(this.LJIIJ);
        LIZ.append(", mFacing = ");
        C15890jp.LIZIZ(LIZ, this.LJII, ", degrees = ", i2, ", senserOrientation = ");
        LIZ.append(i);
        LIZ.append(", mCameraSettings.mRotation = ");
        LIZ.append(this.LIZIZ.LJLJJL);
        LIZ.append(", mCameraSettings: ");
        LIZ.append(this.LIZIZ.hashCode());
        C63922P6w.LIZLLL("TECamera2", X1D.LIZIZ(LIZ));
        return this.LJIIIZ;
    }

    public final boolean LJFF() {
        if (this.LJJJ != null) {
            return true;
        }
        return false;
    }

    public final void LJIIIIZZ() {
        int i;
        P7T.LIZ("VECamera-TECamera2-_startCapture");
        if (this.LJJJIL == null) {
            this.LJIIL = 0;
            this.LIZLLL.LIZLLL(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "_startCapture : mode is null");
            return;
        }
        try {
            C63922P6w.LIZLLL("TECamera2", "CAMERA_COST camera2 system startPreview start");
            int LJJIJLIJ = this.LJJJIL.LJJIJLIJ();
            C63922P6w.LIZLLL("TECamera2", "CAMERA_COST camera2 system startPreview end");
            if (LJJIJLIJ != 0) {
                LJIIL();
                this.LIZLLL.LIZLLL(this.LJJJ, this.LIZIZ.LJLILLLLZI, LJJIJLIJ, "_startCapture : something wrong");
            }
            P7T.LIZIZ();
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                i = -410;
            } else if (e instanceof IllegalArgumentException) {
                i = -402;
            } else if (e instanceof IllegalStateException) {
                i = -409;
            } else {
                i = -425;
            }
            LJIIL();
            C63922P6w.LJFF("TECamera2", "_startCapture exception occurred.", e);
            C87365YQn.LIZ(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("_startCapture error occurred, err msg: ");
            LIZ.append(e.getMessage());
            String LIZIZ = X1D.LIZIZ(LIZ);
            this.LIZLLL.LIZLLL(this.LJJJ, this.LIZIZ.LJLILLLLZI, i, LIZIZ);
        }
    }

    public final void LJIIIZ() {
        Handler handler;
        if (this.LJJJIL == null) {
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "_stopCapture : mode is null");
            return;
        }
        try {
            P7T.LIZ("TECamera2-_stopCapture-closePreviewSession");
            this.LJJJIL.LJIIJ();
            P7T.LIZIZ();
            this.LJJIII = 0;
            this.LJJIFFI = 0L;
            C84134X0g c84134X0g = this.LIZIZ;
            if (c84134X0g != null && (handler = this.LJ) != null && c84134X0g.LJLLLLLL) {
                handler.removeCallbacks(this.LJJIJL);
            }
            this.LIZLLL.LIZ(this.LJJJ, "TECamera2 preview stoped");
        } catch (Exception e) {
            C63922P6w.LJFF("TECamera2", "_stopCapture exception occurred.", e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("_stopCapture error occurred, err msg: ");
            LIZ.append(e.getMessage());
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -425, X1D.LIZIZ(LIZ));
        }
    }

    public final void LJIIL() {
        if (this.LIZIZ.LJLLI) {
            this.LJJJJL.open();
            C63922P6w.LIZLLL("TECamera2", "open camera-operation lock");
        }
    }

    public final void LJIILJJIL() {
        if (this.LIZIZ.LJLLI) {
            this.LJJJJL.close();
            C63922P6w.LIZLLL("TECamera2", "block camera-operation start...");
            boolean block = this.LJJJJL.block(1000L);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("block camera-operation end...result = ");
            LIZ.append(block);
            C63922P6w.LIZLLL("TECamera2", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.YQ5, X.X10
    public final int LJJJJIZL() {
        this.LJJJIL.LJJJ();
        return 0;
    }

    @Override // X.YQ5, X.X10
    public final int LLJJJJ() {
        this.LJJJIL.LJJIL();
        return 0;
    }

    @Override // X.X10
    public final void LLJJL() {
        YQ7 yq7;
        if (this.LJJIL == 1) {
            C63922P6w.LIZ("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "cancelFocus : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "cancelFocus : camera is null.");
        } else {
            yq7.LJI();
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLJZ() {
        HandlerThread handlerThread;
        C63922P6w.LIZLLL("TECamera2", "clearResourceBeforeRestartWhenCameraErr");
        YQ7 yq7 = this.LJJJIL;
        if (yq7 != null && (handlerThread = yq7.LJJIIJZLJL) != null) {
            handlerThread.quitSafely();
            yq7.LJJIIJZLJL = null;
            yq7.LJJIIJ = null;
            C63922P6w.LIZLLL("TECameraModeBase", "releaseCameraThread");
        }
    }

    @Override // X.YQ5, X.X10
    public final List<TEFrameSizei> LLLJ() {
        YQ7 yq7 = this.LJJJIL;
        if (yq7 == null || yq7.LIZ == null) {
            C63922P6w.LIZIZ("TECamera2", "getSupportedPreviewSizes: camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "getSupportedPreviewSizes: camera is null.");
            return null;
        }
        if (this.LJJJJJ == null) {
            this.LJJJJJ = PDA.LJI(yq7.LJIL());
        }
        return this.LJJJJJ;
    }

    @Override // X.YQ5, X.X10
    public final int[] LLLJIL() {
        CaptureRequest.Builder builder;
        Range range;
        YQ7 yq7 = this.LJJJIL;
        if (yq7 == null || (builder = yq7.LIZJ) == null || (range = (Range) builder.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) == null) {
            return null;
        }
        return new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x04cb  */
    @Override // X.YQ5, X.X10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIIL() {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YQ6.LLLLIIL():void");
    }

    @Override // X.YQ5, X.X10
    public final float LLLLILI() {
        YQ7 yq7;
        if (this.LJJIL == 1) {
            C63922P6w.LIZ("TECamera2", "Camera is opening, ignore getManualFocusAbility operation.");
            return -1.0f;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "getManualFocusAbility : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "getManualFocusAbility : camera is null.");
            return -1.0f;
        }
        if (yq7.LIZJ == null || yq7.LIZLLL == null) {
            yq7.LJFF.LJIIIIZZ(-435, -435, "Capture Session is null");
        }
        if (yq7.LIZ.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE) != null) {
            float floatValue = ((Float) yq7.LIZ.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE)).floatValue();
            if (floatValue >= 0.0f) {
                return floatValue;
            }
        }
        yq7.LJFF.LJIIIIZZ(-435, -435, "can not get manual focus ability");
        return -1.0f;
    }

    @Override // X.X10
    public final void LLLLLILLIL() {
        YQ7 yq7;
        if (this.LJJIL == 1) {
            C63922P6w.LIZ("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "enableCaf : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "enableCaf : camera is null.");
            return;
        }
        CaptureRequest.Builder builder = yq7.LIZJ;
        if (builder == null) {
            yq7.LJFF.LJ(yq7.LJIIIZ, yq7.LJII.LJLILLLLZI, -100, "rollbackNormalSessionRequest : param is null.");
        } else {
            yq7.LJIIIIZZ.LIZ(builder);
            yq7.LJJJJL(yq7.LIZLLL, yq7.LIZJ);
        }
    }

    @Override // X.X10
    public final boolean LLLLLJLJLL() {
        YQ7 yq7;
        CameraCharacteristics cameraCharacteristics;
        Boolean bool;
        C63922P6w.LIZLLL("TECamera2", "isAutoExposureLockSupported...");
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore isAutoExposureLockSupported operation.");
            return false;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null || (cameraCharacteristics = yq7.LIZ) == null) {
            C63922P6w.LIZIZ("TECamera2", "isAutoExposureLockSupported : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "isAutoExposureLockSupported : camera is null.");
            return false;
        }
        if (Build.VERSION.SDK_INT < 23 || (bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.YQ5, X.X10
    public final List<TEFrameSizei> LLLLLLL() {
        YQ7 yq7 = this.LJJJIL;
        if (yq7 == null || yq7.LIZ == null) {
            C63922P6w.LIZIZ("TECamera2", "getSupportedPictureSizes: camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "getSupportedPictureSizes: camera is null.");
            return null;
        }
        if (this.LJJJJJL == null) {
            this.LJJJJJL = PDA.LJI(yq7.LJIJJLI(256));
        }
        return this.LJJJJJL;
    }

    @Override // X.YQ5, X.X10
    public final int LLLLLLLLL() {
        YQ7 yq7;
        C63922P6w.LIZ("TECamera2", "getISO...");
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore setISO operation.");
            return -1;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LJ("TECamera2", "getISO : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "getISO : camera is null.");
            return -1;
        }
        if (yq7.LIZJ == null || yq7.LIZLLL == null) {
            yq7.LJFF.LJIIIIZZ(-430, -430, "Capture Session is null");
        }
        return yq7.LJJIII;
    }

    @Override // X.YQ5, X.X10
    public final long[] LLLLLLLLLL() {
        YQ7 yq7;
        C63922P6w.LIZ("TECamera2", "getShutterTimeRange...");
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore getShutterTimeRange operation.");
            return new long[]{-1, -1};
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LJ("TECamera2", "getShutterTimeRange : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "getShutterTimeRange : camera is null.");
            return new long[]{-1, -1};
        }
        return yq7.LJJIII();
    }

    @Override // X.X10
    public final float[] LLLLLLLZIL() {
        YQ7 yq7;
        C63922P6w.LIZ("TECamera2", "getVFOV...");
        if (this.LJJIL == 1) {
            C63922P6w.LIZ("TECamera2", "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "getFOV : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "getFOV : camera is null.");
            return new float[]{-2.0f, -2.0f};
        }
        if (yq7.LIZIZ == null || yq7.LJIIL == null || yq7.LIZLLL == null || yq7.LIZJ == null) {
            C63922P6w.LJ("TECameraModeBase", "Env is null");
            return new float[]{-2.0f, -2.0f};
        }
        float[] fArr = new float[2];
        double[] dArr = new double[2];
        SizeF sizeF = (SizeF) yq7.LIZ.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) yq7.LIZ.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) yq7.LIZ.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Float f = (Float) yq7.LIZJ.get(CaptureRequest.LENS_FOCAL_LENGTH);
        int abs = StrictMath.abs(rect.right - rect.left);
        int abs2 = StrictMath.abs(rect.top - rect.bottom);
        TEFrameSizei tEFrameSizei = yq7.LJII.LJZI;
        int i = tEFrameSizei.width;
        if (abs * tEFrameSizei.height >= i / abs2) {
            dArr[0] = StrictMath.atan(((sizeF.getWidth() * abs) / size.getWidth()) / (f.floatValue() * 2.0f)) * 2.0d;
            dArr[1] = StrictMath.atan(((((sizeF.getHeight() * abs2) / size.getHeight()) * (i / r6)) / (abs / abs2)) / (f.floatValue() * 2.0f)) * 2.0d;
        } else {
            dArr[1] = StrictMath.atan(((sizeF.getHeight() * abs2) / size.getHeight()) / (f.floatValue() * 2.0f)) * 2.0d;
            dArr[0] = StrictMath.atan(((((sizeF.getWidth() * abs) / size.getWidth()) * (r6 / i)) / (abs2 / abs)) / (f.floatValue() * 2.0f)) * 2.0d;
        }
        fArr[0] = (float) ((dArr[1] * 180.0d) / 3.141592653589793d);
        fArr[1] = (float) ((dArr[0] * 180.0d) / 3.141592653589793d);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Camera2:verticalFOV = ");
        LIZ.append(fArr[0]);
        LIZ.append(",horizontalFOV = ");
        LIZ.append(fArr[1]);
        C63922P6w.LIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
        return fArr;
    }

    @Override // X.YQ5, X.X10
    public final int[] LLLLZ() {
        YQ7 yq7 = this.LJJJIL;
        if (yq7 == null) {
            return null;
        }
        return yq7.LJIJ();
    }

    @Override // X.YQ5, X.X10
    public final int[] LLLZI() {
        YQ7 yq7 = this.LJJJIL;
        if (yq7 == null) {
            C63922P6w.LIZIZ("TECamera2", "get picture size failed, no mode...");
            return null;
        }
        return yq7.LJJIFFI();
    }

    @Override // X.YQ5, X.X10
    public final float[] LLLZLL() {
        YQ7 yq7;
        C63922P6w.LIZ("TECamera2", "getApertureRange...");
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore getApertureRange operation.");
            return new float[]{-1.0f, -1.0f};
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LJ("TECamera2", "getApertureRange : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "getApertureRange : camera is null.");
            return new float[]{-1.0f, -1.0f};
        }
        return yq7.LJIIZILJ();
    }

    @Override // X.YQ5, X.X10
    public final int[] LLZIL() {
        YQ7 yq7;
        C63922P6w.LIZ("TECamera2", "getISORange...");
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
            return new int[]{-1, -1};
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LJ("TECamera2", "setWhileBalance : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "setWhileBalance : camera is null.");
            return new int[]{-1, -1};
        }
        return yq7.LJJI();
    }

    @Override // X.YQ5, X.X10
    public final int getFlashMode() {
        YQ7 yq7 = this.LJJJIL;
        if (yq7 == null) {
            return -1;
        }
        return yq7.LJJ();
    }

    @Override // X.YQ5, X.X10
    public final boolean isSupportedExposureCompensation() {
        YQ7 yq7;
        C63922P6w.LIZLLL("TECamera2", "isSupportedExposureCompensation...");
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null || yq7.LIZ == null) {
            C63922P6w.LIZIZ("TECamera2", "isSupportedExposureCompensation : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -413, "isSupportedExposureCompensation : camera is null.");
            return false;
        }
        return this.LIZIZ.LLIIIL.LIZ();
    }

    @Override // X.YQ5, X.X10
    public final void stopCapture() {
        C63922P6w.LIZLLL("TECamera2", "stopCapture...");
        if (!LJFF()) {
            C63922P6w.LIZIZ("TECamera2", "Device is not ready.");
            return;
        }
        if (this.LJJIL != 3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopCapture, invalid state: ");
            LIZ.append(this.LJJIL);
            C63922P6w.LIZIZ("TECamera2", X1D.LIZIZ(LIZ));
        }
        P7T.LIZ("TECamera2-stopCapture");
        LJIIIZ();
        P7T.LIZIZ();
    }

    @Override // X.X10
    public final boolean LLJL() {
        YQ7 yq7;
        if (!LJFF() || (yq7 = this.LJJJIL) == null || yq7.LIZ == null) {
            C63922P6w.LJ("TECamera2", "Query torch info failed, you must open camera first.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "Query torch info failed, you must open camera first.");
            return false;
        }
        if (this.LJJIJLIJ == null) {
            C63922P6w.LIZIZ("TECamera2", "DeviceProxy is null!");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -417, "");
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ.LJLILLLLZI);
        LIZ.append("_");
        LIZ.append(this.LIZIZ.LJLJJI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isTorchSupported key = ");
        LIZ2.append(LIZIZ);
        C63922P6w.LIZ("TECamera2", X1D.LIZIZ(LIZ2));
        Bundle bundle = (Bundle) ((HashMap) this.LJIIZILJ).get(LIZIZ);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    @Override // X.YQ5, X.X10
    public final void LLJLLL() {
        if (!LJFF()) {
            C63922P6w.LIZIZ("TECamera2", "Device is not ready.");
            return;
        }
        YQ7 yq7 = this.LJJJIL;
        if (yq7 != null) {
            yq7.LIZLLL();
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLIL() {
        super.LLLIL();
        if (this.LJJJIL == null) {
            this.LJIIL = 0;
            this.LIZLLL.LIZLLL(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "startCapture : mode is null");
            return;
        }
        C63922P6w.LIZLLL("TECamera2", "CAMERA_COST camera2 startCapture start");
        P7T.LIZ("VECamera-TECamera2-startCapture");
        C63922P6w.LIZ("TECamera2", "startCapture...");
        if (!LJFF() || this.LJI == null) {
            C63922P6w.LIZIZ("TECamera2", "startCapture, Device is not ready.");
            return;
        }
        if (this.LJJIL != 2 && this.LJJIL != 3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startCapture, invalid state: ");
            LIZ.append(this.LJJIL);
            C63922P6w.LIZIZ("TECamera2", X1D.LIZIZ(LIZ));
            return;
        }
        try {
            this.LIZIZ.LJLJJL = LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Camera rotation = ");
            LIZ2.append(this.LIZIZ.LJLJJL);
            C63922P6w.LIZLLL("TECamera2", X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            C87365YQn.LIZ(e);
            LJII(this.LJIJ);
            YQV yqv = this.LIZLLL;
            if (yqv != null) {
                yqv.LIZIZ(this.LIZIZ.LJLILLLLZI, -425, this, this.LJJJ);
            }
        }
        int i = this.LIZIZ.LLIFFJFJJ;
        if (i != 0 ? i != 1 || (this.LJJJIL instanceof YQ8) : (this.LJJJIL instanceof YQA)) {
            LJIIIIZZ();
            P7T.LIZIZ();
            if (P7T.LIZ && Build.VERSION.SDK_INT >= 29) {
                Trace.beginAsyncSection("VECamera-TECamera2-camera-frame", 2);
            }
            C63922P6w.LIZLLL("TECamera2", "CAMERA_COST camera2 startCapture end");
            return;
        }
        LJIIJ(i);
    }

    @Override // X.YQ5, X.X10
    public final void LLLLLLIL() {
        YQ7 yq7;
        OutputConfiguration outputConfiguration;
        OutputConfiguration outputConfiguration2;
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "updateSurface, device is not readt or mode is null...");
            return;
        }
        C63922P6w.LIZLLL("TECameraModeBase", "updateSurface");
        P7J p7j = yq7.LJI.LJI;
        if (p7j == null || p7j.LIZ == null || yq7.LIZLLL == null) {
            C63922P6w.LIZ("TECameraModeBase", "providerManager or provider or camera session is null");
            return;
        }
        Surface LJ = p7j.LIZ.LJ();
        if (LJ == null) {
            C63922P6w.LIZ("TECameraModeBase", "surface is null");
            return;
        }
        int i = C63905P6f.LIZ[p7j.LIZ.LJFF().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (outputConfiguration2 = yq7.LJJJI) != null && yq7.LJJJIL) {
                outputConfiguration2.removeSurface(LJ);
                yq7.LJJJIL = false;
            }
            yq7.LIZJ.addTarget(p7j.LIZ.LIZJ());
            yq7.LIZJ.removeTarget(LJ);
            yq7.LJJJJIZL(yq7.LIZJ);
            p7j.LIZ.LJIIZILJ();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (outputConfiguration = yq7.LJJJI) != null) {
            outputConfiguration.addSurface(LJ);
            try {
                yq7.LIZLLL.updateOutputConfiguration(yq7.LJJJI);
                yq7.LJJJIL = true;
            } catch (CameraAccessException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        yq7.LIZJ.addTarget(LJ);
        yq7.LIZJ.removeTarget(p7j.LIZ.LIZJ());
        yq7.LJJJJIZL(yq7.LIZJ);
    }

    @Override // X.YQ5, X.X10
    public final void destroy() {
        super.destroy();
        YQ7 yq7 = this.LJJJIL;
        if (yq7 != null) {
            C63922P6w.LIZLLL("TECameraModeBase", "removeFocusSettings");
            YQQ yqq = yq7.LJIIIIZZ;
            if (yqq != null) {
                yqq.LIZIZ = null;
                yq7.LJJIFFI = null;
            }
        }
        YBH ybh = this.LJJJJ;
        Cert LIZLLL = LIZLLL(VKA.UNREGISTER_SENSOR);
        ybh.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroy sensor, Cert: ");
        LIZ.append(LIZLLL);
        C63922P6w.LIZLLL("Gyro", X1D.LIZIZ(LIZ));
        ybh.LJ.clear();
        ybh.LIZ();
        SensorManager sensorManager = ybh.LIZ;
        if (sensorManager != null) {
            try {
                C39188FZo.LIZ(sensorManager, ybh.LJFF, ybh.LIZIZ, LIZLLL);
            } catch (Exception e) {
                C63922P6w.LJFF("Gyro", "sensorManager unregister listener exception occurred.", e);
            }
        }
    }

    @Override // X.YQ5, X.X10
    public final JSONObject LLLLIILL() {
        return this.LJIJJ;
    }

    public static int LJIIJJI(CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        if (reason != 1) {
            if (reason != 2) {
                if (reason != 3) {
                    if (reason != 4 && reason != 5) {
                        return -401;
                    }
                    return -406;
                }
                return -410;
            }
            return -409;
        }
        return -408;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0199 A[EDGE_INSN: B:69:0x0199->B:68:0x0199 BREAK  A[LOOP:1: B:59:0x015c->B:62:0x0196], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJI(com.bytedance.bpea.basics.Cert r16) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YQ6.LJI(com.bytedance.bpea.basics.Cert):int");
    }

    public final void LJII(Cert cert) {
        C80074Vbi c80074Vbi;
        Handler handler;
        try {
            YQ7 yq7 = this.LJJJIL;
            yq7.LJIJI = null;
            yq7.LJJIJL = 0;
            yq7.LJIIJ();
            this.LJJIII = 0;
            this.LJJIFFI = 0L;
            C84134X0g c84134X0g = this.LIZIZ;
            if (c84134X0g != null && (handler = this.LJ) != null && c84134X0g.LJLLLLLL) {
                handler.removeCallbacks(this.LJJIJL);
            }
            if (this.LJJJ != null) {
                LIZ(108, "will close camera2");
                C63925P6z.LIZ(this.LJJJ, cert);
                LIZ(109, "did close camera2");
                this.LIZLLL.LJFF(2, this, this.LJJJ);
                this.LJJJ = null;
            }
        } catch (Throwable th) {
            C63922P6w.LIZIZ("TECamera2", th.getMessage());
        }
        LJIILIIL(0);
        this.LJIJ = null;
        YQ7 yq72 = this.LJJJIL;
        if (yq72 != null && this.LIZIZ.LLIFFJFJJ == 2 && (c80074Vbi = ((YQ9) yq72).LJJJLL) != null) {
            c80074Vbi.LIZ();
        }
    }

    public final void LJIIJ(int i) {
        Handler handler;
        C84134X0g c84134X0g;
        String str;
        C63922P6w.LIZLLL("TECamera2", "_switchCameraMode");
        if (this.LJJJIL == null) {
            return;
        }
        LJIIIZ();
        if (i == 0) {
            C63922P6w.LIZ("TECamera2", "create TEVideo2Mode");
            this.LJJJIL = new YQA(this, this.LJFF, this.LJJIZ, this.LJ);
        } else if (i == 1) {
            C63922P6w.LIZ("TECamera2", "create TEImage2Mode");
            YQ8 yq8 = new YQ8(this, this.LJFF, this.LJJIZ, this.LJ);
            this.LJJJIL = yq8;
            yq8.LJIJJ = this.LJIILIIL;
            yq8.LJIJJLI = this.LJIILJJIL;
            yq8.LJIL = this.LJIILL;
        } else {
            this.LJJJIL = new YQ9(this, this.LJFF, this.LJJIZ, this.LJ);
        }
        if (this.LIZIZ.LJLLI) {
            handler = this.LJJJIL.LJIJI();
        } else {
            handler = this.LJ;
        }
        YQ7 yq7 = this.LJJJIL;
        if (yq7 instanceof YQ9) {
            YQ9 yq9 = (YQ9) yq7;
            Context context = this.LJFF;
            if (yq9.LIZIZ.LJII()) {
                C80074Vbi c80074Vbi = C80076Vbk.LIZ;
                yq9.LJJJLL = c80074Vbi;
                c80074Vbi.LJIIJ(context, yq9.LJII);
                yq9.LJJJLL.LIZ = handler;
            }
        }
        try {
            C84134X0g c84134X0g2 = this.LIZIZ;
            c84134X0g2.LLIIIILZ = this.LJJJIL.LJJIIZI(c84134X0g2.LJLJJI);
            c84134X0g = this.LIZIZ;
            str = c84134X0g.LLIIIILZ;
        } catch (CameraAccessException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (str == null) {
            return;
        }
        if (this.LJJJIL.LJJIIJ(c84134X0g.LLII, str) != 0) {
            return;
        }
        YQ7 yq72 = this.LJJJIL;
        CameraDevice cameraDevice = this.LJJJ;
        yq72.getClass();
        yq72.LJIIIZ = cameraDevice;
        LJIIIIZZ();
    }

    public final void LJIILIIL(int i) {
        if (this.LJJIL == i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("No need update state: ");
            LIZ.append(i);
            C63922P6w.LJ("TECamera2", X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[updateSessionState]: ");
        LIZ2.append(this.LJJIL);
        LIZ2.append(" -> ");
        LIZ2.append(i);
        C63922P6w.LIZLLL("TECamera2", X1D.LIZIZ(LIZ2));
        this.LJJIL = i;
    }

    @Override // X.YQ5, X.X10
    public final void LJJJJJ(int i) {
        YQ7 yq7;
        if (i == 2 && !LLJL()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchFlashMode not support torch, just return facing = ");
            LIZ.append(this.LIZIZ.LLIIIILZ);
            C63922P6w.LIZLLL("TECamera2", X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("switchFlashMode: ");
        LIZ2.append(i);
        C63922P6w.LIZ("TECamera2", X1D.LIZIZ(LIZ2));
        int i2 = 0;
        if (this.LJJIL == 1) {
            YQ7 yq72 = this.LJJJIL;
            if (yq72 != null && (yq72 instanceof YQ8)) {
                ((YQ8) yq72).LJJLIIIJ(i);
                return;
            }
            C63922P6w.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            YQV yqv = this.LIZLLL;
            if (i != 0) {
                i2 = 1;
            }
            yqv.LJII(i2, "Camera is opening, ignore toggleTorch operation.");
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
            C63922P6w.LIZIZ("TECamera2", "switch flash mode  failed, you must open camera first.");
            YQV yqv2 = this.LIZLLL;
            if (i != 0) {
                i2 = 1;
            }
            yqv2.LJII(i2, "switch flash mode  failed, you must open camera first.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "switch flash mode  failed, you must open camera first.");
            return;
        }
        yq7.LJJJJJ(i);
    }

    @Override // X.X10
    public final void LLJJLIIIJLLLLLLLZ(int i) {
        if (this.LJJIL != 3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchCameraMode， invalid state: ");
            LIZ.append(this.LJJIL);
            C63922P6w.LJ("TECamera2", X1D.LIZIZ(LIZ));
            return;
        }
        LJIIJ(i);
    }

    @Override // X.YQ5, X.X10
    public final void LLJLLIL(YR0 yr0) {
        this.LJJJIL.LJIIIIZZ(yr0, this.LJIIIIZZ);
    }

    @Override // X.YQ5, X.X10
    public final void LLLFF(C84151X0x c84151X0x) {
        YQ7 yq7;
        C63922P6w.LIZ("TECamera2", "setFocusAreas...");
        if (this.LJJIL != 3) {
            C63922P6w.LJ("TECamera2", "Camera is not previewing, ignore setFocusAreas operation.");
            c84151X0x.LJIIJJI.LIZ(0, this.LIZIZ.LJLJJI, "Camera is not previewing, ignore setFocusAreas operation.");
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "focusAtPoint : camera is null.");
            c84151X0x.LJIIJJI.LIZ(-439, this.LIZIZ.LJLJJI, "focusAtPoint : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "focusAtPoint : camera is null.");
        } else {
            int LJIILLIIL = yq7.LJIILLIIL(c84151X0x);
            if (LJIILLIIL != 0) {
                C63922P6w.LIZIZ("TECamera2", "focusAtPoint : something wrong.");
                this.LIZLLL.LJIIIIZZ(-411, LJIILLIIL, "focusAtPoint : something wrong.");
            }
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLI(int i) {
        YQ7 yq7;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setISO : ");
        LIZ.append(i);
        C63922P6w.LIZ("TECamera2", X1D.LIZIZ(LIZ));
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore setISO operation.");
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LJ("TECamera2", "setISO : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "setISO : camera is null.");
            return;
        }
        if (yq7.LIZJ == null || yq7.LIZLLL == null) {
            yq7.LJFF.LJIIIIZZ(-430, -430, "Capture Session is null");
        }
        if (i > yq7.LJJI()[1] || i < yq7.LJJI()[0]) {
            yq7.LJFF.LJIIIIZZ(-430, -430, "invalid iso");
            return;
        }
        if (!((Integer) yq7.LIZJ.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
            yq7.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 0);
        }
        if (!((Integer) yq7.LIZJ.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
            yq7.LIZJ.set(CaptureRequest.CONTROL_MODE, 0);
        }
        yq7.LIZJ.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i));
        XS3 LJJJJIZL = yq7.LJJJJIZL(yq7.LIZJ);
        if (LJJJJIZL.LIZ) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setISO exception: ");
        LIZ2.append(LJJJJIZL.LIZIZ);
        C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ2));
        yq7.LJFF.LJIIIIZZ(-430, -430, LJJJJIZL.LIZIZ);
    }

    @Override // X.YQ5, X.X10
    public final void LLLII(Cert cert) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("force close camera: ");
        LIZ.append(this.LJJJ);
        C63922P6w.LIZLLL("TECamera2", X1D.LIZIZ(LIZ));
        if (this.LJJJ != null) {
            C63925P6z.LIZ(this.LJJJ, cert);
            this.LJJJ = null;
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLIILIL(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = (Bundle) ((HashMap) this.LJIIZILJ).get(this.LIZIZ.LLIIIILZ);
        for (String str : bundle.keySet()) {
            if (C84001Wxx.LIZ(C16880lQ.LLJJIII(bundle, str), str) && "support_light_soft".equalsIgnoreCase(str)) {
                bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
            }
        }
    }

    @Override // X.YQ5, X.X10
    public final int LLLILZJ(Cert cert) {
        YQ6 yq6;
        YBH ybh;
        C63922P6w.LIZ("TECamera2", "close...");
        if (this.LJJIL == 1) {
            if (this.LJJJJIZL) {
                this.LJJJJI = true;
                return -114;
            }
            return -114;
        }
        LJII(cert);
        YQ7 yq7 = this.LJJJIL;
        if (yq7 != null) {
            if (yq7.LJII.LJLLL && (ybh = (yq6 = yq7.LJI).LJJJJ) != null) {
                ybh.LIZJ(yq7.LJJJJLL, yq6.LIZLLL(VKA.UNREGISTER_SENSOR));
            }
            HandlerThread handlerThread = yq7.LJJIIJZLJL;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                yq7.LJJIIJZLJL = null;
                yq7.LJJIIJ = null;
                C63922P6w.LIZLLL("TECameraModeBase", "releaseCameraThread");
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override // X.YQ5, X.X10
    public final void LLLIZZ(boolean z) {
        YQ7 yq7;
        C63922P6w.LIZLLL("TECamera2", "setAutoFocusLock...");
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore setAutoFocusLock operation.");
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null || yq7.LIZ == null) {
            C63922P6w.LIZIZ("TECamera2", "setAutoFocusLock : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "setAutoFocusLock : camera is null.");
        } else {
            if (yq7.LIZJ == null || yq7.LIZLLL == null) {
                yq7.LJFF.LJ(yq7.LJIIIZ, yq7.LJII.LJLILLLLZI, -100, "setAutoFocusLock : Capture Session is null");
                return;
            }
            try {
                yq7.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                yq7.LJJJJIZL(yq7.LIZJ);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                yq7.LJFF.LJIIIIZZ(-434, -434, e.toString());
            }
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLJL(boolean z) {
        YQ7 yq7 = this.LJJJIL;
        if (yq7 == null) {
            C63922P6w.LIZIZ("TECamera2", "enableMulticamZoom failed, mode is null...");
            return;
        }
        if (!z && yq7.LJIILLIIL != 1.0f) {
            yq7.LJIILLIIL = 1.0f;
            if (Build.VERSION.SDK_INT >= 30) {
                if (yq7.LIZJ == null || yq7.LIZLLL == null) {
                    yq7.LJFF.LJ(yq7.LJIIIZ, yq7.LJII.LJLILLLLZI, -100, "enableMulticamZoom : Capture Session is null");
                    return;
                }
                yq7.LIZJ.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(yq7.LJIILLIIL));
                XS3 LJJJJIZL = yq7.LJJJJIZL(yq7.LIZJ);
                if (!LJJJJIZL.LIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: ");
                    LIZ.append(LJJJJIZL.LIZIZ);
                    C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
                    yq7.LJFF.LJIIIIZZ(-420, -420, LJJJJIZL.LIZIZ);
                    return;
                }
            }
            yq7.LJIJI = yq7.LJFF();
        }
        yq7.LJJIL = z;
    }

    @Override // X.YQ5, X.X10
    public final void LLLL(float f) {
        YQ7 yq7;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAperture : ");
        LIZ.append(f);
        C63922P6w.LIZ("TECamera2", X1D.LIZIZ(LIZ));
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore setAperture operation.");
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LJ("TECamera2", "setAperture : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "setAperture : camera is null.");
            return;
        }
        if (yq7.LIZJ == null || yq7.LIZLLL == null) {
            yq7.LJFF.LJIIIIZZ(-432, -432, "Capture Session is null");
        }
        if (yq7.LJIIZILJ().length == 1 && !Arrays.asList(yq7.LJIIZILJ()).contains(Float.valueOf(f))) {
            yq7.LJFF.LJIIIIZZ(-432, -432, "invalid aperture");
            return;
        }
        if (!((Integer) yq7.LIZJ.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
            yq7.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 0);
        }
        if (!((Integer) yq7.LIZJ.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
            yq7.LIZJ.set(CaptureRequest.CONTROL_MODE, 0);
        }
        yq7.LIZJ.set(CaptureRequest.LENS_APERTURE, Float.valueOf(f));
        XS3 LJJJJIZL = yq7.LJJJJIZL(yq7.LIZJ);
        if (LJJJJIZL.LIZ) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setAperture exception: ");
        LIZ2.append(LJJJJIZL.LIZIZ);
        C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ2));
        yq7.LJFF.LJIIIIZZ(-432, -432, LJJJJIZL.LIZIZ);
    }

    @Override // X.YQ5, X.X10
    public final void LLLLIIIILLL(TEFrameRateRange tEFrameRateRange) {
        YQ7 yq7;
        if (this.LJJIL != 3) {
            C63922P6w.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: setPreviewFpsRangeWhenRunning. Code: -439. Reason: session is not running");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid state, state = ");
            LIZ.append(this.LJJIL);
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, X1D.LIZIZ(LIZ));
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: setPreviewFpsRangeWhenRunning. Code: -439. Reason: camera is null");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "setPreviewFpsRangeWhenRunning : Camera is null.");
            return;
        }
        P9I p9i = yq7.LIZIZ;
        CameraCharacteristics cameraCharacteristics = yq7.LIZ;
        int i = tEFrameRateRange.min;
        int i2 = tEFrameRateRange.max;
        int i3 = yq7.LJII.LJLJJI;
        p9i.getClass();
        TEFrameRateRange LIZJ = P9I.LIZJ(cameraCharacteristics, i, i2, 3, i3);
        yq7.LIZJ.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(LIZJ.min), Integer.valueOf(LIZJ.max)));
        yq7.LJJJJIZL(yq7.LIZJ);
    }

    @Override // X.YQ5, X.X10
    public final void LLLLIL(float f) {
        YQ7 yq7;
        if (this.LJJIL == 1) {
            C63922P6w.LIZ("TECamera2", "Camera is opening, ignore setManualFocusDistance operation.");
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "setManualFocusDistance : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "setManualFocusDistance : camera is null.");
            return;
        }
        if (yq7.LIZJ == null || yq7.LIZLLL == null) {
            yq7.LJFF.LJIIIIZZ(-436, -436, "Capture Session is null");
        }
        if (f < 0.0f) {
            yq7.LJFF.LJIIIIZZ(-436, -436, "invalid distance");
            return;
        }
        yq7.LIZJ.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f));
        XS3 LJJJJIZL = yq7.LJJJJIZL(yq7.LIZJ);
        if (LJJJJIZL.LIZ) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setManualFocusDistance exception: ");
        LIZ.append(LJJJJIZL.LIZIZ);
        C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
        yq7.LJFF.LJIIIIZZ(-430, -430, LJJJJIZL.LIZIZ);
    }

    @Override // X.YQ5, X.X10
    public final void LLLLLLZ(int i) {
        super.LLLLLLZ(i);
        YQ7 yq7 = this.LJJJIL;
        if (yq7 == null) {
            C63922P6w.LIZIZ("TECamera2", "set scene failed, no mode...");
        } else {
            yq7.LJJIJIIJIL(i);
        }
    }

    @Override // X.X10
    public final void LLLLLLZZ(InterfaceC84149X0v interfaceC84149X0v) {
        YQ7 yq7;
        CameraCharacteristics cameraCharacteristics;
        if (!LJFF() || (yq7 = this.LJJJIL) == null || (cameraCharacteristics = yq7.LIZ) == null) {
            C63922P6w.LIZIZ("TECamera2", "queryShaderZoomStep: camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "queryShaderZoomStep: camera is null.");
        } else {
            if (this.LJJIJLIJ == null) {
                C63922P6w.LIZIZ("TECamera2", "DeviceProxy is null!");
                this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -420, "");
                return;
            }
            float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
            Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            try {
                CastFloatProtector.valueOf(new DecimalFormat("0.00").format(((rect.width() - ((int) (rect.width() / floatValue))) / floatValue) / rect.width()).trim()).floatValue();
            } catch (NumberFormatException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLLLZL(PZA pza) {
        YQ7 yq7;
        if (this.LJJIL == 1) {
            C63922P6w.LIZ("TECamera2", "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.LJJIL == 2) {
            C63922P6w.LIZ("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "takePicture : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "takePicture : camera is null.");
        } else {
            yq7.LJJJIL(pza, this.LJIIIIZZ);
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLLZI(long j) {
        YQ7 yq7;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setShutterTime : ");
        LIZ.append(j);
        C63922P6w.LIZ("TECamera2", X1D.LIZIZ(LIZ));
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore setShutterTime operation.");
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LJ("TECamera2", "setISO : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "setISO : camera is null.");
            return;
        }
        if (yq7.LIZJ == null || yq7.LIZLLL == null) {
            yq7.LJFF.LJIIIIZZ(-431, -431, "Capture Session is null");
        }
        if (j > yq7.LJJIII()[1] || j < yq7.LJJIII()[0]) {
            yq7.LJFF.LJIIIIZZ(-431, -431, "invalid shutter time");
            return;
        }
        if (!((Integer) yq7.LIZJ.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
            yq7.LIZJ.set(CaptureRequest.CONTROL_AE_MODE, 0);
        }
        if (!((Integer) yq7.LIZJ.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
            yq7.LIZJ.set(CaptureRequest.CONTROL_MODE, 0);
        }
        yq7.LIZJ.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j));
        XS3 LJJJJIZL = yq7.LJJJJIZL(yq7.LIZJ);
        if (LJJJJIZL.LIZ) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setShutterTime exception: ");
        LIZ2.append(LJJJJIZL.LIZIZ);
        C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ2));
        yq7.LJFF.LJIIIIZZ(-431, -431, LJJJJIZL.LIZIZ);
    }

    @Override // X.X10
    public final void LLLZ(boolean z) {
        YQ7 yq7;
        CameraCharacteristics cameraCharacteristics;
        C63922P6w.LIZLLL("TECamera2", "setAutoExposureLock...");
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore setAutoExposureLock operation.");
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null || (cameraCharacteristics = yq7.LIZ) == null) {
            C63922P6w.LIZIZ("TECamera2", "setAutoExposureLock : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "setAutoExposureLock : camera is null.");
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            C63922P6w.LJ("TECamera2", "Current camera doesn't support auto exposure lock.");
            this.LIZLLL.LJIIIIZZ(-426, -426, "Current camera doesn't support auto exposure lock.");
            return;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
        if (bool == null || !bool.booleanValue()) {
            C63922P6w.LJ("TECamera2", "Current camera doesn't support auto exposure lock.");
            this.LIZLLL.LJIIIIZZ(-426, -426, "Current camera doesn't support auto exposure lock.");
            return;
        }
        YQ7 yq72 = this.LJJJIL;
        if (yq72.LIZJ == null || yq72.LIZLLL == null) {
            yq72.LJFF.LJ(yq72.LJIIIZ, yq72.LJII.LJLILLLLZI, -100, "setExposureCompensation : Capture Session is null");
            return;
        }
        try {
            yq72.LIZJ.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z));
            yq72.LJJJJIZL(yq72.LIZJ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            yq72.LJFF.LJIIIIZZ(-427, -427, e.toString());
        }
    }

    @Override // X.X10
    public final void LLLZZIL(boolean z) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toggleTorch: ");
        LIZ.append(z);
        C63922P6w.LIZ("TECamera2", X1D.LIZIZ(LIZ));
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        LJJJJJ(i);
    }

    @Override // X.X10
    public final boolean setExposureCompensation(int i) {
        YQ7 yq7;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setExposureCompensation... value: ");
        LIZ.append(i);
        C63922P6w.LIZLLL("TECamera2", X1D.LIZIZ(LIZ));
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null || yq7.LIZ == null) {
            C63922P6w.LIZIZ("TECamera2", "setExposureCompensation : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -413, "setExposureCompensation : camera is null.");
            return false;
        }
        if (!this.LIZIZ.LLIIIL.LIZ()) {
            C63922P6w.LJ("TECamera2", "Current camera doesn't support setting exposure compensation.");
            this.LIZLLL.LJIIIIZZ(-414, -414, "Current camera doesn't support setting exposure compensation.");
            return false;
        }
        C63824P3c c63824P3c = this.LIZIZ.LLIIIL;
        if (i > c63824P3c.LIZ || i < c63824P3c.LIZJ) {
            StringBuilder LJ = C7MY.LJ("Invalid exposure compensation value: ", i, ", it must between [");
            LJ.append(this.LIZIZ.LLIIIL.LIZJ);
            LJ.append(", ");
            LJ.append(this.LIZIZ.LLIIIL.LIZ);
            LJ.append("].");
            String LIZIZ = X1D.LIZIZ(LJ);
            C63922P6w.LJ("TECamera2", LIZIZ);
            this.LIZLLL.LJIIIIZZ(-415, -415, LIZIZ);
            return false;
        }
        YQ7 yq72 = this.LJJJIL;
        yq72.LJIJ = i;
        if (yq72.LIZJ == null || yq72.LIZLLL == null) {
            yq72.LJFF.LJ(yq72.LJIIIZ, yq72.LJII.LJLILLLLZI, -413, "setExposureCompensation : Capture Session is null");
            return false;
        }
        Integer num = (Integer) yq72.LIZJ.get(CaptureRequest.CONTROL_AE_MODE);
        if (num != null && num.intValue() == 0) {
            C63922P6w.LJ("TECameraModeBase", "Can't set exposure compensation when ae mode is off.");
            return false;
        }
        if (yq72.LJII.LLIIIL.LIZIZ == i) {
            C63922P6w.LIZLLL("TECameraModeBase", "setExposureCompensation return, no need to set");
            return false;
        }
        yq72.LIZJ.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i));
        yq72.LJII.LLIIIL.LIZIZ = i;
        XS3 LJJJJIZL = yq72.LJJJJIZL(yq72.LIZJ);
        if (!LJJJJIZL.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setExposureCompensation failed: ");
            LIZ2.append(LJJJJIZL.LIZIZ);
            C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ2));
            yq72.LJFF.LJIIIIZZ(-413, -413, LJJJJIZL.LIZIZ);
        }
        return LJJJJIZL.LIZ;
    }

    @Override // X.X10
    public final void LLJZIJLIL(float f, InterfaceC87361YQj interfaceC87361YQj) {
        YQ7 yq7;
        if (this.LJJIL != 3) {
            C63922P6w.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid state, state = ");
            LIZ.append(this.LJJIL);
            this.LIZLLL.LJIIIIZZ(-420, -420, X1D.LIZIZ(LIZ));
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "startZoom : Camera is null.");
        } else {
            yq7.LJJIZ(f, interfaceC87361YQj);
        }
    }

    @Override // X.X10
    public final void LLL(String str, boolean z) {
        YQ7 yq7;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setWhileBalance: ");
        LIZ.append(str);
        C63922P6w.LIZ("TECamera2", X1D.LIZIZ(LIZ));
        if (this.LJJIL == 1) {
            C63922P6w.LJ("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
        } else if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LJ("TECamera2", "setWhileBalance : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "setWhileBalance : camera is null.");
        } else {
            yq7.LJJIJIL(str);
        }
    }

    @Override // X.X10
    public final TEFrameSizei LLLIIIL(float f, TEFrameSizei tEFrameSizei) {
        TEFrameSizei LIZ;
        if (this.LJJIL == 0 || this.LJJIL == 1) {
            C63922P6w.LIZIZ("TECamera2", "Camera is not opened, ignore getBestPreviewSize operation.");
            return null;
        }
        List<TEFrameSizei> LLLJ = LLLJ();
        P75 p75 = this.LJIILJJIL;
        if (p75 == null || (LIZ = ((P74) p75).LIZ(LLLJ)) == null) {
            if (tEFrameSizei != null) {
                return PDA.LIZIZ(LLLJ, tEFrameSizei);
            }
            return PDA.LIZJ(LLLJ, f);
        }
        return LIZ;
    }

    @Override // X.YQ5, X.X10
    public final void LLLILZ(InterfaceC87361YQj interfaceC87361YQj, boolean z) {
        YQ7 yq7;
        CameraCharacteristics cameraCharacteristics;
        boolean z2;
        if (!LJFF() || (yq7 = this.LJJJIL) == null || (cameraCharacteristics = yq7.LIZ) == null) {
            C63922P6w.LIZIZ("TECamera2", "queryZoomAbility: camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "queryZoomAbility: camera is null.");
            return;
        }
        if (this.LJJIJLIJ == null) {
            C63922P6w.LIZIZ("TECamera2", "DeviceProxy is null!");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -420, "");
            return;
        }
        float LIZLLL = P9I.LIZLLL(cameraCharacteristics, this.LIZIZ.LJZ);
        this.LJIIJJI = LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mMaxZoom: ");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", factor = ");
        LIZ.append(this.LIZIZ.LJZ);
        C63922P6w.LIZLLL("TECamera2", X1D.LIZIZ(LIZ));
        if (interfaceC87361YQj != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * LIZLLL)));
            int i = this.LIZIZ.LJLILLLLZI;
            if (LIZLLL > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC87361YQj.onZoomSupport(i, z2, false, LIZLLL, arrayList);
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLILZLLLI(int i, int i2) {
        YQ7 yq7 = this.LJJJIL;
        if (yq7 == null) {
            C63922P6w.LIZIZ("TECamera2", "set picture size failed, no mode...");
        } else {
            yq7.LJJIJIIJI(i, i2);
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLLLZ(float f, InterfaceC87361YQj interfaceC87361YQj) {
        YQ7 yq7;
        if (this.LJJIL != 3) {
            C63922P6w.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid state, state = ");
            LIZ.append(this.LJJIL);
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -420, X1D.LIZIZ(LIZ));
            return;
        }
        if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "zoomV2 : Camera is null.");
        } else {
            yq7.LJJJJZ(f, interfaceC87361YQj);
        }
    }

    @Override // X.YQ5, X.X10
    public final int LLLZIIL(C84134X0g c84134X0g, Cert cert) {
        int i;
        P7T.LIZ("VECamera-TECamera2-open");
        super.LLLZIIL(c84134X0g, cert);
        this.LJIJ = cert;
        this.LIZIZ = c84134X0g;
        if (this.LJJIL == 4) {
            LJII(cert);
        }
        try {
            LJIILIIL(1);
            int LJI = LJI(cert);
            this.LJIIIIZZ = c84134X0g.LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("open: camera face = ");
            LIZ.append(this.LJIIIIZZ);
            LIZ.append(", deferred surface: ");
            LIZ.append(c84134X0g.LLJILJILJ);
            LIZ.append(", ret: ");
            LIZ.append(LJI);
            C63922P6w.LIZLLL("TECamera2", X1D.LIZIZ(LIZ));
            if (LJI != 0) {
                LJIILIIL(0);
                LJII(cert);
                YQV yqv = this.LIZLLL;
                if (yqv != null) {
                    yqv.LIZIZ(c84134X0g.LJLILLLLZI, LJI, this, this.LJJJ);
                    return -1;
                }
                return -1;
            }
            this.LJJJJIZL = c84134X0g.LLIIZ;
            P7T.LIZIZ();
            return 0;
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("open: camera face = ");
            LIZ2.append(this.LJIIIIZZ);
            LIZ2.append(" failed: ");
            LIZ2.append(th.getMessage());
            C63922P6w.LIZIZ("TECamera2", X1D.LIZIZ(LIZ2));
            if (th instanceof CameraAccessException) {
                i = LJIIJJI(th);
            } else if (th instanceof IllegalArgumentException) {
                i = -405;
            } else if (th instanceof SecurityException) {
                i = -408;
            } else {
                i = -401;
            }
            LJIILIIL(4);
            LJII(cert);
            YQV yqv2 = this.LIZLLL;
            if (yqv2 != null) {
                yqv2.LIZIZ(c84134X0g.LJLILLLLZI, i, this, this.LJJJ);
            }
            return i;
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLJLL(int i, int i2, PZA pza) {
        YQ7 yq7;
        if (this.LJJIL == 1) {
            C63922P6w.LIZ("TECamera2", "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.LJJIL == 2) {
            C63922P6w.LIZ("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!LJFF() || (yq7 = this.LJJJIL) == null) {
            C63922P6w.LIZIZ("TECamera2", "takePicture : camera is null.");
            this.LIZLLL.LJ(this.LJJJ, this.LIZIZ.LJLILLLLZI, -439, "takePicture : camera is null.");
        } else {
            yq7.LJJJI(pza);
        }
    }

    public YQ6(int i, Context context, YQV yqv, Handler handler, PDC pdc) {
        super(context, yqv, handler, pdc);
        this.LJJJI = true;
        this.LJJJJL = new ConditionVariable();
        this.LJJJJLI = new YQE(this);
        this.LIZIZ = new C84134X0g(context, i);
        this.LJJJJ = new YBH(context);
        this.LJJIJLIJ = P9I.LIZIZ(i, context);
    }
}
