package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0B5, reason: invalid class name */
/* loaded from: classes.dex */
public class C0B5 extends GestureDetector.SimpleOnGestureListener {
    public boolean LJLIL = true;
    public final /* synthetic */ C1C8 LJLILLLLZI;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C0B5(C1C8 c1c8) {
        this.LJLILLLLZI = c1c8;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View LJIIL;
        RecyclerView.ViewHolder LJJJJJL;
        int i;
        if (this.LJLIL && (LJIIL = this.LJLILLLLZI.LJIIL(motionEvent)) != null && (LJJJJJL = this.LJLILLLLZI.LJZ.LJJJJJL(LJIIL)) != null) {
            C1C8 c1c8 = this.LJLILLLLZI;
            C0B4 c0b4 = c1c8.LJLLJ;
            RecyclerView recyclerView = c1c8.LJZ;
            int LJ = c0b4.LJ(recyclerView, LJJJJJL);
            int LIZLLL = C16310kV.LIZLLL(recyclerView);
            int i2 = LJ & 3158064;
            if (i2 != 0) {
                int i3 = LJ & (~i2);
                if (LIZLLL == 0) {
                    i = i2 >> 2;
                } else {
                    int i4 = i2 >> 1;
                    i3 |= (-3158065) & i4;
                    i = (i4 & 3158064) >> 2;
                }
                LJ = i3 | i;
            }
            if ((16711680 & LJ) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i5 = this.LJLILLLLZI.LJLLILLLL;
                if (pointerId == i5) {
                    int findPointerIndex = motionEvent.findPointerIndex(i5);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C1C8 c1c82 = this.LJLILLLLZI;
                    c1c82.LJLJJI = x;
                    c1c82.LJLJJL = y;
                    c1c82.LJLJLLL = 0.0f;
                    c1c82.LJLJLJ = 0.0f;
                    if (c1c82.LJLLJ.LJIIIIZZ()) {
                        this.LJLILLLLZI.LJIJ(LJJJJJL, 2);
                    }
                }
            }
        }
    }
}
