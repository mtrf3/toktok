package X;

import java.util.HashMap;

/* renamed from: X.W7a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81762W7a implements InterfaceC81759W6x<W8X> {
    public final C81808W8u LIZ;
    public final C81808W8u LIZIZ;
    public final HashMap<String, C81808W8u> LIZJ;
    public final W6O LIZLLL;
    public final InterfaceC81759W6x<W8X> LJ;
    public final W84 LJFF;

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        if (interfaceC81770W7i.LJI().getValue() >= W50.DISK_CACHE.getValue()) {
            w7f.LIZIZ(1, null);
        } else {
            this.LJ.LIZIZ(new W7P(w7f, interfaceC81770W7i, this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, interfaceC81770W7i.LJ().LJIILIIL, this.LJFF), interfaceC81770W7i);
        }
    }

    public C81762W7a(C81808W8u c81808W8u, C81808W8u c81808W8u2, HashMap<String, C81808W8u> hashMap, W6O w6o, InterfaceC81759W6x<W8X> interfaceC81759W6x, W84 w84) {
        this.LIZ = c81808W8u;
        this.LIZIZ = c81808W8u2;
        this.LIZJ = hashMap;
        this.LIZLLL = w6o;
        this.LJ = interfaceC81759W6x;
        this.LJFF = w84;
    }
}
