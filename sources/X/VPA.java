package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public final class VPA {
    public final ReadableMap LIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{ ");
        LIZ.append(C16880lQ.LJLLJ(VPA.class));
        LIZ.append(": ");
        LIZ.append(this.LIZ.toString());
        LIZ.append(" }");
        return X1D.LIZIZ(LIZ);
    }

    public VPA(ReadableMap readableMap) {
        this.LIZ = readableMap;
    }

    public final ReadableArray LIZ(String str) {
        return this.LIZ.getArray(str);
    }

    public final F5B LIZLLL(String str) {
        return this.LIZ.getDynamic(str);
    }

    public final ReadableMap LJI(String str) {
        return this.LIZ.getMap(str);
    }

    public final String LJII(String str) {
        return this.LIZ.getString(str);
    }

    public final boolean LJIIIIZZ(String str) {
        return this.LIZ.hasKey(str);
    }

    public final boolean LJIIIZ(String str) {
        return this.LIZ.isNull(str);
    }

    public final boolean LIZIZ(String str, boolean z) {
        if (this.LIZ.isNull(str)) {
            return z;
        }
        return this.LIZ.getBoolean(str);
    }

    public final double LIZJ(String str, double d) {
        if (this.LIZ.isNull(str)) {
            return d;
        }
        return this.LIZ.getDouble(str);
    }

    public final float LJ(String str, float f) {
        if (this.LIZ.isNull(str)) {
            return f;
        }
        return (float) this.LIZ.getDouble(str);
    }

    public final int LJFF(String str, int i) {
        if (this.LIZ.isNull(str)) {
            return i;
        }
        return this.LIZ.getInt(str);
    }
}
