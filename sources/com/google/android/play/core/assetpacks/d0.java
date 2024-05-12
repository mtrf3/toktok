package com.google.android.play.core.assetpacks;

import X.C0MT;
import X.V1I;

/* loaded from: classes7.dex */
public final class d0 extends AssetPackState {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final int LJI;

    public d0(String str, long j, long j2, int i, int i2, int i3, int i4) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = i3;
        this.LJI = i4;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int LIZ() {
        return this.LJI;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long LIZJ() {
        return this.LIZLLL;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int LJ() {
        return this.LIZJ;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String LJFF() {
        return this.LIZ;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int LJI() {
        return this.LIZIZ;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long LJII() {
        return this.LJ;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int LJIIIIZZ() {
        return this.LJFF;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.LIZ.equals(assetPackState.LJFF()) && this.LIZIZ == assetPackState.LJI() && this.LIZJ == assetPackState.LJ() && this.LIZLLL == assetPackState.LIZJ() && this.LJ == assetPackState.LJII() && this.LJFF == assetPackState.LJIIIIZZ() && this.LJI == assetPackState.LIZ()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode();
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        long j = this.LIZLLL;
        long j2 = this.LJ;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.LJFF) * 1000003) ^ this.LJI;
    }

    public final String toString() {
        String str = this.LIZ;
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        long j = this.LIZLLL;
        long j2 = this.LJ;
        int i3 = this.LJFF;
        int i4 = this.LJI;
        StringBuilder sb = new StringBuilder(str.length() + 217);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        V1I.LIZLLL(sb, ", errorCode=", i2, ", bytesDownloaded=");
        sb.append(j);
        C0MT.LIZLLL(sb, ", totalBytesToDownload=", j2, ", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
