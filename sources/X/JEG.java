package X;

import Y.ALAdapterS6S0200000_8;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS46S1000000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class JEG {
    public static final float LJIIZILJ;
    public static final int LJIJ;
    public final Context LIZ;
    public final WindowManager LIZIZ;
    public C48811JDr LIZJ;
    public final Rect LIZLLL;
    public final Rect LJ;
    public JET LJFF;
    public final List<InterfaceC48809JDp> LJI;
    public final JEK LJII;
    public final Point LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public float LJIILJJIL;
    public final CopyOnWriteArraySet<Animator> LJIILL;
    public final C62822Ol8 LJIILLIIL;

    public final void LIZ() {
        ViewGroup.LayoutParams layoutParams;
        WindowManager.LayoutParams layoutParams2;
        boolean z;
        Iterator<Animator> it = this.LJIILL.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        JET jet = this.LJFF;
        if (jet != null) {
            layoutParams = jet.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof WindowManager.LayoutParams) || (layoutParams2 = (WindowManager.LayoutParams) layoutParams) == null) {
            return;
        }
        int i = layoutParams2.width;
        int i2 = layoutParams2.height;
        C48811JDr c48811JDr = this.LIZJ;
        if (c48811JDr != null) {
            int LIZJ = c48811JDr.LIZJ();
            C48811JDr c48811JDr2 = this.LIZJ;
            if (c48811JDr2 != null) {
                int LIZ = c48811JDr2.LIZ();
                if (LIZ == i2 && LIZJ == i) {
                    return;
                }
                int i3 = LIZJ - i;
                int i4 = LIZ - i2;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                if ((i / 2) + this.LJIIIIZZ.x > this.LJIIJ / 2) {
                    z = true;
                } else {
                    z = false;
                }
                duration.setInterpolator(C55953Lxd.LIZLLL());
                duration.addUpdateListener(new JEH(this, i, i3, i2, i4, z));
                duration.addListener(new ALAdapterS6S0200000_8(this, duration, 0));
                duration.start();
                return;
            }
            o.LJIJI("currentWindowSize");
            throw null;
        }
        o.LJIJI("currentWindowSize");
        throw null;
    }

    public abstract void LIZJ(ValueAnimator valueAnimator);

    public abstract void LIZLLL(String str);

    public abstract C48813JDt LJ();

    static {
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(352));
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(220));
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(180));
        LJIIZILJ = 0.5625f;
        LJIJ = C7MY.LIZIZ(10);
    }

    public void LIZIZ() {
        Iterator it = ((ArrayList) this.LJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC48809JDp) it.next()).LIZ();
        }
        JET jet = this.LJFF;
        if (jet == null) {
            return;
        }
        this.LIZIZ.removeViewImmediate(jet);
        this.LJFF = null;
        ((ArrayList) C4P.LIZIZ).clear();
        C16880lQ.LJJLIIIJL(EF7.LIZIZ(), (BroadcastReceiver) C4P.LIZ.getValue());
    }

    public final AbstractC48820JEa LJFF() {
        return (AbstractC48820JEa) this.LJIILLIIL.getValue();
    }

    public JEG(Context context) {
        this.LIZ = context;
        Object LLILL = C16880lQ.LLILL(context, "window");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
        this.LIZIZ = (WindowManager) LLILL;
        new C48813JDt(LJIIZILJ, true, C48814JDu.LIZIZ(JE0.DEFAULT));
        this.LIZLLL = new Rect();
        this.LJ = new Rect();
        this.LJI = new ArrayList();
        this.LJII = new JEK(this);
        this.LJIIIIZZ = new Point();
        this.LJIIJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C53947LFf.LIZLLL())));
        this.LJIIJJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C53947LFf.LIZ())));
        this.LJIIL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C60191Njn.LIZ(0))));
        this.LJIILL = new CopyOnWriteArraySet<>();
        this.LJIILLIIL = C221108m2.LIZIZ(new AqS46S1000000_8("pipWnd", 1));
    }

    public final void LJI(Point point) {
        WindowManager.LayoutParams layoutParams;
        JET jet = this.LJFF;
        if (jet == null) {
            return;
        }
        C48811JDr c48811JDr = this.LIZJ;
        if (c48811JDr != null) {
            c48811JDr.LIZJ();
            C48811JDr c48811JDr2 = this.LIZJ;
            if (c48811JDr2 != null) {
                c48811JDr2.LIZ();
                int i = point.x;
                Rect rect = this.LJ;
                point.x = C78609UtB.LJJIIZ(i, rect.left, rect.right);
                int i2 = point.y;
                Rect rect2 = this.LJ;
                point.y = C78609UtB.LJJIIZ(i2, rect2.top, rect2.bottom);
                if (o.LJ(point, this.LJIIIIZZ)) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = jet.getLayoutParams();
                if (!(layoutParams2 instanceof WindowManager.LayoutParams) || (layoutParams = (WindowManager.LayoutParams) layoutParams2) == null) {
                    return;
                }
                layoutParams.x = point.x;
                layoutParams.y = point.y;
                this.LIZIZ.updateViewLayout(this.LJFF, layoutParams);
                this.LJIIIIZZ.set(layoutParams.x, layoutParams.y);
                int i3 = this.LJIIJJI;
                int i4 = this.LJIIL;
                this.LJIILJJIL = (this.LJIIIIZZ.y - i4) / ((i3 - i4) - this.LJIILIIL);
                return;
            }
            o.LJIJI("currentWindowSize");
            throw null;
        }
        o.LJIJI("currentWindowSize");
        throw null;
    }

    public void LJII(C48811JDr c48811JDr) {
        ViewGroup.LayoutParams layoutParams;
        WindowManager.LayoutParams layoutParams2;
        int i;
        AbstractC48820JEa LJFF = LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[setWindowSizeDirectly] ");
        LIZ.append(c48811JDr);
        LJFF.LJIIIIZZ(X1D.LIZIZ(LIZ));
        this.LIZJ = c48811JDr;
        int LIZJ = c48811JDr.LIZJ();
        C48811JDr c48811JDr2 = this.LIZJ;
        if (c48811JDr2 != null) {
            LJIIIIZZ(LIZJ, c48811JDr2.LIZ());
            JET jet = this.LJFF;
            if (jet != null) {
                layoutParams = jet.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (!(layoutParams instanceof WindowManager.LayoutParams) || (layoutParams2 = (WindowManager.LayoutParams) layoutParams) == null) {
                return;
            }
            float f = this.LJIILJJIL;
            int i2 = this.LJIIJJI;
            int i3 = ((int) (f * ((i2 - r1) - this.LJIILIIL))) + this.LJIIL;
            Rect rect = this.LIZLLL;
            int LJJIIZ = C78609UtB.LJJIIZ(i3, rect.top, rect.bottom);
            if (this.LJIIIZ) {
                i = this.LIZLLL.left;
            } else {
                i = this.LIZLLL.right;
            }
            layoutParams2.x = i;
            layoutParams2.y = LJJIIZ;
            C48811JDr c48811JDr3 = this.LIZJ;
            if (c48811JDr3 != null) {
                layoutParams2.height = c48811JDr3.LIZ();
                C48811JDr c48811JDr4 = this.LIZJ;
                if (c48811JDr4 != null) {
                    layoutParams2.width = c48811JDr4.LIZJ();
                    AbstractC48820JEa LJFF2 = LJFF();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("[restoreWindowPosition] origin (");
                    LIZ2.append(layoutParams2.x);
                    LIZ2.append(", ");
                    LIZ2.append(layoutParams2.y);
                    LIZ2.append("), size (");
                    LIZ2.append(layoutParams2.height);
                    LIZ2.append(", ");
                    LIZ2.append(layoutParams2.width);
                    LIZ2.append(") bound ");
                    LIZ2.append(this.LIZLLL);
                    LIZ2.append(", yParam: ");
                    LIZ2.append(this.LJIILJJIL);
                    LJFF2.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                    this.LIZIZ.updateViewLayout(this.LJFF, layoutParams2);
                    this.LJIIIIZZ.set(layoutParams2.x, layoutParams2.y);
                    return;
                }
                o.LJIJI("currentWindowSize");
                throw null;
            }
            o.LJIJI("currentWindowSize");
            throw null;
        }
        o.LJIJI("currentWindowSize");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r1 != 3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.InterfaceC65784Pro<X.C76800UCe> r8) {
        /*
            r7 = this;
            X.JET r5 = r7.LJFF
            if (r5 == 0) goto L81
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r1 = r0.getConfiguration()
            java.lang.String r0 = "resources.configuration"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r2 = r1.screenHeightDp
            int r1 = r1.screenWidthDp
            int r0 = java.lang.Math.max(r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r6 = X.O6R.LJJIIZ(r0)
            int r0 = java.lang.Math.min(r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r4 = X.O6R.LJJIIZ(r0)
            android.view.WindowManager r0 = r7.LIZIZ
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto Le0
            if (r1 == r3) goto Lda
            if (r1 == r2) goto Le0
            r0 = 3
            if (r1 == r0) goto Lda
        L4a:
            X.0lI r0 = o3.h0.LJIIIZ(r5)
            r1 = 0
            if (r0 == 0) goto Ld8
            X.0Ql r0 = r0.LIZ(r2)
            if (r0 == 0) goto Ld8
            int r2 = r0.LIZIZ
            int r0 = r0.LIZLLL
            int r2 = r2 - r0
        L5c:
            r7.LJIILIIL = r2
            X.0lI r0 = o3.h0.LJIIIZ(r5)
            if (r0 == 0) goto L6f
            X.0Ql r0 = r0.LIZ(r3)
            if (r0 == 0) goto L6f
            int r1 = r0.LIZIZ
            int r0 = r0.LIZLLL
            int r1 = r1 - r0
        L6f:
            int r0 = X.C60191Njn.LIZ(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            r7.LJIIL = r0
        L81:
            X.JEa r2 = r7.LJFF()
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r0 = "[updateScreenParams] Current size: ("
            r3.append(r0)
            int r0 = r7.LJIIJJI
            r3.append(r0)
            java.lang.String r1 = ", "
            r3.append(r1)
            int r0 = r7.LJIIJ
            r3.append(r0)
            java.lang.String r0 = ") insetHeights: ("
            r3.append(r0)
            int r0 = r7.LJIIL
            r3.append(r0)
            r3.append(r1)
            int r0 = r7.LJIILIIL
            r3.append(r0)
            java.lang.String r0 = ") rotation: "
            r3.append(r0)
            android.view.WindowManager r0 = r7.LIZIZ
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            r3.append(r0)
            java.lang.String r0 = ", relativeY: "
            r3.append(r0)
            float r0 = r7.LJIILJJIL
            r3.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r3)
            r2.LJIIIIZZ(r0)
            if (r8 == 0) goto Ld7
            r8.invoke()
        Ld7:
            return
        Ld8:
            r2 = 0
            goto L5c
        Lda:
            r7.LJIIJ = r6
            r7.LJIIJJI = r4
            goto L4a
        Le0:
            r7.LJIIJJI = r6
            r7.LJIIJ = r4
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JEG.LJIIIZ(X.Pro):void");
    }

    public final void LJIIIIZZ(int i, int i2) {
        int i3 = this.LJIIJ;
        int i4 = this.LJIIJJI;
        Rect rect = this.LIZLLL;
        int i5 = LJIJ;
        rect.set(i5, 0, (i3 - i) - i5, (((i4 - i2) - this.LJIILIIL) - this.LJIIL) - i5);
        Rect rect2 = this.LJ;
        Rect rect3 = this.LIZLLL;
        rect2.set(rect3.left - i, rect3.top, rect3.right + i, rect3.bottom);
    }
}
