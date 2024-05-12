package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Jgu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49820Jgu extends AbstractC49793JgT<SearchLiveStruct, SearchLiveList> {
    public String LJLLLL;
    public String LJLLLLLL;

    @Override // X.AbstractC49793JgT
    public final int LJIILL() {
        return 7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((SearchLiveList) t).hasMore) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC49793JgT, X.C8BS
    /* renamed from: LJIJJLI, reason: merged with bridge method [inline-methods] */
    public final void handleData(SearchLiveList searchLiveList) {
        List<SearchLiveStruct> list;
        boolean z;
        LogPbBean logPbBean;
        super.handleData(searchLiveList);
        if (searchLiveList != 0) {
            list = searchLiveList.LJI();
        } else {
            list = null;
        }
        if (searchLiveList == 0 || C79004UzY.LJJIFFI(list)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            o.LJI(list);
            for (SearchLiveStruct searchLiveStruct : list) {
                if (searchLiveStruct.getLiveAweme() != null) {
                    searchLiveStruct.getLiveAweme().setRequestId(this.LJLLI);
                    if (searchLiveList != 0) {
                        logPbBean = searchLiveList.logPb;
                    } else {
                        logPbBean = null;
                    }
                    searchLiveStruct.setLogPbBean(logPbBean);
                }
            }
            int i = this.mListQueryType;
            if (i != 1) {
                if (i != 4) {
                    return;
                }
                LJIL(searchLiveList);
                return;
            } else {
                this.mData = searchLiveList;
                searchLiveList.LJLIL = new ArrayList();
                LJIJJ(list);
                ((SearchLiveList) this.mData).hasMore = true;
                return;
            }
        }
        if (this.mListQueryType == 1) {
            this.mData = searchLiveList;
            LJIIJJI();
        }
        T t = this.mData;
        if (t != 0) {
            ((SearchLiveList) t).hasMore = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIL(SearchLiveList data) {
        boolean z;
        o.LJIIIZ(data, "data");
        getItems().size();
        LJIIIZ(data.LJI());
        T t = this.mData;
        SearchLiveList searchLiveList = (SearchLiveList) t;
        if (data.hasMore && ((SearchLiveList) t).hasMore) {
            z = true;
        } else {
            z = false;
        }
        searchLiveList.hasMore = z;
        ((SearchLiveList) t).cursor = data.cursor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        long j;
        Integer num;
        o.LJIIIZ(params, "params");
        String LJIIL = LJIIL(params);
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((SearchLiveList) this.mData).cursor;
        }
        String str = this.LJLLJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.LJLLLLLL;
        if (str3 != null) {
            str2 = str3;
        }
        int i = this.LJLL;
        String str4 = this.LJLLILLLL;
        String str5 = this.LJLLL;
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        C49821Jgv c49821Jgv = new C49821Jgv(new C50031JkJ(LJIIL, str4, null, i, 0, str, str5, j, 20, str2, null, null, null, null, null, null, null, num, null, null, null, -1073743830, 3));
        c49821Jgv.LJLILLLLZI = null;
        this.LJLJJLL = c49821Jgv;
        FGR.LIZIZ().LIZ(this.mHandler, c49821Jgv, 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        String LJIIL = LJIIL(params);
        String str = this.LJLLLLLL;
        if (str == null) {
            str = "";
        }
        int i = this.LJLL;
        String str2 = this.LJLLILLLL;
        String str3 = this.LJLLL;
        String str4 = this.LJLLLL;
        Integer num = null;
        if (a.LJFF().LJJJJI()) {
            num = 1;
        }
        C49821Jgv c49821Jgv = new C49821Jgv(new C50031JkJ(LJIIL, str2, null, i, 0, "", str3, 0L, 20, str, null, null, null, null, str4, null, null, num, null, null, null, -1074005974, 3));
        c49821Jgv.LJLILLLLZI = null;
        this.LJLJJLL = c49821Jgv;
        FGR.LIZIZ().LIZ(this.mHandler, c49821Jgv, 0);
    }
}
