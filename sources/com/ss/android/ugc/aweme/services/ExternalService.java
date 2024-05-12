package com.ss.android.ugc.aweme.services;

import X.InterfaceC45930I0w;
import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
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
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ExternalService implements IExternalService {
    public static final ExternalService INSTANCE = new ExternalService();
    public final /* synthetic */ IExternalService $$delegate_0 = AVExternalServiceImpl.LIZ();

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVTransformModelService aVTransformModelService() {
        return this.$$delegate_0.aVTransformModelService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAbilityService abilityService() {
        return this.$$delegate_0.abilityService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAbnormalExitLogService abnormalExitLogService() {
        return this.$$delegate_0.abnormalExitLogService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAnchorService anchorService() {
        return this.$$delegate_0.anchorService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void asyncService(Context context, String entry, IExternalService.ServiceLoadCallback callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(callback, "callback");
        this.$$delegate_0.asyncService(context, entry, callback);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void asyncService(String entry, IExternalService.ServiceLoadCallback callback) {
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(callback, "callback");
        this.$$delegate_0.asyncService(entry, callback);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void asyncServiceForMainRecordService(Context context, String entry, IExternalService.ServiceLoadCallback callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(callback, "callback");
        this.$$delegate_0.asyncServiceForMainRecordService(context, entry, callback);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void asyncServiceWithActivity(Context context, String entry, IExternalService.ServiceLoadCallback callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(callback, "callback");
        this.$$delegate_0.asyncServiceWithActivity(context, entry, callback);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void asyncServiceWithOutPanel(String entry, IExternalService.ServiceLoadCallback callback) {
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(callback, "callback");
        this.$$delegate_0.asyncServiceWithOutPanel(entry, callback);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void attachApplication(Application application) {
        o.LJIIIZ(application, "application");
        this.$$delegate_0.attachApplication(application);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAudioModelService audioModelService() {
        return this.$$delegate_0.audioModelService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAvatarPublishStoryService avatarService() {
        return this.$$delegate_0.avatarService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IActivityNameService classnameService() {
        return this.$$delegate_0.classnameService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ICommerceToolsService commerceToolsService() {
        return this.$$delegate_0.commerceToolsService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IConfigService configService() {
        return this.$$delegate_0.configService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ICreativeStandardPathService creativeStandardPath() {
        return this.$$delegate_0.creativeStandardPath();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IDonationService donationService() {
        return this.$$delegate_0.donationService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVDraftService draftService() {
        return this.$$delegate_0.draftService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IEffectCardService effectCardService() {
        return this.$$delegate_0.effectCardService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IEnterFromService enterFromService() {
        return this.$$delegate_0.enterFromService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IExternalUploaderService externalUploaderService() {
        return this.$$delegate_0.externalUploaderService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVFilterService filterService() {
        return this.$$delegate_0.filterService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVMobService getAVMobService() {
        return this.$$delegate_0.getAVMobService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IBadgeService getBadgeService() {
        return this.$$delegate_0.getBadgeService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public String getCurrentUploadFrameResult() {
        return this.$$delegate_0.getCurrentUploadFrameResult();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public NextLiveData<InterfaceC45930I0w> getCurrentUserData() {
        return this.$$delegate_0.getCurrentUserData();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IEffectSDKGeneralParamService getEffectSDKGeneralParamService() {
        return this.$$delegate_0.getEffectSDKGeneralParamService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IInfoService infoService() {
        return this.$$delegate_0.infoService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void initASVE() {
        this.$$delegate_0.initASVE();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IInitTaskService initService() {
        return this.$$delegate_0.initService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ILargeTransactionService largeTransactionService() {
        return this.$$delegate_0.largeTransactionService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IOpenPhotoNextService openGotoNextService() {
        return this.$$delegate_0.openGotoNextService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IOpenTextNextService openTextNextService() {
        return this.$$delegate_0.openTextNextService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ICreativePerformanceMonitorService performanceMonitorService() {
        return this.$$delegate_0.performanceMonitorService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVPhotoModeService photoModeService() {
        return this.$$delegate_0.photoModeService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IPreloadVESo preloadService() {
        return this.$$delegate_0.preloadService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVPerformance provideAVPerformance() {
        return this.$$delegate_0.provideAVPerformance();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ICrashReportService provideErrorReporter() {
        return this.$$delegate_0.provideErrorReporter();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVPublishService publishService() {
        return this.$$delegate_0.publishService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IRouterService routerService() {
        return this.$$delegate_0.routerService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVScreenAdaptService screenAdaptService() {
        return this.$$delegate_0.screenAdaptService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void setVideoIdParam(String aid) {
        o.LJIIIZ(aid, "aid");
        this.$$delegate_0.setVideoIdParam(aid);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IShoutOutsService shoutOutsService() {
        return this.$$delegate_0.shoutOutsService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ISpecialPlusService specialPlusService() {
        return this.$$delegate_0.specialPlusService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IStoryService storyService() {
        return this.$$delegate_0.storyService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ISuperEntranceService superEntranceService() {
        return this.$$delegate_0.superEntranceService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ITTEPAbilityService ttepAbilityService() {
        return this.$$delegate_0.ttepAbilityService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVTypeFaceService typeFaceService() {
        return this.$$delegate_0.typeFaceService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void updateVESDKDeviceId(String deviceId) {
        o.LJIIIZ(deviceId, "deviceId");
        this.$$delegate_0.updateVESDKDeviceId(deviceId);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVVESDKService vesdkService() {
        return this.$$delegate_0.vesdkService();
    }
}
