package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.VTd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79789VTd extends GestureDetector.SimpleOnGestureListener {
    public boolean LJLIL;
    public final /* synthetic */ C79787VTb LJLILLLLZI;

    public C79789VTd(C79787VTb c79787VTb) {
        this.LJLILLLLZI = c79787VTb;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        o.LJIIJ(e, "e");
        this.LJLILLLLZI.LJLJLLL = false;
        this.LJLIL = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIJ(e1, "e1");
        o.LJIIJ(e2, "e2");
        this.LJLILLLLZI.LJLJLLL = true;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        boolean z;
        o.LJIIJ(e1, "e1");
        o.LJIIJ(e2, "e2");
        boolean z2 = true;
        this.LJLILLLLZI.LJLJLLL = true;
        if (this.LJLILLLLZI.getParent() != null) {
            if (!this.LJLIL) {
                if (this.LJLILLLLZI.getClosestEdgeDistance() >= this.LJLILLLLZI.LJLJL) {
                    z = true;
                    this.LJLIL = true;
                } else {
                    z = false;
                }
                z2 = z;
            }
            this.LJLILLLLZI.getParent().requestDisallowInterceptTouchEvent(z2);
        }
        return false;
    }
}
