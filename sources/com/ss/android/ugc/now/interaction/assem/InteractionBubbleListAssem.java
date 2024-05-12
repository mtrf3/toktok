package com.ss.android.ugc.now.interaction.assem;

import X.AbstractC72278SYg;
import X.AnonymousClass729;
import X.C0A2;
import X.C110614Vt;
import X.C116724i4;
import X.C16880lQ;
import X.C1799274i;
import X.C1806477c;
import X.C1806677e;
import X.C1806977h;
import X.C1812179h;
import X.C1812579l;
import X.C1812679m;
import X.C1812779n;
import X.C1812879o;
import X.C1812979p;
import X.C1813079q;
import X.C1813179r;
import X.C1813379t;
import X.C1813479u;
import X.C1813679w;
import X.C1813779x;
import X.C1813879y;
import X.C184077Kh;
import X.C187377Wz;
import X.C210228Mw;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C56412MCa;
import X.C57939MoZ;
import X.C62562cu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C71Y;
import X.C72808Sho;
import X.C77H;
import X.C78926UyI;
import X.C7A2;
import X.C7ML;
import X.C7MY;
import X.C7XD;
import X.C8W0;
import X.C8XO;
import X.C8YN;
import X.EnumC1813279s;
import X.InterfaceC194547kI;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.MWW;
import X.TBR;
import X.TBT;
import X.ViewTreeObserverOnScrollChangedListenerC1812479k;
import X.X1D;
import Y.ACListenerS38S0200000_3;
import Y.IDCListenerS114S0200000_3;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractionBubbleListAssem extends ReusedUISlotAssem<InteractionBubbleListAssem> implements C8XO<InterfaceC194547kI> {
    public static final /* synthetic */ int LLIIIL = 0;
    public final C214298b3 LLFF;
    public final C62822Ol8 LLFFF;
    public final C55749LuL LLFII;
    public final C214378bB LLFZ;
    public EnumC1813279s LLI;
    public final boolean LLIFFJFJJ;
    public final boolean LLII;
    public final ViewTreeObserverOnScrollChangedListenerC1812479k LLIIII;
    public C1806677e LLIIIILZ;
    public View LLIIIJ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.bak;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.79k] */
    public InteractionBubbleListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        boolean z;
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(InteractionBubbleListVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1367);
        C1813779x c1813779x = C1813779x.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        this.LLFF = new C214298b3(aqS153S0100000_3, c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), c1813779x, LIZ);
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1366));
        this.LLFII = new C55749LuL(C47704Ins.LIZJ(this, NowFeedMobHierarchyData.class, null), checkSupervisorPrepared());
        C65776Prg LIZ2 = C65352Pkq.LIZ(InteractionSyncVM.class);
        C1813879y c1813879y = C1813879y.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 1368);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LLFZ = new C214378bB(LIZ2, null, c214528bQ, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c1813879y, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LLI = EnumC1813279s.NONE;
        this.LLIFFJFJJ = C1806977h.LIZ();
        if ((((Number) C1806977h.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LLII = z;
        this.LLIIII = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.79k
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i;
                String str;
                Aweme aweme;
                if (InteractionBubbleListAssem.this.getContainerView().getVisibility() == 0) {
                    Rect rect = new Rect();
                    View containerView = InteractionBubbleListAssem.this.getContainerView();
                    if (containerView.isAttachedToWindow()) {
                        containerView.getGlobalVisibleRect(rect);
                    }
                    Context context = InteractionBubbleListAssem.this.getContext();
                    if (context != null) {
                        i = C63081OpJ.LJJJJJL(context);
                    } else {
                        i = 0;
                    }
                    if (rect.top < i * 1.0f && rect.bottom > 0.0f) {
                        View containerView2 = InteractionBubbleListAssem.this.getContainerView();
                        if (containerView2.isAttachedToWindow()) {
                            containerView2.getLocalVisibleRect(rect);
                        }
                        int LIZIZ = C7MY.LIZIZ(168);
                        if (LIZIZ < 0 || rect.bottom - rect.top != LIZIZ) {
                            return;
                        }
                        InteractionBubbleListAssem interactionBubbleListAssem = InteractionBubbleListAssem.this;
                        if (!interactionBubbleListAssem.LLIFFJFJJ) {
                            return;
                        }
                        InteractionBubbleListVM r4 = interactionBubbleListAssem.r4();
                        r4.getClass();
                        r4.setState(new AqS8S0010000_3(true, 40));
                        return;
                    }
                    C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(InteractionBubbleListAssem.this);
                    if (c7ml == null || (aweme = c7ml.getAweme()) == null || (str = aweme.getAid()) == null) {
                        str = "";
                    }
                    java.util.Map<String, java.util.Set<String>> map = C120974ov.LIZ;
                    if (map.containsKey(str)) {
                        map.remove(str);
                    }
                    InteractionBubbleListAssem interactionBubbleListAssem2 = InteractionBubbleListAssem.this;
                    if (!interactionBubbleListAssem2.LLIFFJFJJ) {
                        return;
                    }
                    InteractionBubbleListVM r42 = interactionBubbleListAssem2.r4();
                    r42.getClass();
                    r42.setState(new AqS8S0010000_3(false, 40));
                }
            }
        };
    }

    public final NowFeedMobHierarchyData n4() {
        return (NowFeedMobHierarchyData) this.LLFII.getValue();
    }

    public final C1812179h p4() {
        Object value = this.LLFFF.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (C1812179h) value;
    }

    public final InteractionSyncVM q4() {
        return (InteractionSyncVM) this.LLFZ.getValue();
    }

    public final InteractionBubbleListVM r4() {
        return (InteractionBubbleListVM) this.LLFF.getValue();
    }

    public final void z4() {
        C71Y.LIZ("interactionBubble", "tryScroll");
        InteractionBubbleListVM r4 = r4();
        r4.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C77H c77h = (C77H) r4.getVmDispatcher().getState();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        c77h.getClass();
        List<InterfaceC57784Mm4> list = c77h.getListState().LJLJJI;
        if (list != null) {
            for (InterfaceC57784Mm4 interfaceC57784Mm4 : list) {
                if (interfaceC57784Mm4 instanceof LikeItem) {
                    LikeItem likeItem = (LikeItem) interfaceC57784Mm4;
                    if (likeItem.getUser().getUid() != null) {
                        if (linkedHashSet2.contains(likeItem.getUser().getUid())) {
                            linkedHashSet.add(interfaceC57784Mm4);
                        } else {
                            String uid = likeItem.getUser().getUid();
                            o.LJIIIIZZ(uid, "item.user.uid");
                            linkedHashSet2.add(uid);
                        }
                    }
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            p4().getState().LJIIL((LikeItem) it.next());
        }
        C8YN.LJIJI(r4(), new AqS169S0100000_3(this, 597));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        getContainerView().getViewTreeObserver().removeOnScrollChangedListener(this.LLIIII);
    }

    public final int m4() {
        if (p4().getState().LJIIIIZZ() == 0 || !getContainerView().isShown()) {
            C71Y.LIZ("interactionBubble", "insert pos = 0");
            return 0;
        }
        if (!(p4().getLayoutManager() instanceof LinearLayoutManager)) {
            return 0;
        }
        C0A2 layoutManager = p4().getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int LLILLJJLI = ((LinearLayoutManager) layoutManager).LLILLJJLI();
        if (LLILLJJLI < 0) {
            return 0;
        }
        int headerCount = (LLILLJJLI - p4().getHeaderCount()) + 1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("insert pos = ");
        LIZ.append(headerCount);
        C71Y.LIZ("interactionBubble", X1D.LIZIZ(LIZ));
        if (p4().getState().LJIIIIZZ() < headerCount) {
            return p4().getState().LJIIIIZZ();
        }
        return headerCount;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC194547kI interfaceC194547kI) {
        String desc;
        int i;
        User user;
        int i2;
        String str;
        C71799SFv c71799SFv;
        InterfaceC194547kI item = interfaceC194547kI;
        o.LJIIIZ(item, "item");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bind item ");
        LIZ.append(item.getAweme().getAid());
        C71Y.LIZ("interactionBubble", X1D.LIZIZ(LIZ));
        p4().LJLLL();
        this.LLI = EnumC1813279s.NONE;
        InteractionBubbleListVM r4 = r4();
        Aweme aweme = item.getAweme();
        r4.getClass();
        r4.setState(new AqS169S0100000_3(aweme, 735));
        p4().LJLLILLLL(this.LLIIIJ);
        C187377Wz c187377Wz = C187377Wz.LIZIZ;
        if (c187377Wz.LIZIZ() != 0 && (desc = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getDesc()) != null && desc.length() != 0) {
            Integer nowFeedType = n4().getNowFeedType();
            if (nowFeedType != null) {
                i = nowFeedType.intValue();
            } else {
                i = 0;
            }
            if (c187377Wz.LIZ(i) || c187377Wz.LIZIZ() != 2) {
                C1812179h p4 = p4();
                int headerCount = p4().getHeaderCount();
                if (headerCount > 1) {
                    headerCount = 1;
                }
                p4.LJLJL(headerCount, this.LLIIIJ);
                C1806677e c1806677e = this.LLIIIILZ;
                if (c1806677e != null) {
                    Aweme aweme2 = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme();
                    NowFeedMobHierarchyData n4 = n4();
                    C1806477c c1806477c = new C1806477c(aweme2, n4);
                    String str2 = null;
                    if (aweme2 != null) {
                        user = aweme2.getAuthor();
                    } else {
                        user = null;
                    }
                    C62562cu LIZ2 = AnonymousClass729.LIZ(user);
                    if (LIZ2 != null && (c71799SFv = c1806677e.LIZ) != null) {
                        C71799SFv.LJIIJ(c71799SFv, LIZ2, null, false, null, 110);
                    }
                    TuxTextView tuxTextView = c1806677e.LIZJ;
                    if (tuxTextView != null) {
                        C16880lQ.LJJJJI(tuxTextView, new ACListenerS38S0200000_3(c1806677e, c1806477c, 68));
                    }
                    TuxTextView tuxTextView2 = c1806677e.LIZIZ;
                    if (tuxTextView2 != null) {
                        C16880lQ.LJJJJI(tuxTextView2, new ACListenerS38S0200000_3(c1806677e, c1806477c, 69));
                    }
                    C71799SFv c71799SFv2 = c1806677e.LIZ;
                    if (c71799SFv2 != null) {
                        C16880lQ.LJJIL(c71799SFv2, new ACListenerS38S0200000_3(c1806677e, c1806477c, 70));
                    }
                    View view = c1806677e.LIZLLL;
                    if (view != null) {
                        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(c1806677e, c1806477c, 71), view);
                    }
                    TuxTextView tuxTextView3 = c1806677e.LIZIZ;
                    if (tuxTextView3 != null) {
                        if (user != null) {
                            if (n4 != null) {
                                str2 = n4.getEnterFrom();
                            }
                            str2 = C1799274i.LJ(user, str2);
                        }
                        tuxTextView3.setText(str2);
                    }
                    TuxTextView tuxTextView4 = c1806677e.LIZIZ;
                    if (tuxTextView4 != null) {
                        TuxTextView tuxTextView5 = c1806677e.LIZJ;
                        if (tuxTextView5 != null) {
                            i2 = tuxTextView5.getMaxWidth();
                        } else {
                            i2 = 0;
                        }
                        tuxTextView4.setMaxWidth(i2);
                    }
                    TuxTextView tuxTextView6 = c1806677e.LIZJ;
                    if (tuxTextView6 != null) {
                        C116724i4 c116724i4 = new C116724i4();
                        if (aweme2 == null || (str = aweme2.getDesc()) == null) {
                            str = "";
                        }
                        c116724i4.LIZIZ(str);
                        tuxTextView6.setText(c116724i4.LIZ);
                    }
                    View view2 = c1806677e.LIZLLL;
                    if (view2 != null) {
                        view2.addOnAttachStateChangeListener(new IDCListenerS114S0200000_3(c1806677e, c1806477c, 1));
                    }
                }
                p4().setCaptionFlag(1);
                if (!this.LLII && !MWW.LIZIZ()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("startRequest() ");
                    LIZ3.append(this.LLI);
                    C7XD.LIZ("interactionBubble", X1D.LIZIZ(LIZ3));
                    int i3 = C1813479u.LIZ[this.LLI.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (o.LJ(n4().getEnterFrom(), "homepage_hot")) {
                                p4().LJLI(0);
                            }
                            z4();
                            return;
                        } else {
                            r4().manualListLoadMore(new PaginationCursor(0L, 0L));
                            if (!o.LJ(n4().getEnterFrom(), "homepage_hot")) {
                                return;
                            }
                            p4().LJLI(0);
                            return;
                        }
                    }
                    r4().manualListRefresh();
                    return;
                }
            }
        }
        p4().setCaptionFlag(0);
        if (!this.LLII) {
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        o.LJIIIZ(view, "view");
        C1812179h p4 = p4();
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZIZ = false;
        p4.setListConfig(c57939MoZ);
        final InteractionBubbleListVM r4 = r4();
        C72808Sho<InterfaceC57784Mm4> state = p4().getState();
        o.LJIIIIZZ(state, "list.state");
        r4.setListState(state);
        p4().LJLJLLL((AbstractC72278SYg) new TBR(r4) { // from class: X.7A1
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        p4().LLLF.LJZL(BubbleCommentCell.class, BubbleReactionCell.class);
        InteractionBubbleListVM r42 = r4();
        NowFeedMobHierarchyData hierarchyData = n4();
        r42.getClass();
        o.LJIIIZ(hierarchyData, "hierarchyData");
        r42.setState(new AqS169S0100000_3(hierarchyData, 737));
        if (this.LLIIIILZ == null) {
            Integer nowFeedType = n4().getNowFeedType();
            if (nowFeedType != null) {
                nowFeedType.intValue();
            }
            this.LLIIIILZ = new C1806677e();
        }
        C1806677e c1806677e = this.LLIIIILZ;
        View view2 = null;
        if (c1806677e != null) {
            C1812179h p42 = p4();
            C212428Vi.LIZ(this);
            C210228Mw c210228Mw = C210228Mw.LIZIZ;
            Context context = p42.getContext();
            o.LJIIIIZZ(context, "parent.context");
            view2 = c210228Mw.LIZIZ(context, R.layout.bai, p42, null);
            c1806677e.LIZ = (C71799SFv) view2.findViewById(R.id.abk);
            c1806677e.LIZIZ = (TuxTextView) view2.findViewById(R.id.gvu);
            c1806677e.LIZJ = (TuxTextView) view2.findViewById(R.id.c6z);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = Integer.valueOf(ColorProtector.parseColor("#9903BAF3"));
            c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(24));
            Context context2 = p42.getContext();
            o.LJIIIIZZ(context2, "parent.context");
            view2.setBackground(c110614Vt.LIZ(context2));
            c1806677e.LIZLLL = view2;
        }
        this.LLIIIJ = view2;
        if (!this.LLII) {
            C8YN.LJII(this, q4(), new TBT() { // from class: X.762
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((InteractionSyncViewModelState) obj).getActivePost();
                }
            }, null, C1812879o.LJLIL, 6);
        }
        C56412MCa c56412MCa = null;
        AssemViewModel.asyncSubscribe$default(r4(), new TBT() { // from class: X.77j
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C77H c77h = (C77H) obj;
                c77h.getClass();
                return C208708Ha.LIZLLL(c77h);
            }
        }, null, new AqS169S0100000_3(this, 728), new AqS153S0100000_3(this, 1518), new AqS169S0100000_3(this, 730), 2, null);
        AssemViewModel.asyncSubscribe$default(r4(), new TBT() { // from class: X.78Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C77H c77h = (C77H) obj;
                c77h.getClass();
                return C208708Ha.LIZJ(c77h);
            }
        }, null, new AqS169S0100000_3(this, 731), C7A2.LJLIL, new AqS169S0100000_3(this, 727), 2, null);
        if (this.LLIFFJFJJ) {
            i = 6;
            C8YN.LJII(this, r4(), new TBT() { // from class: X.79z
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C77H) obj).LJLJJI);
                }
            }, null, C1812579l.LJLIL, 6);
        } else {
            i = 6;
            c56412MCa = null;
            C8YN.LJII(this, r4(), new TBT() { // from class: X.79j
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C77H) obj).LJLJI);
                }
            }, null, C1813379t.LJLIL, 6);
        }
        C8YN.LJII(this, r4(), new TBT() { // from class: X.77I
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C77H) obj).LJLJJL;
            }
        }, c56412MCa, C1812779n.LJLIL, i);
        C8YN.LJII(this, r4(), new TBT() { // from class: X.77J
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C77H) obj).LJLJJLL;
            }
        }, c56412MCa, C1812679m.LJLIL, i);
        C8YN.LJII(this, r4(), new TBT() { // from class: X.786
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C77H c77h = (C77H) obj;
                c77h.getClass();
                return C208708Ha.LIZ(c77h);
            }
        }, c56412MCa, C1813679w.LJLIL, i);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.75y
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InteractionSyncViewModelState) obj).getLikeState();
            }
        }, C213688a4.LIZLLL(), C1813079q.LJLIL, 4);
        C56412MCa c56412MCa2 = c56412MCa;
        C8YN.LJII(this, q4(), new TBT() { // from class: X.75t
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InteractionSyncViewModelState) obj).getCommentPublishState();
            }
        }, c56412MCa2, C1813179r.LJLIL, 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.763
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InteractionSyncViewModelState) obj).getCommentDeleteState();
            }
        }, c56412MCa2, C1812979p.LJLIL, 6);
        getContainerView().getViewTreeObserver().addOnScrollChangedListener(this.LLIIII);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r0.isLike() == true) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u4(java.lang.Boolean r6, boolean r7) {
        /*
            r5 = this;
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r5)
            X.7ML r0 = (X.C7ML) r0
            r2 = 0
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.comment.model.InteractionBubbles r0 = r0.getInteractionBubbles()
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState r1 = r0.getCacheState()
        L19:
            com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState r0 = com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState.NO_CACHE
            if (r1 == r0) goto L39
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r5)
            X.7ML r0 = (X.C7ML) r0
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.comment.model.InteractionBubbles r0 = r0.getInteractionBubbles()
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState r2 = r0.getCacheState()
        L35:
            com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState r0 = com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState.COMMENT_CACHE
            if (r2 != r0) goto L3a
        L39:
            return
        L3a:
            com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM r4 = r5.r4()
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r5)
            X.7ML r0 = (X.C7ML) r0
            r1 = 0
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L7c
            boolean r0 = r0.isLike()
            r3 = 1
            if (r0 != r3) goto L7c
        L54:
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r1)
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.getCurrentUser()
            java.lang.String r0 = "get().getService(IUserSe…::class.java).currentUser"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r4.getClass()
            kotlin.jvm.internal.AqS46S0110000_3 r1 = new kotlin.jvm.internal.AqS46S0110000_3
            r0 = 12
            r1.<init>(r2, r3, r0)
            r4.withState(r1)
            com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM r2 = r5.r4()
            kotlin.jvm.internal.AqS27S0210000_3 r1 = new kotlin.jvm.internal.AqS27S0210000_3
            r0 = 4
            r1.<init>(r6, r5, r7, r0)
            X.C8YN.LJIJI(r2, r1)
            goto L39
        L7c:
            r3 = 0
            goto L54
        L7e:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem.u4(java.lang.Boolean, boolean):void");
    }
}
