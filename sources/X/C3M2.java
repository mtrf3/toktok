package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.mediator.InboxSessionMediator$onTabChangeEvent$1", f = "InboxSessionMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3M2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3M2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C209108Io LJLIL;
    public final /* synthetic */ C82543Lu LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3M2(C209108Io c209108Io, C82543Lu c82543Lu, InterfaceC67352kd<? super C3M2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c209108Io;
        this.LJLILLLLZI = c82543Lu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3M2(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tab changed ");
        LIZ.append(this.LJLIL.LJLIL);
        LIZ.append(':');
        LIZ.append(this.LJLIL.LJLILLLLZI);
        C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", X1D.LIZIZ(LIZ));
        if (!o.LJ(this.LJLIL.LJLILLLLZI, "NOTIFICATION")) {
            this.LJLILLLLZI.LJLJJI = false;
            return C76800UCe.LIZ;
        }
        this.LJLILLLLZI.LJLJJI = true;
        C82543Lu.LJIJ(this.LJLILLLLZI, 7);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
