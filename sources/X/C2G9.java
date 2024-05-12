package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {112}, m = "invokeSuspend")
/* renamed from: X.2G9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2G9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C23190vb LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2G9(C23190vb c23190vb, InterfaceC67352kd<? super C2G9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c23190vb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2G9(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C07070Pn<Float, C1JM> c07070Pn = this.LJLILLLLZI.LJI;
            Float f = new Float(0.0f);
            C48361v6 LJJIJIIJIL = C1JI.LJJIJIIJIL(150, 0, C1J1.LIZ, 2);
            this.LJLIL = 1;
            if (C07070Pn.LIZIZ(c07070Pn, f, LJJIJIIJIL, null, this, 12) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
