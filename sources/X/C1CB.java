package X;

import android.database.Cursor;

/* renamed from: X.1CB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CB extends AbstractC262311f {
    public C0BG LIZIZ;
    public final C0BE LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @Override // X.AbstractC262311f
    public final void LIZIZ() {
    }

    @Override // X.AbstractC262311f
    public final void LIZJ(C38451f7 c38451f7) {
        Cursor query = c38451f7.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (query.moveToFirst()) {
                if (query.getInt(0) == 0) {
                    z = true;
                }
            }
            query.close();
            this.LIZJ.LIZ(c38451f7);
            if (!z) {
                C0BF LJI = this.LIZJ.LJI(c38451f7);
                if (!LJI.LIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Pre-packaged database has an invalid schema: ");
                    LIZ.append(LJI.LIZIZ);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            }
            LJI(c38451f7);
            this.LIZJ.LIZJ();
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    @Override // X.AbstractC262311f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C38451f7 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r1 = r6.query(r0)
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L87
            r3 = 0
            if (r0 == 0) goto L14
            int r0 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            r1.close()
            r4 = 0
            if (r0 == 0) goto L38
            X.1di r1 = new X.1di
            java.lang.String r0 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r0)
            android.database.Cursor r2 = r6.LLLLZLLIL(r1)
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L4b
            java.lang.String r1 = r2.getString(r3)     // Catch: java.lang.Throwable -> L33
            goto L4c
        L33:
            r0 = move-exception
            r2.close()
            throw r0
        L38:
            X.0BE r0 = r5.LIZJ
            X.0BF r3 = r0.LJI(r6)
            boolean r0 = r3.LIZ
            if (r0 == 0) goto L6f
            X.0BE r0 = r5.LIZJ
            r0.LJ()
            r5.LJI(r6)
            goto L5f
        L4b:
            r1 = r4
        L4c:
            r2.close()
            java.lang.String r0 = r5.LIZLLL
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5f
            java.lang.String r0 = r5.LJ
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
        L5f:
            X.0BE r0 = r5.LIZJ
            r0.LIZLLL(r6)
            r5.LIZIZ = r4
            return
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
            r1.<init>(r0)
            throw r1
        L6f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r1.append(r0)
            java.lang.String r0 = r3.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L87:
            r0 = move-exception
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CB.LJ(X.1f7):void");
    }

    public final void LJI(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        LIZ.append(str);
        LIZ.append("')");
        c38451f7.LJJIJIIJI(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC262311f
    public final void LIZLLL(C38451f7 c38451f7, int i, int i2) {
        LJFF(c38451f7, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        ((X.AbstractC23740wU) r1.next()).LIZ(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r3 = r8.LIZJ.LJI(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r3.LIZ == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r8.LIZJ.LJ();
        LJI(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("Migration didn't properly handle: ");
        r1.append(r3.LIZIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c0, code lost:
    
        throw new java.lang.IllegalStateException(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r4 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        r8.LIZJ.LJFF(r9);
        r1 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r1.hasNext() == false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058 A[EDGE_INSN: B:51:0x0058->B:56:0x0058 BREAK  A[LOOP:1: B:22:0x0046->B:38:0x008d], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // X.AbstractC262311f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C38451f7 r9, int r10, int r11) {
        /*
            r8 = this;
            X.0BG r0 = r8.LIZIZ
            if (r0 == 0) goto L58
            X.0BZ r5 = r0.LIZLLL
            r5.getClass()
            if (r10 != r11) goto L3d
            java.util.List r4 = java.util.Collections.emptyList()
            if (r4 == 0) goto L58
        L11:
            X.0BE r0 = r8.LIZJ
            r0.LJFF(r9)
            java.util.Iterator r1 = r4.iterator()
        L1a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.next()
            X.0wU r0 = (X.AbstractC23740wU) r0
            r0.LIZ(r9)
            goto L1a
        L2a:
            X.0BE r0 = r8.LIZJ
            X.0BF r3 = r0.LJI(r9)
            boolean r0 = r3.LIZ
            if (r0 == 0) goto La9
            X.0BE r0 = r8.LIZJ
            r0.LJ()
            r8.LJI(r9)
            goto L6c
        L3d:
            if (r11 <= r10) goto La7
            r7 = 1
        L40:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = r10
        L46:
            if (r7 == 0) goto La4
            if (r6 >= r11) goto L11
        L4a:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, X.0wU>> r1 = r5.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r3 = r1.get(r0)
            java.util.TreeMap r3 = (java.util.TreeMap) r3
            if (r3 != 0) goto L6d
        L58:
            X.0BG r0 = r8.LIZIZ
            if (r0 == 0) goto Lc1
            boolean r0 = r0.LIZ(r10, r11)
            if (r0 != 0) goto Lc1
            X.0BE r0 = r8.LIZJ
            r0.LIZIZ(r9)
            X.0BE r0 = r8.LIZJ
            r0.LIZ(r9)
        L6c:
            return
        L6d:
            if (r7 == 0) goto L9f
            java.util.NavigableSet r0 = r3.descendingKeySet()
        L73:
            java.util.Iterator r2 = r0.iterator()
        L77:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            if (r7 == 0) goto L9a
            if (r1 > r11) goto L77
            if (r1 <= r6) goto L77
        L8d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r3.get(r0)
            r4.add(r0)
            r6 = r1
            goto L46
        L9a:
            if (r1 < r11) goto L77
            if (r1 >= r6) goto L77
            goto L8d
        L9f:
            java.util.Set r0 = r3.keySet()
            goto L73
        La4:
            if (r6 <= r11) goto L11
            goto L4a
        La7:
            r7 = 0
            goto L40
        La9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Migration didn't properly handle: "
            r1.append(r0)
            java.lang.String r0 = r3.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        Lc1:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = "A migration from "
            java.lang.String r1 = " to "
            java.lang.String r0 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.String r0 = X.C48690J9a.LJIIJJI(r2, r10, r1, r11, r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CB.LJFF(X.1f7, int, int):void");
    }

    public C1CB(C0BG c0bg, C0BE c0be, String str, String str2) {
        super(c0be.LIZ);
        this.LIZIZ = c0bg;
        this.LIZJ = c0be;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
