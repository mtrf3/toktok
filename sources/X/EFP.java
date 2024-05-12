package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EFP extends EFT implements Handler.Callback {
    public final EFV LJLIL = new EFV(this);
    public boolean LJLILLLLZI;

    @Override // X.EFT, X.InterfaceC36091EEl
    public final void LIZ() {
        this.LJLIL.LIZIZ(LinkMicRtcMixBitrateSetting.DEFAULT, 60000L);
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        if (components.isEmpty()) {
            return;
        }
        C37179EiV.LIZIZ(EFN.P0).execute(new ARunnableS25S0200000_6(this, components, 43));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        EFM LIZJ;
        o.LJIIIZ(msg, "msg");
        this.LJLILLLLZI = true;
        C36093EEn.LIZ.getClass();
        EFL efl = C36093EEn.LIZJ;
        if (efl.LIZIZ(EFN.BOOT_FINISH)) {
            this.LJLIL.LIZIZ(1204, ((Number) DNL.LIZJ.getValue()).longValue());
        } else {
            EFN efn = EFN.IDLE;
            if (efl.LIZIZ(efn) && (LIZJ = efl.LIZJ(efn)) != null) {
                C37179EiV.LIZIZ(efn).execute(new ARunnableS42S0100000_6(LIZJ, 98));
            }
            if (efl.LIZIZ(efn)) {
                this.LJLIL.LIZIZ(1204, ((Number) DNL.LIZJ.getValue()).longValue());
            }
        }
        return true;
    }
}
