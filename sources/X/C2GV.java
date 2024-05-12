package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2GV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GV extends AbstractC65782Prm implements InterfaceC88471Ynr<EnumC24710y3, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C2GV(InterfaceC67352kd<? super C2GV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2GV c2gv = new C2GV(interfaceC67352kd);
        c2gv.LJLIL = obj;
        return c2gv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        if (this.LJLIL == EnumC24710y3.ShutDown) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(EnumC24710y3 enumC24710y3, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(enumC24710y3, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
