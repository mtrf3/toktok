package com.appsflyer;

import X.C16880lQ;
import android.content.Context;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.am;
import com.appsflyer.internal.o;
import com.appsflyer.share.LinkGenerator;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CreateOneLinkHttpTask extends am {
    public ResponseListener AFInAppEventParameterName;
    public String AFKeystoreWrapper;
    public final Map<String, String> AFLogger$LogLevel;
    public final String getLevel;
    public String init;

    /* loaded from: classes.dex */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    @Override // com.appsflyer.internal.am
    public final String valueOf() {
        return C16880lQ.LLLZ(am.values, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()}) + "/" + this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.am
    public final void values() {
        String string = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        LinkGenerator linkGenerator = new LinkGenerator("af_app_invites");
        linkGenerator.setBaseURL(this.AFInAppEventType, string, this.init);
        linkGenerator.addParameter("af_siteid", this.init);
        linkGenerator.addParameters(this.AFLogger$LogLevel);
        ai.valueOf();
        String string2 = AppsFlyerProperties.getInstance().getString("AppUserId");
        if (string2 != null) {
            linkGenerator.setReferrerCustomerId(string2);
        }
        this.AFInAppEventParameterName.onResponse(linkGenerator.generateLink());
    }

    @Override // com.appsflyer.internal.am
    public final void AFKeystoreWrapper(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", this.getLevel);
        hashMap.put("uuid", this.AppsFlyer2dXConversionCallback);
        hashMap.put("data", this.AFLogger$LogLevel);
        hashMap.put("meta", this.AFVersionDeclaration);
        String str = this.AFKeystoreWrapper;
        if (str != null) {
            hashMap.put("brand_domain", str);
        }
        String jSONObject = o.AFInAppEventParameterName(hashMap).toString();
        values(httpsURLConnection, this.valueOf, jSONObject);
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(jSONObject);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    @Override // com.appsflyer.internal.am
    public final void values(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.AFInAppEventParameterName.onResponse(jSONObject.optString(keys.next()));
            }
        } catch (JSONException e) {
            this.AFInAppEventParameterName.onResponseError("Can't parse one link data");
            AFLogger.valueOf("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    public CreateOneLinkHttpTask(String str, Map<String, String> map, ai aiVar, Context context) {
        super(aiVar, context, "POST");
        this.init = "";
        if (context == null) {
            AFLogger.values("CreateOneLinkHttpTask: context can't be null");
        } else {
            this.init = context.getPackageName();
        }
        this.AFInAppEventType = str;
        this.getLevel = "-1";
        this.AFLogger$LogLevel = map;
    }
}
