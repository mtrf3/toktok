package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.BadgeStruct;

/* loaded from: classes6.dex */
public final class UserGrade {

    @InterfaceC65349Pkn("current_grade")
    public int currentGrade;

    @InterfaceC65349Pkn("current_score")
    public long currentScore;

    @InterfaceC65349Pkn("default_grade_badge")
    public BadgeStruct defaultGradeBadge;

    @InterfaceC65349Pkn("grade_mode")
    public int gradeMode;

    @InterfaceC65349Pkn("grade_score_rule")
    public GradeScoreRule gradeScoreRule;

    @InterfaceC65349Pkn("nick_name")
    public String nickName = "";

    @InterfaceC65349Pkn("opacity_badge")
    public BadgeStruct opacityBadge;

    @InterfaceC65349Pkn("time_to_sleep")
    public int timeToSleep;

    @InterfaceC65349Pkn("version")
    public long version;
}
