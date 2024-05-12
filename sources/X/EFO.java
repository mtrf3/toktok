package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.Message;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EFO extends EFT implements Handler.Callback {
    public final EFV LJLIL = new EFV(this);
    public boolean LJLILLLLZI;

    @Override // X.EFT, X.InterfaceC36091EEl
    public final void LIZ() {
        this.LJLILLLLZI = true;
        this.LJLIL.LIZIZ(1203, ((Number) DNL.LIZIZ.getValue()).longValue());
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        if (components.isEmpty()) {
            return;
        }
        C37179EiV.LIZIZ(EFN.P0).execute(new ARunnableS25S0200000_6(this, components, 42));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        EFM LIZJ;
        o.LJIIIZ(msg, "msg");
        C36093EEn.LIZ.getClass();
        EFL efl = C36093EEn.LIZJ;
        EFN efn = EFN.BOOT_FINISH;
        if (efl.LIZIZ(efn) && (LIZJ = efl.LIZJ(efn)) != null) {
            C37179EiV.LIZIZ(efn).execute(new ARunnableS42S0100000_6(LIZJ, 97));
        }
        if (efl.LIZIZ(efn)) {
            this.LJLIL.LIZIZ(1203, ((Number) DNL.LIZIZ.getValue()).longValue());
            return true;
        }
        return true;
    }
}
