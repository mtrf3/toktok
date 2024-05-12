package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$queryPostedDraftEntrance$2", f = "DraftViewModel.kt", l = {528}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EDE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DraftViewModel LJLILLLLZI;
    public final /* synthetic */ C26336AVg LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDE(C26336AVg c26336AVg, DraftViewModel draftViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = draftViewModel;
        this.LJLJI = c26336AVg;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EDE(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
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
            DraftViewModel draftViewModel = this.LJLILLLLZI;
            C26336AVg c26336AVg = this.LJLJI;
            this.LJLIL = 1;
            draftViewModel.getClass();
            Object LJI = XKX.LJI(C36636EZk.LIZ, new GNZ(c26336AVg, draftViewModel, null), this);
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
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
