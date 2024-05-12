package X;

import com.ss.android.ugc.aweme.compliance.api.model.Strategy;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.N3e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58730N3e {
    public boolean LIZ;
    public final String LIZIZ;
    public final Strategy LIZJ;
    public String LIZLLL;
    public final java.util.Set<String> LJ;
    public final java.util.Set<String> LJFF;
    public java.util.Set<String> LJI;
    public final java.util.Set<String> LJII;
    public java.util.Set<String> LJIIIIZZ;

    public C58730N3e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58730N3e)) {
            return false;
        }
        C58730N3e c58730N3e = (C58730N3e) obj;
        return this.LIZ == c58730N3e.LIZ && o.LJ(this.LIZIZ, c58730N3e.LIZIZ) && o.LJ(this.LIZJ, c58730N3e.LIZJ) && o.LJ(this.LIZLLL, c58730N3e.LIZLLL) && o.LJ(this.LJ, c58730N3e.LJ) && o.LJ(this.LJFF, c58730N3e.LJFF) && o.LJ(this.LJI, c58730N3e.LJI) && o.LJ(this.LJII, c58730N3e.LJII) && o.LJ(this.LJIIIIZZ, c58730N3e.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InterceptResult(flag=");
        LIZ.append(this.LIZ);
        LIZ.append(", domain=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", strategy=");
        LIZ.append(this.LIZJ);
        LIZ.append(", interceptedUrl=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", headerParams=");
        LIZ.append(this.LJ);
        LIZ.append(", urlParams=");
        LIZ.append(this.LJFF);
        LIZ.append(", bodyParams=");
        LIZ.append(this.LJI);
        LIZ.append(", replaceParams=");
        LIZ.append(this.LJII);
        LIZ.append(", ruleNames=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
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
        Strategy strategy = this.LIZJ;
        if (strategy == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = strategy.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str2 = this.LIZLLL;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.LJIIIIZZ.hashCode() + HXX.LIZ(this.LJII, HXX.LIZ(this.LJI, HXX.LIZ(this.LJFF, HXX.LIZ(this.LJ, (i4 + i2) * 31, 31), 31), 31), 31);
    }

    public C58730N3e(boolean z, String str, int i) {
        LinkedHashSet headerParams;
        LinkedHashSet urlParams;
        LinkedHashSet bodyParams;
        LinkedHashSet replaceParams;
        LinkedHashSet ruleNames;
        str = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            headerParams = new LinkedHashSet();
        } else {
            headerParams = null;
        }
        if ((i & 32) != 0) {
            urlParams = new LinkedHashSet();
        } else {
            urlParams = null;
        }
        if ((i & 64) != 0) {
            bodyParams = new LinkedHashSet();
        } else {
            bodyParams = null;
        }
        if ((i & 128) != 0) {
            replaceParams = new LinkedHashSet();
        } else {
            replaceParams = null;
        }
        if ((i & 256) != 0) {
            ruleNames = new LinkedHashSet();
        } else {
            ruleNames = null;
        }
        o.LJIIIZ(headerParams, "headerParams");
        o.LJIIIZ(urlParams, "urlParams");
        o.LJIIIZ(bodyParams, "bodyParams");
        o.LJIIIZ(replaceParams, "replaceParams");
        o.LJIIIZ(ruleNames, "ruleNames");
        this.LIZ = z;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = str;
        this.LJ = headerParams;
        this.LJFF = urlParams;
        this.LJI = bodyParams;
        this.LJII = replaceParams;
        this.LJIIIIZZ = ruleNames;
    }
}
