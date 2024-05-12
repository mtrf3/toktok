package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ren, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70073Ren extends R30<IPdpStarter.PdpEnterParam, RYH, IPdpStarter.PdpEnterParam, RYH> {
    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return req;
    }

    @Override // X.R30
    public final AbstractC73672Svk<RYH> LJII(IPdpStarter.PdpEnterParam pdpEnterParam) {
        String str;
        IPdpStarter.PdpEnterParam req = pdpEnterParam;
        o.LJIIIZ(req, "req");
        PdpApi.LIZ.getClass();
        PdpApi pdpApi = (PdpApi) C70091Rf5.LIZIZ.create(PdpApi.class);
        HashMap<String, Object> requestParams = req.getRequestParams();
        Integer bizType = req.getBizType();
        if (bizType != null) {
            str = bizType.toString();
        } else {
            str = null;
        }
        return pdpApi.getProductInfo(requestParams, C70091Rf5.LJI(str)).LJJL(T16.LIZ());
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }
}
