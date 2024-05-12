package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectReuseDetails;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173076ql {
    public static List LIZ(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.optString("effect_duration"));
            C118234kV it = C78842Uww.LJJ(0, jSONArray.length()).iterator();
            while (it.LJLJI) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, it.nextInt());
                double d = 1000;
                arrayList.add(new EditEffectReuseDetails(O6R.LJJIJ(jSONObject2.optDouble("start_time") * d), O6R.LJJIJ(jSONObject2.optDouble("end_time") * d)));
            }
            return arrayList;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unable to parse edit effect duration ");
            LIZ.append(e);
            X1D.LIZIZ(LIZ);
            return null;
        }
    }
}
