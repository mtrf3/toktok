package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public class W7Q implements InterfaceC81759W6x<W8X> {
    public final C81808W8u LIZ;
    public final C81808W8u LIZIZ;
    public final HashMap<String, C81808W8u> LIZJ;
    public final W6O LIZLLL;
    public final InterfaceC81759W6x<W8X> LJ;
    public final W84 LJFF;

    public boolean LJ(InterfaceC81770W7i interfaceC81770W7i) {
        return interfaceC81770W7i.LJ().LJIILIIL;
    }

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        boolean z;
        C81808W8u c81808W8u;
        W5O LJ = interfaceC81770W7i.LJ();
        if (!LJ(interfaceC81770W7i)) {
            if (interfaceC81770W7i.LJI().getValue() >= W50.DISK_CACHE.getValue()) {
                w7f.LIZIZ(1, null);
                return;
            } else {
                this.LJ.LIZIZ(w7f, interfaceC81770W7i);
                return;
            }
        }
        interfaceC81770W7i.LIZ().LIZ(interfaceC81770W7i.getId(), "DiskCacheProducer");
        W6U LIZLLL = LIZLLL(this.LIZLLL, interfaceC81770W7i);
        QGT qgt = LJ.LIZ;
        if (qgt == QGT.SMALL) {
            z = true;
        } else {
            z = false;
        }
        if (qgt != QGT.CUSTOM || TextUtils.isEmpty(LJ.LJIJ) || (c81808W8u = this.LIZJ.get(LJ.LJIJ)) == null) {
            if (z) {
                c81808W8u = this.LIZIZ;
            } else {
                c81808W8u = this.LIZ;
            }
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c81808W8u.LIZJ(LIZLLL, atomicBoolean).LIZLLL(new W7S(this, interfaceC81770W7i.LIZ(), interfaceC81770W7i.getId(), w7f, interfaceC81770W7i));
        interfaceC81770W7i.LIZLLL(new W89(atomicBoolean));
    }

    public W6U LIZLLL(W6O w6o, InterfaceC81770W7i interfaceC81770W7i) {
        return w6o.LIZ(interfaceC81770W7i.LJ(), interfaceC81770W7i.LIZIZ());
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

    public W7Q(C81808W8u c81808W8u, C81808W8u c81808W8u2, HashMap<String, C81808W8u> hashMap, W6O w6o, InterfaceC81759W6x<W8X> interfaceC81759W6x, W84 w84) {
        this.LIZ = c81808W8u;
        this.LIZIZ = c81808W8u2;
        this.LIZJ = hashMap;
        this.LIZLLL = w6o;
        this.LJ = interfaceC81759W6x;
        this.LJFF = w84;
    }
}
