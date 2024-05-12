package com.ss.android.ugc.aweme.services;

import X.C19N;
import X.C58096Mr6;
import X.G36;
import X.InterfaceC85887XnH;
import android.content.Context;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class IAVSettingServiceImpl implements IAVSettingService {
    public final ISettingService settingService = SettingServiceImpl.LIZ();

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public String getAppLanguage() {
        return this.settingService.getAppLanguage();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public String getAppLogRegion() {
        return this.settingService.getAppLogRegion();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public Locale getCountryLocale() {
        return this.settingService.getCountryLocale();
    }

    public List<G36> getI18nItems() {
        return this.settingService.getI18nItems();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public Map<String, G36> getLocaleMap() {
        return this.settingService.getLocaleMap();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public boolean getSaveAtPost() {
        return C19N.LJ("disable_save_at_post", false);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public String getSysLanguage() {
        return this.settingService.getSysLanguage();
    }

    public void installCommonParams() {
        this.settingService.installCommonParams();
    }

    public boolean isIndonesiaByMcc() {
        return this.settingService.isIndonesiaByMcc();
    }

    public boolean isKorean() {
        return this.settingService.isKorean();
    }

    public static IAVSettingService createIAVSettingServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IAVSettingService.class, z);
        if (LIZ != null) {
            return (IAVSettingService) LIZ;
        }
        if (C58096Mr6.L5 == null) {
            synchronized (IAVSettingService.class) {
                if (C58096Mr6.L5 == null) {
                    C58096Mr6.L5 = new IAVSettingServiceImpl();
                }
            }
        }
        return C58096Mr6.L5;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public G36 getCurrentI18nItem(Context context) {
        o.LJIIIZ(context, "context");
        return this.settingService.getCurrentI18nItem(context);
    }

    public String getLanguage(Locale locale) {
        o.LJIIIZ(locale, "locale");
        return this.settingService.getLanguage(locale);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public Locale getLocale(String language) {
        o.LJIIIZ(language, "language");
        return this.settingService.getLocale(language);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public void requestTurnOnAdAuthorization(Context context, InterfaceC85887XnH callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        this.settingService.requestTurnOnAdAuthorization(context, callback);
    }

    public void switchLocale(String locale, String language, Context activity) {
        o.LJIIIZ(locale, "locale");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(activity, "activity");
        this.settingService.switchLocale(locale, language, activity);
    }
}
