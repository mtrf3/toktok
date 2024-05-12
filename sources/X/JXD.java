package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JXD extends AbstractC49300JWm<SearchMixFeed> {
    public final JXF LIZIZ = JXF.LIZ;
    public final C49854JhS LIZJ = new C49854JhS(true, false, true, true, false, false, false, 3092);

    @Override // X.AbstractC49300JWm
    public final EnumC49272JVk LIZIZ() {
        return EnumC49272JVk.ALL_COLUMNS;
    }

    @Override // X.AbstractC49300JWm
    public final JWX<SearchMixFeed> LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC49300JWm
    public final C49854JhS LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.AbstractC49300JWm
    public final List LIZ(SearchMixFeed searchMixFeed, C49847JhL streamRoot) {
        SearchMixFeed item = searchMixFeed;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(streamRoot, "streamRoot");
        List<Aweme> list = item.aggregatedVideo.awemes;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAid());
            }
            if (arrayList.contains(streamRoot.LIZJ)) {
                return item.aggregatedVideo.awemes;
            }
        }
        List<Aweme> list2 = item.aggregatedVideo.awemes;
        if (list2 != null) {
            return ORZ.LLILLL(list2, 3);
        }
        return null;
    }
}
