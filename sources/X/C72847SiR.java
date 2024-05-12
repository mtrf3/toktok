package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SiR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72847SiR extends TouchDelegate {
    public boolean LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final ViewGroup LJI;
    public final View LJII;
    public final Rect LJIIIIZZ;

    public final Rect LIZ() {
        return (Rect) this.LIZIZ.getValue();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent event) {
        int i;
        int i2;
        o.LJIIIZ(event, "event");
        if (!this.LJII.isShown() || !this.LJII.isEnabled()) {
            return false;
        }
        ViewGroup parent = this.LJI;
        View descendant = this.LJII;
        Rect out = LIZ();
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(descendant, "descendant");
        o.LJIIIZ(out, "out");
        out.set(0, 0, descendant.getWidth(), descendant.getHeight());
        ThreadLocal<Matrix> threadLocal = C73020SlE.LIZ;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        C73020SlE.LIZ(parent, descendant, matrix);
        ThreadLocal<RectF> threadLocal2 = C73020SlE.LIZIZ;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(out);
        matrix.mapRect(rectF);
        out.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
        Rect LIZ = LIZ();
        int i3 = this.LJ;
        int i4 = this.LJFF;
        int i5 = LIZ.right;
        int i6 = LIZ.left;
        int i7 = i5 - i6;
        int i8 = LIZ.bottom;
        int i9 = LIZ.top;
        int i10 = i8 - i9;
        if (i7 < i3) {
            i = i3 - i7;
        } else {
            i = 0;
        }
        if (i10 < i4) {
            i2 = i4 - i10;
        } else {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            Rect rect = this.LJIIIIZZ;
            if (rect == null) {
                int i11 = i / 2;
                LIZ.left = i6 - i11;
                int i12 = i2 / 2;
                LIZ.top = i9 - i12;
                LIZ.right = i5 + i11;
                LIZ.bottom = i8 + i12;
            } else {
                LIZ.left = i6 - rect.left;
                LIZ.top = i9 - rect.top;
                LIZ.right = i5 + rect.right;
                LIZ.bottom = i8 + rect.bottom;
            }
        }
        ((Rect) this.LIZJ.getValue()).set(LIZ());
        ((Rect) this.LIZJ.getValue()).inset(-((Number) this.LIZLLL.getValue()).intValue(), -((Number) this.LIZLLL.getValue()).intValue());
        int x = (int) event.getX();
        int y = (int) event.getY();
        int action = event.getAction();
        boolean z = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action != 3) {
                    return false;
                }
                boolean z2 = this.LIZ;
                this.LIZ = false;
                if (!z2) {
                    return false;
                }
            } else {
                if (!this.LIZ) {
                    return false;
                }
                if (!((Rect) this.LIZJ.getValue()).contains(x, y)) {
                    z = false;
                }
            }
        } else {
            Rect LIZ2 = LIZ();
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("bounds: ");
            LIZ3.append(LIZ());
            LIZ3.append(", event: ");
            LIZ3.append(event);
            LIZLLL.d(X1D.LIZIZ(LIZ3));
            if (!LIZ2.contains(x, y)) {
                return false;
            }
            this.LIZ = true;
        }
        View view = this.LJII;
        if (z) {
            float f = 2;
            event.setLocation(view.getWidth() / f, view.getHeight() / f);
        } else {
            float f2 = -(((Number) this.LIZLLL.getValue()).intValue() * 2);
            event.setLocation(f2, f2);
        }
        return view.dispatchTouchEvent(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72847SiR(int i, int i2, Rect rect, View mDelegateView, ViewGroup viewGroup) {
        super(new Rect(), mDelegateView);
        o.LJIIIZ(mDelegateView, "mDelegateView");
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = viewGroup;
        this.LJII = mDelegateView;
        this.LJIIIIZZ = rect;
        this.LIZIZ = C221108m2.LIZIZ(C72848SiS.LJLIL);
        this.LIZJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1199));
        this.LIZLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1198));
    }
}
