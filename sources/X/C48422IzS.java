package X;

/* renamed from: X.IzS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48422IzS {
    public static final /* synthetic */ int LIZ = 0;

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
