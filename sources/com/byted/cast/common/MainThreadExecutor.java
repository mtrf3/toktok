package com.byted.cast.common;

import X.C16880lQ;
import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes29.dex */
public class MainThreadExecutor implements Executor {
    public final Handler handler = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.handler.post(runnable);
    }
}
