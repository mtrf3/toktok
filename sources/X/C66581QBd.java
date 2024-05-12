package X;

import android.content.Context;
import java.io.File;
import java.util.List;

/* renamed from: X.QBd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66581QBd extends AbstractC43055Gv5 {
    @Override // X.AbstractC43055Gv5, X.InterfaceC37286EkE
    public final File LIZLLL() {
        return null;
    }

    @Override // X.AbstractC43055Gv5
    public final boolean LJFF() {
        try {
            Context LIZIZ = EF7.LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("clearDrafts ");
            LIZ.append(0);
            X1D.LIZIZ(LIZ);
            C66580QBc.LJ(C66580QBc.LJIIIIZZ(0, LIZIZ));
            C66580QBc.LIZ(0, EF7.LIZIZ());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.AbstractC43055Gv5
    public final String LJI() {
        return "CACHE";
    }

    @Override // X.AbstractC43055Gv5
    public final long LJIIIIZZ() {
        Context LIZIZ = EF7.LIZIZ();
        List LJIIIIZZ = C66580QBc.LJIIIIZZ(0, LIZIZ);
        List<File> LJIIIZ = C66580QBc.LJIIIZ(C16880lQ.LLIIJI(LIZIZ, null), 0);
        List<File> LJIIIZ2 = C66580QBc.LJIIIZ(C16880lQ.LLIIJLIL(LIZIZ), 0);
        return C66580QBc.LJII(LJIIIZ2) + C66580QBc.LJII(LJIIIZ) + C66580QBc.LJII(LJIIIIZZ);
    }
}
