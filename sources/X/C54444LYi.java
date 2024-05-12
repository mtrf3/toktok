package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.cell.FollowLiveSkylightBigAvatarCell;
import com.ss.android.ugc.aweme.feed.cell.FollowLiveSkylightCell;
import com.ss.android.ugc.aweme.feed.cell.FollowLiveSkylightDoubleAvatarCell;
import com.ss.android.ugc.aweme.feed.cell.FollowLiveSkylightDoubleBigAvatarCell;
import com.ss.android.ugc.aweme.feed.cell.FollowLiveSkylightSeeAllCell;
import com.ss.android.ugc.aweme.feed.cell.FollowLiveSkylightWidgetCell;
import com.ss.android.ugc.aweme.feed.cell.FollowStorySkylightCell;
import com.ss.android.ugc.aweme.feed.ui.CallBackLinearLayoutManager;
import com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper;
import com.ss.android.ugc.aweme.feed.vm.FollowLiveSkyLightRelatedVM;
import com.ss.android.ugc.aweme.feed.vm.FollowStorySkylightVM;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LYi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54444LYi extends LinearLayout implements InterfaceC93923mO, KPL {
    public C54446LYk LJLIL;
    public SYL LJLILLLLZI;
    public C54689LdF LJLJI;
    public final C214378bB LJLJJI;
    public final C214298b3 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public FollowSkyLightHelper LJLJL;
    public final boolean LJLJLJ;

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    private final FollowStorySkylightVM getFollowStorySkylightVM() {
        return (FollowStorySkylightVM) this.LJLJJI.getValue();
    }

    private final RecyclerView getRealList() {
        if (this.LJLJLJ) {
            return getPowerList();
        }
        return this.LJLIL;
    }

    private final boolean getUseSyncController() {
        return ((Boolean) this.LJLJJLL.getValue()).booleanValue();
    }

    public final C54689LdF getAdapter() {
        C54689LdF c54689LdF = this.LJLJI;
        if (c54689LdF != null) {
            return c54689LdF;
        }
        o.LJIJI("adapter");
        throw null;
    }

    public final FollowLiveSkyLightRelatedVM getFollowLiveSkyLightRelatedVM() {
        return (FollowLiveSkyLightRelatedVM) this.LJLJJL.getValue();
    }

    public final SYL getPowerList() {
        SYL syl = this.LJLILLLLZI;
        if (syl != null) {
            return syl;
        }
        o.LJIJI("powerList");
        throw null;
    }

    public final boolean LIZIZ() {
        RecyclerView realList = getRealList();
        if (realList == null) {
            return false;
        }
        if (C26338AVi.LIZLLL(realList)) {
            if (realList.computeHorizontalScrollOffset() != 0) {
                return false;
            }
        } else {
            if (realList.computeHorizontalScrollOffset() + realList.computeHorizontalScrollExtent() < realList.computeHorizontalScrollRange()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC93923mO
    public LifecycleOwner getCurrentLifeCycleOwner() {
        Context context = getContext();
        if (context != null) {
            return C45804HyK.LJJIFFI(context);
        }
        return null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        ActivityC45651qj LJJIFFI;
        Lifecycle lifecycle;
        Context context = getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (lifecycle = LJJIFFI.getLifecycle()) != null) {
            return lifecycle;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final int getRecycleViewContentWidth() {
        RecyclerView realList = getRealList();
        if (realList != null) {
            return realList.computeHorizontalScrollRange();
        }
        return 0;
    }

    public final FollowSkyLightHelper getHelper() {
        return this.LJLJL;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54444LYi(Context context) {
        super(context);
        ActivityC45651qj activityC45651qj;
        C214298b3 c214298b3;
        C53882LCs LIZJ;
        FollowSkyLightHelper followSkyLightHelper;
        ActivityC45651qj LIZ;
        new LinkedHashMap();
        Context context2 = getContext();
        InboxFollowGuideViewModel inboxFollowGuideViewModel = null;
        if (context2 != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context2);
        } else {
            activityC45651qj = null;
        }
        if (activityC45651qj != null) {
            this.LJLJJI = new C214378bB(C65352Pkq.LIZ(FollowStorySkylightVM.class), LYI.LJLIL, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C242759fr.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj));
            C9BD c9bd = C9BD.LIZ;
            C65776Prg LIZ2 = C65352Pkq.LIZ(FollowLiveSkyLightRelatedVM.class);
            AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ2, 1748);
            C54445LYj c54445LYj = C54445LYj.INSTANCE;
            if (o.LJ(c9bd, c9bd)) {
                c214298b3 = new C214298b3(LIZ2, aqS153S0100000_3, M7W.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1749), new AqS153S0100000_3((InterfaceC93923mO) this, 1750), C54746LeA.INSTANCE, c54445LYj, new AqS153S0100000_3((InterfaceC93923mO) this, 1751), 256);
            } else if (o.LJ(c9bd, C9BE.LIZ)) {
                c214298b3 = new C214298b3(LIZ2, aqS153S0100000_3, M7X.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1752), new AqS153S0100000_3((InterfaceC93923mO) this, 1743), C54745Le9.INSTANCE, c54445LYj, new AqS153S0100000_3((InterfaceC93923mO) this, 1744), 256);
            } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
                c214298b3 = new C214298b3(LIZ2, aqS153S0100000_3, M7V.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1745), new AqS153S0100000_3((InterfaceC93923mO) this, 1746), new AqS153S0100000_3((InterfaceC93923mO) this, 1747), c54445LYj, (InterfaceC65784Pro) null, 384);
            } else {
                throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
            }
            this.LJLJJL = c214298b3;
            this.LJLJJLL = C221108m2.LIZIZ(AnonymousClass958.LJLIL);
            boolean z = L7K.LIZIZ;
            this.LJLJLJ = z;
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LifecycleOwner currentLifeCycleOwner = getCurrentLifeCycleOwner();
            if (currentLifeCycleOwner != null && (LIZ = C212428Vi.LIZ(currentLifeCycleOwner)) != null) {
                inboxFollowGuideViewModel = LYC.LIZ(LIZ);
            }
            if (z) {
                LYM.LIZIZ = inboxFollowGuideViewModel;
                final Context context3 = getContext();
                if (context3 != null) {
                    setPowerList(new SYL(context3) { // from class: X.79b
                        @Override // android.view.View
                        public final boolean canScrollHorizontally(int i) {
                            return true;
                        }

                        {
                            new LinkedHashMap();
                            addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
                        }
                    });
                    addView(getPowerList(), layoutParams);
                    SYL powerList = getPowerList();
                    powerList.LJLJLLL(getFollowStorySkylightVM().getConfig());
                    powerList.getContext();
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                    linearLayoutManager.LLJJIII(0);
                    powerList.setLayoutManager(linearLayoutManager);
                    if (getUseSyncController() && (LIZJ = LYM.LIZJ()) != null && (followSkyLightHelper = this.LJLJL) != null) {
                        followSkyLightHelper.LJIILIIL.add(new AqS175S0100000_9(LIZJ, 632));
                    }
                    powerList.LLLF.LJZL(FollowLiveSkylightCell.class, FollowLiveSkylightDoubleBigAvatarCell.class, FollowLiveSkylightBigAvatarCell.class, FollowLiveSkylightDoubleAvatarCell.class, FollowLiveSkylightSeeAllCell.class, FollowLiveSkylightWidgetCell.class, FollowStorySkylightCell.class);
                    C8YN.LJII(this, getFollowLiveSkyLightRelatedVM(), new TBT() { // from class: X.LYm
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((LZ5) obj).LJLJJL;
                        }
                    }, null, new AqS191S0100000_9(this, 118), 6);
                    C8YN.LJII(this, getFollowStorySkylightVM(), new TBT() { // from class: X.9fm
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C242699fl) obj).LJLILLLLZI;
                        }
                    }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 226), 4);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context4 = getContext();
            if (context4 != null) {
                C54446LYk c54446LYk = new C54446LYk(context4);
                this.LJLIL = c54446LYk;
                addView(c54446LYk, layoutParams);
                getContext();
                CallBackLinearLayoutManager callBackLinearLayoutManager = new CallBackLinearLayoutManager(new AqS159S0100000_9(this, 1038));
                C54446LYk c54446LYk2 = this.LJLIL;
                if (c54446LYk2 != null) {
                    c54446LYk2.setLayoutManager(callBackLinearLayoutManager);
                }
                setAdapter(new C54689LdF());
                getAdapter().LJLJL = inboxFollowGuideViewModel;
                C54446LYk c54446LYk3 = this.LJLIL;
                if (c54446LYk3 == null) {
                    return;
                }
                c54446LYk3.setAdapter(getAdapter());
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LIZ(C0A6 c0a6) {
        RecyclerView realList = getRealList();
        if (realList != null) {
            realList.LJIIJJI(c0a6);
        }
    }

    public final void LIZJ(int i) {
        C0A2 layoutManager;
        RecyclerView realList = getRealList();
        if (realList != null && (layoutManager = realList.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).LJFF(i, 0);
        }
    }

    public final void setAdapter(C54689LdF c54689LdF) {
        o.LJIIIZ(c54689LdF, "<set-?>");
        this.LJLJI = c54689LdF;
    }

    public final void setHelper(FollowSkyLightHelper followSkyLightHelper) {
        this.LJLJL = followSkyLightHelper;
    }

    public final void setPowerList(SYL syl) {
        o.LJIIIZ(syl, "<set-?>");
        this.LJLILLLLZI = syl;
    }

    public final void setViewOnTouchListener(View.OnTouchListener l) {
        o.LJIIIZ(l, "l");
        RecyclerView realList = getRealList();
        if (realList != null) {
            realList.setOnTouchListener(l);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (X.C54838Lfe.LJIIJJI(r0) != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.LY3 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54444LYi.LIZLLL(X.LY3, boolean):void");
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
