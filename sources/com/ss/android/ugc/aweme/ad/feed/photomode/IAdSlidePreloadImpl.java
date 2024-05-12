package com.ss.android.ugc.aweme.ad.feed.photomode;

import X.C58096Mr6;
import X.NNB;
import com.ss.android.ugc.aweme.ad.feed.slide.IAdSlidePreload;

/* loaded from: classes11.dex */
public final class IAdSlidePreloadImpl implements IAdSlidePreload {
    public static IAdSlidePreload LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAdSlidePreload.class, false);
        if (LIZ != null) {
            return (IAdSlidePreload) LIZ;
        }
        if (C58096Mr6.LJZI == null) {
            synchronized (IAdSlidePreload.class) {
                if (C58096Mr6.LJZI == null) {
                    C58096Mr6.LJZI = new IAdSlidePreloadImpl();
                }
            }
        }
        return C58096Mr6.LJZI;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.slide.IAdSlidePreload
    public final int LIZ() {
        return NNB.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.slide.IAdSlidePreload
    public final int LIZIZ() {
        return NNB.LJ;
    }
}
