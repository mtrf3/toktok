package X;

import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Jgy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49824Jgy extends AbstractC49793JgT<SearchUser, SearchUserList> {
    @Override // X.AbstractC49793JgT
    public final int LJIILL() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((SearchUserList) t).hasMore) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC49793JgT, X.C8BS
    /* renamed from: LJIJJLI, reason: merged with bridge method [inline-methods] */
    public final void handleData(SearchUserList searchUserList) {
        T t;
        User user;
        super.handleData(searchUserList);
        o.LJI(searchUserList);
        List<SearchUser> list = searchUserList.userList;
        boolean LJJIFFI = C79004UzY.LJJIFFI(list);
        this.mIsNewDataEmpty = LJJIFFI;
        boolean z = false;
        if (!LJJIFFI) {
            for (SearchUser searchUser : list) {
                searchUser.mGlobalDoodleConfig = searchUserList.globalDoodleConfig;
                if (!searchUser.isDynamicCard() && (user = searchUser.user) != null) {
                    user.setRequestId(this.LJLLI);
                }
                searchUser.logPb = searchUserList.logPb;
            }
            int i = this.mListQueryType;
            if (i != 1) {
                if (i != 4) {
                    return;
                }
                LJIIIZ(list);
                T t2 = this.mData;
                SearchUserList searchUserList2 = (SearchUserList) t2;
                if (searchUserList.hasMore && ((SearchUserList) t2).hasMore) {
                    z = true;
                }
                searchUserList2.hasMore = z;
                ((SearchUserList) t2).cursor = searchUserList.cursor;
                return;
            }
            this.mData = searchUserList;
            searchUserList.userList = new ArrayList();
            LJIJJ(list);
            return;
        }
        int i2 = this.mListQueryType;
        if (i2 != 1) {
            if (i2 == 4 && (t = this.mData) != 0) {
                SearchUserList searchUserList3 = (SearchUserList) t;
                if (searchUserList.hasMore && ((SearchUserList) t).hasMore) {
                    z = true;
                }
                searchUserList3.hasMore = z;
                if (((SearchUserList) t).hasMore) {
                    ((SearchUserList) t).cursor = searchUserList.cursor;
                    return;
                }
                return;
            }
            return;
        }
        this.mData = searchUserList;
        LJIIJJI();
        T t3 = this.mData;
        if (t3 != 0) {
            ((SearchUserList) t3).hasMore = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        int i;
        C50287JoR c50287JoR;
        int i2;
        String str;
        String str2;
        ActivityC45651qj activityC45651qj;
        Integer num;
        o.LJIIIZ(params, "params");
        if (params.length > 3) {
            Object obj = params[3];
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            i = ((Integer) obj).intValue();
        } else {
            i = 0;
        }
        String str3 = null;
        if (params.length > 4) {
            c50287JoR = (C50287JoR) params[4];
        } else {
            c50287JoR = null;
        }
        String LJIIL = LJIIL(params);
        if (isDataEmpty()) {
            i2 = 0;
        } else {
            i2 = ((SearchUserList) this.mData).cursor;
        }
        long j = i2;
        String str4 = this.LJLLJ;
        if (str4 == null) {
            str4 = "";
        }
        String LJIILJJIL = LJIILJJIL();
        int i3 = this.LJLL;
        String str5 = this.LJLLILLLL;
        SearchResultParam searchResultParam = this.LJLJJI;
        if (searchResultParam != null) {
            str = searchResultParam.getSugUserId();
        } else {
            str = null;
        }
        SearchResultParam searchResultParam2 = this.LJLJJI;
        if (searchResultParam2 != null) {
            str2 = searchResultParam2.getIsRichSug();
        } else {
            str2 = null;
        }
        String str6 = this.LJLLL;
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
        SearchResultParam searchResultParam3 = this.LJLJJI;
        if (searchResultParam3 != null) {
            str3 = searchResultParam3.getSugGenerateType();
        }
        C50030JkI c50030JkI = new C50030JkI(new C50031JkJ(LJIIL, str5, null, i3, i, str4, str6, j, 10, LJIILJJIL, c50287JoR, null, str, str2, null, null, LIZ, num, str3, null, null, 805253130, 3));
        c50030JkI.LJLILLLLZI = null;
        this.LJLJJLL = c50030JkI;
        FGR.LIZIZ().LIZ(this.mHandler, c50030JkI, 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        int i;
        C50287JoR c50287JoR;
        String str;
        String str2;
        ActivityC45651qj activityC45651qj;
        Integer num;
        o.LJIIIZ(params, "params");
        if (params.length > 3) {
            Object obj = params[3];
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            i = ((Integer) obj).intValue();
        } else {
            i = 0;
        }
        String str3 = null;
        if (params.length > 4) {
            c50287JoR = (C50287JoR) params[4];
        } else {
            c50287JoR = null;
        }
        String LJIIL = LJIIL(params);
        String LJIILJJIL = LJIILJJIL();
        int i2 = this.LJLL;
        String str4 = this.LJLLILLLL;
        SearchResultParam searchResultParam = this.LJLJJI;
        if (searchResultParam != null) {
            str = searchResultParam.getSugUserId();
        } else {
            str = null;
        }
        SearchResultParam searchResultParam2 = this.LJLJJI;
        if (searchResultParam2 != null) {
            str2 = searchResultParam2.getIsRichSug();
        } else {
            str2 = null;
        }
        String str5 = this.LJLLL;
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
        SearchResultParam searchResultParam3 = this.LJLJJI;
        if (searchResultParam3 != null) {
            str3 = searchResultParam3.getSugGenerateType();
        }
        C50030JkI c50030JkI = new C50030JkI(new C50031JkJ(LJIIL, str4, null, i2, i, "", str5, 0L, 10, LJIILJJIL, c50287JoR, null, str, str2, null, LIZIZ, LIZ, num, str3, Long.valueOf(C17N.LJJJJLL().IO().LIZJ().LJLIL), null, 804728842, 2));
        c50030JkI.LJLILLLLZI = null;
        this.LJLJJLL = c50030JkI;
        FGR.LIZIZ().LIZ(this.mHandler, c50030JkI, 0);
    }
}
