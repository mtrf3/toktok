package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.ProductApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.widget.ECProductBeforeLiveWidget$updateProductNumber$1", f = "ECProductBeforeLiveWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EK1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C71226RxO LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EK1(long j, C71226RxO c71226RxO, InterfaceC67352kd<? super EK1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = j;
        this.LJLILLLLZI = c71226RxO;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EK1(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((ProductApi) C74662wQ.LIZ(ProductApi.class)).getProductsCount(CardStruct.IStatusCode.DEFAULT, true).enqueue(new C36577EXd(this.LJLIL, this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
