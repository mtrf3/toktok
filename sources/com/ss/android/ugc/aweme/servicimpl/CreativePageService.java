package com.ss.android.ugc.aweme.servicimpl;

import X.C58096Mr6;
import X.WM7;
import android.app.Activity;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.video.ICreativePageService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;

/* loaded from: classes8.dex */
public final class CreativePageService implements ICreativePageService {
    public static ICreativePageService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ICreativePageService.class, false);
        if (LIZ != null) {
            return (ICreativePageService) LIZ;
        }
        if (C58096Mr6.l6 == null) {
            synchronized (ICreativePageService.class) {
                if (C58096Mr6.l6 == null) {
                    C58096Mr6.l6 = new CreativePageService();
                }
            }
        }
        return C58096Mr6.l6;
    }

    @Override // com.ss.android.ugc.aweme.services.video.ICreativePageService
    public final boolean isPublishPage(Activity activity) {
        WM7 wm7;
        if (activity == null) {
            return false;
        }
        if (activity instanceof VideoPublishActivity) {
            return true;
        }
        ICreativeSAAService LIZ = SAAService.LIZ();
        if (LIZ != null) {
            wm7 = LIZ.getCurrentScene(activity);
        } else {
            wm7 = null;
        }
        return wm7 instanceof VideoPublishContainerScene;
    }

    @Override // com.ss.android.ugc.aweme.services.video.ICreativePageService
    public final boolean isRecordPage(Activity activity) {
        WM7 wm7;
        if (activity == null) {
            return false;
        }
        if (activity instanceof VideoRecordNewActivity) {
            return true;
        }
        ICreativeSAAService LIZ = SAAService.LIZ();
        if (LIZ != null) {
            wm7 = LIZ.getCurrentScene(activity);
        } else {
            wm7 = null;
        }
        return wm7 instanceof TikTokCameraBaseGroupScene;
    }

    @Override // com.ss.android.ugc.aweme.services.video.ICreativePageService
    public final boolean isVideoEditPage(Activity activity) {
        WM7 wm7;
        if (activity == null) {
            return false;
        }
        ICreativeSAAService LIZ = SAAService.LIZ();
        if (LIZ != null) {
            wm7 = LIZ.getCurrentScene(activity);
        } else {
            wm7 = null;
        }
        return wm7 instanceof VideoEditContainerScene;
    }
}
