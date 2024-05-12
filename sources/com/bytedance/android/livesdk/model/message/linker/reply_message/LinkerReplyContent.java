package com.bytedance.android.livesdk.model.message.linker.reply_message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.message.LinkmicUserInfo;
import com.bytedance.android.livesdk.model.message.linker.mic_update.LinkerMicIdxUpdateInfo;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes14.dex */
public class LinkerReplyContent {

    @InterfaceC65349Pkn("action_id")
    public Long actionId;

    @InterfaceC65349Pkn("to_user_linkmic_info")
    public LinkmicInfo inviteeLinkmicInfo;

    @InterfaceC65349Pkn("invitee_mic_idx_update_info")
    public LinkerMicIdxUpdateInfo inviteeMicIdxUpdateInfo;

    @InterfaceC65349Pkn("to_user_id")
    public long inviteeUid;

    @InterfaceC65349Pkn("to_user")
    public User inviteeUser;

    @InterfaceC65349Pkn("from_user_linkmic_info")
    public LinkmicInfo inviterLinkmicInfo;

    @InterfaceC65349Pkn("from_room_id")
    public long inviterRoomId;

    @InterfaceC65349Pkn("from_user_id")
    public long inviterUid;

    @InterfaceC65349Pkn("from_user")
    public User inviterUser;

    @InterfaceC65349Pkn("link_type")
    public long linkType;

    @InterfaceC65349Pkn("linked_users")
    public List<LinkmicUserInfo> linkedUsers;

    @InterfaceC65349Pkn("linker_setting")
    public LinkerSetting linkerSetting;

    @InterfaceC65349Pkn("anchor_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveSetting;

    @InterfaceC65349Pkn("reply_status")
    public int replyStatus;

    @InterfaceC65349Pkn("source_type")
    public long sourceType;

    @InterfaceC65349Pkn("rtc_ext_info_map")
    public HashMap<Long, String> rtcExtInfoMap = new HashMap<>();

    @InterfaceC65349Pkn("applier_mic_idx_info_map")
    public HashMap<Long, Long> applierMicIdxInfoMap = new HashMap<>();

    @InterfaceC65349Pkn("anchor_multi_live_enum")
    public int multiLiveLayoutEnable = 0;
}
