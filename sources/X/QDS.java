package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes12.dex */
public final class QDS {
    public static final List<String> LIZIZ = Collections.singletonList("EncryptUtils");
    public static final String[] LIZJ = {"aid", "app_version", "tt_data", "device_id"};
    public static final String[] LIZLLL = {"aid", "version_code", "ab_version", "iid", "device_platform", "device_id"};
    public static final String[] LJ = {"tt_data", "device_platform"};
    public final QI3 LIZ;

    public QDS(QI3 qi3) {
        this.LIZ = qi3;
    }

    public static byte[] LIZLLL(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    try {
                        QIX.LJIJJ().LJIILL(LIZIZ, "gzip write failed", th, new Object[0]);
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        return byteArrayOutputStream.toByteArray();
                    } catch (Throwable th2) {
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        if (r4 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] LJ(byte[] r6) {
        /*
            int r0 = r6.length
            r1 = 0
            if (r0 > 0) goto L5
            return r1
        L5:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L3b
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L3b
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L3c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L3c
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
        L18:
            int r1 = r3.read(r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            if (r1 < 0) goto L23
            r0 = 0
            r5.write(r2, r0, r1)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            goto L18
        L23:
            r3.close()     // Catch: java.io.IOException -> L43
            goto L43
        L27:
            r0 = move-exception
            r1 = r3
            goto L30
        L2a:
            r1 = r3
            goto L3c
        L2c:
            r0 = move-exception
            r4 = r1
            goto L30
        L2f:
            r0 = move-exception
        L30:
            if (r1 == 0) goto L35
            r1.close()     // Catch: java.io.IOException -> L35
        L35:
            if (r4 == 0) goto L3a
            r4.close()     // Catch: java.io.IOException -> L3a
        L3a:
            throw r0
        L3b:
            r4 = r1
        L3c:
            if (r1 == 0) goto L41
            r1.close()     // Catch: java.io.IOException -> L41
        L41:
            if (r4 == 0) goto L46
        L43:
            r4.close()     // Catch: java.io.IOException -> L46
        L46:
            byte[] r0 = r5.toByteArray()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDS.LJ(byte[]):byte[]");
    }

    public static boolean LJFF(String[] strArr) {
        if (strArr == null || strArr.length != 2 || TextUtils.isEmpty(strArr[0]) || strArr[0].length() != 32 || TextUtils.isEmpty(strArr[1]) || strArr[1].length() != 16) {
            return false;
        }
        return true;
    }

    public final byte[] LIZIZ(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        if (this.LIZ.LJIJI) {
            if (this.LIZ.LJ() != null) {
                this.LIZ.LJ().getClass();
            }
            bArr = EncryptorUtil.LIZ(bArr.length, bArr);
            if (bArr == null) {
                this.LIZ.LIZLLL.LJ(QIQ.pack, QIK.f_to_bytes_encrypt);
            }
        }
        return bArr;
    }

    public final String LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!this.LIZ.LJIJI) {
            return str;
        }
        android.net.Uri parse = UriProtector.parse(str);
        String query = parse.getQuery();
        ArrayList arrayList = new ArrayList();
        for (String str2 : LIZJ) {
            String queryParameter = UriProtector.getQueryParameter(parse, str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                arrayList.add(new Pair(str2, queryParameter));
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            buildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        buildUpon.appendQueryParameter("tt_info", new String(Base64.encode(LJI(query), 8)));
        return buildUpon.build().toString();
    }

    public final byte[] LJI(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            this.LIZ.LJJIZ.LJIILL(LIZIZ, "get bytes failed", e, new Object[0]);
            bArr = null;
        }
        if (this.LIZ.LJIJI) {
            bArr = LIZLLL(bArr);
        }
        return LIZIZ(bArr);
    }

    public static byte[] LIZ(byte[] bArr, String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            int length = str.length();
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr2[i] = (byte) str.charAt(i);
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            int length2 = str2.length();
            byte[] bArr3 = new byte[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                bArr3[i2] = (byte) str2.charAt(i2);
            }
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            QIX.LJIJJ().LJIILL(LIZIZ, "Cannot decrypt aes cbc", th, new Object[0]);
            return null;
        }
    }
}
