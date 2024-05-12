package X;

import Y.IDhS102S0100000_9;
import com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M41 extends R30<String, String, DislikeRecommendParams, String> {
    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object obj) {
        DislikeRecommendParams req = (DislikeRecommendParams) obj;
        o.LJIIIZ(req, "req");
        return req.uid;
    }

    @Override // X.R30
    public final AbstractC73672Svk<String> LJII(DislikeRecommendParams dislikeRecommendParams) {
        DislikeRecommendParams req = dislikeRecommendParams;
        o.LJIIIZ(req, "req");
        return RecommendUserApiService.LIZIZ.dislikeRecommend(req.uid, req.secUid, Integer.valueOf(EnumC46513INh.SCENE_CARD.getValue())).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new IDhS102S0100000_9(req, 27));
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }
}
