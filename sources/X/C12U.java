package X;

import Y.IDAListenerS69S0100000;
import Y.IDRunnableS6S0101000;
import Y.IDRunnableS85S0100000;
import Y.IDUListenerS170S0200000;
import Y.IDUListenerS263S0100000;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import java.util.List;
import kotlin.jvm.internal.IDqS32S0300000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.12U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12U {
    public final C278217i LIZ;
    public final C278217i LIZIZ;
    public final C2H2 LIZJ;
    public final InterfaceC266512v LIZLLL;
    public final C278217i LJ;
    public final C55762Gu LJFF;
    public final C3T LJI;
    public final C2H0 LJII;
    public final CW6 LJIIIIZZ;
    public final C0RI LJIIIZ;
    public final C12H LJIIJ;
    public final CUC LJIIJJI;
    public final C37791e3 LJIIL;
    public final Context LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public final Handler LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final List<C12E> LJJ;
    public final boolean LJJI;
    public final int LJJIFFI;
    public final int LJJII;
    public boolean LJJIII;
    public float LJJIIJ;
    public long LJJIIJZLJL;
    public boolean LJJIIZ;
    public CWR LJJIIZI;
    public CWR LJJIJ;
    public CharSequence LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public final C62822Ol8 LJJIJIL;
    public final C62822Ol8 LJJIJL;
    public final C62822Ol8 LJJIJLIJ;
    public C12M LJJIL;
    public final C37751dz LJJIZ;
    public final C37741dy LJJJ;
    public final C37731dx LJJJI;
    public final C37711dv LJJJIL;
    public IDRunnableS85S0100000 LJJJJ;
    public long LJJJJI;
    public final C37771e1 LJJJJIZL;
    public final C37721dw LJJJJJ;
    public final C37761e0 LJJJJJL;

    public final void LJIL() {
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(this.LJJIIJ, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new IDUListenerS263S0100000(this, 35));
        ofFloat.addListener(new IDAListenerS69S0100000(this, 12));
        ValueAnimator ofFloat2 = ObjectAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new IDUListenerS263S0100000(this, 36));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void LIZLLL() {
        int i;
        boolean z;
        int i2;
        int measuredWidth;
        int measuredHeight;
        int i3;
        int width;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.LIZLLL == null) {
            return;
        }
        if (!this.LIZ.LJIIJJI && !this.LJ.LJIIJJI) {
            return;
        }
        int LJIIJJI = C87277YNd.LJIIJJI(this.LJIIL.getSmallHeight()) + C87277YNd.LJIIJJI(4);
        int LIZ = C15380j0.LIZ(8.0f) + LJIILIIL();
        boolean z2 = true;
        if (this.LIZ.LJIIJJI) {
            C278217i c278217i = this.LIZIZ;
            if (c278217i.LJIIJJI && c278217i.LIZIZ().getVisibility() == 0) {
                i = LJIILIIL() + C87277YNd.LJIIJJI(6) + this.LIZ.LIZ.LJLJJL;
                i2 = C87277YNd.LJIIJJI(32) + this.LIZ.LIZ.LJLJJLL;
            } else {
                if (this.LIZLLL.getWidth() + this.LIZ.LIZ.LJLJJL + LIZ < C22970vF.LIZIZ()) {
                    i = this.LIZ.LIZ.LJLJJL + LIZ;
                    z2 = true;
                } else {
                    i = this.LIZ.LIZIZ().getWidth() + ((this.LIZ.LIZ.LJLJJL - this.LIZLLL.getWidth()) - LIZ);
                    z2 = false;
                }
                int i8 = this.LIZ.LIZ.LJLJJLL;
                View contentView = this.LIZLLL.getContentView();
                if (contentView != null) {
                    i6 = contentView.getHeight();
                } else {
                    i6 = 0;
                }
                if (i8 + i6 < C22970vF.LIZ()) {
                    i2 = this.LIZ.LIZ.LJLJJLL;
                } else {
                    int i9 = this.LIZ.LIZ.LJLJJLL;
                    View contentView2 = this.LIZLLL.getContentView();
                    if (contentView2 != null) {
                        i7 = contentView2.getHeight();
                    } else {
                        i7 = 0;
                    }
                    i2 = (i9 - i7) + this.LIZ.LIZIZ().getHeight();
                    z = false;
                }
            }
            z = true;
        } else if (this.LJ.LJIIJJI) {
            if (LJIILJJIL() == null) {
                measuredWidth = this.LJ.LIZIZ().getWidth();
            } else {
                measuredWidth = this.LJ.LIZIZ().getMeasuredWidth();
                int width2 = this.LJ.LIZIZ().getWidth();
                if (measuredWidth < width2) {
                    measuredWidth = width2;
                }
            }
            if (LJIILJJIL() == null) {
                measuredHeight = this.LJ.LIZIZ().getHeight();
            } else {
                measuredHeight = this.LJ.LIZIZ().getMeasuredHeight();
                int height = this.LJ.LIZIZ().getHeight();
                if (measuredHeight < height) {
                    measuredHeight = height;
                }
            }
            if (!this.LJJIJIIJIL || !this.LJJI) {
                if (this.LIZLLL.getWidth() + this.LJ.LIZ.LJLJJL < C22970vF.LIZIZ()) {
                    i = this.LJ.LIZ.LJLJJL;
                    z2 = true;
                } else {
                    i3 = this.LJ.LIZ.LJLJJL + measuredWidth;
                    width = this.LIZLLL.getWidth();
                    i = i3 - width;
                    z2 = false;
                }
            } else if ((this.LJ.LIZ.LJLJJL + measuredWidth) - this.LIZLLL.getWidth() < 0) {
                i = this.LJ.LIZ.LJLJJL;
                z2 = true;
            } else {
                i3 = this.LJ.LIZ.LJLJJL + measuredWidth;
                width = this.LIZLLL.getWidth();
                i = i3 - width;
                z2 = false;
            }
            int i10 = this.LJ.LIZ.LJLJJLL + LJIIJJI;
            View contentView3 = this.LIZLLL.getContentView();
            if (contentView3 != null) {
                i4 = contentView3.getHeight();
            } else {
                i4 = 0;
            }
            if (i10 + i4 < C22970vF.LIZ()) {
                i2 = this.LJ.LIZ.LJLJJLL + LJIIJJI;
                z = true;
            } else {
                int i11 = this.LJ.LIZ.LJLJJLL - LJIIJJI;
                View contentView4 = this.LIZLLL.getContentView();
                if (contentView4 != null) {
                    i5 = contentView4.getHeight();
                } else {
                    i5 = 0;
                }
                i2 = measuredHeight + (i11 - i5);
                z = false;
            }
        } else {
            i = 0;
            z = true;
            i2 = 0;
        }
        this.LIZLLL.LJJ(i);
        this.LIZLLL.LJJI(i2);
        this.LIZLLL.LJFF(z2, z);
    }

    public final int LJII() {
        int i;
        C278217i c278217i = this.LIZIZ;
        if (c278217i.LJIIJJI) {
            i = c278217i.LIZIZ().getWidth();
        } else {
            i = 0;
        }
        int width = this.LIZ.LIZIZ().getWidth();
        int min = Math.min(this.LIZ.LIZ.LJLJJL, this.LIZIZ.LIZ.LJLJJL);
        int max = Math.max(this.LIZ.LIZ.LJLJJL + width, this.LIZIZ.LIZ.LJLJJL + i);
        if (min <= C87277YNd.LJIIJJI(2) + this.LJIJI) {
            return 1;
        }
        if (max < (C22970vF.LIZIZ() - C87277YNd.LJIIJJI(10)) - C87277YNd.LJIIJJI(2)) {
            return 0;
        }
        return 2;
    }

    public final void LJIIJ() {
        this.LJIILLIIL.postDelayed(new Runnable() { // from class: X.12Y
            public final /* synthetic */ boolean LJLILLLLZI = true;
            public final /* synthetic */ boolean LJLJI = false;

            /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
            
                if (r2 != false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r6 = this;
                    X.12U r0 = X.C12U.this
                    X.12M r1 = r0.LJJIL
                    X.1dv r0 = r0.LJJJIL
                    boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
                    if (r0 == 0) goto Ld
                    return
                Ld:
                    boolean r0 = r6.LJLILLLLZI
                    r5 = 10
                    if (r0 == 0) goto L71
                    int r4 = X.C22970vF.LIZIZ()
                    int r3 = X.C22970vF.LIZ()
                    X.12U r0 = X.C12U.this
                    X.17i r0 = r0.LIZIZ
                    android.view.View r0 = r0.LIZIZ()
                    int r0 = r0.getWidth()
                    int r2 = r4 - r0
                    int r0 = X.C87277YNd.LJIIJJI(r5)
                    int r2 = r2 - r0
                    X.12U r0 = X.C12U.this
                    X.17i r0 = r0.LIZIZ
                    X.1pq r1 = r0.LIZ
                    int r0 = r1.LJLJJL
                    if (r0 <= r2) goto Lb5
                    r1.LJJ(r2)
                    r2 = 1
                L3c:
                    if (r3 <= r4) goto Lb0
                    r0 = 40
                    int r1 = X.C87277YNd.LJIIJJI(r0)
                L44:
                    X.12U r0 = X.C12U.this
                    X.17i r0 = r0.LIZIZ
                    android.view.View r0 = r0.LIZIZ()
                    int r0 = r0.getHeight()
                    int r3 = r3 - r0
                    int r3 = r3 - r1
                    X.12U r0 = X.C12U.this
                    X.17i r0 = r0.LIZIZ
                    X.1pq r1 = r0.LIZ
                    int r0 = r1.LJLJJLL
                    if (r0 <= r3) goto Lad
                    r1.LJJI(r3)
                L5f:
                    X.12U r3 = X.C12U.this
                    X.12t r0 = r3.LJIILJJIL()
                    if (r0 == 0) goto L9d
                    X.17i r1 = r3.LIZ
                    X.17i r0 = r3.LIZIZ
                    r3.LJFF(r1, r0)
                    r3.LIZLLL()
                L71:
                    boolean r0 = r6.LJLJI
                    if (r0 == 0) goto L9c
                    boolean r0 = r6.LJLILLLLZI
                    if (r0 != 0) goto L9c
                    int r2 = X.C22970vF.LIZIZ()
                    X.12U r0 = X.C12U.this
                    X.17i r0 = r0.LIZ
                    android.view.View r0 = r0.LIZIZ()
                    int r0 = r0.getWidth()
                    int r2 = r2 - r0
                    int r0 = X.C87277YNd.LJIIJJI(r5)
                    int r2 = r2 - r0
                    X.12U r0 = X.C12U.this
                    X.17i r0 = r0.LIZ
                    X.1pq r1 = r0.LIZ
                    int r0 = r1.LJLJJL
                    if (r0 <= r2) goto L9c
                    r1.LJJ(r2)
                L9c:
                    return
                L9d:
                    X.17i r2 = r3.LIZIZ
                    X.17i r1 = r3.LIZ
                    int r0 = r3.LJIILIIL()
                    int r0 = -r0
                    X.C12U.LJ(r2, r1, r0)
                    r3.LIZLLL()
                    goto L71
                Lad:
                    if (r2 == 0) goto L71
                    goto L5f
                Lb0:
                    int r1 = X.C87277YNd.LJIIJJI(r5)
                    goto L44
                Lb5:
                    r2 = 0
                    goto L3c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C12Y.LIZ():void");
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
        }, 0L);
    }

    public final void LJIIL() {
        final int i = this.LJIIL.getLayoutParams().width;
        ValueAnimator ofInt = ObjectAnimator.ofInt(0, this.LJIIL.getMeasuredWidth());
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new IDUListenerS263S0100000(this, 33));
        ofInt.addListener(new Animator.AnimatorListener() { // from class: X.12P
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animation) {
                o.LJIIIZ(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animation) {
                o.LJIIIZ(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animation) {
                o.LJIIIZ(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                if (C12U.this.LJIILJJIL() == null) {
                    C12U c12u = C12U.this;
                    C45101pq c45101pq = c12u.LJ.LIZ;
                    int i2 = i;
                    int LJIIJJI = C87277YNd.LJIIJJI(c12u.LJIIL.getSmallHeight());
                    WindowManager.LayoutParams layoutParams = c45101pq.LJLJI;
                    layoutParams.width = i2;
                    layoutParams.height = LJIIJJI;
                    c45101pq.LLLLZLLLI();
                }
                C12U.this.LJIIJ.setScaleX(1.0f);
                C12U.this.LJIIJ.setScaleY(1.0f);
                C12U.this.LJIIJJI.setAlpha(1.0f);
                C12U.this.LIZ.LIZJ();
                C12U.this.LIZLLL();
                InterfaceC266512v interfaceC266512v = C12U.this.LIZLLL;
                if (interfaceC266512v != null) {
                    interfaceC266512v.LJJIJIIJI(false);
                }
                C12U.this.LJJIII = false;
            }
        });
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new IDUListenerS263S0100000(this, 34));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
    }

    public final int LJIILIIL() {
        return this.LJIIJ.getIconWidth() + this.LJIJJ;
    }

    public final C266312t LJIILJJIL() {
        return (C266312t) this.LJJIJLIJ.getValue();
    }

    public final long LJIILLIIL() {
        return ((Number) this.LJJIJIL.getValue()).longValue();
    }

    public final void LJIJI() {
        this.LIZIZ.LIZJ();
    }

    public final void LIZ() {
        if (LJIILJJIL() != null) {
            LJFF(this.LIZ, this.LIZIZ);
            LIZLLL();
        } else {
            LJ(this.LIZ, this.LIZIZ, LJIILIIL());
            LIZLLL();
        }
    }

    public final int LJIIIIZZ() {
        if (LJIILJJIL() != null && !this.LJ.LJIIJJI) {
            return 0;
        }
        int width = this.LJIIL.getWidth();
        int i = this.LJ.LIZ.LJLJJL;
        int i2 = this.LJIJI;
        if (i < i2) {
            return 1;
        }
        if (i + width + i2 < C22970vF.LIZIZ() - C87277YNd.LJIIJJI(10)) {
            return 0;
        }
        return 2;
    }

    public static void LIZJ(C12U c12u) {
        int i;
        View view;
        View view2;
        C2H0 c2h0 = c12u.LJII;
        int i2 = 0;
        if (c2h0 != null && (view2 = c2h0.LJLJJI) != null) {
            i = view2.getWidth();
        } else {
            i = 0;
        }
        C2H0 c2h02 = c12u.LJII;
        if (c2h02 != null && (view = c2h02.LJLJJI) != null) {
            i2 = view.getHeight();
        }
        c12u.LIZIZ(i, i2);
    }

    public static void LJIIIZ(C12U c12u) {
        int LIZIZ = (C22970vF.LIZIZ() - c12u.LJ.LIZIZ().getWidth()) - C87277YNd.LJIIJJI(10);
        if (c12u.LJ.LIZ.LJLJJL > LIZIZ) {
            new IDRunnableS6S0101000(LIZIZ, c12u, 38).run();
        }
    }

    public final int LJI(boolean z) {
        int i;
        int width;
        C278217i c278217i = this.LIZIZ;
        if (c278217i.LJIIJJI) {
            i = c278217i.LIZIZ().getWidth();
        } else {
            i = 0;
        }
        if (z) {
            width = this.LJIIJ.getIconWidth() + i + this.LJIJJ;
        } else {
            width = this.LJIIJJI.getWidth();
        }
        int i2 = this.LIZ.LIZ.LJLJJL;
        int i3 = this.LJIJI;
        if (i2 < i3) {
            return 1;
        }
        if (i2 + width + i3 < C22970vF.LIZIZ() - C87277YNd.LJIIJJI(10)) {
            return 0;
        }
        return 2;
    }

    public final void LJIIZILJ(C12F c12f) {
        C265012g c265012g;
        C2H2 c2h2;
        if (c12f == C12F.CMD_ORIENTATION_CHANGED) {
            Object param = c12f.getParam();
            if ((param instanceof C265012g) && (c265012g = (C265012g) param) != null && (c2h2 = this.LIZJ) != null) {
                int i = c265012g.LIZ;
                if (i > 0) {
                    c2h2.LJJ(c2h2.LJLJJL - i);
                } else {
                    c2h2.LJJ(c2h2.LJLJJL + c2h2.LJLL);
                }
                c2h2.LJLL = i;
            }
            C45101pq c45101pq = this.LIZ.LIZ;
            if (c45101pq != null) {
                c45101pq.LJJI(this.LJIJ);
            }
        }
    }

    public final void LJIJ(C12F c12f) {
        C265012g c265012g;
        C2H2 c2h2;
        if (c12f == C12F.CMD_ORIENTATION_CHANGED) {
            Object param = c12f.getParam();
            if ((param instanceof C265012g) && (c265012g = (C265012g) param) != null && (c2h2 = this.LIZJ) != null) {
                int i = c265012g.LIZ;
                if (i > 0) {
                    c2h2.LJJ(c2h2.LJLJJL - i);
                } else {
                    c2h2.LJJ(c2h2.LJLJJL + c2h2.LJLL);
                }
                c2h2.LJLL = i;
            }
            C45101pq c45101pq = this.LIZ.LIZ;
            if (c45101pq != null) {
                c45101pq.LJJI(this.LJIJ);
            }
        }
        if (this.LJIIJJI.getMeasuredWidth() > 0) {
            this.LJIIJJI.LJIILLIIL(this.LIZ.LIZIZ().getMeasuredWidth() + this.LJIJJ);
        }
        C12M c12m = this.LJJIL;
        if (o.LJ(c12m, this.LJJJJJL)) {
            C45101pq c45101pq2 = this.LJ.LIZ;
            LJJIIJZLJL(c45101pq2.LJLJJL, c45101pq2.LJLJJLL);
            LIZJ(this);
        } else {
            if (!o.LJ(c12m, this.LJJJJJ) && !o.LJ(c12m, this.LJJJI)) {
                return;
            }
            this.LJIIJJI.post(new IDRunnableS85S0100000(this, 118));
        }
    }

    public final void LJJ(C12F cmd) {
        o.LJIIIZ(cmd, "cmd");
        if (o.LJ(this.LJJIL, this.LJJJIL)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stateMachine is destroy, cmd=");
            LIZ.append(cmd);
            C0NB.LJ("GameUiStateMachine", X1D.LIZIZ(LIZ));
            return;
        }
        if (!this.LJJIL.LIZJ(cmd)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("not handleCommand, state=");
            LIZ2.append(this.LJJIL);
            LIZ2.append(", cmd=");
            LIZ2.append(cmd);
            C0NB.LJ("GameUiStateMachine", X1D.LIZIZ(LIZ2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if ((r1 - r0) < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r7, int r8) {
        /*
            r6 = this;
            X.17i r0 = r6.LJ
            boolean r0 = r0.LJIIJJI
            if (r0 == 0) goto L7a
            X.12t r0 = r6.LJIILJJIL()
            if (r0 != 0) goto Lac
            X.17i r0 = r6.LJ
            android.view.View r0 = r0.LIZIZ()
            int r4 = r0.getWidth()
        L16:
            boolean r0 = r6.LJJIJIIJIL
            r3 = 1
            if (r0 != 0) goto L8e
            X.17i r0 = r6.LJ
            X.1pq r0 = r0.LIZ
            int r1 = r0.LJLJJL
            X.2H0 r0 = r6.LJII
            if (r0 == 0) goto L8c
            int r0 = r0.LLF
        L27:
            int r1 = r1 + r0
            int r0 = X.C22970vF.LIZIZ()
            if (r1 >= r0) goto La2
            X.17i r0 = r6.LJ
            X.1pq r0 = r0.LIZ
            int r2 = r0.LJLJJL
        L34:
            r5 = 1
        L35:
            X.17i r0 = r6.LJ
            X.1pq r0 = r0.LIZ
            int r4 = r0.LJLJJLL
            X.1e3 r0 = r6.LJIIL
            int r0 = r0.getSmallHeight()
            int r1 = X.C87277YNd.LJIIJJI(r0)
            int r1 = r1 + r4
            X.2H0 r0 = r6.LJII
            if (r0 == 0) goto L8a
            int r0 = r0.LLFF
        L4c:
            int r1 = r1 + r0
            int r0 = X.C22970vF.LIZ()
            if (r1 >= r0) goto L7b
            X.17i r0 = r6.LJ
            X.1pq r0 = r0.LIZ
            int r4 = r0.LJLJJLL
            X.1e3 r0 = r6.LJIIL
            int r0 = r0.getSmallHeight()
            int r1 = X.C87277YNd.LJIIJJI(r0)
            int r1 = r1 + r4
        L64:
            X.2H0 r0 = r6.LJII
            if (r0 == 0) goto L6b
            r0.LJJ(r2)
        L6b:
            X.2H0 r0 = r6.LJII
            if (r0 == 0) goto L72
            r0.LJJI(r1)
        L72:
            X.2H0 r0 = r6.LJII
            if (r0 == 0) goto L7a
            r0.LJLZ = r5
            r0.LJZ = r3
        L7a:
            return
        L7b:
            X.17i r0 = r6.LJ
            X.1pq r0 = r0.LIZ
            int r1 = r0.LJLJJLL
            int r1 = r1 - r8
            r0 = 6
            int r0 = X.C87277YNd.LJIIJJI(r0)
            int r1 = r1 - r0
            r3 = 0
            goto L64
        L8a:
            r0 = 0
            goto L4c
        L8c:
            r0 = 0
            goto L27
        L8e:
            X.17i r0 = r6.LJ
            X.1pq r0 = r0.LIZ
            int r2 = r0.LJLJJL
            int r1 = r2 + r4
            X.2H0 r0 = r6.LJII
            if (r0 == 0) goto La0
            int r0 = r0.LLF
        L9c:
            int r1 = r1 - r0
            if (r1 >= 0) goto La8
            goto L34
        La0:
            r0 = 0
            goto L9c
        La2:
            X.17i r0 = r6.LJ
            X.1pq r0 = r0.LIZ
            int r2 = r0.LJLJJL
        La8:
            int r2 = r2 + r4
            int r2 = r2 - r7
            r5 = 0
            goto L35
        Lac:
            X.17i r0 = r6.LJ
            android.view.View r0 = r0.LIZIZ()
            int r4 = r0.getMeasuredWidth()
            X.17i r0 = r6.LJ
            android.view.View r0 = r0.LIZIZ()
            int r0 = r0.getWidth()
            if (r4 >= r0) goto L16
            r4 = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12U.LIZIZ(int, int):void");
    }

    public final void LJFF(C278217i c278217i, C278217i c278217i2) {
        int LJIILIIL;
        if (c278217i == null || !c278217i.LJIIJJI || c278217i2 == null || !c278217i2.LJIIJJI) {
            return;
        }
        C45101pq c45101pq = c278217i.LIZ;
        int i = c45101pq.LJLJJL;
        int i2 = c45101pq.LJLJJLL;
        if (o.LJ(this.LIZ, c278217i)) {
            C266312t LJIILJJIL = LJIILJJIL();
            if (LJIILJJIL != null && LJIILJJIL.LIZJ(0)) {
                LJIILIIL = i - (this.LIZIZ.LIZIZ().getWidth() + this.LJIJJ);
            } else {
                LJIILIIL = i + LJIILIIL();
            }
            C266312t LJIILJJIL2 = LJIILJJIL();
            if (LJIILJJIL2 != null && LJIILJJIL2.LIZLLL(0)) {
                i2 -= this.LIZIZ.LIZIZ().getHeight() - this.LIZ.LIZIZ().getHeight();
            }
        } else {
            C266312t LJIILJJIL3 = LJIILJJIL();
            if (LJIILJJIL3 != null && LJIILJJIL3.LIZJ(0)) {
                LJIILIIL = this.LIZIZ.LIZIZ().getWidth() + this.LJIJJ + i;
            } else {
                LJIILIIL = i - LJIILIIL();
            }
            C266312t LJIILJJIL4 = LJIILJJIL();
            if (LJIILJJIL4 != null && LJIILJJIL4.LIZLLL(0)) {
                i2 += this.LIZIZ.LIZIZ().getHeight() - this.LIZ.LIZIZ().getHeight();
            }
        }
        c278217i2.LIZ.LLLLZLLIL(LJIILIIL, i2);
    }

    public final Point LJIILL(int i, int i2) {
        int LIZIZ = (C22970vF.LIZIZ() - C87277YNd.LJIIJJI(10)) - this.LJ.LIZIZ().getMeasuredWidth();
        int LJIIJJI = C87277YNd.LJIIJJI(10);
        if (i > LIZIZ) {
            i = LIZIZ;
        }
        if (i >= LJIIJJI) {
            LJIIJJI = i;
        }
        return new Point(LJIIJJI, i2);
    }

    public final void LJJIIJZLJL(int i, int i2) {
        boolean z;
        int LJIIJJI;
        int width = this.LJIIL.getWidth();
        int height = this.LJIIL.getHeight();
        int LIZIZ = C22970vF.LIZIZ();
        int LIZ = C22970vF.LIZ();
        boolean z2 = false;
        if (LIZIZ > LIZ) {
            z = true;
        } else {
            z = false;
        }
        int LJIIJJI2 = C87277YNd.LJIIJJI(10);
        int LJIIJJI3 = C87277YNd.LJIIJJI(10);
        int i3 = LIZ - height;
        if (z) {
            LJIIJJI = C87277YNd.LJIIJJI(10);
        } else {
            LJIIJJI = C87277YNd.LJIIJJI(40);
        }
        int i4 = i3 - LJIIJJI;
        int i5 = (LIZIZ - width) - LJIIJJI2;
        if (i < 0) {
            i = 0;
            z2 = true;
        }
        if (i > i5) {
            z2 = true;
        } else {
            i5 = i;
        }
        if (i2 < LJIIJJI3) {
            i2 = LJIIJJI3;
            z2 = true;
        }
        if (i2 <= i4) {
            i4 = i2;
            if (!z2) {
                return;
            }
        }
        this.LJ.LIZ.LLLLZLLIL(i5, i4);
    }

    public static void LJ(C278217i c278217i, C278217i c278217i2, int i) {
        if (c278217i == null || !c278217i.LJIIJJI || c278217i2 == null || !c278217i2.LJIIJJI) {
            return;
        }
        C45101pq c45101pq = c278217i.LIZ;
        float f = c45101pq.LJLJJL;
        float f2 = c45101pq.LJLJJLL;
        c278217i2.LIZ.LJJ((int) (f + i));
        c278217i2.LIZ.LJJI((int) (f2 + 0));
    }

    public static void LJIJJ(int i, int i2, int i3) {
        if (i > C22970vF.LIZIZ() || i2 > C22970vF.LIZ()) {
            C24180xC.LIZ(0, i3, "");
        }
    }

    public static void LJIJJLI(C12U c12u, Integer num, int i) {
        boolean z;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (num != null) {
            c12u.LJIIJJI.setState(num.intValue());
        }
        C278217i c278217i = c12u.LIZIZ;
        if (!c278217i.LJIIJJI) {
            c278217i.LIZLLL();
            c12u.LIZ();
            if (z) {
                c12u.LJIIJ();
            }
        }
    }

    public final void LJJIFFI(C278217i c278217i, int i, int i2) {
        ValueAnimator ofInt = ObjectAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(200L).start();
        ofInt.addUpdateListener(new IDUListenerS170S0200000(c278217i, this, 2));
        ofInt.addListener(new IDAListenerS69S0100000(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        if (r2 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(int r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12U.LJJIII(int, int, boolean):void");
    }

    public final void LJJIIJ(int i, int i2, boolean z) {
        C278217i c278217i;
        C278217i c278217i2;
        int i3;
        int i4;
        if (z) {
            c278217i2 = (C278217i) C005600m.LIZ("control_view");
            c278217i = (C278217i) C005600m.LIZ("msg_view");
        } else {
            c278217i = (C278217i) C005600m.LIZ("control_view");
            c278217i2 = (C278217i) C005600m.LIZ("msg_view");
        }
        if (c278217i2 == null || c278217i2.LIZ == null || c278217i2.LIZIZ() == null) {
            return;
        }
        C278217i c278217i3 = this.LIZIZ;
        if (c278217i3.LJIIJJI) {
            i3 = c278217i3.LIZIZ().getWidth();
        } else {
            i3 = 0;
        }
        int width = this.LIZ.LIZIZ().getWidth();
        C278217i c278217i4 = this.LIZIZ;
        if (c278217i4.LJIIJJI) {
            i4 = c278217i4.LIZIZ().getHeight();
        } else {
            i4 = 0;
        }
        LJIIJJI(z, i, i2, width, this.LIZ.LIZIZ().getHeight(), i3, i4, new IDqS443S0100000(c278217i2, 46));
        if (c278217i == null || c278217i.LIZ == null || c278217i.LIZIZ() == null || !c278217i.LJIIJJI) {
            return;
        }
        LJFF(c278217i2, c278217i);
    }

    public static void LJJI(C12U c12u, C12M c12m, C12F c12f, int i) {
        boolean z;
        if ((i & 2) != 0) {
            c12f = null;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        c12u.getClass();
        IDqS32S0300000 iDqS32S0300000 = new IDqS32S0300000(c12m, c12f, c12u, 12);
        if (z) {
            c12u.LJIILLIIL.post(new IDRunnableS85S0100000(iDqS32S0300000, LiveTryModeCountDownThresholdSetting.DEFAULT));
        } else {
            iDqS32S0300000.invoke();
        }
    }

    public final void LJJII(final C278217i c278217i, final int i, int i2, final int i3, int i4) {
        final int i5 = i2 - i;
        final int i6 = i4 - i3;
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(200L).start();
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.12T
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                C45101pq c45101pq = C278217i.this.LIZ;
                if (c45101pq != null) {
                    c45101pq.LLLLZLLIL(i + ((int) (i5 * floatValue)), i3 + ((int) (i6 * floatValue)));
                }
                this.LIZ();
            }
        });
        ofFloat.addListener(new IDAListenerS69S0100000(this, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(boolean r17, int r18, int r19, int r20, int r21, int r22, int r23, X.InterfaceC88471Ynr<? super java.lang.Integer, ? super java.lang.Integer, X.C76800UCe> r24) {
        /*
            r16 = this;
            X.12t r10 = r16.LJIILJJIL()
            r4 = 0
            r6 = r20
            r11 = r17
            r7 = r21
            r9 = r23
            r8 = r22
            if (r10 == 0) goto L58
            r12 = r6
            r13 = r7
            r14 = r8
            r15 = r9
            android.graphics.Point r0 = X.C266312t.LIZIZ(r10, r11, r12, r13, r14, r15)
        L19:
            X.12t r5 = r16.LJIILJJIL()
            if (r5 == 0) goto L24
            r10 = 0
            android.graphics.Point r4 = r5.LIZ(r6, r7, r8, r9, r10, r11)
        L24:
            r3 = 0
            r2 = r18
            r5 = r19
            if (r0 == 0) goto L55
            int r1 = r0.x
            if (r2 >= r1) goto L53
            r3 = 1
        L30:
            int r2 = r0.y
            if (r5 >= r2) goto L56
            r3 = 1
        L35:
            if (r4 == 0) goto L50
            int r0 = r4.x
            if (r1 <= r0) goto L3d
            r1 = r0
            r3 = 1
        L3d:
            int r0 = r4.y
            if (r2 <= r0) goto L50
            r2 = r0
        L42:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = r24
            r2.invoke(r1, r0)
        L4f:
            return
        L50:
            if (r3 == 0) goto L4f
            goto L42
        L53:
            r1 = r2
            goto L30
        L55:
            r1 = r2
        L56:
            r2 = r5
            goto L35
        L58:
            r0 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12U.LJIIJJI(boolean, int, int, int, int, int, int, X.Ynr):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e1, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, "CREDIT_MUTE") != false) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.1dz] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.1dy] */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.1dx] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.1dv] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.1e1] */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.1dw] */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.1e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12U(X.C278217i r6, X.C278217i r7, X.C2H2 r8, X.InterfaceC266512v r9, X.C278217i r10, X.C55762Gu r11, X.C3T r12, X.C2H0 r13, X.CW6 r14, X.C0RI r15) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12U.<init>(X.17i, X.17i, X.2H2, X.12v, X.17i, X.2Gu, X.C3T, X.2H0, X.CW6, X.0RI):void");
    }
}
