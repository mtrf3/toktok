package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.paidcontent.api.VoucherClaimApi;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentVoucherClaimViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentVoucherClaimViewModel$voucherClaim$2", f = "PaidContentVoucherClaimViewModel.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class A33 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ PaidContentVoucherClaimViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A33(Long l, long j, PaidContentVoucherClaimViewModel paidContentVoucherClaimViewModel, InterfaceC67352kd<? super A33> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = l;
        this.LJLJI = j;
        this.LJLJJI = paidContentVoucherClaimViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new A33(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
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
                Long l = this.LJLILLLLZI;
                long j = this.LJLJI;
                VoucherClaimApi.LIZ.getClass();
                IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                String API_URL_PREFIX_SI = com.ss.android.ugc.aweme.app.api.Api.LIZ;
                o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
                AbstractC73672Svk<BaseResponse> publishVoucherClaim = ((VoucherClaimApi) LIZLLL.create(API_URL_PREFIX_SI).create(VoucherClaimApi.class)).publishVoucherClaim(l, new Long(j));
                this.LJLIL = 1;
                obj = C77318UWc.LIZIZ(publishVoucherClaim, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (BaseResponse) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        PaidContentVoucherClaimViewModel paidContentVoucherClaimViewModel = this.LJLJJI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            paidContentVoucherClaimViewModel.LJLIL = true;
            paidContentVoucherClaimViewModel.setState(new AqS170S0100000_4((BaseResponse) LIZ, 903));
        }
        PaidContentVoucherClaimViewModel paidContentVoucherClaimViewModel2 = this.LJLJJI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            paidContentVoucherClaimViewModel2.setState(new AqS170S0100000_4(m10exceptionOrNullimpl, 904));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
