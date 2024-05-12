package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V5K implements InterfaceC25720zg {
    public final View LJLIL;
    public final C16610kz LJLILLLLZI;
    public final int[] LJLJI;

    public final void LJ() {
        if (this.LJLILLLLZI.LJIIIZ(0)) {
            this.LJLILLLLZI.LJIIL(0);
        }
        if (this.LJLILLLLZI.LJIIIZ(1)) {
            this.LJLILLLLZI.LJIIL(1);
        }
    }

    public V5K(View view) {
        o.LJIIIZ(view, "view");
        this.LJLIL = view;
        C16610kz c16610kz = new C16610kz(view);
        c16610kz.LJIIJ(true);
        this.LJLILLLLZI = c16610kz;
        this.LJLJI = new int[2];
        C16360ka.LJIJI(view, true);
    }

    @Override // X.InterfaceC25720zg
    public final long LIZIZ(int i, long j) {
        int i2;
        C16610kz c16610kz = this.LJLILLLLZI;
        int LJJJJ = C78685UuP.LJJJJ(j);
        int i3 = 0;
        if (i == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (c16610kz.LJIIJJI(LJJJJ, i2 ^ 1)) {
            C61898ORa.LJJI(this.LJLJI, 0);
            C16610kz c16610kz2 = this.LJLILLLLZI;
            int LJIIJ = C78685UuP.LJIIJ(C10370av.LIZLLL(j));
            int LJIIJ2 = C78685UuP.LJIIJ(C10370av.LJ(j));
            int[] iArr = this.LJLJI;
            if (i == 1) {
                i3 = 1;
            }
            c16610kz2.LIZJ(LJIIJ, LJIIJ2, i3 ^ 1, iArr, null);
            return C78685UuP.LJJZZIII(j, this.LJLJI);
        }
        return C10370av.LIZIZ;
    }

    @Override // X.InterfaceC25720zg
    public final Object LIZLLL(long j, InterfaceC67352kd<? super C23560wC> interfaceC67352kd) {
        if (!this.LJLILLLLZI.LIZIZ(C23560wC.LIZIZ(j) * (-1.0f), C23560wC.LIZJ(j) * (-1.0f))) {
            j = C23560wC.LIZIZ;
        }
        LJ();
        return new C23560wC(j);
    }

    @Override // X.InterfaceC25720zg
    public final Object LIZ(long j, long j2, InterfaceC67352kd<? super C23560wC> interfaceC67352kd) {
        if (!this.LJLILLLLZI.LIZ(C23560wC.LIZIZ(j2) * (-1.0f), C23560wC.LIZJ(j2) * (-1.0f), true)) {
            j2 = C23560wC.LIZIZ;
        }
        LJ();
        return new C23560wC(j2);
    }

    @Override // X.InterfaceC25720zg
    public final long LIZJ(int i, long j, long j2) {
        int i2;
        C16610kz c16610kz = this.LJLILLLLZI;
        int LJJJJ = C78685UuP.LJJJJ(j2);
        int i3 = 0;
        if (i == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (c16610kz.LJIIJJI(LJJJJ, i2 ^ 1)) {
            C61898ORa.LJJI(this.LJLJI, 0);
            C16610kz c16610kz2 = this.LJLILLLLZI;
            int LJIIJ = C78685UuP.LJIIJ(C10370av.LIZLLL(j));
            int LJIIJ2 = C78685UuP.LJIIJ(C10370av.LJ(j));
            int LJIIJ3 = C78685UuP.LJIIJ(C10370av.LIZLLL(j2));
            int LJIIJ4 = C78685UuP.LJIIJ(C10370av.LJ(j2));
            if (i == 1) {
                i3 = 1;
            }
            c16610kz2.LJ(LJIIJ, LJIIJ2, LJIIJ3, LJIIJ4, i3 ^ 1, this.LJLJI);
            return C78685UuP.LJJZZIII(j2, this.LJLJI);
        }
        return C10370av.LIZIZ;
    }
}
