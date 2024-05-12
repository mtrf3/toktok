package com.ss.android.ugc.aweme.feed.model.story;

import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class UserStoryCurrentInfo implements Serializable {
    public final Integer currentIndex;
    public final Aweme currentStory;
    public final int dispatchCode;

    /* JADX WARN: Multi-variable type inference failed */
    public UserStoryCurrentInfo() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserStoryCurrentInfo copy$default(UserStoryCurrentInfo userStoryCurrentInfo, Integer num, Aweme aweme, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = userStoryCurrentInfo.currentIndex;
        }
        if ((i2 & 2) != 0) {
            aweme = userStoryCurrentInfo.currentStory;
        }
        if ((i2 & 4) != 0) {
            i = userStoryCurrentInfo.dispatchCode;
        }
        return userStoryCurrentInfo.copy(num, aweme, i);
    }

    public final UserStoryCurrentInfo copy(Integer num, Aweme aweme, int i) {
        return new UserStoryCurrentInfo(num, aweme, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStoryCurrentInfo)) {
            return false;
        }
        UserStoryCurrentInfo userStoryCurrentInfo = (UserStoryCurrentInfo) obj;
        return o.LJ(this.currentIndex, userStoryCurrentInfo.currentIndex) && o.LJ(this.currentStory, userStoryCurrentInfo.currentStory) && this.dispatchCode == userStoryCurrentInfo.dispatchCode;
    }

    public int hashCode() {
        Integer num = this.currentIndex;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Aweme aweme = this.currentStory;
        return ((hashCode + (aweme != null ? aweme.hashCode() : 0)) * 31) + this.dispatchCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserStoryCurrentInfo(currentIndex=");
        LIZ.append(this.currentIndex);
        LIZ.append(", currentStory=");
        LIZ.append(this.currentStory);
        LIZ.append(", dispatchCode=");
        return b0.LIZJ(LIZ, this.dispatchCode, ')', LIZ);
    }

    public final Integer getCurrentIndex() {
        return this.currentIndex;
    }

    public final Aweme getCurrentStory() {
        return this.currentStory;
    }

    public final int getDispatchCode() {
        return this.dispatchCode;
    }

    public UserStoryCurrentInfo(Integer num, Aweme aweme, int i) {
        this.currentIndex = num;
        this.currentStory = aweme;
        this.dispatchCode = i;
    }

    public /* synthetic */ UserStoryCurrentInfo(Integer num, Aweme aweme, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : aweme, (i2 & 4) != 0 ? 0 : i);
    }
}
