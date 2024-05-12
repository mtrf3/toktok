package com.ss.android.ugc.aweme.services.video;

import X.ALM;
import X.ALO;
import X.ALP;
import X.C58096Mr6;

/* loaded from: classes5.dex */
public final class OneMinuteH5PreloadServiceImpl implements IOneMinuteH5PreloadServiceImpl {
    public ALM allowOneMinuteVideoNoticeKeva = new ALM();

    @Override // com.ss.android.ugc.aweme.services.video.IOneMinuteH5PreloadServiceImpl
    public boolean shouldPreloadWebView() {
        ALP.LIZ.getClass();
        if (!ALP.LIZIZ || this.allowOneMinuteVideoNoticeKeva.LIZ.getBoolean("learn_more_entered", false) || this.allowOneMinuteVideoNoticeKeva.LIZ.getInt("prompt_display_count", 0) >= ALO.LIZ) {
            return false;
        }
        return true;
    }

    public static IOneMinuteH5PreloadServiceImpl createIOneMinuteH5PreloadServiceImplbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IOneMinuteH5PreloadServiceImpl.class, z);
        if (LIZ != null) {
            return (IOneMinuteH5PreloadServiceImpl) LIZ;
        }
        if (C58096Mr6.j6 == null) {
            synchronized (IOneMinuteH5PreloadServiceImpl.class) {
                if (C58096Mr6.j6 == null) {
                    C58096Mr6.j6 = new OneMinuteH5PreloadServiceImpl();
                }
            }
        }
        return C58096Mr6.j6;
    }
}
