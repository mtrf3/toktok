package X;

/* loaded from: classes12.dex */
public class P5U {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public StackTraceElement[] LIZLLL;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        if (r0 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r10 = this;
            java.lang.StringBuilder r8 = X.X1D.LIZ()
            java.lang.String r0 = "{\"start\":"
            r8.append(r0)
            long r0 = r10.LIZ
            r8.append(r0)
            java.lang.String r0 = ",\"end\":"
            r8.append(r0)
            long r0 = r10.LIZIZ
            r8.append(r0)
            java.lang.String r0 = ",\"parcel_size\":"
            r8.append(r0)
            long r0 = r10.LIZJ
            r8.append(r0)
            java.lang.String r0 = ",\"cost_millis\":"
            r8.append(r0)
            long r4 = r10.LIZIZ
            long r6 = r10.LIZ
            java.lang.String r9 = ",\"java_stack\":\""
            X.C48339Iy7.LIZLLL(r4, r6, r8, r9)
            java.lang.StackTraceElement[] r0 = r10.LIZLLL
            r4 = 0
            if (r0 == 0) goto Lb9
            int r1 = r0.length
            if (r1 != 0) goto L99
        L3a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r3 = r0.length
            r2 = 0
        L41:
            if (r4 >= r3) goto L8b
            r7 = r0[r4]
            int r2 = r2 + 1
            java.lang.StringBuilder r6 = X.X1D.LIZ()
            java.lang.String r1 = "\\tat "
            r6.append(r1)
            java.lang.String r1 = r7.getClassName()
            r6.append(r1)
            java.lang.String r1 = X.X1D.LIZIZ(r6)
            r5.append(r1)
            java.lang.String r1 = "."
            r5.append(r1)
            java.lang.String r1 = r7.getMethodName()
            r5.append(r1)
            java.lang.String r1 = "("
            r5.append(r1)
            java.lang.String r1 = r7.getFileName()
            r5.append(r1)
            java.lang.String r1 = ":"
            r5.append(r1)
            int r1 = r7.getLineNumber()
            r5.append(r1)
            java.lang.String r1 = ")\\n"
            r5.append(r1)
            r1 = 40
            if (r2 <= r1) goto L96
        L8b:
            java.lang.String r1 = r5.toString()
        L8f:
            java.lang.String r0 = "\"}"
            java.lang.String r0 = X.JBR.LJFF(r8, r1, r0, r8)
            return r0
        L96:
            int r4 = r4 + 1
            goto L41
        L99:
            r3 = 0
        L9a:
            int r1 = r0.length
            if (r3 >= r1) goto Lbf
            r1 = r0[r3]
            java.lang.String r2 = "saveBinderInfo"
            java.lang.String r1 = r1.getMethodName()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lbc
        Lab:
            int r2 = r3 + 1
            int r1 = r0.length
            if (r2 > r1) goto L3a
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            if (r0 != 0) goto L3a
        Lb9:
            java.lang.String r1 = "Invalid Stack\n"
            goto L8f
        Lbc:
            int r3 = r3 + 1
            goto L9a
        Lbf:
            r3 = 0
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P5U.toString():java.lang.String");
    }
}
