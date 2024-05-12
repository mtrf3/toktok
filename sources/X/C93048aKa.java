package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.pux.theme.compose.theme.animation.AnimationController$show$1", f = "AnimationController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aKa, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93048aKa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C92158a6E LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93048aKa(C92158a6E c92158a6E, InterfaceC67352kd<? super C93048aKa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c92158a6E;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93048aKa(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZJ.setValue(Boolean.TRUE);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
