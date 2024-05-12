package X;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.Ir4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47902Ir4 implements InterfaceC47522Ikw {
    public final SQLiteDatabase LJLIL;
    public final String LJLILLLLZI;
    public final C47904Ir6 LJLJI;
    public final boolean LJLJJI;

    @Override // X.InterfaceC47522Ikw
    public final boolean clear() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.LJLIL;
        if (sQLiteDatabase2 == null) {
            return false;
        }
        try {
            sQLiteDatabase2.beginTransaction();
            try {
                try {
                    this.LJLIL.execSQL(C16880lQ.LLLZ("DELETE FROM %s ", new Object[]{this.LJLILLLLZI}));
                    this.LJLIL.setTransactionSuccessful();
                    TTVideoEngineLog.d("KVDBManager", "all cleared");
                    sQLiteDatabase = this.LJLIL;
                } finally {
                }
            } catch (Exception e) {
                TTVideoEngineLog.d(e);
                sQLiteDatabase = this.LJLIL;
            }
            sQLiteDatabase.endTransaction();
            return true;
        } catch (Exception e2) {
            TTVideoEngineLog.d(e2);
            return false;
        }
    }

    @Override // X.InterfaceC47522Ikw
    public final boolean LIZ(String str) {
        return LIZJ(str);
    }

    /* JADX WARN: Failed to calculate best type for var: r2v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r2v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0063: MOVE (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:16777315), block:B:24:0x0063 */
    public final String LIZIZ(String str) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(str)) {
            try {
                if (this.LJLIL != null) {
                    try {
                        Cursor rawQuery = this.LJLIL.rawQuery(C16880lQ.LLLZ("SELECT * FROM %s WHERE key='%s'", new Object[]{this.LJLILLLLZI, str}), null);
                        if (rawQuery.moveToFirst()) {
                            str3 = rawQuery.getString(rawQuery.getColumnIndex("value"));
                        } else {
                            str3 = null;
                        }
                        try {
                            rawQuery.close();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("get key: ");
                            LIZ.append(str);
                            LIZ.append(" value: ");
                            LIZ.append(str3);
                            TTVideoEngineLog.d("KVDBManager", X1D.LIZIZ(LIZ));
                            return str3;
                        } catch (Exception e) {
                            e = e;
                            TTVideoEngineLog.d(e);
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            } catch (Throwable unused2) {
                return str2;
            }
        }
        C78253UnR.LIZLLL("KVDBManager", "open db fail");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0060 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:7:0x0016, B:10:0x0034, B:32:0x0059, B:34:0x0060, B:35:0x0071), top: B:6:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r4 = "remove key "
            android.database.sqlite.SQLiteDatabase r0 = r7.LJLIL
            java.lang.String r2 = "KVDBManager"
            r6 = 0
            if (r0 == 0) goto Lf
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L15
        Lf:
            java.lang.String r0 = "open db fail"
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r2, r0)
            return r6
        L15:
            r5 = 1
            android.database.sqlite.SQLiteDatabase r0 = r7.LJLIL     // Catch: java.lang.Throwable -> L74
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "DELETE FROM %s WHERE key='%s'"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L59
            java.lang.String r0 = r7.LJLILLLLZI     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L59
            r1[r6] = r0     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L59
            r1[r5] = r8     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L59
            java.lang.String r1 = X.C16880lQ.LLLZ(r3, r1)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L59
            android.database.sqlite.SQLiteDatabase r0 = r7.LJLIL     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L59
            r0.execSQL(r1)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L59
            android.database.sqlite.SQLiteDatabase r0 = r7.LJLIL     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L59
            r0.setTransactionSuccessful()     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L59
            android.database.sqlite.SQLiteDatabase r0 = r7.LJLIL     // Catch: java.lang.Throwable -> L74
            r0.endTransaction()     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r0 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L74
            r0.append(r4)     // Catch: java.lang.Throwable -> L74
            r0.append(r8)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = X.X1D.LIZIZ(r0)     // Catch: java.lang.Throwable -> L74
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r2, r0)     // Catch: java.lang.Throwable -> L74
            return r5
        L4b:
            r0 = move-exception
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r0)     // Catch: java.lang.Throwable -> L58
            android.database.sqlite.SQLiteDatabase r0 = r7.LJLIL     // Catch: java.lang.Throwable -> L55
            r0.endTransaction()     // Catch: java.lang.Throwable -> L55
            return r6
        L55:
            r0 = move-exception
            r6 = 1
            goto L75
        L58:
            r6 = 1
        L59:
            android.database.sqlite.SQLiteDatabase r0 = r7.LJLIL     // Catch: java.lang.Throwable -> L74
            r0.endTransaction()     // Catch: java.lang.Throwable -> L74
            if (r6 != 0) goto L71
            java.lang.StringBuilder r0 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L74
            r0.append(r4)     // Catch: java.lang.Throwable -> L74
            r0.append(r8)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = X.X1D.LIZIZ(r0)     // Catch: java.lang.Throwable -> L74
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r2, r0)     // Catch: java.lang.Throwable -> L74
        L71:
            r0 = r6 ^ 1
            return r0
        L74:
            r0 = move-exception
        L75:
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r0)     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            r0 = r6 ^ 1
            return r0
        L7c:
            r0 = r6 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47902Ir4.LIZJ(java.lang.String):boolean");
    }

    @Override // X.InterfaceC47522Ikw
    public final String getString(String str) {
        return LIZIZ(str);
    }

    public C47902Ir4(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            C78253UnR.LIZLLL("KVDBManager", "context or name is invalid");
            return;
        }
        this.LJLILLLLZI = str;
        C47904Ir6 c47904Ir6 = new C47904Ir6(context, str);
        this.LJLJI = c47904Ir6;
        try {
            SQLiteDatabase writableDatabase = c47904Ir6.getWritableDatabase();
            this.LJLIL = writableDatabase;
            if (writableDatabase != null) {
                writableDatabase.execSQL(C16880lQ.LLLZ("CREATE TABLE IF NOT EXISTS %s(key TEXT PRIMARY KEY,value TEXT,time INTEGER)", new Object[]{str}));
            }
            this.LJLJJI = true;
        } catch (Throwable th) {
            try {
                TTVideoEngineLog.d(th);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create db fail, table name ");
                LIZ.append(this.LJLILLLLZI);
                C78253UnR.LIZLLL("KVDBManager", X1D.LIZIZ(LIZ));
                if (this.LJLJI == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("create db fail, mHelper == null, table name ");
                    LIZ2.append(this.LJLILLLLZI);
                    C78253UnR.LIZLLL("KVDBManager", X1D.LIZIZ(LIZ2));
                }
                this.LJLJJI = false;
            } catch (Throwable th2) {
                if (this.LJLJI == null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("create db fail, mHelper == null, table name ");
                    LIZ3.append(this.LJLILLLLZI);
                    C78253UnR.LIZLLL("KVDBManager", X1D.LIZIZ(LIZ3));
                }
                this.LJLJJI = this.LJLJI != null;
                throw th2;
            }
        }
    }

    public final boolean LIZLLL(String str, String str2) {
        boolean z = false;
        if (this.LJLIL == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C78253UnR.LIZLLL("KVDBManager", "open db fail");
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("save key: ");
        LIZ.append(str);
        LIZ.append(" value: ");
        LIZ.append(str2);
        C78253UnR.LJI("KVDBManager", X1D.LIZIZ(LIZ));
        try {
            this.LJLIL.beginTransaction();
            try {
                try {
                    this.LJLIL.execSQL(C16880lQ.LLLZ("REPLACE INTO %s VALUES ('%s','%s',%d)", new Object[]{this.LJLILLLLZI, str, str2, Long.valueOf(System.currentTimeMillis())}));
                    this.LJLIL.setTransactionSuccessful();
                    this.LJLIL.endTransaction();
                    return true;
                } catch (Throwable unused) {
                    this.LJLIL.endTransaction();
                    return true;
                }
            } catch (SQLException e) {
                TTVideoEngineLog.d(e);
                try {
                    this.LJLIL.endTransaction();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    try {
                        TTVideoEngineLog.d(th);
                        return !z;
                    } catch (Throwable unused2) {
                        return !z;
                    }
                }
            } catch (IllegalStateException e2) {
                TTVideoEngineLog.d(e2);
                this.LJLIL.endTransaction();
                return true;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.InterfaceC47522Ikw
    public final boolean putString(String str, String str2) {
        return LIZLLL(str, str2);
    }
}
