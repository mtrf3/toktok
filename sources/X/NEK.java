package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewHolder$bindUiState$6", f = "CommerceMusicSubstituteMusicVideoViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NEK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ InterfaceC65462ha<N4N> LJLILLLLZI;
    public final /* synthetic */ N5J LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NEK(InterfaceC65462ha<N4N> interfaceC65462ha, N5J n5j, InterfaceC67352kd<? super NEK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65462ha;
        this.LJLJI = n5j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        NEK nek = new NEK(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        nek.LJLIL = obj;
        return nek;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        XKX.LIZLLL((InterfaceC70422pa) this.LJLIL, null, null, new NE7(this.LJLILLLLZI, this.LJLJI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
