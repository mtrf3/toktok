package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class H34 implements Runnable {
    public final /* synthetic */ C43422H2k LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ float LJLJJI;

    public H34(C43422H2k c43422H2k, int i, int i2, float f) {
        this.LJLIL = c43422H2k;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = f;
    }

    public final void LIZ() {
        List<String> list = this.LJLIL.LJIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type:");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" ext:");
        LIZ.append(this.LJLJI);
        LIZ.append(" f:");
        LIZ.append(this.LJLJJI);
        ((ArrayList) list).add(X1D.LIZIZ(LIZ));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
