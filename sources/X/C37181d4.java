package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1d4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37181d4<T> extends AbstractC261010s<T> {
    public final C1QC LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37181d4) && o.LJ(this.LIZ, ((C37181d4) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecentEffectList(effectPanel=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C37181d4(C1QC effectPanel) {
        o.LJIIIZ(effectPanel, "effectPanel");
        this.LIZ = effectPanel;
    }
}
