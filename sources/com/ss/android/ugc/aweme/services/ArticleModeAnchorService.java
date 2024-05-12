package com.ss.android.ugc.aweme.services;

import X.AbstractC60811Ntn;
import X.AbstractC60815Ntr;
import X.C45804HyK;
import X.C60072Nhs;
import X.InterfaceC60850NuQ;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ArticleModeAnchorService implements IArticleModeAnchorService {
    @Override // com.ss.android.ugc.aweme.services.IArticleModeAnchorService
    public void previewArticle(Context context, String url) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        C45804HyK.LJJJJLI(url, context, false, false, null, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeAnchorService
    public void openAddAnchorFlow(Context context, String str, String str2, String str3) {
        o.LJIIIZ(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://anchor/link");
        buildRoute.withParam("enter_from", str);
        buildRoute.withParam("shoot_way", str2);
        buildRoute.withParam("creation_id", str3);
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeAnchorService
    public void openRelatedArticle(Context context, String url, C60072Nhs articleTitleBarInfo, AbstractC60815Ntr abstractC60815Ntr, AbstractC60811Ntn abstractC60811Ntn, InterfaceC60850NuQ interfaceC60850NuQ) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(articleTitleBarInfo, "articleTitleBarInfo");
        C45804HyK.LJJJJLI(url, context, true, true, articleTitleBarInfo, abstractC60815Ntr, abstractC60811Ntn, interfaceC60850NuQ);
    }
}
