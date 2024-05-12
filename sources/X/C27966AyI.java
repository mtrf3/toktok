package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.AyI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27966AyI extends R30<BillInfoRequest, BillInfoResponse, BillInfoRequest, BillInfoResponse> {
    public BillInfoResponse LIZJ;
    public long LIZLLL = System.currentTimeMillis();
    public BillInfoResponse LJ;
    public String LJFF;

    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return req;
    }

    @Override // X.R30
    public final AbstractC73672Svk<BillInfoResponse> LJII(BillInfoRequest billInfoRequest) {
        BillInfoRequest req = billInfoRequest;
        o.LJIIIZ(req, "req");
        OrderSubmitApi.LIZ.getClass();
        return ((OrderSubmitApi) C27965AyH.LIZIZ.create(OrderSubmitApi.class)).getBillInfo(req, C27965AyH.LIZIZ(req.getBizType())).LJJIJL(new C28011Az1(this, req)).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(C28017Az7.LJLIL);
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }
}
