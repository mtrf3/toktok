package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.mediator.SessionDataMediator$handleSourceDataSingleUpdateOperationCallback$1", f = "SessionDataMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3J3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3J3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3JI LJLIL;
    public final /* synthetic */ C81803Iy LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3J3(C3JI c3ji, C81803Iy c81803Iy, InterfaceC67352kd<? super C3J3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3ji;
        this.LJLILLLLZI = c81803Iy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3J3(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleSourceDataSingleUpdateOperationCallback: ");
        LIZ.append(this.LJLIL.LIZJ().LJ());
        C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.LJLZ.put(this.LJLIL.LIZIZ(), this.LJLIL);
        C81803Iy c81803Iy = this.LJLILLLLZI;
        InterfaceC79150V4o interfaceC79150V4o = c81803Iy.LJLLLLLL;
        if (interfaceC79150V4o == null) {
            interfaceC79150V4o = c81803Iy.LJIIJJI(new C81813Iz(c81803Iy, null));
        }
        c81803Iy.LJLLLLLL = interfaceC79150V4o;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
