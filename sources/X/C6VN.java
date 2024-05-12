package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.6VN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VN {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final Integer LJIIIZ;

    public C6VN() {
        this(false, null, null, null, null, null, 0, 0, 0, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6VN)) {
            return false;
        }
        C6VN c6vn = (C6VN) obj;
        return this.LIZ == c6vn.LIZ && o.LJ(this.LIZIZ, c6vn.LIZIZ) && o.LJ(this.LIZJ, c6vn.LIZJ) && o.LJ(this.LIZLLL, c6vn.LIZLLL) && o.LJ(this.LJ, c6vn.LJ) && o.LJ(this.LJFF, c6vn.LJFF) && this.LJI == c6vn.LJI && this.LJII == c6vn.LJII && this.LJIIIIZZ == c6vn.LJIIIIZZ && o.LJ(this.LJIIIZ, c6vn.LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = (((((C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, r0 * 31, 31), 31), 31), 31), 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31;
        Integer num = this.LJIIIZ;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectTextMobParams(isEditPostPage=");
        LIZ.append(this.LIZ);
        LIZ.append(", textId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fontId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", fontName=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", textColor=");
        LIZ.append(this.LJ);
        LIZ.append(", textStyle=");
        LIZ.append(this.LJFF);
        LIZ.append(", isText=");
        LIZ.append(this.LJI);
        LIZ.append(", isPicAdjust=");
        LIZ.append(this.LJII);
        LIZ.append(", isToasted=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", awemeType=");
        return s0.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C6VN(boolean z, String textId, String fontId, String fontName, String textColor, String str, int i, int i2, int i3, Integer num, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Integer num2 = num;
        z = (i4 & 1) != 0 ? false : z;
        textId = (i4 & 2) != 0 ? "" : textId;
        fontId = (i4 & 4) != 0 ? "" : fontId;
        fontName = (i4 & 8) != 0 ? "" : fontName;
        textColor = (i4 & 16) != 0 ? "" : textColor;
        String textStyle = (i4 & 32) == 0 ? str : "";
        i5 = (i4 & 64) != 0 ? 0 : i5;
        i6 = (i4 & 128) != 0 ? 0 : i6;
        i7 = (i4 & 256) != 0 ? 0 : i7;
        num2 = (i4 & 512) != 0 ? null : num2;
        o.LJIIIZ(textId, "textId");
        o.LJIIIZ(fontId, "fontId");
        o.LJIIIZ(fontName, "fontName");
        o.LJIIIZ(textColor, "textColor");
        o.LJIIIZ(textStyle, "textStyle");
        this.LIZ = z;
        this.LIZIZ = textId;
        this.LIZJ = fontId;
        this.LIZLLL = fontName;
        this.LJ = textColor;
        this.LJFF = textStyle;
        this.LJI = i5;
        this.LJII = i6;
        this.LJIIIIZZ = i7;
        this.LJIIIZ = num2;
    }
}
