package X;

/* renamed from: X.JFj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48855JFj {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r11 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r11, X.C48852JFg r12, X.QIF r13) {
        /*
            android.content.SharedPreferences r10 = X.C48847JFb.LIZ(r11, r13)
            android.content.SharedPreferences r2 = r12.LIZ(r13)
            java.lang.String r9 = "dr_install_migrate"
            r11 = 0
            boolean r0 = r10.getBoolean(r9, r11)
            if (r0 == 0) goto L12
            return
        L12:
            android.content.SharedPreferences r1 = r13.LIZJ()
            java.lang.String r13 = "device_id"
            r0 = 0
            java.lang.String r12 = r1.getString(r13, r0)
            java.lang.String r8 = "bd_did"
            java.lang.String r7 = r1.getString(r8, r0)
            java.lang.String r6 = "install_id"
            java.lang.String r5 = r1.getString(r6, r0)
            java.lang.String r4 = "ssid"
            java.lang.String r3 = r1.getString(r4, r0)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 1
            if (r0 != 0) goto L3e
            r2.putString(r13, r12)
            r11 = 1
        L3e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L48
            r2.putString(r8, r7)
            r11 = 1
        L48:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L52
            r2.putString(r6, r5)
            r11 = 1
        L52:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L6a
            r2.putString(r4, r3)
        L5b:
            r2.apply()
        L5e:
            android.content.SharedPreferences$Editor r0 = r10.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r9, r1)
            r0.apply()
            return
        L6a:
            if (r11 == 0) goto L5e
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48855JFj.LIZ(android.content.Context, X.JFg, X.QIF):void");
    }
}
