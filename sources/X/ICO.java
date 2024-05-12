package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ICO {
    public static String LIZ(Effect bean) {
        o.LJIIIZ(bean, "bean");
        String sdkExtra = bean.getSdkExtra();
        if (sdkExtra != null) {
            try {
                return new JSONObject(sdkExtra).optJSONObject("vl").optString("imgK");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        return null;
    }
}
