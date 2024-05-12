package com.ss.android.ugc.aweme.model;

import X.C770830u;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StoryWidgetModel extends BaseResponse {

    @InterfaceC65349Pkn("has_story_in_feed")
    public final boolean hasStoryInFeed;

    @InterfaceC65349Pkn("story_info")
    public final Aweme storyInfo;

    public static /* synthetic */ StoryWidgetModel copy$default(StoryWidgetModel storyWidgetModel, boolean z, Aweme aweme, int i, Object obj) {
        if ((i & 1) != 0) {
            z = storyWidgetModel.hasStoryInFeed;
        }
        if ((i & 2) != 0) {
            aweme = storyWidgetModel.storyInfo;
        }
        return storyWidgetModel.copy(z, aweme);
    }

    public final StoryWidgetModel copy(boolean z, Aweme aweme) {
        return new StoryWidgetModel(z, aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryWidgetModel)) {
            return false;
        }
        StoryWidgetModel storyWidgetModel = (StoryWidgetModel) obj;
        return this.hasStoryInFeed == storyWidgetModel.hasStoryInFeed && o.LJ(this.storyInfo, storyWidgetModel.storyInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.hasStoryInFeed;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Aweme aweme = this.storyInfo;
        return i + (aweme == null ? 0 : aweme.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryWidgetModel(hasStoryInFeed=");
        LIZ.append(this.hasStoryInFeed);
        LIZ.append(", storyInfo=");
        return C770830u.LIZ(LIZ, this.storyInfo, ')', LIZ);
    }

    public final boolean getHasStoryInFeed() {
        return this.hasStoryInFeed;
    }

    public final Aweme getStoryInfo() {
        return this.storyInfo;
    }

    public StoryWidgetModel(boolean z, Aweme aweme) {
        this.hasStoryInFeed = z;
        this.storyInfo = aweme;
    }
}
