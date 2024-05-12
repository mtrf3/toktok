package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class J2R implements VGA {
    public boolean LJLJI;
    public final long LJLJJI;
    public final ARunnableS44S0100000_8 LJLJJL = new ARunnableS44S0100000_8(this, 9);
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());
    public final ArrayList<J2Q> LJLILLLLZI = new ArrayList<>();

    @Override // X.VGA
    public final void LIZ() {
    }

    @Override // X.VGA
    public final boolean LIZLLL() {
        if (this.LJLILLLLZI.size() > 0 && this.LJLJI) {
            return true;
        }
        return false;
    }

    @Override // X.VGA
    public final void LIZIZ(J2Q j2q) {
        ArrayList<J2Q> arrayList = this.LJLILLLLZI;
        if (arrayList != null) {
            arrayList.remove(j2q);
        }
        if (this.LJLILLLLZI.size() == 0) {
            this.LJLIL.removeCallbacks(this.LJLJJL);
        }
    }

    @Override // X.VGA
    public final void LIZJ(J2Q j2q) {
        ArrayList<J2Q> arrayList = this.LJLILLLLZI;
        if (arrayList != null && !arrayList.contains(j2q)) {
            this.LJLILLLLZI.add(j2q);
            if (this.LJLILLLLZI.size() == 1) {
                this.LJLIL.post(this.LJLJJL);
            }
        }
    }

    @Override // X.VGA
    public final void setEnable(boolean z) {
        this.LJLJI = z;
    }

    public J2R(int i, float f) {
        this.LJLJJI = 1000.0f / f;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new LocalVsyncHelper,fps:");
        LIZ.append(f);
        C48284IxE.LIZ(1, i, "TR_VsyncHelperFactory", X1D.LIZIZ(LIZ));
    }
}
