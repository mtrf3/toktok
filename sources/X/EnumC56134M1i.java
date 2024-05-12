package X;

/* renamed from: X.M1i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56134M1i {
    CARD_TYPE_UNKNOWN(0),
    CARD_TYPE_PRODUCT(1),
    CARD_TYPE_LIVE(2),
    CARD_TYPE_VIDEO(3),
    CARD_TYPE_SEARCH_BAR(4),
    CARD_TYPE_MORE_ENTRY(5),
    CARD_TYPE_CART_ENTRY(6),
    CARD_TYPE_ORDER_ENTRY(7),
    CARD_TYPE_COUPON_ENTRY(8),
    CARD_TYPE_PAYMENT_ENTRY(9),
    CARD_TYPE_FAVOURITE_ENTRY(10),
    CARD_TYPE_ADDRESS_ENTRY(11),
    CARD_TYPE_HELP_ENTRY(12),
    CARD_TYPE_NEW_USER_EXCLUSIVE_DEAL(13),
    CARD_TYPE_FLASH_SALE(14),
    CARD_TYPE_PIC(15),
    CARD_TYPE_VOUCHER(16),
    CARD_TYPE_AUTHOR(17),
    CARD_TYPE_MESSAGE_ENTRY(19),
    CARD_TYPE_USER_VIEW_ENTRY(22);

    public final int LJLIL;

    public static EnumC56134M1i valueOf(String str) {
        return (EnumC56134M1i) V0N.LJJJ(EnumC56134M1i.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC56134M1i(int i) {
        this.LJLIL = i;
    }
}
