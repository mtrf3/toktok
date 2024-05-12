package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class WEB implements V1E {
    public final List<WE9> LIZ = new ArrayList();
    public final EnumC79574VKw LIZIZ;
    public final /* synthetic */ WEA LIZJ;

    @Override // X.V1E
    public final void LIZ(File file) {
    }

    @Override // X.V1E
    public final void LIZJ(File file) {
    }

    @Override // X.V1E
    public final void LIZIZ(File file) {
        if (this.LIZIZ == EnumC79574VKw.CONFIG_FILE) {
            WEA wea = this.LIZJ;
            wea.getClass();
            WEE LIZ = WEE.LIZ(file);
            if (LIZ == null || !new File(wea.LJIILIIL(LIZ.LIZIZ)).equals(file.getParentFile()) || LIZ.LIZ != ".cnt") {
                return;
            }
            ((ArrayList) this.LIZ).add(new WEG(LIZ.LIZIZ, file));
            return;
        }
        WEE LJIILL = this.LIZJ.LJIILL(file);
        if (LJIILL == null) {
            return;
        }
        String str = LJIILL.LIZ;
        if (str != ".cnt" && str != ".tmp") {
            return;
        }
        ((ArrayList) this.LIZ).add(new WEG(LJIILL.LIZIZ, file));
    }

    public WEB(WEA wea, EnumC79574VKw enumC79574VKw) {
        this.LIZJ = wea;
        this.LIZIZ = enumC79574VKw;
    }
}
