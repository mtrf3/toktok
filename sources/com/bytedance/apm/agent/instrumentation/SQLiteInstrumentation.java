package com.bytedance.apm.agent.instrumentation;

import X.X1D;
import X.YE1;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import com.bytedance.apm.agent.tracing.TraceMachine;
import java.util.Arrays;

/* loaded from: classes.dex */
public class SQLiteInstrumentation {
    public static Cursor rawQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        TraceMachine.enterMethod("sqlite", "rawQuery", "db_trace");
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        TraceMachine.exitMethod(str);
        return rawQuery;
    }

    public static Cursor rawQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, CancellationSignal cancellationSignal) {
        TraceMachine.enterMethod("sqlite", "rawQuery", "db_trace");
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        TraceMachine.exitMethod(str);
        return rawQuery;
    }

    public static Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, SQLiteDatabase.CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        TraceMachine.enterMethod("sqlite", "rawQueryWithFactory", "db_trace");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(Arrays.toString(strArr));
        TraceMachine.exitMethod(X1D.LIZIZ(LIZ));
        return rawQueryWithFactory;
    }

    public static Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, SQLiteDatabase.CursorFactory cursorFactory, String str, String[] strArr, String str2, CancellationSignal cancellationSignal) {
        TraceMachine.enterMethod("sqlite", "rawQueryWithFactory", "db_trace");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(Arrays.toString(strArr));
        TraceMachine.exitMethod(X1D.LIZIZ(LIZ));
        return rawQueryWithFactory;
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        TraceMachine.enterMethod("sqlite", "query", "db_trace");
        Cursor query = sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5);
        TraceMachine.exitMethod(combineQuery(false, str, strArr, str2, strArr2, str3, str4, str5, null));
        return query;
    }

    public static String combineQuery(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("distinct: ");
        LIZ.append(z);
        LIZ.append(" table: ");
        LIZ.append(str);
        LIZ.append(" columns: ");
        YE1.LIZLLL(LIZ, Arrays.toString(strArr), " selection: ", str2, " selectionArgs: ");
        LIZ.append(Arrays.toString(strArr2));
        return X1D.LIZIZ(LIZ);
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        TraceMachine.enterMethod("sqlite", "query", "db_trace");
        Cursor query = sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        TraceMachine.exitMethod(combineQuery(false, str, strArr, str2, strArr2, str3, str4, str5, str6));
        return query;
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        TraceMachine.enterMethod("sqlite", "query", "db_trace");
        Cursor query = sQLiteDatabase.query(z, str, strArr, str2, strArr2, str3, str4, str5, str6);
        TraceMachine.exitMethod(combineQuery(z, str, strArr, str2, strArr2, str3, str4, str5, str6));
        return query;
    }

    public static Cursor queryWithFactory(SQLiteDatabase sQLiteDatabase, SQLiteDatabase.CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        TraceMachine.enterMethod("sqlite", "queryWithFactory", "db_trace");
        Cursor queryWithFactory = sQLiteDatabase.queryWithFactory(cursorFactory, z, str, strArr, str2, strArr2, str3, str4, str5, str6, cancellationSignal);
        TraceMachine.exitMethod(combineQuery(false, str, strArr, str2, strArr2, str3, str4, str5, str6));
        return queryWithFactory;
    }
}
