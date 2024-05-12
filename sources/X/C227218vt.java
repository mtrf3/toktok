package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227218vt implements C33Q {
    public final AbstractC72932td<List<InterfaceC57784Mm4>> LJLIL;
    public final List<C227128vk> LJLILLLLZI;

    public C227218vt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C227218vt)) {
            return false;
        }
        C227218vt c227218vt = (C227218vt) obj;
        return o.LJ(this.LJLIL, c227218vt.LJLIL) && o.LJ(this.LJLILLLLZI, c227218vt.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        List<C227128vk> list = this.LJLILLLLZI;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchFriendListState(allItems=");
        LIZ.append(this.LJLIL);
        LIZ.append(", userItems=");
        return C1NE.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C227218vt(int i) {
        this(C33X.LIZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C227218vt(AbstractC72932td<? extends List<? extends InterfaceC57784Mm4>> allItems, List<C227128vk> list) {
        o.LJIIIZ(allItems, "allItems");
        this.LJLIL = allItems;
        this.LJLILLLLZI = list;
    }

    public static C227218vt LIZ(C227218vt c227218vt, AbstractC72932td allItems) {
        List<C227128vk> list = c227218vt.LJLILLLLZI;
        c227218vt.getClass();
        o.LJIIIZ(allItems, "allItems");
        return new C227218vt(allItems, list);
    }
}
