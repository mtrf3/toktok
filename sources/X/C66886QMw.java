package X;

import android.content.Context;

/* renamed from: X.QMw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66886QMw {
    public static J9S LIZ;
    public static final C66886QMw LIZIZ = new C66886QMw();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x0008, B:9:0x0019, B:11:0x0033, B:13:0x003a, B:15:0x0041, B:26:0x000e, B:28:0x0013), top: B:4:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x0008, B:9:0x0019, B:11:0x0033, B:13:0x003a, B:15:0x0041, B:26:0x000e, B:28:0x0013), top: B:4:0x0004, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ() {
        /*
            r13 = this;
            java.lang.String r3 = "settings"
            monitor-enter(r13)
            r9 = 0
            X.J9S r0 = X.C66886QMw.LIZ     // Catch: android.database.sqlite.SQLiteException -> Ld java.lang.Throwable -> L46
            if (r0 == 0) goto L16
            android.database.sqlite.SQLiteDatabase r4 = r0.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> Ld java.lang.Throwable -> L46
            goto L17
        Ld:
            r2 = move-exception
            int r1 = X.C61349O5x.LIZ     // Catch: java.lang.Throwable -> L46
            r0 = 3
            if (r1 >= r0) goto L16
            X.C16880lQ.LLLLIIL(r2)     // Catch: java.lang.Throwable -> L46
        L16:
            r4 = r9
        L17:
            if (r4 == 0) goto L30
            java.lang.String r5 = "h5_storage"
            java.lang.String r0 = "content"
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = "primary_key=?"
            java.lang.String[] r8 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L46
            java.lang.String r12 = "1"
            r10 = r9
            r11 = r9
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L46
            goto L31
        L30:
            r2 = r9
        L31:
            if (r2 == 0) goto L3f
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L46
            r0 = 1
            if (r1 != r0) goto L3f
            r0 = 0
            java.lang.String r9 = r2.getString(r0)     // Catch: java.lang.Throwable -> L46
        L3f:
            if (r2 == 0) goto L44
            r2.close()     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r13)
            return r9
        L46:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66886QMw.LIZ():java.lang.String");
    }

    public final void LIZIZ(Context context) {
        synchronized (this) {
            LIZ = new J9S(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r8 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L69
            java.lang.String r3 = "settings"
            monitor-enter(r9)
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "insertOrUpdate: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L89
            r1.append(r3)     // Catch: java.lang.Throwable -> L89
            X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L89
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "content: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L89
            r1.append(r10)     // Catch: java.lang.Throwable -> L89
            X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L89
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L89
            r7.<init>()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "primary_key"
            r7.put(r0, r3)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "time_stamp"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L89
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L89
            r7.put(r2, r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "content"
            r7.put(r0, r10)     // Catch: java.lang.Throwable -> L89
            r8 = 0
            X.J9S r0 = X.C66886QMw.LIZ     // Catch: android.database.sqlite.SQLiteException -> L5c java.lang.Throwable -> L89
            if (r0 == 0) goto L68
            android.database.sqlite.SQLiteDatabase r6 = r0.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L5c java.lang.Throwable -> L89
            if (r6 == 0) goto L68
            java.lang.String r2 = "h5_storage"
            java.lang.String r1 = "primary_key=?"
            java.lang.String[] r0 = new java.lang.String[]{r3}     // Catch: android.database.SQLException -> L82 java.lang.Throwable -> L89
            int r0 = r6.update(r2, r7, r1, r0)     // Catch: android.database.SQLException -> L82 java.lang.Throwable -> L89
            long r0 = (long) r0     // Catch: android.database.SQLException -> L82 java.lang.Throwable -> L89
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: android.database.SQLException -> L82 java.lang.Throwable -> L89
            goto L66
        L5c:
            r2 = move-exception
            int r1 = X.C61349O5x.LIZ     // Catch: java.lang.Throwable -> L89
            r0 = 3
            if (r1 >= r0) goto L68
            X.C16880lQ.LLLLIIL(r2)     // Catch: java.lang.Throwable -> L89
            goto L68
        L66:
            if (r5 != 0) goto L6a
        L68:
            monitor-exit(r9)
        L69:
            return
        L6a:
            long r3 = r5.longValue()     // Catch: android.database.SQLException -> L81 java.lang.Throwable -> L89
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L85
            if (r6 == 0) goto L68
            java.lang.String r0 = "h5_storage"
            long r0 = r6.insert(r0, r8, r7)     // Catch: android.database.SQLException -> L81 java.lang.Throwable -> L89
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch: android.database.SQLException -> L81 java.lang.Throwable -> L89
            goto L82
        L81:
            r8 = r5
        L82:
            r5 = r8
            if (r8 == 0) goto L68
        L85:
            r5.longValue()     // Catch: java.lang.Throwable -> L89
            goto L68
        L89:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66886QMw.LIZJ(java.lang.String):void");
    }
}
