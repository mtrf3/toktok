package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GuS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43016GuS {
    public final QXX LIZ;
    public long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public boolean LJ;
    public final boolean LJFF;
    public final String LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43016GuS)) {
            return false;
        }
        C43016GuS c43016GuS = (C43016GuS) obj;
        return o.LJ(this.LIZ, c43016GuS.LIZ) && this.LIZIZ == c43016GuS.LIZIZ && o.LJ(this.LIZJ, c43016GuS.LIZJ) && o.LJ(this.LIZLLL, c43016GuS.LIZLLL) && this.LJ == c43016GuS.LJ && this.LJFF == c43016GuS.LJFF && o.LJ(this.LJI, c43016GuS.LJI) && this.LJII == c43016GuS.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        QXX qxx = this.LIZ;
        int i = 0;
        if (qxx == null) {
            hashCode = 0;
        } else {
            hashCode = qxx.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, hashCode * 31, 31), 31), 31);
        boolean z = this.LJ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LJ + i3) * 31;
        boolean z2 = this.LJFF;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        String str = this.LJI;
        if (str != null) {
            i = str.hashCode();
        }
        int i7 = (i6 + i) * 31;
        if (!this.LJII) {
            i2 = 0;
        }
        return i7 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AIMusicFetchTaskParam(uploadFrameTaskParam=");
        LIZ.append(this.LIZ);
        LIZ.append(", videoDuration=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", creationId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", microAppId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", requestAiMusicAdvance=");
        LIZ.append(this.LJ);
        LIZ.append(", waitFrameUploaded=");
        LIZ.append(this.LJFF);
        LIZ.append(", musicID=");
        LIZ.append(this.LJI);
        LIZ.append(", isL8Import=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C43016GuS(QXX qxx, long j, String creationId, String microAppId, boolean z, String str, boolean z2, int i) {
        j = (i & 2) != 0 ? -1L : j;
        creationId = (i & 4) != 0 ? "" : creationId;
        microAppId = (i & 8) != 0 ? "" : microAppId;
        if ((i & 16) != 0) {
            if (C00F.LIZ(31744, 0, "ai_music_opti_exp", true) != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        boolean z3 = (i & 32) != 0;
        str = (i & 64) != 0 ? "" : str;
        z2 = (i & 128) != 0 ? false : z2;
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(microAppId, "microAppId");
        this.LIZ = qxx;
        this.LIZIZ = j;
        this.LIZJ = creationId;
        this.LIZLLL = microAppId;
        this.LJ = z;
        this.LJFF = z3;
        this.LJI = str;
        this.LJII = z2;
    }
}
