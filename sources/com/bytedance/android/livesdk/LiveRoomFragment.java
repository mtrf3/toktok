package com.bytedance.android.livesdk;

import X.AbstractC28221B5t;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.B32;
import X.B3D;
import X.B42;
import X.B43;
import X.B4G;
import X.B4H;
import X.B4R;
import X.B4S;
import X.B4U;
import X.B4W;
import X.B53;
import X.B54;
import X.B57;
import X.B5V;
import X.B73;
import X.B7Z;
import X.BFS;
import X.BFV;
import X.BFW;
import X.BJB;
import X.BJL;
import X.BJM;
import X.BJN;
import X.BKJ;
import X.BKK;
import X.BKP;
import X.BKU;
import X.BKY;
import X.BKZ;
import X.BL6;
import X.BLB;
import X.BLH;
import X.BLL;
import X.BM1;
import X.BMS;
import X.BOT;
import X.BZI;
import X.C08680Vs;
import X.C0JT;
import X.C0NB;
import X.C0NE;
import X.C107244Iu;
import X.C10A;
import X.C12800eq;
import X.C141335gf;
import X.C15380j0;
import X.C15580jK;
import X.C15610jN;
import X.C16880lQ;
import X.C1FL;
import X.C20760rg;
import X.C28202B5a;
import X.C28246B6s;
import X.C28329B9x;
import X.C28467BFf;
import X.C28571BJf;
import X.C28592BKa;
import X.C28594BKc;
import X.C28595BKd;
import X.C28599BKh;
import X.C28600BKi;
import X.C28601BKj;
import X.C28603BKl;
import X.C28604BKm;
import X.C28608BKq;
import X.C28614BKw;
import X.C28643BLz;
import X.C28733BPl;
import X.C28787BRn;
import X.C29044Baa;
import X.C29049Baf;
import X.C29054Bak;
import X.C29162BcU;
import X.C29306Beo;
import X.C29S;
import X.C30317Bv7;
import X.C30770C5u;
import X.C30868C9o;
import X.C30882CAc;
import X.C31023CFn;
import X.C39202Fa2;
import X.C3C5;
import X.C40625Fwz;
import X.C47061t0;
import X.C47121t6;
import X.C59902Ws;
import X.C62622d0;
import X.C73318Sq2;
import X.C73943T0h;
import X.C73969T1h;
import X.C76800UCe;
import X.C80797VnN;
import X.C88207Yjb;
import X.C90903hW;
import X.CN1;
import X.CP6;
import X.EnumC12790ep;
import X.EnumC28203B5b;
import X.EnumC29309Ber;
import X.EnumC30414Bwg;
import X.InterfaceC28159B3j;
import X.InterfaceC28220B5s;
import X.InterfaceC28602BKk;
import X.InterfaceC28606BKo;
import X.InterfaceC28607BKp;
import X.InterfaceC28615BKx;
import X.InterfaceC28738BPq;
import X.InterfaceC62632d1;
import X.InterfaceC64592gB;
import X.InterfaceC75512TkK;
import X.InterfaceC86147XrT;
import X.ORS;
import X.T16;
import X.W6K;
import X.X1D;
import Y.AObjectS21S0001000_5;
import Y.ARunnableS8S0201000_5;
import Y.ARunnableS9S0101000_5;
import Y.AfS36S0101000_5;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider;
import com.bytedance.android.livesdk.live.data.DrawRoomListModel;
import com.bytedance.android.livesdk.liveroom.RoomListener;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.liveroom.RoomTaskController;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveLandscapeEnterOp;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.feed.GameLiveBottomBarSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting;
import com.bytedance.android.livesdk.livesetting.model.GeckoLiveGroupOpt;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedPreloadSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.CollectPerformanceAfterEnterRoomSetting;
import com.bytedance.android.livesdk.livesetting.performance.DataChannelGlobalOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2Setting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetLifecycleDispatchOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.ViewAutoPreloadOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableSlideEnterRoomOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerDrawOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtRoomSlideUpGuideSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSlideUpGuideStrategySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.PackEnterRoomOptEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.EnablePreDownloadLive;
import com.bytedance.android.livesdk.model.FeedPreloadConfig;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.stream.performance.abs.AudienceBlockHeartBeatMonitorEnableSetting;
import com.bytedance.android.livesdk.survey.ISurveyService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget;
import com.bytedance.android.livesdk.widget.RecommendSwipeOldWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.g0;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public class LiveRoomFragment extends BaseFragment implements B3D, B42, InterfaceC86147XrT, InterfaceC28615BKx, InterfaceC62632d1, InterfaceC28159B3j {
    public static boolean LLIZ = true;
    public RoomStatusController LJLILLLLZI;
    public RoomTaskController LJLJI;
    public RoomListener LJLJJI;
    public W6K LJLJJL;
    public int LJLJLJ;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public Map<String, String> LJLLLL;
    public boolean LJLZ;
    public BLB LJZ;
    public LivePlayFragment LJZI;
    public long LJZL;
    public boolean LL;
    public boolean LLD;
    public C80797VnN LLF;
    public FrameLayout LLFF;
    public AbstractC28221B5t LLFFF;
    public BKK LLFII;
    public boolean LLFZ;
    public BKP LLIIII;
    public InterfaceC28602BKk LLIIIILZ;
    public InterfaceC28738BPq LLIIIZ;
    public B32 LLIILII;
    public String LLILL;
    public final BLH LJLIL = new BLH();
    public boolean LJLJJLL = true;
    public float LJLJL = 0.0f;
    public boolean LJLJLLL = true;
    public boolean LJLL = false;
    public boolean LJLLLLLL = false;
    public long LLI = -1;
    public ARunnableS8S0201000_5 LLIFFJFJJ = null;
    public boolean LLII = false;
    public boolean LLIIIJ = false;
    public int LLIIIL = -1;
    public C73318Sq2 LLIIJI = new C73318Sq2();
    public boolean LLIIJLIL = false;
    public final boolean LLIIL = EnableSlideEnterRoomOptSetting.INSTANCE.getValue();
    public long LLIILZL = 0;
    public boolean LLIIZ = false;
    public boolean LLIL = true;
    public boolean LLILII = false;
    public boolean LLILIL = true;
    public final C28603BKl LLILLIZIL = new InterfaceC75512TkK() { // from class: X.BKl
        @Override // X.InterfaceC75512TkK
        public final void LIZ(boolean z) {
            LiveRoomFragment.this.Sl();
        }
    };
    public final boolean LLILLJJLI = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
    public final boolean LLILLL = EnablePreDownloadLive.INSTANCE.isEnable();
    public boolean LLILZ = false;
    public boolean LLILZIL = false;
    public IDRunnableS6S0101000 LLILZLL = null;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        int currentItem;
        Pl(null);
        if (mo49getActivity() != null && mo49getActivity().isFinishing()) {
            if ((this.LLFFF instanceof InterfaceC28606BKo) && (currentItem = this.LLF.getCurrentItem()) >= 0 && currentItem < this.LLFFF.size() && this.LLFFF.LIZLLL(currentItem).mRoomsData.roomId != 0) {
                ((InterfaceC28606BKo) this.LLFFF).LJIIIZ();
            }
            ((IMessageService) CN1.LIZ(IMessageService.class)).releaseAll();
            if (this.LLII) {
                this.LLII = false;
            } else {
                ((ConcurrentHashMap) DataChannelGlobal.LJLJJI.LJLIL).remove(C29044Baa.class);
            }
        }
        super.onPause();
        C28594BKc LIZJ = C28594BKc.LIZJ();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        LIZJ.getClass();
        if (mo49getActivity == null || mo49getActivity.hashCode() != LIZJ.LIZJ || !mo49getActivity.isFinishing()) {
            return;
        }
        LIZJ.LIZ = false;
        LIZJ.LIZIZ = null;
    }

    @Override // X.B3D
    public final Fragment wc() {
        return this;
    }

    @Override // X.B3D
    public final int J3() {
        AbstractC28221B5t abstractC28221B5t = this.LLFFF;
        if (abstractC28221B5t != null) {
            return abstractC28221B5t.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Jl() {
        /*
            r13 = this;
            X.W6K r4 = r13.LJLJJL
            r12 = 0
            if (r4 == 0) goto La
            java.lang.Object r0 = r4.LJLILLLLZI
            r11 = 1
            if (r0 != 0) goto Lb
        La:
            return r12
        Lb:
            X.BLz r0 = X.B57.LIZ
            com.bytedance.android.livesdkapi.session.EnterRoomLinkSession r0 = r0.LIZ()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r3 = r0.mEnterRoomConfig
            r0 = 0
            if (r3 != 0) goto La9
            r3 = r0
        L17:
            r0 = 0
        L18:
            r8 = 0
            if (r0 == 0) goto L78
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r3.mRoomsData
            long r0 = r0.backRoomId
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L78
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r6 = new com.bytedance.android.livesdkapi.session.EnterRoomConfig
            r6.<init>()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r5 = r6.mRoomsData
            r5.roomId = r0
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r3 = r3.mRoomsData
            java.lang.String r2 = r3.enterFromMerge
            r5.enterFromMerge = r2
            java.lang.String r2 = r3.enterMethod
            r5.enterMethod = r2
            r5.fromAutoJump = r12
            java.lang.Object r2 = r4.LJLILLLLZI
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r2 = (com.bytedance.android.livesdkapi.session.EnterRoomConfig) r2
            if (r2 == 0) goto La7
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r2 = r2.mRoomsData
            if (r2 == 0) goto La7
            boolean r2 = r2.isShowBackRoom
        L45:
            r5.isShowBackRoom = r2
            r4.LJLILLLLZI = r6
            com.bytedance.android.livesdkapi.session.EnterRoomLinkSession r6 = com.bytedance.android.livesdkapi.session.EnterRoomLinkSession.LJI(r6)
            com.bytedance.android.livesdkapi.session.Event r5 = new com.bytedance.android.livesdkapi.session.Event
            X.B5b r7 = X.EnumC28203B5b.MessageReceived
            java.lang.String r3 = "mic_room_jump_event"
            r2 = 1033(0x409, float:1.448E-42)
            r5.<init>(r3, r2, r7)
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r2 = "roomid:"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " autojump: false"
            r3.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r3)
            r5.LIZIZ(r0)
            r6.LIZIZ(r5)
            java.lang.String r0 = "livesdk_line_up_list_click_return"
            X.C0Y4.LIZ(r0)
        L78:
            java.lang.Object r10 = r4.LJLILLLLZI
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r10 = (com.bytedance.android.livesdkapi.session.EnterRoomConfig) r10
            if (r10 == 0) goto L84
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r10.mRoomsData
            if (r0 == 0) goto L84
            long r8 = r0.roomId
        L84:
            if (r10 == 0) goto L90
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r1 = r10.mRoomsData
            if (r1 != 0) goto La2
        L8a:
            if (r10 == 0) goto L90
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r1 = r10.mRoomsData
            if (r1 != 0) goto L9d
        L90:
            X.B3P r7 = new X.B3P
            r7.<init>(r8, r10, r11, r12)
            X.T0h r0 = X.C73943T0h.LIZ()
            r0.LIZIZ(r7)
            return r11
        L9d:
            java.lang.String r0 = "click"
            r1.actionType = r0
            goto L90
        La2:
            java.lang.String r0 = "draw"
            r1.backPreRoomType = r0
            goto L8a
        La7:
            r2 = 0
            goto L45
        La9:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r3.mRoomsData
            if (r0 == 0) goto L17
            boolean r0 = r0.isShowBackRoom
            if (r0 != r11) goto L17
            r0 = 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.LiveRoomFragment.Jl():boolean");
    }

    @Override // X.B3D
    public final boolean N9() {
        BKP bkp = this.LLIIII;
        if (bkp != null && bkp.LJLJJL == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r5.LLF.getCurrentItem() >= (r2.size() - 1)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nl() {
        /*
            r5 = this;
            X.VnN r0 = r5.LLF
            if (r0 == 0) goto L71
            X.B5t r1 = r5.LLFFF
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider
            if (r0 == 0) goto L71
            boolean r0 = r5.LJLLL
            if (r0 != 0) goto L71
            java.util.List r0 = r1.LJIILJJIL()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r0.iterator()
        L1b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.add(r0)
            goto L1b
        L33:
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.LJLLLL
            r4 = 0
            if (r1 == 0) goto L81
            java.lang.String r0 = "related_live_tag"
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
        L40:
            boolean r0 = r5.LJLLLLLL
            if (r0 != 0) goto L58
            X.VnN r0 = r5.LLF
            int r1 = r0.getCurrentItem()
            X.VnN r0 = r5.LLF
            int r0 = r0.getCurrentItem()
            int r0 = r0 + 1
            boolean r0 = r5.vl(r1, r0)
            if (r0 == 0) goto L72
        L58:
            r2 = r4
        L59:
            r4 = r2
        L5a:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostWatch> r0 = com.bytedance.android.livesdkapi.host.IHostWatch.class
            X.0Mx r2 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdkapi.host.IHostWatch r2 = (com.bytedance.android.livesdkapi.host.IHostWatch) r2
            X.B5t r0 = r5.LLFFF
            boolean r1 = r0.LJIILL()
            X.VnN r0 = r5.LLF
            int r0 = r0.getCurrentItem()
            r2.updateRoomLists(r3, r1, r0, r4)
        L71:
            return
        L72:
            X.VnN r0 = r5.LLF
            int r1 = r0.getCurrentItem()
            int r0 = r2.size()
            int r0 = r0 + (-1)
            if (r1 < r0) goto L59
            goto L5a
        L81:
            r3 = r4
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.LiveRoomFragment.Nl():void");
    }

    @Override // X.InterfaceC62632d1
    public final void O8() {
        FrameLayout frameLayout = this.LLFF;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
        }
    }

    public final boolean Ql() {
        PagerAdapter pagerAdapter;
        C80797VnN c80797VnN = this.LLF;
        if (c80797VnN == null || (pagerAdapter = c80797VnN.LJLJJLL) == null || c80797VnN.LJLJL >= pagerAdapter.getCount() - 1) {
            return false;
        }
        c80797VnN.setCurrentItemWithDefaultVelocity(c80797VnN.LJLJL + 1);
        return true;
    }

    public final void Rl() {
        C80797VnN c80797VnN;
        if (this.LLIFFJFJJ == null || (c80797VnN = this.LLF) == null) {
            return;
        }
        c80797VnN.post(new ARunnableS9S0101000_5(0, this, 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Sl() {
        /*
            r8 = this;
            X.VnN r0 = r8.LLF
            if (r0 == 0) goto L30
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
            r7 = 0
            boolean r6 = r0.Qh(r7)
            com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting r0 = com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting.INSTANCE
            boolean r0 = r0.isEnable()
            r5 = 1
            if (r0 != 0) goto L42
            boolean r0 = r8.LLFZ
            r0 = r0 ^ 1
        L1e:
            if (r0 == 0) goto L4a
        L20:
            boolean r0 = r8.LLILZIL
            if (r0 != 0) goto L4a
            if (r6 != 0) goto L4a
            boolean r0 = r8.LLILZ
            if (r0 != 0) goto L4a
            r7 = 1
        L2b:
            X.VnN r0 = r8.LLF
            r0.setEnabled(r7)
        L30:
            boolean r0 = r8.Hl()
            if (r0 == 0) goto L41
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostWatch> r0 = com.bytedance.android.livesdkapi.host.IHostWatch.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdkapi.host.IHostWatch r0 = (com.bytedance.android.livesdkapi.host.IHostWatch) r0
            r0.updateSearchScrollStatus()
        L41:
            return
        L42:
            boolean r0 = r8.LLFZ
            if (r0 == 0) goto L20
            X.VnN r0 = r8.LLF
            if (r0 != 0) goto L6c
        L4a:
            X.VnN r0 = r8.LLF
            boolean r0 = r0.LLFFF
            if (r0 == 0) goto L2b
            if (r6 == 0) goto L2b
            long r0 = android.os.SystemClock.uptimeMillis()
            r4 = 3
            r5 = 0
            r2 = r0
            r6 = r5
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            r0 = 4098(0x1002, float:5.743E-42)
            r1.setSource(r0)
            X.VnN r0 = r8.LLF
            r0.dispatchTouchEvent(r1)
            r1.recycle()
            goto L2b
        L6c:
            int r4 = r0.getCurrentItem()
            java.lang.String r3 = r8.LJLLILLLL
            java.lang.String r2 = r8.LJLLI
            boolean r1 = r8.LJLLL
            int r0 = r4 + 1
            boolean r0 = r8.Gl(r4, r0, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.BKZ.LIZ(r3, r2, r1, r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.LiveRoomFragment.Sl():void");
    }

    @Override // X.InterfaceC28159B3j
    public final void U7() {
        Object LJIILLIIL = this.LLFII.LJIILLIIL(this.LLF.getCurrentItem(), this.LLF);
        if (LJIILLIIL instanceof LivePlayFragment) {
            ((LivePlayFragment) LJIILLIIL).LLJJJJ = true;
        }
    }

    @Override // X.InterfaceC28159B3j
    public final void Vi() {
        C80797VnN c80797VnN;
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(1, this, 37);
        this.LLILZLL = iDRunnableS6S0101000;
        if (this.LLFII != null && (c80797VnN = this.LLF) != null) {
            c80797VnN.post(iDRunnableS6S0101000);
        }
    }

    @Override // X.B3D
    public final BKJ getCurrentFragment() {
        BKK bkk = this.LLFII;
        if (bkk == null || bkk.getCount() == 0) {
            return null;
        }
        return this.LLFII.LJJIII(this.LLF.getCurrentItem());
    }

    @Override // X.B3D
    public final B4H l3() {
        return this.LJLJJI.getRoomEventListener();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Activity LJIILJJIL;
        String str;
        super.onDestroy();
        C28202B5a.LIZ().LJI(null);
        BLB blb = this.LJZ;
        if (blb != null) {
            C28601BKj c28601BKj = (C28601BKj) blb.LIZJ;
            if (c28601BKj != null && c28601BKj.LIZIZ) {
                c28601BKj.LIZJ.clear();
                c28601BKj.LJ.clear();
                c28601BKj.LJFF = null;
            }
            blb.LIZ = null;
            this.LJZ = null;
        }
        if (B53.LIZLLL == 0) {
            C29162BcU.LJFF(null, B4W.LIZIZ(), 1, B53.LJFF.size());
            BZI LIZ = C28787BRn.LIZ("livesdk_end_detection");
            LIZ.LJIJJ(Long.valueOf(B53.LIZIZ), "detection_user_id");
            LIZ.LJIJJ(Long.valueOf(B4W.LIZIZ()), "user_id");
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
            B53.LIZLLL = 1;
            B4W.LIZ = -1L;
        }
        C30770C5u.LJFF(EnumC30414Bwg.EVENT_PAGE_WATCH_LIVE);
        C28600BKi LIZIZ = C28600BKi.LIZIZ();
        Iterator it = ((ConcurrentHashMap) LIZIZ.LIZ).values().iterator();
        while (it.hasNext()) {
            ((ArrayList) ((C28599BKh) it.next()).LIZ).clear();
        }
        ((ConcurrentHashMap) LIZIZ.LIZ).clear();
        C15610jN.LIZLLL(null);
        B73.LIZJ(null);
        C88207Yjb.LJFF();
        C40625Fwz.LIZIZ();
        C62622d0.LIZ().LIZ.clear();
        ((IMessageService) CN1.LIZ(IMessageService.class)).retryReleaseAll();
        ((ISurveyService) CN1.LIZ(ISurveyService.class)).release();
        BFS.LIZIZ().LJII();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && mo49getActivity.isFinishing()) {
            CP6.LIZIZ().remove(Integer.valueOf(mo49getActivity.hashCode()));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("destroyBackRoomStack for ");
        LIZ2.append(mo49getActivity);
        LIZ2.append(", remaining cnt: ");
        LIZ2.append(CP6.LIZIZ().size());
        C0NB.LIZIZ("LiveBackRoomStack", X1D.LIZIZ(LIZ2));
        ((IInteractService) CN1.LIZ(IInteractService.class)).Fe(this.LLILLIZIL);
        AbstractC28221B5t abstractC28221B5t = this.LLFFF;
        if (abstractC28221B5t instanceof BLL) {
            BLL bll = (BLL) abstractC28221B5t;
            HashMap<String, HashSet<Long>> hashMap = bll.LJLJL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, HashSet<Long>> entry : hashMap.entrySet()) {
                entry.getValue().removeAll(bll.LJLJJLL);
                if (entry.getValue().size() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                try {
                    str = ((String) entry2.getKey()).substring(0, s.LJJLIIJ((CharSequence) entry2.getKey(), "_", 6));
                    o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
                } catch (Exception unused) {
                    str = (String) entry2.getKey();
                }
                if (bll.LJLILLLLZI == null) {
                    bll.LJLILLLLZI = new DrawRoomListModel();
                }
                DrawRoomListModel drawRoomListModel = bll.LJLILLLLZI;
                if (drawRoomListModel != null) {
                    AbstractC73672Svk<C28467BFf<Object>> collectUnreadRequest = drawRoomListModel.collectUnreadRequest(bll.LJLL, bll.LJLLI, str, new ArrayList((Collection) entry2.getValue()));
                    if (collectUnreadRequest != null) {
                        collectUnreadRequest.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new B7Z(str), new InterfaceC64592gB() { // from class: X.9DR
                            @Override // X.InterfaceC64592gB
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            }
                        });
                    }
                }
            }
        }
        if (CP6.LIZ(mo49getActivity()).LIZIZ() == null && !this.LLIIJLIL) {
            C08680Vs.LJIILJJIL.LJIIIZ();
        }
        if (!this.LLIIJLIL && mo49getActivity() != null && !mo49getActivity().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            Ml();
        } else {
            final ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
                    Ml();
                } else {
                    mo49getActivity2.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: X.BKb
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            LiveRoomFragment liveRoomFragment = LiveRoomFragment.this;
                            ActivityC45651qj activityC45651qj = mo49getActivity2;
                            liveRoomFragment.getClass();
                            if (activityC45651qj.isFinishing() && event.equals(Lifecycle.Event.ON_DESTROY)) {
                                liveRoomFragment.Ml();
                            }
                        }
                    });
                }
            }
        }
        ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LJ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context());
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).UM();
        LiveWidgetProviderProxy.Companion.getInstance().clearAll();
        B4U.LIZ().LJJII("stream");
        B4U.LIZ().LJJIIJ();
        B4U.LIZ().getClass();
        B4U.LIZ().LJJIJIIJI();
        LivePerformanceManager LIZ3 = B4U.LIZ();
        LIZ3.getClass();
        if (CollectPerformanceAfterEnterRoomSetting.INSTANCE.getEnable()) {
            LIZ3.LLIILII = false;
            Handler handler = LIZ3.LJLLLLLL;
            if (handler == null) {
                handler = LIZ3.LJIJI();
            }
            handler.removeCallbacks(LIZ3.LLJJIJI);
            LIZ3.LLIILZL = false;
        }
        B4U.LIZ().release();
        LiveMonitorSampleSetting.INSTANCE.release();
        C31023CFn.LIZJ(true);
        String str2 = this.LLILL;
        InterfaceC28738BPq interfaceC28738BPq = this.LLIIIZ;
        if (interfaceC28738BPq != null) {
            interfaceC28738BPq.LJFF();
            if (str2 != null) {
                this.LLIIIZ.LJJJJ(str2, "onDestroy", true);
                ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Jn0(str2);
                ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).PX(str2);
            }
            this.LLIIIZ.LJJIIJ();
        }
        if (LivePreCreateNextRoomPlayer.INSTANCE.getValue() > 0) {
            ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Be();
        }
        if (this.LLI > 0) {
            this.LLI = 0L;
        }
        if ((mo49getActivity() instanceof InterfaceC28607BKp) && !this.LLIIJLIL) {
            ((InterfaceC28607BKp) mo49getActivity()).LIZ();
        }
        BKP bkp = this.LLIIII;
        if (bkp != null) {
            bkp.LJI(null);
            this.LLIIII = null;
            this.LLIFFJFJJ = null;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29054Bak.class);
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29049Baf.class);
        C73318Sq2 c73318Sq2 = this.LLIIJI;
        if (c73318Sq2 != null && !c73318Sq2.LJLILLLLZI) {
            this.LLIIJI.dispose();
            this.LLIIJI = null;
        }
        ((LinkedHashMap) B54.LIZ).clear();
        B54.LIZIZ.clear();
        C30317Bv7.LJFF(0);
        BMS.LIZ.clear();
        C30882CAc Lu = ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
        Iterator it2 = ((ArrayList) Lu.LIZLLL).iterator();
        while (it2.hasNext()) {
            WebView webView = (WebView) ((Reference) it2.next()).get();
            if (webView != null && (LJIILJJIL = g0.LJIILJJIL(webView.getContext())) != null) {
                Iterator<Class> it3 = ((IHostAction) CN1.LIZ(IHostAction.class)).getLiveActivityClass().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (LJIILJJIL.getClass() == it3.next()) {
                            try {
                                webView.destroy();
                                break;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
        }
        ((ArrayList) Lu.LIZLLL).clear();
        ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).releaseGalleryModule();
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            LivePerformanceManager LIZ4 = B4U.LIZ();
            HandlerThread handlerThread = LIZ4.LJLLL;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            LIZ4.LJLLL = null;
            LIZ4.LJLLLLLL = null;
            C39202Fa2.LIZ.LIZLLL();
        }
        GeckoLiveGroupOpt LIZIZ2 = C28592BKa.LIZIZ();
        if (LIZIZ2 == null || !LIZIZ2.isPause || C28592BKa.LIZ() <= 0 || !C28592BKa.LIZ) {
            return;
        }
        ((IHostResource) CN1.LIZ(IHostResource.class)).nr(true);
        C28592BKa.LIZ = false;
    }

    @Override // X.B3D
    public final B4G p2() {
        return this.LJLJJI.getRoomAction();
    }

    @Override // X.B3D
    public final List<Long> rg() {
        C80797VnN c80797VnN;
        if (!PackEnterRoomOptEnableSetting.INSTANCE.isEnable() || (c80797VnN = this.LLF) == null || this.LLFFF == null) {
            return null;
        }
        return this.LLFFF.LJIILIIL(c80797VnN.getCurrentItem() + 1);
    }

    public final void wl() {
        C28604BKm c28604BKm;
        if (this.LLF == null || !(this.LLFFF instanceof InterfaceC28602BKk)) {
            return;
        }
        Sl();
        int currentItem = this.LLF.getCurrentItem();
        if (!BKZ.LIZ(this.LJLLILLLL, this.LJLLI, this.LJLLL, Boolean.valueOf(Gl(currentItem, currentItem + 1, true)))) {
            return;
        }
        this.LLIIIL = this.LLF.getCurrentItem();
        InterfaceC28602BKk interfaceC28602BKk = (InterfaceC28602BKk) this.LLFFF;
        this.LLIIIILZ = interfaceC28602BKk;
        interfaceC28602BKk.LIZIZ(this.LLF.getCurrentItem());
        C80797VnN c80797VnN = this.LLF;
        if (!LiveLandscapeInnerFeedSetting.INSTANCE.isEnable()) {
            c28604BKm = null;
        } else {
            c28604BKm = new C28604BKm(this);
        }
        c80797VnN.setLandscapeFeedSlideInterceptor(c28604BKm);
    }

    public final BKJ xl() {
        int currentItem;
        if (this.LLFII == null || (currentItem = this.LLF.getCurrentItem() + 1) < 0 || currentItem >= this.LLFII.getCount()) {
            return null;
        }
        return this.LLFII.LJJIII(currentItem);
    }

    public final void z4() {
        String str;
        int i;
        InterfaceC28602BKk interfaceC28602BKk;
        int i2;
        int currentItem = this.LLF.getCurrentItem();
        if (currentItem < 0) {
            C0NB.LIZIZ("LiveRoomFragment", "tryLoadMore curIndex return");
            return;
        }
        int i3 = 2;
        if (LiveLandscapeInnerFeedSetting.INSTANCE.isEnable() && this.LLFZ && (interfaceC28602BKk = this.LLIIIILZ) != null) {
            FeedPreloadConfig value = LiveFeedPreloadSetting.INSTANCE.getValue();
            if (value != null && (i2 = value.feedPreloadInRoom) > 0) {
                i3 = i2;
            }
            if (interfaceC28602BKk.LJFF(i3, currentItem)) {
                this.LLIIIILZ.LIZ(currentItem);
                return;
            }
            return;
        }
        BKK bkk = this.LLFII;
        if (bkk == null) {
            return;
        }
        int count = bkk.getCount() - currentItem;
        FeedPreloadConfig value2 = LiveFeedPreloadSetting.INSTANCE.getValue();
        if (value2 != null && (i = value2.feedPreloadInRoom) > 0) {
            i3 = i;
        }
        if (count > i3) {
            return;
        }
        if (this.LLFFF.LJIILL()) {
            this.LLFFF.LJIIZILJ(currentItem);
            return;
        }
        if (!this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = false;
        if (!BKU.LIZJ(BKU.LIZIZ())) {
            return;
        }
        AbstractC28221B5t abstractC28221B5t = this.LLFFF;
        if (abstractC28221B5t instanceof BLL) {
            BLL bll = (BLL) abstractC28221B5t;
            String followReqfrom = bll.LJLLJ;
            String followChannelId = bll.LJLLL;
            o.LJIIIZ(followReqfrom, "followReqfrom");
            o.LJIIIZ(followChannelId, "followChannelId");
            BKU.LJ = followReqfrom;
            BKU.LJFF = followChannelId;
            BKU.LJI = "follow_live_empty";
            BKU.LJII = "36";
            BKU.LIZ = BM1.LJIILL;
            BKU.LIZIZ = BM1.LJIILLIIL;
            String LIZIZ = BKU.LIZIZ();
            if (RecommendEndAtFollowingSetting.INSTANCE.getValue().followingEntrances.contains(LIZIZ)) {
                if (ujb.o.LJJJLIIL(LIZIZ, "homepage_follow_", false)) {
                    str = "homepage_follow";
                } else if (ujb.o.LJJJLIIL(LIZIZ, "message_", false)) {
                    str = "message";
                } else if (ujb.o.LJJJLIIL(LIZIZ, "push_", false)) {
                    str = "push";
                } else if (ujb.o.LJJJLIIL(LIZIZ, "inner_push_", false)) {
                    str = "inner_push";
                } else if (ujb.o.LJJJLIIL(LIZIZ, "follow_widget_", false)) {
                    str = "follow_widget";
                } else if (ujb.o.LJJJLIIL(LIZIZ, "personal_homepage_", false)) {
                    str = "personal_homepage";
                }
                BKU.LIZLLL = str;
                BKU.LIZJ = "follow_recommend";
                bll.LJLLJ = "follow_live_empty";
                bll.LJLLL = "36";
                this.LLFFF.LJIIZILJ(currentItem);
                return;
            }
            str = BM1.LJIILL;
            BKU.LIZLLL = str;
            BKU.LIZJ = "follow_recommend";
            bll.LJLLJ = "follow_live_empty";
            bll.LJLLL = "36";
            this.LLFFF.LJIIZILJ(currentItem);
            return;
        }
        if (!(abstractC28221B5t instanceof MultiPlusFeedRoomListProvider)) {
            return;
        }
        BKU.LIZ = BM1.LJIILL;
        BKU.LIZIZ = BM1.LJIILLIIL;
        BKU.LIZLLL = BM1.LJIILL;
        BKU.LIZJ = "video_related_recommend";
        abstractC28221B5t.LJIIZILJ(currentItem);
    }

    public final boolean Hl() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        return arguments.getBoolean("is_from_search_live", false);
    }

    @Override // X.B3D
    public final void LJLJJL() {
        if (getCurrentFragment() != null) {
            getCurrentFragment().LJLJJL();
        }
    }

    @Override // X.B3D
    public final void LLLFF() {
        BKJ currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            currentFragment.LLLFF();
        }
    }

    public final void Ml() {
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("invite_issue_check", "LinkIn_Guest_resetViews");
        BKJ currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            currentFragment.LLLFF();
        }
        try {
            this.LLF.setAdapter(null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        BKK bkk = this.LLFII;
        if (bkk != null) {
            InterfaceC28220B5s interfaceC28220B5s = bkk.LJLJJL;
            ((HashSet) ((AbstractC28221B5t) interfaceC28220B5s).LJLIL).remove(bkk.LJLJJLL);
            this.LLFII = null;
        }
        AbstractC28221B5t abstractC28221B5t = this.LLFFF;
        if (abstractC28221B5t != null) {
            abstractC28221B5t.LJIJ();
            this.LLFFF = null;
        }
    }

    @Override // X.InterfaceC86147XrT
    public final boolean onBackPressed() {
        BKJ currentFragment = getCurrentFragment();
        if (currentFragment != null && currentFragment.onBackPressed()) {
            return true;
        }
        return Jl();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        BKU.LIZ = "";
        BKU.LIZIZ = "";
        BKU.LIZJ = "";
        BKU.LIZLLL = "";
        BKU.LJ = "";
        BKU.LJFF = "";
        BKU.LJI = "";
        BKU.LJII = "";
        BKU.LJIIJ = "";
        this.LJLJLLL = true;
        C28202B5a.LIZ().LIZLLL = null;
        ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).ka0();
        C08680Vs.LJIILJJIL.getClass();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        EnumC29309Ber.AUDIENCE.config();
        Rl();
        this.LLIIJLIL = false;
        InterfaceC28738BPq interfaceC28738BPq = this.LLIIIZ;
        if (interfaceC28738BPq != null) {
            interfaceC28738BPq.LJJ(false);
        }
    }

    @Override // X.B3D
    public final void y2() {
        boolean z;
        BKJ xl = xl();
        if (xl != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (xl instanceof LivePlayFragment)) {
            LivePlayFragment livePlayFragment = (LivePlayFragment) xl;
            if (livePlayFragment.LLIIIJ == null && !livePlayFragment.LLJJJJLIIL) {
                if (TextUtils.isEmpty(livePlayFragment.LJLJLLL) && TextUtils.isEmpty(livePlayFragment.LJLJL)) {
                    return;
                }
                livePlayFragment.LLJJJJLIIL = true;
                livePlayFragment.LLLLZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).gf(livePlayFragment.LJLIL, livePlayFragment.getContext(), livePlayFragment.LJLJL, livePlayFragment.LJLJLJ, livePlayFragment.LJLJLLL, livePlayFragment.LJLLI, livePlayFragment.LJLLILLLL, livePlayFragment.LJLLJ, livePlayFragment.LLLLZ, livePlayFragment.LLLZL.mStreamData.captionStreamDelayMs);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    public static void Ll(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_bottom_end");
        LIZ.LJIJJ(str, "reach_type");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJI();
            LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
            LIZ.LJJIIZI();
        }
    }

    public final boolean Al(float f) {
        InterfaceC28602BKk interfaceC28602BKk;
        if (!this.LLFZ || !LiveLandscapeInnerFeedSetting.INSTANCE.isEnable()) {
            return false;
        }
        if (this.LLF == null || this.LLIIIJ || (interfaceC28602BKk = this.LLIIIILZ) == null || interfaceC28602BKk.LIZJ() < 0) {
            return true;
        }
        if (f > 0.0f && this.LLF.getCurrentItem() <= this.LLIIIL) {
            return true;
        }
        if (f >= 0.0f || this.LLF.getCurrentItem() < this.LLIIIILZ.LIZJ()) {
            return false;
        }
        return true;
    }

    public final boolean Dl(LivePlayFragment livePlayFragment) {
        boolean z;
        boolean z2;
        if (this.LLIIII == null || getCurrentFragment() == null || livePlayFragment == null) {
            return false;
        }
        if (this.LLIIII.LJLJJL == 0) {
            z = true;
        } else {
            z = false;
        }
        if (getCurrentFragment() == livePlayFragment) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean Kl(long j) {
        AbstractC28221B5t abstractC28221B5t = this.LLFFF;
        if (abstractC28221B5t != null && abstractC28221B5t.LJIILJJIL() != null && this.LLFFF.LJIILJJIL().size() > 1) {
            for (Room room : this.LLFFF.LJIILJJIL()) {
                if (room != null && j == room.getId()) {
                    this.LLFFF.LJIJI(j);
                    return true;
                }
            }
        } else {
            AbstractC28221B5t abstractC28221B5t2 = this.LLFFF;
            if ((abstractC28221B5t2 instanceof C28608BKq) && abstractC28221B5t2.size() > 1) {
                C28608BKq c28608BKq = (C28608BKq) this.LLFFF;
                int size = ((ArrayList) c28608BKq.LJLJJI).size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (((EnterRoomConfig) ListProtector.get(c28608BKq.LJLJJI, i)).mRoomsData.roomId == j) {
                        if (i >= 0) {
                            this.LLFFF.LJIJI(j);
                            return true;
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.B3D
    public final void LLLIIII(boolean z) {
        if (getCurrentFragment() != null) {
            getCurrentFragment().LLLIIII(z);
        }
    }

    @Override // X.B3D
    public final void M9(String str) {
        BJL bjl;
        BKJ currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return;
        }
        B5V O3 = currentFragment.O3();
        B5V b5v = B5V.LIVE_STARTED;
        if (O3 == b5v || O3 == B5V.DETACHED) {
            if (this.LJLIL != null) {
                BLH.LIZ(currentFragment.Jj());
            }
            C28246B6s LIZIZ = BJN.LIZIZ();
            if (LIZIZ != null && (bjl = LIZIZ.LJFF) != null) {
                bjl.LJ = str;
            }
            if (O3 == b5v) {
                return;
            }
        }
        if (TextUtils.equals(str, "click")) {
            currentFragment.C5();
            return;
        }
        BKP bkp = this.LLIIII;
        if (bkp == null) {
            return;
        }
        bkp.LIZIZ(bkp.LJLJLJ, currentFragment);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Pl(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.LJLZ
            if (r0 != 0) goto L5
            return
        L5:
            X.BKJ r4 = r6.getCurrentFragment()
            if (r4 == 0) goto L43
            boolean r0 = r4 instanceof com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment
            if (r0 == 0) goto L43
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r4 = (com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment) r4
            r5 = 0
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L46
            int r0 = r7.getAction()
            if (r0 != r3) goto L43
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = r6.LJZI
            if (r0 == 0) goto L44
            com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget r0 = r0.LLLJL
            if (r0 == 0) goto L27
            r0.LLIILII(r2)
        L27:
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = r6.LJZI
            r0.Gl(r2)
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = r6.LJZI
            com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget r0 = r0.LLLJL
            if (r0 == 0) goto L44
            float r5 = r0.LLFFF
            boolean r1 = r0.LLFII
        L36:
            com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget r0 = r4.LLLJL
            if (r0 == 0) goto L3e
            r0.LLFFF = r5
            r0.LLFII = r1
        L3e:
            r4.Gl(r3)
            r6.LJLZ = r2
        L43:
            return
        L44:
            r1 = 0
            goto L36
        L46:
            X.VnN r1 = r6.LLF
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.LJJII(r0, r3)
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = r6.LJZI
            if (r0 == 0) goto La7
            com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget r0 = r0.LLLJL
            if (r0 == 0) goto L58
            r0.LLIILII(r2)
        L58:
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r1 = r6.LJZI
            r1.getClass()
            com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting.INSTANCE
            com.bytedance.android.livesdk.model.LiveRecommendAtEnd r0 = r0.getValue()
            boolean r0 = r0.styleIsNew
            if (r0 != 0) goto L9f
            com.bytedance.android.livesdk.widget.RecommendSwipeOldWidget r0 = r1.LLLJIL
            if (r0 == 0) goto L6e
            r0.LLFZ(r2)
        L6e:
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = r6.LJZI
            com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget r0 = r0.LLLJL
            if (r0 == 0) goto La7
            float r5 = r0.LLFFF
            boolean r1 = r0.LLFII
        L78:
            com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget r0 = r4.LLLJL
            if (r0 == 0) goto L80
            r0.LLFFF = r5
            r0.LLFII = r1
        L80:
            r4.Gl(r3)
            com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting.INSTANCE
            com.bytedance.android.livesdk.model.LiveRecommendAtEnd r0 = r0.getValue()
            boolean r0 = r0.styleIsNew
            if (r0 != 0) goto L97
            com.bytedance.android.livesdk.widget.RecommendSwipeOldWidget r0 = r4.LLLJIL
            if (r0 == 0) goto L94
            r0.LLFZ(r2)
        L94:
            r6.LJLZ = r2
            goto L43
        L97:
            com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget r0 = r4.LLLJL
            if (r0 == 0) goto L94
            r0.LLIIJI(r3, r2)
            goto L94
        L9f:
            com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget r0 = r1.LLLJL
            if (r0 == 0) goto L6e
            r0.LLIIJI(r2, r2)
            goto L6e
        La7:
            r1 = 0
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.LiveRoomFragment.Pl(android.view.MotionEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x029a, code lost:
    
        if (X.C38354F3m.LJ(r1) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b8 A[ADDED_TO_REGION] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.LiveRoomFragment.onActivityCreated(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C80797VnN c80797VnN;
        C80797VnN c80797VnN2;
        super.onConfigurationChanged(configuration);
        Boolean valueOf = Boolean.valueOf(this.LLFZ);
        boolean z = true;
        if (configuration != null) {
            int i = configuration.orientation;
            if (!valueOf.booleanValue() && i == 2) {
                wl();
                if (LandscapeWatchLiveGestureOpt.INSTANCE.getEnable() && (c80797VnN2 = this.LLF) != null) {
                    c80797VnN2.LJJIII();
                }
            } else if (valueOf.booleanValue() && i == 1) {
                InterfaceC28602BKk interfaceC28602BKk = this.LLIIIILZ;
                if (interfaceC28602BKk != null) {
                    interfaceC28602BKk.LJI(this.LLF.getCurrentItem());
                    this.LLIIIILZ = null;
                    this.LLIIIL = -1;
                }
                if (LandscapeWatchLiveGestureOpt.INSTANCE.getEnable() && (c80797VnN = this.LLF) != null) {
                    c80797VnN.LJJIIJ();
                }
            }
        }
        if (configuration.orientation != 2) {
            z = false;
        }
        this.LLFZ = z;
        Sl();
    }

    /* JADX WARN: Type inference failed for: r0v63, types: [X.BKX] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C28643BLz c28643BLz = B57.LIZ;
        c28643BLz.getClass();
        c28643BLz.LIZLLL = UUID.randomUUID().toString();
        DataChannelGlobalOptSetting.initDataChannelGlobalConfig();
        LiveWidgetLifecycleDispatchOptSetting.init();
        this.LJZ = new BLB(this);
        if (AudienceBlockHeartBeatMonitorEnableSetting.INSTANCE.getValue()) {
            B4U.LIZ().LLIL = this.LJZ;
        }
        EnumC29309Ber.AUDIENCE.config();
        LiveEnableALogSetting.INSTANCE.update();
        C40625Fwz.LIZ();
        C40625Fwz.LIZJ();
        boolean z = false;
        BM1.LJIILIIL = false;
        EnterRoomConfig enterRoomConfig = c28643BLz.LIZ().mEnterRoomConfig;
        BFS LIZIZ = BFS.LIZIZ();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String str = roomsData.enterFromMerge;
        String str2 = roomsData.enterMethod;
        String str3 = roomsData.inflowKey;
        LIZIZ.LJLLJ = this;
        int expVersion = LiveSlideUpGuideStrategySetting.INSTANCE.getExpVersion();
        String LJ = a1.LJ(str, "_", str2);
        if (!C107244Iu.LIZIZ(str3) && LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().isECSearchGuideEnable(str3)) {
            LIZIZ.LJLJLLL = str3;
            LIZIZ.LJLLI = BFW.LIZ;
            LIZIZ.LJLLILLLL = 0;
        } else if (expVersion == 0) {
            if (LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().isBaseLiveGuideEnable(LJ)) {
                LIZIZ.LJLJLLL = LJ;
                LIZIZ.LJLLI = BFV.LIZ;
                LIZIZ.LJLLILLLL = 0;
            }
            LIZIZ.LJLLILLLL = expVersion;
        } else {
            if (expVersion == 3 && C107244Iu.LIZ("live_merge_live_cover", LJ)) {
                LIZIZ.LJLJLLL = LJ;
                LIZIZ.LJLLI = BFV.LIZ;
                LIZIZ.LJLLILLLL = 4;
            }
            LIZIZ.LJLLILLLL = expVersion;
        }
        LIZIZ.LJII();
        LIZIZ.LJLIL = true;
        BKY LIZIZ2 = BKY.LIZIZ();
        if (LIZIZ2.LIZ) {
            LIZIZ2.LIZ = false;
            LIZIZ2.LIZIZ = 0;
            LIZIZ2.LIZJ = false;
        }
        LIZIZ2.LIZ = true;
        BKY.LIZIZ().LIZLLL.observeForever(LIZIZ);
        this.LLIILZL = System.currentTimeMillis();
        C12800eq.LJFF(EnumC12790ep.StartLivePlay);
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(null);
        hashMap.put("time", String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        hashMap.put("location", "live detail after super oncreate");
        BZI LIZIZ3 = C28787BRn.LIZIZ("feed_enter_room");
        LIZIZ3.LJJIFFI(hashMap);
        LIZIZ3.LJJIIJZLJL();
        this.LLIILII = new B32();
        this.LLILL = c28643BLz.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        InterfaceC28738BPq LIZIZ4 = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(this.LLILL);
        this.LLIIIZ = LIZIZ4;
        if (LIZIZ4 != null) {
            LIZIZ4.LJJJ();
        }
        ((IInteractService) CN1.LIZ(IInteractService.class)).Js0(this.LLILLIZIL);
        ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).SN().LIZ();
        ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).ho().LIZ();
        RoomListener roomListener = new RoomListener(this);
        this.LJLJJI = roomListener;
        if (!roomListener.initRoomEnvironment()) {
            return;
        }
        this.LJLILLLLZI = new RoomStatusController(this);
        this.LJLJI = new RoomTaskController();
        getLifecycle().addObserver(this.LJLILLLLZI);
        getLifecycle().addObserver(this.LJLJI);
        final C28594BKc LIZJ = C28594BKc.LIZJ();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        EnterRoomConfig enterRoomConfig2 = c28643BLz.LIZ().mEnterRoomConfig;
        if (mo49getActivity == null) {
            LIZJ.getClass();
        } else {
            LIZJ.LIZ = true;
            LIZJ.LIZIZ = new C28595BKd(enterRoomConfig2);
            LIZJ.LIZJ = mo49getActivity.hashCode();
            if (LIZJ.LIZLLL == null) {
                LIZJ.LIZLLL = new GenericLifecycleObserver() { // from class: X.BKX
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        C28594BKc c28594BKc = C28594BKc.this;
                        c28594BKc.getClass();
                        if ((lifecycleOwner instanceof ActivityC45651qj) && ((Activity) lifecycleOwner).isFinishing() && Lifecycle.Event.ON_DESTROY.equals(event) && lifecycleOwner.hashCode() == c28594BKc.LIZJ) {
                            c28594BKc.LIZ = false;
                            c28594BKc.LIZIZ = null;
                            lifecycleOwner.getLifecycle().removeObserver(c28594BKc.LIZLLL);
                            c28594BKc.LIZLLL = null;
                        }
                    }
                };
                mo49getActivity.getLifecycle().addObserver(LIZJ.LIZLLL);
            }
        }
        C73318Sq2 c73318Sq2 = this.LLIIJI;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZ(C73943T0h.LIZ().LJ(B4R.class).LJJJJZI(new AfS36S0101000_5(1, this, 3)));
            this.LLIIJI.LIZ(C73943T0h.LIZ().LJ(B43.class).LJJJJZI(new AfS36S0101000_5(1, this, 4)));
            this.LLIIJI.LIZ(C73943T0h.LIZ().LJ(B4S.class).LJJJJZI(new AfS36S0101000_5(0, this, 13)));
            this.LLIIJI.LIZ(C73943T0h.LIZ().LJ(C59902Ws.class).LJJJJZI(new AfS36S0101000_5(0, this, 14)));
            this.LLIIJI.LIZ(C73943T0h.LIZ().LJ(C28614BKw.class).LJJJJZI(new AfS36S0101000_5(0, this, 15)));
        }
        if (mo49getActivity() != null && bundle == null && GameLiveLandscapeEnterOp.INSTANCE.getValue()) {
            if (mo49getActivity().getRequestedOrientation() != 1) {
                z = true;
            }
            this.LLFZ = z;
        } else if (mo49getActivity() != null && mo49getActivity().getRequestedOrientation() != 1 && bundle == null && C28329B9x.LIZIZ(mo49getActivity())) {
            if (BOT.LIZ()) {
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                if (roomsData2.needSetRoomOrientation) {
                    this.LLFZ = C29306Beo.LJIIZILJ(roomsData2.enterRoomOrientation);
                    Sl();
                }
            }
            C30868C9o.LIZJ(R.string.ok6);
        }
        if (((IRankService) CN1.LIZ(IRankService.class)).fp0() != null) {
            ((IRankService) CN1.LIZ(IRankService.class)).fp0();
            C28571BJf.LJI();
        }
        C62622d0.LIZ().LIZIZ(this, 1);
    }

    @Override // X.B3D
    public final void s9(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.RoomsData roomsData;
        long[] jArr;
        if (mo49getActivity() == null || this.LLF == null || this.LLFFF == null || getCurrentFragment() == null || getCurrentFragment().getFragment() == null || getCurrentFragment().Jj() == null) {
            return;
        }
        EnterRoomConfig Jj = getCurrentFragment().Jj();
        if (Jj != null && (jArr = (roomsData = Jj.mRoomsData).roomIds) != null && jArr.length > 0) {
            roomsData.position = this.LLF.getCurrentItem();
        }
        if (getCurrentFragment().B2() == null) {
            return;
        }
        StackContext stackContext = new StackContext();
        stackContext.setActivityHashCode(mo49getActivity().hashCode());
        CP6.LIZ(mo49getActivity()).LIZJ(Jj, enterRoomConfig, stackContext);
    }

    public final boolean vl(int i, int i2) {
        AbstractC28221B5t abstractC28221B5t;
        boolean z;
        boolean z2;
        String LIZ = BKU.LIZ();
        boolean LIZLLL = BKU.LIZLLL();
        if (BOT.LIZJ()) {
            return false;
        }
        if ((!BKU.LIZJ(LIZ) && !LIZLLL) || (abstractC28221B5t = this.LLFFF) == null || i < 0 || i >= abstractC28221B5t.size() || i2 < 0 || i2 >= this.LLFFF.size()) {
            return false;
        }
        EnterRoomConfig LIZLLL2 = this.LLFFF.LIZLLL(i);
        EnterRoomConfig LIZLLL3 = this.LLFFF.LIZLLL(i2);
        String str = LIZLLL2.mRoomsData.unreadExtra;
        String str2 = LIZLLL3.mRoomsData.unreadExtra;
        if (str2 != null && s.LJJJLZIJ(str2, "follow_live_empty_loadmore", false)) {
            z = true;
        } else {
            z = false;
        }
        if ((LiveLandscapeInnerFeedSetting.INSTANCE.isEnable() && str2 != null && s.LJJJLZIJ(str2, "landscape_refresh", false)) || (GameLiveBottomBarSetting.INSTANCE.isEnable() && str2 != null && s.LJJJLZIJ(str2, "related_empty_loadmore", false))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!TextUtils.isEmpty(str)) {
            for (String str3 : BKU.LJIIIZ) {
                if (str == null || !s.LJJJLZIJ(str, str3, false)) {
                }
            }
            return false;
        }
        if (!z && !LIZLLL && !z2) {
            return false;
        }
        return true;
    }

    public final boolean Gl(int i, int i2, boolean z) {
        if (RecommendEndAtFollowingSetting.INSTANCE.getValue().enableShowRecommend != 3 || !z) {
            return false;
        }
        return vl(i, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        if (ViewAutoPreloadOptSetting.INSTANCE.getEnable()) {
            view = C20760rg.LIZ.LIZIZ(getContext(), R.layout.d4t);
        } else {
            view = null;
        }
        if (view == null) {
            view = C16880lQ.LLLLIILL(inflater, R.layout.d4t, viewGroup, false);
        }
        if (C28329B9x.LIZIZ(getContext())) {
            view.setFitsSystemWindows(true);
        }
        this.LLFF = (FrameLayout) view.findViewById(R.id.bs8);
        EnterRoomConfig enterRoomConfig = B57.LIZ.LIZ().mEnterRoomConfig;
        FrameLayout frameLayout = this.LLFF;
        if (frameLayout != null) {
            if (enterRoomConfig != null && enterRoomConfig.mFeedCoverData.enterPreviewSmooth) {
                frameLayout.setBackgroundColor(0);
            } else {
                frameLayout.setBackgroundColor(getResources().getColor(R.color.my));
            }
        }
        this.LJLJJL = new W6K(getContext());
        C80797VnN c80797VnN = (C80797VnN) view.findViewById(R.id.ncx);
        this.LLF = c80797VnN;
        RoomStatusController roomStatusController = this.LJLILLLLZI;
        if (roomStatusController != null) {
            roomStatusController.setViewPager(c80797VnN);
        }
        B4U.LIZ().LJJIIZI();
        BFS LIZIZ = BFS.LIZIZ();
        FrameLayout frameLayout2 = this.LLFF;
        C80797VnN c80797VnN2 = this.LLF;
        if (LIZIZ.LJLIL) {
            LIZIZ.LJLLLL = c80797VnN2;
            LIZIZ.LJLJJL = frameLayout2;
        }
        C28202B5a.LIZ().LIZLLL = mo49getActivity();
        if (LiveDrawerDrawOptSetting.INSTANCE.isOpt()) {
            view.findViewById(R.id.bs8).setBackgroundResource(0);
        }
        try {
            ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(view, this);
            C10A.LIZIZ(view, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return view;
    }

    public final void Il(long j, EnterRoomConfig enterRoomConfig, boolean z, boolean z2) {
        long j2;
        String str;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        C28643BLz c28643BLz = B57.LIZ;
        c28643BLz.LIZ().LIZIZ(new Event("live_room_jump_to_other", 258, EnumC28203B5b.BussinessApiCall));
        if (z) {
            W6K w6k = this.LJLJJL;
            if (w6k != null) {
                String str2 = enterRoomConfig.mRoomsData.backPreRoomType;
                BZI LIZ = C28787BRn.LIZ("livesdk_return_last_click");
                LIZ.LJIIZILJ();
                LIZ.LJIJJ(Integer.valueOf(CP6.LIZ(g0.LJIILJJIL((Context) w6k.LJLIL)).size()), "layer_level");
                EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) w6k.LJLILLLLZI;
                if (enterRoomConfig2 != null && (roomsData2 = enterRoomConfig2.mRoomsData) != null) {
                    j2 = roomsData2.roomId;
                } else {
                    j2 = 0;
                }
                LIZ.LJIJJ(Long.valueOf(j2), "to_room_id");
                EnterRoomConfig enterRoomConfig3 = (EnterRoomConfig) w6k.LJLILLLLZI;
                if (enterRoomConfig3 == null || (roomsData = enterRoomConfig3.mRoomsData) == null || (str = roomsData.userId) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ.LJIJJ(str, "to_anchor_id");
                C0JT.LIZJ(LIZ, str2, "return_type", 0, "process_duration");
            }
            enterRoomConfig = CP6.LIZ(mo49getActivity()).LIZ();
        } else if (z2) {
            CP6.LIZ(mo49getActivity()).clear();
        }
        if (enterRoomConfig == null) {
            return;
        }
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        roomsData3.roomId = j;
        this.LLIIJLIL = true;
        long j3 = roomsData3.fromRoomId;
        if (getCurrentFragment() != null && getCurrentFragment().Jj() != null) {
            enterRoomConfig.mRoomsData.enterLiveSource = getCurrentFragment().Jj().mRoomsData.enterLiveSource;
            enterRoomConfig.mRoomsData.fromNewStyle = getCurrentFragment().Jj().mRoomsData.fromNewStyle;
            enterRoomConfig.mRoomsData.feedUrl = getCurrentFragment().Jj().mRoomsData.feedUrl;
            if (j3 == 0) {
                getCurrentFragment().Jj();
            }
            enterRoomConfig.mRoomsData.preIsMicRoom = getCurrentFragment().Jj().mRoomsData.curIsMicRoom;
            if (getCurrentFragment().Jj().drawParams.openLiveFromDrawer && z) {
                C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
                if (!c08680Vs.LJI().empty()) {
                    Long pop = c08680Vs.LJI().pop();
                    o.LJIIIIZZ(pop, "{\n            mFeedRooms.pop()\n        }");
                    pop.longValue();
                }
                ORS.LJJZ(BJB.LIZJ());
            }
        }
        enterRoomConfig.mRoomsData.roomId = j;
        if (BOT.LIZ() && !BOT.LIZLLL(mo49getActivity())) {
            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
            roomsData4.needSetRoomOrientation = true;
            roomsData4.enterRoomOrientation = 0;
        } else {
            enterRoomConfig.mRoomsData.needSetRoomOrientation = false;
        }
        c28643BLz.LIZJ(new EnterRoomLinkSession(enterRoomConfig));
        ((IHostWatch) CN1.LIZ(IHostWatch.class)).watchLive(getContext(), enterRoomConfig);
    }

    public final void Ol(LivePlayFragment livePlayFragment, float f, boolean z, boolean z2, float f2) {
        float f3;
        View view;
        View view2;
        String str;
        EnterRoomConfig.RoomsData roomsData;
        Map<String, String> map;
        int i;
        float f4;
        View view3;
        View view4;
        String str2;
        float max = Math.max(0.9f, Math.abs((1.0f - f) - 1.0E-4f));
        int i2 = this.LJLJLJ;
        C80797VnN pager = this.LLF;
        livePlayFragment.getClass();
        RecommendEndAtFollowingSetting recommendEndAtFollowingSetting = RecommendEndAtFollowingSetting.INSTANCE;
        if (recommendEndAtFollowingSetting.getValue().enableShowRecommend == 3) {
            if (!recommendEndAtFollowingSetting.getValue().styleIsNew) {
                if (livePlayFragment.LLLJIL == null) {
                    if (livePlayFragment.getContext() != null && (view4 = livePlayFragment.LLLLLLZZ) != null && view4.findViewById(R.id.fsq) != null) {
                        RecyclableWidgetManager cm = livePlayFragment.cm();
                        if (LiveRecycleWidgetV2Setting.INSTANCE.getValue()) {
                            livePlayFragment.LLLJIL = (RecommendSwipeOldWidget) cm.getRecyclableWidgetFromCacheOrNew(RecommendSwipeOldWidget.class, null, new AObjectS21S0001000_5(1, 5));
                        } else {
                            livePlayFragment.LLLJIL = new RecommendSwipeOldWidget();
                        }
                        cm.load(R.id.fsq, livePlayFragment.LLLJIL);
                        RecommendSwipeOldWidget recommendSwipeOldWidget = livePlayFragment.LLLJIL;
                        View videoViewContainer = livePlayFragment.LLJ;
                        ConstraintLayout mLivePlayContainer = livePlayFragment.LLJI;
                        recommendSwipeOldWidget.getClass();
                        o.LJIIIZ(videoViewContainer, "videoViewContainer");
                        o.LJIIIZ(pager, "pager");
                        o.LJIIIZ(mLivePlayContainer, "mLivePlayContainer");
                        recommendSwipeOldWidget.LJLILLLLZI = videoViewContainer;
                        recommendSwipeOldWidget.LJLIL = pager;
                        if (recommendSwipeOldWidget.LLFII()) {
                            recommendSwipeOldWidget.LJLLJ = (C47061t0) mLivePlayContainer.findViewById(R.id.fok);
                            recommendSwipeOldWidget.LJLLL = (C47061t0) mLivePlayContainer.findViewById(R.id.j25);
                            C29306Beo.LJJLJLI(recommendSwipeOldWidget.LJLLJ);
                            C29306Beo.LJJLJLI(recommendSwipeOldWidget.LJLLL);
                        }
                        pager.LJJII(0.99f, false);
                    }
                }
                RecommendSwipeOldWidget recommendSwipeOldWidget2 = livePlayFragment.LLLJIL;
                recommendSwipeOldWidget2.LJLLLL = f;
                recommendSwipeOldWidget2.LJZL = z;
                recommendSwipeOldWidget2.LJLLLLLL = max;
                recommendSwipeOldWidget2.LLD = i2;
                recommendSwipeOldWidget2.LL = z2;
                recommendSwipeOldWidget2.LJZ = f2;
                Handler handler = recommendSwipeOldWidget2.LLFZ;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                if (recommendSwipeOldWidget2.LJLJJI != null && ((i = recommendSwipeOldWidget2.LLF) <= 0 || i != recommendSwipeOldWidget2.LLFFF())) {
                    recommendSwipeOldWidget2.LLF = recommendSwipeOldWidget2.LLFFF();
                    recommendSwipeOldWidget2.LLFF = C15380j0.LIZ(40.0f);
                }
                if (recommendSwipeOldWidget2.LJLJJI != null) {
                    View view5 = recommendSwipeOldWidget2.LJLILLLLZI;
                    float LIZ = C15380j0.LIZ(8.0f) * recommendSwipeOldWidget2.LJLLLLLL;
                    if (view5 != null) {
                        C15580jK.LIZIZ((int) LIZ, view5);
                    }
                    if (recommendSwipeOldWidget2.LL) {
                        if (recommendSwipeOldWidget2.LJZL) {
                            LinearLayout linearLayout = recommendSwipeOldWidget2.LJLJJI;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                LinearLayout linearLayout2 = recommendSwipeOldWidget2.LJLJI;
                                if (linearLayout2 != null) {
                                    linearLayout2.setVisibility(0);
                                } else {
                                    o.LJIJI("linearBottom");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("linearTop");
                                throw null;
                            }
                        } else {
                            LinearLayout linearLayout3 = recommendSwipeOldWidget2.LJLJJI;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(0);
                                LinearLayout linearLayout4 = recommendSwipeOldWidget2.LJLJI;
                                if (linearLayout4 != null) {
                                    linearLayout4.setVisibility(8);
                                } else {
                                    o.LJIJI("linearBottom");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("linearTop");
                                throw null;
                            }
                        }
                        recommendSwipeOldWidget2.LLII(true);
                        View view6 = recommendSwipeOldWidget2.LJLILLLLZI;
                        if (view6 != null) {
                            view6.setScaleX(recommendSwipeOldWidget2.LJLLLLLL);
                        }
                        View view7 = recommendSwipeOldWidget2.LJLILLLLZI;
                        if (view7 != null) {
                            view7.setScaleY(recommendSwipeOldWidget2.LJLLLLLL);
                        }
                        recommendSwipeOldWidget2.LJLZ();
                        float f5 = recommendSwipeOldWidget2.LJZ;
                        if (f5 > 0.0f) {
                            f4 = 1.0f;
                        } else {
                            f4 = -1.0f;
                        }
                        recommendSwipeOldWidget2.LJLZ = f4;
                        if (Math.abs(f5) >= recommendSwipeOldWidget2.LLF - recommendSwipeOldWidget2.LLFF && recommendSwipeOldWidget2.LLIFFJFJJ) {
                            C80797VnN c80797VnN = recommendSwipeOldWidget2.LJLIL;
                            if (c80797VnN != null) {
                                c80797VnN.LJJII(recommendSwipeOldWidget2.LJLLLL, true);
                            }
                            float f6 = (recommendSwipeOldWidget2.LLF - recommendSwipeOldWidget2.LLFF) * recommendSwipeOldWidget2.LJLZ;
                            if (Math.abs(f6) > Math.abs(recommendSwipeOldWidget2.LLII)) {
                                View view8 = recommendSwipeOldWidget2.LJLILLLLZI;
                                if (view8 != null) {
                                    view8.setTranslationY(f6);
                                }
                            } else {
                                View view9 = recommendSwipeOldWidget2.LJLILLLLZI;
                                if (view9 != null) {
                                    view9.setTranslationY(recommendSwipeOldWidget2.LLII);
                                }
                            }
                        } else {
                            C80797VnN c80797VnN2 = recommendSwipeOldWidget2.LJLIL;
                            if (c80797VnN2 != null) {
                                c80797VnN2.LJJII(recommendSwipeOldWidget2.LJLLLL, false);
                            }
                            View view10 = recommendSwipeOldWidget2.LJLILLLLZI;
                            if (view10 != null) {
                                view10.setTranslationY(recommendSwipeOldWidget2.LJZ);
                            }
                            recommendSwipeOldWidget2.LLII = recommendSwipeOldWidget2.LJZ;
                        }
                        if (recommendSwipeOldWidget2.LLFII() && (view3 = recommendSwipeOldWidget2.LJLILLLLZI) != null) {
                            float f7 = 1;
                            float f8 = 2;
                            int scaleX = (int) (((f7 - view3.getScaleX()) * ((Number) recommendSwipeOldWidget2.LLIIIILZ.getValue()).intValue()) / f8);
                            C47061t0 c47061t0 = recommendSwipeOldWidget2.LJLLL;
                            if (c47061t0 != null) {
                                c47061t0.setTranslationX((-scaleX) / f8);
                            }
                            C47061t0 c47061t02 = recommendSwipeOldWidget2.LJLLJ;
                            if (c47061t02 != null) {
                                ViewGroup.LayoutParams layoutParams = c47061t02.getLayoutParams();
                                layoutParams.width = scaleX * 2;
                                c47061t02.setLayoutParams(layoutParams);
                            }
                            C47061t0 c47061t03 = recommendSwipeOldWidget2.LJLLL;
                            if (c47061t03 != null) {
                                ViewGroup.LayoutParams layoutParams2 = c47061t03.getLayoutParams();
                                layoutParams2.width = scaleX;
                                c47061t03.setLayoutParams(layoutParams2);
                            }
                            C47061t0 c47061t04 = recommendSwipeOldWidget2.LJLLJ;
                            if (c47061t04 != null) {
                                c47061t04.setTranslationY(recommendSwipeOldWidget2.LJZ);
                            }
                            C47061t0 c47061t05 = recommendSwipeOldWidget2.LJLLJ;
                            if (c47061t05 != null) {
                                c47061t05.setScaleY(recommendSwipeOldWidget2.LJLLLLLL);
                            }
                            C47061t0 c47061t06 = recommendSwipeOldWidget2.LJLLL;
                            if (c47061t06 != null) {
                                c47061t06.setScaleY(recommendSwipeOldWidget2.LJLLLLLL);
                            }
                            float abs = Math.abs(recommendSwipeOldWidget2.LJZ);
                            float f9 = recommendSwipeOldWidget2.LLF - recommendSwipeOldWidget2.LLFF;
                            if (abs >= f9 && recommendSwipeOldWidget2.LLIFFJFJJ) {
                                C47061t0 c47061t07 = recommendSwipeOldWidget2.LJLLL;
                                if (c47061t07 != null) {
                                    c47061t07.setTranslationY((f9 * recommendSwipeOldWidget2.LJLZ) + f7);
                                }
                                C47061t0 c47061t08 = recommendSwipeOldWidget2.LJLLJ;
                                if (c47061t08 != null) {
                                    c47061t08.setTranslationY(((recommendSwipeOldWidget2.LLF - recommendSwipeOldWidget2.LLFF) * recommendSwipeOldWidget2.LJLZ) + f7);
                                }
                            } else {
                                C47061t0 c47061t09 = recommendSwipeOldWidget2.LJLLL;
                                if (c47061t09 != null) {
                                    c47061t09.setTranslationY(recommendSwipeOldWidget2.LJZ + f7);
                                }
                                C47061t0 c47061t010 = recommendSwipeOldWidget2.LJLLJ;
                                if (c47061t010 != null) {
                                    c47061t010.setTranslationY(recommendSwipeOldWidget2.LJZ + f7);
                                }
                            }
                        }
                        C80797VnN c80797VnN3 = recommendSwipeOldWidget2.LJLIL;
                        if (c80797VnN3 != null) {
                            c80797VnN3.setIsCanChangePage(true);
                        }
                        recommendSwipeOldWidget2.LJLZ();
                        float f10 = recommendSwipeOldWidget2.LJLLLL;
                        float f11 = recommendSwipeOldWidget2.LLFFF;
                        if (f10 >= f11 && recommendSwipeOldWidget2.LLIFFJFJJ) {
                            try {
                                if (!recommendSwipeOldWidget2.LJZI) {
                                    Context context = recommendSwipeOldWidget2.getContext();
                                    if (context != null) {
                                        Object LLILL = C16880lQ.LLILL(context, "vibrator");
                                        o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
                                        ((Vibrator) LLILL).vibrate(100L);
                                    }
                                    recommendSwipeOldWidget2.LJZI = true;
                                }
                                C80797VnN c80797VnN4 = recommendSwipeOldWidget2.LJLIL;
                                if (c80797VnN4 != null) {
                                    c80797VnN4.setIsCanChangePage(false);
                                }
                            } catch (Exception e) {
                                C0NB.LJII(e);
                            }
                        } else if (f10 < f11 - 0.1d) {
                            recommendSwipeOldWidget2.LJZI = false;
                        }
                    } else {
                        LinearLayout linearLayout5 = recommendSwipeOldWidget2.LJLJJI;
                        if (linearLayout5 != null) {
                            linearLayout5.setVisibility(8);
                            LinearLayout linearLayout6 = recommendSwipeOldWidget2.LJLJI;
                            if (linearLayout6 != null) {
                                linearLayout6.setVisibility(8);
                            } else {
                                o.LJIJI("linearBottom");
                                throw null;
                            }
                        } else {
                            o.LJIJI("linearTop");
                            throw null;
                        }
                    }
                    if (recommendSwipeOldWidget2.LL) {
                        if (recommendSwipeOldWidget2.LJZL) {
                            C47121t6 c47121t6 = recommendSwipeOldWidget2.LJLJJL;
                            if (c47121t6 != null) {
                                int measuredHeight = c47121t6.getMeasuredHeight();
                                int LIZ2 = C15380j0.LIZ(16.0f);
                                int LIZ3 = C15380j0.LIZ(24.0f);
                                int i3 = measuredHeight + LIZ2;
                                float f12 = i3;
                                if (Math.abs(recommendSwipeOldWidget2.LJZ) > f12 && i3 > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = recommendSwipeOldWidget2.LL().getLayoutParams();
                                    layoutParams3.height = Math.min(C15380j0.LIZ(8.0f) + LIZ3 + LIZ2, (int) (Math.abs(recommendSwipeOldWidget2.LJZ) - measuredHeight));
                                    recommendSwipeOldWidget2.LL().setLayoutParams(layoutParams3);
                                    recommendSwipeOldWidget2.LJZL().setAlpha(Math.min(1.0f, (((Math.abs(recommendSwipeOldWidget2.LJZ) - f12) * 1.0f) / LIZ2) + 0.2f));
                                    int i4 = i3 + LIZ3;
                                    float f13 = i4;
                                    if (Math.abs(recommendSwipeOldWidget2.LJZ) > f13) {
                                        ViewGroup.LayoutParams layoutParams4 = recommendSwipeOldWidget2.LL().getLayoutParams();
                                        o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
                                        layoutParams5.bottomMargin = (int) Math.min(C15380j0.LIZ(28.0f) * 1.0f, Math.abs(recommendSwipeOldWidget2.LJZ) - f13);
                                        recommendSwipeOldWidget2.LL().setLayoutParams(layoutParams5);
                                        recommendSwipeOldWidget2.LLFF().setAlpha(Math.min(1.0f, (((Math.abs(recommendSwipeOldWidget2.LJZ) - f13) * 1.0f) / LIZ3) + 0.2f));
                                    } else {
                                        ViewGroup.LayoutParams layoutParams6 = recommendSwipeOldWidget2.LL().getLayoutParams();
                                        o.LJII(layoutParams6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams6;
                                        layoutParams7.bottomMargin = 0;
                                        recommendSwipeOldWidget2.LL().setLayoutParams(layoutParams7);
                                        recommendSwipeOldWidget2.LLFF().setAlpha(0.0f);
                                    }
                                    float LIZ4 = C15380j0.LIZ(28.0f) + i4;
                                    if (Math.abs(recommendSwipeOldWidget2.LJZ) > LIZ4) {
                                        ViewGroup.LayoutParams layoutParams8 = recommendSwipeOldWidget2.LJZL().getLayoutParams();
                                        o.LJII(layoutParams8, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                        RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) layoutParams8;
                                        layoutParams9.bottomMargin = (int) Math.min(C15380j0.LIZ(8.0f) * 1.0f, Math.abs(recommendSwipeOldWidget2.LJZ) - LIZ4);
                                        recommendSwipeOldWidget2.LJZL().setLayoutParams(layoutParams9);
                                    } else {
                                        ViewGroup.LayoutParams layoutParams10 = recommendSwipeOldWidget2.LJZL().getLayoutParams();
                                        o.LJII(layoutParams10, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                        RelativeLayout.LayoutParams layoutParams11 = (RelativeLayout.LayoutParams) layoutParams10;
                                        layoutParams11.bottomMargin = 0;
                                        recommendSwipeOldWidget2.LJZL().setLayoutParams(layoutParams11);
                                    }
                                } else {
                                    ViewGroup.LayoutParams layoutParams12 = recommendSwipeOldWidget2.LL().getLayoutParams();
                                    layoutParams12.height = LIZ2;
                                    recommendSwipeOldWidget2.LL().setLayoutParams(layoutParams12);
                                    ViewGroup.LayoutParams layoutParams13 = recommendSwipeOldWidget2.LJZL().getLayoutParams();
                                    o.LJII(layoutParams13, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                    RelativeLayout.LayoutParams layoutParams14 = (RelativeLayout.LayoutParams) layoutParams13;
                                    layoutParams14.bottomMargin = 0;
                                    recommendSwipeOldWidget2.LJZL().setLayoutParams(layoutParams14);
                                    recommendSwipeOldWidget2.LJZL().setAlpha(0.0f);
                                    recommendSwipeOldWidget2.LLFF().setAlpha(0.0f);
                                }
                            } else {
                                o.LJIJI("bottomDescTv");
                                throw null;
                            }
                        } else {
                            C47121t6 c47121t62 = recommendSwipeOldWidget2.LJLJJLL;
                            if (c47121t62 != null) {
                                int measuredHeight2 = c47121t62.getMeasuredHeight();
                                int LIZ5 = C15380j0.LIZ(16.0f);
                                int LIZ6 = C15380j0.LIZ(24.0f);
                                int i5 = measuredHeight2 + LIZ5;
                                float f14 = i5;
                                if (Math.abs(recommendSwipeOldWidget2.LJZ) > f14 && i5 > 0) {
                                    ViewGroup.LayoutParams layoutParams15 = recommendSwipeOldWidget2.LLF().getLayoutParams();
                                    layoutParams15.height = Math.min(C15380j0.LIZ(8.0f) + LIZ6 + LIZ5, (int) (Math.abs(recommendSwipeOldWidget2.LJZ) - measuredHeight2));
                                    recommendSwipeOldWidget2.LLF().setLayoutParams(layoutParams15);
                                    recommendSwipeOldWidget2.LJZI().setAlpha(Math.min(1.0f, (((Math.abs(recommendSwipeOldWidget2.LJZ) - f14) * 1.0f) / LIZ5) + 0.2f));
                                    int i6 = i5 + LIZ6;
                                    float f15 = i6;
                                    if (Math.abs(recommendSwipeOldWidget2.LJZ) > f15) {
                                        ViewGroup.LayoutParams layoutParams16 = recommendSwipeOldWidget2.LLF().getLayoutParams();
                                        o.LJII(layoutParams16, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                        LinearLayout.LayoutParams layoutParams17 = (LinearLayout.LayoutParams) layoutParams16;
                                        layoutParams17.topMargin = (int) Math.min(C15380j0.LIZ(28.0f) * 1.0f, Math.abs(recommendSwipeOldWidget2.LJZ) - f15);
                                        recommendSwipeOldWidget2.LLF().setLayoutParams(layoutParams17);
                                        recommendSwipeOldWidget2.LJZ().setAlpha(Math.min(1.0f, (((Math.abs(recommendSwipeOldWidget2.LJZ) - f15) * 1.0f) / LIZ6) + 0.2f));
                                    } else {
                                        recommendSwipeOldWidget2.LJZ().setAlpha(0.0f);
                                        ViewGroup.LayoutParams layoutParams18 = recommendSwipeOldWidget2.LLF().getLayoutParams();
                                        o.LJII(layoutParams18, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                        LinearLayout.LayoutParams layoutParams19 = (LinearLayout.LayoutParams) layoutParams18;
                                        layoutParams19.topMargin = 0;
                                        recommendSwipeOldWidget2.LLF().setLayoutParams(layoutParams19);
                                    }
                                    float LIZ7 = C15380j0.LIZ(28.0f) + i6;
                                    if (Math.abs(recommendSwipeOldWidget2.LJZ) > LIZ7) {
                                        ViewGroup.LayoutParams layoutParams20 = recommendSwipeOldWidget2.LJZI().getLayoutParams();
                                        o.LJII(layoutParams20, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                        RelativeLayout.LayoutParams layoutParams21 = (RelativeLayout.LayoutParams) layoutParams20;
                                        layoutParams21.topMargin = (int) Math.min(C15380j0.LIZ(8.0f) * 1.0f, Math.abs(recommendSwipeOldWidget2.LJZ) - LIZ7);
                                        recommendSwipeOldWidget2.LJZI().setLayoutParams(layoutParams21);
                                    } else {
                                        ViewGroup.LayoutParams layoutParams22 = recommendSwipeOldWidget2.LJZI().getLayoutParams();
                                        o.LJII(layoutParams22, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                        RelativeLayout.LayoutParams layoutParams23 = (RelativeLayout.LayoutParams) layoutParams22;
                                        layoutParams23.topMargin = 0;
                                        recommendSwipeOldWidget2.LJZI().setLayoutParams(layoutParams23);
                                    }
                                } else {
                                    ViewGroup.LayoutParams layoutParams24 = recommendSwipeOldWidget2.LLF().getLayoutParams();
                                    layoutParams24.height = LIZ5;
                                    recommendSwipeOldWidget2.LLF().setLayoutParams(layoutParams24);
                                    ViewGroup.LayoutParams layoutParams25 = recommendSwipeOldWidget2.LJZI().getLayoutParams();
                                    o.LJII(layoutParams25, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                    RelativeLayout.LayoutParams layoutParams26 = (RelativeLayout.LayoutParams) layoutParams25;
                                    layoutParams26.bottomMargin = 0;
                                    recommendSwipeOldWidget2.LJZI().setLayoutParams(layoutParams26);
                                    recommendSwipeOldWidget2.LJZI().setAlpha(0.0f);
                                    recommendSwipeOldWidget2.LJZ().setAlpha(0.0f);
                                }
                            } else {
                                o.LJIJI("topDescTv");
                                throw null;
                            }
                        }
                    }
                }
                livePlayFragment.LLLJIL.show();
            } else {
                if (livePlayFragment.LLLJL == null) {
                    if (livePlayFragment.getContext() != null && (view2 = livePlayFragment.LLLLLLZZ) != null && view2.findViewById(R.id.fsr) != null) {
                        RecyclableWidgetManager cm2 = livePlayFragment.cm();
                        if (LiveRecycleWidgetV2Setting.INSTANCE.getValue()) {
                            livePlayFragment.LLLJL = (RecommendSwipeNewWidget) cm2.getRecyclableWidgetFromCacheOrNew(RecommendSwipeNewWidget.class, null, new AObjectS21S0001000_5(0, 4));
                        } else {
                            livePlayFragment.LLLJL = new RecommendSwipeNewWidget();
                        }
                        if (BL6.LIZ(livePlayFragment.LLLZL)) {
                            RecommendSwipeNewWidget recommendSwipeNewWidget = livePlayFragment.LLLJL;
                            EnterRoomConfig enterRoomConfig = livePlayFragment.LLLZL;
                            if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null && (map = roomsData.gameLiveExtra) != null) {
                                str = map.get("tag_name");
                            } else {
                                str = null;
                            }
                            recommendSwipeNewWidget.LLIIL = str;
                        }
                        cm2.load(R.id.fsr, livePlayFragment.LLLJL);
                        RecommendSwipeNewWidget recommendSwipeNewWidget2 = livePlayFragment.LLLJL;
                        View videoViewContainer2 = livePlayFragment.LLJ;
                        List<String> list = livePlayFragment.LJLJJL;
                        ConstraintLayout mLivePlayContainer2 = livePlayFragment.LLJI;
                        recommendSwipeNewWidget2.getClass();
                        o.LJIIIZ(videoViewContainer2, "videoViewContainer");
                        o.LJIIIZ(pager, "pager");
                        o.LJIIIZ(mLivePlayContainer2, "mLivePlayContainer");
                        recommendSwipeNewWidget2.LJLILLLLZI = videoViewContainer2;
                        recommendSwipeNewWidget2.LJLIL = pager;
                        recommendSwipeNewWidget2.LLIIIILZ = list;
                        pager.LJJII(0.99f, false);
                        if (recommendSwipeNewWidget2.LLIIIL()) {
                            recommendSwipeNewWidget2.LJLJI = (C47061t0) mLivePlayContainer2.findViewById(R.id.fok);
                            recommendSwipeNewWidget2.LJLJJI = (C47061t0) mLivePlayContainer2.findViewById(R.id.j25);
                        }
                        livePlayFragment.LLLJL.LLIIIJ = livePlayFragment.getView();
                    }
                }
                RecommendSwipeNewWidget recommendSwipeNewWidget3 = livePlayFragment.LLLJL;
                recommendSwipeNewWidget3.LJZ = f;
                recommendSwipeNewWidget3.LLF = z;
                recommendSwipeNewWidget3.LJZI = max;
                recommendSwipeNewWidget3.LLFZ = i2;
                recommendSwipeNewWidget3.LLFF = z2;
                recommendSwipeNewWidget3.LL = f2;
                Handler handler2 = recommendSwipeNewWidget3.LLIIII;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                if (recommendSwipeNewWidget3.LJLJJLL != null) {
                    int i7 = recommendSwipeNewWidget3.LLI;
                    if (i7 <= 0 || i7 != recommendSwipeNewWidget3.LLIIIJ()) {
                        recommendSwipeNewWidget3.LLI = recommendSwipeNewWidget3.LLIIIJ();
                    }
                    recommendSwipeNewWidget3.LLIFFJFJJ = ((1 - recommendSwipeNewWidget3.LJZI) * C15380j0.LJIIJJI()) / 2.0f;
                }
                if (recommendSwipeNewWidget3.LJLJJLL != null) {
                    View view11 = recommendSwipeNewWidget3.LJLILLLLZI;
                    float LIZ8 = C15380j0.LIZ(8.0f) * recommendSwipeNewWidget3.LJZI;
                    if (view11 != null) {
                        C15580jK.LIZIZ((int) LIZ8, view11);
                    }
                    if (recommendSwipeNewWidget3.LLFF) {
                        recommendSwipeNewWidget3.LLFII().setVisibility(8);
                        recommendSwipeNewWidget3.LLFFF().setVisibility(8);
                        recommendSwipeNewWidget3.LLFZ().setVisibility(8);
                        if (recommendSwipeNewWidget3.LLIIIL()) {
                            C29306Beo.LJJLJLI(recommendSwipeNewWidget3.LJLJI);
                            C29306Beo.LJJLJLI(recommendSwipeNewWidget3.LJLJJI);
                        }
                        View view12 = recommendSwipeNewWidget3.LJLILLLLZI;
                        if (view12 != null) {
                            view12.setScaleX(recommendSwipeNewWidget3.LJZI);
                        }
                        View view13 = recommendSwipeNewWidget3.LJLILLLLZI;
                        if (view13 != null) {
                            view13.setScaleY(recommendSwipeNewWidget3.LJZI);
                        }
                        if (recommendSwipeNewWidget3.LLIIIL() && (view = recommendSwipeNewWidget3.LJLILLLLZI) != null) {
                            float f16 = 2;
                            int scaleX2 = (int) (((1 - view.getScaleX()) * ((Number) recommendSwipeNewWidget3.LLIILII.getValue()).intValue()) / f16);
                            C47061t0 c47061t011 = recommendSwipeNewWidget3.LJLJJI;
                            if (c47061t011 != null) {
                                c47061t011.setTranslationX((-scaleX2) / f16);
                            }
                            C47061t0 c47061t012 = recommendSwipeNewWidget3.LJLJI;
                            if (c47061t012 != null) {
                                ViewGroup.LayoutParams layoutParams27 = c47061t012.getLayoutParams();
                                layoutParams27.width = scaleX2 * 2;
                                c47061t012.setLayoutParams(layoutParams27);
                            }
                            C47061t0 c47061t013 = recommendSwipeNewWidget3.LJLJJI;
                            if (c47061t013 != null) {
                                ViewGroup.LayoutParams layoutParams28 = c47061t013.getLayoutParams();
                                layoutParams28.width = scaleX2;
                                c47061t013.setLayoutParams(layoutParams28);
                            }
                            C47061t0 c47061t014 = recommendSwipeNewWidget3.LJLJI;
                            if (c47061t014 != null) {
                                c47061t014.setTranslationY(recommendSwipeNewWidget3.LL);
                            }
                            C47061t0 c47061t015 = recommendSwipeNewWidget3.LJLJI;
                            if (c47061t015 != null) {
                                c47061t015.setScaleY(recommendSwipeNewWidget3.LJZI);
                            }
                            C47061t0 c47061t016 = recommendSwipeNewWidget3.LJLJJI;
                            if (c47061t016 != null) {
                                c47061t016.setTranslationY(recommendSwipeNewWidget3.LL);
                            }
                            C47061t0 c47061t017 = recommendSwipeNewWidget3.LJLJJI;
                            if (c47061t017 != null) {
                                c47061t017.setScaleY(recommendSwipeNewWidget3.LJZI);
                            }
                        }
                        C80797VnN c80797VnN5 = recommendSwipeNewWidget3.LJLIL;
                        if (c80797VnN5 != null) {
                            c80797VnN5.LJJII(recommendSwipeNewWidget3.LJZ, false);
                        }
                        View view14 = recommendSwipeNewWidget3.LJLILLLLZI;
                        if (view14 != null) {
                            view14.setTranslationY(recommendSwipeNewWidget3.LL);
                        }
                        View view15 = recommendSwipeNewWidget3.LJLLLLLL;
                        if (view15 != null) {
                            view15.setVisibility(8);
                            View view16 = recommendSwipeNewWidget3.LJLZ;
                            if (view16 != null) {
                                view16.setVisibility(8);
                            } else {
                                o.LJIJI("bottomBg");
                                throw null;
                            }
                        } else {
                            o.LJIJI("topBg");
                            throw null;
                        }
                    } else {
                        C80797VnN c80797VnN6 = recommendSwipeNewWidget3.LJLIL;
                        if (c80797VnN6 != null) {
                            c80797VnN6.setIsCanChangePage(true);
                        }
                        recommendSwipeNewWidget3.LJZ();
                        float f17 = recommendSwipeNewWidget3.LJZ;
                        float f18 = recommendSwipeNewWidget3.LLII;
                        if (f17 >= f18 && recommendSwipeNewWidget3.LLFII) {
                            try {
                                if (!recommendSwipeNewWidget3.LLD) {
                                    Context context2 = recommendSwipeNewWidget3.getContext();
                                    if (context2 != null) {
                                        Object LLILL2 = C16880lQ.LLILL(context2, "vibrator");
                                        o.LJII(LLILL2, "null cannot be cast to non-null type android.os.Vibrator");
                                        ((Vibrator) LLILL2).vibrate(100L);
                                    }
                                    recommendSwipeNewWidget3.LLD = true;
                                }
                                C80797VnN c80797VnN7 = recommendSwipeNewWidget3.LJLIL;
                                if (c80797VnN7 != null) {
                                    c80797VnN7.setIsCanChangePage(false);
                                }
                            } catch (Exception e2) {
                                C0NB.LJII(e2);
                            }
                        } else if (f17 < f18 - 0.1d) {
                            recommendSwipeNewWidget3.LLD = false;
                        }
                        if (recommendSwipeNewWidget3.LL > 0.0f) {
                            f3 = 1.0f;
                        } else {
                            f3 = -1.0f;
                        }
                        recommendSwipeNewWidget3.LJZL = f3;
                        if (recommendSwipeNewWidget3.LLF) {
                            recommendSwipeNewWidget3.LLFII().setVisibility(0);
                            recommendSwipeNewWidget3.LLFFF().setVisibility(8);
                            View view17 = recommendSwipeNewWidget3.LJLLLLLL;
                            if (view17 != null) {
                                view17.setVisibility(0);
                                View view18 = recommendSwipeNewWidget3.LJLZ;
                                if (view18 != null) {
                                    view18.setVisibility(8);
                                    View view19 = recommendSwipeNewWidget3.LLIIIJ;
                                    if (view19 != null) {
                                        view19.setTranslationY((recommendSwipeNewWidget3.LLIFFJFJJ * recommendSwipeNewWidget3.LJZL) + recommendSwipeNewWidget3.LL + recommendSwipeNewWidget3.LLIIIZ);
                                    }
                                } else {
                                    o.LJIJI("bottomBg");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("topBg");
                                throw null;
                            }
                        } else {
                            recommendSwipeNewWidget3.LLFII().setVisibility(8);
                            recommendSwipeNewWidget3.LLFFF().setVisibility(0);
                            View view20 = recommendSwipeNewWidget3.LJLLLLLL;
                            if (view20 != null) {
                                view20.setVisibility(8);
                                View view21 = recommendSwipeNewWidget3.LJLZ;
                                if (view21 != null) {
                                    view21.setVisibility(0);
                                    View view22 = recommendSwipeNewWidget3.LLIIIJ;
                                    if (view22 != null) {
                                        view22.setTranslationY(((recommendSwipeNewWidget3.LLIFFJFJJ * recommendSwipeNewWidget3.LJZL) + recommendSwipeNewWidget3.LL) - recommendSwipeNewWidget3.LLIIIZ);
                                    }
                                } else {
                                    o.LJIJI("bottomBg");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("topBg");
                                throw null;
                            }
                        }
                        recommendSwipeNewWidget3.LLIILII(true);
                        recommendSwipeNewWidget3.LLFZ().setVisibility(0);
                        C15580jK.LIZIZ((int) (C15380j0.LIZ(8.0f) * recommendSwipeNewWidget3.LJZI), recommendSwipeNewWidget3.LLFZ());
                        if (recommendSwipeNewWidget3.LJZ >= recommendSwipeNewWidget3.LLII - 0.1f) {
                            View view23 = recommendSwipeNewWidget3.getView();
                            if (view23 != null) {
                                view23.setAlpha(Math.max(0.0f, 1.0f - (((recommendSwipeNewWidget3.LJZ - recommendSwipeNewWidget3.LLII) + 0.1f) * 10.0f)));
                            }
                        } else {
                            View view24 = recommendSwipeNewWidget3.getView();
                            if (view24 != null) {
                                view24.setAlpha(1.0f);
                            }
                        }
                    }
                    if (!recommendSwipeNewWidget3.LLFF) {
                        if (recommendSwipeNewWidget3.LLF) {
                            recommendSwipeNewWidget3.LLIIL();
                        } else {
                            recommendSwipeNewWidget3.LJZI();
                        }
                    }
                }
                livePlayFragment.LLLJL.show();
            }
        }
        if (!this.LJLL) {
            BZI LIZ9 = C28787BRn.LIZ("livesdk_end_to_recommend_draw_show");
            if (!z) {
                str2 = "up";
            } else {
                str2 = "down";
            }
            C1FL.LJI(LIZ9, str2, "draw_action");
            this.LJLL = true;
        }
    }
}
