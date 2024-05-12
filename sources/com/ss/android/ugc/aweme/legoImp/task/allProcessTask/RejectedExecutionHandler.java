package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FJK;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RejectedExecutionHandler implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "RejectedExecutionHandler";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (Build.VERSION.SDK_INT <= 28) {
            Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
            o.LJII(executor, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
            ((ThreadPoolExecutor) executor).setRejectedExecutionHandler(new FJK());
        }
    }
}
