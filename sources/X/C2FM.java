package X;

import fjb.a;
import kotlin.jvm.internal.IDqS416S0100000;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {55}, m = "invokeSuspend")
/* renamed from: X.2FM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC70422pa LJLJI;
    public final /* synthetic */ InterfaceC35811ar<C1OJ> LJLJJI;
    public final /* synthetic */ C1OH LJLJJL;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC88472Yns<C10370av, C76800UCe>> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2FM(InterfaceC70422pa interfaceC70422pa, InterfaceC35811ar<C1OJ> interfaceC35811ar, C1OH c1oh, InterfaceC24760y8<? extends InterfaceC88472Yns<? super C10370av, C76800UCe>> interfaceC24760y8, InterfaceC67352kd<? super C2FM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC70422pa;
        this.LJLJJI = interfaceC35811ar;
        this.LJLJJL = c1oh;
        this.LJLJJLL = interfaceC24760y8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2FM c2fm = new C2FM(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c2fm.LJLILLLLZI = obj;
        return c2fm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC37501da interfaceC37501da = (InterfaceC37501da) this.LJLILLLLZI;
            InterfaceC70422pa interfaceC70422pa = this.LJLJI;
            C2FL c2fl = new C2FL(this.LJLJJL, this.LJLJJI, null, interfaceC70422pa);
            IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000((InterfaceC24760y8) this.LJLJJLL, (InterfaceC24760y8<Float>) 262);
            this.LJLIL = 1;
            Object LIZIZ = C0UR.LIZIZ(interfaceC37501da, new C2D2(new C42091kz(interfaceC37501da), c2fl, iDqS416S0100000, null), this);
            if (LIZIZ != obj2) {
                LIZIZ = C76800UCe.LIZ;
            }
            if (LIZIZ == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
