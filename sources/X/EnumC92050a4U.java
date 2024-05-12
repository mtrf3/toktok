package X;

/* renamed from: X.a4U, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC92050a4U {
    CheckoutListToSelectPi("payin_checkout_pm_list"),
    CheckoutPiSelected("payin_checkout_pm_selected"),
    CheckoutPayResult("payin_checkout_payresult"),
    PiCCDCBind("payin_checkout_ccdc_bind");

    public final String LJLIL;

    public static EnumC92050a4U valueOf(String str) {
        return (EnumC92050a4U) V0N.LJJJ(EnumC92050a4U.class, str);
    }

    public final String getPageID() {
        return this.LJLIL;
    }

    EnumC92050a4U(String str) {
        this.LJLIL = str;
    }
}
