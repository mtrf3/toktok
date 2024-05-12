package X;

import android.hardware.Camera;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS34S0001000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OVe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62006OVe {
    public static Camera LIZ(int i, Cert cert) {
        OHW LJIIJJI = OUP.LJIIJJI(100100, cert, "camera_open1");
        C78929UyL.LIZIZ(LJIIJJI, "android/hardware/Camera", "open(I)Landroid/hardware/Camera;", C51029K0z.LJJIIZI(new OSZ("cameraId", Integer.valueOf(i))));
        return (Camera) C39207Fa7.LIZ(LJIIJJI, new AqS34S0001000_10(i, 4));
    }

    public static void LIZIZ(Camera release, Cert cert) {
        o.LJIIJ(release, "$this$release");
        OHW LJIIJJI = OUP.LJIIJJI(100101, cert, "camera_close1");
        C78929UyL.LIZIZ(LJIIJJI, "android/hardware/Camera", "release()V", null);
        C39207Fa7.LIZ(LJIIJJI, new AqS176S0100000_10(release, 235));
    }
}
