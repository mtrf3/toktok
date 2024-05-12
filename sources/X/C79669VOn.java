package X;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;

/* renamed from: X.VOn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79669VOn {
    public WeakReference<LynxUI> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public Rect LJIIZILJ;
    public ViewOnAttachStateChangeListenerC79671VOp LJIJ;
    public C79672VOq LJIJI;
    public C79670VOo LJIJJ;
    public C79676VOu LJIJJLI;
    public final SparseArray<VOS> LJIL = new SparseArray<>(0);
    public float LJJ = -1.0f;
    public boolean LJJI = false;

    public final void LIZIZ() {
        WeakReference<LynxUI> weakReference = this.LIZ;
        if (weakReference != null && weakReference.get() != null) {
            this.LIZ.get().updateLayout(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIIZILJ);
        }
    }

    public final VR2 LIZLLL() {
        if (this.LJIJI == null) {
            this.LJIJI = new C79672VOq();
        }
        return this.LJIJI;
    }

    public final VR2 LJ() {
        if (this.LJIJJLI == null) {
            this.LJIJJLI = new C79676VOu();
        }
        return this.LJIJJLI;
    }

    public final VR2 LJFF() {
        if (this.LJIJJ == null) {
            this.LJIJJ = new C79670VOo();
        }
        return this.LJIJJ;
    }

    public final LynxUI LJI() {
        WeakReference<LynxUI> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void LIZJ(String str) {
        WeakReference<LynxUI> weakReference;
        T t;
        ViewOnAttachStateChangeListenerC79671VOp viewOnAttachStateChangeListenerC79671VOp = this.LJIJ;
        if (viewOnAttachStateChangeListenerC79671VOp == null || !viewOnAttachStateChangeListenerC79671VOp.LJLILLLLZI.equals(str) || (weakReference = this.LIZ) == null || weakReference.get() == null || (t = this.LIZ.get().mView) == 0 || t.getAnimation() == null) {
            return;
        }
        t.clearAnimation();
        LIZIZ();
    }

    public final void LJII(String str) {
        LynxUI LJI = LJI();
        if (LJI == null) {
            return;
        }
        T t = LJI.mView;
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.LJIJ;
        if (onAttachStateChangeListener != null) {
            if (t != 0) {
                t.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            this.LJIJ = null;
        }
        LIZIZ();
        C79667VOl.LIZ(LJI, "animationend", str);
    }

    public final void LIZ(View view, String str) {
        if (LJI() == null) {
            return;
        }
        ViewOnAttachStateChangeListenerC79671VOp viewOnAttachStateChangeListenerC79671VOp = this.LJIJ;
        if (viewOnAttachStateChangeListenerC79671VOp != null && viewOnAttachStateChangeListenerC79671VOp.LJLILLLLZI.equals(str)) {
            return;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.LJIJ;
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        ViewOnAttachStateChangeListenerC79671VOp viewOnAttachStateChangeListenerC79671VOp2 = new ViewOnAttachStateChangeListenerC79671VOp(this, str);
        this.LJIJ = viewOnAttachStateChangeListenerC79671VOp2;
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC79671VOp2);
    }

    public final void LJIIIIZZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
        this.LJIIIIZZ = i8;
        this.LJIILIIL = i9;
        this.LJIILJJIL = i10;
        this.LJIILL = i11;
        this.LJIILLIIL = i12;
        this.LJIIIZ = i13;
        this.LJIIJ = i14;
        this.LJIIJJI = i15;
        this.LJIIL = i16;
        this.LJIIZILJ = rect;
    }
}
