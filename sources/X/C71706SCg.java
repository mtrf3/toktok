package X;

import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.SCg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71706SCg {
    public InterfaceC71722SCw LIZ;
    public C71735SDj LIZIZ;
    public int LIZJ;
    public final int LIZLLL;

    public C71706SCg() {
        this(0);
    }

    public final int hashCode() {
        return this.LIZLLL;
    }

    public C71706SCg(int i) {
        C71735SDj c71735SDj = new C71735SDj("", 7);
        this.LIZ = null;
        this.LIZIZ = c71735SDj;
        this.LIZJ = 6;
        this.LIZLLL = UUID.randomUUID().hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C71706SCg.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.input.InputChangeable");
        C71706SCg c71706SCg = (C71706SCg) obj;
        if (o.LJ(this.LIZ, c71706SCg.LIZ) && o.LJ(this.LIZIZ, c71706SCg.LIZIZ) && this.LIZJ == c71706SCg.LIZJ) {
            return true;
        }
        return false;
    }
}
