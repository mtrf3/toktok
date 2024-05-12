package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.lang.ref.WeakReference;

/* renamed from: X.Inq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47702Inq implements Runnable {
    public final WeakReference<C47783Ip9> LJLIL;
    public final WeakReference<C47752Ioe> LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        C47626Imc LJII;
        try {
            C47783Ip9 c47783Ip9 = this.LJLIL.get();
            C47752Ioe c47752Ioe = this.LJLILLLLZI.get();
            if (c47783Ip9 != null && c47752Ioe != null && (LJII = c47752Ioe.LJII()) != null) {
                double d = LJII.LIZ;
                double d2 = 1.401298464324817E-45d;
                if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d = 1.401298464324817E-45d;
                }
                c47783Ip9.LJJIJL = d;
                double d3 = LJII.LIZIZ;
                if (d3 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d2 = d3;
                }
                c47783Ip9.LJJIJLIJ = d2;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47702Inq(C47783Ip9 c47783Ip9, C47752Ioe c47752Ioe) {
        this.LJLIL = new WeakReference<>(c47783Ip9);
        this.LJLILLLLZI = new WeakReference<>(c47752Ioe);
    }
}
