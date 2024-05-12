package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$openShippingPanel$1$result$1", f = "PdpViewModel.kt", l = {3068}, m = "invokeSuspend")
/* renamed from: X.Aic, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26994Aic extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super DeliveryPanelStarter.PackedDeliverySelectResult>, Object> {
    public int LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ PdpViewModel LJLJI;
    public final /* synthetic */ DeliveryPanelStarter.EnterParamForProductDetailPage LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26994Aic(Context context, PdpViewModel pdpViewModel, DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage, String str, InterfaceC67352kd<? super C26994Aic> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = context;
        this.LJLJI = pdpViewModel;
        this.LJLJJI = enterParamForProductDetailPage;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26994Aic(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super DeliveryPanelStarter.PackedDeliverySelectResult> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            DeliveryPanelStarter deliveryPanelStarter = DeliveryPanelStarter.LIZ;
            Context context = this.LJLILLLLZI;
            PdpViewModel pdpViewModel = this.LJLJI;
            boolean z = pdpViewModel.LJLJL;
            DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = this.LJLJJI;
            String str = this.LJLJJL;
            Integer Wv0 = pdpViewModel.Wv0();
            this.LJLIL = 1;
            deliveryPanelStarter.getClass();
            obj2 = deliveryPanelStarter.LIZ(context, Boolean.valueOf(z), new DeliveryPanelStarter.EnterParam(enterParamForProductDetailPage.selectedLogisticTypeId, enterParamForProductDetailPage.selectedBuyerAddressId, enterParamForProductDetailPage.selectedArea, enterParamForProductDetailPage.productId, enterParamForProductDetailPage.skuId, enterParamForProductDetailPage.quantity, null, enterParamForProductDetailPage.trackParams, enterParamForProductDetailPage.priceVal, enterParamForProductDetailPage.current, Wv0, null, 2112, null), false, str, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj2;
    }
}
