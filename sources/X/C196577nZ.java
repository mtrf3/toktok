package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.7nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196577nZ {
    public final UrlModel LIZ;
    public final UrlModel LIZIZ;
    public final UrlModel LIZJ;
    public final UrlModel LIZLLL;

    public C196577nZ() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C196577nZ)) {
            return false;
        }
        C196577nZ c196577nZ = (C196577nZ) obj;
        return o.LJ(this.LIZ, c196577nZ.LIZ) && o.LJ(this.LIZIZ, c196577nZ.LIZIZ) && o.LJ(this.LIZJ, c196577nZ.LIZJ) && o.LJ(this.LIZLLL, c196577nZ.LIZLLL);
    }

    public final int hashCode() {
        UrlModel urlModel = this.LIZ;
        int hashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        UrlModel urlModel2 = this.LIZIZ;
        int hashCode2 = (hashCode + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        UrlModel urlModel3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
        UrlModel urlModel4 = this.LIZLLL;
        return hashCode3 + (urlModel4 != null ? urlModel4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WindowUrlHolder(flippedLargeWindowUrl=");
        LIZ.append(this.LIZ);
        LIZ.append(", flippedSmallWindowUrl=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", prevLargeWindowUrl=");
        LIZ.append(this.LIZJ);
        LIZ.append(", prevSmallWindowUrl=");
        return C31461Li.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C196577nZ(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4) {
        this.LIZ = urlModel;
        this.LIZIZ = urlModel2;
        this.LIZJ = urlModel3;
        this.LIZLLL = urlModel4;
    }

    public static C196577nZ LIZ(C196577nZ c196577nZ, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, int i) {
        if ((i & 1) != 0) {
            urlModel = c196577nZ.LIZ;
        }
        if ((i & 2) != 0) {
            urlModel2 = c196577nZ.LIZIZ;
        }
        if ((i & 4) != 0) {
            urlModel3 = c196577nZ.LIZJ;
        }
        if ((i & 8) != 0) {
            urlModel4 = c196577nZ.LIZLLL;
        }
        c196577nZ.getClass();
        return new C196577nZ(urlModel, urlModel2, urlModel3, urlModel4);
    }
}
