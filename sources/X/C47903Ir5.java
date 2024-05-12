package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.Ir5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47903Ir5 {
    public static SQLiteDatabase LIZ = null;
    public static C47903Ir5 LIZIZ = null;
    public static int LIZJ = 200;

    public C47903Ir5(Context context) {
        if (context == null) {
            return;
        }
        if (C47905Ir7.LJLIL == null) {
            synchronized (C47905Ir7.class) {
                if (C47905Ir7.LJLIL == null) {
                    C47905Ir7.LJLIL = new C47905Ir7(context);
                }
            }
        }
        C47905Ir7 c47905Ir7 = C47905Ir7.LJLIL;
        if (c47905Ir7 != null) {
            try {
                SQLiteDatabase writableDatabase = c47905Ir7.getWritableDatabase();
                LIZ = writableDatabase;
                if (writableDatabase != null) {
                    LIZ.execSQL(C16880lQ.LLLZ("CREATE TABLE IF NOT EXISTS %s(vid TEXT PRIMARY KEY,videomodel TEXT,time INTEGER)", new Object[]{"videomodel"}));
                }
            } catch (Throwable th) {
                TTVideoEngineLog.d(th);
            }
        }
    }

    public static void LIZ(Context context) {
        if (LIZIZ == null) {
            synchronized (C47903Ir5.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C47903Ir5(context);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47903Ir5.LIZIZ(java.lang.String, java.lang.String):void");
    }
}
