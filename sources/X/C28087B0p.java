package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$refresh$2", f = "PaymentViewModel.kt", l = {484}, m = "invokeSuspend")
/* renamed from: X.B0p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28087B0p extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PaymentViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28087B0p(PaymentViewModel paymentViewModel, InterfaceC67352kd<? super C28087B0p> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = paymentViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C28087B0p c28087B0p = new C28087B0p(this.LJLJI, interfaceC67352kd);
        c28087B0p.LJLILLLLZI = obj;
        return c28087B0p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            try {
            } catch (Throwable unused) {
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                XKX.LIZLLL(interfaceC70422pa, abstractC78621UtN.LJJIJIL(), null, new C28088B0q(this.LJLJI, null), 2);
                XKX.LIZLLL(interfaceC70422pa, abstractC78621UtN.LJJIJIL(), null, new C28089B0r(this.LJLJI, null), 2);
            }
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
                InterfaceC88472Yns<? super InterfaceC67352kd<? super C27993Ayj>, ? extends Object> interfaceC88472Yns = this.LJLJI.LLD;
                if (interfaceC88472Yns != null) {
                    this.LJLILLLLZI = interfaceC70422pa;
                    this.LJLIL = 1;
                    obj = interfaceC88472Yns.invoke(this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                return C76800UCe.LIZ;
            }
            C27993Ayj c27993Ayj = (C27993Ayj) obj;
            if (c27993Ayj != null) {
                XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ.LJJIJIL(), null, new C28086B0o(c27993Ayj, this.LJLJI, null), 2);
            }
            return C76800UCe.LIZ;
        } finally {
            XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ.LJJIJIL(), null, new C28089B0r(this.LJLJI, null), 2);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
