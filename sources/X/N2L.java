package X;

import android.os.Bundle;
import com.facebook.share.model.CameraEffectArguments;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N2L {
    public static final HashMap<Class<?>, N2P> LIZ = C113554cx.LJJJLZIJ(new OSZ(String.class, new N2O()), new OSZ(String[].class, new N2M()), new OSZ(JSONArray.class, new N2N()));

    public static final JSONObject LIZ(CameraEffectArguments cameraEffectArguments) {
        java.util.Set<String> keySet;
        Object LLJJIII;
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = cameraEffectArguments.params;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            keySet = OQY.INSTANCE;
        }
        for (String str : keySet) {
            Bundle bundle2 = cameraEffectArguments.params;
            if (bundle2 != null && (LLJJIII = C16880lQ.LLJJIII(bundle2, str)) != null) {
                N2P n2p = LIZ.get(LLJJIII.getClass());
                if (n2p != null) {
                    n2p.LIZ(jSONObject, str, LLJJIII);
                } else {
                    throw new IllegalArgumentException(o.LJIILLIIL(LLJJIII.getClass(), "Unsupported type: "));
                }
            }
        }
        return jSONObject;
    }
}
