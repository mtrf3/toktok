package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* loaded from: classes7.dex */
public final class q {
    public final Context LIZ;

    public q(Context context) {
        this.LIZ = context;
    }

    public static long LIZ(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += LIZ(file2);
            }
        }
        return j;
    }
}
