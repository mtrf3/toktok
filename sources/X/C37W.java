package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.mediator.SessionDataMediator$observeSessionSource$1", f = "SessionDataMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.37W, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37W extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C81803Iy LJLIL;
    public final /* synthetic */ C3JL LJLILLLLZI;
    public final /* synthetic */ C81983Jq LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37W(C81803Iy c81803Iy, C3JL c3jl, C81983Jq c81983Jq, InterfaceC67352kd<? super C37W> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c81803Iy;
        this.LJLILLLLZI = c3jl;
        this.LJLJI = c81983Jq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37W(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJIIIIZZ(this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
