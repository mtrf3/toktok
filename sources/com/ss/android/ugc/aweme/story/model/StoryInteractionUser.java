package com.ss.android.ugc.aweme.story.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryInteractionUser implements Serializable {

    @InterfaceC65349Pkn("interaction")
    public final StoryInteraction storyInteraction;

    @InterfaceC65349Pkn("user_info")
    public final User user;

    public static /* synthetic */ StoryInteractionUser copy$default(StoryInteractionUser storyInteractionUser, User user, StoryInteraction storyInteraction, int i, Object obj) {
        if ((i & 1) != 0) {
            user = storyInteractionUser.user;
        }
        if ((i & 2) != 0) {
            storyInteraction = storyInteractionUser.storyInteraction;
        }
        return storyInteractionUser.copy(user, storyInteraction);
    }

    public final StoryInteractionUser copy(User user, StoryInteraction storyInteraction) {
        return new StoryInteractionUser(user, storyInteraction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryInteractionUser)) {
            return false;
        }
        StoryInteractionUser storyInteractionUser = (StoryInteractionUser) obj;
        return o.LJ(this.user, storyInteractionUser.user) && o.LJ(this.storyInteraction, storyInteractionUser.storyInteraction);
    }

    public int hashCode() {
        User user = this.user;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        StoryInteraction storyInteraction = this.storyInteraction;
        return hashCode + (storyInteraction != null ? storyInteraction.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryInteractionUser(user=");
        LIZ.append(this.user);
        LIZ.append(", storyInteraction=");
        LIZ.append(this.storyInteraction);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final StoryInteraction getStoryInteraction() {
        return this.storyInteraction;
    }

    public final User getUser() {
        return this.user;
    }

    public StoryInteractionUser(User user, StoryInteraction storyInteraction) {
        this.user = user;
        this.storyInteraction = storyInteraction;
    }
}
