package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.80U, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80U {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final float LIZLLL;
    public final float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80U)) {
            return false;
        }
        C80U c80u = (C80U) obj;
        return o.LJ(this.LIZ, c80u.LIZ) && o.LJ(this.LIZIZ, c80u.LIZIZ) && o.LJ(this.LIZJ, c80u.LIZJ) && Float.compare(this.LIZLLL, c80u.LIZLLL) == 0 && Float.compare(this.LJ, c80u.LJ) == 0;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Aweme aweme = this.LIZ;
        int i = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.LIZIZ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LIZJ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Float.floatToIntBits(this.LJ) + C47959Irz.LIZIZ(this.LIZLLL, (i3 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FlipScale(aweme=");
        LIZ.append(this.LIZ);
        LIZ.append(", eventType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", channelKey=");
        LIZ.append(this.LIZJ);
        LIZ.append(", scaleMin=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", scaleMax=");
        return C74221TAz.LIZLLL(LIZ, this.LJ, ')', LIZ);
    }

    public C80U(Aweme aweme, String str, String str2, float f, float f2) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = f;
        this.LJ = f2;
    }
}
