package com.google.android.play.core.assetpacks;

import X.C06510Nj;
import X.C1DI;
import X.FP1;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class e2 {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final byte[] LJFF;

    public e2() {
    }

    public e2(int i, long j, String str, boolean z, boolean z2, byte[] bArr) {
        this();
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            String str = this.LIZ;
            if (str != null ? str.equals(e2Var.LIZ) : e2Var.LIZ == null) {
                if (this.LIZIZ == e2Var.LIZIZ && this.LIZJ == e2Var.LIZJ && this.LIZLLL == e2Var.LIZLLL && this.LJ == e2Var.LJ && Arrays.equals(this.LJFF, e2Var.LJFF)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.LIZIZ;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.LIZJ) * 1000003) ^ (true != this.LIZLLL ? 1237 : 1231)) * 1000003) ^ (true == this.LJ ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.LJFF);
    }

    public final String toString() {
        String str = this.LIZ;
        long j = this.LIZIZ;
        int i = this.LIZJ;
        boolean z = this.LIZLLL;
        boolean z2 = this.LJ;
        String arrays = Arrays.toString(this.LJFF);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 126 + String.valueOf(arrays).length());
        C1DI.LIZIZ(sb, "ZipEntry{name=", str, ", size=");
        C06510Nj.LIZIZ(sb, j, ", compressionMethod=", i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return FP1.LIZLLL(sb, ", headerBytes=", arrays, "}");
    }
}
