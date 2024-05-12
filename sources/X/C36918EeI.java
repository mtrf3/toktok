package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EeI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36918EeI {
    public List<String> LIZ;
    public List<String> LIZIZ;
    public List<String> LIZJ;

    public final void LIZ(JSONObject jSONObject) {
        jSONObject.optLong("id");
        jSONObject.optString("log_extra");
        jSONObject.optInt("skip_time");
        jSONObject.optInt("patch_position");
        jSONObject.optInt("duration");
        jSONObject.optString("external_url");
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "play_track_url_list");
            if (jSONArray != null) {
                this.LIZ = LIZIZ(new String[1], jSONArray);
            }
        } catch (JSONException unused) {
        }
        try {
            JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject, "playover_track_url_list");
            if (jSONArray2 != null) {
                this.LIZIZ = LIZIZ(new String[1], jSONArray2);
            }
        } catch (JSONException unused2) {
        }
        try {
            JSONArray jSONArray3 = JSONObjectProtectorUtils.getJSONArray(jSONObject, "action_track_url_list");
            if (jSONArray3 != null) {
                this.LIZJ = LIZIZ(new String[1], jSONArray3);
            }
        } catch (JSONException unused3) {
        }
    }

    public static List LIZIZ(String[] strArr, Object obj) {
        if (strArr.length > 0) {
            strArr[0] = null;
        }
        try {
            if (obj instanceof String) {
                ArrayList arrayList = new ArrayList();
                String str = (String) obj;
                arrayList.add(str);
                if (strArr.length > 0) {
                    strArr[0] = str;
                }
                return arrayList;
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < length; i++) {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList2.add(string);
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            if (strArr.length > 0) {
                strArr[0] = jSONArray.toString();
            }
            return arrayList2;
        } catch (Exception unused) {
            return null;
        }
    }
}
