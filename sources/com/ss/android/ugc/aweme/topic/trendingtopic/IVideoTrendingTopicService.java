package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.AbstractC73672Svk;
import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;

/* loaded from: classes5.dex */
public interface IVideoTrendingTopicService {
    void LIZ(Context context, String str, String str2, VideoTrendingTopic videoTrendingTopic, OnActivityResultCallback onActivityResultCallback);

    boolean LIZIZ();

    boolean LIZJ();

    AbstractC73672Svk<TrendingTopicSettingResponse> getTrendingTopicSetting();
}
