package X;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class NR7 implements NSR {
    public final NSR LIZ;

    @Override // X.NRC
    public final InterfaceC59118NIc LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.NRC
    public final void LIZIZ(InterfaceC59118NIc listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LIZIZ(listener);
    }

    @Override // X.NRC
    public void LIZJ(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZJ(nrf, context, i);
    }

    @Override // X.NRC
    public final void LIZLLL(Context context, NRF nrf) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZLLL(context, nrf);
    }

    @Override // X.NSR
    public final String LJ(NRF nrf) {
        return this.LIZ.LJ(nrf);
    }

    @Override // X.NRC
    public void LJFF(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJFF(nrf, context, i);
    }

    @Override // X.NRC
    public void LJI(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJI(nrf, context, i);
    }

    @Override // X.NRC
    public final void LJII(Context context, List adVerifications, NRF nrf) {
        o.LJIIIZ(adVerifications, "adVerifications");
        this.LIZ.LJII(context, adVerifications, nrf);
    }

    @Override // X.NRC
    public void LJIIIIZZ(Context context, NRF nrf) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJIIIIZZ(context, nrf);
    }

    @Override // X.NRC
    public void LJIIIZ(NRF nrf, View view, List friendlyObstructions) {
        o.LJIIIZ(friendlyObstructions, "friendlyObstructions");
        this.LIZ.LJIIIZ(nrf, view, friendlyObstructions);
    }

    @Override // X.NRC
    public void LJIIJ(NRF nrf, Context context, int i, View view) {
        this.LIZ.LJIIJ(nrf, context, i, view);
    }

    @Override // X.NRC
    public void LJIIJJI(NRF nrf, Context context, View adView, List<? extends View> friendlyView) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(adView, "adView");
        o.LJIIIZ(friendlyView, "friendlyView");
        this.LIZ.LJIIJJI(nrf, context, adView, friendlyView);
    }

    @Override // X.NRC
    public final void LJIIL(Context context, NRF nrf) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJIIL(context, nrf);
    }

    public NR7(NSR base) {
        o.LJIIIZ(base, "base");
        this.LIZ = base;
    }
}
