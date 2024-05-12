package com.ss.android.ugc.aweme.services;

import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;

/* loaded from: classes8.dex */
public interface IFoundationAVService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    /* loaded from: classes8.dex */
    public interface IFetchResourcesListener {
        void onFailed(Exception exc);

        void onSuccess(String[] strArr);
    }

    IAVSettingsService avSettingsService();

    VideoExposureData convertToExposureData(Object obj);

    IEffectService effectService();

    void fetchResourcesNeededByRequirements(String[] strArr, IFetchResourcesListener iFetchResourcesListener);

    IFilterService getFilterService();

    ISDKService getSDKService();

    IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context);

    void loadLibrary(String str, Application application);

    String photoDir(CreativeInfo creativeInfo);

    void setLastStickerId(String str, int i);

    void tryCopyDuetDefaultLayout();

    IVideoCoverService videoCoverService();
}
