package X;

import webcast.api.game.CreateInfoResponse;

/* renamed from: X.0Zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09720Zs {
    public static final C09720Zs LIZ = new C09720Zs();
    public static CreateInfoResponse.ResponseData LIZIZ;

    public static void LIZ(int i, String str, boolean z) {
        int i2 = !z ? 1 : 0;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_game_live_create_room_result");
        LIZ2.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "uid");
        LIZ2.LJIJJ(Integer.valueOf(i2), "result");
        LIZ2.LJIJJ(Integer.valueOf(i), "error_code");
        C1FL.LJI(LIZ2, str, "error_message");
    }
}
