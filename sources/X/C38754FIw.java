package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.common.utility.Logger;
import java.io.File;

/* renamed from: X.FIw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38754FIw extends ContextWrapper {
    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCacheDir() {
        return super.getCacheDir();
    }

    public C38754FIw(Context context) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDir(String str, int i) {
        Logger.debug();
        String LIZ = FCD.LIZ(this);
        if (!C38354F3m.LJ(LIZ) && !C38354F3m.LJ(str) && LIZ.endsWith(":ad")) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ad_");
            LIZ2.append(str);
            str = X1D.LIZIZ(LIZ2);
            Logger.debug();
        }
        return super.getDir(str, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        Logger.debug();
        String LIZ = FCD.LIZ(this);
        if (!C38354F3m.LJ(LIZ) && !C38354F3m.LJ(str) && LIZ.endsWith(":ad")) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ad_");
            LIZ2.append(str);
            str = X1D.LIZIZ(LIZ2);
            Logger.debug();
        }
        return super.openOrCreateDatabase(str, i, cursorFactory);
    }
}
