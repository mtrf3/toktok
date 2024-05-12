package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomCartLynxImagePreloadModel;

/* renamed from: X.2gS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64762gS {
    public static final C64762gS LIZ = new C64762gS();
    public static final boolean LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        EcomCartLynxImagePreloadModel ecomCartLynxImagePreloadModel = new EcomCartLynxImagePreloadModel(false, 0, 0, 7, null);
        FFL.LJIIIZ().getClass();
        EcomCartLynxImagePreloadModel ecomCartLynxImagePreloadModel2 = (EcomCartLynxImagePreloadModel) FFL.LJIJ(true, "ecom_cart_lynx_image_preload_precise", 31744, EcomCartLynxImagePreloadModel.class, ecomCartLynxImagePreloadModel);
        if (ecomCartLynxImagePreloadModel2 != null) {
            ecomCartLynxImagePreloadModel = ecomCartLynxImagePreloadModel2;
        }
        LIZIZ = ecomCartLynxImagePreloadModel.getEnable();
        LIZJ = ecomCartLynxImagePreloadModel.getProductCount();
        LIZLLL = ecomCartLynxImagePreloadModel.getSellerCount();
    }
}
