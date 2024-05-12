package X;

import android.os.SystemClock;

/* renamed from: X.ODt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61553ODt extends OE9 {
    @Override // X.OE9
    public final void LIZIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        ODS LIZIZ = ODP.LIZIZ(c61546ODm, false);
        LIZIZ.LJIIL = SystemClock.uptimeMillis() - LIZIZ.LJIJI;
    }

    @Override // X.OE9
    public final void LJFF(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        ODP.LIZIZ(c61546ODm, false).LJIJI = SystemClock.uptimeMillis();
    }

    @Override // X.OE9
    public final void LIZJ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        int i;
        if (th instanceof C61509OCb) {
            i = ((C61509OCb) th).getCode();
        } else {
            i = 1099;
        }
        ODP.LIZJ(c61546ODm, i, th);
    }
}
