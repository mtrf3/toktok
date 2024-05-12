package X;

import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.o;

/* renamed from: X.Cc2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31682Cc2 {
    public BitmapDrawable LIZ = null;
    public boolean LIZIZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31682Cc2)) {
            return false;
        }
        C31682Cc2 c31682Cc2 = (C31682Cc2) obj;
        return o.LJ(this.LIZ, c31682Cc2.LIZ) && this.LIZIZ == c31682Cc2.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        BitmapDrawable bitmapDrawable = this.LIZ;
        int hashCode = (bitmapDrawable == null ? 0 : bitmapDrawable.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LightSensitiveBlackResource(bitmapDrawable=");
        LIZ.append(this.LIZ);
        LIZ.append(", hasCropped=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }
}
