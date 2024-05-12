package X;

import Y.AfS0S0100200_5;
import Y.AfS37S0000000_5;
import android.text.Spannable;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.livesdk.api.LiveCaptchaCheckApi;
import com.bytedance.android.livesdk.dataChannel.GameLiveGamepadRevokeTips;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.GamePartnershipEntranceHide;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterViolationNumFinallyOptSetting;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.message.AccessControlCaptcha;
import com.bytedance.android.livesdk.model.message.AccessControlMessage;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdk.model.message.PartnershipPunishMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.QuestionMessage;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BsZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30159BsZ implements OnMessageListener {
    public final BaseFragment LJLIL;
    public C28720BOy LJLILLLLZI;
    public final C1P LJLJI;
    public final Room LJLJJI;
    public final DataChannel LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public Long LJLL = 0L;

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Boolean, O] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        LiveStreamGoal liveStreamGoal;
        PunishEventInfo punishEventInfo;
        Integer num;
        PerceptionDialogInfo perceptionDialogInfo;
        if (iMessage instanceof RemindMessage) {
            RemindMessage remindMessage = (RemindMessage) iMessage;
            if (remindMessage.getMessageType() == EnumC31509CYf.REMIND && 5 == remindMessage.noticeType) {
                if (this.LJLILLLLZI == null) {
                    this.LJLILLLLZI = new C28720BOy(this.LJLIL, this.LJLJJI);
                }
                C28720BOy c28720BOy = this.LJLILLLLZI;
                if (c28720BOy.LJ < 1) {
                    Text text = remindMessage.title;
                    Spannable LJFF = CXJ.LJFF(text, text.defaultPattern);
                    Text text2 = remindMessage.illegalText;
                    Spannable LJFF2 = CXJ.LJFF(text2, text2.defaultPattern);
                    C77437UaH c77437UaH = new C77437UaH(c28720BOy.LIZJ);
                    c77437UaH.LIZJ = LJFF;
                    c77437UaH.LJII = LJFF2;
                    c77437UaH.LJFF(c28720BOy.LJI, c28720BOy.LIZJ.getString(R.string.so3), false);
                    c77437UaH.LIZLLL(c28720BOy.LJII, c28720BOy.LIZJ.getString(R.string.ss8), false);
                    c77437UaH.LJJII = false;
                    DialogC77438UaI LIZ = c77437UaH.LIZ();
                    if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-4430448687245009927")).LIZ) {
                        LIZ.show();
                    }
                    c28720BOy.LJ++;
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_change_cover_window_show");
                    LIZ2.LJJIFFI(c28720BOy.LIZJ());
                    LIZ2.LJJIIJZLJL();
                    return;
                }
                if (!C0NB.LIZJ()) {
                    return;
                }
                C0NB.LJ("LiveDefaultCoverController", "Reach the upper limit , do not show dialog");
                return;
            }
            return;
        }
        if (iMessage instanceof QuestionMessage) {
            DataChannel dataChannel = this.LJLJJL;
            ?? r2 = Boolean.TRUE;
            ((C32537Cpp) dataChannel.gv0(BDQ.class)).LIZ = r2;
            QuestionMessage questionMessage = (QuestionMessage) iMessage;
            if (this.LJLJJL.kv0(UserIsAnchorChannel.class) != r2) {
                return;
            }
            BZI LIZ3 = C28787BRn.LIZ("livesdk_anchor_qa_message");
            LIZ3.LJIIZILJ();
            C30869C9p.LIZ(questionMessage.question.questionId, LIZ3, "question_id");
            if (C1DH.LJJI(this.LJLJJL) && !C1DH.LJIIZILJ(this.LJLJJL)) {
                return;
            }
            ((IQAService) CN1.LIZ(IQAService.class)).dO(this.LJLJJL);
            EnumC30204BtI.INTERACTION_FEATURES.showRedDot(this.LJLJJL);
            return;
        }
        String str = null;
        if (iMessage instanceof PerceptionMessage) {
            PerceptionMessage perceptionMessage = (PerceptionMessage) iMessage;
            if (perceptionMessage.getMessageType() != EnumC31509CYf.PERCEPTION_MESSAGE) {
                return;
            }
            PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
            if (perceptionDialogInfo2 != null && perceptionDialogInfo2.scene == 6) {
                Room room = this.LJLJJI;
                if (room != null && perceptionMessage.publicEventInfo != null) {
                    ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Lk0(room.getId(), perceptionMessage.publicEventInfo.punishId);
                }
            } else {
                this.LJLJI.LIZIZ(perceptionMessage);
            }
            C1P c1p = this.LJLJI;
            c1p.getClass();
            if (!LiveCenterViolationNumFinallyOptSetting.INSTANCE.isEnable()) {
                return;
            }
            PunishEventInfo punishEventInfo2 = perceptionMessage.publicEventInfo;
            if (punishEventInfo2 != null) {
                str = punishEventInfo2.punishType;
            }
            if (o.LJ("clear", str) && (perceptionDialogInfo = perceptionMessage.dialog) != null && 21 == perceptionDialogInfo.scene) {
                c1p.LJFF();
                return;
            } else {
                if (!o.LJ(perceptionMessage.showViolation, Boolean.TRUE)) {
                    return;
                }
                c1p.LJFF();
                return;
            }
        }
        if (iMessage instanceof PartnershipPunishMessage) {
            PartnershipPunishMessage partnershipPunishMessage = (PartnershipPunishMessage) iMessage;
            C1P c1p2 = this.LJLJI;
            c1p2.getClass();
            if (partnershipPunishMessage == null || (punishEventInfo = partnershipPunishMessage.punishInfo) == null || (num = punishEventInfo.punishTypeId) == null) {
                return;
            }
            int intValue = num.intValue();
            if (intValue != 25 && intValue != 26) {
                return;
            }
            EnumC30204BtI.ANCHOR_PARTNERSHIP.hide(c1p2.LJLILLLLZI);
            DataChannel dataChannel2 = c1p2.LJLILLLLZI;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.rv0(GamePartnershipEntranceHide.class, Boolean.TRUE);
            return;
        }
        if (iMessage instanceof PartnershipGameOfflineMessage) {
            PartnershipGameOfflineMessage partnershipGameOfflineMessage = (PartnershipGameOfflineMessage) iMessage;
            C1P c1p3 = this.LJLJI;
            c1p3.getClass();
            o.LJIIIZ(partnershipGameOfflineMessage, "partnershipGameOfflineMessage");
            List<PartnershipGameOfflineMessage.OfflineGameInfo> list = partnershipGameOfflineMessage.offlineGameList;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (((PartnershipGameOfflineMessage.OfflineGameInfo) ListProtector.get(list, 0)).taskListLen <= 0) {
                EnumC30204BtI.ANCHOR_PARTNERSHIP.hide(c1p3.LJLILLLLZI);
            }
            String toastText = ((PartnershipGameOfflineMessage.OfflineGameInfo) ListProtector.get(list, 0)).toastText;
            C30868C9o.LJI(toastText);
            DataChannel dataChannel3 = c1p3.LJLILLLLZI;
            if (dataChannel3 == null) {
                return;
            }
            o.LJIIIIZZ(toastText, "toastText");
            dataChannel3.rv0(GameLiveGamepadRevokeTips.class, new OSZ(toastText, null));
            C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "gamePartnershipPunished"));
            return;
        }
        if (iMessage instanceof AccessControlMessage) {
            AccessControlCaptcha accessControlCaptcha = ((AccessControlMessage) iMessage).captcha;
            if (accessControlCaptcha == null) {
                return;
            }
            long j = accessControlCaptcha.captchaRecordId;
            C1EW.LIZ(((LiveCaptchaCheckApi) Q7L.LIZIZ(LiveCaptchaCheckApi.class)).getCaptchaCheckResponse(j, this.LJLJJI.getId(), false)).LJII(BTJ.LIZIZ(this.LJLIL)).LJJJLIIL(new AfS0S0100200_5(j, accessControlCaptcha.verifyDurationInSec, this, 3), new AfS37S0000000_5(12));
            return;
        }
        if (!(iMessage instanceof LiveStreamGoalServerMessage) || (liveStreamGoal = ((LiveStreamGoalServerMessage) iMessage).goal) == null) {
            return;
        }
        ((C31691Mf) ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper()).LJIL(liveStreamGoal, true);
    }

    public C30159BsZ(BaseFragment baseFragment, DataChannel dataChannel) {
        int i;
        this.LJLIL = baseFragment;
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        this.LJLJJI = room;
        this.LJLJJL = dataChannel;
        if (room != null) {
            IMessageManager iMessageManager = C7N.LJIILL().get(room.getId());
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(EnumC31509CYf.REMIND.getIntType(), this);
                iMessageManager.addMessageListener(EnumC31509CYf.QUESTION.getIntType(), this);
                iMessageManager.addMessageListener(EnumC31509CYf.PERCEPTION_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(EnumC31509CYf.PARTNERSHIP_PUNISH_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(EnumC31509CYf.PARTNERSHIP_GAME_OFFLINE_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(EnumC31509CYf.ACCESS_CONTROL_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(EnumC31509CYf.STREAM_GOAL_SERVER_MESSAGE.getIntType(), this);
            }
            WarningTag warningTag = room.warningTag;
            if (warningTag != null && warningTag.text != null) {
                if (warningTag.tagSource == 1) {
                    i = 4;
                } else {
                    i = 3;
                }
                ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).ny(room.getId(), warningTag.text, warningTag.duration, warningTag.punishInfo, warningTag.punishInfo != null ? 6 : i, warningTag.style, warningTag.detailUrl);
            }
        }
        this.LJLJI = new C1P(baseFragment.getContext(), baseFragment, dataChannel);
    }
}
