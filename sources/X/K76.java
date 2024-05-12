package X;

/* loaded from: classes9.dex */
public final class K76 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(K79.LJLIL);

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        if (r1 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.keva.Keva LIZ() {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()     // Catch: java.lang.Exception -> L10
            X.RBX r0 = (X.RBX) r0     // Catch: java.lang.Exception -> L10
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()     // Catch: java.lang.Exception -> L10
            java.lang.String r1 = X.AV1.LJIIIIZZ(r0)     // Catch: java.lang.Exception -> L10
            if (r1 != 0) goto L12
        L10:
            java.lang.String r1 = ""
        L12:
            java.lang.String r0 = "search_keva_repo_"
            java.lang.String r0 = r0.concat(r1)
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r0 = "getRepo(repo)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K76.LIZ():com.bytedance.keva.Keva");
    }

    public static void LIZIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("popup_type", "add_widget");
        c188727au.LJIIIZ("action_type", str);
        FMX.LJIIL("widget_popup", c188727au.LIZ);
    }
}
