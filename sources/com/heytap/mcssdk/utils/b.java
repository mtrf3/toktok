package com.heytap.mcssdk.utils;

import X.X1D;
import android.text.TextUtils;
import com.heytap.msp.push.encrypt.AESEncrypt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes28.dex */
public class b {
    public static String a = null;
    public static String c = "";

    public static String a() {
        if (TextUtils.isEmpty(c)) {
            c = new String(com.heytap.mcssdk.a.a.b("Y29tLm5lYXJtZS5tY3M="));
        }
        byte[] a2 = a(c);
        a(a2);
        return a2 != null ? new String(a2, Charset.forName("UTF-8")) : "";
    }

    public static byte[] a(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static byte[] a(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    public static String b(String str) {
        boolean z;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str2 = c.a(str, a());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sdkDecrypt desDecrypt des data ");
            LIZ.append(str2);
            d.b(X1D.LIZIZ(LIZ));
            z = true;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sdkDecrypt DES excepiton ");
            LIZ2.append(e.toString());
            d.b(X1D.LIZIZ(LIZ2));
            z = false;
        }
        if (TextUtils.isEmpty(str2) ? false : z) {
            return str2;
        }
        try {
            str2 = AESEncrypt.decrypt("isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=", str);
            a = "AES";
            e.f().b(a);
            d.b("sdkDecrypt desDecrypt aes data " + str2);
            return str2;
        } catch (Exception e2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("sdkDecrypt AES excepiton ");
            LIZ3.append(e2.toString());
            d.b(X1D.LIZIZ(LIZ3));
            return str2;
        }
    }

    public static String c(String str) {
        boolean z;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str2 = AESEncrypt.decrypt("isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=", str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sdkDecrypt aesDecrypt aes data ");
            LIZ.append(str2);
            d.b(X1D.LIZIZ(LIZ));
            z = true;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sdkDecrypt AES excepiton ");
            LIZ2.append(e.toString());
            d.b(X1D.LIZIZ(LIZ2));
            z = false;
        }
        if (TextUtils.isEmpty(str2) ? false : z) {
            return str2;
        }
        try {
            str2 = c.a(str, a());
            a = "DES";
            e.f().b(a);
            d.b("sdkDecrypt aesDecrypt des data " + str2);
            return str2;
        } catch (Exception e2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("sdkDecrypt DES excepiton ");
            LIZ3.append(e2.toString());
            d.b(X1D.LIZIZ(LIZ3));
            return str2;
        }
    }

    public static String d(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sdkDecrypt start data ");
        LIZ.append(str);
        d.b(X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(a)) {
            a = e.f().e();
        }
        if ("DES".equals(a)) {
            d.b("sdkDecrypt start DES");
            return b(str);
        }
        d.b("sdkDecrypt start AES");
        return c(str);
    }
}
