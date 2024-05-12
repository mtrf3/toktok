package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JiG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49904JiG extends AbstractC51030K1a<C49825Jgz, SearchMixFeed> {
    @Override // X.C8BR
    public final void LJJII() {
        C49825Jgz c49825Jgz = (C49825Jgz) this.LJLIL;
        if (c49825Jgz != null) {
            c49825Jgz.LJJIJ();
        }
        super.LJJII();
    }

    @Override // X.AbstractC51030K1a
    public final List<Aweme> LJJIIZI() {
        List list;
        AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) this.LJLIL;
        if (abstractC51036K1g != null) {
            list = abstractC51036K1g.getItems();
        } else {
            list = null;
        }
        List<Aweme> originList = C49825Jgz.LJIJJLI(list);
        if (!C49906JiI.LJJJ() || C50440Jqu.LIZLLL) {
            o.LJIIIIZZ(originList, "originList");
            return originList;
        }
        List LIZLLL = C50350JpS.LIZLLL(originList);
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
