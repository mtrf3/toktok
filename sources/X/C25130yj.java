package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.0yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25130yj {
    public final String LIZ;
    public final java.util.Map<String, C25090yf> LIZIZ;
    public final java.util.Set<C25100yg> LIZJ;
    public final java.util.Set<C25120yi> LIZLLL;

    public final int hashCode() {
        int i;
        int i2;
        String str = this.LIZ;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        java.util.Map<String, C25090yf> map = this.LIZIZ;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        java.util.Set<C25100yg> set = this.LIZJ;
        if (set != null) {
            i3 = set.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TableInfo{name='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", columns=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", foreignKeys=");
        LIZ.append(this.LIZJ);
        LIZ.append(", indices=");
        LIZ.append(this.LIZLLL);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public static List<C25110yh> LIZIZ(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C25110yh(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        java.util.Set<C25120yi> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25130yj)) {
            return false;
        }
        C25130yj c25130yj = (C25130yj) obj;
        String str = this.LIZ;
        if (str == null ? c25130yj.LIZ != null : !str.equals(c25130yj.LIZ)) {
            return false;
        }
        java.util.Map<String, C25090yf> map = this.LIZIZ;
        if (map == null ? c25130yj.LIZIZ != null : !map.equals(c25130yj.LIZIZ)) {
            return false;
        }
        java.util.Set<C25100yg> set2 = this.LIZJ;
        if (set2 == null ? c25130yj.LIZJ != null : !set2.equals(c25130yj.LIZJ)) {
            return false;
        }
        java.util.Set<C25120yi> set3 = this.LIZLLL;
        if (set3 == null || (set = c25130yj.LIZLLL) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public static C25130yj LIZ(InterfaceC262211e interfaceC262211e, String str) {
        HashSet hashSet;
        boolean z;
        boolean z2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PRAGMA table_info(`");
        LIZ.append(str);
        LIZ.append("`)");
        Cursor query = interfaceC262211e.query(X1D.LIZIZ(LIZ));
        HashMap hashMap = new HashMap();
        try {
            if (query.getColumnCount() > 0) {
                int columnIndex = query.getColumnIndex("name");
                int columnIndex2 = query.getColumnIndex("type");
                int columnIndex3 = query.getColumnIndex("notnull");
                int columnIndex4 = query.getColumnIndex("pk");
                int columnIndex5 = query.getColumnIndex("dflt_value");
                while (query.moveToNext()) {
                    String string = query.getString(columnIndex);
                    String string2 = query.getString(columnIndex2);
                    if (query.getInt(columnIndex3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hashMap.put(string, new C25090yf(query.getInt(columnIndex4), 2, string, string2, query.getString(columnIndex5), z2));
                }
            }
            query.close();
            HashSet hashSet2 = new HashSet();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PRAGMA foreign_key_list(`");
            LIZ2.append(str);
            LIZ2.append("`)");
            query = interfaceC262211e.query(X1D.LIZIZ(LIZ2));
            try {
                int columnIndex6 = query.getColumnIndex("id");
                int columnIndex7 = query.getColumnIndex("seq");
                int columnIndex8 = query.getColumnIndex("table");
                int columnIndex9 = query.getColumnIndex("on_delete");
                int columnIndex10 = query.getColumnIndex("on_update");
                List<C25110yh> LIZIZ = LIZIZ(query);
                int count = query.getCount();
                for (int i = 0; i < count; i++) {
                    query.moveToPosition(i);
                    if (query.getInt(columnIndex7) == 0) {
                        int i2 = query.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) LIZIZ).iterator();
                        while (it.hasNext()) {
                            C25110yh c25110yh = (C25110yh) it.next();
                            if (c25110yh.LJLIL == i2) {
                                arrayList.add(c25110yh.LJLJI);
                                arrayList2.add(c25110yh.LJLJJI);
                            }
                        }
                        hashSet2.add(new C25100yg(query.getString(columnIndex8), query.getString(columnIndex9), query.getString(columnIndex10), arrayList, arrayList2));
                    }
                }
                query.close();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("PRAGMA index_list(`");
                LIZ3.append(str);
                LIZ3.append("`)");
                query = interfaceC262211e.query(X1D.LIZIZ(LIZ3));
                try {
                    int columnIndex11 = query.getColumnIndex("name");
                    int columnIndex12 = query.getColumnIndex("origin");
                    int columnIndex13 = query.getColumnIndex("unique");
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        hashSet = new HashSet();
                        while (query.moveToNext()) {
                            if ("c".equals(query.getString(columnIndex12))) {
                                String string3 = query.getString(columnIndex11);
                                if (query.getInt(columnIndex13) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C25120yi LIZJ = LIZJ(interfaceC262211e, string3, z);
                                if (LIZJ != null) {
                                    hashSet.add(LIZJ);
                                }
                            }
                        }
                        return new C25130yj(str, hashMap, hashSet2, hashSet);
                    }
                    query.close();
                    hashSet = null;
                    return new C25130yj(str, hashMap, hashSet2, hashSet);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static C25120yi LIZJ(InterfaceC262211e interfaceC262211e, String str, boolean z) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PRAGMA index_xinfo(`");
        LIZ.append(str);
        LIZ.append("`)");
        Cursor query = interfaceC262211e.query(X1D.LIZIZ(LIZ));
        try {
            int columnIndex = query.getColumnIndex("seqno");
            int columnIndex2 = query.getColumnIndex("cid");
            int columnIndex3 = query.getColumnIndex("name");
            int columnIndex4 = query.getColumnIndex("desc");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
                query.close();
                return null;
            }
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            while (query.moveToNext()) {
                if (query.getInt(columnIndex2) >= 0) {
                    int i = query.getInt(columnIndex);
                    String string = query.getString(columnIndex3);
                    if (query.getInt(columnIndex4) > 0) {
                        str2 = "DESC";
                    } else {
                        str2 = "ASC";
                    }
                    treeMap.put(Integer.valueOf(i), string);
                    treeMap2.put(Integer.valueOf(i), str2);
                }
            }
            ArrayList arrayList = new ArrayList(treeMap.size());
            arrayList.addAll(treeMap.values());
            ArrayList arrayList2 = new ArrayList(treeMap2.size());
            arrayList2.addAll(treeMap2.values());
            return new C25120yi(z, str, arrayList, arrayList2);
        } finally {
            query.close();
        }
    }

    public C25130yj(String str, java.util.Map<String, C25090yf> map, java.util.Set<C25100yg> set, java.util.Set<C25120yi> set2) {
        java.util.Set<C25120yi> unmodifiableSet;
        this.LIZ = str;
        this.LIZIZ = Collections.unmodifiableMap(map);
        this.LIZJ = Collections.unmodifiableSet(set);
        if (set2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set2);
        }
        this.LIZLLL = unmodifiableSet;
    }
}
