package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes12.dex */
public final class QPB {
    public static final String[] LIZIZ = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json"};
    public static final Object LIZJ = new Object();
    public static QPB LIZLLL;
    public final SQLiteDatabase LIZ;

    public QPB(Context context) {
        this.LIZ = new QPD(context).getWritableDatabase();
    }

    public static QPB LIZIZ(Context context) {
        synchronized (LIZJ) {
            if (LIZLLL == null) {
                LIZLLL = new QPB(C16880lQ.LLLLL(context));
            }
        }
        return LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized org.json.JSONArray LIZ(long r19) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QPB.LIZ(long):org.json.JSONArray");
    }

    public final synchronized void LIZJ(QPF qpf) {
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("category", qpf.LIZ);
            contentValues.put("tag", qpf.LIZIZ);
            if (!C38354F3m.LJ(qpf.LIZJ)) {
                contentValues.put("label", qpf.LIZJ);
            }
            contentValues.put("value", Long.valueOf(qpf.LIZLLL));
            contentValues.put("ext_value", Long.valueOf(qpf.LJ));
            if (!C38354F3m.LJ(qpf.LJFF)) {
                contentValues.put("ext_json", qpf.LJFF);
            }
            this.LIZ.insert("event", null, contentValues);
        }
    }
}
