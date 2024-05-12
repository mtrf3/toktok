package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.Qf7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67545Qf7 extends SQLiteOpenHelper {
    public final /* synthetic */ C67546Qf8 LJLIL;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.LJLIL.LIZ.LIZJ().LJFF.LIZ("Opening the local database failed, dropping and recreating it");
            if (!C16880lQ.LLLZZIL(this.LJLIL.LIZ.LIZ.getDatabasePath("google_app_measurement_local.db"))) {
                this.LJLIL.LIZ.LIZJ().LJFF.LIZIZ("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.LJLIL.LIZ.LIZJ().LJFF.LIZIZ(e2, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C66850QLm.LIZIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67545Qf7(C67546Qf8 c67546Qf8, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.LJLIL = c67546Qf8;
    }
}
