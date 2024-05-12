package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class APY {
    public final Animatable LIZ;
    public final boolean LIZIZ;
    public final AU5 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APY)) {
            return false;
        }
        APY apy = (APY) obj;
        return o.LJ(this.LIZ, apy.LIZ) && this.LIZIZ == apy.LIZIZ && this.LIZJ == apy.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Animatable animatable = this.LIZ;
        int hashCode = (animatable == null ? 0 : animatable.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        AU5 au5 = this.LIZJ;
        return i2 + (au5 != null ? au5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoadImageCallbackData(animatable=");
        LIZ.append(this.LIZ);
        LIZ.append(", isSuccess=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imageType=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public APY(Animatable animatable, boolean z, AU5 au5) {
        this.LIZ = animatable;
        this.LIZIZ = z;
        this.LIZJ = au5;
    }
}
