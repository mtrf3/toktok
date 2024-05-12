package X;

/* renamed from: X.EjU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37240EjU {
    public static boolean LIZ;
    public static final int LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(181));
    public static final int LIZJ = C7MY.LIZIZ(65);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C35910E7m.LJLIL);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0011, code lost:
    
        if (r3 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r4) {
        /*
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)
            java.lang.String r2 = ""
            if (r3 == 0) goto L10
            java.lang.String r0 = "channel"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r0)
            if (r1 != 0) goto L13
        L10:
            r1 = r2
            if (r3 == 0) goto L1b
        L13:
            java.lang.String r0 = "bundle"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r0)
            if (r0 != 0) goto L2e
        L1b:
            int r0 = r1.length()
            if (r0 <= 0) goto L2d
            int r0 = r2.length()
            if (r0 <= 0) goto L2d
            r0 = 95
            java.lang.String r4 = X.C00F.LIZIZ(r1, r0, r2)
        L2d:
            return r4
        L2e:
            r2 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37240EjU.LIZIZ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OSZ LIZ(X.C109544Rq r9, com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent r10, java.lang.Integer r11, java.lang.Integer r12) {
        /*
            r6 = 0
            if (r9 == 0) goto L9a
            java.lang.String r0 = "a:width_px"
            java.lang.String r0 = r9.getLocalExtValue(r0)
            if (r0 == 0) goto L9a
            java.lang.Integer r5 = X.C38350F3i.LJJIL(r0)
            if (r5 == 0) goto L9b
            int r8 = r5.intValue()
        L15:
            if (r8 != 0) goto L19
            int r8 = X.C37240EjU.LIZIZ
        L19:
            if (r9 == 0) goto L8f
            java.lang.String r0 = "a:height_px"
            java.lang.String r0 = r9.getLocalExtValue(r0)
            if (r0 == 0) goto L8f
            java.lang.Integer r4 = X.C38350F3i.LJJIL(r0)
            if (r4 == 0) goto L90
            int r7 = r4.intValue()
        L2d:
            if (r7 != 0) goto L31
            int r7 = X.C37240EjU.LIZJ
        L31:
            X.7au r3 = new X.7au
            r3.<init>()
            r2 = 0
            if (r5 == 0) goto L3b
            if (r4 != 0) goto L8d
        L3b:
            r1 = 0
        L3c:
            java.lang.String r0 = "is_cached"
            r3.LIZLLL(r1, r0)
            if (r10 == 0) goto L8b
            java.lang.String r1 = r10.cardTemplate
        L45:
            java.lang.String r0 = "card_template"
            r3.LJIIIZ(r0, r1)
            if (r10 == 0) goto L89
            java.lang.String r1 = r10.cardKey
        L4e:
            java.lang.String r0 = "card_key"
            r3.LJIIIZ(r0, r1)
            if (r9 == 0) goto L59
            java.lang.String r6 = r9.getScene()
        L59:
            java.lang.String r0 = "lynx_scene"
            r3.LJIIIZ(r0, r6)
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r11)
            if (r0 == 0) goto L6f
            if (r5 == 0) goto L6f
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r12)
            if (r0 == 0) goto L6f
            if (r4 == 0) goto L6f
            r2 = 1
        L6f:
            java.lang.String r0 = "is_match_default"
            r3.LIZLLL(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "dm_lynx_size_cached_rate"
            X.FMX.LJIIL(r0, r1)
            X.OSZ r2 = new X.OSZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.<init>(r1, r0)
            return r2
        L89:
            r1 = r6
            goto L4e
        L8b:
            r1 = r6
            goto L45
        L8d:
            r1 = 1
            goto L3c
        L8f:
            r4 = r6
        L90:
            if (r12 == 0) goto L97
            int r7 = r12.intValue()
            goto L2d
        L97:
            int r7 = X.C37240EjU.LIZJ
            goto L2d
        L9a:
            r5 = r6
        L9b:
            if (r11 == 0) goto La3
            int r8 = r11.intValue()
            goto L15
        La3:
            int r8 = X.C37240EjU.LIZIZ
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37240EjU.LIZ(X.4Rq, com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent, java.lang.Integer, java.lang.Integer):X.OSZ");
    }
}
