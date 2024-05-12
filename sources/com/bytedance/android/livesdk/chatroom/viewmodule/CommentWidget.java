package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.ActivityC45651qj;
import X.B76;
import X.B83;
import X.BCC;
import X.BCE;
import X.BCW;
import X.BJB;
import X.BJM;
import X.BKY;
import X.BM1;
import X.BML;
import X.BNK;
import X.BNM;
import X.BPP;
import X.BPV;
import X.BUL;
import X.BY3;
import X.BZI;
import X.C04330Ez;
import X.C06510Nj;
import X.C0NB;
import X.C0NE;
import X.C113554cx;
import X.C15380j0;
import X.C16880lQ;
import X.C19U;
import X.C1DJ;
import X.C1EW;
import X.C1FC;
import X.C23010vJ;
import X.C259710f;
import X.C259910h;
import X.C276516r;
import X.C279117r;
import X.C28246B6s;
import X.C28417BDh;
import X.C28418BDi;
import X.C28594BKc;
import X.C28733BPl;
import X.C28787BRn;
import X.C28835BTj;
import X.C28853BUb;
import X.C28870BUs;
import X.C29044Baa;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29401Dk;
import X.C29682Bks;
import X.C29683Bkt;
import X.C29927Bop;
import X.C30114Brq;
import X.C30868C9o;
import X.C30926CBu;
import X.C31077CHp;
import X.C31079CHr;
import X.C31080CHs;
import X.C31083CHv;
import X.C31084CHw;
import X.C31086CHy;
import X.C31087CHz;
import X.C31097CIj;
import X.C31309CQn;
import X.C31811Ce7;
import X.C32537Cpp;
import X.C38354F3m;
import X.C40273FrJ;
import X.C47071t1;
import X.C47151t9;
import X.C48459J0d;
import X.C54832Df;
import X.C65124PhA;
import X.C6H;
import X.C6Z;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73421Srh;
import X.C73849Syb;
import X.C73943T0h;
import X.C73969T1h;
import X.C77437UaH;
import X.C78609UtB;
import X.C87277YNd;
import X.CI0;
import X.CI2;
import X.CI5;
import X.CIF;
import X.CIN;
import X.CIO;
import X.CIP;
import X.CIQ;
import X.CIR;
import X.CIU;
import X.CIV;
import X.CIW;
import X.CIZ;
import X.CN1;
import X.CX9;
import X.DialogC77438UaI;
import X.EnumC09680Zo;
import X.EnumC30204BtI;
import X.F9J;
import X.InterfaceC09660Zm;
import X.InterfaceC29856Bng;
import X.InterfaceC30442Bx8;
import X.InterfaceC31105CIr;
import X.J9A;
import X.JBR;
import X.Q7L;
import X.Q9H;
import X.Q9M;
import X.R6B;
import X.RunnableC09760Zw;
import X.RunnableC45421Hs9;
import X.X1D;
import Y.ACListenerS24S0101000_5;
import Y.ALAdapterS4S0100000_5;
import Y.ALAdapterS4S0200000_5;
import Y.AObjectS10S0001000_5;
import Y.AObjectS12S0001000_7;
import Y.AObjectS144S0100000_5;
import Y.AObjectS42S0101000_5;
import Y.AObjectS43S0101000_7;
import Y.AObjectS45S0101000_13;
import Y.ARunnableS10S0101000_6;
import Y.ARunnableS11S0201000_8;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.ARunnableS8S0201000_5;
import Y.AfS17S0001000_5;
import Y.AfS36S0101000_5;
import Y.AfS39S0101000_13;
import Y.IDAListenerS74S0100000_5;
import Y.IDCListenerS159S0100000_5;
import Y.IDCListenerS254S0100000_5;
import Y.IDCSpanS31S0100000_5;
import Y.IDDListenerS392S0100000_5;
import Y.IDcS170S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.CommentService;
import com.bytedance.android.live.CommentWidgetStyleChangeEvent;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.ShowKeyboardEvent;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.DutyGiftChangedEvent;
import com.bytedance.android.live.gift.GiftDialogHeightEvent;
import com.bytedance.android.live.gift.IHotWordGiftService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectsRoundsChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatEmojiListData;
import com.bytedance.android.livesdk.chatroom.model.EmoteChatResult;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.chatroom.model.ReplyInfo;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.utils.EmoteFixTextHelper;
import com.bytedance.android.livesdk.dataChannel.BanTalkEvent;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.android.livesdk.dataChannel.DismissInputDialogEvent;
import com.bytedance.android.livesdk.dataChannel.DoSendMessageChannelEvent;
import com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel;
import com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.dataChannel.HideInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.IsFromLandscapeData;
import com.bytedance.android.livesdk.dataChannel.IsFromPortraitData;
import com.bytedance.android.livesdk.dataChannel.OrientationChangedChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.QuestionCardChangeTextEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeSubOnlyChatChangeEvent;
import com.bytedance.android.livesdk.dataChannel.SubscribeSubOnlyOnBoardingOpen;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.comment.EnableShowToastCommentBannedSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveAddCommentDraftSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentDialogOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommunityGuidelineSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveEomjiConvenientSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveEnableNormalGiftAndBarrageSelfFirstlySetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubOnlyChatConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.ScreenMessage;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.dataChannel.EnterLiveSourceChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.AnimatableRoomRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;
import webcast.data.UserIdentity;

/* loaded from: classes6.dex */
public class CommentWidget extends AnimatableRoomRecyclableWidget implements CI5, InterfaceC09660Zm {
    public LinearLayout LJLIL;
    public View LJLILLLLZI;
    public LiveIconView LJLJI;
    public FrameLayout LJLJJI;
    public TextView LJLJJL;
    public CX9 LJLJJLL;
    public C47151t9 LJLJL;
    public TextView LJLJLJ;
    public View LJLJLLL;
    public ImageView LJLL;
    public TextView LJLLI;
    public AnimatorSet LJLLILLLL;
    public boolean LJLLJ;
    public Room LJLLL;
    public ActivityC45651qj LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public C31086CHy LJZL;
    public DialogC77438UaI LLD;
    public String LLI;
    public DialogC77438UaI LLIFFJFJJ;
    public LiveDialog LLII;
    public boolean LLIIII;
    public CI2 LLIIIILZ;
    public CI2 LLIIIJ;
    public CI2 LLIIIL;
    public long LLIIIZ;
    public DialogC77438UaI LLIIJI;
    public C87277YNd LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public long LLIIZ;
    public long LLIL;
    public boolean LLIZLLLIL;
    public C73411SrX LLJJIJI;
    public boolean LJZI = true;
    public final C73318Sq2 LL = new C73318Sq2();
    public boolean LLF = false;
    public boolean LLFF = false;
    public String LLFFF = "";
    public String LLFII = "";
    public String LLFZ = "";
    public boolean LLILII = false;
    public boolean LLILIL = false;
    public final C73849Syb<Boolean> LLILL = new C73849Syb<>();
    public LiveEmojiInputDialogFragment LLILLIZIL = null;
    public boolean LLILLJJLI = false;
    public InputAttrs LLILLL = new InputAttrs();
    public final ISubscribeService LLILZ = (ISubscribeService) CN1.LIZ(ISubscribeService.class);
    public final IHotWordGiftService LLILZIL = (IHotWordGiftService) CN1.LIZ(IHotWordGiftService.class);
    public ChatEmojiListData LLILZLL = null;
    public long LLIZ = 0;
    public final CIO LLJ = new CIO(this);
    public final CIU LLJI = new CIU(this);
    public ObjectAnimator LLJIJIL = null;
    public ObjectAnimator LLJILJIL = null;
    public AnimatorSet LLJILJILJ = null;
    public int LLJILLL = 0;
    public int LLJJ = 0;
    public IDCListenerS254S0100000_5 LLJJI = null;
    public IDCListenerS254S0100000_5 LLJJIII = null;
    public int LLJJIJIIJIL = 0;
    public int LLJJIJIL = 0;
    public int LLJJJ = 0;
    public float LLJJJIL = 76.0f;
    public final Handler LLJJJJ = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS15S0101000_11 LLJJJJJIL = new ARunnableS15S0101000_11(1, this, 9);
    public final CIW LLJJJJLIIL = new CIW(this);

    public final void LLF() {
        this.LLIIL = false;
        LLILZLL();
        LLFF();
        LJZI(C29232Bdc.LJIILL(this.LJLLL));
        Gq();
        LiveIconView liveIconView = this.LJLJI;
        if (liveIconView != null) {
            liveIconView.setAlpha(0.5f);
        }
    }

    public final void LLIILZL() {
        this.LLIIL = true;
        LLILZLL();
        LLFF();
        LJZI(C29232Bdc.LJIILL(this.LJLLL));
        if (LLIIIILZ() && !C29232Bdc.LJIILL(this.LJLLL)) {
            LiveIconView liveIconView = this.LJLJI;
            if (liveIconView != null) {
                liveIconView.setAlpha(0.5f);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LJLJI;
        if (liveIconView2 == null) {
            return;
        }
        liveIconView2.setAlpha(1.0f);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRoomRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.CI5
    public final void Gq() {
        AnimatorSet animatorSet = this.LLJILJILJ;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.LLJILJILJ.cancel();
            this.LJLJJL.setAlpha(1.0f);
            this.LJLJL.setVisibility(8);
            findViewById(R.id.kc7).setVisibility(8);
            this.LJLJI.setAlpha(1.0f);
        }
    }

    public final void LJLZ() {
        if (this.context == null || this.LJLJJL == null || this.LJLJJI == null) {
            return;
        }
        if (this.LJZ) {
            this.LJLJJLL.setBackgroundColor(C04330Ez.LIZIZ(getContext(), R.color.a0m));
            this.LJLJJLL.setStrokeWidth(0.0f);
            this.LJLJJL.setTextColor(C04330Ez.LIZIZ(getContext(), R.color.a0o));
            this.LJLLI.setTextColor(C04330Ez.LIZIZ(getContext(), R.color.a0s));
        } else {
            this.LJLJJLL.setBackgroundColor(C04330Ez.LIZIZ(getContext(), R.color.b2));
            this.LJLJJLL.setStrokeWidth(0.0f);
            this.LJLJJL.setTextColor(C04330Ez.LIZIZ(getContext(), R.color.a0o));
            this.LJLLI.setTextColor(C04330Ez.LIZIZ(getContext(), R.color.a0s));
        }
        if (!this.LLIILII) {
            return;
        }
        this.LJLJJLL.setBackgroundColor(C04330Ez.LIZIZ(this.context, R.color.a0n));
        this.LJLJJL.setShadowLayer(this.context.getResources().getDimension(R.dimen.aan), this.context.getResources().getDimension(R.dimen.aal), this.context.getResources().getDimension(R.dimen.aam), C04330Ez.LIZIZ(this.context, R.color.a0q));
        this.LJLJLJ.setShadowLayer(this.context.getResources().getDimension(R.dimen.aan), this.context.getResources().getDimension(R.dimen.aal), this.context.getResources().getDimension(R.dimen.aam), C04330Ez.LIZIZ(this.context, R.color.a0q));
    }

    public final void LJZL() {
        ReplyInfo replyInfo = this.LLILLL.replyInfo;
        replyInfo.replyToId = 0L;
        replyInfo.replyUserSecId = null;
        replyInfo.msgId = 0L;
        replyInfo.releaseId = 0L;
        this.LLI = null;
    }

    public final void LLFF() {
        this.LJLJLLL.setAlpha(1.0f);
        this.LJLJJLL.setAlpha(1.0f);
        boolean z = this.LJZI;
        this.LJZI = true;
        if (!LLIIIILZ()) {
            LLILL(8);
            this.LJLJJLL.setVisibility(0);
        } else {
            LLIIZ(z);
        }
    }

    public final boolean LLIIII() {
        if (this.LLIZLLLIL) {
            if (this.LLILLIZIL == null || !this.LLILLJJLI) {
                return false;
            }
            return true;
        }
        if (this.LLILLIZIL == null) {
            return false;
        }
        return true;
    }

    public final boolean LLIIIILZ() {
        Room room = this.LJLLL;
        if (room == null || this.dataChannel == null || !this.LLIIL || !C29232Bdc.LJIIJ(this.LJLLJ, room)) {
            return false;
        }
        return true;
    }

    public final void LLIL() {
        this.LJLLJ = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        this.LJLLL = room;
        if (room.getRoomAuthStatus() == null || this.LJLLL.getRoomAuthStatus().isEnableChat()) {
            LLIILZL();
            this.dataChannel.rv0(CommentOrMessageData.class, Boolean.TRUE);
        } else {
            LLF();
        }
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("ttlive_comment", "CommentWidget onLoad");
        LJLZ();
        this.LJZL.attachView(this);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.nv0(this, this, EmoteBitmapListChannel.class, new AObjectS10S0001000_5(0, 2));
        dataChannelGlobal.nv0(this, this, EmoteBaseInformationListChannel.class, new AObjectS12S0001000_7(0, 1));
    }

    public final void LLILZ() {
        if (!this.LLIIL || !C78609UtB.LJJJZ(this.LJLLJ)) {
            return;
        }
        if (LLIIIILZ()) {
            Gq();
            LLIIZ(true);
            return;
        }
        if (LiveSubOnlyChatConfig.INSTANCE.animationEnable()) {
            LLILL(0);
            this.LJLJJLL.setVisibility(0);
            AnimatorSet animatorSet = this.LJLLILLLL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LJLLILLLL = new AnimatorSet();
            if (C29232Bdc.LJIILL(this.LJLLL)) {
                this.LJLJLLL.setAlpha(0.0f);
                this.LJLJJLL.setAlpha(1.0f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJJLL, (Property<CX9, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(300L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLJLLL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.setStartDelay(300L);
                ofFloat2.setDuration(300L);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJLJLLL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat3.setInterpolator(new LinearInterpolator());
                ofFloat3.setStartDelay(600L);
                ofFloat3.setDuration(300L);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.LJLJJLL, (Property<CX9, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat4.setInterpolator(new LinearInterpolator());
                ofFloat4.setStartDelay(900L);
                ofFloat4.setDuration(300L);
                this.LJLLILLLL.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            } else {
                this.LJLJLLL.setAlpha(1.0f);
                this.LJLJJLL.setAlpha(0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.LJLJLLL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat5.setInterpolator(new LinearInterpolator());
                ofFloat5.setDuration(300L);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.LJLJJLL, (Property<CX9, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat6.setInterpolator(new LinearInterpolator());
                ofFloat6.setStartDelay(300L);
                ofFloat6.setDuration(300L);
                this.LJLLILLLL.playTogether(ofFloat5, ofFloat6);
            }
            this.LJLLILLLL.start();
            LLIILII("", false);
            return;
        }
        LLILL(8);
        this.LJLJJLL.setVisibility(0);
    }

    public final void LLILZIL() {
        if (this.LJLJLLL == null || this.LJLJJLL == null) {
            return;
        }
        if (!LLIIIILZ()) {
            LLILL(8);
            this.LJLJJLL.setVisibility(0);
            return;
        }
        if (LiveSubOnlyChatConfig.INSTANCE.animationEnable()) {
            LLILL(0);
            this.LJLJJLL.setVisibility(0);
            AnimatorSet animatorSet = this.LJLLILLLL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LJLLILLLL = new AnimatorSet();
            this.LJLJLLL.setAlpha(1.0f);
            this.LJLJJLL.setAlpha(0.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJLLL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(300L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLJJLL, (Property<CX9, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(300L);
            ofFloat2.setDuration(300L);
            this.LJLLILLLL.playTogether(ofFloat, ofFloat2);
            this.LJLLILLLL.start();
            LLIILII("subscribed_not_expired", true);
            return;
        }
        LLILL(8);
        this.LJLJJLL.setVisibility(0);
    }

    public final void LLILZLL() {
        Context context;
        String str;
        CharSequence charSequence;
        if (this.LJLLJ || (context = this.context) == null) {
            return;
        }
        if (!this.LLIIL) {
            str = context.getResources().getString(R.string.mfz);
        } else {
            InputAttrs inputAttrs = this.LLILLL;
            if (inputAttrs.isUserBanned) {
                str = context.getResources().getString(R.string.mg6);
            } else {
                if (inputAttrs.emoteFixTextHelperForText == null || !LiveAddCommentDraftSetting.INSTANCE.getValue()) {
                    str = null;
                } else {
                    EmoteFixTextHelper emoteFixTextHelper = this.LLILLL.emoteFixTextHelperForText;
                    if (emoteFixTextHelper.list.isEmpty()) {
                        str = "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int size = emoteFixTextHelper.list.size();
                        for (int i = 0; i < size; i++) {
                            Object obj = ListProtector.get(emoteFixTextHelper.list, i);
                            o.LJIIIIZZ(obj, "list[index]");
                            EmoteFixTextHelper.EmoteText emoteText = (EmoteFixTextHelper.EmoteText) obj;
                            if (emoteText.state == 0 && (charSequence = emoteText.text) != null) {
                                for (int i2 = 0; i2 < charSequence.length(); i2++) {
                                    char charAt = charSequence.charAt(i2);
                                    if (charAt == 0 || charAt == '\t' || charAt == '\n' || charAt == '\r' || (' ' <= charAt && (charAt < 55296 || (57344 <= charAt && (charAt < 65534 || (0 <= charAt && charAt < 0)))))) {
                                        sb.append(charAt);
                                    }
                                }
                            }
                        }
                        str = sb.toString();
                        o.LJIIIIZZ(str, "s.toString()");
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    if (this.LLF) {
                        str = this.context.getResources().getString(R.string.ksl);
                    } else if (this.LLIILZL) {
                        str = this.context.getResources().getString(R.string.ms3);
                    } else {
                        str = this.context.getResources().getString(R.string.mg6);
                    }
                }
            }
        }
        if (LiveCommentWidthOptSetting.INSTANCE.isStrategyFirst()) {
            int i3 = this.LLJJIJIIJIL;
            if (i3 == 1) {
                this.LJLJJL.setText(this.context.getResources().getString(R.string.t0l));
                return;
            } else {
                if (i3 != 2) {
                    return;
                }
                this.LJLJJL.setText(this.context.getResources().getString(R.string.mg6));
                return;
            }
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        this.LJLJJL.setText(str);
    }

    @Override // X.CI5
    public final boolean Wj0() {
        int value = LiveStarCommentGuidanceSetting.INSTANCE.getValue();
        if (!isViewValid() || this.LJLLJ || !this.LLIIL || LLIIIILZ() || value <= 0) {
            return false;
        }
        Gq();
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = new AnimatorSet();
            if (value == 1) {
                this.LJLJL.setStrokeGradientColors(null);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJJL, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLJL, (Property<C47151t9, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat2.setStartDelay(200L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJLJJL, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat3.setDuration(200L);
            ofFloat3.setStartDelay(3700L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.LJLJL, (Property<C47151t9, Float>) View.ALPHA, 1.0f, 0.0f);
            ofFloat4.setDuration(400L);
            ofFloat4.setStartDelay(3500L);
            ofFloat4.addListener(new ALAdapterS4S0100000_5(this, 22));
            View findViewById = findViewById(R.id.kc7);
            LiveIconView liveIconView = this.LJLJI;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(liveIconView, (Property<LiveIconView, Float>) View.ALPHA, liveIconView.getAlpha(), 0.0f);
            ofFloat5.setDuration(500L);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat6.setDuration(500L);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.SCALE_X, 0.0f, 1.0f);
            ofFloat7.setDuration(500L);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.SCALE_Y, 0.0f, 1.0f);
            ofFloat8.setDuration(500L);
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.LJLJI, (Property<LiveIconView, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat9.setDuration(500L);
            ofFloat9.setStartDelay(3500L);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            ofFloat10.setDuration(500L);
            ofFloat10.setStartDelay(3500L);
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.SCALE_X, 1.0f, 0.0f);
            ofFloat11.setDuration(500L);
            ofFloat11.setStartDelay(3500L);
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.0f);
            ofFloat12.setDuration(500L);
            ofFloat12.setStartDelay(3500L);
            ofFloat10.addListener(new ALAdapterS4S0100000_5(findViewById, 23));
            this.LLJILJILJ.addListener(new ALAdapterS4S0200000_5(this, findViewById, 4));
            this.LLJILJILJ.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11, ofFloat12);
        }
        this.LLJILJILJ.start();
        C31079CHr.LJ(this.dataChannel, "live_room");
        return true;
    }

    public final void LL() {
        if (LLIIII()) {
            this.LLILLIZIL.Vl("");
        } else {
            this.LLILLL.input = "";
        }
    }

    public final void LLFII() {
        if (LLIIII() && isViewValid()) {
            this.LLILLIZIL.vl();
            this.dataChannel.qv0(PreShowKeyboardEvent.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (ToolBarButtonWithTextExperiment.hasText()) {
            return R.layout.djr;
        }
        return R.layout.djs;
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C31811Ce7.LIZLLL("ttlive_comment", "CommentWidget onPause");
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C31811Ce7.LIZLLL("ttlive_comment", "CommentWidget onResume");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, O] */
    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        this.LLILZLL = null;
        C73411SrX c73411SrX = this.LLJJIJI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            this.LLJJIJI.dispose();
            this.LLJJIJI = null;
        }
        View view = getView();
        if (view != null) {
            IDCListenerS254S0100000_5 iDCListenerS254S0100000_5 = this.LLJJI;
            if (iDCListenerS254S0100000_5 != null) {
                view.removeOnLayoutChangeListener(iDCListenerS254S0100000_5);
            }
            IDCListenerS254S0100000_5 iDCListenerS254S0100000_52 = this.LLJJIII;
            if (iDCListenerS254S0100000_52 != null) {
                view.removeOnLayoutChangeListener(iDCListenerS254S0100000_52);
            }
        }
        this.LLIZ = 0L;
        this.LLJJJJ.removeCallbacks(this.LLJJJJJIL);
        this.LLJJJIL = 76.0f;
        this.LLJJIJIIJIL = 0;
        this.LLJJIJIL = 0;
        this.LLJJJ = 0;
        Parcel obtain = Parcel.obtain();
        this.LLILLL.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ((C32537Cpp) this.dataChannel.gv0(CIV.class)).LIZ = InputAttrs.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        this.LLF = false;
        this.LLIILZL = false;
        InputAttrs inputAttrs = this.LLILLL;
        inputAttrs.requestPage = null;
        inputAttrs.sender = null;
        EmoteFixTextHelper emoteFixTextHelper = inputAttrs.emoteFixTextHelperForText;
        if (emoteFixTextHelper != null && emoteFixTextHelper.isReceiveInput) {
            emoteFixTextHelper.list.clear();
        }
        ICommentService iCommentService = (ICommentService) CN1.LIZ(ICommentService.class);
        if (iCommentService instanceof CommentService) {
            ((CommentService) iCommentService).LJLIL.LJII(this.LJLLL.getId());
        }
        this.LL.LIZLLL();
        resetAnim();
        this.LJZL.detachView();
        LL();
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LLILLIZIL;
        if (liveEmojiInputDialogFragment != null && liveEmojiInputDialogFragment.isAdded()) {
            this.LLILLIZIL.dismissAllowingStateLoss();
            if (!this.LLIZLLLIL) {
                this.LLILLIZIL = null;
            }
        }
        this.LLILLJJLI = false;
        DialogC77438UaI dialogC77438UaI = this.LLIFFJFJJ;
        if (dialogC77438UaI != null) {
            dialogC77438UaI.dismiss();
            this.LLIFFJFJJ = null;
        }
        DialogC77438UaI dialogC77438UaI2 = this.LLIIJI;
        if (dialogC77438UaI2 != null) {
            dialogC77438UaI2.dismiss();
            this.LLIIJI = null;
        }
        this.LLIIIILZ = null;
        this.LLIIIJ = null;
        this.LLIIJLIL = null;
        this.LLIIIL = null;
        C31811Ce7.LIZLLL("ttlive_comment", "CommentWidget onUnload");
        AnimatorSet animatorSet = this.LJLLILLLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator = this.LLJIJIL;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.LLJIJIL.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LLJILJIL;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.LLJILJIL.cancel();
        }
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            linearLayout.setAlpha(1.0f);
            this.LJLIL.setVisibility(8);
        }
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null) {
            frameLayout.setAlpha(1.0f);
            this.LJLJJI.setVisibility(0);
        }
        Gq();
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C54832Df.class)).LIZ = "";
        if (!this.LJLLJ) {
            if (!this.LJZ && this.LLILL.LJJZZIII() != null && this.LLILL.LJJZZIII().booleanValue()) {
                return;
            }
            C31079CHr.LIZIZ(System.currentTimeMillis() - this.LLIIZ, this.dataChannel);
        }
    }

    @Override // X.CI5
    public final void Sk() {
        isViewValid();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRoomRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRoomRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        show();
    }

    @Override // X.CI5
    public final void AV(ChatMessage chatMessage) {
        if (!isViewValid()) {
            return;
        }
        LL();
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.insertMessage(chatMessage, true);
        }
    }

    @Override // X.CI5
    public final void Bn0(Exception exc) {
        LLIIIJ(exc);
        if ((exc instanceof C29401Dk) && ((C276516r) exc).getErrorCode() == 4010024) {
            J9A.LIZJ(C28787BRn.LIZ("livesdk_subscribe_expire"), this.dataChannel, "sub_emote", "click_position");
        }
    }

    @Override // X.CI5
    public final void Gk0(Exception exc) {
        if (exc instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) exc;
            int errorCode = c29401Dk.getErrorCode();
            if (50001 == errorCode) {
                C30868C9o.LJFF(this.LJLLLL, c29401Dk.getPrompt());
                return;
            }
            if (50004 == errorCode || 50014 == errorCode || 80074 == errorCode) {
                LL();
                LLFII();
                C30868C9o.LJFF(this.LJLLLL, c29401Dk.getPrompt());
                return;
            } else if (errorCode == 50019) {
                LLFII();
                C31097CIj.LIZ(this.LJLLLL, "send_barrage", new CIP());
                return;
            } else {
                BPP.LIZJ(getContext(), c29401Dk);
                return;
            }
        }
        C30868C9o.LIZLLL(R.string.ssb, this.context);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unknown exception ");
        LIZ.append(exc.toString());
        C0NB.LIZIZ("CommentWidget", X1D.LIZIZ(LIZ));
    }

    @Override // X.CI5
    public final void L30(Barrage barrage) {
        if (!isViewValid()) {
            return;
        }
        LL();
        if (TextUtils.isEmpty(barrage.getOrderId())) {
            C30868C9o.LIZJ(R.string.ssb);
            return;
        }
        ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJII(barrage.getLeftDiamond());
        if (LiveEnableNormalGiftAndBarrageSelfFirstlySetting.INSTANCE.getValue() && this.LJLLL != null && ((IMessageService) CN1.LIZ(IMessageService.class)).get(this.LJLLL.getId()) != null && isViewValid()) {
            try {
                C65124PhA.LIZLLL().getClass();
                InterfaceC31105CIr LJ = C65124PhA.LJ(ScreenMessage.class);
                if (LJ != null) {
                    byte[] decode = Base64.decode(barrage.getScreenChatMsg(), 0);
                    Q9H q9h = new Q9H();
                    q9h.LJIIL(new Q9M(decode));
                    ScreenMessage screenMessage = (ScreenMessage) LJ.LIZ(q9h);
                    if (screenMessage != null) {
                        screenMessage.isLocalInsertMsg = true;
                        ((IMessageService) CN1.LIZ(IMessageService.class)).get(this.LJLLL.getId()).insertMessage(screenMessage);
                    }
                }
            } catch (Exception e) {
                C0NB.LJ("ttlive_msg", e.toString());
            }
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("live_source", this.LJLLLLLL);
            if (!TextUtils.isEmpty(this.LJLLL.getSourceType())) {
                hashMap.put("moment_room_source", this.LJLLL.getSourceType());
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        BZI LIZ = C28787BRn.LIZ("send_barrage");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJJIFFI(hashMap);
        LIZ.LJIIIZ("live_interact");
        LIZ.LJJIIJZLJL();
    }

    public final void LJZI(boolean z) {
        String str;
        String str2;
        if (LLIIIILZ() && !z) {
            BPV.LIZLLL("sub_only_comment_limit", null);
        }
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_comment_area_mode", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_comment_area_mode");
        String connectionType = ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType();
        String str3 = "normal";
        if (TextUtils.equals(connectionType, "normal")) {
            Room room = this.LJLLL;
            if (room != null) {
                LIZ.LJIJJ(C1DJ.LJIILIIL(room), "connection_type");
            }
        } else {
            LIZ.LJIJJ(connectionType, "connection_type");
        }
        if (LLIIIILZ()) {
            str3 = "sub_only";
        }
        LIZ.LJIJJ(str3, "mode");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIIJZLJL();
            return;
        }
        LIZ.LJJIJ();
        LIZ.LJI();
        C28246B6s LJIJI = BJM.LJIJI();
        String str4 = "";
        if (LJIJI == null || (str = LJIJI.LIZ) == null) {
            str = "";
        }
        LIZ.LJIIJJI(str);
        LIZ.LJIJJ(BJM.LJIJ(), "video_id");
        LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
        C28246B6s LJIJI2 = BJM.LJIJI();
        if (LJIJI2 != null && (str2 = LJIJI2.LIZ) != null) {
            str4 = str2;
        }
        LIZ.LJIJJ(str4, "event_page");
        LIZ.LJJIIZI();
    }

    public final void LLFZ(String str) {
        C28870BUs c28870BUs = new C28870BUs(str);
        c28870BUs.LJIIJ = -1;
        c28870BUs.LJIIIZ = 80;
        if (((Boolean) this.dataChannel.kv0(BCW.class)).booleanValue()) {
            c28870BUs.LIZJ = (int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * 0.9f));
            c28870BUs.LIZIZ = (int) C15380j0.LJIJ(C15380j0.LJIIL());
            c28870BUs.LJIJJ = C15380j0.LJIILJJIL(R.string.ljd);
            c28870BUs.LJIJJLI = true;
            c28870BUs.LJJIFFI = true;
        } else {
            c28870BUs.LIZ(8, 0, 8);
            c28870BUs.LJIIL = true;
            c28870BUs.LIZJ = (int) C15380j0.LJIJ(C15380j0.LJIIJJI());
            c28870BUs.LIZIZ = 395;
        }
        BaseDialogFragment.wl(C29306Beo.LIZIZ(getContext()), ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu().LIZ(c28870BUs));
    }

    public final void LLII(String str) {
        C29682Bks LIZJ = C29683Bkt.LIZJ(str);
        LIZJ.LJIIIZ("bottom");
        if (((Boolean) this.dataChannel.kv0(BCW.class)).booleanValue()) {
            int LJIJ = (int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * 0.9f));
            BY3 by3 = BY3.DP;
            LIZJ.LJIIJ(LJIJ, by3);
            LIZJ.LJIL((int) C15380j0.LJIJ(C15380j0.LJIIL()), by3);
        } else {
            C29682Bks.LJIJI(LIZJ, 8);
            int LJIJ2 = (int) C15380j0.LJIJ(C15380j0.LJIIJJI());
            BY3 by32 = BY3.DP;
            LIZJ.LJIIJ(LJIJ2, by32);
            LIZJ.LJIL(395, by32);
        }
        LIZJ.LJ(-1);
        ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).Vs0(this.context, LIZJ.LIZ().toString(), null);
    }

    public final void LLIIIJ(Exception exc) {
        HashMap hashMap;
        String str;
        if (exc instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) exc;
            int errorCode = c29401Dk.getErrorCode();
            if (50001 == errorCode) {
                C30868C9o.LJFF(this.LJLLLL, c29401Dk.getPrompt());
                return;
            }
            if (50004 == errorCode) {
                LL();
                LLFII();
                C30868C9o.LJFF(this.LJLLLL, c29401Dk.getPrompt());
                return;
            }
            if (errorCode == 50019) {
                LLFII();
                C31097CIj.LIZ(this.LJLLLL, "send_message", new CIR());
                return;
            }
            if (errorCode == 50015) {
                LLFII();
                C30868C9o.LIZLLL(R.string.mg0, this.LJLLLL);
                return;
            }
            if (errorCode == 4010021) {
                if (EnableShowToastCommentBannedSetting.INSTANCE.enable() && !TextUtils.isEmpty(c29401Dk.getPrompt())) {
                    C30868C9o.LJIIL(c29401Dk.getPrompt(), this.LJLJJI, R.drawable.czc);
                    if (this.LJLLJ) {
                        hashMap = new HashMap();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(this.LJLLL.author().getId());
                        LIZ.append("");
                        hashMap.put("violation_anchor_id", X1D.LIZIZ(LIZ));
                    } else {
                        hashMap = null;
                    }
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_violation_toast");
                    if (this.LJLLJ) {
                        str = "anchor";
                    } else {
                        str = "user";
                    }
                    LIZ2.LJIJJ(str, "user_type");
                    LIZ2.LJIJJ("comment_ban", "violation_type");
                    LIZ2.LJIJJ("comment", "scene_type");
                    LIZ2.LJJIFFI(hashMap);
                    LIZ2.LJIILLIIL(this.dataChannel);
                    LIZ2.LJJIIJZLJL();
                    return;
                }
                if (C38354F3m.LJ(c29401Dk.getExtra())) {
                    return;
                }
                try {
                    ((Integer) new JSONObject(c29401Dk.getExtra()).get("dueDate")).intValue();
                } catch (JSONException unused) {
                }
                LLILLIZIL(new C87277YNd());
                return;
            }
            C30868C9o.LJFF(this.LJLLLL, c29401Dk.getPrompt());
            return;
        }
        C30868C9o.LIZJ(R.string.ljc);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("unknown exception ");
        LIZ3.append(Log.getStackTraceString(exc));
        C0NB.LJ("CommentWidget", X1D.LIZIZ(LIZ3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        if (r13 != null) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x039c A[Catch: IllegalStateException -> 0x03a5, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x03a5, blocks: (B:123:0x0369, B:125:0x039c), top: B:122:0x0369 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0212  */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.2Wj, O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIJI(X.C30926CBu r13) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.LLIIJI(X.CBu):void");
    }

    public final void LLIIZ(boolean z) {
        if (LiveSubOnlyChatConfig.INSTANCE.animationEnable() && z) {
            LLILL(0);
            this.LJLJJLL.setVisibility(0);
            AnimatorSet animatorSet = this.LJLLILLLL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LJLLILLLL = new AnimatorSet();
            this.LJLJLLL.setAlpha(0.0f);
            this.LJLJJLL.setAlpha(1.0f);
            if (C29232Bdc.LJIILL(this.LJLLL)) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJJLL, (Property<CX9, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(300L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLJLLL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.setStartDelay(300L);
                ofFloat2.setDuration(300L);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJLJLLL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat3.setInterpolator(new LinearInterpolator());
                ofFloat3.setStartDelay(1600L);
                ofFloat3.setDuration(300L);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.LJLJJLL, (Property<CX9, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat4.setInterpolator(new LinearInterpolator());
                ofFloat4.setStartDelay(1900L);
                ofFloat4.setDuration(300L);
                this.LJLLILLLL.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            } else {
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.LJLJJLL, (Property<CX9, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat5.setInterpolator(new LinearInterpolator());
                ofFloat5.setDuration(300L);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.LJLJLLL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat6.setInterpolator(new LinearInterpolator());
                ofFloat6.setStartDelay(300L);
                ofFloat6.setDuration(300L);
                this.LJLLILLLL.playTogether(ofFloat5, ofFloat6);
            }
            this.LJLLILLLL.start();
            LLIILII("", false);
            return;
        }
        if (C29232Bdc.LJIILL(this.LJLLL)) {
            LLILL(8);
            this.LJLJJLL.setVisibility(0);
        } else {
            LLILL(0);
            this.LJLJJLL.setVisibility(8);
        }
    }

    public final void LLILII(String str) {
        BZI LIZ = C28787BRn.LIZ(str);
        C06510Nj.LIZ((C29374Bfu) C279117r.LIZJ(LIZ, this.dataChannel), LIZ, "user_id");
        LIZ.LJIJJ(Long.valueOf(this.LJLLL.getId()), "room_id");
        LIZ.LJJIIJZLJL();
    }

    public final void LLILIL(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_comment_block_comment_toast_show");
        C06510Nj.LIZ((C29374Bfu) C279117r.LIZJ(LIZ, this.dataChannel), LIZ, "user_id");
        LIZ.LJIJJ(Long.valueOf(this.LJLLL.getId()), "room_id");
        LIZ.LJIJJ(str, "reason");
        LIZ.LJJIIJZLJL();
    }

    public final void LLILL(int i) {
        this.LJLJLLL.setVisibility(i);
        ImageView imageView = this.LJLL;
        if (C29232Bdc.LJIILJJIL() && this.LJZ) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public final void LLILLIZIL(C87277YNd c87277YNd) {
        if (((Boolean) this.dataChannel.kv0(PIPStatusData.class)).booleanValue()) {
            this.LLIIJLIL = c87277YNd;
            return;
        }
        DialogC77438UaI dialogC77438UaI = this.LLIIJI;
        if (dialogC77438UaI != null) {
            dialogC77438UaI.dismiss();
        }
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.m_j);
        C77437UaH c77437UaH = new C77437UaH(getContext());
        c77437UaH.LIZJ = C15380j0.LJIILJJIL(R.string.kgj);
        c77437UaH.LJI = LJIILJJIL;
        c77437UaH.LIZJ(R.string.njj, new IDCListenerS159S0100000_5(this, 14), false);
        c77437UaH.LJ(R.string.kgi, new IDCListenerS159S0100000_5(this, 15), false);
        c77437UaH.LJJII = false;
        this.LLIIJI = c77437UaH.LIZ();
        BKY.LIZIZ().LIZ();
        C16880lQ.LIZ(this.LLIIJI);
    }

    public final void LLILLJJLI(CI2 ci2) {
        DataChannel dataChannel;
        RunnableC09760Zw runnableC09760Zw;
        if (ci2 == null || (dataChannel = this.dataChannel) == null) {
            return;
        }
        if (((Boolean) dataChannel.kv0(PIPStatusData.class)).booleanValue()) {
            this.LLIIIILZ = ci2;
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_comment_rethink_sw");
        C06510Nj.LIZ((C29374Bfu) C279117r.LIZJ(LIZ, this.dataChannel), LIZ, "user_id");
        LIZ.LJIJJ(ci2.LJIIJ, "comment");
        LIZ.LJIJJ(Integer.valueOf(TextUtils.equals(ci2.LJIIIZ, ci2.LJIIJ) ? 1 : 0), "resend_same_cmt");
        LIZ.LJJIIJZLJL();
        DialogC77438UaI dialogC77438UaI = this.LLIFFJFJJ;
        if (dialogC77438UaI != null) {
            dialogC77438UaI.dismiss();
        }
        String value = LiveCommunityGuidelineSetting.INSTANCE.getValue();
        int i = 1;
        if (!TextUtils.isEmpty(value)) {
            runnableC09760Zw = new RunnableC09760Zw(i, this, value, ci2);
        } else {
            runnableC09760Zw = null;
        }
        this.LLIFFJFJJ = C28853BUb.LIZ(getContext(), runnableC09760Zw, new ARunnableS8S0201000_5(1, this, ci2, 19), new ARunnableS8S0201000_5(0, this, ci2, 8));
        BKY.LIZIZ().LIZ();
        this.LLIIII = false;
        C16880lQ.LIZ(this.LLIFFJFJJ);
    }

    public final void LLILLL(CI2 ci2) {
        DataChannel dataChannel;
        ARunnableS11S0201000_8 aRunnableS11S0201000_8;
        if (ci2 == null || (dataChannel = this.dataChannel) == null) {
            return;
        }
        if (((Boolean) dataChannel.kv0(PIPStatusData.class)).booleanValue()) {
            this.LLIIIJ = ci2;
            return;
        }
        LLILII("livesdk_comment_rethink_show");
        LiveDialog liveDialog = this.LLII;
        if (liveDialog != null) {
            liveDialog.dismiss();
        }
        String value = LiveCommunityGuidelineSetting.INSTANCE.getValue();
        if (!TextUtils.isEmpty(value)) {
            aRunnableS11S0201000_8 = new ARunnableS11S0201000_8(0, this, value, 4);
        } else {
            aRunnableS11S0201000_8 = null;
        }
        Context context = getContext();
        ARunnableS10S0101000_6 aRunnableS10S0101000_6 = new ARunnableS10S0101000_6(0, this, 11);
        ARunnableS8S0201000_5 aRunnableS8S0201000_5 = new ARunnableS8S0201000_5(0, this, ci2, 9);
        o.LJIIIZ(context, "context");
        String communityGuideline = C15380j0.LJIILJJIL(R.string.ljd);
        String desc = C15380j0.LJIILL(R.string.owb, communityGuideline);
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) desc);
        if (!TextUtils.isEmpty(desc) && !TextUtils.isEmpty(communityGuideline)) {
            o.LJIIIIZZ(desc, "desc");
            o.LJIIIIZZ(communityGuideline, "communityGuideline");
            int LJJLIIIJL = s.LJJLIIIJL(desc, communityGuideline, 0, false, 6);
            if (LJJLIIIJL != -1) {
                C23010vJ.LJFF(append, LJJLIIIJL, communityGuideline.length() + LJJLIIIJL, 33, 600);
            }
            if (aRunnableS11S0201000_8 != null) {
                append.setSpan(new IDCSpanS31S0100000_5(aRunnableS11S0201000_8, 6), LJJLIIIJL, communityGuideline.length() + LJJLIIIJL, 33);
            }
        }
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LJ(C259910h.LJI(C259710f.LIZ.LJFF, R.attr.aw6, context));
        c47071t1.LJ(R.drawable.bdg);
        c47071t1.LJIILLIIL(R.string.owe);
        c47071t1.LJII(append);
        c47071t1.LJIIIZ(R.string.owc, new IDcS170S0100000_5(aRunnableS10S0101000_6, 22));
        c47071t1.LJIIL(R.string.owd, new IDcS170S0100000_5(aRunnableS8S0201000_5, 23));
        LiveDialog LIZ = c47071t1.LIZ();
        this.LLII = LIZ;
        C16880lQ.LIZ(LIZ);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String, O] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String, O] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String, O] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String, O] */
    public final void LLIZ(C30926CBu c30926CBu) {
        long id;
        String secUid;
        InputAttrs Al;
        InputAttrs inputAttrs = this.LLILLL;
        inputAttrs.requestPage = c30926CBu.LJIIIIZZ;
        inputAttrs.sender = c30926CBu.LJIIIZ;
        String str = (String) this.dataChannel.kv0(C6Z.class);
        if (str != null) {
            C31079CHr.LIZ = str;
        }
        ((C32537Cpp) this.dataChannel.gv0(C6Z.class)).LIZ = c30926CBu.LJI;
        LJZL();
        ReplyInfo replyInfo = this.LLILLL.replyInfo;
        User user = c30926CBu.LIZLLL;
        if (user == null) {
            id = 0;
        } else {
            id = user.getId();
        }
        replyInfo.replyToId = id;
        ReplyInfo replyInfo2 = this.LLILLL.replyInfo;
        User user2 = c30926CBu.LIZLLL;
        if (user2 == null) {
            secUid = null;
        } else {
            secUid = user2.getSecUid();
        }
        replyInfo2.replyUserSecId = secUid;
        ReplyInfo replyInfo3 = this.LLILLL.replyInfo;
        replyInfo3.msgId = c30926CBu.LJIIJJI;
        replyInfo3.releaseId = c30926CBu.LJIIL;
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LLILLIZIL;
        if (liveEmojiInputDialogFragment != null && (Al = liveEmojiInputDialogFragment.Al()) != null) {
            Al.replyInfo = replyInfo3;
        }
        int i = c30926CBu.LIZ;
        if (i == 1) {
            if (!isViewValid()) {
                return;
            }
            String str2 = c30926CBu.LIZIZ;
            if (c30926CBu.LJII) {
                this.LLFF = false;
                str2 = BML.LIZ("@%s ", str2);
            } else {
                this.LLFF = true;
            }
            if (this.LLFF && this.LJLLL.commentHasTextEmojiEmote != 0) {
                InputAttrs inputAttrs2 = this.LLILLL;
                inputAttrs2.isQAStrengthen = true;
                inputAttrs2.inputWithEmote = this.LLFZ;
            }
            this.LLI = BML.LIZ("@%s", c30926CBu.LIZIZ);
            if (LLIIII()) {
                this.LLILLIZIL.Vl(str2);
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment2 = this.LLILLIZIL;
                StringBuilder LIZ = X1D.LIZ();
                liveEmojiInputDialogFragment2.Wl(JBR.LJFF(LIZ, c30926CBu.LIZIZ, ": ", LIZ), c30926CBu.LJ, c30926CBu.LJFF);
                return;
            }
            InputAttrs inputAttrs3 = this.LLILLL;
            inputAttrs3.input = str2;
            inputAttrs3.content = c30926CBu.LJ;
            StringBuilder LIZ2 = X1D.LIZ();
            inputAttrs3.atName = JBR.LJFF(LIZ2, c30926CBu.LIZIZ, ": ", LIZ2);
            this.LLILLL.atEmoteWithIndexList = c30926CBu.LJFF;
            LLIIJI(c30926CBu);
            return;
        }
        if (i == 2) {
            this.LJLJJI.postDelayed(new ARunnableS24S0200000_5(c30926CBu, this, 23), 500L);
            return;
        }
        if (i == 3) {
            if (!isViewValid()) {
                return;
            }
            if (LLIIII()) {
                this.LLILLIZIL.Vl(c30926CBu.LIZIZ);
                return;
            } else {
                this.LLILLL.input = c30926CBu.LIZIZ;
                LLIIJI(c30926CBu);
                return;
            }
        }
        if (i == 4) {
            if (!TextUtils.isEmpty(c30926CBu.LJI)) {
                ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C54832Df.class)).LIZ = c30926CBu.LJI;
            }
            LLIIJI(c30926CBu);
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment3 = this.LLILLIZIL;
            if (liveEmojiInputDialogFragment3 != null) {
                liveEmojiInputDialogFragment3.LJLL = EnumC09680Zo.Panel;
                liveEmojiInputDialogFragment3.LLJJIJIIJIL = new C31083CHv(this, c30926CBu);
                return;
            }
            return;
        }
        if (i == 5) {
            LLIIJI(null);
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment4 = this.LLILLIZIL;
            if (liveEmojiInputDialogFragment4 != null) {
                liveEmojiInputDialogFragment4.LJLL = EnumC09680Zo.Panel;
                liveEmojiInputDialogFragment4.LLJJIJIIJIL = new CIF(this);
                return;
            }
            return;
        }
        if (i == 6) {
            if (!TextUtils.isEmpty(c30926CBu.LJI)) {
                ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C54832Df.class)).LIZ = c30926CBu.LJI;
            }
            LLIIJI(null);
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment5 = this.LLILLIZIL;
            if (liveEmojiInputDialogFragment5 != null) {
                liveEmojiInputDialogFragment5.LJLL = EnumC09680Zo.Panel;
                liveEmojiInputDialogFragment5.LLJJIJIIJIL = new CIN(this);
                return;
            }
            return;
        }
        if (i == 8) {
            if (!isViewValid()) {
                return;
            }
            this.LLILLL.starlingKey = c30926CBu.LJIILJJIL;
            if (LLIIII()) {
                this.LLILLIZIL.Vl(c30926CBu.LIZIZ);
                return;
            } else {
                this.LLILLL.input = c30926CBu.LIZIZ;
                LLIIJI(c30926CBu);
                return;
            }
        }
        if (!TextUtils.isEmpty(c30926CBu.LJI)) {
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C54832Df.class)).LIZ = c30926CBu.LJI;
        }
        LLIIJI(c30926CBu);
    }

    @Override // X.CI5
    public final void Lf0(boolean z) {
        this.LLILLL.canSendDanmu = z;
    }

    @Override // X.CI5
    public final void RE(boolean z) {
        if (this.LJLLJ) {
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLF;
            if (z != c48459J0d.LIZJ().booleanValue()) {
                c48459J0d.LIZ(Boolean.valueOf(z));
                C73943T0h.LIZ().LIZIZ(new BCC(z));
                return;
            }
            return;
        }
        if (z) {
            LLIILZL();
        } else {
            LLF();
        }
    }

    public void onEvent(BUL bul) {
        User user = bul.LIZIZ;
        if (user == null) {
            return;
        }
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        String str = bul.LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(user.getId());
        LIZ.append("");
        iHostAction.showNotificationTipDialog(str, X1D.LIZIZ(LIZ), bul.LIZJ, user.getSecUid(), bul.LIZLLL, this.contentView, "", bul.LIZ, true, new CIQ());
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        LLIL();
        if (LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(this.dataChannel)) {
            C31087CHz.LIZIZ = this.LJLLL;
            C31087CHz.LIZJ();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object... objArr) {
        String str;
        this.LJLLL = (Room) this.dataChannel.kv0(RoomChannel.class);
        this.LJLZ = (String) this.dataChannel.kv0(EnterLiveSourceChannel.class);
        this.LJLLLL = C29306Beo.LIZIZ(this.context);
        this.LJZL = new C31086CHy();
        this.LJLJJI = (FrameLayout) findViewById(R.id.dd7);
        this.LJLJJL = (TextView) findViewById(R.id.co4);
        this.LJLJJLL = (CX9) findViewById(R.id.co5);
        this.LJLJL = (C47151t9) findViewById(R.id.kc8);
        this.LJLJLJ = (TextView) findViewById(R.id.kca);
        this.LJLJLLL = findViewById(R.id.bm8);
        this.LJLL = (ImageView) findViewById(R.id.bm7);
        this.LJLLI = (TextView) findViewById(R.id.bm9);
        C6H.LIZ(new ACListenerS24S0101000_5(0, this, 5), this.LJLJJI);
        if (F9J.LIZIZ(this.LJLLLL, 0, "feed_live_span").getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.LJLLLLLL = str;
        this.LJLIL = (LinearLayout) findViewById(R.id.g2d);
        this.LJLJI = (LiveIconView) findViewById(R.id.f0v);
        C6H.LIZ(new ACListenerS24S0101000_5(0, this, 6), this.LJLIL);
        this.LJLILLLLZI = findViewById(R.id.bkg);
        boolean reuseOptimize = LiveCommentDialogOptimizeSetting.reuseOptimize(this.dataChannel);
        this.LLIZLLLIL = reuseOptimize;
        if (reuseOptimize) {
            this.dataChannel.ov0(this, FirstFrameChannelEvent.class, new AObjectS42S0101000_5(4, this, 54));
        }
        C31811Ce7.LIZLLL("ttlive_comment", "CommentWidget onInit");
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object... objArr) {
        DataChannel dataChannel;
        View view;
        Long l;
        super.onLoad(objArr);
        registerRxBus(C30926CBu.class);
        registerRxBus(BCC.class);
        registerRxBus(BUL.class);
        LifecycleOwner lifecycleOwner = null;
        int i = 0;
        if (this.LJLLL != null && this.LJLJJI != null) {
            this.LJLLJ = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
            InputAttrs inputAttrs = (InputAttrs) this.dataChannel.kv0(CIV.class);
            if (inputAttrs != null) {
                this.LLILLL = inputAttrs;
                LLILZLL();
            } else {
                LJZL();
            }
            this.LLILLL.isBroadcaster = this.LJLLJ;
            this.LJLLL = (Room) this.dataChannel.kv0(RoomChannel.class);
            this.LJZI = !((Boolean) this.dataChannel.kv0(OrientationChangedChannel.class)).booleanValue();
            ICommentService iCommentService = (ICommentService) CN1.LIZ(ICommentService.class);
            if (iCommentService instanceof CommentService) {
                CommentService commentService = (CommentService) iCommentService;
                long id = this.LJLLL.getId();
                commentService.getClass();
                commentService.LJLIL.LJI(id, this);
            }
            this.LJZ = ((Boolean) this.dataChannel.kv0(BCW.class)).booleanValue();
            this.LJLZ = (String) this.dataChannel.kv0(EnterLiveSourceChannel.class);
            this.LJLLLL = C29306Beo.LIZIZ(this.context);
            this.LLIILII = Boolean.TRUE.equals(this.dataChannel.kv0(BNK.class));
            LLIL();
            DataChannel dataChannel2 = this.dataChannel;
            dataChannel2.lv0(this, UserWannaSendMessageEvent.class, new AObjectS42S0101000_5(3, this, 58));
            dataChannel2.lv0(this, DoSendMessageChannelEvent.class, new AObjectS42S0101000_5(1, this, 44));
            dataChannel2.lv0(this, BanTalkEvent.class, new AObjectS42S0101000_5(0, this, 24));
            dataChannel2.ov0(this, DutyGiftChangedEvent.class, new AObjectS144S0100000_5(this, 3));
            dataChannel2.lv0(this, DismissInputDialogEvent.class, new C40273FrJ(0, this));
            dataChannel2.lv0(this, HideInteractionEvent.class, new AObjectS43S0101000_7(1, this, 0));
            dataChannel2.lv0(this, BroadcastEndShowEvent.class, new AObjectS42S0101000_5(1, this, 11));
            dataChannel2.lv0(this, PIPStatusData.class, new AObjectS42S0101000_5(0, this, 25));
            dataChannel2.lv0(this, QuestionCardChangeTextEvent.class, new AObjectS45S0101000_13(1, this, 0));
            dataChannel2.lv0(this, CommentWidgetStyleChangeEvent.class, new AObjectS42S0101000_5(1, this, 52));
            dataChannel2.lv0(this, SubscribeSubOnlyChatChangeEvent.class, new AObjectS42S0101000_5(4, this, 60));
            dataChannel2.lv0(this, SubscribeSubOnlyOnBoardingOpen.class, new AObjectS42S0101000_5(4, this, 61));
            dataChannel2.lv0(this, GiftDialogHeightEvent.class, new AObjectS42S0101000_5(3, this, 31));
            if (this.LJLLJ) {
                EnumC30204BtI.COMMENT.load(this.dataChannel, new BCE(this.context));
            } else {
                DataChannel dataChannel3 = this.dataChannel;
                dataChannel3.ov0(this, DrawGuessRoundStartEvent.class, new AObjectS43S0101000_7(2, this, 2));
                dataChannel3.lv0(this, DrawGuessRoundEndEvent.class, new AObjectS42S0101000_5(1, this, 36));
                dataChannel3.lv0(this, DrawGuessCorrectsRoundsChannel.class, new AObjectS45S0101000_13(1, this, 3));
            }
            C28733BPl.LJIILIIL().getClass();
            C0NE.LIZ("ttlive_comment", "CommentWidget onLoad");
            LJLZ();
            if (!this.LJZ) {
                this.LL.LIZ(((InterfaceC29856Bng) new C73421Srh(this.LLILL.LJIILIIL()).LJJJ(C73969T1h.LIZIZ()).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZIZ(new AfS36S0101000_5(1, this, 7)));
                this.LL.LIZ(((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BNM.class).LJJJ(C73969T1h.LIZIZ()).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZIZ(new AfS36S0101000_5(1, this, 8)));
            }
            if (this.LJZ || !InterfaceC30442Bx8.LLLI.LIZJ().booleanValue()) {
                C31079CHr.LIZJ(this.dataChannel, this.LLIIL);
            }
            this.LLIIZ = System.currentTimeMillis();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.nv0(this, this, SubscribeSuccessEvent.class, new AObjectS42S0101000_5(1, this, 40));
            dataChannelGlobal.nv0(this, this, ShowKeyboardEvent.class, new AObjectS45S0101000_13(1, this, 9));
            if (this.LJLLL != null && (l = (Long) this.dataChannel.kv0(C28418BDi.class)) != null && l.longValue() == this.LJLLL.getId()) {
                ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).kg0(this.context, this.LJLLL, "comment_area", null);
                ((C32537Cpp) this.dataChannel.gv0(C28418BDi.class)).LIZ = null;
            }
        }
        if (!this.LLIZLLLIL && LiveCommentDialogOptimizeSetting.layoutOptimize(this.dataChannel)) {
            this.dataChannel.ov0(this, FirstFrameChannelEvent.class, new AObjectS10S0001000_5(1, 0));
        }
        B76.LIZJ(this.LJLLL, "comment");
        LiveCommentWidthOptSetting liveCommentWidthOptSetting = LiveCommentWidthOptSetting.INSTANCE;
        if (liveCommentWidthOptSetting.isStrategyEnable() && !this.LJLLJ) {
            this.LJLILLLLZI.post(new ARunnableS41S0100000_5(this, 136));
            Object obj = this.context;
            if (obj instanceof LifecycleOwner) {
                lifecycleOwner = (LifecycleOwner) obj;
            }
            this.dataChannel.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new AObjectS42S0101000_5(3, this, 46));
        }
        if (!this.LJLLJ) {
            if (this.LLJJI == null) {
                this.LLJJI = new IDCListenerS254S0100000_5(this, 6);
            }
            View view2 = getView();
            if (view2 != null) {
                view2.post(new RunnableC45421Hs9(0, this, view2));
            }
        }
        if (liveCommentWidthOptSetting.isStrategyEnable() && !this.LJLLJ) {
            this.LLJJIII = new IDCListenerS254S0100000_5(this, 7);
            View view3 = getView();
            if (view3 != null) {
                view3.post(new R6B(this, view3, i));
            }
        }
        if (!this.LJLLJ && this.LJZ && LiveEomjiConvenientSetting.INSTANCE.isShowEmojiConvenient()) {
            this.LLJJIJI = (C73411SrX) C1EW.LIZ(((CommentApi) Q7L.LIZIZ(CommentApi.class)).queryChatEmojiList(10L)).LJJJLIIL(new AfS39S0101000_13(0, this, 3), new AfS17S0001000_5(1, 3));
        }
        if (TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldOptimize() && (dataChannel = this.dataChannel) != null) {
            if (this.LJZ && Boolean.TRUE.equals(dataChannel.kv0(IsFromLandscapeData.class))) {
                View view4 = getView();
                if (view4 != null) {
                    view4.getViewTreeObserver().addOnPreDrawListener(new IDDListenerS392S0100000_5(view4, 5));
                    return;
                }
                return;
            }
            if (this.LJZ || !Boolean.TRUE.equals(this.dataChannel.kv0(IsFromPortraitData.class)) || (view = getView()) == null) {
                return;
            }
            view.getViewTreeObserver().addOnPreDrawListener(new IDDListenerS392S0100000_5(view, 4));
        }
    }

    @Override // X.CI5
    public final void qO(EmoteChatResult emoteChatResult) {
        if (emoteChatResult != null) {
            LLIIIL(emoteChatResult.msgId, null, null, 0, emoteChatResult.user, emoteChatResult.userIdentity);
        }
    }

    public final <T> void registerRxBus(Class<T> cls) {
        C73943T0h LIZ = C73943T0h.LIZ();
        LIZ.getClass();
        LIZ.LIZLLL(this, cls, new C19U()).LIZIZ(new AfS39S0101000_13(1, this, 1));
    }

    public void onEvent(BCC bcc) {
        if (!this.LJLLJ) {
            return;
        }
        if (bcc.LIZ) {
            LLIILZL();
        } else {
            LLF();
        }
    }

    public void onEvent(C30926CBu c30926CBu) {
        LLIZ(c30926CBu);
    }

    @Override // X.InterfaceC09660Zm
    public final void LJJJJL(List list, ISendCommentEvent.Sender sender) {
        Context context;
        C31086CHy c31086CHy = this.LJZL;
        if (c31086CHy == null) {
            return;
        }
        C31084CHw c31084CHw = new C31084CHw(list, sender, Collections.emptyMap());
        if (c31086CHy.LJLJI != null) {
            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Ji(c31086CHy.LJLILLLLZI.getId(), C31309CQn.LJIIZILJ(c31086CHy.LJLILLLLZI.getId(), c31084CHw.LIZ, -System.currentTimeMillis(), ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ, null), new C31080CHs(c31086CHy, c31084CHw));
        }
        LLFII();
        ISubscribeService iSubscribeService = this.LLILZ;
        if (iSubscribeService != null && (context = this.context) != null) {
            iSubscribeService.CF(context, this.LJLLL, this.dataChannel);
        }
    }

    public final void LJZ(View view, TimeInterpolator timeInterpolator) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        this.LLJIJIL = ofFloat;
        ofFloat.setInterpolator(timeInterpolator);
        this.LLJIJIL.setDuration(400L);
        this.LLJIJIL.addListener(new IDAListenerS74S0100000_5(view, 3));
        this.LLJIJIL.setStartDelay(100L);
        this.LLJIJIL.start();
    }

    public final void LLFFF(View view, TimeInterpolator timeInterpolator) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        this.LLJILJIL = ofFloat;
        ofFloat.setInterpolator(timeInterpolator);
        this.LLJILJIL.setDuration(250L);
        this.LLJILJIL.addListener(new IDAListenerS74S0100000_5(view, 4));
        this.LLJILJIL.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r3 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIILII(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting r0 = com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting.INSTANCE
            java.lang.String r1 = "livesdk_subscription_sub_only_comment_show"
            boolean r0 = r0.isEnable(r1)
            if (r0 != 0) goto Lb
            return
        Lb:
            X.BZI r4 = X.C28787BRn.LIZ(r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            r4.LJIILLIIL(r0)
            boolean r0 = r5.LJLLJ
            if (r0 == 0) goto L5a
            java.lang.String r1 = "anchor"
        L1a:
            java.lang.String r0 = "user_type"
            r4.LJIJJ(r1, r0)
            if (r7 == 0) goto L2a
        L21:
            java.lang.String r0 = "subscribe_state"
            r4.LJIJJ(r6, r0)
            r4.LJJIIJZLJL()
            return
        L2a:
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r5.LJLLL
            r2 = 0
            if (r3 == 0) goto L57
            com.bytedance.android.live.base.model.user.User r0 = r3.getOwner()
            if (r0 == 0) goto L4e
            boolean r1 = r0.isSubscribed()
        L39:
            com.bytedance.android.live.base.model.user.User r0 = r3.getOwner()
            if (r0 == 0) goto L49
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L49
            boolean r2 = r0.isInGracePeriod()
        L49:
            if (r1 == 0) goto L52
            java.lang.String r6 = "subscribed_not_expired"
            goto L21
        L4e:
            r1 = 0
            if (r3 == 0) goto L49
            goto L39
        L52:
            if (r2 == 0) goto L57
            java.lang.String r6 = "subscribed_expired_grace_period"
            goto L21
        L57:
            java.lang.String r6 = "not_subscribed"
            goto L21
        L5a:
            java.lang.String r1 = "user"
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.LLIILII(java.lang.String, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String, O] */
    @Override // X.CI5
    public final void YI(CI0 ci0, Exception exc) {
        if (exc instanceof C29401Dk) {
            int errorCode = ((C276516r) exc).getErrorCode();
            if (errorCode != 4010020) {
                switch (errorCode) {
                    case 4010034:
                        C30868C9o.LIZJ(R.string.ow_);
                        LLILIL("cg_violation");
                        break;
                    case 4010035:
                        C30868C9o.LIZJ(R.string.owa);
                        LLILIL("error");
                        break;
                    case 4010036:
                        DataChannel dataChannel = this.dataChannel;
                        if (dataChannel != null) {
                            LLILLL(new CI2((String) dataChannel.kv0(C28417BDh.class), ci0.LIZIZ(), ci0.LJI(), ci0.LJ(), ci0.LIZLLL(), ci0.LJFF(), ci0.LIZ(), ci0.LIZJ()));
                            break;
                        }
                        break;
                    default:
                        LLIIIJ(exc);
                        break;
                }
            } else {
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    LLILLJJLI(new CI2((String) dataChannel2.kv0(C28417BDh.class), ci0.LIZIZ(), ci0.LJI(), ci0.LJ(), ci0.LIZLLL(), ci0.LJFF(), ci0.LIZ(), ci0.LIZJ()));
                }
            }
        } else {
            LLIIIJ(exc);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            ((C32537Cpp) dataChannel3.gv0(C28417BDh.class)).LIZ = ci0.LIZIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String, O] */
    @Override // X.CI5
    public final void tb0(ChatMessage chatMessage, CI0 ci0) {
        int size;
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C28417BDh.class)).LIZ = chatMessage.content;
        }
        long j = chatMessage.chatId;
        String str = chatMessage.content;
        List<EmoteWithIndex> list = chatMessage.f117emotes;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        LLIIIL(j, str, ci0, C31077CHp.LIZ(size, str), chatMessage.userInfo, chatMessage.userIdentity);
        if (TextUtils.isEmpty(this.LLI) || TextUtils.isEmpty(chatMessage.content) || !chatMessage.content.contains(this.LLI)) {
            LJZL();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || !C28835BTj.LJFF(dataChannel2) || (room = this.LJLLL) == null || room.author() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.LJLLL.author().getId()));
        hashMap.put("room_id", String.valueOf(this.LJLLL.getId()));
        C28835BTj.LIZ("live_ad", "live_comment", null, hashMap);
    }

    @Override // X.InterfaceC09660Zm
    public final void LJIJI(String str, String str2, int i, ISendCommentEvent.Sender sender) {
        LLIIL(str, str2, false, false, i, sender, null, null);
        LLFII();
    }

    /* JADX WARN: Type inference failed for: r1v78, types: [java.lang.String, O] */
    public final void LLIIIL(long j, String str, CI0 ci0, int i, User user, UserIdentity userIdentity) {
        ISendCommentEvent.Sender sender;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj;
        Object obj2;
        Long l;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        long j2;
        Object obj7;
        boolean z7;
        boolean z8;
        Object obj8;
        Object obj9;
        Boolean bool;
        Object obj10;
        User owner;
        boolean z9;
        boolean z10;
        boolean z11;
        Object obj11;
        long j3;
        User owner2;
        CIZ LIZJ;
        boolean z12;
        User owner3;
        if (this.LJLLJ) {
            DataChannel dataChannel = this.dataChannel;
            InputAttrs inputAttrs = this.LLILLL;
            ReplyInfo replyInfo = inputAttrs.replyInfo;
            String str2 = this.LLFII;
            String str3 = this.LLFFF;
            o.LJIIIZ(replyInfo, "replyInfo");
            C31079CHr.LIZ(dataChannel, replyInfo, str2, str3, ci0, inputAttrs, false);
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        Object liveFeedLayout = this.LJLLLLLL;
        boolean z13 = this.LJZ;
        boolean LLIIIILZ = LLIIIILZ();
        InputAttrs inputAttrs2 = this.LLILLL;
        ReplyInfo replyInfo2 = inputAttrs2.replyInfo;
        boolean z14 = this.LLFF;
        o.LJIIIZ(liveFeedLayout, "liveFeedLayout");
        o.LJIIIZ(replyInfo2, "replyInfo");
        if (dataChannel2 == null) {
            z12 = false;
        } else {
            if (ci0 == null || (sender = ci0.LJFF()) == null) {
                sender = ISendCommentEvent.Sender.COMMENTWIDGET;
            }
            String LJIIIZ = BJM.LJIIIZ();
            if (!TextUtils.isEmpty(LJIIIZ) && o.LJ("click_push_live_cd_user", LJIIIZ)) {
                z = true;
            } else {
                z = false;
            }
            Room room = (Room) dataChannel2.kv0(RoomChannel.class);
            Boolean bool2 = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class);
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room2 != null && (owner3 = room2.getOwner()) != null) {
                z3 = owner3.isSubscribed();
            } else {
                z3 = false;
            }
            if (str != null) {
                C1FC.LIZIZ().LJLJI.getClass();
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt != 0 && charAt != '\t' && charAt != '\n' && charAt != '\r' && (charAt < ' ' || (charAt > 55295 && (charAt < 57344 || (charAt > 65533 && (charAt < 0 || charAt > 65535)))))) {
                        z4 = true;
                        break;
                    }
                }
            }
            z4 = false;
            if (sender == ISendCommentEvent.Sender.QUICKCOMMENTFIRSTGIFT) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (sender == ISendCommentEvent.Sender.QUICKSUBGIFTCOMMENT) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object kv0 = dataChannel2.kv0(C6Z.class);
            if (sender == ISendCommentEvent.Sender.POLL) {
                BZI LIZ = C28787BRn.LIZ("livesdk_audience_poll_message");
                LIZ.LJIILLIIL(dataChannel2);
                LIZ.LIZJ("click");
                for (Map.Entry<String, String> entry : sender.getLogArgs().entrySet()) {
                    LIZ.LJIJJ(entry.getValue(), entry.getKey());
                }
                sender.getLogArgs().clear();
                LIZ.LJJIIJZLJL();
            } else if ((sender != ISendCommentEvent.Sender.QUICKEMOTECOMMENT || i != 0) && str != null && str.length() != 0) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_audience_live_message");
                LIZ2.LJIILLIIL(dataChannel2);
                Map map = null;
                LIZ2.LIZLLL(C28835BTj.LIZIZ(null, dataChannel2, "user_live_comment"));
                LIZ2.LJIIIZ("live_interact");
                LIZ2.LJJIFFI(BJB.LIZ());
                IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
                if (iFansClubService != null) {
                    map = iFansClubService.Yd(null, dataChannel2, false);
                }
                LIZ2.LJJIFFI(map);
                if (ci0 != null && (LIZJ = ci0.LIZJ()) != null) {
                    int i3 = LIZJ.LIZ;
                    if (i3 != -1) {
                        LIZ2.LJIJJ(Integer.valueOf(i3), "send_button");
                    }
                    LIZ2.LJIJJ(Integer.valueOf(LIZJ.LIZIZ ? 1 : 0), "has_draft");
                }
                Object obj12 = "1";
                if (z4) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ2.LJIJJ(obj, "with_emoji");
                if (room != null) {
                    LIZ2.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u4(room.getId())), "server_heat_level");
                    LIZ2.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).F(room.getId())), "client_heat_level");
                }
                Object kv02 = dataChannel2.kv0(C30114Brq.class);
                o.LJI(kv02);
                Object obj13 = "chat_room";
                if (((Boolean) kv02).booleanValue()) {
                    obj2 = "chat_room";
                } else {
                    obj2 = "bubble";
                }
                LIZ2.LJIJJ(obj2, "comment_pannel_type");
                LIZ2.LJIJJ(C28594BKc.LIZJ().LIZLLL(), "enter_live_method");
                LIZ2.LJIJJ(inputAttrs2.mCommentMethod, "method");
                LIZ2.LJIJJ(String.valueOf(j), "comment_id");
                if (room != null && (owner2 = room.getOwner()) != null) {
                    l = Long.valueOf(owner2.getId());
                } else {
                    l = null;
                }
                LIZ2.LJIJJ(String.valueOf(l), "to_user_id");
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
                LIZ2.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
                LIZ2.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
                LIZ2.LJIJJ(liveFeedLayout, "live_source");
                if (room != null) {
                    obj3 = room.getSourceType();
                } else {
                    obj3 = null;
                }
                LIZ2.LJIJJ(obj3, "moment_room_source");
                if (o.LJ(kv0, "fans_club_task")) {
                    LIZ2.LJIJJ(kv0, "enter_method");
                    ((C32537Cpp) dataChannel2.gv0(C6Z.class)).LIZ = C31079CHr.LIZ;
                }
                if (!o.LJ(dataChannel2.kv0(C30114Brq.class), Boolean.TRUE)) {
                    obj13 = "bubble";
                }
                LIZ2.LJIJJ(obj13, "comment_pannel_type");
                if (replyInfo2.replyToId != 0) {
                    obj4 = "1";
                } else {
                    obj4 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ2.LJIJJ(obj4, "is_message_reply");
                if (z) {
                    obj5 = "1";
                } else {
                    obj5 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ2.LJIJJ(obj5, "is_subscribe");
                if (z13) {
                    obj6 = "portrait";
                } else {
                    obj6 = "landscape";
                }
                LIZ2.LJIJJ(obj6, "room_orientation");
                LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z14)) ? 1 : 0), "is_lightening_qa");
                if (z14) {
                    LIZ2.LJIJJ(0L, "question_id");
                }
                if (z3 && i != -1 && i != 0 && i != 4) {
                    LIZ2.LJIJJ(String.valueOf(i), "subscribe_emote_show_type");
                }
                if (!z2 && ((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
                    if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                        LIZ2.LJIJJ("pk_phase", "match_status");
                    } else {
                        LIZ2.LJIJJ("punish", "match_status");
                    }
                    LIZ2.LJIJJ("manual_pk", "connection_type");
                    LIZ2.LJIJJ(String.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).eq()), "pk_id");
                }
                Long l2 = (Long) dataChannel2.kv0(DrawGuessSessionIdChannel.class);
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = 0;
                }
                if (!z2 && j2 > 0) {
                    LIZ2.LJIJJ(Long.valueOf(j2), "pictionary_session_id");
                    Long l3 = (Long) dataChannel2.kv0(DrawGuessRoundIdChannel.class);
                    if (l3 != null) {
                        j3 = l3.longValue();
                    } else {
                        j3 = 0;
                    }
                    LIZ2.LJIJJ(Long.valueOf(j3), "pictionary_id");
                }
                if (LLIIIILZ) {
                    obj7 = "sub_only";
                } else {
                    obj7 = "normal";
                }
                LIZ2.LJIJJ(obj7, "mode");
                if (sender == ISendCommentEvent.Sender.QA) {
                    LIZ2.LJIJJ("1", "is_from_denied_qa");
                }
                long j4 = replyInfo2.replyToId;
                if (j4 != 0) {
                    LIZ2.LJIJJ(Long.valueOf(j4), "reply_user_id");
                    LIZ2.LJIJJ(Long.valueOf(replyInfo2.msgId), "reply_message_id");
                    LIZ2.LJIJJ(Long.valueOf(replyInfo2.releaseId), "reply_message_release_id");
                }
                if (user != null) {
                    List<BadgeStruct> badgeList = user.getBadgeList();
                    if (badgeList != null) {
                        for (BadgeStruct badgeStruct : badgeList) {
                            if (badgeStruct != null && badgeStruct.badgeScene == 8) {
                                z9 = true;
                                break;
                            }
                        }
                    }
                    z9 = false;
                    if (z9) {
                        LIZ2.LJIJJ(1, "is_level");
                    } else {
                        LIZ2.LJIJJ(0, "is_level");
                    }
                    List<BadgeStruct> badgeList2 = user.getBadgeList();
                    if (badgeList2 != null) {
                        for (BadgeStruct badgeStruct2 : badgeList2) {
                            if (badgeStruct2 != null && badgeStruct2.badgeScene == 10) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        LIZ2.LJIJJ(1, "is_fans_club_level");
                    } else {
                        LIZ2.LJIJJ(0, "is_fans_club_level");
                    }
                    Map<String, String> map2 = BM1.LJIIZILJ;
                    if (map2 != null && map2.get("tag_name") != null) {
                        Map<String, String> map3 = BM1.LJIIZILJ;
                        if (map3 != null) {
                            obj11 = map3.get("tag_name");
                        } else {
                            obj11 = null;
                        }
                        LIZ2.LJIJJ(obj11, "live_game_name");
                    }
                    Integer valueOf = Integer.valueOf(((IFansClubService) CN1.LIZ(IFansClubService.class)).Cs(user.getBadgeList()));
                    if (valueOf.intValue() > -1) {
                        LIZ2.LJIJJ(Integer.valueOf(valueOf.intValue()), "fans_club_level");
                    }
                    Integer valueOf2 = Integer.valueOf(((IUserLevelService) CN1.LIZ(IUserLevelService.class)).tl0(user.getBadgeList()));
                    if (valueOf2.intValue() > -1) {
                        LIZ2.LJIJJ(Integer.valueOf(valueOf2.intValue()), "user_level");
                    }
                    List<BadgeStruct> badgeList3 = user.getBadgeList();
                    if (badgeList3 != null) {
                        for (BadgeStruct badgeStruct3 : badgeList3) {
                            if (badgeStruct3 != null && badgeStruct3.badgeScene == 6) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                        LIZ2.LJIJJ(1, "is_rank");
                    } else {
                        LIZ2.LJIJJ(0, "is_rank");
                    }
                }
                if (sender == ISendCommentEvent.Sender.QUICKCOMMENT || sender == ISendCommentEvent.Sender.QUICKEMOTECOMMENT || sender == ISendCommentEvent.Sender.QUICKCOMMENTFIRSTGIFT || sender == ISendCommentEvent.Sender.QUICK_COMMENT_EC) {
                    LIZ2.LJIJJ(1, "is_quick_comment");
                    if (sender == ISendCommentEvent.Sender.QUICK_COMMENT_EC) {
                        LIZ2.LJIJJ(C113554cx.LJJJLL("starling_key", sender.getLogArgs()), "comment_content");
                        LIZ2.LJIJJ(1, "is_ecom_quick");
                    } else {
                        LIZ2.LJIJJ(str, "comment_content");
                    }
                } else {
                    LIZ2.LJIJJ(0, "is_quick_comment");
                }
                if (sender == ISendCommentEvent.Sender.QUICKEMOTECOMMENT) {
                    if (room != null && (owner = room.getOwner()) != null) {
                        bool = Boolean.valueOf(owner.isSubscribed());
                    } else {
                        bool = null;
                    }
                    if (C29306Beo.LJJIFFI(bool)) {
                        obj10 = "1";
                    } else {
                        obj10 = CardStruct.IStatusCode.DEFAULT;
                    }
                    LIZ2.LJIJJ(obj10, "quick_comment_subscribe_type");
                }
                if (sender == ISendCommentEvent.Sender.REPLY) {
                    LIZ2.LJJIFFI(sender.getLogArgs());
                }
                if (!z5) {
                    obj12 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ2.LJIJJ(obj12, "is_first_gift_quick_comment");
                if (z6) {
                    LIZ2.LJIJJ(2, "quick_comment_subscribe_show_type");
                    z7 = true;
                } else {
                    z7 = true;
                    LIZ2.LJIJJ(1, "quick_comment_subscribe_show_type");
                }
                if (sender == ISendCommentEvent.Sender.COMMENT_COMBO_TRAY) {
                    LIZ2.LJJIFFI(sender.getLogArgs());
                }
                IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!TextUtils.isEmpty(iInteractService.FZ())) {
                    Map<String, String> L00 = iInteractService.L00();
                    o.LJIIIIZZ(L00, "it.matchLogParams");
                    linkedHashMap.putAll(L00);
                    if (TextUtils.equals("in_pk", iInteractService.FZ())) {
                        linkedHashMap.put("match_status", "pk_phase");
                    } else {
                        linkedHashMap.put("match_status", "punish");
                    }
                }
                LIZ2.LJJIFFI(linkedHashMap);
                IInteractService iInteractService2 = (IInteractService) CN1.LIZ(IInteractService.class);
                if (iInteractService2.Yu0() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z8)) ? 1 : 0), "is_guest_connection");
                if (iInteractService2.Zs0()) {
                    obj8 = "grid";
                } else if (iInteractService2.gr0()) {
                    obj8 = "floating";
                } else {
                    obj8 = "normal_floating";
                }
                LIZ2.LJIJJ(obj8, "layout_setting");
                if (iInteractService2.VY()) {
                    obj9 = "fixed";
                } else if (iInteractService2.Vc()) {
                    obj9 = "unfixed";
                } else {
                    obj9 = "not_existed";
                }
                LIZ2.LJIJJ(obj9, "window_setting");
                if (userIdentity != null) {
                    JSONArray jSONArray = new JSONArray();
                    if (userIdentity.isGiftGiverOfAnchor) {
                        jSONArray.put("gifter");
                        z7 = false;
                    }
                    if (userIdentity.isSubscriberOfAnchor) {
                        jSONArray.put("subscriber");
                        z7 = false;
                    }
                    if (userIdentity.isFollowerOfAnchor) {
                        jSONArray.put("fans");
                        z7 = false;
                    }
                    if (userIdentity.isMutualFollowingWithAnchor) {
                        jSONArray.put("friends");
                        z7 = false;
                    }
                    if (userIdentity.isModeratorOfAnchor) {
                        jSONArray.put("moderator");
                    } else if (z7) {
                        jSONArray.put("audience");
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("user_type", jSONArray);
                    LIZ2.LJJ(jSONObject);
                }
                JSONObject jSONObject2 = inputAttrs2.trackInfo;
                if (jSONObject2 != null) {
                    LIZ2.LJJ(jSONObject2);
                }
                C31079CHr.LJI(LIZ2);
                LIZ2.LJJIIJZLJL();
            }
            z12 = false;
        }
        this.LLFF = z12;
        LJZL();
    }

    public final void LLIIJLIL(String str, String str2, boolean z, boolean z2, int i, C1FC c1fc, CIZ ciz) {
        ISendCommentEvent.Sender sender;
        ISendCommentEvent.Sender sender2 = ISendCommentEvent.Sender.COMMENTWIDGET;
        InputAttrs inputAttrs = this.LLILLL;
        if (inputAttrs == null || (sender = inputAttrs.sender) == null) {
            sender = sender2;
        }
        LLIIL(str, str2, z, z2, i, sender, c1fc, ciz);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        if (r4.equals(r1.getSecUid()) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIL(java.lang.String r25, java.lang.String r26, boolean r27, boolean r28, int r29, com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent.Sender r30, X.C1FC r31, X.CIZ r32) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.LLIIL(java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender, X.1FC, X.CIZ):void");
    }
}
