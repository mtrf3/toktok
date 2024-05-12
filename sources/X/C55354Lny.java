package X;

import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragmentPanel;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunPageFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Lny, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55354Lny implements InterfaceC74055T4p {
    public boolean LIZ = true;
    public final /* synthetic */ MallRacunFragment LIZIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI tab) {
        o.LJIIIZ(tab, "tab");
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI tab) {
        o.LJIIIZ(tab, "tab");
    }

    public C55354Lny(MallRacunFragment mallRacunFragment) {
        this.LIZIZ = mallRacunFragment;
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
        MallRacunPageFragment LJJIIZI;
        MallRacunFragmentPanel mallRacunFragmentPanel;
        C55297Ln3 c55297Ln3 = this.LIZIZ.LJLLI;
        if (c55297Ln3 != null && (LJJIIZI = c55297Ln3.LJJIIZI(kei.LIZLLL)) != null && (mallRacunFragmentPanel = LJJIIZI.LLFF) != null) {
            mallRacunFragmentPanel.handlePageStop(true);
        }
        if (!this.LIZ) {
            this.LIZIZ.getClass();
            MallRacunFragment.Dl("switch");
        }
        this.LIZ = false;
    }
}
