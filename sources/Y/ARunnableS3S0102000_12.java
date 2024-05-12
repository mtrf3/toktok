package Y;

import X.C57939MoZ;
import X.C74467TKl;
import X.XKS;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.bytedance.ies.powerlist.page.PowerPageState;

/* loaded from: classes13.dex */
public class ARunnableS3S0102000_12 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        XKS xks;
        int i = this.i1;
        PowerPageLoader powerPageLoader = (PowerPageLoader) this.l0;
        if (i <= powerPageLoader.LJLJJL.LIZ && (((xks = powerPageLoader.LJLLLLLL) == null || xks.isCancelled() || xks.isCompleted()) && powerPageLoader.LJ().LIZIZ.LJLILLLLZI.LJLIL.LIZJ == PowerPageState.Loaded)) {
            ((PowerPageLoader) this.l0).LJFF(null);
        }
        int i2 = this.i2 - this.i1;
        PowerPageLoader powerPageLoader2 = (PowerPageLoader) this.l0;
        C57939MoZ c57939MoZ = powerPageLoader2.LJLJJL;
        if (i2 <= c57939MoZ.LIZ + 1 && c57939MoZ.LJII) {
            XKS xks2 = powerPageLoader2.LJLZ;
            if ((xks2 == null || xks2.isCancelled() || xks2.isCompleted()) && powerPageLoader2.LJ().LIZIZ.LJLILLLLZI.LJLILLLLZI.LIZJ == PowerPageState.Loaded) {
                ((PowerPageLoader) this.l0).LJI(null);
            }
        }
    }

    public static final void run$0(ARunnableS3S0102000_12 aRunnableS3S0102000_12) {
        boolean LIZ;
        try {
            aRunnableS3S0102000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0102000_12 aRunnableS3S0102000_12) {
        boolean LIZ;
        try {
            C74467TKl c74467TKl = (C74467TKl) aRunnableS3S0102000_12.l0;
            int i = aRunnableS3S0102000_12.i1;
            int i2 = aRunnableS3S0102000_12.i2 + 1;
            if (c74467TKl.LJIIIIZZ.getWidth() == 0 && i2 < 3) {
                c74467TKl.LJIIIIZZ.post(new ARunnableS3S0102000_12(i, c74467TKl, i2, 1));
            } else {
                c74467TKl.LJIIIIZZ.LJLI(i);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS3S0102000_12(int i, int i2, PowerPageLoader<Object> powerPageLoader, int i3) {
        this.$t = i3;
        this.i1 = i;
        this.l0 = i2;
        this.i2 = powerPageLoader;
    }
}
