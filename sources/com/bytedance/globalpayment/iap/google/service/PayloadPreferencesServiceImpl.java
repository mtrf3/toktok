package com.bytedance.globalpayment.iap.google.service;

import X.C39670Fha;
import X.C77875UhL;
import X.C78273Unl;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class PayloadPreferencesServiceImpl implements PayloadPreferencesService {
    public static volatile PayloadPreferencesService instance;

    public static PayloadPreferencesService getInstance() {
        if (instance == null) {
            synchronized (PayloadPreferencesServiceImpl.class) {
                if (instance == null) {
                    instance = new PayloadPreferencesServiceImpl();
                }
            }
        }
        return instance;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void removePayload(Context context, String str) {
        C77875UhL.LIZLLL(context, str);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void removeQueryOrderParam(Context context, String str) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayloadPreferences: removeQueryOrderParam,order id is ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        SharedPreferences.Editor edit = C77875UhL.LIZJ(context).edit();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_query_order_");
        LIZ2.append(str);
        edit.remove(X1D.LIZIZ(LIZ2)).apply();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void addQueryOrderParam(Context context, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2) {
        String str6;
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayloadPreferences: addQueryOrderParam , order id is ");
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        SharedPreferences LIZJ = C77875UhL.LIZJ(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sku_id", str);
            jSONObject.put("merchant_id", str3);
            jSONObject.put("user_id", str4);
            jSONObject.put("is_subscription", z);
            jSONObject.put("is_new_subscription", z2);
            jSONObject.put("extra_payload", str5);
            str6 = jSONObject.toString();
        } catch (JSONException e) {
            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PayloadPreferences: generateNewQueryOrderString error:");
            LIZ2.append(e.getLocalizedMessage());
            X1D.LIZIZ(LIZ2);
            LJ2.getClass();
            str6 = null;
        }
        if (TextUtils.isEmpty(str6)) {
            return;
        }
        SharedPreferences.Editor edit = LIZJ.edit();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("key_query_order_");
        LIZ3.append(str2);
        edit.putString(X1D.LIZIZ(LIZ3), str6).apply();
    }
}
