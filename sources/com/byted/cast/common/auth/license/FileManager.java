package com.byted.cast.common.auth.license;

import X.C16880lQ;
import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.Constants;
import com.byted.cast.common.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes29.dex */
public class FileManager {
    public static volatile FileManager sInstance;
    public static String sLicenseDir;

    public synchronized void clearLicenseCache() {
        Logger.d("FileManager", "clearLicenseCache");
        clearFileDir(new File(sLicenseDir));
    }

    public synchronized String readCacheFile() {
        String LIZIZ;
        Logger.d("FileManager", "readCacheFile");
        ensureLicenseDirInitialized();
        try {
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LICENSE_FILE_OPERATE_ERROR: ");
            LIZ.append(e.getMessage());
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        if (!new File(sLicenseDir).exists()) {
            Logger.d("FileManager", "readCacheFile, cacheFileDir is not exists");
            return "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(sLicenseDir);
        LIZ2.append("bytecast.license");
        File file = new File(X1D.LIZIZ(LIZ2));
        if (!file.exists()) {
            Logger.d("FileManager", "readCacheFile, cacheFile is not exists");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(readLine);
            LIZ3.append("");
            sb.append(X1D.LIZIZ(LIZ3));
        }
        fileInputStream.close();
        LIZIZ = sb.toString();
        return LIZIZ;
    }

    private void ensureLicenseDirInitialized() {
        try {
            if (!TextUtils.isEmpty(sLicenseDir)) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LLIIJLIL(Constants.sAppContext).getAbsolutePath());
            String str = File.separator;
            LIZ.append(str);
            LIZ.append("license");
            LIZ.append(str);
            sLicenseDir = X1D.LIZIZ(LIZ);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static FileManager getInstance() {
        if (sInstance == null) {
            synchronized (FileManager.class) {
                if (sInstance == null) {
                    sInstance = new FileManager();
                }
            }
        }
        return sInstance;
    }

    public FileManager() {
        ensureLicenseDirInitialized();
    }

    private void clearFileDir(File file) {
        Logger.d("FileManager", "clearFileDir");
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        if (file2.isFile()) {
                            C16880lQ.LLLZZIL(file2);
                        } else if (file2.isDirectory()) {
                            clearFileDir(file2);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized String cacheLicense(String str) {
        Logger.d("FileManager", "cacheLicense");
        ensureLicenseDirInitialized();
        clearFileDir(new File(sLicenseDir));
        if (TextUtils.isEmpty(str)) {
            return "LICENSE_FILE_OPERATE_ERROR: content is empty";
        }
        try {
            File file = new File(sLicenseDir);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(sLicenseDir);
            LIZ.append("bytecast.license");
            FileOutputStream fileOutputStream = new FileOutputStream(new File(X1D.LIZIZ(LIZ)));
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LICENSE_FILE_OPERATE_ERROR: ");
            LIZ2.append(e.getMessage());
            str = X1D.LIZIZ(LIZ2);
        }
        return str;
    }

    public synchronized String readAssetFile(String str) {
        String LIZIZ;
        Logger.d("FileManager", "readAssetFile");
        ensureLicenseDirInitialized();
        try {
            InputStream open = Constants.sAppContext.getResources().getAssets().open(str);
            InputStreamReader inputStreamReader = new InputStreamReader(open, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(readLine);
                LIZ.append("");
                sb.append(X1D.LIZIZ(LIZ));
            }
            bufferedReader.close();
            inputStreamReader.close();
            open.close();
            LIZIZ = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LICENSE_FILE_OPERATE_ERROR: ");
            LIZ2.append(e.getMessage());
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        return LIZIZ;
    }
}
