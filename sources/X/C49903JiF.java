package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.common.viewmodel.TrendingMixInFlowViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hotspot.core.viewmodel.TrendingCardFeedsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JiF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49903JiF extends AbstractC51030K1a<AbstractC49845JhJ, SearchMixFeed> {
    @Override // X.AbstractC51030K1a, X.C51031K1b, X.C8BR
    public final void LIZIZ() {
        AbstractC49845JhJ abstractC49845JhJ = (AbstractC49845JhJ) this.LJLIL;
        if (abstractC49845JhJ != null) {
            abstractC49845JhJ.LJJII();
        }
        super.LIZIZ();
    }

    @Override // X.AbstractC51030K1a
    public final List<Aweme> LJJIIZI() {
        K k;
        List<Aweme> awemeList = ((AbstractC49845JhJ) this.LJLIL).getAwemeList();
        if (awemeList == null) {
            awemeList = new ArrayList<>();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getAwemeList");
        LIZ.append(awemeList.size());
        X1D.LIZIZ(LIZ);
        int size = awemeList.size();
        if (!C52411Khb.LIZ() || (k = this.LJLILLLLZI) == 0 || !(k instanceof LifecycleOwner)) {
            return LJJIJIIJI(awemeList);
        }
        Lifecycle lifecycle = ((LifecycleOwner) k).getLifecycle();
        o.LJIIIIZZ(lifecycle, "mView as LifecycleOwner).lifecycle");
        TrendingMixInFlowViewModel trendingMixInFlowViewModel = (TrendingMixInFlowViewModel) JEZ.LIZ(lifecycle, TrendingMixInFlowViewModel.class);
        if (!trendingMixInFlowViewModel.LJLJI) {
            return LJJIJIIJI(awemeList);
        }
        K k2 = this.LJLILLLLZI;
        o.LJII(k2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        Lifecycle lifecycle2 = ((LifecycleOwner) k2).getLifecycle();
        o.LJIIIIZZ(lifecycle2, "mView as LifecycleOwner).lifecycle");
        List<? extends Aweme> list = ((TrendingCardFeedsViewModel) JEZ.LIZ(lifecycle2, TrendingCardFeedsViewModel.class)).LJLIL;
        if (list != null && (!list.isEmpty())) {
            for (Object obj : ORZ.LLIILII(list)) {
                if (!awemeList.contains(obj)) {
                    ListProtector.add(awemeList, 0, obj);
                }
            }
            trendingMixInFlowViewModel.LJLIL = awemeList.size() - size;
            trendingMixInFlowViewModel.LJLILLLLZI = awemeList;
        }
        StringBuilder LJ = C7MY.LJ("origin size", size, " and final size is");
        LJ.append(awemeList.size());
        X1D.LIZIZ(LJ);
        List LIZLLL = C50350JpS.LIZLLL(awemeList);
        if (LIZLLL != null) {
            return ORZ.LLJILJILJ(LIZLLL);
        }
        return new ArrayList();
    }

    @Override // X.AbstractC51030K1a
    public final List<SearchMixFeed> LJJIJ() {
        AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) this.LJLIL;
        if (abstractC51036K1g != null) {
            return abstractC51036K1g.getItems();
        }
        return null;
    }

    public static List LJJIJIIJI(List list) {
        int indexOf;
        if (!C49906JiI.LJJJ() || C50440Jqu.LIZLLL) {
            return list;
        }
        ArrayList LJ = C61328O5c.LJ(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            if (aweme.getSubAweme() != null && !aweme.getIsSubAweme() && (indexOf = LJ.indexOf(aweme)) >= 0 && indexOf < LJ.size()) {
                int i = indexOf + 1;
                Aweme subAweme = aweme.getSubAweme();
                o.LJIIIIZZ(subAweme, "aweme.subAweme");
                ListProtector.add(LJ, i, subAweme);
            }
        }
        return LJ;
    }

    @Override // X.C8BR
    public final void LJJ(C8BS c8bs) {
        AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) c8bs;
        super.LJJ(abstractC51036K1g);
        abstractC51036K1g.onModelBound();
    }

    @Override // X.AbstractC51030K1a
    public final String LJJIIZ(SearchMixFeed searchMixFeed) {
        Aweme aweme;
        SearchMixFeed searchMixFeed2 = searchMixFeed;
        if (searchMixFeed2 == null || (aweme = searchMixFeed2.getAweme()) == null) {
            return "";
        }
        String LIZIZ = C227768wm.LIZIZ(aweme);
        o.LJIIIIZZ(LIZIZ, "getAid(data?.aweme ?: return \"\")");
        return LIZIZ;
    }
}
