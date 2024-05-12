package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.Az1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28011Az1<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ C27966AyI LJLIL;
    public final /* synthetic */ BillInfoRequest LJLILLLLZI;

    public C28011Az1(C27966AyI c27966AyI, BillInfoRequest billInfoRequest) {
        this.LJLIL = c27966AyI;
        this.LJLILLLLZI = billInfoRequest;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        BillInfoResponse resp = (BillInfoResponse) obj;
        o.LJIIIZ(resp, "resp");
        BillInfoResponse billInfoResponse = this.LJLIL.LIZJ;
        if (billInfoResponse != null && resp.isValid()) {
            resp = billInfoResponse.merge(resp, this.LJLILLLLZI);
            if (resp.isValid()) {
                this.LJLIL.LIZJ = resp;
            }
        } else if (resp.isValid()) {
            this.LJLIL.LIZJ = resp;
        }
        return resp;
    }
}
