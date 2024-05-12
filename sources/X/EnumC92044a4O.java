package X;

/* renamed from: X.a4O, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC92044a4O {
    CheckoutPageShow("fp_sdk_checkout_page_show"),
    CheckoutPageFinish("fp_sdk_checkout_page_finish"),
    CheckoutPageClick("fp_sdk_checkout_page_click"),
    CheckoutFillin("fp_sdk_checkout_fillin"),
    CheckoutOCRShow("fp_sdk_checkout_ocr_show"),
    CheckoutOCRClick("fp_sdk_checkout_ocr_click"),
    CheckoutPayResultShow("fp_sdk_checkout_pay_result_show"),
    CheckoutPayResultClick("fp_sdk_checkout_pay_result_click"),
    CheckoutPopupShow("fp_sdk_checkout_popup_show"),
    CheckoutPopupClick("fp_sdk_checkout_popup_click"),
    PiBindShow("fp_sdk_checkout_bind_page_show"),
    PiBindClick("fp_sdk_checkout_bind_page_click"),
    PiBindFillin("fp_sdk_checkout_bind_page_fillin"),
    PiBindOnResult("fp_sdk_checkout_bind_page_result");

    public final String LJLIL;

    public static EnumC92044a4O valueOf(String str) {
        return (EnumC92044a4O) V0N.LJJJ(EnumC92044a4O.class, str);
    }

    public final String getEventName() {
        return this.LJLIL;
    }

    EnumC92044a4O(String str) {
        this.LJLIL = str;
    }
}
