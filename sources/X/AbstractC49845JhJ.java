package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JhJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC49845JhJ extends AbstractC49793JgT<SearchMixFeed, SearchMixFeedList> implements InterfaceC224118qt, InterfaceC49897Ji9, InterfaceC50392Jq8, InterfaceC49844JhI, IE6 {
    public final C49841JhF LJLLLL;
    public final List<SearchMixFeed> LJLLLLLL;
    public final C49847JhL LJLZ;
    public final /* synthetic */ C49720JfI LJZ;
    public boolean LJZI;
    public C49797JgX LJZL;
    public C49843JhH LL;
    public final int LLD;

    @Override // X.IE6
    public final void LJIIIIZZ(long j, String str) {
        this.LJZ.LJIIIIZZ(j, str);
    }

    public abstract boolean LJIJJLI(int i, Aweme aweme);

    public void LJIL(Aweme aweme, List<? extends Aweme> list) {
    }

    public void LJJI(Aweme aweme, List<? extends Aweme> list, List<? extends SearchMixFeed> list2) {
    }

    public void LJJII() {
    }

    @Override // X.InterfaceC50392Jq8
    public void Mt() {
    }

    @Override // X.AbstractC51036K1g
    public void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
    }

    @Override // X.InterfaceC50392Jq8
    public void zX(int i, int i2, Aweme aweme) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public boolean isHasMore() {
        T t = this.mData;
        if (t == 0 || ((SearchMixFeedList) t).hasMore) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC49793JgT
    public int LJIILL() {
        return this.LLD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC49793JgT, X.C8BS
    /* renamed from: LJJ, reason: merged with bridge method [inline-methods] */
    public void handleData(SearchMixFeedList searchMixFeedList) {
        boolean z;
        super.handleData(searchMixFeedList);
        if (searchMixFeedList == 0 || searchMixFeedList.mItems == null) {
            return;
        }
        int i = 0;
        if (!this.LJZI) {
            GlobalDoodleConfig globalDoodleConfig = searchMixFeedList.globalDoodleConfig;
            if (globalDoodleConfig != null) {
                z = globalDoodleConfig.getDisableInnerFlow();
            } else {
                z = false;
            }
            this.LJZI = z;
        }
        C49847JhL c49847JhL = this.LJLZ;
        List<SearchMixFeed> list = searchMixFeedList.mItems;
        o.LJIIIIZZ(list, "data.items");
        C49850JhO.LIZ(c49847JhL, list, EnumC49859JhX.INNER_LOAD_MORE);
        C49843JhH c49843JhH = this.LL;
        if (c49843JhH == null) {
            return;
        }
        this.mData = searchMixFeedList;
        if (searchMixFeedList.mItems != null) {
            C49825Jgz.LJJIIJZLJL(searchMixFeedList);
            String LJIJI = C78949Uyf.LJIJI(searchMixFeedList);
            if (LJIJI == null) {
                LJIJI = "";
            }
            c49843JhH.LIZJ = LJIJI;
            List<Aweme> LJIJJLI = C49825Jgz.LJIJJLI(searchMixFeedList.mItems);
            o.LJIIIIZZ(LJIJJLI, "getAwemes(newData.items)");
            List LJLL = ORZ.LJLL(LJIJJLI);
            Iterator it = ((ArrayList) LJLL).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    Aweme aweme = (Aweme) next;
                    if (!C49993Jjh.LIZ()) {
                        if (aweme != null) {
                            aweme.appendExtraParamUseInSearch("dual_stream_inner_item_mark", "inner");
                        }
                        String innerSearchId = c49843JhH.LIZJ;
                        o.LJIIIZ(innerSearchId, "innerSearchId");
                        if (aweme != null) {
                            aweme.appendExtraParamUseInSearch("dual_stream_inner_search_id", innerSearchId);
                        }
                        String enterAid = c49843JhH.LIZ.LJLILLLLZI;
                        o.LJIIIZ(enterAid, "enterAid");
                        if (aweme != null) {
                            aweme.appendExtraParamUseInSearch("dual_stream_enter_aid", enterAid);
                        }
                        JTL scene = c49843JhH.LIZ.LJLJJI;
                        o.LJIIIZ(scene, "scene");
                        if (aweme != null) {
                            aweme.appendExtraParamUseInSearch("dual_stream_inner_item_enter_scene", scene.name());
                            aweme.appendExtraParamUseInSearch("dual_stream_no_continue_play", "inner");
                        }
                    }
                    C49603JdP.LJII(aweme, c49843JhH.LIZJ, c49843JhH.LIZLLL.size() + i, c49843JhH.LIZ.LJLJI);
                    C78949Uyf.LJJIJIIJIL(((Number) c49843JhH.LJ.getValue()).intValue() + c49843JhH.LIZLLL.size() + i, aweme);
                    C78949Uyf.LJJIIZ(aweme);
                    AwemeService.LIZ().R1(aweme);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            c49843JhH.LIZLLL.addAll(LJLL);
            C3A5.LIZ.LJFF(searchMixFeedList.getRequestId(), searchMixFeedList.logPb);
        }
        LJIIIZ(searchMixFeedList.mItems);
        List<SearchMixFeed> items = getItems();
        o.LJIIIZ(items, "items");
        C49603JdP.LIZJ(Integer.valueOf(c49843JhH.LIZIZ), c49843JhH.LIZ.LJLILLLLZI, items);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01a8, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, r6.LJIIIIZZ) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0113, code lost:
    
        if (r1 == null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC49845JhJ(X.C49841JhF r10, X.AbstractC65590Pog r11, X.C49847JhL r12) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC49845JhJ.<init>(X.JhF, X.Pog, X.JhL):void");
    }

    public List<SearchMixFeed> LJJIFFI(Aweme aweme, C49825Jgz c49825Jgz, int i) {
        C49847JhL root = this.LJLZ;
        o.LJIIIZ(root, "root");
        root.LIZJ = null;
        root.LIZLLL = null;
        root.LJ = null;
        return C61878OQg.INSTANCE;
    }
}
