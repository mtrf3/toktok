package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.search.SearchIconTipsHelper;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.ISearchService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LPA extends AbstractC214518bP<Boolean> {
    public LPA(Object obj) {
        super(obj);
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, Boolean bool, Boolean bool2) {
        o.LJIIIZ(property, "property");
        boolean booleanValue = bool2.booleanValue();
        bool.booleanValue();
        if (SearchIconTipsHelper.LJLJJI == null) {
            return;
        }
        SearchIconTipsHelper searchIconTipsHelper = SearchIconTipsHelper.LJLIL;
        searchIconTipsHelper.getClass();
        ISearchService iSearchService = (ISearchService) SearchIconTipsHelper.LJLJL.getValue();
        ActivityC45651qj activityC45651qj = SearchIconTipsHelper.LJLJJI;
        o.LJI(activityC45651qj);
        Lifecycle lifecycle = activityC45651qj.getLifecycle();
        o.LJIIIIZZ(lifecycle, "activity!!.lifecycle");
        if (iSearchService.LLLLIILLL(lifecycle)) {
            if (!searchIconTipsHelper.LIZJ() || SearchIconTipsHelper.LJLJJI == null || SearchIconTipsHelper.LIZIZ() || SearchIconTipsHelper.LIZ() || SearchIconTipsHelper.LIZLLL()) {
                return;
            }
            ActivityC45651qj activityC45651qj2 = SearchIconTipsHelper.LJLJJI;
            o.LJI(activityC45651qj2);
            TuxIconView tuxIconView = SearchIconTipsHelper.LJLJJL;
            o.LJI(tuxIconView);
            PopupManager.LJIIL(new LPG(activityC45651qj2, tuxIconView));
            return;
        }
        LP6 lp6 = SearchIconTipsHelper.LJLJJLL;
        if (lp6 == null) {
            return;
        }
        lp6.LIZ(booleanValue);
    }
}
