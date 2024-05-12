package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.EvV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37985EvV {
    public static void LIZIZ(Object value, String str) {
        o.LJIIJ(value, "value");
        C37960Ev6.LJJ.put(str, value);
    }

    public static void LIZ(String str, String from, JSONArray jSONArray) {
        o.LJIIJ(from, "from");
        ArrayList<C37987EvX> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            C37987EvX c37987EvX = new C37987EvX();
            c37987EvX.LIZIZ = JSONObjectProtectorUtils.getString(jSONArray.optJSONObject(i), "package_version");
            c37987EvX.LIZ = JSONObjectProtectorUtils.getString(jSONArray.optJSONObject(i), "channel");
            arrayList.add(c37987EvX);
        }
        HashMap<String, C37986EvW> hashMap = C37960Ev6.LJIL;
        C37986EvW c37986EvW = new C37986EvW();
        c37986EvW.LIZ = from;
        c37986EvW.LIZIZ = arrayList;
        hashMap.put(str, c37986EvW);
    }
}
