package webcast.data;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class MultiGuestLinkmicInfo {

    @InterfaceC65349Pkn("request_user_status")
    public int requestUserStatus;

    @InterfaceC65349Pkn("linked_users")
    public List<ListUser> linkedUsers = new ArrayList();

    @InterfaceC65349Pkn("fan_ticket_icon_url")
    public String fanTicketIconUrl = "";

    /* loaded from: classes14.dex */
    public static final class ListUser {

        @InterfaceC65349Pkn("fan_ticket")
        public long fanTicket;

        @InterfaceC65349Pkn("fan_ticket_icon_type")
        public int fanTicketIconType;

        @InterfaceC65349Pkn("linkmic_id_str")
        public String linkmicIdStr = "";

        @InterfaceC65349Pkn("modify_time")
        public long modifyTime;

        @InterfaceC65349Pkn("role_type")
        public int roleType;

        @InterfaceC65349Pkn("user")
        public User user;
    }
}
