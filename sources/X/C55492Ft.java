package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.material.DefaultButtonElevation$elevation$2", f = "Button.kt", l = {551}, m = "invokeSuspend")
/* renamed from: X.2Ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55492Ft extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C07070Pn<C23390vv, C1JM> LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55492Ft(C07070Pn<C23390vv, C1JM> c07070Pn, float f, InterfaceC67352kd<? super C55492Ft> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c07070Pn;
        this.LJLJI = f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55492Ft(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C07070Pn<C23390vv, C1JM> c07070Pn = this.LJLILLLLZI;
            C23390vv c23390vv = new C23390vv(this.LJLJI);
            this.LJLIL = 1;
            if (c07070Pn.LIZLLL(c23390vv, this) == enumC58928NAu) {
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
