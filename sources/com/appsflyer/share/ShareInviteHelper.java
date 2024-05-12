package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context context) {
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
        String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        String string2 = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        String string3 = AppsFlyerProperties.getInstance().getString("AppUserId");
        LinkGenerator linkGenerator = new LinkGenerator("af_app_invites");
        linkGenerator.setBaseURL(string, string2, context.getPackageName());
        linkGenerator.setReferrerUID(appsFlyerUID);
        linkGenerator.setReferrerCustomerId(string3);
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        String string4 = AppsFlyerProperties.getInstance().getString("onelinkScheme");
        if (string4 != null && string4.length() > 3) {
            linkGenerator.setBaseDeeplink(string4);
        }
        return linkGenerator;
    }

    public static void logInvite(Context context, String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            AFLogger.values("[Invite] Cannot report App-Invite with null/empty channel");
            return;
        }
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.values("CustomerUserId not set, report Invite is disabled", true);
            return;
        }
        LinkGenerator generateInviteUrl = generateInviteUrl(context);
        generateInviteUrl.addParameters(map);
        AFLogger.AFInAppEventType("[Invite] Reporting App-Invite via channel: ".concat(String.valueOf(str)));
        AFLogger.AFInAppEventType("[Invite] Generated URL: " + generateInviteUrl.generateLink());
        String mediaSource = generateInviteUrl.getMediaSource();
        if ("af_app_invites".equals(mediaSource)) {
            mediaSource = "af_invite";
        } else if ("af_user_share".equals(mediaSource)) {
            mediaSource = "af_share";
        }
        HashMap hashMap = new HashMap();
        if (generateInviteUrl.getParameters() != null) {
            hashMap.putAll(generateInviteUrl.getParameters());
        }
        hashMap.put("af_channel", str);
        AppsFlyerLib.getInstance().logEvent(context, mediaSource, hashMap);
    }
}
