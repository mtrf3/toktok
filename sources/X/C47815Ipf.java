package X;

import java.util.HashMap;

/* renamed from: X.Ipf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47815Ipf {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;

    public final java.util.Map LIZ() {
        HashMap hashMap = new HashMap();
        long j = this.LJI;
        if (j > 0) {
            if (j > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.LJII = (currentTimeMillis - this.LJI) + this.LJII;
                this.LJI = currentTimeMillis;
            }
            hashMap.put("cri_t", Long.valueOf(this.LJII));
        }
        long j2 = this.LJ;
        if (j2 > 0) {
            if (j2 > 0) {
                long currentTimeMillis2 = System.currentTimeMillis();
                this.LJFF = (currentTimeMillis2 - this.LJ) + this.LJFF;
                this.LJ = currentTimeMillis2;
            }
            hashMap.put("ser_t", Long.valueOf(this.LJFF));
        }
        if (this.LIZJ > 0) {
            hashMap.put("bu_t", Long.valueOf(this.LIZLLL));
            hashMap.put("bu_l", Integer.valueOf(this.LIZIZ));
        }
        return hashMap;
    }
}
