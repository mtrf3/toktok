package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class G40 implements FQV {
    public final JSONObject LIZ;

    public G40(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }

    @Override // X.FQV
    public final String LIZ(int i, String str) {
        String optString = this.LIZ.optString(String.valueOf(i), str);
        o.LJIIIIZZ(optString, "jsonObject.optString(key.toString(), def)");
        return optString;
    }
}
