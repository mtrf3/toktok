package X;

import defpackage.b0;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class UV2 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final int LJI;
    public final String LJII;
    public final long LJIIIIZZ;
    public final HashMap<String, String> LJIIIZ;
    public final long LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;

    public final String LJIIIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{giftID:");
        LIZ.append(this.LIZ);
        LIZ.append(", roomID:");
        LIZ.append(this.LIZIZ);
        LIZ.append(", toUserID:");
        LIZ.append(this.LIZJ);
        LIZ.append(", count:");
        return b0.LIZJ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public UV2(long j, long j2, long j3, int i, String str, long j4, int i2, String str2, long j5, HashMap<String, String> hashMap, long j6, String str3, String source, String str4, String str5) {
        o.LJIIIZ(source, "source");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = j4;
        this.LJI = i2;
        this.LJII = str2;
        this.LJIIIIZZ = j5;
        this.LJIIIZ = hashMap;
        this.LJIIJ = j6;
        this.LJIIJJI = str3;
        this.LJIIL = source;
        this.LJIILIIL = str4;
        this.LJIILJJIL = str5;
    }
}
