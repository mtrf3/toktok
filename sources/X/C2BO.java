package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2BO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BO extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C07070Pn<T, V> LJLIL;
    public final /* synthetic */ T LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2BO(C07070Pn<T, V> c07070Pn, T t, InterfaceC67352kd<? super C2BO> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = c07070Pn;
        this.LJLILLLLZI = t;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2BO(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C07070Pn<T, V> c07070Pn = this.LJLIL;
        C1JK<T, V> c1jk = c07070Pn.LIZJ;
        c1jk.LJLJI.LIZLLL();
        c1jk.LJLJJI = Long.MIN_VALUE;
        c07070Pn.LIZLLL.setValue(Boolean.FALSE);
        Object LIZ = C07070Pn.LIZ(this.LJLIL, this.LJLILLLLZI);
        this.LJLIL.LIZJ.LJLILLLLZI.setValue(LIZ);
        this.LJLIL.LJ.setValue(LIZ);
        return C76800UCe.LIZ;
    }
}
