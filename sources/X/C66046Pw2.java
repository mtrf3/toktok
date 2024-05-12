package X;

import com.bytedance.helios.sdk.HeliosEnvImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Pw2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66046Pw2 {
    public static final InterfaceC66048Pw4 LIZ;

    static {
        C66055PwB LJ;
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        InterfaceC66045Pw1 interfaceC66045Pw1 = heliosEnvImpl.LJIILIIL;
        C66222Pys c66222Pys = null;
        if (interfaceC66045Pw1 != null && (LJ = interfaceC66045Pw1.LJ()) != null) {
            c66222Pys = LJ.LIZ("sky_eye_repo");
        }
        LIZ = c66222Pys;
    }

    public static String LIZ(String str, String defaultValue) {
        String string;
        o.LJIIIZ(defaultValue, "defaultValue");
        InterfaceC66048Pw4 interfaceC66048Pw4 = LIZ;
        if (interfaceC66048Pw4 != null && (string = interfaceC66048Pw4.getString(str, defaultValue)) != null) {
            return string;
        }
        return defaultValue;
    }

    public static void LIZIZ(String str, String value) {
        o.LJIIIZ(value, "value");
        InterfaceC66048Pw4 interfaceC66048Pw4 = LIZ;
        if (interfaceC66048Pw4 != null) {
            interfaceC66048Pw4.putString(str, value);
        }
    }
}
