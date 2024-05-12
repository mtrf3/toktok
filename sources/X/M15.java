package X;

/* loaded from: classes10.dex */
public enum M15 {
    BACK_TO_PREVIOUS_PAGE("back_to_previous_page"),
    MALL_CART_BASE_TOOLTIP("mall_cart_base_tooltip"),
    MALL_ORDERS_BASE_TOOLTIP("mall_orders_base_tooltip"),
    MALL_VOUCHER_DIALOG("mall_voucher_dialog"),
    MALL_VOUCHER_BLOCK("mall_voucher_block"),
    MALL_SPARKVIEW("mall_sparkview");

    public final String LJLIL;

    public static M15 valueOf(String str) {
        return (M15) V0N.LJJJ(M15.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    M15(String str) {
        this.LJLIL = str;
    }
}
