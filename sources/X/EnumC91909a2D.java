package X;

/* renamed from: X.a2D, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91909a2D {
    UNREPAID("UNREPAID"),
    REPAID("REPAID"),
    NO_NEED_TO_PAY("NO_NEED_TO_PAY"),
    OVERDUE("OVERDUE");

    public static final C91908a2C Companion = new C91908a2C();
    public final String LJLIL;

    public static EnumC91909a2D valueOf(String str) {
        return (EnumC91909a2D) V0N.LJJJ(EnumC91909a2D.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC91909a2D(String str) {
        this.LJLIL = str;
    }
}
