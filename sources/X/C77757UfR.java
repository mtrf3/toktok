package X;

import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.UfR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77757UfR {
    public static void LIZ(LocationObject locationObject, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
            String string = JSONObjectProtectorUtils.getString(jSONObject, "name");
            o.LJIIIIZZ(string, "countryItem.getString(\"name\")");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "code");
            o.LJIIIIZZ(string2, "countryItem.getString(\"code\")");
            String string3 = JSONObjectProtectorUtils.getString(jSONObject, "asci_name");
            o.LJIIIIZZ(string3, "countryItem.getString(\"asci_name\")");
            int i2 = JSONObjectProtectorUtils.getInt(jSONObject, "geoname_id");
            String string4 = JSONObjectProtectorUtils.getString(jSONObject, "description");
            o.LJIIIIZZ(string4, "countryItem.getString(\"description\")");
            LocationObject locationObject2 = new LocationObject(locationObject, string, string2, string3, i2, string4);
            arrayList.add(locationObject2);
            if (jSONObject.has("sub_region")) {
                JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject, "sub_region");
                o.LJIIIIZZ(jSONArray2, "countryItem.getJSONArray(\"sub_region\")");
                LIZ(locationObject2, jSONArray2);
            }
        }
        locationObject.subRegion = arrayList;
    }
}
