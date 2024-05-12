package com.ss.android.ugc.aweme.memory;

import X.EF7;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.content.Context;
import android.os.Build;
import java.io.PrintStream;

/* loaded from: classes7.dex */
public final class GMTManager {

    /* loaded from: classes7.dex */
    public static class GMTSettingParams {

        @InterfaceC65349Pkn("enable_on_release")
        public boolean enable_on_release;

        @InterfaceC65349Pkn("gmt_config")
        public int gmt_config = 273;

        @InterfaceC65349Pkn("gmt_dump_threshold")
        public int gmt_dump_threshold = 300;

        @InterfaceC65349Pkn("gmt_record_threshold")
        public int gmt_record_threshold = 1048576;
    }

    public static boolean LIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return false;
        }
        Context LIZIZ = EF7.LIZIZ();
        if (i >= 29) {
            return true;
        }
        try {
            if (LIZIZ.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isOk ");
            LIZ.append(th);
            printStream.println(X1D.LIZIZ(LIZ));
            return false;
        }
    }
}
