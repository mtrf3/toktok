package com.google.android.play.core.appupdate;

import X.C0MT;
import X.C1EU;
import X.C65232Piu;
import X.FP1;
import X.YE1;
import android.app.PendingIntent;

/* loaded from: classes7.dex */
public final class r extends a {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Integer LJ;
    public final int LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final PendingIntent LJIIJ;
    public final PendingIntent LJIIJJI;
    public final PendingIntent LJIIL;
    public final PendingIntent LJIILIIL;

    public r(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = num;
        this.LJFF = i4;
        this.LJI = j;
        this.LJII = j2;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = j4;
        this.LJIIJ = pendingIntent;
        this.LJIIJJI = pendingIntent2;
        this.LJIIL = pendingIntent3;
        this.LJIILIIL = pendingIntent4;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final long LIZIZ() {
        return this.LJIIIIZZ;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final long LIZJ() {
        return this.LJI;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final long LIZLLL() {
        return this.LJIIIZ;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final Integer LJ() {
        return this.LJ;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final PendingIntent LJFF() {
        return this.LJIIJ;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final PendingIntent LJI() {
        return this.LJIIJJI;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final PendingIntent LJII() {
        return this.LJIIL;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final PendingIntent LJIIIIZZ() {
        return this.LJIILIIL;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final int LJIIJ() {
        return this.LIZLLL;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final String LJIIJJI() {
        return this.LIZ;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final long LJIIL() {
        return this.LJII;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final int LJIILIIL() {
        return this.LIZJ;
    }

    @Override // com.google.android.play.core.appupdate.a
    public final int LJIILJJIL() {
        return this.LJFF;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.LIZ.equals(aVar.LJIIJJI()) && this.LIZIZ == aVar.LIZ() && this.LIZJ == aVar.LJIILIIL() && this.LIZLLL == aVar.LJIIJ() && ((num = this.LJ) != null ? num.equals(aVar.LJ()) : aVar.LJ() == null) && this.LJFF == aVar.LJIILJJIL() && this.LJI == aVar.LIZJ() && this.LJII == aVar.LJIIL() && this.LJIIIIZZ == aVar.LIZIZ() && this.LJIIIZ == aVar.LIZLLL() && ((pendingIntent = this.LJIIJ) != null ? pendingIntent.equals(aVar.LJFF()) : aVar.LJFF() == null) && ((pendingIntent2 = this.LJIIJJI) != null ? pendingIntent2.equals(aVar.LJI()) : aVar.LJI() == null) && ((pendingIntent3 = this.LJIIL) != null ? pendingIntent3.equals(aVar.LJII()) : aVar.LJII() == null)) {
                PendingIntent pendingIntent4 = this.LJIILIIL;
                PendingIntent LJIIIIZZ = aVar.LJIIIIZZ();
                if (pendingIntent4 != null ? pendingIntent4.equals(LJIIIIZZ) : LJIIIIZZ == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ) * 1000003) ^ this.LIZJ) * 1000003) ^ this.LIZLLL) * 1000003;
        Integer num = this.LJ;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i = this.LJFF;
        long j = this.LJI;
        long j2 = this.LJII;
        long j3 = this.LJIIIIZZ;
        long j4 = this.LJIIIZ;
        int i2 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        PendingIntent pendingIntent = this.LJIIJ;
        int hashCode3 = (i2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.LJIIJJI;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.LJIIL;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.LJIILIIL;
        return hashCode5 ^ (pendingIntent4 != null ? pendingIntent4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.LIZ;
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        int i3 = this.LIZLLL;
        String valueOf = String.valueOf(this.LJ);
        int i4 = this.LJFF;
        long j = this.LJI;
        long j2 = this.LJII;
        long j3 = this.LJIIIIZZ;
        long j4 = this.LJIIIZ;
        String valueOf2 = String.valueOf(this.LJIIJ);
        String valueOf3 = String.valueOf(this.LJIIJJI);
        String valueOf4 = String.valueOf(this.LJIIL);
        String valueOf5 = String.valueOf(this.LJIILIIL);
        int length = str.length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + valueOf4.length() + valueOf5.length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        C1EU.LIZJ(sb, ", updateAvailability=", i2, ", installStatus=", i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i4);
        C0MT.LIZLLL(sb, ", bytesDownloaded=", j, ", totalBytesToDownload=");
        sb.append(j2);
        C0MT.LIZLLL(sb, ", additionalSpaceRequired=", j3, ", assetPackStorageSize=");
        C65232Piu.LIZLLL(sb, j4, ", immediateUpdateIntent=", valueOf2);
        YE1.LIZLLL(sb, ", flexibleUpdateIntent=", valueOf3, ", immediateDestructiveUpdateIntent=", valueOf4);
        return FP1.LIZLLL(sb, ", flexibleDestructiveUpdateIntent=", valueOf5, "}");
    }
}
