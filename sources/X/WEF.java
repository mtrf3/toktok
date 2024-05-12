package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class WEF implements V1E {
    public final List<WE9> LIZ = new ArrayList();
    public final /* synthetic */ WEA LIZIZ;

    @Override // X.V1E
    public final void LIZ(File file) {
    }

    @Override // X.V1E
    public final void LIZJ(File file) {
    }

    public WEF(WEA wea) {
        this.LIZIZ = wea;
    }

    @Override // X.V1E
    public final void LIZIZ(File file) {
        WEE LJIILL = this.LIZIZ.LJIILL(file);
        if (LJIILL != null && LJIILL.LIZ == ".cnt") {
            ((ArrayList) this.LIZ).add(new WEG(LJIILL.LIZIZ, file));
        }
    }
}
