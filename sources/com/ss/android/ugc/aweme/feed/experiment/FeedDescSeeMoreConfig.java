package com.ss.android.ugc.aweme.feed.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public final class FeedDescSeeMoreConfig extends F9E {

    @InterfaceC65349Pkn("groupId")
    public final int groupId;

    @InterfaceC65349Pkn("opacity")
    public final float opacity;

    public static /* synthetic */ FeedDescSeeMoreConfig copy$default(FeedDescSeeMoreConfig feedDescSeeMoreConfig, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = feedDescSeeMoreConfig.groupId;
        }
        if ((i2 & 2) != 0) {
            f = feedDescSeeMoreConfig.opacity;
        }
        return feedDescSeeMoreConfig.copy(i, f);
    }

    public final FeedDescSeeMoreConfig copy(int i, float f) {
        return new FeedDescSeeMoreConfig(i, f);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.groupId), Float.valueOf(this.opacity)};
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public FeedDescSeeMoreConfig(int i, float f) {
        this.groupId = i;
        this.opacity = f;
    }
}
