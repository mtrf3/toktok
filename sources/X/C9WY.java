package X;

/* renamed from: X.9WY, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9WY {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C9WZ.LJLIL);

    public static void LIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("region", (String) LIZ.getValue());
        FMX.LJIIL(str, c188727au.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r5) {
        /*
            X.7au r3 = new X.7au
            r3.<init>()
            X.Ol8 r0 = X.C9WY.LIZ
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "region"
            r3.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            r4 = 0
            if (r0 == 0) goto L77
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.getCurUser()
            if (r1 == 0) goto L78
            java.lang.String r0 = r1.getEnterpriseVerifyReason()
        L25:
            java.lang.String r2 = ""
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 != 0) goto L4c
            if (r1 == 0) goto L49
            int r0 = r1.getCommerceUserLevel()
            if (r0 != 0) goto L49
            java.lang.String r2 = "institution"
        L37:
            java.lang.String r0 = "verification_type"
            r3.LJIIIZ(r0, r2)
            java.lang.String r1 = "submit_success"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.LJFF(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LIZ
            X.FMX.LJIIL(r5, r0)
            return
        L49:
            java.lang.String r2 = "Busniess"
            goto L37
        L4c:
            if (r1 == 0) goto L69
            java.lang.String r0 = r1.getCustomVerify()
        L52:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 != 0) goto L37
            if (r1 == 0) goto L5e
            java.lang.String r4 = r1.getCustomVerify()
        L5e:
            java.lang.String r0 = "tiktokartist"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 != 0) goto L6b
            java.lang.String r2 = "Personal"
            goto L37
        L69:
            r0 = r4
            goto L52
        L6b:
            if (r1 == 0) goto L37
            int r1 = r1.getVerificationType()
            r0 = 2
            if (r1 != r0) goto L37
            java.lang.String r2 = "Musician"
            goto L37
        L77:
            r1 = r4
        L78:
            r0 = r4
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9WY.LIZIZ(java.lang.String):void");
    }
}
