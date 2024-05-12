package X;

/* renamed from: X.UIm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76964UIm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, long j, long j2, long j3, long j4, long j5) {
        long currentTimeMillis = System.currentTimeMillis() - j5;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_preview_live_gift_effect_download_status");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(String.valueOf(j), "room_id");
        LIZ2.LJIJJ(String.valueOf(j2), "anchor_id");
        LIZ2.LJIJJ(String.valueOf(j3), "user_id");
        LIZ2.LJIJJ(String.valueOf(j4), "effect_id");
        LIZ2.LJIJJ(Integer.valueOf(i), "status_code");
        if (currentTimeMillis < 0 || j5 <= 0) {
            currentTimeMillis = 0;
        }
        C30869C9p.LIZ(currentTimeMillis, LIZ2, "effect_download_latency");
    }

    public static void LIZIZ(int i, long j, long j2, long j3, long j4, long j5) {
        long currentTimeMillis = System.currentTimeMillis() - j5;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_preview_live_gift_effect_api_status");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(String.valueOf(j), "room_id");
        LIZ2.LJIJJ(String.valueOf(j2), "anchor_id");
        LIZ2.LJIJJ(String.valueOf(j3), "user_id");
        LIZ2.LJIJJ(String.valueOf(j4), "effect_id");
        LIZ2.LJIJJ(Integer.valueOf(i), "status_code");
        if (currentTimeMillis < 0 || j5 <= 0) {
            currentTimeMillis = 0;
        }
        C30869C9p.LIZ(currentTimeMillis, LIZ2, "effect_api_latency");
    }
}
