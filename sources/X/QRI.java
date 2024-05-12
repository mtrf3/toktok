package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes12.dex */
public final class QRI {
    public static final String[] LIZJ = {"message_id", "arrive_time", "client_intelligence_expire_time", "sender", "handle_by_sdk", "has_been_shown", "push_body"};
    public static QRI LIZLLL;
    public SQLiteDatabase LIZ;
    public final C47962Is2 LIZIZ;

    public final SQLiteDatabase LJ() {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    try {
                        this.LIZ = this.LIZIZ.getWritableDatabase();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return this.LIZ;
    }

    public QRI(Context context) {
        this.LIZIZ = new C47962Is2(context);
    }

    public static QRI LIZLLL(Context context) {
        if (LIZLLL == null) {
            synchronized (QRI.class) {
                if (LIZLLL == null) {
                    LIZLLL = new QRI(C16880lQ.LLLLL(context));
                }
            }
        }
        return LIZLLL;
    }

    public static void LJFF(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final synchronized void LIZ(QRK qrk) {
        QRG.LIZIZ().getClass();
        if (!QRG.LIZ()) {
            return;
        }
        SQLiteDatabase LJ = LJ();
        if (LJ != null) {
            if (LJ.isOpen()) {
                ContentValues LIZ = qrk.LIZ();
                Cursor rawQuery = LJ.rawQuery("select count(*) from message", null);
                rawQuery.moveToFirst();
                long j = rawQuery.getLong(0);
                LJFF(rawQuery);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[addMessageToDb] curMessageCount is ");
                LIZ2.append(j);
                X1D.LIZIZ(LIZ2);
                QRG.LIZIZ().getClass();
                if (j >= QRG.LIZLLL().LJJIII().LIZIZ) {
                    LJ.execSQL("delete from message where message_id in(select message_id from message where has_been_shown=0 limit 1)");
                }
                LJ.insert("message", null, LIZ);
            }
        }
    }

    public final synchronized boolean LIZIZ(long j) {
        Cursor cursor;
        QRG.LIZIZ().getClass();
        boolean z = false;
        if (!QRG.LIZ()) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[curMessageHasExists] messageId is ");
        LIZ.append(j);
        X1D.LIZIZ(LIZ);
        SQLiteDatabase LJ = LJ();
        if (LJ != null) {
            if (LJ.isOpen()) {
                try {
                    cursor = LJ.query("message", LIZJ, "message_id = ?", new String[]{String.valueOf(j)}, null, null, null, null);
                    try {
                        if (cursor.getCount() >= 1) {
                            z = true;
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    cursor = null;
                }
                LJFF(cursor);
                return z;
            }
        }
        return false;
    }

    public final synchronized void LIZJ(long j) {
        QRG.LIZIZ().getClass();
        if (!QRG.LIZ()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - (3600000 * j);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[deleteExpiredMsg] lastTimeStamp is ");
        LIZ.append(currentTimeMillis);
        LIZ.append(" maxCacheTimeInHour is ");
        LIZ.append(j);
        X1D.LIZIZ(LIZ);
        SQLiteDatabase LJ = LJ();
        if (LJ != null) {
            try {
                if (LJ.isOpen()) {
                    LJ.delete("message", "arrive_time <= ?", new String[]{String.valueOf(currentTimeMillis)});
                }
            } catch (Throwable unused) {
            }
        }
    }
}
