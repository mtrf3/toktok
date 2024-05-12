package X;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import defpackage.b1;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class X4Q {
    public static ConnectivityManager LIZJ;
    public static final String LIZ = C16880lQ.LJLLJ(X4Q.class);
    public static final char[] LIZIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static String LIZLLL = null;

    public static boolean LJIJJLI() {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static void LIZJ(DownloadInfo downloadInfo) {
        X4H LJFF;
        JSONObject LJIIIZ;
        String str;
        if (downloadInfo != null && (LJIIIZ = (LJFF = X4H.LJFF(downloadInfo.getId(), null)).LJIIIZ("download_dir")) != null) {
            String optString = LJIIIZ.optString("ins_desc");
            if (!TextUtils.isEmpty(optString)) {
                LJI(downloadInfo.getSavePath(), optString);
            }
            String title = downloadInfo.getTitle();
            if (TextUtils.isEmpty(title)) {
                title = downloadInfo.getName();
            }
            JSONObject LJIIIZ2 = LJFF.LJIIIZ("download_dir");
            if (LJIIIZ2 != null) {
                str = LJIIIZ2.optString("dir_name");
                if (!TextUtils.isEmpty(str) && str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (!str.contains("%s")) {
                        str = i0.LJFF(str, title);
                    } else {
                        try {
                            str = C16880lQ.LLLZ(str, new Object[]{title});
                        } catch (Throwable unused) {
                        }
                    }
                    if (str.length() > 255) {
                        str = str.substring(str.length() - 255);
                    }
                }
            } else {
                str = "";
            }
            String savePath = downloadInfo.getSavePath();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(savePath)) {
                File file = new File(str);
                File file2 = new File(savePath);
                while (file2.isDirectory() && TextUtils.equals(file.getName(), file2.getName())) {
                    LJFF(file2.getPath());
                    file = file.getParentFile();
                    file2 = file2.getParentFile();
                    if (file == null || file2 == null) {
                        return;
                    }
                }
            }
        }
    }

    public static void LIZLLL(DownloadInfo downloadInfo) {
        LJ(downloadInfo, true);
    }

    public static void LJFF(String str) {
        if (C65210PiY.LIZ()) {
            String str2 = LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Thread:");
            LIZ2.append(C16880lQ.LLLLIIIILLL());
            C65210PiY.LIZIZ(str2, "deleteDirIfEmpty", X1D.LIZIZ(LIZ2));
        }
        if (C84236X4e.LJ(str) != 1 || !C84246X4o.LIZIZ(str) || TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.isDirectory() || C16880lQ.LLLZZIL(file) || !C65210PiY.LIZ()) {
            return;
        }
        C65210PiY.LIZIZ(LIZ, "deleteDirIfEmpty", "Delete Failed");
    }

    public static long LJIIIIZZ(String str) {
        try {
            return new StatFs(str).getAvailableBytes();
        } catch (IllegalArgumentException e) {
            throw new BaseException(1050, e);
        } catch (Throwable th) {
            throw new BaseException(1052, th);
        }
    }

    public static long LJIIIZ(X5J x5j) {
        long j = -1;
        if (x5j == null) {
            return -1L;
        }
        String LJIILJJIL = LJIILJJIL(x5j, "Content-Length");
        if (TextUtils.isEmpty(LJIILJJIL)) {
            String LJIILJJIL2 = LJIILJJIL(x5j, "Content-Range");
            if (TextUtils.isEmpty(LJIILJJIL2)) {
                return -1L;
            }
            try {
                Matcher matcher = PatternProtector.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(LJIILJJIL2);
                if (!matcher.find()) {
                    return -1L;
                }
                j = (CastLongProtector.parseLong(matcher.group(2)) - CastLongProtector.parseLong(matcher.group(1))) + 1;
                return j;
            } catch (Exception e) {
                String str = LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Exception:");
                LIZ2.append(e);
                C65210PiY.LIZJ(str, "parseContentLengthFromContentRange", X1D.LIZIZ(LIZ2));
                return j;
            }
        }
        try {
            j = CastLongProtector.parseLong(LJIILJJIL);
            return j;
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static String LJIIJ(Context context) {
        BufferedReader bufferedReader;
        String str = LIZLLL;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (C65210PiY.LIZ()) {
                            String str2 = LIZ;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("ProcessName: ");
                            LIZ2.append(runningAppProcessInfo.processName);
                            C65210PiY.LIZIZ(str2, "getCurProcessName", X1D.LIZIZ(LIZ2));
                        }
                        String str3 = runningAppProcessInfo.processName;
                        LIZLLL = str3;
                        return str3;
                    }
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        String str4 = null;
        try {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("/proc/");
            LIZ3.append(Process.myPid());
            LIZ3.append("/cmdline");
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ3)), "iso-8859-1"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read <= 0) {
                    break;
                }
                sb.append((char) read);
            }
            str4 = sb.toString();
            LJJIIJ(bufferedReader);
        } catch (Throwable unused2) {
            LJJIIJ(bufferedReader);
            LIZLLL = str4;
            return str4;
        }
        LIZLLL = str4;
        return str4;
    }

    public static String LJIIJJI(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(C16880lQ.LLLZ("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static String LJIILIIL(int i) {
        String LIZIZ2 = C0NY.LIZIZ("ttmd5 check code = ", i, ", ");
        if (i != 99) {
            switch (i) {
                case 0:
                    return i0.LJFF(LIZIZ2, "md5 match");
                case 1:
                    return i0.LJFF(LIZIZ2, "md5 not match");
                case 2:
                    return i0.LJFF(LIZIZ2, "md5 empty");
                case 3:
                    return i0.LJFF(LIZIZ2, "ttmd5 version not support");
                case 4:
                    return i0.LJFF(LIZIZ2, "ttmd5 tag parser error");
                case 5:
                    return i0.LJFF(LIZIZ2, "file not exist");
                case 6:
                    return i0.LJFF(LIZIZ2, "get file md5 error");
                default:
                    return LIZIZ2;
            }
        }
        return i0.LJFF(LIZIZ2, "unknown error");
    }

    public static String LJIILLIIL(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            return th.toString();
        } catch (Throwable unused) {
            return "throwable getMsg error";
        }
    }

    public static boolean LJIIZILJ(List<HttpHeader> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (HttpHeader httpHeader : list) {
            if (httpHeader != null && !TextUtils.isEmpty(httpHeader.name) && !TextUtils.isEmpty(httpHeader.value) && "download-tc21-1-15".equals(httpHeader.name) && "download-tc21-1-15".equals(httpHeader.value)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIJJ(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            int errorCode = baseException.getErrorCode();
            if (errorCode == 1006) {
                return true;
            }
            if (errorCode != 1023 && errorCode != 1039 && errorCode != 1040 && errorCode != 1054 && errorCode != 1064) {
                return false;
            }
            String message = baseException.getMessage();
            if (TextUtils.isEmpty(message) || !message.contains("ENOSPC")) {
                return false;
            }
            return true;
        }
        if (!(th instanceof IOException)) {
            return false;
        }
        String LJIILLIIL = LJIILLIIL(th);
        if (TextUtils.isEmpty(LJIILLIIL) || !LJIILLIIL.contains("ENOSPC")) {
            return false;
        }
        return true;
    }

    public static boolean LJIL(Context context) {
        try {
            ConnectivityManager connectivityManager = LIZJ;
            if (connectivityManager == null) {
                connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
                LIZJ = connectivityManager;
            }
            NetworkInfo LJJLI = C16880lQ.LJJLI(connectivityManager);
            if (LJJLI == null) {
                return false;
            }
            return LJJLI.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean LJJ(Throwable th) {
        if (th == null || !(th instanceof BaseException)) {
            return false;
        }
        int errorCode = ((BaseException) th).getErrorCode();
        if (errorCode >= 2000) {
            if (errorCode < 3000) {
                return true;
            }
        } else if (errorCode == 1075 || errorCode == 1078 || errorCode == 1079 || errorCode == 1055 || errorCode == 1023 || errorCode == 1041 || errorCode == 1022 || errorCode == 1048 || errorCode == 1056 || errorCode == 1057 || errorCode == 1058 || errorCode == 1059 || errorCode == 1060 || errorCode == 1061 || errorCode == 1067 || errorCode == 1049 || errorCode == 1047 || errorCode == 1051 || errorCode == 1004 || errorCode == 1011 || errorCode == 1002 || errorCode == 1013) {
            return true;
        }
        return false;
    }

    public static boolean LJJI(Context context) {
        try {
            ConnectivityManager connectivityManager = LIZJ;
            if (connectivityManager == null) {
                connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
                LIZJ = connectivityManager;
            }
            NetworkInfo LJJLI = C16880lQ.LJJLI(connectivityManager);
            if (LJJLI != null && LJJLI.isAvailable()) {
                if (1 == LJJLI.getType()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String LJJIFFI(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return LJJIIJZLJL(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void LJJIII(Cursor... cursorArr) {
        for (Cursor cursor : cursorArr) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void LJJIIJ(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String LJJIIJZLJL(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= bArr.length) {
                int i = length * 2;
                char[] cArr = new char[i];
                int i2 = 0;
                for (byte b : bArr) {
                    int i3 = b & 255;
                    int i4 = i2 + 1;
                    char[] cArr2 = LIZIZ;
                    cArr[i2] = cArr2[i3 >> 4];
                    i2 = i4 + 1;
                    cArr[i4] = cArr2[i3 & 15];
                }
                return new String(cArr, 0, i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    public static boolean LIZ(DownloadInfo downloadInfo, boolean z) {
        boolean z2 = false;
        if (!downloadInfo.isDeleteCacheIfCheckFailed() && TextUtils.isEmpty(downloadInfo.getLastModified())) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(downloadInfo.getId(), LIZ, "cacheExpiredWithHttp", "Modify is empty, so just return cache");
            }
        } else {
            if (C65210PiY.LIZ()) {
                String str = LIZ;
                int id = downloadInfo.getId();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Curt=");
                LIZ2.append(System.currentTimeMillis());
                LIZ2.append(" expired=");
                LIZ2.append(downloadInfo.getCacheExpiredTime());
                C65210PiY.LIZLLL(id, str, "cacheExpiredWithHttp", X1D.LIZIZ(LIZ2));
            }
            if (System.currentTimeMillis() > downloadInfo.getCacheExpiredTime() || z) {
                z2 = true;
            }
        }
        if (C65210PiY.LIZ()) {
            String str2 = LIZ;
            int id2 = downloadInfo.getId();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Name=");
            LIZ3.append(downloadInfo.getName());
            LIZ3.append(" expired=");
            LIZ3.append(z2);
            C65210PiY.LIZLLL(id2, str2, "cacheExpiredWithHttp", X1D.LIZIZ(LIZ3));
        }
        return z2;
    }

    public static int LIZIZ(C84238X4g c84238X4g, String str) {
        if (c84238X4g.LIZ.LIZ() == 1) {
            return PN5.LIZIZ(str, c84238X4g.LIZLLL(), null);
        }
        try {
            return PN5.LIZIZ(str, c84238X4g.LIZLLL(), new PN6(c84238X4g.LJFF()));
        } catch (Throwable unused) {
            return 5;
        }
    }

    public static void LJ(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo == null) {
            return;
        }
        if (downloadInfo.isForce() && !C84246X4o.LIZIZ(downloadInfo.getSavePath())) {
            z = false;
        } else if (z) {
            try {
                LJI(downloadInfo.getSavePath(), downloadInfo.getName());
            } catch (Throwable unused) {
                return;
            }
        }
        LJI(downloadInfo.getTempPath(), downloadInfo.getTempName());
        if (downloadInfo.isSavePathRedirected()) {
            LIZJ(downloadInfo);
        }
        if (z) {
            String LJJIFFI = LJJIFFI(downloadInfo.getUrl());
            if (!TextUtils.isEmpty(LJJIFFI) && !TextUtils.isEmpty(downloadInfo.getSavePath()) && downloadInfo.getSavePath().contains(LJJIFFI)) {
                LJFF(downloadInfo.getSavePath());
            }
        }
    }

    public static void LJI(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C84238X4g c84238X4g = new C84238X4g(str, str2, false, true);
            if (c84238X4g.LJIIJ()) {
                if (C65210PiY.LIZ()) {
                    String str3 = LIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Path: ");
                    LIZ2.append(c84238X4g.LJIIIIZZ());
                    C65210PiY.LIZIZ(str3, "deleteFile", X1D.LIZIZ(LIZ2));
                }
                c84238X4g.LJIIL();
            }
        }
    }

    public static String LJII(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String LJJIFFI = LJJIFFI(str2);
            if (!TextUtils.isEmpty(LJJIFFI) && !str.contains(LJJIFFI)) {
                return new File(str, LJJIFFI).getAbsolutePath();
            }
            return str;
        }
        return str;
    }

    public static String LJIIL(String str, Throwable th) {
        if (str == null) {
            return LJIILLIIL(th);
        }
        StringBuilder LIZJ2 = b1.LIZJ(str, "-");
        LIZJ2.append(LJIILLIIL(th));
        return X1D.LIZIZ(LIZJ2);
    }

    public static String LJIILJJIL(X5J x5j, String str) {
        if (x5j == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String LIZIZ2 = x5j.LIZIZ(str);
        if (!X4H.LJFF.LJI("fix_get_http_resp_head_ignore_case", true)) {
            return LIZIZ2;
        }
        if (TextUtils.isEmpty(LIZIZ2)) {
            LIZIZ2 = x5j.LIZIZ(str.toLowerCase());
        }
        if (TextUtils.isEmpty(LIZIZ2)) {
            return x5j.LIZIZ(str.toUpperCase());
        }
        return LIZIZ2;
    }

    public static String LJIILL(String str, String str2) {
        boolean z;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        boolean z2 = false;
        if (C84236X4e.LJ(str) > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                C84236X4e.LIZ(UriProtector.parse(str), C84236X4e.LJ(str));
                z2 = true;
            } catch (Throwable unused) {
            }
            if (!z2) {
                return null;
            }
        }
        return new C84238X4g(str, str2, true, true).getPath();
    }

    public static boolean LJIJI(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (C84236X4e.LJ(str) > 1) {
            try {
                C84236X4e.LIZ(UriProtector.parse(str), C84236X4e.LJ(str));
            } catch (Throwable unused) {
                return false;
            }
        }
        return new C84238X4g(str, str2, true, true).LJIIJ();
    }

    public static String LJJII(InputStream inputStream, int i) {
        BufferedReader bufferedReader;
        String readLine;
        StringBuilder sb = new StringBuilder();
        if (inputStream == null || i <= 0) {
            LJJIIJ(inputStream);
            return sb.toString();
        }
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        } catch (Throwable unused) {
        }
        do {
            try {
                readLine = bufferedReader.readLine();
            } catch (Throwable unused2) {
                bufferedReader2 = bufferedReader;
                LJJIIJ(bufferedReader2);
                LJJIIJ(inputStream);
                return sb.toString();
            }
            if (readLine != null) {
                sb.append(readLine);
            } else {
                LJJIIJ(bufferedReader);
                LJJIIJ(inputStream);
                return sb.toString();
            }
        } while (sb.length() <= i);
        String substring = sb.substring(0, i);
        LJJIIJ(bufferedReader);
        LJJIIJ(inputStream);
        return substring;
    }

    public static boolean LJIJ(DownloadInfo downloadInfo, boolean z, String str) {
        if (!z && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            try {
                C84238X4g c84238X4g = new C84238X4g(downloadInfo.getSavePath(), downloadInfo.getName(), true, true);
                if (c84238X4g.LJIIJ() && c84238X4g.length() > 0 && (downloadInfo.getTotalBytes() <= 0 || c84238X4g.length() >= downloadInfo.getTotalBytes())) {
                    int LIZIZ2 = LIZIZ(c84238X4g, str);
                    if (LIZIZ2 == 0 || LIZIZ2 == 2) {
                        return true;
                    }
                }
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
