package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ALY {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final java.util.Map<String, String> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ALY)) {
            return false;
        }
        ALY aly = (ALY) obj;
        return o.LJ(this.LIZ, aly.LIZ) && o.LJ(this.LIZIZ, aly.LIZIZ) && o.LJ(this.LIZJ, aly.LIZJ) && o.LJ(this.LIZLLL, aly.LIZLLL) && o.LJ(this.LJ, aly.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return this.LJ.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", anchorId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterFromMerge=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", extras=");
        return C15890jp.LIZ(LIZ, this.LJ, ')', LIZ);
    }

    public ALY(String str, String str2, String str3, String str4, java.util.Map<String, String> extras) {
        o.LJIIIZ(extras, "extras");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = extras;
    }
}
