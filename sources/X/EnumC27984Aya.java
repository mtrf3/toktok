package X;

/* renamed from: X.Aya, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC27984Aya {
    ADDON_ORDER("addon_order"),
    ADDRESS("address"),
    ANNOUNCEMENTS("announcements"),
    BILLING_ADDRESS("billing_address"),
    ORDER_SUMMARY("order_summary"),
    PAYMENT_METHODS("payment_methods"),
    PLATFORM_PROMOTION("platform_promotion"),
    PRIVACY_POLICY_STATEMENT("privacy_policy_statement"),
    SHIPPING_ADDRESS("shipping_address"),
    SHOP_ORDER_NEW("shop_orders_new");

    public final String LJLIL;

    public static EnumC27984Aya valueOf(String str) {
        return (EnumC27984Aya) V0N.LJJJ(EnumC27984Aya.class, str);
    }

    public final String getModuleName() {
        return this.LJLIL;
    }

    EnumC27984Aya(String str) {
        this.LJLIL = str;
    }
}
