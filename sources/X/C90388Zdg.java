package X;

import java.io.IOException;

/* renamed from: X.Zdg, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90388Zdg extends IOException {
    public C90388Zdg() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public C90388Zdg(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C90388Zdg(java.lang.String r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r0 = r2.length()
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            if (r0 == 0) goto L14
            java.lang.String r0 = r1.concat(r2)
        L10:
            r3.<init>(r0, r5)
            return
        L14:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90388Zdg.<init>(java.lang.String, java.lang.Throwable):void");
    }
}
