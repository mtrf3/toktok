package com.ss.android.ugc.aweme.services;

import X.ActivityC45651qj;
import X.C45804HyK;
import X.C65429Pm5;
import X.C76800UCe;
import X.C78613UtF;
import X.C9G2;
import X.C9RR;
import X.C9RT;
import X.HG3;
import X.InterfaceC88472Yns;
import X.RBX;
import X.XKX;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import defpackage.m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ArticleModeRssService implements IArticleModeRssService {
    public static final Companion Companion = new Companion();

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public boolean getHasRssEntrypointClicked() {
        return m0.LIZLLL("article_mode_rss_entrypoint_clicked|", HG3.LJIILL().getCurUserId(), C9RT.LIZ, false);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public void markRssEntrypointClicked() {
        C65429Pm5.LJ("article_mode_rss_entrypoint_clicked|", HG3.LJIILL().getCurUserId(), C9RT.LIZ, true);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public boolean isArticleRssCreationEnabled() {
        if (((Boolean) C9RR.LIZ.getValue()).booleanValue() && ((RBX) HG3.LJIILL()).getCurUser().getAccountType() == 3) {
            return true;
        }
        return false;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public void fetchRssUser(Context context, InterfaceC88472Yns<? super C9G2, C76800UCe> onSuccess) {
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(onSuccess, "onSuccess");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
            XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new ArticleModeRssService$fetchRssUser$1(onSuccess, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public void openRssFeed(Context context, String rssUrl, String enterFrom) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(rssUrl, "rssUrl");
        o.LJIIIZ(enterFrom, "enterFrom");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://rss/feed");
        buildRoute.withParam("rss_url", rssUrl);
        buildRoute.withParam("enter_from", enterFrom);
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public void openRssLinkFlow(Context context, String rssUrl, String enterFrom, OnActivityResultCallback onActivityResultCallback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(rssUrl, "rssUrl");
        o.LJIIIZ(enterFrom, "enterFrom");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://rss/link");
        buildRoute.withParam("rss_url", rssUrl);
        buildRoute.withParam("enter_from", enterFrom);
        buildRoute.open(10001, onActivityResultCallback);
    }
}
