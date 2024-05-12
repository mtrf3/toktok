package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$openShippingPanel$1", f = "OrderSubmitViewModel.kt", l = {2864}, m = "invokeSuspend")
/* renamed from: X.Aih, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26999Aih extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ List<LogisticDTO> LJLJI;
    public final /* synthetic */ C26965Ai9 LJLJJI;
    public final /* synthetic */ OrderSubmitViewModel LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26999Aih(Context context, List<LogisticDTO> list, C26965Ai9 c26965Ai9, OrderSubmitViewModel orderSubmitViewModel, String str, InterfaceC67352kd<? super C26999Aih> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = context;
        this.LJLJI = list;
        this.LJLJJI = c26965Ai9;
        this.LJLJJL = orderSubmitViewModel;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26999Aih(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            List<LogisticDTO> list = this.LJLJI;
            LogisticDTO logisticDTO = this.LJLJJI.LJ;
            if (logisticDTO != null) {
                str = logisticDTO.logisticsServiceId;
            } else {
                str = null;
            }
            DeliveryPanelStarter.EnterParamForOrderSubmitPage enterParamForOrderSubmitPage = new DeliveryPanelStarter.EnterParamForOrderSubmitPage(list, str, this.LJLJJL.Qv0(), this.LJLJJI.LJIIL);
            String str2 = this.LJLJJLL;
            this.LJLIL = 1;
            deliveryPanelStarter.getClass();
            obj2 = deliveryPanelStarter.LIZ(context, null, new DeliveryPanelStarter.EnterParam(enterParamForOrderSubmitPage.selectedLogisticTypeId, null, null, null, null, 0, enterParamForOrderSubmitPage.logisticList, enterParamForOrderSubmitPage.trackParams, null, null, null, enterParamForOrderSubmitPage.panelTitle, 1854, null), true, str2, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C27949Ay1.LJJJJ();
        LogisticDTO logisticDTO2 = ((DeliveryPanelStarter.PackedDeliverySelectResult) obj2).selectedLogistic;
        if (logisticDTO2 != null) {
            OrderSubmitViewModel orderSubmitViewModel = this.LJLJJL;
            if (orderSubmitViewModel.Yw0(this.LJLJJI, logisticDTO2)) {
                orderSubmitViewModel.LLIILZL = true;
                OrderSubmitViewModel.Lw0(orderSubmitViewModel, false, null, false, false, null, null, false, null, null, new ChangeInfo(EnumC27805Avh.LOGISTICS.getValue()), 4093);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
