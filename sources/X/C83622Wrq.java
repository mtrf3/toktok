package X;

import X.InterfaceC82086WJm;
import Y.AObjectS14S0001000_13;
import Y.AObjectS15S0001000_14;
import Y.AObjectS34S0000000_14;
import Y.ARunnableS1S0101001_14;
import android.os.Build;
import android.os.Looper;
import android.view.Surface;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wrq */
/* loaded from: classes15.dex */
public class C83622Wrq<T extends InterfaceC82086WJm> extends C83621Wrp<T> implements InterfaceC82086WJm {
    public boolean LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLIL;
    public boolean LLLLLILLIL;
    public boolean LLLLLJIL;
    public final C29901Fi<Boolean> LLLLLJLJLL;
    public C83635Ws3 LLLLLL;
    public boolean LLLLLLIL;
    public boolean LLLLLLJ;

    public static /* synthetic */ C76800UCe L1(Integer num) {
        return null;
    }

    public static /* synthetic */ C76800UCe O1(Integer num) {
        return null;
    }

    public boolean F1() {
        return false;
    }

    private C83629Wrx G1() {
        return this.LLLLLL.LIZ;
    }

    private C83632Ws0 J1() {
        return this.LLLLLL.LIZIZ;
    }

    @Override // X.InterfaceC82086WJm
    public C83627Wrv Bc() {
        return this.LLLLLL.LIZLLL;
    }

    @Override // X.InterfaceC82086WJm
    public InterfaceC82128WLc H1() {
        return this.LLJLIL.LJJIJ;
    }

    @Override // X.C83621Wrp
    public void LLLLLIL() {
        this.LLJJI.getClass();
        J1().LIZJ(C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_ON_SURFACE_DESTROY, EnumC158826Le.PAGE_INVISIBLE), this.LLJJJIL);
        this.LLFZ.LJII(C76800UCe.LIZ);
        C82891Wg3.LIZLLL().d("CameraLogicComponent => surfaceDestroyed, stopPreviewAsync called()");
        e8().LLZZ(new AObjectS34S0000000_14(0), this.LLJJJIL);
        n1();
    }

    @Override // X.C83621Wrp
    public void LLLLLL() {
        this.LLJJI.getClass();
        J1().LIZJ(C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_ON_TEXTURE_DESTROY, EnumC158826Le.PAGE_INVISIBLE), this.LLJJJIL);
        this.LLFZ.LJII(C76800UCe.LIZ);
        C82891Wg3.LIZLLL().i("CameraLogicComponent => surfaceDestroyed");
        C82891Wg3.LIZLLL().LIZ("stopPreviewAsync called()");
        e8().LLZZ(new AObjectS15S0001000_14(1, 2), this.LLJJJIL);
        n1();
    }

    @Override // X.C83621Wrp
    public void LLLZZ() {
        this.LLLLLL = new C83635Ws3(new C83699Wt5(this), new C83626Wru(this));
    }

    @Override // X.InterfaceC82086WJm
    public C83625Wrt jL() {
        return this.LLLLLL.LIZJ;
    }

    @Override // X.C83621Wrp
    public void n1() {
        this.LLJJI.getClass();
        C78862UxG LIZIZ = C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_SURFACE_DESTROY, EnumC158826Le.PAGE_INVISIBLE);
        C83632Ws0 J1 = J1();
        boolean z = this.LLJJJIL;
        J1.getClass();
        J1.LIZ(new C83644WsC(J1.LIZIZ, new C83677Wsj(0, 0), new NDG(J1.LIZJ.LIZ(new C83682Wso(z), "action_name_close_camera"), LIZIZ)));
        e8().LLLLLLZ();
        e8().LLLLLJLJLL(this.LLLLII);
        this.LLJILLL = false;
        this.LJLJJI.LJI(Boolean.FALSE);
    }

    @Override // X.C83621Wrp
    public void LLLLLJLJLL() {
        C82891Wg3.LIZLLL().d("CameraLogicComponent => surfaceCreated");
        e8().LIZ(this.LLLLII);
        LLLZLL();
        LLLZIIL();
        d1(false);
        e8().u8(this.LLILL, Build.DEVICE, new AObjectS14S0001000_13(4, 0));
        if (this.LLLLL) {
            this.LLLLL = false;
            if (this.LLLLLILLIL) {
                H0();
                return;
            }
            return;
        }
        C83632Ws0 J1 = J1();
        this.LLJJI.getClass();
        J1.LIZIZ(C83651WsJ.LIZIZ.LIZ(EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE, null));
    }

    @Override // X.C83621Wrp, X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        G1().LIZIZ(C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_COMPONENT_ON_DESTROY, EnumC158826Le.PAGE_INVISIBLE), this.LLJJJIL);
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        C83592WrM c83592WrM = this.LLJLIL;
        if (c83592WrM.LJJ) {
            if (c83592WrM.LJJI) {
                V0(this.LLJJJIL, C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_ON_PAUSE, EnumC158826Le.PAGE_INVISIBLE), false);
            }
            G1().LIZLLL(C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_ON_PAUSE, EnumC158826Le.PAGE_INVISIBLE));
        }
        C83629Wrx G1 = G1();
        C78862UxG LIZIZ = C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.STOP_AUDIO_CAMERA_LOGIC_PAUSE, EnumC158826Le.PAGE_INVISIBLE);
        G1.getClass();
        G1.LIZ(new C83644WsC(G1.LIZIZ, new C83677Wsj(0, 2), new NDG(G1.LIZJ.LIZ(null, "action_name_release_audio_capture"), LIZIZ)));
    }

    @Override // X.C83621Wrp, X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        if (this.LLJLIL.LJJ) {
            C83629Wrx G1 = G1();
            this.LLJJI.getClass();
            G1.LIZJ(C83651WsJ.LIZIZ.LIZ(EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_ON_RESUME, null));
        }
        C83629Wrx G12 = G1();
        G12.getClass();
        G12.LIZ(new C83644WsC(G12.LIZIZ, new C83677Wsj(0, 1), new NDG(G12.LIZJ.LIZ(new C83693Wsz(), "action_name_init_audio_capture"), (Cert) null)));
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        if (!this.LLJLIL.LJJ) {
            C83629Wrx G1 = G1();
            this.LLJJI.getClass();
            G1.LIZJ(C83651WsJ.LIZIZ.LIZ(EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_ON_START, null));
        }
    }

    @Override // X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        if (this.LLJLIL.LJIL) {
            e8().LJJJJJ(0);
        }
        if (!this.LLJLIL.LJJ) {
            G1().LIZLLL(C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_ON_STOP_CAMERA_LOGIC, EnumC158826Le.PAGE_INVISIBLE));
        }
        if (this.LLJJJJ) {
            C82891Wg3.LIZLLL().d("CameraLogicComponent => release camera in onStop");
            this.LLJJI.getClass();
            C78862UxG LIZIZ = C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_COMPONENT_ON_STOP, EnumC158826Le.PAGE_INVISIBLE);
            C83629Wrx G1 = G1();
            boolean z = this.LLJJJIL;
            G1.getClass();
            G1.LIZ(new C83644WsC(G1.LIZIZ, new C83677Wsj(2, 2), new NDG(G1.LIZJ.LIZ(new C83683Wsp(z), "action_name_release_camera"), LIZIZ)));
        }
        if (this.LLLLL) {
            this.LLJJI.getClass();
            G1().LIZIZ(C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_VIEW_ON_STOP, EnumC158826Le.PAGE_INVISIBLE), this.LLJJJIL);
            this.LLLLL = false;
        }
        if (sm0() != null && this.LLJLIL.LJJIIZ) {
            sm0().setVisibility(8);
        }
    }

    @Override // X.C83621Wrp
    public void y0() {
        TEMonitorInvoker.nativeReset();
        LLLLZI();
        o1();
        if (!this.LLJLIL.LJIL && LLJJIJIL() != null) {
            getLifecycle().addObserver(LLJJIJIL());
        }
        e8().LLLZI(new InterfaceC88474Ynu() { // from class: X.Wsv
            @Override // X.InterfaceC88474Ynu
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return C83622Wrq.R1(C83622Wrq.this, (Integer) obj, (Integer) obj2, (String) obj3, (VERecorder) obj4);
            }
        });
        this.LLJLIL.getClass();
        LLZ();
    }

    @Override // X.InterfaceC82086WJm
    public LiveEvent<Boolean> MI() {
        return this.LLLLLJLJLL;
    }

    public void W1() {
        c1();
    }

    @Override // X.InterfaceC82086WJm
    public void Y3() {
        W0();
    }

    public static /* synthetic */ C76800UCe M1(Integer num) {
        if (num.intValue() != 0) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopPreviewAsync ret = ");
            LIZ.append(num);
            LIZLLL.LIZ(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }

    public static /* synthetic */ C76800UCe Q1(Integer num) {
        if (num.intValue() != 0) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopPreviewAsync ret = ");
            LIZ.append(num);
            LIZLLL.LIZ(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }

    public void K1(Cert cert) {
        S0(cert);
    }

    @Override // X.C83621Wrp
    public void LLLFFI(int i) {
        Z1(Integer.valueOf(i), Boolean.TRUE);
    }

    @Override // X.C83621Wrp
    public void LLLI(int i) {
        if (sm0().getVisibility() == 8) {
            return;
        }
        LJFF();
        this.LLLLLILLIL = true;
        if (this.LLILL != null) {
            H0();
        }
        e8().LLLLZLLLI(this.LLLFFI);
        Z1(Integer.valueOf(i), Boolean.TRUE);
    }

    @Override // X.C83621Wrp
    public void LLLLJI(Surface surface) {
        super.LLLLJI(surface);
        C82891Wg3.LIZLLL().d("CameraLogicComponent => surfaceCreated");
        if (!this.LLLLL || !this.LLJLIL.LJIIIZ) {
            e8().LIZ(this.LLLLII);
        }
        LLLZLL();
        LLLZIIL();
        d1(false);
        this.LLILL = surface;
        if (this.LLLLL && this.LLJLIL.LJIIIZ) {
            e8().t8(getSurface());
        } else {
            e8().u8(getSurface(), Build.DEVICE, new AObjectS15S0001000_14(2, 0));
        }
        if (this.LLLLL) {
            this.LLLLL = false;
            if (this.LLLLLILLIL) {
                H0();
                return;
            }
            return;
        }
        if (this.LLJLIL.LJJ) {
            return;
        }
        C83632Ws0 J1 = J1();
        this.LLJJI.getClass();
        J1.LIZIZ(C83651WsJ.LIZIZ.LIZ(EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE, null));
    }

    @Override // X.InterfaceC82086WJm
    public void Om(boolean z) {
        rX().getCameraController().LJI(z);
        this.LLLLLJLJLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC82086WJm
    public void R40(InterfaceC73364Sqm interfaceC73364Sqm) {
        C83635Ws3 c83635Ws3 = this.LLLLLL;
        if (c83635Ws3 != null) {
            c83635Ws3.LJ.LIZJ = interfaceC73364Sqm;
            e8().setSensitiveApiCallback(this.LLLLLL.LJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC82086WJm
    public void Sp(List<String> contextTypes) {
        C83634Ws2 c83634Ws2 = this.LLLLLL.LJ;
        c83634Ws2.getClass();
        o.LJIIIZ(contextTypes, "contextTypes");
        String obj = contextTypes.toString();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SensitiveApiManagement: reset SensitiveApiContext: contextTypes: ");
        LIZ.append(obj);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        for (String str : contextTypes) {
            if (!((LinkedHashMap) c83634Ws2.LIZIZ).keySet().contains(str)) {
                return;
            }
            Object obj2 = ((LinkedHashMap) c83634Ws2.LIZ).get(str);
            if (obj2 != null) {
                c83634Ws2.LIZIZ.put(str, obj2);
            }
        }
    }

    @Override // X.InterfaceC82086WJm
    public void ms0(boolean z) {
        this.LLLLJI = z;
    }

    public void openCamera(Cert cert) {
        a70(false, cert);
    }

    private /* synthetic */ void T1(int i, float f) {
        this.LLJ.post(new ARunnableS1S0101001_14(this, i, f, 0));
    }

    private void Z1(Integer num, Boolean bool) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            this.LLIILZL.LJII(new OSZ<>(num, bool));
        } else {
            this.LLIILZL.LJI(new OSZ<>(num, bool));
        }
    }

    public void C7(boolean z, Cert cert) {
        gJ(false, cert);
    }

    @Override // X.InterfaceC82086WJm
    public void Os(Cert cert, boolean z) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SensitiveApiManagement: handle SensitiveApiEvent: ");
        LIZ.append("firstOpenCamera");
        LIZLLL.i(X1D.LIZIZ(LIZ));
        Er(false, cert, z);
    }

    @Override // X.InterfaceC82086WJm
    public void Yn(Cert cert, String str) {
        int cameraFacing = getCameraFacing();
        if (cameraFacing == 0) {
            C82085WJl LIZ = C82085WJl.LIZ();
            LIZ.LIZIZ = false;
            Bc().LJI(LIZ, cert, str);
        } else {
            if (cameraFacing != 1) {
                return;
            }
            C82085WJl LIZIZ = C82085WJl.LIZIZ();
            LIZIZ.LIZIZ = false;
            Bc().LJI(LIZIZ, cert, str);
        }
    }

    @Override // X.InterfaceC82086WJm
    public void Za(boolean z, Cert cert) {
        int i;
        C82127WLb r4 = r4();
        r4.getClass();
        C82127WLb.LJFF = z;
        C82088WJo LIZ = C82087WJn.LIZ(r4.LIZIZ);
        int i2 = 2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        LIZ.LIZ(i);
        Bc().LJII(z ? 1 : 0, cert);
        if (o9()) {
            this.LLD.LJII(Integer.valueOf(!z ? 1 : 0));
        }
        if (getFlashMode() != 0) {
            s9(0);
        }
        C29901Fi<Integer> c29901Fi = this.LL;
        if (z) {
            i2 = 3;
        }
        c29901Fi.LJII(Integer.valueOf(i2));
    }

    @Override // X.InterfaceC82086WJm
    public void a70(boolean z, Cert cert) {
        Er(z, cert, false);
    }

    @Override // X.InterfaceC82086WJm
    public void eh0(Cert cert, boolean z) {
        this.LLLLLJIL = true;
        Bc().LJ(cert);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        if (r1.LJJIIZ == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gJ(boolean r7, com.bytedance.bpea.basics.Cert r8) {
        /*
            r6 = this;
            java.lang.String r1 = "fromLifecycle: "
            java.lang.String r0 = ", isStoppedFromLifecycle: "
            java.lang.StringBuilder r1 = X.JBR.LJI(r1, r7, r0)
            boolean r0 = r6.LLLLJI
            r1.append(r0)
            java.lang.String r0 = ", policyPlaceholder: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "ACTION_NAME_STOP_PREVIEW"
            X.C78922UyE.LIZ(r0, r1)
            X.5NP r5 = X.C82891Wg3.LIZLLL()
            r0 = 3
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r0 = "CameraLogicComponent"
            r4[r2] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r3 = 1
            r4[r3] = r0
            boolean r0 = r6.LLLLJI
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 2
            r4[r0] = r1
            java.lang.String r0 = "%s stopPreview fromLifecycle: %b isStoppedFromLifecycle: %b"
            java.lang.String r0 = X.C16880lQ.LLLZ(r0, r4)
            r5.i(r0)
            boolean r0 = r6.LLLLJI
            if (r0 != 0) goto L48
            return
        L48:
            if (r7 == 0) goto L54
            X.WrM r1 = r6.LLJLIL
            boolean r0 = r1.LJJ
            if (r0 != 0) goto L54
            boolean r0 = r1.LJJIIZ
            if (r0 == 0) goto L59
        L54:
            boolean r0 = r6.LLJJJIL
            r6.V0(r0, r8, r3)
        L59:
            android.view.View r0 = r6.sm0()
            if (r0 == 0) goto L6e
            X.WrM r0 = r6.LLJLIL
            boolean r0 = r0.LJJIIZ
            if (r0 != 0) goto L6e
            android.view.View r1 = r6.sm0()
            r0 = 8
            r1.setVisibility(r0)
        L6e:
            r6.LLLLJI = r7
            X.1Fi<java.lang.Boolean> r1 = r6.LLIIIZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.LJI(r0)
            r6.LLLLLLJ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83622Wrq.gJ(boolean, com.bytedance.bpea.basics.Cert):void");
    }

    public static /* synthetic */ void S1(C83622Wrq c83622Wrq, int i, float f) {
        c83622Wrq.LJLZ.LJII(new OSZ<>(Integer.valueOf(i), Float.valueOf(f)));
    }

    public void Er(boolean z, Cert cert, boolean z2) {
        InterfaceC83702Wt8 interfaceC83702Wt8;
        StringBuilder LJI = JBR.LJI("fromLifecycle: ", z, ", isStoppedFromLifecycle: ");
        LJI.append(this.LLLLJI);
        LJI.append(", isCameraInit: ");
        LJI.append(this.LLLLLIL);
        LJI.append(", policyPlaceholder: ");
        LJI.append(cert);
        LJI.append(", ignoreIsAppBackground: ");
        LJI.append(z2);
        C78922UyE.LIZ("ACTION_NAME_START_PREVIEW", X1D.LIZIZ(LJI));
        boolean z3 = this.LLJLIL.LJJII;
        if (!z2 && z3 && (interfaceC83702Wt8 = this.LLJLILLLLZIIL) != null && interfaceC83702Wt8.isAppBackground()) {
            C82891Wg3.LIZLLL().i(C16880lQ.LLLZ("%s startPreview forbid in background", new Object[]{"CameraLogicComponent"}));
            return;
        }
        C82891Wg3.LIZLLL().i(C16880lQ.LLLZ("%s startPreview fromLifecycle: %b isCameraInit: %b isStoppedFromLifecycle: %b StackTrace: %s", new Object[]{"CameraLogicComponent", Boolean.valueOf(z), Boolean.valueOf(this.LLLLLIL), Boolean.valueOf(this.LLLLJI), C47261Igj.LJJII()}));
        if (z) {
            if ((!this.LLLLLJIL && !this.LLLLLIL) || !this.LLLLJI) {
                return;
            }
            this.LLJLIL.LJJIFFI.getClass();
            if (F1() && this.LLLLLLIL && this.LLLLLLJ) {
                this.LLLLLLIL = false;
                return;
            }
        }
        this.LLLLLLJ = true;
        if (!z || ((this.LLLLLJIL && !this.LLLLLIL) || this.LLJLIL.LJJ)) {
            this.LLLLLIL = true;
            S0(cert);
        }
        if (sm0() != null) {
            sm0().setVisibility(0);
        }
        this.LLLLJI = true;
        gq0(getFlashMode());
    }

    @Override // X.C83621Wrp
    public void LLJZIJLIL(int i, int i2, String str) {
        Z1(Integer.valueOf(i), Boolean.FALSE);
    }

    @Override // X.C83621Wrp
    public void LLLIIIL(int i, int i2, String str) {
        Z1(Integer.valueOf(i), Boolean.TRUE);
    }

    public void U1(boolean z, Cert cert, boolean z2) {
        V0(z, cert, z2);
    }

    @Override // X.C83621Wrp, X.WLT
    public void UB(boolean z, VK8 vk8, Cert cert) {
        String obj;
        StringBuilder LJI = JBR.LJI("enable: ", z, ", arConfig: ");
        if (vk8 == null) {
            obj = "null";
        } else {
            obj = vk8.toString();
        }
        LJI.append(obj);
        LJI.append(", policyPlaceHolder: ");
        LJI.append(cert);
        C78922UyE.LIZ("ACTION_NAME_SWITCH_AR_MODE", X1D.LIZIZ(LJI));
        super.UB(z, vk8, cert);
    }

    public int z6(boolean z, Cert cert, String str) {
        C82085WJl LIZ;
        if (getCameraFacing() == 1) {
            LIZ = C82085WJl.LIZIZ();
        } else {
            LIZ = C82085WJl.LIZ();
        }
        LIZ.LIZIZ = z;
        Bc().LJI(LIZ, cert, str);
        return 0;
    }

    @Override // X.C83621Wrp, X.WLT
    public int OQ(C82085WJl c82085WJl, Cert cert, String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ev: ");
        LIZ.append(c82085WJl);
        LIZ.append(", policyPlaceholder: ");
        LIZ.append(cert);
        LIZ.append(", enterMethod: ");
        LIZ.append(str);
        LIZ.append(", withBlur: ");
        LIZ.append(z);
        C78922UyE.LIZ("ACTION_NAME_SWITCH_CAMERA", X1D.LIZIZ(LIZ));
        return super.OQ(c82085WJl, cert, str, z);
    }

    public static /* synthetic */ C76800UCe R1(C83622Wrq c83622Wrq, Integer num, Integer num2, String str, VERecorder vERecorder) {
        if (num.intValue() == 1050) {
            InterfaceC83697Wt3 interfaceC83697Wt3 = c83622Wrq.LLJLL;
            if (interfaceC83697Wt3 != null) {
                interfaceC83697Wt3.LIZ("first_frame_captured_to_effect_first_frame");
                c83622Wrq.LLJLL.end();
            }
            c83622Wrq.K0();
        } else if (num.intValue() == VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
            if (c83622Wrq.LLZLL()) {
                c83622Wrq.I0(num2.intValue(), str);
            }
            InterfaceC83697Wt3 interfaceC83697Wt32 = c83622Wrq.LLJLL;
            if (interfaceC83697Wt32 != null) {
                interfaceC83697Wt32.LIZ("surface_set_to_first_frame_render", "first_frame_captured_to_first_frame_render");
            }
        }
        c83622Wrq.LLIIII.LJI(new C157166Eu(num, num2, str));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC82086WJm
    public void UK(int i, int i2, boolean z, boolean z2, InterfaceC63955P8d interfaceC63955P8d, boolean z3) {
        VERecorder vERecorder = this.LLILLL;
        if (vERecorder != null) {
            vERecorder.LJIIL(i, i2, z, z2, interfaceC63955P8d, z3);
        }
    }

    public C83622Wrq(C82622Wbi c82622Wbi, CameraComponentModel cameraComponentModel, InterfaceC83790WuY interfaceC83790WuY, InterfaceC44831Hid interfaceC44831Hid, InterfaceC83618Wrm interfaceC83618Wrm, InterfaceC15040iS<C83592WrM> interfaceC15040iS, InterfaceC83702Wt8 interfaceC83702Wt8) {
        this(c82622Wbi, cameraComponentModel, interfaceC83790WuY, interfaceC44831Hid, interfaceC83618Wrm, interfaceC15040iS, interfaceC83702Wt8, null, null);
    }

    public C83622Wrq(C82622Wbi c82622Wbi, CameraComponentModel cameraComponentModel, InterfaceC83790WuY interfaceC83790WuY, InterfaceC44831Hid interfaceC44831Hid, InterfaceC83618Wrm interfaceC83618Wrm, InterfaceC15040iS<C83592WrM> interfaceC15040iS, InterfaceC83702Wt8 interfaceC83702Wt8, InterfaceC83697Wt3 interfaceC83697Wt3, Effect effect) {
        super(c82622Wbi, cameraComponentModel, interfaceC83790WuY, interfaceC44831Hid, interfaceC83618Wrm, interfaceC15040iS, interfaceC83702Wt8, interfaceC83697Wt3, effect);
        this.LLLLJI = true;
        this.LLLLL = true;
        this.LLLLLJLJLL = new C29901Fi<>();
        this.LLLLLLIL = true;
        this.LLLLLLJ = false;
    }
}
