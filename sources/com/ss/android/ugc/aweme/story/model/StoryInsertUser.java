package com.ss.android.ugc.aweme.story.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class StoryInsertUser extends F9E implements Serializable {

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("user_id")
    public final long uid;

    public static /* synthetic */ StoryInsertUser copy$default(StoryInsertUser storyInsertUser, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = storyInsertUser.uid;
        }
        if ((i2 & 2) != 0) {
            i = storyInsertUser.type;
        }
        return storyInsertUser.copy(j, i);
    }

    public final StoryInsertUser copy(long j, int i) {
        return new StoryInsertUser(j, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.uid), Integer.valueOf(this.type)};
    }

    public final int getType() {
        return this.type;
    }

    public final long getUid() {
        return this.uid;
    }

    public StoryInsertUser(long j, int i) {
        this.uid = j;
        this.type = i;
    }
}
