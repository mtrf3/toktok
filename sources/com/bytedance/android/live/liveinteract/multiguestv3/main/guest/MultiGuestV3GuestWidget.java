package com.bytedance.android.live.liveinteract.multiguestv3.main.guest;

import X.AbstractC73672Svk;
import X.AbstractC74727TUl;
import X.B57;
import X.B83;
import X.BPP;
import X.BYM;
import X.BYP;
import X.C018905p;
import X.C03880Dg;
import X.C05170If;
import X.C05200Ii;
import X.C09650Zl;
import X.C0NB;
import X.C0NE;
import X.C0WU;
import X.C15380j0;
import X.C16880lQ;
import X.C17M;
import X.C184077Kh;
import X.C19U;
import X.C1EW;
import X.C214528bQ;
import X.C221108m2;
import X.C276516r;
import X.C279017q;
import X.C28268B7o;
import X.C28272B7s;
import X.C28329B9x;
import X.C28406BCw;
import X.C28643BLz;
import X.C28733BPl;
import X.C29044Baa;
import X.C29238Bdi;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29401Dk;
import X.C29494Bhq;
import X.C29556Biq;
import X.C2A6;
import X.C2K0;
import X.C30101Gc;
import X.C30111Gd;
import X.C30868C9o;
import X.C31657Cbd;
import X.C31811Ce7;
import X.C32014ChO;
import X.C32537Cpp;
import X.C34941Ys;
import X.C41021jG;
import X.C41031jH;
import X.C44846His;
import X.C47071t1;
import X.C47121t6;
import X.C47261Igj;
import X.C55230Lly;
import X.C5H3;
import X.C62705OjF;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65814PsI;
import X.C72818Shy;
import X.C73933Szx;
import X.C73994T2g;
import X.C74650TRm;
import X.C74690TTa;
import X.C74699TTj;
import X.C74740TUy;
import X.C74749TVh;
import X.C74751TVj;
import X.C74752TVk;
import X.C74776TWi;
import X.C74789TWv;
import X.C74794TXa;
import X.C74796TXc;
import X.C74797TXd;
import X.C74804TXk;
import X.C74814TXu;
import X.C74824TYe;
import X.C74838TYs;
import X.C74983Tbn;
import X.C74987Tbr;
import X.C75017TcL;
import X.C75023TcR;
import X.C75042Tck;
import X.C75089TdV;
import X.C75415Til;
import X.C75422Tis;
import X.C75559Tl5;
import X.C76548U2m;
import X.C76800UCe;
import X.C76917UGr;
import X.C77437UaH;
import X.C77800Ug8;
import X.C78866UxK;
import X.C78886Uxe;
import X.C78926UyI;
import X.C78996UzQ;
import X.C79234V7u;
import X.C8E;
import X.CN1;
import X.DialogC77438UaI;
import X.EnumC46470ILq;
import X.EnumC75006TcA;
import X.IPJ;
import X.InterfaceC28296B8q;
import X.InterfaceC29856Bng;
import X.InterfaceC31781Cdd;
import X.InterfaceC55235Lm3;
import X.InterfaceC64592gB;
import X.InterfaceC74236TBo;
import X.InterfaceC74596TPk;
import X.InterfaceC74795TXb;
import X.InterfaceC74798TXe;
import X.InterfaceC74805TXl;
import X.InterfaceC75011TcF;
import X.InterfaceC75441TjB;
import X.InterfaceC88472Yns;
import X.TBT;
import X.TQ4;
import X.TQ8;
import X.TQA;
import X.TQG;
import X.TQH;
import X.TQM;
import X.TQS;
import X.TS1;
import X.TS4;
import X.TSQ;
import X.TUZ;
import X.TW6;
import X.TW7;
import X.TWR;
import X.TXE;
import X.TXF;
import X.TXH;
import X.TXJ;
import X.TXK;
import X.TXL;
import X.TXO;
import X.TXP;
import X.TXQ;
import X.TXR;
import X.TXS;
import X.TXT;
import X.TXU;
import X.TXV;
import X.TXW;
import X.TXX;
import X.TXY;
import X.TXZ;
import X.TYQ;
import X.U16;
import X.U2L;
import X.U35;
import X.U44;
import X.U8H;
import X.UC0;
import X.UC1;
import X.X1D;
import Y.AUListenerS91S0100000_2;
import Y.AUListenerS94S0100000_5;
import Y.AfS57S0100000_5;
import Y.AfS65S0100000_13;
import Y.IDCListenerS53S0200000_13;
import Y.IDDListenerS145S0100000_5;
import Y.IDDListenerS152S0100000_13;
import Y.IDcS172S0100000_13;
import Y.IDcS17S0300000_13;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.byted.cast.common.CommonOptionConstants;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.LiveStreamFpsReportData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestApplySucceedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AutoOpenGuestApplyDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestReceiveInviteMeFromModeratorChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.OpenMultiGuestModeratorsManageDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowUserListDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.MultiGuestAsGuestModeratorsWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.LiveShowService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.audience.LiveShowAudienceWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.guest.LiveShowGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.ThemeAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.SharedBgAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.live.liveinteract.multilive.guset.util.MultiLiveInviteeShareHelper;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyLayoutOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkGeckoDslDownloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSeiFormatErrIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSharedBgGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkAbnormalConnectionOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestPauseTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAdaptMicRoomSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestApplyingLeaveAlertSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestApplyingSlideAndBarIconSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSeiFormatErrEndLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestBeautyDebug2Setting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.watch.LivePlayBgVisibilityChange;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowContent;

/* loaded from: classes14.dex */
public final class MultiGuestV3GuestWidget extends BaseMultiGuestV3GuestWidget implements WeakHandler.IHandler {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public static final C74797TXd Companion;
    public InterfaceC74798TXe animationManager;
    public boolean clickLinkHostFromInteractionDialog;
    public String currentDslLayoutId;
    public Integer currentDslScene;
    public Integer currentDslVersion;
    public C47121t6 debugFpsTextView;
    public C74814TXu dialogPresenter;
    public int fpsReportCount;
    public U2L gifterThresholdDialog;
    public TWR guestApplyInfo;
    public boolean hasSeiParsedValid;
    public MultiLiveGuestUserInfoDialog interactApplyDialog;
    public boolean isLeaveWhenEnterBg;
    public boolean isNeedAutoShowApplyDialog;
    public long lastReceiveSeiDataTimeStamp;
    public LiveShowAudienceWidget liveShowAudienceWidget;
    public ShowContent liveShowContentForCharacterChange;
    public LiveShowGuestWidget liveShowGuestWidget;
    public final FrameLayout mAnchorContainer;
    public final C31657Cbd mDeepLinkEnterMultiLiveRoomHandler$delegate;
    public TXF mGuestJoinType;
    public WeakHandler mHandler;
    public Runnable mInteractRoomCloseRunnable;
    public final InterfaceC88472Yns<TW6, C76800UCe> mInteractStateChange;
    public final C5H3 mInterceptorArray$delegate;
    public LiveDialog mKickOutDialog;
    public final C31657Cbd mMultiGuestDataHolder$delegate;
    public final C5H3 mMultiGuestsToolbar$delegate;
    public MultiGuestV3GuestPresenter mPresenter;
    public Room mRoom;
    public final TXJ moderatorPermissionChangeListener;
    public final TXY multiGuestContent;
    public MultiGuestAsGuestModeratorsWidget multiGuestV3AsGuestModeratorsWidget;
    public MultiGuestGoLivePreviewFragment newGoLivePreviewDialog;
    public LiveDialog secondConfirmDialog;
    public final long seiFormatErrInterval;
    public final C5H3 seiHandler$delegate;
    public MultiGuestSharedBgGuestViewModel sharedBgGuestViewModel;
    public MultiGuestThemeViewModel themeViewModel;
    public final C31657Cbd zoomService$delegate;

    static {
        TBT tbt = new TBT(MultiGuestV3GuestWidget.class, "mDeepLinkEnterMultiLiveRoomHandler", "getMDeepLinkEnterMultiLiveRoomHandler()Lcom/bytedance/android/live/liveinteract/platform/common/monitor/DeepLinkEnterMultiLiveRoomDataHandler;", 0);
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt, new TBT(MultiGuestV3GuestWidget.class, "mMultiGuestDataHolder", "getMMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0), new TBT(MultiGuestV3GuestWidget.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0)};
        Companion = new C74797TXd();
    }

    public static void com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_live_design_app_LiveDialog_show(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "2444564331322175274")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public static void com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_live_design_view_sheet_action_LiveActionSheetDialog_show(LiveActionSheetDialog liveActionSheetDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/view/sheet/action/LiveActionSheetDialog", "show", liveActionSheetDialog, new Object[0], "void", new C65300Pk0(false, "()V", "2444564331322175274")).LIZ) {
            return;
        }
        liveActionSheetDialog.show();
    }

    public static void com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_live_liveinteract_multiguestv3_main_userinfo_guest_MultiGuestGifterThresholdDialog_show(U2L u2l) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/userinfo/guest/MultiGuestGifterThresholdDialog", "show", u2l, new Object[0], "void", new C65300Pk0(false, "()V", "2444564331322175274")).LIZ) {
            return;
        }
        u2l.show();
    }

    public static void com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_livesdk_dialog_LiveModalDialog_show(DialogC77438UaI dialogC77438UaI) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "2444564331322175274")).LIZ) {
            return;
        }
        dialogC77438UaI.show();
    }

    private final String getDefaultAppealUrl() {
        return "sslocal://webcast_webview?url=https://webcast.tiktokv.com/falcon/webcast_mt/page/proactive_appeal_redirect/index.html?web_bg_color=#ffffffff&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
    }

    private final boolean shouldCheckDeviceDelay() {
        C74983Tbn LIZ = C29556Biq.LIZ();
        TWR twr = this.guestApplyInfo;
        LIZ.getClass();
        if (!C74983Tbn.LJIIL(twr) && LinkMicApplyLayoutOptSetting.INSTANCE.getValue() != 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.dl3;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, com.bytedance.android.live.liveinteract.api.LinkMicGuestWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void showDisconnectSecondWindow() {
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
        C47071t1 c47071t1 = new C47071t1(C8E.LIZ().getTopActivity());
        c47071t1.LIZJ = LJIILL;
        c47071t1.LJFF(R.string.m7x);
        c47071t1.LJIIL(R.string.now, new IDcS172S0100000_13(this, 2));
        c47071t1.LJIIIZ(R.string.np2, C74699TTj.LJLIL);
        com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_live_design_app_LiveDialog_show(c47071t1.LIZ());
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public /* bridge */ /* synthetic */ void showReservationDialog(long j) {
    }

    private final void buildDialog() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        TWR twr;
        if (this.guestApplyInfo == null) {
            this.guestApplyInfo = new TWR(-1, 1, 0, 0, 60);
        }
        if (LinkMicApplyLayoutOptSetting.INSTANCE.getValue() == 2 && (twr = this.guestApplyInfo) != null && twr.LIZJ != 0 && twr.LIZJ != 3 && twr.LIZJ != 2) {
            twr.LIZJ = 1;
            twr.LJFF = true;
        }
        LiveSdkMultiGuestLeakOptSetting liveSdkMultiGuestLeakOptSetting = LiveSdkMultiGuestLeakOptSetting.INSTANCE;
        if (liveSdkMultiGuestLeakOptSetting.isEnable()) {
            if (this.interactApplyDialog == null) {
                DataChannel dataChannel = this.dataChannel;
                o.LJIIIIZZ(dataChannel, "dataChannel");
                MultiLiveGuestUserInfoDialog LIZIZ = TXL.LIZIZ(dataChannel, this.dialogPresenter, new WeakReference(this.mPresenter), this.mGuestJoinType, this.guestApplyInfo, 0);
                this.interactApplyDialog = LIZIZ;
                LIZIZ.onDialogGoneListener = new TXV(this);
            }
        } else {
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            this.interactApplyDialog = TXL.LIZIZ(dataChannel2, this.dialogPresenter, new WeakReference(this.mPresenter), this.mGuestJoinType, this.guestApplyInfo, 0);
        }
        if (liveSdkMultiGuestLeakOptSetting.isEnable() && (multiLiveGuestUserInfoDialog = this.interactApplyDialog) != null) {
            C74814TXu c74814TXu = this.dialogPresenter;
            TXF txf = this.mGuestJoinType;
            TWR twr2 = this.guestApplyInfo;
            multiLiveGuestUserInfoDialog.LJLILLLLZI = c74814TXu;
            multiLiveGuestUserInfoDialog.LJLJJI = txf;
            multiLiveGuestUserInfoDialog.LJLJJL = twr2;
            multiLiveGuestUserInfoDialog.LJLL = "invite";
            multiLiveGuestUserInfoDialog.LJLJLLL = 0;
        }
    }

    private final boolean checkIfCurrentLayoutIdExists() {
        Integer num;
        InterfaceC75011TcF JR = ((ILinkMicService) CN1.LIZ(ILinkMicService.class)).JR();
        if (JR != null && this.currentDslLayoutId != null && (num = this.currentDslScene) != null) {
            int intValue = num.intValue();
            Integer num2 = this.currentDslVersion;
            if (num2 != null) {
                Iterator<Layout> it = JR.LIZIZ(intValue, num2.intValue()).getData().values().iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (o.LJ(it.next().getLayoutId(), this.currentDslLayoutId)) {
                        z = true;
                    }
                }
                if (!z) {
                    C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.kgb));
                    C74824TYe.LJJIIZ("currentDslLayoutExistsIfLink");
                    return false;
                }
            }
        }
        return true;
    }

    private final void checkIfReportWatchLive() {
        Room room = this.mRoom;
        MultiLiveAnchorPanelSettings LJI = C74776TWi.LJI();
        if (C74776TWi.LJIILL(LJI) && (!C74776TWi.LJIILIIL(LJI) || C74776TWi.LJIIJJI(room))) {
            C74751TVj.LIZJ();
        }
        if (C74838TYs.LJ().LJJ > 0) {
            C74751TVj.LIZLLL(null, null, this.mRoom, 3);
        }
    }

    private final void checkLinkMicJoinPermission() {
        C75023TcR.LIZLLL.LIZJ("key_checkLinkMicJoinPermission");
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null) {
            multiGuestV3GuestPresenter.checkLinkPermissionAhead$liveinteract_impl_release(0, shouldCheckDeviceDelay());
        }
    }

    private final void dismissPreviewDialog() {
        LiveBaseFragment liveBaseFragment;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog != null && !multiLiveGuestUserInfoDialog.isShowing()) {
            return;
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog2 != null) {
            liveBaseFragment = multiLiveGuestUserInfoDialog2.LJLJJLL;
        } else {
            liveBaseFragment = null;
        }
        if ((liveBaseFragment instanceof MultiGuestPreviewFragment) && multiLiveGuestUserInfoDialog2 != null) {
            multiLiveGuestUserInfoDialog2.dismiss();
        }
    }

    private final FragmentManager getFragmentManager() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            return (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        }
        return null;
    }

    private final DeepLinkEnterMultiLiveRoomDataHandler getMDeepLinkEnterMultiLiveRoomHandler() {
        return (DeepLinkEnterMultiLiveRoomDataHandler) this.mDeepLinkEnterMultiLiveRoomHandler$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    private final TXE[] getMInterceptorArray() {
        return (TXE[]) this.mInterceptorArray$delegate.getValue();
    }

    private final TSQ getMMultiGuestsToolbar() {
        return (TSQ) this.mMultiGuestsToolbar$delegate.getValue();
    }

    private final String getMtDefaultLowAgeReportUrl() {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
            return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
    }

    private final TW7 getSeiHandler() {
        return (TW7) this.seiHandler$delegate.getValue();
    }

    private final long getSelfGift2AnchorScore() {
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null) {
            return multiGuestV3GuestPresenter.getSelfGift2AnchorScore();
        }
        return 0L;
    }

    private final int getTimeOutInterval() {
        return LiveSdkMultiguestPauseTimeoutIntervalSetting.INSTANCE.getValue();
    }

    private final void initModerator() {
        C31811Ce7.LIZLLL("MultiGuestV3GuestWidget", "initModerator");
        if (C74789TWv.LIZIZ()) {
            onModeratorPermissionChange(true);
        }
        TXJ txj = this.moderatorPermissionChangeListener;
        if (txj != null) {
            C74789TWv.LIZJ.add(txj);
        }
    }

    private final void loadLiveShowGuestWidget() {
        U35 LIZ;
        if (!MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
            return;
        }
        C0NB.LIZIZ("MultiGuestV3GuestWidget", "loadShowGuestWidget");
        if (this.liveShowAudienceWidget != null) {
            unLoadLiveShowAudienceWidget();
        }
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null) {
            LIZ2.LJIIIZ(EnumC75006TcA.GUEST);
        }
        ShowContent showContent = this.liveShowContentForCharacterChange;
        if (showContent != null && (LIZ = TQA.LIZ()) != null) {
            LIZ.LJIIL(showContent);
        }
        this.liveShowGuestWidget = new LiveShowGuestWidget(this.mAnchorContainer);
        enableSubWidgetManager(C28329B9x.LIZJ(getContext()));
        this.subWidgetManager.load(this.liveShowGuestWidget);
    }

    private final void loadMultiGuestV3GuestModeratorsWidget() {
        C31811Ce7.LIZLLL("MultiGuestV3GuestWidget", "loadMultiGuestV3GuestModeratorsWidget");
        Room room = this.mRoom;
        if (room != null) {
            this.multiGuestV3AsGuestModeratorsWidget = new MultiGuestAsGuestModeratorsWidget(room);
            enableSubWidgetManager();
            this.subWidgetManager.load(this.multiGuestV3AsGuestModeratorsWidget);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(HasMultiGuestV3GuestModeratorWidget.class, Boolean.TRUE);
                return;
            }
        }
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZLLL("MultiGuestV3GuestWidget", "loadMultiGuestV3GuestModeratorsWidget, mRoom is null");
    }

    private final void showDisconnectFirstWindow() {
        C2A6 c2a6 = new C2A6(C8E.LIZ().getTopActivity());
        C41021jG c41021jG = new C41021jG();
        c41021jG.LIZ = C15380j0.LJIILJJIL(R.string.now);
        c41021jG.LIZJ = new TXU(this);
        c2a6.LIZIZ(C47261Igj.LJJIJ(new C41031jH(c41021jG)));
        C30101Gc c30101Gc = new C30101Gc();
        c30101Gc.LIZ = C15380j0.LJIILJJIL(R.string.snx);
        c30101Gc.LIZJ = TXX.LJLIL;
        c2a6.LIZLLL = new C30111Gd(c30101Gc);
        com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_live_design_view_sheet_action_LiveActionSheetDialog_show(c2a6.LIZ());
    }

    private final void showGifterThresholdDialog() {
        if (this.gifterThresholdDialog != null) {
            return;
        }
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        U2L u2l = new U2L(context, getSelfGift2AnchorScore(), getGiftScoreThreshold(), this.mRoom, this.dataChannel);
        this.gifterThresholdDialog = u2l;
        com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_live_liveinteract_multiguestv3_main_userinfo_guest_MultiGuestGifterThresholdDialog_show(u2l);
        u2l.setOnDismissListener(new IDDListenerS152S0100000_13(this, 2));
        C78866UxK.LJIJI(u2l, 14, false, false, true, 106);
    }

    private final void unLoadLiveShowAudienceWidget() {
        if (!MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() || this.liveShowAudienceWidget == null) {
            return;
        }
        C0NB.LIZIZ("MultiGuestV3GuestWidget", "unloadLiveShowAudienceWidget");
        this.subWidgetManager.unload(this.liveShowAudienceWidget);
        this.liveShowAudienceWidget = null;
    }

    private final void unLoadLiveShowGuestWidget() {
        if (!MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() || this.liveShowGuestWidget == null) {
            return;
        }
        C0NB.LIZIZ("MultiGuestV3GuestWidget", "unloadShowGuestWidget");
        this.subWidgetManager.unload(this.liveShowGuestWidget);
        this.liveShowGuestWidget = null;
        setLiveShowContentForCharacterChange(null);
    }

    private final void unLoadMultiGuestV3GuestModeratorsWidget() {
        C31811Ce7.LIZLLL("MultiGuestV3GuestWidget", "unLoadMultiGuestV3GuestModeratorsWidget");
        MultiGuestAsGuestModeratorsWidget multiGuestAsGuestModeratorsWidget = this.multiGuestV3AsGuestModeratorsWidget;
        if (multiGuestAsGuestModeratorsWidget != null) {
            this.subWidgetManager.unload(multiGuestAsGuestModeratorsWidget);
            this.multiGuestV3AsGuestModeratorsWidget = null;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(HasMultiGuestV3GuestModeratorWidget.class, Boolean.FALSE);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void becomeGuest() {
        InterfaceC55235Lm3 linkScope;
        ILinkStateAbility iLinkStateAbility;
        TXY txy = this.multiGuestContent;
        if (txy != null) {
            txy.I2(true, false);
        }
        InterfaceC74798TXe interfaceC74798TXe = this.animationManager;
        if (interfaceC74798TXe != null) {
            interfaceC74798TXe.X9(false);
        }
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null && (linkScope = linkScope()) != null && (iLinkStateAbility = (ILinkStateAbility) UC0.LJIIL(linkScope, ILinkStateAbility.class, null)) != null) {
            multiGuestV3GuestPresenter.subscribeStateChange(iLinkStateAbility);
        }
        loadLiveShowGuestWidget();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void becomeNormalAudience() {
        Runnable runnable = this.mInteractRoomCloseRunnable;
        if (runnable != null) {
            runnable.run();
        }
        this.mInteractRoomCloseRunnable = null;
        TXY txy = this.multiGuestContent;
        if (txy != null) {
            txy.I2(false, true);
        }
        InterfaceC74798TXe interfaceC74798TXe = this.animationManager;
        if (interfaceC74798TXe != null) {
            interfaceC74798TXe.X9(true);
        }
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).clearPreviewImageInfo();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget
    public void dismissKickOutDialog() {
        LiveDialog liveDialog = this.mKickOutDialog;
        if (liveDialog != null && liveDialog.isShowing()) {
            LiveDialog liveDialog2 = this.mKickOutDialog;
            if (liveDialog2 != null) {
                liveDialog2.dismiss();
            }
            this.mKickOutDialog = null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void forceDismissApplyDialog() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog2 != null && multiLiveGuestUserInfoDialog2.isShowing() && (multiLiveGuestUserInfoDialog = this.interactApplyDialog) != null) {
            multiLiveGuestUserInfoDialog.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC31336CRo
    public String getLogTag() {
        return MultiGuestV3GuestWidget.class.getName();
    }

    public final MultiGuestDataHolder getMMultiGuestDataHolder() {
        return (MultiGuestDataHolder) this.mMultiGuestDataHolder$delegate.LIZ(this, $$delegatedProperties[1]);
    }

    public final ZoomService getZoomService() {
        return (ZoomService) this.zoomService$delegate.LIZ(this, $$delegatedProperties[2]);
    }

    public final void gotoAppealPage() {
        IActionHandlerService iActionHandlerService;
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = getDefaultAppealUrl();
        }
        String appendParamToAppeal = appendParamToAppeal(value);
        Context context = C8E.LIZIZ().context();
        if (context != null && (iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class)) != null) {
            iActionHandlerService.handle(context, appendParamToAppeal);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public boolean isApplyDialogShowing() {
        LiveBaseFragment liveBaseFragment;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog == null || !multiLiveGuestUserInfoDialog.isShowing()) {
            return false;
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog2 != null) {
            liveBaseFragment = multiLiveGuestUserInfoDialog2.LJLJJLL;
        } else {
            liveBaseFragment = null;
        }
        if (!(liveBaseFragment instanceof MultiGuestUserInfoFragment)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public boolean isInPipMode() {
        Context context = this.context;
        if (context == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT < 24 || !(context instanceof Activity)) {
                return false;
            }
            return ((Activity) context).isInPictureInPictureMode();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // X.InterfaceC74596TPk
    public InterfaceC55235Lm3 linkScope() {
        FrameLayout frameLayout = this.mAnchorContainer;
        if (frameLayout != null) {
            return UC0.LJJIL(frameLayout);
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void loadLiveShowAudienceWidget() {
        if (!MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
            return;
        }
        C0NB.LIZIZ("MultiGuestV3GuestWidget", "loadLiveShowAudienceWidget");
        if (this.liveShowGuestWidget != null) {
            unLoadLiveShowGuestWidget();
        }
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            LIZ.LJIIIZ(EnumC75006TcA.AUDIENCE);
        }
        this.liveShowAudienceWidget = new LiveShowAudienceWidget(this.mAnchorContainer);
        enableSubWidgetManager(C28329B9x.LIZJ(getContext()));
        this.subWidgetManager.load(this.liveShowAudienceWidget);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        Room room;
        Fragment LJIIIZ;
        MultiGuestThemeViewModel multiGuestThemeViewModel;
        TQ8 tq8;
        IThemeAbility iThemeAbility;
        String str;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig enterRoomConfig2;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig enterRoomConfig3;
        EnterRoomConfig.RoomsData roomsData2;
        InterfaceC55235Lm3 interfaceC55235Lm3;
        Fragment LJIIIZ2;
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel;
        Fragment LJIIIZ3;
        Fragment LJIIIZ4;
        Fragment LJIIIZ5;
        O o;
        super.onCreate();
        TYQ.LIZJ("LinkIn_Guest_Widget_onCreate");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.mRoom = room;
        initModerator();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if ((interfaceC31781Cdd != null && (LJIIIZ5 = interfaceC31781Cdd.getFragment()) != null) || (LJIIIZ5 = C79234V7u.LJIIIZ(getView())) != null) {
                o = C55230Lly.LIZJ(LJIIIZ5, "linkMicScope");
            } else {
                o = 0;
            }
            ((C32537Cpp) dataChannel2.gv0(C75415Til.class)).LIZ = o;
        }
        InterfaceC31781Cdd interfaceC31781Cdd2 = this.widgetCallback;
        if (interfaceC31781Cdd2 == null || (LJIIIZ = interfaceC31781Cdd2.getFragment()) == null) {
            LJIIIZ = C79234V7u.LJIIIZ(getView());
        }
        int i = 0;
        if (LJIIIZ != null) {
            C65776Prg LIZ = C65352Pkq.LIZ(MultiGuestThemeViewModel.class);
            multiGuestThemeViewModel = (MultiGuestThemeViewModel) C73994T2g.LJJIIJ(new AqS154S0100000_4(LIZ, 1168), C214528bQ.LJLIL, C78926UyI.LJJII(LJIIIZ, false), C78926UyI.LJJIIJZLJL(LJIIIZ, false), C184077Kh.LJLIL, C78926UyI.LJJ(LJIIIZ, false), C78926UyI.LJIILLIIL(LJIIIZ, false), C75089TdV.INSTANCE, LIZ);
            InterfaceC31781Cdd interfaceC31781Cdd3 = this.widgetCallback;
            if ((interfaceC31781Cdd3 != null && (LJIIIZ4 = interfaceC31781Cdd3.getFragment()) != null) || (LJIIIZ4 = C79234V7u.LJIIIZ(getView())) != null) {
                InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LJIIIZ4, "linkMicScope");
                UC0.LJII(LIZJ, new ThemeAbilityImpl(multiGuestThemeViewModel), IThemeAbility.class);
                multiGuestThemeViewModel.gv0(LIZJ);
            }
        } else {
            multiGuestThemeViewModel = null;
        }
        this.themeViewModel = multiGuestThemeViewModel;
        if (LinkMicSharedBgGuestSetting.isEnable()) {
            C74987Tbr.LIZJ("shared_bg", "guest enable shared bg feature.");
            InterfaceC31781Cdd interfaceC31781Cdd4 = this.widgetCallback;
            if ((interfaceC31781Cdd4 != null && (LJIIIZ2 = interfaceC31781Cdd4.getFragment()) != null) || (LJIIIZ2 = C79234V7u.LJIIIZ(getView())) != null) {
                C65776Prg LIZ2 = C65352Pkq.LIZ(MultiGuestSharedBgGuestViewModel.class);
                multiGuestSharedBgGuestViewModel = (MultiGuestSharedBgGuestViewModel) C73994T2g.LJJIIJ(new AqS154S0100000_4(LIZ2, 1168), C214528bQ.LJLIL, C78926UyI.LJJII(LJIIIZ2, false), C78926UyI.LJJIIJZLJL(LJIIIZ2, false), C184077Kh.LJLIL, C78926UyI.LJJ(LJIIIZ2, false), C78926UyI.LJIILLIIL(LJIIIZ2, false), C75089TdV.INSTANCE, LIZ2);
                InterfaceC31781Cdd interfaceC31781Cdd5 = this.widgetCallback;
                if ((interfaceC31781Cdd5 != null && (LJIIIZ3 = interfaceC31781Cdd5.getFragment()) != null) || (LJIIIZ3 = C79234V7u.LJIIIZ(getView())) != null) {
                    InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(LJIIIZ3, "linkMicScope");
                    UC0.LJII(LIZJ2, new SharedBgAbilityImpl(null, multiGuestSharedBgGuestViewModel), ISharedBgAbility.class);
                    C74987Tbr.LIZ("guest_shared_bg", "onCreate");
                    AssemViewModel.subscribeInternal$default(multiGuestSharedBgGuestViewModel, null, null, null, new AqS179S0100000_13(LIZJ2, 374), 7, null);
                    C8E.LJ().Aq(multiGuestSharedBgGuestViewModel.LJLJI);
                }
            } else {
                multiGuestSharedBgGuestViewModel = null;
            }
            this.sharedBgGuestViewModel = multiGuestSharedBgGuestViewModel;
        } else {
            C74987Tbr.LIZJ("shared_bg", "guest disable shared bg feature.");
        }
        getMMultiGuestsToolbar().LIZLLL();
        DataChannel dataChannel3 = this.dataChannel;
        dataChannel3.mv0(InteractStateChangeEvent.class, this, this.mInteractStateChange);
        dataChannel3.mv0(GuestApplyEvent.class, this, new AqS179S0100000_13(this, 127));
        dataChannel3.mv0(ApplyTypeChangeEvent.class, this, new AqS179S0100000_13(this, 128));
        dataChannel3.ov0(this, LivePlayBgVisibilityChange.class, new AqS179S0100000_13(this, 129));
        dataChannel3.mv0(ShowUserListDialog.class, this, new AqS179S0100000_13(this, 130));
        dataChannel3.lv0(this, LiveStreamFpsReportData.class, new AqS179S0100000_13(this, 131));
        dataChannel3.mv0(LinkInRoomGuestApplySucceedEvent.class, this, new AqS179S0100000_13(this, 132));
        dataChannel3.lv0(this, AutoOpenGuestApplyDialogEvent.class, new AqS179S0100000_13(this, 133));
        Room room2 = this.mRoom;
        if (room2 != null) {
            DataChannel dataChannel4 = this.dataChannel;
            o.LJIIIIZZ(dataChannel4, "dataChannel");
            this.mPresenter = new MultiGuestV3GuestPresenter(room2, dataChannel4, this);
        }
        TXY txy = this.multiGuestContent;
        FrameLayout frameLayout = this.mAnchorContainer;
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null) {
            tq8 = multiGuestV3GuestPresenter.getUserManager();
        } else {
            tq8 = null;
        }
        txy.LIZ(this, frameLayout, tq8, false);
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter2 = this.mPresenter;
        if (multiGuestV3GuestPresenter2 != null) {
            multiGuestV3GuestPresenter2.attachView((InterfaceC74596TPk) this);
        }
        this.mHandler = new WeakHandler(this);
        FrameLayout frameLayout2 = this.mAnchorContainer;
        TXY txy2 = this.multiGuestContent;
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null && (interfaceC55235Lm3 = (InterfaceC55235Lm3) dataChannel5.kv0(C75415Til.class)) != null) {
            iThemeAbility = (IThemeAbility) UC0.LJIIL(interfaceC55235Lm3, IThemeAbility.class, null);
        } else {
            iThemeAbility = null;
        }
        AnimationManagerImpl LIZ3 = TXZ.LIZ(frameLayout2, txy2, this, iThemeAbility, this.dataChannel);
        this.animationManager = LIZ3;
        if (LIZ3 != null) {
            LIZ3.LJLJLLL = true;
        }
        C74740TUy.LIZLLL().LJI(0);
        C74838TYs.LJ().LJJIJIIJI = false;
        DeepLinkEnterMultiLiveRoomDataHandler mDeepLinkEnterMultiLiveRoomHandler = getMDeepLinkEnterMultiLiveRoomHandler();
        if (mDeepLinkEnterMultiLiveRoomHandler != null) {
            mDeepLinkEnterMultiLiveRoomHandler.LJFF();
        }
        TQS tqs = MultiGuestFeedbackController.LJIIJ;
        Room room3 = this.mRoom;
        User LIZIZ = C05200Ii.LIZIZ();
        Context context = this.context;
        AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 79);
        tqs.getClass();
        if (room3 == null || LIZIZ == null || context == null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("get null: ");
            LIZ4.append(room3);
            LIZ4.append(", ");
            LIZ4.append(LIZIZ);
            LIZ4.append(' ');
            LIZ4.append(context);
            TYQ.LIZ("MultiGuestFeedbackController", X1D.LIZIZ(LIZ4));
        } else {
            MultiGuestFeedbackController multiGuestFeedbackController = new MultiGuestFeedbackController(room3, LIZIZ, context, aqS163S0100000_13);
            C75559Tl5.LIZIZ.LJI(multiGuestFeedbackController, null);
            C72818Shy.LIZLLL("Multi_guest_feedback_submit", multiGuestFeedbackController.LJIIIZ);
        }
        if (!((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt() || !MultiGuestAdaptMicRoomSwitchSetting.INSTANCE.isEnable()) {
            DataChannel dataChannel6 = this.dataChannel;
            Room room4 = this.mRoom;
            if (dataChannel6 != null && room4 != null) {
                MultiLiveInviteeShareHelper multiLiveInviteeShareHelper = new MultiLiveInviteeShareHelper(room4, dataChannel6, this);
                C75559Tl5.LIZIZ.LJI(multiLiveInviteeShareHelper, null);
                C28643BLz c28643BLz = B57.LIZ;
                EnterRoomLinkSession LIZ5 = c28643BLz.LIZ();
                String str2 = "";
                if (LIZ5 == null || (enterRoomConfig3 = LIZ5.mEnterRoomConfig) == null || (roomsData2 = enterRoomConfig3.mRoomsData) == null || (str = roomsData2.shareIntent) == null) {
                    str = "";
                }
                EnterRoomLinkSession LIZ6 = c28643BLz.LIZ();
                if (LIZ6 != null && (enterRoomConfig2 = LIZ6.mEnterRoomConfig) != null && (roomsData = enterRoomConfig2.mRoomsData) != null) {
                    roomsData.shareIntent = "";
                }
                C279017q.LJ("checkInviteeState shareIntent:", str, "MultiLiveInviteeShareHelper");
                if (!multiLiveInviteeShareHelper.LIZIZ.isWithLinkMic() || !C74838TYs.LJ().LJIIIIZZ) {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("checkInviteeState isWithLinkMic = ");
                    LIZ7.append(multiLiveInviteeShareHelper.LIZIZ.isWithLinkMic());
                    LIZ7.append(" inStart=");
                    C19U.LIZJ(LIZ7, C74838TYs.LJ().LJIIIIZZ, LIZ7, "MultiLiveInviteeShareHelper");
                } else if (!o.LJ(str, "multi_guest_invite")) {
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("checkInviteeState return as shareIntent(");
                    LIZ8.append(str);
                    LIZ8.append(") isn't equal with INVITE_MULTI_LIVE_SHARE_INTENT");
                    C0NB.LIZIZ("MultiLiveInviteeShareHelper", X1D.LIZIZ(LIZ8));
                } else {
                    EnterRoomLinkSession LIZ9 = c28643BLz.LIZ();
                    if (LIZ9 != null && (enterRoomConfig = LIZ9.mEnterRoomConfig) != null) {
                        String str3 = enterRoomConfig.mRoomsData.shareSource;
                        if (str3 == null) {
                            str3 = "";
                        }
                        multiLiveInviteeShareHelper.LIZLLL = str3;
                        String str4 = enterRoomConfig.mLogData.sharedPlatform;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        multiLiveInviteeShareHelper.LJFF = str2;
                        multiLiveInviteeShareHelper.LJI = str2;
                        StringBuilder LIZ10 = X1D.LIZ();
                        LIZ10.append(multiLiveInviteeShareHelper.LIZLLL);
                        LIZ10.append(' ');
                        LIZ10.append(multiLiveInviteeShareHelper.LJFF);
                        C0NB.LIZIZ("MultiLiveInviteeShareHelper", X1D.LIZIZ(LIZ10));
                        C65814PsI.LIZ().getClass();
                        MultiLiveApi multiLiveApi = (MultiLiveApi) C65814PsI.LIZJ(MultiLiveApi.class);
                        long id = multiLiveInviteeShareHelper.LIZIZ.getId();
                        if (o.LJ(multiLiveInviteeShareHelper.LIZLLL, "deeplink_share_source")) {
                            i = 2;
                        } else if (o.LJ(multiLiveInviteeShareHelper.LIZLLL, "private_message_share_source")) {
                            i = 1;
                        }
                        ((InterfaceC29856Bng) C1EW.LIZ(multiLiveApi.getSharedInviteePanelState(id, i, C78886Uxe.LJJJLL(C8E.LJ()))).LIZJ(C73933Szx.LJ(multiLiveInviteeShareHelper.LIZJ))).LIZJ(new AfS65S0100000_13(multiLiveInviteeShareHelper, 188), new InterfaceC64592gB() { // from class: X.2vQ
                            @Override // X.InterfaceC64592gB
                            public final void accept(Object obj) {
                                StringBuilder LIZ11 = X1D.LIZ();
                                LIZ11.append("get shared panel error ");
                                LIZ11.append(obj);
                                C0NB.LIZIZ("MultiLiveInviteeShareHelper", X1D.LIZIZ(LIZ11));
                            }
                        });
                    }
                }
            }
        }
        initFpsDebugTextView();
        loadLiveShowAudienceWidget();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        TYQ.LIZJ("LinkIn_Guest_Widget_onDestroy");
        unLoadMultiGuestV3GuestModeratorsWidget();
        TXJ txj = this.moderatorPermissionChangeListener;
        if (txj != null) {
            C74789TWv.LIZJ.remove(txj);
        }
        U35 LIZ = TQA.LIZ();
        if (LIZ != null && LIZ.LJII() == 2) {
            C76548U2m.LJIILJJIL();
        }
        MultiGuestDataHolder mMultiGuestDataHolder = getMMultiGuestDataHolder();
        if (mMultiGuestDataHolder != null) {
            mMultiGuestDataHolder.LJJJJI = null;
        }
        getMMultiGuestsToolbar().LJ();
        checkIfReportWatchLive();
        C74838TYs.LJ().LIZIZ(Boolean.FALSE);
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null) {
            multiGuestV3GuestPresenter.detachView();
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog2 != null && multiLiveGuestUserInfoDialog2.isShowing() && (multiLiveGuestUserInfoDialog = this.interactApplyDialog) != null) {
            multiLiveGuestUserInfoDialog.dismiss();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        dismissKickOutDialog();
        this.multiGuestContent.LIZIZ();
        MultiGuestFeedbackController.LJIIJ.getClass();
        TQ4 LIZ2 = TQS.LIZ();
        if (LIZ2 != null) {
            LIZ2.LJFF();
        }
        MultiGuestDialogManager LIZ3 = TS1.LIZ();
        if (LIZ3 != null) {
            LIZ3.iv0(TS4.LJLIL);
        }
        C0WU liveMultiGuestStickerLogManager = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveMultiGuestStickerLogManager();
        if (liveMultiGuestStickerLogManager != null) {
            liveMultiGuestStickerLogManager.release();
        }
        this.animationManager = null;
        synchronized (U16.LIZ) {
            U16.LIZIZ.clear();
        }
        FrameLayout frameLayout = this.mAnchorContainer;
        if (frameLayout != null) {
            MultiGuestThemeViewModel multiGuestThemeViewModel = this.themeViewModel;
            if (multiGuestThemeViewModel != null) {
                multiGuestThemeViewModel.hv0(UC0.LJJIJL(frameLayout));
            }
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = this.sharedBgGuestViewModel;
            if (multiGuestSharedBgGuestViewModel != null) {
                UC0.LJJIJL(frameLayout);
                C74987Tbr.LIZ("guest_shared_bg", "onDestroy");
                multiGuestSharedBgGuestViewModel.onCleared();
                C8E.LJ().zF(multiGuestSharedBgGuestViewModel.LJLJI);
            }
            if (UC0.LJIIL(UC0.LJJIJL(frameLayout), IThemeAbility.class, null) != null) {
                UC0.LJJLIIIJILLIZJL(frameLayout, IThemeAbility.class);
            }
            if (UC0.LJIIL(UC0.LJJIJL(frameLayout), ISharedBgAbility.class, null) != null) {
                UC0.LJJLIIIJILLIZJL(frameLayout, ISharedBgAbility.class);
            }
        }
        super.onDestroy();
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            this.interactApplyDialog = null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void onInteractFailed() {
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null) {
            TQM.exitInteractInNormalWay$default(multiGuestV3GuestPresenter, "rtc_error", false, 10032, 2, null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.LinkMicGuestWidget, com.bytedance.android.widget.Widget
    public void onPause() {
        WeakHandler weakHandler;
        C32014ChO.LIZJ(logTAG(486), "onPause", null);
        if (!LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
            C32014ChO.LIZJ(logTAG(489), "onPause->onEnterBackground", null);
            MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
            if (multiGuestV3GuestPresenter != null) {
                multiGuestV3GuestPresenter.onEnterBackground();
            }
            C74751TVj.LJIIIIZZ(isInPipMode(), null);
        }
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter2 = this.mPresenter;
        if (multiGuestV3GuestPresenter2 != null && multiGuestV3GuestPresenter2.isEngineOn() && (weakHandler = this.mHandler) != null) {
            weakHandler.sendEmptyMessageDelayed(140000, getTimeOutInterval() * 1000);
        }
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public void onStop() {
        C32014ChO.LIZJ(logTAG(503), "onStop", null);
        if (LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
            C32014ChO.LIZJ(logTAG(505), "onStop->onEnterBackground", null);
            MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
            if (multiGuestV3GuestPresenter != null) {
                multiGuestV3GuestPresenter.onEnterBackground();
            }
        }
        super.onStop();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void showKickOutDialog() {
        LiveDialog liveDialog;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && o.LJ(dataChannel.kv0(PIPStatusData.class), Boolean.TRUE)) {
            return;
        }
        if (this.mKickOutDialog == null) {
            C47071t1 c47071t1 = new C47071t1(this.context);
            c47071t1.LJFF(R.string.n_d);
            c47071t1.LJIIL(R.string.njj, new IDcS172S0100000_13(this, 4));
            LiveDialog LIZ = c47071t1.LIZ();
            this.mKickOutDialog = LIZ;
            LIZ.setCanceledOnTouchOutside(false);
        }
        LiveDialog liveDialog2 = this.mKickOutDialog;
        if (liveDialog2 != null && (liveDialog = (LiveDialog) C78866UxK.LJIJI(liveDialog2, 6, false, false, false, 122)) != null) {
            com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_live_design_app_LiveDialog_show(liveDialog);
        }
        dismissPreviewDialog();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void showLiveShowDialog() {
        LiveShowGuestWidget liveShowGuestWidget = this.liveShowGuestWidget;
        if (liveShowGuestWidget != null) {
            liveShowGuestWidget.LLFZ("guest_icon");
        }
    }

    private final long getGiftScoreThreshold() {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiGuestDataHolder mMultiGuestDataHolder = getMMultiGuestDataHolder();
        if (mMultiGuestDataHolder != null && (multiLiveAnchorPanelSettings = mMultiGuestDataHolder.LJIIJ) != null) {
            return multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) != null) {
            return multiLiveUserApplyPermission.applierSortGiftScoreThreshold;
        }
        return 0L;
    }

    private final void initFpsDebugTextView() {
        ViewGroup viewGroup;
        C47121t6 c47121t6;
        if (MultiGuestBeautyDebug2Setting.getValue()) {
            C47121t6 c47121t62 = new C47121t6(this.context, null);
            this.debugFpsTextView = c47121t62;
            c47121t62.setGravity(16);
            C47121t6 c47121t63 = this.debugFpsTextView;
            if (c47121t63 != null) {
                c47121t63.setMaxLines(10);
            }
            C018905p c018905p = new C018905p(C15380j0.LIZ(500.0f), -2);
            c018905p.topToTop = 0;
            c018905p.bottomToBottom = 0;
            c018905p.startToStart = 0;
            if (Build.VERSION.SDK_INT >= 23 && (c47121t6 = this.debugFpsTextView) != null) {
                c47121t6.setBackgroundColor(this.context.getColor(R.color.a07));
            }
            C47121t6 c47121t64 = this.debugFpsTextView;
            if (c47121t64 != null) {
                c47121t64.setLayoutParams(c018905p);
            }
            C47121t6 c47121t65 = this.debugFpsTextView;
            if (c47121t65 != null) {
                c47121t65.setTextColor(-1);
            }
            ViewParent parent = this.mAnchorContainer.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.addView(this.debugFpsTextView);
            }
            C47121t6 c47121t66 = this.debugFpsTextView;
            if (c47121t66 != null) {
                C29306Beo.LJI(c47121t66);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void dismissApplyDialogIfNeed() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        if (isApplyDialogShowing() && this.mGuestJoinType == TXF.GO_LIVE && (multiLiveGuestUserInfoDialog = this.interactApplyDialog) != null) {
            multiLiveGuestUserInfoDialog.dismiss();
        }
    }

    public final boolean isMatchGifterThreshold() {
        if (getSelfGift2AnchorScore() >= getGiftScoreThreshold()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDetachWidget() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        super.onDetachWidget();
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null) {
            multiGuestV3GuestPresenter.onDetachWidget();
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog2 != null && multiLiveGuestUserInfoDialog2.isShowing() && (multiLiveGuestUserInfoDialog = this.interactApplyDialog) != null) {
            multiLiveGuestUserInfoDialog.dismiss();
        }
        this.interactApplyDialog = null;
    }

    public final void onGuestApplyRequestSuccess() {
        if (TUZ.LIZIZ() && !isMatchGifterThreshold() && this.mGuestJoinType == TXF.SEND_REQUEST) {
            showGifterThresholdDialog();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.LinkMicGuestWidget, com.bytedance.android.widget.Widget
    public void onResume() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        super.onResume();
        C32014ChO.LIZJ(logTAG(447), "onResume", null);
        if (this.isLeaveWhenEnterBg) {
            this.isLeaveWhenEnterBg = false;
            C30868C9o.LJI(C15380j0.LJIILL(R.string.lt8, Integer.valueOf(getTimeOutInterval() / 60)));
        }
        WeakHandler weakHandler = this.mHandler;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null) {
            multiGuestV3GuestPresenter.onEnterForeground();
        }
        if (!LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
            C32014ChO.LIZJ(logTAG(461), "onResume, fixSetting: false", null);
            ((InterfaceC29856Bng) AbstractC73672Svk.LJJLIIIJLJLI(1L, TimeUnit.SECONDS).LJII(new C62705OjF()).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZJ(new AfS65S0100000_13(this, 41), new AfS57S0100000_5(this, 28));
            C74751TVj.LJIIIZ(isInPipMode());
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog2 != null && multiLiveGuestUserInfoDialog2.isShowing() && (multiLiveGuestUserInfoDialog = this.interactApplyDialog) != null) {
            multiLiveGuestUserInfoDialog.onResume();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.LinkMicGuestWidget, X.InterfaceC75487Tjv
    public void unLoadPlayModeWidget() {
        U35 LIZ = TQA.LIZ();
        if (LIZ != null && LIZ.LJII() == 2) {
            C76548U2m.LJIILJJIL();
        }
        if (C76548U2m.LIZLLL) {
            C76548U2m.LJIIL();
        }
        unLoadLiveShowAudienceWidget();
        unLoadLiveShowGuestWidget();
    }

    public boolean getClickLinkHostFromInteractionDialog() {
        return this.clickLinkHostFromInteractionDialog;
    }

    public final MultiGuestSharedBgGuestViewModel getSharedBgGuestViewModel() {
        return this.sharedBgGuestViewModel;
    }

    public final MultiGuestThemeViewModel getThemeViewModel() {
        return this.themeViewModel;
    }

    public MultiGuestV3GuestWidget(FrameLayout mAnchorContainer) {
        o.LJIIIZ(mAnchorContainer, "mAnchorContainer");
        this.mAnchorContainer = mAnchorContainer;
        this.seiFormatErrInterval = LinkMicSeiFormatErrIntervalSetting.INSTANCE.getValue();
        this.mInteractStateChange = new AqS179S0100000_13(this, 126);
        this.mGuestJoinType = TXF.SEND_REQUEST;
        this.mDeepLinkEnterMultiLiveRoomHandler$delegate = new C31657Cbd("DATA_MULTI_LIVE_DEEP_LINK_ENTER_ROOM");
        this.mMultiGuestDataHolder$delegate = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
        this.zoomService$delegate = new C31657Cbd("ZOOM_SERVICE");
        this.mInterceptorArray$delegate = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 33));
        C75042Tck c75042Tck = new C75042Tck();
        C74650TRm.LIZ = false;
        this.multiGuestContent = c75042Tck;
        this.mMultiGuestsToolbar$delegate = C221108m2.LIZIZ(new AqS163S0100000_13(this, 78));
        this.moderatorPermissionChangeListener = new TXJ(this);
        this.seiHandler$delegate = C221108m2.LIZIZ(new AqS163S0100000_13(this, 77));
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
            C32014ChO.LIZJ(logTAG(861), e.toString(), null);
            return str;
        }
    }

    private final boolean checkPreviewDialogIfShowWhenAnchorPermit(C74749TVh c74749TVh) {
        LiveBaseFragment liveBaseFragment;
        LiveBaseFragment liveBaseFragment2;
        LiveBaseFragment liveBaseFragment3;
        LiveBaseFragment liveBaseFragment4;
        MultiGuestPreviewFragment multiGuestPreviewFragment;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog != null && multiLiveGuestUserInfoDialog.isShowing()) {
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
            LiveBaseFragment liveBaseFragment5 = null;
            if (multiLiveGuestUserInfoDialog2 != null) {
                liveBaseFragment = multiLiveGuestUserInfoDialog2.LJLJJLL;
            } else {
                liveBaseFragment = null;
            }
            if (liveBaseFragment instanceof MultiGuestUserInfoFragment) {
                if (multiLiveGuestUserInfoDialog2 != null) {
                    multiLiveGuestUserInfoDialog2.dismiss();
                }
            } else {
                if (multiLiveGuestUserInfoDialog2 != null) {
                    liveBaseFragment2 = multiLiveGuestUserInfoDialog2.LJLJJLL;
                } else {
                    liveBaseFragment2 = null;
                }
                if (liveBaseFragment2 instanceof MultiGuestPreviewFragment) {
                    if (multiLiveGuestUserInfoDialog2 != null) {
                        liveBaseFragment3 = multiLiveGuestUserInfoDialog2.LJLJJLL;
                    } else {
                        liveBaseFragment3 = null;
                    }
                    o.LJII(liveBaseFragment3, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment");
                    if (liveBaseFragment3.isViewValid()) {
                        TXF txf = TXF.GO_LIVE;
                        this.mGuestJoinType = txf;
                        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog3 = this.interactApplyDialog;
                        if (multiLiveGuestUserInfoDialog3 != null) {
                            TWR twr = this.guestApplyInfo;
                            multiLiveGuestUserInfoDialog3.LJLJJI = txf;
                            multiLiveGuestUserInfoDialog3.LJLJJL = twr;
                            if (c74749TVh != null) {
                                multiLiveGuestUserInfoDialog3.LJLJL = c74749TVh;
                            }
                        }
                        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
                            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog4 = this.interactApplyDialog;
                            if (multiLiveGuestUserInfoDialog4 != null) {
                                liveBaseFragment4 = multiLiveGuestUserInfoDialog4.LJLJJLL;
                            } else {
                                liveBaseFragment4 = null;
                            }
                            if ((liveBaseFragment4 instanceof MultiGuestPreviewFragment) && (multiGuestPreviewFragment = (MultiGuestPreviewFragment) liveBaseFragment4) != null) {
                                multiGuestPreviewFragment.LLJJJJJIL = c74749TVh;
                            }
                        }
                        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog5 = this.interactApplyDialog;
                        if (multiLiveGuestUserInfoDialog5 != null) {
                            liveBaseFragment5 = multiLiveGuestUserInfoDialog5.LJLJJLL;
                        }
                        o.LJII(liveBaseFragment5, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment");
                        ((MultiGuestPreviewFragment) liveBaseFragment5).Xl();
                        return true;
                    }
                }
                MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog6 = this.interactApplyDialog;
                if (multiLiveGuestUserInfoDialog6 != null) {
                    multiLiveGuestUserInfoDialog6.dismiss();
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

    private final boolean needSecondConfirm(C28268B7o c28268B7o) {
        Integer valueOf;
        if (c28268B7o != null && (valueOf = Integer.valueOf(c28268B7o.LIZIZ)) != null) {
            if (valueOf.intValue() == 49) {
                return false;
            }
            if (valueOf.intValue() == 50) {
                return MultiGuestApplyingSlideAndBarIconSetting.INSTANCE.needSecondConfirmWhenSlide();
            }
        }
        return MultiGuestApplyingLeaveAlertSetting.INSTANCE.needSecondConfirm();
    }

    private final void onInteractIconClickForApply(boolean z) {
        DeepLinkEnterMultiLiveRoomDataHandler LIZ = C74752TVk.LIZ();
        if (LIZ != null) {
            LIZ.LIZJ();
        }
        for (TXE txe : getMInterceptorArray()) {
            if (txe.LJIIIZ()) {
                return;
            }
        }
        if (z) {
            this.guestApplyInfo = null;
        }
        if (LinkMicSdkGeckoDslDownloadSetting.getValue() && !checkIfCurrentLayoutIdExists()) {
            return;
        }
        checkLinkMicJoinPermission();
    }

    private final void setVisibleEvent(InterfaceC88472Yns<? super DialogInterface.OnDismissListener, C76800UCe> interfaceC88472Yns) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(MultiGuestVisibleChannel.class, Boolean.TRUE);
        }
        interfaceC88472Yns.invoke(new IDDListenerS145S0100000_5(this, 2));
    }

    private final void showAppealDialog(int i) {
        Room room;
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
        c47071t1.LJIIIZ(R.string.nol, new TXT(i));
        c47071t1.LJIIL(R.string.spm, new TXS(i, this));
        com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_live_design_app_LiveDialog_show(c47071t1.LIZ());
        C75017TcL.LJIJI(i);
    }

    private final void showDobEditDialog(int i) {
        Activity LJIILJJIL = g0.LJIILJJIL(this.context);
        if (LJIILJJIL == null) {
            return;
        }
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).showGuideBirthdayEditDialog(LJIILJJIL, "live_co_host", C75017TcL.LIZJ(i), new C29238Bdi(i, this));
        C75017TcL.LJJ(i);
    }

    private final void showPermissionOffDialog(String str) {
        C47071t1 c47071t1 = new C47071t1(this.context);
        c47071t1.LJIILL = true;
        c47071t1.LJIILJJIL = false;
        c47071t1.LJII(str);
        c47071t1.LJIIL(R.string.njj, C74794TXa.LJLIL);
        com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_live_design_app_LiveDialog_show(c47071t1.LIZ());
    }

    public void callOnAudioStateChanged(int i) {
        FrameLayout frameLayout = this.mAnchorContainer;
        if (frameLayout != null) {
            UC1.LJLJJL.getClass();
            InterfaceC55235Lm3 LIZ = C44846His.LIZ(frameLayout);
            C2K0 c2k0 = null;
            if (LIZ != null) {
                c2k0 = UC0.LJIIL(LIZ, ILinkStateAbility.class, null);
            }
            ILinkStateAbility iLinkStateAbility = (ILinkStateAbility) c2k0;
            if (iLinkStateAbility != null) {
                iLinkStateAbility.Ga(i);
            }
        }
    }

    public final void doOnSei(C28272B7s c28272B7s) {
        InterfaceC28296B8q interfaceC28296B8q;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sei= ");
        LIZ.append(c28272B7s);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestV3GuestWidget", LIZIZ);
        C74838TYs.LJ().LJIIJ = c28272B7s;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && R6.LJJZZI() != null) {
            U8H.LJJJJIZL();
        }
        if (!MultiGuestSeiFormatErrEndLayoutSetting.INSTANCE.isEnable()) {
            C28733BPl.LJIILIIL().getClass();
            C0NE.LIZ("MultiGuestV3GuestWidget", "MultiGuestSeiFormatErrEndLayoutSetting false");
            InterfaceC74805TXl C4 = C8E.LJ().C4();
            if (C4 != null) {
                C4.LJFF(c28272B7s, new AqS144S0200000_13(this, c28272B7s, 2));
                return;
            }
            return;
        }
        C31811Ce7.LIZLLL("MultiGuestV3GuestWidget", "MultiGuestSeiFormatErrEndLayoutSetting true");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (interfaceC28296B8q = (InterfaceC28296B8q) dataChannel.kv0(C28406BCw.class)) != null) {
            interfaceC28296B8q.LJ();
        }
        InterfaceC74805TXl C42 = C8E.LJ().C4();
        if (C42 == null) {
            return;
        }
        C42.LJI(c28272B7s, new AqS144S0200000_13(this, c28272B7s, 3), new AqS195S0100000_13(this, 5));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (isViewValid() && 140000 == msg.what) {
            this.isLeaveWhenEnterBg = true;
        }
    }

    public final String logTAG(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_MultiGuestV3GuestWidget_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_MultiGuestV3GuestWidget_", i, LIZ2);
    }

    public void logThrowable(Throwable th) {
        C0NB.LJIIJ(6, getLogTag(), th.getStackTrace());
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void onCheckPermissionFailed(TXK checkPermissionErrInfo) {
        o.LJIIIZ(checkPermissionErrInfo, "checkPermissionErrInfo");
        Throwable th = checkPermissionErrInfo.LIZ;
        if (!(th instanceof C29401Dk)) {
            BPP.LIZJ(this.context, th);
            return;
        }
        C29401Dk c29401Dk = (C29401Dk) th;
        switch (c29401Dk.getErrorCode()) {
            case 20048:
                Context context = getContext();
                o.LJIIIIZZ(context, "getContext()");
                BYM.LIZLLL(context, this.dataChannel);
                return;
            case 31002:
                handlePermissionDenied(c29401Dk);
                return;
            case 31011:
                BYM.LIZ(this, this.dataChannel);
                return;
            case 4003036:
                C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.moi));
                return;
            case 4003037:
                MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
                if (multiGuestV3GuestPresenter == null) {
                    return;
                }
                multiGuestV3GuestPresenter.showBanDialog(this.context, BYP.BAN_FOR_BROADCASTING);
                return;
            case 4003088:
                showDobEditDialog(0);
                return;
            case 4003089:
                showAppealDialog(0);
                return;
            default:
                BPP.LIZJ(this.context, th);
                return;
        }
    }

    @Override // X.InterfaceC75472Tjg
    public void onInteractIconClick(boolean z) {
        if (C78886Uxe.LJJJJZ(C8E.LJ()) == 5) {
            showDisconnectFirstWindow();
            return;
        }
        if (C74789TWv.LIZIZ()) {
            if (z) {
                this.guestApplyInfo = null;
            }
            C74983Tbn LIZ = C29556Biq.LIZ();
            TWR twr = this.guestApplyInfo;
            LIZ.getClass();
            if (C74983Tbn.LJIIL(twr)) {
                onInteractIconClickForApply(z);
                return;
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null) {
                return;
            }
            dataChannel.qv0(OpenMultiGuestModeratorsManageDialogEvent.class, new IPJ(EnumC46470ILq.TOOLBAR, 2, 0));
            return;
        }
        onInteractIconClickForApply(z);
    }

    public final void onInteractStateChange(TW6 tw6) {
        if (tw6.LIZ != 1) {
            return;
        }
        Object obj = tw6.LIZIZ;
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguestv3.main.link.apply.guest.InteractApplyDialogMt.ApplyDialogType");
        TXF txf = (TXF) obj;
        this.mGuestJoinType = txf;
        int i = TXH.LIZ[txf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            DeepLinkEnterMultiLiveRoomDataHandler LIZ = C74752TVk.LIZ();
            if (LIZ != null) {
                LIZ.LIZJ();
            }
            MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
            if (multiGuestV3GuestPresenter != null) {
                TQM.checkPermissionRealTime$liveinteract_impl_release$default(multiGuestV3GuestPresenter, 0, null, 2, null);
            }
            C0NB.LIZIZ("MultiGuestV3GuestWidget", "checkPermission triggered by click send guest request");
            return;
        }
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter2 = this.mPresenter;
        if (multiGuestV3GuestPresenter2 != null) {
            TQM.checkPermissionRealTime$liveinteract_impl_release$default(multiGuestV3GuestPresenter2, 1, null, 2, null);
        }
        C0NB.LIZIZ("MultiGuestV3GuestWidget", "checkPermission triggered by click accept");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void onJoinChannelFailed(Throwable e) {
        C276516r c276516r;
        Integer valueOf;
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter;
        o.LJIIIZ(e, "e");
        BPP.LIZJ(this.context, e);
        if ((e instanceof C29401Dk) && (c276516r = (C276516r) e) != null && (valueOf = Integer.valueOf(c276516r.getErrorCode())) != null && ((valueOf.intValue() == 10004 || valueOf.intValue() == 31007) && LinkmicSdkAbnormalConnectionOptSetting.INSTANCE.isOpt() && (multiGuestV3GuestPresenter = this.mPresenter) != null)) {
            multiGuestV3GuestPresenter.setLeaveAfterJoinChannelFail(false);
        }
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter2 = this.mPresenter;
        if (multiGuestV3GuestPresenter2 != null) {
            TQM.exitInteractInNormalWay$default(multiGuestV3GuestPresenter2, "join_channel_error", false, CommonOptionConstants.OPTION_SET_FILE_LOG_ENABLED, 2, null);
        }
    }

    public final void onModeratorPermissionChange(boolean z) {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onModeratorPermissionChange, hasModeratorPermission=");
        LIZ.append(z);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestV3GuestWidget", LIZIZ);
        if (z) {
            loadMultiGuestV3GuestModeratorsWidget();
        } else {
            unLoadMultiGuestV3GuestModeratorsWidget();
        }
        C74776TWi.LJIIIIZZ(this.dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void onPlayerListChange(List<? extends LinkPlayerInfo> players) {
        long j;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        o.LJIIIZ(players, "players");
        if (isViewValid() && (multiLiveGuestUserInfoDialog = this.interactApplyDialog) != null && multiLiveGuestUserInfoDialog.isShowing()) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.qv0(GuestLinkPlayerListChange.class, new C74804TXk(players, false));
                return;
            }
            return;
        }
        if (!isViewValid() || !this.isNeedAutoShowApplyDialog) {
            return;
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog2 != null && multiLiveGuestUserInfoDialog2.isShowing()) {
            return;
        }
        if (TUZ.LIZIZ() && !isMatchGifterThreshold()) {
            return;
        }
        for (LinkPlayerInfo linkPlayerInfo : players) {
            LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
            User user = linkPlayerInfo2.mUser;
            if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && linkPlayerInfo2.LIZ == 1) {
                if (linkPlayerInfo == null) {
                    return;
                }
                MultiGuestDataHolder mMultiGuestDataHolder = getMMultiGuestDataHolder();
                if (mMultiGuestDataHolder != null) {
                    j = mMultiGuestDataHolder.LJJIZ;
                } else {
                    j = 0;
                }
                showApplyDialog(false, null, null, j);
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 == null) {
                    return;
                }
                dataChannel2.qv0(GuestLinkPlayerListChange.class, new C74804TXk(players, true));
                return;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void onTalkVoiceUpdated(int i) {
        TXY txy = this.multiGuestContent;
        if (txy != null) {
            txy.E7();
        }
    }

    @Override // X.InterfaceC75472Tjg
    public void setClickLinkHostFromInteractionDialog(boolean z) {
        this.clickLinkHostFromInteractionDialog = z;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void setLiveShowContentForCharacterChange(ShowContent showContent) {
        this.liveShowContentForCharacterChange = showContent;
    }

    public final void setSharedBgGuestViewModel(MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel) {
        this.sharedBgGuestViewModel = multiGuestSharedBgGuestViewModel;
    }

    public final void setThemeViewModel(MultiGuestThemeViewModel multiGuestThemeViewModel) {
        this.themeViewModel = multiGuestThemeViewModel;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void setWidgetCallback(InterfaceC31781Cdd interfaceC31781Cdd) {
        super.setWidgetCallback(interfaceC31781Cdd);
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        c75559Tl5.LJI(new ZoomService(this.dataChannel), null);
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
            DataChannel dataChannel = this.dataChannel;
            C0NB.LIZIZ("LiveShowService", "LiveShowService create");
            LiveShowService.LIZJ = false;
            c75559Tl5.LJI(new LiveShowService(dataChannel), null);
        }
        c75559Tl5.LIZLLL(this);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void showPreviewDialogWhenAnchorOrModeratorPermit(C74749TVh c74749TVh) {
        Room room;
        int i;
        int i2;
        Integer num;
        TQ8 userManager;
        AbstractC74727TUl LIZ;
        if (checkPreviewDialogIfShowWhenAnchorPermit(c74749TVh)) {
            return;
        }
        this.mGuestJoinType = TXF.GO_LIVE;
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null) {
            room = multiGuestV3GuestPresenter.room;
        } else {
            room = null;
        }
        if (multiGuestV3GuestPresenter != null && (userManager = multiGuestV3GuestPresenter.getUserManager()) != null && (LIZ = userManager.LIZ()) != null) {
            i = C76917UGr.LJJIII(LIZ);
        } else {
            i = 0;
        }
        this.dialogPresenter = new C74814TXu(multiGuestV3GuestPresenter, room, false, null, i, this.dataChannel);
        TWR twr = this.guestApplyInfo;
        if (twr != null && (num = twr.LIZ) != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        TWR twr2 = new TWR(Integer.valueOf(i2), 1, 0, 0, 60);
        LiveSdkMultiGuestLeakOptSetting liveSdkMultiGuestLeakOptSetting = LiveSdkMultiGuestLeakOptSetting.INSTANCE;
        if (liveSdkMultiGuestLeakOptSetting.isEnable()) {
            if (this.interactApplyDialog == null) {
                DataChannel dataChannel = this.dataChannel;
                o.LJIIIIZZ(dataChannel, "dataChannel");
                MultiLiveGuestUserInfoDialog LIZ2 = TXL.LIZ(dataChannel, this.dialogPresenter, new WeakReference(this.mPresenter), this.mGuestJoinType, twr2, "permit", 0);
                this.interactApplyDialog = LIZ2;
                LIZ2.onDialogGoneListener = new TXR(this);
            }
        } else {
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            this.interactApplyDialog = TXL.LIZ(dataChannel2, this.dialogPresenter, new WeakReference(this.mPresenter), this.mGuestJoinType, twr2, "permit", 0);
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog != null) {
            C78866UxK.LJIJJ(multiLiveGuestUserInfoDialog, 2, false, false, null, 0, LiveCoverMinSizeSetting.DEFAULT);
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            if (liveSdkMultiGuestLeakOptSetting.isEnable()) {
                MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
                if (multiLiveGuestUserInfoDialog2 != null) {
                    C74814TXu c74814TXu = this.dialogPresenter;
                    TXF txf = this.mGuestJoinType;
                    TWR twr3 = this.guestApplyInfo;
                    multiLiveGuestUserInfoDialog2.LJLILLLLZI = c74814TXu;
                    multiLiveGuestUserInfoDialog2.LJLJJI = txf;
                    multiLiveGuestUserInfoDialog2.LJLJJL = twr3;
                    multiLiveGuestUserInfoDialog2.LJLL = "permit";
                    multiLiveGuestUserInfoDialog2.LJLJLLL = 0;
                }
            } else {
                MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog3 = this.interactApplyDialog;
                if (multiLiveGuestUserInfoDialog3 != null) {
                    TXF txf2 = this.mGuestJoinType;
                    TWR twr4 = this.guestApplyInfo;
                    multiLiveGuestUserInfoDialog3.LJLJJI = txf2;
                    multiLiveGuestUserInfoDialog3.LJLJJL = twr4;
                }
            }
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog4 = this.interactApplyDialog;
            if (multiLiveGuestUserInfoDialog4 != null) {
                if (c74749TVh != null) {
                    multiLiveGuestUserInfoDialog4.LJLJL = c74749TVh;
                }
                multiLiveGuestUserInfoDialog4.show(fragmentManager, "MultiLiveGuestUserInfoDialog");
            }
        }
    }

    public final void updateFpsDebugTextView(C34941Ys c34941Ys) {
        C47121t6 c47121t6 = this.debugFpsTextView;
        if (c47121t6 != null) {
            if (c34941Ys == null || c34941Ys.LJLIL <= 0.0f) {
                c47121t6.setText("");
                C29306Beo.LJI(c47121t6);
                return;
            }
            C29306Beo.LJJLJLI(c47121t6);
            this.fpsReportCount++;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FPS Update-");
            LIZ.append(this.fpsReportCount);
            LIZ.append("【LocalTest】:\n");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cameraInCaptureFps: ");
            LIZ2.append(c34941Ys.LJLIL);
            LIZ2.append(" \ncameraOutCaptureFps: ");
            LIZ2.append(c34941Ys.LJLILLLLZI);
            LIZ2.append(" \nrealRenderFps: ");
            LIZ2.append(c34941Ys.LJLJI);
            LIZ2.append(" \nencodeFps: ");
            LIZ2.append(c34941Ys.LJLJJI);
            LIZ2.append(" \nvideoTransportRealFps: ");
            LIZ2.append(c34941Ys.LJLJJL);
            LIZ2.append(" \n");
            LIZ.append(X1D.LIZIZ(LIZ2));
            c47121t6.setText(X1D.LIZIZ(LIZ));
        }
    }

    public final void updateWidgetVisibility(View view) {
        if (C74838TYs.LJ().LJIIIZ) {
            return;
        }
        if (view.getVisibility() != 0) {
            View view2 = getView();
            if (view2 == null) {
                return;
            }
            view2.setVisibility(0);
            return;
        }
        View view3 = getView();
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    private final void payOverNoPermission(List<? extends LinkPayPlan> list, String str) {
        long j;
        if (list == null || list.isEmpty()) {
            C30868C9o.LIZJ(R.string.srk);
            return;
        }
        MultiGuestDataHolder mMultiGuestDataHolder = getMMultiGuestDataHolder();
        if (mMultiGuestDataHolder != null) {
            j = mMultiGuestDataHolder.LJJIZ;
        } else {
            j = 0;
        }
        showApplyDialog(true, list, str, j);
    }

    private final void showNewGoLivePreviewDialog(@InterfaceC74795TXb int i, C74749TVh c74749TVh) {
        MultiGuestGoLivePreviewFragment multiGuestGoLivePreviewFragment;
        MultiGuestGoLivePreviewFragment multiGuestGoLivePreviewFragment2 = this.newGoLivePreviewDialog;
        if (multiGuestGoLivePreviewFragment2 != null && multiGuestGoLivePreviewFragment2.isShowing()) {
            InterfaceC74795TXb.LIZJ.getClass();
            if (C74796TXc.LIZ(i) && (multiGuestGoLivePreviewFragment = this.newGoLivePreviewDialog) != null && multiGuestGoLivePreviewFragment.LLIILZL == 1) {
                if (multiGuestGoLivePreviewFragment.LLIILZL == 1 && multiGuestGoLivePreviewFragment.isAdded()) {
                    multiGuestGoLivePreviewFragment.LLIILZL = i;
                    multiGuestGoLivePreviewFragment.LLILII = c74749TVh;
                    MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = multiGuestGoLivePreviewFragment.LLIILII;
                    if (multiGuestGoLivePreviewViewModel != null) {
                        multiGuestGoLivePreviewViewModel.LJLLILLLL = c74749TVh;
                        multiGuestGoLivePreviewViewModel.mv0().setValue(Integer.valueOf(i));
                    }
                    multiGuestGoLivePreviewFragment.fm();
                    multiGuestGoLivePreviewFragment.Zl();
                    C75422Tis Jl = multiGuestGoLivePreviewFragment.Jl();
                    ViewGroup viewGroup = multiGuestGoLivePreviewFragment.LLF;
                    View view = multiGuestGoLivePreviewFragment.LJZL;
                    Jl.getClass();
                    if (viewGroup != null && view != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setDuration(500L);
                        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(view, 34));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-50.0f, 0.0f);
                        ofFloat2.setInterpolator(new LinearInterpolator());
                        ofFloat2.setDuration(500L);
                        ofFloat2.addUpdateListener(new AUListenerS94S0100000_5(viewGroup, 33));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                    MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = multiGuestGoLivePreviewFragment.LLFFF;
                    if (multiGuestEffectSwitchFragment != null) {
                        multiGuestEffectSwitchFragment.LJLLJ = multiGuestGoLivePreviewFragment.Dl();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        MultiGuestGoLivePreviewFragment multiGuestGoLivePreviewFragment3 = new MultiGuestGoLivePreviewFragment();
        multiGuestGoLivePreviewFragment3.LLILII = c74749TVh;
        multiGuestGoLivePreviewFragment3.LLIILZL = i;
        this.newGoLivePreviewDialog = multiGuestGoLivePreviewFragment3;
        C78866UxK.LJIJJ(multiGuestGoLivePreviewFragment3, 3, true, true, null, 0, 240);
        MultiGuestGoLivePreviewFragment multiGuestGoLivePreviewFragment4 = this.newGoLivePreviewDialog;
        if (multiGuestGoLivePreviewFragment4 != null) {
            multiGuestGoLivePreviewFragment4.setOnDismissListener(new IDDListenerS152S0100000_13(this, 3));
        }
        MultiGuestGoLivePreviewFragment multiGuestGoLivePreviewFragment5 = this.newGoLivePreviewDialog;
        if (multiGuestGoLivePreviewFragment5 == null) {
            return;
        }
        multiGuestGoLivePreviewFragment5.show(fragmentManager, C16880lQ.LJLLJ(MultiGuestGoLivePreviewFragment.class));
    }

    public final void exitInteractNormal(Runnable runnable, boolean z) {
        int i;
        this.mInteractRoomCloseRunnable = runnable;
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null) {
            if (z) {
                i = 10005;
            } else {
                i = 10003;
            }
            TQM.exitInteractInNormalWay$default(multiGuestV3GuestPresenter, "live_end", false, i, 2, null);
        }
        C74751TVj.LJIIL("live_over");
        C74751TVj.LJIIJJI("live_over");
    }

    @Override // X.InterfaceC75472Tjg
    public void onMultiLivePermissionOff(boolean z, boolean z2) {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        if (!z && (multiLiveGuestUserInfoDialog = this.interactApplyDialog) != null && multiLiveGuestUserInfoDialog.isShowing()) {
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
            if (multiLiveGuestUserInfoDialog2 != null) {
                multiLiveGuestUserInfoDialog2.dismiss();
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

    @Override // com.bytedance.android.live.liveinteract.api.LinkMicGuestWidget, X.InterfaceC75472Tjg
    public void onSei(C28272B7s c28272B7s, DataChannel dataChannel) {
        InterfaceC28296B8q interfaceC28296B8q;
        super.onSei(c28272B7s, dataChannel);
        if (dataChannel != null && (interfaceC28296B8q = (InterfaceC28296B8q) dataChannel.kv0(C28406BCw.class)) != null) {
            interfaceC28296B8q.LJIIL();
        }
        this.dataChannel = dataChannel;
        getSeiHandler().onSei(c28272B7s);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void showBeautySettingDialog(long j, int i) {
        showApplyDialog(false, null, null, j);
    }

    public void showNewPreviewDialog(int i, C74749TVh c74749TVh) {
        showNewGoLivePreviewDialog(i, c74749TVh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.api.LinkMicGuestWidget, X.InterfaceC75472Tjg
    public boolean interceptCloseRoom(Runnable runnable, boolean z, boolean z2, C28268B7o c28268B7o) {
        Integer num;
        if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt() && MultiGuestAdaptMicRoomSwitchSetting.INSTANCE.isEnable()) {
            return false;
        }
        Integer num2 = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num2 == null || 1 != num2.intValue()) {
            Integer num3 = (Integer) C74740TUy.LIZLLL().LIZIZ;
            if (num3 == null || 2 != num3.intValue()) {
                return false;
            }
            if (z2) {
                C77437UaH c77437UaH = new C77437UaH(getContext());
                c77437UaH.LJI(R.string.n9m);
                c77437UaH.LIZIZ(R.string.n9l);
                c77437UaH.LJ(R.string.sz9, new IDCListenerS53S0200000_13(this, runnable, 0), false);
                c77437UaH.LIZJ(R.string.snz, TXW.LJLIL, false);
                DialogC77438UaI LIZ = c77437UaH.LIZ();
                setVisibleEvent(new TXQ(LIZ));
                com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_livesdk_dialog_LiveModalDialog_show(LIZ);
            } else {
                exitInteractNormal(runnable, true);
            }
        } else if (needSecondConfirm(c28268B7o)) {
            LiveDialog liveDialog = this.secondConfirmDialog;
            if (liveDialog == null || !liveDialog.isShowing()) {
                C47071t1 c47071t1 = new C47071t1(getContext());
                c47071t1.LJIILLIIL(R.string.lua);
                c47071t1.LJFF(R.string.lu_);
                c47071t1.LIZIZ = this;
                c47071t1.LJIIL(R.string.lu8, new IDcS17S0300000_13(c28268B7o, this, runnable, 0));
                c47071t1.LJIIIZ(R.string.lu9, new IDcS172S0100000_13(c28268B7o, 3));
                LiveDialog LIZ2 = c47071t1.LIZ();
                this.secondConfirmDialog = LIZ2;
                LIZ2.setCanceledOnTouchOutside(false);
                LiveDialog liveDialog2 = this.secondConfirmDialog;
                if (liveDialog2 != null) {
                    com_bytedance_android_live_liveinteract_multiguestv3_main_guest_MultiGuestV3GuestWidget_com_bytedance_android_live_design_app_LiveDialog_show(liveDialog2);
                }
                LiveDialog liveDialog3 = this.secondConfirmDialog;
                if (liveDialog3 != null) {
                    setVisibleEvent(new TXO(liveDialog3));
                }
                if (c28268B7o != null) {
                    num = Integer.valueOf(c28268B7o.LIZ);
                } else {
                    num = null;
                }
                C74824TYe.LJJJI(false, false, num);
            }
        } else {
            exitInteractNormal(runnable, false);
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void showApplyDialog(boolean z, List<? extends LinkPayPlan> list, String str, long j) {
        C74690TTa c74690TTa;
        TQG applyOptPresenter;
        this.isNeedAutoShowApplyDialog = false;
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        C74749TVh c74749TVh = null;
        if (multiGuestV3GuestPresenter != null && (applyOptPresenter = multiGuestV3GuestPresenter.getApplyOptPresenter()) != null) {
            c74690TTa = applyOptPresenter.LIZJ(j);
        } else {
            c74690TTa = null;
        }
        this.mGuestJoinType = TXF.SEND_REQUEST;
        if (c74690TTa != null) {
            c74749TVh = c74690TTa.LIZIZ;
        }
        showMultiGuestUserInfoDialog(z, list, str, c74690TTa, c74749TVh);
    }

    private final void showMultiGuestUserInfoDialog(boolean z, List<? extends LinkPayPlan> list, String str, C74690TTa c74690TTa, C74749TVh c74749TVh) {
        Room room;
        int i;
        TQ8 userManager;
        AbstractC74727TUl LIZ;
        C75023TcR.LIZLLL.LIZJ("key_showMultiGuestUserInfoDialog");
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
        if (multiGuestV3GuestPresenter != null) {
            room = multiGuestV3GuestPresenter.room;
        } else {
            room = null;
        }
        if (multiGuestV3GuestPresenter != null && (userManager = multiGuestV3GuestPresenter.getUserManager()) != null && (LIZ = userManager.LIZ()) != null) {
            i = C76917UGr.LJJIII(LIZ);
        } else {
            i = 0;
        }
        this.dialogPresenter = new C74814TXu(multiGuestV3GuestPresenter, room, z, list, i, this.dataChannel);
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = this.interactApplyDialog;
        if (multiLiveGuestUserInfoDialog != null && multiLiveGuestUserInfoDialog.isShowing()) {
            return;
        }
        buildDialog();
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.interactApplyDialog;
            if (multiLiveGuestUserInfoDialog2 != null) {
                TXF txf = this.mGuestJoinType;
                TWR twr = this.guestApplyInfo;
                multiLiveGuestUserInfoDialog2.LJLJJI = txf;
                multiLiveGuestUserInfoDialog2.LJLJJL = twr;
                if (c74690TTa != null) {
                    multiLiveGuestUserInfoDialog2.getClass();
                }
                if (c74749TVh != null) {
                    multiLiveGuestUserInfoDialog2.LJLJL = c74749TVh;
                }
            }
            TWR twr2 = this.guestApplyInfo;
            if (twr2 != null) {
                twr2.LJFF = false;
            }
            if (multiLiveGuestUserInfoDialog2 != null) {
                multiLiveGuestUserInfoDialog2.show(fragmentManager, "MultiLiveGuestUserInfoDialog");
            }
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog3 = this.interactApplyDialog;
            if (multiLiveGuestUserInfoDialog3 != null) {
                setVisibleEvent(new TXP(multiLiveGuestUserInfoDialog3));
            }
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog4 = this.interactApplyDialog;
            if (multiLiveGuestUserInfoDialog4 != null) {
                C78866UxK.LJIJJ(multiLiveGuestUserInfoDialog4, 2, false, false, null, 0, LiveCoverMinSizeSetting.DEFAULT);
            }
        }
    }

    public static /* synthetic */ void showNewGoLivePreviewDialog$default(MultiGuestV3GuestWidget multiGuestV3GuestWidget, int i, C74749TVh c74749TVh, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c74749TVh = null;
        }
        multiGuestV3GuestWidget.showNewGoLivePreviewDialog(i, c74749TVh);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public void tryToShowGoLivePreviewDialogWhenAccepted(boolean z, List<? extends LinkPayPlan> list, String str, long j, int i) {
        TQH beInvitedOptPresenter;
        if (i == 1) {
            MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.mPresenter;
            C74749TVh c74749TVh = null;
            Boolean bool = null;
            c74749TVh = null;
            if (multiGuestV3GuestPresenter != null && (beInvitedOptPresenter = multiGuestV3GuestPresenter.getBeInvitedOptPresenter()) != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    bool = (Boolean) dataChannel.kv0(MultiGuestReceiveInviteMeFromModeratorChannel.class);
                }
                c74749TVh = beInvitedOptPresenter.LJIJI(j, C29306Beo.LJJIFFI(bool));
            }
            if (isApplyDialogShowing()) {
                forceDismissApplyDialog();
            }
            if (c74749TVh instanceof C74749TVh) {
                this.mGuestJoinType = TXF.GO_LIVE;
                showMultiGuestUserInfoDialog$default(this, false, null, null, null, c74749TVh, 15, null);
            } else {
                this.mGuestJoinType = TXF.GO_LIVE;
                showMultiGuestUserInfoDialog$default(this, z, list, str, null, null, 24, null);
            }
        }
    }

    public static /* synthetic */ void showMultiGuestUserInfoDialog$default(MultiGuestV3GuestWidget multiGuestV3GuestWidget, boolean z, List list, String str, C74690TTa c74690TTa, C74749TVh c74749TVh, int i, Object obj) {
        String str2 = str;
        boolean z2 = z;
        C74690TTa c74690TTa2 = c74690TTa;
        List list2 = list;
        if ((i & 1) != 0) {
            z2 = false;
        }
        C74749TVh c74749TVh2 = null;
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            c74690TTa2 = null;
        }
        if ((i & 16) == 0) {
            c74749TVh2 = c74749TVh;
        }
        multiGuestV3GuestWidget.showMultiGuestUserInfoDialog(z2, list2, str2, c74690TTa2, c74749TVh2);
    }
}
