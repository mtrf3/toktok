package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61172af {
    public final String LIZ;

    public C61172af() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C61172af) && o.LJ(this.LIZ, ((C61172af) obj).LIZ);
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
        LIZ.append("HotWordToastState(toastMessage=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C61172af(String str) {
        this.LIZ = str;
    }
}
