package com.ss.android.ugc.effectmanager.effect.task.task;

import X.C16880lQ;
import X.C7MY;
import X.X1D;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.EffectConstants;
import com.ss.android.ugc.effectmanager.common.cache.EffectCacheManager;
import com.ss.android.ugc.effectmanager.common.cache.EffectDiskLruCache;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter;
import com.ss.android.ugc.effectmanager.common.exception.MD5Exception;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.SyncTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/* loaded from: classes16.dex */
public class DefaultEffectFetcher implements EffectFetcher {
    public final String mAccessKey;
    public final String mAppId;
    public final IMonitorService mMonitorService;
    public final EffectNetWorkerWrapper mNetWorker;

    @Override // com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher
    public SyncTask<EffectTaskResult> fetchEffect(final EffectFetcherArguments effectFetcherArguments) {
        final MonitorTrace monitorTrace = new MonitorTrace(effectFetcherArguments.getEffect().getEffectId());
        return new SyncTask<EffectTaskResult>() { // from class: com.ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher.1
            public long mDownloadTime;
            public long mDuration;
            public Effect mEffect;
            public long mFileSize;
            public String mRemoteIp;
            public String mRequestedUrl;
            public long mUnzipTime;

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTask
            public void execute() {
                String effectId;
                String effectId2;
                onStart(this);
                long currentTimeMillis = System.currentTimeMillis();
                Effect effect = effectFetcherArguments.getEffect();
                this.mEffect = effect;
                EPMonitor.traceBegin(monitorTrace);
                EPMonitor.traceStep(monitorTrace, "DefaultEffectFetcher#fetchEffect$execute ");
                if (effect == null || effectFetcherArguments.getDownloadUrl() == null || effectFetcherArguments.getDownloadUrl().isEmpty() || EffectUtils.isUrlModelEmpty(effect.getFileUrl())) {
                    onFailed(this, new ExceptionResult(10003));
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("fetch effect: ");
                    LIZ.append(effect.getEffectId());
                    LIZ.append(" ,name: ");
                    LIZ.append(effect.getName());
                    LIZ.append(", id: ");
                    LIZ.append(effect.getId());
                    LIZ.append(" start");
                    EPLog.d("DefaultEffectFetcher", X1D.LIZIZ(LIZ));
                    int size = effectFetcherArguments.getDownloadUrl().size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (isCanceled()) {
                            EPMonitor.traceStep(monitorTrace, "DefaultEffectFetcher#fetchEffect$execute->download canceled!");
                            onFailed(this, new ExceptionResult(10001));
                            break;
                        }
                        this.mRequestedUrl = (String) ListProtector.get(effectFetcherArguments.getDownloadUrl(), i);
                        MonitorTrace monitorTrace2 = monitorTrace;
                        StringBuilder LJ = C7MY.LJ("DefaultEffectFetcher#fetchEffect$execute->pre download itr=", i, ", url=");
                        LJ.append(this.mRequestedUrl);
                        EPMonitor.traceStep(monitorTrace2, X1D.LIZIZ(LJ));
                        try {
                            if (TextUtils.isEmpty(effect.getZipPath()) || TextUtils.isEmpty(effect.getUnzipPath())) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(effectFetcherArguments.getEffectDir());
                                String str = File.separator;
                                LIZ2.append(str);
                                LIZ2.append(effect.getId());
                                LIZ2.append(".zip");
                                effect.setZipPath(X1D.LIZIZ(LIZ2));
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(effectFetcherArguments.getEffectDir());
                                LIZ3.append(str);
                                LIZ3.append(effect.getId());
                                effect.setUnzipPath(X1D.LIZIZ(LIZ3));
                            }
                            try {
                                InetAddress byName = InetAddress.getByName(new URL(this.mRequestedUrl).getHost());
                                if (byName != null) {
                                    this.mRemoteIp = byName.getHostAddress();
                                }
                            } catch (MalformedURLException e) {
                                C16880lQ.LLLLIIL(e);
                            } catch (UnknownHostException e2) {
                                C16880lQ.LLLLIIL(e2);
                            }
                            long currentTimeMillis2 = System.currentTimeMillis();
                            try {
                                try {
                                    EffectUtils.download(DefaultEffectFetcher.this.mNetWorker, this.mRequestedUrl, effect, monitorTrace, new EffectDownloadFileProgressImpl(this));
                                    this.mDownloadTime = System.currentTimeMillis() - currentTimeMillis2;
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("fetchEffect effect: ");
                                    LIZ4.append(effect.getEffectId());
                                    LIZ4.append(", name: ");
                                    LIZ4.append(effect.getName());
                                    LIZ4.append(", id: ");
                                    LIZ4.append(effect.getId());
                                    LIZ4.append(" download success, cost: ");
                                    LIZ4.append(this.mDownloadTime);
                                    LIZ4.append("ms");
                                    EPLog.d("DefaultEffectFetcher", X1D.LIZIZ(LIZ4));
                                    long currentTimeMillis3 = System.currentTimeMillis();
                                    String parent = new File(effect.getZipPath()).getParent();
                                    ICache cache = EffectCacheManager.Companion.getInstance().getCache(parent);
                                    File file = new File(effect.getZipPath());
                                    String fileMD5 = MD5Utils.getFileMD5(file, monitorTrace);
                                    if (!fileMD5.equals(this.mEffect.getFileUrl().getUri())) {
                                        if (cache instanceof EffectDiskLruCache) {
                                            ((EffectDiskLruCache) cache).removeEffect(this.mEffect);
                                        }
                                        FileUtils.INSTANCE.removeFile(this.mEffect.getZipPath());
                                        EPMonitor.traceStep(monitorTrace, "DefaultEffectFetcher#fetchEffect$execute->pre unzip::MD5 verify failed.");
                                        StringBuilder LIZ5 = X1D.LIZ();
                                        LIZ5.append("downloadMD5: ");
                                        LIZ5.append(fileMD5);
                                        LIZ5.append(" expectMD5:");
                                        LIZ5.append(this.mEffect.getFileUrl().getUri());
                                        throw new MD5Exception(X1D.LIZIZ(LIZ5));
                                        break;
                                    }
                                    try {
                                        this.mFileSize = file.length() / EffectConstants.KB;
                                        uploadDirDiff(effectFetcherArguments.getEffectDir(), parent);
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                    try {
                                        if (cache instanceof EffectDiskLruCache) {
                                            StringBuilder LIZ6 = X1D.LIZ();
                                            LIZ6.append("fetchEffect effect: ");
                                            LIZ6.append(effect.getEffectId());
                                            LIZ6.append(", name: ");
                                            LIZ6.append(effect.getName());
                                            LIZ6.append(", id: ");
                                            LIZ6.append(effect.getId());
                                            LIZ6.append(" unzip in EffectDiskLruCache");
                                            EPLog.d("DefaultEffectFetcher", X1D.LIZIZ(LIZ6));
                                            ((EffectDiskLruCache) cache).unzipEffectToDisk(effect, monitorTrace);
                                        } else {
                                            StringBuilder LIZ7 = X1D.LIZ();
                                            LIZ7.append("fetchEffect effect: ");
                                            LIZ7.append(effect.getEffectId());
                                            LIZ7.append(", name: ");
                                            LIZ7.append(effect.getName());
                                            LIZ7.append(", id: ");
                                            LIZ7.append(effect.getId());
                                            LIZ7.append(" unzip in old cache");
                                            EPLog.d("DefaultEffectFetcher", X1D.LIZIZ(LIZ7));
                                            try {
                                                EffectUtils.unZipEffect(effect, monitorTrace);
                                                IMonitorService iMonitorService = DefaultEffectFetcher.this.mMonitorService;
                                                if (iMonitorService != null) {
                                                    EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                                                    newBuilder.addValuePair("app_id", DefaultEffectFetcher.this.mAppId);
                                                    newBuilder.addValuePair("access_key", DefaultEffectFetcher.this.mAccessKey);
                                                    Effect effect2 = this.mEffect;
                                                    if (effect2 == null) {
                                                        effectId2 = "";
                                                    } else {
                                                        effectId2 = effect2.getEffectId();
                                                    }
                                                    try {
                                                        newBuilder.addValuePair("effect_id", effectId2);
                                                        try {
                                                            newBuilder.addValuePair("effect_platform_type", (Integer) 0);
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                        }
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                    }
                                                    try {
                                                        iMonitorService.monitorStatusRate("effect_resource_unzip_success_rate", 0, newBuilder.build());
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        IMonitorService iMonitorService2 = DefaultEffectFetcher.this.mMonitorService;
                                                        if (iMonitorService2 != null) {
                                                            EventJsonBuilder newBuilder2 = EventJsonBuilder.newBuilder();
                                                            newBuilder2.addValuePair("app_id", DefaultEffectFetcher.this.mAppId);
                                                            newBuilder2.addValuePair("access_key", DefaultEffectFetcher.this.mAccessKey);
                                                            Effect effect3 = this.mEffect;
                                                            if (effect3 == null) {
                                                                effectId = "";
                                                            } else {
                                                                effectId = effect3.getEffectId();
                                                            }
                                                            newBuilder2.addValuePair("effect_id", effectId);
                                                            newBuilder2.addValuePair("error_msg", Log.getStackTraceString(e));
                                                            newBuilder2.addValuePair("effect_platform_type", (Integer) 0);
                                                            iMonitorService2.monitorStatusRate("effect_resource_unzip_success_rate", 1, newBuilder2.build());
                                                        }
                                                        throw e;
                                                    }
                                                }
                                                this.mUnzipTime = System.currentTimeMillis() - currentTimeMillis3;
                                                this.mDuration = System.currentTimeMillis() - currentTimeMillis;
                                            } catch (Exception e7) {
                                                e = e7;
                                            }
                                        }
                                        EPMonitor.traceEnd(monitorTrace);
                                        onResponse((SyncTask<EffectTaskResult>) this, new EffectTaskResult(effect, null));
                                    } catch (Exception e8) {
                                        e = e8;
                                        StringBuilder LIZ8 = X1D.LIZ();
                                        LIZ8.append("effect ");
                                        LIZ8.append(this.mEffect.getId());
                                        LIZ8.append(" download failed! current count: ");
                                        LIZ8.append(i);
                                        EPLog.e("DefaultEffectFetcher", X1D.LIZIZ(LIZ8), e);
                                        if (i == size - 1) {
                                            MonitorTrace monitorTrace3 = monitorTrace;
                                            StringBuilder LIZ9 = X1D.LIZ();
                                            LIZ9.append("Download failed, cause = ");
                                            LIZ9.append(e.getMessage());
                                            EPMonitor.traceStep(monitorTrace3, X1D.LIZIZ(LIZ9));
                                            EPMonitor.traceStep(monitorTrace, "Cleaning up work start");
                                            ExceptionResult exceptionResult = new ExceptionResult(e);
                                            exceptionResult.setTrackParams(this.mRequestedUrl, "", this.mRemoteIp);
                                            ICache cache2 = EffectCacheManager.Companion.getInstance().getCache(new File(effect.getZipPath()).getParent());
                                            if (cache2 instanceof EffectDiskLruCache) {
                                                ((EffectDiskLruCache) cache2).removeEffect(effect);
                                                EPMonitor.traceStep(monitorTrace, "removeEffect");
                                            } else {
                                                FileUtils fileUtils = FileUtils.INSTANCE;
                                                fileUtils.removeDir(effect.getUnzipPath());
                                                fileUtils.removeFile(effect.getZipPath());
                                                EPMonitor.traceStep(monitorTrace, "removeDir and removeFile");
                                            }
                                            EPMonitor.traceStep(monitorTrace, "Cleaning up work done");
                                            EPMonitor.traceEnd(monitorTrace);
                                            onFailed(this, exceptionResult);
                                            onFinally(this);
                                        }
                                        MonitorTrace monitorTrace4 = monitorTrace;
                                        StringBuilder LJ2 = C7MY.LJ("Failed ", i, " times, cause = ");
                                        LJ2.append(e.getMessage());
                                        EPMonitor.traceStep(monitorTrace4, X1D.LIZIZ(LJ2));
                                        i++;
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                }
                            } catch (Exception e10) {
                                e = e10;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                        MonitorTrace monitorTrace42 = monitorTrace;
                        StringBuilder LJ22 = C7MY.LJ("Failed ", i, " times, cause = ");
                        LJ22.append(e.getMessage());
                        EPMonitor.traceStep(monitorTrace42, X1D.LIZIZ(LJ22));
                        i++;
                    }
                }
                onFinally(this);
            }

            /* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher$1$EffectDownloadFileProgressImpl */
            /* loaded from: classes16.dex */
            public class EffectDownloadFileProgressImpl extends DownloadListenerAdapter {
                public SyncTask<EffectTaskResult> syncTask;

                public EffectDownloadFileProgressImpl(SyncTask syncTask) {
                    this.syncTask = syncTask;
                }

                @Override // com.ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter, com.ss.android.ugc.effectmanager.common.download.DownloadListener
                public void onProgress(int i, long j) {
                    SyncTask<EffectTaskResult> syncTask = this.syncTask;
                    if (syncTask != null) {
                        syncTask.onProgress(syncTask, i, j);
                    }
                }
            }

            private void uploadDirDiff(String str, String str2) {
                IMonitorService iMonitorService;
                String effectId;
                if (!str.equals(str2) && (iMonitorService = DefaultEffectFetcher.this.mMonitorService) != null) {
                    EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                    newBuilder.addValuePair("app_id", DefaultEffectFetcher.this.mAppId);
                    newBuilder.addValuePair("access_key", DefaultEffectFetcher.this.mAccessKey);
                    Effect effect = this.mEffect;
                    if (effect == null) {
                        effectId = "";
                    } else {
                        effectId = effect.getEffectId();
                    }
                    newBuilder.addValuePair("effect_id", effectId);
                    newBuilder.addValuePair("EffectDir", str);
                    newBuilder.addValuePair("zippath", str2);
                    iMonitorService.monitorStatusRate("effect_download_error", 1, newBuilder.build());
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTask
            public void onFailed(SyncTask<EffectTaskResult> syncTask, ExceptionResult exceptionResult) {
                String effectId;
                super.onFailed(syncTask, exceptionResult);
                if (this.mEffect != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("effect ");
                    LIZ.append(this.mEffect.getId());
                    LIZ.append(" download failed! ");
                    EPLog.e("DefaultEffectFetcher", X1D.LIZIZ(LIZ), exceptionResult.getException());
                } else {
                    EPLog.e("DefaultEffectFetcher", "null effect download failed! ", exceptionResult.getException());
                }
                IMonitorService iMonitorService = DefaultEffectFetcher.this.mMonitorService;
                if (iMonitorService != null) {
                    EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                    newBuilder.addValuePair("app_id", DefaultEffectFetcher.this.mAppId);
                    newBuilder.addValuePair("access_key", DefaultEffectFetcher.this.mAccessKey);
                    Effect effect = this.mEffect;
                    if (effect == null) {
                        effectId = "";
                    } else {
                        effectId = effect.getEffectId();
                    }
                    newBuilder.addValuePair("effect_id", effectId);
                    newBuilder.addValuePair("error_code", Integer.valueOf(exceptionResult.getErrorCode()));
                    newBuilder.addValuePair("error_msg", exceptionResult.getMsg());
                    newBuilder.addValuePair("monitor_trace", monitorTrace.getStepList());
                    newBuilder.addValuePair("download_url", this.mRequestedUrl);
                    newBuilder.addValuePair("host_ip", this.mRemoteIp);
                    newBuilder.addValuePair("effect_platform_type", (Integer) 0);
                    iMonitorService.monitorStatusRate("effect_download_success_rate", 1, newBuilder.build());
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTask
            public void onResponse(SyncTask<EffectTaskResult> syncTask, EffectTaskResult effectTaskResult) {
                String effectId;
                super.onResponse((SyncTask<SyncTask<EffectTaskResult>>) syncTask, (SyncTask<EffectTaskResult>) effectTaskResult);
                IMonitorService iMonitorService = DefaultEffectFetcher.this.mMonitorService;
                if (iMonitorService != null) {
                    EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                    newBuilder.addValuePair("app_id", DefaultEffectFetcher.this.mAppId);
                    newBuilder.addValuePair("access_key", DefaultEffectFetcher.this.mAccessKey);
                    newBuilder.addValuePair("duration", Long.valueOf(this.mDuration));
                    newBuilder.addValuePair("download_time", Long.valueOf(this.mDownloadTime));
                    newBuilder.addValuePair("unzip_time", Long.valueOf(this.mUnzipTime));
                    Effect effect = this.mEffect;
                    if (effect == null) {
                        effectId = "";
                    } else {
                        effectId = effect.getEffectId();
                    }
                    newBuilder.addValuePair("effect_id", effectId);
                    newBuilder.addValuePair("size", Long.valueOf(this.mFileSize));
                    newBuilder.addValuePair("effect_platform_type", (Integer) 0);
                    iMonitorService.monitorStatusRate("effect_download_success_rate", 0, newBuilder.build());
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTask
            public void onProgress(SyncTask<EffectTaskResult> syncTask, int i, long j) {
                super.onProgress(syncTask, i, j);
            }
        };
    }

    public DefaultEffectFetcher(EffectNetWorkerWrapper effectNetWorkerWrapper, IMonitorService iMonitorService, String str, String str2) {
        this.mNetWorker = effectNetWorkerWrapper;
        this.mMonitorService = iMonitorService;
        this.mAppId = str;
        this.mAccessKey = str2;
    }
}
