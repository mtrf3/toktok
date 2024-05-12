package X;

import android.os.Process;

/* loaded from: classes12.dex */
public final class PRY extends PRV {
    public int LJFF;

    @Override // X.PRV
    public final boolean LJI() {
        this.LIZ = new C64446PRa[8];
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
        LJFF(1, "play_thread_");
        LJFF(2, "NetNormal#");
        LJFF(3, "ChromiumNet");
        LJFF(4, "EventUpload");
        LJFF(5, "assem-serial-t");
        LJFF(6, "RenderThread");
        LJFF(7, "explay_thread");
        return true;
    }

    @Override // X.PRV
    public final void LIZ() {
        C64446PRa[] c64446PRaArr;
        C64446PRa c64446PRa;
        super.LIZ();
        if (this.LIZLLL && (c64446PRaArr = this.LIZ) != null && (c64446PRa = c64446PRaArr[7]) != null && c64446PRa.LIZJ == null && this.LIZJ == 2) {
            if (this.LJFF < 3) {
                LJIIJJI();
            }
            this.LJFF++;
        }
    }

    @Override // X.PRV
    public final void LJIILJJIL(String[] strArr) {
        int i = 1;
        while (!LJIILIIL(i, strArr) && (i = i + 1) < 8) {
        }
    }
}
