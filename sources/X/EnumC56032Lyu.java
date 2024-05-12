package X;

/* renamed from: X.Lyu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56032Lyu {
    TAB_SWITCH("tab_switch"),
    FROM_BACKGROUND("from_background"),
    TO_BACKGROUND("to_background"),
    FROM_SUBPAGE("from_subpage"),
    TO_SUBPAGE("to_subpage"),
    FROM_SPLIT_SCREEN("from_split_screen"),
    TO_SPLIT_SCREEN("to_split_screen"),
    FIRST_SCREEN("first_screen"),
    TAB_SWITCH_CANCELED("tab_switch_canceled"),
    WILL_TAB_SWITCH("will_tab_switch");

    public final String LJLIL;

    public static EnumC56032Lyu valueOf(String str) {
        return (EnumC56032Lyu) V0N.LJJJ(EnumC56032Lyu.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC56032Lyu(String str) {
        this.LJLIL = str;
    }
}
