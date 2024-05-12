package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.mediator.SessionDataMediator$stopObserveSessionSource$1", f = "SessionDataMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.37V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37V extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C81803Iy LJLIL;
    public final /* synthetic */ C81983Jq LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37V(C81803Iy c81803Iy, C81983Jq c81983Jq, InterfaceC67352kd<? super C37V> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c81803Iy;
        this.LJLILLLLZI = c81983Jq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37V(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJIILJJIL(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
