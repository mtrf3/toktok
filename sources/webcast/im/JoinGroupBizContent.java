package webcast.im;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;

/* loaded from: classes14.dex */
public final class JoinGroupBizContent {

    @InterfaceC65349Pkn("dialog")
    public PerceptionDialogInfo dialog;

    @InterfaceC65349Pkn("from_room_age_restricted")
    public int fromRoomAgeRestricted;

    @InterfaceC65349Pkn("from_tag")
    public RivalExtraInfo.Tag fromTag;

    @InterfaceC65349Pkn("join_group_msg_extra")
    public JoinGroupMessageExtra joinGroupMsgExtra;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punishInfo;

    @InterfaceC65349Pkn("topic_info")
    public CohostTopic topicInfo;
}
