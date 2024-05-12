package X;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.9Xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238479Xn {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final EnumC57171McB LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final Bundle LJIIIZ;

    public final int hashCode() {
        return Arrays.hashCode(new String[]{this.LIZ, this.LIZIZ});
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkParams(linkId=");
        LIZ.append(this.LIZ);
        LIZ.append(", uid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", secUid=");
        LIZ.append(this.LIZJ);
        LIZ.append(", checksum=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", shareType=");
        LIZ.append(this.LJ);
        LIZ.append(", shareSource=");
        LIZ.append(this.LJFF);
        LIZ.append(", timestamp=");
        LIZ.append(this.LJI);
        LIZ.append(", legacyItemId=");
        LIZ.append(this.LJII);
        LIZ.append(", inviteScene=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", extra=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C238479Xn) {
            C238479Xn c238479Xn = (C238479Xn) obj;
            if (o.LJ(c238479Xn.LIZ, this.LIZ) && o.LJ(c238479Xn.LIZIZ, this.LIZIZ)) {
                return true;
            }
        }
        return false;
    }

    public C238479Xn(String str, String str2, String str3, String str4, EnumC57171McB shareType, String str5, String str6, String str7, String str8) {
        o.LJIIIZ(shareType, "shareType");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = shareType;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = null;
    }
}
