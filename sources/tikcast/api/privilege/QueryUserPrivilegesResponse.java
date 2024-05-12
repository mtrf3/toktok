package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class QueryUserPrivilegesResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("privilege_tab_count")
        public int privilegeTabCount;

        @InterfaceC65349Pkn("show_entrance")
        public boolean showEntrance;

        @InterfaceC65349Pkn("tab_list")
        public List<PrivilegeTab> tabList;
    }

    /* loaded from: classes6.dex */
    public static final class PrivilegeTab {

        @InterfaceC65349Pkn("privilege_list")
        public List<UserPrivilege> privilegeList;

        @InterfaceC65349Pkn("tab_name")
        public String tabName = "";

        @InterfaceC65349Pkn("tab_type")
        public int tabType;
    }
}
