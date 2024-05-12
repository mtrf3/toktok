package X;

/* loaded from: classes29.dex */
public final class ZWS {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r7 > 'z') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        r4.append(X.C16880lQ.LLLZ("%%%04x", new java.lang.Object[]{java.lang.Integer.valueOf(r7)}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        if (r7 == '_') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        if (r7 == ':') goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r8, java.util.Collection r9) {
        /*
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "com.google.android.gms.cast.CATEGORY_CAST"
            r3.<init>(r0)
            java.lang.String r2 = r8.toUpperCase()
            java.lang.String r0 = "[A-F0-9]+"
            boolean r0 = r2.matches(r0)
            if (r0 != 0) goto L2b
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            int r0 = r8.length()
            java.lang.String r1 = "Invalid application ID: "
            if (r0 == 0) goto L25
            java.lang.String r0 = r1.concat(r8)
        L21:
            r2.<init>(r0)
            throw r2
        L25:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L21
        L2b:
            java.lang.String r1 = "/"
            r3.append(r1)
            r3.append(r2)
            if (r9 == 0) goto Lce
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Lc6
            r3.append(r1)
            java.util.Iterator r9 = r9.iterator()
            r6 = 1
            r1 = 1
        L44:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Ld1
            java.lang.Object r5 = r9.next()
            java.lang.String r5 = (java.lang.String) r5
            X.C90468Zey.LIZLLL(r5)
            if (r1 != 0) goto L5a
            java.lang.String r0 = ","
            r3.append(r0)
        L5a:
            java.util.regex.Pattern r0 = X.C90468Zey.LIZ
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r0 = r0.matches()
            r8 = 0
            if (r0 == 0) goto L6c
        L67:
            r3.append(r5)
            r1 = 0
            goto L44
        L6c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r0 = r5.length()
            r4.<init>(r0)
            r2 = 0
        L76:
            int r0 = r5.length()
            if (r2 >= r0) goto Lc1
            char r7 = r5.charAt(r2)
            r0 = 65
            if (r7 < r0) goto La4
            r0 = 90
            if (r7 <= r0) goto Lb4
            r0 = 97
            if (r7 < r0) goto La4
            r0 = 122(0x7a, float:1.71E-43)
            if (r7 <= r0) goto Lb4
        L90:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r8] = r0
            java.lang.String r0 = "%%%04x"
            java.lang.String r0 = X.C16880lQ.LLLZ(r0, r1)
            r4.append(r0)
        La1:
            int r2 = r2 + 1
            goto L76
        La4:
            r0 = 48
            if (r7 < r0) goto Lb0
            r0 = 57
            if (r7 <= r0) goto Lb4
            r0 = 95
            if (r7 == r0) goto Lb4
        Lb0:
            r0 = 45
            if (r7 != r0) goto Lb8
        Lb4:
            r4.append(r7)
            goto La1
        Lb8:
            r0 = 46
            if (r7 == r0) goto Lb4
            r0 = 58
            if (r7 == r0) goto Lb4
            goto L90
        Lc1:
            java.lang.String r5 = r4.toString()
            goto L67
        Lc6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must specify at least one namespace"
            r1.<init>(r0)
            throw r1
        Lce:
            r3.append(r1)
        Ld1:
            java.lang.String r0 = "//ALLOW_IPV6"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ZWS.LIZ(java.lang.String, java.util.Collection):java.lang.String");
    }
}
