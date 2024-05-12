package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.GetEntranceInfoResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RYF extends AbstractC73391SrD<GetEntranceInfoResponse> {
    public final /* synthetic */ InterfaceC88472Yns<GetEntranceInfoResponse, C76800UCe> LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RYF(InterfaceC88472Yns<? super GetEntranceInfoResponse, C76800UCe> interfaceC88472Yns) {
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        InterfaceC88472Yns<GetEntranceInfoResponse, C76800UCe> interfaceC88472Yns;
        Response response = (Response) obj;
        o.LJIIIZ(response, "response");
        if (response.isCodeOK() && (interfaceC88472Yns = this.LJLILLLLZI) != 0) {
            interfaceC88472Yns.invoke(response);
        }
        dispose();
    }
}
