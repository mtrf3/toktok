package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicSessionStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import java.util.List;

/* loaded from: classes14.dex */
public class RoomLinkInfo {

    @InterfaceC65349Pkn("multi_live_enum")
    public long MultiLiveType;

    @InterfaceC65349Pkn("audience_id_list")
    public List<Long> audienceIdList;

    @InterfaceC65349Pkn("battle_info")
    public BattleInfoResponse battleInfo;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("channel_info")
    public ChannelInfo channelInfo;

    @InterfaceC65349Pkn("linked_user_list")
    public List<User> linkedUsers;

    @InterfaceC65349Pkn("rival_anchor_id")
    public long rivalAnchorId;

    @InterfaceC65349Pkn("topic_info")
    public CohostTopic topicInfo;

    @InterfaceC65349Pkn("topic_status")
    public TopicSessionStatus topicStatus;
}
