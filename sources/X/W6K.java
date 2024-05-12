package X;

import android.content.Context;
import defpackage.g0;

/* loaded from: classes15.dex */
public final class W6K implements W6M {
    public final Object LJLIL;
    public Object LJLILLLLZI;

    public /* synthetic */ W6K(Context context) {
        this.LJLIL = context;
        this.LJLILLLLZI = CP6.LIZ(g0.LJIILJJIL(context)).LIZIZ();
    }

    @Override // X.W6M
    public final int LIZIZ(InterfaceC78852Ux6 interfaceC78852Ux6) {
        return ((W6M) this.LJLIL).LIZIZ(interfaceC78852Ux6);
    }

    @Override // X.W6M
    public final boolean LJ(InterfaceC78852Ux6 interfaceC78852Ux6) {
        return ((W6M) this.LJLIL).LJ(interfaceC78852Ux6);
    }

    @Override // X.W6M
    public final C81392Vwy LJFF(W6U w6u) {
        C81392Vwy LJFF = ((W6M) this.LJLIL).LJFF(w6u);
        if (LJFF == null) {
            ((W6R) this.LJLILLLLZI).LIZIZ();
        } else {
            ((W6R) this.LJLILLLLZI).LIZ(w6u);
            Object LJI = LJFF.LJI();
            if (LJI instanceof InterfaceC81386Vws) {
                ((InterfaceC81386Vws) LJI).hitMemoryCache();
            }
        }
        return LJFF;
    }

    public /* synthetic */ W6K(W6X w6x, W6R w6r) {
        this.LJLIL = w6x;
        this.LJLILLLLZI = w6r;
    }

    @Override // X.W6M
    public final C81392Vwy LIZJ(W6U w6u, C81392Vwy c81392Vwy) {
        ((W6R) this.LJLILLLLZI).LIZJ();
        return ((W6M) this.LJLIL).LIZJ(w6u, c81392Vwy);
    }
}
