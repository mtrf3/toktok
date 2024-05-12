package com.ss.android.ugc.aweme.story.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StoryArchDetailResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("story_archive_detail")
    public final StoryArchDetail detail;

    public static /* synthetic */ StoryArchDetailResponse copy$default(StoryArchDetailResponse storyArchDetailResponse, StoryArchDetail storyArchDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            storyArchDetail = storyArchDetailResponse.detail;
        }
        return storyArchDetailResponse.copy(storyArchDetail);
    }

    public final StoryArchDetailResponse copy(StoryArchDetail storyArchDetail) {
        return new StoryArchDetailResponse(storyArchDetail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryArchDetailResponse) && o.LJ(this.detail, ((StoryArchDetailResponse) obj).detail);
    }

    public int hashCode() {
        StoryArchDetail storyArchDetail = this.detail;
        if (storyArchDetail == null) {
            return 0;
        }
        return storyArchDetail.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryArchDetailResponse(detail=");
        LIZ.append(this.detail);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final StoryArchDetail getDetail() {
        return this.detail;
    }

    public StoryArchDetailResponse(StoryArchDetail storyArchDetail) {
        this.detail = storyArchDetail;
    }
}
