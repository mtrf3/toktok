package com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel;

import X.A2G;
import X.C210408No;
import X.C211998Tr;
import X.C223078pD;
import X.C223088pE;
import X.C223128pI;
import X.C32I;
import X.C33Q;
import X.C47261Igj;
import X.C54838Lfe;
import X.C61878OQg;
import X.C87783cU;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.KQA;
import X.M89;
import X.ORZ;
import X.X1D;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGuideCardViewModel extends BaseDetailShareVM<C87783cU, InterfaceC57784Mm4, Long> {
    public static final /* synthetic */ int LJLJI = 0;
    public volatile Aweme LJLIL;
    public volatile Aweme LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        return -1;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C87783cU(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        String str;
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getAwemeList(), curInsertAweme = ");
        Aweme aweme = this.LJLILLLLZI;
        List<Aweme> list = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 == null) {
            return super.getAwemeList();
        }
        String aid = aweme2.getAid();
        if (aid == null) {
            return super.getAwemeList();
        }
        synchronized (C223088pE.LIZ) {
            C223128pI c223128pI = (C223128pI) C223088pE.LIZ().get(aid);
            if (c223128pI != null && c223128pI.LIZ == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                List<C223078pD> list2 = c223128pI.LIZLLL;
                ArrayList arrayList = new ArrayList();
                Iterator<C223078pD> it = list2.iterator();
                while (it.hasNext()) {
                    Aweme awemeFromItem = getAwemeFromItem(it.next());
                    if (awemeFromItem != null) {
                        arrayList.add(awemeFromItem);
                    }
                }
                List<Aweme> LLJILJILJ = ORZ.LLJILJILJ(arrayList);
                if (!((ArrayList) LLJILJILJ).isEmpty()) {
                    list = LLJILJILJ;
                }
                if (list == null) {
                    Aweme aweme3 = this.LJLIL;
                    if (aweme3 != null) {
                        list = C47261Igj.LJJIJIL(aweme3);
                    } else {
                        list = new ArrayList<>();
                    }
                }
            } else {
                Aweme aweme4 = this.LJLIL;
                if (aweme4 != null) {
                    list = C47261Igj.LJJIJIL(aweme4);
                } else {
                    list = new ArrayList<>();
                }
            }
        }
        return list;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<InterfaceC57784Mm4> listGetAll() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("listGetAll(), curInsertAweme = ");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        return getItemList((C87783cU) getVmDispatcher().getState());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        String aid;
        super.onCleared();
        C223088pE c223088pE = C223088pE.LIZ;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
            synchronized (c223088pE) {
            }
            ((HashMap) C223088pE.LIZJ.getValue()).remove(aid);
        }
        this.LJLILLLLZI = null;
        this.LJLIL = null;
    }

    public static List iv0(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!C54838Lfe.LJIJI((Aweme) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C223078pD((Aweme) it.next()));
        }
        return ORZ.LLJILJILJ(arrayList2);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        if (!C211998Tr.LIZ()) {
            super.bindView(detailFragmentPanel);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(InterfaceC57784Mm4 item) {
        o.LJIIIZ(item, "item");
        if (!(item instanceof C223078pD)) {
            return null;
        }
        C223078pD c223078pD = (C223078pD) item;
        if (C54838Lfe.LJIJI(c223078pD.LJLIL)) {
            return null;
        }
        return c223078pD.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    /* renamed from: gv0, reason: merged with bridge method [inline-methods] */
    public final List<InterfaceC57784Mm4> getItemList(C87783cU state) {
        String str;
        boolean z;
        o.LJIIIZ(state, "state");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getItemList(), curInsertAweme = ");
        Aweme aweme = this.LJLILLLLZI;
        List<C223078pD> list = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 == null) {
            return super.getItemList(state);
        }
        String aid = aweme2.getAid();
        if (aid == null) {
            return super.getItemList(state);
        }
        synchronized (C223088pE.LIZ) {
            C223128pI c223128pI = (C223128pI) C223088pE.LIZ().get(aid);
            if (c223128pI != null && c223128pI.LIZ == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                List<C223078pD> list2 = c223128pI.LIZLLL;
                if (true ^ list2.isEmpty()) {
                    list = list2;
                }
                if (list == null) {
                    Aweme aweme3 = this.LJLIL;
                    if (aweme3 != null) {
                        list = C47261Igj.LJJIJ(new C223078pD(aweme3));
                    } else {
                        list = C61878OQg.INSTANCE;
                    }
                }
            } else {
                Aweme aweme4 = this.LJLIL;
                if (aweme4 != null) {
                    list = C47261Igj.LJJIJ(new C223078pD(aweme4));
                } else {
                    list = C61878OQg.INSTANCE;
                }
            }
        }
        return list;
    }

    public final void jv0(Aweme aweme) {
        String aid;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return;
        }
        synchronized (C223088pE.LIZ) {
            C223128pI c223128pI = (C223128pI) C223088pE.LIZ().get(aid);
            if (c223128pI == null) {
                return;
            }
            int i = c223128pI.LIZ;
            boolean z = true;
            if (i == 1) {
                z = false;
            }
            if (z) {
                manualListRefresh();
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 200));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return hv0(0L, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r5 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae A[Catch: all -> 0x010e, TryCatch #1 {all -> 0x010e, blocks: (B:77:0x000e, B:79:0x0014, B:73:0x001c, B:15:0x0051, B:17:0x0055, B:20:0x0064, B:22:0x0070, B:25:0x0077, B:26:0x008b, B:29:0x0091, B:31:0x00ae, B:32:0x00b6, B:34:0x00d5, B:36:0x00e5, B:37:0x00e9, B:39:0x00ee, B:40:0x00f3, B:42:0x00fb, B:43:0x00ff, B:45:0x0107, B:48:0x003a, B:49:0x003c, B:53:0x0049, B:56:0x004d, B:61:0x010c, B:62:0x010d, B:72:0x002a, B:75:0x0022, B:51:0x003d, B:55:0x004b), top: B:76:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5 A[Catch: all -> 0x010e, TryCatch #1 {all -> 0x010e, blocks: (B:77:0x000e, B:79:0x0014, B:73:0x001c, B:15:0x0051, B:17:0x0055, B:20:0x0064, B:22:0x0070, B:25:0x0077, B:26:0x008b, B:29:0x0091, B:31:0x00ae, B:32:0x00b6, B:34:0x00d5, B:36:0x00e5, B:37:0x00e9, B:39:0x00ee, B:40:0x00f3, B:42:0x00fb, B:43:0x00ff, B:45:0x0107, B:48:0x003a, B:49:0x003c, B:53:0x0049, B:56:0x004d, B:61:0x010c, B:62:0x010d, B:72:0x002a, B:75:0x0022, B:51:0x003d, B:55:0x004b), top: B:76:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3 A[Catch: all -> 0x010e, TryCatch #1 {all -> 0x010e, blocks: (B:77:0x000e, B:79:0x0014, B:73:0x001c, B:15:0x0051, B:17:0x0055, B:20:0x0064, B:22:0x0070, B:25:0x0077, B:26:0x008b, B:29:0x0091, B:31:0x00ae, B:32:0x00b6, B:34:0x00d5, B:36:0x00e5, B:37:0x00e9, B:39:0x00ee, B:40:0x00f3, B:42:0x00fb, B:43:0x00ff, B:45:0x0107, B:48:0x003a, B:49:0x003c, B:53:0x0049, B:56:0x004d, B:61:0x010c, B:62:0x010d, B:72:0x002a, B:75:0x0022, B:51:0x003d, B:55:0x004b), top: B:76:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003a A[Catch: all -> 0x010e, TryCatch #1 {all -> 0x010e, blocks: (B:77:0x000e, B:79:0x0014, B:73:0x001c, B:15:0x0051, B:17:0x0055, B:20:0x0064, B:22:0x0070, B:25:0x0077, B:26:0x008b, B:29:0x0091, B:31:0x00ae, B:32:0x00b6, B:34:0x00d5, B:36:0x00e5, B:37:0x00e9, B:39:0x00ee, B:40:0x00f3, B:42:0x00fb, B:43:0x00ff, B:45:0x0107, B:48:0x003a, B:49:0x003c, B:53:0x0049, B:56:0x004d, B:61:0x010c, B:62:0x010d, B:72:0x002a, B:75:0x0022, B:51:0x003d, B:55:0x004b), top: B:76:0x000e, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.A2G hv0(long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardViewModel.hv0(long, boolean):X.A2G");
    }

    public final void kv0(Aweme aweme, String str) {
        String str2;
        String aid;
        Aweme LIZJ = C210408No.LIZJ(aweme);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateAndFetchInsertAweme, key = ");
        if (LIZJ != null) {
            str2 = LIZJ.getAid();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(", from = ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI = LIZJ;
        if (LIZJ != null && (aid = LIZJ.getAid()) != null) {
            synchronized (C223088pE.LIZ) {
                if (!C223088pE.LIZ().containsKey(aid)) {
                    C223088pE.LIZ().put(aid, new C223128pI(null));
                }
            }
        }
        jv0(LIZJ);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return hv0(((Number) obj).longValue(), false);
    }

    public static void lv0(Aweme aweme, int i, StoryGetFeedByPageResponse storyGetFeedByPageResponse, Boolean bool) {
        String aid;
        Collection<? extends C223078pD> collection;
        List<C223078pD> arrayList;
        String str = null;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return;
        }
        synchronized (C223088pE.LIZ) {
            C223128pI c223128pI = (C223128pI) C223088pE.LIZ().get(aid);
            if (c223128pI == null) {
                return;
            }
            if (c223128pI.LIZ != 2 || (i != 1 && i != 3)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateRequestStatus, key = ");
                if (aweme != null) {
                    str = aweme.getAid();
                }
                LIZ.append(str);
                LIZ.append(", itemStatus = ");
                LIZ.append(i);
                X1D.LIZIZ(LIZ);
                c223128pI.LIZ = i;
                if (storyGetFeedByPageResponse == null || bool == null) {
                    return;
                }
                boolean booleanValue = bool.booleanValue();
                c223128pI.LIZJ = storyGetFeedByPageResponse.getHasMore();
                c223128pI.LIZIZ = storyGetFeedByPageResponse.getCursor();
                if (booleanValue) {
                    List<Aweme> awemes = storyGetFeedByPageResponse.getAwemes();
                    if (awemes != null) {
                        arrayList = iv0(awemes);
                    } else {
                        arrayList = new ArrayList<>();
                    }
                    c223128pI.LIZLLL = arrayList;
                } else {
                    List<C223078pD> list = c223128pI.LIZLLL;
                    List<Aweme> awemes2 = storyGetFeedByPageResponse.getAwemes();
                    if (awemes2 != null) {
                        collection = iv0(awemes2);
                    } else {
                        collection = C61878OQg.INSTANCE;
                    }
                    list.addAll(collection);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        String str;
        long valueOf;
        o.LJIIIZ(feedParam, "feedParam");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (str == null) {
            return 0L;
        }
        synchronized (C223088pE.LIZ) {
            C223128pI c223128pI = (C223128pI) C223088pE.LIZ().get(str);
            if (c223128pI == null) {
                valueOf = 0L;
            } else {
                valueOf = Long.valueOf(c223128pI.LIZIZ);
            }
        }
        return valueOf;
    }
}
