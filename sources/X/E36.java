package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E36 {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new E37();
    }

    public static void LIZ(Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        int length = objArr.length;
        if (length % 2 == 0) {
            for (int i = 0; i < length; i += 2) {
                try {
                    jSONObject.put(String.valueOf(objArr[i]), String.valueOf(objArr[i + 1]));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            jSONObject.toString();
            return;
        }
        throw new IllegalArgumentException();
    }
}
