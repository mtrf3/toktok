package X;

/* renamed from: X.IzR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48421IzR {
    public static final void LIZIZ(long j, String str, String str2, String str3) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("duration", Long.valueOf(j));
        c198517qh.LIZ.put("fileUri", str2);
        c198517qh.LIZ.put("fileUrlList", str);
        c198517qh.LIZ.put("isUseTTPlayer", Boolean.FALSE);
        c198517qh.LIZ.put("trace", str3);
        C09900aA.LJIIJJI("aweme_music_play_error_rate", 0, c198517qh.LJ());
    }

    public static final void LIZ(int i, String str, String str2, long j, String str3, String str4) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("duration", Long.valueOf(j));
        c198517qh.LIZ.put("fileUri", str2);
        c198517qh.LIZ.put("fileUrlList", str);
        c198517qh.LIZ.put("errorDesc", str3);
        c198517qh.LIZ.put("isUseTTPlayer", Boolean.FALSE);
        c198517qh.LIZ.put("trace", str4);
        C09900aA.LJIIJJI("aweme_music_play_error_rate", i, c198517qh.LJ());
    }
}
