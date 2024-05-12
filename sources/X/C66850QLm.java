package X;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: X.QLm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66850QLm {
    public static void LIZIZ(C67280Qaq c67280Qaq, SQLiteDatabase sQLiteDatabase) {
        if (c67280Qaq != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                c67280Qaq.LJIIIIZZ.LIZ("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                c67280Qaq.LJIIIIZZ.LIZ("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                c67280Qaq.LJIIIIZZ.LIZ("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                c67280Qaq.LJIIIIZZ.LIZ("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r0 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C67280Qaq r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66850QLm.LIZ(X.Qaq, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }
}
