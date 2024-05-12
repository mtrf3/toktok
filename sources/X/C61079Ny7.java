package X;

import Y.AfS59S0200000_10;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.log.PdpLogHelper;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Ny7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61079Ny7 extends NM4 {
    public final /* synthetic */ PdpBulletBottomSheetFragment LJLIL;

    public C61079Ny7(PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment) {
        this.LJLIL = pdpBulletBottomSheetFragment;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        EnumC39924Flg enumC39924Flg;
        o.LJIIIZ(view, "view");
        PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LJLIL;
        if (!pdpBulletBottomSheetFragment.LJZL) {
            View LIZJ = view.LIZJ();
            o.LJII(LIZJ, "null cannot be cast to non-null type android.view.ViewGroup");
            pdpBulletBottomSheetFragment.LJLLLL = pdpBulletBottomSheetFragment.vl((ViewGroup) LIZJ);
            PdpLogHelper xl = this.LJLIL.xl();
            int i = this.LJLIL.LJZ;
            C73849Syb<Integer> c73849Syb = xl.LJLIL;
            C73426Srm LIZJ2 = C42193GhB.LIZJ(c73849Syb, c73849Syb);
            Integer valueOf = Integer.valueOf(i);
            C73320Sq4.LIZ(valueOf, "item is null");
            C73565Su1 LJJIJIL = AbstractC73672Svk.LJJIJIL(valueOf);
            int i2 = 0;
            C78999UzT.LJFF(AbstractC73672Svk.LJIIIIZZ(LJJIJIL, LIZJ2).LJIILIIL().LJJL(T16.LIZ()).LJJJLIIL(new AfS59S0200000_10(view, xl, 6), new InterfaceC64592gB() { // from class: X.9EP
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }), xl.LJLILLLLZI);
            this.LJLIL.xl();
            InterfaceC60710NsA interfaceC60710NsA = view.getHybridContext().hybridParams;
            if (interfaceC60710NsA != null) {
                enumC39924Flg = interfaceC60710NsA.getType();
            } else {
                enumC39924Flg = null;
            }
            if (enumC39924Flg == EnumC39924Flg.LYNX) {
                i2 = 1;
            }
            PdpLogHelper.LIZ(i2, this.LJLIL.LJLLL);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LJLIL;
        pdpBulletBottomSheetFragment.LJZL = false;
        pdpBulletBottomSheetFragment.LJLLL = System.currentTimeMillis();
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LJLIL;
        pdpBulletBottomSheetFragment.LJZL = true;
        pdpBulletBottomSheetFragment.xl();
        PdpLogHelper.LIZ(-1, this.LJLIL.LJLLL);
    }
}
