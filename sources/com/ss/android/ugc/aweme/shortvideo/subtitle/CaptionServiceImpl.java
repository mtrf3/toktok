package com.ss.android.ugc.aweme.shortvideo.subtitle;

import X.C58096Mr6;
import X.C5YW;
import X.HB7;
import com.ss.android.ugc.aweme.services.sticker.ICaptionService;

/* loaded from: classes8.dex */
public final class CaptionServiceImpl implements ICaptionService {
    public boolean LIZ = true;

    public static ICaptionService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ICaptionService.class, false);
        if (LIZ != null) {
            return (ICaptionService) LIZ;
        }
        if (C58096Mr6.e7 == null) {
            synchronized (ICaptionService.class) {
                if (C58096Mr6.e7 == null) {
                    C58096Mr6.e7 = new CaptionServiceImpl();
                }
            }
        }
        return C58096Mr6.e7;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.ICaptionService
    public final String getCaptionCacheDir() {
        return C5YW.LIZIZ().LJIL(HB7.LIZ, "");
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.ICaptionService
    public final boolean getAlwaysShowCaptionStatus() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.ICaptionService
    public final void setAlwaysShowCaptionStatus(boolean z) {
        this.LIZ = z;
    }
}
