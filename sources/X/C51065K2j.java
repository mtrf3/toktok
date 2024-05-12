package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.ILayoutSwitcherAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.K2j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51065K2j implements InterfaceC74055T4p {
    public final /* synthetic */ SearchContainerFragment LIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI kei) {
    }

    public C51065K2j(SearchContainerFragment searchContainerFragment) {
        this.LIZ = searchContainerFragment;
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI kei) {
        int i = kei.LIZLLL;
        ECommerceService.createIECommerceServicebyMonsterPlugin(false).setSearchResultTabNameFlag(C50676Jui.LIZJ(i));
        this.LIZ.LJLIL.setIndex(i);
        int i2 = this.LIZ.LJLZ;
        if (i2 != i && TextUtils.equals(C50676Jui.LIZIZ(i2), KAK.TOP.getTabName())) {
            C49950Jj0.LJ.LIZJ(2, "select other tab.");
        }
        int i3 = kei.LIZLLL;
        SearchContainerFragment searchContainerFragment = this.LIZ;
        if (i3 != searchContainerFragment.LJLZ) {
            o.LJIIIZ(searchContainerFragment, "<this>");
            ILayoutSwitcherAbility iLayoutSwitcherAbility = (ILayoutSwitcherAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(searchContainerFragment, null), ILayoutSwitcherAbility.class, null);
            if (kei.LIZLLL == C50605JtZ.LJIIJJI() && iLayoutSwitcherAbility != null) {
                iLayoutSwitcherAbility.a60();
            } else if (this.LIZ.LJLZ == C50605JtZ.LJIIJJI() && iLayoutSwitcherAbility != null) {
                iLayoutSwitcherAbility.yw();
            }
        }
        SearchContainerFragment searchContainerFragment2 = this.LIZ;
        searchContainerFragment2.LJLZ = i;
        searchContainerFragment2.Hl(i);
        SearchContainerFragment searchContainerFragment3 = this.LIZ;
        searchContainerFragment3.LJLLI.setTuxIcon(searchContainerFragment3.wl());
    }
}
