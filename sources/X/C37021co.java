package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37021co<T> extends AbstractC261010s<T> {
    public final C1QC LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37021co) && o.LJ(this.LIZ, ((C37021co) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FavoriteEffectList(effectPanel=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C37021co(C1QC effectPanel) {
        o.LJIIIZ(effectPanel, "effectPanel");
        this.LIZ = effectPanel;
    }
}
