package com.bytedance.apm.battery.dao;

import X.C17N;
import X.C56672Kh;
import X.F9J;
import X.FAK;
import X.X1D;
import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.core.SpPair;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class MonitorContentProvider extends ContentProvider {
    public final Map<String, SQLiteOpenHelper> LJLIL = new HashMap();

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C56672Kh.LIZ().LIZLLL("MonitorContentProvider");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getContext().getPackageName());
        LIZ.append(".apm");
        X1D.LIZIZ(LIZ);
        FAK LIZ2 = C56672Kh.LIZ();
        LIZ2.getClass();
        LIZ2.LJFF(SystemClock.uptimeMillis(), "MonitorContentProvider");
        return false;
    }

    public final synchronized Pair<SQLiteDatabase, String> LIZ(Uri uri) {
        try {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments != null && pathSegments.size() >= 2) {
                final String str = (String) ListProtector.get(pathSegments, 0);
                String str2 = (String) ListProtector.get(pathSegments, 1);
                if (str == null) {
                    return null;
                }
                SQLiteOpenHelper sQLiteOpenHelper = (SQLiteOpenHelper) ((HashMap) this.LJLIL).get(str);
                if (sQLiteOpenHelper == null) {
                    if (!str.contains("apm_monitor_t1.db")) {
                        return null;
                    }
                    final Context context = getContext();
                    sQLiteOpenHelper = new SQLiteOpenHelper(context, str) { // from class: X.0mJ
                        @Override // android.database.sqlite.SQLiteOpenHelper
                        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                            try {
                                sQLiteDatabase.execSQL("CREATE TABLE t_battery ( _id INTEGER PRIMARY KEY AUTOINCREMENT, version_id Integer, front Integer, timestamp Integer, type TEXT, status Integer, scene TEXT, accumulation Integer, source TEXT, delete_flag Integer DEFAULT 0, process TEXT, main_process Integer, sid TEXT, extra1 TEXT, extra2 TEXT, extra3 TEXT, extra4 TEXT  )");
                            } catch (Exception unused) {
                            }
                        }

                        @Override // android.database.sqlite.SQLiteOpenHelper
                        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                            if (C09970aH.LJII()) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Updating table from ");
                                LIZ.append(i);
                                LIZ.append(" to ");
                                LIZ.append(i2);
                                C64028PAy.LIZ("DBHelper", X1D.LIZIZ(LIZ));
                            }
                            if (i < 2) {
                                try {
                                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS local_monitor_log");
                                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS t_apiall");
                                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS local_monitor_version");
                                } catch (Exception unused) {
                                }
                            }
                        }
                    };
                    ((HashMap) this.LJLIL).put(str, sQLiteOpenHelper);
                }
                return new Pair<>(sQLiteOpenHelper.getWritableDatabase(), str2);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> LIZ = LIZ(uri);
        if (LIZ == null || (sQLiteDatabase = (SQLiteDatabase) LIZ.first) == null) {
            return null;
        }
        try {
            long insert = sQLiteDatabase.insert((String) LIZ.second, null, contentValues);
            if (insert >= 0) {
                return ContentUris.withAppendedId(uri, insert);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        Object obj;
        Pair pair;
        SpPair spPair;
        String str3;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        if ("getPid".equals(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("Pid", Process.myPid());
            return bundle2;
        }
        UriProtector.parse(str);
        Uri parse = UriProtector.parse(str);
        synchronized (this) {
            List<String> pathSegments = parse.getPathSegments();
            obj = null;
            if (pathSegments != null && pathSegments.size() >= 2 && "sp".equals(ListProtector.get(pathSegments, 0))) {
                SharedPreferences LIZIZ = F9J.LIZIZ(getContext(), 0, (String) ListProtector.get(pathSegments, 1));
                if (pathSegments.size() > 2) {
                    str3 = (String) ListProtector.get(pathSegments, 2);
                } else {
                    str3 = null;
                }
                pair = new Pair(LIZIZ, str3);
            } else {
                pair = null;
            }
        }
        if (pair == null) {
            return null;
        }
        if ("query".equals(str2)) {
            if (bundle != null && (spPair = (SpPair) bundle.getParcelable("sp")) != null) {
                obj = spPair.mValue;
            }
            SharedPreferences sharedPreferences = (SharedPreferences) pair.first;
            String str4 = (String) pair.second;
            Bundle bundle3 = new Bundle();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (str4 == null) {
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
                }
                bundle3.putParcelableArrayList("sp", arrayList);
            } else {
                Object obj2 = sharedPreferences.getAll().get(str4);
                if (obj2 != null) {
                    obj = obj2;
                }
                if (obj instanceof Set) {
                    obj = C17N.LJJJZ((Set) obj);
                }
                arrayList.add(new SpPair(str4, obj));
                bundle3.putParcelableArrayList("sp", arrayList);
            }
            return bundle3;
        }
        if ("contains".equals(str2)) {
            SharedPreferences sharedPreferences2 = (SharedPreferences) pair.first;
            String str5 = (String) pair.second;
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("contains", sharedPreferences2.contains(str5));
            return bundle4;
        }
        if ("edit".equals(str2) && bundle != null) {
            SharedPreferences.Editor edit = ((SharedPreferences) pair.first).edit();
            if (bundle.getBoolean("clear")) {
                edit.clear();
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("edit");
            if (parcelableArrayList != null) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    SpPair spPair2 = (SpPair) it.next();
                    Object obj3 = spPair2.mValue;
                    if (obj3 == null) {
                        edit.remove(spPair2.mKey);
                    } else {
                        String str6 = spPair2.mKey;
                        if (obj3 instanceof String) {
                            edit.putString(str6, (String) obj3);
                        } else if (obj3 instanceof Integer) {
                            edit.putInt(str6, ((Integer) obj3).intValue());
                        } else if (obj3 instanceof Long) {
                            edit.putLong(str6, ((Long) obj3).longValue());
                        } else if (obj3 instanceof Float) {
                            edit.putFloat(str6, ((Float) obj3).floatValue());
                        } else if (obj3 instanceof Boolean) {
                            edit.putBoolean(str6, ((Boolean) obj3).booleanValue());
                        } else if (obj3 instanceof String[]) {
                            edit.putStringSet(str6, new HashSet(Arrays.asList((Object[]) obj3)));
                        }
                    }
                }
                edit.apply();
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> LIZ = LIZ(uri);
        if (LIZ == null || (sQLiteDatabase = (SQLiteDatabase) LIZ.first) == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.delete((String) LIZ.second, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> LIZ = LIZ(uri);
        if (LIZ == null || (sQLiteDatabase = (SQLiteDatabase) LIZ.first) == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.update((String) LIZ.second, contentValues, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> LIZ = LIZ(uri);
        if (LIZ == null || (sQLiteDatabase = (SQLiteDatabase) LIZ.first) == null) {
            return null;
        }
        if (TextUtils.equals(str2, "rawQuery")) {
            return sQLiteDatabase.rawQuery(str, strArr2);
        }
        if (TextUtils.equals(str2, "execSQL")) {
            for (String str3 : str.split(";")) {
                if (!TextUtils.isEmpty(str3)) {
                    sQLiteDatabase.execSQL(str3);
                }
            }
            return null;
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables((String) LIZ.second);
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2);
    }
}
