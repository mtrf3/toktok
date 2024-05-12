package com.ss.android.ugc.aweme.story.model;

import X.C16880lQ;
import X.C1NE;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryBulletListResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("interaction_user_list")
    public final List<StoryInteractionUser> interactionUserList;

    @InterfaceC65349Pkn("next_cursor")
    public final long nextCursor;

    @InterfaceC65349Pkn("total")
    public final long total;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryBulletListResponse)) {
            return false;
        }
        StoryBulletListResponse storyBulletListResponse = (StoryBulletListResponse) obj;
        return this.total == storyBulletListResponse.total && this.hasMore == storyBulletListResponse.hasMore && this.nextCursor == storyBulletListResponse.nextCursor && o.LJ(this.interactionUserList, storyBulletListResponse.interactionUserList);
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
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LIZJ + hashCode;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryBulletListResponse(total=");
        LIZ.append(this.total);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", nextCursor=");
        LIZ.append(this.nextCursor);
        LIZ.append(", interactionUserList=");
        return C1NE.LIZIZ(LIZ, this.interactionUserList, ')', LIZ);
    }

    public StoryBulletListResponse(long j, boolean z, long j2, List<StoryInteractionUser> list) {
        this.total = j;
        this.hasMore = z;
        this.nextCursor = j2;
        this.interactionUserList = list;
    }
}
