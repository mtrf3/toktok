package X;

import Y.AfS55S0100000_3;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8B4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8B4 extends AbstractC51036K1g<Aweme, ExploreAwemeList> {
    public String LJLIL;
    public List<AnonymousClass837> LJLILLLLZI;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        List<Aweme> list;
        ExploreAwemeList exploreAwemeList = (ExploreAwemeList) this.mData;
        if (exploreAwemeList == null || (list = exploreAwemeList.items) == null) {
            return new ArrayList();
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t == 0 || ((ExploreAwemeList) t).hasMore != 1) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Aweme aweme) {
        return C78996UzQ.LJIIIIZZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        ExploreAwemeList exploreAwemeList;
        ExploreAwemeList exploreAwemeList2 = (ExploreAwemeList) obj;
        if (exploreAwemeList2 == null || (exploreAwemeList = (ExploreAwemeList) this.mData) == null) {
            return;
        }
        exploreAwemeList.hasMore = exploreAwemeList2.hasMore;
        if (exploreAwemeList.items == null) {
            exploreAwemeList.items = exploreAwemeList2.items;
            return;
        }
        List<Aweme> list = exploreAwemeList2.items;
        if (list == null) {
            return;
        }
        Iterator<Aweme> it = list.iterator();
        while (it.hasNext()) {
            it.next().setExploreClientExtra(new ExploreClientExtra(1, null, 2, null));
        }
        List<Aweme> list2 = exploreAwemeList.items;
        if (list2 == null) {
            return;
        }
        list2.addAll(list);
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        List<AnonymousClass837> list = this.LJLILLLLZI;
        if (list == null) {
            return;
        }
        C8B3.LIZ.LIZIZ(12, 0, list).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(this, 47), new AfS55S0100000_3(this, 48));
    }
}
