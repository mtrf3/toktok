package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.Map;

/* loaded from: classes6.dex */
public class OfficialChannelInfo {

    @InterfaceC65349Pkn("backup_room_id")
    public long backupRoomId;

    @InterfaceC65349Pkn("backup_room_id_str")
    public String backupRoomIdStr;

    @InterfaceC65349Pkn("event_name")
    public String channelName;

    @InterfaceC65349Pkn("channel_user")
    public User channelUser;

    @InterfaceC65349Pkn("delay_enter_time")
    public Map<Long, Long> delayEnterTime;

    @InterfaceC65349Pkn("end_timestamp")
    public long endTimeStamp;

    @InterfaceC65349Pkn("exist_linkmic")
    public boolean existLinkmic;

    @InterfaceC65349Pkn("forbidden_before_end")
    public long forbiddenBeforeEnd;

    @InterfaceC65349Pkn("linkmic_type")
    public int linkmicType;

    @InterfaceC65349Pkn("max_next_time")
    public long maxNextTime;

    @InterfaceC65349Pkn("role_type")
    public int roleType;

    @InterfaceC65349Pkn("start_timestamp")
    public long startTimeStamp;
}
