package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes6.dex */
public final class LineupRoomInfo extends F9E {

    @InterfaceC65349Pkn("backup_room_id")
    public Long backupRoomId;

    @InterfaceC65349Pkn("backup_room_id_str")
    public String backupRoomIdStr;

    @InterfaceC65349Pkn("channel_user")
    public User channelUser;

    @InterfaceC65349Pkn("event_id")
    public Integer eventId;

    @InterfaceC65349Pkn("event_name")
    public String eventName;

    @Override // X.F9E
    public final Object[] getObjects() {
        User user = this.channelUser;
        Integer num = this.eventId;
        String str = this.eventName;
        Long l = this.backupRoomId;
        String str2 = this.backupRoomIdStr;
        return new Object[]{user, user, num, num, str, str, l, l, str2, str2};
    }
}
