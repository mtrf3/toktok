package X;

import Y.IDeS362S0100000_10;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.view.recommendv2.RecommendMusicItemViewHolderV2$bindUiState$1", f = "RecommendMusicItemViewHolderV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.NDw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59008NDw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ RecommendMusicV2ViewModel LJLILLLLZI;
    public final /* synthetic */ C58879N8x LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59008NDw(RecommendMusicV2ViewModel recommendMusicV2ViewModel, C58879N8x c58879N8x, InterfaceC67352kd<? super C59008NDw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = recommendMusicV2ViewModel;
        this.LJLJI = c58879N8x;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C59008NDw c59008NDw = new C59008NDw(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c59008NDw.LJLIL = obj;
        return c59008NDw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        InterfaceC65462ha LJIIJJI = V1M.LJIIJJI(new IDeS362S0100000_10(new C70342pS(V1M.LIZLLL(this.LJLILLLLZI.LJLJJL), this.LJLJI.LJLLILLLL, new NEU(null)), 1));
        XKX.LIZLLL(interfaceC70422pa, null, null, new NE1(LJIIJJI, this.LJLJI, this.LJLILLLLZI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new NEB(LJIIJJI, this.LJLJI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
