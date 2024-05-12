package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$setDiskManagerMode$1", f = "DraftViewModel.kt", l = {234}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EDD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public DraftViewModel LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ DraftViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDD(DraftViewModel draftViewModel, InterfaceC67352kd<? super EDD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = draftViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EDD(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        DraftViewModel draftViewModel;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                draftViewModel = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            draftViewModel = this.LJLJI;
            this.LJLIL = draftViewModel;
            this.LJLILLLLZI = 1;
            draftViewModel.getClass();
            obj = XKX.LJI(C78613UtF.LIZJ, new GNT(draftViewModel, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        draftViewModel.LJLLLL = ((Number) obj).longValue();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
