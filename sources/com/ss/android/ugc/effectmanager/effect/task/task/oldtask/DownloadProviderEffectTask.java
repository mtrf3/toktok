package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.task.result.DownloadProviderEffectTaskResult;
import java.io.File;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/* loaded from: classes16.dex */
public class DownloadProviderEffectTask extends NormalTask {
    public EffectConfiguration mConfiguration;
    public String mDownLoadUrl;
    public ProviderEffect mEffect;
    public EffectContext mEffectContext;
    public String mRemoteIp;
    public String mRequestedUrl;
    public int mRetryCount;

    @Override // com.ss.android.ugc.effectmanager.common.task.NormalTask, com.ss.android.ugc.effectmanager.common.task.ITask
    public void cancel() {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        ProviderEffect download;
        int i = this.mRetryCount;
        for (int i2 = 0; i2 < i; i2++) {
            if (isCanceled()) {
                sendMessage(19, new DownloadProviderEffectTaskResult(this.mEffect, new ExceptionResult(10001)));
                return;
            }
            try {
                if (TextUtils.isEmpty(this.mEffect.getPath())) {
                    ProviderEffect providerEffect = this.mEffect;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(this.mConfiguration.getEffectDir());
                    LIZ.append(File.separator);
                    LIZ.append(this.mEffect.getId());
                    LIZ.append(".gif");
                    providerEffect.setPath(X1D.LIZIZ(LIZ));
                }
                this.mRequestedUrl = this.mDownLoadUrl;
                try {
                    try {
                        this.mRemoteIp = InetAddress.getByName(new URL(this.mRequestedUrl).getHost()).getHostAddress();
                    } catch (UnknownHostException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                } catch (MalformedURLException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                download = download(this.mDownLoadUrl, this.mEffect.getPath());
            } catch (Exception e3) {
                if (i2 == i - 1) {
                    C16880lQ.LLLLIIL(e3);
                    ExceptionResult exceptionResult = new ExceptionResult(e3);
                    exceptionResult.setTrackParams(this.mRequestedUrl, "", this.mRemoteIp);
                    sendMessage(19, new DownloadProviderEffectTaskResult(this.mEffect, exceptionResult));
                    return;
                }
            }
            if (download != null) {
                sendMessage(19, new DownloadProviderEffectTaskResult(download, null));
                return;
            }
            continue;
        }
    }

    private ProviderEffect download(String str, String str2) {
        EffectRequest effectRequest = new EffectRequest("GET", str, false);
        InputStream execute = this.mEffectContext.getEffectConfiguration().getEffectNetWorker().execute(effectRequest);
        final DownloadProviderEffectTaskResult downloadProviderEffectTaskResult = new DownloadProviderEffectTaskResult(this.mEffect, null, 0, 0L);
        EffectUtils.convertStreamToFile(execute, str2, effectRequest.getContentLength(), new DownloadListenerAdapter() { // from class: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadProviderEffectTask.1
            @Override // com.ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter, com.ss.android.ugc.effectmanager.common.download.DownloadListener
            public void onProgress(int i, long j) {
                DownloadProviderEffectTaskResult downloadProviderEffectTaskResult2 = downloadProviderEffectTaskResult;
                downloadProviderEffectTaskResult2.setProgress(i);
                downloadProviderEffectTaskResult2.setTotalSize(j);
                DownloadProviderEffectTask.this.sendMessage(54, downloadProviderEffectTaskResult);
            }
        });
        return this.mEffect;
    }

    public DownloadProviderEffectTask(EffectContext effectContext, String str, ProviderEffect providerEffect, Handler handler) {
        super(handler, str);
        this.mEffect = providerEffect;
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mRetryCount = effectContext.getEffectConfiguration().getRetryCount();
        this.mDownLoadUrl = EffectUtils.getUrl(providerEffect);
    }
}
