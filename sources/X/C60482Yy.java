package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.2Yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60482Yy {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ = 18;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60482Yy)) {
            return false;
        }
        C60482Yy c60482Yy = (C60482Yy) obj;
        return o.LJ(this.LIZ, c60482Yy.LIZ) && o.LJ(this.LIZIZ, c60482Yy.LIZIZ) && this.LIZJ == c60482Yy.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cursor(secUserId=");
        LIZ.append(this.LIZ);
        LIZ.append(", cursor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", count=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C60482Yy(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
