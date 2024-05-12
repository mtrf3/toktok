package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.bpea.basics.Cert;
import com.zhiliaoapp.musically.R;
import java.lang.Enum;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83855Wvb<KEY extends Enum<KEY>> implements InterfaceC83830WvC<KEY>, InterfaceC83991Wxn {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final String LJLLL;
    public int LJLLLL;
    public long LJLLLLLL;
    public int LJLZ;
    public final C73849Syb<Boolean> LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public final InterfaceC83821Wv3<KEY> LL;
    public final C83851WvX LLD;

    public final InterfaceC83703Wt9 LJI() {
        return (InterfaceC83703Wt9) this.LJLJJLL.getValue();
    }

    public final C89468Z9k LJII() {
        return (C89468Z9k) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC83640Ws8
    public final void LJL() {
        this.LJLL = false;
        this.LJLJLLL = false;
        getCameraController().LJJIIJZLJL();
    }

    @Override // X.InterfaceC83640Ws8
    public final boolean LLFZ() {
        return Z6(false) == 1;
    }

    @Override // X.InterfaceC83640Ws8
    public final void Y3() {
        LJI().LIZJ(Z6(false) != 1 ? 1 : 0);
    }

    public final InterfaceC83863Wvj getCameraController() {
        return (InterfaceC83863Wvj) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC83640Ws8
    public final int getCameraFacing() {
        return Z6(false);
    }

    public final InterfaceC83737Wth LJFF() {
        C83856Wvc c83856Wvc = new C83856Wvc(this);
        this.LJZL = true;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLLL);
        LIZ.append(" generateOpenCameraListener => curIsOpenCameraListenersFirstGenerated:");
        LIZ.append(this.LJZL);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        return c83856Wvc;
    }

    public final void LJIIIZ() {
        int i = this.LJLZ;
        if (i != 0) {
            if (i != 1 || getCameraController().LLLLLLZZ() || this.LJLLI) {
                return;
            }
            this.LJLLI = true;
            TMB tmb = C82890Wg2.LJFF;
            Context LLLLJI = C16880lQ.LLLLJI(C82891Wg3.LIZ());
            tmb.getClass();
            TMB.LIZ(R.string.cg1, 1, LLLLJI).LIZ();
            return;
        }
        if (getCameraController().LLLLLLZZ() || this.LJLLILLLL) {
            return;
        }
        this.LJLLILLLL = true;
        TMB tmb2 = C82890Wg2.LJFF;
        Context LLLLJI2 = C16880lQ.LLLLJI(C82891Wg3.LIZ());
        tmb2.getClass();
        TMB.LIZ(R.string.cg1, 1, LLLLJI2).LIZ();
    }

    @Override // X.InterfaceC83640Ws8
    public final InterfaceC83737Wth O0() {
        if (this.LJZL) {
            return null;
        }
        return LJFF();
    }

    @Override // X.InterfaceC83830WvC
    public final C83935Wwt getSessionContext() {
        return this.LLD.LJLJJL.invoke();
    }

    @Override // X.InterfaceC83830WvC
    public final void LIZ() {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLLL);
        LIZ.append(" => active");
        LIZLLL.i(X1D.LIZIZ(LIZ));
        this.LJZ.onNext(Boolean.TRUE);
    }

    @Override // X.InterfaceC83830WvC
    public final void LIZIZ() {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLLL);
        LIZ.append(" => inactive");
        LIZLLL.i(X1D.LIZIZ(LIZ));
        this.LJZ.onNext(Boolean.FALSE);
    }

    public final boolean LJIIJ() {
        if (!getCameraController().LLLLZI()) {
            if (!this.LJLL) {
                TMB tmb = C82890Wg2.LJFF;
                Context LLLLJI = C16880lQ.LLLLJI(C82891Wg3.LIZ());
                tmb.getClass();
                TMB.LIZ(R.string.tx_, 1, LLLLJI).LIZ();
                this.LJLL = true;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83640Ws8
    public final void T6() {
        getCameraController().LIZIZ(0.0f);
        LJL();
    }

    @Override // X.InterfaceC83640Ws8
    public final void Y6() {
        int LIZ = LJI().LIZ();
        int i = 1;
        if (LIZ == 1) {
            i = 0;
        }
        LJI().LIZJ(i);
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        C0EH.LIZLLL(LIZ2, this.LJLLL, " => camera_switch CameraModule switchFrontRearCameraOnlyStore originFacing: ", LIZ, ", newFacing: ");
        LIZ2.append(i);
        LIZLLL.i(X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC83830WvC
    public final void release() {
        LJII().getClass();
    }

    @Override // X.InterfaceC83640Ws8
    public final int LLJJJ() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC83830WvC
    public final InterfaceC83821Wv3<KEY> getKey() {
        return this.LL;
    }

    public final void LJ(boolean z) {
        getCameraController().setCameraPreviewSizeInterface((InterfaceC83997Wxt) this.LJLJL.getValue());
        getCameraController().LLLLZ(this);
        C1DF.LJJI(this.LLD.LJLJI, z);
        this.LJZI = true;
    }

    public final void LJIIIIZZ(String str) {
        if (this.LJLLLL != -1) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            YE1.LIZLLL(LIZ, this.LJLLL, " => VEBlur # onCameraSwitched, enterFrom: ", str, " , actual remove blur, ratioIndex is ");
            LIZ.append(this.LJLLLL);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            getCameraController().LJJIZ(this.LJLLLL);
            this.LJLLLL = -1;
        }
    }

    @Override // X.InterfaceC83640Ws8
    public final void LLJJL(float f) {
        this.LJLJLLL = true;
        LJIIIZ();
        if (LJIIJ()) {
            return;
        }
        getCameraController().LLJJL(f);
    }

    @Override // X.InterfaceC83640Ws8
    public final int Z6(boolean z) {
        Integer num = getSessionContext().LJLIL;
        if (num != null && this.LJLLJ) {
            this.LJLLJ = false;
            int LIZIZ = LJI().LIZIZ(num.intValue());
            LJI().LIZJ(LIZIZ);
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("=> camera_switch CameraModule getCameraFacing incomeFacing: ");
            LIZ.append(num);
            LIZ.append(", fromInit:");
            LIZ.append(z);
            LIZ.append(", facing:");
            LIZ.append(LIZIZ);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            return LIZIZ;
        }
        return LJI().LIZ();
    }

    @Override // X.InterfaceC83640Ws8
    public final void n0(boolean z) {
        if (this.LJZI) {
            return;
        }
        LJ(z);
    }

    public C83855Wvb(InterfaceC83821Wv3<KEY> key, C83851WvX c83851WvX) {
        o.LJIIIZ(key, "key");
        this.LL = key;
        this.LLD = c83851WvX;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLIL = C221108m2.LIZ(enumC221088m0, new AqS164S0100000_14(this, 410));
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS164S0100000_14(this, 403));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS164S0100000_14(this, 404));
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new AqS164S0100000_14(this, 402));
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS164S0100000_14(this, 407));
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, new AqS164S0100000_14(this, 405));
        this.LJLJL = C221108m2.LIZ(enumC221088m0, new AqS164S0100000_14(this, 406));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 408));
        this.LJLLJ = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseCaptureSession ");
        LIZ.append(key);
        this.LJLLL = X1D.LIZIZ(LIZ);
        this.LJLLLL = -1;
        this.LJZ = new C73849Syb<>();
    }

    @Override // X.InterfaceC83640Ws8
    public final boolean LLJJLIIIJLLLLLLLZ(float f, float f2) {
        LJII().LJ(this.LJLJLLL, getCameraController().LLJJJJJIL(), getCameraController().getCameraZoomList());
        if (this.LJLJLLL) {
            return true;
        }
        LJIIIZ();
        if (LJIIJ()) {
            return true;
        }
        getCameraController().LLJJLIIIJLLLLLLLZ(f, f2);
        return true;
    }

    @Override // X.InterfaceC83640Ws8
    public final void U6(Cert cert, boolean z) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLLL);
        LIZ.append(" => closeCamera");
        LIZLLL.i(X1D.LIZIZ(LIZ));
        C89468Z9k LJII = LJII();
        LJII.getClass();
        new AqS164S0100000_14(LJII, 414).invoke();
        getCameraController().LJIILLIIL(cert, z);
    }

    @Override // X.InterfaceC83640Ws8
    public final void V6(Cert cert, boolean z) {
        boolean z2;
        int LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("policyPlaceholder: ");
        LIZ.append(cert);
        C78922UyE.LIZ("ACTION_NAME_INIT_CAMERA", X1D.LIZIZ(LIZ));
        boolean z3 = false;
        if (getCameraController().getCameraState() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJLLL);
        LIZ2.append(" => initCamera cameraAlreadyOpened:");
        LIZ2.append(z2);
        LIZLLL.i(X1D.LIZIZ(LIZ2));
        if (Z6(!z2) == 0) {
            z3 = true;
            LJII = getCameraController().LJIIIZ().LIZLLL();
        } else {
            LJII = getCameraController().LJIIIZ().LJII();
        }
        LJ(z3);
        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(this.LJLLL);
        LIZ3.append(" => open camera");
        LIZLLL2.d(X1D.LIZIZ(LIZ3));
        InterfaceC83737Wth LJFF = LJFF();
        LJII().LJII();
        if (this.LLD.LJLIL.R3().invoke().booleanValue()) {
            C5NP LIZLLL3 = C82891Wg3.LIZLLL();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(this.LJLLL);
            LIZ4.append(" => forbid open camera in background");
            LIZLLL3.i(X1D.LIZIZ(LIZ4));
            return;
        }
        if (z) {
            getCameraController().LJFF(LJFF, cert);
        } else {
            getCameraController().LJJIJIL(LJII, LJFF, cert);
        }
    }

    @Override // X.InterfaceC83640Ws8
    public final void W6(Cert cert, boolean z) {
        if (z) {
            int LIZLLL = getCameraController().LJIIIZ().LIZLLL();
            C5NP LIZLLL2 = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLLL);
            LIZ.append(" => VEBlur # SwitchWideMode, start add blur, ratioIndex is ");
            LIZ.append(this.LJLLLL);
            LIZLLL2.i(X1D.LIZIZ(LIZ));
            this.LJLLLL = getCameraController().LJIIL(360, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, Integer.valueOf(LIZLLL), new AqS164S0100000_14(this, 409));
        }
        getCameraController().LJIIIZ().LJIIIZ(cert);
    }

    @Override // X.InterfaceC83640Ws8
    public final void X6(boolean z, Cert cert, boolean z2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("async: ");
        LIZ.append(z);
        LIZ.append(", policyPlaceholder: ");
        LIZ.append(cert);
        C78922UyE.LIZ("ACTION_NAME_RELEASE_CAMERA", X1D.LIZIZ(LIZ));
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJLLL);
        LIZ2.append(" => camera release");
        LIZLLL.i(X1D.LIZIZ(LIZ2));
        getCameraController().LJJJJJ(0);
        U6(cert, z);
        getCameraController().setCameraPreviewSizeInterface(null);
        getCameraController().LJIIJ(this);
        if (this.LLD.LJLIL.P3()) {
            if (this.LLD.LJLIL.LJJIIJ()) {
                ((InterfaceC83670Wsc) this.LJLJJI.getValue()).LJI(C83652WsK.LIZ("bpea-audio_capture_tools_release_with_camera_closed"), z2);
            } else {
                ((InterfaceC83865Wvl) this.LJLJJL.getValue()).T8(false, C83652WsK.LIZ("bpea-audio_tools_release_with_camera_closed"));
            }
        }
    }

    @Override // X.InterfaceC83991Wxn
    public final void onChange(int i, float f, boolean z) {
        LJII().LJIIIZ(f, i, z);
    }

    @Override // X.InterfaceC83640Ws8
    public final int z6(boolean z, Cert cert, String str) {
        int i;
        int LJII;
        this.LJLLLLLL = System.currentTimeMillis();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLLL);
        LIZ.append(" => VEBlurDuration # startCameraSwitch, withBlur: ");
        LIZ.append(z);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        int LIZ2 = LJI().LIZ();
        boolean z2 = false;
        if (LIZ2 == 1) {
            i = 0;
        } else {
            i = 1;
        }
        LJI().LIZJ(i);
        if (Z6(false) == 0) {
            z2 = true;
            LJII = getCameraController().LJIIIZ().LIZLLL();
        } else {
            LJII = getCameraController().LJIIIZ().LJII();
        }
        this.LLD.LJLJI.LIZJ(!z2);
        if (z) {
            if (LIZ2 != 1) {
                LIZ2 = getCameraController().LJIIIZ().LIZLLL();
            }
            C5NP LIZLLL2 = C82891Wg3.LIZLLL();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this.LJLLL);
            LIZ3.append(" => VEBlur # onCameraSwitched, start add blur, ratioIndex is ");
            LIZ3.append(this.LJLLLL);
            LIZLLL2.i(X1D.LIZIZ(LIZ3));
            this.LJLLLL = getCameraController().LJIIL(360, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, Integer.valueOf(LIZ2), new AqS164S0100000_14(this, 411));
        }
        C5NP LIZLLL3 = C82891Wg3.LIZLLL();
        StringBuilder LIZ4 = X1D.LIZ();
        C0EH.LIZLLL(LIZ4, this.LJLLL, " => camera_switch CameraModule switchFrontRearCamera originFacing: originFacing, newFacing:", i, ", isBackCamera:");
        C1FL.LJFF(LIZ4, z2, ", cameraIndex:", LJII, ", enterMethod:");
        LIZ4.append(str);
        LIZLLL3.i(X1D.LIZIZ(LIZ4));
        C44428Hc8 LIZ5 = C44428Hc8.LIZ();
        try {
            getCameraController().LJJIJL(LJII, new C83858Wve(this, LIZ5, str), cert);
        } catch (Exception e) {
            C82891Wg3.LIZLLL().LIZIZ(e);
        }
        getCameraController().LJIJ(new C83857Wvd(this, LIZ5, str));
        return LJII;
    }

    @Override // X.InterfaceC83991Wxn
    public final void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list) {
        LJII().LIZJ(i, z, z2, f, list);
    }
}
