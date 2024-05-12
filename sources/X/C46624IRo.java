package X;

import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: X.IRo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46624IRo {
    public final InterfaceC46627IRr LIZ;
    public boolean LIZIZ;
    public long LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final boolean LIZ() {
        ?? r4;
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LIZJ;
        if (j == 0 || elapsedRealtime - j >= 5000) {
            this.LIZJ = elapsedRealtime;
            C46628IRs c46628IRs = ((C46625IRp) this.LIZ).LIZ;
            c46628IRs.LJI();
            float f = c46628IRs.LJLJL;
            int LIZ = ((C46625IRp) this.LIZ).LIZ();
            PowerManager powerManager = ((C46625IRp) this.LIZ).LIZ.LJLJI;
            if (powerManager != null) {
                r4 = powerManager.isPowerSaveMode();
            } else {
                r4 = -1;
            }
            ((C46625IRp) this.LIZ).LJ.getClass();
            boolean z2 = false;
            if (f > 37) {
                z = false;
            } else {
                z = true;
            }
            ((C46625IRp) this.LIZ).LJ.getClass();
            if (LIZ < 30) {
                z = false;
            }
            if (r4 != 1) {
                z2 = z;
            }
            ?? LIZ2 = X1D.LIZ();
            LIZ2.append("updateCpuSampleEnvironment:");
            LIZ2.append(z2);
            LIZ2.append(", temp:");
            LIZ2.append(f);
            LIZ2.append(", level:");
            LIZ2.append(LIZ);
            LIZ2.append(", powerSave:");
            LIZ2.append(r4);
            X1D.LIZIZ(LIZ2);
            this.LIZIZ = z2;
        }
        return this.LIZIZ;
    }

    public C46624IRo(InterfaceC46627IRr interfaceC46627IRr) {
        this.LIZ = interfaceC46627IRr;
    }
}
