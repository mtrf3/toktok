package X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.util.Arrays;

/* renamed from: X.0AE, reason: invalid class name */
/* loaded from: classes.dex */
public class C0AE implements Runnable {
    public int LJLIL;
    public int LJLILLLLZI;
    public OverScroller LJLJI;
    public Interpolator LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final /* synthetic */ RecyclerView LJLJL;

    public final void LIZ() {
        int i;
        int i2;
        boolean awakenScrollBars;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        RecyclerView recyclerView = this.LJLJL;
        if (recyclerView.LJLLJ == null) {
            recyclerView.removeCallbacks(this);
            this.LJLJI.abortAnimation();
            return;
        }
        this.LJLJJLL = false;
        this.LJLJJL = true;
        recyclerView.LJIILLIIL();
        OverScroller overScroller = this.LJLJI;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.LJLIL;
            int i5 = currY - this.LJLILLLLZI;
            this.LJLIL = currX;
            this.LJLILLLLZI = currY;
            RecyclerView recyclerView2 = this.LJLJL;
            int[] iArr = recyclerView2.LLJJJJJIL;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView2.LJJ(i4, i5, 1, iArr, null)) {
                int[] iArr2 = this.LJLJL.LLJJJJJIL;
                i4 -= iArr2[0];
                i5 -= iArr2[1];
            }
            if (this.LJLJL.getOverScrollMode() != 2) {
                this.LJLJL.LJIILL(i4, i5);
            }
            RecyclerView recyclerView3 = this.LJLJL;
            if (recyclerView3.LJLLILLLL != null) {
                int[] iArr3 = recyclerView3.LLJJJJJIL;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView3.LJL(i4, i5, iArr3);
                RecyclerView recyclerView4 = this.LJLJL;
                int[] iArr4 = recyclerView4.LLJJJJJIL;
                i2 = iArr4[0];
                i = iArr4[1];
                i4 -= i2;
                i5 -= i;
                C0AB c0ab = recyclerView4.LJLLJ.LJLJJL;
                if (c0ab != null && !c0ab.LIZLLL && c0ab.LJ) {
                    int LIZIZ = recyclerView4.LLJIJIL.LIZIZ();
                    if (LIZIZ == 0) {
                        c0ab.LJI();
                    } else if (c0ab.LIZ >= LIZIZ) {
                        c0ab.LIZ = LIZIZ - 1;
                        c0ab.LIZIZ(i2, i);
                    } else {
                        c0ab.LIZIZ(i2, i);
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (!this.LJLJL.LJLLLLLL.isEmpty()) {
                this.LJLJL.invalidate();
            }
            RecyclerView recyclerView5 = this.LJLJL;
            int[] iArr5 = recyclerView5.LLJJJJJIL;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView5.LJJI(i2, i, i4, i5, null, 1, iArr5);
            RecyclerView recyclerView6 = this.LJLJL;
            int[] iArr6 = recyclerView6.LLJJJJJIL;
            int i6 = i4 - iArr6[0];
            int i7 = i5 - iArr6[1];
            if (i2 != 0 || i != 0) {
                recyclerView6.LJJIFFI(i2, i);
            }
            awakenScrollBars = this.LJLJL.awakenScrollBars();
            if (!awakenScrollBars) {
                this.LJLJL.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z = true;
            } else {
                z = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (overScroller.isFinished() || ((z || i6 != 0) && (z2 || i7 != 0))) {
                z3 = true;
            } else {
                z3 = false;
            }
            RecyclerView recyclerView7 = this.LJLJL;
            C0AB c0ab2 = recyclerView7.LJLLJ.LJLJJL;
            if ((c0ab2 != null && c0ab2.LIZLLL) || !z3) {
                LIZIZ();
                RecyclerView recyclerView8 = this.LJLJL;
                C0B1 c0b1 = recyclerView8.LLJ;
                if (c0b1 != null) {
                    c0b1.LIZJ(recyclerView8, i2, i);
                }
            } else {
                if (recyclerView7.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i6 < 0) {
                        i3 = -currVelocity;
                    } else if (i6 > 0) {
                        i3 = currVelocity;
                    } else {
                        i3 = 0;
                    }
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    RecyclerView recyclerView9 = this.LJLJL;
                    recyclerView9.getClass();
                    if (i3 < 0) {
                        recyclerView9.LJJIII();
                        if (recyclerView9.LLIIIL.isFinished()) {
                            recyclerView9.LLIIIL.onAbsorb(-i3);
                        }
                    } else if (i3 > 0) {
                        recyclerView9.LJJIIJ();
                        if (recyclerView9.LLIIJI.isFinished()) {
                            recyclerView9.LLIIJI.onAbsorb(i3);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView9.LJJIIJZLJL();
                        if (recyclerView9.LLIIIZ.isFinished()) {
                            recyclerView9.LLIIIZ.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView9.LJJII();
                        if (recyclerView9.LLIIJLIL.isFinished()) {
                            recyclerView9.LLIIJLIL.onAbsorb(currVelocity);
                        }
                    }
                    if (i3 != 0 || currVelocity != 0) {
                        C16300kU.LJIIJ(recyclerView9);
                    }
                }
                if (RecyclerView.LLJZ) {
                    C1C0 c1c0 = this.LJLJL.LLJI;
                    int[] iArr7 = c1c0.LIZJ;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    c1c0.LIZLLL = 0;
                }
            }
        }
        C0AB c0ab3 = this.LJLJL.LJLLJ.LJLJJL;
        if (c0ab3 != null && c0ab3.LIZLLL) {
            c0ab3.LIZIZ(0, 0);
        }
        this.LJLJJL = false;
        if (this.LJLJJLL) {
            this.LJLJL.removeCallbacks(this);
            C16300kU.LJIIL(this.LJLJL, this);
        } else {
            this.LJLJL.setScrollState(0);
            this.LJLJL.LJIIIIZZ(1);
        }
    }

    public final void LIZIZ() {
        if (this.LJLJJL) {
            this.LJLJJLL = true;
        } else {
            this.LJLJL.removeCallbacks(this);
            C16300kU.LJIIL(this.LJLJL, this);
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

    public C0AE(RecyclerView recyclerView) {
        this.LJLJL = recyclerView;
        InterpolatorC029009m interpolatorC029009m = RecyclerView.LLL;
        this.LJLJJI = interpolatorC029009m;
        this.LJLJI = new OverScroller(recyclerView.getContext(), interpolatorC029009m);
    }

    public final void LIZJ(int i, int i2, int i3, Interpolator interpolator) {
        boolean z;
        int height;
        int i4 = i3;
        if (i4 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = this.LJLJL;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
                abs = abs2;
            }
            i4 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
        if (interpolator == null) {
            interpolator = RecyclerView.LLL;
        }
        if (this.LJLJJI != interpolator) {
            this.LJLJJI = interpolator;
            this.LJLJI = new OverScroller(this.LJLJL.getContext(), interpolator);
        }
        this.LJLILLLLZI = 0;
        this.LJLIL = 0;
        this.LJLJL.setScrollState(2);
        this.LJLJI.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.LJLJI.computeScrollOffset();
        }
        LIZIZ();
    }
}
