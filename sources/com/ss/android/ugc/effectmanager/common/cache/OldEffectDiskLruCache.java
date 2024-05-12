package com.ss.android.ugc.effectmanager.common.cache;

import X.C16880lQ;
import X.C1DI;
import X.C25620zW;
import X.X1D;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.cachemanager.FileICache;
import com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache;
import com.ss.android.ugc.effectmanager.common.cachemanager.common.IAllowListRule;
import com.ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes16.dex */
public class OldEffectDiskLruCache extends FileICache implements IAllowListRule {
    public static OldEffectDiskLruCache INSTANCE;
    public static String mCountry;
    public static ArrayList<String> mDraftDIRAllowList;
    public final int MAX_CACHE_SIZE;
    public EffectConfiguration mConfiguration;
    public DiskLruCache mDiskLruCache;
    public File mEffectDir;
    public EffectIdMapFile mEffectIdFile;
    public IMonitorService mMonitorService;
    public static List<String> mBRAllowList = Arrays.asList("52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781");
    public static List<String> mRUAllowList = Arrays.asList("52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226");

    private synchronized void checkInit() {
        File file;
        File file2;
        DiskLruCache diskLruCache = this.mDiskLruCache;
        if ((diskLruCache == null || !diskLruCache.isValid()) && (file = this.mEffectDir) != null) {
            try {
                this.mDiskLruCache = DiskLruCache.open(file, 0, 1, 838860800L, this);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (this.mEffectIdFile == null && (file2 = this.mEffectDir) != null) {
            this.mEffectIdFile = new EffectIdMapFile(file2);
        }
    }

    public synchronized void resetLruCache() {
        if (this.mEffectDir == null) {
            return;
        }
        if (!FileUtils.INSTANCE.checkFileExists(new File(this.mEffectDir, "journal").getPath())) {
            try {
                this.mDiskLruCache = DiskLruCache.open(this.mEffectDir, 0, 1, 838860800L, this);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public OldEffectDiskLruCache(EffectConfiguration effectConfiguration) {
        super(effectConfiguration.getEffectDir().getAbsolutePath());
        this.MAX_CACHE_SIZE = 838860800;
        this.mConfiguration = effectConfiguration;
        this.mEffectDir = effectConfiguration.getEffectDir();
        this.mMonitorService = effectConfiguration.getMonitorService();
        if (C16880lQ.LLJJJJ() != Looper.myLooper()) {
            checkInit();
        }
    }

    public static OldEffectDiskLruCache getInstance(EffectConfiguration effectConfiguration) {
        if (INSTANCE == null) {
            synchronized (OldEffectDiskLruCache.class) {
                if (INSTANCE == null) {
                    mCountry = effectConfiguration.getRegion();
                    mDraftDIRAllowList = effectConfiguration.getDraftList();
                    INSTANCE = new OldEffectDiskLruCache(effectConfiguration);
                }
            }
        }
        return INSTANCE;
    }

    private boolean isCountry(String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("isCountry:", str, " now:");
        LIZIZ.append(mCountry);
        EPLog.d("OldEffectDiskLruCache", X1D.LIZIZ(LIZIZ));
        if (!TextUtils.isEmpty(str) && str.equals(mCountry)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.FileICache, com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public boolean has(String str) {
        checkInit();
        if (this.mDiskLruCache.has(str)) {
            if (super.has(str)) {
                return true;
            }
            try {
                this.mDiskLruCache.remove(str);
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.common.IAllowListRule
    public boolean isAllowed(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("allowlist：");
        LIZ.append(str);
        EPLog.i("OldEffectDiskLruCache", X1D.LIZIZ(LIZ));
        if (isCountry("BR") && mBRAllowList.contains(this.mEffectIdFile.getEffectId(str))) {
            EPLog.i("cleaneffect", "allowlist：BR");
            return true;
        }
        if (isCountry("RU") && mRUAllowList.contains(this.mEffectIdFile.getEffectId(str))) {
            EPLog.i("OldEffectDiskLruCache", "allowlist：RU");
            return true;
        }
        ArrayList<String> arrayList = mDraftDIRAllowList;
        if (arrayList == null || !arrayList.contains(str)) {
            return false;
        }
        EPLog.d("OldEffectDiskLruCache", "allowlist：draft");
        return true;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.FileICache, com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public String queryToValue(String str) {
        checkInit();
        return super.queryToValue(str);
    }

    public void readKeyInMemory(String str) {
        if (this.mDiskLruCache != null) {
            try {
                this.mDiskLruCache.readKeyInMemory(DiskLruCache.toDiskLruCacheKey(str));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.FileICache, com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public boolean remove(String str) {
        checkInit();
        try {
            this.mDiskLruCache.remove(DiskLruCache.toDiskLruCacheKey(new File(str).getName()));
        } catch (Exception unused) {
        }
        return super.remove(str);
    }

    public void removeEffect(Effect effect) {
        checkInit();
        remove(effect.getUnzipPath());
        remove(effect.getZipPath());
    }

    public OldEffectDiskLruCache(File file) {
        super(file.getAbsolutePath());
        this.MAX_CACHE_SIZE = 838860800;
        this.mEffectDir = file;
        if (C16880lQ.LLJJJJ() != Looper.myLooper()) {
            checkInit();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.FileICache, com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public long save(String str, InputStream inputStream) {
        checkInit();
        return super.save(str, inputStream);
    }

    public void unzipEffectToDisk(Effect effect, MonitorTrace monitorTrace) {
        checkInit();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OldEffectDiskLruCache#unzipEffectToDisk::unzip begin, from ");
        LIZ.append(effect.getZipPath());
        LIZ.append(" to ");
        LIZ.append(effect.getUnzipPath());
        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ));
        String unzipPath = effect.getUnzipPath();
        FileUtils fileUtils = FileUtils.INSTANCE;
        String addPathSuffix = fileUtils.addPathSuffix(effect.getUnzipPath(), "_tmp");
        try {
            fileUtils.removeDir(addPathSuffix);
            fileUtils.unZip(effect.getZipPath(), addPathSuffix);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("OldEffectDiskLruCache#unzipEffectToDisk::unzip to temp dir ");
            LIZ2.append(addPathSuffix);
            LIZ2.append(" success");
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ2));
            if (!new File(addPathSuffix, "effect_platform_tag.tag").createNewFile()) {
                EPLog.e("OldEffectDiskLruCache", "create effect platform tag file failed!");
            }
            fileUtils.rename(addPathSuffix, unzipPath, true, true);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("OldEffectDiskLruCache#unzipEffectToDisk:: rename from ");
            LIZ3.append(addPathSuffix);
            LIZ3.append(" to ");
            LIZ3.append(unzipPath);
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ3));
            this.mDiskLruCache.addEntryToCache(new File(effect.getUnzipPath()).getName());
            this.mEffectIdFile.writeEffectId(effect.getId(), effect.getEffectId());
            String[] split = effect.getZipPath().split(File.separator);
            this.mDiskLruCache.remove(split[split.length - 1]);
            EPMonitor.traceStep(monitorTrace, "OldEffectDiskLruCache#unzipEffectToDisk::unzip success!!");
            IMonitorService iMonitorService = this.mMonitorService;
            if (iMonitorService != null) {
                EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                newBuilder.addValuePair("effect_id", effect.getEffectId());
                newBuilder.addValuePair("effect_name", effect.getName());
                newBuilder.addValuePair("app_id", this.mConfiguration.getAppID());
                newBuilder.addValuePair("access_key", this.mConfiguration.getAccessKey());
                newBuilder.addValuePair("effect_platform_type", (Integer) 0);
                iMonitorService.monitorStatusRate("effect_resource_unzip_success_rate", 0, newBuilder.build());
            }
        } catch (Exception e) {
            FileUtils fileUtils2 = FileUtils.INSTANCE;
            fileUtils2.removeDir(addPathSuffix);
            fileUtils2.removeDir(effect.getUnzipPath());
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("unzip effect ");
            LIZ4.append(effect.getZipPath());
            LIZ4.append(" to ");
            LIZ4.append(effect.getUnzipPath());
            LIZ4.append(" failed.");
            EPLog.e("OldEffectDiskLruCache", X1D.LIZIZ(LIZ4), e);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("OldEffectDiskLruCache#unzipEffectToDisk::unzip failed, cause = ");
            LIZ5.append(e.getMessage());
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ5));
            IMonitorService iMonitorService2 = this.mMonitorService;
            if (iMonitorService2 != null) {
                EventJsonBuilder newBuilder2 = EventJsonBuilder.newBuilder();
                newBuilder2.addValuePair("effect_id", effect.getEffectId());
                newBuilder2.addValuePair("effect_name", effect.getName());
                newBuilder2.addValuePair("app_id", this.mConfiguration.getAppID());
                newBuilder2.addValuePair("access_key", this.mConfiguration.getAccessKey());
                newBuilder2.addValuePair("error_msg", Log.getStackTraceString(e));
                newBuilder2.addValuePair("effect_platform_type", (Integer) 0);
                iMonitorService2.monitorStatusRate("effect_resource_unzip_success_rate", 1, newBuilder2.build());
            }
            throw e;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.FileICache, com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public long save(String str, String str2) {
        checkInit();
        return super.save(str, str2);
    }

    public void writeEffectZipToDisk(Effect effect, InputStream inputStream, long j, DownloadListener downloadListener) {
        Closeable closeable;
        checkInit();
        String id = effect.getId();
        String effectId = effect.getEffectId();
        String diskLruCacheKey = DiskLruCache.toDiskLruCacheKey(effect.getId());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mEffectDir.getPath());
        String str = File.separator;
        LIZ.append(str);
        LIZ.append(diskLruCacheKey);
        effect.setUnzipPath(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(diskLruCacheKey);
        LIZ2.append(".zip");
        String diskLruCacheKey2 = DiskLruCache.toDiskLruCacheKey(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(this.mEffectDir.getPath());
        LIZ3.append(str);
        LIZ3.append(diskLruCacheKey2);
        effect.setZipPath(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        C1DI.LIZIZ(LIZ4, " writeEffectZipToDisk:key:", diskLruCacheKey2, " contentLength:");
        LIZ4.append(j);
        EPLog.d("OldEffectDiskLruCache", X1D.LIZIZ(LIZ4));
        Closeable closeable2 = null;
        DiskLruCache.Editor editor = null;
        try {
            try {
                DiskLruCache.Editor edit = this.mDiskLruCache.edit(diskLruCacheKey2);
                try {
                    if (edit != null) {
                        int i = 0;
                        OutputStream newOutputStream = edit.newOutputStream(0);
                        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                        long j2 = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read > 0) {
                                newOutputStream.write(bArr, i, read);
                                j2 += read;
                                if (downloadListener != null && j2 < j && j > 0) {
                                    downloadListener.onProgress((int) (((((float) j2) * 1.0f) / ((float) j)) * 100.0f), j);
                                }
                                i = 0;
                            } else {
                                edit.commit();
                                this.mEffectIdFile.writeEffectId(id, effectId);
                                FileUtils fileUtils = FileUtils.INSTANCE;
                                fileUtils.closeQuietly(inputStream);
                                fileUtils.closeQuietly(newOutputStream);
                                return;
                            }
                        }
                    } else {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("writeEffectZipToDisk fail! editor return null with key: ");
                        LIZ5.append(diskLruCacheKey2);
                        EPLog.e("OldEffectDiskLruCache", X1D.LIZIZ(LIZ5));
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("editor return null with key: ");
                        LIZ6.append(diskLruCacheKey2);
                        throw new RuntimeException(X1D.LIZIZ(LIZ6));
                    }
                } catch (Exception e) {
                    e = e;
                    closeable = null;
                    editor = edit;
                    try {
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("writeEffectZipToDisk e:");
                        LIZ7.append(e.toString());
                        EPLog.e("OldEffectDiskLruCache", X1D.LIZIZ(LIZ7));
                        C16880lQ.LLLLIIL(e);
                        if (editor != null) {
                            editor.abortUnlessCommitted();
                        }
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        th = th;
                        closeable2 = closeable;
                        FileUtils fileUtils2 = FileUtils.INSTANCE;
                        fileUtils2.closeQuietly(inputStream);
                        fileUtils2.closeQuietly(closeable2);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                closeable = null;
            }
        } catch (Throwable th2) {
            th = th2;
            FileUtils fileUtils22 = FileUtils.INSTANCE;
            fileUtils22.closeQuietly(inputStream);
            fileUtils22.closeQuietly(closeable2);
            throw th;
        }
    }
}
