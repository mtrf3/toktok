package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N3D {
    public int LIZ;
    public JSONArray LIZIZ;
    public final List<N3C> LIZJ = new ArrayList();

    public final boolean LIZ(N3H n3h, String str, JSONObject jSONObject) {
        java.util.Set<String> set;
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            N3C n3c = (N3C) it.next();
            n3c.getClass();
            if (!TextUtils.isEmpty(str) && (((set = n3c.LIZIZ) != null && set.contains(str)) || (jSONObject != null && n3c.LIZIZ(str, jSONObject)))) {
                return n3c.LIZJ(n3h);
            }
        }
        return false;
    }
}
