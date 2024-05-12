package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS7S1100000_6;
import android.os.Handler;
import android.os.Message;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EEJ extends EEN implements Handler.Callback {
    public boolean LJLILLLLZI;
    public final EFV LJLJI = new EFV(this);

    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
        this.LJLILLLLZI = true;
        this.LJLJI.LIZ(1206);
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
        this.LJLILLLLZI = false;
    }

    @Override // X.EEN, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
        C36093EEn.LIZ.getClass();
        if (C36093EEn.LIZLLL.LIZ(EFK.APP_BACKGROUND) && this.LJLILLLLZI) {
            this.LJLJI.LIZ(1206);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (!this.LJLILLLLZI) {
            return true;
        }
        C36093EEn.LIZ.getClass();
        EEM eem = C36093EEn.LIZLLL;
        EFK efk = EFK.APP_BACKGROUND;
        String LIZJ = eem.LIZJ(efk);
        if (LIZJ != null) {
            C37179EiV.LIZJ(false).execute(new ARunnableS7S1100000_6(this, LIZJ, 12));
        }
        EE1 LIZLLL = C36093EEn.LIZIZ.LIZLLL(efk);
        if (LIZLLL == null) {
            return true;
        }
        C37179EiV.LIZJ(LIZLLL.serialExecute()).execute(new ARunnableS25S0200000_6(this, LIZLLL, 39));
        return true;
    }
}
