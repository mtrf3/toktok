package X;

/* renamed from: X.BEy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28460BEy {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(long j, long j2, boolean z) {
        C29702BlC LIZLLL;
        if (z) {
            LIZLLL = C18230nb.LIZLLL("ttlive_add_ban");
        } else {
            LIZLLL = C18230nb.LIZLLL("ttlive_delete_ban");
        }
        LIZLLL.LIZIZ(Long.valueOf(j), "room_id");
        LIZLLL.LIZIZ(Long.valueOf(j2), "user_id");
        LIZLLL.LJIIIZ();
    }

    public static void LIZ(boolean z, long j, long j2, Throwable th) {
        C29702BlC LIZ2;
        if (z) {
            LIZ2 = C18210nZ.LIZ("ttlive_add_ban", th);
        } else {
            LIZ2 = C18210nZ.LIZ("ttlive_delete_ban", th);
        }
        LIZ2.LIZIZ(Long.valueOf(j), "room_id");
        LIZ2.LIZIZ(Long.valueOf(j2), "user_id");
        LIZ2.LJIIIZ();
    }
}
