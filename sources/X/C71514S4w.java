package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.data.BroadcasterProductsData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.viewmodel.ProductListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.viewmodel.ProductListViewModel$getProductList$2$productListResp$1", f = "ProductListViewModel.kt", l = {57}, m = "invokeSuspend")
/* renamed from: X.S4w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71514S4w extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C64797Pbt<Response<BroadcasterProductsData>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ ProductListViewModel LJLILLLLZI;
    public final /* synthetic */ RootData LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71514S4w(ProductListViewModel productListViewModel, RootData rootData, InterfaceC67352kd<? super C71514S4w> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = productListViewModel;
        this.LJLJI = rootData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71514S4w(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            S50 s50 = this.LJLILLLLZI.LJLIL.LIZIZ;
            long parseLong = CastLongProtector.parseLong(this.LJLJI.roomId);
            boolean isOwner = this.LJLJI.isOwner();
            String L = this.LJLJI.L();
            this.LJLIL = 1;
            obj = s50.LJLIL.LIZ.getBroadcasterProductList(parseLong, isOwner, L, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C64797Pbt<Response<BroadcasterProductsData>>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
