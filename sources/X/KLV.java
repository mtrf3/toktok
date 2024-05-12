package X;

import android.content.Context;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes9.dex */
public final class KLV {
    public final float LIZ;
    public final KLY LIZIZ;
    public VelocityTracker LIZJ;
    public boolean LIZLLL;
    public float LJ;

    public KLV(Context context, KLY kly) {
        this.LIZIZ = kly;
        this.LIZ = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
