package com.google.gson.internal;

/* loaded from: classes7.dex */
public final class k {
    public static final int LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r2 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r2 == (-1)) goto L17;
     */
    static {
        /*
            java.lang.String r0 = "java.version"
            java.lang.String r6 = java.lang.System.getProperty(r0)
            r5 = -1
            r4 = 0
            java.lang.String r0 = "[._]"
            java.lang.String[] r3 = r6.split(r0)     // Catch: java.lang.NumberFormatException -> L22
            r0 = r3[r4]     // Catch: java.lang.NumberFormatException -> L22
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L22
            r1 = 1
            if (r2 != r1) goto L20
            int r0 = r3.length     // Catch: java.lang.NumberFormatException -> L22
            if (r0 <= r1) goto L48
            r0 = r3[r1]     // Catch: java.lang.NumberFormatException -> L22
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L22
        L20:
            if (r2 != r5) goto L45
        L22:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L47
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L47
        L27:
            int r0 = r6.length()     // Catch: java.lang.NumberFormatException -> L47
            if (r4 >= r0) goto L3d
            char r1 = r6.charAt(r4)     // Catch: java.lang.NumberFormatException -> L47
            boolean r0 = java.lang.Character.isDigit(r1)     // Catch: java.lang.NumberFormatException -> L47
            if (r0 == 0) goto L3d
            r2.append(r1)     // Catch: java.lang.NumberFormatException -> L47
            int r4 = r4 + 1
            goto L27
        L3d:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> L47
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L47
        L45:
            if (r2 != r5) goto L48
        L47:
            r2 = 6
        L48:
            com.google.gson.internal.k.LIZ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.k.<clinit>():void");
    }
}
