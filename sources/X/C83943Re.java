package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83943Re<R> {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C83983Ri.LJLIL);

    public final AbstractC113374cf LIZIZ() {
        for (AbstractC113374cf abstractC113374cf : (List) this.LIZ.getValue()) {
            if (abstractC113374cf.LJI) {
                return abstractC113374cf;
            }
        }
        return null;
    }

    public final void LIZ(AbstractC113374cf loader) {
        o.LJIIIZ(loader, "loader");
        ((List) this.LIZ.getValue()).add(loader);
    }
}
