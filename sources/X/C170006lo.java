package X;

import java.util.LinkedHashMap;

/* renamed from: X.6lo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170006lo {
    public int LIZ;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public final java.util.Map<String, Long> LIZLLL = new LinkedHashMap();
    public final java.util.Map<String, Long> LJ = new LinkedHashMap();
    public boolean LJFF;

    public final void LIZIZ(int i) {
        if (this.LIZ != i) {
            this.LIZ = i;
            this.LIZIZ = 0L;
            this.LIZJ = 0L;
            ((LinkedHashMap) this.LIZLLL).clear();
            ((LinkedHashMap) this.LJ).clear();
            LIZJ(false);
        }
    }

    public final void LIZJ(boolean z) {
        this.LJFF = z;
        if (!z) {
            ((LinkedHashMap) this.LIZLLL).clear();
            ((LinkedHashMap) this.LJ).clear();
        }
    }

    public final void LIZ(int i, int i2) {
        long j = this.LIZIZ;
        if (j >= 0 && j > 0) {
            long j2 = i;
            if (j < 0) {
                j = 0;
            }
            this.LIZIZ = j2 - j;
        }
        long j3 = this.LIZJ;
        if (j3 > 0) {
            this.LIZJ = i2 - j3;
        }
    }
}
