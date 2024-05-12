package X;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.0Xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09030Xb {
    public static final String[] LIZ;

    static {
        C0VW.LIZIZ("WrkDbPathHelper");
        LIZ = new String[]{"-journal", "-shm", "-wal"};
    }

    public static void LIZ(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        if (Build.VERSION.SDK_INT >= 23 && databasePath.exists()) {
            C0VW.LIZ().getClass();
            HashMap hashMap = new HashMap();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put(databasePath2, file);
            for (String str : LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(databasePath2.getPath());
                LIZ2.append(str);
                File file2 = new File(X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(file.getPath());
                LIZ3.append(str);
                hashMap.put(file2, new File(X1D.LIZIZ(LIZ3)));
            }
            for (File file3 : hashMap.keySet()) {
                File file4 = (File) hashMap.get(file3);
                if (file3.exists() && file4 != null) {
                    if (file4.exists()) {
                        C16880lQ.LLLZ("Over-writing contents of %s", new Object[]{file4});
                        C0VW.LIZ().getClass();
                    }
                    if (file3.renameTo(file4)) {
                        C16880lQ.LLLZ("Migrated %s to %s", new Object[]{file3, file4});
                    } else {
                        C16880lQ.LLLZ("Renaming %s to %s failed", new Object[]{file3, file4});
                    }
                    C0VW.LIZ().getClass();
                }
            }
        }
    }
}
