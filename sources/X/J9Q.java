package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class J9Q {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, List list) {
        String[] allDB = context.databaseList();
        o.LJFF(allDB, "allDB");
        ArrayList arrayList = new ArrayList();
        for (String name : allDB) {
            o.LJFF(name, "name");
            if (ujb.o.LJJJJ(name, "feature_engineering.db", false)) {
                arrayList.add(name);
            }
        }
        ArrayList arrayList2 = (ArrayList) list;
        if (arrayList2.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                context.deleteDatabase((String) it.next());
            }
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            SQLiteDatabase db = context.openOrCreateDatabase(str, 0, null);
            o.LJFF(db, "db");
            ArrayList arrayList3 = new ArrayList();
            try {
                Cursor rawQuery = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name NOT LIKE 'sqlite%' AND name NOT LIKE 'android%'", null);
                if (rawQuery != null) {
                    rawQuery.moveToFirst();
                    while (!rawQuery.isAfterLast()) {
                        for (String str2 : rawQuery.getColumnNames()) {
                            int columnIndex = rawQuery.getColumnIndex(str2);
                            if (columnIndex != -1 && rawQuery.getType(columnIndex) == 3) {
                                String string = rawQuery.getString(columnIndex);
                                o.LJFF(string, "cursor.getString(idx)");
                                arrayList3.add(string);
                            }
                        }
                        rawQuery.moveToNext();
                    }
                }
                rawQuery.close();
            } catch (Throwable unused) {
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                String str3 = (String) it3.next();
                if (!arrayList2.isEmpty()) {
                    Iterator it4 = arrayList2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (s.LJJJLZIJ(str3, (String) it4.next(), false)) {
                                linkedHashSet2.add(str3);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            if (!linkedHashSet2.isEmpty()) {
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    String str4 = (String) it5.next();
                    if (!linkedHashSet2.contains(str4) && (s.LJJJLZIJ(str4, "FEInternalAppLogConfigTable", false) || s.LJJJLZIJ(str4, "FEInternalDatabaseCacheConfigTable", false) || s.LJJJLZIJ(str4, "FEInternalKVCacheConfigTable", false))) {
                        linkedHashSet2.add(str4);
                    }
                }
            }
            if (linkedHashSet2.isEmpty()) {
                context.deleteDatabase(str);
            } else {
                Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    Object next = it6.next();
                    if (!linkedHashSet2.contains(next)) {
                        linkedHashSet.add(next);
                    }
                }
                Iterator it7 = linkedHashSet.iterator();
                while (it7.hasNext()) {
                    String str5 = (String) it7.next();
                    try {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("DROP TABLE IF EXISTS ");
                        LIZ2.append(str5);
                        db.execSQL(X1D.LIZIZ(LIZ2));
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public static void LIZIZ(Context context, List list) {
        StringBuilder LIZ2 = X1D.LIZ();
        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
        o.LJFF(LLIIJLIL, "context.filesDir");
        LIZ2.append(LLIIJLIL.getAbsolutePath());
        LIZ2.append("/Pitaya");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (((ArrayList) list).isEmpty()) {
            File file = new File(LIZIZ);
            if (file.exists()) {
                OR7.LLLIIL(file);
                return;
            }
            return;
        }
        LIZLLL(LIZIZ, list);
    }

    public static boolean LIZLLL(String str, List list) {
        String LLLFFI;
        File file = new File(str);
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            C16880lQ.LLLZZIL(file);
            return true;
        }
        String[] list2 = file.list();
        if (list2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str2 : list2) {
            ArrayList arrayList2 = (ArrayList) list;
            boolean contains = arrayList2.contains(str2);
            if (!contains && str2.equals("_INFO_")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LLLFFI = C38485F8n.LLLFFI(new File(JBR.LJFF(LIZ2, File.separator, str2, LIZ2)), PVC.LIZ);
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (s.LJJJLZIJ(LLLFFI, (String) it.next(), false)) {
                            contains = true;
                            break;
                        }
                    }
                }
                contains = false;
            }
            z |= contains;
            if (!contains) {
                arrayList.add(str2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            File file2 = new File(AnonymousClass073.LIZIZ(C278817o.LIZJ(str), File.separator, (String) it2.next()));
            if (file2.exists()) {
                if (file2.isFile()) {
                    C16880lQ.LLLZZIL(file2);
                } else if (file2.isDirectory()) {
                    String absolutePath = file2.getAbsolutePath();
                    o.LJFF(absolutePath, "childFile.absolutePath");
                    boolean LIZLLL = LIZLLL(absolutePath, list);
                    if (LIZLLL) {
                        OR7.LLLIIL(file2);
                    }
                    z |= !LIZLLL;
                }
            }
        }
        return !z;
    }

    public static void LIZJ(Context context, List reserveBusiness, PTYNormalCallback callback) {
        o.LJIIJ(context, "context");
        o.LJIIJ(reserveBusiness, "reserveBusiness");
        o.LJIIJ(callback, "callback");
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            callback.onResult(false, new PTYError("Init", 0, 0, "You must call this method in work thread", null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : reserveBusiness) {
            if (true ^ ujb.o.LJJJJJL((String) obj)) {
                arrayList.add(obj);
            }
        }
        try {
            LIZIZ(context, arrayList);
            LIZ(context, arrayList);
            callback.onResult(true, null);
        } catch (Throwable th) {
            callback.onResult(false, new PTYError("Init", 0, 0, th.toString(), null));
        }
    }
}
