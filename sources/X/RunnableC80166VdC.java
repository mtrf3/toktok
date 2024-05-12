package X;

import android.animation.ValueAnimator;
import android.view.MotionEvent;

/* renamed from: X.VdC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80166VdC implements Runnable {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C80164VdA LJLJJL;

    public final void LIZ() {
        C80157Vd3 c80157Vd3 = null;
        if (this.LJLIL == 0) {
            C80164VdA c80164VdA = this.LJLJJL;
            EnumC80174VdK enumC80174VdK = c80164VdA.LLJLIL;
            EnumC80174VdK enumC80174VdK2 = EnumC80174VdK.None;
            if (enumC80174VdK == enumC80174VdK2 && c80164VdA.LLJLILLLLZIIL == EnumC80174VdK.Refreshing) {
                c80164VdA.LLJLILLLLZIIL = enumC80174VdK2;
            } else {
                ValueAnimator valueAnimator = c80164VdA.LLLFFI;
                if (valueAnimator != null && enumC80174VdK.isHeader && (enumC80174VdK.isDragging || enumC80174VdK == EnumC80174VdK.RefreshReleased)) {
                    c80164VdA.LLLFFI = null;
                    valueAnimator.cancel();
                    this.LJLJJL.LLJL.LIZJ(enumC80174VdK2);
                } else if (enumC80174VdK == EnumC80174VdK.Refreshing && c80164VdA.LLJJJJ != null && c80164VdA.LLJJJJLIIL != null) {
                    this.LJLIL = 1;
                    c80164VdA.LLJJLIIIJLLLLLLLZ.postDelayed(this, this.LJLILLLLZI);
                    this.LJLJJL.LJIILIIL(EnumC80174VdK.RefreshFinish);
                    if (this.LJLJI == Boolean.FALSE) {
                        this.LJLJJL.LJIIZILJ(false);
                    }
                }
            }
            if (this.LJLJI == Boolean.TRUE) {
                this.LJLJJL.LJIIZILJ(true);
                return;
            }
            return;
        }
        C80164VdA c80164VdA2 = this.LJLJJL;
        int LJIIIIZZ = c80164VdA2.LLJJJJ.LJIIIIZZ(c80164VdA2, this.LJLJJI);
        C80164VdA c80164VdA3 = this.LJLJJL;
        InterfaceC80179VdP interfaceC80179VdP = c80164VdA3.LLIZ;
        if (interfaceC80179VdP != null && (c80164VdA3.LLJJJJ instanceof InterfaceC80161Vd7)) {
            interfaceC80179VdP.LIZ();
        }
        if (LJIIIIZZ >= Integer.MAX_VALUE) {
            return;
        }
        C80164VdA c80164VdA4 = this.LJLJJL;
        if (c80164VdA4.LJLLL || c80164VdA4.LLJ) {
            long currentTimeMillis = System.currentTimeMillis();
            C80164VdA c80164VdA5 = this.LJLJJL;
            if (c80164VdA5.LJLLL) {
                float f = c80164VdA5.LJLLI;
                c80164VdA5.LJLJLLL = f;
                c80164VdA5.LJLJJI = 0;
                c80164VdA5.LJLLL = false;
                super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, c80164VdA5.LJLL, (f + c80164VdA5.LJLILLLLZI) - (c80164VdA5.LJLIL * 2), 0));
                C80164VdA c80164VdA6 = this.LJLJJL;
                super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, c80164VdA6.LJLL, c80164VdA6.LJLLI + c80164VdA6.LJLILLLLZI, 0));
            }
            C80164VdA c80164VdA7 = this.LJLJJL;
            if (c80164VdA7.LLJ) {
                c80164VdA7.LLIZLLLIL = 0;
                super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, c80164VdA7.LJLL, c80164VdA7.LJLLI, 0));
                C80164VdA c80164VdA8 = this.LJLJJL;
                c80164VdA8.LLJ = false;
                c80164VdA8.LJLJJI = 0;
            }
        }
        C80164VdA c80164VdA9 = this.LJLJJL;
        int i = c80164VdA9.LJLILLLLZI;
        if (i > 0) {
            ValueAnimator LJI = c80164VdA9.LJI(0, LJIIIIZZ, c80164VdA9.LJLJJLL, c80164VdA9.LLFFF);
            C80164VdA c80164VdA10 = this.LJLJJL;
            if (c80164VdA10.LLIILZL) {
                c80157Vd3 = c80164VdA10.LLJJJJLIIL.LJ(c80164VdA10.LJLILLLLZI);
            }
            if (LJI == null || c80157Vd3 == null) {
                return;
            }
            LJI.addUpdateListener(c80157Vd3);
            return;
        }
        if (i < 0) {
            c80164VdA9.LJI(0, LJIIIIZZ, c80164VdA9.LJLJJLL, c80164VdA9.LLFFF);
        } else {
            c80164VdA9.LLJL.LIZIZ(0, false);
            this.LJLJJL.LLJL.LIZJ(EnumC80174VdK.None);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80166VdC(C80164VdA c80164VdA, int i, Boolean bool, boolean z) {
        this.LJLJJL = c80164VdA;
        this.LJLILLLLZI = i;
        this.LJLJI = bool;
        this.LJLJJI = z;
    }
}
