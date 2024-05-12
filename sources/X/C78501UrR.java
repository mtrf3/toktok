package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.UrR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78501UrR {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONArray LIZ(InterfaceC78502UrS value) {
        o.LJIIJ(value, "value");
        JSONArray jSONArray = new JSONArray();
        Iterator<Object> it = value.LIZ().iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i >= 0) {
                switch (C78504UrU.LIZ[value.getType(i).ordinal()]) {
                    case 1:
                        InterfaceC78502UrS array = value.getArray(i);
                        if (array == null) {
                            break;
                        } else {
                            jSONArray.put(LIZ(array));
                            break;
                        }
                    case 2:
                        InterfaceC78280Uns map = value.getMap(i);
                        if (map == null) {
                            break;
                        } else {
                            jSONArray.put(LIZIZ(map));
                            break;
                        }
                    case 3:
                        jSONArray.put(value.getString(i));
                        break;
                    case 4:
                        jSONArray.put(value.getDouble(i));
                        break;
                    case 5:
                        jSONArray.put(value.getInt(i));
                        break;
                    case 6:
                        jSONArray.put(value.getBoolean(i));
                        break;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return jSONArray;
    }

    public static JSONObject LIZIZ(InterfaceC78280Uns value) {
        o.LJIIJ(value, "value");
        JSONObject jSONObject = new JSONObject();
        UFL LIZ2 = value.LIZ();
        while (LIZ2.hasNextKey()) {
            String nextKey = LIZ2.nextKey();
            switch (C78504UrU.LIZIZ[value.getType(nextKey).ordinal()]) {
                case 1:
                    InterfaceC78502UrS array = value.getArray(nextKey);
                    if (array == null) {
                        break;
                    } else {
                        jSONObject.put(nextKey, LIZ(array));
                        break;
                    }
                case 2:
                    InterfaceC78280Uns map = value.getMap(nextKey);
                    if (map == null) {
                        break;
                    } else {
                        jSONObject.put(nextKey, LIZIZ(map));
                        break;
                    }
                case 3:
                    jSONObject.put(nextKey, value.getString(nextKey));
                    break;
                case 4:
                    jSONObject.put(nextKey, value.getBoolean(nextKey));
                    break;
                case 5:
                    jSONObject.put(nextKey, value.getInt(nextKey));
                    break;
                case 6:
                    jSONObject.put(nextKey, value.getDouble(nextKey));
                    break;
            }
        }
        return jSONObject;
    }
}
