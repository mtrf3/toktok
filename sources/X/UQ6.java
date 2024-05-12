package X;

/* loaded from: classes14.dex */
public final class UQ6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str) {
        String str2;
        C188727au c188727au = new C188727au();
        if (i == UQ7.NEW_VERSION_FACEBOOK.getValue()) {
            str2 = "facebook";
        } else {
            str2 = "contact";
        }
        c188727au.LJIIIZ("platform", str2);
        c188727au.LJIIIZ("enter_from", "version_update");
        c188727au.LJIIIZ("result", str);
        FMX.LJIIL("click_authorize_reconfirm_pop_up", c188727au.LIZ);
    }

    public static void LIZJ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("exit_from", str);
        c188727au.LJIIIZ("enter_from", "version_update");
        c188727au.LJIIIZ("enter_method", str2);
        FMX.LJIIL("exit_update_authorize_process", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r6 == X.UQ7.NEW_VERSION_FACEBOOK.getValue()) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r5, int r6, long r7, java.lang.String r9) {
        /*
            r0 = 1
            r1 = 3
            java.lang.String r4 = "facebook"
            if (r5 == r0) goto L56
            r0 = 2
            if (r5 == r0) goto L54
            if (r5 == r1) goto L4c
            java.lang.String r3 = ""
        Ld:
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r0 = "platform"
            r2.LJIIIZ(r0, r3)
            if (r5 != r1) goto L49
            java.lang.String r1 = "version_update"
        L1b:
            java.lang.String r0 = "enter_from"
            r2.LJIIIZ(r0, r1)
            java.lang.String r0 = "result"
            r2.LJIIIZ(r0, r9)
            java.lang.String r0 = "duration"
            r2.LJ(r7, r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r4)
            if (r0 == 0) goto L41
            X.UPa r0 = X.C77134UPa.LIZ
            java.lang.Integer r0 = r0.LIZLLL()
            if (r0 == 0) goto L41
            int r1 = r0.intValue()
            java.lang.String r0 = "server_fb_token"
            r2.LIZLLL(r1, r0)
        L41:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "confirm_auth_page"
            X.FMX.LJIIL(r0, r1)
            return
        L49:
            java.lang.String r1 = "login_onboarding"
            goto L1b
        L4c:
            X.UQ7 r0 = X.UQ7.NEW_VERSION_FACEBOOK
            int r0 = r0.getValue()
            if (r6 != r0) goto L56
        L54:
            r3 = r4
            goto Ld
        L56:
            java.lang.String r3 = "contact"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQ6.LIZIZ(int, int, long, java.lang.String):void");
    }
}
