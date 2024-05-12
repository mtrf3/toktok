package X;

import android.os.Build;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.discover.model.suggest.TopHistoryWord;
import com.ss.android.ugc.aweme.search.common.model.RecentDelHistory;
import com.ss.android.ugc.aweme.search.common.model.TopHistory;
import com.ss.android.ugc.aweme.search.common.model.TopHistoryInfo;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS31S1000000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JwH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50773JwH {
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C50797Jwf.LJLIL);
    public java.util.Map<String, TopHistoryInfo> LIZ = new LinkedHashMap();
    public String LIZIZ;
    public final IAccountService LIZJ;
    public final Gson LIZLLL;
    public String LJ;

    public final void LIZ() {
        String str;
        LJFF("clearTopSearchHistory");
        TopHistoryInfo LIZJ = LIZJ();
        List<RecentDelHistory> list = LIZJ.recentDelTopHistoryList;
        List<TopHistory> list2 = LIZJ.topHistoryList;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        for (TopHistory topHistory : list2) {
            if (topHistory != null) {
                str = topHistory.word;
            } else {
                str = null;
            }
            arrayList.add(new RecentDelHistory(str, Long.valueOf(System.currentTimeMillis())));
        }
        list.addAll(arrayList);
        LIZJ.topHistoryList.clear();
        LJIIIIZZ();
    }

    public final String LIZIZ() {
        RBY LJFF2;
        String curUserId;
        IAccountService iAccountService = this.LIZJ;
        if (iAccountService == null || (LJFF2 = iAccountService.LJFF()) == null || !LJFF2.isLogin() || (curUserId = LJFF2.getCurUserId()) == null) {
            return "FAKE_USER";
        }
        return curUserId;
    }

    public final TopHistoryInfo LIZJ() {
        TopHistoryInfo topHistoryInfo = this.LIZ.get(LIZIZ());
        if (topHistoryInfo == null) {
            TopHistoryInfo topHistoryInfo2 = new TopHistoryInfo(null, null, 3, null);
            this.LIZ.put(LIZIZ(), topHistoryInfo2);
            return topHistoryInfo2;
        }
        return topHistoryInfo;
    }

    public final void LJ() {
        java.util.Map linkedHashMap = new LinkedHashMap();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getTopSearchHistoryInSp, currentUserId = ");
            LIZ.append(LIZIZ());
            LIZ.append(", saveKey = ");
            LIZ.append("recent_history_top");
            LJFF(X1D.LIZIZ(LIZ));
            String LIZIZ = C1A7.LJIIZILJ().LIZIZ("recent_history_top", "");
            if (LIZIZ != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getTopSearchHistoryInSp, history json = ");
                LIZ2.append(LIZIZ);
                LJFF(X1D.LIZIZ(LIZ2));
                java.util.Map map = (java.util.Map) this.LIZLLL.LJII(LIZIZ, new C50778JwM().getType());
                if (map == null) {
                    map = new LinkedHashMap();
                }
                linkedHashMap = map;
            }
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getTopSearchHistoryInSp, *** exception = ");
            LIZ3.append(e.getMessage());
            LJFF(X1D.LIZIZ(LIZ3));
        }
        LJFF("getTopSearchHistoryInSp, allLocalTopHistory get from file = " + linkedHashMap);
        this.LIZ = linkedHashMap;
    }

    public final void LJIIIIZZ() {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateTopSearchHistoryInSp, currentUserId = ");
            LIZ.append(LIZIZ());
            LIZ.append(", saveKey = ");
            LIZ.append("recent_history_top");
            LIZ.append(", allLocalTopHistory = ");
            LIZ.append(this.LIZ);
            LJFF(X1D.LIZIZ(LIZ));
            String topHistoryJson = this.LIZLLL.LJIILLIIL(this.LIZ, new C50775JwJ().getType());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateTopSearchHistoryInSp store ");
            LIZ2.append(topHistoryJson);
            LJFF(X1D.LIZIZ(LIZ2));
            o.LJIIIIZZ(topHistoryJson, "topHistoryJson");
            C1A7.LJIIZILJ().LJFF("recent_history_top", topHistoryJson);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("updateTopSearchHistoryInSp, history saved to file = ");
            LIZ3.append(topHistoryJson);
            LJFF(X1D.LIZIZ(LIZ3));
        } catch (Exception e) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("updateTopSearchHistoryInSp, *** exception = ");
            LIZ4.append(e.getMessage());
            LJFF(X1D.LIZIZ(LIZ4));
        }
    }

    public final void LJIIJ() {
        String str;
        LJFF("tryUpdateTopAppearTime");
        boolean z = false;
        for (TopHistory topHistory : LIZJ().topHistoryList) {
            String str2 = null;
            if (topHistory != null) {
                String str3 = topHistory.appearTime;
                if (str3 == null || !Boolean.valueOf(C78685UuP.LJJJZ(str3)).booleanValue()) {
                    str3 = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
                    z = true;
                }
                o.LJIIIZ(str3, "<set-?>");
                topHistory.appearTime = str3;
            }
            StringBuilder sb = new StringBuilder("tryUpdateTopAppearTime, success, word = ");
            if (topHistory != null) {
                str = topHistory.word;
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", time = ");
            if (topHistory != null) {
                str2 = topHistory.appearTime;
            }
            sb.append(str2);
            LJFF(sb.toString());
        }
        if (z) {
            LJIIIIZZ();
        }
    }

    public C50773JwH() {
        Keva LIZ;
        LIZ = C50234Jna.LIZ("search_common");
        this.LIZIZ = LIZ.getString("last_top_history_log_id", null);
        this.LIZLLL = new Gson();
        this.LIZJ = AccountService.LJIJ();
        LJ();
    }

    public final String LIZLLL() {
        String str;
        TopHistory topHistory = (TopHistory) ORZ.LJLLLL(LIZJ().topHistoryList);
        if (topHistory == null || (str = topHistory.logId) == null) {
            return this.LIZIZ;
        }
        return str;
    }

    public static void LJFF(String str) {
        C36922EeM.LIZLLL(4, "TopSearchHistoryManager", str);
    }

    public final List LJI(List list) {
        LJFF("mergeHistoryWithTop");
        List LJLL = ORZ.LJLL(LIZJ().topHistoryList);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJLL).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            TopHistory topHistory = (TopHistory) next;
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (o.LJ(topHistory.word, ((SearchHistory) it2.next()).keyword)) {
                        arrayList.add(next);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            TopHistory topHistory2 = (TopHistory) it3.next();
            arrayList2.add(new TopHistoryWord(topHistory2.word, 1, topHistory2.iconType, topHistory2.groupId, topHistory2.logId));
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
        int size = list.size();
        ArrayList arrayList3 = (ArrayList) LLJILJILJ;
        int size2 = 20 - arrayList3.size();
        if (size2 < 0) {
            size2 = 0;
        }
        int min = Math.min(size, size2);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list) {
            SearchHistory searchHistory = (SearchHistory) obj;
            Iterator it4 = arrayList3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (o.LJ(searchHistory.keyword, ((TopHistoryWord) it4.next()).word)) {
                        break;
                    }
                } else {
                    arrayList4.add(obj);
                    break;
                }
            }
        }
        List LLILLL = ORZ.LLILLL(arrayList4, min);
        ArrayList arrayList5 = new ArrayList(C32I.LJJL(LLILLL, 10));
        Iterator it5 = LLILLL.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new TopHistoryWord(((SearchHistory) it5.next()).keyword, null, null, null, null, 30, null));
        }
        arrayList3.addAll(arrayList5);
        LJIIJ();
        return LLJILJILJ;
    }

    public final void LJIIIZ(String str) {
        if (str != null) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("tryDeleteTopSearchHistory, word = ", str, ", size = ");
            LIZIZ.append(LIZJ().topHistoryList.size());
            LJFF(X1D.LIZIZ(LIZIZ));
            Boolean valueOf = Boolean.valueOf(LJII(new AqS31S1000000_8(str, 5), LIZJ().topHistoryList));
            Integer num = null;
            if (valueOf.booleanValue()) {
                valueOf.booleanValue();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("tryDeleteTopSearchHistory, delete success, word = ");
                LIZ.append(str);
                LIZ.append(", size = ");
                List<TopHistory> list = LIZJ().topHistoryList;
                if (list != null) {
                    num = Integer.valueOf(list.size());
                }
                LIZ.append(num);
                LJFF(X1D.LIZIZ(LIZ));
                LJIIL(str);
            }
        }
    }

    public final void LJIIJJI(String str) {
        Object obj;
        LJFF("tryUpdateTopClickTime");
        Iterator<TopHistory> it = LIZJ().topHistoryList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            TopHistory next = it.next();
            TopHistory topHistory = next;
            if (topHistory != null) {
                obj = topHistory.word;
            }
            if (o.LJ(obj, str)) {
                obj = next;
                break;
            }
        }
        TopHistory topHistory2 = (TopHistory) obj;
        if (topHistory2 != null) {
            String valueOf = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
            o.LJIIIZ(valueOf, "<set-?>");
            topHistory2.recentClickTime = valueOf;
            StringBuilder LIZIZ = C25620zW.LIZIZ("updateTopSearchHistoryClickTime, success, word = ", str, ", time = ");
            LIZIZ.append(topHistory2.recentClickTime);
            LJFF(X1D.LIZIZ(LIZIZ));
            LJIIIIZZ();
        }
    }

    public final boolean LJIIL(String str) {
        List<RecentDelHistory> list = LIZJ().recentDelTopHistoryList;
        Integer num = null;
        if (C78857UxB.LJJJIL(str) && list != null) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("updateRecentDelHistory, start update, word = ", str, ", size = ");
            List<RecentDelHistory> list2 = LIZJ().recentDelTopHistoryList;
            if (list2 != null) {
                num = Integer.valueOf(list2.size());
            }
            LIZIZ.append(num);
            LJFF(X1D.LIZIZ(LIZIZ));
            list.add(new RecentDelHistory(str, Long.valueOf(System.currentTimeMillis())));
            boolean LJII = LJII(C775032k.LJLIL, list);
            LJIIIIZZ();
            return LJII;
        }
        return false;
    }

    public static boolean LJII(InterfaceC88472Yns interfaceC88472Yns, List list) {
        if (Build.VERSION.SDK_INT >= 24) {
            return list.removeIf(new C50781JwP(interfaceC88472Yns));
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC88472Yns.invoke(it.next())).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.String r19, java.util.List r20) {
        /*
            r18 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "updateTopSearchHistoryList, wordsize = "
            r1.append(r0)
            r2 = r20
            if (r2 == 0) goto L8c
            int r0 = r2.size()
        L11:
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            LJFF(r0)
            r8 = 0
            r3 = r19
            r4 = r18
            if (r2 == 0) goto La7
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r2, r0)
            r5.<init>(r0)
            java.util.Iterator r7 = r2.iterator()
        L31:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r6 = r7.next()
            com.ss.android.ugc.aweme.discover.model.suggest.TopHistoryWord r6 = (com.ss.android.ugc.aweme.discover.model.suggest.TopHistoryWord) r6
            com.ss.android.ugc.aweme.search.common.model.TopHistoryInfo r0 = r4.LIZJ()
            java.util.List<com.ss.android.ugc.aweme.search.common.model.TopHistory> r0 = r0.topHistoryList
            java.util.Iterator r2 = r0.iterator()
        L47:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r9 = r2.next()
            r0 = r9
            com.ss.android.ugc.aweme.search.common.model.TopHistory r0 = (com.ss.android.ugc.aweme.search.common.model.TopHistory) r0
            if (r0 == 0) goto L88
            java.lang.String r1 = r0.word
        L58:
            java.lang.String r0 = r6.word
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L47
        L60:
            com.ss.android.ugc.aweme.search.common.model.TopHistory r9 = (com.ss.android.ugc.aweme.search.common.model.TopHistory) r9
            if (r9 == 0) goto L6a
            r9.logId = r3
        L66:
            r5.add(r9)
            goto L31
        L6a:
            com.ss.android.ugc.aweme.search.common.model.TopHistory r9 = new com.ss.android.ugc.aweme.search.common.model.TopHistory
            r10 = 0
            r16 = 63
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r17 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = r6.word
            r9.word = r0
            java.lang.String r0 = r6.iconType
            r9.iconType = r0
            java.lang.String r0 = r6.groupId
            r9.groupId = r0
            r9.logId = r3
            goto L66
        L88:
            r1 = r8
            goto L58
        L8a:
            r9 = r8
            goto L60
        L8c:
            r0 = 0
            goto L11
        L8e:
            java.util.List r1 = X.ORZ.LLJILJILJ(r5)
            com.ss.android.ugc.aweme.search.common.model.TopHistoryInfo r0 = r4.LIZJ()
            com.ss.android.ugc.aweme.search.common.model.TopHistoryInfo r2 = com.ss.android.ugc.aweme.search.common.model.TopHistoryInfo.L(r0, r1)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.search.common.model.TopHistoryInfo> r1 = r4.LIZ
            java.lang.String r0 = r4.LIZIZ()
            r1.put(r0, r2)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Lbd
        La7:
            com.ss.android.ugc.aweme.search.common.model.TopHistoryInfo r1 = r4.LIZJ()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.ss.android.ugc.aweme.search.common.model.TopHistoryInfo r2 = com.ss.android.ugc.aweme.search.common.model.TopHistoryInfo.L(r1, r0)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.search.common.model.TopHistoryInfo> r1 = r4.LIZ
            java.lang.String r0 = r4.LIZIZ()
            r1.put(r0, r2)
        Lbd:
            r4.LJIIIIZZ()
            r4.LIZIZ = r3
            com.bytedance.keva.Keva r1 = X.C50234Jna.LIZIZ()
            java.lang.String r0 = "last_top_history_log_id"
            r1.storeString(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50773JwH.LJIILIIL(java.lang.String, java.util.List):void");
    }
}
