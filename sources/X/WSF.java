package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSF {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final WSJ LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSF)) {
            return false;
        }
        WSF wsf = (WSF) obj;
        return o.LJ(this.LIZ, wsf.LIZ) && o.LJ(this.LIZIZ, wsf.LIZIZ) && o.LJ(this.LIZJ, wsf.LIZJ) && this.LIZLLL == wsf.LIZLLL && o.LJ(this.LJ, wsf.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomTabItem(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", tag=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", shootMode=");
        LIZ.append(this.LIZJ);
        LIZ.append(", defaultSelected=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", listener=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LJ + i) * 31;
        WSJ wsj = this.LJ;
        if (wsj == null) {
            hashCode = 0;
        } else {
            hashCode = wsj.hashCode();
        }
        return i2 + hashCode;
    }

    public /* synthetic */ WSF(String str) {
        this(str, "DUET_MODE_CAMERA_RECORD", "direct_shoot", false, null);
    }

    public WSF(String str, String str2, String str3, boolean z, WSJ wsj) {
        HH1.LIZ(str, "text", str2, "tag", str3, "shootMode");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = wsj;
        this.LJFF = true;
    }
}
