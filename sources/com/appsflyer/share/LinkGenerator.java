package com.appsflyer.share;

import X.C16880lQ;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.co;
import com.appsflyer.internal.k;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class LinkGenerator {
    public String AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFKeystoreWrapper;
    public String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    public String getLevel;
    public String init;
    public String onDeepLinkingNative;
    public String onInstallConversionFailureNative;
    public String valueOf;
    public String values;
    public Map<String, String> onAttributionFailureNative = new HashMap();
    public Map<String, String> onInstallConversionDataLoadedNative = new HashMap();

    private StringBuilder values() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.AFInAppEventParameterName;
        if (str2 != null && str2.startsWith("http")) {
            sb.append(this.AFInAppEventParameterName);
        } else {
            sb.append(C16880lQ.LLLZ(co.valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()}));
        }
        if (this.AFKeystoreWrapper != null) {
            sb.append('/');
            sb.append(this.AFKeystoreWrapper);
        }
        this.onInstallConversionDataLoadedNative.put("pid", this.valueOf);
        sb.append("?pid=");
        sb.append(AFInAppEventParameterName(this.valueOf, "media source"));
        String str3 = this.getLevel;
        if (str3 != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_uid", str3);
            sb.append("&af_referrer_uid=");
            sb.append(AFInAppEventParameterName(this.getLevel, "referrerUID"));
        }
        String str4 = this.values;
        if (str4 != null) {
            this.onInstallConversionDataLoadedNative.put("af_channel", str4);
            sb.append("&af_channel=");
            sb.append(AFInAppEventParameterName(this.values, "channel"));
        }
        String str5 = this.AppsFlyer2dXConversionCallback;
        if (str5 != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_customer_id", str5);
            sb.append("&af_referrer_customer_id=");
            sb.append(AFInAppEventParameterName(this.AppsFlyer2dXConversionCallback, "referrerCustomerId"));
        }
        String str6 = this.AFInAppEventType;
        if (str6 != null) {
            this.onInstallConversionDataLoadedNative.put("c", str6);
            sb.append("&c=");
            sb.append(AFInAppEventParameterName(this.AFInAppEventType, "campaign"));
        }
        String str7 = this.AFLogger$LogLevel;
        if (str7 != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_name", str7);
            sb.append("&af_referrer_name=");
            sb.append(AFInAppEventParameterName(this.AFLogger$LogLevel, "referrerName"));
        }
        String str8 = this.AFVersionDeclaration;
        if (str8 != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_image_url", str8);
            sb.append("&af_referrer_image_url=");
            sb.append(AFInAppEventParameterName(this.AFVersionDeclaration, "referrerImageURL"));
        }
        if (this.onDeepLinkingNative != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.onDeepLinkingNative);
            String str9 = "";
            if (!this.onDeepLinkingNative.endsWith("/")) {
                str = "/";
            } else {
                str = "";
            }
            sb2.append(str);
            String str10 = this.init;
            if (str10 != null) {
                sb2.append(str10);
            }
            this.onInstallConversionDataLoadedNative.put("af_dp", sb2.toString());
            sb.append("&af_dp=");
            sb.append(AFInAppEventParameterName(this.onDeepLinkingNative, "baseDeeplink"));
            if (this.init != null) {
                if (!this.onDeepLinkingNative.endsWith("/")) {
                    str9 = "%2F";
                }
                sb.append(str9);
                sb.append(AFInAppEventParameterName(this.init, "deeplinkPath"));
            }
        }
        for (String str11 : this.onAttributionFailureNative.keySet()) {
            if (!sb.toString().contains(str11 + "=" + AFInAppEventParameterName(this.onAttributionFailureNative.get(str11), str11))) {
                sb.append('&');
                sb.append(str11);
                sb.append('=');
                sb.append(AFInAppEventParameterName(this.onAttributionFailureNative.get(str11), str11));
            }
        }
        return sb;
    }

    public String generateLink() {
        return values().toString();
    }

    public String getBrandDomain() {
        return this.onInstallConversionFailureNative;
    }

    public String getCampaign() {
        return this.AFInAppEventType;
    }

    public String getChannel() {
        return this.values;
    }

    public String getMediaSource() {
        return this.valueOf;
    }

    public Map<String, String> getParameters() {
        return this.onAttributionFailureNative;
    }

    public LinkGenerator(String str) {
        this.valueOf = str;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.onAttributionFailureNative.putAll(map);
        }
        return this;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.onDeepLinkingNative = str;
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.onInstallConversionFailureNative = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventType = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.values = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.init = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.AppsFlyer2dXConversionCallback = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.AFVersionDeclaration = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.AFLogger$LogLevel = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.getLevel = str;
        return this;
    }

    public static String AFInAppEventParameterName(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException e) {
            AFLogger.valueOf("Illegal " + str2 + ": " + str, e);
            return "";
        } catch (Throwable th) {
            AFLogger.valueOf(th);
            return "";
        }
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.onAttributionFailureNative.put(str, str2);
        return this;
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        if (!this.onAttributionFailureNative.isEmpty()) {
            for (Map.Entry<String, String> entry : this.onAttributionFailureNative.entrySet()) {
                this.onInstallConversionDataLoadedNative.put(entry.getKey(), entry.getValue());
            }
        }
        values();
        String str = this.onInstallConversionFailureNative;
        Map<String, String> map = this.onInstallConversionDataLoadedNative;
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.values("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, ai.valueOf(), context);
        createOneLinkHttpTask.AFInAppEventParameterName = responseListener;
        createOneLinkHttpTask.AFKeystoreWrapper = str;
        if (k.values == null) {
            k.values = new k();
        }
        k.values.AFKeystoreWrapper().execute(createOneLinkHttpTask);
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFInAppEventParameterName = C16880lQ.LLLZ("https://%s/%s", new Object[]{C16880lQ.LLLZ("%sapp.%s", new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()}), str3});
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.AFInAppEventParameterName = C16880lQ.LLLZ("https://%s/%s", new Object[]{str2, str});
        }
        return this;
    }
}
