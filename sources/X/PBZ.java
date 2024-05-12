package X;

import java.util.HashSet;

/* loaded from: classes12.dex */
public final class PBZ {
    public static volatile PBZ LJ = new PBZ();
    public InterfaceC64048PBs LIZIZ;
    public final java.util.Set<InterfaceC64040PBk> LIZ = new HashSet();
    public int LIZJ = 80;
    public int LIZLLL = 5;

    public final synchronized void LIZ(InterfaceC64040PBk interfaceC64040PBk) {
        if (interfaceC64040PBk == null) {
            return;
        }
        ((HashSet) this.LIZ).add(interfaceC64040PBk);
    }

    public final void LIZIZ(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.LIZJ = i;
        this.LIZLLL = i2;
        if (!C78248UnM.LJIIJ()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("weed out config:maxSizeMB:");
        LIZ.append(i);
        LIZ.append(" keepDays:");
        LIZ.append(i2);
        C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ));
    }
}
