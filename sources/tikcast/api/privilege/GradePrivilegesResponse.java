package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class GradePrivilegesResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("tab_list")
        public List<GradeTab> tabList;

        @InterfaceC65349Pkn("user_grade")
        public UserGrade userGrade;
    }
}
