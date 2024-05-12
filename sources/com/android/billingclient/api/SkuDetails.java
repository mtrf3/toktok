package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SkuDetails {
    public final String LIZ;
    public final JSONObject LIZIZ;

    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.LIZ));
    }

    public final String LIZ() {
        return this.LIZIZ.optString("productId");
    }

    public final String LIZIZ() {
        return this.LIZIZ.optString("type");
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public SkuDetails(String str) {
        this.LIZ = str;
        JSONObject jSONObject = new JSONObject(str);
        this.LIZIZ = jSONObject;
        if (!TextUtils.isEmpty(jSONObject.optString("productId"))) {
            if (!TextUtils.isEmpty(jSONObject.optString("type"))) {
                return;
            } else {
                throw new IllegalArgumentException("SkuType cannot be empty.");
            }
        }
        throw new IllegalArgumentException("SKU cannot be empty.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.LIZ, ((SkuDetails) obj).LIZ);
    }
}
