package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Jih, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49931Jih {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C49931Jih() {
        /*
            r2 = this;
            r1 = 0
            r0 = 15
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49931Jih.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49931Jih)) {
            return false;
        }
        C49931Jih c49931Jih = (C49931Jih) obj;
        return o.LJ(this.LIZ, c49931Jih.LIZ) && o.LJ(this.LIZIZ, c49931Jih.LIZIZ) && o.LJ(this.LIZJ, c49931Jih.LIZJ) && o.LJ(this.LIZLLL, c49931Jih.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchPrefetchResultParam(prefetchId=");
        LIZ.append(this.LIZ);
        LIZ.append(", searchSource=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", prefetchResult=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cancelReason=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C49931Jih(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L7
            r5 = r3
        L7:
            r0 = r7 & 2
            if (r0 == 0) goto Lc
            r6 = r3
        Lc:
            r0 = r7 & 4
            r2 = 0
            if (r0 == 0) goto L1c
            r1 = r3
        L12:
            r0 = r7 & 8
            if (r0 == 0) goto L1a
        L16:
            r4.<init>(r5, r6, r1, r3)
            return
        L1a:
            r3 = r2
            goto L16
        L1c:
            r1 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49931Jih.<init>(java.lang.String, java.lang.String, int):void");
    }

    public C49931Jih(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }

    public static C49931Jih LIZ(C49931Jih c49931Jih, String str, String str2, int i) {
        String str3;
        String str4 = null;
        if ((i & 1) != 0) {
            str3 = c49931Jih.LIZ;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = c49931Jih.LIZIZ;
        }
        if ((i & 4) != 0) {
            str = c49931Jih.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c49931Jih.LIZLLL;
        }
        return new C49931Jih(str3, str4, str, str2);
    }
}
