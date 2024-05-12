package X;

import android.util.Pair;
import java.util.List;

/* renamed from: X.P9l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63989P9l {
    public final String LIZ;
    public final InterfaceC63991P9n LIZIZ;
    public final List<Pair<String, String>> LIZJ;

    public C63989P9l(C63990P9m c63990P9m) {
        this.LIZ = c63990P9m.LIZ;
        InterfaceC63991P9n interfaceC63991P9n = c63990P9m.LIZIZ;
        if (interfaceC63991P9n == null) {
            this.LIZIZ = new P9Q();
        } else {
            this.LIZIZ = interfaceC63991P9n;
        }
        this.LIZJ = c63990P9m.LIZJ;
    }
}
