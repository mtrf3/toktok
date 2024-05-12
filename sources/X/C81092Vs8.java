package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedList;

/* renamed from: X.Vs8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81092Vs8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C81091Vs7 LJLIL;

    public C81092Vs8(C81091Vs7 c81091Vs7) {
        this.LJLIL = c81091Vs7;
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
        C81091Vs7 c81091Vs7 = this.LJLIL;
        if (c81091Vs7.LJLJLLL == 1) {
            C78878UxW c78878UxW = c81091Vs7.LJLLL;
            if (c78878UxW == null || !c78878UxW.isRunning()) {
                C81091Vs7 c81091Vs72 = this.LJLIL;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (!c81091Vs72.LJFF() || !c81091Vs72.LJLJJL) {
                    return true;
                }
                Matrix LIZJ = C81093Vs9.LIZJ();
                c81091Vs72.LJ(LIZJ);
                float f5 = C81093Vs9.LIZ(LIZJ)[0];
                float f6 = C81093Vs9.LIZ(c81091Vs72.LJLJLJ)[0] * f5;
                float f7 = 0.0f;
                if (c81091Vs72.LJLIL) {
                    f = c81091Vs72.LJLILLLLZI.left;
                    width = c81091Vs72.LJLILLLLZI.right;
                } else {
                    f = 0.0f;
                    width = c81091Vs72.getWidth();
                }
                float f8 = width;
                if (c81091Vs72.LJLIL) {
                    f2 = c81091Vs72.LJLILLLLZI.top;
                    height = c81091Vs72.LJLILLLLZI.bottom;
                } else {
                    f2 = 0.0f;
                    height = c81091Vs72.getHeight();
                }
                float f9 = height;
                if (c81091Vs72.LJLIL) {
                    width2 = c81091Vs72.LJLILLLLZI.width();
                } else {
                    width2 = c81091Vs72.getWidth();
                }
                float f10 = width2;
                if (c81091Vs72.LJLIL) {
                    height2 = c81091Vs72.LJLILLLLZI.height();
                } else {
                    height2 = c81091Vs72.getHeight();
                }
                float f11 = height2;
                float maxScale = c81091Vs72.getMaxScale();
                if (f6 < c81091Vs72.getMaxScale()) {
                    f3 = c81091Vs72.getMaxScale();
                } else {
                    f3 = f5;
                }
                if (f3 <= maxScale) {
                    maxScale = f3;
                }
                if (maxScale >= f5) {
                    f5 = maxScale;
                }
                Matrix LIZLLL = C81093Vs9.LIZLLL(c81091Vs72.LJLJLJ);
                float f12 = f5 / f6;
                LIZLLL.postScale(f12, f12, x, y);
                float f13 = f10 / 2.0f;
                float f14 = f11 / 2.0f;
                LIZLLL.postTranslate(f13 - x, f14 - y);
                Matrix LIZLLL2 = C81093Vs9.LIZLLL(LIZJ);
                LIZLLL2.postConcat(LIZLLL);
                float intrinsicWidth = c81091Vs72.getDrawable().getIntrinsicWidth();
                float intrinsicHeight = c81091Vs72.getDrawable().getIntrinsicHeight();
                C81096VsC c81096VsC = C81093Vs9.LIZIZ;
                RectF LIZJ2 = c81096VsC.LIZJ();
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
                c81091Vs72.LIZ();
                C78878UxW c78878UxW2 = new C78878UxW(c81091Vs72, c81091Vs72.LJLJLJ, LIZLLL);
                c81091Vs72.LJLLL = c78878UxW2;
                c78878UxW2.start();
                if (((LinkedList) c81096VsC.LIZIZ).size() < c81096VsC.LIZ) {
                    ((LinkedList) c81096VsC.LIZIZ).offer(LIZJ2);
                }
                C81093Vs9.LIZIZ(LIZLLL2);
                C81093Vs9.LIZIZ(LIZLLL);
                C81093Vs9.LIZIZ(LIZJ);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C81091Vs7 c81091Vs7 = this.LJLIL;
        View.OnLongClickListener onLongClickListener = c81091Vs7.LJLJL;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(c81091Vs7);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C81091Vs7 c81091Vs7 = this.LJLIL;
        View.OnClickListener onClickListener = c81091Vs7.LJLJJLL;
        if (onClickListener != null) {
            onClickListener.onClick(c81091Vs7);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C81091Vs7 c81091Vs7 = this.LJLIL;
        if (c81091Vs7.LJLJLLL == 0) {
            C78878UxW c78878UxW = c81091Vs7.LJLLL;
            if (c78878UxW == null || !c78878UxW.isRunning()) {
                C81091Vs7 c81091Vs72 = this.LJLIL;
                if (!c81091Vs72.LJFF()) {
                    return true;
                }
                c81091Vs72.LIZ();
                C77088UNg c77088UNg = new C77088UNg(c81091Vs72, f / 60.0f, f2 / 60.0f);
                c81091Vs72.LJLLLL = c77088UNg;
                c77088UNg.start();
                return true;
            }
            return true;
        }
        return true;
    }
}
