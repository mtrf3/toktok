package X;

import android.os.Process;
import defpackage.i0;

/* loaded from: classes12.dex */
public final class PRW extends PRV {
    public static int LJFF;

    @Override // X.PRV
    public final boolean LJI() {
        java.util.Set<String> set = C34591Dhr.LIZ;
        if (set == null || set.isEmpty()) {
            return false;
        }
        this.LIZ = new C64446PRa[set.size() + 1];
        C64446PRa c64446PRa = new C64446PRa();
        c64446PRa.LIZ = "proc";
        c64446PRa.LJII = 0;
        this.LIZIZ = c64446PRa;
        C64446PRa c64446PRa2 = new C64446PRa();
        c64446PRa2.LIZ = "self";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(Process.myPid());
        LIZ.append("");
        c64446PRa2.LIZIZ = X1D.LIZIZ(LIZ);
        c64446PRa2.LJII = 1;
        this.LIZ[0] = c64446PRa2;
        if (set.size() == 1 && set.contains(c64446PRa2.LIZ)) {
            return true;
        }
        for (String str : set) {
            int i = LJFF + 1;
            LJFF = i;
            LJFF(i, str);
        }
        this.LJ = true;
        return true;
    }

    @Override // X.PRV
    public final void LIZ() {
        super.LIZ();
        String str = "applaunch_";
        if (((Boolean) C35143Dql.LIZIZ.getValue()).booleanValue()) {
            str = i0.LJFF("applaunch_", "maincreate_");
        } else if (((Boolean) C35143Dql.LIZJ.getValue()).booleanValue()) {
            str = i0.LJFF("applaunch_", "measure_");
        }
        C64446PRa[] c64446PRaArr = this.LIZ;
        if (c64446PRaArr != null) {
            for (C64446PRa c64446PRa : c64446PRaArr) {
                FAK LIZ = C56672Kh.LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(c64446PRa.LIZ);
                LIZ.LJII(c64446PRa.LJI, X1D.LIZIZ(LIZ2));
            }
            if (this.LIZIZ != null) {
                C56672Kh.LIZ().LJII(this.LIZIZ.LJI, str);
            }
        }
    }

    @Override // X.PRV
    public final void LJIILJJIL(String[] strArr) {
        for (int i = 1; i < LJFF + 1 && !LJIILIIL(i, strArr); i++) {
        }
    }
}