package com.ss.android.vesdk.utils;

import X.X1D;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.i0;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* loaded from: classes7.dex */
public class DigestUtils {
    public static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String generateMd5Checkcode(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(System.currentTimeMillis());
        LIZ.append("");
        String md5Hex = md5Hex(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(md5Hex.substring(0, 12));
        LIZ2.append(str);
        String md5Hex2 = md5Hex(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(md5Hex.substring(0, 12));
        LIZ3.append(md5Hex2.substring(12, 32));
        return X1D.LIZIZ(LIZ3);
    }

    public static byte[] hexStringToBytes(String str) {
        if (str != null && str.length() % 2 != 1) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) (Character.digit(charArray[i + 1], 16) + (Character.digit(charArray[i], 16) << 4));
            }
            return bArr;
        }
        throw new IllegalArgumentException(i0.LJFF("hexBinary needs to be even-length: ", str));
    }

    public static String md5Hex(File file) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (messageDigest == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
            while (true) {
                int read = fileInputStream.read(bArr, 0, FileUtils.BUFFER_SIZE);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return toHexString(messageDigest.digest());
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static String toHexString(byte[] bArr) {
        if (bArr != null) {
            return toHexString(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String md5Hex(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return toHexString(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String md5Hex(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(bArr);
                    return toHexString(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean checkInfoByMd5(String str, String str2) {
        if (str2.equals("")) {
            return false;
        }
        String substring = str2.substring(0, 12);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(substring);
        LIZ.append(str);
        String md5Hex = md5Hex(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str2.substring(0, 12));
        LIZ2.append(md5Hex.substring(12, 32));
        return X1D.LIZIZ(LIZ2).equals(str2);
    }

    public static String md5Hex(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 > 0) {
            try {
                if (i + i2 <= bArr.length) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(bArr, i, i2);
                    return toHexString(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String toHexString(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i + i2 <= bArr.length) {
                int i3 = i2 * 2;
                char[] cArr = new char[i3];
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = bArr[i5 + i] & 255;
                    int i7 = i4 + 1;
                    char[] cArr2 = HEX_CHARS;
                    cArr[i4] = cArr2[i6 >> 4];
                    i4 = i7 + 1;
                    cArr[i7] = cArr2[i6 & 15];
                }
                return new String(cArr, 0, i3);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
