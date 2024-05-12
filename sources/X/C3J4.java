package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.mediator.SessionDataMediator$hire$1", f = "SessionDataMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3J4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3J4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C81803Iy LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3J4(C81803Iy c81803Iy, InterfaceC67352kd<? super C3J4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c81803Iy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3J4(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C81843Jc.LJ().LIZ("first serial");
        this.LJLIL.LJII();
        C81843Jc.LJ().LIZ("session data mediator hire");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
