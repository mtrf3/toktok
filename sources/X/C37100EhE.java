package X;

import android.app.PendingIntent;

/* renamed from: X.EhE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37100EhE {
    public final String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public int LJI;
    public PendingIntent LJII;
    public Exception LJIIIIZZ;
    public java.util.Map<String, Object> LJIIIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MorpheusState{packageName='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", versionCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", status=");
        LIZ.append(this.LIZJ);
        LIZ.append(", totalBytesToDownload=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", bytesDownloaded=");
        LIZ.append(this.LJ);
        LIZ.append(", downloadTime=");
        LIZ.append(this.LJFF);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJI);
        LIZ.append(", resolutionIntent=");
        LIZ.append(this.LJII);
        LIZ.append(", exception=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C37100EhE(String str, AbstractC40550Fvm abstractC40550Fvm) {
        this(str, EPA.LIZJ(), abstractC40550Fvm.LJIIJJI());
        this.LIZLLL = abstractC40550Fvm.LJIIL();
        this.LJ = abstractC40550Fvm.LIZJ();
        this.LJII = abstractC40550Fvm.LJIIIZ();
        this.LJI = abstractC40550Fvm.LJI();
    }

    public C37100EhE(long j, long j2, String str) {
        this.LIZ = str;
        this.LIZIZ = EPA.LIZJ();
        this.LIZJ = 6;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJI = -10;
    }

    public C37100EhE(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
