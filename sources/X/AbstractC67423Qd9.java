package X;

import defpackage.i0;

/* renamed from: X.Qd9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67423Qd9 {
    public static final C67422Qd8 LIZ;

    public abstract int LIZ();

    public abstract long LIZIZ();

    public abstract int LIZJ();

    public abstract int LIZLLL();

    public abstract long LJ();

    static {
        C67434QdK c67434QdK = new C67434QdK();
        c67434QdK.LIZ = 10485760L;
        c67434QdK.LIZIZ = 200;
        c67434QdK.LIZJ = 10000;
        c67434QdK.LIZLLL = 604800000L;
        c67434QdK.LJ = 81920;
        String str = "";
        if (c67434QdK.LIZ == null) {
            str = i0.LJFF("", " maxStorageSizeInBytes");
        }
        if (c67434QdK.LIZIZ == null) {
            str = i0.LJFF(str, " loadBatchSize");
        }
        if (c67434QdK.LIZJ == null) {
            str = i0.LJFF(str, " criticalSectionEnterTimeoutMs");
        }
        if (c67434QdK.LIZLLL == null) {
            str = i0.LJFF(str, " eventCleanUpAge");
        }
        if (c67434QdK.LJ == null) {
            str = i0.LJFF(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            LIZ = new C67422Qd8(c67434QdK.LIZ.longValue(), c67434QdK.LIZIZ.intValue(), c67434QdK.LIZJ.intValue(), c67434QdK.LIZLLL.longValue(), c67434QdK.LJ.intValue());
            return;
        }
        throw new IllegalStateException(i0.LJFF("Missing required properties:", str));
    }
}
