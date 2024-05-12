package X;

/* renamed from: X.8En, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208058En {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(int i, int i2, long j, String str) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("status", Integer.valueOf(i));
        c198517qh.LIZ.put(WM7.SCENE_SERVICE, "duet_mode");
        c198517qh.LIZ.put("duration", Long.valueOf(j));
        c198517qh.LIZ.put("error_code", Integer.valueOf(i2));
        c198517qh.LIZ.put("error", str);
        C09900aA.LJIIJJI("duet_mode_video_download", 0, c198517qh.LJ());
    }
}
