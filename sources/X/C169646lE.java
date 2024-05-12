package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6lE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169646lE {
    public static volatile JSONObject LIZ;

    public static JSONObject LIZ() {
        boolean z;
        JSONObject jSONObject;
        if (LIZ == null) {
            FFL.LJIIIZ().getClass();
            String LJIILJJIL = FFL.LJIILJJIL(31744, "audio_metrics_experiment_consume", "", true);
            o.LJIIIIZZ(LJIILJJIL, "getExprVal()");
            if (LJIILJJIL.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    FFL.LJIIIZ().getClass();
                    jSONObject = new JSONObject(FFL.LJIILJJIL(31744, "audio_metrics_experiment_consume", "", true));
                } catch (Exception unused) {
                    jSONObject = null;
                }
                LIZ = jSONObject;
            }
        }
        return LIZ;
    }
}
