package X;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25660za {
    public Interpolator LIZJ;
    public InterfaceC16660l4 LIZLLL;
    public boolean LJ;
    public long LIZIZ = -1;
    public final C44071oB LJFF = new C31309CQn() { // from class: X.1oB
        public boolean LJLILLLLZI;
        public int LJLJI;

        @Override // X.InterfaceC16660l4
        public final void LIZ() {
            int i = this.LJLJI + 1;
            this.LJLJI = i;
            if (i == C25660za.this.LIZ.size()) {
                InterfaceC16660l4 interfaceC16660l4 = C25660za.this.LIZLLL;
                if (interfaceC16660l4 != null) {
                    interfaceC16660l4.LIZ();
                }
                this.LJLJI = 0;
                this.LJLILLLLZI = false;
                C25660za.this.LJ = false;
            }
        }

        @Override // X.C31309CQn, X.InterfaceC16660l4
        public final void LJIIJ() {
            if (this.LJLILLLLZI) {
                return;
            }
            this.LJLILLLLZI = true;
            InterfaceC16660l4 interfaceC16660l4 = C25660za.this.LIZLLL;
            if (interfaceC16660l4 != null) {
                interfaceC16660l4.LJIIJ();
            }
        }
    };
    public final ArrayList<C16650l3> LIZ = new ArrayList<>();

    public final void LIZ() {
        if (!this.LJ) {
            return;
        }
        Iterator<C16650l3> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
        this.LJ = false;
    }

    public final void LIZIZ() {
        View view;
        if (this.LJ) {
            return;
        }
        Iterator<C16650l3> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C16650l3 next = it.next();
            long j = this.LIZIZ;
            if (j >= 0) {
                next.LIZJ(j);
            }
            Interpolator interpolator = this.LIZJ;
            if (interpolator != null && (view = next.LIZ.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.LIZLLL != null) {
                next.LIZLLL(this.LJFF);
            }
            next.LJ();
        }
        this.LJ = true;
    }
}
