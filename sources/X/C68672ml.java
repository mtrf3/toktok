package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.2ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68672ml {
    public final Bitmap LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final java.util.Map<String, String> LIZLLL;

    public C68672ml() {
        this(null, null, 3000L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68672ml)) {
            return false;
        }
        C68672ml c68672ml = (C68672ml) obj;
        return o.LJ(this.LIZ, c68672ml.LIZ) && o.LJ(this.LIZIZ, c68672ml.LIZIZ) && this.LIZJ == c68672ml.LIZJ && o.LJ(this.LIZLLL, c68672ml.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Bitmap bitmap = this.LIZ;
        int i = 0;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.LIZIZ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZJ, (i2 + hashCode2) * 31, 31);
        java.util.Map<String, String> map = this.LIZLLL;
        if (map != null) {
            i = map.hashCode();
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopCartTooltip(icon=");
        LIZ.append(this.LIZ);
        LIZ.append(", text=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZJ);
        LIZ.append(", bubbleExtraParams=");
        return C15890jp.LIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C68672ml(Bitmap bitmap, String str, long j, java.util.Map<String, String> map) {
        this.LIZ = bitmap;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = map;
    }
}
