package tikcast.api.eco;

import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class AppealDetail {

    @InterfaceC65349Pkn("is_appealed")
    public boolean isAppealed;

    @InterfaceC65349Pkn("penalty_time")
    public long penaltyTime;

    @InterfaceC65349Pkn("restore_time")
    public long restoreTime;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public long scene;

    @InterfaceC65349Pkn("show_appeal_button")
    public boolean showAppealButton;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    @InterfaceC65349Pkn("violation_reason")
    public List<String> violationReason = new ArrayList();

    @InterfaceC65349Pkn("subfeature_name")
    public String subfeatureName = "";

    @InterfaceC65349Pkn("violation_type")
    public String violationType = "";

    @InterfaceC65349Pkn("rank_details")
    public List<RankDetail> rankDetails = new ArrayList();
}
