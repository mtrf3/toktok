package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.59k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1302859k {
    public final Drawable LIZ;
    public final Drawable LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    public C1302859k() {
        this(null, null, null, 0, 0, 0, 0, 0, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1302859k)) {
            return false;
        }
        C1302859k c1302859k = (C1302859k) obj;
        return o.LJ(this.LIZ, c1302859k.LIZ) && o.LJ(this.LIZIZ, c1302859k.LIZIZ) && o.LJ(this.LIZJ, c1302859k.LIZJ) && o.LJ(this.LIZLLL, c1302859k.LIZLLL) && this.LJ == c1302859k.LJ && this.LJFF == c1302859k.LJFF && this.LJI == c1302859k.LJI && this.LJII == c1302859k.LJII && this.LJIIIIZZ == c1302859k.LJIIIIZZ && this.LJIIIZ == c1302859k.LJIIIZ && this.LJIIJ == c1302859k.LJIIJ;
    }

    public final int hashCode() {
        Drawable drawable = this.LIZ;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        Drawable drawable2 = this.LIZIZ;
        int hashCode2 = (hashCode + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        return ((((((((((((((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckBoxConfig(leftHandlerRes=");
        sb.append(this.LIZ);
        sb.append(", rightHandlerRes=");
        sb.append(this.LIZIZ);
        sb.append(", lineColor=");
        sb.append(this.LIZJ);
        sb.append(", innerColor=");
        sb.append(this.LIZLLL);
        sb.append(", outerRadius=");
        sb.append(this.LJ);
        sb.append(", handlerWidth=");
        sb.append(this.LJFF);
        sb.append(", lineWidth=");
        sb.append(this.LJI);
        sb.append(", linePadding=");
        sb.append(this.LJII);
        sb.append(", frameRadius=");
        sb.append(this.LJIIIIZZ);
        sb.append(", dragBorderOuterRadius=");
        sb.append(this.LJIIIZ);
        sb.append(", dragFrameRound=");
        return UPJ.LIZLLL(sb, this.LJIIJ, ')');
    }

    public C1302859k(Drawable drawable, Drawable drawable2, Integer num, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        drawable = (i6 & 1) != 0 ? null : drawable;
        drawable2 = (i6 & 2) != 0 ? null : drawable2;
        num = (i6 & 4) != 0 ? null : num;
        i = (i6 & 16) != 0 ? C134855Qz.LIZ(4.0f) : i;
        if ((i6 & 32) != 0) {
            i7 = C134855Qz.LIZ(16.0f);
        } else {
            i7 = 0;
        }
        int LIZ = (i6 & 64) != 0 ? C134855Qz.LIZ(2.0f) : 0;
        i2 = (i6 & 128) != 0 ? C134855Qz.LIZ(1.0f) : i2;
        i3 = (i6 & 256) != 0 ? C134855Qz.LIZ(1.0f) : i3;
        i4 = (i6 & 512) != 0 ? C134855Qz.LIZ(5.0f) : i4;
        i5 = (i6 & 1024) != 0 ? C134855Qz.LIZ(2.0f) : i5;
        this.LIZ = drawable;
        this.LIZIZ = drawable2;
        this.LIZJ = num;
        this.LIZLLL = null;
        this.LJ = i;
        this.LJFF = i7;
        this.LJI = LIZ;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = i5;
    }
}
