package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.C16880lQ;
import X.C32022ChW;
import X.C32023ChX;
import X.ThreadFactoryC38888FOa;
import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class TaskManagerInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "task_manager_init_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        Executor LLLLLZL = C16880lQ.LLLLLZL(new ThreadFactoryC38888FOa("live-work-threads", true));
        C32023ChX c32023ChX = new C32023ChX();
        if (LLLLLZL == null) {
            LLLLLZL = C32022ChW.LIZJ;
        }
        c32023ChX.LIZ = LLLLLZL;
        C32022ChW LIZIZ = C32022ChW.LIZIZ();
        LIZIZ.getClass();
        LIZIZ.LIZIZ = c32023ChX.LIZ;
        new Handler(C16880lQ.LLJJJJ());
        LIZIZ.LIZ = true;
    }
}
