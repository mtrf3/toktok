package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.Hbu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44414Hbu {
    public static String LIZ(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream LJIIZILJ = C44694HgQ.LJIIZILJ(0, str);
            if (LJIIZILJ == null) {
                return null;
            }
            byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
            int i = 0;
            while (true) {
                try {
                    try {
                        int read = LJIIZILJ.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        i += read;
                        int i2 = i - 524288;
                        if (i2 < 0) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            messageDigest.update(bArr, 0, read - i2);
                            break;
                        }
                    } finally {
                        try {
                            LJIIZILJ.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException e) {
                    C60903NvH.LJIIJJI().LJJIIZI().LIZ(e);
                    try {
                        LJIIZILJ.close();
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            return C16880lQ.LLLZ("%32s", new Object[]{new BigInteger(1, messageDigest.digest()).toString(16)}).replace(' ', '0');
        } catch (NoSuchAlgorithmException unused3) {
            return null;
        }
    }
}
