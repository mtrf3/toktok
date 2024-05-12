package X;

import Y.ARunnableS12S0101000_8;
import Y.AgS111S0200000_8;
import Y.AgS125S0100000_8;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.service.ISearchDebugService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JiQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49914JiQ extends C49825Jgz {
    public static final /* synthetic */ int LLIILII = 0;
    public transient boolean LLI;
    public transient boolean LLII;
    public transient boolean LLIIII;
    public transient boolean LLIIIILZ;
    public C49919JiV LLIIIL;
    public long LLIIIZ;
    public long LLIIJI;
    public List<SearchMixFeed> LLIIJLIL;
    public final Boolean LLIIL;
    public int LLFZ = -1;
    public transient boolean LLIFFJFJJ = true;
    public transient boolean LLIIIJ = true;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJIL() {
        C49389JZx.LIZ(Integer.valueOf(this.LJZ));
        SearchMixFeedList searchMixFeedList = (SearchMixFeedList) this.mData;
        C49825Jgz.LJJIIZ(searchMixFeedList);
        C49825Jgz.LJJIIJZLJL(searchMixFeedList);
        SearchMixFeedList searchMixFeedList2 = (SearchMixFeedList) this.mData;
        LinkedList linkedList = new LinkedList(((SearchMixFeedList) this.mData).mItems);
        C49389JZx.LIZIZ(linkedList, this.LJZ, this.LJZI, ((SearchMixFeedList) this.mData).hasMore);
        searchMixFeedList2.mItems = linkedList;
        LJJIIZI((SearchMixFeedList) this.mData);
        this.LLIIIL.oa(((SearchApiResult) this.mData).globalDoodleConfig);
    }

    public C49914JiQ() {
        ((ISearchDebugService) ServiceManager.get().getService(ISearchDebugService.class)).LJ();
        this.LLIIL = Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJIL() {
        List<SearchMixFeed> list;
        LJIIJJI();
        T t = this.mData;
        if (t != 0 && (list = ((SearchMixFeedList) t).mItems) != null) {
            list.clear();
        }
        this.mData = null;
        this.LLIIIL.clearCache();
        this.LLIIIL.oa(null);
    }

    public static void LJJIJL(Aweme aweme) {
        C38995FSd.LIZJ().execute(new IDRunnableS6S0101000(7, aweme, 3));
    }

    public static void LJJJI(SearchMixFeedList searchMixFeedList) {
        SearchUser searchUser;
        List<Aweme> list;
        if (C46440IKm.LJJIZ() && searchMixFeedList != null && !C79004UzY.LJJIFFI(searchMixFeedList.mItems)) {
            SearchMixFeed searchMixFeed = (SearchMixFeed) ListProtector.get(searchMixFeedList.mItems, 0);
            if (searchMixFeed.getFeedType() == 65458) {
                List<SearchUser> list2 = searchMixFeed.users;
                if (list2 != null && !list2.isEmpty() && (list = (searchUser = (SearchUser) ListProtector.get(searchMixFeed.users, 0)).awemeCards) != null && !list.isEmpty() && !C79004UzY.LJJIFFI(searchUser.awemeCards)) {
                    LJJIJL((Aweme) ListProtector.get(searchUser.awemeCards, 0));
                } else if (searchMixFeedList.mItems.size() > 1) {
                    LJJIJL(((AbstractC49325JXl) ListProtector.get(searchMixFeedList.mItems, 1)).getAweme());
                }
            } else if (searchMixFeed.getFeedType() == 65280) {
                LJJIJL(searchMixFeed.getAweme());
            }
        }
        C46444IKq.LJLJLJ.getClass();
        if (C46444IKq.LJJIZ().enableSearchSecondVideoPreloadInChunk && C46442IKo.LIZ() && searchMixFeedList != null && !C79004UzY.LJJIFFI(searchMixFeedList.mItems) && searchMixFeedList.mItems.size() > 1) {
            AbstractC49325JXl abstractC49325JXl = (AbstractC49325JXl) ListProtector.get(searchMixFeedList.mItems, 1);
            if (abstractC49325JXl.getFeedType() == 65280) {
                LJJIJL(abstractC49325JXl.getAweme());
            }
        }
    }

    public final void LJJIJLIJ(SearchMixFeedList searchMixFeedList) {
        this.LLIIIL.o10();
        LJJIZ(searchMixFeedList);
        LJIILLIIL(searchMixFeedList);
        this.LLIIIL.WN();
        LJJJJ(0);
        List<C8BT> list = this.mNotifyListeners;
        if (list != null) {
            Iterator<C8BT> it = list.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIZ(SearchMixFeedList searchMixFeedList) {
        int size;
        String requestId;
        C49932Jii c49932Jii;
        int size2;
        C49932Jii c49932Jii2;
        if (this.LLII) {
            return;
        }
        C49920JiW LJ = C49921JiX.LJ(this.LJLJJI);
        long j = this.LLIIJI;
        LJ.getClass();
        C49920JiW c49920JiW = C49567Jcp.LIZ;
        if (!o.LJ(LJ, c49920JiW)) {
            long j2 = LJ.LIZJ;
            if (j2 == 0) {
                j2 = LJ.LIZIZ;
            }
            LJ.LJIIIZ = j;
            LJ.LJIILL = (int) (j - j2);
        }
        int i = (int) (this.LLIIJI - this.LLIIIZ);
        if (!o.LJ(LJ, c49920JiW)) {
            LJ.LJIILLIIL = i;
        }
        T t = this.mData;
        if (t == 0) {
            size = 0;
        } else {
            size = ((SearchMixFeedList) t).mItems.size();
        }
        LJ.LIZJ(size);
        T t2 = this.mData;
        String str = "";
        if (t2 == 0) {
            requestId = "";
        } else {
            requestId = ((SearchApiResult) t2).getRequestId();
        }
        LJ.LJFF(requestId);
        LJ.LJIIJ((K4J) this.mData);
        if (searchMixFeedList != null && (c49932Jii = searchMixFeedList.LJLJJI) != null && !o.LJ(LJ, c49920JiW)) {
            LJ.LJJIIJ = new C49932Jii(c49932Jii.LIZ());
        }
        LJ.LJIIJJI(0);
        C49950Jj0.LJFF.LIZIZ();
        C49923JiZ LIZLLL = C49922JiY.LIZLLL(this.LJLJJI);
        LIZLLL.getClass();
        C49923JiZ c49923JiZ = C49936Jim.LIZ;
        o.LJ(LIZLLL, c49923JiZ);
        int i2 = (int) (this.LLIIJI - this.LLIIIZ);
        if (!o.LJ(LIZLLL, c49923JiZ)) {
            LIZLLL.LJIIIIZZ = i2;
        }
        T t3 = this.mData;
        if (t3 == 0) {
            size2 = 0;
        } else {
            size2 = ((SearchMixFeedList) t3).mItems.size();
        }
        if (!o.LJ(LIZLLL, c49923JiZ)) {
            LIZLLL.LJII = size2;
        }
        T t4 = this.mData;
        if (t4 != 0) {
            str = ((SearchApiResult) t4).getRequestId();
        }
        if (!o.LJ(LIZLLL, c49923JiZ)) {
            LIZLLL.LJIIJ = str;
        }
        K4J k4j = (K4J) this.mData;
        if (!o.LJ(LIZLLL, c49923JiZ)) {
            LIZLLL.LJI = k4j;
        }
        if (searchMixFeedList != null && (c49932Jii2 = searchMixFeedList.LJLJJI) != null && !o.LJ(LIZLLL, c49923JiZ)) {
            LIZLLL.LJIILLIIL = new C49932Jii(c49932Jii2.LIZ());
        }
        LIZLLL.LJI(0);
        this.LLII = true;
    }

    public final void LJJJJ(int i) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            this.LLFZ = i;
        } else {
            this.mHandler.post(new ARunnableS12S0101000_8(i, this, 39));
        }
    }

    public static void LJJIL(int i, SearchMixFeedList searchMixFeedList) {
        List<SearchMixFeed> list = searchMixFeedList.mItems;
        if (list != null) {
            Iterator<SearchMixFeed> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJLJLJ = i;
            }
        }
    }

    public final void LJJJ(Exception exc, C10K<QDX<SearchMixFeedList>> c10k) {
        String message;
        C49950Jj0.LJFF.LIZIZ();
        C50139Jm3.LIZ(C50605JtZ.LJIIJJI());
        this.LJLJJLL = null;
        int i = 1;
        if (exc != null || c10k.LJIIJ() != null) {
            C49920JiW LJ = C49921JiX.LJ(this.LJLJJI);
            LJ.LJI();
            LJ.LJIIJJI(1);
            if (exc.getMessage() != null) {
                message = exc.getMessage();
            } else {
                message = c10k.LJIIJ().getMessage();
            }
            if (!o.LJ(LJ, C49567Jcp.LIZ)) {
                LJ.LJIJJ = message;
            }
            C49950Jj0.LJ.LIZLLL(exc);
        } else {
            C49920JiW LJ2 = C49921JiX.LJ(this.LJLJJI);
            LJ2.LJI();
            LJ2.LJIIJJI(1);
            C49950Jj0.LJ.LIZIZ(6, 5, "CHUNK_REQUEST_FAIL");
        }
        if (this.LLFZ != 1 && this.mData != 0) {
            return;
        }
        this.mHandler.post(new RunnableC47621ImX(i, this, exc, c10k));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C49825Jgz
    public final void LJJIJIIJI(String keyword, int i, int i2, String searchId, int i3, C50287JoR c50287JoR, String str, String str2, Context context) {
        String str3;
        String str4;
        int i4;
        long j;
        long visibleModules;
        String songID;
        String appTheme;
        String appName;
        int screenWidth;
        int screenHeight;
        C10K<QDX<SearchMixFeedList>> c10k;
        ActivityC45651qj activityC45651qj = null;
        if (i != 0) {
            WeakReference<ActivityC45651qj> weakReference = this.LJLJJL;
            if (weakReference != null) {
                activityC45651qj = weakReference.get();
            }
            super.LJJIJIIJI(keyword, i, i2, searchId, i3, c50287JoR, str, str2, activityC45651qj);
            return;
        }
        LJIIJ(1, "ChunkV2 new request");
        this.LJLLLL = i3;
        this.LJLIL = c50287JoR;
        SearchResultParam searchResultParam = this.LJLJJI;
        String str5 = "";
        if (searchResultParam == null || searchResultParam.getSugUserId() == null || this.LJLJJI.getSugUserId().equals("")) {
            str3 = "";
        } else {
            str3 = this.LJLJJI.getSugUserId();
        }
        SearchResultParam searchResultParam2 = this.LJLJJI;
        if (searchResultParam2 != null) {
            i4 = searchResultParam2.getGeneralSearchSortType();
            str4 = this.LJLJJI.getHashtagId();
        } else {
            str4 = null;
            i4 = 0;
        }
        C50650JuI fetchOwnImmutableData = C50652JuK.fetchOwnImmutableData((LifecycleOwner) context);
        if (fetchOwnImmutableData != null) {
            C49636Jdw searchSessionModel = fetchOwnImmutableData.getSearchSessionModel();
            if (searchSessionModel.getSearchSessionId() == null) {
                j = 0;
            } else {
                j = searchSessionModel.getSearchSessionId().longValue();
            }
        } else {
            j = 10086;
        }
        C50637Ju5 c50637Ju5 = new C50637Ju5();
        C49929Jif c49929Jif = new C49929Jif();
        o.LJIIIZ(keyword, "keyword");
        C49915JiR c49915JiR = c49929Jif.LIZ;
        c49915JiR.LJLILLLLZI = keyword;
        c49915JiR.LJLJI = i;
        c49915JiR.LJLJJI = 10;
        c49915JiR.LJLJJL = i2;
        o.LJIIIZ(searchId, "searchId");
        C49915JiR c49915JiR2 = c49929Jif.LIZ;
        c49915JiR2.LJLJJLL = searchId;
        c49915JiR2.LJLJLJ = i3;
        c49929Jif.LIZ(this.LJLIL);
        String searchSource = this.LJLLILLLL;
        o.LJIIIZ(searchSource, "searchSource");
        C49915JiR c49915JiR3 = c49929Jif.LIZ;
        c49915JiR3.LJLL = searchSource;
        c49915JiR3.LJLLI = this.LJLL;
        SearchResultParam searchResultParam3 = this.LJLJJI;
        c49915JiR3.LJLIL = searchResultParam3;
        c49915JiR3.LJLLLLLL = str;
        c49915JiR3.LJZ = str3;
        if (searchResultParam3 != null && searchResultParam3.getSugIsLiveSug()) {
            c49929Jif.LIZ.LJZI = "1";
        }
        c49929Jif.LIZ.LJLZ = "";
        c49929Jif.LIZ.LLFFF = C49825Jgz.LJJIIJ() ? 1 : 0;
        boolean LIZ = c50637Ju5.LIZ(keyword);
        C49915JiR c49915JiR4 = c49929Jif.LIZ;
        c49915JiR4.LLFII = LIZ ? 1 : 0;
        c49915JiR4.LJLJL = str2;
        c49929Jif.LIZ.LLI = Integer.valueOf(i4);
        String LIZ2 = C50589JtJ.LIZ(context, this.LJLJJI);
        C49915JiR c49915JiR5 = c49929Jif.LIZ;
        c49915JiR5.LLIFFJFJJ = LIZ2;
        c49915JiR5.LLII = str4;
        c49929Jif.LIZ.LLIIII = Long.valueOf(j);
        SearchResultParam searchResultParam4 = this.LJLJJI;
        if (searchResultParam4 == null) {
            visibleModules = 0;
        } else {
            visibleModules = searchResultParam4.getVisibleModules();
        }
        c49929Jif.LIZ.LLIIIILZ = Long.valueOf(visibleModules);
        SearchResultParam searchResultParam5 = this.LJLJJI;
        if (searchResultParam5 == null) {
            songID = null;
        } else {
            songID = searchResultParam5.getSongID();
        }
        c49929Jif.LIZ.LLIIIJ = songID;
        SearchResultParam searchResultParam6 = this.LJLJJI;
        if (searchResultParam6 == null) {
            appTheme = "light";
        } else {
            appTheme = searchResultParam6.getAppTheme();
        }
        c49929Jif.LIZ.LLIIIL = appTheme;
        SearchResultParam searchResultParam7 = this.LJLJJI;
        if (searchResultParam7 == null) {
            appName = "";
        } else {
            appName = searchResultParam7.getAppName();
        }
        c49929Jif.LIZ.LLIIIZ = appName;
        SearchResultParam searchResultParam8 = this.LJLJJI;
        if (searchResultParam8 == null) {
            screenWidth = 0;
        } else {
            screenWidth = searchResultParam8.getScreenWidth();
        }
        c49929Jif.LIZ.LLIIJI = Integer.valueOf(screenWidth);
        SearchResultParam searchResultParam9 = this.LJLJJI;
        if (searchResultParam9 == null) {
            screenHeight = 0;
        } else {
            screenHeight = searchResultParam9.getScreenHeight();
        }
        Integer valueOf = Integer.valueOf(screenHeight);
        C49915JiR c49915JiR6 = c49929Jif.LIZ;
        c49915JiR6.LLIIJLIL = valueOf;
        java.util.Map<C49915JiR, OSZ<C49915JiR, C10K<?>>> map = C49924Jia.LIZ;
        OSZ osz = (OSZ) ((HashMap) map).get(c49915JiR6);
        if (osz != null) {
            C49920JiW LJ = C49921JiX.LJ(c49915JiR6.LJLIL);
            LJ.getClass();
            if (!o.LJ(LJ, C49567Jcp.LIZ)) {
                LJ.LJJI = 1;
            }
            C49923JiZ LIZLLL = C49922JiY.LIZLLL(c49915JiR6.LJLIL);
            LIZLLL.getClass();
            if (!o.LJ(LIZLLL, C49936Jim.LIZ)) {
                LIZLLL.LJIILJJIL = 1;
            }
        } else {
            osz = null;
        }
        ((HashMap) map).remove(c49915JiR6);
        String str6 = c49915JiR6.LJLILLLLZI;
        if (str6 != null) {
            ((HashMap) C49924Jia.LIZIZ).remove(str6);
        }
        if (osz == null) {
            c10k = null;
        } else {
            c49915JiR6 = (C49915JiR) osz.getFirst();
            c10k = (C10K) osz.getSecond();
        }
        this.mIsLoading = true;
        if (c10k == null) {
            c10k = c49915JiR6.LIZJ();
        }
        this.LJLJJLL = c49915JiR6;
        LJJJJ(0);
        this.LLIFFJFJJ = true;
        this.LLI = false;
        this.LLII = false;
        this.LJLJLJ = true;
        this.LLIIII = false;
        C49949Jiz c49949Jiz = C49950Jj0.LJFF;
        if (c49949Jiz.LIZJ == -1) {
            c49949Jiz.LIZJ = System.currentTimeMillis();
            c49949Jiz.LIZLLL = -1L;
            C49951Jj1 c49951Jj1 = C49950Jj0.LJ;
            if (c49951Jj1.LIZJ == null) {
                c49951Jj1.LIZJ = 1;
                if (1 != 0) {
                    str5 = 1;
                }
                c49951Jj1.LIZ(str5, "request_type");
            }
        }
        c10k.LJFF(new AgS111S0200000_8(this, c49915JiR6, 4));
        c10k.LJ(new AgS125S0100000_8(this, 5), C10K.LJIIIIZZ, null);
    }
}
