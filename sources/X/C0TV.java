package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.0TV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TV {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0TV)) {
            return false;
        }
        C0TV c0tv = (C0TV) obj;
        return o.LJ(this.LIZ, c0tv.LIZ) && o.LJ(this.LIZIZ, c0tv.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestStickerImageBean(key=");
        LIZ.append(this.LIZ);
        LIZ.append(", imagePath=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C0TV(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
