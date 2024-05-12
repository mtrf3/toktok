package com.ss.android.ugc.aweme.feed.model.story;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class StoryKt {
    public static final Story copyStory(Story story) {
        if (story != null) {
            return Story.copy$default(story, 0L, false, 0L, false, false, 0L, false, false, false, 511, null);
        }
        return null;
    }

    public static final boolean isExpired(Story story) {
        o.LJIIIZ(story, "<this>");
        if (story.getExpiredAt() < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public static final boolean isStoryV2(Story story) {
        o.LJIIIZ(story, "<this>");
        if (story.getStoryStyleVersion() == 2) {
            return true;
        }
        return false;
    }
}
