package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.86b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2058586b {
    public final String LIZ;
    public final CharSequence LIZIZ;
    public final Object LIZJ;

    public final String LIZ() {
        JSONObject jSONObject;
        try {
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LIZJ != null) {
            jSONObject = new JSONObject((String) this.LIZJ);
            if (jSONObject == null && jSONObject.has("VCodec")) {
                String optString = jSONObject.optString("VCodec");
                if (TextUtils.isEmpty(optString)) {
                    return null;
                }
                return optString;
            }
        }
        jSONObject = null;
        return jSONObject == null ? null : null;
    }

    public /* synthetic */ C2058586b(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = str2;
    }

    public /* synthetic */ C2058586b(CharSequence charSequence, String str, C61878OQg translationTextExtra) {
        o.LJIIIZ(translationTextExtra, "translationTextExtra");
        this.LIZ = str;
        this.LIZIZ = charSequence;
        this.LIZJ = translationTextExtra;
    }
}
