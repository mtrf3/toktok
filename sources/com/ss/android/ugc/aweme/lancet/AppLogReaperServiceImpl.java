package com.ss.android.ugc.aweme.lancet;

import X.C16880lQ;
import X.C78688UuS;
import X.C85990Xow;
import X.C85999Xp5;
import X.EF7;
import com.bytedance.ies.ugc.statisticloggerapi.IAppLogReaperService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AppLogReaperServiceImpl implements IAppLogReaperService {
    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAppLogReaperService
    public final void LIZ(JSONObject jSONObject) {
        try {
            String language = C85999Xp5.LIZJ(EF7.LIZIZ(), null, null).getLanguage();
            if ("zh".equals(language)) {
                language = "zh-Hant";
            }
            LIZIZ("app_language", language, jSONObject);
            LIZIZ("region", SettingServiceImpl.LIZ().getAppLogRegion(), jSONObject);
            LIZIZ("sys_region", C85990Xow.LJFF(), jSONObject);
            LIZIZ("carrier_region", C85990Xow.LJ(), jSONObject);
            LIZIZ("timezone_name", TimeZone.getDefault().getDisplayName(), jSONObject);
            LIZIZ("timezone_offset", String.valueOf(TimeZone.getDefault().getRawOffset() / 1000), jSONObject);
            C78688UuS.LJJJJLI();
        } catch (AssertionError | Exception unused) {
        }
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
