package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", f = "SelectionMagnifier.kt", l = {102}, m = "invokeSuspend")
/* renamed from: X.2FX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C07070Pn<C10370av, C1JN> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FX(C07070Pn<C10370av, C1JN> c07070Pn, long j, InterfaceC67352kd<? super C2FX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c07070Pn;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2FX(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C07070Pn<C10370av, C1JN> c07070Pn = this.LJLILLLLZI;
            C10370av c10370av = new C10370av(this.LJLJI);
            C41391jr<C10370av> c41391jr = C20300qw.LIZLLL;
            this.LJLIL = 1;
            if (C07070Pn.LIZIZ(c07070Pn, c10370av, c41391jr, null, this, 12) == enumC58928NAu) {
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
