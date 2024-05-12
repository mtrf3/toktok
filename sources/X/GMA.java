package X;

import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$showConfirmDialog$1$1$1", f = "DraftFragment.kt", l = {1123}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GMA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DraftFragment LJLILLLLZI;
    public final /* synthetic */ C41425GNp LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMA(DraftFragment draftFragment, C41425GNp c41425GNp, InterfaceC67352kd<? super GMA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = draftFragment;
        this.LJLJI = c41425GNp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GMA(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            DraftViewModel Dl = this.LJLILLLLZI.Dl();
            C41425GNp c41425GNp = this.LJLJI;
            this.LJLIL = 1;
            if (Dl.iv0(c41425GNp, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        V1M.LJJIJLIJ(1, this.LJLILLLLZI.Al(), this.LJLILLLLZI.getEnterFrom(), "single_delete");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
