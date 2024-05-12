package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

/* renamed from: X.Vko, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80638Vko extends AbstractC80634Vkk {
    public ScaleGestureDetector LLF;
    public GestureDetector LLFF;
    public float LLFFF;
    public int LLFII;
    public GestureDetector.OnGestureListener LLFZ;
    public ScaleGestureDetector.OnScaleGestureListener LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public InterfaceC80643Vkt LLIIIILZ;

    public void setDoubleTapListener(InterfaceC80642Vks interfaceC80642Vks) {
    }

    public GestureDetector.OnGestureListener getGestureListener() {
        return new C80639Vkp(this);
    }

    public ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return new C80640Vkq(this);
    }

    public boolean getDoubleTapEnabled() {
        return this.LLIFFJFJJ;
    }

    @Override // X.AbstractC80634Vkk
    public final void LJII(float f) {
        if (f < getMinScale()) {
            float minScale = getMinScale();
            PointF center = getCenter();
            LJIILJJIL(minScale, center.x, center.y, 50.0f);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LLF.onTouchEvent(motionEvent);
        if (!this.LLF.isInProgress()) {
            this.LLFF.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1 && getScale() < getMinScale()) {
            float minScale = getMinScale();
            PointF center = getCenter();
            LJIILJJIL(minScale, center.x, center.y, 50.0f);
        }
        return true;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.LLIFFJFJJ = z;
    }

    public void setScaleEnabled(boolean z) {
        this.LLII = z;
    }

    public void setScrollEnabled(boolean z) {
        this.LLIIII = z;
    }

    public void setSingleTapListener(InterfaceC80643Vkt interfaceC80643Vkt) {
        this.LLIIIILZ = interfaceC80643Vkt;
    }

    public C80638Vko(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIFFJFJJ = true;
        this.LLII = true;
        this.LLIIII = true;
    }

    @Override // X.AbstractC80634Vkk
    public final void LJI(Context context, AttributeSet attributeSet) {
        super.LJI(context, attributeSet);
        ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLFZ = getGestureListener();
        this.LLI = getScaleListener();
        this.LLF = new ScaleGestureDetector(getContext(), this.LLI);
        this.LLFF = new GestureDetector(getContext(), this.LLFZ, null, true);
        this.LLFII = 1;
    }

    @Override // X.AbstractC80634Vkk
    public final void LIZ(Drawable drawable, Matrix matrix, float f, float f2) {
        super.LIZ(drawable, matrix, f, f2);
        this.LLFFF = getMaxScale() / 3.0f;
    }
}
