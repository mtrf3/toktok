package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.view.recommendv2.RecommendMusicItemViewHolderV2$bindUiState$1$stateFlow$1", f = "RecommendMusicItemViewHolderV2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NEU extends AbstractC65782Prm implements InterfaceC88473Ynt<N4T, Integer, InterfaceC67352kd<? super NFK>, Object> {
    public /* synthetic */ N4T LJLIL;
    public /* synthetic */ int LJLILLLLZI;

    public NEU(InterfaceC67352kd<? super NEU> interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return ORZ.LJLLLLLL(this.LJLILLLLZI, this.LJLIL.LJLIL);
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(N4T n4t, Integer num, InterfaceC67352kd<? super NFK> interfaceC67352kd) {
        int intValue = num.intValue();
        NEU neu = new NEU(interfaceC67352kd);
        neu.LJLIL = n4t;
        neu.LJLILLLLZI = intValue;
        return neu.invokeSuspend(C76800UCe.LIZ);
    }
}
