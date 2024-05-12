package com.heytap.mcssdk.utils;

import X.C16880lQ;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

/* loaded from: classes28.dex */
public class f {
    public static final ExecutorService a = C16880lQ.LLLLZLLIL();
    public static Handler b = new Handler(C16880lQ.LLJJJJ());

    public static void a(Runnable runnable) {
        a.execute(runnable);
    }

    public static void b(Runnable runnable) {
        b.post(runnable);
    }
}
