package com.ss.android.ugc.aweme.services;

import X.InterfaceC45930I0w;
import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.services.audio.IAudioModelService;
import com.ss.android.ugc.aweme.services.badge.IBadgeService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.IAVPhotoModeService;
import com.ss.android.ugc.aweme.services.external.IAVScreenAdaptService;
import com.ss.android.ugc.aweme.services.external.IAVTransformModelService;
import com.ss.android.ugc.aweme.services.external.IAVTypeFaceService;
import com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.external.ICreativeStandardPathService;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.external.IInitTaskService;
import com.ss.android.ugc.aweme.services.external.ILargeTransactionService;
import com.ss.android.ugc.aweme.services.external.IRouterService;
import com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.services.external.ability.IEffectSDKGeneralParamService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.story.IStoryService;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.IActivityNameService;

/* loaded from: classes8.dex */
public interface IExternalService {
    IAVTransformModelService aVTransformModelService();

    IAbilityService abilityService();

    IAbnormalExitLogService abnormalExitLogService();

    IAnchorService anchorService();

    void asyncService(Context context, String str, ServiceLoadCallback serviceLoadCallback);

    void asyncService(String str, ServiceLoadCallback serviceLoadCallback);

    void asyncServiceForMainRecordService(Context context, String str, ServiceLoadCallback serviceLoadCallback);

    void asyncServiceWithActivity(Context context, String str, ServiceLoadCallback serviceLoadCallback);

    void asyncServiceWithOutPanel(String str, ServiceLoadCallback serviceLoadCallback);

    void attachApplication(Application application);

    IAudioModelService audioModelService();

    IAvatarPublishStoryService avatarService();

    IActivityNameService classnameService();

    ICommerceToolsService commerceToolsService();

    IConfigService configService();

    ICreativeStandardPathService creativeStandardPath();

    IDonationService donationService();

    IAVDraftService draftService();

    IEffectCardService effectCardService();

    IEnterFromService enterFromService();

    IExternalUploaderService externalUploaderService();

    IAVFilterService filterService();

    IAVMobService getAVMobService();

    IBadgeService getBadgeService();

    String getCurrentUploadFrameResult();

    NextLiveData<InterfaceC45930I0w> getCurrentUserData();

    IEffectSDKGeneralParamService getEffectSDKGeneralParamService();

    IInfoService infoService();

    void initASVE();

    IInitTaskService initService();

    ILargeTransactionService largeTransactionService();

    IOpenPhotoNextService openGotoNextService();

    IOpenTextNextService openTextNextService();

    ICreativePerformanceMonitorService performanceMonitorService();

    IAVPhotoModeService photoModeService();

    IPreloadVESo preloadService();

    IAVPerformance provideAVPerformance();

    ICrashReportService provideErrorReporter();

    IAVPublishService publishService();

    IRouterService routerService();

    IAVScreenAdaptService screenAdaptService();

    void setVideoIdParam(String str);

    IShoutOutsService shoutOutsService();

    ISpecialPlusService specialPlusService();

    IStoryService storyService();

    ISuperEntranceService superEntranceService();

    ITTEPAbilityService ttepAbilityService();

    IAVTypeFaceService typeFaceService();

    void updateVESDKDeviceId(String str);

    IAVVESDKService vesdkService();

    /* loaded from: classes8.dex */
    public interface ServiceLoadCallback {
        void onDismiss();

        void onFailed();

        void onLoad(AsyncAVService asyncAVService, long j);

        void onOK();

        /* loaded from: classes8.dex */
        public static final class DefaultImpls {
            public static void onDismiss(ServiceLoadCallback serviceLoadCallback) {
            }

            public static void onFailed(ServiceLoadCallback serviceLoadCallback) {
            }

            public static void onOK(ServiceLoadCallback serviceLoadCallback) {
                serviceLoadCallback.onFailed();
            }
        }
    }
}
