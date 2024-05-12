package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.E2h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35775E2h {
    public final String LIZ;
    public final Integer LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35775E2h)) {
            return false;
        }
        C35775E2h c35775E2h = (C35775E2h) obj;
        return o.LJ(this.LIZ, c35775E2h.LIZ) && o.LJ(this.LIZIZ, c35775E2h.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckServiceInfo(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", priority=");
        return s0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35775E2h(String str, Integer num) {
        this.LIZ = str;
        this.LIZIZ = num;
    }
}
