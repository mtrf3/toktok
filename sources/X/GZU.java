package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZU {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final UrlModel LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GZU() {
        /*
            r3 = this;
            r2 = 0
            r1 = 15
            r0 = 0
            r3.<init>(r0, r2, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GZU.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GZU)) {
            return false;
        }
        GZU gzu = (GZU) obj;
        return o.LJ(this.LIZ, gzu.LIZ) && this.LIZIZ == gzu.LIZIZ && this.LIZJ == gzu.LIZJ && o.LJ(this.LIZLLL, gzu.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        UrlModel urlModel = this.LIZLLL;
        return hashCode + (urlModel == null ? 0 : urlModel.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageThumbnail(path=");
        LIZ.append(this.LIZ);
        LIZ.append(", width=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", height=");
        LIZ.append(this.LIZJ);
        LIZ.append(", urlModel=");
        return C31461Li.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ GZU(String str, int i, int i2, int i3) {
        this((i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (UrlModel) null, (i3 & 1) != 0 ? "" : str);
    }

    public GZU(int i, int i2, UrlModel urlModel, String path) {
        o.LJIIIZ(path, "path");
        this.LIZ = path;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = urlModel;
    }
}
