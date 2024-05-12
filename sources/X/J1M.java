package X;

/* loaded from: classes9.dex */
public enum J1M {
    TURN_UP_VOLUME("turn_up_volume"),
    TURN_DOWN_VOLUME("turn_down_volume"),
    CLICK_UNMUTE_BUTTON("click_unmute_button"),
    CLICK_SERIES_UNMUTE_BUTTON("click_series_unmute_button");

    public final String LJLIL;

    public static J1M valueOf(String str) {
        return (J1M) V0N.LJJJ(J1M.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    J1M(String str) {
        this.LJLIL = str;
    }
}
