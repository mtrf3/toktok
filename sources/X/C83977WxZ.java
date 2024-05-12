package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VECameraSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.WxZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83977WxZ implements InterfaceC83987Wxj {
    public final C84133X0f LIZ;
    public final InterfaceC83697Wt3 LIZIZ;

    @Override // X.InterfaceC83987Wxj
    public final void LIZJ() {
    }

    @Override // X.InterfaceC83987Wxj
    public final void LIZ() {
        synchronized (C83986Wxi.LIZ) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CameraCapturePreOpener:markPreOpenRoutineOver#needAdaptPreOpen=");
            LIZ.append(false);
            LIZLLL.i(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC83987Wxj
    public final void LIZLLL(C83980Wxc c83980Wxc) {
        C83986Wxi.LIZ();
        this.LIZ.LJLJJLL = c83980Wxc;
    }

    @Override // X.InterfaceC83987Wxj
    public final void LJ(C83976WxY c83976WxY) {
        C83986Wxi.LIZ();
        this.LIZ.LJLJL = c83976WxY;
    }

    @Override // X.InterfaceC83987Wxj
    public final void openCamera(Cert cert) {
        int LJJIIZI;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraCapturePreOpener: open camera ");
        C83986Wxi.LIZ();
        LIZ.append(false);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        C83986Wxi.LIZ();
        C83739Wtj.LIZIZ();
        C5L7.LIZIZ();
        InterfaceC83697Wt3 interfaceC83697Wt3 = this.LIZIZ;
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZIZ("camera_open");
        }
        C84133X0f c84133X0f = this.LIZ;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100800, "com/ss/android/vesdk/VECameraCapture", "open", c84133X0f, new Object[]{cert}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "-543706177089717679"));
        if (LIZJ.LIZ) {
            LJJIIZI = ((Integer) LIZJ.LIZIZ).intValue();
        } else {
            LJJIIZI = c84133X0f.LJJIIZI(cert);
        }
        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CameraCapturePreOpener:ret=");
        LIZ2.append(LJJIIZI);
        LIZLLL2.i(X1D.LIZIZ(LIZ2));
    }

    public C83977WxZ(C84133X0f cameraCapture, InterfaceC83697Wt3 interfaceC83697Wt3) {
        o.LJIIIZ(cameraCapture, "cameraCapture");
        this.LIZ = cameraCapture;
        this.LIZIZ = interfaceC83697Wt3;
    }

    @Override // X.InterfaceC83987Wxj
    public final void LIZIZ(Context context, VECameraSettings settings) {
        o.LJIIIZ(settings, "settings");
        C83986Wxi.LIZ();
        InterfaceC83697Wt3 interfaceC83697Wt3 = this.LIZIZ;
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZ("ve_recorder_init_to_camera_init");
        }
        InterfaceC83697Wt3 interfaceC83697Wt32 = this.LIZIZ;
        if (interfaceC83697Wt32 != null) {
            interfaceC83697Wt32.LIZIZ("camera_init");
        }
        this.LIZ.LJJIIJZLJL(C16880lQ.LLLLL(context), settings);
        InterfaceC83697Wt3 interfaceC83697Wt33 = this.LIZIZ;
        if (interfaceC83697Wt33 != null) {
            interfaceC83697Wt33.LIZ("camera_init");
        }
    }
}
