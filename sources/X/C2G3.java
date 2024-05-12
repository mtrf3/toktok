package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {87}, m = "invokeSuspend")
/* renamed from: X.2G3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2G3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C23190vb LJLILLLLZI;
    public final /* synthetic */ C43921nw LJLJI;
    public final /* synthetic */ C1OJ LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2G3(C23190vb c23190vb, C43921nw c43921nw, C1OJ c1oj, InterfaceC67352kd<? super C2G3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c23190vb;
        this.LJLJI = c43921nw;
        this.LJLJJI = c1oj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2G3(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                C23190vb c23190vb = this.LJLILLLLZI;
                this.LJLIL = 1;
                if (c23190vb.LIZ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            this.LJLJI.LJLJJLL.remove(this.LJLJJI);
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            this.LJLJI.LJLJJLL.remove(this.LJLJJI);
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
