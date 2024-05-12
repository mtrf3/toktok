package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class DropsTaskEditResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("results")
        public List<TaskResult> results = new ArrayList();
    }

    /* loaded from: classes17.dex */
    public static final class TaskResult {

        @InterfaceC65349Pkn("err_code")
        public long errCode;

        @InterfaceC65349Pkn("task_id")
        public String taskId = "";
    }
}
