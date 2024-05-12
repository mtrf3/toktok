package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.da.DraftMonitorHelper$mobDraftInfo$1", f = "DraftMonitorHelper.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GN6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ DraftViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GN6(DraftViewModel draftViewModel, InterfaceC67352kd<? super GN6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = draftViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GN6(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int LIZLLL;
        long j;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                LIZLLL = this.LJLIL;
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            LIZLLL = GPD.LIZLLL(new GPG(null, null, null, false, this.LJLJI.jv0(), null, 47));
            DraftViewModel draftViewModel = this.LJLJI;
            j = draftViewModel.LJLLLL;
            if (j < 0) {
                this.LJLIL = LIZLLL;
                this.LJLILLLLZI = 1;
                obj2 = XKX.LJI(C78613UtF.LIZJ, new GNT(draftViewModel, null), this);
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZ(LIZLLL, "count");
            c145995oB.LIZIZ(j, "storage_size");
            FMX.LJIIL("tool_performance_draft_info", c145995oB.LIZ);
            return C76800UCe.LIZ;
        }
        j = ((Number) obj2).longValue();
        C145995oB c145995oB2 = new C145995oB();
        c145995oB2.LIZ(LIZLLL, "count");
        c145995oB2.LIZIZ(j, "storage_size");
        FMX.LJIIL("tool_performance_draft_info", c145995oB2.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
