package com.ss.android.ugc.aweme.setting.services;

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
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes16.dex */
public interface ISettingService {
    String buildFeedbackUrl(String str, Map<String, String> map);

    boolean forcedPrivateSettingForLikedVideo();

    String getAppLanguage();

    String getAppLogRegion();

    Locale getCountryLocale();

    G36 getCurrentI18nItem(Context context);

    List<G36> getI18nItems();

    String getLanguage(Locale locale);

    Locale getLocale(String str);

    Map<String, G36> getLocaleMap();

    String getReleaseBuildString();

    String getSysLanguage();

    String getTheme(int i);

    void installCommonParams();

    boolean isArabicLang(Context context);

    boolean isFirstShowBAOrCARedDot();

    boolean isIndonesiaByMcc();

    boolean isKorean();

    boolean isShowFamilyPairingForNotLoginUser();

    boolean needShowProfileGuideView();

    boolean needShowRedDotOnMyProfileMore();

    C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> providePrivateSettingChangePresenter();

    List<EUJ> providePushSettingCallbackList();

    C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> providePushSettingChangePresenter();

    C8BR<C8BS<PushSettings>, InterfaceC85901XnV> providePushSettingFetchPresenter();

    void requestTurnOnAdAuthorization(Context context, InterfaceC85887XnH interfaceC85887XnH);

    BaseResponse setPushPrivateSettingItem(String str, int i);

    void setTheme(int i, String str);

    boolean shouldShowBusinessAccount();

    boolean shouldShowCreatorToolsDot();

    boolean shouldUseFasterPaging();

    boolean startFeedbackRecordActivity(Activity activity, String str, Integer num);

    void switchLocale(String str, String str2, Context context);
}
