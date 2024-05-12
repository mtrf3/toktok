package X;

import Y.IDAListenerS69S0100000;
import Y.IDUListenerS263S0100000;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.0Go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04740Go extends Drawable implements Drawable.Callback, Animatable {
    public final Matrix LJLIL = new Matrix();
    public C0GY LJLILLLLZI;
    public final ChoreographerFrameCallbackC30341Ha LJLJI;
    public float LJLJJI;
    public final ArrayList<InterfaceC04730Gn> LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public C10M LJLJLLL;
    public String LJLL;
    public C0GP LJLLI;
    public C10L LJLLILLLL;
    public boolean LJLLJ;
    public AnonymousClass291 LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public final IDUListenerS263S0100000 LJZ;
    public C23770wX LJZI;
    public boolean LJZL;
    public float LL;
    public final Object LLD;
    public boolean LLF;
    public WeakReference<C29701Eo> LLFF;
    public IDAListenerS69S0100000 LLFFF;
    public Bitmap LLFII;
    public int LLFZ;
    public int LLI;

    public final void LJ() {
        if (this.LLF) {
            C23770wX c23770wX = this.LJZI;
            if (c23770wX != null) {
                c23770wX.LIZLLL = null;
                Handler handler = c23770wX.LIZJ;
                if (handler != null) {
                    handler.removeCallbacks(c23770wX.LJ);
                }
                C23770wX c23770wX2 = this.LJZI;
                Handler handler2 = c23770wX2.LIZJ;
                if (handler2 != null) {
                    handler2.post(c23770wX2.LJFF);
                }
            }
            this.LLFII = null;
        }
        this.LJLJJL.clear();
        this.LJLJI.cancel();
    }

    public final void LJIILLIIL() {
        float LIZLLL;
        if (this.LJLLL == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1F3
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LJIILLIIL();
                }
            });
            return;
        }
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = this.LJLJI;
        choreographerFrameCallbackC30341Ha.LJLLI = true;
        boolean LJ = choreographerFrameCallbackC30341Ha.LJ();
        Iterator it = ((CopyOnWriteArraySet) choreographerFrameCallbackC30341Ha.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(choreographerFrameCallbackC30341Ha, LJ);
            } else {
                animatorListener.onAnimationStart(choreographerFrameCallbackC30341Ha);
            }
        }
        if (choreographerFrameCallbackC30341Ha.LJ()) {
            LIZLLL = choreographerFrameCallbackC30341Ha.LIZJ();
        } else {
            LIZLLL = choreographerFrameCallbackC30341Ha.LIZLLL();
        }
        choreographerFrameCallbackC30341Ha.LJI((int) LIZLLL);
        if (C03970Dp.LIZ) {
            choreographerFrameCallbackC30341Ha.LJLJJL = 0L;
        } else {
            choreographerFrameCallbackC30341Ha.LJLJJL = System.nanoTime();
        }
        choreographerFrameCallbackC30341Ha.LJLJL = 0;
        if (choreographerFrameCallbackC30341Ha.LJLLI) {
            choreographerFrameCallbackC30341Ha.LJFF(false);
            C16880lQ.LLIIIJ().postFrameCallback(choreographerFrameCallbackC30341Ha);
        }
    }

    public final void LJIJ() {
        if (this.LJLLL == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1F4
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LJIJ();
                }
            });
            return;
        }
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = this.LJLJI;
        choreographerFrameCallbackC30341Ha.LJLLI = true;
        choreographerFrameCallbackC30341Ha.LJFF(false);
        C16880lQ.LLIIIJ().postFrameCallback(choreographerFrameCallbackC30341Ha);
        if (C03970Dp.LIZ) {
            choreographerFrameCallbackC30341Ha.LJLJJL = 0L;
        } else {
            choreographerFrameCallbackC30341Ha.LJLJJL = System.nanoTime();
        }
        if (choreographerFrameCallbackC30341Ha.LJ() && choreographerFrameCallbackC30341Ha.LJLJJLL == choreographerFrameCallbackC30341Ha.LIZLLL()) {
            choreographerFrameCallbackC30341Ha.LJLJJLL = choreographerFrameCallbackC30341Ha.LIZJ();
        } else {
            if (choreographerFrameCallbackC30341Ha.LJ() || choreographerFrameCallbackC30341Ha.LJLJJLL != choreographerFrameCallbackC30341Ha.LIZJ()) {
                return;
            }
            choreographerFrameCallbackC30341Ha.LJLJJLL = choreographerFrameCallbackC30341Ha.LIZLLL();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.LJLJJL.clear();
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = this.LJLJI;
        choreographerFrameCallbackC30341Ha.LJFF(true);
        choreographerFrameCallbackC30341Ha.LIZ(choreographerFrameCallbackC30341Ha.LJ());
    }

    static {
        C16880lQ.LJLLJ(C04740Go.class);
    }

    public final boolean LIZIZ() {
        C0GY c0gy = this.LJLILLLLZI;
        if (c0gy != null && !getBounds().isEmpty() && !c0gy.LJIIIIZZ.isEmpty()) {
            Rect bounds = getBounds();
            float width = bounds.width() / bounds.height();
            Rect rect = c0gy.LJIIIIZZ;
            if (width != rect.width() / rect.height()) {
                return false;
            }
        }
        return true;
    }

    public final void LIZJ() {
        C274816a LIZIZ = C04360Fc.LIZIZ(this.LJLILLLLZI);
        C0GY c0gy = this.LJLILLLLZI;
        this.LJLLL = new AnonymousClass291(this, LIZIZ, c0gy.LJII, c0gy);
        if (C03970Dp.LIZ) {
            LJFF();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (LJIILL() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL() {
        /*
            r4 = this;
            boolean r0 = r4.LLF
            r3 = 0
            if (r0 == 0) goto L36
            java.lang.ref.WeakReference<X.1Eo> r0 = r4.LLFF
            if (r0 == 0) goto L36
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2 = 1
            if (r0 == 0) goto L36
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 != r4) goto L36
            boolean r0 = r4.LJIILL()
            if (r0 == 0) goto L36
        L1e:
            boolean r0 = r4.LJZL
            if (r0 == 0) goto L34
            if (r2 == 0) goto L32
            X.1Ha r0 = r4.LJLJI
            float r1 = r0.LJLJJLL
            float r0 = r4.LL
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L2f
        L2e:
            return r3
        L2f:
            r4.LJZL = r3
            goto L34
        L32:
            r4.LJZL = r3
        L34:
            r3 = r2
            goto L2e
        L36:
            r2 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04740Go.LIZLLL():boolean");
    }

    public final void LJFF() {
        AnonymousClass291 anonymousClass291;
        int i;
        int i2;
        if (C03970Dp.LIZ && C03970Dp.LIZLLL && this.LLF && (anonymousClass291 = this.LJLLL) != null) {
            C274816a c274816a = anonymousClass291.LJIILIIL;
            int i3 = 0;
            if (c274816a == null) {
                i = 0;
            } else {
                i = c274816a.LJIILJJIL;
                i3 = c274816a.LJIILL;
            }
            if (C04010Dt.LIZ) {
                i2 = 1000500;
            } else {
                i2 = 1500750;
            }
            if (i > 0 && i3 > 0 && i * i3 >= i2) {
                LJII();
            }
        }
    }

    public final void LJII() {
        C29701Eo c29701Eo;
        if (this.LLF) {
            this.LLF = false;
            WeakReference<C29701Eo> weakReference = this.LLFF;
            if (weakReference != null && (c29701Eo = weakReference.get()) != null) {
                c29701Eo.onAsyncDrawEnableChanged();
            }
            C23770wX c23770wX = this.LJZI;
            if (c23770wX != null) {
                c23770wX.LIZLLL = null;
                Handler handler = c23770wX.LIZJ;
                if (handler != null) {
                    handler.removeCallbacks(c23770wX.LJ);
                }
                C23770wX c23770wX2 = this.LJZI;
                Handler handler2 = c23770wX2.LIZJ;
                if (handler2 != null) {
                    handler2.post(c23770wX2.LJFF);
                }
            }
            if (this.LLFII != null) {
                this.LLFII = null;
            }
        }
    }

    public final boolean LJIILL() {
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = this.LJLJI;
        if (choreographerFrameCallbackC30341Ha == null) {
            return false;
        }
        return choreographerFrameCallbackC30341Ha.LJLLI;
    }

    public final void LJIIZILJ() {
        if (this.LLF) {
            C23770wX c23770wX = this.LJZI;
            if (c23770wX != null) {
                c23770wX.LIZLLL = null;
                Handler handler = c23770wX.LIZJ;
                if (handler != null) {
                    handler.removeCallbacks(c23770wX.LJ);
                }
                C23770wX c23770wX2 = this.LJZI;
                Handler handler2 = c23770wX2.LIZJ;
                if (handler2 != null) {
                    handler2.post(c23770wX2.LJFF);
                }
            }
            this.LLFII = null;
            C10M c10m = this.LJLJLLL;
            if (c10m != null) {
                c10m.LIZLLL();
                return;
            }
            return;
        }
        C10M c10m2 = this.LJLJLLL;
        if (c10m2 != null) {
            c10m2.LIZJ();
        }
    }

    public final void LJIJJ() {
        boolean z;
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = this.LJLJI;
        C0GY c0gy = this.LJLILLLLZI;
        if (choreographerFrameCallbackC30341Ha.LJLL == null) {
            z = true;
        } else {
            z = false;
        }
        choreographerFrameCallbackC30341Ha.LJLL = c0gy;
        if (z) {
            choreographerFrameCallbackC30341Ha.LJII((int) Math.max(choreographerFrameCallbackC30341Ha.LJLJLJ, c0gy.LJIIIZ), (int) Math.min(choreographerFrameCallbackC30341Ha.LJLJLLL, c0gy.LJIIJ));
        } else {
            choreographerFrameCallbackC30341Ha.LJII((int) c0gy.LJIIIZ, (int) c0gy.LJIIJ);
        }
        choreographerFrameCallbackC30341Ha.LJI((int) choreographerFrameCallbackC30341Ha.LJLJJLL);
        if (!C03970Dp.LIZ) {
            choreographerFrameCallbackC30341Ha.LJLJJL = System.nanoTime();
        }
        LJJIIJ(this.LJLJI.getAnimatedFraction());
        this.LJLJJI = this.LJLJJI;
        LJJIIJZLJL();
        LJJIIJZLJL();
        Iterator it = new ArrayList(this.LJLJJL).iterator();
        while (it.hasNext()) {
            InterfaceC04730Gn interfaceC04730Gn = (InterfaceC04730Gn) it.next();
            if (interfaceC04730Gn != null) {
                interfaceC04730Gn.run();
            }
            it.remove();
        }
        this.LJLJJL.clear();
        this.LJLILLLLZI.LIZ.LIZIZ = this.LJLLLLLL;
    }

    public final void LJJIIJZLJL() {
        C0GY c0gy;
        if (C03970Dp.LIZ || (c0gy = this.LJLILLLLZI) == null) {
            return;
        }
        float f = this.LJLJJI;
        setBounds(0, 0, (int) (c0gy.LJIIIIZZ.width() * f), (int) (this.LJLILLLLZI.LJIIIIZZ.height() * f));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.LJLILLLLZI == null) {
            return -1;
        }
        return (int) (r0.LJIIIIZZ.height() * this.LJLJJI);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.LJLILLLLZI == null) {
            return -1;
        }
        return (int) (r0.LJIIIIZZ.width() * this.LJLJJI);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (C03970Dp.LIZ) {
            Drawable.Callback callback = getCallback();
            if ((callback instanceof View) && !((View) callback).isInEditMode()) {
                LJIILLIIL();
                return;
            }
            return;
        }
        LJIILLIIL();
    }

    public C04740Go() {
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = new ChoreographerFrameCallbackC30341Ha();
        this.LJLJI = choreographerFrameCallbackC30341Ha;
        this.LJLJJI = 1.0f;
        new HashSet();
        this.LJLJJL = new ArrayList<>();
        this.LJLJJLL = false;
        this.LJLJL = false;
        this.LJLJLJ = true;
        this.LJLLLL = 255;
        this.LJLZ = false;
        IDUListenerS263S0100000 iDUListenerS263S0100000 = new IDUListenerS263S0100000(this, 3);
        this.LJZ = iDUListenerS263S0100000;
        this.LJZL = false;
        this.LLD = new Object();
        this.LLF = false;
        this.LLFII = null;
        this.LLFZ = 0;
        this.LLI = 0;
        choreographerFrameCallbackC30341Ha.addUpdateListener(iDUListenerS263S0100000);
    }

    public final void LJI() {
        LJIIZILJ();
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = this.LJLJI;
        if (choreographerFrameCallbackC30341Ha.LJLLI) {
            choreographerFrameCallbackC30341Ha.cancel();
        }
        this.LJLILLLLZI = null;
        this.LJLLL = null;
        this.LJLJLLL = null;
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha2 = this.LJLJI;
        choreographerFrameCallbackC30341Ha2.LJLL = null;
        choreographerFrameCallbackC30341Ha2.LJLJLJ = -2.1474836E9f;
        choreographerFrameCallbackC30341Ha2.LJLJLLL = 2.1474836E9f;
    }

    public final Context LJIIL() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    public final C10M LJIILIIL() {
        Context LJIIL;
        Context context;
        if (getCallback() == null) {
            return null;
        }
        C10M c10m = this.LJLJLLL;
        if (c10m != null && (((LJIIL = LJIIL()) != null || c10m.LIZ != null) && (((context = c10m.LIZ) == null || !context.equals(LJIIL)) && !this.LJLZ))) {
            if (this.LLF) {
                this.LJLJLLL.LIZLLL();
            } else {
                this.LJLJLLL.LIZJ();
            }
            this.LJLJLLL = null;
        }
        if (this.LJLJLLL == null) {
            if (this.LLF) {
                synchronized (this.LLD) {
                    if (this.LJLJLLL == null) {
                        C04010Dt.LIZ(LJIIL());
                        this.LJLJLLL = new C10M(getCallback(), this.LJLL, this.LJLLI, this.LJLILLLLZI.LIZLLL, this.LJLZ);
                    }
                }
            } else {
                C04010Dt.LIZ(LJIIL());
                this.LJLJLLL = new C10M(getCallback(), this.LJLL, this.LJLLI, this.LJLILLLLZI.LIZLLL, this.LJLZ);
            }
        }
        return this.LJLJLLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (C03970Dp.LIZ || this.LLF) {
            if (this.LJLJJLL) {
                return;
            }
            this.LJLJJLL = true;
            if (callback != null) {
                try {
                    if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                        callback.invalidateDrawable(this);
                    } else if (callback instanceof View) {
                        ((View) callback).postInvalidate();
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return LJIILL();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJLLLL;
    }

    public final void LJIIIIZZ(Canvas canvas) {
        if (this.LLF) {
            synchronized (this.LLD) {
                if (!LIZIZ()) {
                    LJIIJ(canvas);
                } else {
                    LJIIJJI(canvas);
                }
            }
            return;
        }
        if (!LIZIZ()) {
            LJIIJ(canvas);
        } else {
            LJIIJJI(canvas);
        }
    }

    public final void LJIIIZ(Canvas canvas) {
        if (this.LJLLL == null) {
            return;
        }
        if (this.LJLJL || C03970Dp.LJIIIZ) {
            try {
                LJIIIIZZ(canvas);
            } catch (Throwable unused) {
            }
        } else {
            LJIIIIZZ(canvas);
        }
        C0GR.LIZ();
    }

    public final void LJIIJ(Canvas canvas) {
        if (this.LJLLL == null) {
            return;
        }
        Rect bounds = getBounds();
        float width = bounds.width() / this.LJLILLLLZI.LJIIIIZZ.width();
        float height = bounds.height() / this.LJLILLLLZI.LJIIIIZZ.height();
        int i = -1;
        if (this.LJLJLJ) {
            float min = Math.min(width, height);
            if (min < 1.0f) {
                float f = 1.0f / min;
                width /= f;
                height /= f;
                if (f > 1.0f) {
                    i = canvas.save();
                    float width2 = bounds.width() / 2.0f;
                    float height2 = bounds.height() / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
        }
        this.LJLIL.reset();
        this.LJLIL.preScale(width, height);
        this.LJLLL.LIZJ(canvas, this.LJLIL, this.LJLLLL);
        if (i > 0) {
            canvas.restoreToCount(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.graphics.Canvas r9) {
        /*
            r8 = this;
            X.291 r0 = r8.LJLLL
            if (r0 != 0) goto L5
            return
        L5:
            float r2 = r8.LJLJJI
            float r6 = r8.LJIILJJIL(r9)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L5b
            float r7 = r8.LJLJJI
            float r7 = r7 / r6
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5c
            int r4 = r9.save()
            X.0GY r0 = r8.LJLILLLLZI
            android.graphics.Rect r0 = r0.LJIIIIZZ
            int r0 = r0.width()
            float r5 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r1
            X.0GY r0 = r8.LJLILLLLZI
            android.graphics.Rect r0 = r0.LJIIIIZZ
            int r0 = r0.height()
            float r3 = (float) r0
            float r3 = r3 / r1
            float r2 = r5 * r6
            float r1 = r3 * r6
            float r0 = r8.LJLJJI
            float r5 = r5 * r0
            float r5 = r5 - r2
            float r0 = r0 * r3
            float r0 = r0 - r1
            r9.translate(r5, r0)
            r9.scale(r7, r7, r2, r1)
        L42:
            android.graphics.Matrix r0 = r8.LJLIL
            r0.reset()
            android.graphics.Matrix r0 = r8.LJLIL
            r0.preScale(r6, r6)
            X.291 r2 = r8.LJLLL
            android.graphics.Matrix r1 = r8.LJLIL
            int r0 = r8.LJLLLL
            r2.LIZJ(r9, r1, r0)
            if (r4 <= 0) goto L5a
            r9.restoreToCount(r4)
        L5a:
            return
        L5b:
            r6 = r2
        L5c:
            r4 = -1
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04740Go.LJIIJJI(android.graphics.Canvas):void");
    }

    public final float LJIILJJIL(Canvas canvas) {
        return Math.min(canvas.getWidth() / this.LJLILLLLZI.LJIIIIZZ.width(), canvas.getHeight() / this.LJLILLLLZI.LJIIIIZZ.height());
    }

    public final boolean LJIJI(C0GY c0gy) {
        if (this.LJLILLLLZI == c0gy) {
            return false;
        }
        if (C03970Dp.LIZ) {
            this.LJLJJLL = false;
        }
        LJI();
        invalidateSelf();
        this.LJLILLLLZI = c0gy;
        if (c0gy != null) {
            String str = this.LJLL;
            if (str != null) {
                c0gy.LJIILJJIL = str;
            }
            C0GP c0gp = this.LJLLI;
            if (c0gp != null) {
                c0gy.LJIILJJIL = c0gp.getClass().getName();
            }
        }
        LIZJ();
        LJIJJ();
        return true;
    }

    public final void LJIJJLI(final int i) {
        if (this.LJLILLLLZI == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1F0
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LJIJJLI(i);
                }
            });
        } else {
            this.LJLJI.LJI(i);
        }
    }

    public final void LJIL(final int i) {
        if (this.LJLILLLLZI == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1F7
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LJIL(i);
                }
            });
        } else {
            ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = this.LJLJI;
            choreographerFrameCallbackC30341Ha.LJII((int) choreographerFrameCallbackC30341Ha.LJLJLJ, i);
        }
    }

    public final void LJJ(final float f) {
        C0GY c0gy = this.LJLILLLLZI;
        if (c0gy == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1F8
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LJJ(f);
                }
            });
        } else {
            float f2 = c0gy.LJIIIZ;
            LJIL((int) C06420Na.LIZIZ(c0gy.LJIIJ, f2, f, f2));
        }
    }

    public final void LJJII(final int i) {
        if (this.LJLILLLLZI == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1F5
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LJJII(i);
                }
            });
        } else {
            ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = this.LJLJI;
            choreographerFrameCallbackC30341Ha.LJII(i, (int) choreographerFrameCallbackC30341Ha.LJLJLLL);
        }
    }

    public final void LJJIII(final float f) {
        C0GY c0gy = this.LJLILLLLZI;
        if (c0gy == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1F6
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LJJIII(f);
                }
            });
        } else {
            float f2 = c0gy.LJIIIZ;
            LJJII((int) C06420Na.LIZIZ(c0gy.LJIIJ, f2, f, f2));
        }
    }

    public final void LJJIIJ(final float f) {
        C0GY c0gy = this.LJLILLLLZI;
        if (c0gy == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1F1
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LJJIIJ(f);
                }
            });
        } else {
            float f2 = c0gy.LJIIIZ;
            LJIJJLI((int) C06420Na.LIZIZ(c0gy.LJIIJ, f2, f, f2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        this.LJLJJLL = false;
        if (C03970Dp.LIZ) {
            LJIIIZ(canvas);
            return;
        }
        if (this.LJLLL == null) {
            return;
        }
        float f2 = this.LJLJJI;
        float LJIILJJIL = LJIILJJIL(canvas);
        if (f2 > LJIILJJIL) {
            f = this.LJLJJI / LJIILJJIL;
        } else {
            LJIILJJIL = f2;
            f = 1.0f;
        }
        if (f > 1.0f) {
            canvas.save();
            float width = this.LJLILLLLZI.LJIIIIZZ.width() / 2.0f;
            float height = this.LJLILLLLZI.LJIIIIZZ.height() / 2.0f;
            float f3 = width * LJIILJJIL;
            float f4 = height * LJIILJJIL;
            float f5 = this.LJLJJI;
            canvas.translate((width * f5) - f3, (f5 * height) - f4);
            canvas.scale(f, f, f3, f4);
        }
        this.LJLIL.reset();
        this.LJLIL.preScale(LJIILJJIL, LJIILJJIL);
        this.LJLLL.LIZJ(canvas, this.LJLIL, this.LJLLLL);
        C0GR.LIZ();
        if (f <= 1.0f) {
            return;
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJLLLL = i;
        if (C03970Dp.LIZ) {
            invalidateSelf();
        }
    }

    public final void LJJI(final int i, final int i2) {
        if (this.LJLILLLLZI == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1F9
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LJJI(i, i2);
                }
            });
        } else {
            this.LJLJI.LJII(i, i2);
        }
    }

    public final void LJJIFFI(final float f, final float f2) {
        C0GY c0gy = this.LJLILLLLZI;
        if (c0gy == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1FA
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LJJIFFI(f, f2);
                }
            });
            return;
        }
        float f3 = c0gy.LJIIIZ;
        float f4 = c0gy.LJIIJ - f3;
        LJJI((int) ((f * f4) + f3), (int) ((f4 * f2) + f3));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final <T> void LIZ(final C263711t c263711t, final T t, final C06800Om<T> c06800Om) {
        if (this.LJLLL == null) {
            this.LJLJJL.add(new InterfaceC04730Gn() { // from class: X.1F2
                @Override // X.InterfaceC04730Gn
                public final void run() {
                    C04740Go.this.LIZ(c263711t, t, c06800Om);
                }
            });
            return;
        }
        InterfaceC263811u interfaceC263811u = c263711t.LIZIZ;
        if (interfaceC263811u != null) {
            interfaceC263811u.LIZIZ(t, c06800Om);
        } else {
            ArrayList arrayList = new ArrayList();
            this.LJLLL.LJ(c263711t, 0, arrayList, new C263711t(new String[0]));
            for (int i = 0; i < arrayList.size(); i++) {
                ((C263711t) ListProtector.get(arrayList, i)).LIZIZ.LIZIZ(t, c06800Om);
            }
            if (!(true ^ arrayList.isEmpty())) {
                return;
            }
        }
        invalidateSelf();
        if (t == C0GO.LJIL) {
            LJJIIJ(this.LJLJI.LIZIZ());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }
}
