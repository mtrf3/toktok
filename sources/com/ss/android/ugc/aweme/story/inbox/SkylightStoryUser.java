package com.ss.android.ugc.aweme.story.inbox;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class SkylightStoryUser extends F9E implements Serializable {

    @InterfaceC65349Pkn("all_viewed")
    public final boolean allViewed;

    @InterfaceC65349Pkn("user_id")
    public final long userId;

    public static /* synthetic */ SkylightStoryUser copy$default(SkylightStoryUser skylightStoryUser, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = skylightStoryUser.userId;
        }
        if ((i & 2) != 0) {
            z = skylightStoryUser.allViewed;
        }
        return skylightStoryUser.copy(j, z);
    }

    public final SkylightStoryUser copy(long j, boolean z) {
        return new SkylightStoryUser(j, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.userId), Boolean.valueOf(this.allViewed)};
    }

    public final boolean getAllViewed() {
        return this.allViewed;
    }

    public final long getUserId() {
        return this.userId;
    }

    public SkylightStoryUser(long j, boolean z) {
        this.userId = j;
        this.allViewed = z;
    }
}
