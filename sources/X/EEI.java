package X;

import Y.ARunnableS12S1000000_6;
import android.os.Handler;
import android.os.Message;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EEI extends EEN implements Handler.Callback {
    public final EFV LJLILLLLZI = new EFV(this);

    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
    }

    @Override // X.EEN, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
        C36093EEn.LIZ.getClass();
        if (C36093EEn.LIZLLL.LIZ(EFK.SPARSE) && !this.LJLILLLLZI.hasMessages(1202)) {
            this.LJLILLLLZI.LIZ(1202);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        C36093EEn.LIZ.getClass();
        EEM eem = C36093EEn.LIZLLL;
        EFK efk = EFK.SPARSE;
        String LIZJ = eem.LIZJ(efk);
        if (LIZJ != null) {
            C37179EiV.LIZJ(false).execute(new ARunnableS12S1000000_6(LIZJ, 6));
        }
        if (eem.LIZ(efk)) {
            this.LJLILLLLZI.LIZIZ(1202, 50L);
            return true;
        }
        return true;
    }
}
