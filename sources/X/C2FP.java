package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", l = {1012}, m = "invokeSuspend")
/* renamed from: X.2FP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC18630oF LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FP(InterfaceC18630oF interfaceC18630oF, InterfaceC67352kd<? super C2FP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC18630oF;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2FP c2fp = new C2FP(this.LJLJI, interfaceC67352kd);
        c2fp.LJLILLLLZI = obj;
        return c2fp;
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
            InterfaceC18630oF interfaceC18630oF = this.LJLJI;
            this.LJLIL = 1;
            Object LJI = C48841JEv.LJI(new C2FT(interfaceC37501da, interfaceC18630oF, null), this);
            if (LJI != obj2) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
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
