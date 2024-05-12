package com.ss.android.ugc.aweme.compliance.business.agegate.action;

import X.FZF;
import com.bytedance.router.route.IRouteAction;

/* loaded from: classes7.dex */
public final class StoreDataRouteAction implements IRouteAction {
    public static final int $stable = 0;
    public static final FZF Companion = new FZF();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (ujb.o.LJJJLIIL(r3, "ftc_", true) == true) goto L6;
     */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object open(android.content.Context r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            r6 = this;
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            java.lang.String r0 = "key"
            java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r0)
            java.lang.String r0 = "value"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r0)
            java.lang.String r0 = "type"
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r0)
            r5 = 0
            if (r3 == 0) goto L27
            java.lang.String r0 = "ftc_"
            r2 = 1
            boolean r0 = ujb.o.LJJJLIIL(r3, r0, r2)
            if (r0 != r2) goto L27
        L22:
            if (r2 != 0) goto L29
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L27:
            r2 = 0
            goto L22
        L29:
            if (r3 == 0) goto L9e
            if (r1 == 0) goto L9e
            if (r4 == 0) goto L9e
            android.app.Application r2 = X.C58725N2z.LIZ()
            java.lang.String r0 = "aweme-app"
            android.content.SharedPreferences r0 = X.F9J.LIZIZ(r2, r5, r0)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            int r0 = r4.hashCode()     // Catch: java.lang.Exception -> L9e
            switch(r0) {
                case -891985903: goto L4a;
                case 104431: goto L57;
                case 3327612: goto L68;
                case 64711720: goto L79;
                case 97526364: goto L8c;
                default: goto L44;
            }     // Catch: java.lang.Exception -> L9e
        L44:
            r2.apply()     // Catch: java.lang.Exception -> L9e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L9e
            goto L9d
        L4a:
            java.lang.String r0 = "string"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L9e
            if (r0 != 0) goto L53
            goto L44
        L53:
            r2.putString(r3, r1)     // Catch: java.lang.Exception -> L9e
            goto L44
        L57:
            java.lang.String r0 = "int"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L9e
            if (r0 != 0) goto L60
            goto L44
        L60:
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1)     // Catch: java.lang.Exception -> L9e
            r2.putInt(r3, r0)     // Catch: java.lang.Exception -> L9e
            goto L44
        L68:
            java.lang.String r0 = "long"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L9e
            if (r0 != 0) goto L71
            goto L44
        L71:
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r1)     // Catch: java.lang.Exception -> L9e
            r2.putLong(r3, r0)     // Catch: java.lang.Exception -> L9e
            goto L44
        L79:
            java.lang.String r0 = "boolean"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L9e
            if (r0 != 0) goto L82
            goto L44
        L82:
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> L9e
            r2.putBoolean(r3, r0)     // Catch: java.lang.Exception -> L9e
            goto L44
        L8c:
            java.lang.String r0 = "float"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L9e
            if (r0 != 0) goto L95
            goto L44
        L95:
            float r0 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r1)     // Catch: java.lang.Exception -> L9e
            r2.putFloat(r3, r0)     // Catch: java.lang.Exception -> L9e
            goto L44
        L9d:
            return r0
        L9e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.agegate.action.StoreDataRouteAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
