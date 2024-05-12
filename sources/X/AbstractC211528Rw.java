package X;

import defpackage.b0;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS58S1200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8Rw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC211528Rw extends AbstractC55363Lo7 {
    public final String LJLIL;
    public long LJLILLLLZI;
    public AqS107S0300000_3 LJLJI;
    public AqS58S1200000_3 LJLJJI;

    public abstract void LJIIIIZZ();

    @Override // X.InterfaceC55641Lsb
    public final /* bridge */ /* synthetic */ C54082LKk getPopupContext() {
        return null;
    }

    @Override // X.M74
    public final void onConflict() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show ");
        LIZ.append(this.LJLIL);
        LIZ.append(" conflicted");
        C221018lt.LJFF("StoryGestureEducation", X1D.LIZIZ(LIZ));
    }

    public AbstractC211528Rw(String str) {
        this.LJLIL = str;
    }

    @Override // X.M74
    public final void onPopupStateChanged(M7A fromState, M7A toState) {
        o.LJIIIZ(fromState, "fromState");
        o.LJIIIZ(toState, "toState");
        int i = M79.LIZ[toState.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                return;
            }
            LJIIIIZZ();
            long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
            AqS107S0300000_3 aqS107S0300000_3 = this.LJLJI;
            if (aqS107S0300000_3 == null) {
                return;
            }
            aqS107S0300000_3.invoke(Long.valueOf(currentTimeMillis));
            return;
        }
        this.LJLILLLLZI = System.currentTimeMillis();
        AqS58S1200000_3 aqS58S1200000_3 = this.LJLJJI;
        if (aqS58S1200000_3 == null) {
            return;
        }
        aqS58S1200000_3.invoke();
    }

    @Override // X.M74
    public final void showPopupFailed(int i, String errMsg) {
        o.LJIIIZ(errMsg, "errMsg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show ");
        C0EH.LIZLLL(LIZ, this.LJLIL, " failed for errCode: ", i, ": ");
        b0.LJFF(LIZ, errMsg, LIZ, "StoryGestureEducation");
    }
}
