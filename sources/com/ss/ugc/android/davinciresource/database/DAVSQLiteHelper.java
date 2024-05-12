package com.ss.ugc.android.davinciresource.database;

import X.JBR;
import X.X1D;
import X.YE1;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.android.davinciresource.jni.PairStringString;
import com.ss.ugc.android.davinciresource.jni.VecPairStringString;
import com.ss.ugc.android.davinciresource.jni.VecString;
import com.ss.ugc.android.davinciresource.jni.VecVecString;
import defpackage.a1;
import defpackage.i0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ujb.o;

/* loaded from: classes16.dex */
public final class DAVSQLiteHelper extends SQLiteOpenHelper {
    public static final Companion Companion = new Companion();
    public final List<String> tableKey;
    public final String tableName;

    /* JADX WARN: Multi-variable type inference failed */
    public final VecVecString getAllData() {
        VecVecString vecVecString = new VecVecString();
        String[] strArr = new String[this.tableKey.size()];
        int size = this.tableKey.size();
        for (int i = 0; i < size; i++) {
            strArr[i] = ListProtector.get(this.tableKey, i);
        }
        Cursor query = getReadableDatabase().query(this.tableName, strArr, null, null, null, null, null);
        while (query.moveToNext()) {
            VecString vecString = new VecString();
            Iterator<String> it = this.tableKey.iterator();
            while (it.hasNext()) {
                int columnIndex = query.getColumnIndex(it.next());
                String str = "";
                if (columnIndex > 0) {
                    String string = query.getString(columnIndex);
                    if (string != null) {
                        str = string;
                    }
                    vecString.add(str);
                } else {
                    vecString.add("");
                }
            }
            vecVecString.add(vecString);
        }
        query.close();
        return vecVecString;
    }

    /* loaded from: classes16.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VecString getDatas(String str) {
        String[] strArr = new String[this.tableKey.size()];
        int size = this.tableKey.size();
        for (int i = 0; i < size; i++) {
            strArr[i] = ListProtector.get(this.tableKey, i);
        }
        Cursor query = getReadableDatabase().query(this.tableName, strArr, "id=?", new String[]{str}, null, null, null);
        VecString vecString = new VecString();
        if (query.moveToNext()) {
            Iterator<String> it = this.tableKey.iterator();
            while (it.hasNext()) {
                int columnIndex = query.getColumnIndex(it.next());
                String str2 = "";
                if (columnIndex > 0) {
                    String string = query.getString(columnIndex);
                    if (string != null) {
                        str2 = string;
                    }
                    vecString.add(str2);
                } else {
                    vecString.add("");
                }
            }
        }
        query.close();
        return vecString;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        String LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CREATE TABLE IF NOT EXISTS `");
        YE1.LIZLLL(LIZ, this.tableName, "` (\n", "\t`", "id");
        LIZ.append("`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n");
        String LIZIZ = X1D.LIZIZ(LIZ);
        int size = this.tableKey.size();
        for (int i = 0; i < size; i++) {
            String str = (String) ListProtector.get(this.tableKey, i);
            if (!o.LJJJJJL(str)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ);
                if (i == this.tableKey.size() - 1) {
                    LJ = a1.LJ("\t`", str, "`\tTEXT\n");
                } else {
                    LJ = a1.LJ("\t`", str, "`\tTEXT,\n");
                }
                LIZ2.append(LJ);
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
        }
        String LJFF = i0.LJFF(LIZIZ, ");");
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(LJFF);
        }
    }

    public final boolean removeData(String str) {
        getWritableDatabase().delete(this.tableName, "id=?", new String[]{str});
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VecVecString getData(VecPairStringString vecPairStringString, boolean z) {
        String LIZIZ;
        VecVecString vecVecString = new VecVecString();
        if (vecPairStringString == null) {
            return vecVecString;
        }
        String[] strArr = new String[this.tableKey.size()];
        int size = this.tableKey.size();
        for (int i = 0; i < size; i++) {
            strArr[i] = ListProtector.get(this.tableKey, i);
        }
        String[] strArr2 = new String[vecPairStringString.size()];
        int size2 = vecPairStringString.size();
        String str = "";
        for (int i2 = 0; i2 < size2; i2++) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            if (i2 == vecPairStringString.size() - 1) {
                if (z) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    PairStringString pairStringString = vecPairStringString.get(i2);
                    kotlin.jvm.internal.o.LJFF(pairStringString, "key_values[i]");
                    LIZ2.append(pairStringString.getFirst());
                    LIZ2.append(" LIKE ?");
                    LIZIZ = X1D.LIZIZ(LIZ2);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    PairStringString pairStringString2 = vecPairStringString.get(i2);
                    kotlin.jvm.internal.o.LJFF(pairStringString2, "key_values[i]");
                    LIZ3.append(pairStringString2.getFirst());
                    LIZ3.append("=?");
                    LIZIZ = X1D.LIZIZ(LIZ3);
                }
            } else if (z) {
                StringBuilder LIZ4 = X1D.LIZ();
                PairStringString pairStringString3 = vecPairStringString.get(i2);
                kotlin.jvm.internal.o.LJFF(pairStringString3, "key_values[i]");
                LIZ4.append(pairStringString3.getFirst());
                LIZ4.append(" LIKE ? AND ");
                LIZIZ = X1D.LIZIZ(LIZ4);
            } else {
                StringBuilder LIZ5 = X1D.LIZ();
                PairStringString pairStringString4 = vecPairStringString.get(i2);
                kotlin.jvm.internal.o.LJFF(pairStringString4, "key_values[i]");
                LIZ5.append(pairStringString4.getFirst());
                LIZ5.append("=? AND ");
                LIZIZ = X1D.LIZIZ(LIZ5);
            }
            LIZ.append(LIZIZ);
            str = X1D.LIZIZ(LIZ);
            PairStringString pairStringString5 = vecPairStringString.get(i2);
            kotlin.jvm.internal.o.LJFF(pairStringString5, "key_values[i]");
            strArr2[i2] = pairStringString5.getSecond();
        }
        Cursor query = getReadableDatabase().query(this.tableName, strArr, str, strArr2, null, null, null);
        while (query.moveToNext()) {
            VecString vecString = new VecString();
            Iterator<String> it = this.tableKey.iterator();
            while (it.hasNext()) {
                int columnIndex = query.getColumnIndex(it.next());
                if (columnIndex > 0) {
                    String string = query.getString(columnIndex);
                    if (string == null) {
                        string = "";
                    }
                    vecString.add(string);
                } else {
                    vecString.add("");
                }
            }
            vecVecString.add(vecString);
        }
        query.close();
        return vecVecString;
    }

    public final boolean insertData(String str, VecPairStringString vecPairStringString) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        if (vecPairStringString != null) {
            int size = vecPairStringString.size();
            for (int i = 0; i < size; i++) {
                PairStringString pairStringString = vecPairStringString.get(i);
                kotlin.jvm.internal.o.LJFF(pairStringString, "keyValues[i]");
                String first = pairStringString.getFirst();
                PairStringString pairStringString2 = vecPairStringString.get(i);
                kotlin.jvm.internal.o.LJFF(pairStringString2, "keyValues[i]");
                contentValues.put(first, pairStringString2.getSecond());
            }
        }
        getWritableDatabase().insert(this.tableName, null, contentValues);
        return true;
    }

    public final boolean updateData(String str, VecPairStringString vecPairStringString) {
        if (vecPairStringString == null) {
            return true;
        }
        if (getDatas(str).isEmpty()) {
            return insertData(str, vecPairStringString);
        }
        ContentValues contentValues = new ContentValues();
        int size = vecPairStringString.size();
        for (int i = 0; i < size; i++) {
            PairStringString pairStringString = vecPairStringString.get(i);
            kotlin.jvm.internal.o.LJFF(pairStringString, "keyValues[i]");
            String first = pairStringString.getFirst();
            PairStringString pairStringString2 = vecPairStringString.get(i);
            kotlin.jvm.internal.o.LJFF(pairStringString2, "keyValues[i]");
            contentValues.put(first, pairStringString2.getSecond());
        }
        getWritableDatabase().update(this.tableName, contentValues, "id=?", new String[]{str});
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VecVecString getData(PairStringString pairStringString, boolean z) {
        String str;
        String str2;
        String[] strArr;
        String str3;
        String[] strArr2 = new String[this.tableKey.size()];
        int size = this.tableKey.size();
        for (int i = 0; i < size; i++) {
            strArr2[i] = ListProtector.get(this.tableKey, i);
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        String str4 = this.tableName;
        String str5 = null;
        StringBuilder LIZ = X1D.LIZ();
        if (z) {
            if (pairStringString != null) {
                str3 = pairStringString.getFirst();
            } else {
                str3 = null;
            }
            LIZ.append(str3);
            str2 = " LIKE ?";
        } else {
            if (pairStringString != null) {
                str = pairStringString.getFirst();
            } else {
                str = null;
            }
            LIZ.append(str);
            str2 = "=?";
        }
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (z) {
            strArr = new String[1];
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("%");
            if (pairStringString != null) {
                str5 = pairStringString.getSecond();
            }
            strArr[0] = JBR.LJFF(LIZ2, str5, "%", LIZ2);
        } else {
            strArr = new String[1];
            if (pairStringString != null) {
                str5 = pairStringString.getSecond();
            }
            strArr[0] = str5;
        }
        Cursor query = readableDatabase.query(str4, strArr2, LIZIZ, strArr, null, null, null);
        VecVecString vecVecString = new VecVecString();
        while (query.moveToNext()) {
            VecString vecString = new VecString();
            Iterator<String> it = this.tableKey.iterator();
            while (it.hasNext()) {
                int columnIndex = query.getColumnIndex(it.next());
                String str6 = "";
                if (columnIndex > 0) {
                    String string = query.getString(columnIndex);
                    if (string != null) {
                        str6 = string;
                    }
                    vecString.add(str6);
                } else {
                    vecString.add("");
                }
            }
            vecVecString.add(vecString);
        }
        query.close();
        return vecVecString;
    }

    public final boolean insertData(String str, VecString vecString) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        if (vecString != null) {
            int size = vecString.size();
            for (int i = 0; i < size; i++) {
                contentValues.put((String) ListProtector.get(this.tableKey, i), vecString.get(i));
            }
        }
        getWritableDatabase().insert(this.tableName, null, contentValues);
        return true;
    }

    public final boolean updateData(String str, VecString vecString) {
        if (getDatas(str).isEmpty()) {
            return insertData(str, vecString);
        }
        ContentValues contentValues = new ContentValues();
        if (vecString != null) {
            int size = vecString.size();
            for (int i = 0; i < size; i++) {
                contentValues.put((String) ListProtector.get(this.tableKey, i), vecString.get(i));
            }
        }
        getWritableDatabase().update(this.tableName, contentValues, "id=?", new String[]{str});
        return true;
    }

    public final VecString getData(PairStringString pairStringString, String str) {
        String str2;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        String str3 = this.tableName;
        String[] strArr = {str};
        StringBuilder LIZ = X1D.LIZ();
        String str4 = null;
        if (pairStringString != null) {
            str2 = pairStringString.getFirst();
        } else {
            str2 = null;
        }
        String LJFF = JBR.LJFF(LIZ, str2, "=?", LIZ);
        String[] strArr2 = new String[1];
        if (pairStringString != null) {
            str4 = pairStringString.getSecond();
        }
        strArr2[0] = str4;
        Cursor query = readableDatabase.query(str3, strArr, LJFF, strArr2, null, null, null);
        VecString vecString = new VecString();
        while (query.moveToNext()) {
            if (query.getColumnIndex(str) >= 0) {
                String string = query.getString(query.getColumnIndex(str));
                if (string == null) {
                    string = "";
                }
                vecString.add(string);
            }
        }
        query.close();
        return vecString;
    }

    public final String getData(String str, String str2) {
        Cursor query = getReadableDatabase().query(this.tableName, new String[]{str2}, "id=?", new String[]{str}, null, null, null);
        String str3 = "";
        while (query.moveToNext()) {
            int columnIndex = query.getColumnIndex(str2);
            if (columnIndex >= 0 && (str3 = query.getString(columnIndex)) == null) {
                str3 = "";
            }
            if (!o.LJJJJJL(str3)) {
                query.close();
                return str3;
            }
        }
        query.close();
        return str3;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DROP TABLE IF EXISTS ");
            LIZ.append(this.tableName);
            sQLiteDatabase.execSQL(X1D.LIZIZ(LIZ));
        }
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAVSQLiteHelper(Context context, String daName, String tableName, List<String> tableKey, int i) {
        super(context, daName, (SQLiteDatabase.CursorFactory) null, i);
        kotlin.jvm.internal.o.LJIIJ(context, "context");
        kotlin.jvm.internal.o.LJIIJ(daName, "daName");
        kotlin.jvm.internal.o.LJIIJ(tableName, "tableName");
        kotlin.jvm.internal.o.LJIIJ(tableKey, "tableKey");
        this.tableName = tableName;
        this.tableKey = tableKey;
    }

    public final VecVecString getDataByRange(String str, String str2, String str3, VecPairStringString vecPairStringString, boolean z, String str4) {
        return new VecVecString();
    }
}
