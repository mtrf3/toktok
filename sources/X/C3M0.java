package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.mediator.InboxSessionMediator$handleSingleVOUpdateOperationCallback$1", f = "InboxSessionMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3M0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3M0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC82853Mz LJLIL;
    public final /* synthetic */ C82543Lu LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3M0(InterfaceC82853Mz interfaceC82853Mz, C82543Lu c82543Lu, InterfaceC67352kd<? super C3M0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC82853Mz;
        this.LJLILLLLZI = c82543Lu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3M0(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleSingleOperation: ");
        LIZ.append(this.LJLIL.LIZ());
        C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.LJLLLLLL.put(this.LJLIL.LIZIZ(), this.LJLIL);
        C82543Lu c82543Lu = this.LJLILLLLZI;
        InterfaceC79150V4o interfaceC79150V4o = c82543Lu.LJLLLL;
        if (interfaceC79150V4o == null) {
            C82543Lu c82543Lu2 = this.LJLILLLLZI;
            interfaceC79150V4o = c82543Lu2.LJIIZILJ(new C82573Lx(c82543Lu2, null));
        }
        c82543Lu.LJLLLL = interfaceC79150V4o;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
