package com.ss.android.ugc.aweme.appsflyer;

import X.C10K;
import X.C39276FbE;
import X.C39277FbF;
import X.C58096Mr6;
import X.CallableC39275FbD;
import X.FLO;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;

/* loaded from: classes7.dex */
public final class AppsflyerImpl implements IAppsflyerApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final void LIZJ() {
        FLO.LJFF(TokenCert.Companion.with("bpea-appsflyer_androidsdk_1965"));
        FLO.LJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (r7 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
    
        if (r7 == null) goto L25;
     */
    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL() {
        /*
            r8 = this;
            r5 = 1
            r6 = 0
            r7 = 0
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = "get"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L27
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r6] = r0     // Catch: java.lang.Exception -> L27
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r2, r1)     // Catch: java.lang.Exception -> L27
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = "ro.appsflyer.preinstall.path"
            r1[r6] = r0     // Catch: java.lang.Exception -> L27
            java.lang.Object r1 = r2.invoke(r3, r1)     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.o.LJII(r1, r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L27
            goto L28
        L27:
            r1 = r7
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r4 = ""
            if (r0 == 0) goto L31
        L30:
            return r4
        L31:
            if (r1 != 0) goto L3a
        L33:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L30
            goto L87
        L3a:
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6e java.lang.Throwable -> La4
            r2.<init>(r1)     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6e java.lang.Throwable -> La4
            r3.load(r2)     // Catch: java.io.IOException -> L69 java.io.FileNotFoundException -> L6d java.lang.Throwable -> La6
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.io.IOException -> L69 java.io.FileNotFoundException -> L6d java.lang.Throwable -> La6
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.io.IOException -> L69 java.io.FileNotFoundException -> L6d java.lang.Throwable -> La6
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.io.IOException -> L69 java.io.FileNotFoundException -> L6d java.lang.Throwable -> La6
            java.lang.String r0 = r0.getPackageName()     // Catch: java.io.IOException -> L69 java.io.FileNotFoundException -> L6d java.lang.Throwable -> La6
            android.content.pm.PackageInfo r0 = X.C16880lQ.LLLLLLZ(r1, r0, r6)     // Catch: java.io.IOException -> L69 java.io.FileNotFoundException -> L6d java.lang.Throwable -> La6
            java.lang.String r0 = r0.packageName     // Catch: java.io.IOException -> L69 java.io.FileNotFoundException -> L6d java.lang.Throwable -> La6
            java.lang.String r0 = r3.getProperty(r0)     // Catch: java.io.IOException -> L69 java.io.FileNotFoundException -> L6d java.lang.Throwable -> La6
            if (r0 != 0) goto L64
            goto L65
        L64:
            r4 = r0
        L65:
            r2.close()     // Catch: java.io.IOException -> L73
            goto L73
        L69:
            r7 = r2
        L6a:
            if (r7 == 0) goto L73
            goto L70
        L6d:
            r7 = r2
        L6e:
            if (r7 == 0) goto L73
        L70:
            r7.close()     // Catch: java.io.IOException -> L73
        L73:
            com.ss.android.ugc.aweme.ug.IUgCommonService r0 = com.ss.android.ugc.aweme.ug.UgCommonServiceImpl.LJIJ()
            r0.LJIIJJI()
            int r0 = r4.length()
            if (r0 != 0) goto L85
        L81:
            X.FLL.LJ(r5)
            goto L33
        L85:
            r5 = 0
            goto L81
        L87:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L30
            r1.<init>(r4)     // Catch: org.json.JSONException -> L30
            java.lang.String r0 = "pid"
            java.lang.String r2 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: org.json.JSONException -> L30
            java.lang.String r0 = "json.getString(\"pid\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: org.json.JSONException -> L30
            java.lang.String r0 = "c"
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: org.json.JSONException -> La2
            java.lang.String r0 = "json.getString(\"c\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: org.json.JSONException -> La2
        La2:
            r4 = r2
            goto L30
        La4:
            r0 = move-exception
            goto La8
        La6:
            r0 = move-exception
            r7 = r2
        La8:
            if (r7 == 0) goto Lad
            r7.close()     // Catch: java.io.IOException -> Lad
        Lad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.appsflyer.AppsflyerImpl.LIZLLL():java.lang.String");
    }

    public static IAppsflyerApi LJ() {
        Object LIZ = C58096Mr6.LIZ(IAppsflyerApi.class, false);
        if (LIZ != null) {
            return (IAppsflyerApi) LIZ;
        }
        if (C58096Mr6.LLILZ == null) {
            synchronized (IAppsflyerApi.class) {
                if (C58096Mr6.LLILZ == null) {
                    C58096Mr6.LLILZ = new AppsflyerImpl();
                }
            }
        }
        return C58096Mr6.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final void LIZ() {
        C10K.LIZJ(CallableC39275FbD.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final void LIZIZ() {
        C39277FbF c39277FbF = C39276FbE.LIZ.LJ;
        if (c39277FbF != null) {
            c39277FbF.LIZ();
        }
    }
}
