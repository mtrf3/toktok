package X;

/* renamed from: X.a2F, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91911a2F {
    ORDER_STATUS_NORMAL("ORDER_STATUS_NORMAL"),
    ORDER_REFUND("ORDER_STATUS_REFUND"),
    ORDER_PARTIAL_REFUND("ORDER_STATUS_PARTIAL_REFUND");

    public static final C91910a2E Companion = new Object() { // from class: X.a2E
    };
    public final String LJLIL;

    public static EnumC91911a2F valueOf(String str) {
        return (EnumC91911a2F) V0N.LJJJ(EnumC91911a2F.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC91911a2F(String str) {
        this.LJLIL = str;
    }
}
