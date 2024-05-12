package okhttp3.internal.publicsuffix;

import X.C16880lQ;
import X.C64532PUi;
import X.P9A;
import X.PU7;
import X.PUL;
import X.PVA;
import X.X1D;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class PublicSuffixDatabase {
    public byte[] publicSuffixExceptionListBytes;
    public byte[] publicSuffixListBytes;
    public static final byte[] WILDCARD_LABEL = {42};
    public static final String[] EMPTY_RULE = new String[0];
    public static final String[] PREVAILING_RULE = {"*"};
    public static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    public final AtomicBoolean listRead = new AtomicBoolean(false);
    public final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static String okhttp3_internal_publicsuffix_PublicSuffixDatabase_com_ss_android_ugc_aweme_lancet_CookieManagerLancet_getEffectiveTldPlusOne(PublicSuffixDatabase publicSuffixDatabase, String str) {
        return "";
    }

    private void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    P9A.LIZ.LJIIJJI(5, "Failed to read public suffix list", e);
                    if (z) {
                        C16880lQ.LLLLIIIILLL().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            C16880lQ.LLLLIIIILLL().interrupt();
        }
    }

    public String getEffectiveTldPlusOne(String str) {
        return okhttp3_internal_publicsuffix_PublicSuffixDatabase_com_ss_android_ugc_aweme_lancet_CookieManagerLancet_getEffectiveTldPlusOne(this, str);
    }

    private void readTheList() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        C64532PUi LIZ = PU7.LIZ(new PUL(PU7.LJII(resourceAsStream)));
        try {
            byte[] bArr = new byte[LIZ.readInt()];
            LIZ.readFully(bArr);
            byte[] bArr2 = new byte[LIZ.readInt()];
            LIZ.readFully(bArr2);
            synchronized (this) {
                this.publicSuffixListBytes = bArr;
                this.publicSuffixExceptionListBytes = bArr2;
            }
            this.readCompleteLatch.countDown();
        } finally {
            PVA.LJ(LIZ);
        }
    }

    public static PublicSuffixDatabase get() {
        return instance;
    }

    private String[] findMatchingRule(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                C16880lQ.LLLLIIIILLL().interrupt();
            }
        }
        synchronized (this) {
            if (this.publicSuffixListBytes == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(PVA.LJIIIIZZ);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 < length) {
                str2 = binarySearchBytes(this.publicSuffixListBytes, bArr, i3);
                if (str2 != null) {
                    break;
                }
                i3++;
            } else {
                str2 = null;
                break;
            }
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = WILDCARD_LABEL;
                str3 = binarySearchBytes(this.publicSuffixListBytes, bArr2, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String binarySearchBytes = binarySearchBytes(this.publicSuffixExceptionListBytes, bArr, i);
                if (binarySearchBytes != null) {
                    str = binarySearchBytes;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("!");
            LIZ.append(str);
            return X1D.LIZIZ(LIZ).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        if (str2 != null) {
            strArr2 = str2.split("\\.");
        } else {
            strArr2 = EMPTY_RULE;
        }
        if (str3 != null) {
            strArr3 = str3.split("\\.");
        } else {
            strArr3 = EMPTY_RULE;
        }
        if (strArr2.length > strArr3.length) {
            return strArr2;
        }
        return strArr3;
    }

    public String okhttp3_internal_publicsuffix_PublicSuffixDatabase__getEffectiveTldPlusOne$___twin___(String str) {
        int length;
        int length2;
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] findMatchingRule = findMatchingRule(split);
            if (split.length == findMatchingRule.length && findMatchingRule[0].charAt(0) != '!') {
                return null;
            }
            if (findMatchingRule[0].charAt(0) == '!') {
                length = split.length;
                length2 = findMatchingRule.length;
            } else {
                length = split.length;
                length2 = findMatchingRule.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split("\\.");
            for (int i = length - length2; i < split2.length; i++) {
                sb.append(split2[i]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }

    public void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    public static String binarySearchBytes(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = (i3 + length) / 2;
            while (i4 > -1 && bArr[i4] != 10) {
                i4--;
            }
            int i5 = i4 + 1;
            int i6 = 1;
            while (true) {
                i2 = i5 + i6;
                if (bArr[i2] == 10) {
                    break;
                }
                i6++;
            }
            int i7 = i2 - i5;
            int i8 = i;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = bArr2[i8][i9] & 255;
                while (true) {
                    int i12 = i11 - (bArr[i5 + i10] & 255);
                    if (i12 != 0) {
                        if (i12 >= 0) {
                            if (i12 > 0) {
                            }
                        }
                    } else {
                        i10++;
                        i9++;
                        if (i10 == i7) {
                            break;
                        }
                        if (bArr2[i8].length == i9) {
                            if (i8 == bArr2.length - 1) {
                                break;
                            }
                            i8++;
                            i9 = -1;
                            i11 = 46;
                        }
                    }
                }
            }
            int i13 = i7 - i10;
            int length2 = bArr2[i8].length - i9;
            while (true) {
                i8++;
                if (i8 >= bArr2.length) {
                    break;
                }
                length2 += bArr2[i8].length;
            }
            if (length2 < i13) {
                length = i5 - 1;
            } else {
                if (length2 <= i13) {
                    return new String(bArr, i5, i7, PVA.LJIIIIZZ);
                }
                i3 = i2 + 1;
            }
        }
        return null;
    }
}
