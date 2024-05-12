package com.ss.android.ugc.effectmanager.common;

import android.util.Pair;
import com.ss.android.ugc.effectmanager.common.task.BaseInterceptor;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.common.task.ITask;
import com.ss.android.ugc.effectmanager.common.task.NewITask;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes16.dex */
public class TaskManager {
    public Map<String, Pair<NewITask, Future>> mExecutingTask = new ConcurrentHashMap();
    public ExecutorService mExecutor;
    public boolean mInit;
    public Map<String, BaseInterceptor> mInterceptions;
    public boolean needShutDown;

    private void checkInit() {
        if (this.mInit) {
        } else {
            throw new IllegalStateException("EffectPlatformSDK: TaskManager is not init !!!");
        }
    }

    public void cancelAllTask() {
        if (!CollectionUtil.isMapEmpty(this.mExecutingTask)) {
            for (Pair<NewITask, Future> pair : this.mExecutingTask.values()) {
                ((NewITask) pair.first).cancel();
                ((Future) pair.second).cancel(true);
            }
            this.mExecutingTask.clear();
        }
        if (this.needShutDown) {
            this.mExecutor.shutdown();
        }
    }

    public void destroy() {
        if (this.needShutDown) {
            this.mExecutor.shutdown();
        }
    }

    /* loaded from: classes16.dex */
    public static class TaskManagerConfig {
        public ExecutorService mExecutor;
        public boolean needShutDown;

        public ExecutorService getExecutor() {
            return this.mExecutor;
        }

        public TaskManagerConfig setExecutor(ExecutorService executorService, boolean z) {
            this.mExecutor = executorService;
            return this;
        }
    }

    public Map<String, BaseInterceptor> getInterceptions() {
        return this.mInterceptions;
    }

    public void cancelTask(String str) {
        Pair<NewITask, Future> pair;
        if (this.mExecutingTask.containsKey(str) && (pair = this.mExecutingTask.get(str)) != null) {
            ((NewITask) pair.first).cancel();
            ((Future) pair.second).cancel(true);
        }
    }

    public void commit(final ITask iTask) {
        if (iTask == null) {
            return;
        }
        checkInit();
        if (!CollectionUtil.isMapEmpty(this.mInterceptions)) {
            Iterator<BaseInterceptor> it = this.mInterceptions.values().iterator();
            while (it.hasNext()) {
                if (it.next().intercept(iTask)) {
                    return;
                }
            }
        }
        this.mExecutor.execute(new Runnable() { // from class: com.ss.android.ugc.effectmanager.common.TaskManager.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_android_ugc_effectmanager_common_TaskManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_android_ugc_effectmanager_common_TaskManager$1__run$___twin___() {
                iTask.execute();
            }

            public static void com_ss_android_ugc_effectmanager_common_TaskManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_android_ugc_effectmanager_common_TaskManager$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void init(TaskManagerConfig taskManagerConfig) {
        this.mExecutor = taskManagerConfig.getExecutor();
        this.needShutDown = taskManagerConfig.needShutDown;
        this.mInterceptions = new ConcurrentHashMap();
        this.mInit = true;
    }

    public void addInterception(String str, BaseInterceptor baseInterceptor) {
        this.mInterceptions.put(str, baseInterceptor);
    }

    public <T> void commit(final NewITask<T> newITask, final IEffectPlatformBaseListener<T> iEffectPlatformBaseListener) {
        if (newITask == null) {
            return;
        }
        checkInit();
        this.mExecutingTask.put(newITask.getId(), new Pair<>(newITask, this.mExecutor.submit(new Runnable() { // from class: com.ss.android.ugc.effectmanager.common.TaskManager.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_android_ugc_effectmanager_common_TaskManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_android_ugc_effectmanager_common_TaskManager$2__run$___twin___() {
                newITask.execute(iEffectPlatformBaseListener);
                TaskManager.this.mExecutingTask.remove(newITask.getId());
            }

            public static void com_ss_android_ugc_effectmanager_common_TaskManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_android_ugc_effectmanager_common_TaskManager$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        })));
    }

    public void enableInterception(String str, boolean z) {
        BaseInterceptor baseInterceptor = this.mInterceptions.get(str);
        if (baseInterceptor != null) {
            baseInterceptor.enable(z);
        }
    }
}
