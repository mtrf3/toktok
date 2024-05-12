package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.IyS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48360IyS {
    public static void LIZ(String value, java.util.Map map, java.util.Map logParams) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(logParams, "logParams");
        map.putAll(logParams);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        AppLogNewUtils.onEventV3(value, jSONObject);
    }
}
