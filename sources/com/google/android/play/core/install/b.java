package com.google.android.play.core.install;

import X.C0MT;
import X.V1I;

/* loaded from: classes7.dex */
public final class b extends InstallState {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public b(long j, long j2, int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.LJ = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long LIZ() {
        return this.LIZIZ;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int LIZIZ() {
        return this.LIZLLL;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int LIZJ() {
        return this.LIZ;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String LIZLLL() {
        return this.LJ;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long LJ() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.LIZ == installState.LIZJ() && this.LIZIZ == installState.LIZ() && this.LIZJ == installState.LJ() && this.LIZLLL == installState.LIZIZ() && this.LJ.equals(installState.LIZLLL())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.LIZ;
        long j = this.LIZIZ;
        long j2 = this.LIZJ;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.LIZLLL) * 1000003) ^ this.LJ.hashCode();
    }

    public final String toString() {
        int i = this.LIZ;
        long j = this.LIZIZ;
        long j2 = this.LIZJ;
        int i2 = this.LIZLLL;
        String str = this.LJ;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        V1I.LIZLLL(sb, "InstallState{installStatus=", i, ", bytesDownloaded=");
        sb.append(j);
        C0MT.LIZLLL(sb, ", totalBytesToDownload=", j2, ", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
