package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37131cz<T> extends AbstractC261010s<T> {
    public final List<C32001Nk> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37131cz) && o.LJ(this.LIZ, ((C37131cz) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveEffectCategoryList(categoryList=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C37131cz(List<C32001Nk> list) {
        this.LIZ = list;
    }
}
