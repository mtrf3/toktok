package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.Ikr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47517Ikr implements Runnable {
    public final Context LJLIL;

    public final void LIZ() {
        String LJFF;
        File[] listFiles;
        Context context = this.LJLIL;
        if (context == null || (LJFF = C47756Ioi.LJFF(context)) == null) {
            return;
        }
        File file = new File(LJFF);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isFile() && file2.getName().matches("^[0-9]{1,15}\\.cach$")) {
                C16880lQ.LLLZZIL(file2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47517Ikr(Context context) {
        this.LJLIL = context;
    }
}
