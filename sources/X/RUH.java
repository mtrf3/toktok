package X;

import com.bytedance.android.livesdk.model.message.ext.GImage;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RUH {
    public final Integer LIZ;
    public final String LIZIZ;
    public final GImage LIZJ;
    public final RU7 LIZLLL;

    public RUH() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RUH)) {
            return false;
        }
        RUH ruh = (RUH) obj;
        return o.LJ(this.LIZ, ruh.LIZ) && o.LJ(this.LIZIZ, ruh.LIZIZ) && o.LJ(this.LIZJ, ruh.LIZJ) && o.LJ(this.LIZLLL, ruh.LIZLLL);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        GImage gImage = this.LIZJ;
        int hashCode3 = (hashCode2 + (gImage == null ? 0 : gImage.hashCode())) * 31;
        RU7 ru7 = this.LIZLLL;
        return hashCode3 + (ru7 != null ? ru7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonData(style=");
        LIZ.append(this.LIZ);
        LIZ.append(", text=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", image=");
        LIZ.append(this.LIZJ);
        LIZ.append(", localIcon=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RUH(Integer num, String str, GImage gImage, RU7 ru7, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        gImage = (i & 4) != 0 ? null : gImage;
        ru7 = (i & 8) != 0 ? null : ru7;
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = gImage;
        this.LIZLLL = ru7;
    }
}
