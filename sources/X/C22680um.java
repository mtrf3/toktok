package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22680um {
    public static final String[] LIZ = {"/cache/picture/im_fresco_cache/", "/cache/picture/fresco_cache/", "/files/awcn_strategy/pushservice/", "/files/keva/repo/", "/files/live_kv/", "/files/effect/", "/files/music/", "/files/logs/", "/files/ALOG/", "/cache/cachev2/", "/cache/runnableCache/", "/files/robust/", "/files/tt_file_st/", "/cache/feedCache/", "/files/leakcanary/", "/cache/ttnet_storage/", "/files/MiPushLog/", "/cache/picture/", "/cache/ttnet_storage/", "/cache/cjpayWebData/", "/cache/awemeCache/", "/files/font/", "/files/npth/", "/files/.msdata/", "/files/.dynamic/", "/files/bdp/", "/files/a/", "/cache/WebView/", "/files/webview_bytedance/", "/files/.patchs/", "/files/.envelope/", "/files/.emitter/", "/files/.umeng/", "/files/.bak/", "/files/.pre_download/", "/files/.imprint/", "/shared_prefs/", "/app_sslcache/", "/app_webview/", "/lib-main/", "/splashCache/", "/awemeSplashCache/", "/app_SGLib/", "/app_assets/", "/small_emoji_res/", "/system_emoji_res/", "/files/draft/", "/files/Download/", "/files/rhea/", "/files/speed_ml/", "/databases/", "/files/filters/", "/files/extract_shot/", "/files/effectmodel/", "/files/extract_custom_sticker/", "/covode/", "/app_hws_webview/", "/files/Pictures/CJPayImageLoader/", "/cache/Universal_activity", "/files/audio-effect/", "/files/mvtheme/", "/files/origin_sound/", "/files/ve_frame_cache2/", "/files/hdr_filter/", "/files/hianalytics/"};
    public static final String[] LIZIZ = {"/files/plugins/", "/cache/Universal_activity/", "/files/appbrand/"};
    public static final String[] LIZJ = {"/files/offlineX/", "/files/offline/", "/files/live_sdk_gecko/"};

    public static HashMap<String, Integer> LIZJ(String str) {
        BufferedReader bufferedReader;
        if (TextUtils.isEmpty(str) || Build.VERSION.SDK_INT >= 24 || !C23960wq.LIZ) {
            return null;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        try {
            Runtime runtime = Runtime.getRuntime();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("du -a ");
            LIZ2.append(str);
            bufferedReader = new BufferedReader(new InputStreamReader(runtime.exec(X1D.LIZIZ(LIZ2)).getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split("\t");
                    if (split.length == 2) {
                        String replace = split[1].replace(str, "");
                        if (TextUtils.isEmpty(replace)) {
                            replace = "DiskTotal";
                        } else {
                            String[] split2 = replace.split("/");
                            if (split2 != null && split2.length <= 5) {
                            }
                        }
                        hashMap.put(replace, Integer.valueOf(split[0]));
                    }
                    if (hashMap.size() >= 5000) {
                        break;
                    }
                } catch (Throwable unused) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            }
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            return hashMap;
        } catch (Throwable unused4) {
            bufferedReader = null;
        }
    }

    public static void LIZ(Context context, JSONObject jSONObject) {
        String packageName = context.getPackageName();
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("/cache/webviewbytedance_");
        LIZ2.append(packageName);
        LIZ2.append(":miniapp0/");
        arrayList.add(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("/cache/webviewbytedance_");
        LIZ3.append(packageName);
        LIZ3.append("/");
        arrayList.add(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("/app_webviewbytedance_");
        LIZ4.append(packageName);
        LIZ4.append(":miniapp0/");
        arrayList.add(X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("/app_webview_");
        LIZ5.append(packageName);
        LIZ5.append(":miniapp0/");
        arrayList.add(X1D.LIZIZ(LIZ5));
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("/cache/webview_");
        LIZ6.append(packageName);
        LIZ6.append(":miniapp0/");
        arrayList.add(X1D.LIZIZ(LIZ6));
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("/app_webviewbytedance_");
        LIZ7.append(packageName);
        LIZ7.append("/");
        arrayList.add(X1D.LIZIZ(LIZ7));
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("/app_webviewbytedance_ttwebview_bytedance_");
        LIZ8.append(packageName);
        LIZ8.append("/");
        arrayList.add(X1D.LIZIZ(LIZ8));
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append("/app_hws_webview_");
        LIZ9.append(packageName);
        LIZ9.append(":miniapp0/");
        arrayList.add(X1D.LIZIZ(LIZ9));
        HashMap<String, Integer> LIZIZ2 = LIZIZ(C16880lQ.LLIIJLIL(context).getParent(), arrayList);
        HashMap<String, Integer> LIZIZ3 = LIZIZ(C16880lQ.LLIIJI(context, "").getParent(), arrayList);
        if (LIZIZ2 != null) {
            try {
                for (Map.Entry<String, Integer> entry : LIZIZ2.entrySet()) {
                    StringBuilder LIZ10 = X1D.LIZ();
                    LIZ10.append("internal");
                    LIZ10.append(entry.getKey());
                    jSONObject.put(X1D.LIZIZ(LIZ10), entry.getValue());
                }
            } catch (JSONException unused) {
                return;
            }
        }
        if (LIZIZ3 != null) {
            for (Map.Entry<String, Integer> entry2 : LIZIZ3.entrySet()) {
                StringBuilder LIZ11 = X1D.LIZ();
                LIZ11.append("external");
                LIZ11.append(entry2.getKey());
                jSONObject.put(X1D.LIZIZ(LIZ11), entry2.getValue());
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(10:83|84|85|(3:86|87|(3:89|(5:91|92|(1:94)|95|96)(1:98)|97)(1:99))|100|102|103|(2:79|80)|(3:10|(5:13|(1:(2:15|(2:18|19)(1:17))(2:76|77))|(1:75)(4:21|22|(2:23|(1:74)(2:25|(2:27|28)(1:73)))|(1:72)(4:30|31|(2:32|(1:71)(2:34|(1:69)(2:38|39)))|(1:67)(5:41|42|(3:44|(2:57|(1:64)(2:61|62))(2:48|49)|50)|66|(1:56)(3:52|53|54))))|55|11)|78)|8)|3|(1:5)|79|80|(0)|8|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap<java.lang.String, java.lang.Integer> LIZIZ(java.lang.String r11, java.util.ArrayList<java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22680um.LIZIZ(java.lang.String, java.util.ArrayList):java.util.HashMap");
    }
}
