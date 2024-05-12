package com.ss.android.ugc.aweme.feed.model.story;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserStoryResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("user_story")
    public final UserStory userStory;

    public static /* synthetic */ UserStoryResponse copy$default(UserStoryResponse userStoryResponse, UserStory userStory, int i, Object obj) {
        if ((i & 1) != 0) {
            userStory = userStoryResponse.userStory;
        }
        return userStoryResponse.copy(userStory);
    }

    private Object[] getObjects() {
        return new Object[]{this.userStory};
    }

    public final UserStoryResponse copy(UserStory userStory) {
        o.LJIIIZ(userStory, "userStory");
        return new UserStoryResponse(userStory);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserStoryResponse) {
            return C78966Uyw.LJIIIZ(((UserStoryResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("UserStoryResponse:%s", getObjects());
    }

    public final UserStory getUserStory() {
        return this.userStory;
    }

    public UserStoryResponse(UserStory userStory) {
        o.LJIIIZ(userStory, "userStory");
        this.userStory = userStory;
    }
}
