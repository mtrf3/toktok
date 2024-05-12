package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.chatroom.model.ReplyInfo;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.CHr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31079CHr {
    public static String LIZ = "";

    public static void LJI(BZI bzi) {
        bzi.LJIJJ(((IInteractService) CN1.LIZ(IInteractService.class)).h00(), "send_comment_scene");
    }

    public static void LIZIZ(long j, DataChannel dataChannel) {
        if (j < 0 || dataChannel == null || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_comment_box_duration", 0.01d)) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_comment_box_duration");
        LIZ2.LJIJJ(Long.valueOf(j), "duration");
        LJFF(LIZ2, dataChannel);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIILLIIL(dataChannel);
            LIZ2.LJJIIJZLJL();
            return;
        }
        LIZ2.LJJIJ();
        LIZ2.LJI();
        BJM bjm = BJM.LJLIL;
        LIZ2.LJIJJ(BJM.LJIILL(), "room_orientation");
        LIZ2.LJIJJ(bjm.LIZJ(), "live_type");
        LIZ2.LJJIIZI();
    }

    public static void LIZJ(DataChannel dataChannel, boolean z) {
        boolean z2;
        if (dataChannel == null || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_comment_box_show", 0.01d)) {
            return;
        }
        Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_comment_box_show");
        if (!z2) {
            LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_click_available");
        }
        LJFF(LIZ2, dataChannel);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIILLIIL(dataChannel);
            LIZ2.LJJIIJZLJL();
            return;
        }
        LIZ2.LJJIJ();
        BJM bjm = BJM.LJLIL;
        LIZ2.LJIJJ(BJM.LJIILL(), "room_orientation");
        LIZ2.LJIJJ(BJM.LIZLLL(), "action_type");
        LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ2.LJIJJ(bjm.LIZJ(), "live_type");
        LIZ2.LJI();
        LIZ2.LJJIIZI();
    }

    public static void LIZLLL(DataChannel dataChannel, String str) {
        if (dataChannel == null) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_guidance_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).dK()), "user_rank");
        LIZ2.LJIJJ(str, "position");
        if (C15380j0.LJIILLIIL()) {
            LIZ2.LJIJJ("portrait", "room_orientation");
        } else {
            LIZ2.LJIJJ("landscape", "room_orientation");
        }
        LIZ2.LJJIIJZLJL();
    }

    public static void LJ(DataChannel dataChannel, String str) {
        if (dataChannel == null) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_guidance_show");
        LIZ2.LJIILLIIL(dataChannel);
        if (o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.FALSE)) {
            LIZ2.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).dK()), "user_rank");
        }
        LIZ2.LJIJJ(str, "position");
        if (C15380j0.LJIILLIIL()) {
            LIZ2.LJIJJ("portrait", "room_orientation");
        } else {
            LIZ2.LJIJJ("landscape", "room_orientation");
        }
        LIZ2.LJJIIJZLJL();
    }

    public static void LJFF(BZI bzi, DataChannel dataChannel) {
        String str;
        if (dataChannel == null) {
            return;
        }
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (room != null && ((C29374Bfu) LIZIZ).getCurrentUserId() == room.getOwnerUserId()) {
            str = "anchor";
        } else {
            UserAttr userAttr = ((C29374Bfu) LIZIZ).LIZIZ.getUserAttr();
            if (userAttr != null && userAttr.isAdmin) {
                str = "admin";
            } else {
                str = "user";
            }
        }
        bzi.LJIJJ(str, "admin_type");
    }

    public static void LIZ(DataChannel dataChannel, ReplyInfo replyInfo, String str, String str2, CI0 ci0, InputAttrs inputAttrs, boolean z) {
        String str3;
        ISendCommentEvent.Sender LJFF;
        CIZ LIZJ;
        o.LJIIIZ(replyInfo, "replyInfo");
        o.LJIIIZ(inputAttrs, "inputAttrs");
        if (dataChannel == null) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_live_message");
        LIZ2.LJIILLIIL(dataChannel);
        LJI(LIZ2);
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (room != null) {
            LIZ2.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u4(room.getId())), "server_heat_level");
            LIZ2.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).F(room.getId())), "client_heat_level");
        }
        if (replyInfo.replyToId != 0) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str3, "is_message_reply");
        if (replyInfo.replyToId != 0) {
            LIZ2.LJIJJ(Long.valueOf(replyInfo.msgId), "reply_message_id");
            C07250Qf.LIZJ(replyInfo.releaseId, LIZ2, "reply_message_release_id", str, "reply_event_page");
            LIZ2.LJIJJ(str2, "reply_method");
            LIZ2.LJIJJ(Long.valueOf(replyInfo.replyToId), "reply_user_id");
        }
        if (ci0 != null && (LIZJ = ci0.LIZJ()) != null) {
            LIZ2.LJIJJ(Integer.valueOf(LIZJ.LIZIZ ? 1 : 0), "has_draft");
        }
        if (C29306Beo.LJJII(dataChannel)) {
            LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "has_draft");
        }
        LIZ2.LJIJJ("more", "click_method");
        LIZ2.LJIJJ(inputAttrs.mCommentMethod, "method");
        if (ci0 != null && (LJFF = ci0.LJFF()) != null && LJFF == ISendCommentEvent.Sender.COMMENT_COMBO_TRAY) {
            LIZ2.LJJIFFI(LJFF.getLogArgs());
        }
        LIZ2.LJJIIJZLJL();
    }
}
