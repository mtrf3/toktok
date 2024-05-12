package X;

import android.view.ScaleGestureDetector;

/* renamed from: X.Vkq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80640Vkq extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public boolean LJLIL;
    public final /* synthetic */ C80638Vko LJLILLLLZI;

    public C80640Vkq(C80638Vko c80638Vko) {
        this.LJLILLLLZI = c80638Vko;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.LJLILLLLZI.getScale();
        C80638Vko c80638Vko = this.LJLILLLLZI;
        if (c80638Vko.LLII) {
            if (this.LJLIL) {
                if (currentSpan != 0.0f) {
                    c80638Vko.LJLJL = true;
                    this.LJLILLLLZI.LJIILIIL(Math.min(c80638Vko.getMaxScale(), Math.max(scaleFactor, this.LJLILLLLZI.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    C80638Vko c80638Vko2 = this.LJLILLLLZI;
                    c80638Vko2.LLFII = 1;
                    c80638Vko2.invalidate();
                    return true;
                }
            } else {
                this.LJLIL = true;
            }
        }
        return true;
    }
}
