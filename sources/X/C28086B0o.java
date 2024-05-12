package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$refresh$2$1$1", f = "PaymentViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.B0o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28086B0o extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C27993Ayj LJLIL;
    public final /* synthetic */ PaymentViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28086B0o(C27993Ayj c27993Ayj, PaymentViewModel paymentViewModel, InterfaceC67352kd<? super C28086B0o> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c27993Ayj;
        this.LJLILLLLZI = paymentViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28086B0o(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C27993Ayj c27993Ayj = this.LJLIL;
        PaymentState LIZIZ = B1E.LIZIZ(c27993Ayj.LIZ, c27993Ayj.LIZIZ, c27993Ayj.LIZJ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[gcash] state from api is ");
        LIZ.append(LIZIZ);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.setState(new AqS170S0100000_4(LIZIZ, 15));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
