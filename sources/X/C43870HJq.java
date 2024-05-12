package X;

import Y.AObjectS123S0200000_7;
import Y.AObjectS40S0201000_7;
import java.io.File;

/* renamed from: X.HJq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43870HJq {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public InterfaceC83865Wvl LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;

    public final void LIZ(InterfaceC43874HJu interfaceC43874HJu) {
        if (this.LJFF || this.LJII) {
            if (this.LJI) {
                String str = this.LIZ;
                String str2 = this.LIZIZ;
                InterfaceC83865Wvl interfaceC83865Wvl = this.LJ;
                if (interfaceC83865Wvl != null) {
                    interfaceC83865Wvl.c9(new C43873HJt(this, interfaceC43874HJu, str, str2, 0));
                    return;
                }
                return;
            }
            if (this.LIZ != null) {
                File file = new File(this.LIZ);
                if (file.exists()) {
                    C16880lQ.LLLZZIL(file);
                }
            }
            if (this.LIZIZ != null) {
                File file2 = new File(this.LIZIZ);
                if (file2.exists()) {
                    C16880lQ.LLLZZIL(file2);
                }
            }
            if (this.LIZ == null || this.LIZIZ == null || this.LJ == null) {
                return;
            }
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CameraVideoRecorder concatWithReleaseGPUResource concatAsync enableSingleSegmentConcatUseCopy ");
            LIZ.append(this.LIZLLL);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            this.LJ.J8(this.LIZ, this.LIZIZ, this.LIZLLL, this.LIZJ, new AObjectS123S0200000_7(interfaceC43874HJu, this, 6));
            return;
        }
        if (this.LJI) {
            C82891Wg3.LIZLLL().i("CameraVideoRecorder concat return 0");
            interfaceC43874HJu.LIZ(0, this.LIZ, this.LIZIZ, this.LIZJ);
            return;
        }
        if (this.LIZ != null) {
            File file3 = new File(this.LIZ);
            if (file3.exists()) {
                C16880lQ.LLLZZIL(file3);
            }
        }
        if (this.LIZIZ != null) {
            File file4 = new File(this.LIZIZ);
            if (file4.exists()) {
                C16880lQ.LLLZZIL(file4);
            }
        }
        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CameraVideoRecorder executeAsync concatasync enableSingleSegmentConcatUseCopy ");
        LIZ2.append(this.LIZLLL);
        LIZLLL2.i(X1D.LIZIZ(LIZ2));
        InterfaceC83865Wvl interfaceC83865Wvl2 = this.LJ;
        if (interfaceC83865Wvl2 != null) {
            interfaceC83865Wvl2.J8(this.LIZ, this.LIZIZ, this.LIZLLL, this.LIZJ, new AObjectS40S0201000_7(1, this, interfaceC43874HJu, 2));
        }
    }
}
