package com.ss.android.ugc.aweme.services;

import X.AJ2;
import X.C221108m2;
import X.C58096Mr6;
import X.C5H3;

/* loaded from: classes11.dex */
public final class ArticleModeServiceImpl implements IArticleModeService {
    public final C5H3 articleRssService$delegate = C221108m2.LIZIZ(ArticleModeServiceImpl$articleRssService$2.INSTANCE);
    public final C5H3 articleAnchorService$delegate = C221108m2.LIZIZ(ArticleModeServiceImpl$articleAnchorService$2.INSTANCE);

    @Override // com.ss.android.ugc.aweme.services.IArticleModeService
    public IArticleModeAnchorService getArticleAnchorService() {
        return (IArticleModeAnchorService) this.articleAnchorService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeService
    public IArticleModeRssService getArticleRssService() {
        return (IArticleModeRssService) this.articleRssService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeService
    public IArticleModeLoggingService getArticleLoggingService() {
        return AJ2.LIZ;
    }

    public static IArticleModeService createIArticleModeServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IArticleModeService.class, z);
        if (LIZ != null) {
            return (IArticleModeService) LIZ;
        }
        if (C58096Mr6.z5 == null) {
            synchronized (IArticleModeService.class) {
                if (C58096Mr6.z5 == null) {
                    C58096Mr6.z5 = new ArticleModeServiceImpl();
                }
            }
        }
        return C58096Mr6.z5;
    }
}
