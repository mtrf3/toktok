package com.ss.android.ugc.aweme.services.story;

import X.ActivityC45651qj;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;

/* loaded from: classes8.dex */
public interface IStoryGroupScheduleService {
    void clearData(StoryGroupPublishModel storyGroupPublishModel);

    boolean isAllTaskInGroupPublishFinished(StoryGroupPublishModel storyGroupPublishModel);

    boolean retryGroupTask(ActivityC45651qj activityC45651qj, StoryGroupPublishModel storyGroupPublishModel);
}
