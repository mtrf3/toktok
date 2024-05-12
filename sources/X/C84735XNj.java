package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XNj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84735XNj {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C84735XNj(String str) {
        this.LIZ = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C84735XNj) {
            return o.LJ(this.LIZ, ((C84735XNj) obj).LIZ);
        }
        return false;
    }
}
