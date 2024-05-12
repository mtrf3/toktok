package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommercelive.common.data.Product;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.data.BroadcasterProductsData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.viewmodel.ProductListViewModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.viewmodel.ProductListViewModel$getProductList$2", f = "ProductListViewModel.kt", l = {56}, m = "invokeSuspend")
/* renamed from: X.S4x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71515S4x extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ProductListViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ RootData LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71515S4x(ProductListViewModel productListViewModel, boolean z, long j, RootData rootData, InterfaceC67352kd<? super C71515S4x> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = productListViewModel;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = rootData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71515S4x(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            FSJ fsj = C36576EXc.LIZ;
            C71514S4w c71514S4w = new C71514S4w(this.LJLILLLLZI, this.LJLJJL, null);
            this.LJLIL = 1;
            obj = XKX.LJI(fsj, c71514S4w, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C64797Pbt c64797Pbt = (C64797Pbt) obj;
        Response response = (Response) c64797Pbt.LIZIZ;
        BroadcasterProductsData broadcasterProductsData = (BroadcasterProductsData) response.data;
        if (c64797Pbt.LIZIZ() && response.isCodeOK() && broadcasterProductsData != null) {
            this.LJLILLLLZI.setState(new AqS178S0100000_12(broadcasterProductsData, 363));
            List<Product> list = broadcasterProductsData.products;
            if (list != null) {
                z = list.isEmpty();
            }
            S53.LIZIZ(this.LJLJI, System.currentTimeMillis() - this.LJLJJI, true, z, null, null);
        } else {
            this.LJLILLLLZI.setState(C71516S4y.LJLIL);
            boolean z2 = this.LJLJI;
            long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
            Integer num = new Integer(c64797Pbt.LIZ.LIZIZ);
            c64797Pbt.LIZJ();
            S53.LIZIZ(z2, currentTimeMillis, false, false, num, null);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
