package com.bytedance.android.live.broadcast.model;

import X.C1GM;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class AcademyCourseTheme extends F9E {

    @InterfaceC65349Pkn("claimed_reward_time")
    public final long claimedRewardTime;

    @InterfaceC65349Pkn("completed_time")
    public final long completedTime;

    @InterfaceC65349Pkn("cover")
    public final String cover;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("reward")
    public final C1GM reward;

    @InterfaceC65349Pkn("series_id")
    public final long seriesId;

    @InterfaceC65349Pkn("show_video_survey")
    public final boolean showVideoSurvey;

    @InterfaceC65349Pkn("status")
    public final int status;

    @InterfaceC65349Pkn("tasks")
    public final List<Object> tasks;

    @InterfaceC65349Pkn("video_survey")
    public final AcademySurveyQuestion videoSurvey;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.id), Long.valueOf(this.seriesId), this.name, this.cover, Integer.valueOf(this.status), this.description, null, Long.valueOf(this.completedTime), Long.valueOf(this.claimedRewardTime), this.tasks, Boolean.valueOf(this.showVideoSurvey), this.videoSurvey};
    }

    public AcademyCourseTheme(long j, long j2, String name, String cover, int i, String description, C1GM reward, long j3, long j4, List<Object> tasks, boolean z, AcademySurveyQuestion videoSurvey) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(cover, "cover");
        o.LJIIIZ(description, "description");
        o.LJIIIZ(reward, "reward");
        o.LJIIIZ(tasks, "tasks");
        o.LJIIIZ(videoSurvey, "videoSurvey");
        this.id = j;
        this.seriesId = j2;
        this.name = name;
        this.cover = cover;
        this.status = i;
        this.description = description;
        this.completedTime = j3;
        this.claimedRewardTime = j4;
        this.tasks = tasks;
        this.showVideoSurvey = z;
        this.videoSurvey = videoSurvey;
    }
}
