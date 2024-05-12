package webcast.api.linkmic;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class ApplyParams extends F9E {

    @InterfaceC65349Pkn("client_log_id")
    public String clientLogId = "";

    @InterfaceC65349Pkn("effective_seconds")
    public Long effectiveSeconds;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("source_type")
    public Long sourceType;

    @InterfaceC65349Pkn("to_room_id")
    public Long toRoomId;

    @InterfaceC65349Pkn("to_user_id")
    public Long toUserId;

    @InterfaceC65349Pkn("transparent_extra")
    public String transparentExtra;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        Long l2 = this.toRoomId;
        Long l3 = this.toUserId;
        Long l4 = this.sourceType;
        Long l5 = this.effectiveSeconds;
        String str = this.transparentExtra;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4, l5, l5, str, str};
    }
}
