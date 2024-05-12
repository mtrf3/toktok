package com.ss.android.ugc.effectmanager.common.task;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.os.Handler;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class NewNormalTask<T> implements NewITask<T> {
    public IEffectPlatformBaseListener<T> baseListener;
    public final Handler handler;
    public boolean isCanceled;
    public String taskId;

    @Override // com.ss.android.ugc.effectmanager.common.task.NewITask
    public void cancel() {
        this.isCanceled = true;
        runInHandler(new AqS165S0100000_15(this, 673));
    }

    public abstract void execute();

    public abstract void onCancel();

    public final IEffectPlatformBaseListener<T> getBaseListener() {
        return this.baseListener;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.NewITask
    public String getId() {
        return this.taskId;
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.NewITask
    public void execute(IEffectPlatformBaseListener<T> iEffectPlatformBaseListener) {
        if (this.isCanceled) {
            return;
        }
        this.baseListener = iEffectPlatformBaseListener;
        execute();
    }

    public final void runInHandler(final InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIJ(block, "block");
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.android.ugc.effectmanager.common.task.NewNormalTask$sam$java_lang_Runnable$0
                public final /* synthetic */ void com_ss_android_ugc_effectmanager_common_task_NewNormalTask$sam$java_lang_Runnable$0__run$___twin___() {
                    o.LJFF(InterfaceC65784Pro.this.invoke(), "invoke(...)");
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com_ss_android_ugc_effectmanager_common_task_NewNormalTask$sam$java_lang_Runnable$0_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public static void com_ss_android_ugc_effectmanager_common_task_NewNormalTask$sam$java_lang_Runnable$0_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NewNormalTask$sam$java_lang_Runnable$0 newNormalTask$sam$java_lang_Runnable$0) {
                    boolean LIZ;
                    try {
                        newNormalTask$sam$java_lang_Runnable$0.com_ss_android_ugc_effectmanager_common_task_NewNormalTask$sam$java_lang_Runnable$0__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            block.invoke();
        }
    }

    public final void setBaseListener(IEffectPlatformBaseListener<T> iEffectPlatformBaseListener) {
        this.baseListener = iEffectPlatformBaseListener;
    }

    public final void setCanceled(boolean z) {
        this.isCanceled = z;
    }

    public NewNormalTask(Handler handler, String taskId) {
        o.LJIIJ(taskId, "taskId");
        this.handler = handler;
        this.taskId = taskId;
    }
}
