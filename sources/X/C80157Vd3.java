package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.Vd3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80157Vd3 implements InterfaceC80159Vd5, InterfaceC80156Vd2, ValueAnimator.AnimatorUpdateListener {
    public View LJLIL;
    public final View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL = true;
    public boolean LJLJLJ = true;
    public C80158Vd4 LJLJLLL = new C80158Vd4();

    @Override // X.InterfaceC80159Vd5
    public boolean LIZ() {
        if (this.LJLJL && this.LJLJLLL.LIZIZ(this.LJLIL)) {
            return true;
        }
        return false;
    }

    public final void LJFF() {
        this.LJLJLLL.LIZIZ = null;
    }

    @Override // X.InterfaceC80159Vd5
    public boolean LJIILJJIL() {
        if (this.LJLJLJ && this.LJLJLLL.LIZ(this.LJLIL)) {
            return true;
        }
        return false;
    }

    public C80157Vd3(View view) {
        this.LJLJI = view;
        this.LJLILLLLZI = view;
        this.LJLIL = view;
    }

    @Override // X.InterfaceC80159Vd5
    public void LIZIZ(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.LJLIL.getLeft(), -this.LJLIL.getTop());
        View view = this.LJLJI;
        View view2 = this.LJLIL;
        if (view != view2) {
            this.LJLJI = LIZJ(view2, pointF, view);
        }
        if (this.LJLJI == this.LJLIL) {
            this.LJLJLLL.LIZ = null;
        } else {
            this.LJLJLLL.LIZ = pointF;
        }
    }

    public final C80157Vd3 LJ(int i) {
        View view = this.LJLJI;
        if (view != null && i != 0) {
            if (i < 0) {
                if (!view.canScrollVertically(1)) {
                    return null;
                }
            } else if (!this.LJLJI.canScrollVertically(-1)) {
                return null;
            }
            this.LJLJJLL = i;
            return this;
        }
        return null;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (intValue - this.LJLJJLL) * this.LJLJI.getScaleY();
            View view = this.LJLJI;
            if (view instanceof AbsListView) {
                ((AbsListView) view).scrollListBy((int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable unused) {
        }
        this.LJLJJLL = intValue;
    }

    public static View LIZJ(View view, PointF pointF, View view2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF2 = new PointF();
            while (childCount > 0) {
                childCount--;
                View childAt = viewGroup.getChildAt(childCount);
                if (InterpolatorC80153Vcz.LJ(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if ((childAt instanceof ViewPager) || !InterpolatorC80153Vcz.LIZLLL(childAt)) {
                        pointF.offset(pointF2.x, pointF2.y);
                        View LIZJ = LIZJ(childAt, pointF, view2);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return LIZJ;
                    }
                    return childAt;
                }
            }
        }
        return view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r7, int r8, int r9) {
        /*
            r6 = this;
            r4 = 0
            r2 = 0
            r5 = -1
            if (r8 == r5) goto L61
            android.view.View r0 = r6.LJLILLLLZI
            android.view.View r1 = r0.findViewById(r8)
            if (r1 == 0) goto L61
            if (r7 <= 0) goto L56
            float r0 = (float) r7
            r1.setTranslationY(r0)
            r3 = 1
        L14:
            if (r9 == r5) goto L4d
            android.view.View r0 = r6.LJLILLLLZI
            android.view.View r1 = r0.findViewById(r9)
            if (r1 == 0) goto L4d
            if (r7 >= 0) goto L42
            float r0 = (float) r7
            r1.setTranslationY(r0)
        L24:
            android.view.View r0 = r6.LJLILLLLZI
            r0.setTranslationY(r4)
        L29:
            android.view.View r1 = r6.LJLJJI
            if (r1 == 0) goto L35
            int r0 = java.lang.Math.max(r2, r7)
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L35:
            android.view.View r1 = r6.LJLJJL
            if (r1 == 0) goto L41
            int r0 = java.lang.Math.min(r2, r7)
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L41:
            return
        L42:
            float r0 = r1.getTranslationY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L4d
            r1.setTranslationY(r4)
        L4d:
            if (r3 != 0) goto L24
            android.view.View r1 = r6.LJLILLLLZI
            float r0 = (float) r7
            r1.setTranslationY(r0)
            goto L29
        L56:
            float r0 = r1.getTranslationY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L61
            r1.setTranslationY(r4)
        L61:
            r3 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80157Vd3.LIZLLL(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0051, code lost:
    
        if (r9 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C80165VdB r13, android.view.View r14, android.view.View r15) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80157Vd3.LJI(X.VdB, android.view.View, android.view.View):void");
    }
}
