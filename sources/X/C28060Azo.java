package X;

import Y.IDxS305S0100000_4;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoReqInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$queryBindInfo$1", f = "PaymentViewModel.kt", l = {1369}, m = "invokeSuspend")
/* renamed from: X.Azo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28060Azo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<BindInfoReqInfo> LJLILLLLZI;
    public final /* synthetic */ PaymentViewModel LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ PaymentMethod LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28060Azo(List<BindInfoReqInfo> list, PaymentViewModel paymentViewModel, boolean z, PaymentMethod paymentMethod, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C28060Azo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = paymentViewModel;
        this.LJLJJI = z;
        this.LJLJJL = paymentMethod;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28060Azo(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Response response;
        BindInfoResponseData bindInfoResponseData;
        BindInfoItem bindInfoItem;
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns;
        List<BindInfoItem> bindInfoList;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                BindInfoRequest bindInfoRequest = new BindInfoRequest(this.LJLILLLLZI);
                PaymentViewModel paymentViewModel = this.LJLJI;
                this.LJLIL = 1;
                paymentViewModel.getClass();
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                PaymentApi.LIZ.getClass();
                ((PaymentApi) C74672wR.LIZIZ.create(PaymentApi.class)).getBindInfo(bindInfoRequest).LJJL(T16.LIZ()).LIZ(new IDxS305S0100000_4(c84654XKg, 1));
                obj = c84654XKg.LIZ();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            response = (Response) obj;
            bindInfoResponseData = (BindInfoResponseData) response.data;
        } catch (Throwable unused) {
            this.LJLJI.setState(B03.LJLIL);
        }
        if (response.isCodeOK() && bindInfoResponseData != null) {
            if (this.LJLJJI && (bindInfoList = bindInfoResponseData.getBindInfoList()) != null) {
                PaymentViewModel paymentViewModel2 = this.LJLJI;
                for (BindInfoItem bindInfoItem2 : bindInfoList) {
                    String paymentMethodId = bindInfoItem2.getPaymentMethodId();
                    if (paymentMethodId != null) {
                        paymentViewModel2.LJLLLLLL.put(paymentMethodId, bindInfoItem2);
                    }
                }
            }
            List<BindInfoItem> bindInfoList2 = bindInfoResponseData.getBindInfoList();
            if (bindInfoList2 != null) {
                PaymentMethod paymentMethod = this.LJLJJL;
                Iterator<BindInfoItem> it = bindInfoList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        bindInfoItem = it.next();
                        if (o.LJ(bindInfoItem.getPaymentMethodId(), paymentMethod.id)) {
                            break;
                        }
                    } else {
                        bindInfoItem = null;
                        break;
                    }
                }
                BindInfoItem bindInfoItem3 = bindInfoItem;
                if (bindInfoItem3 != null && (interfaceC88472Yns = this.LJLJJLL) != null) {
                    interfaceC88472Yns.invoke(bindInfoItem3.getPaymentMethodBindUrl());
                }
            }
            this.LJLJI.setState(B02.LJLIL);
            return C76800UCe.LIZ;
        }
        this.LJLJI.setState(B01.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
