package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AbR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC26549AbR {
    DEFAULT("*", 0, new C26555AbX("tts", "sea")),
    TTS_GLOBAL_ADDRESS_LIST_V1("shipping_info", 1, new C26555AbX("tts", "global")),
    TTS_UK_ADDRESS_LIST_V1("shipping_info", 1, new C26555AbX("tts", "global")),
    TTS_US_ADDRESS_LIST_V1("shipping_info", 3, new C26555AbX("tts", "us")),
    TTS_GLOBAL_ADDRESS_EDIT_V1("shipping_address", 1, new C26555AbX("tts", "global")),
    TTS_UK_ADDRESS_EDIT_V1("shipping_address", 1, new C26555AbX("tts", "global")),
    TTF_SA_ADDRESS_EDIT("shipping_address", 2, new C26555AbX("ttf", "sa")),
    TTS_US_ADDRESS_EDIT_V1("shipping_address", 3, new C26555AbX("tts", "us")),
    GLOBAL_OSP_V1("order_submit", 1, new C26555AbX("tts", "global")),
    TTF_SA_ORDER_SUBMIT("order_submit", 2, new C26555AbX("ttf", "sa")),
    US_OSP_V1("order_submit", 3, new C26555AbX("tts", "us")),
    GLOBAL_PAYMENT_V1("payment_method", 1, new C26555AbX("tts", "global")),
    US_PAYMENT_V1("payment_method", 3, new C26555AbX("tts", "us")),
    GLOBAL_PRODUCT_DETAIL_V1("product_detail", 1, new C26555AbX("tts", "global")),
    TTF_SA_PRODUCT_DETAIL("product_detail", 2, new C26555AbX("ttf", "sa")),
    TTS_US_PRODUCT_DETAIL("product_detail", 3, new C26555AbX("tts", "us")),
    TTF_UK_PRODUCT_DETAIL("product_detail", 4, new C26555AbX("ttf", "global")),
    GLOBAL_LOGISTICS("logistics", 1, new C26555AbX("tts", "global")),
    TTF_SA_LOGISTICS("logistics", 2, new C26555AbX("ttf", "sa")),
    US_LOGISTICS("logistics", 3, new C26555AbX("tts", "us")),
    TTF_UK_LOGISTICS("logistics", 4, new C26555AbX("ttf", "global")),
    US_LOGISTICS_ADDRESS("logistics_address", 3, new C26555AbX("tts", "us")),
    GLOBAL_SKU_V1("sku", 1, new C26555AbX("tts", "global")),
    TTF_SA_SKU("sku", 2, new C26555AbX("ttf", "sa")),
    TTS_US_SKU("sku", 3, new C26555AbX("tts", "us")),
    TTF_UK_SKU("sku", 4, new C26555AbX("ttf", "global"));

    public static final C26550AbS Companion = new C26550AbS();
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final C26555AbX LJLJI;

    public static EnumC26549AbR valueOf(String str) {
        return (EnumC26549AbR) V0N.LJJJ(EnumC26549AbR.class, str);
    }

    public final C26555AbX getBizEnv() {
        return this.LJLJI;
    }

    public final String getPage() {
        return this.LJLIL;
    }

    public final int getTemplate() {
        return this.LJLILLLLZI;
    }

    public final boolean pageMatch(String pageName) {
        o.LJIIIZ(pageName, "pageName");
        if (o.LJ(this.LJLIL, "*")) {
            return true;
        }
        return o.LJ(this.LJLIL, pageName);
    }

    EnumC26549AbR(String str, int i, C26555AbX c26555AbX) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = c26555AbX;
    }
}
