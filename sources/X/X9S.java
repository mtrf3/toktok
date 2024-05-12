package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X9S {
    public final Object LIZ;
    public final X9H LIZIZ;
    public final InterfaceC88472Yns<Throwable, C76800UCe> LIZJ;
    public final Object LIZLLL;
    public final Throwable LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X9S)) {
            return false;
        }
        X9S x9s = (X9S) obj;
        return o.LJ(this.LIZ, x9s.LIZ) && o.LJ(this.LIZIZ, x9s.LIZIZ) && o.LJ(this.LIZJ, x9s.LIZJ) && o.LJ(this.LIZLLL, x9s.LIZLLL) && o.LJ(this.LJ, x9s.LJ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        X9H x9h = this.LIZIZ;
        int hashCode2 = (hashCode + (x9h == null ? 0 : x9h.hashCode())) * 31;
        InterfaceC88472Yns<Throwable, C76800UCe> interfaceC88472Yns = this.LIZJ;
        int hashCode3 = (hashCode2 + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode())) * 31;
        Object obj2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.LJ;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompletedContinuation(result=");
        LIZ.append(this.LIZ);
        LIZ.append(", cancelHandler=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", onCancellation=");
        LIZ.append(this.LIZJ);
        LIZ.append(", idempotentResume=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", cancelCause=");
        return C169696lJ.LIZLLL(LIZ, this.LJ, ')', LIZ);
    }

    public static X9S LIZ(X9S x9s, X9H x9h, Throwable th, int i) {
        Object obj;
        InterfaceC88472Yns<Throwable, C76800UCe> interfaceC88472Yns;
        Throwable th2 = th;
        X9H x9h2 = x9h;
        Object obj2 = null;
        if ((i & 1) != 0) {
            obj = x9s.LIZ;
        } else {
            obj = null;
        }
        if ((i & 2) != 0) {
            x9h2 = x9s.LIZIZ;
        }
        if ((i & 4) != 0) {
            interfaceC88472Yns = x9s.LIZJ;
        } else {
            interfaceC88472Yns = null;
        }
        if ((i & 8) != 0) {
            obj2 = x9s.LIZLLL;
        }
        if ((i & 16) != 0) {
            th2 = x9s.LJ;
        }
        x9s.getClass();
        return new X9S(obj, x9h2, interfaceC88472Yns, obj2, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X9S(Object obj, X9H x9h, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, Object obj2, Throwable th) {
        this.LIZ = obj;
        this.LIZIZ = x9h;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = obj2;
        this.LJ = th;
    }

    public /* synthetic */ X9S(Object obj, X9H x9h, InterfaceC88472Yns interfaceC88472Yns, Object obj2, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : x9h, (i & 4) != 0 ? null : interfaceC88472Yns, (i & 8) != 0 ? null : obj2, (i & 16) == 0 ? th : null);
    }
}
