package X;

import com.bytedance.mt.protector.impl.UriProtector;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.N3b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58727N3b {
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        if (X.C58729N3d.LIZ(r0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r3 - r0) > 60000) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig LIZ() {
        /*
            java.lang.String r6 = X.C85990Xow.LIZ()
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = X.C58712N2m.LIZJ     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L1f
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L43
            java.lang.Long r0 = X.C58712N2m.LIZIZ     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L15
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L43
            goto L17
        L15:
            r0 = 0
        L17:
            long r3 = r3 - r0
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3c
        L1f:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "header_param_config"
            java.lang.Class<com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting> r0 = com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting.class
            r2.getClass()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L43
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = (com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting) r0     // Catch: java.lang.Throwable -> L43
            X.C58712N2m.LIZJ = r0     // Catch: java.lang.Throwable -> L43
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L43
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L43
            X.C58712N2m.LIZIZ = r0     // Catch: java.lang.Throwable -> L43
        L3c:
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = X.C58712N2m.LIZJ     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L49
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = X.C58712N2m.LIZ     // Catch: java.lang.Throwable -> L43
            goto L49
        L43:
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = X.C58712N2m.LIZJ
            if (r0 != 0) goto L49
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = X.C58712N2m.LIZ
        L49:
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig r4 = r0.f18default
            java.util.List<com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig> r1 = r0.custom
            boolean r0 = X.C79004UzY.LJJIFFI(r1)
            r5 = 1
            r3 = 0
            if (r0 != 0) goto L9c
            kotlin.jvm.internal.o.LJI(r1)
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig r2 = (com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig) r2
            java.util.Set<java.lang.String> r0 = r2.regions
            if (r0 == 0) goto L5c
            boolean r0 = r0.contains(r6)
            if (r0 != r5) goto L5c
            java.lang.Boolean r1 = r2.enable
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L99
            java.lang.Integer r0 = r2.scope
            if (r0 == 0) goto L8f
            X.N3d r1 = com.ss.android.ugc.aweme.net.model.ScopeEnum.Companion
            int r0 = r0.intValue()
            r1.getClass()
            boolean r0 = X.C58729N3d.LIZ(r0)
            if (r0 == 0) goto L99
        L8f:
            java.util.Set<java.lang.String> r0 = r2.denyKeys
            if (r0 == 0) goto L99
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9a
        L99:
            return r3
        L9a:
            r3 = r2
            goto L99
        L9c:
            if (r4 == 0) goto Lc5
            java.lang.Boolean r1 = r4.enable
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lc5
            java.lang.Integer r0 = r4.scope
            if (r0 == 0) goto Lbb
            X.N3d r1 = com.ss.android.ugc.aweme.net.model.ScopeEnum.Companion
            int r0 = r0.intValue()
            r1.getClass()
            boolean r0 = X.C58729N3d.LIZ(r0)
            if (r0 == 0) goto Lc5
        Lbb:
            java.util.Set<java.lang.String> r0 = r4.denyKeys
            if (r0 == 0) goto Lc5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc6
        Lc5:
            r4 = r3
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58727N3b.LIZ():com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig");
    }

    public static void LIZJ(C58728N3c c58728N3c) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = c58728N3c.LIZLLL;
            if (str == null) {
                str = c58728N3c.LIZJ;
            }
            android.net.Uri parse = UriProtector.parse(str);
            jSONObject.put("host", parse.getHost());
            jSONObject.put("path", parse.getPath());
            jSONObject.put("url", str);
            String str2 = c58728N3c.LIZIZ;
            if (str2 != null && !o.LJJJJJL(str2)) {
                jSONObject.put("net_type", c58728N3c.LIZIZ);
            }
            if (!c58728N3c.LJ.isEmpty()) {
                jSONObject.put("header_list", c58728N3c.LJ);
            }
            if (!c58728N3c.LJFF.isEmpty()) {
                jSONObject.put("header", c58728N3c.LJFF);
            }
            if (!c58728N3c.LJI.isEmpty()) {
                jSONObject.put("cookie_list", c58728N3c.LJI);
            }
            if (!c58728N3c.LJII.isEmpty()) {
                jSONObject.put("cookie", c58728N3c.LJII);
            }
            if (!c58728N3c.LJIIIZ.isEmpty()) {
                jSONObject.put("url_query", c58728N3c.LJIIIZ);
            }
            if (!c58728N3c.LJIIIIZZ.isEmpty()) {
                jSONObject.put("url_query_list", c58728N3c.LJIIIIZZ);
            }
            C09900aA.LJ(EnumC58731N3f.HTTP_COOKIE_TOKEN_LOG.getLogType(), jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (X.ORZ.LJLJJI(r3, r1) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig r3, java.lang.String r4) {
        /*
            if (r3 == 0) goto L10
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L10
            java.util.List<com.ss.android.ugc.aweme.compliance.api.model.AllowApiConfig> r0 = r3.allowApis
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 == 0) goto L12
        L10:
            r0 = 0
        L11:
            return r0
        L12:
            java.util.List<com.ss.android.ugc.aweme.compliance.api.model.AllowApiConfig> r1 = r3.allowApis
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)     // Catch: java.lang.Exception -> L10
            java.lang.String r4 = r0.getHost()     // Catch: java.lang.Exception -> L10
            java.lang.String r3 = r0.getPath()     // Catch: java.lang.Exception -> L10
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L10
            if (r0 != 0) goto L10
            kotlin.jvm.internal.o.LJI(r1)     // Catch: java.lang.Exception -> L10
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L10
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L10
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L10
            com.ss.android.ugc.aweme.compliance.api.model.AllowApiConfig r0 = (com.ss.android.ugc.aweme.compliance.api.model.AllowApiConfig) r0     // Catch: java.lang.Exception -> L10
            java.util.Set<java.lang.String> r2 = r0.domains     // Catch: java.lang.Exception -> L10
            java.util.Set<java.lang.String> r1 = r0.paths     // Catch: java.lang.Exception -> L10
            boolean r0 = X.C79004UzY.LJJIFFI(r2)     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L58
            boolean r0 = X.C79004UzY.LJJIFFI(r1)     // Catch: java.lang.Exception -> L10
            if (r0 != 0) goto L10
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L50
            goto L10
        L50:
            kotlin.jvm.internal.o.LJI(r1)     // Catch: java.lang.Exception -> L10
            boolean r0 = X.ORZ.LJLJJI(r3, r1)     // Catch: java.lang.Exception -> L10
            goto L11
        L58:
            kotlin.jvm.internal.o.LJI(r2)     // Catch: java.lang.Exception -> L10
            boolean r0 = X.ORZ.LJLJJI(r4, r2)     // Catch: java.lang.Exception -> L10
            if (r0 != 0) goto L62
            goto L10
        L62:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L10
            if (r0 != 0) goto L77
            boolean r0 = X.C79004UzY.LJJIFFI(r1)     // Catch: java.lang.Exception -> L10
            if (r0 != 0) goto L77
            kotlin.jvm.internal.o.LJI(r1)     // Catch: java.lang.Exception -> L10
            boolean r0 = X.ORZ.LJLJJI(r3, r1)     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L10
        L77:
            r0 = 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58727N3b.LIZIZ(com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig, java.lang.String):boolean");
    }
}
