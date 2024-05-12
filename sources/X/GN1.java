package X;

import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$initData$1$2", f = "DraftFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GN1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DraftFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GN1(DraftFragment draftFragment, InterfaceC67352kd<? super GN1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = draftFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GN1(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        DraftFragment draftFragment = this.LJLIL;
        draftFragment.Hl(draftFragment.Dl().LJLJJI);
        DraftViewModel Dl = this.LJLIL.Dl();
        ORS.LJJLIL(GN2.LJLIL, Dl.LJLJJI);
        XKX.LIZLLL(Dl.LLI, null, null, new EQF(Dl, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
