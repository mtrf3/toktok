package com.bef.effectsdk;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import defpackage.i0;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class EffectSDKUtils {
    public static Set<File> localFiles = new HashSet();
    public static List<String> assetFiles = ModelsList.list;
    public static Set<File> needRemoveFiles = new HashSet();

    public static native String nativeGetSdkVersion();

    public static void deleteNoUseModel() {
        for (File file : localFiles) {
            if (needRemoveFiles.contains(file) && file.exists()) {
                C16880lQ.LLLZZIL(file);
            }
        }
    }

    public static String getSdkVersion() {
        return nativeGetSdkVersion();
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static String getAssetRelativePath(String str) {
        int indexOf = str.indexOf("model/");
        if (indexOf >= 0) {
            return str.substring(indexOf + 6, str.length());
        }
        return str;
    }

    public static String getFileName(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1, str.length());
        }
        return "";
    }

    public static void flushAlgorithmModelFiles(Context context, String str) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, null, false);
        deleteNoUseModel();
        localFiles.clear();
    }

    public static boolean needUpdate(final Context context, String str) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        try {
            if (assetFiles.size() > localFiles.size()) {
                return true;
            }
            for (final String str2 : assetFiles) {
                if (takeFirstMatchingOrNull(localFiles, new FileFilter() { // from class: com.bef.effectsdk.EffectSDKUtils.1
                    @Override // java.io.FileFilter
                    public boolean accept(File file) {
                        boolean z = false;
                        if (str2.contains(file.getName())) {
                            InputStream inputStream = null;
                            try {
                                inputStream = context.getAssets().open(str2);
                                if (file.length() == inputStream.available()) {
                                    z = true;
                                }
                                return z;
                            } catch (IOException unused) {
                            } finally {
                                EffectSDKUtils.closeQuietly(inputStream);
                            }
                        }
                        return false;
                    }
                }) == null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void scanRecursive(String str, Set<File> set) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    scanRecursive(file2.getAbsolutePath(), set);
                } else {
                    set.add(file2);
                }
            }
        }
    }

    public static File takeFirstMatchingOrNull(Set<File> set, FileFilter fileFilter) {
        for (File file : set) {
            if (fileFilter.accept(file)) {
                return file;
            }
        }
        return null;
    }

    public static void copyFile(Context context, String str, String str2) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream open = context.getAssets().open(str);
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append(str.substring(str.indexOf("model") + 6, str.lastIndexOf("/")));
                String LIZIZ = X1D.LIZIZ(LIZ);
                File file = new File(LIZIZ);
                if (file.exists() || file.mkdirs()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LIZIZ);
                    LIZ2.append("/");
                    LIZ2.append(getFileName(str));
                    fileOutputStream = new FileOutputStream(new File(X1D.LIZIZ(LIZ2)));
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = open.read(bArr);
                            if (read > 0) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                try {
                                    closeQuietly(open);
                                    return;
                                } finally {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = open;
                        try {
                            closeQuietly(inputStream);
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Can not mkdirs ");
                    LIZ3.append(file.getPath());
                    throw new IOException(X1D.LIZIZ(LIZ3));
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                inputStream = open;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static void copyAssets(Context context, String str, String[] strArr, boolean z) {
        if (!needRemoveFiles.isEmpty()) {
            needRemoveFiles.clear();
        }
        needRemoveFiles.addAll(localFiles);
        if (!str.endsWith("/")) {
            str = i0.LJFF(str, "/");
        }
        for (String str2 : assetFiles) {
            final String fileName = getFileName(str2);
            File takeFirstMatchingOrNull = takeFirstMatchingOrNull(needRemoveFiles, new FileFilter() { // from class: com.bef.effectsdk.EffectSDKUtils.2
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return file.getName().contains(fileName);
                }
            });
            if (takeFirstMatchingOrNull != null && new File(str, getAssetRelativePath(str2)).exists()) {
                needRemoveFiles.remove(takeFirstMatchingOrNull);
            } else {
                if (strArr != null && !TextUtils.isEmpty(fileName)) {
                    for (String str3 : strArr) {
                        if (fileName.equals(str3)) {
                            if (z) {
                                copyFile(context, str2, str);
                            }
                        }
                    }
                }
                if (!z) {
                    copyFile(context, str2, str);
                }
            }
        }
    }

    public static void flushAlgorithmModelFiles(Context context, String str, String[] strArr, boolean z) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, strArr, z);
        deleteNoUseModel();
        localFiles.clear();
    }
}
