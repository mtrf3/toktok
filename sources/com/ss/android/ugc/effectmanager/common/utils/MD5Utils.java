package com.ss.android.ugc.effectmanager.common.utils;

import X.C16880lQ;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes7.dex */
public class MD5Utils {
    public static char[] sHexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String byteArrayToHex(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public static String getFileMD5(File file) {
        return getFileMD5(file, null);
    }

    public static String getMD5String(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(sHexDigits[(b & 240) >> 4]);
                stringBuffer.append(sHexDigits[b & 15]);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static String getMD5String16Bit(String str) {
        String mD5String = getMD5String(str);
        if (!TextUtils.isEmpty(mD5String)) {
            return mD5String.substring(8, 24);
        }
        return null;
    }

    public static String getMD5String(String str) {
        if (str == null) {
            return null;
        }
        return getMD5String(str.getBytes());
    }

    public static String getFileMD5(File file, MonitorTrace monitorTrace) {
        if (!file.isFile()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MD5Utils#getFileMD5: failed, filePath = ");
            LIZ.append(file.getAbsolutePath());
            LIZ.append(", is not a file");
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ));
            return "";
        }
        EPMonitor.traceStep(monitorTrace, "MD5Utils#getFileMD5: begin parse digest");
        byte[] bArr = new byte[1024];
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                while (true) {
                    try {
                        int read = bufferedInputStream2.read(bArr, 0, 1024);
                        if (read == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                    } catch (Exception e) {
                        e = e;
                        bufferedInputStream = bufferedInputStream2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("MD5Utils#getFileMD5: exception occurred, cause = ");
                        LIZ2.append(e.getMessage());
                        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ2));
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                EPMonitor.traceStep(monitorTrace, "MD5Utils#getFileMD5: digest update success");
                String byteArrayToHex = byteArrayToHex(messageDigest.digest());
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("MD5Utils#getFileMD5: md5 result = ");
                LIZ3.append(byteArrayToHex);
                EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ3));
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused3) {
                }
                return byteArrayToHex;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
