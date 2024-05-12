package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS7S1100000_6;
import android.os.Handler;
import android.os.Message;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EEB extends AbstractC36078EDy implements Handler.Callback {
    public boolean LJLIL;
    public final EFV LJLILLLLZI = new EFV(this);

    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
        this.LJLIL = true;
        this.LJLILLLLZI.LIZ(1206);
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
        this.LJLIL = false;
    }

    @Override // X.AbstractC36078EDy
    public final EFK LJFF() {
        return EFK.APP_BACKGROUND;
    }

    @Override // X.AbstractC36078EDy, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
        C36093EEn.LIZ.getClass();
        if (C36093EEn.LIZIZ.LIZIZ(EFK.APP_BACKGROUND) && this.LJLIL) {
            this.LJLILLLLZI.LIZ(1206);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (!this.LJLIL) {
            return true;
        }
        C36093EEn.LIZ.getClass();
        EEM eem = C36093EEn.LIZLLL;
        EFK efk = EFK.APP_BACKGROUND;
        String LIZJ = eem.LIZJ(efk);
        if (LIZJ != null) {
            C37179EiV.LIZJ(false).execute(new ARunnableS7S1100000_6(this, LIZJ, 13));
        }
        EE1 LIZLLL = C36093EEn.LIZIZ.LIZLLL(efk);
        if (LIZLLL == null) {
            return true;
        }
        C37179EiV.LIZJ(LIZLLL.serialExecute()).execute(new ARunnableS25S0200000_6(this, LIZLLL, 40));
        return true;
    }
}
