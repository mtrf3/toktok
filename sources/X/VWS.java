package X;

import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VWS {
    public VelocityTracker LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public final float LJFF;
    public int LJI = -1;
    public final /* synthetic */ VWR LJII;

    public final VelocityTracker LIZ() {
        VelocityTracker velocityTracker = this.LIZ;
        if (velocityTracker == null) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.LIZ = obtain;
            return obtain;
        }
        return velocityTracker;
    }

    public VWS(VWR vwr) {
        this.LJII = vwr;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(vwr.getContext());
        o.LJIIIIZZ(viewConfiguration, "get(context)");
        viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJFF = viewConfiguration.getScaledMaximumFlingVelocity();
    }
}
