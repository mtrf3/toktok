package X;

import android.os.SystemClock;

/* loaded from: classes11.dex */
public final class OE2 extends OE9 {
    @Override // X.OE9
    public final void LIZIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        ODS LIZIZ = ODP.LIZIZ(c61546ODm, false);
        LIZIZ.LJIIJ = SystemClock.uptimeMillis() - LIZIZ.LJIIZILJ;
    }

    @Override // X.OE9
    public final void LJFF(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        ODP.LIZIZ(c61546ODm, false).LJIIZILJ = SystemClock.uptimeMillis();
    }

    @Override // X.OE9
    public final void LIZJ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        ODP.LIZJ(c61546ODm, 200, th);
    }
}
