package webcast.data;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;

/* loaded from: classes14.dex */
public final class RealtimeViolationRecord {

    @InterfaceC65349Pkn("appeal_info")
    public AppealInfo appealInfo;

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punishInfo;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("title")
    public String title = "";

    @InterfaceC65349Pkn("reason")
    public String reason = "";

    @InterfaceC65349Pkn("suggestion")
    public String suggestion = "";

    @InterfaceC65349Pkn("issue_time_text")
    public String issueTimeText = "";
}
