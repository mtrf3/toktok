package com.ss.android.ugc.aweme.ecommerce.core.preloader;

import X.C0M6;
import com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache;

/* loaded from: classes11.dex */
public final class LowResolutionImageCache implements ILowResolutionImageCache {
    public static final C0M6<String, String> LIZ = new C0M6<>(128);

    @Override // com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache
    public final void LIZ(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        LIZ.LIZJ(str, str2);
    }
}
