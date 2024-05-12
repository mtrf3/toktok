package X;

import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.Message;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EDx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36077EDx extends AbstractC36078EDy implements Handler.Callback {
    public final EFV LJLIL = new EFV(this);

    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
    }

    @Override // X.AbstractC36078EDy
    public final EFK LJFF() {
        return EFK.SPARSE;
    }

    @Override // X.AbstractC36078EDy, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
        C36093EEn.LIZ.getClass();
        if (C36093EEn.LIZIZ.LIZIZ(EFK.SPARSE) && !this.LJLIL.hasMessages(1202)) {
            this.LJLIL.LIZ(1202);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        C36093EEn.LIZ.getClass();
        EE9 ee9 = C36093EEn.LIZIZ;
        EFK efk = EFK.SPARSE;
        EE1 LIZLLL = ee9.LIZLLL(efk);
        if (LIZLLL != null) {
            C37179EiV.LIZJ(LIZLLL.serialExecute()).execute(new ARunnableS42S0100000_6(LIZLLL, 93));
        }
        if (ee9.LIZIZ(efk)) {
            this.LJLIL.LIZIZ(1202, 50L);
            return true;
        }
        return true;
    }
}
