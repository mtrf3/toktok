package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Q0i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66300Q0i {
    public boolean LIZ;
    public boolean LIZIZ;
    public final java.util.Map<String, Object> LIZJ;
    public int LIZLLL;
    public String LJ;
    public Object LJFF;

    public C66300Q0i() {
        this(0, null, 7);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckResult(code=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", msg='");
        LIZ.append(this.LJ);
        LIZ.append("', needAbnormalHandler=");
        LIZ.append(this.LIZ);
        LIZ.append(", intercept=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", extraMap=");
        return C15890jp.LIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C66300Q0i(int i, String msg, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        msg = (i2 & 2) != 0 ? "" : msg;
        o.LJIIJ(msg, "msg");
        this.LIZLLL = i;
        this.LJ = msg;
        this.LJFF = null;
        this.LIZJ = new LinkedHashMap();
    }
}
