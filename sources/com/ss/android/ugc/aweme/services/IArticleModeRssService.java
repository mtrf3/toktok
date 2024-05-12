package com.ss.android.ugc.aweme.services;

import X.C76800UCe;
import X.C9G2;
import X.InterfaceC88472Yns;
import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;

/* loaded from: classes5.dex */
public interface IArticleModeRssService {
    void fetchRssUser(Context context, InterfaceC88472Yns<? super C9G2, C76800UCe> interfaceC88472Yns);

    boolean getHasRssEntrypointClicked();

    boolean isArticleRssCreationEnabled();

    void markRssEntrypointClicked();

    void openRssFeed(Context context, String str, String str2);

    void openRssLinkFlow(Context context, String str, String str2, OnActivityResultCallback onActivityResultCallback);

    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void openRssLinkFlow$default(IArticleModeRssService iArticleModeRssService, Context context, String str, String str2, OnActivityResultCallback onActivityResultCallback, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "";
                }
                if ((i & 8) != 0) {
                    onActivityResultCallback = null;
                }
                iArticleModeRssService.openRssLinkFlow(context, str, str2, onActivityResultCallback);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openRssLinkFlow");
        }
    }
}
