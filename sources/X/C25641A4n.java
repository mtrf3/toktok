package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.paidcontent.api.PaidCollectionPaymentApi;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.A4n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25641A4n {
    public static AbstractC73672Svk LIZ(long j, EnumC25627A3z entrySource, Long l) {
        o.LJIIIZ(entrySource, "entrySource");
        try {
            if (PaidCollectionPaymentApi.LIZ == null) {
                IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                String API_URL_PREFIX_SI = EFJ.LIZJ;
                o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
                PaidCollectionPaymentApi.LIZ = (PaidCollectionPaymentApi.CreateOrderApi) LIZLLL.create(API_URL_PREFIX_SI).create(PaidCollectionPaymentApi.CreateOrderApi.class);
            }
            PaidCollectionPaymentApi.CreateOrderApi createOrderApi = PaidCollectionPaymentApi.LIZ;
            if (createOrderApi != null) {
                return createOrderApi.createOrder(0, j, entrySource.getValue(), l);
            }
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
        }
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJIIIIZZ(c73536StY, "empty()");
        return c73536StY;
    }
}
