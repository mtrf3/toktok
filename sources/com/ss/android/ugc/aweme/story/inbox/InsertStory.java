package com.ss.android.ugc.aweme.story.inbox;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class InsertStory extends F9E implements Serializable {

    @InterfaceC65349Pkn("story_id")
    public final long storyId;

    @InterfaceC65349Pkn("user_id")
    public final long userId;

    public static /* synthetic */ InsertStory copy$default(InsertStory insertStory, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = insertStory.userId;
        }
        if ((i & 2) != 0) {
            j2 = insertStory.storyId;
        }
        return insertStory.copy(j, j2);
    }

    public final InsertStory copy(long j, long j2) {
        return new InsertStory(j, j2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.userId), Long.valueOf(this.storyId)};
    }

    public final long getStoryId() {
        return this.storyId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public InsertStory(long j, long j2) {
        this.userId = j;
        this.storyId = j2;
    }
}
