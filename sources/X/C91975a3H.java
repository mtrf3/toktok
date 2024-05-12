package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.a3H, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91975a3H {
    public final String LIZ;
    public final Bitmap LIZIZ;
    public final String LIZJ;
    public final Bitmap LIZLLL;
    public final String LJ;
    public final Bitmap LJFF;

    public C91975a3H() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91975a3H)) {
            return false;
        }
        C91975a3H c91975a3H = (C91975a3H) obj;
        return o.LJ(this.LIZ, c91975a3H.LIZ) && o.LJ(this.LIZIZ, c91975a3H.LIZIZ) && o.LJ(this.LIZJ, c91975a3H.LIZJ) && o.LJ(this.LIZLLL, c91975a3H.LIZLLL) && o.LJ(this.LJ, c91975a3H.LJ) && o.LJ(this.LJFF, c91975a3H.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bitmap bitmap = this.LIZIZ;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Bitmap bitmap2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        String str3 = this.LJ;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Bitmap bitmap3 = this.LJFF;
        return hashCode5 + (bitmap3 != null ? bitmap3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CardOcrResult(cardNumber=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(", cardNumberImage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", expirationDate=");
        LIZ.append((Object) this.LIZJ);
        LIZ.append(", expirationDateImage=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", holderName=");
        LIZ.append((Object) this.LJ);
        LIZ.append(", holderNameImage=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91975a3H(String str, Bitmap bitmap, String str2, Bitmap bitmap2, String str3, Bitmap bitmap3) {
        this.LIZ = str;
        this.LIZIZ = bitmap;
        this.LIZJ = str2;
        this.LIZLLL = bitmap2;
        this.LJ = str3;
        this.LJFF = bitmap3;
    }
}
