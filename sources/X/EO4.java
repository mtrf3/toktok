package X;

import com.ss.android.ugc.aweme.ecommerce.base.payment.api.PaymentApi;

/* loaded from: classes7.dex */
public final class EO4 {
    public static final /* synthetic */ EO4 LIZ = new EO4();
    public static final InterfaceC789838c LIZIZ = C40084FoG.LIZIZ("https://oec-api.tiktokv.com/");

    public static AbstractC73672Svk LIZ(Boolean bool, String str) {
        return ((PaymentApi) LIZIZ.create(PaymentApi.class)).getPaymentAuth(bool, str);
    }
}
