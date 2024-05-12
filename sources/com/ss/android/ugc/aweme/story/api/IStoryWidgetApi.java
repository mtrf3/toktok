package com.ss.android.ugc.aweme.story.api;

import X.E8L;
import X.InterfaceC37276Ek4;
import com.ss.android.ugc.aweme.model.StoryWidgetModel;

/* loaded from: classes7.dex */
public interface IStoryWidgetApi {
    @E8L("/tiktok/v1/story/latest_in_feed")
    InterfaceC37276Ek4<StoryWidgetModel> getStoryLatestInFeed();
}
