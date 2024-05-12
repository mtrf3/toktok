package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel;

import X.A2F;
import X.A2G;
import X.ActivityC45651qj;
import X.C214188as;
import X.C229578zh;
import X.C2KC;
import X.C2KF;
import X.C32I;
import X.C33Q;
import X.C49866Jhe;
import X.C50062Jko;
import X.C50065Jkr;
import X.C50088JlE;
import X.C50386Jq2;
import X.C50389Jq5;
import X.C50440Jqu;
import X.C55988LyC;
import X.C65777Prh;
import X.C78404Ups;
import X.C8HZ;
import X.EnumC50384Jq0;
import X.InterfaceC49873Jhl;
import X.InterfaceC67352kd;
import X.JSE;
import X.KQA;
import X.M89;
import X.XKQ;
import X.XKX;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS55S0400000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class SearchTabHorizontalVM extends BaseDetailShareVM<C55988LyC, C50389Jq5, Integer> implements InterfaceC49873Jhl {
    public static final /* synthetic */ int LJLL = 0;
    public List<? extends Aweme> LJLIL;
    public C50062Jko LJLILLLLZI;
    public JSE LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public XKQ LJLJJLL;
    public String LJLJL = "";
    public String LJLJLJ = "";
    public final C214188as LJLJLLL = C78404Ups.LIZJ(this, C50065Jkr.LJLIL);

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean cannotLoadLatest() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public boolean cannotLoadMore() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        return -1;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 9;
    }

    public Object lv0(int i, EnumC50384Jq0 enumC50384Jq0, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return mv0(this, i, enumC50384Jq0, interfaceC67352kd);
    }

    public Object nv0(C50062Jko c50062Jko, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return ov0(this, c50062Jko, interfaceC67352kd);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C55988LyC(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC224118qt
    public List<Aweme> getAwemeList() {
        List<Aweme> jv0 = jv0(this.LJLJJL, false);
        if (jv0 != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : jv0) {
                Aweme aweme2 = aweme;
                if (aweme2.getAid() != null && aweme2.getAwemeType() == 0) {
                    arrayList.add(aweme);
                }
            }
            return C65777Prh.LIZIZ(arrayList);
        }
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public boolean hasMore() {
        int i;
        int i2 = this.LJLJJI;
        List<DynamicPatch.SearchHorizontalTab> rv0 = rv0();
        if (rv0 != null) {
            i = rv0.size();
        } else {
            i = 0;
        }
        if (i2 >= i - 1) {
            return false;
        }
        return true;
    }

    public final List<DynamicPatch.SearchHorizontalTab> rv0() {
        DynamicPatch dynamicPatch;
        JSE jse = this.LJLJI;
        if (jse != null && (dynamicPatch = jse.LIZ) != null) {
            return dynamicPatch.getTabMap();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51771KTn
    public boolean shouldSetRefreshListener() {
        if (this.LJLJJL > 0) {
            return true;
        }
        return false;
    }

    public static List iv0(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Aweme aweme = (Aweme) obj;
                if (aweme.getAid() != null && aweme.getAwemeType() == 0) {
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

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(C50389Jq5 c50389Jq5) {
        C50389Jq5 item = c50389Jq5;
        o.LJIIIZ(item, "item");
        return item.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        if (owner.mo49getActivity() != null && owner.isAdded()) {
            ActivityC45651qj mo49getActivity = owner.mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.detailLoadStateManager = C229578zh.LIZ(mo49getActivity);
        }
        return super.init(owner);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C50389Jq5> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS174S0100000_8(newListState, (C8HZ<C50389Jq5>) 76));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return lv0(this.LJLJJI, EnumC50384Jq0.REFRESH_RESULT, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sv0(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "containerId"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.JSE r4 = r5.LJLJI
            r5.LJLJL = r6
            r3 = 0
            r2 = 0
            if (r4 == 0) goto L4d
            java.util.List r0 = r4.LIZ(r3)
            if (r0 != 0) goto L48
            if (r4 == 0) goto L4d
            java.util.List r0 = r4.LIZIZ(r3)
            if (r0 != 0) goto L48
            if (r4 == 0) goto L4d
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r4.LIZ
            if (r0 == 0) goto L4d
            java.util.List r0 = r0.getAwemeList()
        L25:
            r5.gv0(r3, r0)
            if (r4 == 0) goto L3d
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r4.LIZ
            if (r0 == 0) goto L4b
            java.util.List r1 = r0.getAwemeList()
        L32:
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r4.LIZ
            if (r0 == 0) goto L49
            java.util.List r0 = r0.getAwemeListRaw()
        L3a:
            r4.LIZJ(r3, r1, r0)
        L3d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.util.List r0 = iv0(r2)
            r5.wv0(r2, r1, r0)
        L48:
            return
        L49:
            r0 = r2
            goto L3a
        L4b:
            r1 = r2
            goto L32
        L4d:
            r0 = r2
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM.sv0(java.lang.String):void");
    }

    public void vv0(C50062Jko param) {
        o.LJIIIZ(param, "param");
        XKQ xkq = this.LJLJJLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
            this.LJLJJLL = null;
        }
        this.LJLJJLL = XKX.LIZLLL(getAssemVMScope(), null, null, new C50088JlE(this, param, null), 3);
    }

    @Override // X.InterfaceC49873Jhl
    public final void ec(C2KC<Aweme> c2kc, List<? extends Aweme> list) {
        int i = c2kc.LIZIZ;
        List<Aweme> insertList = c2kc.LIZ;
        if (list.isEmpty()) {
            list = new ArrayList<>();
        }
        if (C65777Prh.LJI(list)) {
            if (i >= 0 && i <= list.size()) {
                o.LJIIIIZZ(insertList, "insertList");
                list.addAll(i, insertList);
                C2KF c2kf = new C2KF(c2kc, list);
                KQA kqa = this.operatorView;
                if (kqa != null && !kqa.onItemInsertedNew(c2kf)) {
                    kqa.onItemInserted(list, c2kf.LIZIZ);
                }
                this.LJLIL = list;
                C50440Jqu.LIZJ = true;
                return;
            }
            throw new C49866Jhe(i, list.size());
        }
    }

    public final void gv0(int i, List<? extends Aweme> list) {
        String str;
        String str2;
        DynamicPatch.SearchHorizontalTab searchHorizontalTab;
        DynamicPatch dynamicPatch;
        JSE jse = this.LJLJI;
        if (jse != null && (dynamicPatch = jse.LIZ) != null) {
            str = dynamicPatch.getAlaSrc();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (list != null) {
            for (Aweme aweme : list) {
                aweme.setSearchFeedType("search_horizontal_tab_lynx");
                aweme.setSearchTabRank(Integer.valueOf(i));
                List<DynamicPatch.SearchHorizontalTab> rv0 = rv0();
                if (rv0 == null || (searchHorizontalTab = (DynamicPatch.SearchHorizontalTab) ListProtector.get(rv0, i)) == null || (str2 = searchHorizontalTab.TabName) == null) {
                    str2 = "";
                }
                aweme.setSearchTabName(str2);
                aweme.appendExtraParamUseInSearch("token_type", str);
            }
        }
    }

    public List<Aweme> jv0(int i, boolean z) {
        JSE jse = this.LJLJI;
        if (jse != null) {
            return jse.LIZ(i);
        }
        return null;
    }

    public Integer kv0(int i, M89 feedParam) {
        int i2;
        o.LJIIIZ(feedParam, "feedParam");
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    i2 = this.LJLJJI;
                } else {
                    i2 = this.LJLJJI + 1;
                }
            } else {
                i2 = this.LJLJJL - 1;
            }
        } else {
            i2 = this.LJLJJI;
        }
        return Integer.valueOf(i2);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public /* bridge */ /* synthetic */ Object onLoadLatest(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return tv0(((Number) obj).intValue(), interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return uv0(((Number) obj).intValue(), interfaceC67352kd);
    }

    public Object tv0(int i, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return lv0(i, EnumC50384Jq0.LOAD_LATEST_RESULT, interfaceC67352kd);
    }

    public Object uv0(int i, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return lv0(i, EnumC50384Jq0.LOAD_MORE_RESULT, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
    
        if (r16 != null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void xv0(X.C50062Jko r15, com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData r16) {
        /*
            r14 = this;
            java.lang.String r0 = "param"
            kotlin.jvm.internal.o.LJIIIZ(r15, r0)
            long r0 = r15.LJI
            int r6 = (int) r0
            long r0 = r15.LJII
            int r8 = (int) r0
            java.util.List r0 = r14.rv0()
            r5 = 0
            r7 = 0
            if (r0 == 0) goto L3f
            java.util.Iterator r13 = r0.iterator()
            r4 = 0
            r12 = 0
        L19:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r11 = r13.next()
            int r10 = r12 + 1
            if (r12 < 0) goto L3b
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch$SearchHorizontalTab r11 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchHorizontalTab) r11
            if (r11 == 0) goto L39
            long r2 = (long) r6
            long r0 = r11.start
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 < 0) goto L39
            long r0 = r11.end
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 > 0) goto L39
            r4 = r12
        L39:
            r12 = r10
            goto L19
        L3b:
            X.C47261Igj.LJJJJJ()
            throw r5
        L3f:
            r4 = 0
        L40:
            java.util.List r0 = r14.rv0()
            if (r0 == 0) goto L76
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r4, r0)
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch$SearchHorizontalTab r0 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchHorizontalTab) r0
            if (r0 == 0) goto L76
            long r0 = r0.start
            int r2 = (int) r0
        L51:
            java.util.List r0 = r14.rv0()
            if (r0 == 0) goto L74
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r4, r0)
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch$SearchHorizontalTab r0 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchHorizontalTab) r0
            if (r0 == 0) goto L74
            long r0 = r0.end
            int r3 = (int) r0
        L62:
            java.util.List r0 = r14.jv0(r4, r7)
            if (r0 == 0) goto L72
            int r1 = r0.size()
        L6c:
            int r8 = r8 + r6
            int r0 = r8 - r2
            if (r1 < r0) goto L78
            return
        L72:
            r1 = 0
            goto L6c
        L74:
            r3 = -1
            goto L62
        L76:
            r2 = -1
            goto L51
        L78:
            int r0 = r8 + (-1)
            if (r0 <= r3) goto L7d
            return
        L7d:
            int r2 = r2 + r1
            if (r6 <= r2) goto L81
            return
        L81:
            r3 = r16
            if (r3 == 0) goto Laf
            java.util.List<? extends java.util.Map<?, ?>> r0 = r3.awemeListRaw
            if (r0 == 0) goto L8d
            int r7 = r0.size()
        L8d:
            java.util.List r1 = r3.LJ()
            if (r1 == 0) goto Laf
            int r0 = r2 - r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.List r1 = r1.subList(r0, r7)
        L9b:
            java.util.List<? extends java.util.Map<?, ?>> r0 = r3.awemeListRaw
            if (r0 == 0) goto La4
            int r2 = r2 - r6
            java.util.List r5 = r0.subList(r2, r7)
        La4:
            r14.gv0(r4, r1)
            X.JSE r0 = r14.LJLJI
            if (r0 == 0) goto Lae
            r0.LIZJ(r4, r1, r5)
        Lae:
            return
        Laf:
            r1 = r5
            if (r3 == 0) goto La4
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM.xv0(X.Jko, com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:11:0x0054, B:12:0x0057, B:14:0x007a, B:16:0x008e, B:17:0x0092, B:21:0x0099, B:26:0x0035), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099 A[Catch: Exception -> 0x00a8, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a8, blocks: (B:11:0x0054, B:12:0x0057, B:14:0x007a, B:16:0x008e, B:17:0x0092, B:21:0x0099, B:26:0x0035), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object ov0(com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM r5, X.C50062Jko r6, X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r7) {
        /*
            boolean r0 = r7 instanceof X.C50380Jpw
            if (r0 == 0) goto L22
            r4 = r7
            X.Jpw r4 = (X.C50380Jpw) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r3 = r4.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.Jko r6 = r4.LJLILLLLZI
            com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM r5 = r4.LJLIL
            goto L54
        L22:
            X.Jpw r4 = new X.Jpw
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r3)
            r5.LJLILLLLZI = r6
            X.8as r0 = r5.LJLJLLL     // Catch: java.lang.Exception -> La8
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> La8
            X.8aw r0 = (X.InterfaceC214228aw) r0     // Catch: java.lang.Exception -> La8
            X.3e4 r0 = r0.getOperator()     // Catch: java.lang.Exception -> La8
            X.Jks r0 = (X.InterfaceC50066Jks) r0     // Catch: java.lang.Exception -> La8
            X.Svk r0 = r0.LLFZ(r6)     // Catch: java.lang.Exception -> La8
            r4.LJLIL = r5     // Catch: java.lang.Exception -> La8
            r4.LJLILLLLZI = r6     // Catch: java.lang.Exception -> La8
            r4.LJLJJL = r1     // Catch: java.lang.Exception -> La8
            java.lang.Object r3 = X.C77318UWc.LIZIZ(r0, r4)     // Catch: java.lang.Exception -> La8
            if (r3 != r2) goto L57
            return r2
        L54:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> La8
        L57:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> La8
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = com.ss.android.ugc.aweme.utils.GsonHolder.LIZLLL()     // Catch: java.lang.Exception -> La8
            com.google.gson.Gson r1 = r0.LIZ()     // Catch: java.lang.Exception -> La8
            X.Jq4 r0 = new X.Jq4     // Catch: java.lang.Exception -> La8
            r0.<init>()     // Catch: java.lang.Exception -> La8
            java.lang.reflect.Type r0 = r0.getType()     // Catch: java.lang.Exception -> La8
            java.lang.Object r3 = r1.LJII(r3, r0)     // Catch: java.lang.Exception -> La8
            com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData r3 = (com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData) r3     // Catch: java.lang.Exception -> La8
            X.MBA r0 = r4.getContext()     // Catch: java.lang.Exception -> La8
            boolean r0 = X.C79146V4k.LJJJ(r0)     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto L99
            r5.xv0(r6, r3)     // Catch: java.lang.Exception -> La8
            java.lang.String r2 = r5.LJLJL     // Catch: java.lang.Exception -> La8
            X.JXj r1 = new X.JXj     // Catch: java.lang.Exception -> La8
            r0 = 0
            r1.<init>(r3, r6, r0, r2)     // Catch: java.lang.Exception -> La8
            X.C2U8.LIZ(r1)     // Catch: java.lang.Exception -> La8
            java.lang.Integer r2 = r6.LJIIIZ     // Catch: java.lang.Exception -> La8
            X.Jq0 r1 = r6.LJIIIIZZ     // Catch: java.lang.Exception -> La8
            if (r3 == 0) goto L97
            java.util.List r0 = r3.LJ()     // Catch: java.lang.Exception -> La8
        L92:
            X.A2G r0 = r5.pv0(r2, r1, r0)     // Catch: java.lang.Exception -> La8
            goto Lb2
        L97:
            r0 = 0
            goto L92
        L99:
            X.A2F r1 = X.A2G.LIZ     // Catch: java.lang.Exception -> La8
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch: java.lang.Exception -> La8
            r0.<init>()     // Catch: java.lang.Exception -> La8
            r1.getClass()     // Catch: java.lang.Exception -> La8
            X.A2I r0 = X.A2F.LIZJ(r0)     // Catch: java.lang.Exception -> La8
            goto Lb2
        La8:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM.ov0(com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, X.Jko, X.2kd):java.lang.Object");
    }

    public void hv0(int i, ActivityC45651qj activityC45651qj, String backtrace) {
        Integer num;
        o.LJIIIZ(backtrace, "backtrace");
        this.LJLJJI = i;
        this.LJLJJL = i;
        this.LJLJLJ = backtrace;
        List<Aweme> jv0 = jv0(i, false);
        Integer num2 = null;
        if (hasMore()) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        if (this.LJLJJL > 0) {
            num2 = Integer.valueOf(i);
        }
        wv0(num2, num, iv0(jv0));
    }

    public A2G<Integer> pv0(Integer num, EnumC50384Jq0 enumC50384Jq0, List<? extends Aweme> list) {
        if (enumC50384Jq0 != null) {
            int i = C50386Jq2.LIZ[enumC50384Jq0.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int i2 = this.LJLJJL - 1;
                        this.LJLJJL = i2;
                        if (i2 > 0) {
                            return A2F.LJ(A2G.LIZ, num, null, iv0(list), 2);
                        }
                        A2F a2f = A2G.LIZ;
                        List iv0 = iv0(list);
                        a2f.getClass();
                        return A2F.LIZ(iv0);
                    }
                } else {
                    this.LJLJJI++;
                    if (hasMore()) {
                        return A2F.LJ(A2G.LIZ, null, num, iv0(list), 1);
                    }
                    A2F a2f2 = A2G.LIZ;
                    List iv02 = iv0(list);
                    a2f2.getClass();
                    return A2F.LIZ(iv02);
                }
            } else {
                A2F a2f3 = A2G.LIZ;
                List iv03 = iv0(list);
                a2f3.getClass();
                return A2F.LIZLLL(num, num, iv03);
            }
        }
        A2F a2f4 = A2G.LIZ;
        List iv04 = iv0(list);
        a2f4.getClass();
        return A2F.LIZ(iv04);
    }

    public void wv0(Integer num, Integer num2, List<C50389Jq5> list) {
        withState(new AqS55S0400000_9(this, (SearchTabHorizontalVM) num, num2, (Integer) list, (List<C50389Jq5>) 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object mv0(com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM r7, int r8, X.EnumC50384Jq0 r9, X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r10) {
        /*
            boolean r0 = r10 instanceof X.C50382Jpy
            if (r0 == 0) goto L1e
            r4 = r10
            X.Jpy r4 = (X.C50382Jpy) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            goto L24
        L1e:
            X.Jpy r4 = new X.Jpy
            r4.<init>(r7, r10)
            goto L12
        L24:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L87
            goto L86
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            r6 = 0
            java.util.List r2 = r7.jv0(r8, r6)     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = "getDetailSearchData tabIndex "
            r1.append(r0)     // Catch: java.lang.Exception -> L87
            r1.append(r8)     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = " PanelStateEvent "
            r1.append(r0)     // Catch: java.lang.Exception -> L87
            if (r9 == 0) goto L4c
            goto L4e
        L4c:
            r0 = 0
            goto L52
        L4e:
            java.lang.String r0 = r9.name()     // Catch: java.lang.Exception -> L87
        L52:
            r1.append(r0)     // Catch: java.lang.Exception -> L87
            r0 = 32
            r1.append(r0)     // Catch: java.lang.Exception -> L87
            r1.append(r7)     // Catch: java.lang.Exception -> L87
            X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L87
            if (r2 == 0) goto L68
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Exception -> L87
            if (r0 == 0) goto L69
        L68:
            r6 = 1
        L69:
            if (r6 != 0) goto L75
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Exception -> L87
            r0.<init>(r8)     // Catch: java.lang.Exception -> L87
            X.A2G r0 = r7.pv0(r0, r9, r2)     // Catch: java.lang.Exception -> L87
            return r0
        L75:
            X.Jko r1 = r7.LJLILLLLZI     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = r7.LJLJLJ     // Catch: java.lang.Exception -> L87
            X.Jko r0 = r7.qv0(r1, r8, r9, r0)     // Catch: java.lang.Exception -> L87
            r4.LJLJI = r3     // Catch: java.lang.Exception -> L87
            java.lang.Object r1 = r7.nv0(r0, r4)     // Catch: java.lang.Exception -> L87
            if (r1 != r5) goto L86
            return r5
        L86:
            return r1
        L87:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM.mv0(com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM, int, X.Jq0, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public /* bridge */ /* synthetic */ Integer getCursorByFeedParam(int i, M89 m89, int i2, boolean z) {
        return kv0(i, m89);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r19 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        r7 = r19.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        if (r19 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        r8 = r19.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        r0 = r19.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (r0 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        r0 = rv0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        r0 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchHorizontalTab) com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        r10 = r0.start;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        r0 = rv0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        r0 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchHorizontalTab) com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        r12 = r0.end;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        r0 = rv0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        r0 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchHorizontalTab) com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r0 = r0.start;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        return new X.C50062Jko(r4, r5, r6, r7, r8, r9, r10, (r12 - r0) + 1, r21, java.lang.Integer.valueOf(r20), null, 1024);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002a, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x002b, code lost:
    
        if (r19 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0014, code lost:
    
        if (r19 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C50062Jko qv0(X.C50062Jko r19, int r20, X.EnumC50384Jq0 r21, java.lang.String r22) {
        /*
            r18 = this;
            r7 = r22
            X.Jko r3 = new X.Jko
            r4 = 0
            r0 = r19
            if (r0 == 0) goto Lb
            java.lang.Integer r4 = r0.LIZ
        Lb:
            java.lang.String r9 = ""
            if (r0 == 0) goto L13
            java.lang.String r5 = r0.LIZIZ
            if (r5 != 0) goto L16
        L13:
            r5 = r9
            if (r0 == 0) goto L1a
        L16:
            java.lang.String r6 = r0.LIZJ
            if (r6 != 0) goto L1b
        L1a:
            r6 = r9
        L1b:
            if (r7 != 0) goto L24
            if (r0 == 0) goto L23
            java.lang.String r7 = r0.LIZLLL
            if (r7 != 0) goto L24
        L23:
            r7 = r9
        L24:
            if (r0 == 0) goto L2a
            java.lang.String r8 = r0.LJ
            if (r8 != 0) goto L2d
        L2a:
            r8 = r9
            if (r0 == 0) goto L31
        L2d:
            java.lang.String r0 = r0.LJFF
            if (r0 != 0) goto L7e
        L31:
            java.util.List r0 = r18.rv0()
            r2 = r20
            if (r0 == 0) goto L7b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch$SearchHorizontalTab r0 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchHorizontalTab) r0
            if (r0 == 0) goto L7b
            long r10 = r0.start
        L43:
            java.util.List r0 = r18.rv0()
            if (r0 == 0) goto L78
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch$SearchHorizontalTab r0 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchHorizontalTab) r0
            if (r0 == 0) goto L78
            long r12 = r0.end
        L53:
            java.util.List r0 = r18.rv0()
            if (r0 == 0) goto L75
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch$SearchHorizontalTab r0 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch.SearchHorizontalTab) r0
            if (r0 == 0) goto L75
            long r0 = r0.start
        L63:
            long r12 = r12 - r0
            r0 = 1
            long r12 = r12 + r0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r16 = 0
            r17 = 1024(0x400, float:1.435E-42)
            r14 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17)
            return r3
        L75:
            r0 = 0
            goto L63
        L78:
            r12 = 0
            goto L53
        L7b:
            r10 = 0
            goto L43
        L7e:
            r9 = r0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM.qv0(X.Jko, int, X.Jq0, java.lang.String):X.Jko");
    }
}
