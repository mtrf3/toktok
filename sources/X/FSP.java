package X;

/* loaded from: classes7.dex */
public final class FSP extends FSS<Void> {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        r5 = r1.substring(r1.indexOf(58) + 1).trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r5 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r2 = X.FSQ.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r5.contains(r2) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        r5 = r5.substring((r5.indexOf(r2) + r2.length()) + 1).trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r5 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r1 = X.FSQ.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        X.FSQ.LJII = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0081, code lost:
    
        if (X.FSQ.LIZ() != false) goto L39;
     */
    @Override // X.FSM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            boolean r0 = X.FSQ.LJI
            if (r0 == 0) goto Lb
        L4:
            X.P4W.LIZ()
            X.C37386Elq.LIZ()
            return
        Lb:
            r6 = 1
            r5 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La8
            java.lang.String r0 = X.FSQ.LIZ     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La8
            r4.<init>(r0)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La8
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> La3
            r3.<init>(r4)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> La3
        L19:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            if (r1 == 0) goto L64
            java.lang.String r0 = X.FSQ.LJ     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            if (r0 == 0) goto L19
            java.lang.String r0 = ":"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            if (r0 == 0) goto L19
            r0 = 58
            int r0 = r1.indexOf(r0)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            java.lang.String r5 = r0.trim()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            if (r5 == 0) goto L64
            java.lang.String r2 = X.FSQ.LJFF     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            boolean r0 = r5.contains(r2)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            if (r0 == 0) goto L5e
            int r1 = r5.indexOf(r2)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            int r0 = r2.length()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            int r1 = r1 + r0
            int r0 = r1 + 1
            java.lang.String r0 = r5.substring(r0)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            java.lang.String r5 = r0.trim()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8b
            if (r5 == 0) goto L64
        L5e:
            java.lang.Object r1 = X.FSQ.LJIIIIZZ
            monitor-enter(r1)
            X.FSQ.LJII = r5     // Catch: java.lang.Throwable -> L88
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
        L64:
            r3.close()     // Catch: java.lang.Exception -> L67
        L67:
            r4.close()     // Catch: java.lang.Exception -> L84
            goto L84
        L6b:
            if (r5 == 0) goto L73
            java.lang.Object r1 = X.FSQ.LJIIIIZZ
            monitor-enter(r1)
            X.FSQ.LJII = r5     // Catch: java.lang.Throwable -> La0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
        L73:
            if (r3 == 0) goto L78
            r3.close()     // Catch: java.lang.Exception -> L78
        L78:
            if (r4 == 0) goto L7d
            r4.close()     // Catch: java.lang.Exception -> L7d
        L7d:
            boolean r0 = X.FSQ.LIZ()
            if (r0 != 0) goto L84
            goto L4
        L84:
            X.FSQ.LJI = r6
            goto L4
        L88:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            throw r0
        L8b:
            r0 = move-exception
            if (r5 == 0) goto L98
            java.lang.Object r1 = X.FSQ.LJIIIIZZ
            monitor-enter(r1)
            X.FSQ.LJII = r5     // Catch: java.lang.Throwable -> L95
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L95
            goto L98
        L95:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L95
            throw r0
        L98:
            if (r3 == 0) goto L9d
            r3.close()     // Catch: java.lang.Exception -> L9d
        L9d:
            if (r4 == 0) goto La9
            goto La4
        La0:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
            throw r0
        La3:
            r0 = move-exception
        La4:
            r4.close()     // Catch: java.lang.Exception -> La9
            goto La9
        La8:
            r0 = move-exception
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FSP.LIZ():void");
    }
}
