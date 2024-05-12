package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.userservice.CommonFollowApi;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8C extends R30<String, Integer, M8D, BaseResponse> {
    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object obj) {
        M8D req = (M8D) obj;
        o.LJIIIZ(req, "req");
        return req.LJLIL;
    }

    @Override // X.R30
    public final AbstractC73672Svk<BaseResponse> LJII(M8D m8d) {
        M8D req = m8d;
        o.LJIIIZ(req, "req");
        return CommonFollowApi.LIZ.remove(req.LJLIL, req.LJLILLLLZI);
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object obj) {
        BaseResponse resp = (BaseResponse) obj;
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return Integer.valueOf(resp.status_code);
    }
}
