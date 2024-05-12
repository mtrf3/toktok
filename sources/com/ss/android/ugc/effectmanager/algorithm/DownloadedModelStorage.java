package com.ss.android.ugc.effectmanager.algorithm;

import X.X1D;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.AlgorithmModelInfoMemoryCache;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes16.dex */
public class DownloadedModelStorage implements IModelCache {
    public static DownloadedModelStorage sInstance;
    public AssetManagerWrapper mAssetManagerWrapper;
    public DiskLruCache mDiskLruCache;
    public final String mEffectSDKVersion;
    public final String mPath;

    public synchronized void checkDiskLruCache() {
        DiskLruCache diskLruCache = this.mDiskLruCache;
        if (diskLruCache == null || !diskLruCache.isValid()) {
            try {
                AlgorithmModelInfoMemoryCache.clear();
                this.mDiskLruCache = DiskLruCache.open(new File(this.mPath), convertStringToInt(this.mEffectSDKVersion), 1, Long.MAX_VALUE);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType;

        static {
            int[] iArr = new int[FetchModelType.values().length];
            $SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType = iArr;
            try {
                iArr[FetchModelType.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType[FetchModelType.ORIGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    public Map<String, LocalModelInfo> getLocalModelInfoList() {
        String str;
        checkDiskLruCache();
        HashMap hashMap = new HashMap();
        try {
            String[] list = this.mAssetManagerWrapper.getWrapped().list("model");
            if (list != null) {
                for (String str2 : list) {
                    AssetManager wrapped = this.mAssetManagerWrapper.getWrapped();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("model/");
                    LIZ.append(str2);
                    String[] list2 = wrapped.list(X1D.LIZIZ(LIZ));
                    if (list2 != null) {
                        for (String str3 : list2) {
                            try {
                                str = ModelNameProcessor.getNameOfModel(str3);
                            } catch (Exception unused) {
                                str = "";
                            }
                            if (!str.equals("")) {
                                String versionOfModel = ModelNameProcessor.getVersionOfModel(str3);
                                LocalModelInfo localModelInfo = new LocalModelInfo();
                                localModelInfo.setName(str);
                                localModelInfo.setVersion(versionOfModel);
                                localModelInfo.setBuilt(true);
                                hashMap.put(str, localModelInfo);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            EPLog.e("DownloadedModelStorage", "getLocalModelInfoList built in error", e);
        }
        try {
            for (String str4 : this.mDiskLruCache.getLruEntryKeys()) {
                String nameOfModel = ModelNameProcessor.getNameOfModel(str4);
                DiskLruCache.Snapshot snapshot = this.mDiskLruCache.get(str4);
                if (snapshot != null) {
                    LocalModelInfo fromFile = LocalModelInfo.fromFile(snapshot.getCleanFile(0).getAbsolutePath());
                    fromFile.setBuilt(false);
                    hashMap.put(nameOfModel, fromFile);
                }
            }
            return hashMap;
        } catch (IOException e2) {
            EPLog.e("DownloadedModelStorage", "error while getLocalModelInfoList", e2);
            return new HashMap();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    public String getCacheDir() {
        return this.mPath;
    }

    public DiskLruCache getDiskLruCache() {
        return this.mDiskLruCache;
    }

    public String getPath() {
        return this.mPath;
    }

    /* loaded from: classes15.dex */
    public static class TotalLengthOutputStream extends FilterOutputStream {
        public long length;

        public TotalLengthOutputStream(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) {
            ((FilterOutputStream) this).out.write(i);
            this.length++;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            this.length += i2;
        }
    }

    private int convertStringToInt(String str) {
        return str.hashCode();
    }

    public void clearModelFromDisk(String str) {
        checkDiskLruCache();
        try {
            this.mDiskLruCache.remove(str);
        } catch (IOException unused) {
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    public boolean isBuiltInResource(String str) {
        AssetManagerWrapper assetManagerWrapper = this.mAssetManagerWrapper;
        if (assetManagerWrapper == null) {
            EPLog.e("DownloadedModelStorage", "mAssetManagerWrapper is null!");
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("model/");
        LIZ.append(str);
        return assetManagerWrapper.exists(X1D.LIZIZ(LIZ));
    }

    public ArrayList<String> listLocalModelKeysByName(String str) {
        checkDiskLruCache();
        ArrayList<String> arrayList = new ArrayList<>();
        String diskLruCacheKey = EffectUtils.toDiskLruCacheKey(str);
        try {
            for (String str2 : this.mDiskLruCache.getLruEntryKeys()) {
                if (ModelNameProcessor.getNameOfModel(str2).equals(diskLruCacheKey)) {
                    DiskLruCache.Snapshot snapshot = null;
                    try {
                        snapshot = this.mDiskLruCache.get(str2);
                    } catch (IOException unused) {
                        if (snapshot != null) {
                        }
                    } catch (Throwable th) {
                        if (snapshot != null) {
                            snapshot.close();
                        }
                        throw th;
                    }
                    if (snapshot != null) {
                        arrayList.add(str2);
                        snapshot.close();
                    }
                }
            }
        } catch (IOException unused2) {
        }
        return arrayList;
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
                j += read;
            } else {
                return j;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Snapshot, java.lang.String] */
    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    public LocalModelInfo getLocalModelInfoByName(String str, MonitorTrace monitorTrace) {
        DiskLruCache.Snapshot snapshot;
        checkDiskLruCache();
        EPMonitor.traceStep(monitorTrace, "DownloadedModelStorage#getLocalModelInfoByName::checkDiskLruCache success");
        ?? diskLruCacheKey = EffectUtils.toDiskLruCacheKey(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownloadedModelStorage#getLocalModelInfoByName::toDiskLruCacheKey name=");
        LIZ.append((String) diskLruCacheKey);
        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ));
        try {
            Iterator<String> it = this.mDiskLruCache.getLruEntryKeys().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (TextUtils.equals(ModelNameProcessor.getNameOfModel(next), diskLruCacheKey)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("DownloadedModelStorage#getLocalModelInfoByName::modelName = ");
                    LIZ2.append(next);
                    LIZ2.append(" has found");
                    EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ2));
                    try {
                        if (next != null) {
                            try {
                                snapshot = this.mDiskLruCache.get(next);
                                try {
                                    if (snapshot == null) {
                                        EPMonitor.traceStep(monitorTrace, "DownloadedModelStorage#getLocalModelInfoByName::Find model file path failed, snapshot is nul");
                                        return null;
                                    }
                                    File cleanFile = snapshot.getCleanFile(0);
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("DownloadedModelStorage#getLocalModelInfoByName::Find model file path success, path = ");
                                    LIZ3.append(cleanFile.getAbsolutePath());
                                    EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ3));
                                    LocalModelInfo fromFile = LocalModelInfo.fromFile(cleanFile.getAbsolutePath());
                                    snapshot.close();
                                    return fromFile;
                                } catch (Exception e) {
                                    e = e;
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("DownloadedModelStorage#getLocalModelInfoByName::Find model file path failed, cause = ");
                                    LIZ4.append(e.getMessage());
                                    EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ4));
                                    EPLog.e("DiskLruCache", e.getMessage());
                                    if (snapshot != null) {
                                        snapshot.close();
                                    }
                                    return null;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                snapshot = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        if (diskLruCacheKey != 0) {
                            diskLruCacheKey.close();
                            throw th2;
                        }
                        throw th2;
                    }
                }
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("DownloadedModelStorage#getLocalModelInfoByName::DiskLruCache not contains model ");
            LIZ5.append((String) diskLruCacheKey);
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ5));
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public DownloadedModelStorage(String str, String str2, AssetManagerWrapper assetManagerWrapper) {
        this.mPath = str;
        this.mEffectSDKVersion = str2;
        this.mAssetManagerWrapper = assetManagerWrapper;
        checkDiskLruCache();
    }

    public static synchronized DownloadedModelStorage getInstance(String str, String str2, AssetManagerWrapper assetManagerWrapper) {
        DownloadedModelStorage downloadedModelStorage;
        synchronized (DownloadedModelStorage.class) {
            if (sInstance == null) {
                sInstance = new DownloadedModelStorage(str, str2, assetManagerWrapper);
            }
            downloadedModelStorage = sInstance;
        }
        return downloadedModelStorage;
    }

    private long writeModelToDisk(String str, InputStream inputStream, MessageDigest messageDigest, String str2, MonitorTrace monitorTrace) {
        checkDiskLruCache();
        String diskLruCacheKey = EffectUtils.toDiskLruCacheKey(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkDiskLruCache success, model file type is ORIGIN, fileName = ");
        LIZ.append(diskLruCacheKey);
        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ));
        DiskLruCache.Editor editor = null;
        try {
            try {
                DiskLruCache.Editor edit = this.mDiskLruCache.edit(diskLruCacheKey);
                TotalLengthOutputStream totalLengthOutputStream = new TotalLengthOutputStream(new DigestOutputStream(edit.newOutputStream(0), messageDigest));
                copy(inputStream, totalLengthOutputStream);
                totalLengthOutputStream.close();
                String byteArrayToHex = MD5Utils.byteArrayToHex(messageDigest.digest());
                if (byteArrayToHex.equals(str2)) {
                    EPMonitor.traceStep(monitorTrace, "model file md5 check success");
                    edit.commit();
                    long j = totalLengthOutputStream.length;
                    edit.abortUnlessCommitted();
                    return j;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("model file md5 check failure, expected md5 : ");
                LIZ2.append(str2);
                LIZ2.append(", actual md5 : ");
                LIZ2.append(byteArrayToHex);
                EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ2));
                edit.abort();
                edit.abortUnlessCommitted();
                return -1L;
            } catch (IOException e) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("writeModelToDisk, exception occurred, cause = ");
                LIZ3.append(e.getMessage());
                EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ3));
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                editor.abortUnlessCommitted();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0124 A[Catch: IOException -> 0x0128, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0128, blocks: (B:52:0x011d, B:44:0x0124), top: B:51:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long writeZipModelToDisk(java.lang.String r7, java.io.InputStream r8, java.security.MessageDigest r9, java.lang.String r10, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage.writeZipModelToDisk(java.lang.String, java.io.InputStream, java.security.MessageDigest, java.lang.String, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace):long");
    }

    public long writeModelToDisk(FetchModelType fetchModelType, String str, InputStream inputStream, MessageDigest messageDigest, String str2, MonitorTrace monitorTrace) {
        checkDiskLruCache();
        if (AnonymousClass1.$SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType[fetchModelType.ordinal()] != 1) {
            return writeModelToDisk(str, inputStream, messageDigest, str2, monitorTrace);
        }
        return writeZipModelToDisk(str, inputStream, messageDigest, str2, monitorTrace);
    }
}
