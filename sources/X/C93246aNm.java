package X;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.pitaya.log.PitayaLogger;
import java.io.File;

/* renamed from: X.aNm, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93246aNm implements DatabaseErrorHandler {
    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            PitayaLogger.LIZIZ("Database", "Database recover: onCorruption");
            if (C93317aOv.LIZ() != null) {
                try {
                    SQLiteDatabase.deleteDatabase(new File(sQLiteDatabase.getPath()));
                } catch (Throwable th) {
                    PitayaLogger.LJ(th, null, 6);
                }
            }
        }
    }
}
