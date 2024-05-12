package com.ss.android.ugc.asve.recorder.camera;

import X.C01R;
import X.C03880Dg;
import X.C06420Na;
import X.C141415gn;
import X.C162476Zf;
import X.C16880lQ;
import X.C1DH;
import X.C221108m2;
import X.C39519Ff9;
import X.C43045Guv;
import X.C5NP;
import X.C62814Ol0;
import X.C62819Ol5;
import X.C62822Ol8;
import X.C63824P3c;
import X.C63922P6w;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78922UyE;
import X.C80076Vbk;
import X.C82891Wg3;
import X.C83613Wrh;
import X.C83617Wrl;
import X.C83634Ws2;
import X.C83651WsJ;
import X.C83688Wsu;
import X.C83733Wtd;
import X.C83738Wti;
import X.C83817Wuz;
import X.C83964WxM;
import X.C83976WxY;
import X.C83980Wxc;
import X.C83983Wxf;
import X.C83984Wxg;
import X.C83985Wxh;
import X.C83986Wxi;
import X.C83988Wxk;
import X.C83989Wxl;
import X.C83990Wxm;
import X.C83992Wxo;
import X.C83994Wxq;
import X.C84129X0b;
import X.C84133X0f;
import X.C84134X0g;
import X.EnumC158826Le;
import X.EnumC83650WsI;
import X.EnumC83718WtO;
import X.EnumC83975WxX;
import X.EnumC84128X0a;
import X.HY2;
import X.InterfaceC65784Pro;
import X.InterfaceC83697Wt3;
import X.InterfaceC83712WtI;
import X.InterfaceC83723WtT;
import X.InterfaceC83737Wth;
import X.InterfaceC83859Wvf;
import X.InterfaceC83863Wvj;
import X.InterfaceC83906WwQ;
import X.InterfaceC83931Wwp;
import X.InterfaceC83970WxS;
import X.InterfaceC83987Wxj;
import X.InterfaceC83991Wxn;
import X.InterfaceC83995Wxr;
import X.InterfaceC83996Wxs;
import X.InterfaceC83997Wxt;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.KMP;
import X.P4Q;
import X.P88;
import X.PDD;
import X.Q7K;
import X.VK8;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEBlurFilterParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jp3.c;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VECameraController implements GenericLifecycleObserver, InterfaceC83863Wvj, InterfaceC83906WwQ {
    public static int LLJ;
    public final List<InterfaceC65784Pro<C76800UCe>> LJLIL;
    public final CopyOnWriteArrayList<InterfaceC83995Wxr> LJLILLLLZI;
    public InterfaceC83995Wxr LJLJI;
    public final CopyOnWriteArrayList<InterfaceC83996Wxs> LJLJJI;
    public final CopyOnWriteArrayList<InterfaceC83737Wth> LJLJJL;
    public InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public InterfaceC83997Wxt LJLJL;
    public InterfaceC83970WxS LJLJLJ;
    public InterfaceC83723WtT LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public final Object LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public final C84133X0f LJZ;
    public final C62822Ol8 LJZI;
    public VECameraSettings LJZL;
    public float LL;
    public final C62822Ol8 LLD;
    public EnumC83975WxX LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public final boolean LLFII;
    public final List<Integer> LLFZ;
    public float LLI;
    public float LLIFFJFJJ;
    public float LLII;
    public boolean LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public long LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public int LLIILII;
    public boolean LLIILZL;
    public final List<InterfaceC83991Wxn> LLIIZ;
    public InterfaceC88473Ynt<? super Integer, ? super Integer, ? super String, C76800UCe> LLIL;
    public int LLILII;
    public SparseIntArray LLILIL;
    public int LLILL;
    public final Context LLILLIZIL;
    public final LifecycleOwner LLILLJJLI;
    public final VERecorder LLILLL;
    public final InterfaceC83931Wwp LLILZ;
    public final C83733Wtd LLILZIL;
    public final boolean LLILZLL;
    public final InterfaceC65784Pro<Boolean> LLIZ;
    public final InterfaceC83697Wt3 LLIZLLLIL;

    @Override // X.InterfaceC83863Wvj
    public final InterfaceC83859Wvf LJIIIZ() {
        return (InterfaceC83859Wvf) this.LLD.getValue();
    }

    public final InterfaceC83987Wxj LJJJJJL() {
        return (InterfaceC83987Wxj) this.LJZI.getValue();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final void LIZLLL() {
        InterfaceC83970WxS interfaceC83970WxS = this.LJLJLJ;
        if (interfaceC83970WxS != null) {
            interfaceC83970WxS.LIZLLL();
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final Bundle LJIILL() {
        C84133X0f c84133X0f = this.LJZ;
        Context context = this.LLILLIZIL;
        c84133X0f.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("device_support_wide_angle_mode", VEConfigCenter.getInstance().getValue("ve_camera_wide_angle", -1));
        bundle.putInt("device_support_antishake_mode", VEConfigCenter.getInstance().getValue("ve_camera_stablization", -1));
        bundle.putInt("device_support_ai_night_video", VEConfigCenter.getInstance().getValue("ve_camera_ai_augmentation", 0));
        bundle.putBoolean("device_support_multicamera_zoom", VEConfigCenter.getInstance().getValue("ve_support_camera_multicam_zoom", false).booleanValue());
        c84133X0f.LJLLI.getCameraAllFeatures(context, bundle);
        return bundle;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJ() {
        this.LJZ.LJJIIZ();
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean LJJIFFI() {
        if (!this.LLFFF) {
            return false;
        }
        C84133X0f c84133X0f = this.LJZ;
        Context context = this.LLILLIZIL;
        VECameraSettings vECameraSettings = this.LJZL;
        c84133X0f.getClass();
        if (vECameraSettings.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE2) {
            boolean isARCoreSupported = c84133X0f.LJLLI.isARCoreSupported(context);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isARCoreSupported : ");
            LIZ.append(isARCoreSupported);
            C63922P6w.LIZLLL("VECameraCapture", X1D.LIZIZ(LIZ));
            return isARCoreSupported;
        }
        C63922P6w.LIZLLL("VECameraCapture", "isARCoreSupported : false ");
        return false;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJIIJZLJL() {
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ZOOM [");
        LIZ.append(System.identityHashCode(this));
        LIZ.append("] scaleEnd");
        c83964WxM.LIZ(X1D.LIZIZ(LIZ));
        this.LLI = 0.0f;
    }

    @Override // X.InterfaceC83906WwQ
    public final void LJJIIZ() {
        synchronized (this.LJLLL) {
            boolean z = true;
            this.LJLLLL = true;
            if (this.LLIIL) {
                if (this.LJLZ && !this.LJLLLLLL) {
                    this.LLILLL.LJIIJ(this.LLF);
                    VERecorder vERecorder = this.LLILLL;
                    vERecorder.LIZIZ.startCameraPreview(this.LJZ, true);
                    InterfaceC83970WxS interfaceC83970WxS = this.LJLJLJ;
                    if (interfaceC83970WxS != null) {
                        interfaceC83970WxS.LJIL();
                    }
                } else {
                    z = this.LJLLLLLL;
                }
            } else if (this.LJLZ) {
                if (!this.LJLLLLLL) {
                    this.LLILLL.LJIIJ(this.LLF);
                    VERecorder vERecorder2 = this.LLILLL;
                    vERecorder2.LIZIZ.startCameraPreview(this.LJZ, true);
                    InterfaceC83970WxS interfaceC83970WxS2 = this.LJLJLJ;
                    if (interfaceC83970WxS2 != null) {
                        interfaceC83970WxS2.LJIL();
                    }
                }
            } else {
                z = false;
            }
            this.LJLLLLLL = z;
        }
    }

    @Override // X.InterfaceC83906WwQ
    public final void LJJIIZI() {
        synchronized (this.LJLLL) {
            this.LJLLLL = false;
            if (this.LJLLLLLL) {
                this.LLILLL.LIZIZ.stopCameraPreview();
                this.LJLLLLLL = false;
            }
        }
    }

    public final void LJJJJIZL() {
        if (this.LJLLLLLL) {
            this.LJZ.LJJIJIIJIL();
            return;
        }
        if (this.LLIIL) {
            this.LJLZ = false;
        }
        this.LLILLL.LJIIJ(this.LLF);
        VERecorder vERecorder = this.LLILLL;
        vERecorder.LIZIZ.startCameraPreview(this.LJZ, this.LJLLLL);
        InterfaceC83970WxS interfaceC83970WxS = this.LJLJLJ;
        if (interfaceC83970WxS != null) {
            interfaceC83970WxS.LJIL();
        }
        this.LJLLLLLL = true;
    }

    public final void LJJJJLI() {
        if (C83617Wrl.LIZ && C62814Ol0.LJJIFFI(this)) {
            VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LJZL);
            builder.setCameraZoomLimitFactor(1.0f);
            C83964WxM.LIZ.LIZ("ZOOM enableMaxZoomOptimized");
            VECameraSettings build = builder.build();
            o.LJIIIIZZ(build, "VECameraSettings.Builder…                 .build()");
            this.LJZL = build;
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean LLJL() {
        return this.LJZ.LJLLI.isTorchSupported();
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean LLLLLLZZ() {
        if (this.LL == -1.0f || ((ArrayList) this.LLFZ).isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC83863Wvj
    public final C63824P3c getCameraECInfo() {
        return this.LJZ.getCameraECInfo();
    }

    @Override // X.InterfaceC83863Wvj
    public final int getCameraPosition() {
        return this.LJZL.getCameraFacing().ordinal();
    }

    @Override // X.InterfaceC83863Wvj
    public final int getCameraState() {
        return this.LJZ.LJLLI.getCameraState();
    }

    @Override // X.InterfaceC83863Wvj
    public final String getCameraTypeString() {
        String str;
        C84133X0f c84133X0f = this.LJZ;
        int i = this.LJLLJ;
        c84133X0f.getClass();
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    switch (i) {
                        case 8:
                            str = "xiaomi_camera";
                            break;
                        case 9:
                            str = "oppo_camera";
                            break;
                        case 10:
                            str = "huawei_camera";
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            str = "oppo_camera_unit";
                            break;
                        default:
                            str = KMP.LJ("unknown_camera_", i);
                            break;
                    }
                } else {
                    str = "oppo_camera_media";
                }
            } else {
                str = "camera2";
            }
        } else {
            str = "camera1";
        }
        o.LJIIIIZZ(str, "cameraCapture.getCameraT…String(currentCameraType)");
        return str;
    }

    @Override // X.InterfaceC83863Wvj
    public final int getNextFlashMode() {
        return this.LLILIL.get(this.LLILII);
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean isSupportedExposureCompensation() {
        return this.LJZ.isSupportedExposureCompensation();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.LJLLILLLL || this.LLILZLL) {
            LJIILLIIL(C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_CONTROLLER_ON_DESTROY, EnumC158826Le.PAGE_INVISIBLE), this.LLILZ.LJIJJLI());
        }
        if (this.LLILZ.LJIIJJI()) {
            this.LJZ.LJJIIJ();
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final float LJIJI() {
        if (C62814Ol0.LJJIFFI(this)) {
            return this.LLII;
        }
        return this.LLIFFJFJJ;
    }

    public final void LJJJJL() {
        if (C62814Ol0.LJJ(this)) {
            this.LJZ.LJFF();
        }
        C84133X0f c84133X0f = this.LJZ;
        c84133X0f.LJLLI.queryZoomAbility(c84133X0f, C62814Ol0.LJJIFFI(this));
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean LLLLZI() {
        boolean z;
        if (!LLLLLLZZ()) {
            return false;
        }
        if (this.LLFII) {
            InterfaceC83859Wvf LJIIIZ = LJIIIZ();
            if (getCameraPosition() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (LJIIIZ.LJIIIIZZ(z)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean getHasSetFocusAreas() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.LLIIIL;
        if (currentTimeMillis - j <= this.LLIIJI && j != 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean LJIJJ() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC83863Wvj
    public final C84133X0f LJJJI() {
        return this.LJZ;
    }

    @Override // X.InterfaceC83863Wvj
    public final int LJJJJI() {
        return this.LLIILII;
    }

    @Override // X.InterfaceC83863Wvj
    public final float LLJJJJJIL() {
        return this.LL;
    }

    @Override // X.InterfaceC83863Wvj
    public final int getCameraPreviewHeight() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC83863Wvj
    public final int getCameraPreviewWidth() {
        return this.LJLL;
    }

    @Override // X.InterfaceC83863Wvj
    public final List<Integer> getCameraZoomList() {
        return this.LLFZ;
    }

    @Override // X.InterfaceC83863Wvj
    public final int getCurrentCameraType() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC83863Wvj
    public final int getFlashMode() {
        return this.LLILII;
    }

    @Override // X.InterfaceC83863Wvj
    public final int getLastFlashMode() {
        return LLJ;
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean D7(VEFocusSettings vEFocusSettings) {
        if (this.LLIIJLIL) {
            this.LLIIIL = System.currentTimeMillis();
        }
        if (this.LJZ.LJIILIIL(vEFocusSettings) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LIZ(AqS181S0100000_15 aqS181S0100000_15) {
        C84133X0f c84133X0f = this.LJZ;
        c84133X0f.LJLLI.getFOV(new C83992Wxo(aqS181S0100000_15));
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean LIZIZ(float f) {
        float f2;
        boolean z = false;
        if (!LLLLLLZZ()) {
            return false;
        }
        boolean LJJ = C62814Ol0.LJJ(this);
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ZOOM startZoom newZoom = ");
        LIZ.append(f);
        LIZ.append(", currentZoom = ");
        LIZ.append(this.LLIFFJFJJ);
        LIZ.append(", shouldUseShaderZoom:");
        LIZ.append(LJJ);
        LIZ.append(", isFrontCamera:");
        LIZ.append(this.LLIILZL);
        c83964WxM.LIZJ(X1D.LIZIZ(LIZ));
        InterfaceC83859Wvf LJIIIZ = LJIIIZ();
        float f3 = this.LL;
        getCameraPosition();
        LJIIIZ.LIZJ(f3);
        InterfaceC83859Wvf LJIIIZ2 = LJIIIZ();
        getCameraPosition();
        LJIIIZ2.LIZIZ();
        float max = Math.max(Math.min(this.LL, f), 0.0f);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ZOOM startZoom zoomUpperLimit:");
        LIZ2.append(f3);
        LIZ2.append(", zoomBottomLimit:");
        LIZ2.append(0.0f);
        LIZ2.append(", maxZoom:");
        LIZ2.append(this.LL);
        LIZ2.append(", zoomTemp:");
        LIZ2.append(max);
        c83964WxM.LIZJ(X1D.LIZIZ(LIZ2));
        if (max >= 0.0f && max <= f3) {
            z = true;
            if (C62814Ol0.LJJ(this) && this.LLIILZL) {
                float f4 = this.LL;
                float f5 = 1;
                f2 = C06420Na.LIZIZ(f4, f5, max / f4, f5);
            } else {
                f2 = max;
            }
            LJJJJLL(f2);
            this.LLIFFJFJJ = max;
        }
        return z;
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean LIZJ(VESize size) {
        o.LJIIIZ(size, "size");
        return this.LJZ.LIZJ(size);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJ(boolean z) {
        this.LLFF = z;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJI(boolean z) {
        Bundle LIZ = C01R.LIZ("enable_ai_night_video", z);
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LJZL);
        builder.setCameraAiNightVideo(z);
        VECameraSettings build = builder.build();
        o.LJIIIIZZ(build, "VECameraSettings.Builder…                }.build()");
        this.LJZL = build;
        this.LJZ.LJLLI.setFeatureParameters(LIZ);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJII(HY2 hy2) {
        synchronized (this.LJLILLLLZI) {
            InterfaceC83995Wxr interfaceC83995Wxr = this.LJLJI;
            if (interfaceC83995Wxr != null) {
                this.LJLILLLLZI.remove(interfaceC83995Wxr);
            }
            this.LJLILLLLZI.add(hy2);
            this.LJLJI = hy2;
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJIIIIZZ(InterfaceC83737Wth cameraOpenListener) {
        o.LJIIIZ(cameraOpenListener, "cameraOpenListener");
        this.LJLJJL.remove(cameraOpenListener);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJIIJ(InterfaceC83991Wxn zoomListener) {
        o.LJIIIZ(zoomListener, "zoomListener");
        C43045Guv.LIZLLL(new AqS161S0200000_14(this, zoomListener, 6), 0L);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJIIJJI(PDD pdd) {
        this.LJZ.LJLJLJ = pdd;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJIILIIL(Cert cert) {
        C84133X0f c84133X0f = this.LJZ;
        if (!c84133X0f.LJLLILLLL.get()) {
            P4Q.LIZJ("VECameraCapture", "Camera server is not connected now!!");
        } else {
            int cameraState = c84133X0f.LJLLI.getCameraState();
            if (cameraState != 3) {
                Q7K.LJ("click to switch normal camera, camera state = ", cameraState, "VECameraCapture");
            }
            C84134X0g c84134X0g = c84133X0f.LJLILLLLZI;
            c84134X0g.LLIIJI = true;
            c84133X0f.LJJIL(c84134X0g);
            c84133X0f.LJJIIZ();
            c84133X0f.LJLLI.switchCamera(c84133X0f.LJLILLLLZI, cert);
        }
        InterfaceC83723WtT interfaceC83723WtT = this.LJLJLLL;
        if (interfaceC83723WtT != null) {
            ((C83634Ws2) interfaceC83723WtT).LIZJ(EnumC83718WtO.OPEN_CAMERA, cert);
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJIIZILJ(boolean z) {
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LJZL);
        builder.setCameraAntiShake(z);
        builder.setRetryCnt(this.LLILZ.LJJIIJZLJL());
        VECameraSettings build = builder.build();
        o.LJIIIIZZ(build, "VECameraSettings.Builder…\n                .build()");
        this.LJZL = build;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJIJ(InterfaceC83996Wxs interfaceC83996Wxs) {
        if (interfaceC83996Wxs != null) {
            this.LJLJJI.add(interfaceC83996Wxs);
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJIJJLI(float f) {
        this.LLILLL.LIZIZ.updateRotation(0.0f, 0.0f, f);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJIL(EnumC83975WxX mode) {
        o.LJIIIZ(mode, "mode");
        this.LLF = mode;
        this.LLILLL.LJIIJ(mode);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJI(int[] iArr) {
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LJZL);
        builder.setFpsRange(iArr);
        VECameraSettings build = builder.build();
        o.LJIIIIZZ(build, "VECameraSettings.Builder…   }\n            .build()");
        this.LJZL = build;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJIII(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJJLL = callback;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJIJ(P88 p88) {
        C84133X0f c84133X0f = this.LJZ;
        c84133X0f.LJLJLLL = p88;
        c84133X0f.LJLLI.registerPreviewListener(c84133X0f.LJZI);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJIJIIJI(InterfaceC88472Yns<? super VECameraSettings.Builder, C76800UCe> interfaceC88472Yns) {
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LJZL);
        interfaceC88472Yns.invoke(builder);
        VECameraSettings build = builder.build();
        o.LJIIIIZZ(build, "newBuilder.build()");
        boolean z = true;
        if (build.getCameraFacing().ordinal() != 1) {
            z = false;
        }
        this.LLIILZL = z;
        this.LJZL = build;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJIJLIJ(C83613Wrh c83613Wrh) {
        this.LLIL = c83613Wrh;
    }

    @Override // X.InterfaceC83863Wvj
    public final int LJJIL(Cert cert) {
        int i;
        o.LJIIIZ(cert, "cert");
        synchronized (this.LJLLL) {
            if (this.LJLLLL) {
                VERecorder vERecorder = this.LLILLL;
                vERecorder.LIZIZ.startCameraPreview(this.LJZ);
                InterfaceC83970WxS interfaceC83970WxS = this.LJLJLJ;
                if (interfaceC83970WxS != null) {
                    interfaceC83970WxS.LJIL();
                }
                this.LJZL.setCameraFacing(VECameraSettings.CAMERA_FACING_ID.FACING_FRONT);
                i = this.LJZ.LJJIJL(this.LJZL.getCameraFacing(), cert);
                this.LLIILII = getCameraPosition();
            } else {
                i = 0;
            }
        }
        return i;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJIZ(int i) {
        if (i != -1) {
            this.LLILLL.LIZIZ().removeTrackFilter(i);
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" => VEBlur # , removeVeBlurTrackWithIndex, ratioIndex is ");
            LIZ.append(i);
            LIZLLL.i(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJJ(C83688Wsu c83688Wsu) {
        C84133X0f c84133X0f = this.LJZ;
        c84133X0f.LJLLI.getISO(new C83990Wxm(this, c83688Wsu));
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJJIL(int i) {
        this.LLIILII = i;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJJJ(InterfaceC83737Wth interfaceC83737Wth) {
        this.LJLJJL.add(interfaceC83737Wth);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJJJJ(int i) {
        VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode;
        InterfaceC83970WxS interfaceC83970WxS;
        if (this.LLILZ.LJIIJJI() && this.LLIIIZ == i) {
            return;
        }
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Flash:switchFlashMode,mode:");
        LIZ.append(i);
        c83964WxM.LIZ(X1D.LIZIZ(LIZ));
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO;
                    }
                } else {
                    camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH;
                }
            } else {
                camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_ON;
            }
        } else {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF;
        }
        if (camera_flash_mode != VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO) {
            this.LJZ.LJIIZILJ(camera_flash_mode);
        } else {
            this.LJZ.LJIIZILJ(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF);
        }
        if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH) {
            InterfaceC83970WxS interfaceC83970WxS2 = this.LJLJLJ;
            if (interfaceC83970WxS2 != null) {
                interfaceC83970WxS2.LJIIL();
            }
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF && (interfaceC83970WxS = this.LJLJLJ) != null) {
            interfaceC83970WxS.LJ();
        }
        this.LLILII = i;
        this.LLIIIZ = i;
    }

    public final void LJJJJLL(float f) {
        if (C62814Ol0.LJJ(this) && this.LLIILZL) {
            C83964WxM c83964WxM = C83964WxM.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ZOOM veStartShaderZoom zoom:");
            LIZ.append(f);
            c83964WxM.LIZJ(X1D.LIZIZ(LIZ));
            this.LLILLL.LIZIZ.startShaderZoom(f);
            return;
        }
        C83964WxM c83964WxM2 = C83964WxM.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ZOOM veStartZoom zoom:");
        LIZ2.append(f);
        c83964WxM2.LIZJ(X1D.LIZIZ(LIZ2));
        this.LJZ.LIZIZ(f);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LLJJIJIIJIL(boolean z) {
        this.LJZ.LJLLI.setFeatureParameters(C01R.LIZ("enable_body_beauty", z));
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean LLJJL(float f) {
        if (!LLLLLLZZ() || !LLLLZI()) {
            return false;
        }
        if (C62814Ol0.LJJIFFI(this)) {
            float f2 = 1;
            float f3 = this.LL - f2;
            float f4 = 0;
            if (this.LLII <= f4) {
                this.LLII = 1.0f;
            }
            if (f <= f4) {
                return false;
            }
            float f5 = (((f - this.LLI) * f3) / this.LLII) + f2;
            this.LLI = f;
            C83964WxM c83964WxM = C83964WxM.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ZOOM scaleCamera factor = ");
            LIZ.append(f5);
            c83964WxM.LIZ(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ZOOM scaleCamera zoomV2CurrentZoom = ");
            LIZ2.append(this.LLII);
            c83964WxM.LIZ(X1D.LIZIZ(LIZ2));
            float f6 = this.LLII * f5;
            if (f6 >= this.LL) {
                return false;
            }
            if (!this.LLIIII && f5 <= 1.0f) {
                return false;
            }
            this.LLII = f6;
            if (!LLLLLLZZ()) {
                return false;
            }
            C84133X0f c84133X0f = this.LJZ;
            c84133X0f.LJLLI.zoomV2(f5, c84133X0f);
            return true;
        }
        C83964WxM c83964WxM2 = C83964WxM.LIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("ZOOM [");
        LIZ3.append(System.identityHashCode(this));
        LIZ3.append("] scaleCameraByRatio ratio = ");
        LIZ3.append(f);
        c83964WxM2.LIZ(X1D.LIZIZ(LIZ3));
        if (f <= 0.05d) {
            f /= 4.0f;
        }
        float max = Math.max(0.0f, ((f - this.LLI) * this.LL) + this.LLIFFJFJJ);
        this.LLI = f;
        return LIZIZ(max);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LLLLLZ(InterfaceC83996Wxs interfaceC83996Wxs) {
        if (interfaceC83996Wxs != null) {
            this.LJLJJI.remove(interfaceC83996Wxs);
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final void LLLLLZL(int i) {
        LLJ = i;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LLLLZ(InterfaceC83991Wxn zoomListener) {
        o.LJIIIZ(zoomListener, "zoomListener");
        C43045Guv.LIZLLL(new AqS161S0200000_14(this, zoomListener, 5), 0L);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LLLLZLL(int i) {
        this.LLILII = i;
    }

    @Override // X.InterfaceC83863Wvj
    public final int p9(Cert cert) {
        int LJII;
        if (getCameraPosition() == 1) {
            LJII = LJIIIZ().LIZLLL();
        } else {
            LJII = LJIIIZ().LJII();
        }
        LJJIJL(LJII, null, cert);
        return LJII;
    }

    @Override // X.InterfaceC83863Wvj
    public final void setBodyBeautyLevel(int i) {
        this.LJZ.LJLLI.setFeatureParameters(C141415gn.LIZ("body_beauty_level", i));
    }

    @Override // X.InterfaceC83863Wvj
    public final void setCameraPreviewSizeInterface(InterfaceC83997Wxt interfaceC83997Wxt) {
        this.LJLJL = interfaceC83997Wxt;
    }

    @Override // X.InterfaceC83863Wvj
    public final void setControllerCallback(InterfaceC83970WxS interfaceC83970WxS) {
        this.LJLJLJ = interfaceC83970WxS;
        if (interfaceC83970WxS != null) {
            interfaceC83970WxS.LJIIJ(new C83985Wxh(this));
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final void setDeviceRotation(int i) {
        int i2;
        VERecorder vERecorder = this.LLILLL;
        vERecorder.getClass();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    i2 = 0;
                } else {
                    i2 = 270;
                }
            } else {
                i2 = 180;
            }
        } else {
            i2 = 90;
        }
        vERecorder.LIZIZ.setDeviceRotation(i2);
    }

    @Override // X.InterfaceC83863Wvj
    public final void setExposureCompensation(int i) {
        this.LJZ.setExposureCompensation(i);
    }

    @Override // X.InterfaceC83863Wvj
    public final void setRecordMode(EnumC84128X0a mode) {
        int i;
        o.LJIIIZ(mode, "mode");
        VERecorder vERecorder = this.LLILLL;
        switch (C84129X0b.LIZ[mode.ordinal()]) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = -1;
                break;
            case 7:
                i = -2;
                break;
            case 8:
                i = -1000;
                break;
            default:
                throw new C162476Zf();
        }
        vERecorder.LIZIZ.setRecordMode(i);
    }

    @Override // X.InterfaceC83863Wvj
    public final void setSATZoomListener(InterfaceC83712WtI interfaceC83712WtI) {
        this.LJZ.setSATZoomListener(interfaceC83712WtI);
    }

    @Override // X.InterfaceC83863Wvj
    public final void setSensitiveApiCallback(InterfaceC83723WtT interfaceC83723WtT) {
        this.LJLJLLL = interfaceC83723WtT;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJFF(InterfaceC83737Wth interfaceC83737Wth, Cert cert) {
        LJJJJLI();
        this.LJLJJL.add(new C83988Wxk(this, interfaceC83737Wth));
        C84133X0f c84133X0f = this.LJZ;
        c84133X0f.LJLJJLL = new C83980Wxc(this);
        c84133X0f.LJLJL = new C83976WxY(this, true);
        c84133X0f.LJJIJLIJ(this.LJZL, cert);
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJIILLIIL(Cert cert, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("async: ");
        LIZ.append(z);
        LIZ.append(", policyPlaceholder: ");
        LIZ.append(cert);
        C78922UyE.LIZ("ACTION_NAME_CLOSE_CAMERA", X1D.LIZIZ(LIZ));
        if (new C03880Dg(2).LIZJ(100804, "com/ss/android/ugc/asve/recorder/camera/VECameraController", "realClose", this, new Object[]{Boolean.valueOf(z), cert}, "void", new C65300Pk0(false, "(ZLcom/bytedance/bpea/basics/Cert;)V", "-8851769076750662792")).LIZ) {
            return;
        }
        C82891Wg3.LIZLLL().i("CameraCapturePreOpener: realClose");
        synchronized (this.LJLLL) {
            this.LJLZ = false;
            this.LJZ.LIZ();
            InterfaceC83970WxS interfaceC83970WxS = this.LJLJLJ;
            if (interfaceC83970WxS != null) {
                interfaceC83970WxS.LJIJI();
            }
        }
        C84133X0f c84133X0f = this.LJZ;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100802, "com/ss/android/vesdk/VECameraCapture", "close", c84133X0f, new Object[]{Boolean.valueOf(z), cert}, "int", new C65300Pk0(false, "(ZLcom/bytedance/bpea/basics/Cert;)I", "-8851769076750662792"));
        if (LIZJ.LIZ) {
            ((Integer) LIZJ.LIZIZ).intValue();
        } else {
            c84133X0f.LJJIFFI(z, cert);
        }
        InterfaceC83970WxS interfaceC83970WxS2 = this.LJLJLJ;
        if (interfaceC83970WxS2 != null) {
            interfaceC83970WxS2.LJIJJ();
        }
        C84133X0f c84133X0f2 = this.LJZ;
        c84133X0f2.LJLJL = null;
        c84133X0f2.LJLJJLL = null;
        c84133X0f2.setSATZoomListener(null);
        this.LJLJJL.clear();
        this.LJLZ = false;
        this.LJLLILLLL = false;
        this.LJLLJ = -1;
        C83738Wti.LIZ = -1;
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((InterfaceC65784Pro) it.next()).invoke();
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJII(VK8 vk8, Cert cert) {
        C84133X0f c84133X0f = this.LJZ;
        if (!c84133X0f.LJLLILLLL.get()) {
            P4Q.LIZJ("VECameraCapture", "Camera server is not connected now!!");
        } else {
            C84134X0g LJJIII = c84133X0f.LJJIII(c84133X0f.LJLIL);
            c84133X0f.LJLJI = LJJIII;
            if (LJJIII == null) {
                P4Q.LIZJ("VECameraCapture", "click to switch ar camera failed, cameraParams is null");
            } else if (LJJIII.LJLILLLLZI == 1) {
                P4Q.LIZJ("VECameraCapture", "click to switch ar camera failed, not support camera type");
            } else {
                int cameraState = c84133X0f.LJLLI.getCameraState();
                if (cameraState != 3) {
                    Q7K.LJ("click to switch ar camera, camera state = ", cameraState, "VECameraCapture");
                }
                c84133X0f.LJJIIZ();
                C84134X0g c84134X0g = c84133X0f.LJLJI;
                if (c84134X0g.LJLILLLLZI != 2) {
                    c84134X0g.LJLILLLLZI = 2;
                }
                c84134X0g.LLIFFJFJJ = 2;
                c84134X0g.LLJL = vk8;
                c84134X0g.LJLLI = true;
                c84134X0g.LLIIJI = true;
                C80076Vbk.LIZ.LJIIJ(c84133X0f.LJLJJI, c84134X0g);
                c84133X0f.LJJIL(c84133X0f.LJLJI);
                int switchCamera = c84133X0f.LJLLI.switchCamera(c84133X0f.LJLJI, cert);
                if (switchCamera == 0) {
                    c84133X0f.LJLILLLLZI = c84133X0f.LJLJI;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", switchCamera);
                    c.LIZ("vesdk_event_camera_arcore", "behavior", jSONObject);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        InterfaceC83723WtT interfaceC83723WtT = this.LJLJLLL;
        if (interfaceC83723WtT != null) {
            ((C83634Ws2) interfaceC83723WtT).LIZJ(EnumC83718WtO.OPEN_CAMERA, cert);
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJIJIIJIL(float[] fArr, double d) {
        this.LLILLL.LIZIZ.setDeviceRotation(fArr, d);
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean LLJJLIIIJLLLLLLLZ(float f, float f2) {
        if (!LLLLLLZZ() || !LLLLZI()) {
            return false;
        }
        if (C62814Ol0.LJJIFFI(this)) {
            if (!LLLLLLZZ()) {
                return false;
            }
            C84133X0f c84133X0f = this.LJZ;
            c84133X0f.LJLLI.zoomV2(f2, c84133X0f);
            return true;
        }
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ZOOM scaleCamera distanceDelta = ");
        LIZ.append(f);
        c83964WxM.LIZ(X1D.LIZIZ(LIZ));
        return LIZIZ(Math.max(0.0f, ((this.LL / 1000) * f) + this.LLIFFJFJJ));
    }

    @Override // X.InterfaceC83863Wvj
    public final int LJJIIJ(boolean z, Boolean bool, Cert cert) {
        int i;
        o.LJIIIZ(cert, "cert");
        InterfaceC83997Wxt interfaceC83997Wxt = this.LJLJL;
        if (interfaceC83997Wxt != null) {
            interfaceC83997Wxt.LIZ(this.LJLL, this.LJLLI);
        }
        synchronized (this.LJLLL) {
            if (this.LJLLLL) {
                if (z) {
                    VERecorder vERecorder = this.LLILLL;
                    vERecorder.LIZIZ.startCameraPreview(this.LJZ);
                    InterfaceC83970WxS interfaceC83970WxS = this.LJLJLJ;
                    if (interfaceC83970WxS != null) {
                        interfaceC83970WxS.LJIL();
                    }
                }
                this.LLIILII = getCameraPosition();
                VECameraSettings vECameraSettings = this.LJZ.LJLIL;
                o.LJIIIIZZ(vECameraSettings, "cameraCapture.cameraSettings");
                VECameraSettings.CAMERA_FACING_ID cameraFacing = vECameraSettings.getCameraFacing();
                VECameraSettings.CAMERA_FACING_ID camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_FRONT_MAIN;
                if (cameraFacing != camera_facing_id) {
                    this.LJZL.setCameraFacing(camera_facing_id);
                    i = this.LJZ.LJJIJL(this.LJZL.getCameraFacing(), cert);
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            this.LLILLL.LJIIJ(EnumC83975WxX.FRONT_PRIMARY);
                        } else {
                            this.LLILLL.LJIIJ(EnumC83975WxX.BACK_PRIMARY);
                        }
                    }
                }
            }
            i = 0;
        }
        return i;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJIJIL(int i, InterfaceC83737Wth interfaceC83737Wth, Cert cert) {
        LJJJJJL().LIZJ();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.LLIILZL = z;
        this.LJZL.setCameraFacing(C62819Ol5.LJJIIZ(i));
        LJJJJLI();
        InterfaceC83987Wxj LJJJJJL = LJJJJJL();
        Context LLLLL = C16880lQ.LLLLL(this.LLILLIZIL);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        LJJJJJL.LIZIZ(LLLLL, this.LJZL);
        this.LJLJJL.add(new C83984Wxg(this, interfaceC83737Wth));
        LJJJJJL().LIZLLL(new C83980Wxc(this));
        LJJJJJL().LJ(new C83976WxY(this, false));
        LJJJJJL().openCamera(cert);
        LJJJJJL().LIZ();
        InterfaceC83970WxS interfaceC83970WxS = this.LJLJLJ;
        if (interfaceC83970WxS != null) {
            interfaceC83970WxS.LJIIJJI();
        }
        InterfaceC83723WtT interfaceC83723WtT = this.LJLJLLL;
        if (interfaceC83723WtT != null) {
            ((C83634Ws2) interfaceC83723WtT).LIZJ(EnumC83718WtO.OPEN_CAMERA, cert);
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final void LJJIJL(int i, InterfaceC83737Wth interfaceC83737Wth, Cert cert) {
        if (C62814Ol0.LJJ(this) && this.LLIILZL) {
            LJJJJLL(1.0f);
        }
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.LLIILZL = z;
        this.LJLJJL.add(new C83983Wxf(this, interfaceC83737Wth));
        VECameraSettings.CAMERA_FACING_ID LJJIIZ = C62819Ol5.LJJIIZ(i);
        VECameraSettings.Builder builder = new VECameraSettings.Builder(this.LJZL);
        builder.setCameraFacing(LJJIIZ);
        builder.setRetryCnt(this.LLILZ.LJJIIJZLJL());
        VECameraSettings build = builder.build();
        o.LJIIIIZZ(build, "VECameraSettings.Builder…\n                .build()");
        this.LJZL = build;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("camera_switch VECameraController changeCamera cameraIndex:");
        LIZ.append(i);
        LIZ.append(", facingId:");
        LIZ.append(LJJIIZ);
        LIZ.append(", cameraSettings.cameraFacing:");
        LIZ.append(this.LJZL.getCameraFacing());
        LIZLLL.i(X1D.LIZIZ(LIZ));
        this.LJZ.LJJIJLIJ(this.LJZL, cert);
        InterfaceC83723WtT interfaceC83723WtT = this.LJLJLLL;
        if (interfaceC83723WtT != null) {
            ((C83634Ws2) interfaceC83723WtT).LIZJ(EnumC83718WtO.OPEN_CAMERA, cert);
        }
    }

    @Override // X.InterfaceC83863Wvj
    public final int LJIIL(int i, int i2, Integer num, InterfaceC65784Pro interfaceC65784Pro) {
        if (this.LLILL != -1) {
            this.LLILLL.LIZIZ().removeTrackFilter(this.LLILL);
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" => VEBlur # , remove blur, ratioIndex is ");
            LIZ.append(this.LLILL);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            this.LLILL = -1;
        }
        VEBlurFilterParam vEBlurFilterParam = new VEBlurFilterParam();
        vEBlurFilterParam.intensity = 3.0f;
        vEBlurFilterParam.height = i2;
        vEBlurFilterParam.width = i;
        if (num != null) {
            vEBlurFilterParam.lastFacing = num.intValue();
        }
        vEBlurFilterParam.callback = new C83994Wxq(interfaceC65784Pro);
        int addTrackFilter = this.LLILLL.LIZIZ().addTrackFilter(0, 0, vEBlurFilterParam, 0, 1000);
        this.LLILL = addTrackFilter;
        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" => VEBlur # , add blur, ratioIndex is ");
        LIZ2.append(this.LLILL);
        LIZLLL2.i(X1D.LIZIZ(LIZ2));
        return addTrackFilter;
    }

    @Override // X.InterfaceC83863Wvj
    public final boolean LJIILJJIL(int i, float f, float[] points, int i2) {
        o.LJIIIZ(points, "points");
        if (points.length < 2) {
            return false;
        }
        if (this.LLIIJLIL) {
            this.LLIIIL = System.currentTimeMillis();
        }
        C84133X0f c84133X0f = this.LJZ;
        if (c84133X0f.LJLLI.focusAtPoint(i, i2, f, (int) points[0], (int) points[1]) != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC83863Wvj
    public final void LLLLLLLZIL(C83817Wuz c83817Wuz, InterfaceC88472Yns interfaceC88472Yns, InterfaceC83737Wth cameraOpenListener, Cert cert) {
        o.LJIIIZ(cameraOpenListener, "cameraOpenListener");
        VECameraSettings.CAMERA_FACING_ID cameraFacing = this.LJZL.getCameraFacing();
        VECameraSettings LJJJI = C1DH.LJJJI(c83817Wuz, interfaceC88472Yns);
        LJJJI.setCameraFacing(cameraFacing);
        this.LJZL = LJJJI;
        LJIJ(new C83989Wxl(this));
        this.LJZ.LJJI(this.LJZL);
    }

    public VECameraController(Context context, LifecycleOwner lifecycleOwner, VERecorder veRecorder, InterfaceC83931Wwp cameraContext, C83733Wtd c83733Wtd, boolean z, InterfaceC65784Pro<Boolean> interceptCallback, InterfaceC83697Wt3 interfaceC83697Wt3) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(veRecorder, "veRecorder");
        o.LJIIIZ(cameraContext, "cameraContext");
        o.LJIIIZ(interceptCallback, "interceptCallback");
        this.LLILLIZIL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = veRecorder;
        this.LLILZ = cameraContext;
        this.LLILZIL = c83733Wtd;
        this.LLILZLL = z;
        this.LLIZ = interceptCallback;
        this.LLIZLLLIL = interfaceC83697Wt3;
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new CopyOnWriteArrayList<>();
        this.LJLJJI = new CopyOnWriteArrayList<>();
        this.LJLJJL = new CopyOnWriteArrayList<>();
        this.LJLL = 720;
        this.LJLLI = 1280;
        this.LJLLJ = -1;
        this.LJLLL = new Object();
        synchronized (C83986Wxi.LIZ) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CameraCapturePreOpener:popCameraCapture ");
            LIZ.append((Object) null);
            LIZLLL.i(X1D.LIZIZ(LIZ));
        }
        this.LJZ = new C84133X0f();
        this.LJZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 45));
        this.LJZL = C1DH.LJJJI(cameraContext, new AqS180S0100000_14(this, 41));
        this.LL = -1.0f;
        this.LLD = C221108m2.LIZIZ(new AqS164S0100000_14(this, 46));
        this.LLF = EnumC83975WxX.NONE;
        this.LLFII = true;
        this.LLFZ = new ArrayList();
        this.LLII = 1.0f;
        this.LLIIII = true;
        this.LLIIIILZ = -1;
        this.LLIIIJ = 1;
        this.LLIIJI = 1000;
        this.LLIILII = getCameraPosition();
        this.LLIIZ = new ArrayList();
        C43045Guv.LIZLLL(new AqS164S0100000_14(this, 44), 0L);
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        sparseIntArray.put(0, 2);
        sparseIntArray.put(2, 0);
        this.LLILIL = sparseIntArray;
        this.LLILL = -1;
    }
}
