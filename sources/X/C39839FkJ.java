package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FkJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39839FkJ implements InterfaceC39840FkK {
    @Override // X.InterfaceC39840FkK
    public final C39867Fkl LIZ(String content) {
        o.LJIIJ(content, "content");
        JSONObject LJJIIZ = C78983UzD.LJJIIZ("data", new JSONObject(content));
        if (LJJIIZ != null) {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> keys = LJJIIZ.keys();
            o.LJFF(keys, "it.keys()");
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJFF(key, "key");
                JSONObject LJJIIZ2 = C78983UzD.LJJIIZ(key, LJJIIZ);
                if (LJJIIZ2 != null) {
                    jSONObject.put(key, JSONObjectProtectorUtils.getString(LJJIIZ2, "val"));
                }
            }
            String jSONObject2 = jSONObject.toString();
            o.LJFF(jSONObject2, "res.toString()");
            return new C39867Fkl(jSONObject, jSONObject2);
        }
        return null;
    }
}
