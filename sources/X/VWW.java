package X;

import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VWW {
    public VelocityTracker LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public final float LJFF;
    public int LJI = -1;
    public final /* synthetic */ VWV LJII;

    public final VelocityTracker LIZ() {
        VelocityTracker velocityTracker = this.LIZ;
        if (velocityTracker == null) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.LIZ = obtain;
            return obtain;
        }
        return velocityTracker;
    }

    public VWW(VWV vwv) {
        this.LJII = vwv;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(vwv.getContext());
        o.LJIIIIZZ(viewConfiguration, "get(context)");
        viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJFF = viewConfiguration.getScaledMaximumFlingVelocity();
    }
}
