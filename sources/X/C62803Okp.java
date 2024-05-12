package X;

/* renamed from: X.Okp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62803Okp {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Intent r17) {
        /*
            java.lang.String r2 = "result"
            r9 = 0
            r0 = r17
            if (r0 != 0) goto Lbe
            r3 = r9
        L8:
            r6 = 1
            r8 = 0
            if (r3 == 0) goto L12
            int r0 = r3.length()
            if (r0 != 0) goto L97
        L12:
            X.UVX r0 = X.C62634Oi6.LIZ
            if (r0 != 0) goto L8c
        L16:
            com.ss.n_project.opensdk_tt.bean.AuthResultBean r7 = new com.ss.n_project.opensdk_tt.bean.AuthResultBean
            java.lang.String r12 = "opensdk"
            r13 = 20100(0x4e84, float:2.8166E-41)
            java.lang.String r14 = "undefined"
            r16 = 142(0x8e, float:1.99E-43)
            r10 = r8
            r11 = r9
            r15 = r9
            r17 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L28:
            X.UVX r0 = X.C62634Oi6.LIZ
            if (r0 != 0) goto L3b
        L2c:
            X.Okv r2 = X.C62634Oi6.LIZIZ
            if (r2 != 0) goto L33
        L30:
            X.C62634Oi6.LIZIZ = r9
            return
        L33:
            boolean r1 = r7.success
            java.lang.String r0 = r7.toastMsg
            r2.LIZ(r1, r0)
            goto L30
        L3b:
            java.lang.Object r3 = r0.LJLILLLLZI
            X.2gN r3 = (X.InterfaceC64712gN) r3
            if (r3 != 0) goto L42
            goto L2c
        L42:
            r0 = 4
            X.OSZ[] r4 = new X.OSZ[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "is_lemon8_installed"
            r1.<init>(r0, r5)
            r4[r8] = r1
            boolean r0 = r7.success
            if (r0 == 0) goto L89
            java.lang.String r1 = "success"
        L58:
            X.OSZ r0 = new X.OSZ
            r0.<init>(r2, r1)
            r4[r6] = r0
            int r0 = r7.errorCode
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "fail_code"
            r1.<init>(r0, r2)
            r0 = 2
            r4[r0] = r1
            java.lang.String r2 = r7.errorMsg
            if (r2 != 0) goto L75
            java.lang.String r2 = ""
        L75:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "fail_reason"
            r1.<init>(r0, r2)
            r0 = 3
            r4[r0] = r1
            java.util.Map r1 = X.C113554cx.LJJLIIIIJ(r4)
            java.lang.String r0 = "lemon8_bind_result"
            r3.onEvent(r0, r1)
            goto L2c
        L89:
            java.lang.String r1 = "fail"
            goto L58
        L8c:
            java.lang.Object r0 = r0.LJLJI
            X.Okw r0 = (X.InterfaceC62810Okw) r0
            if (r0 != 0) goto L93
            goto L16
        L93:
            r0.LIZJ()
            goto L16
        L97:
            X.Ol8 r0 = X.C62807Okt.LIZ     // Catch: java.lang.Exception -> Lab
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> Lab
            com.google.gson.Gson r1 = (com.google.gson.Gson) r1     // Catch: java.lang.Exception -> Lab
            java.lang.Class<com.ss.n_project.opensdk_tt.bean.AuthResultBean> r0 = com.ss.n_project.opensdk_tt.bean.AuthResultBean.class
            java.lang.Object r7 = r1.LJI(r3, r0)     // Catch: java.lang.Exception -> Lab
            com.ss.n_project.opensdk_tt.bean.AuthResultBean r7 = (com.ss.n_project.opensdk_tt.bean.AuthResultBean) r7     // Catch: java.lang.Exception -> Lab
            if (r7 != 0) goto L28
            goto L16
        Lab:
            X.UVX r0 = X.C62634Oi6.LIZ
            if (r0 != 0) goto Lb1
            goto L16
        Lb1:
            java.lang.Object r0 = r0.LJLJI
            X.Okw r0 = (X.InterfaceC62810Okw) r0
            if (r0 != 0) goto Lb9
            goto L16
        Lb9:
            r0.LIZJ()
            goto L16
        Lbe:
            java.lang.String r3 = X.C16880lQ.LLJJIJIIJIL(r0, r2)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62803Okp.LIZ(android.content.Intent):void");
    }
}
