package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SE0 {
    public final int LIZ;
    public final Drawable LIZIZ;
    public final C2068389v LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final Object LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SE0() {
        /*
            r6 = this;
            r1 = 0
            r4 = 0
            r5 = 127(0x7f, float:1.78E-43)
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SE0.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SE0)) {
            return false;
        }
        SE0 se0 = (SE0) obj;
        return this.LIZ == se0.LIZ && o.LJ(this.LIZIZ, se0.LIZIZ) && o.LJ(this.LIZJ, se0.LIZJ) && this.LIZLLL == se0.LIZLLL && this.LJ == se0.LJ && o.LJ(this.LJFF, se0.LJFF) && o.LJ(this.LJI, se0.LJI);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Drawable drawable = this.LIZIZ;
        int hashCode = (i + (drawable == null ? 0 : drawable.hashCode())) * 31;
        C2068389v c2068389v = this.LIZJ;
        int hashCode2 = (((((hashCode + (c2068389v == null ? 0 : c2068389v.hashCode())) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        String str = this.LJFF;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.LJI;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IconViewData(visible=");
        LIZ.append(this.LIZ);
        LIZ.append(", drawable=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", tuxIcon=");
        LIZ.append(this.LIZJ);
        LIZ.append(", resID=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", tintColorRes=");
        LIZ.append(this.LJ);
        LIZ.append(", url=");
        LIZ.append(this.LJFF);
        LIZ.append(", obj=");
        return U26.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public static SE0 LIZ(SE0 se0, int i, String str, int i2) {
        Drawable drawable;
        C2068389v c2068389v;
        int i3;
        int i4;
        String str2 = str;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i5 = se0.LIZ;
        }
        Object obj = null;
        if ((i2 & 2) != 0) {
            drawable = se0.LIZIZ;
        } else {
            drawable = null;
        }
        if ((i2 & 4) != 0) {
            c2068389v = se0.LIZJ;
        } else {
            c2068389v = null;
        }
        if ((i2 & 8) != 0) {
            i3 = se0.LIZLLL;
        } else {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            i4 = se0.LJ;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            str2 = se0.LJFF;
        }
        if ((i2 & 64) != 0) {
            obj = se0.LJI;
        }
        se0.getClass();
        return new SE0(i5, drawable, c2068389v, i3, i4, str2, obj);
    }

    public /* synthetic */ SE0(int i, int i2, int i3, Object obj, int i4) {
        this((i4 & 1) != 0 ? 8 : i, null, null, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, null, (i4 & 64) != 0 ? null : obj);
    }

    public SE0(int i, Drawable drawable, C2068389v c2068389v, int i2, int i3, String str, Object obj) {
        this.LIZ = i;
        this.LIZIZ = drawable;
        this.LIZJ = c2068389v;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = str;
        this.LJI = obj;
    }
}
