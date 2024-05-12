package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fxy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40686Fxy {
    public static void LIZ(Context context, String str, String str2, JSONObject jSONObject, InterfaceC40687Fxz interfaceC40687Fxz) {
        if (!(context instanceof Activity)) {
            return;
        }
        if (!C38354F3m.LJ(str2)) {
            new ArrayList().add(new C66621QCr("User-Agent", str2));
        }
        if (!C38354F3m.LJ(str) && context != null) {
            if (jSONObject != null) {
                try {
                    String optString = jSONObject.optString("label");
                    JSONObject optJSONObject = jSONObject.optJSONObject("ext_json");
                    if (!C38354F3m.LJ(optString)) {
                        C73040SlY.LJIIIIZZ(context, "wap_stat", "app_download", optString, 0L, 0L, optJSONObject);
                    }
                } catch (Exception unused) {
                }
            }
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
                try {
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        intent.putExtra("pns.sandbox.dataflow_id", 1207967489);
                        Intent createChooser = Intent.createChooser(intent, "");
                        if (createChooser != null) {
                            if (!(context instanceof Activity)) {
                                createChooser.addFlags(268435456);
                            }
                            try {
                                C16880lQ.LIZJ(context, createChooser);
                            } catch (Exception unused2) {
                            }
                        }
                    }
                } catch (Exception unused3) {
                    C78983UzD.LJIILL("webview_download_resolveActivity");
                }
            }
            String string = context.getString(R.string.im9);
            o.LJIIIIZZ(string, "context.getString(R.string.network_error)");
            C5S1 c5s1 = new C5S1(context);
            c5s1.LIZLLL(string);
            c5s1.LJ();
        }
        if (interfaceC40687Fxz != null) {
            interfaceC40687Fxz.LIZ();
        }
    }

    public static JSONObject LIZIZ(long j, Context context, String str, String str2, String str3, String str4) {
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("label", "browser");
            jSONObject2.put("pageUrl", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("referer_url", str3);
            }
            if (!TextUtils.isEmpty(str3) && !str3.equals(str4)) {
                jSONObject2.put("init_url", str4);
            }
            jSONObject2.put("ad_id", j);
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("log_extra", str);
            }
            if (j <= 0) {
                jSONObject2.put("in_white_list", 1);
            }
            jSONObject.put("ext_json", jSONObject2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void LIZJ(Context context, String str, String str2, String str3, String str4, JSONObject jSONObject, InterfaceC40687Fxz interfaceC40687Fxz) {
        if (context == null || C38354F3m.LJ(str)) {
            return;
        }
        LIZ(context, str, str2, jSONObject, interfaceC40687Fxz);
    }
}
