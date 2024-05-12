package X;

/* renamed from: X.M5m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56242M5m extends AbstractC56238M5i {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0027, code lost:
    
        if (r3 == null) goto L10;
     */
    @Override // X.AbstractC56238M5i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.net.Uri r6) {
        /*
            r5 = this;
            java.lang.String r2 = r6.toString()
            java.lang.String r0 = "uri.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.String r1 = "utm_source"
            java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r6, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L27
            java.lang.String r0 = "params_url"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r6, r0)
            if (r0 == 0) goto L27
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r0 == 0) goto L29
            java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r0, r1)
        L27:
            if (r3 != 0) goto L2b
        L29:
            java.lang.String r3 = "unknown"
        L2b:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "share."
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r3 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r0, r3)
            X.C56251M5v.LJ = r0
            java.lang.String r0 = "refer"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r6, r0)
            java.lang.String r0 = "web"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lb3
            java.lang.String r0 = "fe_component"
            X.C56251M5v.LJFF = r0
        L54:
            java.lang.String r0 = "/activity/referral"
            r1 = 0
            boolean r0 = ujb.s.LJJJLZIJ(r2, r0, r1)
            java.lang.String r4 = ""
            if (r0 != 0) goto L6f
            java.lang.String r0 = "/ug_activity_referral"
            boolean r0 = ujb.s.LJJJLZIJ(r2, r0, r1)
            if (r0 != 0) goto L6f
            java.lang.String r0 = "/activity/armor"
            boolean r0 = ujb.s.LJJJLZIJ(r2, r0, r1)
            if (r0 == 0) goto L9e
        L6f:
            java.lang.String r2 = r6.getLastPathSegment()
            if (r2 != 0) goto L76
            r2 = r4
        L76:
            java.lang.String r1 = "incentive"
        L78:
            boolean r0 = X.C78685UuP.LJJJZ(r1)
            if (r0 == 0) goto L9d
            boolean r0 = X.C78685UuP.LJJJZ(r2)
            if (r0 == 0) goto L8a
            r0 = 46
            java.lang.String r4 = X.QZZ.LIZIZ(r0, r2)
        L8a:
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            kotlin.jvm.internal.o.LJIIIZ(r0, r3)
            X.C56251M5v.LJI = r0
        L9d:
            return
        L9e:
            java.lang.String r0 = "gd_label"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r6, r0)
            java.lang.String r0 = "ttfarm_link"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lb0
            java.lang.String r1 = "gamification"
            r2 = r4
            goto L78
        Lb0:
            r1 = r4
            r2 = r4
            goto L78
        Lb3:
            java.lang.String r0 = "link_direct"
            X.C56251M5v.LJFF = r0
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56242M5m.LIZ(android.net.Uri):void");
    }
}
