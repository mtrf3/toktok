package X;

import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E35 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E35)) {
            return false;
        }
        E35 e35 = (E35) obj;
        return o.LJ(this.LIZ, e35.LIZ) && this.LIZIZ == e35.LIZIZ && this.LIZJ == e35.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.LIZJ;
    }

    public final String toString() {
        int i;
        try {
            JSONObject putOpt = new JSONObject().putOpt("url", this.LIZ);
            if (this.LIZIZ) {
                i = 1;
            } else {
                i = 0;
            }
            String jSONObject = putOpt.putOpt("isblackResource", Integer.valueOf(i)).putOpt("status", Integer.valueOf(this.LIZJ)).toString();
            o.LJIIIIZZ(jSONObject, "{\n                    JS…tring()\n                }");
            return jSONObject;
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
            return "";
        }
    }

    public /* synthetic */ E35(int i, String str, int i2) {
        this(str, false, (i2 & 4) != 0 ? -1 : i);
    }

    public E35(String str, boolean z, int i) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = i;
    }
}
