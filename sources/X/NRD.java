package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NRD extends NR7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NRD(NSR base) {
        super(base);
        o.LJIIIZ(base, "base");
    }

    @Override // X.NR7, X.NRC
    public final void LIZJ(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        super.LIZJ(nrf, context, i);
        NNV.LJ(nrf.LJIIIIZZ, "resume", null);
    }

    @Override // X.NR7, X.NRC
    public final void LJFF(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        super.LJFF(nrf, context, i);
        NNV.LJ(nrf.LJIIIIZZ, "complete", "play_over");
    }

    @Override // X.NR7, X.NRC
    public final void LJI(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        super.LJI(nrf, context, i);
        NNV.LJ(nrf.LJIIIIZZ, "pause", null);
    }

    @Override // X.NR7, X.NRC
    public final void LJIIJ(NRF nrf, Context context, int i, View view) {
        super.LJIIJ(nrf, context, i, view);
        if (i == 0 && nrf.LJII) {
            NNV.LJ(nrf.LJIIIIZZ, "playerExpand", null);
            NNV.LJ(nrf.LJIIIIZZ, "fullscreen", null);
        }
    }
}
