package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Mje, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57634Mje implements InterfaceC57671MkF<String> {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public C57634Mje() {
        this(0, 15);
    }

    public final int hashCode() {
        return C79062V1e.LJ(this.LIZJ, ((this.LIZ * 31) + this.LIZIZ) * 31, 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MaFLoadParams(time: ");
        LIZ.append(this.LIZ);
        LIZ.append(", curSize: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nextPageToken: ");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57634Mje)) {
            return false;
        }
        C57634Mje c57634Mje = (C57634Mje) obj;
        if (this.LIZ == c57634Mje.LIZ && this.LIZIZ == c57634Mje.LIZIZ && o.LJ(this.LIZJ, c57634Mje.LIZJ) && this.LIZLLL == c57634Mje.LIZLLL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C57634Mje(int r3, int r4) {
        /*
            r2 = this;
            r0 = r4 & 4
            if (r0 == 0) goto L11
            java.lang.String r1 = ""
        L6:
            r0 = r4 & 8
            if (r0 == 0) goto Lc
            r3 = 20
        Lc:
            r0 = 0
            r2.<init>(r0, r0, r3, r1)
            return
        L11:
            r1 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57634Mje.<init>(int, int):void");
    }

    public C57634Mje(int i, int i2, int i3, String pageToken) {
        o.LJIIIZ(pageToken, "pageToken");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = pageToken;
        this.LIZLLL = i3;
    }
}
