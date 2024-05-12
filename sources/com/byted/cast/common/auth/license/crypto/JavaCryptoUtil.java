package com.byted.cast.common.auth.license.crypto;

import X.C16880lQ;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes29.dex */
public class JavaCryptoUtil {
    public static final int DEFAULT = 0;

    /* loaded from: classes29.dex */
    public static abstract class Coder {
        public int op;
        public byte[] output;

        public abstract int maxOutputSize(int i);

        public abstract boolean process(byte[] bArr, int i, int i2, boolean z);
    }

    /* loaded from: classes29.dex */
    public static class Decoder extends Coder {
        public static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public final int[] alphabet;
        public int state;
        public int value;

        @Override // com.byted.cast.common.auth.license.crypto.JavaCryptoUtil.Coder
        public int maxOutputSize(int i) {
            return ((i * 3) / 4) + 10;
        }

        public Decoder(int i, byte[] bArr) {
            int[] iArr;
            this.output = bArr;
            if ((i & 8) == 0) {
                iArr = DECODE;
            } else {
                iArr = DECODE_WEBSAFE;
            }
            this.alphabet = iArr;
            this.state = 0;
            this.value = 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00f0, code lost:
        
            if (r10 != 4) goto L65;
         */
        @Override // com.byted.cast.common.auth.license.crypto.JavaCryptoUtil.Coder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean process(byte[] r16, int r17, int r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.common.auth.license.crypto.JavaCryptoUtil.Decoder.process(byte[], int, int, boolean):boolean");
        }
    }

    /* loaded from: classes29.dex */
    public static class Encoder extends Coder {
        public static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        public static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public final byte[] alphabet;
        public int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        public final byte[] tail;
        public int tailLen;

        @Override // com.byted.cast.common.auth.license.crypto.JavaCryptoUtil.Coder
        public int maxOutputSize(int i) {
            return ((i * 8) / 5) + 10;
        }

        public Encoder(int i, byte[] bArr) {
            boolean z;
            boolean z2;
            byte[] bArr2;
            int i2;
            this.output = bArr;
            if ((i & 1) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.do_padding = z;
            if ((i & 2) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.do_newline = z2;
            this.do_cr = (i & 4) != 0;
            if ((i & 8) == 0) {
                bArr2 = ENCODE;
            } else {
                bArr2 = ENCODE_WEBSAFE;
            }
            this.alphabet = bArr2;
            this.tail = new byte[2];
            this.tailLen = 0;
            if (z2) {
                i2 = 19;
            } else {
                i2 = -1;
            }
            this.count = i2;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e9 A[SYNTHETIC] */
        @Override // com.byted.cast.common.auth.license.crypto.JavaCryptoUtil.Coder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.common.auth.license.crypto.JavaCryptoUtil.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] base64Decode(String str) {
        try {
            return decode(str.trim().getBytes());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String base64Encode(byte[] bArr) {
        try {
            return new String(encode(bArr), Charset.forName("US-ASCII")).trim();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] decode(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            int length = bArr.length;
            Decoder decoder = new Decoder(0, new byte[(length * 3) / 4]);
            if (decoder.process(bArr, 0, length, true)) {
                int i = decoder.op;
                byte[] bArr2 = decoder.output;
                if (i == bArr2.length) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(bArr2, 0, bArr3, 0, i);
                return bArr3;
            }
            throw new IllegalArgumentException("bad base-64");
        }
        throw new IllegalArgumentException("data is null");
    }

    public static byte[] encode(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            int length = bArr.length;
            Encoder encoder = new Encoder(0, null);
            int i = (length / 3) * 4;
            int i2 = 2;
            if (encoder.do_padding) {
                if (length % 3 > 0) {
                    i += 4;
                }
            } else {
                int i3 = length % 3;
                if (i3 != 1) {
                    if (i3 == 2) {
                        i += 3;
                    }
                } else {
                    i += 2;
                }
            }
            if (encoder.do_newline) {
                int i4 = ((length - 1) / 57) + 1;
                if (!encoder.do_cr) {
                    i2 = 1;
                }
                i += i4 * i2;
            }
            encoder.output = new byte[i];
            encoder.process(bArr, 0, length, true);
            return encoder.output;
        }
        throw new IllegalArgumentException("data is null");
    }

    public static RSAPrivateKey generatePrivateKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] base64Decode = base64Decode(ignoreIdentifier(str));
            if (base64Decode != null && base64Decode.length != 0) {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                try {
                    return (RSAPrivateKey) keyFactory.generatePrivate(new PKCS8EncodedKeySpec(base64Decode));
                } catch (InvalidKeySpecException unused) {
                    return (RSAPrivateKey) keyFactory.generatePrivate(new X509EncodedKeySpec(base64Decode));
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public static RSAPublicKey generatePublicKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] base64Decode = base64Decode(ignoreIdentifier(str));
            if (base64Decode != null && base64Decode.length != 0) {
                return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(base64Decode));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String ignoreIdentifier(String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("\n")) {
            if (str2.charAt(0) != '-') {
                sb.append(str2);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static String sha256Encode(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(C16880lQ.LLLZ("%02x", new Object[]{Byte.valueOf(b)}));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String rsaDecryptWithPublicKey(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                byte[] base64Decode = base64Decode(str);
                RSAPublicKey generatePublicKey = generatePublicKey(str2);
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(2, generatePublicKey);
                return new String(cipher.doFinal(base64Decode));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String rsaEncryptWithPrivateKey(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                RSAPrivateKey generatePrivateKey = generatePrivateKey(str2);
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(1, generatePrivateKey);
                return base64Encode(cipher.doFinal(str.getBytes()));
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
