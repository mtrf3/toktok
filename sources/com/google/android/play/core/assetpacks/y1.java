package com.google.android.play.core.assetpacks;

import X.C06510Nj;
import X.C0MT;

/* loaded from: classes7.dex */
public final class y1 {
    public final int LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;

    public y1() {
    }

    public y1(long j, long j2, int i, int i2, String str) {
        this();
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            y1 y1Var = (y1) obj;
            if (this.LIZ == y1Var.LIZ && ((str = this.LIZIZ) != null ? str.equals(y1Var.LIZIZ) : y1Var.LIZIZ == null) && this.LIZJ == y1Var.LIZJ && this.LIZLLL == y1Var.LIZLLL && this.LJ == y1Var.LJ) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.LIZ ^ 1000003) * 1000003;
        String str = this.LIZIZ;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.LIZJ;
        long j2 = this.LIZLLL;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.LJ;
    }

    public final String toString() {
        int i = this.LIZ;
        String str = this.LIZIZ;
        long j = this.LIZJ;
        long j2 = this.LIZLLL;
        int i2 = this.LJ;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        C0MT.LIZLLL(sb, ", fileOffset=", j, ", remainingBytes=");
        C06510Nj.LIZIZ(sb, j2, ", previousChunk=", i2);
        sb.append("}");
        return sb.toString();
    }
}
