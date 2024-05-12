package X;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AFJ {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(int i, int i2, long j, String str) {
        C39398FdC c39398FdC = C39398FdC.LIZ;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("type", Integer.valueOf(i));
        c198517qh.LIZ.put("service", str);
        c198517qh.LIZ.put("status", Integer.valueOf(i2));
        c198517qh.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - j));
        JSONObject LJ = c198517qh.LJ();
        c39398FdC.getClass();
        C39398FdC.LIZIZ("kids_api_monitor", LJ);
    }
}
