package X;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.N3c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58728N3c {
    public boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public final java.util.Set<String> LJ;
    public final java.util.Set<String> LJFF;
    public final java.util.Set<String> LJI;
    public final java.util.Set<String> LJII;
    public final java.util.Set<String> LJIIIIZZ;
    public final java.util.Set<String> LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58728N3c)) {
            return false;
        }
        C58728N3c c58728N3c = (C58728N3c) obj;
        return this.LIZ == c58728N3c.LIZ && o.LJ(this.LIZIZ, c58728N3c.LIZIZ) && o.LJ(this.LIZJ, c58728N3c.LIZJ) && o.LJ(this.LIZLLL, c58728N3c.LIZLLL) && o.LJ(this.LJ, c58728N3c.LJ) && o.LJ(this.LJFF, c58728N3c.LJFF) && o.LJ(this.LJI, c58728N3c.LJI) && o.LJ(this.LJII, c58728N3c.LJII) && o.LJ(this.LJIIIIZZ, c58728N3c.LJIIIIZZ) && o.LJ(this.LJIIIZ, c58728N3c.LJIIIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HeaderParamInterceptResult(flag=");
        LIZ.append(this.LIZ);
        LIZ.append(", netType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", url=");
        LIZ.append(this.LIZJ);
        LIZ.append(", interceptedUrl=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", headerKeys=");
        LIZ.append(this.LJ);
        LIZ.append(", interceptedHeaderKeys=");
        LIZ.append(this.LJFF);
        LIZ.append(", cookieKeys=");
        LIZ.append(this.LJI);
        LIZ.append(", interceptedCookieKeys=");
        LIZ.append(this.LJII);
        LIZ.append(", urlQueryKeys=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", interceptedUrlQueryKeys=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LIZIZ;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str2 = this.LIZJ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str3 = this.LIZLLL;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return this.LJIIIZ.hashCode() + HXX.LIZ(this.LJIIIIZZ, HXX.LIZ(this.LJII, HXX.LIZ(this.LJI, HXX.LIZ(this.LJFF, HXX.LIZ(this.LJ, (i4 + i2) * 31, 31), 31), 31), 31), 31);
    }

    public /* synthetic */ C58728N3c(String str, String str2) {
        this(false, str, str2, null, new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet());
    }

    public C58728N3c(boolean z, String str, String str2, String str3, java.util.Set<String> headerKeys, java.util.Set<String> interceptedHeaderKeys, java.util.Set<String> cookieKeys, java.util.Set<String> interceptedCookieKeys, java.util.Set<String> urlQueryKeys, java.util.Set<String> interceptedUrlQueryKeys) {
        o.LJIIIZ(headerKeys, "headerKeys");
        o.LJIIIZ(interceptedHeaderKeys, "interceptedHeaderKeys");
        o.LJIIIZ(cookieKeys, "cookieKeys");
        o.LJIIIZ(interceptedCookieKeys, "interceptedCookieKeys");
        o.LJIIIZ(urlQueryKeys, "urlQueryKeys");
        o.LJIIIZ(interceptedUrlQueryKeys, "interceptedUrlQueryKeys");
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = headerKeys;
        this.LJFF = interceptedHeaderKeys;
        this.LJI = cookieKeys;
        this.LJII = interceptedCookieKeys;
        this.LJIIIIZZ = urlQueryKeys;
        this.LJIIIZ = interceptedUrlQueryKeys;
    }
}
