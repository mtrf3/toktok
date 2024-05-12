package com.bytedance.android.livesdk.livesetting.gecko;

import X.C15440j6;
import X.C61878OQg;
import X.CN1;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.GeckoSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@SettingsKey("tt_live_gecko_cdn_base_path")
/* loaded from: classes6.dex */
public final class TTLiveGeckoBaseUrlSetting {
    public static final TTLiveGeckoBaseUrlSetting INSTANCE = new TTLiveGeckoBaseUrlSetting();
    public static int envType = -1;
    public static int delayDownTime = -1;
    public static List<String> urlList = new ArrayList();

    @Group(isDefault = true, value = "default group")
    public static final GeckoSetting DEFAULT = new GeckoSetting();

    private final int getEnvTypeValue() {
        int i;
        if (envType < 0) {
            IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
            if (iHostAppContext.isBoe()) {
                i = 2;
            } else if (iHostAppContext.isPpe()) {
                i = 3;
            } else {
                i = 1;
            }
            envType = i;
        }
        return envType;
    }

    public final long getDelayDownTime() {
        int i;
        if (delayDownTime < 0) {
            GeckoSetting value = getValue();
            if (value != null) {
                i = value.delayTriggerDownTime;
            } else {
                i = 5;
            }
            delayDownTime = i;
        }
        return delayDownTime * 1000;
    }

    public final GeckoSetting getValue() {
        return (GeckoSetting) SettingsManager.INSTANCE.getValueSafely(TTLiveGeckoBaseUrlSetting.class);
    }

    public final boolean isEnable() {
        GeckoSetting value = getValue();
        if (value == null) {
            value = DEFAULT;
        }
        return value.isEnable;
    }

    public final GeckoSetting getDEFAULT() {
        return DEFAULT;
    }

    public final List<String> getUrlList() {
        return urlList;
    }

    public final void setUrlList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        urlList = list;
    }

    public static final List<String> getUrlList(String channel, String fileName) {
        GeckoSetting value;
        List<String> list;
        List<String> arrayList;
        List<String> list2;
        List<String> arrayList2;
        List<String> list3;
        List<String> list4;
        List<String> arrayList3;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(fileName, "fileName");
        if (TextUtils.isEmpty(channel) || TextUtils.isEmpty(fileName)) {
            return C61878OQg.INSTANCE;
        }
        if (!urlList.isEmpty()) {
            return INSTANCE.getCdnPath(urlList, channel, fileName);
        }
        TTLiveGeckoBaseUrlSetting tTLiveGeckoBaseUrlSetting = INSTANCE;
        int envTypeValue = tTLiveGeckoBaseUrlSetting.getEnvTypeValue();
        if (envTypeValue == 1) {
            GeckoSetting value2 = tTLiveGeckoBaseUrlSetting.getValue();
            if (value2 != null && (list4 = value2.urlList) != null && list4.size() > 0) {
                GeckoSetting value3 = tTLiveGeckoBaseUrlSetting.getValue();
                if (value3 == null || (arrayList3 = value3.urlList) == null) {
                    arrayList3 = new ArrayList<>();
                }
                urlList = arrayList3;
            }
        } else if (envTypeValue == 2) {
            GeckoSetting value4 = tTLiveGeckoBaseUrlSetting.getValue();
            if (value4 != null && (list2 = value4.boeUrlList) != null && list2.size() > 0) {
                GeckoSetting value5 = tTLiveGeckoBaseUrlSetting.getValue();
                if (value5 == null || (arrayList2 = value5.boeUrlList) == null) {
                    arrayList2 = new ArrayList<>();
                }
                urlList = arrayList2;
            }
        } else if (envTypeValue == 3 && (value = tTLiveGeckoBaseUrlSetting.getValue()) != null && (list = value.ppeUrlList) != null && list.size() > 0) {
            GeckoSetting value6 = tTLiveGeckoBaseUrlSetting.getValue();
            if (value6 == null || (arrayList = value6.ppeUrlList) == null) {
                arrayList = new ArrayList<>();
            }
            urlList = arrayList;
        }
        if (urlList.isEmpty()) {
            int LIZ = C15440j6.LIZ();
            if (LIZ != 2) {
                if (LIZ != 3) {
                    list3 = DEFAULT.LIZ;
                } else {
                    list3 = DEFAULT.LIZJ;
                }
            } else {
                list3 = DEFAULT.LIZIZ;
            }
            urlList = list3;
        }
        return tTLiveGeckoBaseUrlSetting.getCdnPath(urlList, channel, fileName);
    }

    private final List<String> getCdnPath(List<String> list, String str, String str2) {
        if (list.isEmpty() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str3);
            LIZ.append('/');
            LIZ.append(str);
            LIZ.append('/');
            LIZ.append(str2);
            arrayList.add(X1D.LIZIZ(LIZ));
        }
        return arrayList;
    }
}
