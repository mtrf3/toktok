package com.bytedance.bmf_mods.common;

import X.C16880lQ;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes34.dex */
public class BmfUtils {
    public static String fileMd5(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
                        fileInputStream.close();
                        return bigInteger;
                    }
                }
            } finally {
            }
        } catch (IOException | NoSuchAlgorithmException e) {
            C16880lQ.LLLLIIL(e);
            return "";
        }
    }
}
