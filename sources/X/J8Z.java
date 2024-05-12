package X;

import Y.ARunnableS0S1200110_11;
import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J8Z {
    public static long LIZ;
    public static final Random LIZIZ = new Random();

    public static void LIZ(String scene, double d, long j, JSONObject jSONObject, HashMap extra) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(extra, "extra");
        C76W c76w = new C76W();
        if (extra.size() > 0) {
            for (String str : extra.keySet()) {
                c76w.LIZ(str, (String) extra.get(str));
            }
        }
        HandlerThreadC36423ERf.LIZJ().LJ(new ARunnableS0S1200110_11(c76w, scene, j, d, jSONObject, 0));
    }
}
