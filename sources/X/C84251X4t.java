package X;

/* renamed from: X.X4t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84251X4t implements PS3 {
    public final /* synthetic */ X4U LIZ;

    @Override // X.PS3
    public final long LIZ() {
        X4U x4u = this.LIZ;
        if (x4u.LJFF || x4u.LJI) {
            return -1L;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (x4u) {
            x4u.LJIL(currentTimeMillis);
            long optInt = x4u.LIZIZ.LIZ.optInt("read_timeout", -1);
            if (optInt >= 4000 && optInt > 0) {
                long j = x4u.LJJ;
                if (j > 0 && currentTimeMillis - j > optInt && x4u.LJIILJJIL(currentTimeMillis, optInt)) {
                    x4u.LJJ = currentTimeMillis;
                    x4u.LJJIFFI++;
                }
            }
        }
        return 2000L;
    }

    public C84251X4t(X4U x4u) {
        this.LIZ = x4u;
    }
}
