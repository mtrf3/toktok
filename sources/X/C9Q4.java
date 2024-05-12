package X;

import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM$toggleSetClear$1", f = "OfflineModeManagerVM.kt", l = {307}, m = "invokeSuspend")
/* renamed from: X.9Q4, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Q4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OfflineModeManagerVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Q4(OfflineModeManagerVM offlineModeManagerVM, InterfaceC67352kd<? super C9Q4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = offlineModeManagerVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9Q4(this.LJLILLLLZI, interfaceC67352kd);
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
                InterfaceC236979Rt operator = this.LJLILLLLZI.gv0().getOperator();
                this.LJLIL = 1;
                if (operator.LLFFF(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            C26222AQw c26222AQw = OfflineModeManagerVM.LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("clear User cache failed ");
            LIZ.append(e);
            c26222AQw.LIZLLL(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
