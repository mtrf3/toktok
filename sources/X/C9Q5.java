package X;

import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM$toggleUpdateWatchState$1", f = "OfflineModeManagerVM.kt", l = {291, 293}, m = "invokeSuspend")
/* renamed from: X.9Q5, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Q5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public OfflineModeManagerVM LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ OfflineModeManagerVM LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Q5(OfflineModeManagerVM offlineModeManagerVM, String str, InterfaceC67352kd<? super C9Q5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = offlineModeManagerVM;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9Q5(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        OfflineModeManagerVM offlineModeManagerVM;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
        } catch (Exception e) {
            OfflineModeManagerVM.LJLJJI.LIZLLL("clear User cache failed " + e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    offlineModeManagerVM = this.LJLIL;
                    C141335gf.LIZJ(obj);
                    offlineModeManagerVM.pv0((List) obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC236979Rt operator = this.LJLJI.gv0().getOperator();
            String str = this.LJLJJI;
            this.LJLILLLLZI = 1;
            if (operator.LJJLIIIJ(str) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        offlineModeManagerVM = this.LJLJI;
        InterfaceC236979Rt operator2 = offlineModeManagerVM.gv0().getOperator();
        this.LJLIL = offlineModeManagerVM;
        this.LJLILLLLZI = 2;
        obj = operator2.LJZ();
        if (obj == enumC58928NAu) {
            return enumC58928NAu;
        }
        offlineModeManagerVM.pv0((List) obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
