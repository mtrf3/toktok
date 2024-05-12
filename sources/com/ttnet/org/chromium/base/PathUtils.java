package com.ttnet.org.chromium.base;

import X.C16880lQ;
import X.C38645FEr;
import X.C78939UyV;
import X.O6T;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StrictMode;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public abstract class PathUtils {
    static {
        new AtomicBoolean();
    }

    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        C38645FEr c38645FEr = new C38645FEr(StrictMode.allowThreadDiskWrites(), null);
        try {
            File[] externalFilesDirs = O6T.LIZ.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            c38645FEr.close();
            return LIZ(arrayList);
        } catch (Throwable th) {
            try {
                c38645FEr.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String[] getExternalDownloadVolumesNames() {
        ArrayList arrayList = new ArrayList();
        for (String str : MediaStore.getExternalVolumeNames(O6T.LIZ)) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                File directory = ((StorageManager) O6T.LIZ.getSystemService(StorageManager.class)).getStorageVolume(MediaStore.Files.getContentUri(str)).getDirectory();
                File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                if (!file.isDirectory()) {
                    Object[] objArr = {file.getAbsolutePath(), directory.getAbsolutePath(), Boolean.valueOf(directory.isDirectory())};
                    C78939UyV.LJIILIIL("Download dir missing: %s, parent dir:%s, isDirectory:%s", C78939UyV.LJJII(objArr), objArr);
                }
                arrayList.add(file);
            }
        }
        return LIZ(arrayList);
    }

    public static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = O6T.LIZ.getApplicationInfo();
        int i = applicationInfo.flags;
        if ((i & 128) != 0 || (i & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    public static String getDownloadsDirectory() {
        String str;
        C38645FEr c38645FEr = new C38645FEr(StrictMode.allowThreadDiskReads(), null);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
                if (allPrivateDownloadsDirectories.length == 0) {
                    str = "";
                } else {
                    str = allPrivateDownloadsDirectories[0];
                }
                c38645FEr.close();
                return str;
            }
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            c38645FEr.close();
            return path;
        } catch (Throwable th) {
            try {
                c38645FEr.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String getExternalStorageDirectory() {
        return C16880lQ.LLLLLLLLLL().getAbsolutePath();
    }

    public static String getCacheDirectory() {
        throw null;
    }

    public static String getDataDirectory() {
        throw null;
    }

    public static String getThumbnailCacheDirectory() {
        throw null;
    }

    public static String[] LIZ(List<File> list) {
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
