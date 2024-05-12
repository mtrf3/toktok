package X;

import Y.ARunnableS21S0300000_10;
import Y.ARunnableS29S0200000_10;
import Y.ARunnableS46S0100000_10;
import Y.ARunnableS6S0200100_10;
import Y.ARunnableS9S1200000_10;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.List;

/* loaded from: classes11.dex */
public final class OIA extends AbstractC61537ODd {
    public final AbstractC61537ODd LIZ;

    @Override // X.AbstractC61537ODd
    public final void LJIIL() {
        C2NP.LIZ(new ARunnableS46S0100000_10(this, 143));
    }

    public OIA(OI7 oi7) {
        this.LIZ = oi7;
    }

    @Override // X.AbstractC61537ODd
    public final void LIZIZ(UpdatePackage updatePackage) {
        C2NP.LIZ(new ARunnableS29S0200000_10(updatePackage, this, 51));
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIIIZZ(UpdatePackage updatePackage) {
        C2NP.LIZ(new ARunnableS29S0200000_10(updatePackage, this, 52));
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILIIL(UpdatePackage updatePackage) {
        C2NP.LIZ(new ARunnableS29S0200000_10(updatePackage, this, 53));
    }

    @Override // X.AbstractC61537ODd
    public final void LIZ(UpdatePackage updatePackage, Throwable th) {
        C2NP.LIZ(new ARunnableS21S0300000_10(updatePackage, th, this, 19));
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        C2NP.LIZ(new ARunnableS21S0300000_10(map, th, this, 21));
    }

    @Override // X.AbstractC61537ODd
    public final void LJFF(java.util.Map<String, List<Pair<String, Long>>> map, java.util.Map<String, List<UpdatePackage>> map2) {
        C2NP.LIZ(new ARunnableS21S0300000_10(map, map2, this, 18));
    }

    @Override // X.AbstractC61537ODd
    public final void LJI(UpdatePackage updatePackage, Throwable th) {
        C2NP.LIZ(new ARunnableS21S0300000_10(updatePackage, th, this, 20));
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        C2NP.LIZ(new ARunnableS21S0300000_10(updatePackage, th, this, 17));
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJJI(String str, Throwable th) {
        C2NP.LIZ(new ARunnableS9S1200000_10(this, th, str, 6));
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILJJIL(long j, String str) {
        C2NP.LIZ(new OI9(this, str, j));
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        C2NP.LIZ(new ARunnableS6S0200100_10(updatePackage, j, this, 1));
    }
}
