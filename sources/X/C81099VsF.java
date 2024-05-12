package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedList;

/* renamed from: X.VsF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81099VsF extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C81098VsE LJLIL;

    public C81099VsF(C81098VsE c81098VsE) {
        this.LJLIL = c81098VsE;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f;
        int width;
        float f2;
        int height;
        int width2;
        int height2;
        float f3;
        float f4;
        C81098VsE c81098VsE = this.LJLIL;
        if (c81098VsE.LJLJJLL == 1) {
            C78879UxX c78879UxX = c81098VsE.LJLLI;
            if (c78879UxX == null || !c78879UxX.isRunning()) {
                C81098VsE c81098VsE2 = this.LJLIL;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (!c81098VsE2.LJFF()) {
                    return true;
                }
                Matrix LIZJ = C81100VsG.LIZJ();
                c81098VsE2.LJ(LIZJ);
                float f5 = C81100VsG.LIZ(LIZJ)[0];
                float f6 = C81100VsG.LIZ(c81098VsE2.LJLJJL)[0] * f5;
                float f7 = 0.0f;
                if (c81098VsE2.LJLIL) {
                    f = c81098VsE2.LJLILLLLZI.left;
                    width = c81098VsE2.LJLILLLLZI.right;
                } else {
                    f = 0.0f;
                    width = c81098VsE2.getWidth();
                }
                float f8 = width;
                if (c81098VsE2.LJLIL) {
                    f2 = c81098VsE2.LJLILLLLZI.top;
                    height = c81098VsE2.LJLILLLLZI.bottom;
                } else {
                    f2 = 0.0f;
                    height = c81098VsE2.getHeight();
                }
                float f9 = height;
                if (c81098VsE2.LJLIL) {
                    width2 = c81098VsE2.LJLILLLLZI.width();
                } else {
                    width2 = c81098VsE2.getWidth();
                }
                float f10 = width2;
                if (c81098VsE2.LJLIL) {
                    height2 = c81098VsE2.LJLILLLLZI.height();
                } else {
                    height2 = c81098VsE2.getHeight();
                }
                float f11 = height2;
                float maxScale = c81098VsE2.getMaxScale();
                if (f6 < c81098VsE2.getMaxScale()) {
                    f3 = c81098VsE2.getMaxScale();
                } else {
                    f3 = f5;
                }
                if (f3 <= maxScale) {
                    maxScale = f3;
                }
                if (maxScale >= f5) {
                    f5 = maxScale;
                }
                Matrix LIZLLL = C81100VsG.LIZLLL(c81098VsE2.LJLJJL);
                float f12 = f5 / f6;
                LIZLLL.postScale(f12, f12, x, y);
                float f13 = f10 / 2.0f;
                float f14 = f11 / 2.0f;
                LIZLLL.postTranslate(f13 - x, f14 - y);
                Matrix LIZLLL2 = C81100VsG.LIZLLL(LIZJ);
                LIZLLL2.postConcat(LIZLLL);
                float intrinsicWidth = c81098VsE2.getDrawable().getIntrinsicWidth();
                float intrinsicHeight = c81098VsE2.getDrawable().getIntrinsicHeight();
                C81103VsJ c81103VsJ = C81100VsG.LIZIZ;
                RectF LIZJ2 = c81103VsJ.LIZJ();
                LIZJ2.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                LIZLLL2.mapRect(LIZJ2);
                float f15 = LIZJ2.right;
                float f16 = LIZJ2.left;
                if (f15 - f16 < f10) {
                    f4 = f13 - ((f15 + f16) / 2.0f);
                } else if (f16 > f) {
                    f4 = f - f16;
                } else if (f15 < f8) {
                    f4 = f8 - f15;
                } else {
                    f4 = 0.0f;
                }
                float f17 = LIZJ2.bottom;
                float f18 = LIZJ2.top;
                if (f17 - f18 < f11) {
                    f7 = f14 - ((f17 + f18) / 2.0f);
                } else if (f18 > f2) {
                    f7 = f2 - f18;
                } else if (f17 < f9) {
                    f7 = f9 - f17;
                }
                LIZLLL.postTranslate(f4, f7);
                c81098VsE2.LIZ();
                C78879UxX c78879UxX2 = new C78879UxX(c81098VsE2, c81098VsE2.LJLJJL, LIZLLL);
                c81098VsE2.LJLLI = c78879UxX2;
                c78879UxX2.start();
                if (((LinkedList) c81103VsJ.LIZIZ).size() < c81103VsJ.LIZ) {
                    ((LinkedList) c81103VsJ.LIZIZ).offer(LIZJ2);
                }
                C81100VsG.LIZIZ(LIZLLL2);
                C81100VsG.LIZIZ(LIZLLL);
                C81100VsG.LIZIZ(LIZJ);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C81098VsE c81098VsE = this.LJLIL;
        View.OnLongClickListener onLongClickListener = c81098VsE.LJLJJI;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(c81098VsE);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C81098VsE c81098VsE = this.LJLIL;
        View.OnClickListener onClickListener = c81098VsE.LJLJI;
        if (onClickListener != null) {
            onClickListener.onClick(c81098VsE);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C81098VsE c81098VsE = this.LJLIL;
        if (c81098VsE.LJLJJLL == 0) {
            C78879UxX c78879UxX = c81098VsE.LJLLI;
            if (c78879UxX == null || !c78879UxX.isRunning()) {
                C81098VsE c81098VsE2 = this.LJLIL;
                if (!c81098VsE2.LJFF()) {
                    return true;
                }
                c81098VsE2.LIZ();
                C77089UNh c77089UNh = new C77089UNh(c81098VsE2, f / 60.0f, f2 / 60.0f);
                c81098VsE2.LJLLILLLL = c77089UNh;
                c77089UNh.start();
                return true;
            }
            return true;
        }
        return true;
    }
}
