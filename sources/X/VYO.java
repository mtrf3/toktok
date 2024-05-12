package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VYO extends VYP {
    @Override // X.VYP
    public final float LIZ() {
        return 0.0f;
    }

    public final VYZ getBean() {
        return null;
    }

    public final VYT getLongTimeClickRunnable() {
        return null;
    }

    public final void setListener(VYS vys) {
    }

    public final void setLongTimeClickRunnable(VYT vyt) {
        o.LJIIIZ(vyt, "<set-?>");
    }

    static {
        C16880lQ.LJLLJ(VYO.class);
    }

    @Override // X.VYP
    public final void LIZJ() {
        super.LIZJ();
        throw null;
    }

    @Override // X.VYP
    public final float LIZIZ() {
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRoundRect(null, 0.0f, 0.0f, null);
        canvas.drawRoundRect(null, 0.0f, 0.0f, null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        event.getX();
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    removeCallbacks(null);
                }
            } else {
                removeCallbacks(null);
            }
            return true;
        }
        throw null;
    }

    public void setSelectAnimF(float f) {
        invalidate();
    }

    public final void LIZLLL(float f, long j) {
        this.LJLJJI = f;
        this.LJLJJL = j;
        LIZJ();
        invalidate();
    }

    @Override // X.VYP, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View.MeasureSpec.makeMeasureSpec((int) getHopeWidth(), 1073741824);
        View.MeasureSpec.makeMeasureSpec((int) getHopeHeight(), 1073741824);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getHopeWidth();
        getHopeHeight();
        throw null;
    }
}
