package X;

import java.util.LinkedHashMap;

/* renamed from: X.0TB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TB {
    public static volatile C0TB LIZJ;
    public C65019PfT LIZ;
    public volatile java.util.Map<String, String> LIZIZ;

    public static synchronized C0TB LIZIZ() {
        C0TB c0tb;
        synchronized (C0TB.class) {
            if (LIZJ == null) {
                LIZJ = new C0TB();
            }
            c0tb = LIZJ;
        }
        return c0tb;
    }

    public final java.util.Map<String, String> LIZ() {
        if (this.LIZIZ == null) {
            synchronized (C0TB.class) {
                if (this.LIZIZ == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("sdk_version", "14.9.13-mt");
                    linkedHashMap.put("device_type", C09590Zf.LJIILLIIL.LIZIZ);
                    linkedHashMap.put("device_platform", "android");
                    C09590Zf.LJIILLIIL.getClass();
                    linkedHashMap.put("status", String.valueOf(0));
                    linkedHashMap.put("aid", String.valueOf(C09590Zf.LJIILLIIL.LIZJ));
                    linkedHashMap.put("app_name", C09590Zf.LJIILLIIL.LIZLLL);
                    linkedHashMap.put("app_version", C09590Zf.LJIILLIIL.LJ);
                    linkedHashMap.put("update_version_code", String.valueOf(C09590Zf.LJIILLIIL.LJFF));
                    linkedHashMap.put("device_id", C09590Zf.LJIILLIIL.LJI);
                    linkedHashMap.put("user_id", C09590Zf.LJIILLIIL.LJII);
                    linkedHashMap.put("net_status", C79146V4k.LJJIJ());
                    this.LIZIZ = new LinkedHashMap(linkedHashMap);
                }
            }
        }
        return this.LIZIZ;
    }
}
