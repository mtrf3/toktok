package tikcast.api.eco;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class SubmitFeedbackRequest {

    @InterfaceC65349Pkn("feedback_detail_id")
    public long feedbackDetailId;

    @InterfaceC65349Pkn("feedback_detail_id_list")
    public List<Long> feedbackDetailIdList = new ArrayList();

    @InterfaceC65349Pkn("feedback_type")
    public int feedbackType;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("punish_record_id")
    public long punishRecordId;

    @InterfaceC65349Pkn("submit_feedback_scene")
    public int submitFeedbackScene;

    @InterfaceC65349Pkn("violation_id")
    public long violationId;
}
