package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes9.dex */
public final class KAB {
    public static final KC7 LIZIZ = new KC7();
    public static KAB LIZJ;
    public List<? extends Object> LIZ;

    public final String LIZ() {
        JSONArray jSONArray = new JSONArray();
        List<? extends Object> list = this.LIZ;
        if (list != null) {
            Iterator<? extends Object> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toString());
            }
        }
        String encode = android.net.Uri.encode(jSONArray.toString());
        o.LJIIIIZZ(encode, "encode(historiesJsonArray.toString())");
        return encode;
    }
}
