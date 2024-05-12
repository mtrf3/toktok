package com.ss.android.ugc.effectmanager.common.cachemanager;

import X.C16880lQ;
import X.JBR;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class FileICache implements ICache {
    public String cacheDir;

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void clear() {
        FileUtils.INSTANCE.removeDir(this.cacheDir);
    }

    public final String getCacheDir() {
        return this.cacheDir;
    }

    public FileICache(String cacheDir) {
        o.LJIIJ(cacheDir, "cacheDir");
        this.cacheDir = cacheDir;
    }

    private final String generatePath(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.cacheDir);
        return JBR.LJFF(LIZ, File.separator, str, LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public boolean has(String key) {
        o.LJIIJ(key, "key");
        return FileUtils.INSTANCE.checkFileExists(generatePath(key));
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public InputStream queryToStream(String key) {
        InputStream fileStream;
        o.LJIIJ(key, "key");
        String generatePath = generatePath(key);
        synchronized (FileICache.class) {
            fileStream = FileUtils.INSTANCE.getFileStream(generatePath);
        }
        return fileStream;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public String queryToValue(String key) {
        String fileContent;
        o.LJIIJ(key, "key");
        String generatePath = generatePath(key);
        synchronized (FileICache.class) {
            fileContent = FileUtils.INSTANCE.getFileContent(generatePath);
            if (TextUtils.isEmpty(fileContent)) {
                fileContent = "";
            }
        }
        return fileContent;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public boolean remove(String key) {
        boolean removeFile;
        o.LJIIJ(key, "key");
        synchronized (FileICache.class) {
            removeFile = FileUtils.INSTANCE.removeFile(generatePath(key));
        }
        return removeFile;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void removePattern(final Pattern pattern) {
        if (pattern != null) {
            synchronized (FileICache.class) {
                File[] listFiles = new File(this.cacheDir).listFiles(new FilenameFilter() { // from class: com.ss.android.ugc.effectmanager.common.cachemanager.FileICache$removePattern$$inlined$apply$lambda$1
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String str) {
                        return pattern.matcher(str).matches();
                    }
                });
                if (listFiles != null) {
                    for (File file : listFiles) {
                        C16880lQ.LLLZZIL(file);
                    }
                }
            }
        }
    }

    public final void setCacheDir(String str) {
        o.LJIIJ(str, "<set-?>");
        this.cacheDir = str;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void removePattern(String patternStr) {
        o.LJIIJ(patternStr, "patternStr");
        removePattern(PatternProtector.compile(patternStr));
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public long save(String key, InputStream inputStream) {
        long writeToExternal;
        o.LJIIJ(key, "key");
        o.LJIIJ(inputStream, "inputStream");
        synchronized (FileICache.class) {
            writeToExternal = FileUtils.INSTANCE.writeToExternal(inputStream, generatePath(key));
        }
        return writeToExternal;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public long save(String key, String value) {
        long writeToExternal;
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        synchronized (FileICache.class) {
            writeToExternal = FileUtils.INSTANCE.writeToExternal(value, generatePath(key));
        }
        return writeToExternal;
    }
}
