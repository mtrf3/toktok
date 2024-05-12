package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.GZb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41723GZb {
    public final String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public Bitmap LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41723GZb)) {
            return false;
        }
        C41723GZb c41723GZb = (C41723GZb) obj;
        return o.LJ(this.LIZ, c41723GZb.LIZ) && this.LIZIZ == c41723GZb.LIZIZ && this.LIZJ == c41723GZb.LIZJ && this.LIZLLL == c41723GZb.LIZLLL && this.LJ == c41723GZb.LJ && o.LJ(this.LJFF, c41723GZb.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + this.LJ) * 31;
        Bitmap bitmap = this.LJFF;
        return i2 + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BitmapDescriptor(path=");
        LIZ.append(this.LIZ);
        LIZ.append(", width=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", height=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isRTL=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", nickNameStyle=");
        LIZ.append(this.LJ);
        LIZ.append(", bitmap=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C41723GZb(String path, Bitmap bitmap, int i, int i2, int i3, boolean z) {
        o.LJIIIZ(path, "path");
        this.LIZ = path;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = i3;
        this.LJFF = bitmap;
    }
}
