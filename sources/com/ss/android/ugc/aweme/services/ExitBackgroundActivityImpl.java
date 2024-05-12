package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.WM7;
import android.app.Activity;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ExitBackgroundActivityImpl implements ExitBackgroundActivityApi {
    public static ExitBackgroundActivityApi createExitBackgroundActivityApibyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ExitBackgroundActivityApi.class, z);
        if (LIZ != null) {
            return (ExitBackgroundActivityApi) LIZ;
        }
        if (C58096Mr6.J5 == null) {
            synchronized (ExitBackgroundActivityApi.class) {
                if (C58096Mr6.J5 == null) {
                    C58096Mr6.J5 = new ExitBackgroundActivityImpl();
                }
            }
        }
        return C58096Mr6.J5;
    }

    private final String getPageType(WM7 wm7) {
        if (wm7 instanceof TikTokCameraBaseGroupScene) {
            return "video_shoot_page";
        }
        if (wm7 instanceof VideoPublishContainerScene) {
            return "video_post_page";
        }
        if (wm7 instanceof VideoEditContainerScene) {
            return "video_edit_page";
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi
    public String activityType(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof VideoRecordNewActivity) {
            return "video_shoot_page";
        }
        if (activity instanceof VideoPublishActivity) {
            return "video_post_page";
        }
        if (activity instanceof SAAActivity) {
            return getPageType(((SAAActivity) activity).LLIIIILZ());
        }
        return null;
    }
}
