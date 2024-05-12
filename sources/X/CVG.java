package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CVG {
    public final List<CVC> LIZ;
    public int LIZIZ;
    public CVH LIZJ;

    public CVG() {
        throw null;
    }

    public CVG(List list) {
        CVH operation = CVH.UNKNOWN;
        o.LJIIIZ(operation, "operation");
        this.LIZ = list;
        this.LIZIZ = 0;
        this.LIZJ = operation;
    }

    public final void LIZ(CVC cvc) {
        if (!this.LIZ.isEmpty()) {
            for (int size = this.LIZ.size() - 1; -1 < size; size--) {
                if (o.LJ(((CVC) ListProtector.get(this.LIZ, size)).LJLIL, cvc.LJLIL)) {
                    if (((CVC) ListProtector.get(this.LIZ, size)).LJLJL != 2) {
                        ListProtector.set(this.LIZ, size, cvc);
                    }
                    this.LIZIZ = size;
                    this.LIZJ = CVH.REPLACE;
                    return;
                }
            }
        }
        this.LIZ.add(cvc);
        this.LIZIZ = this.LIZ.size() - 1;
        this.LIZJ = CVH.INSERT;
    }
}
