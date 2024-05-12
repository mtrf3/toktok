package X;

/* renamed from: X.4FY, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C4FY {
    NO_STATUS(0),
    ACTIVE_NOW(1),
    MIN_THRESHOLD(2),
    HOUR_THRESHOLD(3),
    DATE_THRESHOLD(4);

    public static final C106274Fb Companion = new C106274Fb();
    public final int LJLIL;

    public static C4FY valueOf(String str) {
        return (C4FY) V0N.LJJJ(C4FY.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C4FY(int i) {
        this.LJLIL = i;
    }
}
