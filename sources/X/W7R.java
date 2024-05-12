package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public final class W7R implements InterfaceC81759W6x<W8X> {
    public final C81808W8u LIZ;
    public final W6O LIZIZ;
    public final W84 LIZJ;
    public final WB4 LIZLLL;
    public final InterfaceC81759W6x<W8X> LJ;

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        W5O LJ = interfaceC81770W7i.LJ();
        if (!LJ.LJIILIIL) {
            this.LJ.LIZIZ(w7f, interfaceC81770W7i);
            return;
        }
        interfaceC81770W7i.LIZ().LIZ(interfaceC81770W7i.getId(), "PartialDiskCacheProducer");
        android.net.Uri build = LJ.LIZIZ.buildUpon().appendQueryParameter("fresco_partial", "true").build();
        W6O w6o = this.LIZIZ;
        interfaceC81770W7i.LIZIZ();
        C245519kJ LJ2 = w6o.LJ(build);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.LIZ.LIZJ(LJ2, atomicBoolean).LIZLLL(new W7W(this, interfaceC81770W7i.LIZ(), interfaceC81770W7i.getId(), w7f, interfaceC81770W7i, LJ2));
        interfaceC81770W7i.LIZLLL(new W88(atomicBoolean));
    }

    public static java.util.Map<String, String> LIZJ(InterfaceC81754W6s interfaceC81754W6s, String str, boolean z, int i) {
        if (!interfaceC81754W6s.LJIIIZ(str)) {
            return null;
        }
        if (z) {
            return C65618Pp8.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C65618Pp8.of("cached_value_found", String.valueOf(z));
    }

    public final void LIZLLL(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i, W6U w6u, W8X w8x) {
        this.LJ.LIZIZ(new W7T(w7f, this.LIZ, w6u, this.LIZJ, this.LIZLLL, w8x), interfaceC81770W7i);
    }

    public W7R(C81808W8u c81808W8u, W6O w6o, W84 w84, WB4 wb4, InterfaceC81759W6x<W8X> interfaceC81759W6x) {
        this.LIZ = c81808W8u;
        this.LIZIZ = w6o;
        this.LIZJ = w84;
        this.LIZLLL = wb4;
        this.LJ = interfaceC81759W6x;
    }
}
