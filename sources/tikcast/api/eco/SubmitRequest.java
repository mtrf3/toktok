package tikcast.api.eco;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class SubmitRequest {

    @InterfaceC65349Pkn("anchor_id")
    public long anchorId;

    @InterfaceC65349Pkn("detector_user_id")
    public long detectorUserId;

    @InterfaceC65349Pkn("report_time")
    public long reportTime;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("screenshot_url")
    public String screenshotUrl = "";

    @InterfaceC65349Pkn("answers")
    public List<Answer> answers = new ArrayList();
}
