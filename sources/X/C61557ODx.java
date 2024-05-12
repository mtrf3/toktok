package X;

import android.os.SystemClock;

/* renamed from: X.ODx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61557ODx extends OE9 {
    @Override // X.OE9
    public final void LIZIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        ODS LIZIZ = ODP.LIZIZ(c61546ODm, false);
        LIZIZ.LJIILIIL = SystemClock.uptimeMillis() - LIZIZ.LJIJJ;
    }

    @Override // X.OE9
    public final void LJFF(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        ODP.LIZIZ(c61546ODm, false).LJIJJ = SystemClock.uptimeMillis();
    }

    @Override // X.OE9
    public final void LIZJ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        int i;
        if (th instanceof C61562OEc) {
            i = 301;
        } else {
            i = 300;
        }
        ODP.LIZJ(c61546ODm, i, th);
    }
}
