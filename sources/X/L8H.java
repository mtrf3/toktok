package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class L8H {
    public L8J LIZ;

    public abstract OSZ<Boolean, L8G> LIZ();

    public abstract List<String> LIZIZ(boolean z);

    public abstract L84 LIZLLL();

    public final L8J LIZJ() {
        L8J l8j = this.LIZ;
        if (l8j != null) {
            return l8j;
        }
        o.LJIJI("processor");
        throw null;
    }

    public final String toString() {
        String LJFF = C65352Pkq.LIZ(getClass()).LJFF();
        if (LJFF == null) {
            return "TabOperator";
        }
        return LJFF;
    }
}
