package X;

/* renamed from: X.Rmn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC70569Rmn {
    VIDEO_SINGLE_ANCHOR("video_anchor_single"),
    VIDEO_MULTI_ANCHOR("video_anchor"),
    VIDEO_COMMENT_MULTI_ANCHOR("video_comment_anchor"),
    VIDEO_SHOP_CARD_ANCHOR("video_shop_card_anchor"),
    LIVE_POP_CARD("live_pop_cart"),
    LIVE_CART_LIST("live_bag_cart"),
    LIVE_PRODUCT_IMAGE_SELECT("live_product_image_select"),
    PDP_HEADER("pdp_head"),
    PDP_DESC("pdp_desc"),
    PDP_REVIEW("pdp_comment"),
    REVIEW("review"),
    REVIEW_PHOTO("review_photo"),
    SKU_SHOP("sku_shop"),
    CART_SHOP("cart_shop"),
    SEARCH_PRODUCT("vertical_search_product_cover"),
    CART_PRODUCT("cart_product"),
    MALL_RACUN_PRODUCT("mall_racun_product"),
    CART_SELLER("cart_seller"),
    GENERAL_SEARCH_LIVE_CARD("general_search_live_card");

    public final String LJLIL;

    public static EnumC70569Rmn valueOf(String str) {
        return (EnumC70569Rmn) V0N.LJJJ(EnumC70569Rmn.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC70569Rmn(String str) {
        this.LJLIL = str;
    }
}
