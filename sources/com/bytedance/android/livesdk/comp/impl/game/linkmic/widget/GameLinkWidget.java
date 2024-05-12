package com.bytedance.android.livesdk.comp.impl.game.linkmic.widget;

import X.BPP;
import X.BYP;
import X.BZI;
import X.C03880Dg;
import X.C05170If;
import X.C05200Ii;
import X.C09650Zl;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C28268B7o;
import X.C28272B7s;
import X.C28329B9x;
import X.C28548BIi;
import X.C28787BRn;
import X.C29240Bdk;
import X.C29306Beo;
import X.C29401Dk;
import X.C29494Bhq;
import X.C29597BjV;
import X.C2A6;
import X.C30101Gc;
import X.C30111Gd;
import X.C30868C9o;
import X.C41021jG;
import X.C41031jH;
import X.C45804HyK;
import X.C47071t1;
import X.C47261Igj;
import X.C5H3;
import X.C65300Pk0;
import X.C72818Shy;
import X.C73318Sq2;
import X.C74691TTb;
import X.C74698TTi;
import X.C74740TUy;
import X.C74746TVe;
import X.C74748TVg;
import X.C74764TVw;
import X.C74767TVz;
import X.C74813TXt;
import X.C74838TYs;
import X.C76800UCe;
import X.C78866UxK;
import X.C78996UzQ;
import X.CN1;
import X.EnumC30204BtI;
import X.InterfaceC28198B4w;
import X.InterfaceC29409BgT;
import X.InterfaceC88472Yns;
import X.Q8U;
import X.TS1;
import X.TS4;
import X.TSR;
import X.TSX;
import X.TSY;
import X.TT1;
import X.TT2;
import X.TTR;
import X.TTV;
import X.TU2;
import X.TV2;
import X.TVR;
import X.TW0;
import X.TW1;
import X.TW2;
import X.TW3;
import X.TW4;
import X.TW5;
import X.TW6;
import X.TW7;
import X.TW8;
import X.TWA;
import X.TWL;
import X.TWQ;
import X.TYH;
import X.TYP;
import X.U17;
import X.X1D;
import Y.IDcS170S0100000_5;
import Y.IDcS172S0100000_13;
import Y.IDcS17S0300000_13;
import Y.IDcS94S0200000_13;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.byted.cast.common.CommonOptionConstants;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestUserInfoDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkPreviewFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkUserInfoFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GuestLinkPlayerListChange;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.TapToGoLiveEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestPauseTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GameLinkWidget extends LiveWidget implements TSX, InterfaceC28198B4w, WeakHandler.IHandler {
    public static final TW5 Companion = new TW5();
    public GameLinkGuestUserInfoDialog applydialog;
    public C74813TXt dialogPresenter;
    public TWA dialogType;
    public final TTR gameLinkManager;
    public GameLinkMicViewMaskWidget gameLinkMicViewWidget;
    public final C5H3 gameLinkToolbarManager$delegate;
    public TWQ guestApplyInfo;
    public WeakHandler handler;
    public Runnable interactRoomCloseRunnable;
    public final InterfaceC88472Yns<TW6, C76800UCe> interactStateChange;
    public final C5H3 interceptorArray$delegate;
    public boolean isLeaveWhenEnterBg;
    public LiveDialog kickOutDialog;
    public ViewGroup parentView;
    public GameLinkGuestPresenter presenter;
    public Room room;
    public final C5H3 seiHandler$delegate;

    public static void com_bytedance_android_livesdk_comp_impl_game_linkmic_widget_GameLinkWidget_com_bytedance_android_live_design_app_LiveDialog_show(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-3193731639113194082")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public static void com_bytedance_android_livesdk_comp_impl_game_linkmic_widget_GameLinkWidget_com_bytedance_android_live_design_view_sheet_action_LiveActionSheetDialog_show(LiveActionSheetDialog liveActionSheetDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/view/sheet/action/LiveActionSheetDialog", "show", liveActionSheetDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-3193731639113194082")).LIZ) {
            return;
        }
        liveActionSheetDialog.show();
    }

    private final String getDefaultAppealUrl() {
        return "sslocal://webcast_webview?url=https://webcast.tiktokv.com/falcon/webcast_mt/page/proactive_appeal_redirect/index.html?web_bg_color=#ffffffff&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
    }

    private final String getRequestPage(int i) {
        return i == 0 ? "multi_live_apply" : "multi_live_accept";
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.dp5;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void showDisconnectSecondWindow() {
        User user;
        Room room;
        Object[] objArr = new Object[1];
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        objArr[0] = C05170If.LIZLLL(user);
        String LJIILL = C15380j0.LJIILL(R.string.kv7, objArr);
        C47071t1 c47071t1 = new C47071t1(((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity());
        c47071t1.LIZJ = LJIILL;
        c47071t1.LJFF(R.string.m7x);
        c47071t1.LJIIL(R.string.now, new IDcS170S0100000_5(this, 11));
        c47071t1.LJIIIZ(R.string.np2, C29597BjV.LJLIL);
        com_bytedance_android_livesdk_comp_impl_game_linkmic_widget_GameLinkWidget_com_bytedance_android_live_design_app_LiveDialog_show(c47071t1.LIZ());
    }

    private final void checkIfReportWatchLive() {
        boolean z;
        Room room = this.room;
        MultiLiveAnchorPanelSettings LJI = TV2.LJI();
        if (!TV2.LJIILIIL(LJI) || (TV2.LJIIL(LJI) && !TV2.LJIIJ(room))) {
            z = true;
        } else {
            z = false;
        }
        if (!z && C74746TVe.LIZ > 0) {
            if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_guest_connection_mode_view_duration")) {
                long uptimeMillis = SystemClock.uptimeMillis() - C74746TVe.LIZ;
                Map LIZ = C74746TVe.LIZ(null);
                String str = C74746TVe.LIZLLL;
                if (str == null) {
                    str = "live_over";
                }
                HashMap hashMap = (HashMap) LIZ;
                hashMap.put("trigger", str);
                C74746TVe.LJII(null);
                TWL.LIZJ(LIZ);
                hashMap.put("duration", String.valueOf(uptimeMillis));
                hashMap.put("permission_type", TV2.LJFF());
                C74746TVe.LJI("livesdk_guest_connection_mode_view_duration", LIZ);
            }
            C74746TVe.LIZ = 0L;
        }
        if (C74838TYs.LJ().LJJ > 0) {
            C74746TVe.LIZJ(null, this.room, 3);
        }
    }

    private final void dismissPreviewDialog() {
        BaseFragment baseFragment;
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog = this.applydialog;
        if (gameLinkGuestUserInfoDialog != null && !gameLinkGuestUserInfoDialog.isShowing()) {
            return;
        }
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog2 = this.applydialog;
        if (gameLinkGuestUserInfoDialog2 != null) {
            baseFragment = gameLinkGuestUserInfoDialog2.LJLJL;
        } else {
            baseFragment = null;
        }
        if ((baseFragment instanceof GameLinkPreviewFragment) && gameLinkGuestUserInfoDialog2 != null) {
            gameLinkGuestUserInfoDialog2.dismiss();
        }
    }

    private final FragmentManager getFragmentManager() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            return (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        }
        return null;
    }

    private final TSR getGameLinkToolbarManager() {
        return (TSR) this.gameLinkToolbarManager$delegate.getValue();
    }

    private final InterfaceC29409BgT[] getInterceptorArray() {
        return (InterfaceC29409BgT[]) this.interceptorArray$delegate.getValue();
    }

    private final TW7 getSeiHandler() {
        return (TW7) this.seiHandler$delegate.getValue();
    }

    private final int getTimeOutInterval() {
        return LiveSdkMultiguestPauseTimeoutIntervalSetting.INSTANCE.getValue();
    }

    private final void showDisconnectFirstWindow() {
        C2A6 c2a6 = new C2A6(((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity());
        C41021jG c41021jG = new C41021jG();
        c41021jG.LIZ = C15380j0.LJIILJJIL(R.string.now);
        c41021jG.LIZJ = new C74767TVz(this);
        c2a6.LIZIZ(C47261Igj.LJJIJ(new C41031jH(c41021jG)));
        C30101Gc c30101Gc = new C30101Gc();
        c30101Gc.LIZ = C15380j0.LJIILJJIL(R.string.snx);
        c30101Gc.LIZJ = TW0.LJLIL;
        c2a6.LIZLLL = new C30111Gd(c30101Gc);
        com_bytedance_android_livesdk_comp_impl_game_linkmic_widget_GameLinkWidget_com_bytedance_android_live_design_view_sheet_action_LiveActionSheetDialog_show(c2a6.LIZ());
    }

    @Override // X.TSX
    public void becomeGuest() {
        if (this.gameLinkMicViewWidget != null) {
            C0NB.LJIIIZ("GameLinkMicViewMaskWidget", "becomeGuest");
        }
    }

    @Override // X.TSX
    public void becomeNormalAudience() {
        Runnable runnable = this.interactRoomCloseRunnable;
        if (runnable != null) {
            runnable.run();
        }
        this.interactRoomCloseRunnable = null;
        GameLinkMicViewMaskWidget gameLinkMicViewMaskWidget = this.gameLinkMicViewWidget;
        if (gameLinkMicViewMaskWidget != null) {
            Iterator it = ((HashMap) gameLinkMicViewMaskWidget.LJLLLL).entrySet().iterator();
            while (it.hasNext()) {
                C29306Beo.LJJIJIIJIL((View) ((Map.Entry) it.next()).getValue());
            }
            ((HashMap) gameLinkMicViewMaskWidget.LJLLLL).clear();
            C0NB.LJIIIZ("GameLinkMicViewMaskWidget", "becomeNormalAudience");
        }
    }

    public void dismissKickOutDialog() {
        LiveDialog liveDialog = this.kickOutDialog;
        if (liveDialog != null && liveDialog.isShowing()) {
            LiveDialog liveDialog2 = this.kickOutDialog;
            if (liveDialog2 != null) {
                liveDialog2.dismiss();
            }
            this.kickOutDialog = null;
        }
    }

    @Override // X.TSX
    public void forceDismissApplyDialog() {
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog;
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog2 = this.applydialog;
        if (gameLinkGuestUserInfoDialog2 != null && gameLinkGuestUserInfoDialog2.isShowing() && (gameLinkGuestUserInfoDialog = this.applydialog) != null) {
            gameLinkGuestUserInfoDialog.dismiss();
        }
    }

    @Override // X.InterfaceC31336CRo
    public String getLogTag() {
        return GameLinkWidget.class.getName();
    }

    public final String getMtDefaultLowAgeReportUrl() {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
            return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
    }

    public final void gotoAppealPage() {
        IActionHandlerService iActionHandlerService;
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = getDefaultAppealUrl();
        }
        String appendParamToAppeal = appendParamToAppeal(value);
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        if (context != null && (iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class)) != null) {
            iActionHandlerService.handle(context, appendParamToAppeal);
        }
    }

    @Override // X.TSX
    public boolean isApplyDialogShowing() {
        BaseFragment baseFragment;
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog = this.applydialog;
        if (gameLinkGuestUserInfoDialog == null || !gameLinkGuestUserInfoDialog.isShowing()) {
            return false;
        }
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog2 = this.applydialog;
        if (gameLinkGuestUserInfoDialog2 != null) {
            baseFragment = gameLinkGuestUserInfoDialog2.LJLJL;
        } else {
            baseFragment = null;
        }
        if (!(baseFragment instanceof GameLinkUserInfoFragment)) {
            return false;
        }
        return true;
    }

    @Override // X.TSX
    public boolean isInPipMode() {
        Activity LJIJJ;
        Context context = this.context;
        if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return LJIJJ.isInPictureInPictureMode();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // X.TSX
    public void onInteractFailed() {
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null) {
            GameLinkGuestPresenter.exitInteractInNormalWay$default(gameLinkGuestPresenter, "rtc_error", false, 10032, 2, null);
        }
    }

    @Override // X.InterfaceC28198B4w
    public void onInteractIconClick() {
        if (this.gameLinkManager.LIZIZ() == 5) {
            showDisconnectFirstWindow();
            return;
        }
        for (InterfaceC29409BgT interfaceC29409BgT : getInterceptorArray()) {
            if (interfaceC29409BgT.LJIIIZ()) {
                return;
            }
        }
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter == null) {
            return;
        }
        gameLinkGuestPresenter.checkLinkPermissionAhead$livegamelinkmic_impl_release(0);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        WeakHandler weakHandler;
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null && gameLinkGuestPresenter.isEngineOn() && (weakHandler = this.handler) != null) {
            weakHandler.sendEmptyMessageDelayed(140000, getTimeOutInterval() * 1000);
        }
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public void onStop() {
        C0NB.LJIIIZ("GameLinkWidget", "onStop->onEnterBackground");
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null) {
            gameLinkGuestPresenter.onEnterBackground();
        }
        super.onStop();
    }

    @Override // X.TSX
    public void showKickOutDialog() {
        LiveDialog liveDialog;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && o.LJ(dataChannel.kv0(PIPStatusData.class), Boolean.TRUE)) {
            return;
        }
        if (this.kickOutDialog == null) {
            C47071t1 c47071t1 = new C47071t1(this.context);
            c47071t1.LJFF(R.string.n_d);
            c47071t1.LJIIL(R.string.njj, TW3.LJLIL);
            this.kickOutDialog = c47071t1.LIZ();
        }
        LiveDialog liveDialog2 = this.kickOutDialog;
        if (liveDialog2 != null && (liveDialog = (LiveDialog) C78866UxK.LJIJI(liveDialog2, 6, false, false, false, 122)) != null) {
            com_bytedance_android_livesdk_comp_impl_game_linkmic_widget_GameLinkWidget_com_bytedance_android_live_design_app_LiveDialog_show(liveDialog);
        }
        dismissPreviewDialog();
    }

    private final void showLowAgeApplyFailDialog() {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mjh);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_live_multiguestwarn)");
        String LIZIZ = Q8U.LIZIZ(new Object[]{String.valueOf(LiveAudienceLinkmicLowestAgeSetting.INSTANCE.getValue())}, 1, LJIILJJIL, "format(format, *args)");
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LJIILL = true;
        c47071t1.LJII(LIZIZ);
        c47071t1.LJIIL(R.string.spm, new IDcS170S0100000_5(this, 12));
        c47071t1.LJIIIZ(R.string.spn, C28548BIi.LJLIL);
        com_bytedance_android_livesdk_comp_impl_game_linkmic_widget_GameLinkWidget_com_bytedance_android_live_design_app_LiveDialog_show(c47071t1.LIZ());
        BZI LIZ = C28787BRn.LIZ("guest_connection_underage_popup");
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(null);
        LIZ.LIZJ("show");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.TSX
    public void dismissApplyDialogIfNeed() {
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog;
        if (isApplyDialogShowing() && this.dialogType == TWA.GO_LIVE && (gameLinkGuestUserInfoDialog = this.applydialog) != null) {
            gameLinkGuestUserInfoDialog.dismiss();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        C0NB.LJIIIZ("GameLinkWidget", "onCreate");
        enableSubWidgetManager(C28329B9x.LIZJ(getContext()));
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        }
        this.room = room;
        TSR gameLinkToolbarManager = getGameLinkToolbarManager();
        gameLinkToolbarManager.getClass();
        C0NB.LJIIIZ("GameLinkToolbar", "onWidgetCreate");
        gameLinkToolbarManager.LIZIZ.e3(gameLinkToolbarManager.LJI);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.mv0(InteractStateChangeEvent.class, this, this.interactStateChange);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.lv0(this, TapToGoLiveEvent.class, new AqS179S0100000_13(this, 318));
        }
        Room room2 = this.room;
        if (room2 != null) {
            TTR ttr = this.gameLinkManager;
            DataChannel dataChannel4 = this.dataChannel;
            o.LJIIIIZZ(dataChannel4, "dataChannel");
            this.presenter = new GameLinkGuestPresenter(room2, ttr, dataChannel4, this);
            TTR ttr2 = this.gameLinkManager;
            GameLinkMicViewMaskWidget gameLinkMicViewMaskWidget = new GameLinkMicViewMaskWidget(ttr2, ttr2.LJ());
            this.gameLinkMicViewWidget = gameLinkMicViewMaskWidget;
            this.subWidgetManager.load(R.id.niy, gameLinkMicViewMaskWidget);
        }
        Room room3 = this.room;
        User LIZIZ = C05200Ii.LIZIZ();
        Context context = this.context;
        AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 217);
        if (room3 == null || LIZIZ == null || context == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get null: ");
            LIZ.append(room3);
            LIZ.append(", ");
            LIZ.append(LIZIZ);
            LIZ.append(' ');
            LIZ.append(context);
            TYP.LIZJ("MultiGuestFeedbackController", X1D.LIZIZ(LIZ));
        } else {
            TSY tsy = new TSY(room3, LIZIZ, context, aqS163S0100000_13);
            TSY.LJIIJ = tsy;
            C72818Shy.LIZLLL("Multi_guest_feedback_submit", tsy.LJIIIZ);
        }
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null) {
            gameLinkGuestPresenter.attachView((TSX) this);
        }
        this.handler = new WeakHandler(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog;
        TSR gameLinkToolbarManager = getGameLinkToolbarManager();
        gameLinkToolbarManager.getClass();
        C0NB.LJIIIZ("GameLinkToolbar", "onWidgetDestroy");
        gameLinkToolbarManager.LIZIZ.X3(gameLinkToolbarManager.LJI);
        if (TSR.LJII) {
            gameLinkToolbarManager.LIZJ();
        }
        Iterator it = ((ArrayList) gameLinkToolbarManager.LJ).iterator();
        while (it.hasNext()) {
            ((ValueAnimator) it.next()).cancel();
        }
        ((ArrayList) gameLinkToolbarManager.LJ).clear();
        View view = EnumC30204BtI.MULTIGUEST.getView(gameLinkToolbarManager.LIZ);
        if (view != null) {
            view.setAlpha(1.0f);
            TV2.LJIIIIZZ(gameLinkToolbarManager.LIZ);
        }
        if (TTV.LIZ().LIZIZ == 0) {
            TTV.LIZ().LJJ = null;
            checkIfReportWatchLive();
            C74838TYs.LJ().LIZIZ(Boolean.FALSE);
        }
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null) {
            gameLinkGuestPresenter.detachView();
        }
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog2 = this.applydialog;
        if (gameLinkGuestUserInfoDialog2 != null && gameLinkGuestUserInfoDialog2.isShowing() && (gameLinkGuestUserInfoDialog = this.applydialog) != null) {
            gameLinkGuestUserInfoDialog.dismiss();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        dismissKickOutDialog();
        TSY tsy = TSY.LJIIJ;
        if (tsy != null) {
            C72818Shy.LJII("Multi_guest_feedback_submit", tsy.LJIIIZ);
            ((C73318Sq2) tsy.LJII.getValue()).LIZLLL();
            tsy.LIZ();
        }
        if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
            TSY.LJIIJ = null;
        }
        MultiGuestDialogManager LIZ = TS1.LIZ();
        if (LIZ != null) {
            LIZ.iv0(TS4.LJLIL);
        }
        synchronized (U17.LIZ) {
            U17.LIZIZ.clear();
        }
        super.onDestroy();
        C0NB.LJIIIZ("GameLinkWidget", "onDestroy");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDetachWidget() {
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog;
        super.onDetachWidget();
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null) {
            gameLinkGuestPresenter.onDetachWidget();
        }
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog2 = this.applydialog;
        if (gameLinkGuestUserInfoDialog2 != null && gameLinkGuestUserInfoDialog2.isShowing() && (gameLinkGuestUserInfoDialog = this.applydialog) != null) {
            gameLinkGuestUserInfoDialog.dismiss();
        }
        this.applydialog = null;
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog;
        super.onResume();
        C0NB.LJIIIZ("GameLinkWidget", "onResume");
        if (this.isLeaveWhenEnterBg) {
            this.isLeaveWhenEnterBg = false;
            C30868C9o.LJI(C15380j0.LJIILL(R.string.lt8, Integer.valueOf(getTimeOutInterval() / 60)));
        }
        WeakHandler weakHandler = this.handler;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null) {
            gameLinkGuestPresenter.onEnterForeground();
        }
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog2 = this.applydialog;
        if (gameLinkGuestUserInfoDialog2 != null && gameLinkGuestUserInfoDialog2.isShowing() && (gameLinkGuestUserInfoDialog = this.applydialog) != null) {
            gameLinkGuestUserInfoDialog.onResume();
        }
        if (TTV.LIZ().LIZIZ == 1) {
            TTV.LIZ().LIZIZ = 0;
            TU2 tu2 = TTV.LIZ().LIZJ;
            TTV.LIZ().LIZJ = null;
            C30868C9o.LIZJ(R.string.n9k);
            GameLinkGuestPresenter gameLinkGuestPresenter2 = this.presenter;
            if (gameLinkGuestPresenter2 != null) {
                gameLinkGuestPresenter2.showInvitedDialog(true, true, tu2);
                return;
            }
            return;
        }
        if (TTV.LIZ().LIZIZ != 2) {
            return;
        }
        TTV.LIZ().LIZIZ = 0;
        onInteractIconClick();
    }

    public GameLinkWidget(TTR gameLinkManager) {
        o.LJIIIZ(gameLinkManager, "gameLinkManager");
        this.gameLinkManager = gameLinkManager;
        this.dialogType = TWA.SEND_REQUEST;
        this.interactStateChange = new AqS179S0100000_13(this, 317);
        this.gameLinkToolbarManager$delegate = C221108m2.LIZIZ(new AqS163S0100000_13(this, 216));
        this.seiHandler$delegate = C221108m2.LIZIZ(new AqS163S0100000_13(this, 218));
        this.interceptorArray$delegate = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 202));
    }

    private final String appendParamToAppeal(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
            buildUpon.appendQueryParameter("enter_from", "linkmic_appeal");
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "builder.build().toString()");
            return uri;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("linkmic_appeal:");
            LIZ.append(e);
            TYP.LIZIZ("GameLinkWidget", X1D.LIZIZ(LIZ));
            return str;
        }
    }

    private final boolean checkPreviewDialogIfShowWhenAnchorPermit(C74748TVg c74748TVg) {
        BaseFragment baseFragment;
        BaseFragment baseFragment2;
        BaseFragment baseFragment3;
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog = this.applydialog;
        if (gameLinkGuestUserInfoDialog != null && gameLinkGuestUserInfoDialog.isShowing()) {
            GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog2 = this.applydialog;
            BaseFragment baseFragment4 = null;
            if (gameLinkGuestUserInfoDialog2 != null) {
                baseFragment = gameLinkGuestUserInfoDialog2.LJLJL;
            } else {
                baseFragment = null;
            }
            if (baseFragment instanceof GameLinkUserInfoFragment) {
                if (gameLinkGuestUserInfoDialog2 != null) {
                    gameLinkGuestUserInfoDialog2.dismiss();
                }
            } else {
                if (gameLinkGuestUserInfoDialog2 != null) {
                    baseFragment2 = gameLinkGuestUserInfoDialog2.LJLJL;
                } else {
                    baseFragment2 = null;
                }
                if (baseFragment2 instanceof GameLinkPreviewFragment) {
                    if (gameLinkGuestUserInfoDialog2 != null) {
                        baseFragment3 = gameLinkGuestUserInfoDialog2.LJLJL;
                    } else {
                        baseFragment3 = null;
                    }
                    o.LJII(baseFragment3, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkPreviewFragment");
                    if (baseFragment3.isViewValid()) {
                        TWA twa = TWA.GO_LIVE;
                        this.dialogType = twa;
                        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog3 = this.applydialog;
                        if (gameLinkGuestUserInfoDialog3 != null) {
                            TWQ twq = this.guestApplyInfo;
                            gameLinkGuestUserInfoDialog3.LJLJJL = twa;
                            gameLinkGuestUserInfoDialog3.LJLJJLL = twq;
                            if (c74748TVg != null) {
                                gameLinkGuestUserInfoDialog3.LJLJLJ = c74748TVg;
                            }
                            baseFragment4 = gameLinkGuestUserInfoDialog3.LJLJL;
                        }
                        o.LJII(baseFragment4, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkPreviewFragment");
                        GameLinkPreviewFragment gameLinkPreviewFragment = (GameLinkPreviewFragment) baseFragment4;
                        gameLinkPreviewFragment.LLILII = "anchor_permit";
                        gameLinkPreviewFragment.LLILL = twa;
                        gameLinkPreviewFragment.Pl();
                        gameLinkPreviewFragment.LLIIL = true;
                        return true;
                    }
                }
                GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog4 = this.applydialog;
                if (gameLinkGuestUserInfoDialog4 != null) {
                    gameLinkGuestUserInfoDialog4.dismiss();
                }
            }
        }
        return false;
    }

    private final void handlePermissionDenied(C29401Dk c29401Dk) {
        CheckPermissionExtra checkPermissionExtra = (CheckPermissionExtra) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, c29401Dk.getExtra(), CheckPermissionExtra.class);
        if (checkPermissionExtra != null) {
            payOverNoPermission(checkPermissionExtra.payPlans, checkPermissionExtra.payHint);
        }
    }

    private final void showAppealDialog(int i) {
        Room room;
        String str;
        DataChannel dataChannel = this.dataChannel;
        User user = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        C47071t1 c47071t1 = new C47071t1(this.context);
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        c47071t1.LIZJ = C15380j0.LJIILL(R.string.k98, String.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.k97);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_agegate_popup16_desc)");
        String LJJJJZ = ujb.o.LJJJJZ(LJIILJJIL, "{username}", "%s", false);
        Object[] objArr = new Object[1];
        if (room != null) {
            user = room.getOwner();
        }
        objArr[0] = C05170If.LIZ(user);
        String LLLZ = C16880lQ.LLLZ(LJJJJZ, Arrays.copyOf(objArr, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        c47071t1.LJII(LLLZ);
        c47071t1.LJIIIZ(R.string.nol, new TW2(i));
        c47071t1.LJIIL(R.string.spm, new TW1(i, this));
        com_bytedance_android_livesdk_comp_impl_game_linkmic_widget_GameLinkWidget_com_bytedance_android_live_design_app_LiveDialog_show(c47071t1.LIZ());
        BZI LIZ = C28787BRn.LIZ("livesdk_appeal_popup_window_show");
        if (i == 0) {
            str = "multi_live_apply";
        } else {
            str = "multi_live_accept";
        }
        C1FL.LJI(LIZ, str, "request_page");
    }

    private final void showDobEditDialog(int i) {
        String str;
        Activity LJIILJJIL = g0.LJIILJJIL(this.context);
        if (LJIILJJIL == null) {
            return;
        }
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).showGuideBirthdayEditDialog(LJIILJJIL, "live_co_host", getRequestPage(i), new C29240Bdk(i, this));
        BZI LIZ = C28787BRn.LIZ("livesdk_add_birth_popup_window_show");
        if (i == 0) {
            str = "multi_live_apply";
        } else {
            str = "multi_live_accept";
        }
        C1FL.LJI(LIZ, str, "request_page");
    }

    private final void showPermissionOffDialog(String str) {
        C47071t1 c47071t1 = new C47071t1(this.context);
        c47071t1.LJIILL = true;
        c47071t1.LJIILJJIL = false;
        c47071t1.LJII(str);
        c47071t1.LJIIL(R.string.njj, TW4.LJLIL);
        com_bytedance_android_livesdk_comp_impl_game_linkmic_widget_GameLinkWidget_com_bytedance_android_live_design_app_LiveDialog_show(c47071t1.LIZ());
    }

    public final void doOnSei(C28272B7s c28272B7s) {
        this.gameLinkManager.LJIIIIZZ(c28272B7s);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (isViewValid() && 140000 == msg.what) {
            this.isLeaveWhenEnterBg = true;
        }
    }

    public void logThrowable(Throwable th) {
        C0NB.LJIIJ(6, getLogTag(), th.getStackTrace());
    }

    @Override // X.TSX
    public void onCheckPermissionFailed(C74698TTi checkPermissionErrInfo) {
        o.LJIIIZ(checkPermissionErrInfo, "checkPermissionErrInfo");
        Throwable th = checkPermissionErrInfo.LIZ;
        if (!(th instanceof C29401Dk)) {
            BPP.LIZJ(this.context, th);
            return;
        }
        C29401Dk c29401Dk = (C29401Dk) th;
        if (c29401Dk.getErrorCode() == 31002) {
            handlePermissionDenied(c29401Dk);
        }
        handlePermissionErrorCode(0, c29401Dk.getErrorCode(), th, null);
    }

    @Override // X.TSX
    public void onCheckPermissionFailedV3(C74764TVw permissionErrInfo) {
        int i;
        o.LJIIIZ(permissionErrInfo, "permissionErrInfo");
        int i2 = permissionErrInfo.LIZJ;
        Long l = permissionErrInfo.LIZ;
        if (l != null) {
            i = (int) l.longValue();
        } else {
            i = 1;
        }
        handlePermissionErrorCode(i2, i, null, permissionErrInfo.LIZIZ);
    }

    public final void onInteractStateChange(TW6 tw6) {
        GameLinkGuestPresenter gameLinkGuestPresenter;
        if (tw6.LIZ == 1) {
            Object obj = tw6.LIZIZ;
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.DialogType");
            TWA twa = (TWA) obj;
            this.dialogType = twa;
            if (TW8.LIZ[twa.ordinal()] == 1 && (gameLinkGuestPresenter = this.presenter) != null) {
                gameLinkGuestPresenter.doCheckPermissionByAccept();
            }
        }
    }

    @Override // X.TSX
    public void onJoinChannelFailed(Throwable th) {
        BPP.LIZJ(this.context, th);
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null) {
            GameLinkGuestPresenter.exitInteractInNormalWay$default(gameLinkGuestPresenter, "join_channel_error", false, CommonOptionConstants.OPTION_SET_FILE_LOG_ENABLED, 2, null);
        }
    }

    @Override // X.TSX
    public void onPlayerListChange(List<LinkPlayerInfo> players) {
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog;
        DataChannel dataChannel;
        o.LJIIIZ(players, "players");
        if (isViewValid() && (gameLinkGuestUserInfoDialog = this.applydialog) != null && gameLinkGuestUserInfoDialog.isShowing() && (dataChannel = this.dataChannel) != null) {
            dataChannel.qv0(GuestLinkPlayerListChange.class, players);
        }
    }

    @Override // X.InterfaceC28198B4w
    public void onSei(C28272B7s c28272B7s) {
        getSeiHandler().onSei(c28272B7s);
    }

    @Override // X.InterfaceC28198B4w
    public void setParentView(ViewGroup parentView) {
        o.LJIIIZ(parentView, "parentView");
        this.parentView = parentView;
    }

    @Override // X.TSX
    public void showApplyDialog(long j) {
        C74691TTb c74691TTb;
        TT1 applyOptPresenter;
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        C74748TVg c74748TVg = null;
        if (gameLinkGuestPresenter != null && (applyOptPresenter = gameLinkGuestPresenter.getApplyOptPresenter()) != null) {
            c74691TTb = applyOptPresenter.LIZJ(j);
        } else {
            c74691TTb = null;
        }
        this.dialogType = TWA.SEND_REQUEST;
        if (c74691TTb != null) {
            c74748TVg = c74691TTb.LIZIZ;
        }
        showApplyUserInfoListOrPreviewDialog(c74691TTb, c74748TVg);
    }

    @Override // X.TSX
    public void showPreviewDialogWhenAnchorPermit(C74748TVg c74748TVg) {
        Room room;
        int i;
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog;
        Integer num;
        if (checkPreviewDialogIfShowWhenAnchorPermit(c74748TVg)) {
            return;
        }
        this.dialogType = TWA.GO_LIVE;
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null) {
            room = gameLinkGuestPresenter.getRoom();
        } else {
            room = null;
        }
        this.dialogPresenter = new C74813TXt(gameLinkGuestPresenter, room, this.dataChannel);
        TWQ twq = this.guestApplyInfo;
        if (twq != null && (num = twq.LIZ) != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        TWQ twq2 = new TWQ(1, 28, Integer.valueOf(i));
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        TTR ttr = this.gameLinkManager;
        GameLinkGuestUserInfoDialog LIZ = TYH.LIZ(dataChannel, ttr, ttr.LJ(), this.dialogPresenter, new WeakReference(this.presenter), this.dialogType, twq2, "anchor_permit");
        this.applydialog = LIZ;
        C78866UxK.LJIJJ(LIZ, 2, false, false, null, 0, LiveCoverMinSizeSetting.DEFAULT);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null && (gameLinkGuestUserInfoDialog = this.applydialog) != null) {
            TWA twa = this.dialogType;
            TWQ twq3 = this.guestApplyInfo;
            gameLinkGuestUserInfoDialog.LJLJJL = twa;
            gameLinkGuestUserInfoDialog.LJLJJLL = twq3;
            if (c74748TVg != null) {
                gameLinkGuestUserInfoDialog.LJLJLJ = c74748TVg;
            }
            gameLinkGuestUserInfoDialog.show(fragmentManager, "GameLinkGuestUserInfoDialog");
        }
        TWL.LIZ.LJIILLIIL("guest_apply_anchor");
    }

    private final void payOverNoPermission(List<? extends LinkPayPlan> list, String str) {
        if (list == null || list.isEmpty()) {
            C30868C9o.LIZJ(R.string.srk);
        } else {
            showApplyDialog(TTV.LIZ().LJIJ);
        }
    }

    private final void showApplyUserInfoListOrPreviewDialog(C74691TTb c74691TTb, C74748TVg c74748TVg) {
        Room room;
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null) {
            room = gameLinkGuestPresenter.getRoom();
        } else {
            room = null;
        }
        this.dialogPresenter = new C74813TXt(gameLinkGuestPresenter, room, this.dataChannel);
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog = this.applydialog;
        if (gameLinkGuestUserInfoDialog != null && gameLinkGuestUserInfoDialog.isShowing()) {
            return;
        }
        if (this.guestApplyInfo == null) {
            this.guestApplyInfo = new TWQ(1, 28, -1);
        }
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        TTR ttr = this.gameLinkManager;
        this.applydialog = TYH.LIZ(dataChannel, ttr, ttr.LJ(), this.dialogPresenter, new WeakReference(this.presenter), this.dialogType, this.guestApplyInfo, "anchor_invite");
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog2 = this.applydialog;
            if (gameLinkGuestUserInfoDialog2 != null) {
                TWA twa = this.dialogType;
                TWQ twq = this.guestApplyInfo;
                gameLinkGuestUserInfoDialog2.LJLJJL = twa;
                gameLinkGuestUserInfoDialog2.LJLJJLL = twq;
                if (c74748TVg != null) {
                    gameLinkGuestUserInfoDialog2.LJLJLJ = c74748TVg;
                }
            }
            TWQ twq2 = this.guestApplyInfo;
            if (twq2 != null) {
                twq2.LJ = false;
            }
            if (gameLinkGuestUserInfoDialog2 != null) {
                gameLinkGuestUserInfoDialog2.show(fragmentManager, "GameLinkGuestUserInfoDialog");
            }
            GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog3 = this.applydialog;
            if (gameLinkGuestUserInfoDialog3 != null) {
                C78866UxK.LJIJJ(gameLinkGuestUserInfoDialog3, 2, false, false, null, 0, LiveCoverMinSizeSetting.DEFAULT);
            }
        }
    }

    public final void exitInteractNormal(Runnable runnable, boolean z) {
        int i;
        this.interactRoomCloseRunnable = runnable;
        GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
        if (gameLinkGuestPresenter != null) {
            if (z) {
                i = 10005;
            } else {
                i = 10003;
            }
            GameLinkGuestPresenter.exitInteractInNormalWay$default(gameLinkGuestPresenter, "live_end", false, i, 2, null);
        }
        C74746TVe.LJIIIIZZ("live_over");
        C74746TVe.LJII("live_over");
    }

    @Override // X.InterfaceC28198B4w
    public void onMultiGuestPermissionOff(boolean z, boolean z2) {
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog;
        if (!z && (gameLinkGuestUserInfoDialog = this.applydialog) != null && gameLinkGuestUserInfoDialog.isShowing()) {
            GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog2 = this.applydialog;
            if (gameLinkGuestUserInfoDialog2 != null) {
                gameLinkGuestUserInfoDialog2.dismiss();
            }
            if (z2) {
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.oky);
                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_takingfollowers)");
                showPermissionOffDialog(LJIILJJIL);
            } else {
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.kgx);
                o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_closingrequests)");
                showPermissionOffDialog(LJIILJJIL2);
            }
        }
    }

    private final void handlePermissionErrorCode(int i, int i2, Throwable th, String str) {
        switch (i2) {
            case 20048:
                showLowAgeApplyFailDialog();
                return;
            case 31002:
                return;
            case 31011:
                GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
                if (gameLinkGuestPresenter == null) {
                    return;
                }
                gameLinkGuestPresenter.getSuspendReason();
                return;
            case 4003036:
                C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.moi));
                return;
            case 4003037:
                GameLinkGuestPresenter gameLinkGuestPresenter2 = this.presenter;
                if (gameLinkGuestPresenter2 == null) {
                    return;
                }
                gameLinkGuestPresenter2.showBanDialog(this.context, BYP.BAN_FOR_BROADCASTING);
                return;
            case 4003088:
                showDobEditDialog(i);
                return;
            case 4003089:
                showAppealDialog(i);
                return;
            default:
                if (str != null && str.length() == 0) {
                    BPP.LIZJ(this.context, th);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC28198B4w
    public boolean interceptCloseRoom(Runnable runnable, boolean z, boolean z2, C28268B7o c28268B7o) {
        Integer num;
        Integer num2 = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num2 == null || 1 != num2.intValue()) {
            Integer num3 = (Integer) C74740TUy.LIZLLL().LIZIZ;
            if (num3 == null || 2 != num3.intValue()) {
                return false;
            }
            if (z2) {
                C47071t1 c47071t1 = new C47071t1(getContext());
                c47071t1.LJFF(R.string.sue);
                c47071t1.LJIIL(R.string.sz9, new IDcS94S0200000_13(this, runnable, 2));
                c47071t1.LJIIIZ(R.string.snz, TVR.LJLIL);
                com_bytedance_android_livesdk_comp_impl_game_linkmic_widget_GameLinkWidget_com_bytedance_android_live_design_app_LiveDialog_show(c47071t1.LIZ());
            } else {
                exitInteractNormal(runnable, true);
            }
        } else {
            C47071t1 c47071t12 = new C47071t1(getContext());
            c47071t12.LJIILLIIL(R.string.lua);
            c47071t12.LJFF(R.string.lu_);
            c47071t12.LIZIZ = this;
            c47071t12.LJIIL(R.string.lu8, new IDcS17S0300000_13(c28268B7o, this, runnable, 3));
            c47071t12.LJIIIZ(R.string.lu9, new IDcS172S0100000_13(c28268B7o, 8));
            LiveDialog LIZ = c47071t12.LIZ();
            LIZ.setCanceledOnTouchOutside(false);
            com_bytedance_android_livesdk_comp_impl_game_linkmic_widget_GameLinkWidget_com_bytedance_android_live_design_app_LiveDialog_show(LIZ);
            if (c28268B7o != null) {
                num = Integer.valueOf(c28268B7o.LIZ);
            } else {
                num = null;
            }
            TWL.LJIIL(false, false, num);
        }
        return true;
    }

    public static /* synthetic */ void showApplyUserInfoListOrPreviewDialog$default(GameLinkWidget gameLinkWidget, C74691TTb c74691TTb, C74748TVg c74748TVg, int i, Object obj) {
        if ((i & 1) != 0) {
            c74691TTb = null;
        }
        if ((i & 2) != 0) {
            c74748TVg = null;
        }
        gameLinkWidget.showApplyUserInfoListOrPreviewDialog(c74691TTb, c74748TVg);
    }

    @Override // X.TSX
    public void tryToShowGoLivePreviewDialogWhenAccepted(boolean z, List<LinkPayPlan> list, String str, long j, int i) {
        C74748TVg c74748TVg;
        TT2 beInvitedOptPresenter;
        if (i == 1) {
            GameLinkGuestPresenter gameLinkGuestPresenter = this.presenter;
            if (gameLinkGuestPresenter != null && (beInvitedOptPresenter = gameLinkGuestPresenter.getBeInvitedOptPresenter()) != null) {
                c74748TVg = beInvitedOptPresenter.LJJIJLIJ(j);
            } else {
                c74748TVg = null;
            }
            if (isApplyDialogShowing()) {
                forceDismissApplyDialog();
            }
            if (c74748TVg instanceof C74748TVg) {
                this.dialogType = TWA.GO_LIVE;
                showApplyUserInfoListOrPreviewDialog$default(this, null, c74748TVg, 1, null);
            } else {
                this.dialogType = TWA.GO_LIVE;
                showApplyUserInfoListOrPreviewDialog$default(this, null, null, 3, null);
            }
        }
    }
}
