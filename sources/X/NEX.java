package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewHolder$bindUiState$stateFlow$1", f = "CommerceMusicSubstituteMusicVideoViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NEX extends AbstractC65782Prm implements InterfaceC88473Ynt<N4O, Integer, InterfaceC67352kd<? super N4N>, Object> {
    public /* synthetic */ N4O LJLIL;
    public /* synthetic */ int LJLILLLLZI;

    public NEX(InterfaceC67352kd<? super NEX> interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return ORZ.LJLLLLLL(this.LJLILLLLZI, this.LJLIL.LJLIL);
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(N4O n4o, Integer num, InterfaceC67352kd<? super N4N> interfaceC67352kd) {
        int intValue = num.intValue();
        NEX nex = new NEX(interfaceC67352kd);
        nex.LJLIL = n4o;
        nex.LJLILLLLZI = intValue;
        return nex.invokeSuspend(C76800UCe.LIZ);
    }
}
