package X;

/* renamed from: X.Ise, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48000Ise {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r1 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.content.Context r20) {
        /*
            java.lang.String r0 = "connectivity"
            r2 = r20
            java.lang.Object r0 = X.C16880lQ.LLILL(r2, r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r3 = 1
            android.net.NetworkInfo r0 = X.C16880lQ.LLLZIL(r0, r3)
            if (r0 == 0) goto L20
            android.net.NetworkInfo$State r1 = r0.getState()
            if (r1 == 0) goto L20
            android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.CONNECTED
            if (r1 == r0) goto L1f
            android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.CONNECTING
            if (r1 != r0) goto L20
        L1f:
            return r3
        L20:
            java.lang.String r0 = "phone"
            java.lang.Object r9 = X.C16880lQ.LLILL(r2, r0)
            android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 2
            r11 = 0
            if (r2 < r1) goto L4f
            java.util.concurrent.atomic.AtomicBoolean r1 = X.C48001Isf.LIZ
            boolean r1 = r1.getAndSet(r3)
            if (r1 != 0) goto L3f
            X.Isc r1 = X.C48001Isf.LIZ()
            r1.LIZIZ()
        L3f:
            X.Isc r1 = X.C48001Isf.LIZ()
            int r1 = r1.LIZ()
            boolean r2 = X.C48001Isf.LIZJ
            if (r2 != 0) goto L88
            r2 = -1
            if (r1 != r2) goto L88
        L4e:
            return r11
        L4f:
            X.0Dg r3 = new X.0Dg
            r3.<init>(r0)
            java.lang.Object[] r8 = new java.lang.Object[r11]
            X.Pk0 r10 = new X.Pk0
            java.lang.String r2 = "()I"
            java.lang.String r1 = "3618520788498963708"
            r10.<init>(r11, r2, r1)
            r4 = 102013(0x18e7d, float:1.4295E-40)
            java.lang.String r14 = "android/telephony/TelephonyManager"
            java.lang.String r15 = "getNetworkType"
            java.lang.String r18 = "int"
            r12 = r3
            r13 = r4
            r16 = r9
            r17 = r8
            r19 = r10
            X.Ff9 r2 = r12.LIZJ(r13, r14, r15, r16, r17, r18, r19)
            boolean r1 = r2.LIZ
            if (r1 == 0) goto L8c
            r7 = 0
            java.lang.String r5 = "android/telephony/TelephonyManager"
            java.lang.String r6 = "getNetworkType"
            r3.LIZIZ(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r1 = r2.LIZIZ
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L88:
            switch(r1) {
                case 1: goto Laa;
                case 2: goto Laa;
                case 3: goto La8;
                case 4: goto Laa;
                case 5: goto La8;
                case 6: goto La8;
                case 7: goto Laa;
                case 8: goto La8;
                case 9: goto La8;
                case 10: goto La8;
                case 11: goto Laa;
                case 12: goto La8;
                case 13: goto La6;
                case 14: goto La8;
                case 15: goto La8;
                default: goto L8b;
            }
        L8b:
            goto L4e
        L8c:
            int r1 = r9.getNetworkType()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
            java.lang.String r14 = "android/telephony/TelephonyManager"
            java.lang.String r15 = "getNetworkType"
            r20 = 1
            r12 = r3
            r13 = r4
            r17 = r8
            r18 = r9
            r19 = r10
            r12.LIZIZ(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L88
        La6:
            r0 = 4
            return r0
        La8:
            r0 = 3
            return r0
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48000Ise.LIZ(android.content.Context):int");
    }
}
