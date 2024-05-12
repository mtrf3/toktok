package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel;

import X.A2F;
import X.A2G;
import X.ActivityC45651qj;
import X.C220858ld;
import X.C32I;
import X.C49133JQb;
import X.C49713JfB;
import X.C49825Jgz;
import X.C49906JiI;
import X.C50062Jko;
import X.C50320Joy;
import X.C50322Jp0;
import X.C50350JpS;
import X.C50385Jq1;
import X.C50389Jq5;
import X.C50399JqF;
import X.C50440Jqu;
import X.C55988LyC;
import X.C61328O5c;
import X.C61878OQg;
import X.C65777Prh;
import X.C78685UuP;
import X.C78939UyV;
import X.EnumC50384Jq0;
import X.InterfaceC224118qt;
import X.InterfaceC49897Ji9;
import X.InterfaceC50390Jq6;
import X.InterfaceC50391Jq7;
import X.InterfaceC50392Jq8;
import X.InterfaceC50393Jq9;
import X.InterfaceC50394JqA;
import X.InterfaceC51032K1c;
import X.InterfaceC51679KPz;
import X.InterfaceC55340Lnk;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.JSE;
import X.JTB;
import X.KMP;
import X.KNV;
import X.KQA;
import X.M89;
import X.ORZ;
import X.OSZ;
import X.X1D;
import X.XKQ;
import X.XKX;
import X.Z9N;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS55S0400000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSeparateTabHorizontalVM extends SearchTabHorizontalVM implements InterfaceC50393Jq9, InterfaceC50392Jq8, InterfaceC55340Lnk, InterfaceC50391Jq7 {
    public static final /* synthetic */ int LLF = 0;
    public int LJLLI;
    public int LJLLILLLL;
    public final List<Boolean> LJLLJ = new ArrayList();
    public int LJLLL = -1;
    public String LJLLLL = "";
    public final Map<Integer, List<DynamicPatch.SearchPoiIdMap>> LJLLLLLL = new LinkedHashMap();
    public InterfaceC50390Jq6 LJLZ;
    public boolean LJZ;
    public XKQ LJZI;
    public InterfaceC51679KPz LJZL;
    public boolean LL;
    public InterfaceC65784Pro<Boolean> LLD;

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final Object getViewModel() {
        Object viewModel;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        C49133JQb.LIZ("SearchSeparateVM", X1D.LIZIZ(LIZ));
        if (Dv0()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
            if (interfaceC51679KPz == null || (viewModel = interfaceC51679KPz.getViewModel()) == null) {
                super.getViewModel();
                return this;
            }
            return viewModel;
        }
        super.getViewModel();
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final boolean hasMore() {
        C49825Jgz LIZJ;
        InterfaceC49897Ji9 interfaceC49897Ji9;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        C49133JQb.LIZ("SearchSeparateVM", X1D.LIZIZ(LIZ));
        if (Dv0()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
            Object obj = null;
            if (interfaceC51679KPz != null) {
                obj = interfaceC51679KPz.getViewModel();
            }
            return (obj instanceof InterfaceC49897Ji9) && (interfaceC49897Ji9 = (InterfaceC49897Ji9) obj) != null && interfaceC49897Ji9.LIZ();
        }
        if (!this.LJZ) {
            return true;
        }
        InterfaceC50390Jq6 interfaceC50390Jq6 = this.LJLZ;
        return (interfaceC50390Jq6 == null || (LIZJ = interfaceC50390Jq6.LIZJ()) == null || !LIZJ.isHasMore()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        InterfaceC51679KPz interfaceC51679KPz;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        C49133JQb.LIZ("SearchSeparateVM", X1D.LIZIZ(LIZ));
        if (Dv0() && (interfaceC51679KPz = this.LJZL) != null && interfaceC51679KPz.isDataEmpty()) {
            return true;
        }
        InterfaceC50390Jq6 interfaceC50390Jq6 = this.LJLZ;
        if (interfaceC50390Jq6 != null) {
            return interfaceC50390Jq6.isDataEmpty();
        }
        return getAwemeList().isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean isLoading() {
        Boolean bool;
        Object[] objArr = new Object[3];
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        objArr[0] = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("proxy isLoading:");
        InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
        if (interfaceC51679KPz != null) {
            bool = Boolean.valueOf(interfaceC51679KPz.isLoading());
        } else {
            bool = null;
        }
        LIZ2.append(bool);
        objArr[1] = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("super.isLoading:");
        LIZ3.append(super.isLoading());
        objArr[2] = X1D.LIZIZ(LIZ3);
        C49133JQb.LIZ("SearchSeparateVM", objArr);
        if (Dv0()) {
            InterfaceC51679KPz interfaceC51679KPz2 = this.LJZL;
            if (interfaceC51679KPz2 == null || !interfaceC51679KPz2.isLoading()) {
                return false;
            }
            return true;
        }
        return super.isLoading();
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51771KTn
    public final boolean shouldSetRefreshListener() {
        return false;
    }

    public final boolean Dv0() {
        if (this.LJZL == null) {
            return false;
        }
        int i = this.LJLLI;
        if (i != -1 && !o.LJ(Bv0(Integer.valueOf(i)), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean cannotLoadMore() {
        InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
        if (interfaceC51679KPz != null) {
            return interfaceC51679KPz.cannotLoadMore();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        InterfaceC50390Jq6 interfaceC50390Jq6 = this.LJLZ;
        if (this.LJLLL == 40 && interfaceC50390Jq6 != null) {
            return ORZ.LLJILJILJ(interfaceC50390Jq6.LIZLLL());
        }
        List<Aweme> jv0 = jv0(this.LJLLI, false);
        if (jv0 != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : jv0) {
                if (aweme.getAid() != null) {
                    arrayList.add(aweme);
                }
            }
            return C65777Prh.LIZIZ(arrayList);
        }
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final void unInit() {
        C49825Jgz LIZJ;
        InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
        if (interfaceC51679KPz != null) {
            interfaceC51679KPz.unInit();
        }
        super.unInit();
        this.LJZL = null;
        InterfaceC50390Jq6 interfaceC50390Jq6 = this.LJLZ;
        if (interfaceC50390Jq6 != null && (LIZJ = interfaceC50390Jq6.LIZJ()) != null) {
            LIZJ.LJJIJ();
        }
        this.LJLZ = null;
        C49133JQb.LIZ("SearchSeparateVM", "unInit");
    }

    @Override // X.InterfaceC50392Jq8
    public final void Mt() {
        InterfaceC50392Jq8 interfaceC50392Jq8;
        if (Dv0()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
            if ((interfaceC51679KPz instanceof InterfaceC50392Jq8) && (interfaceC50392Jq8 = (InterfaceC50392Jq8) interfaceC51679KPz) != null) {
                interfaceC50392Jq8.Mt();
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        C49133JQb.LIZ("SearchSeparateVM", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC55340Lnk
    public final boolean dF() {
        return Dv0();
    }

    public static List iv0(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Aweme) obj).getAid() != null) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C50389Jq5((Aweme) it.next()));
            }
            return arrayList2;
        }
        return new ArrayList();
    }

    public final OSZ<Integer, List<Aweme>> Av0(Aweme aweme) {
        List<DynamicPatch.SearchHorizontalTab> rv0;
        o.LJIIIZ(aweme, "aweme");
        Integer searchTabRank = aweme.getSearchTabRank();
        if (searchTabRank != null && (rv0 = rv0()) != null) {
            int size = rv0.size();
            int intValue = searchTabRank.intValue();
            if (intValue >= 0 && intValue < size) {
                return new OSZ<>(searchTabRank, jv0(searchTabRank.intValue(), false));
            }
        }
        return new OSZ<>(Integer.valueOf(this.LJLLI), jv0(this.LJLLI, false));
    }

    public final Boolean Bv0(Integer num) {
        int i;
        DynamicPatch.SearchHorizontalTab searchHorizontalTab;
        JSE jse;
        List<DynamicPatch.SearchMultiTabListData> list;
        DynamicPatch.SearchMultiTabListData searchMultiTabListData;
        boolean z = false;
        if (this.LJLLL == 40) {
            if (num != null && num.intValue() >= 0 && (jse = this.LJLJI) != null && (list = jse.LJIIJ) != null && (searchMultiTabListData = (DynamicPatch.SearchMultiTabListData) ListProtector.get(list, num.intValue())) != null && !searchMultiTabListData.hasMore) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (num != null && num.intValue() >= 0) {
            int intValue = num.intValue();
            List<DynamicPatch.SearchHorizontalTab> rv0 = rv0();
            if (rv0 != null) {
                i = rv0.size();
            } else {
                i = 0;
            }
            if (intValue >= i) {
                return null;
            }
            List<Aweme> jv0 = jv0(num.intValue(), false);
            if (jv0 != null) {
                int size = jv0.size();
                List<DynamicPatch.SearchHorizontalTab> rv02 = rv0();
                if (rv02 != null && (searchHorizontalTab = (DynamicPatch.SearchHorizontalTab) ListProtector.get(rv02, num.intValue())) != null) {
                    long j = searchHorizontalTab.start;
                    if (j >= 0) {
                        long j2 = searchHorizontalTab.end;
                        if (j2 >= j) {
                            if (size >= ((int) ((j2 - j) + 1))) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                }
                return Boolean.FALSE;
            }
            return Boolean.FALSE;
        }
        return null;
    }

    public final void Cv0(C49713JfB c49713JfB) {
        int i;
        this.LJLZ = c49713JfB;
        if (this.LJLLL == 40 && c49713JfB.LIZIZ >= 0) {
            if (o.LJ(Bv0(Integer.valueOf(this.LJLLI)), Boolean.TRUE)) {
                i = -1;
            } else {
                i = this.LJLLI;
            }
            withState(new AqS55S0400000_9(this, (SearchSeparateTabHorizontalVM) null, Integer.valueOf(i), (Integer) iv0(c49713JfB.LIZLLL), (List<C50389Jq5>) 2));
        }
    }

    @Override // X.InterfaceC50391Jq7
    public final void bindPreLoadView(InterfaceC51032K1c interfaceC51032K1c) {
        InterfaceC50391Jq7 interfaceC50391Jq7;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        X1D.LIZIZ(LIZ);
        InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
        if ((interfaceC51679KPz instanceof InterfaceC50391Jq7) && (interfaceC50391Jq7 = (InterfaceC50391Jq7) interfaceC51679KPz) != null) {
            interfaceC50391Jq7.bindPreLoadView(interfaceC51032K1c);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        if (Dv0()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
            if (interfaceC51679KPz != null) {
                interfaceC51679KPz.bindView(detailFragmentPanel);
            }
        } else {
            C49133JQb.LIZ("SearchSeparateVM", "horizontal load more not completed, pending bindView of proxy operator");
            this.LL = true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("pendingBindView:");
        LIZ2.append(this.LL);
        C49133JQb.LIZ("SearchSeparateVM", X1D.LIZIZ(LIZ), X1D.LIZIZ(LIZ2));
        super.bindView(detailFragmentPanel);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean deleteItem(String aid) {
        int i;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        List<Aweme> arrayList;
        int indexOf;
        C49825Jgz LIZJ;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro2;
        List<Aweme> jv0;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro3;
        o.LJIIIZ(aid, "aid");
        if (Dv0() && (interfaceC65784Pro3 = this.LLD) != null && interfaceC65784Pro3.invoke().booleanValue()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
            if (interfaceC51679KPz != null) {
                interfaceC51679KPz.deleteItem(aid);
            }
            return true;
        }
        if (!Dv0() && (interfaceC65784Pro2 = this.LLD) != null && interfaceC65784Pro2.invoke().booleanValue() && (jv0 = jv0(this.LJLLI, false)) != null) {
            Iterator<Aweme> it = jv0.iterator();
            i = 0;
            while (it.hasNext()) {
                if (o.LJ(it.next().getAid(), aid)) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        if (!Dv0() && (interfaceC65784Pro = this.LLD) != null && !interfaceC65784Pro.invoke().booleanValue()) {
            ArrayList arrayList2 = new ArrayList();
            if (this.LJLLL != 40) {
                List<Aweme> jv02 = jv0(this.LJLLI, false);
                if (jv02 == null) {
                    jv02 = C61878OQg.INSTANCE;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Aweme aweme : jv02) {
                    if (C78685UuP.LJJJZ(aweme.getAid())) {
                        arrayList3.add(aweme);
                    }
                }
                arrayList2.addAll(arrayList3);
            }
            InterfaceC50390Jq6 interfaceC50390Jq6 = this.LJLZ;
            if (interfaceC50390Jq6 == null || (LIZJ = interfaceC50390Jq6.LIZJ()) == null || (arrayList = LIZJ.getAwemeList()) == null) {
                arrayList = new ArrayList<>();
            }
            if (!C49906JiI.LJJJ() || C50440Jqu.LIZLLL) {
                arrayList2.addAll(arrayList);
            } else {
                ArrayList LJ = C61328O5c.LJ(arrayList);
                for (Aweme aweme2 : arrayList) {
                    if (aweme2.getSubAweme() != null && !aweme2.getIsSubAweme() && (indexOf = LJ.indexOf(aweme2)) >= 0 && indexOf < LJ.size()) {
                        int i2 = indexOf + 1;
                        Aweme subAweme = aweme2.getSubAweme();
                        o.LJIIIIZZ(subAweme, "aweme.subAweme");
                        ListProtector.add(LJ, i2, subAweme);
                    }
                }
                arrayList2.addAll(LJ);
            }
            Iterator it2 = arrayList2.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (!o.LJ(((Aweme) it2.next()).getAid(), aid)) {
                    i++;
                }
            }
            return false;
        }
        if (i >= 0) {
            KQA kqa = this.operatorView;
            if (kqa == null) {
                return true;
            }
            kqa.onItemDeleted(i);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final List<C50389Jq5> getItemList(C55988LyC c55988LyC) {
        Context context;
        Aweme aweme;
        Fragment fragment;
        C55988LyC state = c55988LyC;
        o.LJIIIZ(state, "state");
        List<C50389Jq5> list = state.getListState().LJLJJI;
        KQA kqa = this.operatorView;
        String str = null;
        if (kqa != null && (fragment = kqa.getFragment()) != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        if (Z9N.LIZIZ.LLJL(context) && C50399JqF.LIZ(((C50322Jp0) KNV.LIZ()).LJLLLLLL.size()) && C50440Jqu.LIZ() && !C50440Jqu.LIZLLL) {
            if (list != null) {
                ArrayList LJ = C61328O5c.LJ(list);
                Iterator it = LJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C50389Jq5 c50389Jq5 = (C50389Jq5) it.next();
                    Aweme aweme2 = c50389Jq5.LJLIL;
                    if (aweme2.getSubAweme() != null && !aweme2.getIsSubAweme() && aweme2.isWithSearchSurvey() && !C220858ld.LJIIIIZZ(aweme2) && C50350JpS.LIZ() && !aweme2.isAd()) {
                        C50389Jq5 c50389Jq52 = (C50389Jq5) ORZ.LJLLLLLL(list.indexOf(c50389Jq5) + 1, list);
                        if (c50389Jq52 != null && (aweme = c50389Jq52.LJLIL) != null) {
                            str = aweme.getAid();
                        }
                        if (o.LJ(str, aweme2.getSubAweme().getAid())) {
                            return list;
                        }
                        Iterator<C50389Jq5> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C50389Jq5 next = it2.next();
                            if (o.LJ(next.LJLIL.getAid(), aweme2.getSubAweme().getAid())) {
                                if (next != null) {
                                    return list;
                                }
                            }
                        }
                        int indexOf = list.indexOf(c50389Jq5);
                        Aweme subAweme = aweme2.getSubAweme();
                        if (indexOf >= 0 && indexOf < list.size() && subAweme != null) {
                            ListProtector.add(LJ, indexOf + 1, new C50389Jq5(subAweme));
                        }
                    }
                }
                return LJ;
            }
        } else if (list != null) {
            return list;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        C49133JQb.LIZ("SearchSeparateVM", "refresh");
        return lv0(this.LJLLI, EnumC50384Jq0.REFRESH_RESULT, interfaceC67352kd);
    }

    @Override // X.InterfaceC50391Jq7
    public final void setPreLoad(boolean z) {
        InterfaceC50391Jq7 interfaceC50391Jq7;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        X1D.LIZIZ(LIZ);
        InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
        if ((interfaceC51679KPz instanceof InterfaceC50391Jq7) && (interfaceC50391Jq7 = (InterfaceC50391Jq7) interfaceC51679KPz) != null) {
            interfaceC50391Jq7.setPreLoad(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[Catch: n -> 0x0054, TRY_LEAVE, TryCatch #0 {n -> 0x0054, blocks: (B:49:0x001b, B:51:0x001f, B:53:0x0023, B:5:0x0029, B:8:0x004a, B:10:0x0050), top: B:48:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[LOOP:0: B:26:0x0079->B:28:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sv0(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM.sv0(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    public final void vv0(C50062Jko param) {
        int i;
        o.LJIIIZ(param, "param");
        XKQ xkq = this.LJZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
            this.LJZI = null;
        }
        Integer num = param.LJIIIZ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.LJLLILLLL = i;
        this.LJZI = XKX.LIZLLL(getAssemVMScope(), null, null, new C50320Joy(this, param, null), 3);
    }

    @Override // X.InterfaceC50393Jq9
    public final void zj0(Aweme aweme) {
        InterfaceC50393Jq9 interfaceC50393Jq9;
        String str = null;
        if (Dv0()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
            if ((interfaceC51679KPz instanceof InterfaceC50393Jq9) && (interfaceC50393Jq9 = (InterfaceC50393Jq9) interfaceC51679KPz) != null) {
                interfaceC50393Jq9.zj0(aweme);
            }
        }
        Object[] objArr = new Object[2];
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        objArr[0] = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("curAweme:");
        if (aweme != null) {
            str = aweme.getAid();
        }
        LIZ2.append(str);
        objArr[1] = X1D.LIZIZ(LIZ2);
        C49133JQb.LIZ("SearchSeparateVM", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zv0(X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM.zv0(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC55340Lnk
    public final boolean R2(int i, Aweme aweme) {
        InterfaceC50394JqA interfaceC50394JqA;
        List<Aweme> awemeList;
        InterfaceC224118qt interfaceC224118qt;
        Object obj = null;
        boolean z = false;
        if (Dv0()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
            if (interfaceC51679KPz != null) {
                obj = interfaceC51679KPz.getViewModel();
            }
            if (!(obj instanceof InterfaceC224118qt) || (interfaceC224118qt = (InterfaceC224118qt) obj) == null || (awemeList = interfaceC224118qt.getAwemeList()) == null) {
                awemeList = getAwemeList();
            }
            if (awemeList.size() > i) {
                KQA kqa = this.operatorView;
                if (kqa != null) {
                    kqa.j0(awemeList, hasMore());
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("proxy operator has more data[size:");
                LIZ.append(awemeList.size());
                LIZ.append("], just update");
                X1D.LIZIZ(LIZ);
                return false;
            }
        }
        if (Dv0()) {
            InterfaceC51679KPz interfaceC51679KPz2 = this.LJZL;
            if ((interfaceC51679KPz2 instanceof InterfaceC50394JqA) && (interfaceC50394JqA = (InterfaceC50394JqA) interfaceC51679KPz2) != null && interfaceC50394JqA.R2(i, aweme)) {
                z = true;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("useProxy:");
        LIZ2.append(Dv0());
        X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("curAweme:");
        LIZ3.append(aweme);
        X1D.LIZIZ(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("adapterCnt:");
        LIZ4.append(i);
        X1D.LIZIZ(LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("preload:");
        LIZ5.append(z);
        X1D.LIZIZ(LIZ5);
        return z;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    public final List<Aweme> jv0(int i, boolean z) {
        List<DynamicPatch.SearchMultiTabListData> list;
        DynamicPatch.SearchMultiTabListData searchMultiTabListData;
        if (z) {
            this.LJLLI = i;
            this.LJLLILLLL = i;
        }
        if (this.LJLLL != 40) {
            return super.jv0(i, false);
        }
        JSE jse = this.LJLJI;
        if (jse != null && (list = jse.LJIIJ) != null && (searchMultiTabListData = (DynamicPatch.SearchMultiTabListData) ListProtector.get(list, i)) != null) {
            return searchMultiTabListData.tabAwemeList;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    public final Integer kv0(int i, M89 feedParam) {
        int i2;
        o.LJIIIZ(feedParam, "feedParam");
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    i2 = this.LJLLI;
                } else if (this.LJZ || o.LJ(Bv0(Integer.valueOf(this.LJLLI)), Boolean.TRUE)) {
                    i2 = -1;
                } else {
                    i2 = this.LJLLI;
                }
            } else {
                i2 = this.LJLLI;
            }
        } else {
            i2 = this.LJLLI;
        }
        return Integer.valueOf(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[Catch: Exception -> 0x0129, all -> 0x0175, TryCatch #1 {all -> 0x0175, blocks: (B:22:0x006a, B:23:0x006d, B:25:0x008a, B:26:0x008e, B:28:0x0098, B:30:0x00aa, B:31:0x00b4, B:33:0x00bd, B:34:0x00c1, B:52:0x00c8, B:54:0x00cc, B:56:0x00d2, B:57:0x00d6, B:59:0x00e5, B:62:0x0130), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[Catch: Exception -> 0x0129, all -> 0x0175, TryCatch #1 {all -> 0x0175, blocks: (B:22:0x006a, B:23:0x006d, B:25:0x008a, B:26:0x008e, B:28:0x0098, B:30:0x00aa, B:31:0x00b4, B:33:0x00bd, B:34:0x00c1, B:52:0x00c8, B:54:0x00cc, B:56:0x00d2, B:57:0x00d6, B:59:0x00e5, B:62:0x0130), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5 A[Catch: Exception -> 0x0129, all -> 0x0175, TRY_LEAVE, TryCatch #1 {all -> 0x0175, blocks: (B:22:0x006a, B:23:0x006d, B:25:0x008a, B:26:0x008e, B:28:0x0098, B:30:0x00aa, B:31:0x00b4, B:33:0x00bd, B:34:0x00c1, B:52:0x00c8, B:54:0x00cc, B:56:0x00d2, B:57:0x00d6, B:59:0x00e5, B:62:0x0130), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object nv0(X.C50062Jko r14, X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM.nv0(X.Jko, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadLatest(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return tv0(((Number) obj).intValue(), interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return uv0(((Number) obj).intValue(), interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    public final Object tv0(int i, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return lv0(i, EnumC50384Jq0.LOAD_LATEST_RESULT, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    public final Object uv0(int i, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        C49133JQb.LIZ("SearchSeparateVM", "load more");
        return lv0(i, EnumC50384Jq0.LOAD_MORE_RESULT, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x003c, code lost:
    
        if (r11 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0268, code lost:
    
        if (r11 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0264, code lost:
    
        if (r11 != null) goto L149;
     */
    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xv0(X.C50062Jko r20, com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData r21) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM.xv0(X.Jko, com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData):void");
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    public final void hv0(int i, ActivityC45651qj activityC45651qj, String backtrace) {
        o.LJIIIZ(backtrace, "backtrace");
        XKQ xkq = this.LJZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJZI = null;
        this.LJLLI = i;
        this.LJLLILLLL = i;
        this.LJZ = false;
        this.LJLJLJ = backtrace;
        if (this.LJLLL != 40 || JTB.LIZJ(activityC45651qj)) {
            List<Aweme> jv0 = jv0(i, false);
            if (o.LJ(Bv0(Integer.valueOf(i)), Boolean.TRUE)) {
                i = -1;
            }
            withState(new AqS55S0400000_9(this, (SearchSeparateTabHorizontalVM) null, Integer.valueOf(i), (Integer) iv0(jv0), (List<C50389Jq5>) 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lv0(int r7, X.EnumC50384Jq0 r8, X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C50379Jpv
            if (r0 == 0) goto L21
            r3 = r9
            X.Jpv r3 = (X.C50379Jpv) r3
            int r2 = r3.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r3.LJLJI = r2
        L12:
            java.lang.Object r5 = r3.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJI
            r1 = 1
            r2 = 2
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L3e
            if (r0 != r2) goto L27
            goto L75
        L21:
            X.Jpv r3 = new X.Jpv
            r3.<init>(r6, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C141335gf.LIZJ(r5)
            r0 = -1
            if (r7 != r0) goto L44
            r3.LJLJI = r1     // Catch: java.lang.Exception -> L7b
            java.lang.Object r5 = r6.zv0(r3)     // Catch: java.lang.Exception -> L7b
            if (r5 != r4) goto L41
            return r4
        L3e:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> L7b
        L41:
            X.A2G r5 = (X.A2G) r5     // Catch: java.lang.Exception -> L7b
            goto L85
        L44:
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Exception -> L7b
            r0.<init>(r7)     // Catch: java.lang.Exception -> L7b
            java.lang.Boolean r1 = r6.Bv0(r0)     // Catch: java.lang.Exception -> L7b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L7b
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L64
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Exception -> L7b
            r1.<init>(r7)     // Catch: java.lang.Exception -> L7b
            r0 = 0
            java.util.List r0 = r6.jv0(r7, r0)     // Catch: java.lang.Exception -> L7b
            X.A2G r5 = r6.pv0(r1, r8, r0)     // Catch: java.lang.Exception -> L7b
            goto L85
        L64:
            X.Jko r1 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L7b
            java.lang.String r0 = r6.LJLJLJ     // Catch: java.lang.Exception -> L7b
            X.Jko r0 = r6.qv0(r1, r7, r8, r0)     // Catch: java.lang.Exception -> L7b
            r3.LJLJI = r2     // Catch: java.lang.Exception -> L7b
            java.lang.Object r5 = r6.nv0(r0, r3)     // Catch: java.lang.Exception -> L7b
            if (r5 != r4) goto L78
            return r4
        L75:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> L7b
        L78:
            X.A2G r5 = (X.A2G) r5     // Catch: java.lang.Exception -> L7b
            goto L85
        L7b:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r5 = X.A2F.LIZJ(r1)
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM.lv0(int, X.Jq0, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    public final A2G<Integer> pv0(Integer num, EnumC50384Jq0 enumC50384Jq0, List<? extends Aweme> list) {
        String str;
        Integer num2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getPageValue ");
        LIZ.append(num);
        LIZ.append(' ');
        if (enumC50384Jq0 != null) {
            str = enumC50384Jq0.name();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(' ');
        if (list != null) {
            num2 = Integer.valueOf(list.size());
        } else {
            num2 = null;
        }
        LIZ.append(num2);
        X1D.LIZIZ(LIZ);
        if (enumC50384Jq0 != null) {
            int i = C50385Jq1.LIZ[enumC50384Jq0.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        A2F a2f = A2G.LIZ;
                        List iv0 = iv0(list);
                        a2f.getClass();
                        return A2F.LIZ(iv0);
                    }
                } else {
                    if (hasMore()) {
                        A2F a2f2 = A2G.LIZ;
                        List iv02 = iv0(list);
                        if (!o.LJ(Bv0(num), Boolean.FALSE)) {
                            num = -1;
                        }
                        return A2F.LJ(a2f2, null, num, iv02, 1);
                    }
                    A2F a2f3 = A2G.LIZ;
                    List iv03 = iv0(list);
                    a2f3.getClass();
                    return A2F.LIZ(iv03);
                }
            } else {
                A2F a2f4 = A2G.LIZ;
                List iv04 = iv0(list);
                a2f4.getClass();
                return A2F.LIZLLL(num, num, iv04);
            }
        }
        A2F a2f5 = A2G.LIZ;
        List iv05 = iv0(list);
        a2f5.getClass();
        return A2F.LIZ(iv05);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    public final void wv0(Integer num, Integer num2, List<C50389Jq5> list) {
        withState(new AqS55S0400000_9(this, (SearchSeparateTabHorizontalVM) num, num2, (Integer) list, (List<C50389Jq5>) 2));
    }

    public final void yv0(int i, String str, List list) {
        String str2;
        if (this.LJLLLL.length() > 0) {
            str2 = this.LJLLLL;
        } else {
            str2 = "tt_movie_official";
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                aweme.setSearchFeedType("search_separate_tab_lynx");
                aweme.setSearchTabRank(Integer.valueOf(i));
                if (this.LJLLL != 40) {
                    aweme.setSearchTabName(str);
                    aweme.appendExtraParamUseInSearch("token_type", str2);
                } else {
                    aweme.setSearchTabName(str);
                    aweme.appendExtraParamUseInSearch("token_type", this.LJLLLL);
                    List<DynamicPatch.SearchPoiIdMap> list2 = (List) ((LinkedHashMap) this.LJLLLLLL).get(Integer.valueOf(i));
                    String str3 = "";
                    if (list2 != null && (r4 = list2.iterator()) != null) {
                        String str4 = "";
                        for (DynamicPatch.SearchPoiIdMap searchPoiIdMap : list2) {
                            String LJIILJJIL = C78939UyV.LJIILJJIL(aweme);
                            if (LJIILJJIL == null) {
                                LJIILJJIL = "";
                            }
                            if (o.LJ(searchPoiIdMap.itemId, LJIILJJIL)) {
                                str4 = searchPoiIdMap.poiId;
                                o.LJIIIIZZ(str4, "it.poiId");
                            }
                        }
                        str3 = str4;
                    }
                    aweme.appendExtraParamUseInSearch("search_item_poi_id", str3);
                }
            }
        }
    }

    @Override // X.InterfaceC50392Jq8
    public final void zX(int i, int i2, Aweme aweme) {
        InterfaceC50392Jq8 interfaceC50392Jq8;
        if (Dv0()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
            if ((interfaceC51679KPz instanceof InterfaceC50392Jq8) && (interfaceC50392Jq8 = (InterfaceC50392Jq8) interfaceC51679KPz) != null) {
                interfaceC50392Jq8.zX(i, i2, aweme);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        C49133JQb.LIZ("SearchSeparateVM", X1D.LIZIZ(LIZ), KMP.LJ("curPos:", i), KMP.LJ("totalCount:", i2));
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final /* bridge */ /* synthetic */ Integer getCursorByFeedParam(int i, M89 m89, int i2, boolean z) {
        return kv0(i, m89);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r9 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r10 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r22 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        r10 = r22.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if (r10 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if (r22 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        r11 = r22.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        if (r11 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        r0 = r22.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        if (r0 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        return new X.C50062Jko(r7, r8, r9, r10, r11, r12, r13, r15, r24, java.lang.Integer.valueOf(r23), null, 1024);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007d, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007e, code lost:
    
        if (r22 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0067, code lost:
    
        if (r22 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C50062Jko qv0(X.C50062Jko r22, int r23, X.EnumC50384Jq0 r24, java.lang.String r25) {
        /*
            r21 = this;
            r10 = r25
            r0 = 0
            r4 = r21
            r2 = r23
            java.util.List r0 = r4.jv0(r2, r0)
            if (r0 == 0) goto Lb7
            int r7 = r0.size()
        L11:
            java.util.List r0 = r4.rv0()
            r19 = 0
            if (r0 == 0) goto Lb2
            java.lang.Object r8 = X.ORZ.LJLLLLLL(r2, r0)
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch$SearchHorizontalTab r8 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchHorizontalTab) r8
            if (r8 == 0) goto Lb4
            long r0 = r8.end
            int r5 = (int) r0
            long r0 = r8.start
            int r3 = (int) r0
            int r5 = r5 - r3
            int r6 = r5 + 1
        L2a:
            int r0 = r4.LJLLL
            r3 = 40
            if (r0 != r3) goto La8
            X.JSE r0 = r4.LJLJI
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r0.LIZ
            if (r0 == 0) goto L3e
            java.util.List r1 = r0.getAwemeMultiTabList()
            if (r1 != 0) goto L40
        L3e:
            X.OQg r1 = X.C61878OQg.INSTANCE
        L40:
            if (r2 < 0) goto Laf
            int r0 = r1.size()
            if (r2 >= r0) goto Laf
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch$SearchMultiTabListData r0 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchMultiTabListData) r0
            long r13 = r0.cursor
        L50:
            int r0 = r4.LJLLL
            if (r0 != r3) goto L95
            r15 = 10
        L56:
            X.Jko r6 = new X.Jko
            r0 = r22
            if (r0 == 0) goto L92
            java.lang.Integer r7 = r0.LIZ
        L5e:
            java.lang.String r12 = ""
            if (r0 == 0) goto L66
            java.lang.String r8 = r0.LIZIZ
            if (r8 != 0) goto L69
        L66:
            r8 = r12
            if (r0 == 0) goto L6d
        L69:
            java.lang.String r9 = r0.LIZJ
            if (r9 != 0) goto L6e
        L6d:
            r9 = r12
        L6e:
            if (r10 != 0) goto L77
            if (r0 == 0) goto L76
            java.lang.String r10 = r0.LIZLLL
            if (r10 != 0) goto L77
        L76:
            r10 = r12
        L77:
            if (r0 == 0) goto L7d
            java.lang.String r11 = r0.LJ
            if (r11 != 0) goto L80
        L7d:
            r11 = r12
            if (r0 == 0) goto L84
        L80:
            java.lang.String r0 = r0.LJFF
            if (r0 != 0) goto L90
        L84:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            r20 = 1024(0x400, float:1.435E-42)
            r17 = r24
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20)
            return r6
        L90:
            r12 = r0
            goto L84
        L92:
            r7 = r19
            goto L5e
        L95:
            long r0 = (long) r7
            r8 = 29
            long r8 = r8 + r0
            long r3 = (long) r6
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto La5
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 > 0) goto La5
            int r6 = r6 - r7
            long r15 = (long) r6
            goto L56
        La5:
            r15 = 20
            goto L56
        La8:
            if (r8 == 0) goto Laf
            long r13 = r8.start
            long r0 = (long) r7
            long r13 = r13 + r0
            goto L50
        Laf:
            r13 = 0
            goto L50
        Lb2:
            r8 = r19
        Lb4:
            r6 = 0
            goto L2a
        Lb7:
            r7 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM.qv0(X.Jko, int, X.Jq0, java.lang.String):X.Jko");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useProxy:");
        LIZ.append(Dv0());
        C49133JQb.LIZ("SearchSeparateVM", X1D.LIZIZ(LIZ), KMP.LJ("queryType:", i));
        if (Dv0()) {
            C49133JQb.LIZ("SearchSeparateVM", "request delegated to proxy operator");
            InterfaceC51679KPz interfaceC51679KPz = this.LJZL;
            if (interfaceC51679KPz != null) {
                interfaceC51679KPz.request(i, feedParam, i2, z);
                return;
            }
            return;
        }
        super.request(i, feedParam, i2, z);
    }
}
