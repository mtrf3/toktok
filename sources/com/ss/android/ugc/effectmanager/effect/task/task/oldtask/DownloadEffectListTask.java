package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.FII;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.WeakHandler;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectExtKt;
import com.ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectListTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class DownloadEffectListTask extends NormalTask implements WeakHandler.IHandler {
    public List<Effect> downloadedEffectList;
    public List<String> downloadingEffectList;
    public List<Effect> effectList;
    public List<Pair<Effect, ExceptionResult>> failedEffectList;
    public EffectConfiguration mConfiguration;
    public EffectContext mEffectContext;
    public DownloadEffectExtra mExtra;
    public Handler mTaskHandler;
    public List<Effect> waitingDownloadEffectList;

    private void onFail() {
        ArrayList arrayList = new ArrayList();
        ExceptionResult exceptionResult = null;
        for (Pair<Effect, ExceptionResult> pair : this.failedEffectList) {
            arrayList.add(pair.first);
            Object obj = pair.second;
            if (obj != null) {
                exceptionResult = (ExceptionResult) obj;
            }
        }
        sendMessage(17, new EffectListTaskResult(arrayList, exceptionResult));
    }

    public void checkDownloadTask() {
        if (!CollectionUtil.isListEmpty(this.waitingDownloadEffectList)) {
            if (this.downloadingEffectList.size() < 5) {
                int size = 5 - this.downloadingEffectList.size();
                int i = 0;
                while (i <= size && !CollectionUtil.isListEmpty(this.waitingDownloadEffectList)) {
                    synchronized (DownloadEffectListTask.class) {
                        if (!CollectionUtil.isListEmpty(this.waitingDownloadEffectList)) {
                            downloadEffect(this.waitingDownloadEffectList.remove(0));
                            i++;
                        }
                    }
                }
                return;
            }
            return;
        }
        if (this.failedEffectList.size() + this.downloadedEffectList.size() == this.effectList.size()) {
            if (this.downloadedEffectList.size() == this.effectList.size()) {
                onSuccess(this.effectList);
            } else {
                onFail();
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        if (CollectionUtil.isListEmpty(this.waitingDownloadEffectList)) {
            onSuccess(this.effectList);
            return;
        }
        try {
            this.mTaskHandler = new WeakHandler(this);
            checkDownloadTask();
        } catch (Throwable unused) {
        }
    }

    private synchronized void downloadEffect(Effect effect) {
        this.downloadingEffectList.add(effect.getId());
        EffectDownloadManager effectDownloadManager = this.mEffectContext.getEffectConfiguration().getEffectDownloadManager();
        if (effectDownloadManager != null) {
            if (effectDownloadManager.isDownloading(EffectExtKt.expectedMd5(effect))) {
                effectDownloadManager.addDownloadListener(effect, new IFetchEffectListener() { // from class: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListTask.1
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public void onStart(Effect effect2) {
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public void onSuccess(Effect effect2) {
                        if (effect2 != null) {
                            DownloadEffectListTask.this.downloadingEffectList.remove(effect2.getId());
                            DownloadEffectListTask.this.downloadedEffectList.add(effect2);
                        }
                        DownloadEffectListTask.this.checkDownloadTask();
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public void onFail(Effect effect2, ExceptionResult exceptionResult) {
                        if (effect2 != null) {
                            DownloadEffectListTask.this.downloadingEffectList.remove(effect2.getId());
                            DownloadEffectListTask.this.failedEffectList.add(new Pair<>(effect2, exceptionResult));
                        }
                        DownloadEffectListTask.this.checkDownloadTask();
                    }
                });
            } else {
                effectDownloadManager.addDownloadEffect(effect);
            }
        }
        this.mConfiguration.getTaskManager().commit(new DownloadEffectTask(effect, this.mEffectContext, TaskUtil.INSTANCE.generateTaskId(), this.mTaskHandler, this.mExtra));
    }

    private void onSuccess(List<Effect> list) {
        sendMessage(17, new EffectListTaskResult(list, null));
    }

    @Override // com.ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 15) {
            EffectTaskResult effectTaskResult = (EffectTaskResult) message.obj;
            Effect effect = effectTaskResult.getEffect();
            ExceptionResult exception = effectTaskResult.getException();
            this.downloadingEffectList.remove(effect.getId());
            if (exception != null) {
                this.failedEffectList.add(new Pair<>(effect, exception));
            } else {
                this.downloadedEffectList.add(effect);
            }
            checkDownloadTask();
        }
    }

    public DownloadEffectListTask(EffectContext effectContext, List<Effect> list, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        super(handler, str);
        this.waitingDownloadEffectList = new ArrayList();
        this.downloadingEffectList = FII.LIZ();
        this.downloadedEffectList = FII.LIZ();
        this.failedEffectList = FII.LIZ();
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        ArrayList arrayList = new ArrayList(list);
        this.effectList = arrayList;
        this.mExtra = downloadEffectExtra;
        this.waitingDownloadEffectList.addAll(arrayList);
    }
}
