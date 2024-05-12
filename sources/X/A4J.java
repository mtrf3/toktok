package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.paidcontent.api.PaidCollectionApi;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A4J {
    public static AbstractC73672Svk LIZ(long j) {
        try {
            if (PaidCollectionApi.LIZIZ == null) {
                IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                String API_URL_PREFIX_SI = EFJ.LIZJ;
                o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
                PaidCollectionApi.LIZIZ = (PaidCollectionApi.GetPaidCollectionDetailApi) LIZLLL.create(API_URL_PREFIX_SI).create(PaidCollectionApi.GetPaidCollectionDetailApi.class);
            }
            PaidCollectionApi.GetPaidCollectionDetailApi getPaidCollectionDetailApi = PaidCollectionApi.LIZIZ;
            if (getPaidCollectionDetailApi != null) {
                return getPaidCollectionDetailApi.getPaidCollectionDetail(j, 1);
            }
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
        }
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJIIIIZZ(c73536StY, "empty()");
        return c73536StY;
    }

    public static AbstractC73672Svk LIZIZ(Long l, long j, int i) {
        try {
            if (PaidCollectionApi.LIZ == null) {
                IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                String API_URL_PREFIX_SI = EFJ.LIZJ;
                o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
                PaidCollectionApi.LIZ = (PaidCollectionApi.GetPaidCollectionListApi) LIZLLL.create(API_URL_PREFIX_SI).create(PaidCollectionApi.GetPaidCollectionListApi.class);
            }
            PaidCollectionApi.GetPaidCollectionListApi getPaidCollectionListApi = PaidCollectionApi.LIZ;
            if (getPaidCollectionListApi != null) {
                return C74812wf.LIZ(getPaidCollectionListApi, j, i, l, 12);
            }
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
        }
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJIIIIZZ(c73536StY, "empty()");
        return c73536StY;
    }
}
