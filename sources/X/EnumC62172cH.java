package X;

/* renamed from: X.2cH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC62172cH {
    AWARD_CARD("award_card"),
    SHORT_TOUCH_CLICK("short_card_click"),
    RIVAL_CARD_CLICK("rival_card_click");

    public final String LJLIL;

    public static EnumC62172cH valueOf(String str) {
        return (EnumC62172cH) V0N.LJJJ(EnumC62172cH.class, str);
    }

    public final String getSource() {
        return this.LJLIL;
    }

    EnumC62172cH(String str) {
        this.LJLIL = str;
    }
}
