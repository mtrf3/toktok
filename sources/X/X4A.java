package X;

import Y.ACallableS118S0100000_15;
import Y.ACallableS40S1100000_15;
import Y.ACallableS84S0101000_15;
import Y.ARunnableS18S0201000_15;
import Y.ARunnableS19S0101000_15;
import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class X4A extends X3Q implements X3Y {
    public static volatile SQLiteDatabase LJLJJLL;
    public static final int LJLJL;
    public static volatile HashMap<String, Integer> LJLJLJ;
    public static final int LJLJLLL;
    public C68876R1k LJLILLLLZI;
    public C68876R1k LJLJI;
    public volatile boolean LJLJJI;
    public InterfaceC84190X2k LJLJJL;

    @Override // X.InterfaceC84230X3y
    public final void LJIILIIL(int i) {
    }

    @Override // X.InterfaceC84230X3y
    public final void LJIJ(DownloadInfo downloadInfo) {
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJIL(int i) {
        return null;
    }

    @Override // X.InterfaceC84230X3y
    public final boolean LJJLIIIIJ() {
        return false;
    }

    @Override // X.InterfaceC84211X3f
    public final void LLZZJLIL() {
    }

    @Override // X.InterfaceC84211X3f
    public final void clearMemoryCacheData(double d) {
    }

    public static void A0() {
        if (LJLJJLL == null) {
            return;
        }
        try {
            LJLJJLL.execSQL("DROP TABLE IF EXISTS downloadChunk");
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error:");
            LIZ.append(th);
            C65210PiY.LIZJ("SqlDownloadCache", "deleteChunkTable", X1D.LIZIZ(LIZ));
        }
    }

    public static void C0() {
        if (LJLJLJ != null) {
            return;
        }
        JSONObject optJSONObject = X4H.LIZIZ().optJSONObject("lru_preload_hot_cache_keys");
        HashMap<String, Integer> hashMap = null;
        if (optJSONObject != null) {
            HashMap<String, Integer> hashMap2 = new HashMap<>();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null) {
                    hashMap2.put(next, Integer.valueOf(optJSONObject.optInt(next, 0)));
                }
            }
            if (!hashMap2.isEmpty()) {
                hashMap = hashMap2;
            }
        }
        LJLJLJ = hashMap;
    }

    public static void G0() {
        try {
            if (LJLJJLL != null && LJLJJLL.inTransaction()) {
                LJLJJLL.endTransaction();
            }
        } catch (Throwable unused) {
        }
    }

    public final void B0() {
        if (LJLJJLL == null) {
            synchronized (X4A.class) {
                if (LJLJJLL == null) {
                    try {
                        LJLJJLL = C66852QLo.LIZ().getWritableDatabase();
                        this.LJLILLLLZI = new C68876R1k(LJLJJLL, "downloader", X4Z.LIZ, X4Z.LIZIZ);
                        this.LJLJI = new C68876R1k(LJLJJLL, "segments", X4Z.LIZJ, X4Z.LIZLLL);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC84230X3y
    public final void clearData() {
        C84212X3g.LJJIIJ(new ARunnableS51S0100000_15(this, 131));
    }

    @Override // X.InterfaceC84230X3y
    public final List<DownloadInfo> getAllDownloadInfo() {
        return (List) F0(new ACallableS118S0100000_15(this, 20), new X4C());
    }

    static {
        int i = 300;
        int optInt = X4H.LIZIZ().optInt("lru_download_info_capacity_max", 300);
        if (optInt >= 100) {
            i = optInt;
        }
        LJLJL = i;
        LJLJLJ = null;
        LJLJLLL = X4H.LJFF.LJIIIIZZ("main_thread_db_op_max_time_ms", 0);
    }

    @Override // X.InterfaceC84230X3y
    public final boolean isDownloadCacheSyncSuccess() {
        return this.LJLJJI;
    }

    public static void z0(List list) {
        try {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                DownloadInfo downloadInfo = (DownloadInfo) it.next();
                if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                    X4Q.LIZJ(downloadInfo);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC84230X3y
    public final boolean LJIIL(int i) {
        C84212X3g.LJJIIJ(new ARunnableS19S0101000_15(this, i, 14));
        return true;
    }

    @Override // X.InterfaceC84230X3y
    public final boolean LJIILJJIL(int i) {
        C84212X3g.LJJIIJ(new ARunnableS19S0101000_15(this, i, 13));
        return true;
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJI(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-7));
        H0(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJIJIIJI(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 1);
        H0(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJLIIIJJIZ(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 5);
        contentValues.put("isFirstDownload", (Integer) 0);
        H0(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC84211X3f
    public final void LJLJI(int i) {
        B0();
        if (LJLJJLL == null) {
            return;
        }
        try {
            SQLiteStatement LIZ = this.LJLJI.LIZ();
            if (LIZ != null) {
                synchronized (LIZ) {
                    LIZ.bindLong(1, i);
                    LIZ.execute();
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC84230X3y
    public final void LLIIIJ(boolean z) {
        if (z) {
            SparseArray sparseArray = new SparseArray();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            synchronized (C84212X3g.class) {
            }
            j(sparseArray, hashMap, arrayList, null, null);
            return;
        }
        j(new SparseArray(), null, null, null, null);
    }

    @Override // X.InterfaceC84211X3f
    public final java.util.Map<Long, C84234X4c> LLJI(int i) {
        Cursor cursor;
        String str;
        B0();
        if (LJLJJLL != null) {
            try {
                cursor = LJLJJLL.rawQuery(C16880lQ.LLLZ("SELECT * FROM %s WHERE %s = ?", new Object[]{"segments", "_id"}), new String[]{Integer.toString(i)});
            } catch (Throwable unused) {
                cursor = null;
            }
            try {
                if (cursor.moveToNext()) {
                    int columnIndex = cursor.getColumnIndex("info");
                    if (columnIndex >= 0) {
                        str = cursor.getString(columnIndex);
                    } else {
                        str = null;
                    }
                    HashMap hashMap = new HashMap();
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        C84234X4c c84234X4c = new C84234X4c(jSONArray.getJSONObject(i2));
                        hashMap.put(Long.valueOf(c84234X4c.LIZ), c84234X4c);
                    }
                    X4Q.LJJIII(cursor);
                    return hashMap;
                }
                X4Q.LJJIII(cursor);
            } catch (Throwable unused2) {
                X4Q.LJJIII(cursor);
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC84211X3f
    public final List LLJJIII(int i) {
        java.util.Map<Long, C84234X4c> LLJI = LLJI(i);
        if (LLJI != null) {
            HashMap hashMap = (HashMap) LLJI;
            if (!hashMap.isEmpty()) {
                return new ArrayList(hashMap.values());
            }
        }
        return null;
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo getDownloadInfo(int i) {
        return (DownloadInfo) F0(new ACallableS84S0101000_15(this, i, 2), null);
    }

    @Override // X.InterfaceC84230X3y
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        return (List) F0(new ACallableS40S1100000_15(this, str, 2), new X4D());
    }

    @Override // X.InterfaceC84230X3y
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        return (List) F0(new ACallableS40S1100000_15(this, str, 5), new X4B());
    }

    @Override // X.InterfaceC84230X3y
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return (List) F0(new ACallableS40S1100000_15(this, str, 3), new X4E());
    }

    @Override // X.InterfaceC84230X3y
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return (List) F0(new ACallableS40S1100000_15(this, str, 4), new X4F());
    }

    @Override // X.InterfaceC84230X3y
    public final void q0(InterfaceC84190X2k interfaceC84190X2k) {
        this.LJLJJL = interfaceC84190X2k;
    }

    @Override // X.InterfaceC84230X3y
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        C84212X3g.LJJIIJ(new ARunnableS34S0200000_15(downloadInfo, this, 67));
        return true;
    }

    public static Object F0(Callable callable, X4G x4g) {
        int i = LJLJLLL;
        if (i > 0 && X4Q.LJIJJLI()) {
            try {
                return C84212X3g.LJI().submit(callable).get(i, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Get Error: ");
                LIZ.append(th);
                C65210PiY.LIZJ("SqlDownloadCache", "runImpl", X1D.LIZIZ(LIZ));
            }
        } else {
            try {
                return callable.call();
            } catch (Throwable th2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Call Error: ");
                LIZ2.append(th2);
                C65210PiY.LIZJ("SqlDownloadCache", "runImpl", X1D.LIZIZ(LIZ2));
            }
        }
        if (x4g != null) {
            return x4g.LIZ();
        }
        return null;
    }

    public static void I0(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                downloadInfo.bindValue(sQLiteStatement);
                sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, downloadInfo.getId());
                sQLiteStatement.execute();
            }
        } catch (Throwable unused) {
        }
    }

    public final void H0(int i, ContentValues contentValues) {
        C84212X3g.LJJIIJ(new ARunnableS18S0201000_15(i, contentValues, this, 8));
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJIJIL(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-2));
        contentValues.put("curBytes", Long.valueOf(j));
        H0(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJJJLI(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-3));
        contentValues.put("curBytes", Long.valueOf(j));
        contentValues.put("isFirstDownload", (Integer) 0);
        contentValues.put("isFirstSuccess", (Integer) 0);
        H0(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJJLZIJ(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-1));
        contentValues.put("curBytes", Long.valueOf(j));
        if (j > 0) {
            contentValues.put("isFirstDownload", (Integer) 0);
        }
        H0(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJLI(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 4);
        contentValues.put("curBytes", Long.valueOf(j));
        H0(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC84211X3f
    public final boolean t(int i, java.util.Map<Long, C84234X4c> map) {
        B0();
        if (LJLJJLL == null) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Long, C84234X4c> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    C84234X4c value = entry.getValue();
                    JSONObject jSONObject = value.LJII;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                        value.LJII = jSONObject;
                    }
                    jSONObject.put("st", value.LIZ);
                    jSONObject.put("cu", value.LIZ());
                    jSONObject.put("en", value.LIZLLL);
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Throwable unused) {
        }
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Json=");
            LIZ.append(jSONArray);
            C65210PiY.LIZLLL(i, "SqlDownloadCache", "updateSegments", X1D.LIZIZ(LIZ));
        }
        SQLiteStatement LIZIZ = this.LJLJI.LIZIZ();
        if (LIZIZ == null) {
            C65210PiY.LJ(i, "SqlDownloadCache", "updateSegments", "UpdateSegments statement is null");
            return false;
        }
        synchronized (LIZIZ) {
            LIZIZ.clearBindings();
            LIZIZ.bindLong(1, i);
            LIZIZ.bindString(2, jSONArray.toString());
            LIZIZ.execute();
        }
        return false;
    }

    public static void D0(List list, List list2, SparseArray sparseArray) {
        int size = sparseArray.size();
        if (size < 0 || LJLJJLL == null) {
            return;
        }
        synchronized (LJLJJLL) {
            try {
                LJLJJLL.beginTransaction();
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.isEmpty()) {
                    if (X4H.LJFF.LJI("clear_invalid_task_error", false)) {
                        String[] strArr = new String[arrayList.size()];
                        for (int i = 0; i < arrayList.size(); i++) {
                            strArr[i] = String.valueOf(arrayList.get(i));
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("CAST(_id AS TEXT) IN (");
                        LIZ.append(new String(new char[arrayList.size() - 1]).replace("\u0000", "?,"));
                        LIZ.append("?)");
                        LJLJJLL.delete("downloader", X1D.LIZIZ(LIZ), strArr);
                    } else {
                        LJLJJLL.delete("downloader", "_id IN (?)", new String[]{TextUtils.join(", ", list2)});
                    }
                }
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = sparseArray.keyAt(i2);
                    DownloadInfo downloadInfo = (DownloadInfo) sparseArray.get(keyAt);
                    LJLJJLL.delete("downloader", "_id = ?", new String[]{String.valueOf(keyAt)});
                    LJLJJLL.insert("downloader", null, X4P.LJJ(downloadInfo));
                }
                LJLJJLL.setTransactionSuccessful();
            } catch (Throwable unused) {
            }
            G0();
        }
    }

    public final void E0(SparseArray<DownloadInfo> sparseArray, HashMap<Integer, Integer> hashMap, List<DownloadInfo> list) {
        HashMap hashMap2;
        HashMap hashMap3 = null;
        if (sparseArray == null) {
            hashMap2 = null;
        } else {
            try {
                hashMap2 = new HashMap();
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    hashMap2.put(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (list != null) {
            hashMap3 = new HashMap();
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo.getId() != 0) {
                    hashMap3.put(Integer.valueOf(downloadInfo.getId()), downloadInfo);
                }
            }
        }
        InterfaceC84190X2k interfaceC84190X2k = this.LJLJJL;
        if (interfaceC84190X2k != null) {
            interfaceC84190X2k.LLFF(hashMap2, hashMap, hashMap3);
        }
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJIL(int i, String str, String str2, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 3);
        contentValues.put("totalBytes", Long.valueOf(j));
        contentValues.put("eTag", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put("name", str2);
        }
        H0(i, contentValues);
        return null;
    }

    @Override // X.X3Y
    public final void j(SparseArray sparseArray, HashMap hashMap, List list, List list2, C84225X3t c84225X3t) {
        try {
            X48 x48 = new X48(this, list, hashMap, list2, sparseArray, c84225X3t);
            ExecutorService LJI = C84212X3g.LJI();
            if (LJI != null) {
                LJI.execute(x48);
            }
        } catch (Throwable unused) {
        }
    }
}
