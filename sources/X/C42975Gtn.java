package X;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import com.ss.android.ugc.aweme.tools.draft.da.DBEvent;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gtn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42975Gtn implements DatabaseErrorHandler {
    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase dbObj) {
        o.LJIIIZ(dbObj, "dbObj");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Corruption reported by sqlite on database: ");
        LIZ.append(dbObj.getPath());
        C42962Gta.LIZ(X1D.LIZIZ(LIZ), false);
        if (!dbObj.isOpen()) {
            String path = dbObj.getPath();
            o.LJIIIIZZ(path, "dbObj.path");
            LIZ(path, dbObj);
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = dbObj.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                dbObj.close();
            } catch (SQLiteException unused2) {
            }
        } finally {
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    Object obj = it.next().second;
                    o.LJIIIIZZ(obj, "p.second");
                    LIZ((String) obj, dbObj);
                }
            } else {
                String path2 = dbObj.getPath();
                o.LJIIIIZZ(path2, "dbObj.path");
                LIZ(path2, dbObj);
            }
        }
    }

    public static void LIZ(String str, SQLiteDatabase db) {
        int i;
        boolean z;
        if (!ujb.o.LJJJJIZL(str, ":memory:", true)) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (o.LJIIJJI(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() == 0) {
                return;
            }
            o.LJIIIZ(db, "db");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("draft db corruption deleted, path: ");
            LIZ.append(db.getPath());
            C42962Gta.LIZ(X1D.LIZIZ(LIZ), false);
            long currentTimeMillis = System.currentTimeMillis();
            C42962Gta.LJFF(new DBEvent("db_corruption_deleted", 0, 0, C42962Gta.LIZJ(), currentTimeMillis, C42962Gta.LIZIZ(currentTimeMillis), 6, null));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("delete failed: ");
                LIZ2.append(e.getMessage());
                C42962Gta.LIZ(X1D.LIZIZ(LIZ2), false);
            }
        }
    }
}
