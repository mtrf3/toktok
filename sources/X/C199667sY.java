package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.7sY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199667sY {
    public final boolean LIZ;
    public final Bitmap LIZIZ;

    public C199667sY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199667sY)) {
            return false;
        }
        C199667sY c199667sY = (C199667sY) obj;
        return this.LIZ == c199667sY.LIZ && o.LJ(this.LIZIZ, c199667sY.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Bitmap bitmap = this.LIZIZ;
        return i + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GenerateBitmap(isGrayBitmap=");
        LIZ.append(this.LIZ);
        LIZ.append(", bitmap=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C199667sY(int i) {
        this(null, false);
    }

    public C199667sY(Bitmap bitmap, boolean z) {
        this.LIZ = z;
        this.LIZIZ = bitmap;
    }
}
