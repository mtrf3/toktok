package X;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes12.dex */
public final class QTO {
    public final C47913IrF LIZ;
    public SQLiteDatabase LIZIZ;

    public final boolean LIZ() {
        try {
            SQLiteDatabase sQLiteDatabase = this.LIZIZ;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                return true;
            }
            C47913IrF c47913IrF = this.LIZ;
            if (c47913IrF != null) {
                this.LIZIZ = c47913IrF.getWritableDatabase();
                return true;
            }
            return false;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public QTO() {
        C66960QPs.LIZ();
        this.LIZ = new C47913IrF(QWR.LIZ());
        this.LIZIZ = null;
    }
}
