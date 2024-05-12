package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.537, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass537 extends C53C {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass537) && o.LJ(this.LIZ, ((AnonymousClass537) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CurrentFuncTypeAction(funcType=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public AnonymousClass537(String str) {
        this.LIZ = str;
    }
}
