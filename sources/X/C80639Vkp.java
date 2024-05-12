package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Vkp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80639Vkp extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C80638Vko LJLIL;

    public C80639Vkp(C80638Vko c80638Vko) {
        this.LJLIL = c80638Vko;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C80638Vko c80638Vko = this.LJLIL;
        if (c80638Vko.LLIFFJFJJ) {
            c80638Vko.LJLJL = true;
            float scale = c80638Vko.getScale();
            C80638Vko c80638Vko2 = this.LJLIL;
            float maxScale = c80638Vko2.getMaxScale();
            if (c80638Vko2.LLFII == 1) {
                float f = c80638Vko2.LLFFF;
                if ((2.0f * f) + scale <= maxScale) {
                    maxScale = scale + f;
                } else {
                    c80638Vko2.LLFII = -1;
                }
            } else {
                c80638Vko2.LLFII = 1;
                maxScale = 1.0f;
            }
            this.LJLIL.LJIILJJIL(Math.min(this.LJLIL.getMaxScale(), Math.max(maxScale, this.LJLIL.getMinScale())), motionEvent.getX(), motionEvent.getY(), 200.0f);
            this.LJLIL.invalidate();
        }
        this.LJLIL.getClass();
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJLIL.getClass();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (this.LJLIL.isLongClickable() && !this.LJLIL.LLF.isInProgress()) {
            this.LJLIL.setPressed(true);
            this.LJLIL.performLongClick();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC80644Vku interfaceC80644Vku;
        InterfaceC80643Vkt interfaceC80643Vkt = this.LJLIL.LLIIIILZ;
        if (interfaceC80643Vkt != null && (interfaceC80644Vku = ((C80641Vkr) interfaceC80643Vkt).LIZ.LJLIL) != null) {
            interfaceC80644Vku.LIZIZ();
        }
        this.LJLIL.getClass();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LJLIL.getClass();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.LJLIL.LLIIII || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.LJLIL.LLF.isInProgress() || this.LJLIL.getScale() == 1.0f) {
            return false;
        }
        C80638Vko c80638Vko = this.LJLIL;
        c80638Vko.getClass();
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f) <= 800.0f && Math.abs(f2) <= 800.0f) {
            return false;
        }
        c80638Vko.LJLJL = true;
        c80638Vko.LJLJJL.post(new RunnableC80635Vkl(c80638Vko, System.currentTimeMillis(), x / 2.0f, y / 2.0f));
        c80638Vko.invalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.LJLIL.LLIIII || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.LJLIL.LLF.isInProgress()) {
            return false;
        }
        C80638Vko c80638Vko = this.LJLIL;
        if (c80638Vko.getScale() == 1.0f) {
            return false;
        }
        c80638Vko.LJLJL = true;
        c80638Vko.LJIIIIZZ(-f, -f2);
        c80638Vko.invalidate();
        return true;
    }
}
