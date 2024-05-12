package X;

/* renamed from: X.E5q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35862E5q<T> implements InterfaceC64592gB {
    public static final C35862E5q<T> LJLIL = new C35862E5q<>();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC64592gB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.personalized.ReportHybridABApi$ReportHybridABResponse r8 = (com.ss.android.ugc.aweme.personalized.ReportHybridABApi.ReportHybridABResponse) r8
            com.ss.android.ugc.aweme.personalized.ReportHybridABApi$HybridABExperimentInfoHandleResult[] r6 = r8.result
            r4 = 0
            r5 = 1
            if (r6 == 0) goto L2c
            int r2 = r6.length
            r1 = 0
        La:
            if (r1 >= r2) goto L2c
            r3 = r6[r1]
            int r0 = r3.experimentNameId
            if (r0 != r5) goto L29
            boolean r0 = r3.isSuccessful
            if (r0 == 0) goto L2d
            X.Ol8 r0 = X.C35865E5t.LIZIZ
            java.lang.Object r1 = r0.getValue()
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1
            java.lang.String r0 = "keva_key_is_report_success"
            r1.storeBoolean(r0, r5)
            java.lang.String r0 = "success"
            X.C35863E5r.LIZ(r4, r0, r5)
        L28:
            return
        L29:
            int r1 = r1 + 1
            goto La
        L2c:
            r3 = 0
        L2d:
            int r2 = r8.statusCode
            r0 = -110119120(0xfffffffff96fb730, float:-7.779215E34)
            if (r2 != r0) goto L35
            goto L28
        L35:
            java.lang.String r0 = r8.statusMessage
            java.lang.String r1 = "no reason"
            if (r0 != 0) goto L3c
            r0 = r1
        L3c:
            if (r3 != 0) goto L42
            X.C35863E5r.LIZ(r2, r0, r4)
            goto L28
        L42:
            java.lang.String r0 = r3.failureReason
            if (r0 != 0) goto L4c
        L46:
            r0 = -10086(0xffffffffffffd89a, float:NaN)
            X.C35863E5r.LIZ(r0, r1, r4)
            goto L28
        L4c:
            r1 = r0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35862E5q.accept(java.lang.Object):void");
    }
}
