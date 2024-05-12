package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.Iri, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47942Iri implements InterfaceC47937Ird {
    @Override // X.InterfaceC47937Ird
    public final void LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new cache created: ");
        LIZ.append(str);
        C48841JEv.LJIILIIL("TAG_PROXY_DiskLruCache", X1D.LIZIZ(LIZ), null);
    }

    @Override // X.InterfaceC47937Ird
    public final void LIZIZ(java.util.Set<String> set) {
        String sb;
        C47961Is1 c47961Is1 = C47455Ijr.LIZIZ;
        c47961Is1.getClass();
        if (set != null && !set.isEmpty()) {
            int size = set.size() + 1;
            String[] strArr = new String[size];
            java.util.Map<String, C48111IuR> map = c47961Is1.LIZ.get(0);
            int i = -1;
            for (String str : set) {
                if (map != null) {
                    map.remove(str);
                }
                i++;
                strArr[i] = str;
            }
            strArr[i + 1] = String.valueOf(0);
            try {
                SQLiteDatabase writableDatabase = c47961Is1.LIZIZ.getWritableDatabase();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("key IN(");
                int i2 = size - 1;
                if (i2 > 0) {
                    StringBuilder sb2 = new StringBuilder(i2 << 1);
                    sb2.append("?");
                    for (int i3 = 1; i3 < i2; i3++) {
                        sb2.append(",?");
                    }
                    sb = sb2.toString();
                } else {
                    sb = "";
                }
                LIZ.append(sb);
                LIZ.append(") AND ");
                LIZ.append("flag");
                LIZ.append("=?");
                writableDatabase.delete("video_http_header_t", X1D.LIZIZ(LIZ), strArr);
            } catch (Throwable unused) {
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cache file removed, ");
        LIZ2.append(set);
        C48841JEv.LJIILIIL("TAG_PROXY_DiskLruCache", X1D.LIZIZ(LIZ2), null);
        if (set != null) {
            for (String str2 : set) {
                C47944Irk c47944Irk = C47480IkG.LIZ;
                String str3 = c47944Irk.LIZJ.get(str2);
                if (str3 != null) {
                    c47944Irk.LIZ.remove(str3);
                }
            }
        }
    }
}
