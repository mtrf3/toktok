package X;

/* renamed from: X.a3A, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91968a3A {
    Pay("pay"),
    TokenizeAndPay("tokenize_and_pay"),
    PayOnToken("pay_on_token");

    public final String LJLIL;

    public static EnumC91968a3A valueOf(String str) {
        return (EnumC91968a3A) V0N.LJJJ(EnumC91968a3A.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC91968a3A(String str) {
        this.LJLIL = str;
    }
}
