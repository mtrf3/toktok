package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZsN, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91299ZsN {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C91299ZsN(String str) {
        this.LIZ = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C91299ZsN) {
            return o.LJ(this.LIZ, ((C91299ZsN) obj).LIZ);
        }
        return false;
    }
}
