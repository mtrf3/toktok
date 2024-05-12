package com.ss.android.ugc.aweme.services.interceptor;

import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class ForcePhoneVerificationManager {
    public static final ForcePhoneVerificationManager INSTANCE = new ForcePhoneVerificationManager();
    public static ConditionalBindLoginParam conditionalBindLoginParam;

    public final void conditionalBindLoginSuccessOrCancel() {
        conditionalBindLoginParam = null;
    }

    public final ConditionalBindLoginParam getConditionalBindLoginParam() {
        return conditionalBindLoginParam;
    }

    public final void setConditionalBindLoginParam(ConditionalBindLoginParam conditionalBindLoginParam2) {
        conditionalBindLoginParam = conditionalBindLoginParam2;
    }

    public final ConditionalBindLoginParam getParam(String mobile, String code) {
        o.LJIIIZ(mobile, "mobile");
        o.LJIIIZ(code, "code");
        ConditionalBindLoginParam conditionalBindLoginParam2 = conditionalBindLoginParam;
        if (conditionalBindLoginParam2 != null) {
            conditionalBindLoginParam2.setMobile(mobile);
        }
        ConditionalBindLoginParam conditionalBindLoginParam3 = conditionalBindLoginParam;
        if (conditionalBindLoginParam3 != null) {
            conditionalBindLoginParam3.setCode(code);
        }
        return conditionalBindLoginParam;
    }

    public final void interceptParam(String str, Map<String, String> map) {
        JSONObject jSONObject;
        if (str == null || str.length() == 0 || map == null || map.isEmpty()) {
            return;
        }
        ConditionalBindLoginParam conditionalBindLoginParam2 = new ConditionalBindLoginParam();
        conditionalBindLoginParam = conditionalBindLoginParam2;
        conditionalBindLoginParam2.setOriginParam(map);
        try {
            jSONObject = new JSONObject(str).optJSONObject("data");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("profile_key");
        String optString2 = jSONObject.optString("email_code_key");
        boolean optBoolean = jSONObject.optBoolean("is_register_for_verify");
        ConditionalBindLoginParam conditionalBindLoginParam3 = conditionalBindLoginParam;
        if (conditionalBindLoginParam3 != null) {
            conditionalBindLoginParam3.setProfileKey(optString);
        }
        ConditionalBindLoginParam conditionalBindLoginParam4 = conditionalBindLoginParam;
        if (conditionalBindLoginParam4 != null) {
            conditionalBindLoginParam4.setEmailCodeKey(optString2);
        }
        ConditionalBindLoginParam conditionalBindLoginParam5 = conditionalBindLoginParam;
        if (conditionalBindLoginParam5 == null) {
            return;
        }
        conditionalBindLoginParam5.setRegister(optBoolean);
    }
}
