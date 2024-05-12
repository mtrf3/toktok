package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2G8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2G8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super InterfaceC79150V4o>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C23190vb LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2G8(C23190vb c23190vb, InterfaceC67352kd<? super C2G8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c23190vb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2G8 c2g8 = new C2G8(this.LJLILLLLZI, interfaceC67352kd);
        c2g8.LJLIL = obj;
        return c2g8;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        XKX.LIZLLL(interfaceC70422pa, null, null, new C2G5(this.LJLILLLLZI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new C2G6(this.LJLILLLLZI, null), 3);
        return XKX.LIZLLL(interfaceC70422pa, null, null, new C2G7(this.LJLILLLLZI, null), 3);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super InterfaceC79150V4o> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
