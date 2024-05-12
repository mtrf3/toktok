package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubmitQuitReason;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubmitQuitReasonRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$submitQuitReason$1", f = "OrderSubmitViewModel.kt", l = {1051}, m = "invokeSuspend")
/* renamed from: X.AxT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27915AxT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OrderSubmitViewModel LJLILLLLZI;
    public final /* synthetic */ SubmitQuitReason LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27915AxT(OrderSubmitViewModel orderSubmitViewModel, SubmitQuitReason submitQuitReason, InterfaceC67352kd<? super C27915AxT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = orderSubmitViewModel;
        this.LJLJI = submitQuitReason;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27915AxT(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Throwable unused) {
            C78983UzD.LJIILL("Submit Quit Reason Fail");
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            ArrayList arrayList = new ArrayList();
            List<OrderShopDigest> list = this.LJLILLLLZI.LJLJLLL;
            if (list != null) {
                Iterator<OrderShopDigest> it = list.iterator();
                while (it.hasNext()) {
                    List<OrderSKUDTO> orderSKUs = it.next().getOrderSKUs();
                    if (orderSKUs != null) {
                        for (OrderSKUDTO orderSKUDTO : orderSKUs) {
                            arrayList.add(new SkuInfo(orderSKUDTO.productId, orderSKUDTO.skuId));
                        }
                    }
                }
            }
            SubmitQuitReason submitQuitReason = this.LJLJI;
            SubmitQuitReasonRequest submitQuitReasonRequest = new SubmitQuitReasonRequest(submitQuitReason.reasonShowType, submitQuitReason.selectReasons, submitQuitReason.inputReasons, C27739Aud.LJI(new ExtraInfo(arrayList)));
            if (this.LJLILLLLZI.LLILL != null) {
                this.LJLIL = 1;
                obj = C27954Ay6.LLLZZ(submitQuitReasonRequest, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(EF7.LIZIZ().getResources().getString(R.string.f49));
            c5s1.LJ();
            return C76800UCe.LIZ;
        }
        Response response = (Response) obj;
        if (response != null && !response.isCodeOK()) {
            String str = response.message;
            if (str != null) {
                C5S1 c5s12 = new C5S1(EF7.LIZIZ());
                c5s12.LIZLLL(str);
                c5s12.LJ();
            }
            return C76800UCe.LIZ;
        }
        C5S1 c5s13 = new C5S1(EF7.LIZIZ());
        c5s13.LIZLLL(EF7.LIZIZ().getResources().getString(R.string.f49));
        c5s13.LJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
