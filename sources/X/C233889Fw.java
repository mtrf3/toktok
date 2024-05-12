package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9Fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C233889Fw {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C233889Fw)) {
            return false;
        }
        C233889Fw c233889Fw = (C233889Fw) obj;
        return this.LIZ == c233889Fw.LIZ && o.LJ(this.LIZIZ, c233889Fw.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WebViewUrlModel(isWebView=");
        LIZ.append(this.LIZ);
        LIZ.append(", httpUrl=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C233889Fw(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
