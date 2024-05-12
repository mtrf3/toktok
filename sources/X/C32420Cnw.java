package X;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.Cnw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32420Cnw {
    public final String LIZ;
    public final long LIZIZ;
    public final String[] LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public boolean LJI;
    public int LJII;
    public java.util.Map<String, String> LJIIIIZZ;
    public boolean LJIIIZ;

    public final String LIZ() {
        return this.LIZJ[Math.min(this.LJII, this.LIZJ.length - 1)];
    }

    public final void LIZIZ() {
        this.LJII++;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetResourceRequest{mId='");
        LIZ.append(this.LIZ);
        LIZ.append("', mResourceId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mUrls='");
        LIZ.append(Arrays.toString(this.LIZJ));
        LIZ.append("', mMd5='");
        LIZ.append(this.LJ);
        LIZ.append("', mSourceFrom='");
        LIZ.append(this.LIZLLL);
        LIZ.append("', mNeedToUnzip=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, '}', LIZ);
    }

    public C32420Cnw(long j, String[] strArr, String str) {
        this.LJII = -1;
        this.LJIIIIZZ = new HashMap();
        this.LJIIIZ = false;
        this.LIZ = String.valueOf(j);
        this.LIZIZ = j;
        this.LIZJ = strArr;
        this.LJ = str;
        this.LIZLLL = 0L;
        this.LJFF = true;
    }

    public C32420Cnw(String str, long j, String[] strArr, String str2, long j2, boolean z) {
        this.LJII = -1;
        this.LJIIIIZZ = new HashMap();
        this.LJIIIZ = false;
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = strArr;
        this.LJ = str2;
        this.LIZLLL = j2;
        this.LJFF = z;
    }
}
