package X;

import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import kotlin.jvm.internal.o;

/* renamed from: X.59z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1304359z {
    public final C1303859u LIZ;
    public float LIZIZ;
    public float LIZJ;
    public C5AF LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final float LJI;
    public VelocityTracker LJII;
    public final OverScroller LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public C1304359z(C1303859u trackGroup) {
        o.LJIIIZ(trackGroup, "trackGroup");
        this.LIZ = trackGroup;
        this.LIZLLL = C5AF.IDLE;
        this.LJ = ViewConfiguration.get(trackGroup.getContext()).getScaledTouchSlop();
        this.LJFF = r1.getScaledMinimumFlingVelocity();
        this.LJI = r1.getScaledMaximumFlingVelocity();
        this.LJIIIIZZ = new OverScroller(trackGroup.getContext());
        this.LJIIIZ = true;
    }
}
