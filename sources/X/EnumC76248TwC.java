package X;

/* renamed from: X.TwC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC76248TwC {
    CLICKICON("click_icon"),
    INVITEREJECT("invite_reject"),
    CLICKCOUTDOWN("click_countdown"),
    TIMEOUT("time_out"),
    CLICKGUIDE("click_guide"),
    CLICKREMATCH("click_rematch");

    public final String LJLIL;

    public static EnumC76248TwC valueOf(String str) {
        return (EnumC76248TwC) V0N.LJJJ(EnumC76248TwC.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC76248TwC(String str) {
        this.LJLIL = str;
    }
}
