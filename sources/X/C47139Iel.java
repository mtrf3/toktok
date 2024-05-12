package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.Iel, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47139Iel implements Comparable<C47139Iel> {
    public final double LJLIL;
    public final double LJLILLLLZI;
    public final double LJLJI;
    public long LJLJJI;

    @Override // java.lang.Comparable
    public final int compareTo(C47139Iel c47139Iel) {
        double d;
        C47139Iel c47139Iel2 = c47139Iel;
        double d2 = this.LJLJI;
        if (c47139Iel2 == null) {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            d = c47139Iel2.LJLJI;
        }
        return Double.compare(d2, d);
    }

    public C47139Iel(double d, double d2) {
        d = d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d;
        this.LJLIL = d;
        d2 = d2 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d2;
        this.LJLILLLLZI = d2;
        this.LJLJJI = SystemClock.elapsedRealtime();
        this.LJLJI = d / (d2 / 1000.0d);
    }
}
