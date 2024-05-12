package X;

import java.util.List;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
public final class CZD implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI = false;

    public CZD(int i, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }

    public final void LIZ() {
        if (1 <= this.LJLIL) {
            int i = 1;
            while (true) {
                List<CZG> list = CZB.LIZJ.get(Integer.valueOf(this.LJLILLLLZI));
                if (list != null) {
                    Integer valueOf = Integer.valueOf(list.size());
                    if (valueOf.intValue() >= this.LJLIL) {
                        valueOf.intValue();
                        return;
                    }
                }
                CZB czb = CZB.LIZ;
                int i2 = this.LJLILLLLZI;
                int i3 = this.LJLJI;
                boolean z = this.LJLJJI;
                czb.getClass();
                CZB.LIZ(i2, i3, z);
                LockSupport.unpark(CZB.LIZIZ);
                if (i != this.LJLIL) {
                    i++;
                } else {
                    return;
                }
            }
        }
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
