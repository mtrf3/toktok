package com.ss.android.ugc.aweme.port.in;

import X.G36;
import X.InterfaceC85887XnH;
import android.content.Context;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes8.dex */
public interface IAVSettingService {
    String getAppLanguage();

    String getAppLogRegion();

    Locale getCountryLocale();

    G36 getCurrentI18nItem(Context context);

    Locale getLocale(String str);

    Map<String, G36> getLocaleMap();

    boolean getSaveAtPost();

    String getSysLanguage();

    void requestTurnOnAdAuthorization(Context context, InterfaceC85887XnH interfaceC85887XnH);
}
