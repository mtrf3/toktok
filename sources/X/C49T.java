package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* renamed from: X.49T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49T extends F9E {
    public final C49S LJLJJI;
    public final C49S LJLJJL;
    public final int LJLIL = R.attr.cl;
    public final int LJLILLLLZI = R.attr.lc;
    public final boolean LJLJI = false;
    public final boolean LJLJJLL = false;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL, Boolean.valueOf(this.LJLJJLL)};
    }

    public C49T(C49S c49s, C49S c49s2) {
        this.LJLJJI = c49s;
        this.LJLJJL = c49s2;
    }

    public final C49V L(Context context, boolean z) {
        C49S c49s;
        C48E c48e;
        if (z) {
            c49s = this.LJLJJI;
        } else {
            c49s = this.LJLJJL;
        }
        float LJIIIIZZ = C1DF.LJIIIIZZ(40);
        C4AH c4ah = new C4AH(LJIIIIZZ, LJIIIIZZ, LJIIIIZZ, LJIIIIZZ);
        C4KA c4ka = c49s.LJLILLLLZI;
        Integer LJI = C79045V0n.LJI(c49s.LJLIL, context);
        if (LJI != null) {
            c48e = new C48E(LJI.intValue());
        } else {
            c48e = null;
        }
        return new C49V(c4ah, c4ka, c48e);
    }
}
