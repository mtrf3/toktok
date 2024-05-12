package X;

import com.zhiliaoapp.musically.R;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.7WH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7WH {
    public final String LIZ;
    public final Long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public C7WH() {
        this(null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7WH)) {
            return false;
        }
        C7WH c7wh = (C7WH) obj;
        return o.LJ(this.LIZ, c7wh.LIZ) && o.LJ(this.LIZIZ, c7wh.LIZIZ) && this.LIZJ == c7wh.LIZJ && this.LIZLLL == c7wh.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.LIZIZ;
        return ((((hashCode + (l != null ? l.hashCode() : 0)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FlashSaleCountDownModel(desc=");
        LIZ.append(this.LIZ);
        LIZ.append(", startCountDownTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", descFont=");
        LIZ.append(this.LIZJ);
        LIZ.append(", descColor=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C7WH(String str, Long l, int i) {
        int i2;
        str = (i & 1) != 0 ? "" : str;
        l = (i & 2) != 0 ? 0L : l;
        if ((i & 4) != 0) {
            i2 = 41;
        } else {
            i2 = 0;
        }
        int i3 = (i & 8) != 0 ? R.attr.iu : 0;
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
