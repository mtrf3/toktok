package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class LFB {
    public final LFB LIZ;
    public final String LIZIZ;

    public abstract int LIZ();

    public final int LIZIZ() {
        int LIZ = LIZ();
        List<String> list = LF7.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        ((ArrayList) list).add(C40084FoG.LIZ(LIZ2, this.LIZIZ, " : ", LIZ, LIZ2));
        if (LIZ == 0) {
            LFB lfb = this.LIZ;
            if (lfb != null) {
                return lfb.LIZIZ();
            }
            return 0;
        }
        return LIZ;
    }

    public LFB(LFB lfb, String str) {
        this.LIZ = lfb;
        this.LIZIZ = str;
    }
}
