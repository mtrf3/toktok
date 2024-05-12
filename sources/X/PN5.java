package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;

/* loaded from: classes12.dex */
public final class PN5 {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static long LIZJ(String str) {
        return (CastLongProtector.parseLong(str, 16) - 31) >> 4;
    }

    public static PN7 LIZLLL(String str) {
        if (!str.startsWith("ttmd5:")) {
            return null;
        }
        String[] split = str.split(";");
        String[] split2 = split[0].split(":");
        PN7 pn7 = new PN7();
        int parseInt = CastIntegerProtector.parseInt(split2[1]);
        pn7.LIZ = parseInt;
        if (parseInt > 1) {
            return pn7;
        }
        pn7.LIZIZ = CastIntegerProtector.parseInt(split2[2]);
        String[] split3 = split2[3].split("g");
        pn7.LIZJ = (int) LIZJ(split3[0]);
        pn7.LIZLLL = LIZJ(split3[1]);
        pn7.LJ = split[1];
        return pn7;
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00df: INVOKE (r15 I:X.PN8) INTERFACE call: X.PN8.close():void A[Catch: all -> 0x00e2, MD:():void (m), TRY_ENTER, TRY_LEAVE] (LINE:50331871), block:B:46:0x00df */
    public static String LIZ(PN8 pn8, int i, long j) {
        PN8 close;
        long j2 = j;
        int i2 = i;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        if (messageDigest == null) {
            return "";
        }
        try {
            long length = pn8.length();
            if (i2 <= 0 || j2 <= 0 || i2 * j2 > (8 * length) / 10) {
                j2 = length;
                i2 = 1;
            }
            byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
            long j3 = 0;
            LJ(pn8, messageDigest, bArr, 0L, j2);
            if (i2 > 2) {
                int i3 = i2 - 1;
                long j4 = (length - (i2 * j2)) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    j3 += j2 + j4;
                    LJ(pn8, messageDigest, bArr, j3, j2);
                }
            }
            if (i2 > 1) {
                LJ(pn8, messageDigest, bArr, length - j2, j2);
            }
            byte[] digest = messageDigest.digest();
            if (digest != null) {
                int length2 = digest.length * 2;
                char[] cArr = new char[length2];
                int i5 = 0;
                for (byte b : digest) {
                    int i6 = b & 255;
                    int i7 = i5 + 1;
                    char[] cArr2 = LIZ;
                    cArr[i5] = cArr2[i6 >> 4];
                    i5 = i7 + 1;
                    cArr[i7] = cArr2[i6 & 15];
                }
                String str = new String(cArr, 0, length2);
                if (i2 == 1 && j2 == length) {
                    try {
                        pn8.close();
                    } catch (Throwable unused) {
                    }
                    return str;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ttmd5:1:1:");
                LIZ3.append(Long.toHexString((i2 << 4) + 31));
                LIZ3.append("g");
                LIZ3.append(Long.toHexString((j2 << 4) + 31));
                LIZ2.append(X1D.LIZIZ(LIZ3));
                LIZ2.append(";");
                LIZ2.append(str);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                try {
                    pn8.close();
                } catch (Throwable unused2) {
                }
                return LIZIZ;
            }
            throw new NullPointerException("bytes is null");
        } catch (Throwable th) {
            try {
                close.close();
            } catch (Throwable unused3) {
            }
            throw th;
        }
    }

    public static int LIZIZ(String str, File file, PN6 pn6) {
        int i;
        long j;
        String LIZ2;
        if (str == null || str.length() == 0) {
            return 2;
        }
        try {
            if (pn6 != null) {
                if (pn6.length() <= 0) {
                    try {
                        pn6.close();
                    } catch (Throwable unused) {
                    }
                    return 5;
                }
            } else {
                if (file != null) {
                    if (!file.exists()) {
                    }
                }
                return 5;
            }
            try {
                PN7 LIZLLL = LIZLLL(str);
                if (LIZLLL != null) {
                    if (LIZLLL.LIZ > 1) {
                        return 3;
                    }
                    i = LIZLLL.LIZJ;
                    j = LIZLLL.LIZLLL;
                } else {
                    i = -1;
                    j = -1;
                }
                PN7 pn7 = null;
                try {
                    if (pn6 != null) {
                        LIZ2 = LIZ(pn6, i, j);
                    } else {
                        LIZ2 = LIZ(new C64334PMs(file), i, j);
                    }
                    if (LIZ2 != null && LIZ2.length() != 0) {
                        if (LIZLLL == null || (LIZLLL.LIZ == 1 && LIZLLL.LIZIZ == 1)) {
                            if (LIZ2.equals(str)) {
                                return 0;
                            }
                        } else if (LIZLLL.LJ != null) {
                            try {
                                pn7 = LIZLLL(LIZ2);
                            } catch (Throwable unused2) {
                            }
                            if (pn7 != null && LIZLLL.LIZJ == pn7.LIZJ && LIZLLL.LIZLLL == pn7.LIZLLL && LIZLLL.LJ.equals(pn7.LJ)) {
                                return 0;
                            }
                        }
                        return 1;
                    }
                    return 6;
                } catch (Throwable unused3) {
                    return 6;
                }
            } catch (Throwable unused4) {
                return 4;
            }
        } catch (Throwable unused5) {
            return 99;
        }
    }

    public static void LJ(PN8 pn8, MessageDigest messageDigest, byte[] bArr, long j, long j2) {
        pn8.seek(j);
        long j3 = 0;
        while (j3 < j2) {
            int LIZ2 = pn8.LIZ(bArr, (int) Math.min(j2 - j3, bArr.length));
            if (LIZ2 > 0) {
                messageDigest.update(bArr, 0, LIZ2);
                j3 += LIZ2;
            } else {
                StringBuilder LIZLLL = C1FJ.LIZLLL("updateSample unexpected readCount <= 0, readCount = ", LIZ2, ", readTotalCount = ", j3);
                throw new IOException(C132805Jc.LIZLLL(LIZLLL, ", sampleSize = ", j2, LIZLLL));
            }
        }
    }
}
