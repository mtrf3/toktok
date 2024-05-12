package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class NoticeAckPayload implements Serializable {

    @InterfaceC65349Pkn("activity_status_switch")
    public final Integer activityStatusSwitch;

    @InterfaceC65349Pkn("group_user_recommendation_report_ack")
    public final GroupUserRecommendationAck userRecommendationAck;

    /* JADX WARN: Multi-variable type inference failed */
    public NoticeAckPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer getActivityStatusSwitch() {
        return this.activityStatusSwitch;
    }

    public final GroupUserRecommendationAck getUserRecommendationAck() {
        return this.userRecommendationAck;
    }

    public NoticeAckPayload(GroupUserRecommendationAck groupUserRecommendationAck, Integer num) {
        this.userRecommendationAck = groupUserRecommendationAck;
        this.activityStatusSwitch = num;
    }

    public /* synthetic */ NoticeAckPayload(GroupUserRecommendationAck groupUserRecommendationAck, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : groupUserRecommendationAck, (i & 2) != 0 ? null : num);
    }
}
