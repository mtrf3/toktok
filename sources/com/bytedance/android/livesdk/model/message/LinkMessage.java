package com.bytedance.android.livesdk.model.message;

import X.C77800Ug8;
import X.CR6;
import X.EnumC31509CYf;
import X.EnumC74706TTq;
import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUpdateUserSettingContent;
import com.bytedance.android.livesdk.model.message.linker.accpet_notice_message.LinkerAcceptNoticeContent;
import com.bytedance.android.livesdk.model.message.linker.cancel_message.LinkerCancelContent;
import com.bytedance.android.livesdk.model.message.linker.enter_message.LinkerEnterContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteMessageExtra;
import com.bytedance.android.livesdk.model.message.linker.kick_out_message.LinkerKickOutContent;
import com.bytedance.android.livesdk.model.message.linker.leave_message.LinkerLeaveContent;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.LinkedListChangeContent;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkerListChangeContent;
import com.bytedance.android.livesdk.model.message.linker.mic_update.LinkerMicIdxUpdateContent;
import com.bytedance.android.livesdk.model.message.linker.mute_message.LinkerMuteContent;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent;

/* loaded from: classes14.dex */
public class LinkMessage extends CR6 {

    @InterfaceC65349Pkn("reply_accept_notice_content")
    public LinkerAcceptNoticeContent acceptNoticeContentMessage;

    @InterfaceC65349Pkn("cancel_content")
    public LinkerCancelContent cancelContent;

    @InterfaceC65349Pkn("linker_id")
    public long channelId;

    @InterfaceC65349Pkn("close_content")
    public LinkerCloseContent closeContent;

    @InterfaceC65349Pkn("cohost_list_change_content")
    public CohostListChangeContent cohostListChangeContent;

    @InterfaceC65349Pkn("create_content")
    public LinkerCreateContent createContent;

    @InterfaceC65349Pkn("enter_content")
    public LinkerEnterContent enterContent;

    @InterfaceC65349Pkn("expire_timestamp")
    public long expireTimestamp;

    @InterfaceC65349Pkn("extra")
    public String extraStr;

    @InterfaceC65349Pkn("invite_content")
    public LinkerInviteContent inviteContent;

    @InterfaceC65349Pkn("kick_out_content")
    public LinkerKickOutContent kickOutContent;

    @InterfaceC65349Pkn("leave_content")
    public LinkerLeaveContent leaveContent;

    @InterfaceC65349Pkn("linked_list_change_content")
    public LinkedListChangeContent linkedListChangeContent;

    @InterfaceC65349Pkn("list_change_content")
    public LinkerListChangeContent mListChangeContent;

    @InterfaceC65349Pkn("media_change_content")
    public LinkerMediaChangeContent mediaChangeContent;

    @InterfaceC65349Pkn("message_type")
    public int messageType;

    @InterfaceC65349Pkn("mic_idx_update_content")
    public LinkerMicIdxUpdateContent micIdxUpdateContent;

    @InterfaceC65349Pkn("update_user_setting_content")
    public MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent;

    @InterfaceC65349Pkn("mute_content")
    public LinkerMuteContent muteContent;

    @InterfaceC65349Pkn("random_match_content")
    public LinkerRandomMatchContent randomMatchContent;

    @InterfaceC65349Pkn("reply_content")
    public LinkerReplyContent replyContent;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("sys_kick_out_content")
    public LinkerSysKickOutContent sysKickOutContent;

    @InterfaceC65349Pkn("transfer_extra")
    public String transferExtra;

    @InterfaceC65349Pkn("update_user_content")
    public LinkerUpdateUserContent updateUserContent;

    @InterfaceC65349Pkn("user_toast_content")
    public LinkmicUserToastContent userToastContent;

    @InterfaceC65349Pkn("waiting_list_change_content")
    public LinkerWaitingListChangeContent waitingListChangeContent;

    public final long LIZ() {
        long j = this.expireTimestamp;
        if (j <= 0) {
            return 0L;
        }
        return j - this.timestamp;
    }

    public final LinkerInviteMessageExtra LIZIZ() {
        LinkerInviteMessageExtra linkerInviteMessageExtra;
        LinkerInviteContent linkerInviteContent = this.inviteContent;
        if (linkerInviteContent == null || (linkerInviteMessageExtra = linkerInviteContent.linkerInviteMsgExtra) == null) {
            return null;
        }
        return linkerInviteMessageExtra;
    }

    public final EnumC74706TTq LIZJ() {
        int i = this.scene;
        if (i != 2) {
            if (i != 4) {
                return EnumC74706TTq.OTHER;
            }
            return EnumC74706TTq.AUDIENCE_LINKMIC;
        }
        return EnumC74706TTq.ANCHOR_LINKMIC;
    }

    public LinkMessage() {
        this.type = EnumC31509CYf.LINK_MESSAGE;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMessage{messageType=");
        LIZ.append(this.messageType);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", scene=");
        LIZ.append(this.scene);
        LIZ.append(", linkerInviteContent=");
        LIZ.append(this.inviteContent);
        LIZ.append(", extraStr='");
        return C77800Ug8.LIZJ(LIZ, this.extraStr, '\'', '}', LIZ);
    }
}
