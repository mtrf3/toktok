package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.AbstractC73672Svk;
import X.C00F;
import X.C237299Sz;
import X.C58096Mr6;
import X.C9R5;
import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.VideoTrendingTopicApi;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoTrendingTopicServiceImpl implements IVideoTrendingTopicService {
    public static IVideoTrendingTopicService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IVideoTrendingTopicService.class, false);
        if (LIZ != null) {
            return (IVideoTrendingTopicService) LIZ;
        }
        if (C58096Mr6.B7 == null) {
            synchronized (IVideoTrendingTopicService.class) {
                if (C58096Mr6.B7 == null) {
                    C58096Mr6.B7 = new VideoTrendingTopicServiceImpl();
                }
            }
        }
        return C58096Mr6.B7;
    }

    @Override // com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService
    public final boolean LIZIZ() {
        if (C00F.LIZ(31744, 0, "enable_link_trending_topic_mode", true) != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService
    public final boolean LIZJ() {
        if (C00F.LIZ(31744, 0, "enable_link_trending_topic_mode", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService
    public final AbstractC73672Svk<TrendingTopicSettingResponse> getTrendingTopicSetting() {
        VideoTrendingTopicApi.LIZ.getClass();
        return C237299Sz.LIZ().getTrendingTopicSetting();
    }

    @Override // com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService
    public final void LIZ(Context context, String str, String str2, VideoTrendingTopic videoTrendingTopic, OnActivityResultCallback onActivityResultCallback) {
        o.LJIIIZ(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//trends/video");
        buildRoute.withParam("init_config", new C9R5("video_post_page", str, str2, videoTrendingTopic));
        buildRoute.open(11, onActivityResultCallback);
    }
}
