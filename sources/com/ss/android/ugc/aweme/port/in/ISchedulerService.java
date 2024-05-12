package com.ss.android.ugc.aweme.port.in;

import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public interface ISchedulerService {
    void schedule(Handler handler, Callable<?> callable, int i);
}
