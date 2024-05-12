package X;

import com.ss.android.ugc.aweme.model.PaidCollectionPaymentResponse;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailPaymentViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailPaymentViewModel$createOrder$2", f = "PaidContentDetailPaymentViewModel.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.A4p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25643A4p extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ EnumC25627A3z LJLJI;
    public final /* synthetic */ Long LJLJJI;
    public final /* synthetic */ PaidContentDetailPaymentViewModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25643A4p(long j, EnumC25627A3z enumC25627A3z, Long l, PaidContentDetailPaymentViewModel paidContentDetailPaymentViewModel, InterfaceC67352kd<? super C25643A4p> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = enumC25627A3z;
        this.LJLJJI = l;
        this.LJLJJL = paidContentDetailPaymentViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25643A4p(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
                AbstractC73672Svk LIZ2 = C25641A4n.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
                this.LJLIL = 1;
                obj = C77318UWc.LIZIZ(LIZ2, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (PaidCollectionPaymentResponse) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        PaidContentDetailPaymentViewModel paidContentDetailPaymentViewModel = this.LJLJJL;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            paidContentDetailPaymentViewModel.setState(new AqS170S0100000_4((PaidCollectionPaymentResponse) LIZ, 511));
        }
        PaidContentDetailPaymentViewModel paidContentDetailPaymentViewModel2 = this.LJLJJL;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            paidContentDetailPaymentViewModel2.setState(new AqS170S0100000_4(m10exceptionOrNullimpl, 512));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
