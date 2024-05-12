package X;

import Y.ARunnableS40S0100000_4;
import Y.ARunnableS44S0100000_8;
import Y.AfS60S0100000_8;
import com.google.gson.g;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.Jhn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49875Jhn extends AbstractC49845JhJ implements InterfaceC49878Jhq {
    public static final int LLILIL;
    public static final int LLILL;
    public final String LLF;
    public final String LLFF;
    public final String LLFFF;
    public final C50091JlH LLFII;
    public final C49825Jgz LLFZ;
    public final InterfaceC49778JgE LLI;
    public final List<SearchMixFeed> LLIFFJFJJ;
    public final InterfaceC49758Jfu LLII;
    public final /* synthetic */ C49783JgJ LLIIII;
    public final C49876Jho LLIIIILZ;
    public String LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public final ArrayList<Aweme> LLIIL;
    public C73495Sst LLIILII;
    public boolean LLIILZL;
    public final int LLIIZ;
    public final C62822Ol8 LLIL;
    public final C62822Ol8 LLILII;

    @Override // X.InterfaceC49844JhI
    public final String LIZLLL() {
        return this.LLIIII.LIZLLL();
    }

    @Override // X.InterfaceC49844JhI
    public final int LJ(String innerSearchId) {
        o.LJIIIZ(innerSearchId, "innerSearchId");
        return this.LLIIII.LJ(innerSearchId);
    }

    @Override // X.InterfaceC49844JhI
    public final String LJFF() {
        return this.LLIIII.LJFF();
    }

    @Override // X.AbstractC49793JgT
    public final boolean LJIIZILJ() {
        return false;
    }

    @Override // X.AbstractC49845JhJ
    public final void LJJI(Aweme aweme, List<? extends Aweme> list, List<? extends SearchMixFeed> list2) {
        this.LLIIII.LIZ(aweme, list, list2);
    }

    @Override // X.AbstractC49845JhJ, X.InterfaceC50392Jq8
    public final void Mt() {
    }

    @Override // X.InterfaceC49878Jhq
    public final void gu0() {
        this.mListQueryType = 4;
        this.mHandler.post(new ARunnableS44S0100000_8(this, 46));
    }

    @Override // X.InterfaceC49878Jhq
    public final void o1() {
        this.mListQueryType = 4;
        loadMoreList(new Object[0]);
        this.mIsLoading = true;
    }

    @Override // X.AbstractC49845JhJ, X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
    }

    static {
        int i = 1;
        int intValue = ((Number) DYQ.LIZ.getValue()).intValue() - 1;
        if (1 < intValue) {
            i = intValue;
        }
        LLILIL = i;
        LLILL = ((Number) DYS.LIZ.getValue()).intValue();
    }

    @Override // X.AbstractC49845JhJ
    public final void LJJII() {
        C49876Jho c49876Jho;
        C73495Sst c73495Sst = this.LLIILII;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        if (C49879Jhr.LIZ() && (c49876Jho = this.LLIIIILZ) != null) {
            c49876Jho.LJ();
            c49876Jho.LJFF();
            ((java.util.Set) c49876Jho.LJLLILLLL.getValue()).clear();
            if (C50050Jkc.LIZ()) {
                ((java.util.Set) c49876Jho.LJLJLLL.getValue()).clear();
            }
            List<Aweme> awemeList = c49876Jho.LJLILLLLZI.getAwemeList();
            if (awemeList != null) {
                for (Aweme aweme : awemeList) {
                    if (C78963Uyt.LJJIJIIJI(aweme)) {
                        C78963Uyt.LIZLLL(aweme);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("release,clear preset fallback aweme:");
                        LIZ.append(aweme.getAid());
                        X1D.LIZIZ(LIZ);
                    }
                }
            }
            for (SearchMixFeed searchMixFeed : c49876Jho.LJLILLLLZI.Cn0()) {
                searchMixFeed.LJLJI = false;
                searchMixFeed.LJLJJL = false;
            }
        }
        for (SearchMixFeed searchMixFeed2 : getItems()) {
            searchMixFeed2.LJLJI = false;
            searchMixFeed2.LJLJJL = false;
        }
    }

    public final java.util.Set<String> LJJIII() {
        return (HashSet) this.LLIIII.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC49878Jhq
    public final String V6() {
        return this.LJLLLL.LJLILLLLZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC49845JhJ, X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t == 0 || ((SearchMixFeedList) t).hasMore) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49878Jhq
    public final List<SearchMixFeed> Cn0() {
        return getItems();
    }

    @Override // X.InterfaceC49897Ji9
    public final boolean LIZ() {
        return isHasMore();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    @Override // X.InterfaceC224118qt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> getAwemeList() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49875Jhn.getAwemeList():java.util.List");
    }

    @Override // X.AbstractC51036K1g
    public final void onModelBound() {
        Integer num;
        super.onModelBound();
        this.LLIIIZ = true;
        if (this.LLIIIL) {
            this.LLIIIL = false;
            gu0();
        }
        List<SearchMixFeed> items = getItems();
        String str = this.LJLLLL.LJLILLLLZI;
        C49825Jgz c49825Jgz = this.LLFZ;
        if (c49825Jgz != null) {
            num = Integer.valueOf(c49825Jgz.LJZ);
        } else {
            num = null;
        }
        C49603JdP.LIZJ(num, str, items);
    }

    @Override // X.AbstractC49845JhJ, X.AbstractC49793JgT
    public final int LJIILL() {
        return this.LLIIZ;
    }

    @Override // X.AbstractC49845JhJ, X.AbstractC49793JgT
    /* renamed from: LJIILLIIL */
    public final /* bridge */ /* synthetic */ void handleData(SearchMixFeedList searchMixFeedList) {
        handleData(searchMixFeedList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0146, code lost:
    
        if (r6 == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC49845JhJ
    /* renamed from: LJJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r18) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49875Jhn.handleData(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIJZLJL(g gVar) {
        int i;
        String str;
        String str2;
        String LIZ;
        String LIZLLL;
        Integer num;
        C49876Jho c49876Jho;
        String jVar;
        C49876Jho c49876Jho2;
        java.util.Set set;
        if (C49879Jhr.LIZ() && (c49876Jho2 = this.LLIIIILZ) != null && (set = (java.util.Set) c49876Jho2.LJLLILLLL.getValue()) != null && (!set.isEmpty())) {
            JSONArray jSONArray = new JSONArray((Collection) set);
            C50091JlH c50091JlH = this.LLFII;
            c50091JlH.getClass();
            ((JSONObject) c50091JlH.LJI.getValue()).put("inherit_ids", jSONArray);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C73495Sst c73495Sst = this.LLIILII;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        String str3 = this.LLF;
        String str4 = this.LLFF;
        String str5 = this.LLIIIJ;
        SearchMixFeedList searchMixFeedList = (SearchMixFeedList) this.mData;
        if (searchMixFeedList != null) {
            i = searchMixFeedList.cursor;
        } else {
            i = 0;
        }
        int i2 = LLILL;
        String str6 = this.LJLLLL.LJLIL;
        C50091JlH c50091JlH2 = this.LLFII;
        int LJ = LJ(str5);
        JSONObject jSONObject = (JSONObject) c50091JlH2.LJI.getValue();
        jSONObject.put("global_consume_count", LJ);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "immutableParamsJSON.appl…el.TAG, \"context: $it\") }");
        SearchMixFeedList searchMixFeedList2 = (SearchMixFeedList) this.mData;
        if (searchMixFeedList2 != null) {
            str = searchMixFeedList2.mBacktrace;
        } else {
            str = null;
        }
        String str7 = "";
        if (gVar == null || (str2 = gVar.toString()) == null) {
            str2 = "";
        }
        String str8 = this.LLFFF;
        LIZ = FLE.LIZ("other");
        if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
            LIZLLL = "";
        } else {
            LIZLLL = EU3.LIZLLL();
        }
        int LJIILIIL = a.LJIIJ().LJIILIIL();
        String LIZJ = a.LJIIZILJ().LIZJ();
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        this.LLIILII = (C73495Sst) SearchApiNew.LIZIZ(new C50273JoD(str3, str4, str5, i, i2, str6, jSONObject2, str, str2, str8, LIZ, LIZLLL, LJIILIIL, LIZJ, num)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new C49881Jht(this, currentTimeMillis), new AfS60S0100000_8(this, 9));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("loadMoreList : ");
        if (gVar != null && (jVar = gVar.toString()) != null) {
            str7 = jVar;
        }
        LIZ2.append(str7);
        X1D.LIZIZ(LIZ2);
        if (C49879Jhr.LIZ() && (c49876Jho = this.LLIIIILZ) != null) {
            c49876Jho.LJLL = true;
        }
    }

    @Override // X.InterfaceC49878Jhq
    public final boolean ZB(C2KF<Aweme> c2kf) {
        InterfaceC51034K1e interfaceC51034K1e;
        List<C8BT> mNotifyListeners = this.mNotifyListeners;
        o.LJIIIIZZ(mNotifyListeners, "mNotifyListeners");
        for (C8BT c8bt : mNotifyListeners) {
            Boolean bool = null;
            if ((c8bt instanceof InterfaceC51034K1e) && (interfaceC51034K1e = (InterfaceC51034K1e) c8bt) != null) {
                bool = Boolean.valueOf(interfaceC51034K1e.onItemInsertedNew(c2kf));
            }
            if (o.LJ(bool, Boolean.FALSE)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC49878Jhq
    public final void gZ(List<? extends SearchMixFeed> list) {
        LJIIIZ(list);
    }

    @Override // X.AbstractC49845JhJ, X.AbstractC49793JgT, X.C8BS
    public final /* bridge */ /* synthetic */ void handleData(Object obj) {
        handleData((SearchMixFeedList) obj);
    }

    @Override // X.InterfaceC49878Jhq
    public final void kL(List<? extends SearchMixFeed> list) {
        LJIJJ(list);
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        if (C49895Ji7.LIZ() && C51625KNx.LIZ()) {
            C86918Y9i.LIZ().execute(new ARunnableS40S0100000_4(new AqS174S0100000_8(this, 103), 94));
        } else {
            LJJIIJZLJL(null);
        }
    }

    @Override // X.InterfaceC49878Jhq
    public final List<Aweme> lv(SearchMixFeed mixFeed) {
        List<Aweme> list;
        List<Aweme> list2;
        int i;
        o.LJIIIZ(mixFeed, "mixFeed");
        if (JWA.LIZJ(Integer.valueOf(mixFeed.getFeedType()), mixFeed.LJI())) {
            C49825Jgz c49825Jgz = this.LLFZ;
            if (c49825Jgz == null || (list = c49825Jgz.LJJIFFI()) == null) {
                list = C61878OQg.INSTANCE;
            }
        } else if (JWA.LIZLLL(Integer.valueOf(mixFeed.getFeedType()), mixFeed.LJI())) {
            C49825Jgz c49825Jgz2 = this.LLFZ;
            if (c49825Jgz2 == null || (list2 = c49825Jgz2.LJJIFFI()) == null) {
                list2 = C61878OQg.INSTANCE;
            }
            if (getItems().indexOf(mixFeed) == 0) {
                i = list2.size();
            } else {
                i = 3;
            }
            list = ORZ.LLILLL(list2, i);
        } else {
            list = C61878OQg.INSTANCE;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("multi-tab card inherit ");
        LIZ.append(list.size());
        LIZ.append(" awemes");
        X1D.LIZIZ(LIZ);
        return list;
    }

    @Override // X.AbstractC49845JhJ
    public final boolean LJIJJLI(int i, Aweme aweme) {
        String str;
        C49876Jho c49876Jho = this.LLIIIILZ;
        List<Aweme> awemeList = getAwemeList();
        if (awemeList == null) {
            awemeList = C61878OQg.INSTANCE;
        }
        if (C49879Jhr.LIZ() && c49876Jho != null) {
            return C49876Jho.LIZ(LLILL, aweme, awemeList);
        }
        Iterator<Aweme> it = awemeList.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                String aid = it.next().getAid();
                if (aid != null) {
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    if (aid.equals(str)) {
                        break;
                    }
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        StringBuilder LJ = C7MY.LJ("curIndex:", i2, ", totalSize:");
        DIL.LIZIZ(awemeList, LJ, ", preloadCnt:");
        int i3 = LLILL;
        LJ.append(i3);
        X1D.LIZIZ(LJ);
        if (i2 < awemeList.size() - i3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x039c  */
    @Override // X.AbstractC49845JhJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.ss.android.ugc.aweme.feed.model.Aweme r15, java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r16) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49875Jhn.LJIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.List):void");
    }

    public final int LJJIIJ(String str, List<? extends SearchMixFeed> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Aweme aweme;
        String aid;
        DynamicPatch LJI;
        List<Aweme> awemeList;
        String aid2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || list == null) {
            return -1;
        }
        int i = 0;
        for (SearchMixFeed searchMixFeed : list) {
            Aweme aweme2 = searchMixFeed.getAweme();
            if (aweme2 != null && (aid2 = aweme2.getAid()) != null && aid2.equals(str)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!C78949Uyf.LJJIIJ(searchMixFeed) && (LJI = searchMixFeed.LJI()) != null && (awemeList = LJI.getAwemeList()) != null && !awemeList.isEmpty()) {
                Iterator<Aweme> it = awemeList.iterator();
                while (it.hasNext()) {
                    String aid3 = it.next().getAid();
                    if (aid3 != null && aid3.equals(str)) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            boolean z6 = z2 | z3;
            List LIZJ = C44729Hgz.LIZJ(searchMixFeed, EnumC46469ILp.GENERAL_SEARCH);
            if (LIZJ != null && (aweme = (Aweme) ORZ.LJLLLL(LIZJ)) != null && (aid = aweme.getAid()) != null && aid.equals(str)) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            if (C78949Uyf.LJJIIJ(searchMixFeed)) {
                List<Aweme> lv = lv(searchMixFeed);
                if (!lv.isEmpty()) {
                    Iterator<Aweme> it2 = lv.iterator();
                    while (it2.hasNext()) {
                        String aid4 = it2.next().getAid();
                        if (aid4 != null && aid4.equals(str)) {
                            z5 = true;
                            break;
                        }
                    }
                }
            }
            z5 = false;
            if (z5 | z7) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC49845JhJ, X.InterfaceC50392Jq8
    public final void zX(int i, int i2, Aweme aweme) {
        String str;
        String str2;
        C49876Jho c49876Jho = this.LLIIIILZ;
        if (c49876Jho != null) {
            c49876Jho.zX(i, i2, aweme);
        }
        if (isHasMore() && !this.LLIIJI) {
            int i3 = 1;
            this.LLIIJI = true;
            C49887Jhz c49887Jhz = new C49887Jhz();
            c49887Jhz.LIZLLL("type", "dual_stream");
            c49887Jhz.LIZLLL("event", "dual_1st_time_double_color_ball_show");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("search_id", this.LLF);
                SearchMixFeedList searchMixFeedList = (SearchMixFeedList) this.mData;
                String str3 = null;
                if (searchMixFeedList == null || (str = C78949Uyf.LJIJI(searchMixFeedList)) == null) {
                    str = "";
                }
                jSONObject.put("inner_search_id", str);
                SearchMixFeedList searchMixFeedList2 = (SearchMixFeedList) this.mData;
                if (searchMixFeedList2 != null) {
                    str2 = searchMixFeedList2.mBacktrace;
                } else {
                    str2 = null;
                }
                jSONObject.put("backTrace", str2);
                SearchMixFeedList searchMixFeedList3 = (SearchMixFeedList) this.mData;
                if (searchMixFeedList3 != null) {
                    str3 = C78963Uyt.LJIILJJIL(searchMixFeedList3);
                }
                jSONObject.put("log_id", str3);
                if (!this.LLIIJLIL) {
                    i3 = 0;
                }
                C3C5.m7constructorimpl(jSONObject.put("has_prefetched", i3));
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
            c49887Jhz.LIZLLL("params", jSONObject2);
            c49887Jhz.LJIILIIL();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C49875Jhn(X.C49841JhF r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, X.C50091JlH r11, java.util.List r12, X.C49825Jgz r13, X.InterfaceC49778JgE r14, java.util.List r15, X.C49825Jgz r16, X.C49825Jgz r17, X.C49847JhL r18) {
        /*
            r6 = this;
            java.lang.String r0 = "streamRoot"
            r2 = r18
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            if (r13 == 0) goto Lbf
            java.util.List r0 = r13.getItems()
            if (r0 == 0) goto Lbf
        Lf:
            X.Pog r1 = X.AbstractC65590Pog.copyOf(r0)
            java.lang.String r0 = "copyOf(searchTopMixModel?.items ?: emptyList())"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r6.<init>(r7, r1, r2)
            r6.LLF = r8
            r6.LLFF = r9
            r6.LLFFF = r10
            r6.LLFII = r11
            r6.LLFZ = r13
            r6.LLI = r14
            r6.LLIFFJFJJ = r15
            r0 = r17
            r6.LLII = r0
            X.JgJ r0 = new X.JgJ
            r1 = r16
            r0.<init>(r7, r14, r15, r1)
            r6.LLIIII = r0
            java.lang.String r0 = ""
            r6.LLIIIJ = r0
            r6.LJIJJ(r12)
            boolean r0 = X.C49879Jhr.LIZ()
            if (r0 == 0) goto L4c
            if (r13 == 0) goto L4c
            X.Jho r0 = new X.Jho
            r0.<init>(r8, r6, r13)
            r6.LLIIIILZ = r0
        L4c:
            X.Ol8 r0 = X.C34090DZm.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 1
            if (r0 != r5) goto La1
            boolean r0 = X.C46442IKo.LIZ()
            if (r0 == 0) goto La1
            java.util.List r4 = r6.getAwemeList()
            if (r4 != 0) goto L69
            X.OQg r4 = X.C61878OQg.INSTANCE
        L69:
            java.util.Iterator r3 = r4.iterator()
            r2 = 0
        L6e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r1 = r0.getAid()
            if (r1 == 0) goto Lbc
            X.JhF r0 = r6.LJLLLL
            java.lang.String r0 = r0.LJLILLLLZI
            boolean r0 = r1.equals(r0)
            if (r0 != r5) goto Lbc
            if (r2 < 0) goto La1
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            int r0 = r4.size()
            boolean r0 = r6.LJIJJLI(r0, r1)
            if (r0 == 0) goto La1
            r6.LLIIJLIL = r5
            r6.o1()
        La1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.LLIIL = r0
            r0 = 3
            r6.LLIIZ = r0
            X.IFi r0 = X.C46306IFi.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r6.LLIL = r0
            X.JiC r0 = X.C49900JiC.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r6.LLILII = r0
            return
        Lbc:
            int r2 = r2 + 1
            goto L6e
        Lbf:
            X.OQg r0 = X.C61878OQg.INSTANCE
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49875Jhn.<init>(X.JhF, java.lang.String, java.lang.String, java.lang.String, X.JlH, java.util.List, X.Jgz, X.JgE, java.util.List, X.Jgz, X.Jgz, X.JhL):void");
    }
}
