package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E6R<V> implements Callable {
    public static final E6R<V> LJLIL = new E6R<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            C62822Ol8 c62822Ol8 = DJ3.LIZ;
            Object value = c62822Ol8.getValue();
            o.LJIIIIZZ(value, "<get-keva>(...)");
            String string = ((Keva) value).getString("event_list", "[]");
            o.LJIIIIZZ(string, "keva.getString(KEVA_KEY_…T_LIST, EMPTY_JSON_ARRAY)");
            Object value2 = c62822Ol8.getValue();
            o.LJIIIIZZ(value2, "<get-keva>(...)");
            ((Keva) value2).storeString("event_list", "[]");
            JSONArray jSONArray = new JSONArray(string);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject eventObj = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                o.LJIIIIZZ(eventObj, "eventObj");
                String optString = eventObj.optString("event_name");
                if (optString != null && optString.length() != 0) {
                    eventObj.remove("event_name");
                    FMX.LJIILJJIL(optString, eventObj);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }
}
