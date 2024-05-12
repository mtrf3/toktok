package com.bytedance.android.livesdk.function;

import X.B3P;
import X.B5E;
import X.B83;
import X.BCN;
import X.BCW;
import X.BJM;
import X.BPN;
import X.BZI;
import X.C00O;
import X.C00Q;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C17220ly;
import X.C17T;
import X.C28787BRn;
import X.C29044Baa;
import X.C29374Bfu;
import X.C29684Bku;
import X.C30079BrH;
import X.C30134BsA;
import X.C30868C9o;
import X.C31665Cbl;
import X.C32151Nz;
import X.C39661h4;
import X.C48459J0d;
import X.C73318Sq2;
import X.C73943T0h;
import X.C76128TuG;
import X.CCJ;
import X.CK6;
import X.CKB;
import X.CN1;
import X.EnumC30098Bra;
import X.InterfaceC30442Bx8;
import X.JBR;
import X.KL2;
import X.WM7;
import X.X1D;
import Y.ACListenerS21S0101000_2;
import Y.ACListenerS22S0101000_3;
import Y.ALAdapterS4S0100000_5;
import Y.AObjectS42S0101000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS17S0001000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.HourlyRankRewardVisibilityChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomNotifyEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveLandscapeWatchOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRedesignBlockNotifyMsgSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveGiftAnnouncementFrequencySetting;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessageExtra;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes6.dex */
public class LiveRoomNotifyWidget extends LiveRecyclableWidget {
    public static final /* synthetic */ int LLII = 0;
    public ImageView LJLIL;
    public TextView LJLILLLLZI;
    public LiveIconView LJLJI;
    public ImageView LJLJJI;
    public View LJLJJL;
    public int LJLJJLL;
    public C39661h4 LJLJL;
    public AnimatorSet LJLJLJ;
    public ObjectAnimator LJLJLLL;
    public boolean LJLLI;
    public RoomNotifyMessage LJLLJ;
    public final LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig LJLLL;
    public final boolean LJLLLL;
    public final boolean LJLLLLLL;
    public final int LJLZ;
    public final float LJZ;
    public final int LJZI;
    public final int LJZL;
    public boolean LL;
    public float LLD;
    public final ARunnableS41S0100000_5 LLF;
    public int LLFF;
    public final ARunnableS41S0100000_5 LLFFF;
    public float LLFII;
    public boolean LLFZ;
    public final Map<String, Queue<Long>> LLI;
    public long LLIFFJFJJ;
    public final C73318Sq2 LJLL = new C73318Sq2();
    public boolean LJLLILLLL = false;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dei;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        C15380j0.LIZ(12.0f);
        C15380j0.LIZ(14.0f);
    }

    public final void LJLZ() {
        C39661h4 c39661h4 = this.LJLJL;
        if (c39661h4 != null) {
            c39661h4.LIZLLL();
        }
        ObjectAnimator objectAnimator = this.LJLJLLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        AnimatorSet animatorSet = this.LJLJLJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void LJZI() {
        RoomNotifyMessage roomNotifyMessage;
        RoomNotifyMessage roomNotifyMessage2 = this.LJLLJ;
        if (roomNotifyMessage2 == null || this.dataChannel == null) {
            return;
        }
        String str = roomNotifyMessage2.schema;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        buildUpon.appendQueryParameter("gift_enter_from", "announcements");
        Uri build = buildUpon.build();
        if ("webcast_gift_dialog".equals(build.getHost())) {
            if (this.LJLLLL) {
                LJLZ();
                this.LJLJJL.removeCallbacks(this.LLFFF);
                this.LJLJJL.removeCallbacks(this.LLF);
                if (!this.LL && this.LJLLLL && this.LJLLLLLL && (roomNotifyMessage = this.LJLLJ) != null && TextUtils.equals(roomNotifyMessage.source, "gift_broadcast") && !LLF(this.LJLLJ).booleanValue()) {
                    InterfaceC30442Bx8.x2.LIZ(Float.valueOf(this.LLD));
                    if (InterfaceC30442Bx8.w2.LIZJ().intValue() >= this.LJLZ && this.LLD >= this.LJZ) {
                        RoomNotifyMessage roomNotifyMessage3 = this.LJLLJ;
                        try {
                            List<TextPiece> list = roomNotifyMessage3.baseMessage.displayText.pieces;
                            Long valueOf = Long.valueOf(roomNotifyMessage3.from_user_id);
                            Long valueOf2 = Long.valueOf(((TextPiece) ListProtector.get(list, 2)).userValue.user.getId());
                            Long valueOf3 = Long.valueOf(((TextPiece) ListProtector.get(list, 1)).giftValue.giftId);
                            Long valueOf4 = Long.valueOf(roomNotifyMessage3.baseMessage.roomId);
                            IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                            BZI LIZ = C28787BRn.LIZ("livesdk_annoucements_permanent_close");
                            LIZ.LJIIZILJ();
                            LIZ.LJIJJ(iInteractService.h00(), WM7.SCENE_SERVICE);
                            LIZ.LJIJJ("gift", "reason");
                            LIZ.LJIJJ(valueOf3, "gift_id");
                            LIZ.LJIJJ(valueOf2, "anchor_id");
                            LIZ.LJIJJ(valueOf, "user_id");
                            LIZ.LJIJJ(valueOf4, "room_id");
                            LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
                            LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("{\"show_limit_x\": ");
                            LIZ2.append(this.LJLZ);
                            LIZ2.append(" ; \"close_rate_limit_y\": ");
                            LIZ2.append(this.LJZ);
                            LIZ2.append("}");
                            LIZ.LJIJJ(X1D.LIZIZ(LIZ2), "strategy_settings");
                            LIZ.LJJIIJZLJL();
                        } catch (Exception unused) {
                        }
                        this.LL = true;
                    }
                }
                RoomNotifyMessage roomNotifyMessage4 = this.LJLLJ;
                try {
                    List<TextPiece> list2 = roomNotifyMessage4.baseMessage.displayText.pieces;
                    Long valueOf5 = Long.valueOf(roomNotifyMessage4.from_user_id);
                    Long valueOf6 = Long.valueOf(((TextPiece) ListProtector.get(list2, 2)).userValue.user.getId());
                    Long valueOf7 = Long.valueOf(((TextPiece) ListProtector.get(list2, 1)).giftValue.giftId);
                    Long valueOf8 = Long.valueOf(roomNotifyMessage4.baseMessage.roomId);
                    IInteractService iInteractService2 = (IInteractService) CN1.LIZ(IInteractService.class);
                    BZI LIZ3 = C28787BRn.LIZ("livesdk_announcements_close_button_click");
                    LIZ3.LJIIZILJ();
                    LIZ3.LJIJJ(iInteractService2.h00(), WM7.SCENE_SERVICE);
                    LIZ3.LJIJJ("gift", "reason");
                    LIZ3.LJIJJ(valueOf7, "gift_id");
                    LIZ3.LJIJJ(valueOf6, "anchor_id");
                    LIZ3.LJIJJ(valueOf5, "user_id");
                    LIZ3.LJIJJ(valueOf8, "room_id");
                    LIZ3.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
                    LIZ3.LJIJJ(BJM.LJFF(), "enter_from_merge");
                    LIZ3.LJJIIJZLJL();
                } catch (Exception unused2) {
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJJL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat, 250L);
                LIZLLL.playSequentially(ofFloat);
                LIZLLL.addListener(new ALAdapterS4S0100000_5(this, 58));
                if (isViewValid()) {
                    LIZLLL.start();
                    return;
                }
                return;
            }
            ((IGiftService) CN1.LIZ(IGiftService.class)).monitorBroadcastClicked(CastLongProtector.parseLong(UriProtector.getQueryParameter(build, "gift_id")));
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.context, build);
            return;
        }
        if ("webcast_room".equals(build.getHost())) {
            String queryParameter = UriProtector.getQueryParameter(build, "enter_method");
            String queryParameter2 = UriProtector.getQueryParameter(build, "room_id");
            if (TextUtils.equals(queryParameter2, String.valueOf(this.dataChannel.kv0(BCN.class)))) {
                return;
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && dataChannel.kv0(UserIsAnchorChannel.class) != null && ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue()) {
                C30868C9o.LIZJ(R.string.mgh);
                return;
            }
            RankTypeV2 LIZIZ = BPN.LIZIZ(queryParameter);
            if (LIZIZ != RankTypeV2.LJIILL) {
                String queryParameter3 = UriProtector.getQueryParameter(build, "anchor_id");
                try {
                    IRankService iRankService = (IRankService) CN1.LIZ(IRankService.class);
                    long parseLong = CastLongProtector.parseLong(queryParameter3);
                    long parseLong2 = CastLongProtector.parseLong(queryParameter2);
                    int i = LIZIZ.type;
                    int i2 = LIZIZ.rankPhase;
                    Fragment fragment = this.widgetCallback.getFragment();
                    provideDataChannel();
                    iRankService.QV(parseLong, parseLong2, i, i2, fragment, new C29684Bku(this, queryParameter, build, queryParameter3, LIZIZ, queryParameter2));
                    return;
                } catch (NumberFormatException e) {
                    C0NB.LJIIJ(6, "LiveRoomNotifyWidget", e.getStackTrace());
                    return;
                }
            }
            if (this.LJLLJ.notifyType == 101) {
                BZI LIZ4 = C28787BRn.LIZ("livesdk_subscription_gift_sub_receive_message");
                LIZ4.LJIIZILJ();
                LIZ4.LJIJJ(Long.valueOf(this.LJLLJ.to_anchor_id), "for_anchor_id");
                LIZ4.LJIJJ(Long.valueOf(this.LJLLJ.from_user_id), "from_user_id");
                LIZ4.LIZJ("click");
                LIZ4.LJJIIJZLJL();
            }
            String queryParameter4 = UriProtector.getQueryParameter(build, "enter_from_merge");
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = "sub_gift_message";
            }
            roomsData.enterMethod = queryParameter;
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            if (TextUtils.isEmpty(queryParameter4)) {
                queryParameter4 = "live_detail";
            }
            roomsData2.enterFromMerge = queryParameter4;
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            roomsData3.enterType = "click";
            roomsData3.openOnboardingPage = UriProtector.getQueryParameter(build, "open_sub_onboarding_page");
            C73943T0h.LIZ().LIZIZ(new B3P(CastLongProtector.parseLong(queryParameter2), enterRoomConfig));
            return;
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.context, build);
    }

    public final boolean LL() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && dataChannel.kv0(UserIsAnchorChannel.class) != null && ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue()) {
            return true;
        }
        return false;
    }

    public final void LLFFF() {
        boolean z = false;
        if (this.dataChannel != null && ScalableDowngradeSetting.disableGiftNotifyAnim()) {
            C30134BsA c30134BsA = (C30134BsA) this.dataChannel.kv0(LowDevicePerfScalableChannel.class);
            if (c30134BsA != null) {
                if (c30134BsA.LIZIZ.ordinal() <= EnumC30098Bra.LEVEL_SERIOUS.ordinal()) {
                    z = true;
                }
                this.LJLLILLLL = z;
                return;
            }
            this.LJLLILLLL = false;
            return;
        }
        this.LJLLILLLL = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(HourlyRankRewardVisibilityChangedChannel.class, Boolean.FALSE);
        }
        this.LJLJJL.setAlpha(1.0f);
        hide();
        LJLZ();
        this.LJLJL = null;
        this.LJLJLJ = null;
        this.LJLL.LIZLLL();
        this.LJLLJ = null;
        this.LLFII = -1.0f;
        this.LLFZ = false;
    }

    public LiveRoomNotifyWidget() {
        boolean z;
        LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig value = LiveGiftAnnouncementFrequencySetting.INSTANCE.getValue();
        this.LJLLL = value;
        this.LJLLLL = value.closeToggleEnabled;
        this.LJLLLLLL = value.frequencyControlEnabled;
        this.LJLZ = value.disableMinCount;
        this.LJZ = value.disableRatio;
        this.LJZI = value.frequencyCount;
        this.LJZL = value.frequencyDuration;
        C48459J0d<Float> c48459J0d = InterfaceC30442Bx8.x2;
        if (c48459J0d.LIZJ().floatValue() > value.disableRatio) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
        this.LLD = c48459J0d.LIZJ().floatValue();
        this.LLF = new ARunnableS41S0100000_5(this, 149);
        this.LLFF = 0;
        this.LLFFF = new ARunnableS41S0100000_5(this, 150);
        this.LLFII = -1.0f;
        this.LLFZ = false;
        this.LLI = new HashMap();
        this.LLIFFJFJJ = System.currentTimeMillis();
    }

    public final void LJZ() {
        Long l;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LLIFFJFJJ < LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            return;
        }
        try {
            for (Map.Entry entry : ((HashMap) this.LLI).entrySet()) {
                Queue queue = (Queue) entry.getValue();
                if (queue == null) {
                    ((HashMap) this.LLI).remove(entry.getKey());
                } else {
                    while (!queue.isEmpty() && (l = (Long) queue.peek()) != null && currentTimeMillis - l.longValue() > this.LJZL * 60000) {
                        queue.poll();
                    }
                    if (queue.isEmpty()) {
                        ((HashMap) this.LLI).remove(entry.getKey());
                    }
                }
            }
        } catch (Exception unused) {
        }
        this.LLIFFJFJJ = currentTimeMillis;
    }

    public static Boolean LLF(RoomNotifyMessage roomNotifyMessage) {
        boolean z;
        if (roomNotifyMessage == null) {
            return Boolean.FALSE;
        }
        try {
            List<TextPiece> list = roomNotifyMessage.baseMessage.displayText.pieces;
            if (list.size() < 3) {
                return Boolean.FALSE;
            }
            Long valueOf = Long.valueOf(roomNotifyMessage.from_user_id);
            Long valueOf2 = Long.valueOf(((TextPiece) ListProtector.get(list, 2)).userValue.user.getId());
            Long valueOf3 = Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            Long valueOf4 = Long.valueOf(roomNotifyMessage.baseMessage.roomId);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            Long l = 0L;
            if (room != null) {
                l = Long.valueOf(room.getId());
            }
            if (!valueOf3.equals(valueOf) && !valueOf3.equals(valueOf2) && !l.equals(valueOf4)) {
                z = false;
                return Boolean.valueOf(z);
            }
            z = true;
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03e4  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.widget.TextView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL(com.bytedance.android.livesdk.model.message.RoomNotifyMessage r18) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.LJZL(com.bytedance.android.livesdk.model.message.RoomNotifyMessage):void");
    }

    public final void LLFF(RoomNotifyMessage roomNotifyMessage) {
        String str;
        RoomNotifyMessageExtra.Background background;
        int i;
        CommonMessageData commonMessageData;
        Text text;
        if (!isViewValid() || roomNotifyMessage == null) {
            CKB.INSTANCE.onMessageFinish();
            return;
        }
        if (GameLiveLandscapeWatchOpt.INSTANCE.getValue() && !this.LJLLI && !LL() && InterfaceC30442Bx8.LLLI.LIZJ().booleanValue()) {
            CKB.INSTANCE.onMessageFinish();
            return;
        }
        this.LJLLJ = roomNotifyMessage;
        if (roomNotifyMessage.notifyType == 3 && (commonMessageData = roomNotifyMessage.baseMessage) != null && (text = commonMessageData.displayText) != null && !TextUtils.isEmpty(text.key) && Arrays.asList(LiveMatchRedesignBlockNotifyMsgSetting.INSTANCE.getValue()).contains(this.LJLLJ.baseMessage.displayText.key) && C76128TuG.LIZ(this.dataChannel, false, false)) {
            return;
        }
        RoomNotifyMessage roomNotifyMessage2 = this.LJLLJ;
        if (roomNotifyMessage2 != null && roomNotifyMessage2.notifyType == 101) {
            BZI LIZ = C28787BRn.LIZ("livesdk_subscription_gift_sub_receive_message");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(Long.valueOf(this.LJLLJ.to_anchor_id), "for_anchor_id");
            LIZ.LJIJJ(Long.valueOf(this.LJLLJ.from_user_id), "from_user_id");
            LIZ.LIZJ("show");
            LIZ.LJJIIJZLJL();
        }
        View findViewById = findViewById(R.id.awk);
        if (findViewById != null) {
            if (TextUtils.equals(roomNotifyMessage.source, "gift_broadcast")) {
                C16880lQ.LJIIJ(new ACListenerS22S0101000_3(0, this, 5), findViewById);
                C16880lQ.LJIIJ(null, this.LJLJJL);
            } else {
                C16880lQ.LJIIJ(null, findViewById);
                C16880lQ.LJIIJ(new ACListenerS21S0101000_2(0, this, 5), this.LJLJJL);
            }
        } else {
            C16880lQ.LJIIJ(new ACListenerS21S0101000_2(0, this, 6), this.LJLJJL);
        }
        show();
        View view = this.LJLJJL;
        if (view != null) {
            view.setAlpha(1.0f);
            View view2 = this.LJLJJL;
            if (CCJ.LIZ(this.context)) {
                i = -this.LJLJJLL;
            } else {
                i = this.LJLJJLL;
            }
            view2.setTranslationX(i);
        }
        RoomNotifyMessageExtra roomNotifyMessageExtra = roomNotifyMessage.extra;
        if (roomNotifyMessageExtra == null || (background = roomNotifyMessageExtra.background) == null || C32151Nz.LJJIIJZLJL(background.getUrls())) {
            LJZL(roomNotifyMessage);
        } else {
            this.LJLIL.setBackgroundResource(0);
            C17220ly.LIZIZ(this.LJLIL, String.valueOf(R.id.af5), roomNotifyMessage);
            C31665Cbl.LJIIIIZZ(this.LJLIL, roomNotifyMessage.extra.background, true, new CK6(this, roomNotifyMessage));
        }
        RoomNotifyMessage roomNotifyMessage3 = this.LJLLJ;
        if (roomNotifyMessage3 != null) {
            str = roomNotifyMessage3.schema;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "room_id");
        String queryParameter2 = UriProtector.getQueryParameter(UriProtector.parse(str), "enter_method");
        String queryParameter3 = UriProtector.getQueryParameter(UriProtector.parse(str), "anchor_id");
        if (BPN.LIZIZ(queryParameter2) == RankTypeV2.LJIILL) {
            return;
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_show");
        LIZ2.LJIILLIIL(this.dataChannel);
        LIZ2.LJIJJ("live_detail", "enter_from_merge");
        LIZ2.LJIJJ(queryParameter2, "enter_method");
        LIZ2.LJIJJ(queryParameter3, "anchor_id");
        LIZ2.LJIJJ(queryParameter, "room_id");
        LIZ2.LJIJJ("click", "action_type");
        LIZ2.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        LIZ2.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        LIZ2.LJJIIJZLJL();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object... objArr) {
        this.LJLIL = (ImageView) findViewById(R.id.af5);
        this.LJLILLLLZI = (TextView) findViewById(R.id.h60);
        this.LJLJI = (LiveIconView) findViewById(R.id.a8_);
        this.LJLJJL = findViewById(R.id.h66);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object... objArr) {
        this.LJLLI = ((Boolean) this.dataChannel.kv0(BCW.class)).booleanValue();
        this.LJLJJLL = KL2.LJIIJJI(this.context);
        C0NB.LIZIZ("AnnouncementFrequencyConfig", this.LJLLL.toString());
        if (LL()) {
            this.dataChannel.lv0(this, HideTitleLayoutEvent.class, new AObjectS42S0101000_5(5, this, 60));
        }
        this.dataChannel.lv0(this, RoomNotifyEvent.class, new AObjectS42S0101000_5(5, this, 61));
        if (this.LJLJL == null || this.LJLJLJ == null) {
            LLFFF();
            if (this.LJLLILLLL) {
                C39661h4 c39661h4 = new C39661h4(this.LJLJJL, C17T.LJIIL);
                this.LJLJL = c39661h4;
                c39661h4.LJI(12.0f);
                this.LJLJL.LJII(12.0f);
            } else if (CCJ.LIZ(this.context)) {
                C39661h4 c39661h42 = new C39661h4(this.LJLJJL, C17T.LJIIL);
                this.LJLJL = c39661h42;
                c39661h42.LJI(0.0f);
                C39661h4 c39661h43 = this.LJLJL;
                C00Q c00q = new C00Q();
                c00q.LIZ(0.81f);
                c00q.LIZIZ(80.0f);
                c00q.LJIIIIZZ = -12.0f;
                c39661h43.LJIL = c00q;
            } else {
                C39661h4 c39661h44 = new C39661h4(this.LJLJJL, C17T.LJIIL);
                this.LJLJL = c39661h44;
                c39661h44.LJI(0.0f);
                C39661h4 c39661h45 = this.LJLJL;
                C00Q c00q2 = new C00Q();
                c00q2.LIZ(0.81f);
                c00q2.LIZIZ(80.0f);
                c00q2.LJIIIIZZ = 12.0f;
                c39661h45.LJIL = c00q2;
            }
            this.LJLJL.LIZIZ(new C00O() { // from class: X.CK7
                @Override // X.C00O
                public final void LIZ() {
                    LiveRoomNotifyWidget liveRoomNotifyWidget = LiveRoomNotifyWidget.this;
                    if (!liveRoomNotifyWidget.isViewValid()) {
                        return;
                    }
                    liveRoomNotifyWidget.LJLJJL.removeCallbacks(liveRoomNotifyWidget.LLFFF);
                    liveRoomNotifyWidget.LJLJJL.removeCallbacks(liveRoomNotifyWidget.LLF);
                    if (liveRoomNotifyWidget.LJLILLLLZI.getLayout() != null) {
                        int lineWidth = ((int) liveRoomNotifyWidget.LJLILLLLZI.getLayout().getLineWidth(0)) - ((liveRoomNotifyWidget.LJLILLLLZI.getWidth() - liveRoomNotifyWidget.LJLILLLLZI.getPaddingLeft()) - liveRoomNotifyWidget.LJLILLLLZI.getPaddingRight());
                        liveRoomNotifyWidget.LLFF = lineWidth;
                        if (lineWidth > 0) {
                            liveRoomNotifyWidget.LJLJJL.postDelayed(liveRoomNotifyWidget.LLFFF, 1000L);
                            return;
                        }
                    } else {
                        liveRoomNotifyWidget.LLFF = 0;
                    }
                    liveRoomNotifyWidget.LJLJJL.postDelayed(liveRoomNotifyWidget.LLF, 2000L);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            this.LJLJLJ = animatorSet;
            animatorSet.addListener(new ALAdapterS4S0100000_5(this, 57));
        }
        this.LJLL.LIZ(C73943T0h.LIZ().LJ(B5E.class).LJJJJZI(new AfS17S0001000_5(1, 23)));
        this.dataChannel.lv0(this, ProgrammedLiveMenuVisibilityChannel.class, new AObjectS42S0101000_5(4, this, 31));
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof C30079BrH) {
                    Object obj2 = ((C30079BrH) obj).LIZ;
                    if (obj2 instanceof RoomNotifyMessage) {
                        LLFF((RoomNotifyMessage) obj2);
                    }
                }
            }
        }
    }
}
