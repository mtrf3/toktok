package X;

import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.hashtagsearch.core.model.SearchChallengeList;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Jgw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49822Jgw extends AbstractC49793JgT<SearchChallenge, SearchChallengeList> {
    @Override // X.AbstractC49793JgT
    public final int LJIILL() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((SearchChallengeList) t).hasMore) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC49793JgT, X.C8BS
    /* renamed from: LJIJJLI, reason: merged with bridge method [inline-methods] */
    public final void handleData(SearchChallengeList searchChallengeList) {
        super.handleData(searchChallengeList);
        o.LJI(searchChallengeList);
        List<SearchChallenge> list = searchChallengeList.challengeList;
        C49370JZe.LIZ(list);
        boolean LJJIFFI = C79004UzY.LJJIFFI(list);
        this.mIsNewDataEmpty = LJJIFFI;
        boolean z = false;
        if (!LJJIFFI) {
            for (SearchChallenge searchChallenge : list) {
                if (searchChallenge.getChallenge() != null) {
                    searchChallenge.getChallenge().setRequestId(this.LJLLI);
                }
                searchChallenge.setRequestId(searchChallengeList.getRequestId());
                searchChallenge.logPbBean = searchChallengeList.logPb;
            }
            int i = this.mListQueryType;
            if (i != 1) {
                if (i != 4) {
                    return;
                }
                LJIIIZ(list);
                T t = this.mData;
                SearchChallengeList searchChallengeList2 = (SearchChallengeList) t;
                if (searchChallengeList.hasMore && ((SearchChallengeList) t).hasMore) {
                    z = true;
                }
                searchChallengeList2.hasMore = z;
                ((SearchChallengeList) t).cursor = searchChallengeList.cursor;
                return;
            }
            this.mData = searchChallengeList;
            searchChallengeList.challengeList = new ArrayList();
            LJIJJ(list);
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = searchChallengeList;
            LJIIJJI();
        }
        T t2 = this.mData;
        if (t2 != 0) {
            ((SearchChallengeList) t2).hasMore = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        int i;
        ActivityC45651qj activityC45651qj;
        Integer num;
        String str;
        o.LJIIIZ(params, "params");
        String LJIIL = LJIIL(params);
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchChallengeList) this.mData).cursor;
        }
        long j = i;
        String str2 = this.LJLLJ;
        if (str2 == null) {
            str2 = "";
        }
        Object obj = params[3];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        String LJIILJJIL = LJIILJJIL();
        int i2 = this.LJLL;
        String str3 = this.LJLLILLLL;
        String str4 = this.LJLLL;
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJL;
        if (weakReference != null) {
            activityC45651qj = weakReference.get();
        } else {
            activityC45651qj = null;
        }
        String LIZ = C50589JtJ.LIZ(activityC45651qj, this.LJLJJI);
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        SearchResultParam searchResultParam = this.LJLJJI;
        if (searchResultParam != null) {
            str = searchResultParam.getSugGenerateType();
        } else {
            str = null;
        }
        C50033JkL c50033JkL = new C50033JkL(new C50031JkJ(LJIIL, str3, null, i2, intValue, str2, str4, j, 20, LJIILJJIL, null, null, null, null, null, null, LIZ, num, str, null, null, 805304330, 3));
        c50033JkL.LJLILLLLZI = null;
        this.LJLJJLL = c50033JkL;
        FGR.LIZIZ().LIZ(this.mHandler, c50033JkL, 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        ActivityC45651qj activityC45651qj;
        Integer num;
        String str;
        o.LJIIIZ(params, "params");
        String LJIIL = LJIIL(params);
        Object obj = params[3];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        String LJIILJJIL = LJIILJJIL();
        int i = this.LJLL;
        String str2 = this.LJLLILLLL;
        String str3 = this.LJLLL;
        String LIZIZ = C50236Jnc.LIZ().LIZIZ();
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJL;
        if (weakReference != null) {
            activityC45651qj = weakReference.get();
        } else {
            activityC45651qj = null;
        }
        String LIZ = C50589JtJ.LIZ(activityC45651qj, this.LJLJJI);
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        SearchResultParam searchResultParam = this.LJLJJI;
        if (searchResultParam != null) {
            str = searchResultParam.getSugGenerateType();
        } else {
            str = null;
        }
        C50033JkL c50033JkL = new C50033JkL(new C50031JkJ(LJIIL, str2, null, i, intValue, "", str3, 0L, 20, LJIILJJIL, null, null, null, null, null, LIZIZ, LIZ, num, str, Long.valueOf(C17N.LJJJJLL().IO().LIZJ().LJLIL), null, 804780042, 2));
        c50033JkL.LJLILLLLZI = null;
        this.LJLJJLL = c50033JkL;
        FGR.LIZIZ().LIZ(this.mHandler, c50033JkL, 0);
    }
}
