package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FXk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39132FXk {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public C39132FXk() {
        this(null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39132FXk)) {
            return false;
        }
        C39132FXk c39132FXk = (C39132FXk) obj;
        return o.LJ(this.LIZ, c39132FXk.LIZ) && o.LJ(this.LIZIZ, c39132FXk.LIZIZ) && o.LJ(this.LIZJ, c39132FXk.LIZJ) && o.LJ(this.LIZLLL, c39132FXk.LIZLLL) && o.LJ(this.LJ, c39132FXk.LJ) && o.LJ(this.LJFF, c39132FXk.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.LJ;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.LJFF;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("APPInfo4Monitor(deviceID=");
        LIZ.append(this.LIZ);
        LIZ.append(", hostAID=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", appVersion=");
        LIZ.append(this.LIZJ);
        LIZ.append(", update_version_code=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", channel=");
        LIZ.append(this.LJ);
        LIZ.append(", sdkVersion=");
        return JBR.LJFF(LIZ, this.LJFF, ")", LIZ);
    }

    public C39132FXk(String str, String str2, String str3, String str4, String str5, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = null;
    }
}
