package X;

import Y.ARunnableS22S0300000_11;
import android.app.Application;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.ss.android.common.applog.AppLog;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QT4 implements Runnable {
    public final String LJLIL;
    public final QT5 LJLILLLLZI;

    public final void LIZ() {
        Application application = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ;
        if (Math.abs(System.currentTimeMillis() - ((PaymentLocalSettings) PT6.LIZ(application, PaymentLocalSettings.class)).LJJIIZ()) < ((PaymentOnlineSettings) PT6.LIZ(application, PaymentOnlineSettings.class)).LIZLLL()) {
            b1.LIZLLL();
        } else {
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    C78261UnZ c78261UnZ = (C78261UnZ) C78273Unl.LJIIIZ().LIZ();
                    c78261UnZ.getClass();
                    HashMap hashMap = new HashMap();
                    AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(hashMap);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("sdk_version_code", String.valueOf(1));
                    hashMap2.put("sdk_version_name", "1.0");
                    String str = (String) hashMap.get("install_id");
                    if (!C38354F3m.LJ(str)) {
                        hashMap2.put("iid", str);
                    }
                    String str2 = (String) hashMap.get("device_id");
                    if (!C38354F3m.LJ(str2)) {
                        hashMap2.put("device_id", str2);
                    }
                    String LLJILJILJ = C16880lQ.LLJILJILJ(c78261UnZ.LIZ.LIZ);
                    if (!C38354F3m.LJ(LLJILJILJ)) {
                        hashMap2.put("ac", LLJILJILJ);
                    }
                    String str3 = c78261UnZ.LIZ.LIZIZ.LIZLLL;
                    if (str3 != null) {
                        hashMap2.put("channel", str3);
                    }
                    hashMap2.put("aid", String.valueOf(c78261UnZ.LIZ.LIZIZ.LIZ));
                    hashMap2.put("app_name", c78261UnZ.LIZ.LIZIZ.LJ);
                    hashMap2.put("version_code", String.valueOf(c78261UnZ.LIZ.LIZIZ.LIZIZ));
                    c78261UnZ.LIZ.LIZIZ.getClass();
                    hashMap2.put("version_name", null);
                    hashMap2.put("update_version_code", String.valueOf(c78261UnZ.LIZ.LIZIZ.LIZJ));
                    hashMap2.put("device_type", Build.MODEL);
                    hashMap2.put("device_brand", Build.BRAND);
                    hashMap2.put("device_manufacturer", Build.MANUFACTURER);
                    hashMap2.put("language", Locale.getDefault().getLanguage());
                    hashMap2.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
                    try {
                        String str4 = Build.VERSION.RELEASE;
                        if (str4 != null && str4.length() > 10) {
                            str4 = str4.substring(0, 10);
                        }
                        hashMap2.put("os_version", str4);
                    } catch (Exception unused) {
                    }
                    hashMap2.put("os", "android");
                    hashMap2.put("package", c78261UnZ.LIZ.LIZ.getPackageName());
                    TimeZone timeZone = Calendar.getInstance().getTimeZone();
                    if (timeZone != null) {
                        hashMap2.put("tz_offset", String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / 1000));
                        hashMap2.put("tz_name", timeZone.getID());
                    }
                    String language = Locale.getDefault().getLanguage();
                    if (!C38354F3m.LJ(language)) {
                        hashMap2.put("language", language);
                    }
                    EnumC78271Unj enumC78271Unj = c78261UnZ.LIZ.LJ;
                    if (enumC78271Unj != null) {
                        hashMap2.put("app_region", enumC78271Unj.name());
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    String LJFF = JBR.LJFF(LIZ, this.LJLIL, "/service/settings/v3/?caller_name=pipo_pay", LIZ);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                    StringBuilder sb = new StringBuilder(LJFF);
                    if (LJFF.indexOf(63) < 0) {
                        sb.append("?");
                    } else {
                        sb.append("&");
                    }
                    sb.append(C48189Ivh.LIZJ(arrayList));
                    String sb2 = sb.toString();
                    try {
                        AbstractC66805QJt abstractC66805QJt = AbstractC66805QJt.LIZ;
                        abstractC66805QJt.getClass();
                        String LIZIZ = abstractC66805QJt.LIZIZ(sb2, null, new QKY());
                        if (TextUtils.isEmpty(LIZIZ)) {
                            b1.LIZLLL();
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(LIZIZ);
                            String optString = jSONObject.optString("message");
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            if (!TextUtils.equals(optString, "success") || optJSONObject == null) {
                                return;
                            }
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("settings");
                            if (optJSONObject2 == null) {
                                b1.LIZLLL();
                                return;
                            }
                            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("sdk_key_pipo_pay");
                            if (optJSONObject3 == null) {
                                b1.LIZLLL();
                                return;
                            }
                            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("settings is ：");
                            LIZ2.append(optJSONObject2.toString());
                            X1D.LIZIZ(LIZ2);
                            LJ.getClass();
                            ARunnableS22S0300000_11 aRunnableS22S0300000_11 = new ARunnableS22S0300000_11(this, application, optJSONObject3, 0);
                            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                                RunnableC39007FSp.LIZIZ(aRunnableS22S0300000_11);
                                return;
                            } else {
                                aRunnableS22S0300000_11.run();
                                return;
                            }
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("error to parse response：");
                            LIZ3.append(LIZIZ);
                            X1D.LIZIZ(LIZ3);
                            LJ2.getClass();
                            return;
                        }
                    } catch (Exception e2) {
                        C39670Fha LJ3 = C78273Unl.LJIIIZ().LJ();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("settings request failed：");
                        LIZ4.append(android.util.Log.getStackTraceString(e2));
                        X1D.LIZIZ(LIZ4);
                        LJ3.getClass();
                        return;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        b1.LIZLLL();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public QT4(String str, QT5 qt5) {
        C16880lQ.LJLLJ(QT4.class);
        this.LJLIL = str;
        this.LJLILLLLZI = qt5;
    }
}
