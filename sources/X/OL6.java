package X;

/* loaded from: classes11.dex */
public enum OL6 {
    PRODUCT_CARD("card"),
    SHOP_TAB_ICON("shop_tab"),
    VIDEO_DESC("ad_desc"),
    VIDEO_CTA("cta_button"),
    VIDEO_MASK("mask"),
    VIDEO_PROFILE("profile"),
    OTHER("other");

    public final String LJLIL;

    public static OL6 valueOf(String str) {
        return (OL6) V0N.LJJJ(OL6.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    OL6(String str) {
        this.LJLIL = str;
    }
}
