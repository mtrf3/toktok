package X;

import android.content.Context;
import com.tencent.wcdb.FileUtils;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteGlobal;
import defpackage.a1;
import java.io.File;

/* loaded from: classes16.dex */
public final class X7C {
    static {
        SQLiteGlobal.loadLib();
    }

    public static SQLiteDatabase LIZ(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, X7D x7d, X7E x7e) {
        File file;
        File file2;
        File file3;
        int i2;
        int i3;
        char charAt = str.charAt(0);
        char c = File.separatorChar;
        if (charAt == c) {
            file = new File(str.substring(0, str.lastIndexOf(c)));
            file3 = new File(file, str.substring(str.lastIndexOf(File.separatorChar)));
        } else if (context != null) {
            String str2 = context.getApplicationInfo().dataDir;
            if (str2 != null) {
                file2 = new File(str2);
            } else {
                file2 = null;
            }
            file = new File(file2, "databases");
            if (file.getPath().equals("databases")) {
                file = new File("/data/system");
            }
            if (str.indexOf(File.separatorChar) < 0) {
                file3 = new File(file, str);
            } else {
                throw new IllegalArgumentException(a1.LJ("File ", str, " contains a path separator"));
            }
        } else {
            throw new RuntimeException("Not supported in system context");
        }
        if (!file.isDirectory() && file.mkdir()) {
            FileUtils.setPermissions(file.getPath(), 505, -1, -1);
        }
        if ((i & 8) != 0) {
            i2 = 805306368;
        } else {
            i2 = 268435456;
        }
        SQLiteDatabase LJJIL = SQLiteDatabase.LJJIL(file3.getPath(), bArr, sQLiteCipherSpec, x7d, i2, x7e);
        String path = file3.getPath();
        if ((i & 1) != 0) {
            i3 = 436;
        } else {
            i3 = 432;
        }
        if ((i & 2) != 0) {
            i3 |= 2;
        }
        FileUtils.setPermissions(path, i3, -1, -1);
        return LJJIL;
    }
}
