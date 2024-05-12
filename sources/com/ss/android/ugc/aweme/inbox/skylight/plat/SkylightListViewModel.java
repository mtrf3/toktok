package com.ss.android.ugc.aweme.inbox.skylight.plat;

import X.A2F;
import X.A2G;
import X.A2H;
import X.C221018lt;
import X.C33Q;
import X.C53548Kzw;
import X.C54838Lfe;
import X.C56987MYd;
import X.C61878OQg;
import X.C72808Sho;
import X.C8HZ;
import X.FMX;
import X.InterfaceC222838op;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.LJT;
import X.M89;
import X.MKT;
import X.OSZ;
import X.X1D;
import X.XJO;
import X.XJR;
import Y.ARunnableS12S0201000_9;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import defpackage.n0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS58S0201000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SkylightListViewModel extends BaseDetailShareVM<InboxSkylightListState, InterfaceC57784Mm4, Long> implements LJT, InterfaceC222838op {
    public InboxHorizontalTopListCombinePod LJLJI;
    public Aweme LJLJJL;
    public Long LJLJJLL;
    public boolean LJLJLJ;
    public MKT LJLJLLL;
    public final C56987MYd LJLIL = new C56987MYd(this);
    public final Set<String> LJLILLLLZI = new LinkedHashSet();
    public boolean LJLJJI = true;
    public int LJLJL = -1;
    public final XJO LJLL = XJR.LIZ();

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        return -1;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new InboxSkylightListState(null, null, null, null, null, 31, null);
    }

    public final InboxHorizontalTopListCombinePod jv0() {
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LJLJI;
        if (inboxHorizontalTopListCombinePod != null) {
            return inboxHorizontalTopListCombinePod;
        }
        o.LJIJI("combinePod");
        throw null;
    }

    public final boolean kv0() {
        C72808Sho<InterfaceC57784Mm4> state;
        List<InterfaceC57784Mm4> LJII;
        MKT mkt = this.LJLJLLL;
        if (mkt == null || (state = mkt.getState()) == null || (LJII = state.LJII()) == null || LJII.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.LJT
    public final void tryLogStoryCreationShow() {
        if (!this.LJLJJI) {
            return;
        }
        FMX.LJIILL("story_creation_cell_show", new OSZ("notification_page", "enter_from"));
        this.LJLJJI = false;
    }

    @Override // X.LJT
    public final List<InterfaceC57784Mm4> hm() {
        return listGetAll();
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
        if (i == this.LJLJL) {
            return true;
        }
        return false;
    }

    @Override // X.LJT
    public final void markItemClicked(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof StoryInboxItem) {
            this.LJLJJL = ((StoryInboxItem) interfaceC57784Mm4).getStoryCollection();
        }
    }

    @Override // X.LJT
    public final void markItemDeleted(InterfaceC57784Mm4 interfaceC57784Mm4) {
        withState(new AqS175S0100000_9(this, 100));
        setState(new AqS175S0100000_9((StoryInboxItem) interfaceC57784Mm4, 101));
    }

    @Override // X.LJT
    public final void n80(StoryInboxItem storyInboxItem) {
        listRemoveItem((SkylightListViewModel) storyInboxItem);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 102));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(8:(2:3|(11:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:23|24))(2:25|26))(2:34|(4:36|(1:38)|39|40)(2:41|(4:43|(1:45)(1:48)|46|47)(3:49|50|(1:52)(1:53))))|27|28|(2:30|31)|14|15|16|17))|27|28|(0)|14|15|16|17)|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        X.C221018lt.LIZIZ("SkylightVM", "exception: " + r0.getMessage());
        r2 = X.C56652MLg.LIZIZ;
        r2.LIZ(false);
        r1 = X.A2G.LIZ;
        r0 = X.C61878OQg.INSTANCE;
        r1.getClass();
        r1 = X.A2F.LIZ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        X.C56652MLg.LIZJ.LIZ(3);
        r2.LIZJ();
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r12) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    @Override // X.LJT
    public final boolean shouldLogCellShow(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof StoryInboxItem)) {
            return false;
        }
        String LJIIIIZZ = C54838Lfe.LJIIIIZZ(((StoryInboxItem) interfaceC57784Mm4).getStoryCollection());
        if (this.LJLILLLLZI.contains(LJIIIIZZ)) {
            return false;
        }
        this.LJLILLLLZI.add(LJIIIIZZ);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int iv0(int i, Aweme aweme) {
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
        LIZ.append(this.LJLJL);
        LIZ.append(" vm listAddItemAt: isFixed = ");
        LIZ.append(C53548Kzw.LIZ());
        LIZ.append(", isComputing = ");
        MKT mkt2 = this.LJLJLLL;
        if (mkt2 != null) {
            bool = Boolean.valueOf(mkt2.LJJJLL());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        C221018lt.LJFF("InboxTopVM", X1D.LIZIZ(LIZ));
        if (C53548Kzw.LIZ() && (mkt = this.LJLJLLL) != null && mkt.LJJJLL()) {
            MKT mkt3 = this.LJLJLLL;
            if (mkt3 != null) {
                mkt3.post(new ARunnableS12S0201000_9(i, element, this, 3));
                return;
            }
            return;
        }
        super.listAddItemAt(i, (int) element);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        A2H LIZ;
        long longValue = ((Number) obj).longValue();
        try {
            if (((Boolean) n0.LIZ.getValue()).booleanValue() && this.LJLJI != null && jv0().isLoading && longValue <= 0) {
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
            LIZ2.append(this.LJLJL);
            LIZ2.append(" vm onLoadMore fail: ");
            LIZ2.append(e);
            C221018lt.LIZIZ("InboxTopVM", X1D.LIZIZ(LIZ2));
            A2G.LIZ.getClass();
            return A2F.LIZJ(e);
        }
    }

    @Override // X.InterfaceC222838op
    public final void qN(int i, Aweme aweme) {
        setState(new AqS58S0201000_9(aweme, i, this, 2));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final /* bridge */ /* synthetic */ void listAddItemAt(int i, Object obj) {
        listAddItemAt(i, (int) obj);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return -1L;
    }
}
