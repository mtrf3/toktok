package X;

import android.text.TextUtils;
import com.bytedance.falconx.statistic.Common;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.falconx.statistic.StatisticData;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OIF {
    public static volatile OIF LIZJ;
    public final Executor LIZ = C16880lQ.LLLLZLLLI(new OII());
    public OIC LIZIZ;

    public static void LIZ(InterceptorModel interceptorModel, Common common) {
        long longValue;
        long longValue2;
        JSONObject LIZJ2 = C65232Piu.LIZJ("params_for_special", "gecko");
        String str = interceptorModel.pageUrl;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZJ2.put("page_url", str);
        String str3 = interceptorModel.resRootDir;
        if (str3 == null) {
            str3 = "";
        }
        LIZJ2.put("res_root_dir", str3);
        String str4 = interceptorModel.url;
        if (str4 == null) {
            str4 = "";
        }
        LIZJ2.put("resource_url", str4);
        String str5 = interceptorModel.offlineRule;
        if (str5 != null) {
            str2 = str5;
        }
        LIZJ2.put("offline_rule", str2);
        LIZJ2.put("mime_type", interceptorModel.mimeType);
        LIZJ2.put("offline_status", interceptorModel.offlineStatus);
        Long l = interceptorModel.offlineDuration;
        long j = 0;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        LIZJ2.put("offline_duration", longValue);
        Long l2 = interceptorModel.onlineDuration;
        if (l2 == null) {
            longValue2 = 0;
        } else {
            longValue2 = l2.longValue();
        }
        LIZJ2.put("online_duration", longValue2);
        LIZJ2.put("app_version", common.appVersion);
        LIZJ2.put("sdk_version", common.sdkVersion);
        Long l3 = interceptorModel.pkgVersion;
        if (l3 != null) {
            j = l3.longValue();
        }
        LIZJ2.put("pkg_version", j);
        LIZJ2.put("access_key", interceptorModel.accessKey);
        LIZJ2.put("channel", interceptorModel.channel);
        LIZJ2.put("os", common.os);
        LIZJ2.put("device_id", common.deviceId);
        LIZJ2.put("device_model", common.deviceModel);
        LIZJ2.put("region", common.region);
        LIZJ2.put("ac", interceptorModel.ac);
        LIZJ2.put("err_code", interceptorModel.errCode);
        LIZJ2.put("err_msg", interceptorModel.errMsg);
        LIZJ2.put("log_id", interceptorModel.logId);
    }

    public final void LIZIZ(String str, String str2, String str3, InterceptorModel interceptorModel) {
        try {
            if (TextUtils.isEmpty(this.LIZIZ.LJII) || interceptorModel == null) {
                return;
            }
            StatisticData statisticData = new StatisticData();
            Common common = new Common();
            statisticData.mCommon = common;
            common.appVersion = str;
            common.deviceId = str2;
            common.region = str3;
            String uuid = UUID.randomUUID().toString();
            interceptorModel.startTime = null;
            interceptorModel.logId = uuid;
            OIM oim = this.LIZIZ.LJFF;
            if (oim != null) {
                LIZ(interceptorModel, statisticData.mCommon);
                if ((oim instanceof OIL) && interceptorModel.offlineStatus.intValue() == 1) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aid", String.valueOf(0));
                    jSONObject.put("gecko_sdk_version", "3.4.2.2-bugfix");
                    jSONObject.put("access_key", interceptorModel.accessKey);
                    jSONObject.put("channel", interceptorModel.channel);
                    jSONObject.put("package_id", interceptorModel.pkgVersion);
                    jSONObject.put("from", "1");
                    jSONObject.put("isCombo", interceptorModel.isCombo);
                    if (!TextUtils.isEmpty(interceptorModel.channel) && !TextUtils.isEmpty(interceptorModel.url)) {
                        String str4 = interceptorModel.url;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(interceptorModel.channel);
                        LIZ.append("/");
                        String[] split = str4.split(X1D.LIZIZ(LIZ));
                        if (split.length == 2) {
                            jSONObject.put("path", split[1]);
                        }
                    }
                    jSONObject.put("offline_rule", interceptorModel.offlineRule);
                    new JSONObject().put("read_duration", interceptorModel.offlineDuration);
                    String.valueOf(1234);
                    ((OIL) oim).LIZ();
                }
            }
        } catch (Throwable th) {
            OC6.LJ("gecko-debug-tag", "falconx-report:", th);
        }
    }
}
