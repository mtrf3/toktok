package X;

import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM$onPrepared$1", f = "OfflineModeManagerVM.kt", l = {66}, m = "invokeSuspend")
/* renamed from: X.9Q6, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Q6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public OfflineModeManagerVM LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ OfflineModeManagerVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Q6(OfflineModeManagerVM offlineModeManagerVM, InterfaceC67352kd<? super C9Q6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = offlineModeManagerVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9Q6(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        OfflineModeManagerVM offlineModeManagerVM;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i == 1) {
                    offlineModeManagerVM = this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                offlineModeManagerVM = this.LJLJI;
                InterfaceC236979Rt operator = offlineModeManagerVM.gv0().getOperator();
                this.LJLIL = offlineModeManagerVM;
                this.LJLILLLLZI = 1;
                obj = operator.LJZ();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            offlineModeManagerVM.pv0((List) obj);
        } catch (Exception e) {
            OfflineModeManagerVM.LJLJJI.LIZLLL("getWatchedAidList failed " + e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
