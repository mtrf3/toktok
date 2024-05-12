package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124674ut {
    public final String LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final Float LIZLLL;
    public final Float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C124674ut)) {
            return false;
        }
        C124674ut c124674ut = (C124674ut) obj;
        return o.LJ(this.LIZ, c124674ut.LIZ) && Float.compare(this.LIZIZ, c124674ut.LIZIZ) == 0 && Float.compare(this.LIZJ, c124674ut.LIZJ) == 0 && o.LJ(this.LIZLLL, c124674ut.LIZLLL) && o.LJ(this.LJ, c124674ut.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageStickerParam(imagePath=");
        LIZ.append(this.LIZ);
        LIZ.append(", imageWidth=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imageHeight=");
        LIZ.append(this.LIZJ);
        LIZ.append(", transformX=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", transformY=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        Float f = this.LIZLLL;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        Float f2 = this.LJ;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return i2 + i;
    }

    public C124674ut(String imagePath, float f, float f2, Float f3, Float f4) {
        o.LJIIIZ(imagePath, "imagePath");
        this.LIZ = imagePath;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
    }
}
