package com.ss.android.ugc.aweme.topic.review.model;

import X.C48339Iy7;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicReview implements Serializable {
    public final transient boolean LJLIL;

    @InterfaceC65349Pkn("digg_count")
    public final int diggCount;

    @InterfaceC65349Pkn("review_id")
    public final String reviewId;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("topic_id")
    public final String topicId;

    @InterfaceC65349Pkn("topic_rating")
    public final int topicRating;

    @InterfaceC65349Pkn("topic_type")
    public final int topicType;

    @InterfaceC65349Pkn("update_time")
    public final long updateTime;

    @InterfaceC65349Pkn("user")
    public final User user;

    @InterfaceC65349Pkn("user_digged")
    public final boolean userDigged;

    public static /* synthetic */ TopicReview copy$default(TopicReview topicReview, String str, int i, String str2, int i2, String str3, int i3, boolean z, long j, User user, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = topicReview.topicId;
        }
        if ((i4 & 2) != 0) {
            i = topicReview.topicType;
        }
        if ((i4 & 4) != 0) {
            str2 = topicReview.reviewId;
        }
        if ((i4 & 8) != 0) {
            i2 = topicReview.topicRating;
        }
        if ((i4 & 16) != 0) {
            str3 = topicReview.text;
        }
        if ((i4 & 32) != 0) {
            i3 = topicReview.diggCount;
        }
        if ((i4 & 64) != 0) {
            z = topicReview.userDigged;
        }
        if ((i4 & 128) != 0) {
            j = topicReview.updateTime;
        }
        if ((i4 & 256) != 0) {
            user = topicReview.user;
        }
        if ((i4 & 512) != 0) {
            z2 = topicReview.LJLIL;
        }
        return topicReview.copy(str, i, str2, i2, str3, i3, z, j, user, z2);
    }

    public final TopicReview copy(String topicId, int i, String reviewId, int i2, String str, int i3, boolean z, long j, User user, boolean z2) {
        o.LJIIIZ(topicId, "topicId");
        o.LJIIIZ(reviewId, "reviewId");
        o.LJIIIZ(user, "user");
        return new TopicReview(topicId, i, reviewId, i2, str, i3, z, j, user, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicReview)) {
            return false;
        }
        TopicReview topicReview = (TopicReview) obj;
        return o.LJ(this.topicId, topicReview.topicId) && this.topicType == topicReview.topicType && o.LJ(this.reviewId, topicReview.reviewId) && this.topicRating == topicReview.topicRating && o.LJ(this.text, topicReview.text) && this.diggCount == topicReview.diggCount && this.userDigged == topicReview.userDigged && this.updateTime == topicReview.updateTime && o.LJ(this.user, topicReview.user) && this.LJLIL == topicReview.LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.reviewId, ((this.topicId.hashCode() * 31) + this.topicType) * 31, 31) + this.topicRating) * 31;
        String str = this.text;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (((LJ + hashCode) * 31) + this.diggCount) * 31;
        boolean z = this.userDigged;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int hashCode2 = (this.user.hashCode() + JBR.LIZJ(this.updateTime, (i + i3) * 31, 31)) * 31;
        if (!this.LJLIL) {
            i2 = 0;
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopicReview(topicId=");
        LIZ.append(this.topicId);
        LIZ.append(", topicType=");
        LIZ.append(this.topicType);
        LIZ.append(", reviewId=");
        LIZ.append(this.reviewId);
        LIZ.append(", topicRating=");
        LIZ.append(this.topicRating);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", diggCount=");
        LIZ.append(this.diggCount);
        LIZ.append(", userDigged=");
        LIZ.append(this.userDigged);
        LIZ.append(", updateTime=");
        LIZ.append(this.updateTime);
        LIZ.append(", user=");
        LIZ.append(this.user);
        LIZ.append(", isMocked=");
        return C48339Iy7.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final int getDiggCount() {
        return this.diggCount;
    }

    public final String getReviewId() {
        return this.reviewId;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTopicId() {
        return this.topicId;
    }

    public final int getTopicRating() {
        return this.topicRating;
    }

    public final int getTopicType() {
        return this.topicType;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean getUserDigged() {
        return this.userDigged;
    }

    public final boolean isMocked() {
        return this.LJLIL;
    }

    public TopicReview(String topicId, int i, String reviewId, int i2, String str, int i3, boolean z, long j, User user, boolean z2) {
        o.LJIIIZ(topicId, "topicId");
        o.LJIIIZ(reviewId, "reviewId");
        o.LJIIIZ(user, "user");
        this.topicId = topicId;
        this.topicType = i;
        this.reviewId = reviewId;
        this.topicRating = i2;
        this.text = str;
        this.diggCount = i3;
        this.userDigged = z;
        this.updateTime = j;
        this.user = user;
        this.LJLIL = z2;
    }

    public /* synthetic */ TopicReview(String str, int i, String str2, int i2, String str3, int i3, boolean z, long j, User user, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, i2, str3, i3, z, j, user, (i4 & 512) != 0 ? false : z2);
    }
}
