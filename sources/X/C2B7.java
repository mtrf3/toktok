package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", l = {121}, m = "invokeSuspend")
/* renamed from: X.2B7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2B7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C0NZ LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C2B6 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2B7(C0NZ c0nz, long j, C2B6 c2b6, InterfaceC67352kd<? super C2B7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c0nz;
        this.LJLJI = j;
        this.LJLJJI = c2b6;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2B7(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC88471Ynr<? super C23490w5, ? super C23490w5, C76800UCe> interfaceC88471Ynr;
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
            C07070Pn<C23490w5, C1JN> c07070Pn = this.LJLILLLLZI.LIZ;
            C23490w5 c23490w5 = new C23490w5(this.LJLJI);
            C0Q2<C23490w5> c0q2 = this.LJLJJI.LJLIL;
            this.LJLIL = 1;
            obj = C07070Pn.LIZIZ(c07070Pn, c23490w5, c0q2, null, this, 12);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C0Q0 c0q0 = (C0Q0) obj;
        if (c0q0.LIZIZ == EnumC07170Px.Finished && (interfaceC88471Ynr = this.LJLJJI.LJLJI) != null) {
            interfaceC88471Ynr.invoke(new C23490w5(this.LJLILLLLZI.LIZIZ), c0q0.LIZ.getValue());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
