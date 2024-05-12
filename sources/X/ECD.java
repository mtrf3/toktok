package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachUpdateParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.repository.FeedReachApi;

/* loaded from: classes7.dex */
public final class ECD implements ECE {
    @Override // X.ECE
    public final Object LJ(FeedReachGetParams feedReachGetParams, InterfaceC67352kd<? super C64797Pbt<Response<FeedReachResponse>>> interfaceC67352kd) {
        FeedReachApi.LIZ.getClass();
        return ECF.LIZIZ.feedReachGet(feedReachGetParams, interfaceC67352kd);
    }

    @Override // X.ECE
    public final Object feedReachUpdate(FeedReachUpdateParams feedReachUpdateParams, InterfaceC67352kd<? super C64797Pbt<Response<C76800UCe>>> interfaceC67352kd) {
        FeedReachApi.LIZ.getClass();
        return ECF.LIZIZ.feedReachUpdate(feedReachUpdateParams, interfaceC67352kd);
    }
}
