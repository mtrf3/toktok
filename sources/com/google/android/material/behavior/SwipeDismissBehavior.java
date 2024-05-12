package com.google.android.material.behavior;

import X.C06C;
import X.C16300kU;
import X.C17720mm;
import X.C270714l;
import X.C45621qg;
import X.C80199Vdj;
import X.C80202Vdm;
import X.C80203Vdn;
import android.view.MotionEvent;
import android.view.View;
import o3.h0;

/* loaded from: classes15.dex */
public class SwipeDismissBehavior<V extends View> extends C06C<V> {
    public C270714l LIZ;
    public C80203Vdn LIZIZ;
    public boolean LIZJ;
    public float LJFF;
    public int LIZLLL = 2;
    public final float LJ = 0.5f;
    public float LJI = 0.5f;
    public final C80199Vdj LJII = new C80199Vdj(this);

    public boolean LIZ(View view) {
        return true;
    }

    @Override // X.C06C
    public boolean onInterceptTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        boolean z = this.LIZJ;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LIZJ = false;
            }
        } else {
            z = c45621qg.LJII((int) motionEvent.getX(), (int) motionEvent.getY(), v);
            this.LIZJ = z;
        }
        if (!z) {
            return false;
        }
        if (this.LIZ == null) {
            this.LIZ = C270714l.LJIIIZ(c45621qg, this.LJII);
        }
        return this.LIZ.LJIJJ(motionEvent);
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(c45621qg, v, i);
        if (C16300kU.LIZJ(v) == 0) {
            C16300kU.LJIJ(v, 1);
            h0.LJIILL(1048576, v);
            h0.LJIIJ(0, v);
            if (LIZ(v)) {
                h0.LJIILLIIL(v, C17720mm.LJIILIIL, null, new C80202Vdm(this));
            }
        }
        return onLayoutChild;
    }

    @Override // X.C06C
    public final boolean onTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        C270714l c270714l = this.LIZ;
        if (c270714l != null) {
            c270714l.LJIILIIL(motionEvent);
            return true;
        }
        return false;
    }
}
