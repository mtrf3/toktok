package X;

import fjb.a;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.mediator.SessionDataMediator$handleSessionBatchUpdateOperationCallback$1", f = "SessionDataMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81683Im extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC81693In LJLIL;
    public final /* synthetic */ C81803Iy LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81683Im(InterfaceC81693In interfaceC81693In, C81803Iy c81803Iy, InterfaceC67352kd<? super C81683Im> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC81693In;
        this.LJLILLLLZI = c81803Iy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81683Im(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleSessionBatchOperationCallback: ");
        LIZ.append(this.LJLIL.LIZ());
        C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ));
        Iterator<String> it = this.LJLIL.LIZJ().iterator();
        while (it.hasNext()) {
            this.LJLILLLLZI.LJ(it.next(), this.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
