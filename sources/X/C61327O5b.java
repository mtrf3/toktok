package X;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.O5b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61327O5b {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String LIZIZ(InputStream inputStream) {
        byte[] bArr = new byte[16384];
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        byte[] digest = messageDigest.digest();
                        return LJFF(digest, digest.length);
                    }
                }
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getHash error: ");
                LIZ2.append(e.getMessage());
                throw new RuntimeException(X1D.LIZIZ(LIZ2));
            }
        } finally {
            C78609UtB.LJJIIZI(inputStream);
        }
    }

    public static String LIZJ(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                String LIZIZ = LIZIZ(fileInputStream);
                C78609UtB.LJJIIZI(fileInputStream);
                return LIZIZ;
            } catch (Throwable th) {
                th = th;
                C78609UtB.LJJIIZI(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static String LIZLLL(List<String> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
        }
        String LJ = LJ(sb.toString());
        OC6.LIZ("gecko-debug-tag", "accessKey to MD5", sb.toString(), LJ);
        return LJ;
    }

    public static String LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        return LJFF(digest, digest.length);
    }

    public static void LIZ(OEG oeg, String str) {
        if (str != null) {
            String LIZIZ = LIZIZ(oeg);
            if (LIZIZ.equals(str)) {
                return;
            } else {
                throw new RuntimeException(C0ON.LIZJ("md5 check failed file: local md5:", LIZIZ, " expect md5:", str));
            }
        }
        throw new RuntimeException("md5 check failed: md5 == null");
    }

    public static String LJFF(byte[] bArr, int i) {
        if (i <= bArr.length) {
            int i2 = i * 2;
            char[] cArr = new char[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4] & 255;
                int i6 = i3 + 1;
                char[] cArr2 = LIZ;
                cArr[i3] = cArr2[i5 >> 4];
                i3 = i6 + 1;
                cArr[i6] = cArr2[i5 & 15];
            }
            return new String(cArr, 0, i2);
        }
        throw new IndexOutOfBoundsException();
    }
}
