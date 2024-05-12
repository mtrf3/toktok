package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.o;

/* renamed from: X.WkO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83160WkO {
    public final ComposerBeauty LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ComposerBeautyDownload(beauty=");
        LIZ.append(this.LIZ);
        LIZ.append(", unzipPath=");
        return JBR.LJFF(LIZ, this.LIZIZ, ")", LIZ);
    }

    public C83160WkO(ComposerBeauty beauty) {
        String unzipPath = beauty.getEffect().getUnzipPath();
        o.LJIIIZ(beauty, "beauty");
        o.LJIIIZ(unzipPath, "unzipPath");
        this.LIZ = beauty;
        this.LIZIZ = unzipPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C83160WkO) {
            return o.LJ(((C83160WkO) obj).LIZIZ, this.LIZIZ);
        }
        return false;
    }
}
