package X;

/* renamed from: X.In4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47654In4 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r1 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ() {
        /*
            X.LSn r2 = X.C235779Nd.LIZ
            X.Ecj r0 = r2.LIZJ()
            java.lang.Object r1 = r0.LIZ()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L10
        Le:
            r1 = 0
        Lf:
            return r1
        L10:
            int r0 = r1.intValue()
            if (r0 != 0) goto L2e
            X.2YJ r0 = X.C2YJ.LIZIZ     // Catch: X.C158056If -> L26
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r0.LIZ     // Catch: X.C158056If -> L26
            java.lang.Integer r1 = r0.getDataSaverSetting()     // Catch: X.C158056If -> L26
            X.Ecj r0 = r2.LIZJ()     // Catch: X.C158056If -> L26
            r0.LIZLLL(r1)     // Catch: X.C158056If -> L26
            goto L2b
        L26:
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L2b:
            if (r1 != 0) goto L2e
            goto Le
        L2e:
            int r0 = r1.intValue()
            r1 = 1
            if (r0 != r1) goto Le
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47654In4.LIZJ():boolean");
    }

    public static boolean LIZLLL() {
        if (C00F.LIZ(31744, 0, "data_saver_mode", true) == 0) {
            return false;
        }
        return true;
    }

    public static int LIZ() {
        if (LIZIZ() != 0) {
            return 1;
        }
        return 0;
    }

    public static int LIZIZ() {
        if (!LIZJ() || C48207Ivz.LIZ(EF7.LIZIZ())) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "data_saver_mode", true);
    }
}
