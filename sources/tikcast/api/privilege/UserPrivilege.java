package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.AvatarFrame;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.EntranceEffect;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import java.util.List;

/* loaded from: classes17.dex */
public final class UserPrivilege {

    @InterfaceC65349Pkn("badge")
    public BadgeStruct badge;

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("entrance_effect")
    public EntranceEffect entranceEffect;

    @InterfaceC65349Pkn("faq_info_list")
    public List<PrivilegeFAQ> faqInfoList;

    @InterfaceC65349Pkn("frame")
    public AvatarFrame frame;

    @InterfaceC65349Pkn("is_lock")
    public boolean isLock;

    @InterfaceC65349Pkn("privilege_log_extra")
    public PrivilegeLogExtra privilegeLogExtra;

    @InterfaceC65349Pkn("privilege_type")
    public int privilegeType;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("suite_id")
    public long suiteId;

    @InterfaceC65349Pkn("user_selected")
    public boolean userSelected;

    @InterfaceC65349Pkn("user_id")
    public String userId = "";

    @InterfaceC65349Pkn("privilege_id")
    public String privilegeId = "";

    @InterfaceC65349Pkn("privilege_name")
    public String privilegeName = "";

    @InterfaceC65349Pkn("privilege_desc")
    public String privilegeDesc = "";

    @InterfaceC65349Pkn("suite_id_str")
    public String suiteIdStr = "";
}
