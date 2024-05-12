package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.GXj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41679GXj {
    public final String LIZ;
    public final Bitmap LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41679GXj)) {
            return false;
        }
        C41679GXj c41679GXj = (C41679GXj) obj;
        return o.LJ(this.LIZ, c41679GXj.LIZ) && o.LJ(this.LIZIZ, c41679GXj.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Bitmap bitmap = this.LIZIZ;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GenerateForwardCoverResult(filePath=");
        LIZ.append(this.LIZ);
        LIZ.append(", bitmap=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C41679GXj(Bitmap bitmap, String filePath) {
        o.LJIIIZ(filePath, "filePath");
        this.LIZ = filePath;
        this.LIZIZ = bitmap;
    }
}
