package X;

/* loaded from: classes7.dex */
public final class ETJ extends ETK {
    public final Throwable LJLILLLLZI;

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.LJLILLLLZI;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ETJ(int r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            java.util.Locale r6 = java.util.Locale.ROOT
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4[r1] = r0
            java.util.Map r3 = X.C35484DwG.LIZ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L26
            java.util.Map r1 = X.C35484DwG.LIZIZ
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L3c
        L26:
            java.lang.String r1 = ""
        L28:
            r0 = 1
            r4[r0] = r1
            java.lang.String r0 = "Integrity API error (%d): %s."
            java.lang.String r0 = X.C16880lQ.LLLZI(r6, r0, r4)
            r5.<init>(r8, r0)
            r7.<init>(r5)
            if (r8 == 0) goto L51
            r7.LJLILLLLZI = r9
            return
        L3c:
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#"
            java.lang.String r0 = ")"
            java.lang.String r1 = X.C0ON.LIZJ(r3, r1, r2, r0)
            goto L28
        L51:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ErrorCode should not be 0."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ETJ.<init>(int, java.lang.Throwable):void");
    }
}
