package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.A1t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25569A1t {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, long j, String service) {
        o.LJIIIZ(service, "service");
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("service", service);
        c198517qh.LIZ.put("code", Integer.valueOf(i2));
        JSONObject LJ = c198517qh.LJ();
        C198517qh c198517qh2 = new C198517qh();
        c198517qh2.LIZ.put("duration", Long.valueOf(j));
        C09900aA.LJIIJ("compliance_age_gate_api", i, LJ, c198517qh2.LJ(), null);
    }
}
