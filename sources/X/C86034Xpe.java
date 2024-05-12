package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Xpe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86034Xpe implements ISettingService {
    public static final C86034Xpe LIZIZ = new C86034Xpe();
    public final /* synthetic */ ISettingService LIZ = SettingServiceImpl.LIZ();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String buildFeedbackUrl(String str, java.util.Map<String, String> map) {
        return this.LIZ.buildFeedbackUrl(str, map);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean forcedPrivateSettingForLikedVideo() {
        return this.LIZ.forcedPrivateSettingForLikedVideo();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getAppLanguage() {
        return this.LIZ.getAppLanguage();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getAppLogRegion() {
        return this.LIZ.getAppLogRegion();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale getCountryLocale() {
        return this.LIZ.getCountryLocale();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final G36 getCurrentI18nItem(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.getCurrentI18nItem(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<G36> getI18nItems() {
        return this.LIZ.getI18nItems();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getLanguage(Locale locale) {
        return this.LIZ.getLanguage(locale);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale getLocale(String language) {
        o.LJIIIZ(language, "language");
        return this.LIZ.getLocale(language);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final java.util.Map<String, G36> getLocaleMap() {
        return this.LIZ.getLocaleMap();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getReleaseBuildString() {
        return this.LIZ.getReleaseBuildString();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getSysLanguage() {
        return this.LIZ.getSysLanguage();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getTheme(int i) {
        return this.LIZ.getTheme(i);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void installCommonParams() {
        this.LIZ.installCommonParams();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isArabicLang(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.isArabicLang(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isFirstShowBAOrCARedDot() {
        return this.LIZ.isFirstShowBAOrCARedDot();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isIndonesiaByMcc() {
        return this.LIZ.isIndonesiaByMcc();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isKorean() {
        return this.LIZ.isKorean();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isShowFamilyPairingForNotLoginUser() {
        return this.LIZ.isShowFamilyPairingForNotLoginUser();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean needShowProfileGuideView() {
        return this.LIZ.needShowProfileGuideView();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean needShowRedDotOnMyProfileMore() {
        return this.LIZ.needShowRedDotOnMyProfileMore();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> providePrivateSettingChangePresenter() {
        return this.LIZ.providePrivateSettingChangePresenter();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<EUJ> providePushSettingCallbackList() {
        return this.LIZ.providePushSettingCallbackList();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> providePushSettingChangePresenter() {
        return this.LIZ.providePushSettingChangePresenter();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final C8BR<C8BS<PushSettings>, InterfaceC85901XnV> providePushSettingFetchPresenter() {
        return this.LIZ.providePushSettingFetchPresenter();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void requestTurnOnAdAuthorization(Context context, InterfaceC85887XnH callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        this.LIZ.requestTurnOnAdAuthorization(context, callback);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final BaseResponse setPushPrivateSettingItem(String str, int i) {
        return this.LIZ.setPushPrivateSettingItem(str, i);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void setTheme(int i, String theme) {
        o.LJIIIZ(theme, "theme");
        this.LIZ.setTheme(i, theme);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean shouldShowBusinessAccount() {
        return this.LIZ.shouldShowBusinessAccount();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean shouldShowCreatorToolsDot() {
        return this.LIZ.shouldShowCreatorToolsDot();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean shouldUseFasterPaging() {
        return this.LIZ.shouldUseFasterPaging();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean startFeedbackRecordActivity(Activity activity, String str, Integer num) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.startFeedbackRecordActivity(activity, str, null);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void switchLocale(String locale, String language, Context activity) {
        o.LJIIIZ(locale, "locale");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(activity, "activity");
        this.LIZ.switchLocale(locale, language, activity);
    }
}
