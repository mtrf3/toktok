package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class LZK {
    public final C66930QOo LIZ;
    public final JSONObject LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LZK)) {
            return false;
        }
        LZK lzk = (LZK) obj;
        return o.LJ(this.LIZ, lzk.LIZ) && o.LJ(this.LIZIZ, lzk.LIZIZ);
    }

    public final int hashCode() {
        C66930QOo c66930QOo = this.LIZ;
        int hashCode = (c66930QOo == null ? 0 : c66930QOo.hashCode()) * 31;
        JSONObject jSONObject = this.LIZIZ;
        return hashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WsConnectState(connectEvent=");
        LIZ.append(this.LIZ);
        LIZ.append(", connectJson=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public LZK(C66930QOo c66930QOo, JSONObject jSONObject) {
        this.LIZ = c66930QOo;
        this.LIZIZ = jSONObject;
    }
}
