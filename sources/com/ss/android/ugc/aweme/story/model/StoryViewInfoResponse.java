package com.ss.android.ugc.aweme.story.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class StoryViewInfoResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("play_vv")
    public final long playVideoViewers;

    public StoryViewInfoResponse() {
        this(0L, 1, null);
    }

    public static /* synthetic */ StoryViewInfoResponse copy$default(StoryViewInfoResponse storyViewInfoResponse, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = storyViewInfoResponse.playVideoViewers;
        }
        return storyViewInfoResponse.copy(j);
    }

    public final StoryViewInfoResponse copy(long j) {
        return new StoryViewInfoResponse(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StoryViewInfoResponse) {
            return C78966Uyw.LJIIIZ(((StoryViewInfoResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.playVideoViewers)};
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("StoryViewInfoResponse:%s", getObjects());
    }

    public final long getPlayVideoViewers() {
        return this.playVideoViewers;
    }

    public StoryViewInfoResponse(long j) {
        this.playVideoViewers = j;
    }

    public /* synthetic */ StoryViewInfoResponse(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
