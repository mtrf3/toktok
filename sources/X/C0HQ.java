package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0HQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HQ {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final List LJIIIIZZ;
    public final List LJIIIZ;

    public final C0HL LIZ() {
        List list = this.LJIIIZ;
        if (list != null && !((ArrayList) list).isEmpty()) {
            return (C0HL) ListProtector.get(this.LJIIIZ, 0);
        }
        return null;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        String str = this.LIZ;
        String jSONObject = this.LIZIZ.toString();
        String str2 = this.LIZJ;
        String str3 = this.LIZLLL;
        String str4 = this.LJ;
        String str5 = this.LJI;
        String valueOf = String.valueOf(this.LJIIIIZZ);
        StringBuilder LIZLLL = C06540Nm.LIZLLL("ProductDetails{jsonString='", str, "', parsedJson=", jSONObject, ", productId='");
        YE1.LIZLLL(LIZLLL, str2, "', productType='", str3, "', title='");
        YE1.LIZLLL(LIZLLL, str4, "', productDetailsToken='", str5, "', subscriptionOfferDetails=");
        return JBR.LJFF(LIZLLL, valueOf, "}", LIZLLL);
    }

    public C0HQ(String str) {
        ArrayList arrayList;
        this.LIZ = str;
        JSONObject jSONObject = new JSONObject(str);
        this.LIZIZ = jSONObject;
        String optString = jSONObject.optString("productId");
        this.LIZJ = optString;
        String optString2 = jSONObject.optString("type");
        this.LIZLLL = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.LJ = jSONObject.optString("title");
                jSONObject.optString("name");
                this.LJFF = jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.LJI = jSONObject.optString("skuDetailsToken");
                this.LJII = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList2.add(new C0HO(JSONArrayProtectorUtils.getJSONObject(optJSONArray, i)));
                    }
                    this.LJIIIIZZ = arrayList2;
                } else {
                    if (optString2.equals("subs") || optString2.equals("play_pass_subs")) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = null;
                    }
                    this.LJIIIIZZ = arrayList;
                }
                JSONObject optJSONObject = this.LIZIZ.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.LIZIZ.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        arrayList3.add(new C0HL(JSONArrayProtectorUtils.getJSONObject(optJSONArray2, i2)));
                    }
                    this.LJIIIZ = arrayList3;
                } else if (optJSONObject != null) {
                    arrayList3.add(new C0HL(optJSONObject));
                    this.LJIIIZ = arrayList3;
                } else {
                    this.LJIIIZ = null;
                }
                final JSONObject optJSONObject2 = this.LIZIZ.optJSONObject("limitedQuantityInfo");
                if (optJSONObject2 != null) {
                    new Object(optJSONObject2) { // from class: X.0HI
                        {
                            JSONObjectProtectorUtils.getInt(optJSONObject2, "maximumQuantity");
                            JSONObjectProtectorUtils.getInt(optJSONObject2, "remainingQuantity");
                        }
                    };
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HQ)) {
            return false;
        }
        return TextUtils.equals(this.LIZ, ((C0HQ) obj).LIZ);
    }
}
