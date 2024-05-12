package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel$bindUiState$1$1", f = "RecommendMusicV2ViewModel.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NEJ extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super AbstractC58752N4a>, ScopedMusicPlayer, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ InterfaceC64672gJ LJLILLLLZI;
    public /* synthetic */ ScopedMusicPlayer LJLJI;

    public NEJ(InterfaceC67352kd<? super NEJ> interfaceC67352kd) {
        super(3, interfaceC67352kd);
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
            InterfaceC64672gJ interfaceC64672gJ = this.LJLILLLLZI;
            C79863Bm LIZLLL = V1M.LIZLLL(this.LJLJI.LJLJI);
            this.LJLILLLLZI = null;
            this.LJLIL = 1;
            if (V1M.LJIIL(this, LIZLLL, interfaceC64672gJ) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super AbstractC58752N4a> interfaceC64672gJ, ScopedMusicPlayer scopedMusicPlayer, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        NEJ nej = new NEJ(interfaceC67352kd);
        nej.LJLILLLLZI = interfaceC64672gJ;
        nej.LJLJI = scopedMusicPlayer;
        return nej.invokeSuspend(C76800UCe.LIZ);
    }
}
