package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* loaded from: classes12.dex */
public final class PUS {
    public static PUR LIZ;
    public static long LIZIZ;
    public static final PUS LIZJ = new PUS();

    public static final PUR LIZIZ() {
        synchronized (LIZJ) {
            PUR pur = LIZ;
            if (pur != null) {
                LIZ = pur.LJFF;
                pur.LJFF = null;
                LIZIZ -= FileUtils.BUFFER_SIZE;
                return pur;
            }
            return new PUR();
        }
    }

    public static final void LIZ(PUR pur) {
        if (pur.LJFF == null && pur.LJI == null) {
            if (pur.LIZLLL) {
                return;
            }
            synchronized (LIZJ) {
                long j = LIZIZ + FileUtils.BUFFER_SIZE;
                if (j > 65536) {
                    return;
                }
                LIZIZ = j;
                pur.LJFF = LIZ;
                pur.LIZJ = 0;
                pur.LIZIZ = 0;
                LIZ = pur;
                return;
            }
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
