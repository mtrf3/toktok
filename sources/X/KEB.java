package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KEB implements C33Q {
    public final List<KAK> LJLIL;
    public final C43I<Integer> LJLILLLLZI;

    public KEB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KEB)) {
            return false;
        }
        KEB keb = (KEB) obj;
        return o.LJ(this.LJLIL, keb.LJLIL) && o.LJ(this.LJLILLLLZI, keb.LJLILLLLZI);
    }

    public final int hashCode() {
        List<KAK> list = this.LJLIL;
        return this.LJLILLLLZI.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchContainerState(tabList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", currentTab=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ KEB(int i) {
        this(null, new C43I(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KEB(List<? extends KAK> list, C43I<Integer> currentTab) {
        o.LJIIIZ(currentTab, "currentTab");
        this.LJLIL = list;
        this.LJLILLLLZI = currentTab;
    }
}
