package X;

/* renamed from: X.8E0, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C8E0 {
    NO_SHEET(true),
    ADD_PROFILE(true),
    SET_UP_NICKNAME(false),
    PROFILE_ADDED_SET_UP_NICKNAME(true),
    PROFILE_ADDED(true);

    public final boolean LJLIL;

    public static C8E0 valueOf(String str) {
        return (C8E0) V0N.LJJJ(C8E0.class, str);
    }

    public final boolean getShowCloseXMark() {
        return this.LJLIL;
    }

    C8E0(boolean z) {
        this.LJLIL = z;
    }
}
