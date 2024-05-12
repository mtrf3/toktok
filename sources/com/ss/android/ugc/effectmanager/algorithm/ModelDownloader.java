package com.ss.android.ugc.effectmanager.algorithm;

import X.X1D;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.download.IModelDownloader;
import com.ss.android.ugc.effectmanager.knadapt.ModelConverterExtKt;
import com.ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public class ModelDownloader implements IModelDownloader {
    public DownloadedModelStorage mDownloadedModelStorage;
    public EffectNetWorkerWrapper mNetWorker;

    public ModelDownloader(DownloadedModelStorage downloadedModelStorage, EffectNetWorkerWrapper effectNetWorkerWrapper) {
        this.mDownloadedModelStorage = downloadedModelStorage;
        this.mNetWorker = effectNetWorkerWrapper;
    }

    private InputStream generateInputStream(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace monitorTrace) {
        String str = "";
        for (String str2 : modelInfo.getFile_url().getUrl(ModelConverterExtKt.toKNFetchModelType(fetchModelType))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ModelDownloader#generateInputStream, downloadUrl = ");
            LIZ.append(str2);
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ));
            try {
                return this.mNetWorker.execute(new EffectRequest("GET", str2, false));
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("download model: with type ");
                LIZ2.append(fetchModelType);
                LIZ2.append(", with url ");
                LIZ2.append(str2);
                LIZ2.append(" failed ");
                LIZ2.append(e.getMessage());
                str = X1D.LIZIZ(LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ModelDownloader#generateInputStream, exception occurred, errorMessage= ");
                LIZ3.append(str);
                EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ3));
            }
        }
        throw new RuntimeException(str);
    }

    @Override // com.ss.android.ugc.effectmanager.download.IModelDownloader
    public synchronized long download(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace monitorTrace) {
        long writeModelToDisk;
        FetchModelType fetchModelType2 = fetchModelType;
        synchronized (this) {
            ExtendedUrlModel fileUrl = modelInfo.getFileUrl();
            if (fileUrl.getUrlList() == null || fileUrl.getUrlList().isEmpty()) {
                fetchModelType2 = FetchModelType.ZIP;
            }
            if (fileUrl.getZipUrlList() == null || fileUrl.getZip_url_list().isEmpty()) {
                fetchModelType2 = FetchModelType.ORIGIN;
            }
            String fullNameFromModelInfo = ModelNameProcessor.getFullNameFromModelInfo(modelInfo);
            InputStream generateInputStream = generateInputStream(modelInfo, fetchModelType2, monitorTrace);
            EPMonitor.traceStep(monitorTrace, "ModelDownloader#download, network request success!");
            ArrayList<String> listLocalModelKeysByName = this.mDownloadedModelStorage.listLocalModelKeysByName(modelInfo.getName());
            try {
                try {
                    try {
                        writeModelToDisk = this.mDownloadedModelStorage.writeModelToDisk(fetchModelType2, fullNameFromModelInfo, generateInputStream, MessageDigest.getInstance("MD5"), modelInfo.getFile_url().getUri(), monitorTrace);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("ModelDownloader#download, writeModelToDisk fileSize = ");
                        LIZ.append(writeModelToDisk);
                        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ));
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("ModelDownloader#download, try clean old model, existingModels.size = ");
                        LIZ2.append(listLocalModelKeysByName.size());
                        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ2));
                        int size = listLocalModelKeysByName.size();
                        for (int i = 0; i < size; i++) {
                            String str = listLocalModelKeysByName.get(i);
                            try {
                                this.mDownloadedModelStorage.clearModelFromDisk(str);
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("ModelDownloader#download, delete old model success, modelName = ");
                                LIZ3.append(str);
                                EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ3));
                            } catch (Exception e) {
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("ModelDownloader#download, delete old model failed, modelName = ");
                                LIZ4.append(str);
                                LIZ4.append(", cause = ");
                                LIZ4.append(e.getMessage());
                                EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ4));
                            }
                        }
                        if (generateInputStream != null) {
                            try {
                                generateInputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (generateInputStream != null) {
                            try {
                                generateInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (RuntimeException e2) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("ModelDownloader#download, RuntimeException occurred, cause = ");
                    LIZ5.append(e2.getMessage());
                    EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ5));
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("convertStreamToFile: with type: ");
                    LIZ6.append(fetchModelType2);
                    LIZ6.append(",with name: ");
                    LIZ6.append(fullNameFromModelInfo);
                    LIZ6.append(" failed. ");
                    LIZ6.append(e2.getMessage());
                    throw new RuntimeException(X1D.LIZIZ(LIZ6), e2);
                }
            } catch (NoSuchAlgorithmException e3) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("ModelDownloader#download, NoSuchAlgorithmException occurred, cause = ");
                LIZ7.append(e3.getMessage());
                EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ7));
                throw new AssertionError();
            }
        }
        return writeModelToDisk;
    }
}
