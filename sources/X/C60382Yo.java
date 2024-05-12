package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2Yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60382Yo {
    public final JSONObject LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C60382Yo) && o.LJ(this.LIZ, ((C60382Yo) obj).LIZ);
    }

    public final int hashCode() {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayActionExtraInfo(srMonitorInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C60382Yo(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }
}
