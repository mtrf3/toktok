package com.ss.android.ugc.aweme.setting.services;

import X.AEA;
import X.C85895XnP;
import X.C85896XnQ;
import X.C85897XnR;
import X.C8BR;
import X.C8BS;
import X.EUJ;
import X.G36;
import X.InterfaceC85887XnH;
import X.InterfaceC85901XnV;
import X.InterfaceC85903XnX;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes16.dex */
public abstract class BaseSettingServiceImpl implements ISettingService {
    public static final int $stable = 0;

    public abstract /* synthetic */ BatchUpdatePushSwitchesResp batchSetPushSettingItems(String str, int i, boolean z);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String buildFeedbackUrl(String str, Map<String, String> map);

    public abstract /* synthetic */ boolean enableBACALogic();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean forcedPrivateSettingForLikedVideo();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getAppLanguage();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getAppLogRegion();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ Locale getCountryLocale();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ G36 getCurrentI18nItem(Context context);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ List<G36> getI18nItems();

    public abstract /* synthetic */ List<String> getInteractionPushSettingItemsString(String str);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getLanguage(Locale locale);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ Locale getLocale(String str);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ Map<String, G36> getLocaleMap();

    public abstract /* synthetic */ C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> getPrivateSettingChangePresenter();

    public abstract /* synthetic */ C8BR<C8BS<PushSettings>, InterfaceC85901XnV> getPushSettingFetchPresenter();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getSysLanguage();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getTheme(int i);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ void installCommonParams();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean isArabicLang(Context context);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean isFirstShowBAOrCARedDot();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean isIndonesiaByMcc();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean isKorean();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean isShowFamilyPairingForNotLoginUser();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean needShowProfileGuideView();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean needShowRedDotOnMyProfileMore();

    public abstract /* synthetic */ void openTermsPage(Activity activity);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ List<EUJ> providePushSettingCallbackList();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ void requestTurnOnAdAuthorization(Context context, InterfaceC85887XnH interfaceC85887XnH);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ BaseResponse setPushPrivateSettingItem(String str, int i);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ void setTheme(int i, String str);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean shouldShowBusinessAccount();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean shouldShowCreatorToolsDot();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean shouldUseFasterPaging();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean startFeedbackRecordActivity(Activity activity, String str, Integer num);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ void switchLocale(String str, String str2, Context context);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> providePrivateSettingChangePresenter() {
        return new C85896XnQ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> providePushSettingChangePresenter() {
        return new C85897XnR();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public C8BR<C8BS<PushSettings>, InterfaceC85901XnV> providePushSettingFetchPresenter() {
        return new C85895XnP();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public String getReleaseBuildString() {
        return AEA.LIZ();
    }
}
