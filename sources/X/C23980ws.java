package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23980ws {
    public List<Integer> LIZ;
    public final JSONArray LIZIZ;
    public final String LIZJ;
    public final JSONArray LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final List<Integer> LIZ() {
        if (this.LIZ == null) {
            this.LIZ = new ArrayList();
            if (this.LIZIZ != null) {
                for (int i = 0; i < this.LIZIZ.length(); i++) {
                    try {
                        this.LIZ.add((Integer) this.LIZIZ.get(i));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{mCvvLength=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mCardBrandRegex='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", mCardBrandLength=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mCardBrandDisplayName='");
        Q89.LIZIZ(LIZ, this.LJ, '\'', ", mCardBrand='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", mPaymentMethodId='");
        return C77800Ug8.LIZJ(LIZ, this.LJI, '\'', '}', LIZ);
    }

    public C23980ws(JSONObject jSONObject) {
        this.LIZIZ = jSONObject.optJSONArray("cvv_length");
        this.LIZJ = jSONObject.optString("card_brand_regex");
        this.LIZLLL = jSONObject.optJSONArray("card_brand_length");
        this.LJ = jSONObject.optString("card_brand_display_name");
        this.LJFF = jSONObject.optString("card_brand");
        this.LJI = jSONObject.optString("payment_method_id");
    }
}
