package tikcast.api.privilege;

import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class QueryUserPrivilegesRequest {

    @InterfaceC65349Pkn("need_privilege_detail")
    public boolean needPrivilegeDetail;

    @InterfaceC65349Pkn("privilege_type")
    public int privilegeType;

    @InterfaceC65349Pkn("request_from")
    public int requestFrom;

    @InterfaceC65349Pkn("room_id")
    public String roomId = "";

    @InterfaceC65349Pkn("anchor_id")
    public String anchorId = "";

    @InterfaceC65349Pkn("request_scene")
    public String requestScene = "";
}
