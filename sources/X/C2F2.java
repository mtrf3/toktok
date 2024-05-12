package X;

import fjb.a;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1", f = "BringIntoViewResponder.kt", l = {278}, m = "invokeSuspend")
/* renamed from: X.2F2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2F2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C2F1 LJLILLLLZI;
    public final /* synthetic */ C10390ax LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2F2(C2F1 c2f1, C10390ax c10390ax, InterfaceC67352kd<? super C2F2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c2f1;
        this.LJLJI = c10390ax;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2F2(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            InterfaceC14670hr interfaceC14670hr = this.LJLILLLLZI.LJLJJI;
            if (interfaceC14670hr != null) {
                IDqS420S0100000 iDqS420S0100000 = new IDqS420S0100000(this.LJLJI, 128);
                this.LJLIL = 1;
                if (interfaceC14670hr.LIZ(iDqS420S0100000, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("responder");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
