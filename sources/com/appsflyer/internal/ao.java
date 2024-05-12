package com.appsflyer.internal;

import X.C16880lQ;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ao extends am {
    public c AFInAppEventParameterName;
    public boolean AFKeystoreWrapper;
    public String AFLogger$LogLevel;
    public String getLevel;

    /* loaded from: classes.dex */
    public interface c {
        void AFKeystoreWrapper(String str);

        void valueOf(Map<String, String> map);
    }

    public final boolean AFKeystoreWrapper() {
        if (!TextUtils.isEmpty(this.AFInAppEventType) && !TextUtils.isEmpty(this.getLevel) && !this.AFInAppEventType.equals("app")) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.am
    public final String valueOf() {
        return C16880lQ.LLLZ(am.values, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()}) + "/" + this.AFInAppEventType + "?id=" + this.getLevel;
    }

    @Override // com.appsflyer.internal.am
    public final void values() {
        String str = this.AFLogger$LogLevel;
        if (str == null) {
            str = "Can't get OneLink data";
        }
        this.AFInAppEventParameterName.AFKeystoreWrapper(str);
    }

    @Override // com.appsflyer.internal.am
    public final void AFKeystoreWrapper(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestProperty("Af-UUID", this.AppsFlyer2dXConversionCallback);
        String valueOf = String.valueOf(this.AFVersionDeclaration.get("build_number"));
        httpsURLConnection.setRequestProperty("Af-Meta-Sdk-Ver", valueOf);
        httpsURLConnection.setRequestProperty("Af-Meta-Counter", String.valueOf(this.AFVersionDeclaration.get("counter")));
        httpsURLConnection.setRequestProperty("Af-Meta-Model", String.valueOf(this.AFVersionDeclaration.get("model")));
        httpsURLConnection.setRequestProperty("Af-Meta-Platform", String.valueOf(this.AFVersionDeclaration.get("platformextension")));
        httpsURLConnection.setRequestProperty("Af-Meta-System-Version", String.valueOf(this.AFVersionDeclaration.get("sdk")));
        values(httpsURLConnection, this.valueOf, this.AppsFlyer2dXConversionCallback, this.AFInAppEventType, this.getLevel, valueOf);
    }

    @Override // com.appsflyer.internal.am
    public final void values(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.AFInAppEventParameterName.valueOf(hashMap);
        } catch (JSONException e) {
            this.AFInAppEventParameterName.AFKeystoreWrapper("Can't parse OneLink data");
            AFLogger.valueOf("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    public ao(Uri uri, ai aiVar, Context context) {
        super(aiVar, context, "GET");
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            String[] strArr = {"onelink.me", "onelnk.com", "app.aflink.com"};
            int i = 0;
            boolean z = false;
            do {
                z = uri.getHost().contains(strArr[i]) ? true : z;
                i++;
            } while (i < 3);
            if (i.AppsFlyer2dXConversionCallback != null) {
                AFLogger.AFInAppEventParameterName("Validate if link " + uri + " belongs to custom domains: " + Arrays.asList(i.AppsFlyer2dXConversionCallback));
                for (String str : i.AppsFlyer2dXConversionCallback) {
                    if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                        AFLogger.AFInAppEventType("Link matches custom domain: ".concat(String.valueOf(str)));
                        this.AFKeystoreWrapper = true;
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.AFInAppEventType = split[1];
                this.getLevel = split[2];
                this.AFLogger$LogLevel = uri.toString();
            }
        }
    }
}
