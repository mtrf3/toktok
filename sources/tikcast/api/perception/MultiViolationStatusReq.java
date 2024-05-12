package tikcast.api.perception;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class MultiViolationStatusReq {

    @InterfaceC65349Pkn("anchor_id")
    public long anchorId;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("scenes")
    public List<Integer> scenes = new ArrayList();
}
