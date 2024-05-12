package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PV6 {
    public static volatile C64009PAf LIZ;
    public static volatile boolean LIZIZ;

    public static final void LIZJ(String str, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C77413UZt.LJJIII("errMsg", str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C77413UZt.LJJIII("stack", android.util.Log.getStackTraceString(th), jSONObject2);
        C77413UZt.LJJIII("type", th.getClass().getName(), jSONObject2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[Monitor] -> syncsdk_exception,");
        LIZ2.append(jSONObject);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ2));
        try {
            C78983UzD.LJIJ(th, str);
        } catch (Throwable unused) {
        }
    }

    public static final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[Monitor] ");
            LIZ2.append(str);
            LIZ2.append(", ");
            LIZ2.append(jSONObject);
            LIZ2.append(", ");
            LIZ2.append(jSONObject2);
            LIZ2.append(", ");
            LIZ2.append(jSONObject3);
            C66629QCz.LIZJ(X1D.LIZIZ(LIZ2));
            C64009PAf c64009PAf = LIZ;
            if (c64009PAf != null) {
                c64009PAf.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
    }

    public static /* synthetic */ void LIZIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i) {
        if ((i & 2) != 0) {
            jSONObject = null;
        }
        if ((i & 4) != 0) {
            jSONObject2 = null;
        }
        if ((i & 8) != 0) {
            jSONObject3 = null;
        }
        LIZ(str, jSONObject, jSONObject2, jSONObject3);
    }
}
