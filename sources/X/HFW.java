package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFW {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public static HFW LIZ(int i, int i2, String msg) {
        o.LJIIIZ(msg, "msg");
        return new HFW(i, i2, msg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HFW)) {
            return false;
        }
        HFW hfw = (HFW) obj;
        return this.LIZ == hfw.LIZ && this.LIZIZ == hfw.LIZIZ && o.LJ(this.LIZJ, hfw.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + (((this.LIZ * 31) + this.LIZIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResultData(code=");
        LIZ.append(this.LIZ);
        LIZ.append(", frameCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", msg=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public HFW(int i, int i2, String msg) {
        o.LJIIIZ(msg, "msg");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = msg;
    }
}
