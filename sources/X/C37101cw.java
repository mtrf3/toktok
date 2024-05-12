package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.1cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37101cw<T> extends AbstractC261010s<T> {
    public final T LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37101cw)) {
            return false;
        }
        C37101cw c37101cw = (C37101cw) obj;
        return o.LJ(this.LIZ, c37101cw.LIZ) && this.LIZIZ == c37101cw.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ItemDownloading(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(", progress=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37101cw(int i, Object effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
        this.LIZIZ = i;
    }
}
