package X;

import com.ss.android.ugc.aweme.ecommercelive.business.audience.config.EcomShopBagDailyAnimModel;

/* renamed from: X.39M, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39M extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C39M LJLIL = new C39M();

    public C39M() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        C39L.LIZ.getClass();
        FFL LJIIIZ = FFL.LJIIIZ();
        EcomShopBagDailyAnimModel ecomShopBagDailyAnimModel = C39L.LIZIZ;
        LJIIIZ.getClass();
        EcomShopBagDailyAnimModel ecomShopBagDailyAnimModel2 = (EcomShopBagDailyAnimModel) FFL.LJIJ(true, "ecom_cart_daily_anim_setting", 31744, EcomShopBagDailyAnimModel.class, ecomShopBagDailyAnimModel);
        if (ecomShopBagDailyAnimModel2 != null) {
            ecomShopBagDailyAnimModel = ecomShopBagDailyAnimModel2;
        }
        Integer num = ecomShopBagDailyAnimModel.interval;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
