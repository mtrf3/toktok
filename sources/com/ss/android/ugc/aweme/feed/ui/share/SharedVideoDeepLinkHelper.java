package com.ss.android.ugc.aweme.feed.ui.share;

import X.ActivityC45651qj;
import X.C118324ke;
import X.C16880lQ;
import X.C221018lt;
import X.C221108m2;
import X.C33Y;
import X.C46272IEa;
import X.C50420Jqa;
import X.C55751LuN;
import X.C55752LuO;
import X.C55756LuS;
import X.C57135Mbb;
import X.C62822Ol8;
import X.C76322z6;
import X.C76402zE;
import X.C77266UUc;
import X.C78613UtF;
import X.EXV;
import X.InterfaceC71762rk;
import X.LJK;
import X.QD3;
import X.UVX;
import X.X1D;
import X.XIC;
import X.XIF;
import X.XKQ;
import X.XKW;
import X.XKX;
import Y.AObserverS65S0200000_1;
import Y.ARunnableS45S0100000_9;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class SharedVideoDeepLinkHelper implements LifecycleEventObserver {
    public static boolean LJLL;
    public final BaseListFragmentPanel LJLIL;
    public final XKW LJLILLLLZI;
    public final XKW LJLJI;
    public final InterfaceC71762rk<C33Y> LJLJJI;
    public C55756LuS LJLJJL;
    public C55752LuO LJLJJLL;
    public UVX LJLJL;
    public final C62822Ol8 LJLJLJ;
    public XKQ LJLJLLL;

    public SharedVideoDeepLinkHelper(RecommendFeedFragmentPanel panel) {
        o.LJIIIZ(panel, "panel");
        XIF fastMain = EXV.LIZ;
        XIC defaultDispatcher = C78613UtF.LIZ;
        o.LJIIIZ(fastMain, "fastMain");
        o.LJIIIZ(defaultDispatcher, "defaultDispatcher");
        this.LJLIL = panel;
        this.LJLILLLLZI = fastMain;
        this.LJLJI = defaultDispatcher;
        this.LJLJJI = C57135Mbb.LIZIZ.LJI().LIZIZ();
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 975));
        EventBus.LIZJ().LJIILJJIL(this);
        panel.getLifecycle().addObserver(this);
        ActivityC45651qj requireActivity = panel.getFragment().requireActivity();
        o.LJIIIIZZ(requireActivity, "panel.fragment.requireActivity()");
        C77266UUc.LIZIZ.getRelationService().LJFF().observe(requireActivity, new AObserverS65S0200000_1(requireActivity, this, 15));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFeedRefreshEvent(LJK event) {
        o.LJIIIZ(event, "event");
        C55756LuS c55756LuS = this.LJLJJL;
        if (c55756LuS != null) {
            c55756LuS.LIZIZ();
        }
        this.LJLJJL = null;
        C55752LuO c55752LuO = this.LJLJJLL;
        if (c55752LuO != null) {
            c55752LuO.LJ = null;
            XKQ xkq = c55752LuO.LJFF;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
        }
        this.LJLJJLL = null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowStatusEvent(FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus;
        C221018lt.LJFF("@LinkRelation_Video", "receive follow event!");
        if (followStatusEvent == null || (followStatus = followStatusEvent.status) == null) {
            return;
        }
        C76322z6 c76322z6 = (C76322z6) this.LJLJLJ.getValue();
        String str = followStatus.userId;
        o.LJIIIIZZ(str, "followStatus.userId");
        c76322z6.LIZ(followStatus.followStatus, followStatus.followerStatus, str);
    }

    @QD3(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onVideoFirstFrameRendered(C46272IEa c46272IEa) {
        if (LJLL) {
            return;
        }
        boolean z = true;
        LJLL = true;
        C55751LuN c55751LuN = C55751LuN.LIZJ;
        if (c55751LuN != null) {
            C55751LuN.LIZJ = null;
            c55751LuN.LIZ();
        }
        C55756LuS c55756LuS = this.LJLJJL;
        if (c55756LuS == null || !c55756LuS.LJ) {
            z = false;
        }
        if (z) {
            this.LJLIL.postDelayed(new ARunnableS45S0100000_9(this, 43), 100L);
            C221018lt.LJFF("@LinkRelation_Video", "set video pause!");
        }
        UVX uvx = this.LJLJL;
        if (uvx != null) {
            uvx.LIZIZ();
        }
        this.LJLJL = null;
        C221018lt.LJFF("@LinkRelation_Video", "onVideoFirstFrameRendered!");
    }

    public final boolean LIZ(Intent intent, boolean z) {
        if (intent == null) {
            return false;
        }
        boolean booleanExtra = intent.getBooleanExtra("from_notification", false);
        boolean booleanExtra2 = intent.getBooleanExtra("share_expose_sharer", false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isFromPush: ");
        LIZ.append(booleanExtra);
        LIZ.append(", isExposeShare: ");
        LIZ.append(booleanExtra2);
        C221018lt.LJFF("@LinkRelation_Video", X1D.LIZIZ(LIZ));
        if (!booleanExtra && booleanExtra2) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "gids");
            if (LLJJIJIIJIL == null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "aweme_id")) == null) {
                LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "share_item_id");
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("deeplink intent aid: ");
            LIZ2.append(LLJJIJIIJIL);
            C221018lt.LJFF("@LinkRelation_Video", X1D.LIZIZ(LIZ2));
            intent.removeExtra("gids");
            intent.removeExtra("aweme_id");
            intent.removeExtra("share_expose_sharer");
            intent.removeExtra("share_item_id");
            intent.removeExtra("from_notification");
            if (LLJJIJIIJIL != null) {
                XKQ xkq = this.LJLJLLL;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                this.LJLJLLL = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLIL), this.LJLJI, null, new C76402zE(this, z, LLJJIJIIJIL, null), 2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.profile.model.User r4, java.lang.String r5) {
        /*
            r3 = this;
            X.LuO r1 = r3.LJLJJLL
            r2 = 1
            if (r1 == 0) goto L49
            java.lang.String r0 = "awemeId"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = r1.LIZIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 != r2) goto L49
            r0 = 1
        L13:
            java.lang.String r1 = "@LinkRelation_Video"
            if (r0 == 0) goto L29
            java.lang.String r0 = "insert aweme by old operator!"
            X.C221018lt.LJFF(r1, r0)
            X.LuO r1 = r3.LJLJJLL
            if (r1 == 0) goto L24
            boolean r0 = r1.LIZLLL
            if (r0 != r2) goto L25
        L24:
            return
        L25:
            r1.LIZ(r4)
            goto L24
        L29:
            java.lang.String r0 = "insert aweme by new operator!"
            X.C221018lt.LJFF(r1, r0)
            X.LuO r0 = r3.LJLJJLL
            if (r0 == 0) goto L3c
            r1 = 0
            r0.LJ = r1
            X.XKQ r0 = r0.LJFF
            if (r0 == 0) goto L3c
            r0.LIZIZ(r1)
        L3c:
            X.LuO r1 = new X.LuO
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r0 = r3.LJLIL
            r1.<init>(r0, r5)
            r3.LJLJJLL = r1
            r1.LIZ(r4)
            goto L24
        L49:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper.LIZIZ(com.ss.android.ugc.aweme.profile.model.User, java.lang.String):void");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        int i = C118324ke.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C55756LuS c55756LuS = this.LJLJJL;
            if (c55756LuS != null) {
                c55756LuS.LIZIZ();
            }
            this.LJLJJL = null;
            EventBus.LIZJ().LJIJ(this);
            return;
        }
        C55756LuS c55756LuS2 = this.LJLJJL;
        if (c55756LuS2 == null || !c55756LuS2.LJ) {
            return;
        }
        this.LJLIL.onInternalEvent(new C50420Jqa(44));
    }
}
