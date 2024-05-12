package com.bytedance.pitaya.feature;

import X.C37692Eqm;
import X.C93245aNl;
import X.C93246aNm;
import X.C93274aOE;
import X.C93317aOv;
import X.EnumC93253aNt;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.pitaya.log.PitayaLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class DatabaseDefaultImpl extends Database {
    public static final C93274aOE Companion = new C93274aOE();
    public SQLiteDatabase mDatabase;
    public boolean mIsInTransaction;

    private final boolean databaseExist() {
        if (this.mDatabase == null) {
            PitayaLogger.LIZIZ("Database", "Database is null");
            return false;
        }
        return true;
    }

    @Override // com.bytedance.pitaya.feature.Database
    public void close() {
        try {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            PitayaLogger.LIZ("DefaultDB", "close db success");
        } catch (Error e) {
            PitayaLogger.LJFF("DefaultDB", "", "", e);
            PitayaLogger.LIZIZ("DefaultDB", "close db failed");
        }
    }

    @Override // com.bytedance.pitaya.feature.Database
    public boolean commit() {
        try {
            if (!databaseExist()) {
                return false;
            }
            try {
                SQLiteDatabase sQLiteDatabase = this.mDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.setTransactionSuccessful();
                }
                this.mIsInTransaction = false;
                SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.endTransaction();
                }
                return true;
            } catch (Throwable th) {
                try {
                    PitayaLogger.LJFF("DefaultDB", "", "", th);
                    SQLiteDatabase sQLiteDatabase3 = this.mDatabase;
                    if (sQLiteDatabase3 == null) {
                        return false;
                    }
                    sQLiteDatabase3.endTransaction();
                    return false;
                } catch (Throwable th2) {
                    try {
                        SQLiteDatabase sQLiteDatabase4 = this.mDatabase;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.endTransaction();
                        }
                    } catch (Throwable th3) {
                        PitayaLogger.LJFF("DefaultDB", "", "", th3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            PitayaLogger.LJFF("DefaultDB", "", "", th4);
            return false;
        }
    }

    @Override // com.bytedance.pitaya.feature.Database
    public boolean open() {
        SQLiteDatabase sQLiteDatabase;
        Context LIZ = C93317aOv.LIZ();
        if (LIZ != null) {
            SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
            boolean z = true;
            if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                return true;
            }
            try {
                sQLiteDatabase = new C93245aNl(LIZ, getDbName(), new C93246aNm()).getWritableDatabase();
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.enableWriteAheadLogging();
                }
            } catch (Throwable th) {
                PitayaLogger.LJFF("DefaultDB", "", "", th);
                sQLiteDatabase = null;
            }
            this.mDatabase = sQLiteDatabase;
            if (sQLiteDatabase == null) {
                z = false;
            }
            PitayaLogger.LIZJ("DefaultDB", "open db " + getDbName() + ' ' + z);
            return z;
        }
        throw new IllegalStateException("You must call ContextContainer.setContext() first!");
    }

    @Override // com.bytedance.pitaya.feature.Database
    public boolean beginTransaction() {
        boolean z = false;
        if (!databaseExist()) {
            return false;
        }
        try {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.beginTransaction();
            }
            this.mIsInTransaction = true;
            z = true;
            return true;
        } catch (Throwable th) {
            PitayaLogger.LJFF("DefaultDB", "", "", th);
            return z;
        }
    }

    @Override // com.bytedance.pitaya.feature.Database
    public boolean rollback() {
        boolean z = false;
        if (!databaseExist()) {
            return false;
        }
        try {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            this.mIsInTransaction = false;
            z = true;
            return true;
        } catch (Throwable th) {
            PitayaLogger.LJFF("DefaultDB", "", "", th);
            return z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseDefaultImpl(String dbName) {
        super(dbName);
        o.LJIIJ(dbName, "dbName");
    }

    @Override // com.bytedance.pitaya.feature.Database
    public SQLResult query(String sql, List<String> value) {
        Cursor cursor;
        o.LJIIJ(sql, "sql");
        o.LJIIJ(value, "value");
        if (this.mDatabase == null) {
            return new SQLResult(false, EnumC93253aNt.DB_NOT_OPEN.ordinal(), "Database open failed", null);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null) {
                Object[] array = value.toArray(new String[0]);
                if (array != null) {
                    cursor = sQLiteDatabase.rawQuery(sql, (String[]) array);
                    if (cursor != null) {
                        try {
                            cursor.moveToFirst();
                            while (!cursor.isAfterLast()) {
                                List<SQLColumn> parse = parse(cursor);
                                if (parse != null) {
                                    arrayList.add(parse);
                                }
                                cursor.moveToNext();
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                PitayaLogger.LJFF("DefaultDB", "", "", th);
                                sb.append(th.toString());
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        PitayaLogger.LJFF("DefaultDB", "", "", th);
                                        sb.append(th.toString());
                                        int ordinal = EnumC93253aNt.EXECUTE_ERROR.ordinal();
                                        String sb2 = sb.toString();
                                        o.LJFF(sb2, "msg.toString()");
                                        return new SQLResult(false, ordinal, sb2, null);
                                    }
                                }
                                int ordinal2 = EnumC93253aNt.EXECUTE_ERROR.ordinal();
                                String sb22 = sb.toString();
                                o.LJFF(sb22, "msg.toString()");
                                return new SQLResult(false, ordinal2, sb22, null);
                            } catch (Throwable th3) {
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Throwable th4) {
                                        PitayaLogger.LJFF("DefaultDB", "", "", th4);
                                        sb.append(th4.toString());
                                    }
                                }
                                throw th3;
                            }
                        }
                        try {
                            cursor.close();
                        } catch (Throwable th5) {
                            th = th5;
                            PitayaLogger.LJFF("DefaultDB", "", "", th);
                            sb.append(th.toString());
                            int ordinal22 = EnumC93253aNt.EXECUTE_ERROR.ordinal();
                            String sb222 = sb.toString();
                            o.LJFF(sb222, "msg.toString()");
                            return new SQLResult(false, ordinal22, sb222, null);
                        }
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            return new SQLResult(true, EnumC93253aNt.NO_ERROR.ordinal(), "", arrayList);
        } catch (Throwable th6) {
            th = th6;
            cursor = null;
        }
    }

    @Override // com.bytedance.pitaya.feature.Database
    public SQLResult update(String sql, Object[] objArr) {
        o.LJIIJ(sql, "sql");
        if (this.mDatabase == null) {
            return new SQLResult(false, EnumC93253aNt.DB_NOT_OPEN.ordinal(), "Database open failed", null);
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (objArr != null) {
                SQLiteDatabase sQLiteDatabase = this.mDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.execSQL(sql, objArr);
                }
            } else {
                SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.execSQL(sql);
                }
            }
            return new SQLResult(true, EnumC93253aNt.NO_ERROR.ordinal(), "", null);
        } catch (Throwable th) {
            sb.append(th.toString());
            PitayaLogger.LJFF("DefaultDB", "", "", th);
            int ordinal = EnumC93253aNt.EXECUTE_ERROR.ordinal();
            String sb2 = sb.toString();
            o.LJFF(sb2, "msg.toString()");
            return new SQLResult(false, ordinal, sb2, null);
        }
    }
}
