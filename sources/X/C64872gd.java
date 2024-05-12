package X;

import android.text.TextUtils;
import java.io.File;

/* renamed from: X.2gd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64872gd {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                LIZ(file2.getPath());
            } else {
                C16880lQ.LLLZZIL(file2);
            }
        }
        C16880lQ.LLLZZIL(file);
    }
}
