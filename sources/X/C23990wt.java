package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23990wt {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public List<C24010wv> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public String LJI;
    public final String LJII;
    public final List<C23990wt> LJIIIIZZ;
    public Object LJIIIZ;

    public final List<C23990wt> LIZ() {
        ArrayList arrayList = new ArrayList();
        List<C23990wt> list = this.LJIIIIZZ;
        if (list != null) {
            Iterator<C23990wt> it = list.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().LIZ());
            }
        }
        return arrayList;
    }

    public final boolean LIZIZ() {
        return TextUtils.equals(this.LJ, "R");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{mElement='");
        LIZ.append(this.LIZ);
        LIZ.append('\'');
        LIZ.append(", mIconUrl='");
        LIZ.append((String) null);
        LIZ.append('\'');
        LIZ.append(", mDarkIconUrl='");
        LIZ.append((String) null);
        LIZ.append('\'');
        LIZ.append(", mStartlingKey='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", mStyleType='");
        LIZ.append(this.LIZJ);
        LIZ.append('\'');
        LIZ.append(", mFrontendRuleJsonArray=");
        LIZ.append((Object) null);
        LIZ.append(", mFrontendRuleList=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mDisplayTag='");
        Q89.LIZIZ(LIZ, this.LJ, '\'', ", mParamName='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", mParamValue='");
        LIZ.append(this.LJI);
        LIZ.append('\'');
        LIZ.append(", mOptions=");
        LIZ.append((Object) null);
        LIZ.append(", mPlaceHolder='");
        LIZ.append((String) null);
        LIZ.append('\'');
        LIZ.append(", mDisplayOrder='");
        Q89.LIZIZ(LIZ, this.LJII, '\'', ", mSubElementList=");
        return C1NE.LIZIZ(LIZ, this.LJIIIIZZ, '}', LIZ);
    }

    public C23990wt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.LIZ = jSONObject.optString("element");
        this.LIZIZ = jSONObject.optString("starling_key");
        this.LIZJ = jSONObject.optString("style_type");
        this.LJ = jSONObject.optString("display_tag");
        this.LJFF = jSONObject.optString("param_name");
        this.LJII = jSONObject.optString("display_order");
        JSONArray optJSONArray = jSONObject.optJSONArray("sub_element_list");
        this.LJIIIIZZ = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    this.LJIIIIZZ.add(new C23990wt((JSONObject) optJSONArray.get(i)));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        this.LJIIIIZZ.addAll(LIZ());
    }
}
