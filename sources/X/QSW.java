package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class QSW {
    public Context LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public int LJ = 1;

    public final QSZ LIZ() {
        String str;
        int i = this.LJ;
        if (i != 1 || this.LIZ != null) {
            String str2 = this.LIZIZ;
            if (str2 != null && (str = this.LIZJ) != null) {
                return new QSZ(this.LIZ, str2, str, i, this.LIZLLL);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sdkName or sdkVersion is invalid. sdkName = ");
            LIZ.append(this.LIZIZ);
            LIZ.append(", sdkVersion = ");
            LIZ.append(this.LIZJ);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        throw new IllegalArgumentException("context is null");
    }
}
