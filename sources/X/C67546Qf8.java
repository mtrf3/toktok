package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: X.Qf8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67546Qf8 extends AbstractC68050QnG {
    public final C67545Qf7 LIZJ;
    public boolean LIZLLL;

    @Override // X.AbstractC68050QnG
    public final boolean LJIIIIZZ() {
        return false;
    }

    public final SQLiteDatabase LJIIIZ() {
        if (this.LIZLLL) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.LIZJ.getWritableDatabase();
        if (writableDatabase == null) {
            this.LIZLLL = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (0 == 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            r10 = this;
            java.lang.String r6 = "Error deleting app launch break from local database"
            r10.LJFF()
            boolean r0 = r10.LIZLLL
            if (r0 == 0) goto La
            return
        La:
            X.Qmz r0 = r10.LIZ
            android.content.Context r1 = r0.LIZ
            java.lang.String r0 = "google_app_measurement_local.db"
            java.io.File r0 = r1.getDatabasePath(r0)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L9a
            r5 = 5
            r9 = 0
            r4 = 0
            r3 = 5
        L1e:
            r7 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.LJIIIZ()     // Catch: android.database.sqlite.SQLiteException -> L43 android.database.sqlite.SQLiteDatabaseLockedException -> L5d android.database.sqlite.SQLiteFullException -> L66 java.lang.Throwable -> L86
            if (r2 != 0) goto L29
            r10.LIZLLL = r7     // Catch: android.database.sqlite.SQLiteException -> L43 android.database.sqlite.SQLiteDatabaseLockedException -> L5d android.database.sqlite.SQLiteFullException -> L66 java.lang.Throwable -> L86
            goto L81
        L29:
            r2.beginTransaction()     // Catch: android.database.sqlite.SQLiteException -> L43 android.database.sqlite.SQLiteDatabaseLockedException -> L5d android.database.sqlite.SQLiteFullException -> L66 java.lang.Throwable -> L86
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: android.database.sqlite.SQLiteException -> L43 android.database.sqlite.SQLiteDatabaseLockedException -> L5d android.database.sqlite.SQLiteFullException -> L66 java.lang.Throwable -> L86
            r0 = 3
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch: android.database.sqlite.SQLiteException -> L43 android.database.sqlite.SQLiteDatabaseLockedException -> L5d android.database.sqlite.SQLiteFullException -> L66 java.lang.Throwable -> L86
            r8[r9] = r0     // Catch: android.database.sqlite.SQLiteException -> L43 android.database.sqlite.SQLiteDatabaseLockedException -> L5d android.database.sqlite.SQLiteFullException -> L66 java.lang.Throwable -> L86
            java.lang.String r1 = "messages"
            java.lang.String r0 = "type == ?"
            r2.delete(r1, r0, r8)     // Catch: android.database.sqlite.SQLiteException -> L43 android.database.sqlite.SQLiteDatabaseLockedException -> L5d android.database.sqlite.SQLiteFullException -> L66 java.lang.Throwable -> L86
            r2.setTransactionSuccessful()     // Catch: android.database.sqlite.SQLiteException -> L43 android.database.sqlite.SQLiteDatabaseLockedException -> L5d android.database.sqlite.SQLiteFullException -> L66 java.lang.Throwable -> L86
            r2.endTransaction()     // Catch: android.database.sqlite.SQLiteException -> L43 android.database.sqlite.SQLiteDatabaseLockedException -> L5d android.database.sqlite.SQLiteFullException -> L66 java.lang.Throwable -> L86
            goto L82
        L43:
            r1 = move-exception
            if (r2 == 0) goto L4f
            boolean r0 = r2.inTransaction()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L4f
            r2.endTransaction()     // Catch: java.lang.Throwable -> L86
        L4f:
            X.Qmz r0 = r10.LIZ     // Catch: java.lang.Throwable -> L86
            X.Qaq r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> L86
            X.Qar r0 = r0.LJFF     // Catch: java.lang.Throwable -> L86
            r0.LIZIZ(r1, r6)     // Catch: java.lang.Throwable -> L86
            r10.LIZLLL = r7     // Catch: java.lang.Throwable -> L86
            goto L77
        L5d:
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L86
            android.os.SystemClock.sleep(r0)     // Catch: java.lang.Throwable -> L86
            int r3 = r3 + 20
            if (r2 == 0) goto L7c
            goto L79
        L66:
            r1 = move-exception
            X.Qmz r0 = r10.LIZ     // Catch: java.lang.Throwable -> L86
            X.Qaq r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> L86
            X.Qar r0 = r0.LJFF     // Catch: java.lang.Throwable -> L86
            r0.LIZIZ(r1, r6)     // Catch: java.lang.Throwable -> L86
            r10.LIZLLL = r7     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L7c
            goto L79
        L77:
            if (r2 == 0) goto L7c
        L79:
            r2.close()
        L7c:
            int r4 = r4 + 1
            if (r4 >= r5) goto L8d
            goto L1e
        L81:
            return
        L82:
            r2.close()
            return
        L86:
            r0 = move-exception
            if (r2 == 0) goto L8c
            r2.close()
        L8c:
            throw r0
        L8d:
            X.Qmz r0 = r10.LIZ
            X.Qaq r0 = r0.LIZJ()
            X.Qar r1 = r0.LJIIIIZZ
            java.lang.String r0 = "Error deleting app launch break from local database in reasonable time"
            r1.LIZ(r0)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67546Qf8.LJIIJJI():void");
    }

    public final void LJIIJ() {
        int delete;
        LJFF();
        try {
            SQLiteDatabase LJIIIZ = LJIIIZ();
            if (LJIIIZ != null && (delete = LJIIIZ.delete("messages", null, null)) > 0) {
                this.LIZ.LIZJ().LJIILIIL.LIZIZ(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e) {
            this.LIZ.LIZJ().LJFF.LIZIZ(e, "Error resetting local analytics data. error");
        }
    }

    public C67546Qf8(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LIZJ = new C67545Qf7(this, this.LIZ.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c9, code lost:
    
        if (r2 != null) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[Catch: SQLiteException -> 0x0098, SQLiteDatabaseLockedException -> 0x009b, SQLiteFullException -> 0x009d, all -> 0x010f, TRY_ENTER, TryCatch #8 {SQLiteDatabaseLockedException -> 0x009b, SQLiteFullException -> 0x009d, SQLiteException -> 0x0098, all -> 0x010f, blocks: (B:78:0x0039, B:80:0x003f, B:16:0x004f, B:18:0x0074, B:19:0x008e), top: B:77:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67546Qf8.LJIIL(int, byte[]):boolean");
    }
}
