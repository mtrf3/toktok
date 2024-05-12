package X;

import android.view.View;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.objectselect.AssetsFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.agJ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94395agJ implements InterfaceC93628aTw {
    public final /* synthetic */ C94961apR LIZ;
    public final /* synthetic */ List LIZIZ;

    @Override // X.InterfaceC93628aTw
    public final void LIZ(C93633aU1 tab) {
        o.LJIIIZ(tab, "tab");
    }

    @Override // X.InterfaceC93628aTw
    public final void LIZJ(C93633aU1 c93633aU1) {
        View view = c93633aU1.LIZLLL;
        if (!(view instanceof C94202adC)) {
            view = null;
        }
        C94202adC c94202adC = (C94202adC) view;
        if (c94202adC != null) {
            c94202adC.getTabName().setTextColor(C04330Ez.LIZIZ(this.LIZ.LJLILLLLZI.requireContext(), R.color.adq));
            c94202adC.getTabIndicator().setVisibility(8);
        }
    }

    public C94395agJ(C94961apR c94961apR, List list) {
        this.LIZ = c94961apR;
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC93628aTw
    public final void LIZIZ(C93633aU1 tab, boolean z) {
        int i;
        o.LJIIIZ(tab, "tab");
        View view = tab.LIZLLL;
        if (!(view instanceof C94202adC)) {
            view = null;
        }
        C94202adC c94202adC = (C94202adC) view;
        if (c94202adC != null) {
            c94202adC.getTabName().setTextColor(C04330Ez.LIZIZ(this.LIZ.LJLILLLLZI.requireContext(), R.color.adn));
            View tabIndicator = c94202adC.getTabIndicator();
            if (this.LIZIZ.size() > 1) {
                i = 0;
            } else {
                i = 8;
            }
            tabIndicator.setVisibility(i);
        }
        int i2 = tab.LIZJ;
        AssetsFragment assetsFragment = this.LIZ.LJLILLLLZI;
        if (i2 == assetsFragment.LJLJJL) {
            AssetsFragment.wl(assetsFragment).LJLILLLLZI.setExpanded(false);
            StatisticReporter LIZ = C93670aUc.LIZ();
            if (LIZ != null) {
                LIZ.onEvent("gifs_page_show", C51029K0z.LJJIIZI(new OSZ("is_ame_data", "1")));
            }
        }
    }
}
