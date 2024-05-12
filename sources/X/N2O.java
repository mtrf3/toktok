package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N2O implements N2P {
    @Override // X.N2P
    public final void LIZ(JSONObject jSONObject, String key, Object obj) {
        o.LJIIIZ(key, "key");
        jSONObject.put(key, obj);
    }
}
