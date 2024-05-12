package com.ss.android.ugc.aweme.inbox.widget.multi.vm;

import X.A2F;
import X.A2G;
import X.A2H;
import X.C116074h1;
import X.C116094h3;
import X.C116144h8;
import X.C116324hQ;
import X.C116334hR;
import X.C116344hS;
import X.C116354hT;
import X.C116384hW;
import X.C221018lt;
import X.C221108m2;
import X.C33Q;
import X.C3AL;
import X.C3B2;
import X.C3B3;
import X.C3BA;
import X.C3GF;
import X.C47135Ieh;
import X.C53117Ksz;
import X.C53548Kzw;
import X.C54838Lfe;
import X.C57001MYr;
import X.C57005MYv;
import X.C61878OQg;
import X.C62822Ol8;
import X.C72808Sho;
import X.C8HZ;
import X.EnumC112364b2;
import X.FMX;
import X.InterfaceC116174hB;
import X.InterfaceC222838op;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.InterfaceC80823Fe;
import X.L1Y;
import X.L2R;
import X.M89;
import X.MKT;
import X.MZ1;
import X.OSZ;
import X.X1D;
import X.XKQ;
import Y.AObserverS68S0300000_9;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS12S0201000_9;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.IInboxTopHorizontalListVM;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.InboxHorizontalListState;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import defpackage.n0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS58S0201000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxTopHorizontalListVM extends IInboxTopHorizontalListVM implements InterfaceC222838op {
    public InboxHorizontalTopListCombinePod LJLLI;
    public HashSet<String> LJLLILLLL;
    public HashSet<String> LJLLJ;
    public Aweme LJLLLL;
    public boolean LJZI;
    public boolean LJZL;
    public final int LLD;
    public XKQ LLF;
    public final long LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public Long LLI;
    public int LLIFFJFJJ;
    public boolean LLII;
    public MKT LLIIII;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C57001MYr.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C57005MYv.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C116384hW.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C116334hR.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C116354hT.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C116344hS.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C116324hQ.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(MZ1.LJLIL);
    public final Set<String> LJLJLLL = new LinkedHashSet();
    public final HashSet<String> LJLL = new HashSet<>();
    public boolean LJLLL = true;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<LiveData<ActivityStatus>>> LJLLLLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<InterfaceC80823Fe>> LJLZ = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<C116144h8> LJZ = new CopyOnWriteArrayList<>();
    public final AtomicInteger LL = new AtomicInteger(0);

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.IInboxTopHorizontalListVM, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new InboxHorizontalListState(null, null, null, null, null, 31, null);
    }

    public final IStoryInboxService lv0() {
        return (IStoryInboxService) this.LJLILLLLZI.getValue();
    }

    public final boolean mv0() {
        List<InterfaceC57784Mm4> list;
        C72808Sho<InterfaceC57784Mm4> state;
        MKT mkt = this.LLIIII;
        if (mkt != null && (state = mkt.getState()) != null) {
            list = state.LJII();
        } else {
            list = null;
        }
        if (list == null || list.isEmpty() || this.LJLL.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        if (!C53117Ksz.LJFF || this.LLFZ) {
            return;
        }
        this.LLFZ = true;
        ((InterfaceC116174hB) this.LJLJL.getValue()).LIZ().observe(this, new AObserverS77S0100000_9(this, 93));
    }

    public final void sv0() {
        Iterator LIZLLL = C47135Ieh.LIZLLL(this.LJLLLLLL, "userLiveDataListMap.values");
        while (LIZLLL.hasNext()) {
            CopyOnWriteArrayList list = (CopyOnWriteArrayList) LIZLLL.next();
            o.LJIIIIZZ(list, "list");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((LiveData) it.next()).removeObservers(this);
            }
        }
        CopyOnWriteArrayList<LiveData<ActivityStatus>> copyOnWriteArrayList = this.LJLLLLLL.get(Integer.valueOf(this.LLIFFJFJJ));
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        if (((Boolean) this.LJLJJI.getValue()).booleanValue()) {
            Iterator LIZLLL2 = C47135Ieh.LIZLLL(this.LJLZ, "userObserverListMap.values");
            while (LIZLLL2.hasNext()) {
                CopyOnWriteArrayList list2 = (CopyOnWriteArrayList) LIZLLL2.next();
                o.LJIIIIZZ(list2, "list");
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    InterfaceC80823Fe it3 = (InterfaceC80823Fe) it2.next();
                    C3GF c3gf = (C3GF) this.LJLJJL.getValue();
                    o.LJIIIIZZ(it3, "it");
                    c3gf.LJIIJ(it3);
                }
            }
            CopyOnWriteArrayList<InterfaceC80823Fe> copyOnWriteArrayList2 = this.LJLZ.get(Integer.valueOf(this.LLIFFJFJJ));
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.clear();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.IInboxTopHorizontalListVM
    public final void tryLogStoryCreationShow() {
        if (!this.LJLLL) {
            return;
        }
        FMX.LJIILL("story_creation_cell_show", new OSZ("notification_page", "enter_from"));
        this.LJLLL = false;
    }

    public InboxTopHorizontalListVM() {
        C3AL.LIZ.getClass();
        this.LLD = C3AL.LIZ().num_of_inbox_sky_light_status_limit_count;
        this.LLFF = 500L;
        this.LLIFFJFJJ = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0144, code lost:
    
        if (r1 == (-1)) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0146, code lost:
    
        if (r5 == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0148, code lost:
    
        r1 = r4.listIterator(r4.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0154, code lost:
    
        if (r1.hasPrevious() == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015c, code lost:
    
        if ((r1.previous() instanceof com.ss.android.ugc.aweme.story.inbox.StoryInboxItem) == false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x015e, code lost:
    
        r1 = r1.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x017e, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0164, code lost:
    
        if (r2 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0166, code lost:
    
        r2 = r4.iterator();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016f, code lost:
    
        if (r2.hasNext() == false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0177, code lost:
    
        if ((r2.next() instanceof com.ss.android.ugc.aweme.story.inbox.StoryInboxItem) == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x017b, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0162, code lost:
    
        if (r1 == (-1)) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        if (r1 == (-1)) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        r1 = r4.listIterator(r4.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r1.hasPrevious() == false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        if ((r1.previous() instanceof com.ss.android.ugc.aweme.story.inbox.StoryInboxItem) == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        r1 = r1.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b5, code lost:
    
        if (r1 == (-1)) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x009c, code lost:
    
        if (r1 == (-1)) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f8, code lost:
    
        if (r1 == (-1)) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int kv0() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM.kv0():int");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(InterfaceC57784Mm4 item) {
        o.LJIIIZ(item, "item");
        if (!(item instanceof StoryInboxItem)) {
            return null;
        }
        StoryInboxItem storyInboxItem = (StoryInboxItem) item;
        if (C54838Lfe.LJIJI(storyInboxItem.getStoryCollection())) {
            return null;
        }
        return storyInboxItem.getStoryCollection();
    }

    public final boolean hv0(int i) {
        if (i == this.LLIFFJFJJ) {
            return true;
        }
        return false;
    }

    public final int iv0(C116144h8 c116144h8) {
        C116144h8 c116144h82;
        try {
            int indexOf = this.LJZ.indexOf(c116144h8);
            if (indexOf <= 0) {
                return kv0();
            }
            List<C116144h8> subList = this.LJZ.subList(0, indexOf);
            o.LJIIIIZZ(subList, "rawDmListSource.subList(0, dataRank)");
            ListIterator<C116144h8> listIterator = subList.listIterator(subList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    c116144h82 = listIterator.previous();
                    if (c116144h82.LJLILLLLZI) {
                        break;
                    }
                } else {
                    c116144h82 = null;
                    break;
                }
            }
            C116144h8 c116144h83 = c116144h82;
            if (c116144h83 == null) {
                return kv0();
            }
            return Math.max(listIndexOf((InboxTopHorizontalListVM) c116144h83) + 1, kv0());
        } catch (Exception unused) {
            return kv0();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.IInboxTopHorizontalListVM
    public final void markItemClicked(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof StoryInboxItem) {
            this.LJLLLL = ((StoryInboxItem) interfaceC57784Mm4).getStoryCollection();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.IInboxTopHorizontalListVM
    public final void markItemDeleted(InterfaceC57784Mm4 interfaceC57784Mm4) {
        withState(new AqS175S0100000_9(this, 107));
        setState(new AqS175S0100000_9(interfaceC57784Mm4, 108));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 109));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object nv0(X.InterfaceC67352kd<? super java.util.List<X.C116144h8>> r10) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM.nv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r34) {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM.onRefresh(X.2kd):java.lang.Object");
    }

    public final void qv0(final C116144h8 c116144h8) {
        if (!((Boolean) this.LJLJJI.getValue()).booleanValue()) {
            return;
        }
        InterfaceC80823Fe interfaceC80823Fe = new InterfaceC80823Fe() { // from class: X.4hP
            @Override // X.InterfaceC80823Fe
            public final void LIZ(IMUser iMUser) {
                if (iMUser != null && InboxTopHorizontalListVM.this.listIndexOf((InboxTopHorizontalListVM) c116144h8) >= 0) {
                    C116144h8 c116144h82 = c116144h8;
                    if (c116144h82.LJLILLLLZI && o.LJ(iMUser, c116144h82.LJLIL)) {
                        InboxTopHorizontalListVM.this.listSetItem((InboxTopHorizontalListVM) new C116144h8(iMUser, c116144h8.LJLILLLLZI, 12));
                    }
                }
            }
        };
        C3GF c3gf = (C3GF) this.LJLJJL.getValue();
        String uid = c116144h8.LJLIL.getUid();
        if (uid == null) {
            uid = "";
        }
        c3gf.LJI(uid, interfaceC80823Fe);
        CopyOnWriteArrayList<InterfaceC80823Fe> copyOnWriteArrayList = this.LJLZ.get(Integer.valueOf(this.LLIFFJFJJ));
        if (copyOnWriteArrayList == null) {
            this.LJLZ.put(Integer.valueOf(this.LLIFFJFJJ), new CopyOnWriteArrayList<>());
            copyOnWriteArrayList = this.LJLZ.get(Integer.valueOf(this.LLIFFJFJJ));
            if (copyOnWriteArrayList == null) {
                return;
            }
        }
        copyOnWriteArrayList.add(interfaceC80823Fe);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.IInboxTopHorizontalListVM
    public final boolean shouldLogCellShow(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof StoryInboxItem)) {
            return false;
        }
        String LJIIIIZZ = C54838Lfe.LJIIIIZZ(((StoryInboxItem) interfaceC57784Mm4).getStoryCollection());
        if (this.LJLJLLL.contains(LJIIIIZZ)) {
            return false;
        }
        this.LJLJLLL.add(LJIIIIZZ);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int jv0(int i, Aweme aweme) {
        StoryInboxItem storyInboxItem;
        Aweme storyCollection;
        String LJIIIIZZ = C54838Lfe.LJIIIIZZ(aweme);
        ITEM listGetAt = listGetAt(i);
        String str = null;
        if ((listGetAt instanceof StoryInboxItem) && (storyInboxItem = (StoryInboxItem) listGetAt) != null && (storyCollection = storyInboxItem.getStoryCollection()) != null) {
            str = C54838Lfe.LJIIIIZZ(storyCollection);
        }
        if (o.LJ(LJIIIIZZ, str)) {
            return i;
        }
        List<ITEM> listGetAll = listGetAll();
        if (listGetAll != 0) {
            int i2 = 0;
            for (ITEM item : listGetAll) {
                if ((item instanceof StoryInboxItem) && o.LJ(C54838Lfe.LJIIIIZZ(((StoryInboxItem) item).getStoryCollection()), C54838Lfe.LJIIIIZZ(aweme))) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void listAddItemAt(int i, InterfaceC57784Mm4 element) {
        Boolean bool;
        MKT mkt;
        o.LJIIIZ(element, "element");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiViewModel vh: ");
        LIZ.append(this.LLIFFJFJJ);
        LIZ.append(" vm listAddItemAt: isFixed = ");
        LIZ.append(C53548Kzw.LIZ());
        LIZ.append(", isComputing = ");
        MKT mkt2 = this.LLIIII;
        if (mkt2 != null) {
            bool = Boolean.valueOf(mkt2.LJJJLL());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        C221018lt.LJFF("InboxTopVM", X1D.LIZIZ(LIZ));
        if (C53548Kzw.LIZ() && (mkt = this.LLIIII) != null && mkt.LJJJLL()) {
            MKT mkt3 = this.LLIIII;
            if (mkt3 != null) {
                mkt3.post(new ARunnableS12S0201000_9(i, element, this, 5));
                return;
            }
            return;
        }
        super.listAddItemAt(i, (int) element);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        A2H LIZ;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod;
        long longValue = ((Number) obj).longValue();
        try {
            if (((Boolean) n0.LIZ.getValue()).booleanValue() && (inboxHorizontalTopListCombinePod = this.LJLLI) != null && inboxHorizontalTopListCombinePod.isLoading && longValue <= 0) {
                C221018lt.LJFF("InboxTopVM", "forbid loadMore in loading state");
                A2F a2f = A2G.LIZ;
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                a2f.getClass();
                LIZ = A2F.LIZ(c61878OQg);
            } else {
                A2F a2f2 = A2G.LIZ;
                C61878OQg c61878OQg2 = C61878OQg.INSTANCE;
                a2f2.getClass();
                LIZ = A2F.LIZ(c61878OQg2);
            }
            return LIZ;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("vh: ");
            LIZ2.append(this.LLIFFJFJJ);
            LIZ2.append(" vm onLoadMore fail: ");
            LIZ2.append(e);
            C221018lt.LIZIZ("InboxTopVM", X1D.LIZIZ(LIZ2));
            A2G.LIZ.getClass();
            return A2F.LIZJ(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C116144h8> ov0(java.util.List<X.C116144h8> r8, java.util.List<java.lang.String> r9) {
        /*
            r7 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r8.iterator()
        L9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r2 = r6.next()
            r0 = r2
            X.4h8 r0 = (X.C116144h8) r0
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r0.LJLIL
            java.lang.String r1 = r0.getUid()
            java.util.HashSet<java.lang.String> r0 = r7.LJLLILLLL
            r5 = 0
            java.lang.String r4 = "displayedUidSet"
            if (r0 == 0) goto L42
            boolean r0 = X.L1Y.LIZJ()
            r0 = r0 ^ 1
            if (r0 == 0) goto L42
            boolean r0 = X.C54838Lfe.LJIIJJI(r1)
            if (r0 != 0) goto L9
            boolean r0 = r9.contains(r1)
            if (r0 != 0) goto L9
        L37:
            java.util.HashSet<java.lang.String> r0 = r7.LJLLILLLL
            if (r0 == 0) goto L6d
            r0.add(r1)
            r3.add(r2)
            goto L9
        L42:
            java.util.HashSet<java.lang.String> r0 = r7.LJLLILLLL
            if (r0 == 0) goto L5f
            boolean r0 = X.L1Y.LIZJ()
            r0 = r0 ^ 1
            if (r0 != 0) goto L5f
            boolean r0 = X.C54838Lfe.LJIIJJI(r1)
            if (r0 != 0) goto L9
            java.util.HashSet<java.lang.String> r0 = r7.LJLLILLLL
            if (r0 == 0) goto L71
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L9
            goto L37
        L5f:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r7.LJLLILLLL = r0
            boolean r0 = X.C54838Lfe.LJIIJJI(r1)
            if (r0 != 0) goto L9
            goto L37
        L6d:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L71:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L75:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM.ov0(java.util.List, java.util.List):java.util.List");
    }

    public final void pv0(C116144h8 c116144h8, C72808Sho<InterfaceC57784Mm4> c72808Sho) {
        C3B2 c3b2 = (C3B2) this.LJLJJLL.getValue();
        String uid = c116144h8.LJLIL.getUid();
        o.LJIIIIZZ(uid, "item.contact.uid");
        LiveData<ActivityStatus> LIZ = C3B3.LIZ(c3b2, uid, C3BA.INBOX, EnumC112364b2.INBOX_TOP.getValue(), 2);
        LIZ.observe(this, new AObserverS68S0300000_9(this, c116144h8, c72808Sho, 0));
        CopyOnWriteArrayList<LiveData<ActivityStatus>> copyOnWriteArrayList = this.LJLLLLLL.get(Integer.valueOf(this.LLIFFJFJJ));
        if (copyOnWriteArrayList == null) {
            this.LJLLLLLL.put(Integer.valueOf(this.LLIFFJFJJ), new CopyOnWriteArrayList<>());
            copyOnWriteArrayList = this.LJLLLLLL.get(Integer.valueOf(this.LLIFFJFJJ));
            if (copyOnWriteArrayList == null) {
                return;
            }
        }
        copyOnWriteArrayList.add(LIZ);
    }

    @Override // X.InterfaceC222838op
    public final void qN(int i, Aweme aweme) {
        setState(new AqS58S0201000_9(aweme, i, this, 4));
    }

    public static final /* synthetic */ void gv0(InboxTopHorizontalListVM inboxTopHorizontalListVM, int i, InterfaceC57784Mm4 interfaceC57784Mm4) {
        super.listAddItemAt(i, (int) interfaceC57784Mm4);
    }

    public final void rv0(C116144h8 c116144h8, C72808Sho<InterfaceC57784Mm4> c72808Sho, boolean z) {
        HashSet<String> hashSet;
        String str;
        User user;
        if (c72808Sho == null) {
            return;
        }
        if (((Boolean) L2R.LIZIZ.getValue()).booleanValue()) {
            ArrayList arrayList = (ArrayList) c72808Sho.LJII();
            if (!arrayList.contains(c116144h8) && !z) {
                return;
            }
            String uid = c116144h8.LJLIL.getUid();
            HashSet<String> hashSet2 = this.LJLLILLLL;
            if (hashSet2 != null && hashSet2.contains(uid)) {
                Iterator it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it.next();
                    if (interfaceC57784Mm4 instanceof C116094h3) {
                        C116074h1 c116074h1 = (C116074h1) interfaceC57784Mm4;
                        if (c116074h1.LJLIL.getBizType() != 1) {
                            continue;
                        } else {
                            CustomBizData customBizData = c116074h1.LJLIL.getCustomBizData();
                            if (customBizData != null && (user = customBizData.getUser()) != null) {
                                str = user.getUid();
                            } else {
                                str = null;
                            }
                            if (o.LJ(str, uid)) {
                                if (i != -1) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("list items size: ");
                                    LIZ.append(arrayList.size());
                                    LIZ.append(", remove friend index: ");
                                    LIZ.append(i);
                                    C221018lt.LJFF("InboxTopVM", X1D.LIZIZ(LIZ));
                                    try {
                                        if (z) {
                                            c72808Sho.LJIILIIL(i);
                                        } else {
                                            listRemoveItemAt(i);
                                        }
                                    } catch (Exception e) {
                                        C221018lt.LIZLLL("InboxTopVM", e);
                                    }
                                }
                            }
                        }
                    }
                    i++;
                }
            }
        }
        if (!L1Y.LIZJ()) {
            ArrayList arrayList2 = (ArrayList) c72808Sho.LJII();
            if (!arrayList2.contains(c116144h8) && !z) {
                return;
            }
            String uid2 = c116144h8.LJLIL.getUid();
            HashSet<String> hashSet3 = this.LJLLILLLL;
            if (hashSet3 != null && hashSet3.contains(uid2)) {
                Iterator it2 = arrayList2.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    InterfaceC57784Mm4 interfaceC57784Mm42 = (InterfaceC57784Mm4) it2.next();
                    if ((interfaceC57784Mm42 instanceof StoryInboxItem) && o.LJ(C54838Lfe.LJIIIIZZ(((StoryInboxItem) interfaceC57784Mm42).getStoryCollection()), uid2)) {
                        if (i2 != -1) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("list items size: ");
                            LIZ2.append(arrayList2.size());
                            LIZ2.append(", remove story index: ");
                            LIZ2.append(i2);
                            C221018lt.LJFF("InboxTopVM", X1D.LIZIZ(LIZ2));
                            try {
                                if (!z) {
                                    listRemoveItemAt(i2);
                                } else {
                                    c72808Sho.LJIILIIL(i2);
                                }
                                HashSet<String> hashSet4 = this.LJLLJ;
                                if (hashSet4 != null && hashSet4.contains(uid2) && (hashSet = this.LJLLJ) != null) {
                                    hashSet.remove(uid2);
                                    return;
                                }
                                return;
                            } catch (Exception e2) {
                                C221018lt.LIZLLL("InboxTopVM", e2);
                                return;
                            }
                        }
                        return;
                    }
                    i2++;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return -1L;
    }
}
