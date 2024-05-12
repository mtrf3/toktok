package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class VDM {
    public final String LIZ;
    public final InterfaceC79374VDe LIZIZ;
    public final List<Pair<String, String>> LIZJ;
    public final boolean LIZLLL;

    public VDM(VDL vdl) {
        vdl.getClass();
        this.LIZ = vdl.LIZ;
        InterfaceC79374VDe interfaceC79374VDe = vdl.LIZIZ;
        if (interfaceC79374VDe == null) {
            this.LIZIZ = new VDP();
        } else {
            this.LIZIZ = interfaceC79374VDe;
        }
        this.LIZJ = new ArrayList();
        this.LIZLLL = vdl.LIZJ;
    }
}
