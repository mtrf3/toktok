package X;

import com.zhiliaoapp.musically.R;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.56s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1295856s {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final EnumC1296456y LJFF;
    public final int LJI;

    public C1295856s() {
        this(0, 0, 0, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1295856s)) {
            return false;
        }
        C1295856s c1295856s = (C1295856s) obj;
        return this.LIZ == c1295856s.LIZ && this.LIZIZ == c1295856s.LIZIZ && this.LIZJ == c1295856s.LIZJ && this.LIZLLL == c1295856s.LIZLLL && o.LJ(this.LJ, c1295856s.LJ) && this.LJFF == c1295856s.LJFF && this.LJI == c1295856s.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((((((r0 * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        return ((this.LJFF.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31)) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownloadIconConfig(enableDownloadIcon=");
        LIZ.append(this.LIZ);
        LIZ.append(", iconWidth=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", iconHeight=");
        LIZ.append(this.LIZJ);
        LIZ.append(", iconResource=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", resourceDownLoadingJson=");
        LIZ.append(this.LJ);
        LIZ.append(", downloadIconPosition=");
        LIZ.append(this.LJFF);
        LIZ.append(", margin=");
        return b0.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public C1295856s(int i, int i2, int i3, EnumC1296456y downloadIconPosition, int i4) {
        boolean z;
        String str;
        if ((i4 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        i = (i4 & 2) != 0 ? 12 : i;
        i2 = (i4 & 4) != 0 ? 12 : i2;
        i3 = (i4 & 8) != 0 ? R.drawable.ars : i3;
        if ((i4 & 16) != 0) {
            str = "lark_loading_icon.json";
        } else {
            str = null;
        }
        downloadIconPosition = (i4 & 32) != 0 ? EnumC1296456y.RIGHT_TOP : downloadIconPosition;
        int i5 = (i4 & 64) != 0 ? 3 : 0;
        o.LJIIIZ(downloadIconPosition, "downloadIconPosition");
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = str;
        this.LJFF = downloadIconPosition;
        this.LJI = i5;
    }
}
