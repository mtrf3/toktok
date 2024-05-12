package com.ss.android.ugc.aweme.story.inbox;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGetFeedByPageResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("awemes")
    public final List<Aweme> awemes;

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("skylight_story_users")
    public final List<SkylightStoryUser> skylightStoryUsers;

    @InterfaceC65349Pkn("total_count")
    public final long totalCnt;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryGetFeedByPageResponse copy$default(StoryGetFeedByPageResponse storyGetFeedByPageResponse, List list, boolean z, long j, long j2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = storyGetFeedByPageResponse.awemes;
        }
        if ((i & 2) != 0) {
            z = storyGetFeedByPageResponse.hasMore;
        }
        if ((i & 4) != 0) {
            j = storyGetFeedByPageResponse.cursor;
        }
        if ((i & 8) != 0) {
            j2 = storyGetFeedByPageResponse.totalCnt;
        }
        if ((i & 16) != 0) {
            list2 = storyGetFeedByPageResponse.skylightStoryUsers;
        }
        return storyGetFeedByPageResponse.copy(list, z, j, j2, list2);
    }

    public final StoryGetFeedByPageResponse copy(List<? extends Aweme> list, boolean z, long j, long j2, List<SkylightStoryUser> list2) {
        return new StoryGetFeedByPageResponse(list, z, j, j2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryGetFeedByPageResponse)) {
            return false;
        }
        StoryGetFeedByPageResponse storyGetFeedByPageResponse = (StoryGetFeedByPageResponse) obj;
        return o.LJ(this.awemes, storyGetFeedByPageResponse.awemes) && this.hasMore == storyGetFeedByPageResponse.hasMore && this.cursor == storyGetFeedByPageResponse.cursor && this.totalCnt == storyGetFeedByPageResponse.totalCnt && o.LJ(this.skylightStoryUsers, storyGetFeedByPageResponse.skylightStoryUsers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        List<Aweme> list = this.awemes;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        boolean z = this.hasMore;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int LIZJ = JBR.LIZJ(this.totalCnt, JBR.LIZJ(this.cursor, (i2 + i3) * 31, 31), 31);
        List<SkylightStoryUser> list2 = this.skylightStoryUsers;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return LIZJ + i;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryGetFeedByPageResponse(awemes=");
        LIZ.append(this.awemes);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", totalCnt=");
        LIZ.append(this.totalCnt);
        LIZ.append(", skylightStoryUsers=");
        return C1NE.LIZIZ(LIZ, this.skylightStoryUsers, ')', LIZ);
    }

    public final List<Aweme> getAwemes() {
        return this.awemes;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<SkylightStoryUser> getSkylightStoryUsers() {
        return this.skylightStoryUsers;
    }

    public final long getTotalCnt() {
        return this.totalCnt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryGetFeedByPageResponse(List<? extends Aweme> list, boolean z, long j, long j2, List<SkylightStoryUser> list2) {
        this.awemes = list;
        this.hasMore = z;
        this.cursor = j;
        this.totalCnt = j2;
        this.skylightStoryUsers = list2;
    }
}
