package com.ss.android.ugc.effectmanager.common.utils;

import X.AnonymousClass636;
import X.C0F0;
import X.C16880lQ;
import X.C1B6;
import X.C40689Fy1;
import X.C76732zl;
import X.OR7;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.cachemanager.TotalLengthOutputStream;
import com.ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.ss.android.ugc.effectmanager.common.exception.UnzipException;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import defpackage.i0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final int BUFFER_SIZE = BUFFER_SIZE;
    public static final int BUFFER_SIZE = BUFFER_SIZE;

    public final boolean isSdcardWritable() {
        try {
            return o.LJ("mounted", C16880lQ.LLLLLLLZIL());
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isSdcardAvailable() {
        String LLLLLLLZIL = C16880lQ.LLLLLLLZIL();
        if (o.LJ("mounted", LLLLLLLZIL) || o.LJ("mounted_ro", LLLLLLLZIL)) {
            return true;
        }
        return false;
    }

    public final int getBUFFER_SIZE() {
        return BUFFER_SIZE;
    }

    public final Charset getUS_ASCII() {
        return US_ASCII;
    }

    public final Charset getUTF_8() {
        return UTF_8;
    }

    public final boolean checkFileExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1B6.LIZIZ(str);
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    public final void deleteContents(File file) {
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    o.LJFF(file2, "file");
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!C16880lQ.LLLZZIL(file2)) {
                        throw new IOException(C0F0.LIZJ("failed to delete file: ", file2));
                    }
                }
                return;
            }
            throw new IOException(C0F0.LIZJ("not a readable directory: ", file));
        }
    }

    public final boolean deleteDir(File file) {
        try {
            deleteContents(file);
            if (file == null) {
                return false;
            }
            return C16880lQ.LLLZZIL(file);
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean ensureDirExists(File dir) {
        o.LJIIJ(dir, "dir");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir.exists();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0080 -> B:18:0x0083). Please report as a decompilation issue!!! */
    public final String getFileContent(String path) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        o.LJIIJ(path, "path");
        File file = new File(path);
        String str = "";
        if (!checkFileExists(file.getPath())) {
            return "";
        }
        try {
            try {
                try {
                    fileReader = new FileReader(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
                fileReader = null;
                bufferedReader2 = null;
            } catch (Throwable th2) {
                th = th2;
                fileReader = null;
                bufferedReader = null;
            }
            try {
                bufferedReader2 = new BufferedReader(fileReader);
                try {
                    for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str);
                        LIZ.append(readLine);
                        str = X1D.LIZIZ(LIZ);
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                    bufferedReader2.close();
                } catch (Exception e3) {
                    e = e3;
                    C16880lQ.LLLLIIL(e);
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (IOException e4) {
                            C16880lQ.LLLLIIL(e4);
                        }
                    }
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return str;
                }
            } catch (Exception e5) {
                e = e5;
                bufferedReader2 = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e6) {
                        C16880lQ.LLLLIIL(e6);
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (IOException e7) {
                        C16880lQ.LLLLIIL(e7);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            C16880lQ.LLLLIIL(e8);
        }
        return str;
    }

    public final OutputStream getFileOutputStream(String str) {
        FileOutputStream fileOutputStream = null;
        if (str == null) {
            return null;
        }
        File parentFile = new File(str).getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(str);
            return fileOutputStream;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return fileOutputStream;
        }
    }

    public final InputStream getFileStream(String str) {
        FileInputStream fileInputStream = null;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!checkFileExists(file.getPath())) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            return fileInputStream;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return fileInputStream;
        }
    }

    public final long getFolderSize(File file) {
        File[] listFiles;
        long folderSize;
        long j = 0;
        if (file != null && (listFiles = file.listFiles()) != null) {
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                File file2 = listFiles[i];
                o.LJFF(file2, "files[i]");
                if (file2.isFile()) {
                    folderSize = listFiles[i].length();
                } else {
                    folderSize = getFolderSize(listFiles[i]);
                }
                j = folderSize + j;
            }
        }
        return j;
    }

    public final String joinSeparator(String originPath) {
        o.LJIIJ(originPath, "originPath");
        String str = File.separator;
        o.LJFF(str, "File.separator");
        if (ujb.o.LJJJJ(originPath, str, false)) {
            return originPath;
        }
        return i0.LJFF(originPath, str);
    }

    public final String readFully(Reader reader) {
        o.LJIIJ(reader, "reader");
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            int read = reader.read(cArr);
            while (read != -1) {
                stringWriter.write(cArr, 0, read);
                read = reader.read(cArr);
            }
            String stringWriter2 = stringWriter.toString();
            o.LJFF(stringWriter2, "writer.toString()");
            AnonymousClass636.LJFF(reader, null);
            return stringWriter2;
        } finally {
        }
    }

    public final void removeDir(File file) {
        File[] listFiles;
        if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            if (listFiles.length == 0) {
                C16880lQ.LLLZZIL(file);
                return;
            }
            for (File child : listFiles) {
                o.LJFF(child, "child");
                if (child.isDirectory()) {
                    removeDir(child);
                } else {
                    C16880lQ.LLLZZIL(child);
                }
            }
            C16880lQ.LLLZZIL(file);
        }
    }

    public final boolean removeFile(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canWrite() || !C16880lQ.LLLZZIL(file)) {
            return false;
        }
        return true;
    }

    public final synchronized void removeDir(String str) {
        if (str != null) {
            removeDir(new File(str));
        }
    }

    public final String addPathSuffix(String str, String suffix) {
        o.LJIIJ(suffix, "suffix");
        if (str != null) {
            String str2 = File.separator;
            o.LJFF(str2, "File.separator");
            if (ujb.o.LJJJJ(str, str2, false)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C40689Fy1.LLFFF(1, str));
                LIZ.append(suffix);
                LIZ.append(str2);
                return X1D.LIZIZ(LIZ);
            }
            return i0.LJFF(str, suffix);
        }
        return null;
    }

    public final String combineFilePath(String path1, String path2) {
        o.LJIIJ(path1, "path1");
        o.LJIIJ(path2, "path2");
        StringBuilder LIZ = X1D.LIZ();
        if (TextUtils.isEmpty(path1)) {
            path1 = "";
        }
        LIZ.append(path1);
        if (TextUtils.isEmpty(path2)) {
            path2 = "";
        }
        LIZ.append(path2);
        return X1D.LIZIZ(LIZ);
    }

    public final long copyStream(InputStream source, OutputStream sink) {
        o.LJIIJ(source, "source");
        o.LJIIJ(sink, "sink");
        return copyStream(source, sink, 0L, null);
    }

    public final File createFile(String str, boolean z) {
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            if (!z) {
                file.mkdirs();
            } else {
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return file;
    }

    public final void unZip(String str, String str2) {
        File file;
        String canonicalDirPath;
        ZipInputStream zipInputStream;
        if (str == null || str2 == null) {
            return;
        }
        Closeable closeable = null;
        try {
            try {
                file = new File(str2);
                if (file.exists()) {
                    removeDir(file);
                }
                canonicalDirPath = file.getCanonicalPath();
                zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            while (nextEntry != null) {
                String szName = nextEntry.getName();
                o.LJFF(szName, "szName");
                if (s.LJJJLZIJ(szName, "../", false)) {
                    EPLog.e("FileUtils", "file name contains illegal pattern with ..!");
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    File file2 = new File(file, szName);
                    String canonicalDestPath = file2.getCanonicalPath();
                    o.LJFF(canonicalDestPath, "canonicalDestPath");
                    o.LJFF(canonicalDirPath, "canonicalDirPath");
                    if (ujb.o.LJJJLIIL(canonicalDestPath, canonicalDirPath, false)) {
                        if (nextEntry.isDirectory()) {
                            if (!file2.mkdirs()) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("mkdir failed! file name:");
                                LIZ.append(file2.getName());
                                EPLog.e("FileUtils", X1D.LIZIZ(LIZ));
                            }
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            File parentFile = file2.getParentFile();
                            if (parentFile != null && !parentFile.exists()) {
                                if (!parentFile.mkdirs()) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("parent mkdir failed! file name:");
                                    LIZ2.append(parentFile.getName());
                                    EPLog.e("FileUtils", X1D.LIZIZ(LIZ2));
                                }
                            } else if (file2.exists() && !C16880lQ.LLLZZIL(file2)) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("delete file failed! file name:");
                                LIZ3.append(file2.getName());
                                EPLog.e("FileUtils", X1D.LIZIZ(LIZ3));
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                            new C76732zl();
                            byte[] bArr = new byte[BUFFER_SIZE];
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(bArr, 0, read);
                                }
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        }
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("Entry is outside of the target dir: ");
                        LIZ4.append(nextEntry.getName());
                        throw new UnzipException(X1D.LIZIZ(LIZ4));
                    }
                }
            }
            closeQuietly(zipInputStream);
        } catch (Exception e2) {
            e = e2;
            closeable = zipInputStream;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            throw new UnzipException(message);
        } catch (Throwable th2) {
            th = th2;
            closeable = zipInputStream;
            closeQuietly(closeable);
            throw th;
        }
    }

    public final long writeToExternal(String cache, String path) {
        long j;
        FileOutputStream fileOutputStream;
        o.LJIIJ(cache, "cache");
        o.LJIIJ(path, "path");
        synchronized (FileUtils.class) {
            File file = new File(path);
            if (!file.exists()) {
                INSTANCE.createFile(file.getPath(), true);
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream2 == null) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                try {
                    outputStreamWriter.write(cache);
                    outputStreamWriter.flush();
                    AnonymousClass636.LJFF(outputStreamWriter, null);
                    j = cache.length();
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AnonymousClass636.LJFF(outputStreamWriter, th2);
                        throw th3;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                C16880lQ.LLLLIIL(e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        C16880lQ.LLLLIIL(e4);
                    }
                }
                j = 0;
                return j;
            } finally {
                th = th;
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    C16880lQ.LLLLIIL(e5);
                    throw th;
                }
            }
        }
        return j;
    }

    public final long writeToExternal(InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        o.LJIIJ(inputStream, "inputStream");
        long j = 0;
        if (str == null) {
            return 0L;
        }
        synchronized (FileUtils.class) {
            File file = new File(str);
            if (!file.exists()) {
                INSTANCE.createFile(file.getPath(), true);
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream2 == null) {
                    throw th;
                }
            }
            try {
                TotalLengthOutputStream totalLengthOutputStream = new TotalLengthOutputStream(fileOutputStream);
                INSTANCE.copyStream(inputStream, totalLengthOutputStream);
                totalLengthOutputStream.flush();
                totalLengthOutputStream.close();
                j = totalLengthOutputStream.getLength();
                try {
                    fileOutputStream.close();
                } catch (IOException e2) {
                    e = e2;
                    C16880lQ.LLLLIIL(e);
                    return j;
                }
            } catch (Exception e3) {
                e = e3;
                C16880lQ.LLLLIIL(e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        e = e4;
                        C16880lQ.LLLLIIL(e);
                        return j;
                    }
                }
                return j;
            } finally {
                th = th;
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    C16880lQ.LLLLIIL(e5);
                    throw th;
                }
            }
        }
        return j;
    }

    public final synchronized void rename(File file, File file2, boolean z) {
        if (file != null) {
            if (file2 != null) {
                if (z) {
                    if (file2.exists()) {
                        OR7.LLLIIL(file2);
                    }
                }
                if (file.renameTo(file2)) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("rename ");
                LIZ.append(file.getName());
                LIZ.append(" to ");
                LIZ.append(file2.getName());
                LIZ.append(" failed!");
                EPLog.e("FileUtils", X1D.LIZIZ(LIZ));
                throw new IOException();
            }
        }
    }

    public final synchronized void rename(String str, String str2, boolean z) {
        if (str != null) {
            if (str2 != null) {
                rename$default(this, new File(str), new File(str2), false, 4, (Object) null);
            }
        }
    }

    public final long copyStream(InputStream source, OutputStream sink, long j, DownloadListener downloadListener) {
        o.LJIIJ(source, "source");
        o.LJIIJ(sink, "sink");
        byte[] bArr = new byte[BUFFER_SIZE];
        int read = source.read(bArr);
        long j2 = 0;
        while (read > 0) {
            sink.write(bArr, 0, read);
            j2 += read;
            if (j2 < j && j > 0 && downloadListener != null) {
                downloadListener.onProgress((int) ((((float) j2) / ((float) j)) * 100), j);
            }
            read = source.read(bArr);
        }
        if (downloadListener != null) {
            downloadListener.onProgress(100, j);
        }
        return j2;
    }

    public final synchronized void rename(File file, File file2, boolean z, boolean z2) {
        if (file != null) {
            if (file2 != null) {
                if (z && !z2) {
                    if (file2.exists()) {
                        OR7.LLLIIL(file2);
                    }
                }
                if (!file.renameTo(file2)) {
                    if (z2 && z) {
                        OR7.LLLIIL(file2);
                        if (!file.renameTo(file2)) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("rename ");
                            LIZ.append(file.getName());
                            LIZ.append(" to ");
                            LIZ.append(file2.getName());
                            LIZ.append(" failed!");
                            EPLog.e("FileUtils", X1D.LIZIZ(LIZ));
                            throw new IOException();
                        }
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("rename ");
                        LIZ2.append(file.getName());
                        LIZ2.append(" to ");
                        LIZ2.append(file2.getName());
                        LIZ2.append(" failed!");
                        EPLog.e("FileUtils", X1D.LIZIZ(LIZ2));
                        throw new IOException();
                    }
                }
            }
        }
    }

    public final synchronized void rename(String str, String str2, boolean z, boolean z2) {
        if (str != null) {
            if (str2 != null) {
                rename(new File(str), new File(str2), z, z2);
            }
        }
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, File file, File file2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        fileUtils.rename(file, file2, z);
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        fileUtils.rename(str, str2, z);
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, File file, File file2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        fileUtils.rename(file, file2, z, z2);
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        fileUtils.rename(str, str2, z, z2);
    }
}
