package X;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public final class ZWY {
    public final long LIZ;
    public final int LIZIZ;
    public final boolean LIZJ = false;
    public final JSONObject LIZLLL;

    public /* synthetic */ ZWY(long j, int i, JSONObject jSONObject) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZLLL = jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZJ), this.LIZLLL});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZWY)) {
            return false;
        }
        ZWY zwy = (ZWY) obj;
        if (this.LIZ == zwy.LIZ && this.LIZIZ == zwy.LIZIZ && this.LIZJ == zwy.LIZJ && C64363PNv.LIZ(this.LIZLLL, zwy.LIZLLL)) {
            return true;
        }
        return false;
    }
}
