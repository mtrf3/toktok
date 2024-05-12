package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VESize;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.X0f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84133X0f implements InterfaceC84100WzY, YR1, InterfaceC87361YQj, InterfaceC84149X0v {
    public VECameraSettings LJLIL;
    public C84134X0g LJLILLLLZI;
    public C84134X0g LJLJI;
    public Context LJLJJI;
    public X0Z LJLJJLL;
    public InterfaceC84139X0l LJLJL;
    public PDD LJLJLJ;
    public C169706lK<P6O> LJLL;
    public final TECameraCapture LJLLI;
    public P6J LJZI;
    public C84141X0n LJZL;
    public final VESize LJLJJL = new VESize(1280, 720);
    public P88 LJLJLLL = null;
    public final AtomicBoolean LJLLILLLL = new AtomicBoolean(false);
    public long LJLLJ = 0;
    public long LJLLL = 0;
    public long LJLLLL = 0;
    public boolean LJLLLLLL = false;
    public boolean LJLZ = false;
    public final Object LJZ = new Object();

    @Override // X.InterfaceC84100WzY
    public final int LIZ() {
        return LJJIJIL(false);
    }

    @Override // X.InterfaceC84100WzY
    public final void LJIIL() {
    }

    @Override // X.InterfaceC84100WzY
    public final void LJ() {
        this.LJLLI.downExposureCompensation();
    }

    @Override // X.InterfaceC84100WzY
    public final float LJFF() {
        return this.LJLLI.queryShaderZoomAbility(this);
    }

    @Override // X.InterfaceC84100WzY
    public final void LJIIJ() {
        this.LJLLI.upExposureCompensation();
    }

    @Override // X.InterfaceC84100WzY
    public final int LJIIJJI() {
        return this.LJLLI.queryZoomAbility(this, false);
    }

    @Override // X.InterfaceC84100WzY
    public final int LJIJI() {
        return this.LJLLI.stopZoom(this);
    }

    public final void LJJIIJ() {
        C78866UxK.LJIJ("VECameraCapture-destroy");
        this.LJLJJLL = null;
        this.LJZL = null;
        this.LJLJL = null;
        this.LJLJJI = null;
        this.LJZI = null;
        C84134X0g c84134X0g = this.LJLILLLLZI;
        if (c84134X0g != null) {
            c84134X0g.LJLIL = null;
            c84134X0g.LLIIII.clear();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[destroy] clean camera params: ");
            LIZ.append(this.LJLILLLLZI);
            P4Q.LJFF("VECameraCapture", X1D.LIZIZ(LIZ));
            this.LJLILLLLZI = null;
        }
        C84134X0g c84134X0g2 = this.LJLJI;
        if (c84134X0g2 != null) {
            c84134X0g2.LJLIL = null;
            c84134X0g2.LLIIII.clear();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[destroy] clean temp camera params: ");
            LIZ2.append(this.LJLJI);
            P4Q.LJFF("VECameraCapture", X1D.LIZIZ(LIZ2));
            this.LJLJI = null;
        }
        TECameraCapture.registerLogOutput(P4Q.LIZIZ, null);
        TECameraCapture.registerException(null);
        C78866UxK.LJJIIJ();
    }

    public final void LJJIIZ() {
        P4Q.LJFF("VECameraCapture", "newSurfaceTexture...");
        this.LJLLLLLL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJIJIIJIL() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84133X0f.LJJIJIIJIL():int");
    }

    @Override // X.InterfaceC84100WzY
    public final int LLLIILIL() {
        VECameraSettings.CAMERA_FACING_ID camera_facing_id;
        if (this.LJLILLLLZI.LJLJJI == 0) {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
        } else {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
        }
        return LJJIJL(camera_facing_id, null);
    }

    @Override // X.InterfaceC87361YQj
    public final boolean enableSmooth() {
        X0Z x0z = this.LJLJJLL;
        if (x0z != null && x0z.enableSmooth()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC84100WzY
    public final C63824P3c getCameraECInfo() {
        return this.LJLLI.getCameraECInfo();
    }

    @Override // X.InterfaceC84100WzY
    public final VECameraSettings.CAMERA_FACING_ID getCameraFacing() {
        return this.LJLIL.getCameraFacing();
    }

    @Override // X.InterfaceC84100WzY
    public final boolean isSupportedExposureCompensation() {
        return this.LJLLI.isSupportedExposureCompensation();
    }

    public C84133X0f() {
        PDE pde = new PDE(this);
        this.LJZI = new P6J(this);
        this.LJZL = new C84141X0n();
        this.LJLLI = new TECameraCapture(this, pde);
    }

    @Override // X.P6Q
    public final VESize LJI() {
        return this.LJLJJL;
    }

    @Override // X.P6Q
    public final VECameraSettings LLJJJJLIIL() {
        return this.LJLIL;
    }

    public static int LJJII(VECameraSettings.CAMERA_FACING_ID camera_facing_id) {
        switch (C84136X0i.LIZ[camera_facing_id.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                return 8;
        }
    }

    public static void LJJIJIIJI(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", 0);
            c.LIZ(str, "behavior", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC84100WzY
    public final int LIZIZ(float f) {
        return this.LJLLI.startZoom(f, this);
    }

    @Override // X.InterfaceC84100WzY
    public final boolean LIZJ(VESize vESize) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VECameraCapture-changePreviewSize(w");
        LIZ.append(vESize.width);
        LIZ.append(",h");
        LIZ.append(vESize.height);
        LIZ.append(")");
        C78866UxK.LJIJ(X1D.LIZIZ(LIZ));
        if (!this.LJLIL.getPreviewSize().equals(vESize)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("changePreviewSize, size = ");
            LIZ2.append(vESize);
            P4Q.LJFF("VECameraCapture", X1D.LIZIZ(LIZ2));
            LJIJJ(vESize);
            C78866UxK.LJJIIJ();
            return true;
        }
        C78866UxK.LJJIIJ();
        return false;
    }

    @Override // X.InterfaceC84100WzY
    public final void LIZLLL(X0Z x0z) {
        this.LJLJJLL = x0z;
    }

    @Override // X.InterfaceC84100WzY
    public final int LJII(VECameraSettings.CAMERA_FACING_ID camera_facing_id) {
        return LJJIJL(camera_facing_id, null);
    }

    @Override // X.P6Q
    public final void LJIIIIZZ(int i) {
        this.LJLLI.updateTextureId(i);
    }

    @Override // X.InterfaceC84100WzY
    public final int LJIIIZ(X07 x07) {
        return this.LJLLI.takePicture(new C63973P8v(x07, System.currentTimeMillis()));
    }

    @Override // X.InterfaceC84100WzY
    public final int LJIILIIL(VEFocusSettings vEFocusSettings) {
        C84151X0x c84151X0x;
        if (vEFocusSettings == null) {
            c84151X0x = null;
        } else {
            c84151X0x = new C84151X0x(vEFocusSettings.getWidth(), vEFocusSettings.getHeight(), vEFocusSettings.getX(), vEFocusSettings.getY(), vEFocusSettings.getDisplayDensity());
            c84151X0x.LJI = vEFocusSettings.isNeedFocus();
            c84151X0x.LJII = vEFocusSettings.isNeedMetering();
            c84151X0x.LJIIIIZZ = vEFocusSettings.isLock();
            c84151X0x.LJIIIZ = vEFocusSettings.isFromUser();
            c84151X0x.LJIIJ = vEFocusSettings.getCoordinatesMode();
            vEFocusSettings.getCameraFocusArea();
            vEFocusSettings.getCameraMeteringArea();
            if (vEFocusSettings.getFocusCallback() != null) {
                c84151X0x.LJIIJJI = new C83668Wsa(vEFocusSettings);
            }
        }
        return this.LJLLI.focusAtPoint(c84151X0x);
    }

    @Override // X.InterfaceC84100WzY
    public final void LJIILJJIL(X0N x0n) {
        this.LJLLI.process(new C84143X0p(2));
    }

    @Override // X.InterfaceC84100WzY
    public final void LJIILL(InterfaceC84139X0l interfaceC84139X0l) {
        this.LJLJL = interfaceC84139X0l;
    }

    @Override // X.P6Q
    public final int LJIILLIIL(C169706lK<P6O> c169706lK) {
        this.LJLL = c169706lK;
        if (c169706lK == null || c169706lK.LIZLLL()) {
            P4Q.LIZJ("VECameraCapture", "start with empty TECapturePipeline list");
            return -100;
        }
        P4Q.LIZ("VECameraCapture", "start with TECapturePipeline list");
        C78866UxK.LJIJ("VECamera-VECameraCapture-start");
        int LJJIJIIJIL = LJJIJIIJIL();
        C78866UxK.LJJIIJ();
        return LJJIJIIJIL;
    }

    @Override // X.InterfaceC84100WzY
    public final int LJIIZILJ(VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode) {
        int i;
        if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF) {
            i = 0;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_ON) {
            i = 1;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO) {
            i = 3;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH) {
            i = 2;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE) {
            i = 4;
        } else {
            return -100;
        }
        return this.LJLLI.switchFlashMode(i);
    }

    @Override // X.InterfaceC84100WzY
    public final int LJIJ(boolean z) {
        return this.LJLLI.toggleTorch(z);
    }

    public final void LJIJJ(VESize vESize) {
        boolean z;
        if (this.LJLIL.isBindSurfaceLifecycleToCamera() && this.LJLIL.getCameraType() != VECameraSettings.CAMERA_TYPE.TYPE1) {
            z = true;
            TECameraCapture tECameraCapture = this.LJLLI;
            if (tECameraCapture != null) {
                tECameraCapture.abortSession();
            }
            LIZ();
        } else {
            z = false;
            LJJIJIL(true);
        }
        C169706lK<P6O> c169706lK = this.LJLL;
        if (c169706lK != null) {
            Iterator<P6O> it = c169706lK.LIZJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                P6O next = it.next();
                if (next.LIZLLL) {
                    next.LIZIZ = new TEFrameSizei(vESize.height, vESize.width);
                    break;
                }
            }
        }
        C84134X0g c84134X0g = this.LJLILLLLZI;
        if (c84134X0g != null) {
            VESize vESize2 = this.LJLJJL;
            vESize2.width = vESize.height;
            int i = vESize.width;
            vESize2.height = i;
            TEFrameSizei tEFrameSizei = c84134X0g.LJZI;
            tEFrameSizei.width = vESize.height;
            tEFrameSizei.height = i;
        } else {
            P4Q.LIZJ("VECameraCapture", "setPreviewSize failed: params is null!");
        }
        if (!z || this.LJLILLLLZI.LLJJL) {
            LJJIIZ();
        }
        LJJIJIIJIL();
        this.LJLIL.setPreviewSize(vESize.width, vESize.height);
    }

    public final void LJJI(VECameraSettings vECameraSettings) {
        C84134X0g c84134X0g = this.LJLILLLLZI;
        if (c84134X0g == null || vECameraSettings == null) {
            return;
        }
        this.LJLIL = vECameraSettings;
        LJJIZ(c84134X0g, vECameraSettings);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changePreview, preview size = ");
        LIZ.append(vECameraSettings.getPreviewSize());
        P4Q.LJFF("VECameraCapture", X1D.LIZIZ(LIZ));
        LJIJJ(vECameraSettings.getPreviewSize());
    }

    public final C84134X0g LJJIII(VECameraSettings vECameraSettings) {
        if (vECameraSettings == null) {
            return null;
        }
        C84134X0g c84134X0g = new C84134X0g(this.LJLJJI);
        LJJIZ(c84134X0g, vECameraSettings);
        return c84134X0g;
    }

    public final int LJJIIZI(Cert cert) {
        int connect;
        C84134X0g c84134X0g = this.LJLJI;
        if (c84134X0g == null || this.LJLIL == null) {
            C63922P6w.LIZIZ("VECameraCapture", "mCameraParams == null, please init VECameraCapture!");
            return -105;
        }
        TEFrameSizei tEFrameSizei = c84134X0g.LJZI;
        if (tEFrameSizei.width <= 0 || tEFrameSizei.height <= 0) {
            return -100;
        }
        if (!this.LJLLILLLL.get()) {
            C78685UuP.LJLILLLLZI = System.currentTimeMillis();
        }
        if (this.LJLJI.LJLILLLLZI != this.LJLIL.getCameraType().ordinal()) {
            this.LJLJI = LJJIII(this.LJLIL);
        }
        P4Q.LJFF("VECameraCapture", "CAMERA_COST VECameraCapture open");
        C78866UxK.LJIJ("VECamera-VECameraCapture-open");
        TECameraCapture tECameraCapture = this.LJLLI;
        C84134X0g c84134X0g2 = this.LJLJI;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100801, "com/ss/android/ttvecamera/TECameraCapture", "connect", tECameraCapture, new Object[]{c84134X0g2, cert}, "int", new C65300Pk0(false, "(Lcom/ss/android/ttvecamera/TECameraSettings;Lcom/bytedance/bpea/basics/Cert;)I", "9070747164134211277"));
        if (LIZJ.LIZ) {
            connect = ((Integer) LIZJ.LIZIZ).intValue();
        } else {
            connect = tECameraCapture.connect(c84134X0g2, cert);
        }
        if (connect == 0) {
            this.LJLILLLLZI = this.LJLJI;
        }
        C78866UxK.LJJIIJ();
        return connect;
    }

    public final void LJJIJ(JSONObject jSONObject) {
        try {
            jSONObject.putOpt("camera_type", Integer.valueOf(this.LJLILLLLZI.LJLILLLLZI));
            jSONObject.putOpt("camera_facing", Integer.valueOf(this.LJLILLLLZI.LJLJJI));
            jSONObject.putOpt("camera_wide_angle", Integer.valueOf(VEConfigCenter.getInstance().getValue("ve_camera_wide_angle", -1)));
            jSONObject.putOpt("camera_ai_night_video", Integer.valueOf(VEConfigCenter.getInstance().getValue("ve_camera_ai_augmentation", 0)));
            jSONObject.putOpt("camera_multicamera_zoom", Boolean.valueOf(VEConfigCenter.getInstance().getValue("ve_support_camera_multicam_zoom", false).booleanValue()));
            C09580Ze.LIZJ().getClass();
            C38891fp.LJJII("bytebench_camera", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final int LJJIJIL(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VECameraCapture-stopPreview sync=");
        LIZ.append(z);
        C78866UxK.LJIJ(X1D.LIZIZ(LIZ));
        int stop = this.LJLLI.stop(z);
        C78866UxK.LJJIIJ();
        return stop;
    }

    public final void LJJIL(C84134X0g c84134X0g) {
        int cameraState = this.LJLLI.getCameraState();
        boolean z = false;
        if (cameraState != 3) {
            boolean z2 = c84134X0g.LLIIJI;
            c84134X0g.LLIIJI = false;
            z = z2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryWaitSwitchTask, state: ");
        LIZ.append(cameraState);
        C63922P6w.LIZIZ("VECameraCapture", X1D.LIZIZ(LIZ));
        if (z) {
            synchronized (this.LJZ) {
                int i = 10;
                while (true) {
                    TECameraCapture tECameraCapture = this.LJLLI;
                    if (tECameraCapture == null || tECameraCapture.getCameraState() == 3 || i <= 0) {
                        break;
                    }
                    i--;
                    try {
                        this.LJZ.wait(100);
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    C63922P6w.LJ("VECameraCapture", "wait switch task, to mode: " + c84134X0g.LLIFFJFJJ + ", try block...count:" + i);
                }
            }
        }
    }

    @Override // X.InterfaceC84100WzY
    public final int LLJJLIIIJLLLLLLLZ(int i) {
        return this.LJLLI.switchCameraMode(i, null);
    }

    @Override // X.YR1
    public final void onCaptureStopped(int i) {
        InterfaceC84139X0l interfaceC84139X0l = this.LJLJL;
        if (interfaceC84139X0l != null) {
            interfaceC84139X0l.onInfo(5, 0, "Camera is closed!");
        }
    }

    @Override // X.InterfaceC84100WzY
    public final void setExposureCompensation(int i) {
        this.LJLLI.setExposureCompensation(i);
    }

    @Override // X.InterfaceC84100WzY
    public final void setSATZoomListener(InterfaceC83712WtI interfaceC83712WtI) {
        TECameraCapture tECameraCapture = this.LJLLI;
        if (tECameraCapture != null) {
            tECameraCapture.setSATZoomCallback(this.LJZL);
        }
    }

    public static JSONObject LJJ(long j, Integer num) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", j);
            jSONObject.put("state", num);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final int LJJIFFI(boolean z, Cert cert) {
        int disConnect;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VECameraCapture-close(async=");
        LIZ.append(z);
        LIZ.append(",cert)");
        C78866UxK.LJIJ(X1D.LIZIZ(LIZ));
        this.LJLLILLLL.set(false);
        TECameraCapture tECameraCapture = this.LJLLI;
        boolean z2 = !z;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100803, "com/ss/android/ttvecamera/TECameraCapture", "disConnect", tECameraCapture, new Object[]{Boolean.valueOf(z2), cert}, "int", new C65300Pk0(false, "(ZLcom/bytedance/bpea/basics/Cert;)I", "9070747164134211277"));
        if (LIZJ.LIZ) {
            disConnect = ((Integer) LIZJ.LIZIZ).intValue();
        } else {
            disConnect = tECameraCapture.disConnect(z2, cert);
        }
        C78866UxK.LJJIIJ();
        return disConnect;
    }

    public final void LJJIIJZLJL(Context context, VECameraSettings vECameraSettings) {
        C78866UxK.LJIJ("VECamera-VECameraCapture-init");
        this.LJLJJI = context;
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_distinguish_camera_type_for_rdhw");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean) && ((Boolean) value.getValue()).booleanValue()) {
            if (vECameraSettings.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_RDHW) {
                this.LJLZ = true;
            }
            if (this.LJLZ && vECameraSettings.getCameraFacing() == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
                VECameraSettings.Builder builder = new VECameraSettings.Builder(vECameraSettings);
                builder.setCameraType(VECameraSettings.CAMERA_TYPE.TYPE2);
                vECameraSettings = builder.build();
                C63922P6w.LIZ("VECameraCapture", "change camera type for rdhw frontaaaa");
            }
        }
        this.LJLIL = vECameraSettings;
        C84134X0g LJJIII = LJJIII(vECameraSettings);
        C84134X0g c84134X0g = this.LJLILLLLZI;
        if (c84134X0g != null && LJJIII != null && c84134X0g.LLIFFJFJJ == 2) {
            if (LJJIII.LJLILLLLZI != 2) {
                LJJIII.LJLILLLLZI = 2;
            }
            LJJIII.LLIFFJFJJ = 2;
            LJJIII.LLJL = c84134X0g.LLJL;
            LJJIII.LJLLI = true;
            LJJIII.LLIIJI = true;
        }
        this.LJLJI = LJJIII;
        TECameraCapture.registerLogOutput(P4Q.LIZIZ, new C63848P4a());
        TECameraCapture.registerMonitor(new C63865P4r());
        TECameraCapture.registerException(new P82());
        C78866UxK.LJJIIJ();
    }

    public final int LJJIJL(VECameraSettings.CAMERA_FACING_ID camera_facing_id, Cert cert) {
        C84134X0g c84134X0g;
        C78866UxK.LJIJ("VECameraCapture-switchCamera(facing, cert)");
        C78685UuP.LJLJI = System.currentTimeMillis();
        if (!this.LJLLILLLL.get()) {
            P4Q.LIZJ("VECameraCapture", "Camera server is not connected now!!");
            C78866UxK.LJJIIJ();
            return -105;
        }
        if (this.LJLIL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB || ((c84134X0g = this.LJLILLLLZI) != null && c84134X0g.LLJJJJLIIL)) {
            LJJIIZ();
        }
        this.LJLLILLLL.set(false);
        int switchCamera = this.LJLLI.switchCamera(LJJII(camera_facing_id), cert);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCamera", camera_facing_id.name());
            jSONObject.put("resultCode", switchCamera);
            c.LIZ("vesdk_event_recorder_change_camera", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C78866UxK.LJJIIJ();
        return switchCamera;
    }

    public final void LJJIJLIJ(VECameraSettings vECameraSettings, Cert cert) {
        C84134X0g c84134X0g;
        C78866UxK.LJIJ("VECameraCapture-switchCamera(setting, cert)");
        C84134X0g c84134X0g2 = this.LJLILLLLZI;
        if (c84134X0g2 != null && c84134X0g2.LLIFFJFJJ == 2) {
            LJJIIZ();
        }
        C78685UuP.LJLJI = System.currentTimeMillis();
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_distinguish_camera_type_for_rdhw");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean) && ((Boolean) value.getValue()).booleanValue() && this.LJLZ) {
            if (vECameraSettings.getCameraFacing() == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
                VECameraSettings.Builder builder = new VECameraSettings.Builder(vECameraSettings);
                builder.setCameraType(VECameraSettings.CAMERA_TYPE.TYPE2);
                vECameraSettings = builder.build();
                C63922P6w.LIZ("VECameraCapture", "change camera type for rdhw front");
            } else if (vECameraSettings.getCameraFacing() == VECameraSettings.CAMERA_FACING_ID.FACING_BACK) {
                VECameraSettings.Builder builder2 = new VECameraSettings.Builder(vECameraSettings);
                builder2.setCameraType(VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_RDHW);
                vECameraSettings = builder2.build();
                C63922P6w.LIZ("VECameraCapture", "change camera type for rdhw back");
            }
        }
        this.LJLIL = vECameraSettings;
        this.LJLJI = LJJIII(vECameraSettings);
        if (this.LJLIL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB || ((c84134X0g = this.LJLJI) != null && c84134X0g.LLJJJJLIIL)) {
            LJJIIZ();
        }
        int switchCamera = this.LJLLI.switchCamera(this.LJLJI, cert);
        if (switchCamera == 0) {
            this.LJLILLLLZI = this.LJLJI;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCamera", vECameraSettings.getCameraFacing().name());
            jSONObject.put("resultCode", switchCamera);
            c.LIZ("vesdk_event_recorder_change_camera", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C78866UxK.LJJIIJ();
    }

    public final void LJJIZ(C84134X0g c84134X0g, VECameraSettings vECameraSettings) {
        boolean z;
        vECameraSettings.getCameraFaceDetect();
        vECameraSettings.getCameraVideoModeTemplate();
        c84134X0g.LJLILLLLZI = vECameraSettings.getCameraType().ordinal();
        c84134X0g.LJLJJI = LJJII(vECameraSettings.getCameraFacing());
        c84134X0g.LLIIIJ = vECameraSettings.getCameraHardwareID();
        c84134X0g.LLII = vECameraSettings.getHwLevel().ordinal();
        c84134X0g.LJZI.width = vECameraSettings.getPreviewSize().height;
        c84134X0g.LJZI.height = vECameraSettings.getPreviewSize().width;
        c84134X0g.LLIIJLIL = vECameraSettings.getFps();
        c84134X0g.LLILL = vECameraSettings.getCameraAntiShake();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createInternalSettings settings.mEnableStabilization = ");
        LIZ.append(c84134X0g.LLILL);
        P4Q.LJFF("VECameraCapture", X1D.LIZIZ(LIZ));
        c84134X0g.LLFII = vECameraSettings.isUseMaxWidthTakePicture();
        c84134X0g.LLFFF = vECameraSettings.getMaxWidthTakePictureSizeAccuracy();
        c84134X0g.LL = vECameraSettings.getMaxWidth();
        c84134X0g.LLIFFJFJJ = vECameraSettings.getCamera2OutputMode().ordinal();
        VESize vESize = this.LJLJJL;
        TEFrameSizei tEFrameSizei = c84134X0g.LJZI;
        vESize.width = tEFrameSizei.width;
        vESize.height = tEFrameSizei.height;
        c84134X0g.LLIIIZ = vECameraSettings.getEnableFallback();
        c84134X0g.LJLJLLL = vECameraSettings.getEnableZsl();
        c84134X0g.LLD = vECameraSettings.getRetryCnt();
        c84134X0g.LLF = vECameraSettings.getmRetryStartPreviewCnt();
        c84134X0g.LLFF = vECameraSettings.getCamera2RetryCnt();
        c84134X0g.LLIIL = vECameraSettings.getCameraFrameRateStrategy().ordinal();
        c84134X0g.LLIIII = vECameraSettings.getExtParameters();
        c84134X0g.LLILZIL = vECameraSettings.getCaptureFlashStrategy().ordinal();
        PDA.LJIIIIZZ = vECameraSettings.getOptionFlag();
        c84134X0g.LLIILII = vECameraSettings.getIsUseHint();
        c84134X0g.LLIILZL = vECameraSettings.getEnableSurfaceSharing();
        c84134X0g.LLIIZ = vECameraSettings.getIsCameraOpenCloseSync();
        c84134X0g.LLIL = vECameraSettings.getIsForceCloseCamera();
        c84134X0g.LLILII = vECameraSettings.getEnableVBoost();
        c84134X0g.LLILIL = vECameraSettings.getVBoostTimeout();
        vECameraSettings.getFocusTimeout();
        c84134X0g.LLILLIZIL = vECameraSettings.getEnableGcForCameraMetadataThreshold();
        c84134X0g.LLILLJJLI = vECameraSettings.getFpsMaxLimit();
        c84134X0g.LLILLL = vECameraSettings.isOptCameraSceneFps();
        c84134X0g.LJLL = vECameraSettings.getEnableManualReleaseCaptureResult();
        c84134X0g.LJLLI = vECameraSettings.isSyncModeOnCamera2();
        c84134X0g.LJLLJ = vECameraSettings.isEnableRefactorFocusAndMeter();
        c84134X0g.LJLLL = C65429Pm5.LJFF("ve_enable_camera2_monitor_gyroscope", false);
        c84134X0g.LJZ = vECameraSettings.getCameraZoomLimitFactor();
        c84134X0g.LJLLILLLL = vECameraSettings.getWideFOV();
        vECameraSettings.getCameraCaptureHdrFromCenter();
        if (vECameraSettings.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_RDHW) {
            c84134X0g.LJLLLL = !vECameraSettings.getCameraRDHWRecordDisableFromCenter();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("settings.mStartRecord = ");
            LIZ2.append(c84134X0g.LJLLLL);
            P4Q.LIZ("VECameraCapture", X1D.LIZIZ(LIZ2));
            if (vECameraSettings.getCameraFacing() == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
                c84134X0g.LLIIII.putBoolean("enable_video_stabilization", false);
                if (!vECameraSettings.getCameraHdrDisableFromCenter()) {
                    P4Q.LJFF("VECameraCapture", "ENABLE_VIDEO_HDR");
                    c84134X0g.LLIIII.putBoolean("enable_video_hdr", true);
                }
            } else {
                if (c84134X0g.LLIFFJFJJ != 1) {
                    z = c84134X0g.LLILL;
                } else {
                    z = false;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("huawei stable = ");
                LIZ3.append(z);
                P4Q.LIZ("VECameraCapture", X1D.LIZIZ(LIZ3));
                c84134X0g.LLIIII.putBoolean("enable_video_stabilization", z);
                if (vECameraSettings.getCameraNoiseReduceFromCenter()) {
                    c84134X0g.LLIIII.putString("noise_reduce", "fast");
                }
            }
        } else if (vECameraSettings.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_OGXM_V2) {
            vECameraSettings.getCameraCaptureMFNRFromCenter();
        }
        c84134X0g.LLJI = vECameraSettings.isPreferOpenCameraByCameraId();
        if (vECameraSettings.isEnablePreviewingFallback()) {
            c84134X0g.LLILZLL = true;
        } else {
            c84134X0g.LLILZLL = VEConfigCenter.getInstance().getValue("ve_camera_enable_previewing_fallback", c84134X0g.LLILZLL).booleanValue();
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("camera previewing fallback enabled: ");
        LIZ4.append(c84134X0g.LLILZLL);
        P4Q.LIZ("VECameraCapture", X1D.LIZIZ(LIZ4));
        if (vECameraSettings.isEnableBackGroundStrategy()) {
            c84134X0g.LLIZ = true;
        } else {
            c84134X0g.LLIZ = VEConfigCenter.getInstance().getValue("ve_enable_background_strategy", c84134X0g.LLIZ).booleanValue();
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("KEY_ENABLE_BACKGROUND_STRATEGY : ");
        LIZ5.append(c84134X0g.LLIZ);
        P4Q.LIZ("VECameraCapture", X1D.LIZIZ(LIZ5));
        c84134X0g.LLI = vECameraSettings.getDualCameraExtensionScheme();
        if (vECameraSettings.isEnableOpenCamera1Opt()) {
            c84134X0g.LLIZLLLIL = true;
        } else {
            c84134X0g.LLIZLLLIL = C65429Pm5.LJFF("ve_enable_open_camera1_optimize", false);
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("enable open camera1 opt : ");
        LIZ6.append(c84134X0g.LLIZLLLIL);
        P4Q.LIZ("VECameraCapture", X1D.LIZIZ(LIZ6));
        if (vECameraSettings.isEnableOpenCamera1Crs()) {
            c84134X0g.LLJ = true;
        } else {
            c84134X0g.LLJ = C65429Pm5.LJFF("ve_enable_open_camera1_crs", false);
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("enable open camera1 crs : ");
        LIZ7.append(c84134X0g.LLJ);
        P4Q.LIZ("VECameraCapture", X1D.LIZIZ(LIZ7));
        c84134X0g.LLILZ = vECameraSettings.getEnableRecordStream();
        vECameraSettings.getEnableRecord60Fps();
        vECameraSettings.getRecordStreamFolderPath();
        int[] fpsRange = vECameraSettings.getFpsRange();
        c84134X0g.LJLJI = new TEFrameRateRange(fpsRange[0], fpsRange[1]);
        c84134X0g.LLJIJIL = vECameraSettings.isEnableForceRestartWhenCameraError();
        c84134X0g.LLJJI = vECameraSettings.isBindSurfaceLifecycleToCamera();
        c84134X0g.LLIIII.putBoolean("ve_enable_camera_devices_cache", VEConfigCenter.getInstance().getValue("ve_enable_camera_devices_cache", false).booleanValue());
        c84134X0g.LLJJIII = vECameraSettings.isEnableYuvBufferCapture();
        c84134X0g.LJLJLJ = C65429Pm5.LJFF("ve_enable_camera2_zsl_capture", false);
        c84134X0g.LLJJIJI = C65429Pm5.LJFF("ve_enable_camera_api2_detect", false);
        c84134X0g.LLJJIJIIJIL = VEConfigCenter.getInstance().getValue("ve_camera_zoom_ratio_max", -1.0f);
        c84134X0g.LLJJIJIL = VEConfigCenter.getInstance().getValue("ve_camera_zoom_ratio_min", -1.0f);
        c84134X0g.LLJILJIL = vECameraSettings.getMetadataConfig();
        c84134X0g.LLJILJILJ = C65429Pm5.LJFF("ve_enable_camera2_deferred_surface", false);
        c84134X0g.LLJJJ = C65429Pm5.LJFF("ve_enable_collect_camera_capbilities", false);
        c84134X0g.LLJJJIL = vECameraSettings.isEnableCameraFpsDoubleCheckInImageMode();
        c84134X0g.LLJJJJ = vECameraSettings.getDefaultZoomRatio();
        c84134X0g.LLJJJJJIL = vECameraSettings.getDefaultZoomUsingZoomV2();
        c84134X0g.LLJJJJLIIL = C65429Pm5.LJFF("ve_enable_camera_switch_camera1_optimize", false);
        c84134X0g.LLJJL = C65429Pm5.LJFF("ve_enable_preview_size_change_opt1", false);
        c84134X0g.LLJJ = C65429Pm5.LJFF("ve_enable_force_close_camera_opt", false);
        c84134X0g.LLJILLL = C65429Pm5.LJFF("ve_enable_camera2_abort_session_capture", false);
        c84134X0g.LJLLLLLL = vECameraSettings.isEnableMonitorRuntimeInfo();
        c84134X0g.LJLZ = vECameraSettings.getMonitorRuntimeInfoPeriod();
        c84134X0g.LLJJLIIIJLLLLLLLZ = C65429Pm5.LJFF("ve_camera_prop_cache", false);
        c84134X0g.LLJLIL = vECameraSettings.getCameraPrivacyCertMap();
    }

    @Override // X.YR1
    public final void onCaptureStarted(int i, int i2) {
        VECameraSettings.CAMERA_TYPE camera_type;
        VECameraSettings.CAMERA_FACING_ID camera_facing_id;
        String str;
        C78866UxK.LJIJ("VECameraCapture-onCaptureStarted");
        synchronized (this) {
            C84134X0g c84134X0g = this.LJLILLLLZI;
            if (c84134X0g != null) {
                VECameraSettings vECameraSettings = this.LJLIL;
                int i3 = c84134X0g.LJLJJI;
                if (i3 == 0) {
                    camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
                } else if (i3 == 1) {
                    camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
                } else if (i3 == 2) {
                    camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
                } else if (i3 == 3) {
                    camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_TELEPHOTO;
                } else if (i3 == 5) {
                    camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_REAR_WIDE;
                } else if (i3 == 7) {
                    camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_FRONT_MAIN;
                } else {
                    camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
                }
                vECameraSettings.setCameraFacing(camera_facing_id);
                if (i == 2) {
                    str = "cameraAPI2";
                } else if (i == 1) {
                    str = "cameraAPI1";
                } else {
                    str = "Private API";
                }
                C63856P4i.LIZIZ("te_camera_api", str);
                if (c84134X0g.LJZL != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("width = ");
                    LIZ.append(c84134X0g.LJZL.width);
                    LIZ.append(", height = ");
                    LIZ.append(c84134X0g.LJZL.height);
                    C63856P4i.LIZIZ("te_camera_texture_size", X1D.LIZIZ(LIZ));
                }
                if (c84134X0g.LJZI != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("width = ");
                    LIZ2.append(c84134X0g.LJZI.width);
                    LIZ2.append(", height = ");
                    LIZ2.append(c84134X0g.LJZI.height);
                    C63856P4i.LIZIZ("te_camera_preview_size", X1D.LIZIZ(LIZ2));
                }
            }
        }
        InterfaceC84139X0l interfaceC84139X0l = this.LJLJL;
        if (i2 == 0) {
            this.LJLLILLLL.set(true);
            if (this.LJLZ && this.LJLIL.getCameraFacing() == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
                VECameraSettings vECameraSettings2 = this.LJLIL;
                VECameraSettings.CAMERA_TYPE camera_type2 = VECameraSettings.CAMERA_TYPE.TYPE2;
                vECameraSettings2.setCameraType(camera_type2);
                this.LJLIL.setConfigCameraType(camera_type2);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            switch (i) {
                                case 8:
                                    camera_type = VECameraSettings.CAMERA_TYPE.TYPE_OGXM_V2;
                                    break;
                                case 9:
                                    camera_type = VECameraSettings.CAMERA_TYPE.TYPE_GNOB;
                                    break;
                                case 10:
                                    camera_type = VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_RDHW;
                                    break;
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                    camera_type = VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB;
                                    break;
                                default:
                                    camera_type = VECameraSettings.CAMERA_TYPE.TYPE2;
                                    break;
                            }
                        } else {
                            camera_type = VECameraSettings.CAMERA_TYPE.TYPE_GNOB_MEDIA;
                        }
                    } else {
                        camera_type = VECameraSettings.CAMERA_TYPE.TYPE2;
                    }
                } else {
                    camera_type = VECameraSettings.CAMERA_TYPE.TYPE1;
                }
                this.LJLIL.setCameraType(camera_type);
                this.LJLIL.setConfigCameraType(camera_type);
            }
            LJJIJIIJIL();
            if (interfaceC84139X0l != null) {
                interfaceC84139X0l.LIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Camera type: ");
                LIZ3.append(i);
                interfaceC84139X0l.onInfo(2, i, X1D.LIZIZ(LIZ3));
            }
            try {
                C84134X0g c84134X0g2 = this.LJLILLLLZI;
                if (c84134X0g2 == null || !c84134X0g2.LLJJJJLIIL) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cameraType", i);
                    c.LIZ("vesdk_event_camera_type", "performance", jSONObject);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        } else if (interfaceC84139X0l != null) {
            interfaceC84139X0l.LIZIZ(i);
        }
        if (this.LJLIL.getCameraFacing().ordinal() == 7) {
            LJIJJLI(i2, i, "vesdk_event_recorder_dual_camera_open_ret");
        }
        C78866UxK.LJJIIJ();
    }

    @Override // X.YR1
    public final void onError(int i, String str) {
        InterfaceC84139X0l interfaceC84139X0l = this.LJLJL;
        if (interfaceC84139X0l != null) {
            if (this.LJLIL.getCameraFacing().ordinal() == 7) {
                if (i == -409 || i == 3) {
                    LJIJJLI(i, this.LJLIL.getCameraType().ordinal(), "vesdk_event_recorder_dual_camera_open_ret");
                } else if (i == -410 || i == -402) {
                    LJIJJLI(i, this.LJLIL.getCameraType().ordinal(), "vesdk_event_recorder_dual_camera_preview_ret");
                }
            }
            interfaceC84139X0l.onError(i, str);
        }
    }

    public static void LJIJJLI(int i, int i2, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", i);
            jSONObject.put("cameraType", i2);
            c.LIZ(str, "behavior", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static JSONObject LJIL(long j, long j2, Integer num) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", j);
            jSONObject.put("state", num);
            jSONObject.put("duration", j2 - j);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    @Override // X.InterfaceC87361YQj
    public final void onChange(int i, float f, boolean z) {
        X0Z x0z = this.LJLJJLL;
        if (x0z != null) {
            x0z.onChange(i, f, z);
        }
    }

    @Override // X.YR1
    public final void onInfo(int i, int i2, String str) {
        String[] split;
        int i3;
        C169706lK<P6O> c169706lK;
        InterfaceC84139X0l interfaceC84139X0l = this.LJLJL;
        StringBuilder LIZJ = C06460Ne.LIZJ("onInfo, infoType = ", i, ", ext = ", i2, ", msg = ");
        LIZJ.append(str);
        LIZJ.append(", listener = ");
        LIZJ.append(interfaceC84139X0l);
        P4Q.LIZ("VECameraCapture", X1D.LIZIZ(LIZJ));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VECameraCapture: onInfo, infoType = ");
        LIZ.append(i);
        C78866UxK.LJIJ(X1D.LIZIZ(LIZ));
        if (123 == i && (c169706lK = this.LJLL) != null && !c169706lK.LIZLLL()) {
            P4Q.LJFF("VECameraCapture", "onInfo, camera is starting preview, can not release SurfaceTexture.");
            Iterator<P6O> it = this.LJLL.LIZJ().iterator();
            while (it.hasNext()) {
                P63 p63 = it.next().LIZJ;
                if (p63 instanceof InterfaceC63916P6q) {
                    ((InterfaceC63916P6q) p63).LJFF(false);
                }
            }
            return;
        }
        if (124 == i) {
            C169706lK<P6O> c169706lK2 = this.LJLL;
            if (c169706lK2 != null && !c169706lK2.LIZLLL()) {
                P4Q.LJFF("VECameraCapture", "onInfo, camera finished starting preview, can release SurfaceTexture.");
                Iterator<P6O> it2 = this.LJLL.LIZJ().iterator();
                while (it2.hasNext()) {
                    P63 p632 = it2.next().LIZJ;
                    if (p632 instanceof InterfaceC63916P6q) {
                        ((InterfaceC63916P6q) p632).LJFF(true);
                    }
                }
                return;
            }
        } else if (1 == i) {
            Bundle bundle = new Bundle();
            bundle.putInt("device_support_wide_angle_mode", VEConfigCenter.getInstance().getValue("ve_camera_wide_angle", -1));
            bundle.putInt("device_support_antishake_mode", VEConfigCenter.getInstance().getValue("ve_camera_stablization", -1));
            bundle.putInt("device_support_ai_night_video", VEConfigCenter.getInstance().getValue("ve_camera_ai_augmentation", 0));
            bundle.putBoolean("device_support_multicamera_zoom", VEConfigCenter.getInstance().getValue("ve_support_camera_multicam_zoom", false).booleanValue());
            this.LJLLI.updateAllCameraFeatures(bundle);
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject cameraCapabilitiesForBytebench = this.LJLLI.getCameraCapabilitiesForBytebench(new C84142X0o(this));
            if (cameraCapabilitiesForBytebench != null && cameraCapabilitiesForBytebench.length() > 0) {
                LJJIJ(cameraCapabilitiesForBytebench);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getCameraCapabilitiesForBytebench cost time = ");
            LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
            P4Q.LIZ("VECameraCapture", X1D.LIZIZ(LIZ2));
        }
        if (interfaceC84139X0l != null) {
            if (i != 6) {
                i3 = i;
            } else {
                i3 = 6;
            }
            interfaceC84139X0l.onInfo(i3, i2, str);
        }
        if (i != 0) {
            if (i == 50) {
                if (str != null && (split = str.split("x")) != null && split.length == 2) {
                    TEFrameSizei tEFrameSizei = new TEFrameSizei(CastIntegerProtector.valueOf(split[0]).intValue(), CastIntegerProtector.valueOf(split[1]).intValue());
                    new VESize(tEFrameSizei.height, tEFrameSizei.width);
                }
            } else if (i == 6) {
                if (i2 == 2) {
                    System.currentTimeMillis();
                }
            } else if (i == 51) {
                LJJIIZ();
            } else if (i == 3) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", i2);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                c.LIZ("vesdk_event_recorder_first_frame_capture", "performance", jSONObject);
                C78866UxK.LJJIIJ();
            }
        }
        switch (i) {
            case 104:
                long currentTimeMillis2 = System.currentTimeMillis();
                this.LJLLLL = currentTimeMillis2;
                c.LIZ("vesdk_event_will_change_flash_mode", "behavior", LJJ(currentTimeMillis2, Integer.valueOf(i2)));
                break;
            case 105:
                c.LIZ("vesdk_event_did_change_flash_mode", "behavior", LJIL(this.LJLLLL, System.currentTimeMillis(), Integer.valueOf(i2)));
                break;
            case 106:
                long currentTimeMillis3 = System.currentTimeMillis();
                this.LJLLJ = currentTimeMillis3;
                c.LIZ("vesdk_event_will_start_camera", "behavior", LJJ(currentTimeMillis3, Integer.valueOf(i2)));
                break;
            case 107:
                c.LIZ("vesdk_event_did_start_camera", "behavior", LJIL(this.LJLLJ, System.currentTimeMillis(), Integer.valueOf(i2)));
                break;
            case 108:
                long currentTimeMillis4 = System.currentTimeMillis();
                this.LJLLL = currentTimeMillis4;
                c.LIZ("vesdk_event_will_stop_camera", "behavior", LJJ(currentTimeMillis4, Integer.valueOf(i2)));
                break;
            case 109:
                c.LIZ("vesdk_event_did_stop_camera", "behavior", LJIL(this.LJLLL, System.currentTimeMillis(), Integer.valueOf(i2)));
                break;
            default:
                switch (i) {
                    case 112:
                        LJJIJIIJI("vesdk_event_camera_wide_angle");
                        break;
                    case 113:
                        LJJIJIIJI("vesdk_event_camera_stablization");
                        break;
                    case 114:
                        LJJIJIIJI("vesdk_event_camera_zoom");
                        break;
                    case 115:
                        LJJIJIIJI("vesdk_event_camera_exposure_compensation");
                        break;
                }
        }
        C78866UxK.LJJIIJ();
    }

    @Override // X.InterfaceC87361YQj
    public final void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list) {
        X0Z x0z = this.LJLJJLL;
        if (x0z != null) {
            x0z.onZoomSupport(i, z, z2, f, list);
        }
    }
}
