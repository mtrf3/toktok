package X;

import android.util.Pair;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import defpackage.i0;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public final class X7U implements X7E {
    public static final String[] LJLIL = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};

    public static final void LIZIZ(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Remove database file: ");
        LIZ.append(str);
        com.tencent.wcdb.support.Log.LIZ("WCDB.DefaultDatabaseErrorHandler", X1D.LIZIZ(LIZ));
        for (String str2 : LJLIL) {
            C16880lQ.LLLZZIL(new File(i0.LJFF(str, str2)));
        }
    }

    @Override // X.X7E
    public final void LIZ(SQLiteDatabase sQLiteDatabase) {
        List<Pair<String, String>> list;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Corruption reported by sqlite on database: ");
        LIZ.append(sQLiteDatabase.LJIJI());
        com.tencent.wcdb.support.Log.LIZ("WCDB.DefaultDatabaseErrorHandler", X1D.LIZIZ(LIZ));
        if (!sQLiteDatabase.isOpen()) {
            LIZIZ(sQLiteDatabase.LJIJI());
            return;
        }
        try {
            list = sQLiteDatabase.LJIJ();
        } catch (SQLiteException unused) {
            list = null;
        }
        sQLiteDatabase.LJJIIJ();
        try {
            sQLiteDatabase.LIZLLL();
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    LIZIZ((String) it.next().second);
                }
                return;
            }
        } catch (SQLiteException unused2) {
            if (list != null) {
                Iterator<Pair<String, String>> it2 = list.iterator();
                while (it2.hasNext()) {
                    LIZIZ((String) it2.next().second);
                }
                return;
            }
        } catch (Throwable th) {
            if (list != null) {
                Iterator<Pair<String, String>> it3 = list.iterator();
                while (it3.hasNext()) {
                    LIZIZ((String) it3.next().second);
                }
            } else {
                LIZIZ(sQLiteDatabase.LJIJI());
            }
            throw th;
        }
        LIZIZ(sQLiteDatabase.LJIJI());
    }
}
