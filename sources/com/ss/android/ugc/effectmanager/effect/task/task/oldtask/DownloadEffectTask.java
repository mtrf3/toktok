package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.task.SyncTask;
import com.ss.android.ugc.effectmanager.common.task.SyncTaskListener;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class DownloadEffectTask extends NormalTask {
    public EffectConfiguration mConfiguration;
    public int mCurCnt;
    public List<String> mDownLoadUrl;
    public Effect mEffect;
    public EffectContext mEffectContext;
    public EffectDownloadManager mEffectDownloadManager;
    public DownloadEffectExtra mExtra;
    public IMonitorService mMonitorService;

    private void downloadEffect() {
        SyncTask<EffectTaskResult> fetchEffect = this.mEffectContext.getEffectConfiguration().getEffectFetcher().fetchEffect(new EffectFetcherArguments(this.mEffect, this.mDownLoadUrl, this.mConfiguration.getEffectDir().getPath()));
        final EffectTaskResult effectTaskResult = new EffectTaskResult(this.mEffect, null);
        effectTaskResult.setProgress(0);
        effectTaskResult.setTotalSize(0L);
        fetchEffect.setListener(new SyncTaskListener<EffectTaskResult>() { // from class: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectTask.1
            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
            public void onFinally(SyncTask<EffectTaskResult> syncTask) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
            public void onStart(SyncTask<EffectTaskResult> syncTask) {
                DownloadEffectTask downloadEffectTask = DownloadEffectTask.this;
                EffectDownloadManager effectDownloadManager = downloadEffectTask.mEffectDownloadManager;
                if (effectDownloadManager != null) {
                    effectDownloadManager.startDownloadEffect(downloadEffectTask.mEffect);
                }
                DownloadEffectTask downloadEffectTask2 = DownloadEffectTask.this;
                downloadEffectTask2.sendMessage(42, new EffectTaskResult(downloadEffectTask2.mEffect, null));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
            public void onFailed(SyncTask<EffectTaskResult> syncTask, ExceptionResult exceptionResult) {
                DownloadEffectTask.this.mobResult(false, exceptionResult);
                DownloadEffectTask downloadEffectTask = DownloadEffectTask.this;
                EffectDownloadManager effectDownloadManager = downloadEffectTask.mEffectDownloadManager;
                if (effectDownloadManager != null) {
                    effectDownloadManager.failedDownloadEffect(downloadEffectTask.mEffect, exceptionResult);
                }
                DownloadEffectTask downloadEffectTask2 = DownloadEffectTask.this;
                downloadEffectTask2.sendMessage(15, new EffectTaskResult(downloadEffectTask2.mEffect, exceptionResult));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
            public void onResponse(SyncTask<EffectTaskResult> syncTask, EffectTaskResult effectTaskResult2) {
                DownloadEffectTask.this.mobResult(true, null);
                DownloadEffectTask downloadEffectTask = DownloadEffectTask.this;
                EffectDownloadManager effectDownloadManager = downloadEffectTask.mEffectDownloadManager;
                if (effectDownloadManager != null) {
                    effectDownloadManager.finishDownloadEffect(downloadEffectTask.mEffect);
                }
                DownloadEffectTask.this.sendMessage(15, new EffectTaskResult(effectTaskResult2.getEffect(), null));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
            public void onProgress(SyncTask<EffectTaskResult> syncTask, int i, long j) {
                DownloadEffectTask downloadEffectTask = DownloadEffectTask.this;
                EffectDownloadManager effectDownloadManager = downloadEffectTask.mEffectDownloadManager;
                if (effectDownloadManager != null) {
                    effectDownloadManager.onEffectDownloadProgressChange(downloadEffectTask.mEffect, i, j);
                }
                DownloadEffectTask downloadEffectTask2 = DownloadEffectTask.this;
                EffectTaskResult effectTaskResult2 = effectTaskResult;
                effectTaskResult2.setProgress(i);
                effectTaskResult2.setTotalSize(j);
                downloadEffectTask2.sendMessage(53, effectTaskResult2);
            }
        });
        fetchEffect.execute();
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        downloadEffect();
    }

    public void mobResult(boolean z, ExceptionResult exceptionResult) {
        DownloadEffectExtra downloadEffectExtra;
        String effectId;
        String name;
        String LIZIZ;
        if (this.mMonitorService != null && (downloadEffectExtra = this.mExtra) != null) {
            if (TextUtils.equals("beautify", downloadEffectExtra.getPanel()) || TextUtils.equals("beautifynew", this.mExtra.getPanel())) {
                int i = !z ? 1 : 0;
                StringBuilder sb = new StringBuilder();
                List<String> list = this.mDownLoadUrl;
                if (list != null) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(",");
                    }
                }
                IMonitorService iMonitorService = this.mMonitorService;
                EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                Effect effect = this.mEffect;
                String str = "";
                if (effect == null) {
                    effectId = "";
                } else {
                    effectId = effect.getEffectId();
                }
                newBuilder.addValuePair("effect_id", effectId);
                Effect effect2 = this.mEffect;
                if (effect2 == null) {
                    name = "";
                } else {
                    name = effect2.getName();
                }
                newBuilder.addValuePair("effect_name", name);
                newBuilder.addValuePair("app_id", this.mConfiguration.getAppID());
                newBuilder.addValuePair("access_key", this.mConfiguration.getAccessKey());
                newBuilder.addValuePair("download_urls", sb.toString());
                newBuilder.addValuePair("panel", this.mExtra.getPanel());
                if (exceptionResult == null) {
                    LIZIZ = "";
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("");
                    LIZ.append(exceptionResult.getErrorCode());
                    LIZIZ = X1D.LIZIZ(LIZ);
                }
                newBuilder.addValuePair("error_code", LIZIZ);
                if (exceptionResult != null) {
                    str = exceptionResult.getMsg();
                }
                newBuilder.addValuePair("error_msg", str);
                newBuilder.addValuePair("effect_platform_type", (Integer) 0);
                iMonitorService.monitorStatusRate("effect_resource_download_success_rate", i, newBuilder.build());
            }
        }
    }

    public DownloadEffectTask(Effect effect, EffectContext effectContext, String str, Handler handler) {
        this(effect, effectContext, str, handler, null);
    }

    public DownloadEffectTask(Effect effect, EffectContext effectContext, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        super(handler, str);
        this.mEffect = effect;
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
        this.mDownLoadUrl = EffectUtils.getUrl(this.mEffect.getFileUrl());
        this.mExtra = downloadEffectExtra;
        this.mMonitorService = this.mConfiguration.getMonitorService();
        this.mEffectDownloadManager = this.mConfiguration.getEffectDownloadManager();
    }
}
