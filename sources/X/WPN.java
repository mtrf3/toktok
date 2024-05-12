package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.AqS164S0100000_14;

/* loaded from: classes15.dex */
public final class WPN implements C5HC {
    public final /* synthetic */ AqS164S0100000_14 LJLIL;

    public WPN(AqS164S0100000_14 aqS164S0100000_14) {
        this.LJLIL = aqS164S0100000_14;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            ((WPF) this.LJLIL.l0).LLJJ();
            return true;
        }
        return false;
    }
}
