package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class GradeInfoResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("grade_config")
        public List<GradeConfig> gradeConfig;

        @InterfaceC65349Pkn("user_grade")
        public UserGrade userGrade;
    }
}
