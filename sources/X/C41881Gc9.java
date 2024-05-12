package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.Gc9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41881Gc9 {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final Bitmap LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41881Gc9)) {
            return false;
        }
        C41881Gc9 c41881Gc9 = (C41881Gc9) obj;
        return o.LJ(this.LIZ, c41881Gc9.LIZ) && o.LJ(this.LIZIZ, c41881Gc9.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bitmap bitmap = this.LIZIZ;
        return hashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCoverLoadResult(coverPath=");
        LIZ.append(this.LIZ);
        LIZ.append(", bitmap=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C41881Gc9(Bitmap bitmap, String str) {
        this.LIZ = str;
        this.LIZIZ = bitmap;
    }
}
