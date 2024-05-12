package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1cv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37091cv<T> extends AbstractC261010s<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37091cv) && o.LJ(this.LIZ, ((C37091cv) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ItemDownloadSuccess(effect=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C37091cv(T effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
    }
}
