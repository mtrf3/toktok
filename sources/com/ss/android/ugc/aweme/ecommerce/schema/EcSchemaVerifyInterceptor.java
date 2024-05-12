package com.ss.android.ugc.aweme.ecommerce.schema;

import X.AbstractC62652d3;
import X.C62602cy;
import X.C62712d9;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcSchemaVerifyInterceptor extends AbstractC62652d3 implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        r0 = (java.lang.String) X.ORZ.LJLLLLLL(1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008f, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0097, code lost:
    
        if ((!ujb.o.LJJJJJL(r5)) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        r2 = r6.blockCrossPage.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a3, code lost:
    
        if (r2.hasNext() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b1, code lost:
    
        if ((!ujb.o.LJJJJJL(r1)) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b7, code lost:
    
        if (ujb.s.LJJJLZIJ(r3, r1, false) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bc, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bf, code lost:
    
        r2 = r6.blockCrossUrl.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c9, code lost:
    
        if (r2.hasNext() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cb, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d7, code lost:
    
        if ((!ujb.o.LJJJJJL(r1)) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dd, code lost:
    
        if (ujb.s.LJJJLZIJ(r5, r1, false) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00df, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e2, code lost:
    
        if (r3 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e4, code lost:
    
        if (r0 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e1, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00be, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ba, code lost:
    
        r5 = r0;
     */
    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchInterceptRules(java.lang.String r10) {
        /*
            r9 = this;
            r4 = 0
            r7 = 1
            if (r10 == 0) goto La
            boolean r0 = ujb.o.LJJJJJL(r10)
            if (r0 == 0) goto Lb
        La:
            return r4
        Lb:
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "ec_schema_verify_rules"
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel> r0 = com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel.class
            com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r2 = X.C62592cx.LIZ     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r3.LJIIIIZZ(r1, r0, r2)     // Catch: java.lang.Throwable -> L21
            com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r0 = (com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel) r0     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L1f
            goto L23
        L1f:
            r2 = r0
            goto L23
        L21:
            com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r2 = X.C62592cx.LIZ     // Catch: java.lang.Exception -> La
        L23:
            boolean r0 = r2.enableVerify     // Catch: java.lang.Exception -> La
            if (r0 != 0) goto L28
            goto La
        L28:
            java.lang.String r0 = "?"
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> La
            r0 = 2
            java.util.List r8 = ujb.s.LJLJJL(r10, r1, r0, r0)     // Catch: java.lang.Exception -> La
            java.lang.Object r3 = X.ORZ.LJLLLLLL(r4, r8)     // Catch: java.lang.Exception -> La
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> La
            java.lang.String r5 = ""
            if (r3 != 0) goto L3e
            r3 = r5
        L3e:
            boolean r0 = ujb.o.LJJJJJL(r3)     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto L45
            goto La
        L45:
            com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel$BlockRules r6 = r2.blockRules     // Catch: java.lang.Exception -> La
            java.util.List<java.lang.String> r0 = r6.ignorePage     // Catch: java.lang.Exception -> La
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> La
        L4d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto L68
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> La
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: java.lang.Exception -> La
            r0 = r0 ^ 1
            if (r0 == 0) goto L4d
            boolean r0 = ujb.s.LJJJLZIJ(r3, r1, r4)     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto L4d
            goto La
        L68:
            java.util.List<java.lang.String> r0 = r6.blockNativePage     // Catch: java.lang.Exception -> La
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> La
        L6e:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto L89
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> La
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: java.lang.Exception -> La
            r0 = r0 ^ 1
            if (r0 == 0) goto L6e
            boolean r0 = ujb.s.LJJJLZIJ(r3, r1, r4)     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto L6e
            goto Le6
        L89:
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r7, r8)     // Catch: java.lang.Exception -> La
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> La
            if (r0 != 0) goto Lba
        L91:
            boolean r0 = ujb.o.LJJJJJL(r5)     // Catch: java.lang.Exception -> La
            r0 = r0 ^ 1
            if (r0 == 0) goto La
            java.util.List<java.lang.String> r0 = r6.blockCrossPage     // Catch: java.lang.Exception -> La
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> La
        L9f:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto Lbe
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> La
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: java.lang.Exception -> La
            r0 = r0 ^ 1
            if (r0 == 0) goto L9f
            boolean r0 = ujb.s.LJJJLZIJ(r3, r1, r4)     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto L9f
            goto Lbc
        Lba:
            r5 = r0
            goto L91
        Lbc:
            r3 = 1
            goto Lbf
        Lbe:
            r3 = 0
        Lbf:
            java.util.List<java.lang.String> r0 = r6.blockCrossUrl     // Catch: java.lang.Exception -> La
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> La
        Lc5:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto Le1
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> La
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: java.lang.Exception -> La
            r0 = r0 ^ 1
            if (r0 == 0) goto Lc5
            boolean r0 = ujb.s.LJJJLZIJ(r5, r1, r4)     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto Lc5
            r0 = 1
            goto Le2
        Le1:
            r0 = 0
        Le2:
            if (r3 == 0) goto La
            if (r0 == 0) goto La
        Le6:
            r4 = 1
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyInterceptor.matchInterceptRules(java.lang.String):boolean");
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        return matchInterceptRules(str);
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String url) {
        o.LJIIIZ(sparkContext, "sparkContext");
        o.LJIIIZ(url, "url");
        super.handleSparkContext(sparkContext, url);
        C62602cy.LJFF(url, false);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        C62602cy.LJFF(str, true);
        return false;
    }
}
