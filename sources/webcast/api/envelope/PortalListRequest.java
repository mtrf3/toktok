package webcast.api.envelope;

import X.C278817o;
import X.DIX;
import X.InterfaceC65349Pkn;

/* loaded from: classes13.dex */
public final class PortalListRequest {

    @InterfaceC65349Pkn("anchor_id")
    public long anchorId;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    public final String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", room_id=");
        LIZJ.append(this.roomId);
        LIZJ.append(", anchorId=");
        LIZJ.append(this.anchorId);
        return DIX.LIZLLL(LIZJ, 0, 2, "PortalListRequest{", '}');
    }
}
