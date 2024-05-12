package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;

/* renamed from: X.Wtc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83732Wtc implements InterfaceC83859Wvf {
    public final Context LIZ;
    public final C83733Wtd LIZIZ;

    @Override // X.InterfaceC83859Wvf
    public final boolean E4() {
        if (this.LIZIZ.LIZIZ && LJ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83859Wvf
    public final void LIZIZ() {
        this.LIZIZ.getClass();
    }

    @Override // X.InterfaceC83859Wvf
    public final int LIZLLL() {
        return this.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC83859Wvf
    public final boolean LJFF() {
        return this.LIZIZ.LIZJ;
    }

    @Override // X.InterfaceC83859Wvf
    public final void LJI() {
        this.LIZIZ.getClass();
    }

    @Override // X.InterfaceC83859Wvf
    public final int LJII() {
        this.LIZIZ.LIZIZ();
        return 1;
    }

    @Override // X.InterfaceC83859Wvf
    public final boolean LLJIJIL() {
        return this.LIZIZ.LIZIZ;
    }

    @Override // X.InterfaceC83859Wvf
    public final boolean f8() {
        return this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC83859Wvf
    public final boolean LJ() {
        if (!f8()) {
            LIZ(false);
            return false;
        }
        int i = C82087WJn.LIZ(this.LIZ).LIZ.getInt("key_camera_wide_mode", 0);
        if (i == 0) {
            this.LIZIZ.getClass();
            C83739Wtj.LIZIZ();
            LIZ(false);
            return false;
        }
        if (i != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(Context context) {
        if (C82087WJn.LIZ(context).LIZ.getInt("key_camera_wide_mode", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC83859Wvf
    public final void LIZ(boolean z) {
        int i;
        C82088WJo LIZ = C82087WJn.LIZ(this.LIZ);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        LIZ.LIZ.edit().putInt("key_camera_wide_mode", i).apply();
    }

    @Override // X.InterfaceC83859Wvf
    public final float LIZJ(float f) {
        this.LIZIZ.getClass();
        return f;
    }

    @Override // X.InterfaceC83859Wvf
    public final boolean LJIIIIZZ(boolean z) {
        if (this.LIZIZ.LIZLLL(z) && LJ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83859Wvf
    public final void LJIIIZ(Cert cert) {
        this.LIZIZ.LJFF(C83739Wtj.LIZ(), cert);
    }

    @Override // X.InterfaceC83859Wvf
    public final boolean LLJJJJLIIL(boolean z) {
        return this.LIZIZ.LIZLLL(z);
    }

    public C83732Wtc(Context context, VECameraController vECameraController, C83733Wtd c83733Wtd) {
        this.LIZ = context;
        if (c83733Wtd != null) {
            this.LIZIZ = c83733Wtd;
        } else {
            this.LIZIZ = new C83733Wtd();
        }
        this.LIZIZ.getClass();
        C83733Wtd c83733Wtd2 = this.LIZIZ;
        c83733Wtd2.LIZ = vECameraController;
        c83733Wtd2.LIZJ(LJ());
    }
}
