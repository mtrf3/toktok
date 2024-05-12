package X;

import android.content.res.Resources;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.G3z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40915G3z implements FQV {
    public final JSONObject LIZ;
    public final Resources LIZIZ;

    public C40915G3z(JSONObject jSONObject, Resources resources) {
        this.LIZ = jSONObject;
        this.LIZIZ = resources;
    }

    @Override // X.FQV
    public final String LIZ(int i, String str) {
        String optString = this.LIZ.optString(this.LIZIZ.getResourceEntryName(i), str);
        o.LJIIIIZZ(optString, "jsonObject.optString(name, def)");
        return optString;
    }
}
