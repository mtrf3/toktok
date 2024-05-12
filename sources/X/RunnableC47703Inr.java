package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.lang.ref.WeakReference;

/* renamed from: X.Inr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47703Inr implements Runnable {
    public final WeakReference<C47785IpB> LJLIL;
    public final WeakReference<C47752Ioe> LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        C47626Imc LJII;
        try {
            C47785IpB c47785IpB = this.LJLIL.get();
            C47752Ioe c47752Ioe = this.LJLILLLLZI.get();
            if (c47785IpB != null && c47752Ioe != null && (LJII = c47752Ioe.LJII()) != null) {
                double d = LJII.LIZ;
                double d2 = 1.401298464324817E-45d;
                if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d = 1.401298464324817E-45d;
                }
                c47785IpB.LJJIJLIJ = d;
                double d3 = LJII.LIZIZ;
                if (d3 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d2 = d3;
                }
                c47785IpB.LJJIL = d2;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47703Inr(C47785IpB c47785IpB, C47752Ioe c47752Ioe) {
        this.LJLIL = new WeakReference<>(c47785IpB);
        this.LJLILLLLZI = new WeakReference<>(c47752Ioe);
    }
}
