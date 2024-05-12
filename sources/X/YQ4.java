package X;

import Y.ARunnableS19S0101000_15;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YQ4 extends YQ5 {
    public Camera LJJIJLIJ;
    public Camera.Parameters LJJIL;
    public final C81105VsL LJJIZ;
    public String LJJJ;
    public int LJJJI;
    public List<TEFrameSizei> LJJJIL;
    public List<TEFrameSizei> LJJJJ;
    public List<TEFrameSizei> LJJJJI;
    public List<Integer> LJJJJIZL;
    public float LJJJJJ;
    public int LJJJJJL;
    public final AtomicBoolean LJJJJL;
    public long LJJJJLI;
    public int LJJJJLL;
    public boolean LJJJJZ;

    public static void LJFF(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "3958460556082944801");
        if (c03880Dg.LIZJ(100102, "android/hardware/Camera", "startPreview", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.startPreview();
            c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, true);
        }
    }

    public static void LJI(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "3958460556082944801");
        if (c03880Dg.LIZJ(100103, "android/hardware/Camera", "stopPreview", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.stopPreview();
            c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, true);
        }
    }

    @Override // X.YQ5, X.X10
    public final int LLJJJ() {
        return 1;
    }

    @Override // X.X10
    public final boolean LLLLLJIL() {
        Camera.Parameters parameters;
        try {
            if (this.LJJIJLIJ == null || (parameters = this.LJJIL) == null || parameters.getSupportedWhiteBalance() == null) {
                return false;
            }
            return this.LJJIL.isAutoWhiteBalanceLockSupported();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unsupported whileBalance!: ");
            LIZ.append(e.toString());
            C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ));
            return false;
        }
    }

    @Override // X.X10
    public final float[] LLLLLLLZIL() {
        float[] fArr = new float[2];
        Camera camera = this.LJJIJLIJ;
        if (camera == null) {
            C63922P6w.LIZIZ("TECamera1", "getFOV: camera device is null.");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "getFOV: camera device is null.");
            return new float[]{-2.0f, -2.0f};
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.LJJIL = parameters;
            fArr[0] = parameters.getVerticalViewAngle();
            fArr[1] = this.LJJIL.getHorizontalViewAngle();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Camera1:verticalFOV = ");
            LIZ.append(fArr[0]);
            LIZ.append(",horizontalFOV = ");
            LIZ.append(fArr[1]);
            C63922P6w.LIZ("TECamera1", X1D.LIZIZ(LIZ));
            return fArr;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // X.YQ5
    public final Bundle LIZJ() {
        List<TEFrameSizei> list;
        ArrayList<? extends Parcelable> arrayList;
        Camera.Parameters parameters;
        C84134X0g c84134X0g = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        c84134X0g.LLIIIILZ = C08380Uo.LIZ(LIZ, this.LIZIZ.LJLJJI, "", LIZ);
        Bundle LIZJ = super.LIZJ();
        if (LIZJ != null) {
            LIZJ.putParcelableArrayList("support_preview_sizes", (ArrayList) LLLJ());
            LIZJ.putParcelableArrayList("support_picture_sizes", (ArrayList) LLLLLLL());
            Camera.Parameters parameters2 = this.LJJIL;
            if (parameters2 == null || parameters2.getSupportedVideoSizes() == null) {
                ((ArrayList) this.LJJJJI).clear();
                list = this.LJJJJI;
            } else {
                list = LJII(this.LJJIL.getSupportedVideoSizes());
                this.LJJJJI = list;
            }
            LIZJ.putParcelableArrayList("support_video_sizes", (ArrayList) list);
            Camera.Parameters parameters3 = this.LJJIL;
            boolean z = true;
            if (parameters3 == null) {
                arrayList = null;
            } else {
                List<int[]> supportedPreviewFpsRange = parameters3.getSupportedPreviewFpsRange();
                arrayList = new ArrayList<>(supportedPreviewFpsRange.size());
                for (int[] iArr : supportedPreviewFpsRange) {
                    arrayList.add(new TEFrameRateRange(iArr[0], iArr[1]));
                }
            }
            LIZJ.putParcelableArrayList("camera_support_fps_range", arrayList);
            LIZJ.putParcelable("camera_preview_size", this.LIZIZ.LJZI);
            try {
                if (this.LJJIJLIJ == null || (parameters = this.LJJIL) == null || parameters.getSupportedFlashModes() == null) {
                    z = false;
                }
                LIZJ.putBoolean("camera_torch_supported", z);
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Get camera torch information failed: ");
                LIZ2.append(e.toString());
                C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ2));
                LIZJ.putBoolean("camera_torch_supported", false);
            }
        }
        return LIZJ;
    }

    @Override // X.YQ5
    public final int LJ() {
        int i = this.LJIIJ;
        if (i < 0) {
            i = PDA.LJIIL(this.LJFF);
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.LJII = this.LJIIIIZZ;
        try {
            Camera.getCameraInfo(this.LIZIZ.LJLJJLL, cameraInfo);
            if (this.LJII == 1) {
                int i2 = (cameraInfo.orientation + i) % 360;
                this.LJIIIZ = i2;
                this.LJIIIZ = ((360 - i2) + 180) % 360;
            } else {
                this.LJIIIZ = ((cameraInfo.orientation - i) + 360) % 360;
            }
            return this.LJIIIZ;
        } catch (Exception e) {
            YQV yqv = this.LIZLLL;
            StringBuilder LIZ = X1D.LIZ();
            yqv.LJ(this.LJJIJLIJ, 1, -405, KMP.LJFF(LIZ, "getFrameOrientation :", e, LIZ));
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0361, code lost:
    
        if (r7.contains("auto") != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x037f, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x037c, code lost:
    
        if (r7.contains("auto") != false) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIIZ() {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YQ4.LJIIIZ():int");
    }

    @Override // X.X10
    public final void LLJJL() {
        C63922P6w.LIZ("TECamera1", "cancelFocus...");
        Camera camera = this.LJJIJLIJ;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.YQ5, X.X10
    public final boolean LLLIIII() {
        Camera.Parameters parameters;
        C63922P6w.LIZLLL("TECamera1", "isAutoFocusLockSupported...");
        Camera camera = this.LJJIJLIJ;
        if (camera != null && (parameters = this.LJJIL) != null && this.LIZJ) {
            try {
                if (parameters.getSupportedFocusModes().contains("fixed")) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                this.LIZLLL.LJIIIIZZ(-433, -433, "isAutoFocusLockSupported failed");
                return false;
            }
        }
        this.LIZLLL.LJ(camera, 1, -439, "setAutoFocusLock failed. ： Camera is null.");
        return false;
    }

    @Override // X.YQ5, X.X10
    public final List<TEFrameSizei> LLLJ() {
        Camera.Parameters parameters = this.LJJIL;
        if (parameters == null) {
            this.LJJJIL.clear();
            return this.LJJJIL;
        }
        List<TEFrameSizei> LJII = LJII(parameters.getSupportedPreviewSizes());
        this.LJJJIL = LJII;
        return LJII;
    }

    @Override // X.YQ5, X.X10
    public final int[] LLLJIL() {
        Camera camera = this.LJJIJLIJ;
        if (camera != null) {
            try {
                camera.getParameters().getPreviewFpsRange(r2);
                int[] iArr = {iArr[0] / 1000, iArr[1] / 1000};
                return iArr;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        return null;
    }

    @Override // X.YQ5, X.X10
    public final void LLLLIIL() {
        P7T.LIZ("TECamera1-collectCameraCapabilities");
        if (this.LIZIZ.LLJJJ && !this.LJIJJLI) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                if (this.LJJIL != null) {
                    this.LJIJJ.putOpt("camera_id", Integer.valueOf(this.LIZIZ.LJLJJLL));
                    if (this.LJJIL.isZoomSupported()) {
                        this.LJIJJ.putOpt("camera_zoom_max_ability", Integer.valueOf(this.LJJIL.getMaxZoom()));
                    }
                    if (!this.LJJIL.isVideoStabilizationSupported()) {
                        this.LJIJJ.putOpt("camera_stabilization", -1);
                    } else {
                        this.LJIJJ.putOpt("camera_stabilization", 1);
                    }
                    List<TEFrameSizei> LLLJ = LLLJ();
                    if (LLLJ != null) {
                        YQK yqk = this.LJIJI;
                        YQS yqs = YQS.PREVIEW_SIZE;
                        YPY ypy = YPY.STRING;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(this.LIZIZ.LLIIIILZ);
                        LIZ.append("=");
                        LIZ.append(LLLJ.toString());
                        C87364YQm c87364YQm = new C87364YQm(yqs, ypy, X1D.LIZIZ(LIZ));
                        List<C87364YQm> list = yqk.LIZ;
                        if (list != null) {
                            ((ArrayList) list).add(c87364YQm);
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (TEFrameSizei tEFrameSizei : LLLJ) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.putOpt("width", Integer.valueOf(tEFrameSizei.width));
                            jSONObject.putOpt("height", Integer.valueOf(tEFrameSizei.height));
                            jSONArray.put(jSONObject);
                        }
                        this.LJIJJ.putOpt("preview_size_lit", jSONArray);
                    }
                    List<TEFrameSizei> LLLLLLL = LLLLLLL();
                    if (LLLLLLL != null) {
                        YQK yqk2 = this.LJIJI;
                        YQS yqs2 = YQS.PICTURE_SIZE;
                        YPY ypy2 = YPY.STRING;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(this.LIZIZ.LLIIIILZ);
                        LIZ2.append("=");
                        LIZ2.append(LLLLLLL.toString());
                        C87364YQm c87364YQm2 = new C87364YQm(yqs2, ypy2, X1D.LIZIZ(LIZ2));
                        List<C87364YQm> list2 = yqk2.LIZ;
                        if (list2 != null) {
                            ((ArrayList) list2).add(c87364YQm2);
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        for (TEFrameSizei tEFrameSizei2 : LLLLLLL) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.putOpt("width", Integer.valueOf(tEFrameSizei2.width));
                            jSONObject2.putOpt("height", Integer.valueOf(tEFrameSizei2.height));
                            jSONArray2.put(jSONObject2);
                        }
                        this.LJIJJ.putOpt("picture_size_list", jSONArray2);
                    }
                }
            } catch (Exception unused) {
            }
            List<int[]> supportedPreviewFpsRange = this.LJJIL.getSupportedPreviewFpsRange();
            StringBuilder LIZ3 = X1D.LIZ();
            StringBuilder sb = new StringBuilder(JBR.LJFF(LIZ3, this.LIZIZ.LLIIIILZ, "=", LIZ3));
            try {
                JSONArray jSONArray3 = new JSONArray();
                if (supportedPreviewFpsRange != null) {
                    for (int[] iArr : supportedPreviewFpsRange) {
                        sb.append("[");
                        sb.append(iArr[0] / 1000);
                        sb.append(",");
                        sb.append(iArr[1] / 1000);
                        sb.append("]");
                        if (supportedPreviewFpsRange.indexOf(iArr) != supportedPreviewFpsRange.size() - 1) {
                            sb.append(", ");
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.putOpt("fps_min", Integer.valueOf(iArr[0] / 1000));
                        jSONObject3.putOpt("fps_max", Integer.valueOf(iArr[1] / 1000));
                        jSONArray3.put(jSONObject3);
                    }
                    YQK yqk3 = this.LJIJI;
                    C87364YQm c87364YQm3 = new C87364YQm(YQS.FPS_RANGE, YPY.STRING, sb.toString());
                    List<C87364YQm> list3 = yqk3.LIZ;
                    if (list3 != null) {
                        ((ArrayList) list3).add(c87364YQm3);
                    }
                    this.LJIJJ.putOpt("fps_range_list", jSONArray3);
                }
            } catch (Exception unused2) {
            }
            this.LJIJI.LIZ();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("collectCameraCapabilities consume: ");
            LIZ4.append(currentTimeMillis2);
            C63922P6w.LIZLLL("TECamera1", X1D.LIZIZ(LIZ4));
            C87367YQp.LIZ("te_record_camera_collect_capbilities_cost", currentTimeMillis2);
            this.LJIJJLI = true;
            P7T.LIZIZ();
            return;
        }
        P7T.LIZIZ();
    }

    @Override // X.X10
    public final void LLLLLILLIL() {
        if (this.LJJIJLIJ != null && this.LJJIL != null) {
            C63922P6w.LIZ("TECamera1", "enableCaf...");
            try {
                if (this.LJJIL.getSupportedFocusModes().contains("continuous-video")) {
                    this.LJJIJLIJ.cancelAutoFocus();
                    this.LJJIL.setFocusMode("continuous-video");
                    this.LJJIJLIJ.setParameters(this.LJJIL);
                }
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Error: focusAtPoint failed: ");
                LIZ.append(th.toString());
                String LIZIZ = X1D.LIZIZ(LIZ);
                C63922P6w.LIZIZ("TECamera1", LIZIZ);
                this.LIZLLL.LJ(this.LJJIJLIJ, 1, -411, LIZIZ);
            }
        }
    }

    @Override // X.X10
    public final boolean LLLLLJLJLL() {
        Camera.Parameters parameters;
        C63922P6w.LIZLLL("TECamera1", "isAutoExposureLockSupported...");
        if (this.LJJIJLIJ != null && (parameters = this.LJJIL) != null && this.LIZJ) {
            return parameters.isAutoExposureLockSupported();
        }
        return false;
    }

    @Override // X.YQ5, X.X10
    public final List<TEFrameSizei> LLLLLLL() {
        Camera.Parameters parameters = this.LJJIL;
        if (parameters == null) {
            this.LJJJJ.clear();
            return this.LJJJJ;
        }
        List<TEFrameSizei> LJII = LJII(parameters.getSupportedPictureSizes());
        this.LJJJJ = LJII;
        return LJII;
    }

    @Override // X.YQ5, X.X10
    public final int[] LLLLZ() {
        Camera camera = this.LJJIJLIJ;
        if (camera != null) {
            try {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                return new int[]{previewSize.width, previewSize.height};
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // X.YQ5, X.X10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] LLLZI() {
        /*
            r4 = this;
            android.hardware.Camera r0 = r4.LJJIJLIJ
            r1 = 0
            if (r0 == 0) goto L12
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.Exception -> Le
            android.hardware.Camera$Size r3 = r0.getPictureSize()     // Catch: java.lang.Exception -> Le
            goto L13
        Le:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L12:
            r3 = r1
        L13:
            if (r3 != 0) goto L16
            return r1
        L16:
            r0 = 2
            int[] r2 = new int[r0]
            r1 = 0
            int r0 = r3.width
            r2[r1] = r0
            r1 = 1
            int r0 = r3.height
            r2[r1] = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YQ4.LLLZI():int[]");
    }

    @Override // X.YQ5, X.X10
    public final void LLLZZ() {
        Camera.Parameters parameters = this.LJJIL;
        if (parameters == null) {
            return;
        }
        if (this.LJJIJLIJ == null) {
            C63922P6w.LIZIZ("TECamera1", "setPreviewFpsRange : camera is null");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "setPreviewFpsRange : camera is null");
            return;
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int LIZ = TEFrameRateRange.LIZ(supportedPreviewFpsRange);
        C84134X0g c84134X0g = this.LIZIZ;
        int[] LJIILJJIL = PDA.LJIILJJIL(c84134X0g.LLIIL, c84134X0g.LJLJJI, c84134X0g.LJLJI.LIZIZ(LIZ), supportedPreviewFpsRange);
        this.LJJIL.setPreviewFpsRange(LJIILJJIL[0], LJIILJJIL[1]);
        this.LIZLLL.LJIIIIZZ(121, 0, new TEFrameRateRange(LJIILJJIL[0], LJIILJJIL[1]).toString());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Camera1:setPreviewFpsRange(");
        LIZ2.append(LJIILJJIL[0]);
        LIZ2.append(", ");
        LIZ2.append(LJIILJJIL[1]);
        LIZ2.append(") strategy=");
        LIZ2.append(this.LIZIZ.LLIIL);
        C63922P6w.LIZLLL("TECamera1", X1D.LIZIZ(LIZ2));
        try {
            this.LJJIJLIJ.setParameters(this.LJJIL);
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Failed to set parameters: ");
            LIZ3.append(e);
            C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ3));
        }
    }

    @Override // X.YQ5, X.X10
    public final int getFlashMode() {
        String str;
        Camera camera = this.LJJIJLIJ;
        if (camera != null) {
            try {
                if (this.LJJIL == null) {
                    this.LJJIL = camera.getParameters();
                }
                str = this.LJJIL.getFlashMode();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                str = null;
            }
            if ("on".equals(str)) {
                return 1;
            }
            if ("auto".equals(str)) {
                return 3;
            }
            if ("off".equals(str)) {
                return 0;
            }
            if ("torch".equals(str)) {
                return 2;
            }
            if ("red-eye".equals(str)) {
                return 4;
            }
        }
        return -1;
    }

    @Override // X.YQ5, X.X10
    public final boolean isSupportedExposureCompensation() {
        C63922P6w.LIZLLL("TECamera1", "isSupportedExposureCompensation...");
        if (this.LJJIJLIJ != null && this.LJJIL != null && this.LIZJ) {
            return this.LIZIZ.LLIIIL.LIZ();
        }
        return false;
    }

    @Override // X.YQ5, X.X10
    public final void stopCapture() {
        Handler handler;
        C63922P6w.LIZLLL("TECamera1", "Camera stopCapture...");
        P7T.LIZ("TECamera1-stopCapture");
        if (this.LIZJ && this.LJJIJLIJ != null) {
            this.LIZJ = false;
            this.LJJJJL.set(false);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                LJI(this.LJJIJLIJ);
                C87367YQp.LIZ("te_record_camera1_stop_preview_cost", System.currentTimeMillis() - currentTimeMillis);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("camera stopcapture failed: ");
                LIZ.append(e.getMessage());
                C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ));
            }
            this.LJJJJLI = 0L;
            this.LJJIII = 0;
            C84134X0g c84134X0g = this.LIZIZ;
            if (c84134X0g != null && (handler = this.LJ) != null && c84134X0g.LJLLLLLL) {
                handler.removeCallbacks(this.LJJIJL);
            }
            C63922P6w.LIZLLL("TECamera1", "Camera preview stopped!");
            this.LIZLLL.LIZ(this.LJJIJLIJ, "TECamera1 preview stoped");
        }
        P7T.LIZIZ();
    }

    @Override // X.X10
    public final boolean LLJL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ.LJLILLLLZI);
        LIZ.append("_");
        LIZ.append(this.LIZIZ.LJLJJI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isTorchSupported key = ");
        LIZ2.append(LIZIZ);
        C63922P6w.LIZ("TECamera1", X1D.LIZIZ(LIZ2));
        Bundle bundle = (Bundle) ((HashMap) this.LJIIZILJ).get(LIZIZ);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:109|110|(9:112|(1:114)(2:127|(1:129))|115|116|117|(1:119)|121|(1:123)|124)|130|115|116|117|(0)|121|(0)|124) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0342, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0343, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032c A[Catch: Exception -> 0x0342, TRY_LEAVE, TryCatch #1 {Exception -> 0x0342, blocks: (B:117:0x0328, B:119:0x032c), top: B:116:0x0328 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x034a  */
    @Override // X.YQ5, X.X10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIL() {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YQ4.LLLIL():void");
    }

    @Override // X.YQ5, X.X10
    public final JSONObject LLLLIILL() {
        return this.LJIJJ;
    }

    public static List<TEFrameSizei> LJII(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    public final int LJIIIIZZ(int i) {
        int size = this.LJJJJIZL.size() - 1;
        int i2 = 0;
        while (size - i2 > 1) {
            int i3 = (i2 + size) / 2;
            if (i > ((Integer) ListProtector.get(this.LJJJJIZL, i3)).intValue()) {
                i2 = i3;
            } else {
                size = i3;
            }
        }
        if (Math.abs(i - ((Integer) ListProtector.get(this.LJJJJIZL, i2)).intValue()) > Math.abs(i - ((Integer) ListProtector.get(this.LJJJJIZL, size)).intValue())) {
            return size;
        }
        return i2;
    }

    public final void LJIIJ(int i) {
        C63922P6w.LIZ("TECamera1", "Camera start face detect");
        if (this.LIZJ && this.LJJIJLIJ != null && this.LJJIL.getMaxNumDetectedFaces() > 0) {
            try {
                if (i == 1) {
                    if (this.LJII == 1) {
                        this.LJJIJLIJ.startFaceDetection();
                        C63922P6w.LIZLLL("TECamera1", "use faceae for front");
                    }
                } else if (i == 2) {
                    if (this.LJII == 0) {
                        this.LJJIJLIJ.startFaceDetection();
                        C63922P6w.LIZLLL("TECamera1", "use faceae for rear");
                    }
                } else if (i == 3) {
                    this.LJJIJLIJ.startFaceDetection();
                    C63922P6w.LIZLLL("TECamera1", "use faceae for all");
                }
            } catch (Exception unused) {
                C63922P6w.LIZIZ("TECamera1", "camera start face detect failed");
            }
        }
    }

    @Override // X.YQ5, X.X10
    public final void LJJJJJ(int i) {
        String LIZIZ;
        int i2;
        String str;
        int i3;
        Handler handler;
        int i4 = 0;
        if (this.LJJIJLIJ == null) {
            C63922P6w.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            C63922P6w.LIZIZ("TECamera1", "switchFlashMode failed: Camera is not ready!");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "switchFlashMode failed: Camera is not ready!");
            YQV yqv = this.LIZLLL;
            if (i != 0) {
                i4 = 1;
            }
            yqv.LJII(i4, "switchFlashMode failed: Camera is not ready!");
            return;
        }
        if (this.LJJJJLI != 0 && System.currentTimeMillis() - this.LJJJJLI < 200 && (handler = this.LJ) != null) {
            handler.postDelayed(new ARunnableS19S0101000_15(this, i, 5), 200L);
            return;
        }
        this.LJJJJZ = false;
        try {
            Camera.Parameters parameters = this.LJJIJLIJ.getParameters();
            this.LJJIL = parameters;
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null) {
                if (i == 0) {
                    str = "off";
                } else if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                str = "red-eye";
                            }
                        } else {
                            str = "auto";
                        }
                    } else {
                        str = "torch";
                    }
                } else {
                    str = "on";
                    this.LJJJJZ = true;
                }
                if (supportedFlashModes.contains(str)) {
                    YQV yqv2 = this.LIZLLL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("camera1 will change flash mode ");
                    LIZ.append(str);
                    yqv2.LJIIIIZZ(104, 0, X1D.LIZIZ(LIZ));
                    this.LJJIL.setFlashMode(str);
                    this.LJJIJLIJ.setParameters(this.LJJIL);
                    if ("off".equalsIgnoreCase(str) && this.LIZIZ.LLIIII.getBoolean("enableSwitchFlashSleepToTakeEffect")) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                    YQV yqv3 = this.LIZLLL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("camera1 did change flash mode ");
                    LIZ2.append(str);
                    yqv3.LJIIIIZZ(105, 0, X1D.LIZIZ(LIZ2));
                    YQV yqv4 = this.LIZLLL;
                    if (i == 0) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    yqv4.LJI(i3, "torch success");
                    return;
                }
            }
            if (supportedFlashModes == null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Camera does not support flash mode: ");
                LIZ3.append(i);
                LIZIZ = X1D.LIZIZ(LIZ3);
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Camera does not support flash mode: ");
                LIZ4.append(i);
                LIZ4.append("support list: ");
                LIZ4.append(supportedFlashModes.toString());
                LIZIZ = X1D.LIZIZ(LIZ4);
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: not support flash mode ");
            LIZ5.append(i);
            C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ5));
            C63922P6w.LIZIZ("TECamera1", LIZIZ);
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -419, LIZIZ);
            YQV yqv5 = this.LIZLLL;
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            yqv5.LJII(i2, LIZIZ);
        } catch (Exception e2) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: ");
            LIZ6.append(e2);
            C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ6));
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("Switch flash mode failed: ");
            LIZ7.append(e2.toString());
            String LIZIZ2 = X1D.LIZIZ(LIZ7);
            C63922P6w.LIZIZ("TECamera1", LIZIZ2);
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -418, LIZIZ2);
            YQV yqv6 = this.LIZLLL;
            if (i != 0) {
                i4 = 1;
            }
            yqv6.LJII(i4, LIZIZ2);
        }
    }

    @Override // X.X10
    public final void LLJJLIIIJLLLLLLLZ(int i) {
        C63922P6w.LJ("TECamera1", "Does not support switch mode for camera1");
        this.LIZLLL.LJIIIIZZ(-200, -200, "Does not support switch mode for camera1");
    }

    @Override // X.YQ5, X.X10
    public final void LLLFF(C84151X0x c84151X0x) {
        Camera.Parameters parameters;
        String str;
        Camera camera = this.LJJIJLIJ;
        if (camera == null) {
            C63922P6w.LIZIZ("TECamera1", "focusAtPoint: camera is null.");
            c84151X0x.LJIIJJI.LIZ(-439, this.LIZIZ.LJLJJI, "focusAtPoint: camera is null.");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "focusAtPoint: camera is null.");
            return;
        }
        boolean z = false;
        try {
            parameters = camera.getParameters();
            this.LJJIL = parameters;
            C81105VsL c81105VsL = this.LJJIZ;
            str = this.LJJJ;
            c81105VsL.getClass();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error: focusAtPoint failed: ");
            LIZ.append(e.toString());
            String LIZIZ = X1D.LIZIZ(LIZ);
            C63922P6w.LIZIZ("TECamera1", LIZIZ);
            c84151X0x.LJIIJJI.LIZ(-411, this.LIZIZ.LJLJJI, LIZIZ);
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -411, LIZIZ);
        }
        if (parameters != null) {
            if (!((ArrayList) C81105VsL.LIZLLL).contains(Build.BRAND.toLowerCase()) && parameters.getMaxNumFocusAreas() > 0 && parameters.getSupportedFocusModes().contains(str)) {
                if (c84151X0x.LJII) {
                    C81105VsL c81105VsL2 = this.LJJIZ;
                    Camera.Parameters parameters2 = this.LJJIL;
                    c81105VsL2.getClass();
                    if (parameters2 != null && parameters2.getMaxNumMeteringAreas() > 0) {
                        this.LJJIL.setMeteringAreas(this.LJJIZ.LIZ(c84151X0x.LIZ, c84151X0x.LIZIZ, c84151X0x.LJ, c84151X0x.LIZJ, c84151X0x.LIZLLL, this.LIZIZ.LJLJJL, c84151X0x.LJIIJ));
                    }
                }
                if (c84151X0x.LJI) {
                    Camera.Parameters parameters3 = this.LJJIL;
                    C81105VsL c81105VsL3 = this.LJJIZ;
                    Rect LIZIZ2 = c81105VsL3.LIZIZ(c84151X0x.LIZ, c84151X0x.LIZIZ, c84151X0x.LJ, 90.0f, c84151X0x.LIZJ, c84151X0x.LIZLLL, this.LIZIZ.LJLJJL, c84151X0x.LJIIJ);
                    if (((ArrayList) c81105VsL3.LIZIZ).size() > 0) {
                        ((ArrayList) c81105VsL3.LIZIZ).clear();
                    }
                    ((ArrayList) c81105VsL3.LIZIZ).add(new Camera.Area(LIZIZ2, 1000));
                    parameters3.setFocusAreas(c81105VsL3.LIZIZ);
                    this.LJJIJLIJ.cancelAutoFocus();
                    this.LJJIL.setFocusMode("auto");
                    if (this.LJJJJZ && !c84151X0x.LJIIIZ) {
                        this.LJJIL.setFlashMode("off");
                        z = true;
                    }
                    this.LJJIJLIJ.setParameters(this.LJJIL);
                    this.LJJIJLIJ.autoFocus(new YQN(this, c84151X0x));
                    if (z) {
                        try {
                            this.LJJIL.setFlashMode("on");
                            this.LJJIJLIJ.setParameters(this.LJJIL);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                this.LJJIJLIJ.setParameters(this.LJJIL);
                C63922P6w.LIZLLL("TECamera1", "focus is not enable!");
                return;
            }
        }
        C63922P6w.LIZIZ("TECamera1", "Error: not support focus.");
        this.LIZLLL.LJIIIIZZ(-412, -412, "Error: not support focus.");
        C81105VsL c81105VsL4 = this.LJJIZ;
        Camera.Parameters parameters4 = this.LJJIL;
        c81105VsL4.getClass();
        if (parameters4 != null && parameters4.getMaxNumMeteringAreas() > 0 && c84151X0x.LJII) {
            this.LJJIL.setMeteringAreas(this.LJJIZ.LIZ(c84151X0x.LIZ, c84151X0x.LIZIZ, c84151X0x.LJ, c84151X0x.LIZJ, c84151X0x.LIZLLL, this.LIZIZ.LJLJJL, c84151X0x.LJIIJ));
            this.LJJIJLIJ.setParameters(this.LJJIL);
        } else {
            c84151X0x.LJIIJJI.LIZ(-412, this.LIZIZ.LJLJJI, "Error: not support focus.");
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLII(Cert cert) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("force close camera: ");
        LIZ.append(this.LJJIJLIJ);
        C63922P6w.LIZLLL("TECamera1", X1D.LIZIZ(LIZ));
        try {
            Camera camera = this.LJJIJLIJ;
            if (camera != null) {
                R3A.LJFF(camera, cert);
                this.LJJIJLIJ = null;
            }
        } catch (Exception unused) {
            C63922P6w.LIZIZ("TECamera1", "force close camera failed");
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLIILIL(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = (Bundle) ((HashMap) this.LJIIZILJ).get(this.LIZIZ.LLIIIILZ);
        for (String str : bundle.keySet()) {
            if (C84001Wxx.LIZ(C16880lQ.LLJJIII(bundle, str), str) && TextUtils.equals(str, "support_light_soft")) {
                bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
            }
        }
    }

    @Override // X.YQ5, X.X10
    public final int LLLILZJ(Cert cert) {
        Handler handler;
        P7T.LIZ("TECamera1-close");
        this.LJJJJZ = false;
        C63922P6w.LIZLLL("TECamera1", "Camera close start...");
        if (this.LJJIJLIJ != null) {
            if (this.LIZJ) {
                try {
                    if (this.LIZIZ.LLJJJJLIIL) {
                        if (getFlashMode() == 2) {
                            if (this.LJJIL == null) {
                                this.LJJIL = this.LJJIJLIJ.getParameters();
                            }
                            this.LJJIL.setFlashMode("off");
                            this.LJJIJLIJ.setParameters(this.LJJIL);
                        }
                    } else {
                        C63922P6w.LIZLLL("TECamera1", "Camera close torch...");
                        Camera.Parameters parameters = this.LJJIJLIJ.getParameters();
                        this.LJJIL = parameters;
                        parameters.setFlashMode("off");
                        this.LJJIJLIJ.setParameters(this.LJJIL);
                    }
                    C63922P6w.LIZLLL("TECamera1", "Camera stopPreview...");
                    long currentTimeMillis = System.currentTimeMillis();
                    LJI(this.LJJIJLIJ);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    C63922P6w.LIZLLL("TECamera1", "Camera stopPreview end...");
                    this.LJJIII = 0;
                    C84134X0g c84134X0g = this.LIZIZ;
                    if (c84134X0g != null && (handler = this.LJ) != null && c84134X0g.LJLLLLLL) {
                        handler.removeCallbacks(this.LJJIJL);
                    }
                    C87367YQp.LIZ("te_record_camera1_stop_preview_cost", currentTimeMillis2);
                    if (this.LJI.LIZJ() == 1) {
                        this.LJI.LIZLLL().setOnFrameAvailableListener(null, null);
                    } else if (this.LJI.LIZJ() == 4) {
                        this.LJJIJLIJ.setPreviewCallbackWithBuffer(null);
                    }
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Close camera failed: ");
                    LIZ.append(e.getMessage());
                    C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ));
                }
                this.LIZJ = false;
            }
            try {
                this.LJJIJLIJ.setErrorCallback(null);
                LIZ(108, "will close camera1");
                R3A.LJFF(this.LJJIJLIJ, cert);
                LIZ(109, "did close camera1");
            } catch (Exception e2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Camera release failed: ");
                LIZ2.append(e2.getMessage());
                C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ2));
            }
            this.LJJJJL.set(false);
            this.LJJIJLIJ = null;
            C63922P6w.LIZLLL("TECamera1", "Camera closed end!");
            this.LIZLLL.LJFF(1, this, this.LJJIJLIJ);
        }
        this.LJIJ = null;
        P7T.LIZIZ();
        return 0;
    }

    @Override // X.YQ5, X.X10
    public final void LLLIZZ(boolean z) {
        C63922P6w.LIZLLL("TECamera1", "setAutoFocusLock...");
        Camera camera = this.LJJIJLIJ;
        if (camera != null && this.LJJIL != null && this.LIZJ) {
            if (!LLLIIII()) {
                C63922P6w.LJ("TECamera1", "Current camera doesn't support af lock.");
                this.LIZLLL.LJIIIIZZ(-433, -433, "Current camera doesn't support af lock.");
                return;
            }
            try {
                if (!z) {
                    this.LJJIL.setFocusMode("continuous-video");
                } else {
                    this.LJJIL.setFocusMode("fixed");
                }
                this.LJJIJLIJ.setParameters(this.LJJIL);
                return;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Error: setAutoFocusLock failed: ");
                LIZ.append(e.toString());
                String LIZIZ = X1D.LIZIZ(LIZ);
                C63922P6w.LIZIZ("TECamera1", LIZIZ);
                this.LIZLLL.LJIIIIZZ(-427, -427, LIZIZ);
                return;
            }
        }
        this.LIZLLL.LJ(camera, 1, -439, "setAutoFocusLock failed. ： Camera is null.");
    }

    @Override // X.YQ5, X.X10
    public final void LLLLIIIILLL(TEFrameRateRange tEFrameRateRange) {
        Camera camera = this.LJJIJLIJ;
        if (camera == null) {
            C63922P6w.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: setPreviewFpsRangeWhenRunning. Code: -439. Reason: mCameraDevice is null");
            C63922P6w.LIZIZ("TECamera1", "setPreviewFpsRangeWhenRunning : Camera is null!");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "setPreviewFpsRangeWhenRunning : Camera is null!");
            return;
        }
        try {
            if (this.LJJIL == null) {
                this.LJJIL = camera.getParameters();
            }
            List<int[]> supportedPreviewFpsRange = this.LJJIL.getSupportedPreviewFpsRange();
            int[] LJIILJJIL = PDA.LJIILJJIL(3, this.LIZIZ.LJLJJI, tEFrameRateRange.LIZIZ(TEFrameRateRange.LIZ(supportedPreviewFpsRange)), supportedPreviewFpsRange);
            this.LJJIL.setPreviewFpsRange(LJIILJJIL[0], LJIILJJIL[1]);
            this.LIZLLL.LJIIIIZZ(121, 0, new TEFrameRateRange(LJIILJJIL[0], LJIILJJIL[1]).toString());
            this.LJJIJLIJ.setParameters(this.LJJIL);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[VE_UI_TEST]Failed event: setPreviewFpsRangeWhenRunning. Code: -420. Reason: ");
            LIZ.append(e);
            C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setPreviewFpsRangeWhenRunning failed : ");
            LIZ2.append(e.toString());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            C63922P6w.LIZIZ("TECamera1", LIZIZ);
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, LIZIZ);
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLLLLZ(int i) {
        super.LLLLLLZ(i);
        if (i == 0) {
            if (this.LIZIZ.LLILLL) {
                try {
                    this.LJJIL.setRecordingHint(false);
                    this.LJJIJLIJ.setParameters(this.LJJIL);
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            return;
        }
        if (i == 1) {
            if (this.LIZIZ.LLILLL) {
                try {
                    this.LJJIL.setRecordingHint(true);
                    this.LJJIJLIJ.setParameters(this.LJJIL);
                    return;
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("un support scene");
    }

    @Override // X.X10
    public final void LLLLLLZZ(InterfaceC84149X0v interfaceC84149X0v) {
        if (interfaceC84149X0v == null) {
            C63922P6w.LIZIZ("TECamera1", "ShaderZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.LJJIJLIJ;
        if (camera == null) {
            C63922P6w.LIZIZ("TECamera1", "queryShaderZoomStep : Camera is null!");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "queryShaderZoomStep : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters != null && parameters.isZoomSupported()) {
                int maxZoom = parameters.getMaxZoom();
                if (maxZoom > 99) {
                    maxZoom = 99;
                }
                List<Integer> zoomRatios = parameters.getZoomRatios();
                if (maxZoom > 0) {
                    Math.pow(((((Integer) ListProtector.get(zoomRatios, 1)).intValue() - ((Integer) ListProtector.get(zoomRatios, 0)).intValue()) / 100.0f) + 1.0f, 0.5d);
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Query shader zoom step failed : ");
            LIZ.append(e.toString());
            String LIZIZ = X1D.LIZIZ(LIZ);
            C63922P6w.LIZIZ("TECamera1", LIZIZ);
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -420, LIZIZ);
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLLLZL(PZA pza) {
        if (this.LJJIJLIJ == null) {
            C63922P6w.LIZIZ("TECamera1", "takePicture: camera is null.");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "takePicture: camera is null.");
            return;
        }
        try {
            this.LIZJ = false;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("takePicture size: ");
            LIZ.append(this.LIZIZ.LJZL.toString());
            C63922P6w.LIZLLL("TECamera1", X1D.LIZIZ(LIZ));
            this.LJJIJLIJ.takePicture(null, null, new YQ1(this, System.currentTimeMillis(), pza));
        } catch (Exception e) {
            C87365YQn.LIZ(e);
            if (pza != null) {
                ((C63973P8v) pza).LIZIZ(YQ5.LIZIZ(-1000, e));
            }
        }
    }

    @Override // X.X10
    public final void LLLZ(boolean z) {
        Camera.Parameters parameters;
        C63922P6w.LIZLLL("TECamera1", "setAutoExposureLock...");
        Camera camera = this.LJJIJLIJ;
        if (camera != null && (parameters = this.LJJIL) != null && this.LIZJ) {
            if (!parameters.isAutoExposureLockSupported()) {
                C63922P6w.LJ("TECamera1", "Current camera doesn't support ae lock.");
                this.LIZLLL.LJIIIIZZ(-426, -426, "Current camera doesn't support ae lock.");
                return;
            }
            try {
                this.LJJIL.setAutoExposureLock(z);
                this.LJJIJLIJ.setParameters(this.LJJIL);
                return;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Error: setAutoExposureLock failed: ");
                LIZ.append(e.toString());
                String LIZIZ = X1D.LIZIZ(LIZ);
                C63922P6w.LIZIZ("TECamera1", LIZIZ);
                this.LIZLLL.LJIIIIZZ(-427, -427, LIZIZ);
                return;
            }
        }
        this.LIZLLL.LJ(camera, 1, -439, "setAutoExposureLock failed. ： Camera is null.");
    }

    @Override // X.X10
    public final void LLLZIL(InterfaceC87361YQj interfaceC87361YQj) {
        Camera camera = this.LJJIJLIJ;
        if (camera == null) {
            C63922P6w.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -439. Reason: mCameraDevice is null");
            C63922P6w.LIZIZ("TECamera1", "stopZoom : Camera is null!");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "stopZoom : Camera is null!");
            return;
        }
        try {
            if (camera.getParameters().isSmoothZoomSupported() && interfaceC87361YQj != null && interfaceC87361YQj.enableSmooth()) {
                this.LJJIJLIJ.stopSmoothZoom();
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -420. Reason: ");
            LIZ.append(e);
            C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Stop zoom failed : ");
            LIZ2.append(e.toString());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            C63922P6w.LIZIZ("TECamera1", LIZIZ);
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -420, LIZIZ);
        }
    }

    @Override // X.X10
    public final void LLLZZIL(boolean z) {
        String str;
        int i = 0;
        this.LJJJJZ = false;
        if (this.LJJIJLIJ == null) {
            C63922P6w.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            C63922P6w.LIZIZ("TECamera1", "toggleTorch : Camera is not ready!");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "toggleTorch : Camera is not ready!");
            this.LIZLLL.LJII(z ? 1 : 0, "toggleTorch : Camera is not ready!");
            return;
        }
        if (this.LIZIZ.LJLJJI == 1) {
            C63922P6w.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
            C63922P6w.LJ("TECamera1", "Front camera does not support torch!");
            this.LIZLLL.LJIIIIZZ(-416, -416, "Front camera does not support torch!");
            this.LIZLLL.LJII(z ? 1 : 0, "Front camera does not support torch!");
            return;
        }
        try {
            YQV yqv = this.LIZLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("camera1 will change flash mode ");
            LIZ.append(z);
            yqv.LJIIIIZZ(104, 0, X1D.LIZIZ(LIZ));
            Camera.Parameters parameters = this.LJJIJLIJ.getParameters();
            this.LJJIL = parameters;
            if (!z) {
                str = "off";
            } else {
                str = "torch";
            }
            parameters.setFlashMode(str);
            this.LJJIJLIJ.setParameters(this.LJJIL);
            YQV yqv2 = this.LIZLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("camera1 did change flash mode ");
            LIZ2.append(z);
            yqv2.LJIIIIZZ(105, 0, X1D.LIZIZ(LIZ2));
            YQV yqv3 = this.LIZLLL;
            if (z) {
                i = 1;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("toggleTorch ");
            LIZ3.append(z);
            yqv3.LJI(i, X1D.LIZIZ(LIZ3));
        } catch (Exception e) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -417. Reason: ");
            LIZ4.append(e);
            C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ4));
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("Toggle torch failed: ");
            LIZ5.append(e.toString());
            String LIZIZ = X1D.LIZIZ(LIZ5);
            C63922P6w.LIZIZ("TECamera1", LIZIZ);
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -417, LIZIZ);
            this.LIZLLL.LJII(z ? 1 : 0, LIZIZ);
        }
    }

    @Override // X.X10
    public final boolean setExposureCompensation(int i) {
        String str;
        this.LJJJJJL = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setExposureCompensation... value: ");
        LIZ.append(i);
        C63922P6w.LIZLLL("TECamera1", X1D.LIZIZ(LIZ));
        int i2 = -413;
        if (this.LJJIJLIJ != null && this.LJJIL != null && this.LIZJ && this.LIZIZ.LLIIIL.LIZ()) {
            C63824P3c c63824P3c = this.LIZIZ.LLIIIL;
            if (i > c63824P3c.LIZ || i < c63824P3c.LIZJ) {
                this.LIZLLL.LJ(this.LJJIJLIJ, 1, -415, KMP.LJ("Invalid exposure: ", i));
                return false;
            }
            try {
                this.LJJIL.setExposureCompensation(i);
                this.LJJIJLIJ.setParameters(this.LJJIL);
                this.LIZIZ.LLIIIL.LIZIZ = this.LJJIL.getExposureCompensation();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("EC = ");
                LIZ2.append(this.LIZIZ.LLIIIL.LIZIZ);
                LIZ2.append(", EV = ");
                LIZ2.append(r2.LIZIZ * this.LIZIZ.LLIIIL.LIZLLL);
                C63922P6w.LIZ("TECamera1", X1D.LIZIZ(LIZ2));
                return true;
            } catch (Exception e) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Error: setExposureCompensation failed: ");
                LIZ3.append(e.toString());
                str = X1D.LIZIZ(LIZ3);
                this.LIZLLL.LJ(this.LJJIJLIJ, 1, -413, str);
            }
        } else {
            Camera camera = this.LJJIJLIJ;
            if (camera == null || this.LJJIL == null || !this.LIZJ) {
                str = "setExposureCompensation ： Camera is null.";
                this.LIZLLL.LJ(camera, 1, -439, "setExposureCompensation ： Camera is null.");
            } else {
                i2 = -414;
                str = "Unsupported exposure compensation!";
            }
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, i2, str);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("setExposureCompensation failed: ");
        LIZ4.append(str);
        C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ4));
        return false;
    }

    @Override // X.X10
    public final void LLJZIJLIL(float f, InterfaceC87361YQj interfaceC87361YQj) {
        Camera camera = this.LJJIJLIJ;
        if (camera == null) {
            C63922P6w.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: mCameraDevice is null");
            C63922P6w.LIZIZ("TECamera1", "startZoom : Camera is null!");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "startZoom : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.LJJIL = parameters;
            if (!parameters.isZoomSupported() && !this.LJJIL.isSmoothZoomSupported()) {
                C63922P6w.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -421. Reason: camera is not support zoom");
                C63922P6w.LIZIZ("TECamera1", "Camera is not support zoom!");
                this.LIZLLL.LJ(this.LJJIJLIJ, 1, -421, "Camera is not support zoom!");
                return;
            }
            int min = (int) Math.min(this.LJJIL.getMaxZoom(), f);
            if (this.LJJIL.isSmoothZoomSupported() && interfaceC87361YQj != null && interfaceC87361YQj.enableSmooth()) {
                this.LJJIJLIJ.startSmoothZoom(min);
                this.LJJIJLIJ.setZoomChangeListener(new C87362YQk(interfaceC87361YQj));
                return;
            }
            this.LJJIL.setZoom(min);
            this.LJJIJLIJ.setParameters(this.LJJIL);
            if (interfaceC87361YQj != null) {
                interfaceC87361YQj.onChange(1, min, true);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: ");
            LIZ.append(e);
            C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Start zoom failed : ");
            LIZ2.append(e.toString());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            C63922P6w.LIZIZ("TECamera1", LIZIZ);
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -420, LIZIZ);
        }
    }

    @Override // X.X10
    public final void LLL(String str, boolean z) {
        Camera camera = this.LJJIJLIJ;
        if (camera == null || !this.LIZJ) {
            C63922P6w.LIZIZ("TECamera1", "setWhileBalance : Camera is null!");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "setWhileBalance : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.LJJIL = parameters;
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            if (supportedWhiteBalance != null && supportedWhiteBalance.contains(str)) {
                this.LJJIL.setWhiteBalance(str);
                this.LJJIJLIJ.setParameters(this.LJJIL);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SupportWBList has no value: ");
                LIZ.append(str);
                String LIZIZ = X1D.LIZIZ(LIZ);
                C63922P6w.LIZIZ("TECamera1", LIZIZ);
                this.LIZLLL.LJ(this.LJJIJLIJ, 1, -424, LIZIZ);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Set WhileBalance failed: ");
            LIZ2.append(e.toString());
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            C63922P6w.LIZIZ("TECamera1", LIZIZ2);
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -424, LIZIZ2);
        }
    }

    @Override // X.X10
    public final TEFrameSizei LLLIIIL(float f, TEFrameSizei tEFrameSizei) {
        Camera camera = this.LJJIJLIJ;
        if (camera == null) {
            C63922P6w.LIZIZ("TECamera1", "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.LJJIL == null) {
            this.LJJIL = camera.getParameters();
        }
        if (tEFrameSizei != null) {
            return PDA.LIZIZ(LLLJ(), tEFrameSizei);
        }
        return PDA.LIZJ(LLLJ(), f);
    }

    @Override // X.YQ5, X.X10
    public final void LLLILZ(InterfaceC87361YQj interfaceC87361YQj, boolean z) {
        if (interfaceC87361YQj == null) {
            C63922P6w.LIZIZ("TECamera1", "ZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.LJJIJLIJ;
        if (camera == null) {
            C63922P6w.LIZIZ("TECamera1", "queryZoomAbility : Camera is null!");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "queryZoomAbility : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.LJIIJJI = parameters.getMaxZoom();
            if (z) {
                interfaceC87361YQj.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), ((Integer) ListProtector.get(this.LJJJJIZL, (int) r0)).intValue() / 100.0f, parameters.getZoomRatios());
            } else {
                interfaceC87361YQj.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), parameters.getMaxZoom(), parameters.getZoomRatios());
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Query zoom ability failed : ");
            LIZ.append(e.toString());
            String LIZIZ = X1D.LIZIZ(LIZ);
            C63922P6w.LIZIZ("TECamera1", LIZIZ);
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -420, LIZIZ);
        }
    }

    @Override // X.YQ5, X.X10
    public final void LLLILZLLLI(int i, int i2) {
        C84134X0g c84134X0g = this.LIZIZ;
        c84134X0g.LLFZ = true;
        TEFrameSizei tEFrameSizei = c84134X0g.LJZL;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
        stopCapture();
        LLLIL();
    }

    @Override // X.YQ5, X.X10
    public final void LLLLLZ(float f, InterfaceC87361YQj interfaceC87361YQj) {
        if (this.LJJJJIZL == null || this.LJJIJLIJ == null) {
            return;
        }
        float f2 = this.LJJJJJ * f;
        this.LJJJJJ = f2;
        try {
            if (f2 < ((Integer) ListProtector.get(r4, 0)).intValue()) {
                this.LJJJJJ = ((Integer) ListProtector.get(this.LJJJJIZL, 0)).intValue();
            }
            float f3 = this.LJJJJJ;
            List<Integer> list = this.LJJJJIZL;
            if (f3 > ((Integer) ListProtector.get(list, list.size() - 1)).intValue()) {
                List<Integer> list2 = this.LJJJJIZL;
                this.LJJJJJ = ((Integer) ListProtector.get(list2, list2.size() - 1)).intValue();
            }
            Camera.Parameters parameters = this.LJJIJLIJ.getParameters();
            if (parameters != null && parameters.isZoomSupported()) {
                int LJIIIIZZ = LJIIIIZZ((int) this.LJJJJJ);
                if (parameters.getZoom() == LJIIIIZZ) {
                    return;
                }
                parameters.setZoom(LJIIIIZZ);
                this.LJJIJLIJ.setParameters(parameters);
                if (interfaceC87361YQj == null) {
                    return;
                }
                interfaceC87361YQj.onChange(1, ((Integer) ListProtector.get(this.LJJJJIZL, LJIIIIZZ)).intValue() / 100.0f, true);
                return;
            }
            C63922P6w.LIZIZ("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: getParameters is null");
            C63922P6w.LIZIZ("TECamera1", "setZoom failed for getParameters null");
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: ");
            LIZ.append(e);
            C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setZoom failed, ");
            LIZ2.append(e.getMessage());
            C63922P6w.LIZIZ("TECamera1", X1D.LIZIZ(LIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0101 A[Catch: RuntimeException -> 0x020b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x020b, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x002c, B:8:0x0044, B:10:0x004b, B:12:0x004f, B:14:0x01fe, B:15:0x020a, B:17:0x0053, B:19:0x0057, B:21:0x005b, B:22:0x0064, B:25:0x0101, B:28:0x0115, B:29:0x014b, B:50:0x0111, B:51:0x0118, B:54:0x012c, B:55:0x013a, B:57:0x013e, B:61:0x0147, B:59:0x017d, B:65:0x0128, B:68:0x008f, B:69:0x00c2, B:71:0x00c6, B:75:0x00f2, B:73:0x00f6, B:27:0x0104, B:53:0x011b), top: B:2:0x001e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118 A[Catch: RuntimeException -> 0x020b, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x020b, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x002c, B:8:0x0044, B:10:0x004b, B:12:0x004f, B:14:0x01fe, B:15:0x020a, B:17:0x0053, B:19:0x0057, B:21:0x005b, B:22:0x0064, B:25:0x0101, B:28:0x0115, B:29:0x014b, B:50:0x0111, B:51:0x0118, B:54:0x012c, B:55:0x013a, B:57:0x013e, B:61:0x0147, B:59:0x017d, B:65:0x0128, B:68:0x008f, B:69:0x00c2, B:71:0x00c6, B:75:0x00f2, B:73:0x00f6, B:27:0x0104, B:53:0x011b), top: B:2:0x001e, inners: #1, #2 }] */
    @Override // X.YQ5, X.X10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLZIIL(X.C84134X0g r11, com.bytedance.bpea.basics.Cert r12) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YQ4.LLLZIIL(X.X0g, com.bytedance.bpea.basics.Cert):int");
    }

    @Override // X.YQ5, X.X10
    public final void LLJLL(int i, int i2, PZA pza) {
        Camera camera = this.LJJIJLIJ;
        if (camera == null) {
            C63922P6w.LIZIZ("TECamera1", "takePicture : camera is null");
            this.LIZLLL.LJ(this.LJJIJLIJ, 1, -439, "takePicture : camera is null");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.LJJIL = parameters;
            if (parameters.getPictureSize().width != i || this.LJJIL.getPictureSize().height != i2) {
                TEFrameSizei LJIIJJI = PDA.LJIIJJI(LJII(this.LJJIL.getSupportedPictureSizes()), this.LIZIZ.LJZI, new TEFrameSizei(i, i2));
                this.LJJIL.setPictureSize(LJIIJJI.width, LJIIJJI.height);
                List<Integer> supportedPictureFormats = this.LJJIL.getSupportedPictureFormats();
                if (this.LIZIZ.LLJJIII && supportedPictureFormats != null && supportedPictureFormats.contains(17)) {
                    this.LJJIL.setPictureFormat(17);
                } else {
                    this.LJJIL.setPictureFormat(256);
                    this.LJJIL.setJpegQuality(100);
                }
                this.LJJIJLIJ.setParameters(this.LJJIL);
            }
            this.LIZJ = false;
            this.LJJIJLIJ.takePicture(null, null, new YQ2(this, pza));
        } catch (Exception e) {
            C87365YQn.LIZ(e);
            if (pza != null) {
                ((C63973P8v) pza).LIZIZ(YQ5.LIZIZ(-1000, e));
            }
        }
    }

    public YQ4(Context context, YQV yqv, Handler handler, PDC pdc) {
        super(context, yqv, handler, pdc);
        this.LJJJ = "";
        this.LJJJIL = new ArrayList();
        this.LJJJJ = new ArrayList();
        this.LJJJJI = new ArrayList();
        this.LJJJJIZL = null;
        this.LJJJJJ = 100.0f;
        this.LJJJJJL = 0;
        this.LJJJJL = new AtomicBoolean(false);
        this.LJJJJLI = 0L;
        this.LJJJJLL = 0;
        this.LJJJJZ = false;
        this.LIZIZ = new C84134X0g(context, 1);
        this.LJJIZ = new C81105VsL();
        this.LJIJ = null;
    }
}
