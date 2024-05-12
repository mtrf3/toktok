package com.ss.android.ugc.aweme.inbox.skylight.plat;

import X.A2F;
import X.A2G;
import X.A2H;
import X.C116114h5;
import X.C116124h6;
import X.C221018lt;
import X.C33Q;
import X.C53548Kzw;
import X.C54838Lfe;
import X.C56986MYc;
import X.C61262ao;
import X.C61878OQg;
import X.C8HZ;
import X.EnumC56998MYo;
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
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.FriendPostBean;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import defpackage.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS58S0201000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SkylightMediaListViewModel extends BaseDetailShareVM<InboxSkylightListState, InterfaceC57784Mm4, Long> implements LJT, InterfaceC222838op {
    public InboxHorizontalTopListCombinePod LJLJJI;
    public Aweme LJLJJLL;
    public Long LJLJL;
    public boolean LJLJLLL;
    public MKT LJLL;
    public final C56986MYc LJLIL = new C56986MYc(this);
    public final Set<String> LJLILLLLZI = new LinkedHashSet();
    public final Set<String> LJLJI = new LinkedHashSet();
    public boolean LJLJJL = true;
    public int LJLJLJ = -1;
    public final XJO LJLLI = XJR.LIZ();

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(InterfaceC57784Mm4 item) {
        o.LJIIIZ(item, "item");
        return null;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new InboxSkylightListState(null, null, null, null, null, 31, null);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        C116124h6 c116124h6;
        List<FriendPostBean> list;
        Object obj;
        List<Aweme> aweme;
        ArrayList arrayList = new ArrayList();
        List<InterfaceC57784Mm4> listItemState = ((InboxSkylightListState) getVmDispatcher().getState()).getListItemState();
        if (listItemState != null) {
            for (InterfaceC57784Mm4 interfaceC57784Mm4 : listItemState) {
                if (interfaceC57784Mm4 instanceof StoryInboxItem) {
                    StoryInboxItem storyInboxItem = (StoryInboxItem) interfaceC57784Mm4;
                    if (!C54838Lfe.LJIJI(storyInboxItem.getStoryCollection())) {
                        arrayList.add(storyInboxItem.getStoryCollection());
                    }
                    C56986MYc c56986MYc = this.LJLIL;
                    String LJIIIIZZ = C54838Lfe.LJIIIIZZ(storyInboxItem.getStoryCollection());
                    c56986MYc.getClass();
                    Object obj2 = ((LinkedHashMap) c56986MYc.LJLJI).get(EnumC56998MYo.POST);
                    String str = null;
                    if ((obj2 instanceof C116124h6) && (c116124h6 = (C116124h6) obj2) != null && (list = c116124h6.LIZLLL) != null) {
                        Iterator it = ((ArrayList) list).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (o.LJ(String.valueOf(((FriendPostBean) obj).getUid()), LJIIIIZZ)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        FriendPostBean friendPostBean = (FriendPostBean) obj;
                        if (friendPostBean != null && (aweme = friendPostBean.getAweme()) != null) {
                            arrayList.addAll(aweme);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("add unread post");
                            Aweme aweme2 = (Aweme) ListProtector.get(aweme, 0);
                            if (aweme2 != null) {
                                str = aweme2.getAid();
                            }
                            LIZ.append(str);
                            LIZ.append(" to story");
                            LIZ.append(C54838Lfe.LJIIIIZZ(storyInboxItem.getStoryCollection()));
                            C221018lt.LIZIZ("SkylightVM", X1D.LIZIZ(LIZ));
                        }
                    }
                }
                if (interfaceC57784Mm4 instanceof C116114h5) {
                    arrayList.addAll(((C116114h5) interfaceC57784Mm4).LJLIL.LIZJ);
                }
            }
        }
        return arrayList;
    }

    public final InboxHorizontalTopListCombinePod jv0() {
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LJLJJI;
        if (inboxHorizontalTopListCombinePod != null) {
            return inboxHorizontalTopListCombinePod;
        }
        o.LJIJI("combinePod");
        throw null;
    }

    @Override // X.LJT
    public final void tryLogStoryCreationShow() {
        if (!this.LJLJJL) {
            return;
        }
        FMX.LJIILL("story_creation_cell_show", new OSZ("notification_page", "enter_from"));
        this.LJLJJL = false;
    }

    @Override // X.LJT
    public final List<InterfaceC57784Mm4> hm() {
        return listGetAll();
    }

    public final boolean hv0(int i) {
        if (i == this.LJLJLJ) {
            return true;
        }
        return false;
    }

    public final int iv0(Aweme aweme) {
        List<ITEM> listGetAll = listGetAll();
        if (listGetAll == 0) {
            return -1;
        }
        int i = 0;
        for (ITEM item : listGetAll) {
            if (item instanceof StoryInboxItem) {
                if (o.LJ(C54838Lfe.LJIIIIZZ(((StoryInboxItem) item).getStoryCollection()), C54838Lfe.LJIIIIZZ(aweme))) {
                    return i;
                }
                i++;
            } else {
                if (item instanceof C116114h5) {
                    C116114h5 c116114h5 = (C116114h5) item;
                    if (o.LJ(c116114h5.LJLIL.LIZ, aweme.getAuthorUid())) {
                        Iterator<Aweme> it = c116114h5.LJLIL.LIZJ.iterator();
                        int i2 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                if (o.LJ(it.next().getAid(), aweme.getAid())) {
                                    break;
                                }
                                i2++;
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        C61262ao c61262ao = c116114h5.LJLIL;
                        if (c61262ao.LIZIZ || i2 == c61262ao.LIZJ.size() - 1) {
                            C61262ao c61262ao2 = c116114h5.LJLIL;
                            c61262ao2.LIZIZ = true;
                            c61262ao2.LJ = 0;
                        } else {
                            if (!this.LJLJI.contains(aweme.getAid())) {
                                Set<String> set = this.LJLJI;
                                String aid = aweme.getAid();
                                o.LJIIIIZZ(aid, "aweme.aid");
                                set.add(aid);
                            }
                            Iterator<Aweme> it2 = c116114h5.LJLIL.LIZJ.iterator();
                            int i3 = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!this.LJLJI.contains(it2.next().getAid())) {
                                        break;
                                    }
                                    i3++;
                                } else {
                                    i3 = -1;
                                    break;
                                }
                            }
                            C61262ao c61262ao3 = c116114h5.LJLIL;
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            c61262ao3.LJ = i3;
                        }
                        return i;
                    }
                } else {
                    continue;
                }
                i++;
            }
        }
        return -1;
    }

    public final void kv0(boolean z) {
        if (this.LJLJLLL != z) {
            this.LJLJLLL = z;
            setState(new AqS14S0010000_9(z, 1));
        }
    }

    @Override // X.LJT
    public final void markItemClicked(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof StoryInboxItem) {
            this.LJLJJLL = ((StoryInboxItem) interfaceC57784Mm4).getStoryCollection();
        }
    }

    @Override // X.LJT
    public final void markItemDeleted(InterfaceC57784Mm4 interfaceC57784Mm4) {
        withState(new AqS175S0100000_9(this, 103));
        setState(new AqS175S0100000_9((StoryInboxItem) interfaceC57784Mm4, 104));
    }

    @Override // X.LJT
    public final void n80(StoryInboxItem storyInboxItem) {
        listRemoveItem((SkylightMediaListViewModel) storyInboxItem);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 105));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5 A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:12:0x009a, B:13:0x009d, B:15:0x00a5, B:16:0x00a8), top: B:11:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C56994MYk
            if (r0 == 0) goto L26
            r7 = r10
            X.MYk r7 = (X.C56994MYk) r7
            int r2 = r7.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r7.LJLJJL = r2
        L12:
            java.lang.Object r3 = r7.LJLJI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJL
            r2 = 2
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L3c
            if (r0 == r6) goto L34
            if (r0 != r2) goto L2c
            X.2xe r5 = r7.LJLILLLLZI
            com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel r1 = r7.LJLIL
            goto L9a
        L26:
            X.MYk r7 = new X.MYk
            r7.<init>(r9, r10)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.2xe r5 = r7.LJLILLLLZI
            com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel r1 = r7.LJLIL
            X.C141335gf.LIZJ(r3)
            goto L8b
        L3c:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod r0 = r9.LJLJJI
            if (r0 != 0) goto L52
            r9.kv0(r6)
            X.A2F r1 = X.A2G.LIZ
            X.OQg r0 = X.C61878OQg.INSTANCE
            r1.getClass()
            X.A2H r0 = X.A2F.LIZ(r0)
            return r0
        L52:
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod r0 = r9.jv0()
            boolean r0 = r0.isSkeleton
            if (r0 == 0) goto L76
            java.lang.String r1 = "InboxTopVM"
            java.lang.String r0 = "onRefresh in skeleton mode"
            X.C221018lt.LIZIZ(r1, r0)
            X.A2F r1 = X.A2G.LIZ
            X.Sho<ITEM extends X.Mm4> r0 = r9.state
            if (r0 == 0) goto L73
            java.util.List r0 = r0.LJII()
        L6b:
            r1.getClass()
            X.A2H r0 = X.A2F.LIZ(r0)
            return r0
        L73:
            X.OQg r0 = X.C61878OQg.INSTANCE
            goto L6b
        L76:
            X.MZ0 r0 = X.MZ0.LJLIL
            X.C57008MYy.LIZ(r0)
            X.XJO r5 = r9.LJLLI
            r7.LJLIL = r9
            r7.LJLILLLLZI = r5
            r7.LJLJJL = r6
            java.lang.Object r0 = r5.LIZ(r4, r7)
            if (r0 != r8) goto L8a
            return r8
        L8a:
            r1 = r9
        L8b:
            X.MYc r0 = r1.LJLIL     // Catch: java.lang.Throwable -> Lc6
            r7.LJLIL = r1     // Catch: java.lang.Throwable -> Lc6
            r7.LJLILLLLZI = r5     // Catch: java.lang.Throwable -> Lc6
            r7.LJLJJL = r2     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r3 = r0.LJIIIZ(r7)     // Catch: java.lang.Throwable -> Lc6
            if (r3 != r8) goto L9d
            goto Lc5
        L9a:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> Lc3
        L9d:
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Lc3
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto La8
            r1.kv0(r6)     // Catch: java.lang.Throwable -> Lc3
        La8:
            X.MLh r2 = X.C56652MLg.LIZIZ     // Catch: java.lang.Throwable -> Lc3
            r2.LIZ(r6)     // Catch: java.lang.Throwable -> Lc3
            X.MCw r1 = X.C56652MLg.LIZJ     // Catch: java.lang.Throwable -> Lc3
            r0 = 3
            r1.LIZ(r0)     // Catch: java.lang.Throwable -> Lc3
            r2.LIZJ()     // Catch: java.lang.Throwable -> Lc3
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Throwable -> Lc3
            r0.getClass()     // Catch: java.lang.Throwable -> Lc3
            X.A2H r0 = X.A2F.LIZ(r3)     // Catch: java.lang.Throwable -> Lc3
            r5.LIZIZ(r4)
            return r0
        Lc3:
            r0 = move-exception
            goto Lc7
        Lc5:
            return r8
        Lc6:
            r0 = move-exception
        Lc7:
            r5.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel.onRefresh(X.2kd):java.lang.Object");
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

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void listAddItemAt(int i, InterfaceC57784Mm4 element) {
        Boolean bool;
        MKT mkt;
        o.LJIIIZ(element, "element");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiViewModel vh: ");
        LIZ.append(this.LJLJLJ);
        LIZ.append(" vm listAddItemAt: isFixed = ");
        LIZ.append(C53548Kzw.LIZ());
        LIZ.append(", isComputing = ");
        MKT mkt2 = this.LJLL;
        if (mkt2 != null) {
            bool = Boolean.valueOf(mkt2.LJJJLL());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        C221018lt.LJFF("InboxTopVM", X1D.LIZIZ(LIZ));
        if (C53548Kzw.LIZ() && (mkt = this.LJLL) != null && mkt.LJJJLL()) {
            MKT mkt3 = this.LJLL;
            if (mkt3 != null) {
                mkt3.post(new ARunnableS12S0201000_9(i, element, this, 4));
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
            if (((Boolean) n0.LIZ.getValue()).booleanValue() && this.LJLJJI != null && jv0().isLoading && longValue <= 0) {
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
            LIZ2.append(this.LJLJLJ);
            LIZ2.append(" vm onLoadMore fail: ");
            LIZ2.append(e);
            C221018lt.LIZIZ("InboxTopVM", X1D.LIZIZ(LIZ2));
            A2G.LIZ.getClass();
            return A2F.LIZJ(e);
        }
    }

    @Override // X.InterfaceC222838op
    public final void qN(int i, Aweme aweme) {
        setState(new AqS58S0201000_9(i, aweme, this, 3));
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
