package X;

/* renamed from: X.a2M, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91918a2M {
    BILL_USER_NEW("BILL_USER_NEW"),
    BILL_USER_CURR_BILL_NO_CONSUME("BILL_USER_CURR_BILL_NO_CONSUME"),
    BILL_USER_NORMAL_REPAID("BILL_USER_NORMAL_REPAID"),
    BILL_USER_NORMAL_UNREPAID("BILL_USER_NORMAL_UNREPAID");

    public static final C91917a2L Companion = new C91917a2L();
    public final String LJLIL;

    public static EnumC91918a2M valueOf(String str) {
        return (EnumC91918a2M) V0N.LJJJ(EnumC91918a2M.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC91918a2M(String str) {
        this.LJLIL = str;
    }
}
