package X;

/* loaded from: classes6.dex */
public final class BE9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_limit_click");
        LIZ2.LJIJJ(Integer.valueOf(i), "is_anchor");
        LIZ2.LJIJJ(str, "first_panel_from");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(int i, String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_limit_manage_popup_click");
        LIZ2.LJIJJ(Integer.valueOf(i), "is_anchor");
        LIZ2.LJIJJ(str, "click_button");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, boolean z) {
        String str5 = "currency";
        HH1.LIZ(str, "firstPanelFrom", str2, "secondPanelFrom", str4, "currency");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_limit_gear_setting_panel_show");
        KNV.LJ(i, LIZ2, "is_anchor", str, "first_panel_from");
        C78895Uxn.LIZIZ(LIZ2, str2, "second_panel_from", i2, "if_show_apply");
        LIZ2.LJIJJ(str3, "apply_type");
        LIZ2.LJIJJ(Integer.valueOf(i3), "apply_amount");
        LIZ2.LJIJJ(Integer.valueOf(i4), "style");
        LIZ2.LJIJJ(str4, "currency");
        if (z) {
            str5 = "coins";
        }
        C1FL.LJI(LIZ2, str5, "coins_or_currency");
    }
}
