package com.ss.android.ugc.effectmanager.common.utils;

import X.C16880lQ;
import X.X1D;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.cache.EffectCacheManager;
import com.ss.android.ugc.effectmanager.common.cache.EffectDiskLruCache;
import com.ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.ss.android.ugc.effectmanager.common.exception.MD5Exception;
import com.ss.android.ugc.effectmanager.common.exception.UrlNotExistException;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import defpackage.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class EffectUtils {
    public static String getUrl(ProviderEffect providerEffect) {
        if (providerEffect.getSticker() == null || providerEffect.getSticker().getUrl() == null) {
            return "";
        }
        return providerEffect.getSticker().getUrl();
    }

    public static boolean isEffectValid(Effect effect) {
        if (effect == null) {
            return false;
        }
        return !isUrlModelEmpty(effect.getFileUrl());
    }

    public static boolean isRequirementsInvalid(Effect effect) {
        if (effect == null || CollectionUtil.isListEmpty(effect.getRequirements_sec())) {
            return false;
        }
        int i = 0;
        for (String str : effect.getRequirements_sec()) {
            if (!TextUtils.isEmpty(str) && str.trim().length() > 0) {
                i++;
            }
        }
        int i2 = 0;
        for (String str2 : effect.getRequirements()) {
            if (!TextUtils.isEmpty(str2) && str2.trim().length() > 0) {
                i2++;
            }
        }
        if (i == 0 || i2 == i) {
            return false;
        }
        return true;
    }

    public static boolean isUrlModelEmpty(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return true;
        }
        return false;
    }

    public static void throwIllegalNullException(String str) {
        throw new IllegalArgumentException(i0.LJFF(str, " should not null"));
    }

    public static String toDiskLruCacheKey(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c != '_' && c != '-') {
                if (c >= 'a') {
                    if (c <= 'z') {
                    }
                    charArray[i] = '_';
                } else {
                    if (c >= '0' && c <= '9') {
                    }
                    charArray[i] = '_';
                }
            }
        }
        return new String(charArray);
    }

    public static List<String> getUrl(UrlModel urlModel) {
        if (urlModel == null || isUrlModelEmpty(urlModel)) {
            return new ArrayList();
        }
        return urlModel.getUrlList();
    }

    public static List<String> appendUriForUrlPrefix(List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            LIZ.append(str);
            arrayList.add(X1D.LIZIZ(LIZ));
        }
        return arrayList;
    }

    public static File convertStreamToFile(InputStream inputStream, String str) {
        return convertStreamToFile(inputStream, str, -1L, null);
    }

    public static void downloadEffect(EffectConfiguration effectConfiguration, Effect effect) {
        String fileMD5;
        List<String> url = getUrl(effect.getFileUrl());
        if (url != null && !url.isEmpty()) {
            int i = 0;
            int i2 = 0;
            while (i2 < url.size()) {
                MonitorTrace monitorTrace = new MonitorTrace(effect.getEffectId());
                EPMonitor.traceStep(monitorTrace, "EffectUtils#downloadEffect");
                try {
                    try {
                        download(effectConfiguration, (String) ListProtector.get(url, i2), effect, monitorTrace);
                        fileMD5 = MD5Utils.getFileMD5(new File(effect.getZipPath()), monitorTrace);
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                if (fileMD5.equals(effect.getFileUrl().getUri())) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("downloadEffect downloadMd5:");
                    LIZ.append(effect.getFileUrl().getUri());
                    EPLog.d("EffectUtils", X1D.LIZIZ(LIZ));
                    if (effectConfiguration.getCache() instanceof EffectDiskLruCache) {
                        EPLog.d("EffectUtils", "downloadEffect OldEffectDiskLruCache unzip");
                        ((EffectDiskLruCache) effectConfiguration.getCache()).unzipEffectToDisk(effect, monitorTrace);
                        return;
                    }
                    try {
                        unZipEffect(effect, monitorTrace);
                        if (effectConfiguration.getMonitorService() != null) {
                            IMonitorService monitorService = effectConfiguration.getMonitorService();
                            EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                            newBuilder.addValuePair("effect_id", effect.getEffectId());
                            newBuilder.addValuePair("effect_name", effect.getName());
                            newBuilder.addValuePair("app_id", effectConfiguration.getAppID());
                            newBuilder.addValuePair("access_key", effectConfiguration.getAccessKey());
                            newBuilder.addValuePair("effect_platform_type", Integer.valueOf(i));
                            monitorService.monitorStatusRate("effect_resource_unzip_success_rate", i, newBuilder.build());
                            return;
                        }
                        return;
                    } catch (Exception e3) {
                        if (effectConfiguration.getMonitorService() != null) {
                            IMonitorService monitorService2 = effectConfiguration.getMonitorService();
                            EventJsonBuilder newBuilder2 = EventJsonBuilder.newBuilder();
                            newBuilder2.addValuePair("effect_id", effect.getEffectId());
                            newBuilder2.addValuePair("effect_name", effect.getName());
                            newBuilder2.addValuePair("app_id", effectConfiguration.getAppID());
                            newBuilder2.addValuePair("access_key", effectConfiguration.getAccessKey());
                            newBuilder2.addValuePair("error_msg", Log.getStackTraceString(e3));
                            newBuilder2.addValuePair("effect_platform_type", (Integer) 0);
                            monitorService2.monitorStatusRate("effect_resource_unzip_success_rate", 1, newBuilder2.build());
                        }
                        throw e3;
                    }
                }
                try {
                    if (effectConfiguration.getCache() instanceof EffectDiskLruCache) {
                        effectConfiguration.getCache().remove(effect.getZipPath());
                    } else {
                        FileUtils.INSTANCE.removeFile(effect.getZipPath());
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                if (i2 == url.size() - 1) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("downloadMD5: ");
                    LIZ2.append(fileMD5);
                    LIZ2.append(" expectMD5:");
                    LIZ2.append(effect.getFileUrl().getUri());
                    throw new MD5Exception(X1D.LIZIZ(LIZ2));
                }
                i2++;
                i = 0;
                e = e4;
                C16880lQ.LLLLIIL(e);
                if (i2 == url.size() - 1) {
                    if (effectConfiguration.getCache() instanceof EffectDiskLruCache) {
                        ((EffectDiskLruCache) effectConfiguration.getCache()).removeEffect(effect);
                    } else {
                        FileUtils fileUtils = FileUtils.INSTANCE;
                        fileUtils.removeDir(effect.getUnzipPath());
                        fileUtils.removeFile(effect.getZipPath());
                    }
                    throw e;
                }
                i2++;
                i = 0;
            }
            return;
        }
        throw new UrlNotExistException("File url is empty");
    }

    public static void setEffectPath(String str, List<Effect> list) {
        if (list == null) {
            return;
        }
        for (Effect effect : list) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            String str2 = File.separator;
            LIZ.append(str2);
            LIZ.append(effect.getId());
            LIZ.append(".zip");
            effect.setZipPath(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(str2);
            LIZ2.append(effect.getId());
            effect.setUnzipPath(X1D.LIZIZ(LIZ2));
        }
    }

    public static void setEffectRecId(String str, List<Effect> list) {
        if (list == null) {
            return;
        }
        for (Effect effect : list) {
            if (!TextUtils.isEmpty(str)) {
                effect.setRecId(str);
            }
        }
    }

    public static void setUrlModel(List<String> list, List<Effect> list2) {
        if (list2 == null) {
            return;
        }
        for (Effect effect : list2) {
            effect.getFileUrl().setUrlList(appendUriForUrlPrefix(list, effect.getFileUrl().getUri()));
            effect.getIconUrl().setUrlList(appendUriForUrlPrefix(list, effect.getIconUrl().getUri()));
            if (effect.getHintIcon().isValid()) {
                effect.getHintIcon().setUrlList(appendUriForUrlPrefix(list, effect.getHintIcon().getUri()));
            }
        }
    }

    public static void unZipEffect(Effect effect, MonitorTrace monitorTrace) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectUtils#unZipEffect::from ");
        LIZ.append(effect.getZipPath());
        LIZ.append(" to ");
        LIZ.append(effect.getUnzipPath());
        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ));
        FileUtils fileUtils = FileUtils.INSTANCE;
        String addPathSuffix = fileUtils.addPathSuffix(effect.getUnzipPath(), "_tmp");
        try {
            fileUtils.removeDir(addPathSuffix);
            fileUtils.unZip(effect.getZipPath(), addPathSuffix);
            fileUtils.rename(addPathSuffix, effect.getUnzipPath(), true, true);
            fileUtils.removeFile(effect.getZipPath());
            EPMonitor.traceStep(monitorTrace, "EffectUtils#unZipEffect::success!!");
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("unzip effect fail without disklrucache: ");
            LIZ2.append(e.getMessage());
            EPLog.e("EffectUtils", X1D.LIZIZ(LIZ2));
            FileUtils fileUtils2 = FileUtils.INSTANCE;
            fileUtils2.removeDir(addPathSuffix);
            fileUtils2.removeDir(effect.getUnzipPath());
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("EffectUtils#unZipEffect::failed, cause=");
            LIZ3.append(e.getMessage());
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ3));
            throw e;
        }
    }

    public static void download(EffectNetWorkerWrapper effectNetWorkerWrapper, String str, Effect effect) {
        download(effectNetWorkerWrapper, str, effect, null, null);
    }

    public static void setEffectField(String str, String str2, List<Effect> list) {
        setEffectField(str, str2, "", list);
    }

    public static File convertStreamToFile(InputStream inputStream, String str, long j, DownloadListener downloadListener) {
        File file;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                file = new File(str);
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[4096];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    i += read;
                    if (downloadListener != null && i < j && j > 0) {
                        downloadListener.onProgress((int) (((i * 1.0f) / ((float) j)) * 100.0f), j);
                    }
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                }
            }
            inputStream.close();
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
                C16880lQ.LLLLIIL(e3);
            }
            return file;
        } catch (IOException e4) {
            e = e4;
            C16880lQ.LLLLIIL(e);
            FileUtils.INSTANCE.removeFile(str);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    C16880lQ.LLLLIIL(e5);
                }
            }
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    throw th;
                } catch (IOException e6) {
                    C16880lQ.LLLLIIL(e6);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static void download(EffectConfiguration effectConfiguration, String str, Effect effect, MonitorTrace monitorTrace) {
        download(effectConfiguration.getEffectNetWorker(), str, effect, monitorTrace, null);
    }

    public static void setEffectField(String str, String str2, String str3, List<Effect> list) {
        if (list == null) {
            return;
        }
        for (Effect effect : list) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            String str4 = File.separator;
            LIZ.append(str4);
            LIZ.append(effect.getId());
            LIZ.append(".zip");
            effect.setZipPath(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(str4);
            LIZ2.append(effect.getId());
            effect.setUnzipPath(X1D.LIZIZ(LIZ2));
            effect.setPanel(str2);
            if (!TextUtils.isEmpty(str3)) {
                effect.setRecId(str3);
            }
        }
    }

    public static void download(EffectNetWorkerWrapper effectNetWorkerWrapper, String str, Effect effect, MonitorTrace monitorTrace, DownloadListener downloadListener) {
        InputStream inputStream = null;
        try {
            try {
                EPMonitor.traceStep(monitorTrace, "EffectUtils#download::net request begin.");
                EffectRequest effectRequest = new EffectRequest("GET", str, false);
                inputStream = effectNetWorkerWrapper.execute(effectRequest);
                EPMonitor.traceStep(monitorTrace, "EffectUtils#download::net request success.");
                String parent = new File(effect.getZipPath()).getParent();
                EPMonitor.traceStep(monitorTrace, "EffectUtils#download::write disk begin.");
                EffectCacheManager.Companion companion = EffectCacheManager.Companion;
                if (companion.getInstance().getCache(parent) instanceof EffectDiskLruCache) {
                    ((EffectDiskLruCache) companion.getInstance().getCache(parent)).writeEffectZipToDisk(effect, inputStream, effect.getFileUrl().getUri(), effectRequest.getContentLength(), downloadListener);
                } else {
                    convertStreamToFile(inputStream, effect.getZipPath(), effectRequest.getContentLength(), downloadListener);
                }
                EPMonitor.traceStep(monitorTrace, "EffectUtils#download::write disk success.");
            } catch (IOException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("EffectUtils#download::fail cause::");
                LIZ.append(e.getMessage());
                EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ));
                C16880lQ.LLLLIIL(e);
                throw e;
            }
        } finally {
            CloseUtil.close(inputStream);
        }
    }
}
