package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147105py {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C147105py)) {
            return false;
        }
        C147105py c147105py = (C147105py) obj;
        return this.LIZ == c147105py.LIZ && this.LIZIZ == c147105py.LIZIZ && o.LJ(this.LIZJ, c147105py.LIZJ) && this.LIZLLL == c147105py.LIZLLL && o.LJ(this.LJ, c147105py.LJ) && o.LJ(this.LJFF, c147105py.LJFF) && o.LJ(this.LJI, c147105py.LJI) && this.LJII == c147105py.LJII && o.LJ(this.LJIIIIZZ, c147105py.LJIIIIZZ) && this.LJIIIZ == c147105py.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int LJ = (C79062V1e.LJ(this.LIZJ, (i2 + i3) * 31, 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (LJ + hashCode) * 31;
        String str2 = this.LJFF;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJI, (i5 + hashCode2) * 31, 31);
        ?? r03 = this.LJII;
        int i6 = r03;
        if (r03 != 0) {
            i6 = 1;
        }
        int i7 = (LJ2 + i6) * 31;
        String str3 = this.LJIIIIZZ;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        int i8 = (i7 + i4) * 31;
        if (!this.LJIIIZ) {
            i = 0;
        }
        return i8 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextStickerInputParams(addText=");
        LIZ.append(this.LIZ);
        LIZ.append(", addAnchor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", textAddType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isEditorPro=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", textType=");
        LIZ.append(this.LJ);
        LIZ.append(", languageCode=");
        LIZ.append(this.LJFF);
        LIZ.append(", fontTitle=");
        LIZ.append(this.LJI);
        LIZ.append(", hasReadText=");
        LIZ.append(this.LJII);
        LIZ.append(", speakerID=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", isEdited=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public /* synthetic */ C147105py(boolean z, boolean z2, int i, String str, String str2, String str3, boolean z3, String str4) {
        this(z, z2, "user_click", i, str, str2, str3, z3, str4, false);
    }

    public C147105py(boolean z, boolean z2, String textAddType, int i, String str, String str2, String fontTitle, boolean z3, String str3, boolean z4) {
        o.LJIIIZ(textAddType, "textAddType");
        o.LJIIIZ(fontTitle, "fontTitle");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = textAddType;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = fontTitle;
        this.LJII = z3;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = z4;
    }
}
