package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.PopProduct;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.o;

/* renamed from: X.Rx3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71205Rx3 implements InterfaceC36621EYv<BaseResponse<PopProductResp>> {
    public final /* synthetic */ C71200Rwy LJLIL;
    public final /* synthetic */ InterfaceC36621EYv<BaseResponse<PopProductResp>> LJLILLLLZI;
    public final /* synthetic */ ECommerceMessage LJLJI;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<BaseResponse<PopProductResp>> call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        ConcurrentLinkedDeque<C71231RxT> concurrentLinkedDeque = this.LJLIL.LIZIZ;
        ECommerceMessage eCommerceMessage = this.LJLJI;
        Iterator<C71231RxT> it = concurrentLinkedDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C71231RxT next = it.next();
            if (o.LJ(next.LJLIL, eCommerceMessage)) {
                if (next != null) {
                    this.LJLIL.LIZIZ.remove(next);
                }
            }
        }
        this.LJLILLLLZI.LIZJ(call, t);
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<BaseResponse<PopProductResp>> call, C64797Pbt<BaseResponse<PopProductResp>> response) {
        String str;
        C71231RxT c71231RxT;
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        ConcurrentLinkedDeque<C71231RxT> concurrentLinkedDeque = this.LJLIL.LIZIZ;
        ECommerceMessage eCommerceMessage = this.LJLJI;
        Iterator<C71231RxT> it = concurrentLinkedDeque.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                c71231RxT = it.next();
                if (o.LJ(c71231RxT.LJLIL, eCommerceMessage)) {
                    break;
                }
            } else {
                c71231RxT = null;
                break;
            }
        }
        C71231RxT c71231RxT2 = c71231RxT;
        if (c71231RxT2 != null) {
            int LJLZ = ORZ.LJLZ(c71231RxT2, this.LJLIL.LIZIZ);
            if (LJLZ > 0) {
                int i = 0;
                do {
                    ((C71231RxT) ORZ.LJLJLJ(this.LJLIL.LIZIZ, i)).LJLILLLLZI = true;
                    i++;
                } while (i < LJLZ);
            }
            if (c71231RxT2 != null) {
                this.LJLIL.LIZIZ.remove(c71231RxT2);
                if (c71231RxT2.LJLILLLLZI) {
                    InterfaceC36621EYv<BaseResponse<PopProductResp>> interfaceC36621EYv = this.LJLILLLLZI;
                    StringBuilder sb = new StringBuilder("show pin card [");
                    PopProduct popProduct = this.LJLJI.popProduct;
                    if (popProduct != null) {
                        str = popProduct.title;
                    }
                    interfaceC36621EYv.LIZJ(call, new Throwable(AnonymousClass073.LIZIZ(sb, str, "] is expired")));
                    return;
                }
            }
        }
        this.LJLILLLLZI.LJII(call, response);
    }

    public C71205Rx3(C71200Rwy c71200Rwy, C71193Rwr c71193Rwr, ECommerceMessage eCommerceMessage) {
        this.LJLIL = c71200Rwy;
        this.LJLILLLLZI = c71193Rwr;
        this.LJLJI = eCommerceMessage;
    }
}
