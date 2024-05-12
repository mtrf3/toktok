package X;

/* loaded from: classes6.dex */
public final class CLE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "recharge";
        } else {
            str3 = "send_gift";
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_wallet_limit_popup_click");
        KNV.LJ(4005189, LIZ2, "error_code", str3, "entry_type");
        LIZ2.LJIJJ(str2, "click_area");
        if (z) {
            LIZ2.LJIJJ("room_recharge", "hit_entry");
        } else {
            LIZ2.LJIJJ(C76828UDg.LIZ(str), "gift_enter_from");
        }
        LIZ2.LJJIIJZLJL();
    }
}
