package com.ss.android.ugc.aweme.story.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryViewerListResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("viewer_list")
    public final List<StoryInteractionUser> interactionUserList;

    @InterfaceC65349Pkn("next_cursor")
    public final long nextCursor;

    @InterfaceC65349Pkn("story_analytics")
    public final StoryAnalytics storyAnalytics;

    @InterfaceC65349Pkn("total_views")
    public final long total;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryViewerListResponse)) {
            return false;
        }
        StoryViewerListResponse storyViewerListResponse = (StoryViewerListResponse) obj;
        return this.total == storyViewerListResponse.total && this.hasMore == storyViewerListResponse.hasMore && this.nextCursor == storyViewerListResponse.nextCursor && o.LJ(this.interactionUserList, storyViewerListResponse.interactionUserList) && o.LJ(this.storyAnalytics, storyViewerListResponse.storyAnalytics);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryViewerListResponse(total=");
        LIZ.append(this.total);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", nextCursor=");
        LIZ.append(this.nextCursor);
        LIZ.append(", interactionUserList=");
        LIZ.append(this.interactionUserList);
        LIZ.append(", storyAnalytics=");
        LIZ.append(this.storyAnalytics);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LLJIJIL = C16880lQ.LLJIJIL(this.total) * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LIZJ = JBR.LIZJ(this.nextCursor, (LLJIJIL + i) * 31, 31);
        List<StoryInteractionUser> list = this.interactionUserList;
        int i2 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i3 = (LIZJ + hashCode) * 31;
        StoryAnalytics storyAnalytics = this.storyAnalytics;
        if (storyAnalytics != null) {
            i2 = storyAnalytics.hashCode();
        }
        return i3 + i2;
    }

    public StoryViewerListResponse(long j, boolean z, long j2, List<StoryInteractionUser> list, StoryAnalytics storyAnalytics) {
        this.total = j;
        this.hasMore = z;
        this.nextCursor = j2;
        this.interactionUserList = list;
        this.storyAnalytics = storyAnalytics;
    }
}
