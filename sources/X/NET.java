package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewHolder$bindUiState$1$stateFlow$1", f = "CommerceMusicSubstituteMusicListViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NET extends AbstractC65782Prm implements InterfaceC88473Ynt<N4T, Integer, InterfaceC67352kd<? super NFK>, Object> {
    public /* synthetic */ N4T LJLIL;
    public /* synthetic */ int LJLILLLLZI;

    public NET(InterfaceC67352kd<? super NET> interfaceC67352kd) {
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
        NET net2 = new NET(interfaceC67352kd);
        net2.LJLIL = n4t;
        net2.LJLILLLLZI = intValue;
        return net2.invokeSuspend(C76800UCe.LIZ);
    }
}
