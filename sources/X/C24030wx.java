package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0wx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24030wx {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public List<C23990wt> LJII = new ArrayList();
    public java.util.Map<String, C23990wt> LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public String LJIILIIL;
    public List<C24030wx> LJIILJJIL;

    public final List<C24030wx> LIZ() {
        ArrayList arrayList = new ArrayList();
        List<C24030wx> list = this.LJIILJJIL;
        if (list != null) {
            Iterator<C24030wx> it = list.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().LIZ());
            }
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{mPaymentMethodId='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", mPaymentMethod='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", mIconUrl='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", mDarkModeIconUrl='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", mPaymentMethodType='");
        Q89.LIZIZ(LIZ, this.LJ, '\'', ", mDisplayName='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", mStarlingKey='");
        Q89.LIZIZ(LIZ, this.LJI, '\'', ", mElements=");
        LIZ.append(this.LJII);
        LIZ.append(", mElementMap=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", mMaxLimitedAmount='");
        Q89.LIZIZ(LIZ, this.LJIIIZ, '\'', ", mMinLimitedAmount='");
        LIZ.append(this.LJIIJ);
        LIZ.append('\'');
        LIZ.append(", mCurrency='");
        LIZ.append((String) null);
        LIZ.append('\'');
        LIZ.append(", mIsPciSensitive=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", mIsSaveAble=");
        LIZ.append(this.LJIIL);
        LIZ.append(", mPackageName='");
        Q89.LIZIZ(LIZ, this.LJIILIIL, '\'', ", mSubPaymentMethods='");
        LIZ.append(this.LJIILJJIL);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C24030wx(JSONObject jSONObject) {
        this.LJIIIIZZ = new HashMap();
        this.LIZ = jSONObject.optString("payment_method_id");
        this.LIZIZ = jSONObject.optString("payment_method");
        this.LIZJ = jSONObject.optString("icon_url");
        this.LIZLLL = jSONObject.optString("dark_mode_icon_url");
        this.LJ = jSONObject.optString("payment_method_type");
        this.LJFF = jSONObject.optString("display_name");
        this.LJI = jSONObject.optString("starling_key");
        this.LJIIIZ = jSONObject.optString("max_limited_amount");
        this.LJIIJ = jSONObject.optString("min_limited_amount");
        this.LJIIJJI = jSONObject.optBoolean("pci_sensitive");
        this.LJIIL = jSONObject.optBoolean("saveable");
        this.LJIILIIL = jSONObject.optString("package_name");
        this.LJIIIIZZ = new HashMap();
        JSONArray optJSONArray = jSONObject.optJSONArray("elements");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    C23990wt c23990wt = new C23990wt((JSONObject) optJSONArray.get(i));
                    ((ArrayList) this.LJII).add(c23990wt);
                    ((ArrayList) this.LJII).addAll(c23990wt.LJIIIIZZ);
                    Iterator it = ((ArrayList) c23990wt.LJIIIIZZ).iterator();
                    while (it.hasNext()) {
                        C23990wt c23990wt2 = (C23990wt) it.next();
                        ((HashMap) this.LJIIIIZZ).put(c23990wt2.LIZ, c23990wt2);
                    }
                    ((HashMap) this.LJIIIIZZ).put(c23990wt.LIZ, c23990wt);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        this.LJIILJJIL = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("sub_payment_methods");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    ((ArrayList) this.LJIILJJIL).add(new C24030wx((JSONObject) optJSONArray2.get(i2)));
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        ((ArrayList) this.LJIILJJIL).addAll(LIZ());
    }
}
