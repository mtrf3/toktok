package com.ss.android.ugc.aweme.audiomode.fullepisodev2.service;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class FullEpisodeRouterServiceImpl implements IFullEpisodeRouterService {
    @Override // com.ss.android.ugc.aweme.audiomode.fullepisodev2.service.IFullEpisodeRouterService
    public final void LIZ(Context context, Aweme aweme, String str) {
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//audiomode/full_episode");
        buildRoute.withParam("init_aweme", aweme);
        buildRoute.withParam("page_enter_from", str);
        buildRoute.open();
    }
}
