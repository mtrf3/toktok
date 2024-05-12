package com.bytedance.geckox.utils;

import X.C16880lQ;
import X.C61467OAl;
import X.C7MY;
import X.V3N;
import X.X1D;
import android.content.Context;
import com.bytedance.librarian.Librarian;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes11.dex */
public class BsPatch {
    public static native int patch(String str, String str2, String str3);

    static {
        Context context = V3N.LJLIL;
        if (context == null) {
            C16880lQ.LLJJJIL("geckox_bspatch");
        } else {
            Librarian.LJFF(context, "geckox_bspatch");
        }
    }

    public static void LIZ(File file, File file2, File file3, String str) {
        if (file.exists()) {
            if (file2.exists()) {
                C61467OAl.LIZIZ(file3);
                File file4 = new File(file3, str);
                C16880lQ.LLLZZIL(file4);
                int patch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
                if (patch == 0) {
                    return;
                }
                StringBuilder LJ = C7MY.LJ("patch merged failed, code：", patch, " full:");
                LJ.append(file.getAbsolutePath());
                LJ.append(" patch:");
                LJ.append(file2.getAbsolutePath());
                LJ.append(" dest:");
                LJ.append(file4.getAbsolutePath());
                throw new RuntimeException(X1D.LIZIZ(LJ));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("patch package not exist：");
            LIZ.append(file2.getAbsolutePath());
            throw new FileNotFoundException(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("full package not exist：");
        LIZ2.append(file.getAbsolutePath());
        throw new FileNotFoundException(X1D.LIZIZ(LIZ2));
    }
}
