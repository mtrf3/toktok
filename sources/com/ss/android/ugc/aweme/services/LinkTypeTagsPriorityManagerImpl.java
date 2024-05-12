package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.C59646Nb0;
import X.C63077OpF;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class LinkTypeTagsPriorityManagerImpl implements ILinkTypeTagsPriorityManager {
    public static final int $stable = 0;

    public static ILinkTypeTagsPriorityManager createILinkTypeTagsPriorityManagerbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ILinkTypeTagsPriorityManager.class, z);
        if (LIZ != null) {
            return (ILinkTypeTagsPriorityManager) LIZ;
        }
        return new LinkTypeTagsPriorityManagerImpl();
    }

    @Override // com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public boolean shouldShowAnchor(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && awemeRawAd.getDouPlusLinkData() != null) {
            return false;
        }
        LinkData LIZ = C63077OpF.LIZ(aweme);
        if (LIZ != null && LIZ.showOnFeed()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public boolean shouldShowCommerce(Aweme aweme, boolean z, int i) {
        return C59646Nb0.LIZIZ(aweme, z, i, "shopping_cart");
    }

    @Override // com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public boolean shouldShowMovie(Aweme aweme, boolean z, int i) {
        return C59646Nb0.LIZIZ(aweme, z, i, "movie");
    }

    @Override // com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public boolean shouldShowOpenPlatform(Aweme aweme, boolean z, int i) {
        return C59646Nb0.LIZIZ(aweme, z, i, "open_platform");
    }

    @Override // com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public boolean shouldShowSticker(Aweme aweme, boolean z, int i) {
        return C59646Nb0.LIZIZ(aweme, z, i, "sticker");
    }
}
