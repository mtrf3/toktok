package X;

import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import fjb.a;
import kotlin.jvm.internal.AqS9S0010000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM$awaitAllSync$1", f = "RecUserAfterAuthPopupVM.kt", l = {92}, m = "invokeSuspend")
/* renamed from: X.9PC, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9PC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ RecUserAfterAuthPopupVM LJLILLLLZI;
    public final /* synthetic */ InterfaceC68342mE<Boolean> LJLJI;
    public final /* synthetic */ InterfaceC68342mE<Boolean> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9PC(RecUserAfterAuthPopupVM recUserAfterAuthPopupVM, InterfaceC68342mE<Boolean> interfaceC68342mE, InterfaceC68342mE<Boolean> interfaceC68342mE2, InterfaceC67352kd<? super C9PC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = recUserAfterAuthPopupVM;
        this.LJLJI = interfaceC68342mE;
        this.LJLJJI = interfaceC68342mE2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9PC(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            RecUserAfterAuthPopupVM recUserAfterAuthPopupVM = this.LJLILLLLZI;
            InterfaceC68342mE<Boolean> interfaceC68342mE = this.LJLJI;
            InterfaceC68342mE<Boolean> interfaceC68342mE2 = this.LJLJJI;
            this.LJLIL = 1;
            obj = recUserAfterAuthPopupVM.gv0(interfaceC68342mE, interfaceC68342mE2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AYY ayy = AYY.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auth sync is success: ");
        LIZ.append(booleanValue);
        LIZ.append('!');
        String LIZIZ = X1D.LIZIZ(LIZ);
        ayy.getClass();
        AYY.LIZIZ("Auth_RecUser", LIZIZ);
        this.LJLILLLLZI.setState(new AqS9S0010000_4(booleanValue, 49));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
