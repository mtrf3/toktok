package X;

import fjb.a;
import kotlin.jvm.internal.IDqS172S0200000;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", l = {76}, m = "invokeSuspend")
/* renamed from: X.2FN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C0VG> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2FN(InterfaceC35811ar<C0VG> interfaceC35811ar, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C2FN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2FN c2fn = new C2FN(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c2fn.LJLILLLLZI = obj;
        return c2fn;
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
            InterfaceC37501da interfaceC37501da = (InterfaceC37501da) this.LJLILLLLZI;
            IDqS172S0200000 iDqS172S0200000 = new IDqS172S0200000((InterfaceC35811ar) this.LJLJI, (InterfaceC35811ar<InterfaceC09480Yu>) this.LJLJJI, (InterfaceC88472Yns<? super InterfaceC09480Yu, C76800UCe>) 69);
            this.LJLIL = 1;
            if (C0UM.LIZJ(interfaceC37501da, null, iDqS172S0200000, this, 7) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
