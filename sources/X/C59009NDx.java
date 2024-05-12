package X;

import Y.IDeS362S0100000_10;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewHolder$bindUiState$1", f = "CommerceMusicSubstituteMusicListViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.NDx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59009NDx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ CommerceMusicSubstituteMusicListViewModel LJLILLLLZI;
    public final /* synthetic */ C58878N8w LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59009NDx(CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel, C58878N8w c58878N8w, InterfaceC67352kd<? super C59009NDx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = commerceMusicSubstituteMusicListViewModel;
        this.LJLJI = c58878N8w;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C59009NDx c59009NDx = new C59009NDx(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c59009NDx.LJLIL = obj;
        return c59009NDx;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        InterfaceC65462ha LJIIJJI = V1M.LJIIJJI(new IDeS362S0100000_10(new C70342pS(V1M.LIZLLL(this.LJLILLLLZI.LJLJJLL), this.LJLJI.LJLLL, new NET(null)), 1));
        XKX.LIZLLL(interfaceC70422pa, null, null, new NE0(LJIIJJI, this.LJLJI, this.LJLILLLLZI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new NEA(LJIIJJI, this.LJLJI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
