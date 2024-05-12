package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes15.dex */
public class VZC extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ VZA LJLIL;

    public VZC(VZA vza) {
        this.LJLIL = vza;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJLIL.LJLJLLL.abortAnimation();
        VZA vza = this.LJLIL;
        vza.LLIIIILZ = 0;
        vza.LLII = true;
        vza.LLFZ = false;
        float x = motionEvent.getX();
        vza.LLIIJI = x;
        vza.LLIIIL = x;
        VZA vza2 = this.LJLIL;
        float y = motionEvent.getY();
        vza2.LLIIJLIL = y;
        vza2.LLIIIZ = y;
        this.LJLIL.LLIIII = motionEvent.getPointerId(motionEvent.getActionIndex());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r6 <= r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r7 <= r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        return r2;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
        /*
            r3 = this;
            boolean r2 = super.onFling(r4, r5, r6, r7)
            X.VZA r0 = r3.LJLIL
            boolean r0 = r0.LJIIJJI()
            if (r0 == 0) goto L1b
            X.VZA r0 = r3.LJLIL
            int r1 = r0.LLFFF
            int r0 = -r1
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L1b
            float r0 = (float) r1
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L32
        L1b:
            X.VZA r0 = r3.LJLIL
            boolean r0 = r0.LJIIJJI()
            if (r0 != 0) goto L33
            X.VZA r0 = r3.LJLIL
            int r1 = r0.LLFF
            int r0 = -r1
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L33
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L33
        L32:
            return r2
        L33:
            X.VZA r1 = r3.LJLIL
            r0 = 1
            r1.LLFZ = r0
            android.widget.Scroller r0 = r1.LJLJLLL
            r0.abortAnimation()
            X.VZA r0 = r3.LJLIL
            r0.LJI(r6, r7)
            boolean r0 = super.onFling(r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VZC.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        VZA vza = this.LJLIL;
        if (!vza.LLI) {
            if (motionEvent2.findPointerIndex(vza.LLIIII) == -1) {
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }
            float abs = Math.abs(f);
            float abs2 = Math.abs(f2);
            if ((this.LJLIL.LJIIJJI() && abs2 > abs && this.LJLIL.LIZJ((int) f2)) || (!this.LJLIL.LJIIJJI() && abs > abs2 && this.LJLIL.LIZIZ((int) f))) {
                VZA vza2 = this.LJLIL;
                vza2.LLI = true;
                vza2.setScrollState(1);
                this.LJLIL.LJIIZILJ(true);
            } else {
                this.LJLIL.LJIIZILJ(false);
            }
        }
        VZA vza3 = this.LJLIL;
        if (vza3.LLI) {
            int findPointerIndex = motionEvent2.findPointerIndex(vza3.LLIIII);
            float x = motionEvent2.getX(findPointerIndex);
            float y = motionEvent2.getY(findPointerIndex);
            VZA vza4 = this.LJLIL;
            float f4 = vza4.LLIIIL - x;
            float f5 = vza4.LLIIIZ - y;
            float f6 = vza4.LLIIIILZ;
            if (vza4.LJIIJJI()) {
                f3 = f5;
            } else {
                f3 = f4;
            }
            vza4.LLIIIILZ = (int) (f6 + f3);
            VZA vza5 = this.LJLIL;
            vza5.LLIIIL = x;
            vza5.LLIIIZ = y;
            if (vza5.LLII) {
                vza5.LJIL();
                this.LJLIL.LLII = false;
            }
            if (this.LJLIL.LJIIJJI()) {
                this.LJLIL.scrollBy(0, (int) (f5 + 0.5d));
            } else {
                this.LJLIL.scrollBy((int) (f4 + 0.5d), 0);
            }
        }
        return this.LJLIL.LLI;
    }
}
