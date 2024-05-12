package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3BP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BP extends AbstractC65782Prm implements InterfaceC88471Ynr<C3BM, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C3BP(InterfaceC67352kd<? super C3BP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3BP c3bp = new C3BP(interfaceC67352kd);
        c3bp.LJLIL = obj;
        return c3bp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        if (this.LJLIL != C3BM.START) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3BM c3bm, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(c3bm, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
