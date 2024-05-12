package X;

/* renamed from: X.7I0, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C7I0 {
    LEFT_HOT_ZONE("click_left_edge"),
    RIGHT_HOT_ZONE("click_right_edge"),
    INVALID_ZONE("");

    public final String LJLIL;

    public static C7I0 valueOf(String str) {
        return (C7I0) V0N.LJJJ(C7I0.class, str);
    }

    public final String getMethod() {
        return this.LJLIL;
    }

    C7I0(String str) {
        this.LJLIL = str;
    }
}
