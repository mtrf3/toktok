package X;

/* loaded from: classes12.dex */
public final class PSF extends Thread {
    public final /* synthetic */ PSH LJLIL;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0049, code lost:
    
        if (r2 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r8 = this;
            X.PSH r3 = r8.LJLIL
            r3.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = r3.LIZLLL
            monitor-enter(r2)
            boolean r0 = r3.LJII     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L13
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            goto L9f
        L13:
            java.io.File r0 = r3.LIZJ     // Catch: java.lang.Throwable -> La3
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L27
            java.io.File r0 = r3.LIZ     // Catch: java.lang.Throwable -> La3
            X.C16880lQ.LLLZZIL(r0)     // Catch: java.lang.Throwable -> La3
            java.io.File r1 = r3.LIZJ     // Catch: java.lang.Throwable -> La3
            java.io.File r0 = r3.LIZ     // Catch: java.lang.Throwable -> La3
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> La3
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            r4 = 0
            java.io.File r0 = r3.LIZ     // Catch: java.lang.Throwable -> L51
            boolean r0 = r0.canRead()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L51
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L51
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L51
            java.io.File r0 = r3.LIZ     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L51
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L51
            r0 = 16384(0x4000, float:2.2959E-41)
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L51
            java.util.HashMap r4 = X.C79256V8q.LIZ(r2)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L49
            goto L4b
        L44:
            r0 = move-exception
            r2.close()     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L51
            goto L50
        L49:
            if (r2 == 0) goto L51
        L4b:
            r2.close()     // Catch: java.lang.Throwable -> L51
            goto L51
        L4f:
            r0 = move-exception
        L50:
            throw r0     // Catch: java.lang.Throwable -> L51
        L51:
            java.lang.Object r1 = r3.LIZLLL
            monitor-enter(r1)
            r0 = 1
            r3.LJII = r0     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L5a
            goto L62
        L5a:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> La0
            r0.<init>()     // Catch: java.lang.Throwable -> La0
            r3.LJFF = r0     // Catch: java.lang.Throwable -> La0
            goto L64
        L62:
            r3.LJFF = r4     // Catch: java.lang.Throwable -> La0
        L64:
            java.lang.Object r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> La0
            r0.notifyAll()     // Catch: java.lang.Throwable -> La0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r5
            long r4 = java.lang.Math.abs(r0)
            r1 = 400(0x190, double:1.976E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L9f
            java.lang.String r7 = r3.LIZIZ
            java.io.File r0 = r3.LIZ
            long r1 = r0.length()
            java.lang.String r6 = "sp_init_cost"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L9b
            r3.<init>()     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = "sp_init_cost_time"
            r3.put(r0, r4)     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = "sp_file_name"
            r3.put(r0, r7)     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = "sp_file_size"
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L9b
            X.FUA.LIZIZ(r6, r6, r3)     // Catch: java.lang.Exception -> L9b
            goto L9f
        L9b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L9f:
            return
        La0:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
            throw r0
        La3:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PSF.LIZ():void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PSF(PSH psh) {
        super("SharedPreferencesImpl-load");
        this.LJLIL = psh;
    }
}
