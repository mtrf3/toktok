package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ggf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42161Ggf {
    public final Object LIZ;
    public final InterfaceC88472Yns<Throwable, C76800UCe> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42161Ggf)) {
            return false;
        }
        C42161Ggf c42161Ggf = (C42161Ggf) obj;
        return o.LJ(this.LIZ, c42161Ggf.LIZ) && o.LJ(this.LIZIZ, c42161Ggf.LIZIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        return this.LIZIZ.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompletedWithCancellation(result=");
        LIZ.append(this.LIZ);
        LIZ.append(", onCancellation=");
        return C249109q6.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C42161Ggf(Object obj, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        this.LIZ = obj;
        this.LIZIZ = interfaceC88472Yns;
    }
}
