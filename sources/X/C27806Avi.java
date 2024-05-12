package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS47S1200000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$onEvent$2", f = "OrderSubmitViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Avi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27806Avi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OrderSubmitViewModel LJLIL;
    public final /* synthetic */ CouponClaimedEvent LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27806Avi(OrderSubmitViewModel orderSubmitViewModel, CouponClaimedEvent couponClaimedEvent, InterfaceC67352kd<? super C27806Avi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = orderSubmitViewModel;
        this.LJLILLLLZI = couponClaimedEvent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27806Avi(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C141335gf.LIZJ(obj);
        OrderSubmitViewModel orderSubmitViewModel = this.LJLIL;
        CouponClaimedEvent couponClaimedEvent = this.LJLILLLLZI;
        orderSubmitViewModel.getClass();
        List<VoucherInfoNew> list = couponClaimedEvent.voucherIds;
        if (list != null && (num = couponClaimedEvent.voucherType) != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        orderSubmitViewModel.LLILZIL = null;
                    } else {
                        C78609UtB.LJJLI(orderSubmitViewModel.LLILZLL, new AqS135S0200000_4(orderSubmitViewModel, list, 223));
                    }
                } else {
                    String str = orderSubmitViewModel.LLILZIL;
                    if (str != null) {
                        C78609UtB.LJJLI(orderSubmitViewModel.LLIZ, new AqS47S1200000_4((List) list, (List<VoucherInfoNew>) str, (String) orderSubmitViewModel, (OrderSubmitViewModel) 23));
                    }
                }
            } else {
                C78609UtB.LJJLI(orderSubmitViewModel.LLILZLL, new AqS135S0200000_4(orderSubmitViewModel, list, 222));
            }
            orderSubmitViewModel.LLILZIL = null;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
