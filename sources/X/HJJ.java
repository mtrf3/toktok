package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS95S0101000_7;

/* loaded from: classes8.dex */
public final class HJJ implements SP7 {
    public final HJM LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.SP7
    public final boolean Fd0() {
        return C77413UZt.LJIJI(this.LJLIL.getAweme());
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ HJM L9() {
        return this.LJLIL;
    }

    public HJJ(C42688GpA c42688GpA) {
        this.LJLIL = c42688GpA;
    }

    @Override // X.SP7
    public final boolean bd(int i, int i2) {
        if (i != 0 || !C77275UUl.LJIIIIZZ(1, 2).contains(Integer.valueOf(i2))) {
            return false;
        }
        if (C77413UZt.LJIJI(this.LJLIL.getAweme())) {
            if (this.LJLILLLLZI) {
                return false;
            }
            this.LJLILLLLZI = true;
            C26227ARb LIZ = C3AW.LIZ(C44384HbQ.LLIILZL(this));
            LIZ.LJ(R.string.i5u);
            LIZ.LIZ(R.string.i5q);
            UC0.LIZJ(LIZ, HJL.LJLIL);
            LIZ.LJI().LIZLLL();
        } else {
            if (!C77413UZt.LJIJ(this.LJLIL.getAweme()) || this.LJLILLLLZI) {
                return false;
            }
            this.LJLILLLLZI = true;
            C26227ARb LIZ2 = C3AW.LIZ(C44384HbQ.LLIILZL(this));
            LIZ2.LJ(R.string.i5p);
            LIZ2.LIZ(R.string.i5m);
            UC0.LIZJ(LIZ2, new AqS95S0101000_7(this, i2, 23));
            LIZ2.LJI().LIZLLL();
        }
        return true;
    }
}
