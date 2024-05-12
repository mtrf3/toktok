package X;

import Y.ARunnableS44S0100000_8;
import Y.AUListenerS97S0100000_9;
import Y.IDAListenerS77S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightAwemeMediaCell;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightLiveMediaCell;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightOTDMediaCell;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightStoryMediaCell;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel;
import com.ss.android.ugc.aweme.inbox.skylight.template.SkylightFriendPostNormalCell;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MXr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56975MXr extends MMX<InboxHorizontalTopListCombinePod> implements KPL, InterfaceC56632MKm {
    public final String LJLJLLL;
    public int LJLL;
    public long LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final MKT LJLLL;
    public final C62822Ol8 LJLLLL;
    public final InterfaceC100173wT LJLLLLLL;
    public K2C LJLZ;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC56632MKm
    public final void LLJJJJJIL() {
        RecyclerView.ViewHolder LJJJJJL;
        SkylightBaseMediaCard<?> skylightBaseMediaCard;
        K2C k2c = this.LJLZ;
        if (k2c != null && (skylightBaseMediaCard = k2c.LJLILLLLZI) != null) {
            skylightBaseMediaCard.Y();
        }
        if (f0()) {
            c0().resumeSyncController();
            return;
        }
        C0A2 layoutManager = this.LJLLL.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int LJJJI = layoutManager.LJJJI();
        for (int i = 0; i < LJJJI; i++) {
            View LJJJ = layoutManager.LJJJ(i);
            if (LJJJ != null && (LJJJJJL = this.LJLLL.LJJJJJL(LJJJ)) != null) {
                c0().callResumeAnimation(LJJJJJL);
            }
        }
    }

    @Override // X.InterfaceC56632MKm
    public final void LLLLZLL() {
        RecyclerView.ViewHolder LJJJJJL;
        K2C k2c = this.LJLZ;
        if (k2c != null) {
            k2c.LJLIL.postDelayed(new ARunnableS44S0100000_8(k2c, 86), 500L);
        }
        if (f0()) {
            c0().pauseSyncController();
            return;
        }
        C0A2 layoutManager = this.LJLLL.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int LJJJI = layoutManager.LJJJI();
        for (int i = 0; i < LJJJI; i++) {
            View LJJJ = layoutManager.LJJJ(i);
            if (LJJJ != null && (LJJJJJL = this.LJLLL.LJJJJJL(LJJJ)) != null) {
                c0().callPauseAnimation(LJJJJJL);
            }
        }
    }

    public final IInboxLiveService c0() {
        return (IInboxLiveService) this.LJLLILLLL.getValue();
    }

    public final boolean f0() {
        return ((Boolean) this.LJLLLL.getValue()).booleanValue();
    }

    public final SkylightMediaListViewModel g0() {
        return (SkylightMediaListViewModel) this.LJLLJ.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        Context context = this.LJLLL.getContext();
        o.LJIIIIZZ(context, "list.context");
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(context);
        if (LIZIZ != null && (lifecycle = LIZIZ.getLifecycle()) != null) {
            return lifecycle;
        }
        throw new IllegalStateException("cannot get lifecycle from context");
    }

    public final void h0() {
        if (this.LJLL > 0) {
            LiveOuterService.LJJJLL().LJJJJIZL();
            if (!C62046OWs.LIZIZ("livesdk_enter_message_window")) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("request_id", "");
            c188727au.LJ(currentTimeMillis - this.LJLLI, "live_cell_load_time");
            c188727au.LJIIIZ("enter_from_merge", "message");
            c188727au.LJIIIZ("enter_method", "live_cover");
            int i = 1;
            if (!this.itemView.canScrollHorizontally(1) && !this.itemView.canScrollHorizontally(-1)) {
                i = 0;
            }
            c188727au.LIZLLL(i, "is_draw");
            FMX.LJIIL("livesdk_enter_message_window", c188727au.LIZ);
        }
    }

    @Override // X.InterfaceC56632MKm
    public final void LLLII() {
        if (f0()) {
            c0().endSyncController();
        }
    }

    @Override // X.InterfaceC56632MKm
    public final String LJIJ() {
        return this.LJLJLLL;
    }

    public C56975MXr(MKT mkt) {
        super(mkt);
        InterfaceC100173wT LIZIZ;
        this.LJLJLLL = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getUid();
        this.LJLLILLLL = C221108m2.LIZIZ(MY3.LJLIL);
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(MY9.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(mkt, 916));
        this.LJLLL = mkt;
        this.LJLLLL = C221108m2.LIZIZ(AnonymousClass939.LJLIL);
        IInboxLiveService c0 = c0();
        boolean z = C48709J9t.LIZ;
        c0.setInboxSkyLightUseBiggerAvatar(z);
        if (f0()) {
            c0().initSyncController();
        }
        LJLJJL(true);
        mkt.getContext();
        mkt.setLayoutManager(new LinearLayoutManager(0, false));
        int i = 4;
        if (C53339KwZ.LIZLLL()) {
            C26338AVi.LJIIIZ(mkt, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), null, 0, null, 26);
        } else if (z) {
            C26338AVi.LJIIIZ(mkt, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, 0, null, 26);
        } else {
            C26338AVi.LJIIIZ(mkt, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, 0, null, 26);
        }
        C56204M4a.LJIIIZ(mkt, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))));
        mkt.setClipToPadding(false);
        if (C53339KwZ.LIZLLL()) {
            mkt.LLLF.LJZL(SkylightStoryMediaCell.class, SkylightLiveMediaCell.class, SkylightAwemeMediaCell.class, SkylightOTDMediaCell.class);
        } else {
            Class<? extends PowerCell<? extends AbstractC54715Ldf>>[] liveCells = c0().getLiveCells();
            Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] storyCell = ((IStoryInboxService) LIZIZ2.getValue()).getStoryCell();
            Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] onThisDayCell = ((IStoryInboxService) LIZIZ2.getValue()).getOnThisDayCell();
            QSQ qsq = new QSQ(i);
            qsq.LJ(liveCells);
            qsq.LJ(storyCell);
            qsq.LJ(onThisDayCell);
            qsq.LIZ(SkylightFriendPostNormalCell.class);
            mkt.LLLF.LJZL((Class[]) qsq.LJIIIZ(new Class[qsq.LJFF()]));
        }
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        mkt.setListConfig(c57939MoZ);
        if (L03.LIZ()) {
            C40443Fu3.LIZ("inbox_skylight").LJIIIIZZ(mkt);
        }
        mkt.LJIIJJI(new LYV());
        if (C53339KwZ.LIZ()) {
            K2C k2c = new K2C(mkt);
            this.LJLZ = k2c;
            mkt.LJIIJJI(k2c);
        }
        C114304eA.LIZIZ(new AqS156S0200000_9(g0(), this, 81));
        InterfaceC100183wU activityStatusAccuracyAnalysis = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAccuracyAnalysis();
        EnumC112364b2 enumC112364b2 = EnumC112364b2.INBOX_TOP;
        Context context = mkt.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        LIZIZ = activityStatusAccuracyAnalysis.LIZIZ(enumC112364b2, mkt, C57434MgQ.LIZIZ(context), mkt.getContext(), null);
        this.LJLLLLLL = LIZIZ;
    }

    @Override // X.InterfaceC56632MKm
    public final void LJLJJL(boolean z) {
        boolean z2;
        int LIZIZ;
        C34K c34k = new C34K();
        if (this.LJLLL.getLayoutParams() == null || this.LJLLL.getMeasuredHeight() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c34k.element = z2;
        if (z) {
            C56652MLg.LIZJ.LIZ(4);
        }
        this.LJLLL.LJIIIZ(new C56981MXx(c34k));
        MKT mkt = this.LJLLL;
        if (z) {
            LIZIZ = -2;
        } else if (C53339KwZ.LIZLLL()) {
            LIZIZ = C7MY.LIZIZ(188);
        } else if (C48709J9t.LIZ) {
            LIZIZ = C7MY.LIZIZ(122);
        } else {
            LIZIZ = C7MY.LIZIZ(114);
        }
        C221018lt.LIZIZ("SkylightVH", "expectHight" + LIZIZ);
        if (C53339KwZ.LIZLLL()) {
            if (mkt.getLayoutParams() == null) {
                mkt.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, 0));
                this.LJLLL.setAlpha(0.0f);
                return;
            }
            if (mkt.getLayoutParams().height == LIZIZ) {
                return;
            }
            if (z) {
                this.LJLLL.setAlpha(1.0f);
                ViewGroup.LayoutParams layoutParams = mkt.getLayoutParams();
                layoutParams.height = LIZIZ;
                mkt.setLayoutParams(layoutParams);
                return;
            }
            this.LJLLL.setAlpha(0.0f);
            C80896Voy c80896Voy = (C80896Voy) this.itemView.getRootView().findViewById(R.id.ekh);
            if (c80896Voy != null && c80896Voy.LLIIIZ) {
                ViewGroup.LayoutParams layoutParams2 = mkt.getLayoutParams();
                layoutParams2.height = LIZIZ;
                mkt.setLayoutParams(layoutParams2);
                this.LJLLL.setAlpha(1.0f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, C7MY.LIZIZ(188));
            ofFloat.setDuration(350L);
            ofFloat.setInterpolator(C55953Lxd.LJI());
            ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 35));
            ofFloat.addListener(new IDAListenerS77S0100000_9(this, 14));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setDuration(350L);
            ofFloat2.setInterpolator(C55953Lxd.LJI());
            ofFloat2.addUpdateListener(new AUListenerS97S0100000_9(this, 36));
            ofFloat.start();
            ofFloat2.start();
            return;
        }
        if (mkt.getLayoutParams() == null) {
            mkt.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, LIZIZ));
        } else {
            if (mkt.getLayoutParams().height == LIZIZ) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = mkt.getLayoutParams();
            layoutParams3.height = LIZIZ;
            mkt.setLayoutParams(layoutParams3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        if (r4 != false) goto L6;
     */
    @Override // X.InterfaceC56632MKm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLL(boolean r4) {
        /*
            r3 = this;
            X.XvR r2 = X.C78895Uxn.LIZ()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r0 = "live_avatar_animation_optimize"
            java.lang.Object r1 = r2.LJIIIZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.String r0 = "animationOptimize"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L27
            if (r4 == 0) goto L2a
            r3.LLJJJJJIL()
        L1e:
            X.K2C r1 = r3.LJLZ
            if (r1 == 0) goto L26
            r0 = 1
            r1.LJIILLIIL(r0)
        L26:
            return
        L27:
            if (r4 == 0) goto L2d
            goto L1e
        L2a:
            r3.LLLLZLL()
        L2d:
            X.K2C r0 = r3.LJLZ
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard<?> r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L26
            r0.U()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56975MXr.LLJLL(boolean):void");
    }

    @Override // X.MMX
    public final void U(boolean z) {
        super.U(z);
        InterfaceC100173wT interfaceC100173wT = this.LJLLLLLL;
        if (interfaceC100173wT != null) {
            interfaceC100173wT.onVisible();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r7, r6) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015c  */
    @Override // X.MMX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod r10) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56975MXr.V(X.MMe):void");
    }

    @Override // X.MMX
    public final void X(InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod) {
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod2 = inboxHorizontalTopListCombinePod;
        super.X(inboxHorizontalTopListCombinePod2);
        if (!o.LJ(g0().LJLL, this.LJLLL)) {
            SkylightMediaListViewModel g0 = g0();
            C72808Sho<InterfaceC57784Mm4> state = this.LJLLL.getState();
            o.LJIIIIZZ(state, "list.state");
            g0.setListState(state);
            SkylightMediaListViewModel g02 = g0();
            MKT mkt = this.LJLLL;
            g02.LJLL = mkt;
            mkt.LJLJLLL(g0().getConfig());
        }
        SkylightMediaListViewModel g03 = g0();
        int hashCode = hashCode();
        g03.getClass();
        g03.LJLJLJ = hashCode;
        g03.LJLJJI = inboxHorizontalTopListCombinePod2;
        C72808Sho<ITEM> c72808Sho = g03.state;
        if (c72808Sho != 0) {
            List<InterfaceC57784Mm4> LIZ = ((C56352M9s) g03.LJLIL.LJLILLLLZI.getValue()).LIZ();
            c72808Sho.LJIILLIIL(LIZ);
            MutableLiveData<MZ9> mutableLiveData = c72808Sho.LIZ;
            o.LJII(mutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<*>");
            mutableLiveData.setValue(new MZ9(LIZ, false, false));
        }
        g03.kv0(false);
    }

    @Override // X.MMX
    public final void Y(boolean z) {
        SkylightBaseMediaCard<?> skylightBaseMediaCard;
        super.Y(z);
        InterfaceC100173wT interfaceC100173wT = this.LJLLLLLL;
        if (interfaceC100173wT != null) {
            interfaceC100173wT.onInvisible();
        }
        K2C k2c = this.LJLZ;
        if (k2c != null && (skylightBaseMediaCard = k2c.LJLILLLLZI) != null) {
            skylightBaseMediaCard.U();
        }
    }

    public final void i0(long j) {
        InboxLiveNotice LIZ;
        SlimRoom roomInfo;
        Iterator it = ((ArrayList) this.LJLLL.getState().LJII()).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it.next();
                if ((interfaceC57784Mm4 instanceof AbstractC54715Ldf) && (LIZ = ((AbstractC54715Ldf) interfaceC57784Mm4).LIZ()) != null && (roomInfo = LIZ.getRoomInfo()) != null && roomInfo.getId() == j) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        l0(i);
    }

    public final void l0(int i) {
        LinearLayoutManager linearLayoutManager;
        if (i >= 0 && i < this.LJLLL.getState().LJIIIIZZ()) {
            C0A2 layoutManager = this.LJLLL.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.LJFF(i, 1);
            }
        }
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
