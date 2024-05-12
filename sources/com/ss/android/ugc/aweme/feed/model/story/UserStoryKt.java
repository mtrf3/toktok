package com.ss.android.ugc.aweme.feed.model.story;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserStoryKt {
    public static final UserStory copyAll(UserStory userStory) {
        UserStoryCurrentInfo userStoryCurrentInfo;
        o.LJIIIZ(userStory, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(userStory.getStories());
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            userStoryCurrentInfo = UserStoryCurrentInfo.copy$default(currentInfo, null, null, 0, 7, null);
        } else {
            userStoryCurrentInfo = null;
        }
        return UserStory.copy$default(userStory, arrayList, 0L, 0L, false, 0L, 0L, false, false, 0L, false, null, false, 0L, userStoryCurrentInfo, false, false, null, 0, false, 516094, null);
    }

    public static final UserStory copyUserStory(UserStory userStory) {
        if (userStory != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(userStory.getStories());
            return UserStory.copy$default(userStory, arrayList, 0L, 0L, false, 0L, 0L, false, false, 0L, false, null, false, 0L, null, false, false, null, 0, false, 524286, null);
        }
        return null;
    }

    public static final Integer currentIndex(UserStory userStory) {
        o.LJIIIZ(userStory, "<this>");
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            return currentInfo.getCurrentIndex();
        }
        return null;
    }

    public static final Aweme currentStory(UserStory userStory) {
        o.LJIIIZ(userStory, "<this>");
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            return currentInfo.getCurrentStory();
        }
        return null;
    }

    public static final UserStory update(UserStory userStory, UserStory userStory2) {
        UserStoryCurrentInfo userStoryCurrentInfo;
        o.LJIIIZ(userStory, "<this>");
        if (userStory2 == null) {
            return userStory;
        }
        List<Aweme> stories = userStory.getStories();
        stories.clear();
        stories.addAll(userStory2.getStories());
        userStory.setTotalCount(userStory2.getTotalCount());
        userStory.setCurrentPosition(userStory2.getCurrentPosition());
        userStory.setAllViewed(userStory2.getAllViewed());
        userStory.setMinCursor(userStory2.getMinCursor());
        userStory.setMaxCursor(userStory2.getMaxCursor());
        userStory.setHasMoreAfter(userStory2.getHasMoreBefore());
        userStory.setHasMoreBefore(userStory2.getHasMoreBefore());
        userStory.setLastStoryCreatedAt(userStory2.getLastStoryCreatedAt());
        UserStoryCurrentInfo currentInfo = userStory2.getCurrentInfo();
        UserStoryCurrentInfo userStoryCurrentInfo2 = null;
        if (currentInfo != null) {
            userStoryCurrentInfo = UserStoryCurrentInfo.copy$default(currentInfo, null, null, 0, 7, null);
        } else {
            userStoryCurrentInfo = null;
        }
        userStory.setCurrentInfo(userStoryCurrentInfo);
        UserStoryCurrentInfo maxViewedInfo = userStory2.getMaxViewedInfo();
        if (maxViewedInfo != null) {
            userStoryCurrentInfo2 = UserStoryCurrentInfo.copy$default(maxViewedInfo, null, null, 0, 7, null);
        }
        userStory.setMaxViewedInfo(userStoryCurrentInfo2);
        userStory.setFirstUnViewedStoryIdx(userStory2.getFirstUnViewedStoryIdx());
        userStory.setShouldStartFromUnViewedStoryIdx(userStory2.getShouldStartFromUnViewedStoryIdx());
        return userStory;
    }
}
