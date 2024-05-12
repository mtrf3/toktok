package tikcast.api.eco;

import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class ViolationRecord {

    @InterfaceC65349Pkn("can_feedback")
    public boolean canFeedback;

    @InterfaceC65349Pkn("has_feedback")
    public boolean hasFeedback;

    @InterfaceC65349Pkn("live_info")
    public ViolationRecordLiveInfo liveInfo;

    @InterfaceC65349Pkn("punish_info")
    public ViolationRecordPunishInfo punishInfo;

    @InterfaceC65349Pkn("submitted_feedback_detail_id")
    public long submittedFeedbackDetailId;

    @InterfaceC65349Pkn("violation_id")
    public long violationId;

    @InterfaceC65349Pkn("violation_id_str")
    public String violationIdStr = "";
}
