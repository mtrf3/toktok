package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public class SubscriptionOrderStateResponseEntity extends ResponseEntity {
    public Data data;

    /* loaded from: classes14.dex */
    public static class Data {
        public SubsInfo subsInfo;
    }

    /* loaded from: classes14.dex */
    public static class SubsInfo {
        public int status;
    }

    public static SubscriptionOrderStateResponseEntity fromJson(String str) {
        JSONObject optJSONObject;
        SubscriptionOrderStateResponseEntity subscriptionOrderStateResponseEntity = new SubscriptionOrderStateResponseEntity();
        Data data = new Data();
        SubsInfo subsInfo = new SubsInfo();
        subscriptionOrderStateResponseEntity.data = data;
        data.subsInfo = subsInfo;
        try {
            JSONObject jSONObject = new JSONObject(str);
            subscriptionOrderStateResponseEntity.errorCode = jSONObject.optInt("error_code");
            subscriptionOrderStateResponseEntity.message = jSONObject.optString("message");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("SubsInfo")) != null) {
                subsInfo.status = optJSONObject.optInt("Status");
            }
        } catch (Throwable unused) {
        }
        return subscriptionOrderStateResponseEntity;
    }
}
