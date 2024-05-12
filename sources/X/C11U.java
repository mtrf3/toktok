package X;

import com.google.android.play.core.appupdate.u;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.11U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11U {
    public final C29321Dc LIZ;
    public final C37481dY LIZIZ;
    public final C11R LIZJ;
    public final C1DU<C1DO> LIZLLL;
    public boolean LJ;

    public final void LIZIZ() {
        if (!this.LJ) {
            ((LinkedHashMap) this.LIZJ.LIZ).clear();
            C37481dY c37481dY = this.LIZIZ;
            ((C11G) c37481dY.LJLILLLLZI).LIZJ();
            ((C11G) c37481dY.LJLILLLLZI).LIZ.LJII();
        }
    }

    public C11U(C29321Dc root) {
        o.LJIIIZ(root, "root");
        this.LIZ = root;
        this.LIZIZ = new C37481dY(root.LLI.LIZIZ);
        this.LIZJ = new C11R();
        this.LIZLLL = new C1DU<>();
    }

    public final int LIZ(C11S c11s, C11A positionCalculator, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        o.LJIIIZ(positionCalculator, "positionCalculator");
        if (this.LJ) {
            return 0;
        }
        try {
            this.LJ = true;
            C11B LIZ = this.LIZJ.LIZ(c11s, positionCalculator);
            Collection<C11P> values = LIZ.LIZ.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                for (C11P c11p : values) {
                    if (c11p.LIZLLL || c11p.LJI) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            for (C11P c11p2 : LIZ.LIZ.values()) {
                if (z2 || u.LIZ(c11p2)) {
                    if (c11p2.LJII == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.LIZ.LJJI(c11p2.LIZJ, this.LIZLLL, z3, true);
                    if (!this.LIZLLL.isEmpty()) {
                        this.LIZIZ.LIZ(c11p2.LIZ, this.LIZLLL);
                        this.LIZLLL.clear();
                    }
                }
            }
            ((C11G) this.LIZIZ.LJLILLLLZI).LJFF();
            boolean LIZIZ = this.LIZIZ.LIZIZ(LIZ, z);
            if (!LIZ.LIZJ) {
                Collection<C11P> values2 = LIZ.LIZ.values();
                if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                    for (C11P c11p3 : values2) {
                        o.LJIIIZ(c11p3, "<this>");
                        if ((!C10370av.LIZIZ(u.LJJIJLIJ(c11p3, true), C10370av.LIZIZ)) && c11p3.LIZIZ()) {
                            i = 2;
                            break;
                        }
                    }
                }
            }
            i = 0;
            return i | (LIZIZ ? 1 : 0);
        } finally {
            this.LJ = false;
        }
    }
}
