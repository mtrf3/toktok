package X;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;

/* loaded from: classes11.dex */
public final class ODX extends OE9 {
    @Override // X.OE9
    public final void LIZIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        ODS LIZIZ = ODP.LIZIZ(c61546ODm, false);
        long uptimeMillis = SystemClock.uptimeMillis() - LIZIZ.LJIILLIIL;
        LIZIZ.LJIIIIZZ = uptimeMillis;
        LIZIZ.LJII += uptimeMillis;
    }

    @Override // X.OE9
    public final void LJFF(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        Pair pair = (Pair) c61546ODm.LJFF(C61545ODl.class);
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        ODS LIZIZ = ODP.LIZIZ(c61546ODm, true);
        LIZIZ.LJIILLIIL = SystemClock.uptimeMillis();
        LIZIZ.LIZIZ(updatePackage, true).LJ = ((android.net.Uri) pair.first).toString();
    }

    @Override // X.OE9
    public final void LIZJ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        ODS LIZIZ = ODP.LIZIZ(c61546ODm, false);
        LIZIZ.LJII = (SystemClock.uptimeMillis() - LIZIZ.LJIILLIIL) + LIZIZ.LJII;
        ODP.LIZIZ(c61546ODm, false).LIZIZ((UpdatePackage) c61546ODm.LIZIZ(C61545ODl.class), false).LJFF++;
    }
}
