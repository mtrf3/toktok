package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0qF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19870qF {
    public final Context LIZ;
    public final View LIZIZ;
    public View LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public long LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public CharSequence LJIIJJI;
    public final InterfaceC19890qH LJIIL;
    public InterfaceC19880qG LJIILIIL;
    public int LJIILJJIL;
    public final int LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;

    public void LJ() {
        this.LJIIIZ = false;
    }

    public void LJFF() {
        this.LJIIJ = true;
    }

    public void LIZJ() {
        this.LJI = 5000L;
    }

    public CharSequence LIZ() {
        return this.LJIIJJI;
    }

    public InterfaceC19880qG LIZIZ() {
        return this.LJIILIIL;
    }

    public C19870qF(C19860qE<?> c19860qE) {
        Context context = c19860qE.LIZ;
        this.LIZ = context;
        if (context != null) {
            if (!c19860qE.LJII) {
                this.LJI = context.getResources().getInteger(R.integer.c3);
            } else {
                this.LJI = c19860qE.LJI;
            }
            if (!c19860qE.LJIIIZ) {
                this.LJII = context.getResources().getDimensionPixelSize(R.dimen.ahk);
            } else {
                this.LJII = c19860qE.LJIIIIZZ;
            }
            if (!c19860qE.LJIIJJI) {
                this.LJIIIIZZ = context.getResources().getDimensionPixelSize(R.dimen.ahm);
            } else {
                this.LJIIIIZZ = c19860qE.LJIIJ;
            }
        }
        this.LIZIZ = c19860qE.LIZIZ;
        this.LIZJ = c19860qE.LIZJ;
        this.LIZLLL = c19860qE.LIZLLL;
        this.LJ = c19860qE.LJ;
        this.LJFF = c19860qE.LJFF;
        this.LJIIIZ = c19860qE.LJIILJJIL;
        this.LJIIZILJ = c19860qE.LJIJJ;
        this.LJIIJ = c19860qE.LJIILL;
        this.LJIIL = c19860qE.LJIIL;
        this.LJIILIIL = c19860qE.LJIILIIL;
        this.LJIIJJI = c19860qE.LJIILLIIL;
        this.LJIILJJIL = c19860qE.LJIIZILJ;
        this.LJIILL = c19860qE.LJIJ;
        this.LJIILLIIL = c19860qE.LJIJI;
    }

    public void LIZLLL(C30771C5v c30771C5v) {
        this.LJIILIIL = c30771C5v;
    }
}
