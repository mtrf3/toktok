package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.TextController$update$2", f = "CoreText.kt", l = {191}, m = "invokeSuspend")
/* renamed from: X.2FI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C1XO LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FI(C1XO c1xo, InterfaceC67352kd<? super C2FI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c1xo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2FI c2fi = new C2FI(this.LJLJI, interfaceC67352kd);
        c2fi.LJLILLLLZI = obj;
        return c2fi;
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
            InterfaceC18630oF interfaceC18630oF = this.LJLJI.LJLJI;
            if (interfaceC18630oF != null) {
                this.LJLIL = 1;
                if (C18910oh.LIZ(interfaceC37501da, interfaceC18630oF, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("longPressDragObserver");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
