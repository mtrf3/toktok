package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastByteProtector;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PDX implements PCG {
    public static final boolean LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("traceparent");
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        String[] split = optString.split("-");
        if (split.length <= 0) {
            return false;
        }
        byte parseByte = CastByteProtector.parseByte(split[split.length - 1]);
        C64082PDa.LIZIZ().getClass();
        if ((parseByte & 1) <= 0) {
            return false;
        }
        return true;
    }
}
