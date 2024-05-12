package X;

/* renamed from: X.a3E, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91972a3E {
    CheckoutBind("/payin_checkout_bind"),
    CheckoutPayResult("/payin_checkout"),
    PIManagement("/payin_pi_management");

    public final String LJLIL;

    public static EnumC91972a3E valueOf(String str) {
        return (EnumC91972a3E) V0N.LJJJ(EnumC91972a3E.class, str);
    }

    public final String getPath() {
        return this.LJLIL;
    }

    EnumC91972a3E(String str) {
        this.LJLIL = str;
    }
}
