package X;

import Y.IDComparatorS30S0000000_2;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.6Rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160446Rk extends C6P6 {
    public C6SD LIZIZ;
    public C6SD LIZJ;
    public C6SD LIZLLL;
    public boolean LJFF;
    public final ArrayList<C6SD> LIZ = new ArrayList<>();
    public final ArrayList<C6V2> LJ = new ArrayList<>();

    public final void LJJIFFI(C6SD listener) {
        int i;
        o.LJIIIZ(listener, "listener");
        C6SD c6sd = (C6SD) ORZ.LLFII(this.LIZ);
        if (c6sd != null) {
            i = c6sd.LJJIIJ();
        } else {
            i = 0;
        }
        listener.LJJIJ(i + 1);
        this.LIZ.add(listener);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJIIZI(MotionEvent motionEvent) {
        if (this.LJFF) {
            Iterator<C6V2> it = this.LJ.iterator();
            while (it.hasNext()) {
                if (it.next().LJJIIZI(motionEvent)) {
                    return true;
                }
            }
            if (motionEvent != null) {
                Iterator<C6SD> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    C6SD next = it2.next();
                    next.LJJIIZI(motionEvent);
                    if (next.LJJIIJZLJL(motionEvent)) {
                        return true;
                    }
                }
            }
            this.LJFF = false;
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJIZ(float f) {
        C6SD c6sd = this.LIZLLL;
        if (c6sd != null) {
            c6sd.LJJIZ(f);
            return true;
        }
        Iterator<C6V2> it = this.LJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJJIZ(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJJ(MotionEvent e) {
        o.LJIIIZ(e, "e");
        ArrayList<C6SD> arrayList = this.LIZ;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(61));
        }
        Iterator<C6SD> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C6SD next = it.next();
            if (next.LJJJ(e)) {
                next.LJJIJ(((C6SD) ORZ.LJLLJ(this.LIZ)).LJJIIJ() + 1);
                return true;
            }
        }
        Iterator<C6V2> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJJJ(e)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJLI(C82537WaL detector) {
        o.LJIIIZ(detector, "detector");
        C6SD c6sd = this.LIZIZ;
        if (c6sd != null) {
            c6sd.LJLI(detector);
            return true;
        }
        Iterator<C6V2> it = this.LJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJLI(detector)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJLJI(float f) {
        C6SD c6sd = this.LIZJ;
        if (c6sd != null) {
            c6sd.LJLJI(f);
        }
        this.LIZJ = null;
        Iterator<C6V2> it = this.LJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJLJI(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final void LJLJJI(C82537WaL c82537WaL) {
        C6SD c6sd = this.LIZIZ;
        if (c6sd != null) {
            c6sd.LJLJJI(c82537WaL);
        }
        this.LIZIZ = null;
        if (this.LJFF) {
            Iterator<C6V2> it = this.LJ.iterator();
            while (it.hasNext()) {
                it.next().LJLJJI(c82537WaL);
            }
            this.LJFF = false;
        }
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LLLLLLLZIL(C82536WaK detector) {
        o.LJIIIZ(detector, "detector");
        ArrayList<C6SD> arrayList = this.LIZ;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(64));
        }
        Iterator<C6SD> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C6SD next = it.next();
            if (next.LLLLLLLZIL(detector)) {
                next.LJJIJ(((C6SD) ORZ.LJLLJ(this.LIZ)).LJJIIJ() + 1);
                this.LIZLLL = next;
                return true;
            }
        }
        Iterator<C6V2> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLLLLLLZIL(detector)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LLLLLLZ(float f) {
        this.LIZLLL = null;
        Iterator<C6V2> it = this.LJ.iterator();
        while (it.hasNext()) {
            if (it.next().LLLLLLZ(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onDown(MotionEvent motionEvent) {
        Iterator<C6V2> it = this.LJ.iterator();
        while (it.hasNext()) {
            if (it.next().onDown(motionEvent)) {
                this.LJFF = true;
                return true;
            }
        }
        if (motionEvent != null) {
            Iterator<C6SD> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                C6SD next = it2.next();
                next.onDown(motionEvent);
                if (next.LJJIIJZLJL(motionEvent)) {
                    this.LJFF = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScale(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        C6SD c6sd = this.LIZJ;
        if (c6sd != null) {
            c6sd.onScale(scaleFactor);
            return true;
        }
        Iterator<C6V2> it = this.LJ.iterator();
        while (it.hasNext()) {
            if (it.next().onScale(scaleFactor)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScaleBegin(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        ArrayList<C6SD> arrayList = this.LIZ;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(65));
        }
        Iterator<C6SD> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C6SD next = it.next();
            if (next.onScaleBegin(scaleFactor)) {
                next.LJJIJ(((C6SD) ORZ.LJLLJ(this.LIZ)).LJJIIJ() + 1);
                this.LIZJ = next;
                return true;
            }
        }
        Iterator<C6V2> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().onScaleBegin(scaleFactor)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        ArrayList<C6SD> arrayList = this.LIZ;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(67));
        }
        Iterator<C6SD> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C6SD next = it.next();
            if (next.onSingleTapConfirmed(e)) {
                next.LJJIJ(((C6SD) ORZ.LJLLJ(this.LIZ)).LJJIIJ() + 1);
                return true;
            }
        }
        Iterator<C6V2> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().onSingleTapConfirmed(e)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
        ArrayList<C6SD> arrayList = this.LIZ;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(63));
        }
        Iterator<C6SD> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C6SD next = it.next();
            if (next.LJJLIL(c82537WaL, f, f2)) {
                next.LJJIJ(((C6SD) ORZ.LJLLJ(this.LIZ)).LJJIIJ() + 1);
                this.LIZIZ = next;
                return true;
            }
        }
        Iterator<C6V2> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJJLIL(c82537WaL, f, f2)) {
                return true;
            }
        }
        return this instanceof C1547765p;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ArrayList<C6SD> arrayList = this.LIZ;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(62));
        }
        Iterator<C6SD> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C6SD next = it.next();
            if (next.onScroll(motionEvent, motionEvent2, f, f) || next.onFling(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ArrayList<C6SD> arrayList = this.LIZ;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(66));
        }
        Iterator<C6SD> it = this.LIZ.iterator();
        while (it.hasNext()) {
            if (it.next().onScroll(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        return false;
    }
}
