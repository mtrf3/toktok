package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment$onViewCreated$1$1$1$4$1", f = "PaidContentReviewDetailsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EHK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C86442XwE LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EHK(C86442XwE c86442XwE, InterfaceC67352kd<? super EHK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c86442XwE;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EHK(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZ(false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
