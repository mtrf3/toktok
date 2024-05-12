package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.lang.ref.WeakReference;

/* renamed from: X.Imd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47627Imd implements Runnable {
    public final WeakReference<C47751Iod> LJLIL;
    public final WeakReference<C47752Ioe> LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        C47626Imc LJII;
        try {
            C47751Iod c47751Iod = this.LJLIL.get();
            C47752Ioe c47752Ioe = this.LJLILLLLZI.get();
            if (c47751Iod != null && c47752Ioe != null && (LJII = c47752Ioe.LJII()) != null) {
                double d = LJII.LIZ;
                double d2 = 1.401298464324817E-45d;
                if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d = 1.401298464324817E-45d;
                }
                c47751Iod.N = d;
                double d3 = LJII.LIZIZ;
                if (d3 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d2 = d3;
                }
                c47751Iod.P = d2;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47627Imd(C47752Ioe c47752Ioe, C47751Iod c47751Iod) {
        this.LJLIL = new WeakReference<>(c47751Iod);
        this.LJLILLLLZI = new WeakReference<>(c47752Ioe);
    }
}
