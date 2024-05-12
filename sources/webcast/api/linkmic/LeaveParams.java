package webcast.api.linkmic;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class LeaveParams extends F9E {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("not_suggest_to_uid")
    public Long notSuggestToUid;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("transparent_extra")
    public String transparentExtra;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.channelId;
        Long l2 = this.roomId;
        Long l3 = this.notSuggestToUid;
        String str = this.transparentExtra;
        return new Object[]{l, l, l2, l2, l3, l3, str, str};
    }
}
