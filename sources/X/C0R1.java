package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0R1, reason: invalid class name */
/* loaded from: classes.dex */
public class C0R1 {
    public final Object LJLIL;

    public final boolean LIZIZ() {
        C0R2 value = (C0R2) this.LJLIL;
        o.LJIIJ(value, "$this$value");
        if (value.LIZIZ() != 0) {
            return true;
        }
        return false;
    }

    public C0R1(boolean z) {
        this.LJLIL = new C0R2(z ? 1 : 0);
    }

    public final void LIZ(IUK iuk) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                iuk.accept(obj);
            }
        }
    }

    public final void LIZJ(Object obj) {
        if (obj == null || ((List) this.LJLIL).contains(obj)) {
            return;
        }
        ((List) this.LJLIL).add(obj);
    }

    public final void LIZLLL(boolean z) {
        C0R2 value = (C0R2) this.LJLIL;
        o.LJIIJ(value, "$this$value");
        value.LIZ.set(z ? 1 : 0);
    }
}
