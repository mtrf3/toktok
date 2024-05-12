package com.ss.android.ugc.aweme.search;

import X.ActivityC45651qj;
import X.B3D;
import X.B4K;
import X.BZM;
import X.C08680Vs;
import X.C0NB;
import X.C15380j0;
import X.C15410j3;
import X.C16880lQ;
import X.C2S6;
import X.C32537Cpp;
import X.C45804HyK;
import X.C47061t0;
import X.C55333Lnd;
import X.C58827N6x;
import X.C75862Tpy;
import X.C78949Uyf;
import X.C78963Uyt;
import X.C80796VnM;
import X.C86144XrQ;
import X.C86343Xud;
import X.C86393XvR;
import X.CN1;
import X.IKN;
import X.InterfaceC28161B3l;
import X.InterfaceC36571c5;
import X.InterfaceC51676KPw;
import X.InterfaceC55338Lni;
import X.InterfaceC55347Lnr;
import X.InterfaceC86147XrT;
import X.KMV;
import X.QD3;
import X.Z9N;
import Y.ARunnableS51S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.SearchLiveTitleBarOptSetting;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes16.dex */
public final class SearchLiveCardViewHolder extends BaseFeedLiveViewHolder implements InterfaceC55338Lni, InterfaceC28161B3l {
    public B3D LJLJJLL;
    public final C47061t0 LJLJL;
    public B4K LJLJLJ;
    public final C86343Xud LJLJLLL;
    public EnterRoomConfig LJLL;
    public Aweme LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final boolean I8() {
        B3D b3d;
        View view;
        Context context;
        Activity LJIILL;
        InterfaceC36571c5 wc;
        try {
            b3d = this.LJLJJLL;
        } catch (Exception e) {
            C0NB.LJI("LiveSearchPlayHelper", e);
        }
        if (b3d != null && b3d.wc() != null && (view = getView()) != null && (context = view.getContext()) != null && (LJIILL = C78949Uyf.LJIILL(context)) != null && !LJIILL.isFinishing() && (LJIILL instanceof KMV)) {
            B4K b4k = this.LJLJLJ;
            if (b4k != null && b4k.dg()) {
                C08680Vs.LJIILJJIL.LIZJ = "close_btn";
                b4k.T5(false, true);
                return true;
            }
            B3D b3d2 = this.LJLJJLL;
            return b3d2 != null && (wc = b3d2.wc()) != null && (wc instanceof InterfaceC86147XrT) && ((InterfaceC86147XrT) wc).onBackPressed();
        }
        return false;
    }

    public final void LJZI() {
        C86144XrQ.LJI = true;
        B3D b3d = this.LJLJJLL;
        if (b3d != null) {
            b3d.LLLFF();
        }
        this.LJLLILLLL = null;
        this.LJLJL.setVisibility(8);
        this.LJLLLLLL = false;
    }

    public final void LJZL() {
        C86144XrQ.LJI = false;
        this.LJLLJ = null;
        C2S6.LIZ(this.LJLILLLLZI).setEcLiveExtra(null);
        this.LJLJL.postDelayed(new ARunnableS51S0100000_15(this, 103), 1500L);
        this.LJZ = View.generateViewId();
        ((ViewGroup) findViewById(R.id.j7p)).getChildAt(0).setId(this.LJZ);
        if (this.LJLL != null) {
            try {
                B3D LIZJ = C86144XrQ.LIZJ(getView(), this.LJLL, this.LJLLLL, this.LJZ);
                this.LJLJJLL = LIZJ;
                if (LIZJ != null) {
                    LIZJ.M9(this.LJLLILLLL);
                }
            } catch (Exception e) {
                C0NB.LJI("LiveSearchPlayHelper", e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final boolean R7() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final int getAwemeType() {
        return 101;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final String LJLZ() {
        String LJLLJ;
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null || (LJLLJ = C16880lQ.LJLLJ(LJJIFFI.getClass())) == null) {
            return "";
        }
        return LJLLJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r1 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZ() {
        /*
            r4 = this;
            java.lang.String r0 = X.C86144XrQ.LJII
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L12
            java.lang.String r1 = X.C86144XrQ.LJII
            java.lang.String r0 = "click"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L13
        L12:
            return
        L13:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LJLLI
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r3 = r0.getNewLiveRoomData()
            if (r3 != 0) goto L29
            com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct r0 = r0.getRoomFeedCellStruct()
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r3 = r0.getNewLiveRoomData()
            if (r3 == 0) goto L41
        L29:
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.blurredCover
            if (r1 == 0) goto L5f
            java.util.List r0 = r1.getUrlList()
            if (r0 == 0) goto L5f
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L5f
        L3b:
            java.util.List r1 = r1.getUrlList()
            if (r1 != 0) goto L43
        L41:
            X.OQg r1 = X.C61878OQg.INSTANCE
        L43:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L12
            X.BQO r0 = X.C15650jR.LIZ()
            X.Uuy r1 = r0.LIZ(r1)
            X.1t0 r0 = r4.LJLJL
            r1.LJIIJJI(r0)
            X.1t0 r1 = r4.LJLJL
            r0 = 0
            r1.setVisibility(r0)
            goto L12
        L5f:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r3.roomCover
            if (r2 == 0) goto L77
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r1.<init>()
            java.util.List r0 = r2.getUrlList()
            r1.setUrlList(r0)
            java.lang.String r0 = r2.getUri()
            r1.setUri(r0)
            goto L3b
        L77:
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.roomCover
            if (r1 != 0) goto L3b
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.owner
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getAvatarLarger()
            if (r1 == 0) goto L41
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder.LJZ():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (X.C86144XrQ.LJI == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LL() {
        /*
            r7 = this;
            boolean r0 = r7.LJLLLLLL
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r7.LJLLLLLL = r0
            r0 = 0
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r0)
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L14
            return
        L14:
            X.1t0 r1 = r7.LJLJL
            r0 = 8
            r1.setVisibility(r0)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r7.LJLL
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLLI
            r5 = 0
            if (r0 == 0) goto L38
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r0.getNewLiveRoomData()
            if (r0 == 0) goto L38
            long r3 = r0.id
        L2d:
            long r1 = X.BM1.LIZLLL
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L3b
            goto L3f
        L38:
            r3 = 0
            goto L2d
        L3b:
            boolean r0 = X.C86144XrQ.LJI
            if (r0 == 0) goto L7b
        L3f:
            r7.LJZ()     // Catch: java.lang.Exception -> L75
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.LJLLI     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = X.C86144XrQ.LIZIZ     // Catch: java.lang.Exception -> L75
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L75
            if (r0 != 0) goto L6a
            java.lang.String r0 = X.C86144XrQ.LIZIZ     // Catch: java.lang.Exception -> L75
        L4e:
            r7.LJLLILLLL = r0     // Catch: java.lang.Exception -> L75
            android.content.Context r0 = r7.LJLILLLLZI     // Catch: java.lang.Exception -> L75
            X.M89 r0 = X.C2S6.LIZ(r0)     // Catch: java.lang.Exception -> L75
            java.lang.String r2 = r0.getEcLiveExtra()     // Catch: java.lang.Exception -> L75
            r7.LJLLJ = r2     // Catch: java.lang.Exception -> L75
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.LJLLI     // Catch: java.lang.Exception -> L75
            boolean r0 = r7.LJLLL     // Catch: java.lang.Exception -> L75
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = X.C86144XrQ.LIZLLL(r1, r0, r2)     // Catch: java.lang.Exception -> L75
            r7.LJLL = r0     // Catch: java.lang.Exception -> L75
            r7.LJZL()     // Catch: java.lang.Exception -> L75
            goto L7b
        L6a:
            com.ss.android.ugc.aweme.search.ISearchService r0 = com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl.LLLZI()     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = r0.LJJJJL(r1)     // Catch: java.lang.Exception -> L75
            X.C86144XrQ.LIZIZ = r0     // Catch: java.lang.Exception -> L75
            goto L4e
        L75:
            r1 = move-exception
            java.lang.String r0 = "LiveSearchPlayHelper"
            X.C0NB.LJI(r0, r1)
        L7b:
            java.lang.String r0 = r7.LJLZ()
            X.C86144XrQ.LJFF(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder.LL():void");
    }

    @Override // X.InterfaceC28161B3l
    public final void LLD() {
        C86144XrQ.LJFF(LJLZ(), this);
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            View findViewById = findViewById(R.id.j7p);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.root_live_search_layout)");
            this.LJLJLJ = Live.getLiteService().r6(LJJIFFI, (BZM) findViewById, R.id.fxx);
        }
        if (SearchLiveTitleBarOptSetting.INSTANCE.isOpt()) {
            View findViewById2 = findViewById(this.LJZ);
            o.LJIIIIZZ(findViewById2, "findViewById(liveContainerViewId)");
            if (C15410j3.LIZJ(this.context)) {
                int[] iArr = new int[2];
                findViewById2.getLocationOnScreen(iArr);
                if (iArr[1] <= 0) {
                    findViewById2.setPadding(0, C15380j0.LJIILIIL(), 0, 0);
                }
            }
            View findViewById3 = findViewById(R.id.fxx);
            o.LJIIIIZZ(findViewById3, "findViewById(R.id.live_p…_search_container_layout)");
            if (C15410j3.LIZJ(this.context)) {
                int[] iArr2 = new int[2];
                findViewById3.getLocationOnScreen(iArr2);
                if (iArr2[1] <= 0) {
                    findViewById3.setPadding(0, C15380j0.LJIILIIL(), 0, 0);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unBind() {
        /*
            r6 = this;
            r6.LJZI()
            android.view.View r0 = r6.getView()
            r4 = 0
            if (r0 == 0) goto Lcd
            android.content.Context r0 = r0.getContext()
        Le:
            X.C86144XrQ.LJ(r0)
            android.view.View r0 = r6.getView()
            if (r0 == 0) goto Lca
            android.content.Context r5 = r0.getContext()
        L1b:
            java.lang.String r3 = r6.LJLLILLLL
            X.B3D r2 = r6.LJLJJLL
            X.C86144XrQ.LJ(r5)
            X.XvS r0 = com.ss.android.ugc.aweme.live.Live.getService()
            r0.d9()
            X.XvS r1 = com.ss.android.ugc.aweme.live.Live.getService()
            if (r5 == 0) goto Lc7
            android.app.Activity r0 = X.C78949Uyf.LJIILL(r5)
        L33:
            r1.LJJLIIIIJ(r0)
            X.XvS r0 = com.ss.android.ugc.aweme.live.Live.getService()
            r0.LJJIJ()
            if (r3 == 0) goto L4c
            X.XvS r0 = com.ss.android.ugc.aweme.live.Live.getService()
            if (r0 == 0) goto L4c
            X.XvS r0 = com.ss.android.ugc.aweme.live.Live.getService()
            r0.LJJLIIIJJI(r3)
        L4c:
            if (r2 == 0) goto L60
            androidx.fragment.app.Fragment r0 = r2.wc()
            if (r0 == 0) goto L57
            r0.onDestroyView()
        L57:
            androidx.fragment.app.Fragment r0 = r2.wc()
            if (r0 == 0) goto L60
            r0.onDestroy()
        L60:
            if (r5 == 0) goto Lc4
            X.1qj r0 = X.C45804HyK.LJJIFFI(r5)
            if (r0 == 0) goto Lc4
            androidx.fragment.app.FragmentManager r3 = r0.getSupportFragmentManager()
            if (r3 == 0) goto Lc5
            X.1B3 r2 = new X.1B3
            r2.<init>(r3)
        L73:
            java.lang.String r1 = "LiveSearchPlayHelper"
            java.lang.String r0 = "_live_room_fragment_tag"
            java.lang.String r0 = defpackage.i0.LJFF(r1, r0)
            if (r3 == 0) goto Lc1
            androidx.fragment.app.Fragment r0 = r3.LJJJIL(r0)
            if (r0 == 0) goto L88
            if (r2 == 0) goto L88
            r2.LJJI(r0)
        L88:
            if (r3 == 0) goto Lc1
            java.lang.String r0 = "LiveRoomFragment_drawer_fragment"
            androidx.fragment.app.Fragment r0 = r3.LJJJIL(r0)
            if (r0 == 0) goto Lc1
            if (r2 == 0) goto L9a
            r2.LJJI(r0)
        L97:
            r2.LJI()
        L9a:
            X.C86144XrQ.LIZIZ = r4
            org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.LIZJ()
            r0.LJIJ(r6)
            r6.LJLLILLLL = r4
            r6.LJLL = r4
            r6.LJLLJ = r4
            java.lang.String r1 = r6.LJLZ()
            X.XvS r0 = com.ss.android.ugc.aweme.live.Live.getLiteService()
            r0.W5(r1)
            X.1t0 r1 = r6.LJLJL
            r0 = 8
            r1.setVisibility(r0)
            X.1t0 r0 = r6.LJLJL
            r0.removeCallbacks(r4)
            return
        Lc1:
            if (r2 == 0) goto L9a
            goto L97
        Lc4:
            r3 = r4
        Lc5:
            r2 = r4
            goto L73
        Lc7:
            r0 = r4
            goto L33
        Lca:
            r5 = r4
            goto L1b
        Lcd:
            r0 = r4
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder.unBind():void");
    }

    @Override // X.InterfaceC28161B3l
    public final B4K LJIJJLI() {
        return this.LJLJLJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final Aweme getAweme() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC55338Lni
    public final void LIZIZ(MotionEvent motionEvent) {
        C80796VnM c80796VnM;
        float f;
        float f2;
        if (Live.getLiteService().ba(LJLZ())) {
            return;
        }
        boolean LIZIZ = C86144XrQ.LIZIZ();
        if (!Live.getLiteService().w9(LJLZ())) {
            String LJLZ = LJLZ();
            if (C86144XrQ.LIZJ == null) {
                C86144XrQ.LIZJ = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker = C86144XrQ.LIZJ;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
            if (motionEvent != null) {
                if (motionEvent.getAction() == 0) {
                    C86144XrQ.LIZLLL = motionEvent.getX();
                    LJJIJIL.getClass();
                    C86144XrQ.LJIIIIZZ = ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).JM(LJLZ);
                } else if (2 == motionEvent.getAction()) {
                    C86144XrQ.LJ = motionEvent.getX();
                } else if (1 == motionEvent.getAction()) {
                    VelocityTracker velocityTracker2 = C86144XrQ.LIZJ;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000);
                    }
                    float f3 = C86144XrQ.LIZLLL;
                    float f4 = C86144XrQ.LJ;
                    VelocityTracker velocityTracker3 = C86144XrQ.LIZJ;
                    if (velocityTracker3 != null) {
                        f = velocityTracker3.getXVelocity();
                    } else {
                        f = 0.0f;
                    }
                    VelocityTracker velocityTracker4 = C86144XrQ.LIZJ;
                    if (velocityTracker4 != null) {
                        f2 = velocityTracker4.getYVelocity();
                    } else {
                        f2 = 0.0f;
                    }
                    LJJIJIL.getClass();
                    ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Wk(f3, f4, f, f2);
                    C86144XrQ.LIZLLL = 0.0f;
                    C86144XrQ.LJ = 0.0f;
                    VelocityTracker velocityTracker5 = C86144XrQ.LIZJ;
                    if (velocityTracker5 != null) {
                        velocityTracker5.clear();
                    }
                    VelocityTracker velocityTracker6 = C86144XrQ.LIZJ;
                    if (velocityTracker6 != null) {
                        velocityTracker6.recycle();
                    }
                    C86144XrQ.LIZJ = null;
                }
            }
            if (!C86144XrQ.LJIIIIZZ) {
                LJJIJIL.getClass();
                ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).vT(motionEvent, LJLZ);
            }
        } else {
            LIZIZ = false;
        }
        if (C86144XrQ.LJFF != LIZIZ) {
            InterfaceC55347Lnr interfaceC55347Lnr = C86144XrQ.LIZ;
            if (interfaceC55347Lnr != null && (c80796VnM = ((C55333Lnd) interfaceC55347Lnr).LIZ.mViewPager) != null) {
                c80796VnM.setDisableScroll(!LIZIZ);
            }
            C86144XrQ.LJFF = LIZIZ;
        }
    }

    @Override // X.InterfaceC55338Lni
    public final void LJI(InterfaceC55347Lnr controller) {
        C80796VnM c80796VnM;
        o.LJIIIZ(controller, "controller");
        if (!BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin()) {
            Z9N.LIZIZ.LJJJJLI(new AqS162S0200000_15(controller, this, 22), new AqS159S0100000_9(controller, 617));
            return;
        }
        C86144XrQ.LIZ = controller;
        boolean LIZIZ = C86144XrQ.LIZIZ();
        if (C86144XrQ.LJFF != LIZIZ) {
            InterfaceC55347Lnr interfaceC55347Lnr = C86144XrQ.LIZ;
            if (interfaceC55347Lnr != null && (c80796VnM = ((C55333Lnd) interfaceC55347Lnr).LIZ.mViewPager) != null) {
                c80796VnM.setDisableScroll(!LIZIZ);
            }
            C86144XrQ.LJFF = LIZIZ;
        }
        this.LJLL = C86144XrQ.LIZLLL(this.LJLLI, this.LJLLL, this.LJLLJ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Xud, O] */
    public final void LLF(Aweme aweme) {
        LiveRoomStruct liveRoomStruct;
        C86343Xud c86343Xud = this.LJLJLLL;
        c86343Xud.LIZ = aweme;
        if (aweme != null) {
            liveRoomStruct = aweme.getNewLiveRoomData();
            if (liveRoomStruct == null) {
                RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                if (roomFeedCellStruct != null) {
                    liveRoomStruct = roomFeedCellStruct.getNewLiveRoomData();
                }
            }
            c86343Xud.LIZIZ = liveRoomStruct;
            c86343Xud.LIZJ = C78963Uyt.LJIIL(c86343Xud);
            c86343Xud.LJIIJ = false;
            this.LJLJLLL.LJIJ = null;
            C78963Uyt.LJIIJ(c86343Xud);
            ((C32537Cpp) this.dataChannel.gv0(C75862Tpy.class)).LIZ = this.LJLJLLL;
        }
        liveRoomStruct = null;
        c86343Xud.LIZIZ = liveRoomStruct;
        c86343Xud.LIZJ = C78963Uyt.LJIIL(c86343Xud);
        c86343Xud.LJIIJ = false;
        this.LJLJLLL.LJIJ = null;
        C78963Uyt.LJIIJ(c86343Xud);
        ((C32537Cpp) this.dataChannel.gv0(C75862Tpy.class)).LIZ = this.LJLJLLL;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Xud, O] */
    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.InterfaceC222708oc
    public final void Y2(Aweme aweme) {
        this.LJLLI = aweme;
        LLF(aweme);
        ((C32537Cpp) this.dataChannel.gv0(C75862Tpy.class)).LIZ = this.LJLJLLL;
        LL();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void l8(int i) {
        Aweme aweme;
        this.LJLJLLL.LJIIJ = false;
        LiveOuterService.LJJJLL().LJJIJIL().getClass();
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).af();
        this.LJLZ = true;
        if (TextUtils.isEmpty(C86144XrQ.LJII) || TextUtils.equals("click", C86144XrQ.LJII) || (aweme = this.LJLLI) == null || !aweme.isAd()) {
            return;
        }
        C58827N6x.LIZIZ.LJII().LJIJI(aweme);
    }

    @QD3
    public final void receivePauseEvent(IKN event) {
        o.LJIIIZ(event, "event");
        LJZI();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void t7(boolean z) {
        LJZI();
        C86144XrQ.LJII = "draw";
        this.LJLZ = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
        String LJJJJL;
        LIZLLL(aweme);
        this.LJLLI = aweme;
        this.LJLLLL = i;
        InterfaceC51676KPw LJJJLZIJ = SearchServiceImpl.LLLZI().LJJJLZIJ();
        Fragment fragment = this.LJLIL;
        if (aweme != null) {
            this.LJLLL = LJJJLZIJ.LIZ(fragment, aweme);
            LLF(aweme);
            EventBus.LIZJ().LJIILJJIL(this);
            if (!TextUtils.isEmpty(C86144XrQ.LIZIZ)) {
                LJJJJL = C86144XrQ.LIZIZ;
            } else {
                LJJJJL = SearchServiceImpl.LLLZI().LJJJJL(aweme);
                C86144XrQ.LIZIZ = LJJJJL;
            }
            this.LJLLILLLL = LJJJJL;
            this.LJLLJ = C2S6.LIZ(this.LJLILLLLZI).getEcLiveExtra();
            if (!TextUtils.isEmpty(this.LJLLILLLL)) {
                this.LJLL = C86144XrQ.LIZLLL(aweme, this.LJLLL, this.LJLLJ);
            }
            C86144XrQ.LJFF(LJLZ(), this);
            LJZ();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Xud, O] */
    public SearchLiveCardViewHolder(View view, Fragment fragment, String str) {
        super(view, fragment);
        Context context;
        ActivityC45651qj LJJIFFI;
        Lifecycle lifecycle;
        ?? c86343Xud = new C86343Xud(str, -9);
        this.LJLJLLL = c86343Xud;
        this.LJLLL = true;
        this.LJZ = R.id.fyl;
        RecyclableWidgetManager of = RecyclableWidgetManager.of(fragment, this, view, LiveWidgetProvider.Companion.getInstance(), null, true);
        setWidgetCallback(of.widgetCallback);
        ((C32537Cpp) this.dataChannel.gv0(C75862Tpy.class)).LIZ = c86343Xud;
        of.createWidget(view, this);
        C86144XrQ.LIZ(this.LJLILLLLZI);
        View findViewById = findViewById(R.id.fv5);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.live_background_search)");
        final C47061t0 c47061t0 = (C47061t0) findViewById;
        this.LJLJL = c47061t0;
        if (!TextUtils.isEmpty(C86144XrQ.LJII) || (context = c47061t0.getContext()) == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || (lifecycle = LJJIFFI.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder$registerLifecycle$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                } else if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                Context context2;
                ActivityC45651qj LJJIFFI2;
                Lifecycle lifecycle2;
                C86144XrQ.LJII = "";
                SearchLiveCardViewHolder.this.LJLLLLLL = false;
                View view2 = c47061t0;
                if (view2 != null && (context2 = view2.getContext()) != null && (LJJIFFI2 = C45804HyK.LJJIFFI(context2)) != null && (lifecycle2 = LJJIFFI2.getLifecycle()) != null) {
                    lifecycle2.removeObserver(this);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                SearchLiveCardViewHolder searchLiveCardViewHolder = SearchLiveCardViewHolder.this;
                if (searchLiveCardViewHolder.LJLZ) {
                    searchLiveCardViewHolder.LL();
                }
            }
        });
    }
}
