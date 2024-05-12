package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1d0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37141d0<T> extends AbstractC261010s<T> {
    public final String LIZ;
    public final List<T> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37141d0)) {
            return false;
        }
        C37141d0 c37141d0 = (C37141d0) obj;
        return o.LJ(this.LIZ, c37141d0.LIZ) && o.LJ(this.LIZIZ, c37141d0.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveEffectCollectionEffectList(category=");
        LIZ.append(this.LIZ);
        LIZ.append(", collectionEffectList=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37141d0(String category, List<? extends T> collectionEffectList) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(collectionEffectList, "collectionEffectList");
        this.LIZ = category;
        this.LIZIZ = collectionEffectList;
    }
}
