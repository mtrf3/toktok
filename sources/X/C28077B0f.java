package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodDetails;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$fillBillingAddress$2$2", f = "PaymentViewModel.kt", l = {574}, m = "invokeSuspend")
/* renamed from: X.B0f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28077B0f extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PaymentInfo LJLJI;
    public final /* synthetic */ PaymentViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28077B0f(PaymentViewModel paymentViewModel, PaymentInfo paymentInfo, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = paymentInfo;
        this.LJLJJI = paymentViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C28077B0f c28077B0f = new C28077B0f(this.LJLJJI, this.LJLJI, interfaceC67352kd);
        c28077B0f.LJLILLLLZI = obj;
        return c28077B0f;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        String str;
        String str2;
        List<ElementDTO> list;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        String str3 = null;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            SAN san = SAN.LIZ;
            PaymentMethod paymentMethod = this.LJLJI.paymentMethod;
            if (paymentMethod != null) {
                str = paymentMethod.token;
            } else {
                str = null;
            }
            PaymentMethodsData paymentMethodsData = this.LJLJJI.LJZ;
            if (paymentMethodsData != null) {
                str2 = paymentMethodsData.pipoHost;
            } else {
                str2 = null;
            }
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            obj = san.LIZIZ(str, str2, "payment_method", this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) obj;
        if (paymentMethodDetails != null) {
            PaymentMethod paymentMethod2 = this.LJLJI.paymentMethod;
            if (paymentMethod2 != null) {
                list = paymentMethod2.neededElementDTOS;
            } else {
                list = null;
            }
            List<PaymentElement> convertToElements = paymentMethodDetails.convertToElements(list);
            if (convertToElements != null) {
                PaymentInfo paymentInfo = this.LJLJI;
                PaymentMethod paymentMethod3 = paymentInfo.paymentMethod;
                if (paymentMethod3 != null) {
                    str3 = paymentMethod3.LJFF();
                }
                PaymentCacheHelper.LIZ(str3, convertToElements);
                if (!C48841JEv.LJIILLIIL(interfaceC70422pa)) {
                    return C76800UCe.LIZ;
                }
                PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
                if (paymentMethodInfo != null) {
                    SAN san2 = SAN.LIZ;
                    List<PaymentElement> paymentElements = paymentMethodInfo.getPaymentElements();
                    san2.getClass();
                    paymentMethodInfo.setPaymentElements(SAN.LJI(paymentElements, convertToElements));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
