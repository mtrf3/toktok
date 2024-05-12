package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.TZo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74860TZo {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74860TZo)) {
            return false;
        }
        C74860TZo c74860TZo = (C74860TZo) obj;
        return this.LIZ == c74860TZo.LIZ && o.LJ(this.LIZIZ, c74860TZo.LIZIZ) && o.LJ(this.LIZJ, c74860TZo.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActivityBannerItem(showBanner=");
        LIZ.append(this.LIZ);
        LIZ.append(", bannerImageUrl=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", activityUrl=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C74860TZo(boolean z, String str, String str2) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
