package X;

import Y.AUListenerS101S0100000_14;
import Y.IDAListenerS81S0100000_14;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.Wr7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83577Wr7 {
    public ValueAnimator LIZ;
    public int LIZIZ;
    public float LIZJ;
    public final LinkedList<View> LIZLLL = new LinkedList<>();
    public final ViewGroup LJ;
    public WUI LJFF;

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LIZ = null;
        }
        if (this.LIZIZ == 2) {
            this.LIZ = ValueAnimator.ofFloat(1.0f, 0.5f);
        } else {
            this.LIZ = ValueAnimator.ofFloat(0.5f, 1.0f);
        }
        this.LIZ.setDuration(300L);
        this.LIZ.setInterpolator(new LinearInterpolator());
        this.LIZ.addUpdateListener(new AUListenerS101S0100000_14(this, 61));
        this.LIZ.addListener(new IDAListenerS81S0100000_14(this, 13));
        this.LIZ.start();
    }

    public C83577Wr7(ViewGroup viewGroup) {
        this.LJ = viewGroup;
    }

    public final void LIZIZ(float f) {
        Iterator<View> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            View next = it.next();
            next.setAlpha(f);
            if (f == 0.0f) {
                next.setEnabled(false);
            }
            if (f == 1.0f) {
                next.setEnabled(true);
            }
        }
    }
}
