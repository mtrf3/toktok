package com.google.android.play.core.assetpacks;

import X.C36662EaA;
import android.util.Base64;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class l1 {
    public static j0 LIZ;

    public static String LIZ(List<File> list) {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream(it.next());
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        C36662EaA.LIZ(th, th2);
                    }
                    throw th;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static int LIZIZ(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static boolean LIZJ(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    public static boolean LIZLLL(int i, int i2) {
        if (i == 5) {
            return i2 != 5;
        }
        if (i == 6) {
            return (i2 == 6 || i2 == 5) ? false : true;
        }
        if (i == 4) {
            return i2 != 4;
        }
        if (i == 3) {
            return i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }
}
