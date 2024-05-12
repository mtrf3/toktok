package com.bytedance.android.livesdk.qa;

import X.B4Q;
import X.B83;
import X.BCN;
import X.BV1;
import X.BV3;
import X.BV7;
import X.BZI;
import X.C05170If;
import X.C15380j0;
import X.C16880lQ;
import X.C1A;
import X.C1DH;
import X.C1EW;
import X.C28787BRn;
import X.C28860BUi;
import X.C28902BVy;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29927Bop;
import X.C30868C9o;
import X.C31665Cbl;
import X.C47061t0;
import X.C47121t6;
import X.C62705OjF;
import X.C73318Sq2;
import X.C73943T0h;
import X.C76800UCe;
import X.C87277YNd;
import X.CCJ;
import X.CR6;
import X.EnumC30204BtI;
import X.EnumC31509CYf;
import X.InterfaceC29856Bng;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.UFE;
import X.W5G;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import Y.ARunnableS13S0100100_5;
import Y.ARunnableS24S0200000_5;
import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import Y.IDCListenerS298S0100000_5;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.InteractPlayerViewChangeChannel;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.CommentClickEvent;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.QuestionCardChangeTextEvent;
import com.bytedance.android.livesdk.dataChannel.QuestionCardVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeSubOnlyChatChangeEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.game.model.TaskProfitInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.QAQuickEntranceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.model.message.QuestionDeleteMessage;
import com.bytedance.android.livesdk.model.message.QuestionSelectMessage;
import com.bytedance.android.livesdk.model.message.QuestionSlideDownMessage;
import com.bytedance.android.livesdk.model.message.QuestionSwitchMessage;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FullBottomContainerHeightChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGiftShowPinCardEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class QuestionCardWidget extends LiveRecyclableWidget implements OnMessageListener {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public Question LJLJI;
    public long LJLJJI;
    public IMessageManager LJLJJL;
    public ReportQuestionDialog LJLJJLL;
    public long LJLJL;
    public final C73318Sq2 LJLJLJ = new C73318Sq2();
    public final Handler LJLJLLL = new Handler(C16880lQ.LLJJJJ());
    public final Map<String, Runnable> LJLL = new HashMap();
    public boolean LJLLI = true;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dq_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZL() {
        Question question = this.LJLJI;
        if (question != null) {
            LLFF(question, 0);
        }
        this.LJLJI = null;
        this.LJLJJI = 0L;
        LJZ(true);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ReportQuestionDialog reportQuestionDialog = this.LJLJJLL;
        if (reportQuestionDialog != null) {
            reportQuestionDialog.dismiss();
        }
        Question question = this.LJLJI;
        if (question != null) {
            LLFF(question, 0);
        }
        this.LJLJI = null;
        this.LJLJJI = 0L;
        IMessageManager iMessageManager = this.LJLJJL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJLJLJ.dispose();
    }

    public final void LJLZ(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        Question question;
        Long l;
        if (this.LJLILLLLZI && (question = this.LJLJI) != null) {
            QAApi qAApi = (QAApi) C1A.LIZJ(QAApi.class);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                l = (Long) dataChannel.kv0(BCN.class);
            } else {
                l = null;
            }
            o.LJI(l);
            C1EW.LIZ(qAApi.endAnswer(l.longValue(), question.questionId)).LJJJLIIL(new AfS54S0200000_5(this, interfaceC88472Yns, 24), new AfS57S0100000_5(interfaceC88472Yns, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 160));
        }
        LJZL();
    }

    public final void LJZ(boolean z) {
        DataChannel dataChannel;
        if (isShowing()) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.rv0(QuestionCardVisibilityEvent.class, Boolean.FALSE);
            }
            hide();
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.rv0(FullBottomContainerHeightChannel.class, 0);
            }
            if (z && (dataChannel = this.dataChannel) != null) {
                dataChannel.qv0(QuestionCardChangeTextEvent.class, Boolean.FALSE);
            }
        }
    }

    public final void LJZI(boolean z) {
        if (!this.LJLILLLLZI) {
            this.LJLIL = z;
            if (z) {
                return;
            }
            LLII(true);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null) {
                return;
            }
            dataChannel.pv0(LiveEndDismissDialogEvent.class);
        }
    }

    public final void LLFZ(long j) {
        if ((this.LJLIL && this.LJLILLLLZI) || C29232Bdc.LJFF(this.dataChannel)) {
            return;
        }
        if ((C1DH.LJJIIJZLJL(this.dataChannel) || QAQuickEntranceSetting.INSTANCE.enable()) && this.LJLJI != null) {
            View view = getView();
            if (view == null) {
                return;
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(QuestionCardVisibilityEvent.class, Boolean.TRUE);
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.qv0(QuestionCardChangeTextEvent.class, Boolean.TRUE);
            }
            show();
            view.post(new ARunnableS24S0200000_5(this, view, 30));
        }
        if (j != 0) {
            Runnable runnable = (Runnable) ((HashMap) this.LJLL).remove("auto_close");
            if (runnable != null) {
                this.LJLJLLL.removeCallbacks(runnable);
            }
            ARunnableS13S0100100_5 aRunnableS13S0100100_5 = new ARunnableS13S0100100_5(j, this, 3);
            ((HashMap) this.LJLL).put("auto_close", aRunnableS13S0100100_5);
            this.LJLJLLL.postDelayed(aRunnableS13S0100100_5, j * 1000);
        }
    }

    public final void LLII(boolean z) {
        boolean z2;
        this.LJLLI = z;
        if (this.context == null) {
            return;
        }
        boolean LJIIIZ = C29232Bdc.LJIIIZ(this.dataChannel);
        boolean z3 = false;
        if (this.LJLILLLLZI || !LJIIIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!BV1.LJ(this.dataChannel) || (BV1.LJ(this.dataChannel) && BV1.LIZLLL(this.dataChannel))) {
            z3 = true;
        }
        if (z && z3 && z2) {
            EnumC30204BtI enumC30204BtI = EnumC30204BtI.QUESTION;
            DataChannel dataChannel = this.dataChannel;
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            enumC30204BtI.load(dataChannel, new C28902BVy(context, this));
            enumC30204BtI.setEnableClick(this.dataChannel, true);
            return;
        }
        EnumC30204BtI.QUESTION.unload(this.dataChannel);
    }

    public final void LLIIII(Question question) {
        Long l;
        QAApi qAApi = (QAApi) C1A.LIZJ(QAApi.class);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            l = (Long) dataChannel.kv0(BCN.class);
        } else {
            l = null;
        }
        o.LJI(l);
        ((InterfaceC29856Bng) C1EW.LIZ(qAApi.startAnswer(l.longValue(), question.questionId, 4)).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZJ(new AfS54S0200000_5(question, this, 25), BV3.LJLIL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        IMessageManager iMessageManager;
        LiveIconView liveIconView;
        View findViewById;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        Boolean bool;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.lv0(this, CommentClickEvent.class, new AqS171S0100000_5(this, 674));
        }
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(B4Q.class).LJII(new C62705OjF()).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZIZ(new AfS57S0100000_5(this, 247));
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.lv0(this, CurrentQuestionChannel.class, new AqS171S0100000_5(this, 681));
            dataChannel5.lv0(this, CurrentQuestionPinChannel.class, new AqS171S0100000_5(this, 684));
            dataChannel5.lv0(this, AnchorSwitchQuestionEvent.class, new AqS171S0100000_5(this, 685));
        }
        if (this.LJLILLLLZI && (dataChannel2 = this.dataChannel) != null) {
            dataChannel2.lv0(this, QuestionRemoveQuestionChannel.class, new AqS171S0100000_5(this, 687));
            dataChannel2.lv0(this, CloseQuestionEvent.class, new AqS171S0100000_5(this, 690));
        }
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BV7.class).LJII(new C62705OjF()).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZIZ(new AfS57S0100000_5(this, 249));
        if (LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(this.dataChannel) && (dataChannel = this.dataChannel) != null) {
            dataChannel.ov0(this, InteractPlayerViewChangeChannel.class, new AqS171S0100000_5(this, 677));
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.ov0(this, LinkCrossRoomStateChangeEvent.class, new AqS171S0100000_5(this, 679));
        }
        DataChannel dataChannel7 = this.dataChannel;
        if (dataChannel7 != null) {
            dataChannel7.ov0(this, FrameL2SlotVisibilityChannel.class, new AqS171S0100000_5(this, 669));
        }
        DataChannel dataChannel8 = this.dataChannel;
        if (dataChannel8 != null) {
            dataChannel8.ov0(this, FrameL3SlotVisibilityChannel.class, new AqS171S0100000_5(this, 670));
        }
        DataChannel dataChannel9 = this.dataChannel;
        if (dataChannel9 != null) {
            dataChannel9.ov0(this, PartnershipPromoteGameCardShowChannel.class, new AqS171S0100000_5(this, 680));
        }
        DataChannelGlobal.LJLJJI.qv0(this, this, LiveGiftShowPinCardEvent.class, new AqS171S0100000_5(this, 672));
        this.dataChannel.ov0(this, SubOnlyLiveAudienceStatusChannel.class, new AqS171S0100000_5(this, 694));
        DataChannel dataChannel10 = this.dataChannel;
        if (dataChannel10 != null) {
            dataChannel10.ov0(this, CustomizedPerksCardVisibilityChannel.class, new AqS171S0100000_5(this, 691));
            dataChannel10.ov0(this, SubGoalCardVisibilityChannel.class, new AqS171S0100000_5(this, 692));
        }
        DataChannel dataChannel11 = this.dataChannel;
        Long l = null;
        if (dataChannel11 != null && (iMessageManager = (IMessageManager) dataChannel11.kv0(C29927Bop.class)) != null) {
            if (!this.LJLILLLLZI) {
                iMessageManager.addMessageListener(EnumC31509CYf.QUESTION_SLIDE_DOWN_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(EnumC31509CYf.QUESTION_SELECT_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(EnumC31509CYf.QUESTION_SWITCH_MESSAGE.getIntType(), this);
            }
            iMessageManager.addMessageListener(EnumC31509CYf.QUESTION_DELETE_MESSAGE.getIntType(), this);
        } else {
            iMessageManager = null;
        }
        this.LJLJJL = iMessageManager;
        if (!this.LJLILLLLZI) {
            QAApi qAApi = (QAApi) C1A.LIZJ(QAApi.class);
            DataChannel dataChannel12 = this.dataChannel;
            if (dataChannel12 != null) {
                l = (Long) dataChannel12.kv0(BCN.class);
            }
            o.LJI(l);
            C1EW.LIZ(qAApi.queryCurrentQuestion(l.longValue())).LJJJLIIL(new AfS57S0100000_5(this, 251), new InterfaceC64592gB() { // from class: X.9DX
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        View view = getView();
        if (view != null && (liveIconView = (LiveIconView) view.findViewById(R.id.bg1)) != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 305));
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(R.id.ijv)) != null) {
                C29306Beo.LJJJLL(findViewById, 240L, new AqS171S0100000_5(this, 699));
            }
            View view3 = getView();
            if (view3 != null) {
                if (!BV1.LJ(this.dataChannel) || (BV1.LJ(this.dataChannel) && (BV1.LIZLLL(this.dataChannel) || ((BV1.LJI(this.dataChannel) || BV1.LJIIIIZZ(this.dataChannel)) && C29306Beo.LJIIJ(this.dataChannel))))) {
                    C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 307), view3);
                }
                view3.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 5));
            }
        }
        this.LJLLI = true;
        DataChannel dataChannel13 = this.dataChannel;
        dataChannel13.lv0(dataChannel13.LJLJJI, SubscribeSubOnlyChatChangeEvent.class, new AqS171S0100000_5(this, 476));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        CR6 cr6;
        RoomAuthStatus roomAuthStatus;
        if (!(iMessage instanceof CR6) || (cr6 = (CR6) iMessage) == null) {
            return;
        }
        if (cr6 instanceof QuestionSlideDownMessage) {
            Question question = this.LJLJI;
            if (question != null && ((QuestionSlideDownMessage) cr6).questionId == question.questionId) {
                LJZL();
                return;
            }
            return;
        }
        if (cr6 instanceof QuestionDeleteMessage) {
            Question question2 = this.LJLJI;
            if (question2 != null && ((QuestionDeleteMessage) cr6).questionId == question2.questionId) {
                LJZL();
            }
            if (((QuestionDeleteMessage) cr6).userId != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                return;
            }
            C30868C9o.LIZJ(R.string.nwk);
            return;
        }
        if (cr6 instanceof QuestionSwitchMessage) {
            QuestionSwitchMessage questionSwitchMessage = (QuestionSwitchMessage) cr6;
            Boolean LIZ = questionSwitchMessage.LIZ();
            o.LJIIIIZZ(LIZ, "liveMessage.on");
            boolean booleanValue = LIZ.booleanValue();
            Room LJIILL = C1DH.LJIILL(this.dataChannel);
            if (LJIILL != null && (roomAuthStatus = LJIILL.getRoomAuthStatus()) != null) {
                roomAuthStatus.setEnableQuestion(booleanValue);
            }
            C73943T0h LIZ2 = C73943T0h.LIZ();
            Boolean LIZ3 = questionSwitchMessage.LIZ();
            o.LJIIIIZZ(LIZ3, "liveMessage.on");
            LIZ2.LIZIZ(new C28860BUi(LIZ3.booleanValue()));
            Boolean LIZ4 = questionSwitchMessage.LIZ();
            o.LJIIIIZZ(LIZ4, "liveMessage.on");
            LLII(LIZ4.booleanValue());
            if (C1DH.LJJIIJZLJL(this.dataChannel)) {
                LLFZ(0L);
                return;
            } else {
                LJZL();
                return;
            }
        }
        if (!(cr6 instanceof QuestionSelectMessage)) {
            return;
        }
        Question question3 = ((QuestionSelectMessage) cr6).question;
        if (question3.answerFrom == 3) {
            LLFII(question3, false);
        } else {
            LLFFF(this, question3, 0L, 6);
        }
    }

    public final void LL(User user, String str) {
        long j;
        String str2;
        C73943T0h LIZ = C73943T0h.LIZ();
        UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId(), str);
        Question question = this.LJLJI;
        if (question != null) {
            j = question.questionId;
        } else {
            j = 0;
        }
        userProfileEvent.msgId = j;
        if (question != null) {
            str2 = question.content;
        } else {
            str2 = null;
        }
        userProfileEvent.content = str2;
        userProfileEvent.chatType = "3";
        userProfileEvent.mReportType = "report_question";
        userProfileEvent.setClickUserPosition("qa_card");
        LIZ.LIZIZ(userProfileEvent);
    }

    public final void LLF(Question question, long j) {
        Room room;
        this.LJLJL = SystemClock.uptimeMillis();
        if (this.LJLILLLLZI) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_card_show");
                LIZ.LJIILLIIL(this.dataChannel);
                LIZ.LJIJJ(Long.valueOf(j), "question_like");
                LIZ.LJIJJ(Long.valueOf(question.questionId), "question_id");
                LIZ.LJIJJ(Integer.valueOf(question.createFrom), "create_from");
                LIZ.LJIJJ(Integer.valueOf(question.answerFrom), "answer_from");
                LIZ.LJFF(String.valueOf(room.getOwnerUserId()));
                LIZ.LJJIIJ(room.getIdStr());
                LIZ.LJIJJ(question.recReqId, "rec_req_id");
                LIZ.LJJIIJZLJL();
                return;
            }
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_qa_card_show");
        LIZ2.LJIILLIIL(this.dataChannel);
        LIZ2.LJIJJ(Long.valueOf(question.questionId), "question_id");
        LIZ2.LJIJJ(Integer.valueOf(question.createFrom), "create_from");
        UFE.LIZIZ(question.answerFrom, LIZ2, "answer_from");
    }

    public final void LLFF(Question question, int i) {
        int uptimeMillis = (int) (SystemClock.uptimeMillis() - this.LJLJL);
        Long l = null;
        if (this.LJLILLLLZI) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_card_show_duration");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJIJJ(Long.valueOf(this.LJLJJI), "question_like");
            Question question2 = this.LJLJI;
            if (question2 != null) {
                l = Long.valueOf(question2.questionId);
            }
            LIZ.LJIJJ(l, "question_id");
            LIZ.LJIJJ(Integer.valueOf(uptimeMillis), "duration");
            LIZ.LJIJJ(Integer.valueOf(i), "is_timeout");
            LIZ.LJIJJ(Integer.valueOf(question.createFrom), "create_from");
            LIZ.LJIJJ(Integer.valueOf(question.answerFrom), "answer_from");
            LIZ.LJIJJ(question.recReqId, "rec_req_id");
            LIZ.LJJIIJZLJL();
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_qa_card_show_duration");
        LIZ2.LJIILLIIL(this.dataChannel);
        Question question3 = this.LJLJI;
        if (question3 != null) {
            l = Long.valueOf(question3.questionId);
        }
        LIZ2.LJIJJ(l, "question_id");
        LIZ2.LJIJJ(Integer.valueOf(uptimeMillis), "duration");
        LIZ2.LJIJJ(Integer.valueOf(question.createFrom), "create_from");
        UFE.LIZIZ(question.answerFrom, LIZ2, "answer_from");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe LLFII(com.bytedance.android.livesdk.model.message.Question r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.qa.QuestionCardWidget.LLFII(com.bytedance.android.livesdk.model.message.Question, boolean):X.UCe");
    }

    public static void LLFFF(QuestionCardWidget questionCardWidget, Question question, long j, int i) {
        List<String> list;
        User user;
        UserAttr userAttr;
        if ((i & 2) != 0) {
            j = 0;
        }
        View view = questionCardWidget.getView();
        if (view == null || question.content == null || question.user == null) {
            return;
        }
        Question question2 = questionCardWidget.LJLJI;
        if (question2 != null && question2.questionId != question.questionId) {
            questionCardWidget.LLFF(question2, 0);
        }
        questionCardWidget.LJLJI = question;
        questionCardWidget.LJLJJI = 0L;
        questionCardWidget.LLF(question, 0L);
        ImageModel avatarThumb = question.user.getAvatarThumb();
        Boolean bool = null;
        if (avatarThumb != null) {
            list = avatarThumb.getUrls();
        } else {
            list = null;
        }
        if (list != null && question.user.getAvatarThumb().getUrls().size() > 0) {
            C31665Cbl.LJ(question.user.getAvatarThumb(), (C47061t0) view.findViewById(R.id.ijn));
        } else {
            W5G setQuestionData$lambda$7$lambda$5 = (W5G) view.findViewById(R.id.ijn);
            if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                o.LJIIIIZZ(setQuestionData$lambda$7$lambda$5, "setQuestionData$lambda$7$lambda$5");
                C87277YNd.LJJIIJ(R.drawable.d65, setQuestionData$lambda$7$lambda$5);
            } else {
                setQuestionData$lambda$7$lambda$5.setImageResource(R.drawable.d65);
            }
        }
        ((ImageView) view.findViewById(R.id.ijn)).setVisibility(0);
        C16880lQ.LJJI((C47061t0) view.findViewById(R.id.ijn), new ACListenerS40S0200000_5(question, questionCardWidget, 42));
        C47121t6 c47121t6 = (C47121t6) view.findViewById(R.id.ike);
        c47121t6.setText(C15380j0.LJIILL(R.string.ko7, C05170If.LIZ(question.user)));
        C16880lQ.LJJIIZ(c47121t6, new ACListenerS40S0200000_5(question, questionCardWidget, 43));
        ((TextView) view.findViewById(R.id.ijp)).setText(question.content);
        if (CCJ.LIZ(view.getContext())) {
            view.findViewById(R.id.ijp).setTextDirection(4);
        } else {
            view.findViewById(R.id.ijp).setTextDirection(3);
        }
        ((ImageView) view.findViewById(R.id.ijw)).setVisibility(8);
        ((ImageView) view.findViewById(R.id.ijv)).setVisibility(8);
        Question question3 = questionCardWidget.LJLJI;
        if (question3 != null && (user = question3.user) != null && (userAttr = user.getUserAttr()) != null) {
            bool = Boolean.valueOf(userAttr.isAdmin);
        }
        if (C29306Beo.LJJIFFI(bool)) {
            View findViewById = view.findViewById(R.id.afl);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById2 = view.findViewById(R.id.afl);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        questionCardWidget.LLFZ(j);
    }
}
