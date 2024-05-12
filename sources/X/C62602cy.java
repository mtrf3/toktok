package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel;
import defpackage.b1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* renamed from: X.2cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62602cy {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2).getPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:2:0x0000, B:4:0x000d, B:9:0x0019, B:11:0x0021, B:16:0x002b), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r3) {
        /*
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "surl"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r0)     // Catch: java.lang.Throwable -> L35
            r1 = 1
            if (r2 == 0) goto L16
            boolean r0 = ujb.o.LJJJJJL(r2)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            if (r0 == 0) goto L1f
            java.lang.String r0 = "url"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r0)     // Catch: java.lang.Throwable -> L35
        L1f:
            if (r2 == 0) goto L29
            boolean r0 = ujb.o.LJJJJJL(r2)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 != 0) goto L35
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L37
        L35:
            java.lang.String r0 = ""
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62602cy.LIZIZ(java.lang.String):java.lang.String");
    }

    public static String LIZLLL(List list) {
        if (((ArrayList) list).isEmpty()) {
            return "";
        }
        return ORZ.LLD(list, ",", null, null, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.String r8, boolean r9) {
        /*
            r4 = 0
            r6 = r8
            if (r6 == 0) goto La
            boolean r0 = ujb.o.LJJJJJL(r6)
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "ec_schema_verify_rules"
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel> r0 = com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel.class
            com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r7 = X.C62592cx.LIZ     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r2.LJIIIIZZ(r1, r0, r7)     // Catch: java.lang.Throwable -> L1f
            com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r0 = (com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel) r0     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            goto L22
        L1f:
            com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r0 = X.C62592cx.LIZ
        L21:
            r7 = r0
        L22:
            boolean r0 = r7.enableVerify
            if (r0 != 0) goto L27
            return
        L27:
            X.34l r2 = X.C780334l.LJLIL
            X.XIA r1 = X.C78613UtF.LIZJ
            X.2dA r3 = new X.2dA
            r8 = 0
            r5 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 2
            X.XKX.LIZLLL(r2, r1, r8, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62602cy.LJFF(java.lang.String, boolean):void");
    }

    public static void LJ(EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel, String str, List list) {
        try {
            android.net.Uri parse = UriProtector.parse(str);
            if (parse != null) {
                EcSchemaVerifyRulesModel.QueryRules queryRules = ecSchemaVerifyRulesModel.queryRules;
                for (String str2 : queryRules.ignoreKeyUri) {
                    if ((!o.LJJJJJL(str2)) && s.LJJJLZIJ(str, str2, false)) {
                        return;
                    }
                }
                List<String> list2 = queryRules.keyUri;
                int i = queryRules.httpMaxLength;
                for (String str3 : list2) {
                    try {
                        List<String> queryParameters = UriProtector.getQueryParameters(parse, str3);
                        if (queryParameters != null && !queryParameters.isEmpty()) {
                            for (String queryUriValue : queryParameters) {
                                if (queryUriValue != null && !o.LJJJJJL(queryUriValue)) {
                                    if (i > 0 && queryUriValue != null && o.LJJJLIIL(queryUriValue, "http", true) && queryUriValue.length() > i) {
                                        StringBuilder LIZJ = b1.LIZJ(str3, " http too long: ");
                                        LIZJ.append(queryUriValue.length());
                                        ((ArrayList) list).add(new C2TA(31, X1D.LIZIZ(LIZJ)));
                                    }
                                    kotlin.jvm.internal.o.LJIIIIZZ(queryUriValue, "queryUriValue");
                                    LJI(ecSchemaVerifyRulesModel, queryUriValue, list, str3);
                                    LJII(ecSchemaVerifyRulesModel, queryUriValue, list, str3);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public static void LJIIIIZZ(EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel, String str, List list) {
        String str2;
        EcSchemaVerifyRulesModel.SchemaRules schemaRules = ecSchemaVerifyRulesModel.schemaRules;
        if (!schemaRules.blockWebcast) {
            return;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            if (parse == null || (str2 = parse.getAuthority()) == null) {
                str2 = "";
            }
            if (!o.LJJJLIIL(str2, "webcast_", false)) {
                return;
            }
            for (String str3 : schemaRules.ignoreWebcast) {
                if ((!o.LJJJJJL(str3)) && s.LJJJLZIJ(str, str3, false)) {
                    return;
                }
            }
            ((ArrayList) list).add(new C2TA(5, "webcast deprecated"));
            LIZIZ(str);
        } catch (Throwable unused) {
        }
    }

    public static void LIZJ(String str, String str2, List list, long j) {
        if (o.LJJJJJL(str) || ((ArrayList) list).isEmpty()) {
            return;
        }
        String obj = list.toString();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("schema", str);
            jSONObject.put("page", str2);
            jSONObject.put("errors", obj);
            jSONObject.put("duration", elapsedRealtime);
            C48658J7u.LIZIZ("ec_schema_verify_error", jSONObject);
        } catch (Throwable unused) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:61:0x0146
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static void LJI(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r8, java.lang.String r9, java.util.List r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62602cy.LJI(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel, java.lang.String, java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0132, code lost:
    
        if (r16 == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018b  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r18, java.lang.String r19, java.util.List r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62602cy.LJII(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel, java.lang.String, java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x008d, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r11);
        r1 = X.X1D.LIZ();
        r1.append(r2.getAuthority());
        r1.append(r2.getPath());
        r2 = X.X1D.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0114, code lost:
    
        if (r13 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0134, code lost:
    
        if (r9 != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OSZ LIZ(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r10, java.lang.String r11, boolean r12, boolean r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62602cy.LIZ(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel, java.lang.String, boolean, boolean, java.util.List):X.OSZ");
    }
}
