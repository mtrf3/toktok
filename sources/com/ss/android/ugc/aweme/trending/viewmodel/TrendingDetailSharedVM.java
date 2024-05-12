package com.ss.android.ugc.aweme.trending.viewmodel;

import X.A2G;
import X.C208708Ha;
import X.C32I;
import X.C33Q;
import X.C33X;
import X.C47261Igj;
import X.C56386MBa;
import X.C56424MCm;
import X.C61878OQg;
import X.C65777Prh;
import X.C78966Uyw;
import X.C8HZ;
import X.E06;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.M89;
import X.ORZ;
import X.X1D;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.search.TrendingItems;
import defpackage.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS14S1101000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class TrendingDetailSharedVM extends BaseDetailShareVM<C56386MBa, E06, Long> {
    public static final /* synthetic */ int LJZL = 0;
    public long LJLIL;
    public String LJLILLLLZI;
    public List<Aweme> LJLJJI;
    public Map<String, List<String>> LJLJJL;
    public List<TrendingEventModel> LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public int LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public TrendingEventModel LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public List<String> LJLLLLLL;
    public List<TrendingEventModel> LJLZ;
    public final Map<String, String> LJLJI = new LinkedHashMap();
    public final Set<TrendingEventModel> LJZ = new LinkedHashSet();
    public boolean LJZI = true;

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 30;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C56386MBa(0);
    }

    public final String gv0() {
        String str = this.LJLL;
        if (str != null) {
            return str;
        }
        o.LJIJI("entrance");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        List<Aweme> awemeList = super.getAwemeList();
        if (!awemeList.isEmpty()) {
            return awemeList;
        }
        List<Aweme> list = this.LJLJJI;
        if (list == null) {
            return awemeList;
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final boolean hasMore() {
        boolean hasMore = super.hasMore();
        C56386MBa c56386MBa = (C56386MBa) getVmDispatcher().getState();
        c56386MBa.getClass();
        if ((C208708Ha.LIZJ(c56386MBa) instanceof C33X) && (C208708Ha.LIZLLL(c56386MBa) instanceof C33X)) {
            return true;
        }
        return hasMore;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        List<ITEM> listGetAll = listGetAll();
        int i = -1;
        if (listGetAll != 0) {
            Iterator it = listGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(((E06) it.next()).LJLIL.getAid(), aid)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(E06 e06) {
        E06 item = e06;
        o.LJIIIZ(item, "item");
        return item.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        this.LJLJJI = C78966Uyw.LJLJJL;
        C78966Uyw.LJLJJL = null;
        return super.init(owner);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<E06> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 328));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return lv0(this, 0L, interfaceC67352kd);
    }

    public final String hv0(long j, String str) {
        Iterable iterable;
        String str2 = null;
        if (((int) j) == 0) {
            return null;
        }
        if (o.LJ(str, this.LJLLLL)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('[');
            List<String> list = this.LJLLLLLL;
            if (list != null) {
                str2 = ORZ.LLD(list, ",", null, null, null, 62);
            }
            return q.LIZIZ(LIZ, str2, ']', LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('[');
        Map<String, List<String>> map = this.LJLJJL;
        if (map != null && (iterable = (Iterable) ((LinkedHashMap) map).get(str)) != null) {
            str2 = ORZ.LLD(iterable, ",", null, null, null, 62);
        }
        return q.LIZIZ(LIZ2, str2, ']', LIZ2);
    }

    public final void iv0(TrendingItems trendingItems, String str) {
        TrendingEventModel trendingEventModel;
        String eventId;
        TrendingEventModel trendingEventModel2;
        String eventId2;
        List<TrendingEventModel> list;
        TrendingEventModel trendingEventModel3;
        List<TrendingEventModel> list2 = this.LJLJJLL;
        if (list2 == null || list2.isEmpty()) {
            Object obj = trendingItems.billboardInfo;
            if (obj == null) {
                obj = new ArrayList();
            }
            this.LJLJJLL = C65777Prh.LIZIZ(obj);
        }
        List<TrendingEventModel> list3 = null;
        if (C56424MCm.LIZ() && ((list = this.LJLZ) == null || list.isEmpty())) {
            List<TrendingEventModel> list4 = this.LJLJJLL;
            if (list4 != null) {
                Iterator<TrendingEventModel> it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        trendingEventModel3 = it.next();
                        if (o.LJ(trendingEventModel3.getEventId(), this.LJLLJ)) {
                            break;
                        }
                    } else {
                        trendingEventModel3 = null;
                        break;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (TrendingEventModel trendingEventModel4 : list4) {
                    if (!o.LJ(trendingEventModel4.getEventId(), this.LJLLJ)) {
                        arrayList.add(trendingEventModel4);
                    }
                }
                list3 = C65777Prh.LIZIZ(C47261Igj.LJJJIL(arrayList));
                if (trendingEventModel3 != null) {
                    ListProtector.add(list3, 0, trendingEventModel3);
                }
            }
            this.LJLZ = list3;
        }
        if (str.length() == 0 || o.LJ(str, "-1")) {
            if (!C56424MCm.LIZ()) {
                List<TrendingEventModel> list5 = this.LJLJJLL;
                if (list5 != null && (trendingEventModel2 = (TrendingEventModel) ORZ.LJLLJ(list5)) != null && (eventId2 = trendingEventModel2.getEventId()) != null) {
                    str = eventId2;
                }
                this.LJLLJ = str;
            } else {
                List<TrendingEventModel> list6 = this.LJLZ;
                if (list6 != null && (trendingEventModel = (TrendingEventModel) ORZ.LJLLJ(list6)) != null && (eventId = trendingEventModel.getEventId()) != null) {
                    str = eventId;
                }
                this.LJLLJ = str;
            }
        }
        if (!C56424MCm.LIZ()) {
            TrendingEventModel trendingEventModel5 = this.LJLLILLLL;
            if (trendingEventModel5 != null) {
                List<TrendingEventModel> list7 = this.LJLJJLL;
                if (list7 != null) {
                    Iterator<TrendingEventModel> it2 = list7.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        TrendingEventModel next = it2.next();
                        if (o.LJ(next.getEventId(), trendingEventModel5.getEventId())) {
                            if (next != null) {
                                return;
                            }
                        }
                    }
                }
                List<TrendingEventModel> list8 = this.LJLJJLL;
                o.LJII(list8, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.search.TrendingEventModel>");
                ((ArrayList) list8).add(trendingEventModel5);
                return;
            }
            return;
        }
        TrendingEventModel trendingEventModel6 = this.LJLLILLLL;
        if (trendingEventModel6 == null) {
            return;
        }
        List<TrendingEventModel> list9 = this.LJLZ;
        if (list9 != null) {
            Iterator<TrendingEventModel> it3 = list9.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                TrendingEventModel next2 = it3.next();
                if (o.LJ(next2.getEventId(), trendingEventModel6.getEventId())) {
                    if (next2 != null) {
                        return;
                    }
                }
            }
        }
        List<TrendingEventModel> list10 = this.LJLZ;
        o.LJII(list10, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.search.TrendingEventModel>");
        ((ArrayList) list10).add(trendingEventModel6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0201, code lost:
    
        if (r7 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x025f, code lost:
    
        if (r7 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016c, code lost:
    
        if (r10 == null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c4  */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v88, types: [T] */
    /* JADX WARN: Type inference failed for: r23v0, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.A2G<java.lang.Long> jv0(com.ss.android.ugc.aweme.search.TrendingItems r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM.jv0(com.ss.android.ugc.aweme.search.TrendingItems, java.lang.String):X.A2G");
    }

    public final void kv0(int i, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        withState(new AqS14S1101000_9(str, this, i, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public final void mv0(TrendingItems trendingItems, String str) {
        ?? r3;
        List LIZIZ;
        if (!o.LJ(gv0(), "general_search")) {
            Map map = this.LJLJJL;
            if (map != null) {
                List<String> list = trendingItems.itemList;
                if (list == null) {
                    list = C61878OQg.INSTANCE;
                }
                this.LJLLLLLL = list;
                if (o.LJ(str, this.LJLLLL)) {
                    List<String> list2 = trendingItems.itemList;
                    if (list2 != null) {
                        r3 = new ArrayList();
                        for (String str2 : list2) {
                            if (!o.LJ(str2, this.LJLLL)) {
                                r3.add(str2);
                            }
                        }
                    } else {
                        r3 = 0;
                    }
                    String str3 = this.LJLLL;
                    if (str3 != null && (LIZIZ = C65777Prh.LIZIZ(r3)) != null) {
                        ListProtector.add(LIZIZ, 0, str3);
                    }
                    if (r3 == 0) {
                        r3 = C61878OQg.INSTANCE;
                    }
                    map.put(str, r3);
                    return;
                }
                Collection collection = trendingItems.itemList;
                if (collection == null) {
                    collection = C61878OQg.INSTANCE;
                }
                map.put(str, collection);
                return;
            }
            return;
        }
        List<? extends Aweme> list3 = trendingItems.awemeList;
        if (list3 != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list3, 10));
            Iterator<? extends Aweme> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAid());
            }
            Map<String, List<String>> map2 = this.LJLJJL;
            if (map2 != null) {
                map2.put(str, arrayList);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return lv0(this, ((Number) obj).longValue(), interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7 A[Catch: Exception -> 0x012e, TRY_LEAVE, TryCatch #0 {Exception -> 0x012e, blocks: (B:49:0x00db, B:24:0x00dd, B:26:0x00e7, B:31:0x00fd, B:32:0x010c, B:36:0x0116, B:37:0x0125, B:23:0x0097, B:10:0x004f, B:13:0x005b, B:16:0x006c, B:18:0x007a, B:39:0x009b, B:40:0x009e, B:41:0x009f, B:43:0x00ad, B:46:0x00bc, B:51:0x012a, B:52:0x012d), top: B:9:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object lv0(com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM r22, long r23, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r25) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM.lv0(com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM, long, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return Long.valueOf(this.LJLIL);
    }
}
