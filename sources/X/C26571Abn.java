package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Abn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26571Abn {
    public final boolean LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final Image LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26571Abn)) {
            return false;
        }
        C26571Abn c26571Abn = (C26571Abn) obj;
        return this.LIZ == c26571Abn.LIZ && o.LJ(this.LIZIZ, c26571Abn.LIZIZ) && this.LIZJ == c26571Abn.LIZJ && this.LIZLLL == c26571Abn.LIZLLL && o.LJ(this.LJ, c26571Abn.LJ) && o.LJ(this.LJFF, c26571Abn.LJFF) && o.LJ(this.LJI, c26571Abn.LJI) && this.LJII == c26571Abn.LJII && this.LJIIIIZZ == c26571Abn.LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = (C79062V1e.LJ(this.LIZIZ, r0 * 31, 31) + this.LIZJ) * 31;
        ?? r02 = this.LIZLLL;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        Image image = this.LJ;
        int i4 = 0;
        if (image == null) {
            hashCode = 0;
        } else {
            hashCode = image.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        String str = this.LJFF;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str2 = this.LJI;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        int i7 = (i6 + i4) * 31;
        ?? r03 = this.LJII;
        int i8 = r03;
        if (r03 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        if (!this.LJIIIIZZ) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnreachableHeadVO(needTitle=");
        LIZ.append(this.LIZ);
        LIZ.append(", unreachableTips=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", invalidCount=");
        LIZ.append(this.LIZJ);
        LIZ.append(", showShop=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", shopAvatar=");
        LIZ.append(this.LJ);
        LIZ.append(", shopName=");
        LIZ.append(this.LJFF);
        LIZ.append(", title=");
        LIZ.append(this.LJI);
        LIZ.append(", showDesc=");
        LIZ.append(this.LJII);
        LIZ.append(", showDivider=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C26571Abn(boolean z, String str, int i, boolean z2, Image image, String str2, String str3, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = z2;
        this.LJ = image;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
    }
}
