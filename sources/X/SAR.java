package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import fjb.a;
import kotlin.jvm.internal.AqS178S0100000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity$routeToBnpl$1$2", f = "BnplMiddleActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class SAR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BnplMiddleActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SAR(BnplMiddleActivity bnplMiddleActivity, InterfaceC67352kd<? super SAR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = bnplMiddleActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new SAR(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        BnplMiddleActivity bnplMiddleActivity = this.LJLIL;
        bnplMiddleActivity.LLII("jump", new AqS178S0100000_12(bnplMiddleActivity, 446), new AqS178S0100000_12(this.LJLIL, 447));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
