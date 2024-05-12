package X;

/* renamed from: X.I7p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46105I7p {
    ANOLE_ALL_INTERACT("tt_interactive"),
    ANOLE_TOP_LEFT_INTERACT("tt_top_left_interactive"),
    ANOLE_LEFT_INTERACT("tt_left_interactive"),
    ANOLE_RIGHT_INTERACT("tt_right_interactive"),
    ANOLE_BOTTOM_INTERACT("tt_bottom_interactive");

    public final String LJLIL;

    public static EnumC46105I7p valueOf(String str) {
        return (EnumC46105I7p) V0N.LJJJ(EnumC46105I7p.class, str);
    }

    public final String getInteractName() {
        return this.LJLIL;
    }

    EnumC46105I7p(String str) {
        this.LJLIL = str;
    }
}
