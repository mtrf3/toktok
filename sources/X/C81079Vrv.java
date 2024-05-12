package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Vrv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81079Vrv extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C81078Vru LJLIL;

    public C81079Vrv(C81078Vru c81078Vru) {
        this.LJLIL = c81078Vru;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e) {
        Rect rect;
        int i;
        int width;
        int height;
        int width2;
        int height2;
        float f;
        float f2;
        float f3;
        o.LJIIIZ(e, "e");
        if (this.LJLIL.getPinchMode() == 1 || this.LJLIL.getPinchMode() == 3) {
            C81072Vro c81072Vro = this.LJLIL.LJLZ;
            int i2 = 0;
            if (c81072Vro != null && c81072Vro.isRunning()) {
                return true;
            }
            C81078Vru c81078Vru = this.LJLIL;
            float x = e.getX();
            float y = e.getY();
            if (!c81078Vru.LJFF() || (rect = c81078Vru.LJLILLLLZI) == null) {
                return true;
            }
            Matrix LIZLLL = C81081Vrx.LIZLLL();
            c81078Vru.LJ(LIZLLL);
            float f4 = C81081Vrx.LIZIZ(LIZLLL)[0];
            float f5 = C81081Vrx.LIZIZ(c81078Vru.LJLLI)[0] * f4;
            boolean z = c81078Vru.LJLIL;
            if (z) {
                i = rect.left;
            } else {
                i = 0;
            }
            float f6 = i;
            if (z) {
                width = rect.right;
            } else {
                width = c81078Vru.getWidth();
            }
            float f7 = width;
            boolean z2 = c81078Vru.LJLIL;
            if (z2) {
                i2 = rect.top;
            }
            float f8 = i2;
            if (z2) {
                height = rect.bottom;
            } else {
                height = c81078Vru.getHeight();
            }
            float f9 = height;
            if (c81078Vru.LJLIL) {
                width2 = rect.width();
            } else {
                width2 = c81078Vru.getWidth();
            }
            float f10 = width2;
            if (c81078Vru.LJLIL) {
                height2 = rect.height();
            } else {
                height2 = c81078Vru.getHeight();
            }
            float f11 = height2;
            float max = Math.max(c81078Vru.getMaxScale(), 2.0f);
            if (f5 < c81078Vru.getMaxScale()) {
                f = c81078Vru.getMaxScale();
            } else {
                f = f4;
            }
            if (f <= max) {
                max = f;
            }
            if (max >= f4) {
                f4 = max;
            }
            Matrix LJ = C81081Vrx.LJ(c81078Vru.LJLLI);
            float f12 = f4 / f5;
            LJ.postScale(f12, f12, x, y);
            float f13 = f10 / 2.0f;
            float f14 = f11 / 2.0f;
            LJ.postTranslate(f13 - x, f14 - y);
            Matrix LJ2 = C81081Vrx.LJ(LIZLLL);
            LJ2.postConcat(LJ);
            RectF LJII = C81081Vrx.LJII(c81078Vru.getDrawable().getIntrinsicWidth(), c81078Vru.getDrawable().getIntrinsicHeight());
            LJ2.mapRect(LJII);
            float f15 = LJII.right;
            float f16 = LJII.left;
            if (f15 - f16 < f10) {
                f2 = f13 - ((f15 + f16) / 2.0f);
            } else if (f16 > f6) {
                f2 = f6 - f16;
            } else if (f15 < f7) {
                f2 = f7 - f15;
            } else {
                f2 = 0.0f;
            }
            float f17 = LJII.bottom;
            float f18 = LJII.top;
            if (f17 - f18 < f11) {
                f3 = f14 - ((f17 + f18) / 2.0f);
            } else if (f18 > f8) {
                f3 = f8 - f18;
            } else if (f17 < f9) {
                f3 = f9 - f17;
            } else {
                f3 = 0.0f;
            }
            LJ.postTranslate(f2, f3);
            c81078Vru.LIZ();
            C81072Vro c81072Vro2 = new C81072Vro(c81078Vru, c81078Vru.LJLLI, LJ);
            c81078Vru.LJLZ = c81072Vro2;
            c81072Vro2.start();
            C81081Vrx.LJFF(LJII);
            C81081Vrx.LIZJ(LJ2);
            C81081Vrx.LIZJ(LJ);
            C81081Vrx.LIZJ(LIZLLL);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        C81078Vru c81078Vru = this.LJLIL;
        View.OnLongClickListener onLongClickListener = c81078Vru.LJLJLLL;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(c81078Vru);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        C81078Vru c81078Vru = this.LJLIL;
        View.OnClickListener onClickListener = c81078Vru.LJLJLJ;
        if (onClickListener != null) {
            onClickListener.onClick(c81078Vru);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        C81072Vro c81072Vro;
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        if (this.LJLIL.getPinchMode() == 0 && ((c81072Vro = this.LJLIL.LJLZ) == null || !c81072Vro.isRunning())) {
            C81078Vru c81078Vru = this.LJLIL;
            if (c81078Vru.LJFF()) {
                c81078Vru.LIZ();
                C81082Vry c81082Vry = new C81082Vry(c81078Vru, f / 60.0f, f2 / 60.0f);
                c81078Vru.LJZ = c81082Vry;
                c81082Vry.start();
            }
        }
        return true;
    }
}
