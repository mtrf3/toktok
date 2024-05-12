package webcast.api.referral;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class ActivityInfo {

    @InterfaceC65349Pkn("act_end_sec")
    public long actEndSec;

    @InterfaceC65349Pkn("act_start_sec")
    public long actStartSec;

    @InterfaceC65349Pkn("activity_id")
    public long activityId;

    @InterfaceC65349Pkn("activity_status")
    public int activityStatus;

    @InterfaceC65349Pkn("live_duration_sec")
    public long liveDurationSec;

    @InterfaceC65349Pkn("max_bonus")
    public long maxBonus;

    @InterfaceC65349Pkn("max_mentee_spots")
    public long maxMenteeSpots;

    @InterfaceC65349Pkn("relation_duration_sec")
    public long relationDurationSec;

    @InterfaceC65349Pkn("area")
    public String area = "";

    @InterfaceC65349Pkn("mentor_level_tasks")
    public List<LevelTask> mentorLevelTasks = new ArrayList();

    @InterfaceC65349Pkn("mentee_level_tasks")
    public List<LevelTask> menteeLevelTasks = new ArrayList();

    @InterfaceC65349Pkn("extra")
    public String extra = "";
}
