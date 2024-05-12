package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.mediator.InboxSessionMediator$loadMore$1", f = "InboxSessionMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3MC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C82543Lu LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3MC(C82543Lu c82543Lu, InterfaceC67352kd<? super C3MC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c82543Lu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3MC(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        AbstractC82423Li LJIIIIZZ = this.LJLIL.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LJI();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
