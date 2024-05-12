package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestSetting;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.message.InviteTopHostInfo;
import com.bytedance.android.livesdk.model.message.LinkmicUserInfo;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes14.dex */
public class LinkerInviteContent {

    @InterfaceC65349Pkn("ab_test_setting")
    public List<CohostABTestSetting> abTestSetting;

    @InterfaceC65349Pkn("action_id")
    public Long actionId;

    @InterfaceC65349Pkn("dialog")
    public PerceptionDialogInfo dialogInfo;

    @InterfaceC65349Pkn("inviter_linkmic_id_str")
    public String fromLinkmicIdStr;

    @InterfaceC65349Pkn("from_room_age_restricted")
    public int fromRoomAgeRestricted;

    @InterfaceC65349Pkn("from_room_id")
    public long fromRoomId;

    @InterfaceC65349Pkn("from_top_host_info")
    public InviteTopHostInfo fromTopHostInfo;

    @InterfaceC65349Pkn("from_user_id")
    public long fromUserId;

    @InterfaceC65349Pkn("linked_users")
    public List<LinkmicUserInfo> linkedUsers;

    @InterfaceC65349Pkn("linker_invite_msg_extra")
    public LinkerInviteMessageExtra linkerInviteMsgExtra;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punishEventInfo;

    @InterfaceC65349Pkn("required_mic_idx")
    public Long requiredMicIdx;

    @InterfaceC65349Pkn("rtc_join_channel")
    public boolean rtcJoinChannel;

    @InterfaceC65349Pkn("sec_from_user_id")
    public String secFromUserId;

    @InterfaceC65349Pkn("from_tag")
    public RivalExtraInfo.Tag tag;

    @InterfaceC65349Pkn("to_linkmic_id_str")
    public String toLinkmicIdStr;

    @InterfaceC65349Pkn("to_rtc_ext_info")
    public String toRtcExtInfo;

    @InterfaceC65349Pkn("from_user")
    public User user;

    @InterfaceC65349Pkn("vendor")
    public int vendor;

    @InterfaceC65349Pkn("rtc_ext_info_map")
    public HashMap<Long, String> rtcExtInfoMap = new HashMap<>();

    @InterfaceC65349Pkn("anchor_multi_live_enum")
    public int multiLiveLayoutEnable = 0;

    @InterfaceC65349Pkn("anchor_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveSetting = null;
}
