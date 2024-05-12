package com.ss.android.ugc.aweme.story.archive.model;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StoryArchiveList extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("items")
    public final List<Aweme> items;

    @InterfaceC65349Pkn("max_cursor")
    public final long maxCursor;

    @InterfaceC65349Pkn("min_cursor")
    public final long minCursor;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryArchiveList copy$default(StoryArchiveList storyArchiveList, List list, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = storyArchiveList.items;
        }
        if ((i & 2) != 0) {
            j = storyArchiveList.minCursor;
        }
        if ((i & 4) != 0) {
            j2 = storyArchiveList.maxCursor;
        }
        if ((i & 8) != 0) {
            z = storyArchiveList.hasMore;
        }
        return storyArchiveList.copy(list, j, j2, z);
    }

    public final StoryArchiveList copy(List<Aweme> list, long j, long j2, boolean z) {
        return new StoryArchiveList(list, j, j2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryArchiveList)) {
            return false;
        }
        StoryArchiveList storyArchiveList = (StoryArchiveList) obj;
        return o.LJ(this.items, storyArchiveList.items) && this.minCursor == storyArchiveList.minCursor && this.maxCursor == storyArchiveList.maxCursor && this.hasMore == storyArchiveList.hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        List<Aweme> list = this.items;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.maxCursor, JBR.LIZJ(this.minCursor, hashCode * 31, 31), 31);
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZJ + i;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryArchiveList(items=");
        LIZ.append(this.items);
        LIZ.append(", minCursor=");
        LIZ.append(this.minCursor);
        LIZ.append(", maxCursor=");
        LIZ.append(this.maxCursor);
        LIZ.append(", hasMore=");
        return C48339Iy7.LIZJ(LIZ, this.hasMore, ')', LIZ);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public StoryArchiveList(List<Aweme> list, long j, long j2, boolean z) {
        this.items = list;
        this.minCursor = j;
        this.maxCursor = j2;
        this.hasMore = z;
    }
}
