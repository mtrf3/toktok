package X;

import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.8eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C216688eu extends View {
    public C216678et LJLIL;

    public C216678et getCurrentDanmakuController() {
        return this.LJLIL;
    }

    public final void LIZ(C216678et c216678et) {
        WeakReference<View> weakReference = c216678et.LJIIJ;
        View view = null;
        if (weakReference != null && weakReference.get() != null) {
            WeakReference<View> weakReference2 = c216678et.LJIIJ;
            if (weakReference2 != null) {
                view = weakReference2.get();
            }
            if (!o.LJ(view, this)) {
                throw new IllegalStateException("controller already bound by another view");
            }
        }
        c216678et.LJIIJ = new WeakReference<>(this);
        this.LJLIL = c216678et;
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        View view;
        Long valueOf;
        View view2;
        o.LJIIIZ(canvas, "canvas");
        super.draw(canvas);
        C216678et c216678et = this.LJLIL;
        if (c216678et == null) {
            return;
        }
        if (c216678et.LJFF.LJFF == 0 && c216678et.LIZ.LIZJ.LJII) {
            long LIZ = c216678et.LIZJ.LIZ();
            int i = c216678et.LIZ.LIZJ.LIZJ;
            if (i > 0) {
                LIZ = (LIZ * 100) / i;
            }
            if (LIZ <= 0 || (valueOf = Long.valueOf(LIZ)) == null) {
                return;
            }
            long longValue = valueOf.longValue();
            if (longValue > 160) {
                WeakReference<View> weakReference = c216678et.LJIIJ;
                if (weakReference == null || (view2 = weakReference.get()) == null) {
                    return;
                }
                view2.postDelayed(new IDRunnableS6S0101000(3, c216678et, 19), longValue - 80);
                return;
            }
        }
        if (c216678et.LJIIIIZZ) {
            long nanoTime = System.nanoTime();
            c216678et.LJFF.LIZIZ(canvas);
            c216678et.LJII.LIZ(canvas, nanoTime, System.nanoTime());
            WeakReference<View> weakReference2 = c216678et.LJIIJ;
            if (weakReference2 == null || (view = weakReference2.get()) == null) {
                return;
            }
            view.postInvalidateOnAnimation();
            return;
        }
        long nanoTime2 = System.nanoTime();
        c216678et.LJFF.LIZIZ(canvas);
        c216678et.LJII.LIZ(canvas, nanoTime2, System.nanoTime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r1 == true) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.8et r1 = r5.LJLIL
            r4 = 1
            if (r1 != 0) goto Lf
        La:
            boolean r0 = super.onTouchEvent(r6)
            return r0
        Lf:
            boolean r0 = r1.LJIIIZ
            if (r0 != 0) goto L14
            goto La
        L14:
            X.QM9 r3 = r1.LJI
            X.8f0 r2 = r1.LJFF
            r3.getClass()
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            int r1 = r6.getAction()
            if (r1 == 0) goto L38
            if (r1 == r4) goto L42
            r0 = 2
            if (r1 == r0) goto L2c
            goto La
        L2c:
            java.lang.Object r0 = r3.LJLIL
            X.8fO r0 = (X.InterfaceC216988fO) r0
            if (r0 != 0) goto L33
            goto La
        L33:
            boolean r1 = r0.LJIIIIZZ(r6)
            goto L4c
        L38:
            X.8fO r0 = r2.LJI(r6)
            if (r0 != 0) goto L3f
            goto La
        L3f:
            r3.LJLIL = r0
            goto L4e
        L42:
            java.lang.Object r0 = r3.LJLIL
            X.8fO r0 = (X.InterfaceC216988fO) r0
            if (r0 != 0) goto L4f
            r1 = 0
        L49:
            r0 = 0
            r3.LJLIL = r0
        L4c:
            if (r1 != r4) goto La
        L4e:
            return r4
        L4f:
            boolean r1 = r0.LJIIIIZZ(r6)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216688eu.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C216688eu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C216678et c216678et = this.LJLIL;
        if (c216678et == null) {
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        C216748f0 c216748f0 = c216678et.LJFF;
        if (c216748f0.LIZLLL == i5 && c216748f0.LJ == i6) {
            return;
        }
        Iterator<InterfaceC216738ez> it = c216748f0.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(i5, i6);
        }
        c216748f0.LIZLLL = i5;
        c216748f0.LJ = i6;
    }
}
