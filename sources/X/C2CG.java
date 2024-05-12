package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {446, 449}, m = "invokeSuspend")
/* renamed from: X.2CG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C1OJ LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC65784Pro<Boolean>> LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ C1OH LJLJJL;
    public final /* synthetic */ InterfaceC35811ar<C1OJ> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2CG(InterfaceC24760y8<? extends InterfaceC65784Pro<Boolean>> interfaceC24760y8, long j, C1OH c1oh, InterfaceC35811ar<C1OJ> interfaceC35811ar, InterfaceC67352kd<? super C2CG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC24760y8;
        this.LJLJJI = j;
        this.LJLJJL = c1oh;
        this.LJLJJLL = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2CG(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C1OJ c1oj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c1oj = this.LJLIL;
                    C141335gf.LIZJ(obj);
                    this.LJLJJLL.setValue(c1oj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLJI.getValue().invoke().booleanValue()) {
                long j = C0SG.LIZ;
                this.LJLILLLLZI = 1;
                if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        c1oj = new C1OJ(this.LJLJJI);
        C1OH c1oh = this.LJLJJL;
        this.LJLIL = c1oj;
        this.LJLILLLLZI = 2;
        if (c1oh.LIZIZ(c1oj, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        this.LJLJJLL.setValue(c1oj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
