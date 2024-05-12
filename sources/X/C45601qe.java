package X;

import Y.IDRunnableS85S0100000;
import Y.IDTListenerS67S0000000;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.1qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C45601qe extends ConstraintLayout implements InterfaceC43251mr {
    public static boolean LLJILLL;
    public C05Z LJLIL;
    public Interpolator LJLILLLLZI;
    public float LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public final HashMap<View, C267313d> LJLL;
    public long LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public long LJLLLL;
    public float LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public C05U LJZI;
    public int LJZL;
    public C05Q LL;
    public boolean LLD;
    public final C37561dg LLF;
    public final C1AA LLFF;
    public C13Q LLFFF;
    public int LLFII;
    public int LLFZ;
    public boolean LLI;
    public float LLIFFJFJJ;
    public float LLII;
    public long LLIIII;
    public float LLIIIILZ;
    public boolean LLIIIJ;
    public ArrayList<C1AB> LLIIIL;
    public ArrayList<C1AB> LLIIIZ;
    public ArrayList<C05U> LLIIJI;
    public int LLIIJLIL;
    public long LLIIL;
    public float LLIILII;
    public int LLIILZL;
    public float LLIIZ;
    public boolean LLIL;
    public int LLILII;
    public int LLILIL;
    public int LLILL;
    public int LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public final C13T LLILZIL;
    public boolean LLILZLL;
    public C05T LLIZ;
    public C05V LLIZLLLIL;
    public final C05R LLJ;
    public boolean LLJI;
    public final RectF LLJIJIL;
    public View LLJILJIL;
    public final ArrayList<Integer> LLJILJILJ;

    @Override // X.C1V0
    public final void LJIILL(View view, View view2, int i, int i2) {
    }

    @Override // X.C1V0
    public final void LJJ(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void LJJZ() {
        ArrayList<C05U> arrayList;
        if ((this.LJZI != null || ((arrayList = this.LLIIJI) != null && !arrayList.isEmpty())) && this.LLIIZ != this.LJLLJ) {
            if (this.LLIILZL != -1) {
                C05U c05u = this.LJZI;
                if (c05u != null) {
                    c05u.LIZLLL();
                }
                ArrayList<C05U> arrayList2 = this.LLIIJI;
                if (arrayList2 != null) {
                    Iterator<C05U> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().LIZLLL();
                    }
                }
            }
            this.LLIILZL = -1;
            this.LLIIZ = this.LJLLJ;
            C05U c05u2 = this.LJZI;
            if (c05u2 != null) {
                c05u2.LIZ();
            }
            ArrayList<C05U> arrayList3 = this.LLIIJI;
            if (arrayList3 != null) {
                Iterator<C05U> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
            }
        }
    }

    public final void LJJZZI() {
        int i;
        ArrayList<C05U> arrayList;
        if ((this.LJZI != null || ((arrayList = this.LLIIJI) != null && !arrayList.isEmpty())) && this.LLIILZL == -1) {
            this.LLIILZL = this.LJLJJL;
            if (!this.LLJILJILJ.isEmpty()) {
                i = ((Integer) ListProtector.get(this.LLJILJILJ, r1.size() - 1)).intValue();
            } else {
                i = -1;
            }
            int i2 = this.LJLJJL;
            if (i != i2 && i2 != -1) {
                this.LLJILJILJ.add(Integer.valueOf(i2));
            }
        }
        LJLIIL();
    }

    public final void LJLIIIL() {
        C05Y c05y;
        C017405a c017405a;
        View findViewById;
        View findViewById2;
        C05Z c05z = this.LJLIL;
        if (c05z == null) {
            return;
        }
        if (c05z.LIZ(this, this.LJLJJL)) {
            requestLayout();
            return;
        }
        int i = this.LJLJJL;
        View view = null;
        if (i != -1) {
            C05Z c05z2 = this.LJLIL;
            Iterator<C05Y> it = c05z2.LIZLLL.iterator();
            while (it.hasNext()) {
                C05Y next = it.next();
                if (next.LJIIL.size() > 0) {
                    Iterator<C05X> it2 = next.LJIIL.iterator();
                    while (it2.hasNext()) {
                        int i2 = it2.next().LJLILLLLZI;
                        if (i2 != -1 && (findViewById2 = findViewById(i2)) != null) {
                            C16880lQ.LJIIJ(null, findViewById2);
                        }
                    }
                }
            }
            Iterator<C05Y> it3 = c05z2.LJFF.iterator();
            while (it3.hasNext()) {
                C05Y next2 = it3.next();
                if (next2.LJIIL.size() > 0) {
                    Iterator<C05X> it4 = next2.LJIIL.iterator();
                    while (it4.hasNext()) {
                        int i3 = it4.next().LJLILLLLZI;
                        if (i3 != -1 && (findViewById = findViewById(i3)) != null) {
                            C16880lQ.LJIIJ(null, findViewById);
                        }
                    }
                }
            }
            Iterator<C05Y> it5 = c05z2.LIZLLL.iterator();
            while (it5.hasNext()) {
                C05Y next3 = it5.next();
                if (next3.LJIIL.size() > 0) {
                    Iterator<C05X> it6 = next3.LJIIL.iterator();
                    while (it6.hasNext()) {
                        it6.next().LIZ(this, i, next3);
                    }
                }
            }
            Iterator<C05Y> it7 = c05z2.LJFF.iterator();
            while (it7.hasNext()) {
                C05Y next4 = it7.next();
                if (next4.LJIIL.size() > 0) {
                    Iterator<C05X> it8 = next4.LJIIL.iterator();
                    while (it8.hasNext()) {
                        it8.next().LIZ(this, i, next4);
                    }
                }
            }
        }
        if (this.LJLIL.LJIIL() && (c05y = this.LJLIL.LIZJ) != null && (c017405a = c05y.LJIIJJI) != null) {
            int i4 = c017405a.LIZLLL;
            if (i4 != -1) {
                view = c017405a.LJIILJJIL.findViewById(i4);
            }
            if (view instanceof C45631qh) {
                C45631qh c45631qh = (C45631qh) view;
                c45631qh.setOnTouchListener(new IDTListenerS67S0000000(1));
                c45631qh.setOnScrollChangeListener(new C07G() { // from class: X.1f6
                    @Override // X.C07G
                    public final void LIZ(C45631qh c45631qh2, int i5, int i6, int i7, int i8) {
                    }
                });
            }
        }
    }

    public final void LJLIIL() {
        ArrayList<C05U> arrayList;
        if (this.LJZI == null && ((arrayList = this.LLIIJI) == null || arrayList.isEmpty())) {
            return;
        }
        Iterator<Integer> it = this.LLJILJILJ.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            C05U c05u = this.LJZI;
            if (c05u != null) {
                c05u.LIZIZ(next.intValue());
            }
            ArrayList<C05U> arrayList2 = this.LLIIJI;
            if (arrayList2 != null) {
                Iterator<C05U> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(next.intValue());
                }
            }
        }
        this.LLJILJILJ.clear();
    }

    public final void LJLIL() {
        this.LLJ.LJ();
        invalidate();
    }

    public int[] getConstraintSetIds() {
        C05Z c05z = this.LJLIL;
        if (c05z == null) {
            return null;
        }
        int size = c05z.LJI.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = c05z.LJI.keyAt(i);
        }
        return iArr;
    }

    public ArrayList<C05Y> getDefinedTransitions() {
        C05Z c05z = this.LJLIL;
        if (c05z == null) {
            return null;
        }
        return c05z.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.13Q] */
    public C13Q getDesignTool() {
        if (this.LLFFF == null) {
            this.LLFFF = new Object() { // from class: X.13Q
                static {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
                    hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
                    hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
                    hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
                    hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
                    hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
                    hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
                    hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
                    hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
                    hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
                    hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
                    hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
                    hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
                    hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
                    hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
                    hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
                    hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
                    hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
                    hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
                    hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
                    hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
                    hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
                    hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
                    hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
                    hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
                }
            };
        }
        return this.LLFFF;
    }

    public Bundle getTransitionState() {
        if (this.LLIZ == null) {
            this.LLIZ = new C05T(this);
        }
        C05T c05t = this.LLIZ;
        C45601qe c45601qe = c05t.LJ;
        c05t.LIZLLL = c45601qe.LJLJJLL;
        c05t.LIZJ = c45601qe.LJLJJI;
        c05t.LIZIZ = c45601qe.getVelocity();
        c05t.LIZ = c05t.LJ.getProgress();
        C05T c05t2 = this.LLIZ;
        c05t2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", c05t2.LIZ);
        bundle.putFloat("motion.velocity", c05t2.LIZIZ);
        bundle.putInt("motion.StartState", c05t2.LIZJ);
        bundle.putInt("motion.EndState", c05t2.LIZLLL);
        return bundle;
    }

    public long getTransitionTimeMs() {
        int i;
        C05Z c05z = this.LJLIL;
        if (c05z != null) {
            C05Y c05y = c05z.LIZJ;
            if (c05y != null) {
                i = c05y.LJII;
            } else {
                i = c05z.LJIIIZ;
            }
            this.LJLLILLLL = i / 1000.0f;
        }
        return this.LJLLILLLL * 1000.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        C05Z c05z;
        C05Y c05y;
        if (!this.LLIL && this.LJLJJL == -1 && (c05z = this.LJLIL) != null && (c05y = c05z.LIZJ) != null && c05y.LJIILLIIL == 0) {
            return;
        }
        super.requestLayout();
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C05Y c05y;
        int i;
        super.onAttachedToWindow();
        C05Z c05z = this.LJLIL;
        if (c05z != null && (i = this.LJLJJL) != -1) {
            AnonymousClass064 LIZIZ = c05z.LIZIZ(i);
            this.LJLIL.LJIIJ(this);
            if (LIZIZ != null) {
                LIZIZ.LIZIZ(this);
            }
            this.LJLJJI = this.LJLJJL;
        }
        LJLIIIL();
        C05T c05t = this.LLIZ;
        if (c05t != null) {
            c05t.LIZ();
            return;
        }
        C05Z c05z2 = this.LJLIL;
        if (c05z2 == null || (c05y = c05z2.LIZJ) == null || c05y.LJIILIIL != 4) {
            return;
        }
        LJJLJLI(1.0f);
        setState(C05V.SETUP);
        setState(C05V.MOVING);
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C13P.LIZ(this.LJLJJI, context));
        LIZ.append("->");
        LIZ.append(C13P.LIZ(this.LJLJJLL, context));
        LIZ.append(" (pos:");
        LIZ.append(this.LJLLL);
        LIZ.append(" Dpos/Dt:");
        LIZ.append(this.LJLJI);
        return X1D.LIZIZ(LIZ);
    }

    public int getCurrentState() {
        return this.LJLJJL;
    }

    public int getEndState() {
        return this.LJLJJLL;
    }

    public float getProgress() {
        return this.LJLLL;
    }

    public int getStartState() {
        return this.LJLJJI;
    }

    public float getTargetPosition() {
        return this.LJLLLLLL;
    }

    public float getVelocity() {
        return this.LJLJI;
    }

    public final void LJJLJLI(float f) {
        int i;
        C05Z c05z = this.LJLIL;
        if (c05z == null) {
            return;
        }
        float f2 = this.LJLLL;
        float f3 = this.LJLLJ;
        if (f2 != f3 && this.LJLZ) {
            this.LJLLL = f3;
        }
        float f4 = this.LJLLL;
        if (f4 == f) {
            return;
        }
        this.LLD = false;
        this.LJLLLLLL = f;
        C05Y c05y = c05z.LIZJ;
        if (c05y != null) {
            i = c05y.LJII;
        } else {
            i = c05z.LJIIIZ;
        }
        this.LJLLILLLL = i / 1000.0f;
        setProgress(f);
        this.LJLILLLLZI = this.LJLIL.LIZLLL();
        this.LJLZ = false;
        this.LJLLI = getNanoTime();
        this.LJZ = true;
        this.LJLLJ = f4;
        this.LJLLL = f4;
        invalidate();
    }

    public final void LJJLL(boolean z) {
        float f;
        boolean z2;
        boolean z3;
        int i;
        float interpolation;
        if (this.LJLLLL == -1) {
            this.LJLLLL = getNanoTime();
        }
        float f2 = this.LJLLL;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.LJLJJL = -1;
        }
        boolean z4 = true;
        boolean z5 = false;
        if (this.LLIIIJ || (this.LJZ && (z || this.LJLLLLLL != f2))) {
            float signum = Math.signum(this.LJLLLLLL - f2);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.LJLILLLLZI;
            if (!(interpolator instanceof AbstractInterpolatorC267413e)) {
                f = ((((float) (nanoTime - this.LJLLLL)) * signum) * 1.0E-9f) / this.LJLLILLLL;
                this.LJLJI = f;
            } else {
                f = 0.0f;
            }
            float f3 = this.LJLLL + f;
            if (this.LJLZ) {
                f3 = this.LJLLLLLL;
            }
            if ((signum > 0.0f && f3 >= this.LJLLLLLL) || (signum <= 0.0f && f3 <= this.LJLLLLLL)) {
                f3 = this.LJLLLLLL;
                this.LJZ = false;
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJLLL = f3;
            this.LJLLJ = f3;
            this.LJLLLL = nanoTime;
            if (interpolator != null && !z2) {
                if (this.LLD) {
                    interpolation = interpolator.getInterpolation(((float) (nanoTime - this.LJLLI)) * 1.0E-9f);
                    this.LJLLL = interpolation;
                    this.LJLLLL = nanoTime;
                    Interpolator interpolator2 = this.LJLILLLLZI;
                    if (interpolator2 instanceof AbstractInterpolatorC267413e) {
                        float LIZ = ((AbstractInterpolatorC267413e) interpolator2).LIZ();
                        this.LJLJI = LIZ;
                        if (Math.abs(LIZ) * this.LJLLILLLL <= 1.0E-5f) {
                            this.LJZ = false;
                        }
                        if (LIZ > 0.0f && interpolation >= 1.0f) {
                            this.LJLLL = 1.0f;
                            this.LJZ = false;
                            interpolation = 1.0f;
                        }
                        if (LIZ < 0.0f && interpolation <= 0.0f) {
                            this.LJLLL = 0.0f;
                            this.LJZ = false;
                            f3 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.LJLILLLLZI;
                    if (interpolator3 instanceof AbstractInterpolatorC267413e) {
                        this.LJLJI = ((AbstractInterpolatorC267413e) interpolator3).LIZ();
                    } else {
                        this.LJLJI = ((interpolator3.getInterpolation(f3 + f) - interpolation) * signum) / f;
                    }
                }
                f3 = interpolation;
            }
            if (Math.abs(this.LJLJI) > 1.0E-5f) {
                setState(C05V.MOVING);
            }
            if ((signum > 0.0f && f3 >= this.LJLLLLLL) || (signum <= 0.0f && f3 <= this.LJLLLLLL)) {
                f3 = this.LJLLLLLL;
                this.LJZ = false;
            }
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.LJZ = false;
                setState(C05V.FINISHED);
            }
            int childCount = getChildCount();
            this.LLIIIJ = false;
            long nanoTime2 = getNanoTime();
            this.LLILZ = f3;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C267313d c267313d = this.LJLL.get(childAt);
                if (c267313d != null) {
                    this.LLIIIJ = c267313d.LIZJ(f3, nanoTime2, childAt, this.LLILZIL) | this.LLIIIJ;
                }
            }
            if ((signum > 0.0f && f3 >= this.LJLLLLLL) || (signum <= 0.0f && f3 <= this.LJLLLLLL)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!this.LLIIIJ && !this.LJZ && z3) {
                setState(C05V.FINISHED);
            }
            if (this.LLIL) {
                requestLayout();
            }
            this.LLIIIJ = (!z3) | this.LLIIIJ;
            if (f3 <= 0.0f && (i = this.LJLJJI) != -1 && this.LJLJJL != i) {
                this.LJLJJL = i;
                this.LJLIL.LIZIZ(i).LIZ(this);
                setState(C05V.FINISHED);
                z5 = true;
            }
            if (f3 >= 1.0d) {
                int i3 = this.LJLJJL;
                int i4 = this.LJLJJLL;
                if (i3 != i4) {
                    this.LJLJJL = i4;
                    this.LJLIL.LIZIZ(i4).LIZ(this);
                    setState(C05V.FINISHED);
                    z5 = true;
                }
            }
            if (this.LLIIIJ || this.LJZ) {
                invalidate();
            } else if ((signum > 0.0f && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f)) {
                setState(C05V.FINISHED);
            }
            if ((!this.LLIIIJ && this.LJZ && signum > 0.0f && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f)) {
                LJLIIIL();
            }
        }
        float f4 = this.LJLLL;
        if (f4 >= 1.0f) {
            int i5 = this.LJLJJL;
            int i6 = this.LJLJJLL;
            if (i5 == i6) {
                z4 = z5;
            }
            this.LJLJJL = i6;
        } else {
            if (f4 <= 0.0f) {
                int i7 = this.LJLJJL;
                int i8 = this.LJLJJI;
                if (i7 == i8) {
                    z4 = z5;
                }
                this.LJLJJL = i8;
            }
            this.LLJI |= z5;
            if (z5 && !this.LLILZLL) {
                requestLayout();
            }
            this.LJLLJ = this.LJLLL;
        }
        z5 = z4;
        this.LLJI |= z5;
        if (z5) {
            requestLayout();
        }
        this.LJLLJ = this.LJLLL;
    }

    public final void LJLI(AttributeSet attributeSet) {
        C05Z c05z;
        C05Z c05z2;
        LLJILLL = isInEditMode();
        int i = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.w8, R.attr.a8n, R.attr.akw, R.attr.b1a, R.attr.b1d, R.attr.bat});
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = 2;
                if (index == 2) {
                    this.LJLIL = new C05Z(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.LJLJJL = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.LJLLLLLL = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.LJZ = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.LJZL == 0) {
                        if (!obtainStyledAttributes.getBoolean(index, false)) {
                            i3 = 0;
                        }
                        this.LJZL = i3;
                    }
                } else if (index == 3) {
                    this.LJZL = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                this.LJLIL = null;
            }
        }
        if (this.LJZL != 0 && (c05z2 = this.LJLIL) != null) {
            int LJI = c05z2.LJI();
            C05Z c05z3 = this.LJLIL;
            AnonymousClass064 LIZIZ = c05z3.LIZIZ(c05z3.LJI());
            C13P.LIZ(LJI, getContext());
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                int id = getChildAt(i4).getId();
                if (LIZIZ.LIZJ.containsKey(Integer.valueOf(id))) {
                    LIZIZ.LIZJ.get(Integer.valueOf(id));
                }
            }
            Integer[] numArr = (Integer[]) LIZIZ.LIZJ.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                iArr[i5] = numArr[i5].intValue();
            }
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = iArr[i6];
                C13P.LIZ(i7, getContext());
                findViewById(iArr[i6]);
                LIZIZ.LJIILL(i7);
                LIZIZ.LJIILL(i7);
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<C05Y> it = this.LJLIL.LIZLLL.iterator();
            while (it.hasNext()) {
                C05Y next = it.next();
                int i8 = next.LIZLLL;
                int i9 = next.LIZJ;
                C13P.LIZ(i8, getContext());
                C13P.LIZ(i9, getContext());
                sparseIntArray.get(i8);
                sparseIntArray2.get(i9);
                sparseIntArray.put(i8, i9);
                sparseIntArray2.put(i9, i8);
                this.LJLIL.LIZIZ(i8);
                this.LJLIL.LIZIZ(i9);
            }
        }
        if (this.LJLJJL == -1 && (c05z = this.LJLIL) != null) {
            this.LJLJJL = c05z.LJI();
            this.LJLJJI = this.LJLIL.LJI();
            C05Y c05y = this.LJLIL.LIZJ;
            if (c05y != null) {
                i = c05y.LIZJ;
            }
            this.LJLJJLL = i;
        }
    }

    public final void LJLJJL(int i) {
        int i2;
        float alpha;
        AnonymousClass069 anonymousClass069;
        if (!isAttachedToWindow()) {
            if (this.LLIZ == null) {
                this.LLIZ = new C05T(this);
            }
            this.LLIZ.LIZLLL = i;
            return;
        }
        C05Z c05z = this.LJLIL;
        if (c05z != null && (anonymousClass069 = c05z.LIZIZ) != null) {
            int i3 = this.LJLJJL;
            float f = -1;
            AnonymousClass067 anonymousClass067 = anonymousClass069.LIZIZ.get(i);
            if (anonymousClass067 == null) {
                i3 = i;
            } else if (f != -1.0f) {
                Iterator<AnonymousClass068> it = anonymousClass067.LIZIZ.iterator();
                AnonymousClass068 anonymousClass068 = null;
                while (true) {
                    if (it.hasNext()) {
                        AnonymousClass068 next = it.next();
                        if (next.LIZ(f, f)) {
                            if (i3 == next.LJ) {
                                break;
                            } else {
                                anonymousClass068 = next;
                            }
                        }
                    } else {
                        i3 = anonymousClass068 != null ? anonymousClass068.LJ : anonymousClass067.LIZJ;
                    }
                }
            } else if (anonymousClass067.LIZJ != i3) {
                Iterator<AnonymousClass068> it2 = anonymousClass067.LIZIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (i3 == it2.next().LJ) {
                            break;
                        }
                    } else {
                        i3 = anonymousClass067.LIZJ;
                        break;
                    }
                }
            }
            if (i3 != -1) {
                i = i3;
            }
        }
        int i4 = this.LJLJJL;
        if (i4 == i) {
            return;
        }
        if (this.LJLJJI == i) {
            LJJLJLI(0.0f);
            return;
        }
        if (this.LJLJJLL == i) {
            LJJLJLI(1.0f);
            return;
        }
        this.LJLJJLL = i;
        if (i4 != -1) {
            LJLILLLLZI(i4, i);
            LJJLJLI(1.0f);
            this.LJLLL = 0.0f;
            LJJLJLI(1.0f);
            return;
        }
        this.LLD = false;
        this.LJLLLLLL = 1.0f;
        this.LJLLJ = 0.0f;
        this.LJLLL = 0.0f;
        this.LJLLLL = getNanoTime();
        this.LJLLI = getNanoTime();
        this.LJLZ = false;
        this.LJLILLLLZI = null;
        C05Z c05z2 = this.LJLIL;
        C05Y c05y = c05z2.LIZJ;
        if (c05y != null) {
            i2 = c05y.LJII;
        } else {
            i2 = c05z2.LJIIIZ;
        }
        this.LJLLILLLL = i2 / 1000.0f;
        this.LJLJJI = -1;
        c05z2.LJIIJJI(-1, this.LJLJJLL);
        this.LJLIL.LJI();
        int childCount = getChildCount();
        this.LJLL.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            this.LJLL.put(childAt, new C267313d(childAt));
        }
        this.LJZ = true;
        this.LLJ.LIZLLL(null, this.LJLIL.LIZIZ(i));
        LJLIL();
        this.LLJ.LIZ();
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            C267313d c267313d = this.LJLL.get(childAt2);
            if (c267313d != null) {
                C267513f c267513f = c267313d.LIZLLL;
                c267513f.LJLJI = 0.0f;
                c267513f.LJLJJI = 0.0f;
                float x = childAt2.getX();
                float y = childAt2.getY();
                float width = childAt2.getWidth();
                float height = childAt2.getHeight();
                c267513f.LJLJJL = x;
                c267513f.LJLJJLL = y;
                c267513f.LJLJL = width;
                c267513f.LJLJLJ = height;
                C267213c c267213c = c267313d.LJFF;
                c267213c.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                c267213c.LJLJI = childAt2.getVisibility();
                if (childAt2.getVisibility() != 0) {
                    alpha = 0.0f;
                } else {
                    alpha = childAt2.getAlpha();
                }
                c267213c.LJLIL = alpha;
                c267213c.LJLJJI = childAt2.getElevation();
                c267213c.LJLJJL = childAt2.getRotation();
                c267213c.LJLJJLL = childAt2.getRotationX();
                c267213c.LJLJL = childAt2.getRotationY();
                c267213c.LJLJLJ = childAt2.getScaleX();
                c267213c.LJLJLLL = childAt2.getScaleY();
                c267213c.LJLL = childAt2.getPivotX();
                c267213c.LJLLI = childAt2.getPivotY();
                c267213c.LJLLILLLL = childAt2.getTranslationX();
                c267213c.LJLLJ = childAt2.getTranslationY();
                c267213c.LJLLL = childAt2.getTranslationZ();
            }
        }
        int width2 = getWidth();
        int height2 = getHeight();
        for (int i7 = 0; i7 < childCount; i7++) {
            C267313d c267313d2 = this.LJLL.get(getChildAt(i7));
            this.LJLIL.LJ(c267313d2);
            c267313d2.LJ(getNanoTime(), width2, height2);
        }
        C05Y c05y2 = this.LJLIL.LIZJ;
        if (c05y2 != null) {
            float f2 = c05y2.LJIIIIZZ;
            if (f2 != 0.0f) {
                float f3 = Float.MAX_VALUE;
                float f4 = -3.4028235E38f;
                for (int i8 = 0; i8 < childCount; i8++) {
                    C267513f c267513f2 = this.LJLL.get(getChildAt(i8)).LJ;
                    float f5 = c267513f2.LJLJJLL + c267513f2.LJLJJL;
                    f3 = Math.min(f3, f5);
                    f4 = Math.max(f4, f5);
                }
                for (int i9 = 0; i9 < childCount; i9++) {
                    C267313d c267313d3 = this.LJLL.get(getChildAt(i9));
                    C267513f c267513f3 = c267313d3.LJ;
                    float f6 = c267513f3.LJLJJL;
                    float f7 = c267513f3.LJLJJLL;
                    c267313d3.LJIIJJI = 1.0f / (1.0f - f2);
                    c267313d3.LJIIJ = f2 - ((((f6 + f7) - f3) * f2) / (f4 - f3));
                }
            }
        }
        this.LJLLJ = 0.0f;
        this.LJLLL = 0.0f;
        this.LJZ = true;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        AbstractC267613g abstractC267613g;
        AbstractC267613g abstractC267613g2;
        C13X c13x;
        C13X c13x2;
        String LIZIZ;
        char c = 0;
        LJJLL(false);
        super.dispatchDraw(canvas);
        if (this.LJLIL == null) {
            return;
        }
        if ((this.LJZL & 1) == 1 && !isInEditMode()) {
            this.LLIIJLIL++;
            long nanoTime = getNanoTime();
            long j = this.LLIIL;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.LLIILII = ((int) ((this.LLIIJLIL / (((float) r2) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.LLIIJLIL = 0;
                    this.LLIIL = nanoTime;
                }
            } else {
                this.LLIIL = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LLIILII);
            LIZ.append(" fps ");
            LIZ.append(C13P.LIZIZ(this, this.LJLJJI));
            LIZ.append(" -> ");
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ2);
            LIZ2.append(C13P.LIZIZ(this, this.LJLJJLL));
            LIZ2.append(" (progress: ");
            LIZ2.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            LIZ2.append(" ) state=");
            int i3 = this.LJLJJL;
            if (i3 == -1) {
                LIZIZ = "undefined";
            } else {
                LIZIZ = C13P.LIZIZ(this, i3);
            }
            LIZ2.append(LIZIZ);
            String LIZIZ3 = X1D.LIZIZ(LIZ2);
            paint.setColor(-16777216);
            canvas.drawText(LIZIZ3, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(LIZIZ3, 10.0f, getHeight() - 30, paint);
        }
        if (this.LJZL > 1) {
            if (this.LL == null) {
                this.LL = new C05Q(this);
            }
            C05Q c05q = this.LL;
            HashMap<View, C267313d> hashMap = this.LJLL;
            C05Z c05z = this.LJLIL;
            C05Y c05y = c05z.LIZJ;
            if (c05y != null) {
                i = c05y.LJII;
            } else {
                i = c05z.LJIIIZ;
            }
            int i4 = this.LJZL;
            c05q.getClass();
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            if (!c05q.LJIILIIL.isInEditMode() && (i4 & 1) == 2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(c05q.LJIILIIL.getContext().getResources().getResourceName(c05q.LJIILIIL.LJLJJLL));
                LIZ3.append(":");
                LIZ3.append(c05q.LJIILIIL.getProgress());
                String LIZIZ4 = X1D.LIZIZ(LIZ3);
                canvas.drawText(LIZIZ4, 10.0f, c05q.LJIILIIL.getHeight() - 30, c05q.LJII);
                canvas.drawText(LIZIZ4, 11.0f, c05q.LJIILIIL.getHeight() - 29, c05q.LJ);
            }
            for (C267313d c267313d : hashMap.values()) {
                int i5 = c267313d.LIZLLL.LJLILLLLZI;
                Iterator<C267513f> it = c267313d.LJIJ.iterator();
                while (it.hasNext()) {
                    i5 = Math.max(i5, it.next().LJLILLLLZI);
                }
                int max = Math.max(i5, c267313d.LJ.LJLILLLLZI);
                if (i4 > 0) {
                    if (max == 0) {
                        max = 1;
                    }
                } else if (max == 0) {
                }
                float[] fArr = c05q.LIZJ;
                int[] iArr = c05q.LIZIZ;
                if (fArr != null) {
                    double[] LJFF = c267313d.LJII[c].LJFF();
                    if (iArr != null) {
                        Iterator<C267513f> it2 = c267313d.LJIJ.iterator();
                        int i6 = 0;
                        while (it2.hasNext()) {
                            iArr[i6] = it2.next().LJLLILLLL;
                            i6++;
                        }
                    }
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < LJFF.length) {
                        c267313d.LJII[c].LIZJ(c267313d.LJIILIIL, LJFF[i7]);
                        c267313d.LIZLLL.LJ(c267313d.LJIIL, c267313d.LJIILIIL, fArr, i8);
                        i8 += 2;
                        i7++;
                        c = 0;
                    }
                    i2 = i8 / 2;
                } else {
                    i2 = 0;
                }
                c05q.LJIIJ = i2;
                if (max >= 1) {
                    int i9 = i / 16;
                    float[] fArr2 = c05q.LIZ;
                    if (fArr2 == null || fArr2.length != i9 * 2) {
                        c05q.LIZ = new float[i9 * 2];
                        c05q.LIZLLL = new Path();
                    }
                    float f = c05q.LJIIL;
                    canvas.translate(f, f);
                    c05q.LJ.setColor(1996488704);
                    c05q.LJIIIIZZ.setColor(1996488704);
                    c05q.LJFF.setColor(1996488704);
                    c05q.LJI.setColor(1996488704);
                    float[] fArr3 = c05q.LIZ;
                    float f2 = 1.0f / (i9 - 1);
                    HashMap<String, AbstractC267613g> hashMap2 = c267313d.LJIL;
                    if (hashMap2 == null) {
                        abstractC267613g = null;
                    } else {
                        abstractC267613g = hashMap2.get("translationX");
                    }
                    HashMap<String, AbstractC267613g> hashMap3 = c267313d.LJIL;
                    if (hashMap3 == null) {
                        abstractC267613g2 = null;
                    } else {
                        abstractC267613g2 = hashMap3.get("translationY");
                    }
                    HashMap<String, C13X> hashMap4 = c267313d.LJJ;
                    if (hashMap4 == null) {
                        c13x = null;
                    } else {
                        c13x = hashMap4.get("translationX");
                    }
                    HashMap<String, C13X> hashMap5 = c267313d.LJJ;
                    if (hashMap5 == null) {
                        c13x2 = null;
                    } else {
                        c13x2 = hashMap5.get("translationY");
                    }
                    int i10 = 0;
                    while (true) {
                        float f3 = 0.0f;
                        float f4 = Float.NaN;
                        if (i10 >= i9) {
                            break;
                        }
                        float f5 = i10 * f2;
                        float f6 = c267313d.LJIIJJI;
                        if (f6 != 1.0f) {
                            float f7 = c267313d.LJIIJ;
                            if (f5 < f7) {
                                f5 = 0.0f;
                            }
                            if (f5 > f7 && f5 < 1.0d) {
                                f5 = (f5 - f7) * f6;
                            }
                        }
                        double d = f5;
                        C11Y c11y = c267313d.LIZLLL.LJLIL;
                        Iterator<C267513f> it3 = c267313d.LJIJ.iterator();
                        while (it3.hasNext()) {
                            C267513f next = it3.next();
                            C11Y c11y2 = next.LJLIL;
                            if (c11y2 != null) {
                                float f8 = next.LJLJI;
                                if (f8 < f5) {
                                    f3 = f8;
                                    c11y = c11y2;
                                } else if (Float.isNaN(f4)) {
                                    f4 = next.LJLJI;
                                }
                            }
                        }
                        if (c11y != null) {
                            if (Float.isNaN(f4)) {
                                f4 = 1.0f;
                            }
                            d = (((float) c11y.LIZ((f5 - f3) / r16)) * (f4 - f3)) + f3;
                        }
                        c267313d.LJII[0].LIZJ(c267313d.LJIILIIL, d);
                        C37511db c37511db = c267313d.LJIIIIZZ;
                        if (c37511db != null) {
                            double[] dArr = c267313d.LJIILIIL;
                            if (dArr.length > 0) {
                                c37511db.LIZJ(dArr, d);
                            }
                        }
                        int i11 = i10 * 2;
                        c267313d.LIZLLL.LJ(c267313d.LJIIL, c267313d.LJIILIIL, fArr3, i11);
                        if (c13x != null) {
                            fArr3[i11] = c13x.LIZ(f5) + fArr3[i11];
                        } else if (abstractC267613g != null) {
                            fArr3[i11] = abstractC267613g.LIZ(f5) + fArr3[i11];
                        }
                        if (c13x2 != null) {
                            int i12 = i11 + 1;
                            fArr3[i12] = c13x2.LIZ(f5) + fArr3[i12];
                        } else if (abstractC267613g2 != null) {
                            int i13 = i11 + 1;
                            fArr3[i13] = abstractC267613g2.LIZ(f5) + fArr3[i13];
                        }
                        i10++;
                    }
                    c05q.LIZ(canvas, max, c05q.LJIIJ, c267313d);
                    c05q.LJ.setColor(-21965);
                    c05q.LJFF.setColor(-2067046);
                    c05q.LJIIIIZZ.setColor(-2067046);
                    c05q.LJI.setColor(-13391360);
                    float f9 = -c05q.LJIIL;
                    canvas.translate(f9, f9);
                    c05q.LIZ(canvas, max, c05q.LJIIJ, c267313d);
                    if (max == 5) {
                        c05q.LIZLLL.reset();
                        for (int i14 = 0; i14 <= 50; i14++) {
                            float[] fArr4 = c05q.LJIIIZ;
                            c267313d.LJII[0].LIZJ(c267313d.LJIILIIL, c267313d.LIZ(null, i14 / 50));
                            C267513f c267513f = c267313d.LIZLLL;
                            int[] iArr2 = c267313d.LJIIL;
                            double[] dArr2 = c267313d.LJIILIIL;
                            float f10 = c267513f.LJLJJL;
                            float f11 = c267513f.LJLJJLL;
                            float f12 = c267513f.LJLJL;
                            float f13 = c267513f.LJLJLJ;
                            for (int i15 = 0; i15 < iArr2.length; i15++) {
                                float f14 = (float) dArr2[i15];
                                int i16 = iArr2[i15];
                                if (i16 != 1) {
                                    if (i16 != 2) {
                                        if (i16 != 3) {
                                            if (i16 == 4) {
                                                f13 = f14;
                                            }
                                        } else {
                                            f12 = f14;
                                        }
                                    } else {
                                        f11 = f14;
                                    }
                                } else {
                                    f10 = f14;
                                }
                            }
                            float f15 = f12 + f10;
                            float f16 = f13 + f11;
                            Float.isNaN(Float.NaN);
                            Float.isNaN(Float.NaN);
                            float f17 = f10 + 0.0f;
                            float f18 = f11 + 0.0f;
                            float f19 = f15 + 0.0f;
                            float f20 = f16 + 0.0f;
                            fArr4[0] = f17;
                            fArr4[1] = f18;
                            fArr4[2] = f19;
                            fArr4[3] = f18;
                            fArr4[4] = f19;
                            fArr4[5] = f20;
                            fArr4[6] = f17;
                            fArr4[7] = f20;
                            Path path = c05q.LIZLLL;
                            float[] fArr5 = c05q.LJIIIZ;
                            path.moveTo(fArr5[0], fArr5[1]);
                            Path path2 = c05q.LIZLLL;
                            float[] fArr6 = c05q.LJIIIZ;
                            path2.lineTo(fArr6[2], fArr6[3]);
                            Path path3 = c05q.LIZLLL;
                            float[] fArr7 = c05q.LJIIIZ;
                            path3.lineTo(fArr7[4], fArr7[5]);
                            Path path4 = c05q.LIZLLL;
                            float[] fArr8 = c05q.LJIIIZ;
                            path4.lineTo(fArr8[6], fArr8[7]);
                            c05q.LIZLLL.close();
                        }
                        c05q.LJ.setColor(1140850688);
                        canvas.translate(2.0f, 2.0f);
                        canvas.drawPath(c05q.LIZLLL, c05q.LJ);
                        canvas.translate(-2.0f, -2.0f);
                        c05q.LJ.setColor(-65536);
                        canvas.drawPath(c05q.LIZLLL, c05q.LJ);
                    }
                }
                c = 0;
            }
            canvas.restore();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i) {
        C017405a c017405a;
        if (i != 0) {
            try {
                this.LJLIL = new C05Z(getContext(), this, i);
                if (isAttachedToWindow()) {
                    this.LJLIL.LJIIJ(this);
                    this.LLJ.LIZLLL(this.LJLIL.LIZIZ(this.LJLJJI), this.LJLIL.LIZIZ(this.LJLJJLL));
                    LJLIL();
                    C05Z c05z = this.LJLIL;
                    boolean isRtl = isRtl();
                    c05z.LJIILL = isRtl;
                    C05Y c05y = c05z.LIZJ;
                    if (c05y != null && (c017405a = c05y.LJIIJJI) != null) {
                        c017405a.LIZIZ(isRtl);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        }
        this.LJLIL = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C05Y c05y;
        C017405a c017405a;
        int i;
        RectF LIZ;
        C05Z c05z = this.LJLIL;
        if (c05z != null && this.LJLJLLL && (c05y = c05z.LIZJ) != null && (!c05y.LJIILJJIL) && (c017405a = c05y.LJIIJJI) != null && ((motionEvent.getAction() != 0 || (LIZ = c017405a.LIZ(this, new RectF())) == null || LIZ.contains(motionEvent.getX(), motionEvent.getY())) && (i = c017405a.LJ) != -1)) {
            View view = this.LLJILJIL;
            if (view == null || view.getId() != i) {
                this.LLJILJIL = findViewById(i);
            }
            if (this.LLJILJIL != null) {
                this.LLJIJIL.set(r0.getLeft(), this.LLJILJIL.getTop(), this.LLJILJIL.getRight(), this.LLJILJIL.getBottom());
                if (this.LLJIJIL.contains(motionEvent.getX(), motionEvent.getY()) && !LJL(0.0f, 0.0f, this.LLJILJIL, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        C017405a c017405a;
        C05Z c05z = this.LJLIL;
        if (c05z != null) {
            boolean isRtl = isRtl();
            c05z.LJIILL = isRtl;
            C05Y c05y = c05z.LIZJ;
            if (c05y != null && (c017405a = c05y.LJIIJJI) != null) {
                c017405a.LIZIZ(isRtl);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C05S c05s;
        C05S c05s2;
        C017405a c017405a;
        float f;
        float f2;
        char c;
        char c2;
        float f3;
        float f4;
        int i;
        float f5;
        char c3;
        char c4;
        char c5;
        char c6;
        float f6;
        float f7;
        float f8;
        float f9;
        View findViewById;
        MotionEvent motionEvent2;
        C05Y c05y;
        boolean z;
        int i2;
        C017405a c017405a2;
        float f10;
        C05Z c05z = this.LJLIL;
        if (c05z != null && this.LJLJLLL && c05z.LJIIL()) {
            C05Z c05z2 = this.LJLIL;
            if (c05z2.LIZJ != null && !(!r0.LJIILJJIL)) {
                return super.onTouchEvent(motionEvent);
            }
            int currentState = getCurrentState();
            RectF rectF = new RectF();
            if (c05z2.LJIILJJIL == null) {
                c05z2.LIZ.getClass();
                C05S c05s3 = C05S.LIZIZ;
                c05s3.LIZ = VelocityTracker.obtain();
                c05z2.LJIILJJIL = c05s3;
            }
            VelocityTracker velocityTracker = c05z2.LJIILJJIL.LIZ;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (currentState != -1) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 2 && !c05z2.LJIIL) {
                        float rawY = motionEvent.getRawY() - c05z2.LJIIZILJ;
                        float rawX = motionEvent.getRawX() - c05z2.LJIILLIIL;
                        if ((rawX != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || rawY != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) && (motionEvent2 = c05z2.LJIIJJI) != null) {
                            if (currentState != -1) {
                                AnonymousClass069 anonymousClass069 = c05z2.LIZIZ;
                                if (anonymousClass069 == null || (i2 = anonymousClass069.LIZ(currentState)) == -1) {
                                    i2 = currentState;
                                }
                                ArrayList arrayList = new ArrayList();
                                Iterator<C05Y> it = c05z2.LIZLLL.iterator();
                                while (it.hasNext()) {
                                    C05Y next = it.next();
                                    if (next.LIZLLL == i2 || next.LIZJ == i2) {
                                        arrayList.add(next);
                                    }
                                }
                                RectF rectF2 = new RectF();
                                Iterator it2 = arrayList.iterator();
                                float f11 = 0.0f;
                                c05y = null;
                                while (it2.hasNext()) {
                                    C05Y c05y2 = (C05Y) it2.next();
                                    if (!c05y2.LJIILJJIL && (c017405a2 = c05y2.LJIIJJI) != null) {
                                        c017405a2.LIZIZ(c05z2.LJIILL);
                                        RectF LIZ = c05y2.LJIIJJI.LIZ(c05z2.LIZ, rectF2);
                                        if (LIZ == null || LIZ.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                            RectF LIZ2 = c05y2.LJIIJJI.LIZ(c05z2.LIZ, rectF2);
                                            if (LIZ2 == null || LIZ2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                                C017405a c017405a3 = c05y2.LJIIJJI;
                                                float f12 = (c017405a3.LJIIIZ * rawY) + (c017405a3.LJIIIIZZ * rawX);
                                                if (c05y2.LIZJ == currentState) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = 1.1f;
                                                }
                                                float f13 = f12 * f10;
                                                if (f13 > f11) {
                                                    f11 = f13;
                                                    c05y = c05y2;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                c05y = c05z2.LIZJ;
                            }
                            if (c05y != null) {
                                setTransition(c05y);
                                RectF LIZ3 = c05z2.LIZJ.LJIIJJI.LIZ(c05z2.LIZ, rectF);
                                if (LIZ3 != null && !LIZ3.contains(c05z2.LJIIJJI.getX(), c05z2.LJIIJJI.getY())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c05z2.LJIILIIL = z;
                                C017405a c017405a4 = c05z2.LIZJ.LJIIJJI;
                                float f14 = c05z2.LJIILLIIL;
                                float f15 = c05z2.LJIIZILJ;
                                c017405a4.LJIIL = f14;
                                c017405a4.LJIILIIL = f15;
                                c017405a4.LJIIJ = false;
                            }
                        }
                    }
                } else {
                    c05z2.LJIILLIIL = motionEvent.getRawX();
                    c05z2.LJIIZILJ = motionEvent.getRawY();
                    c05z2.LJIIJJI = motionEvent;
                    c05z2.LJIIL = false;
                    C017405a c017405a5 = c05z2.LIZJ.LJIIJJI;
                    if (c017405a5 != null) {
                        C45601qe c45601qe = c05z2.LIZ;
                        int i3 = c017405a5.LJFF;
                        if (i3 != -1 && (findViewById = c45601qe.findViewById(i3)) != null) {
                            rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
                            if (!rectF.contains(c05z2.LJIIJJI.getX(), c05z2.LJIIJJI.getY())) {
                                c05z2.LJIIJJI = null;
                                c05z2.LJIIL = true;
                                return true;
                            }
                        }
                        RectF LIZ4 = c05z2.LIZJ.LJIIJJI.LIZ(c05z2.LIZ, rectF);
                        if (LIZ4 != null && !LIZ4.contains(c05z2.LJIIJJI.getX(), c05z2.LJIIJJI.getY())) {
                            c05z2.LJIILIIL = true;
                        } else {
                            c05z2.LJIILIIL = false;
                        }
                        C017405a c017405a6 = c05z2.LIZJ.LJIIJJI;
                        float f16 = c05z2.LJIILLIIL;
                        float f17 = c05z2.LJIIZILJ;
                        c017405a6.LJIIL = f16;
                        c017405a6.LJIILIIL = f17;
                    }
                }
                return true;
            }
            if (!c05z2.LJIIL) {
                C05Y c05y3 = c05z2.LIZJ;
                if (c05y3 != null && (c017405a = c05y3.LJIIJJI) != null && !c05z2.LJIILIIL) {
                    C05S c05s4 = c05z2.LJIILJJIL;
                    VelocityTracker velocityTracker2 = c05s4.LIZ;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        if (action2 != 1) {
                            if (action2 == 2) {
                                float rawY2 = motionEvent.getRawY() - c017405a.LJIILIIL;
                                float rawX2 = motionEvent.getRawX() - c017405a.LJIIL;
                                if (Math.abs((c017405a.LJIIIZ * rawY2) + (c017405a.LJIIIIZZ * rawX2)) > c017405a.LJIJJ || c017405a.LJIIJ) {
                                    float progress = c017405a.LJIILJJIL.getProgress();
                                    if (!c017405a.LJIIJ) {
                                        c017405a.LJIIJ = true;
                                        c017405a.LJIILJJIL.setProgress(progress);
                                    }
                                    int i4 = c017405a.LIZLLL;
                                    if (i4 != -1) {
                                        c017405a.LJIILJJIL.LJJZZIII(progress, c017405a.LJII, c017405a.LJI, i4, c017405a.LJIIJJI);
                                        c4 = 0;
                                        c3 = 1;
                                    } else {
                                        float min = Math.min(c017405a.LJIILJJIL.getWidth(), c017405a.LJIILJJIL.getHeight());
                                        float[] fArr = c017405a.LJIIJJI;
                                        c3 = 1;
                                        fArr[1] = c017405a.LJIIIZ * min;
                                        c4 = 0;
                                        fArr[0] = min * c017405a.LJIIIIZZ;
                                    }
                                    float f18 = c017405a.LJIIIIZZ;
                                    float[] fArr2 = c017405a.LJIIJJI;
                                    if (Math.abs(((c017405a.LJIIIZ * fArr2[c3]) + (f18 * fArr2[c4])) * c017405a.LJIJ) < 0.01d) {
                                        float[] fArr3 = c017405a.LJIIJJI;
                                        c5 = 0;
                                        fArr3[0] = 0.01f;
                                        c6 = 1;
                                        fArr3[1] = 0.01f;
                                    } else {
                                        c5 = 0;
                                        c6 = 1;
                                    }
                                    if (c017405a.LJIIIIZZ != 0.0f) {
                                        f6 = rawX2 / c017405a.LJIIJJI[c5];
                                    } else {
                                        f6 = rawY2 / c017405a.LJIIJJI[c6];
                                    }
                                    float max = Math.max(Math.min(progress + f6, 1.0f), 0.0f);
                                    if (max != c017405a.LJIILJJIL.getProgress()) {
                                        c017405a.LJIILJJIL.setProgress(max);
                                        VelocityTracker velocityTracker3 = c05s4.LIZ;
                                        if (velocityTracker3 != null) {
                                            velocityTracker3.computeCurrentVelocity(1000);
                                        }
                                        VelocityTracker velocityTracker4 = c05s4.LIZ;
                                        if (velocityTracker4 != null) {
                                            f7 = velocityTracker4.getXVelocity();
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        VelocityTracker velocityTracker5 = c05s4.LIZ;
                                        if (velocityTracker5 != null) {
                                            f8 = velocityTracker5.getYVelocity();
                                        } else {
                                            f8 = 0.0f;
                                        }
                                        if (c017405a.LJIIIIZZ != 0.0f) {
                                            f9 = f7 / c017405a.LJIIJJI[c5];
                                        } else {
                                            f9 = f8 / c017405a.LJIIJJI[c6];
                                        }
                                        c017405a.LJIILJJIL.LJLJI = f9;
                                    } else {
                                        c017405a.LJIILJJIL.LJLJI = 0.0f;
                                    }
                                    c017405a.LJIIL = motionEvent.getRawX();
                                    c017405a.LJIILIIL = motionEvent.getRawY();
                                }
                            }
                        } else {
                            c017405a.LJIIJ = false;
                            VelocityTracker velocityTracker6 = c05s4.LIZ;
                            if (velocityTracker6 != null) {
                                velocityTracker6.computeCurrentVelocity(1000);
                            }
                            VelocityTracker velocityTracker7 = c05s4.LIZ;
                            if (velocityTracker7 != null) {
                                f = velocityTracker7.getXVelocity();
                            } else {
                                f = 0.0f;
                            }
                            VelocityTracker velocityTracker8 = c05s4.LIZ;
                            if (velocityTracker8 != null) {
                                f2 = velocityTracker8.getYVelocity();
                            } else {
                                f2 = 0.0f;
                            }
                            float progress2 = c017405a.LJIILJJIL.getProgress();
                            int i5 = c017405a.LIZLLL;
                            if (i5 != -1) {
                                c017405a.LJIILJJIL.LJJZZIII(progress2, c017405a.LJII, c017405a.LJI, i5, c017405a.LJIIJJI);
                                c2 = 0;
                                c = 1;
                            } else {
                                float min2 = Math.min(c017405a.LJIILJJIL.getWidth(), c017405a.LJIILJJIL.getHeight());
                                float[] fArr4 = c017405a.LJIIJJI;
                                c = 1;
                                fArr4[1] = c017405a.LJIIIZ * min2;
                                c2 = 0;
                                fArr4[0] = min2 * c017405a.LJIIIIZZ;
                            }
                            float f19 = c017405a.LJIIIIZZ;
                            float[] fArr5 = c017405a.LJIIJJI;
                            float f20 = fArr5[c2];
                            float f21 = fArr5[c];
                            if (f19 != 0.0f) {
                                f3 = f / f20;
                            } else {
                                f3 = f2 / f21;
                            }
                            if (!Float.isNaN(f3)) {
                                f4 = (f3 / 3.0f) + progress2;
                            } else {
                                f4 = progress2;
                            }
                            if (f4 != 0.0f && f4 != 1.0f && (i = c017405a.LIZJ) != 3) {
                                C45601qe c45601qe2 = c017405a.LJIILJJIL;
                                if (f4 < 0.5d) {
                                    f5 = 0.0f;
                                } else {
                                    f5 = 1.0f;
                                }
                                c45601qe2.LJLJI(f5, f3, i);
                                if (0.0f >= progress2 || 1.0f <= progress2) {
                                    c017405a.LJIILJJIL.setState(C05V.FINISHED);
                                }
                            } else if (0.0f >= f4 || 1.0f <= f4) {
                                c017405a.LJIILJJIL.setState(C05V.FINISHED);
                            }
                        }
                    } else {
                        c017405a.LJIIL = motionEvent.getRawX();
                        c017405a.LJIILIIL = motionEvent.getRawY();
                        c017405a.LJIIJ = false;
                    }
                }
                c05z2.LJIILLIIL = motionEvent.getRawX();
                c05z2.LJIIZILJ = motionEvent.getRawY();
                if (motionEvent.getAction() == 1 && (c05s = c05z2.LJIILJJIL) != null) {
                    VelocityTracker velocityTracker9 = c05s.LIZ;
                    if (velocityTracker9 != null) {
                        velocityTracker9.recycle();
                        c05s2 = null;
                        c05s.LIZ = null;
                    } else {
                        c05s2 = null;
                    }
                    c05z2.LJIILJJIL = c05s2;
                    int i6 = this.LJLJJL;
                    if (i6 != -1) {
                        c05z2.LIZ(this, i6);
                    }
                }
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C1AB) {
            C1AB c1ab = (C1AB) view;
            if (this.LLIIJI == null) {
                this.LLIIJI = new ArrayList<>();
            }
            this.LLIIJI.add(c1ab);
            if (c1ab.LJLIL) {
                if (this.LLIIIL == null) {
                    this.LLIIIL = new ArrayList<>();
                }
                this.LLIIIL.add(c1ab);
            }
            if (c1ab.LJLILLLLZI) {
                if (this.LLIIIZ == null) {
                    this.LLIIIZ = new ArrayList<>();
                }
                this.LLIIIZ.add(c1ab);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C1AB> arrayList = this.LLIIIL;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C1AB> arrayList2 = this.LLIIIZ;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    public void setDebugMode(int i) {
        this.LJZL = i;
        invalidate();
    }

    public void setInteractionEnabled(boolean z) {
        this.LJLJLLL = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.LJLIL != null) {
            setState(C05V.MOVING);
            Interpolator LIZLLL = this.LJLIL.LIZLLL();
            if (LIZLLL != null) {
                setProgress(LIZLLL.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<C1AB> arrayList = this.LLIIIZ;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1AB) ListProtector.get(this.LLIIIZ, i)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<C1AB> arrayList = this.LLIIIL;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1AB) ListProtector.get(this.LLIIIL, i)).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (!isAttachedToWindow()) {
            if (this.LLIZ == null) {
                this.LLIZ = new C05T(this);
            }
            this.LLIZ.LIZ = f;
            return;
        }
        if (f <= 0.0f) {
            this.LJLJJL = this.LJLJJI;
            if (this.LJLLL == 0.0f) {
                setState(C05V.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.LJLJJL = this.LJLJJLL;
            if (this.LJLLL == 1.0f) {
                setState(C05V.FINISHED);
            }
        } else {
            this.LJLJJL = -1;
            setState(C05V.MOVING);
        }
        if (this.LJLIL == null) {
            return;
        }
        this.LJLZ = true;
        this.LJLLLLLL = f;
        this.LJLLJ = f;
        this.LJLLLL = -1L;
        this.LJLLI = -1L;
        this.LJLILLLLZI = null;
        this.LJZ = true;
        invalidate();
    }

    public void setScene(C05Z c05z) {
        C017405a c017405a;
        this.LJLIL = c05z;
        boolean isRtl = isRtl();
        c05z.LJIILL = isRtl;
        C05Y c05y = c05z.LIZJ;
        if (c05y != null && (c017405a = c05y.LJIIJJI) != null) {
            c017405a.LIZIZ(isRtl);
        }
        LJLIL();
    }

    public void setState(C05V c05v) {
        C05V c05v2 = C05V.FINISHED;
        if (c05v == c05v2 && this.LJLJJL == -1) {
            return;
        }
        C05V c05v3 = this.LLIZLLLIL;
        this.LLIZLLLIL = c05v;
        C05V c05v4 = C05V.MOVING;
        if (c05v3 == c05v4 && c05v == c05v4) {
            LJJZ();
        }
        int ordinal = c05v3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2 || c05v != c05v2) {
                return;
            }
            LJJZZI();
            return;
        }
        if (c05v == c05v4) {
            LJJZ();
        }
        if (c05v != c05v2) {
            return;
        }
        LJJZZI();
    }

    public void setTransition(int i) {
        C05Y c05y;
        float f;
        float f2;
        C05Z c05z = this.LJLIL;
        if (c05z != null) {
            Iterator<C05Y> it = c05z.LIZLLL.iterator();
            while (true) {
                if (it.hasNext()) {
                    c05y = it.next();
                    if (c05y.LIZ == i) {
                        break;
                    }
                } else {
                    c05y = null;
                    break;
                }
            }
            this.LJLJJI = c05y.LIZLLL;
            this.LJLJJLL = c05y.LIZJ;
            if (!isAttachedToWindow()) {
                if (this.LLIZ == null) {
                    this.LLIZ = new C05T(this);
                }
                C05T c05t = this.LLIZ;
                c05t.LIZJ = this.LJLJJI;
                c05t.LIZLLL = this.LJLJJLL;
                return;
            }
            int i2 = this.LJLJJL;
            if (i2 == this.LJLJJI) {
                f = 0.0f;
            } else if (i2 == this.LJLJJLL) {
                f = 1.0f;
            } else {
                f = Float.NaN;
            }
            C05Z c05z2 = this.LJLIL;
            c05z2.LIZJ = c05y;
            C017405a c017405a = c05y.LJIIJJI;
            if (c017405a != null) {
                c017405a.LIZIZ(c05z2.LJIILL);
            }
            this.LLJ.LIZLLL(this.LJLIL.LIZIZ(this.LJLJJI), this.LJLIL.LIZIZ(this.LJLJJLL));
            LJLIL();
            if (Float.isNaN(f)) {
                f2 = 0.0f;
            } else {
                f2 = f;
            }
            this.LJLLL = f2;
            if (Float.isNaN(f)) {
                LJJLJLI(0.0f);
            } else {
                setProgress(f);
            }
        }
    }

    public void setTransitionDuration(int i) {
        C05Z c05z = this.LJLIL;
        if (c05z == null) {
            return;
        }
        C05Y c05y = c05z.LIZJ;
        if (c05y != null) {
            c05y.LJII = i;
        } else {
            c05z.LJIIIZ = i;
        }
    }

    public void setTransitionListener(C05U c05u) {
        this.LJZI = c05u;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.LLIZ == null) {
            this.LLIZ = new C05T(this);
        }
        C05T c05t = this.LLIZ;
        c05t.getClass();
        c05t.LIZ = bundle.getFloat("motion.progress");
        c05t.LIZIZ = bundle.getFloat("motion.velocity");
        c05t.LIZJ = bundle.getInt("motion.StartState");
        c05t.LIZLLL = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.LLIZ.LIZ();
        }
    }

    public void setTransition(C05Y c05y) {
        int i;
        long nanoTime;
        C017405a c017405a;
        C05Z c05z = this.LJLIL;
        c05z.LIZJ = c05y;
        if (c05y != null && (c017405a = c05y.LJIIJJI) != null) {
            c017405a.LIZIZ(c05z.LJIILL);
        }
        setState(C05V.SETUP);
        int i2 = this.LJLJJL;
        C05Y c05y2 = this.LJLIL.LIZJ;
        int i3 = -1;
        if (c05y2 == null) {
            i = -1;
        } else {
            i = c05y2.LIZJ;
        }
        if (i2 == i) {
            this.LJLLL = 1.0f;
            this.LJLLJ = 1.0f;
            this.LJLLLLLL = 1.0f;
        } else {
            this.LJLLL = 0.0f;
            this.LJLLJ = 0.0f;
            this.LJLLLLLL = 0.0f;
        }
        if ((c05y.LJIIZILJ & 1) != 0) {
            nanoTime = -1;
        } else {
            nanoTime = getNanoTime();
        }
        this.LJLLLL = nanoTime;
        int LJI = this.LJLIL.LJI();
        C05Z c05z2 = this.LJLIL;
        C05Y c05y3 = c05z2.LIZJ;
        if (c05y3 != null) {
            i3 = c05y3.LIZJ;
        }
        if (LJI == this.LJLJJI && i3 == this.LJLJJLL) {
            return;
        }
        this.LJLJJI = LJI;
        this.LJLJJLL = i3;
        c05z2.LJIIJJI(LJI, i3);
        this.LLJ.LIZLLL(this.LJLIL.LIZIZ(this.LJLJJI), this.LJLIL.LIZIZ(this.LJLJJLL));
        C05R c05r = this.LLJ;
        int i4 = this.LJLJJI;
        int i5 = this.LJLJJLL;
        c05r.LJ = i4;
        c05r.LJFF = i5;
        c05r.LJ();
        LJLIL();
    }

    public C45601qe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJI = -1;
        this.LJLJJL = -1;
        this.LJLJJLL = -1;
        this.LJLJLLL = true;
        this.LJLL = new HashMap<>();
        this.LJLLI = 0L;
        this.LJLLILLLL = 1.0f;
        this.LJLLJ = 0.0f;
        this.LJLLL = 0.0f;
        this.LJLLLLLL = 0.0f;
        this.LJZ = false;
        this.LJZL = 0;
        this.LLD = false;
        this.LLF = new C37561dg();
        this.LLFF = new C1AA(this);
        this.LLI = false;
        this.LLIIIJ = false;
        this.LLIIIL = null;
        this.LLIIIZ = null;
        this.LLIIJI = null;
        this.LLIIJLIL = 0;
        this.LLIIL = -1L;
        this.LLIILII = 0.0f;
        this.LLIILZL = 0;
        this.LLIIZ = 0.0f;
        this.LLIL = false;
        this.LLILZIL = new C13T(0);
        this.LLILZLL = false;
        this.LLIZLLLIL = C05V.UNDEFINED;
        this.LLJ = new C05R(this);
        this.LLJI = false;
        this.LLJIJIL = new RectF();
        this.LLJILJIL = null;
        this.LLJILJILJ = new ArrayList<>();
        LJLI(attributeSet);
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View view) {
        C017405a c017405a;
        float f;
        boolean z;
        C05Z c05z = this.LJLIL;
        if (c05z == null) {
            return;
        }
        float f2 = this.LLIFFJFJJ;
        float f3 = this.LLIIIILZ;
        float f4 = f2 / f3;
        float f5 = this.LLII / f3;
        C05Y c05y = c05z.LIZJ;
        if (c05y != null && (c017405a = c05y.LJIIJJI) != null) {
            boolean z2 = false;
            c017405a.LJIIJ = false;
            float progress = c017405a.LJIILJJIL.getProgress();
            c017405a.LJIILJJIL.LJJZZIII(progress, c017405a.LJII, c017405a.LJI, c017405a.LIZLLL, c017405a.LJIIJJI);
            float f6 = c017405a.LJIIIIZZ;
            float[] fArr = c017405a.LJIIJJI;
            float f7 = fArr[0];
            float f8 = c017405a.LJIIIZ;
            float f9 = fArr[1];
            float f10 = 0.0f;
            if (f6 != 0.0f) {
                f = (f4 * f6) / f7;
            } else {
                f = (f5 * f8) / f9;
            }
            if (!Float.isNaN(f)) {
                progress += f / 3.0f;
            }
            if (progress != 0.0f) {
                if (progress != 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = c017405a.LIZJ;
                if (i2 != 3) {
                    z2 = true;
                }
                if (z2 & z) {
                    C45601qe c45601qe = c017405a.LJIILJJIL;
                    if (progress >= 0.5d) {
                        f10 = 1.0f;
                    }
                    c45601qe.LJLJI(f10, f, i2);
                }
            }
        }
    }

    public final void LJLILLLLZI(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.LLIZ == null) {
                this.LLIZ = new C05T(this);
            }
            C05T c05t = this.LLIZ;
            c05t.LIZJ = i;
            c05t.LIZLLL = i2;
            return;
        }
        C05Z c05z = this.LJLIL;
        if (c05z != null) {
            this.LJLJJI = i;
            this.LJLJJLL = i2;
            c05z.LJIIJJI(i, i2);
            this.LLJ.LIZLLL(this.LJLIL.LIZIZ(i), this.LJLIL.LIZIZ(i2));
            LJLIL();
            this.LJLLL = 0.0f;
            LJJLJLI(0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r4 == r1.LJFF) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45601qe.onMeasure(int, int):void");
    }

    public C45601qe(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJJI = -1;
        this.LJLJJL = -1;
        this.LJLJJLL = -1;
        this.LJLJLLL = true;
        this.LJLL = new HashMap<>();
        this.LJLLI = 0L;
        this.LJLLILLLL = 1.0f;
        this.LJLLJ = 0.0f;
        this.LJLLL = 0.0f;
        this.LJLLLLLL = 0.0f;
        this.LJZ = false;
        this.LJZL = 0;
        this.LLD = false;
        this.LLF = new C37561dg();
        this.LLFF = new C1AA(this);
        this.LLI = false;
        this.LLIIIJ = false;
        this.LLIIIL = null;
        this.LLIIIZ = null;
        this.LLIIJI = null;
        this.LLIIJLIL = 0;
        this.LLIIL = -1L;
        this.LLIILII = 0.0f;
        this.LLIILZL = 0;
        this.LLIIZ = 0.0f;
        this.LLIL = false;
        this.LLILZIL = new C13T(0);
        this.LLILZLL = false;
        this.LLIZLLLIL = C05V.UNDEFINED;
        this.LLJ = new C05R(this);
        this.LLJI = false;
        this.LLJIJIL = new RectF();
        this.LLJILJIL = null;
        this.LLJILJILJ = new ArrayList<>();
        LJLI(attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if ((((r15 * r3) - (((r5 * r3) * r3) / 2.0f)) + r6) > 1.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r3 = r13.LLFF;
        r2 = r13.LJLLL;
        r0 = r13.LJLIL.LJFF();
        r3.LIZ = r15;
        r3.LIZIZ = r2;
        r3.LIZJ = r0;
        r13.LJLILLLLZI = r13.LLFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        r6 = r13.LLF;
        r7 = r13.LJLLL;
        r10 = r13.LJLLILLLL;
        r11 = r13.LJLIL.LJFF();
        r0 = r13.LJLIL.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r0 = r0.LJIIJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r12 = r0.LJIILL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        r6.LIZIZ(r7, r8, r15, r10, r11, r12);
        r13.LJLJI = 0.0f;
        r0 = r13.LJLJJL;
        r13.LJLLLLLL = r8;
        r13.LJLJJL = r0;
        r13.LJLILLLLZI = r13.LLF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        r12 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if ((((((r5 * r3) * r3) / 2.0f) + (r15 * r3)) + r6) < 0.0f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJI(float r14, float r15, int r16) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45601qe.LJLJI(float, float, int):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i, int i2, int i3) {
        setState(C05V.SETUP);
        this.LJLJJL = i;
        this.LJLJJI = -1;
        this.LJLJJLL = -1;
        C019805y c019805y = this.mConstraintLayoutSpec;
        if (c019805y != null) {
            c019805y.LIZIZ(i2, i3, i);
            return;
        }
        C05Z c05z = this.LJLIL;
        if (c05z == null) {
            return;
        }
        c05z.LIZIZ(i).LIZIZ(this);
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View view, View view2, int i, int i2) {
        C05Y c05y;
        C017405a c017405a;
        C05Z c05z = this.LJLIL;
        if (c05z == null || (c05y = c05z.LIZJ) == null || (c017405a = c05y.LJIIJJI) == null || (c017405a.LJIJI & 2) != 0) {
            return false;
        }
        return true;
    }

    public final boolean LJL(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (LJL(view.getLeft() + f, view.getTop() + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.LLJIJIL.set(view.getLeft() + f, view.getTop() + f2, f + view.getRight(), f2 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.LLJIJIL.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.C1V0
    public final void LJJIIJ(View view, int i, int i2, int[] iArr, int i3) {
        C05Y c05y;
        C017405a c017405a;
        float f;
        float f2;
        C05Y c05y2;
        C017405a c017405a2;
        int i4;
        C05Z c05z = this.LJLIL;
        if (c05z == null || (c05y = c05z.LIZJ) == null || !(!c05y.LJIILJJIL)) {
            return;
        }
        C017405a c017405a3 = c05y.LJIIJJI;
        if (c017405a3 != null && (i4 = c017405a3.LJ) != -1 && view.getId() != i4) {
            return;
        }
        C05Z c05z2 = this.LJLIL;
        if (c05z2 != null && (c05y2 = c05z2.LIZJ) != null && (c017405a2 = c05y2.LJIIJJI) != null && c017405a2.LJIIZILJ) {
            float f3 = this.LJLLJ;
            if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(-1)) {
                return;
            }
        }
        if (c05y.LJIIJJI != null) {
            C017405a c017405a4 = this.LJLIL.LIZJ.LJIIJJI;
            if ((c017405a4.LJIJI & 1) != 0) {
                float f4 = i;
                float f5 = i2;
                c017405a4.LJIILJJIL.LJJZZIII(c017405a4.LJIILJJIL.getProgress(), c017405a4.LJII, c017405a4.LJI, c017405a4.LIZLLL, c017405a4.LJIIJJI);
                float f6 = c017405a4.LJIIIIZZ;
                if (f6 != 0.0f) {
                    float[] fArr = c017405a4.LJIIJJI;
                    if (fArr[0] == 0.0f) {
                        fArr[0] = 1.0E-7f;
                    }
                    f2 = (f4 * f6) / fArr[0];
                } else {
                    float[] fArr2 = c017405a4.LJIIJJI;
                    if (fArr2[1] == 0.0f) {
                        fArr2[1] = 1.0E-7f;
                    }
                    f2 = (f5 * c017405a4.LJIIIZ) / fArr2[1];
                }
                float f7 = this.LJLLL;
                if ((f7 <= 0.0f && f2 < 0.0f) || (f7 >= 1.0f && f2 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new IDRunnableS85S0100000(view, 14));
                    return;
                }
            }
        }
        float f8 = this.LJLLJ;
        long nanoTime = getNanoTime();
        float f9 = i;
        this.LLIFFJFJJ = f9;
        float f10 = i2;
        this.LLII = f10;
        this.LLIIIILZ = (float) ((nanoTime - this.LLIIII) * 1.0E-9d);
        this.LLIIII = nanoTime;
        C05Y c05y3 = this.LJLIL.LIZJ;
        if (c05y3 != null && (c017405a = c05y3.LJIIJJI) != null) {
            float progress = c017405a.LJIILJJIL.getProgress();
            if (!c017405a.LJIIJ) {
                c017405a.LJIIJ = true;
                c017405a.LJIILJJIL.setProgress(progress);
            }
            c017405a.LJIILJJIL.LJJZZIII(progress, c017405a.LJII, c017405a.LJI, c017405a.LIZLLL, c017405a.LJIIJJI);
            float f11 = c017405a.LJIIIIZZ;
            float[] fArr3 = c017405a.LJIIJJI;
            if (Math.abs((c017405a.LJIIIZ * fArr3[1]) + (f11 * fArr3[0])) < 0.01d) {
                float[] fArr4 = c017405a.LJIIJJI;
                fArr4[0] = 0.01f;
                fArr4[1] = 0.01f;
            }
            float f12 = c017405a.LJIIIIZZ;
            if (f12 != 0.0f) {
                f = (f9 * f12) / c017405a.LJIIJJI[0];
            } else {
                f = (f10 * c017405a.LJIIIZ) / c017405a.LJIIJJI[1];
            }
            float max = Math.max(Math.min(progress + f, 1.0f), 0.0f);
            if (max != c017405a.LJIILJJIL.getProgress()) {
                c017405a.LJIILJJIL.setProgress(max);
            }
        }
        if (f8 != this.LJLLJ) {
            iArr[0] = i;
            iArr[1] = i2;
        }
        LJJLL(false);
        if (iArr[0] == 0 && iArr[1] == 0) {
            return;
        }
        this.LLI = true;
    }

    public final void LJJZZIII(float f, float f2, float f3, int i, float[] fArr) {
        double[] dArr;
        HashMap<View, C267313d> hashMap = this.LJLL;
        View viewById = getViewById(i);
        C267313d c267313d = hashMap.get(viewById);
        if (c267313d != null) {
            float LIZ = c267313d.LIZ(c267313d.LJIJI, f);
            C11X[] c11xArr = c267313d.LJII;
            int i2 = 0;
            if (c11xArr != null) {
                C11X c11x = c11xArr[0];
                double d = LIZ;
                c11x.LJ(c267313d.LJIILJJIL, d);
                c267313d.LJII[0].LIZJ(c267313d.LJIILIIL, d);
                float f4 = c267313d.LJIJI[0];
                while (true) {
                    dArr = c267313d.LJIILJJIL;
                    if (i2 >= dArr.length) {
                        break;
                    }
                    dArr[i2] = dArr[i2] * f4;
                    i2++;
                }
                C37511db c37511db = c267313d.LJIIIIZZ;
                if (c37511db != null) {
                    double[] dArr2 = c267313d.LJIILIIL;
                    if (dArr2.length > 0) {
                        c37511db.LIZJ(dArr2, d);
                        c267313d.LJIIIIZZ.LJ(c267313d.LJIILJJIL, d);
                        C267513f c267513f = c267313d.LIZLLL;
                        int[] iArr = c267313d.LJIIL;
                        double[] dArr3 = c267313d.LJIILJJIL;
                        double[] dArr4 = c267313d.LJIILIIL;
                        c267513f.getClass();
                        C267513f.LJFF(f2, f3, fArr, iArr, dArr3, dArr4);
                    }
                } else {
                    C267513f c267513f2 = c267313d.LIZLLL;
                    int[] iArr2 = c267313d.LJIIL;
                    double[] dArr5 = c267313d.LJIILIIL;
                    c267513f2.getClass();
                    C267513f.LJFF(f2, f3, fArr, iArr2, dArr, dArr5);
                }
            } else {
                C267513f c267513f3 = c267313d.LJ;
                float f5 = c267513f3.LJLJJL;
                C267513f c267513f4 = c267313d.LIZLLL;
                float f6 = f5 - c267513f4.LJLJJL;
                float f7 = c267513f3.LJLJJLL - c267513f4.LJLJJLL;
                float f8 = c267513f3.LJLJL - c267513f4.LJLJL;
                float f9 = (c267513f3.LJLJLJ - c267513f4.LJLJLJ) + f7;
                fArr[0] = ((f8 + f6) * f2) + ((1.0f - f2) * f6);
                fArr[1] = (f9 * f3) + ((1.0f - f3) * f7);
            }
            viewById.getY();
            return;
        }
        if (viewById == null) {
            UC7.LIZLLL("", i);
        } else {
            viewById.getContext().getResources().getResourceName(i);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LLILZLL = true;
        try {
            if (this.LJLIL == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.LLFII != i5 || this.LLFZ != i6) {
                LJLIL();
                LJJLL(true);
            }
            this.LLFII = i5;
            this.LLFZ = i6;
        } finally {
            this.LLILZLL = false;
        }
    }

    @Override // X.InterfaceC43251mr
    public final void LJJIJIL(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.LLI || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.LLI = false;
    }
}
