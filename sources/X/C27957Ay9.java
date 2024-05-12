package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import defpackage.e1;
import fjb.a;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$changePaymentMethod$1", f = "OrderSubmitViewModel.kt", l = {2507, 2533}, m = "invokeSuspend")
/* renamed from: X.Ay9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27957Ay9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OrderSubmitViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ PaymentInfo LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27957Ay9(OrderSubmitViewModel orderSubmitViewModel, boolean z, PaymentInfo paymentInfo, String str, boolean z2, InterfaceC67352kd<? super C27957Ay9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = orderSubmitViewModel;
        this.LJLJI = z;
        this.LJLJJI = paymentInfo;
        this.LJLJJL = str;
        this.LJLJJLL = z2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27957Ay9(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        PaymentInfo paymentInfo;
        PaymentMethod paymentMethod;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    OrderSubmitViewModel orderSubmitViewModel = this.LJLILLLLZI;
                    orderSubmitViewModel.setState(new AqS135S0200000_4(orderSubmitViewModel, this.LJLJJI, 225));
                    this.LJLILLLLZI.Tw0(this.LJLJJI, false);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI.LLFFF = Boolean.valueOf(this.LJLJI);
            this.LJLILLLLZI.LL = this.LJLJJI;
            String str = this.LJLJJL;
            if (str != null && str.length() != 0) {
                ORS.LJJLIL(new AqS29S1000000_4(this.LJLJJL, 37), this.LJLILLLLZI.LLFF);
            }
            OrderSubmitViewModel orderSubmitViewModel2 = this.LJLILLLLZI;
            PaymentInfo paymentInfo2 = this.LJLJJI;
            boolean z = this.LJLJJLL;
            this.LJLIL = 1;
            if (orderSubmitViewModel2.qw0(paymentInfo2, z, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (this.LJLJI) {
            OrderSubmitViewModel orderSubmitViewModel3 = this.LJLILLLLZI;
            orderSubmitViewModel3.setState(new AqS135S0200000_4(orderSubmitViewModel3, this.LJLJJI, 224));
            this.LJLILLLLZI.Tw0(this.LJLJJI, false);
            return C76800UCe.LIZ;
        }
        this.LJLILLLLZI.LLIILZL = true;
        if (!e1.LIZ(31744, "ec_osp_disable_reload_bill_info", true, false) || ((paymentInfo = this.LJLJJI) != null && (paymentMethod = paymentInfo.paymentMethod) != null && o.LJ(paymentMethod.shouldReloadBillInfo, Boolean.TRUE))) {
            System.out.println((Object) "lzp-log, changePaymentMethod queryBillInfo");
            C84657XKj Lw0 = OrderSubmitViewModel.Lw0(this.LJLILLLLZI, true, null, false, false, null, null, false, null, null, new ChangeInfo(EnumC27805Avh.ADD_NEW_PAYMENT.getValue()), 4088);
            if (Lw0 != null) {
                this.LJLIL = 2;
                if (Lw0.LJJIJ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        OrderSubmitViewModel orderSubmitViewModel4 = this.LJLILLLLZI;
        orderSubmitViewModel4.setState(new AqS135S0200000_4(orderSubmitViewModel4, this.LJLJJI, 225));
        this.LJLILLLLZI.Tw0(this.LJLJJI, false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
