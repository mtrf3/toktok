package com.android.billingclient.api;

import X.C1FC;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Purchase {
    public final String LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.LIZ));
    }

    public final C1FC LIZ() {
        String optString = this.LIZJ.optString("obfuscatedAccountId");
        String optString2 = this.LIZJ.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new C1FC(0, optString, optString2);
    }

    public final List<String> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        if (this.LIZJ.has("productIds")) {
            JSONArray optJSONArray = this.LIZJ.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.LIZJ.has("productId")) {
            arrayList.add(this.LIZJ.optString("productId"));
        }
        return arrayList;
    }

    public final int LIZJ() {
        if (this.LIZJ.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }

    public final String LIZLLL() {
        JSONObject jSONObject = this.LIZJ;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (TextUtils.equals(this.LIZ, purchase.LIZ) && TextUtils.equals(this.LIZIZ, purchase.LIZIZ)) {
            return true;
        }
        return false;
    }

    public Purchase(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = new JSONObject(str);
    }
}
