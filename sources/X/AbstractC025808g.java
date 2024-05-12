package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import defpackage.a1;
import java.util.ArrayList;

/* renamed from: X.08g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC025808g {
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public String LJIIIIZZ;
    public int LJIIIZ;
    public CharSequence LJIIJ;
    public int LJIIJJI;
    public CharSequence LJIIL;
    public ArrayList<String> LJIILIIL;
    public ArrayList<String> LJIILJJIL;
    public final ArrayList<C025708f> LIZ = new ArrayList<>();
    public boolean LJII = true;
    public boolean LJIILL = false;

    public abstract int LJI();

    public abstract void LJII();

    public abstract void LJIIIIZZ(int i, int i2, Fragment fragment, String str);

    public abstract C1B3 LJIIIZ(Fragment fragment);

    public abstract C1B3 LJIIL(Fragment fragment);

    public final void LIZJ(C025708f c025708f) {
        this.LIZ.add(c025708f);
        c025708f.LIZJ = this.LIZIZ;
        c025708f.LIZLLL = this.LIZJ;
        c025708f.LJ = this.LIZLLL;
        c025708f.LJFF = this.LJ;
    }

    public final void LJ(String str) {
        if (this.LJII) {
            this.LJI = true;
            this.LJIIIIZZ = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void LJFF(Fragment fragment) {
        LIZJ(new C025708f(7, fragment));
    }

    public final void LIZIZ(int i, Fragment fragment) {
        LJIIIIZZ(i, 1, fragment, null);
    }

    public final void LIZLLL(View view, String str) {
        if (C026808q.LIZIZ != null || C026808q.LIZJ != null) {
            String LJIIJ = C16360ka.LJIIJ(view);
            if (LJIIJ != null) {
                if (this.LJIILIIL == null) {
                    this.LJIILIIL = new ArrayList<>();
                    this.LJIILJJIL = new ArrayList<>();
                } else if (!this.LJIILJJIL.contains(str)) {
                    if (this.LJIILIIL.contains(LJIIJ)) {
                        throw new IllegalArgumentException(a1.LJ("A shared element with the source name '", LJIIJ, "' has already been added to the transaction."));
                    }
                } else {
                    throw new IllegalArgumentException(a1.LJ("A shared element with the target name '", str, "' has already been added to the transaction."));
                }
                this.LJIILIIL.add(LJIIJ);
                this.LJIILJJIL.add(str);
                return;
            }
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
    }

    public final void LJIIJ(Fragment fragment, String str, int i) {
        if (i != 0) {
            LJIIIIZZ(i, 2, fragment, str);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final void LJIIJJI(int i, int i2, int i3, int i4) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
    }
}
