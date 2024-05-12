package X;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LKD {
    public final WeakReference<? extends Activity> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public LKD() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LKD)) {
            return false;
        }
        LKD lkd = (LKD) obj;
        return o.LJ(this.LIZ, lkd.LIZ) && o.LJ(this.LIZIZ, lkd.LIZIZ) && o.LJ(this.LIZJ, lkd.LIZJ) && this.LIZLLL == lkd.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendUserDialogParams(activityRef=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", previousPage=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isColdBoot=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public LKD(WeakReference weakReference, String str, String str2) {
        this.LIZ = weakReference;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = false;
    }
}
