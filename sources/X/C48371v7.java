package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1v7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48371v7<T> implements InterfaceC41451jx<T> {
    public final int LIZ;

    public C48371v7() {
        this(0);
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public C48371v7(int i) {
        this.LIZ = 0;
    }

    @Override // X.C0Q2
    public final <V extends C0Q9> C1J0<V> LIZ(C0QC<T, V> converter) {
        o.LJIIIZ(converter, "converter");
        return new C41421ju(this.LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C48371v7) || ((C48371v7) obj).LIZ != this.LIZ) {
            return false;
        }
        return true;
    }
}
