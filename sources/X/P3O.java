package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AqS177S0100000_11;

/* loaded from: classes12.dex */
public final class P3O {
    public static final void LIZ(Cert cert, InterfaceC63834P3m interfaceC63834P3m) {
        OHW LIZ = C78946Uyc.LIZ(cert, new String[]{"video"}, "camera_close", 100201);
        C78929UyL.LIZIZ(LIZ, "android/hardware/Camera", "release()V", null);
        C39207Fa7.LIZ(LIZ, new AqS177S0100000_11(interfaceC63834P3m, 5));
    }

    public static final <T> T LIZIZ(Cert cert, InterfaceC63834P3m<T> interfaceC63834P3m) {
        OHW LIZ = C78946Uyc.LIZ(cert, new String[]{"video"}, "camera_open", 100206);
        C78929UyL.LIZIZ(LIZ, "android/hardware/Camera", "open()Landroid/hardware/Camera;", null);
        return (T) C39207Fa7.LIZ(LIZ, new AqS177S0100000_11(interfaceC63834P3m, 6));
    }
}
