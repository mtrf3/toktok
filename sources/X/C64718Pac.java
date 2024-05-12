package X;

import com.bytedance.common.utility.Logger;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* renamed from: X.Pac, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64718Pac {
    public static volatile int LIZ;
    public static volatile int LIZIZ;

    static {
        C16880lQ.LJLLJ(C64718Pac.class);
        LIZ = 0;
        LIZIZ = 0;
    }

    public static void LJ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
                Logger.debug();
            }
        }
    }

    public static boolean LJFF(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf("application/octet-stream")) < 0 || str.indexOf("ssmix=", indexOf + 24) <= 0) {
            return false;
        }
        return true;
    }

    public static void LIZ(int i, byte[] bArr) {
        if (i <= 0) {
            return;
        }
        byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
            i2++;
        } while (i2 < i);
    }

    public static InputStream LIZIZ(InputStream inputStream, java.util.Map<String, List<String>> map, boolean z, C64738Paw c64738Paw) {
        if (z) {
            return new GZIPInputStream(inputStream);
        }
        InterfaceC39219FaJ interfaceC39219FaJ = C64735Pat.LJ;
        if (interfaceC39219FaJ == null) {
            return inputStream;
        }
        return interfaceC39219FaJ.LIZ(inputStream, map, c64738Paw);
    }

    public static byte[] LIZLLL(boolean z, java.util.Map map, InputStream inputStream, int[] iArr, InterfaceC64717Pab interfaceC64717Pab) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] LIZJ = LIZJ(z, map, -1, inputStream, iArr, null);
            if (LIZJ == null || iArr[0] <= 0) {
                return null;
            }
            return LIZJ;
        } catch (Exception e) {
            try {
                interfaceC64717Pab.LIZ();
            } catch (Throwable unused) {
            }
            throw e;
        }
    }

    public static byte[] LIZJ(boolean z, java.util.Map<String, List<String>> map, int i, InputStream inputStream, int[] iArr, C64738Paw c64738Paw) {
        boolean z2;
        int i2;
        int i3;
        int read;
        int length;
        if (i <= 0) {
            i = 5242880;
        }
        if (i < 1048576) {
            i = 1048576;
        }
        if (inputStream == null) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            inputStream = LIZIZ(inputStream, map, z, c64738Paw);
            int i4 = LIZ;
            boolean z3 = true;
            if (i4 >= 4096 && i4 <= 5242880) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                i2 = 32768;
            } else {
                i2 = LIZ;
            }
            int i5 = LIZIZ;
            if (i5 < 4096 || i5 > 5242880) {
                z3 = false;
            }
            if (!z3) {
                i3 = 102400;
            } else {
                i3 = LIZIZ;
            }
            byte[] bArr = new byte[i2];
            int i6 = 0;
            do {
                try {
                    if (i6 + 4096 > bArr.length) {
                        if (bArr.length < i3) {
                            length = bArr.length + i3;
                        } else {
                            length = bArr.length * 2;
                        }
                        byte[] bArr2 = new byte[length];
                        System.arraycopy(bArr, 0, bArr2, 0, i6);
                        bArr = bArr2;
                    }
                    read = inputStream.read(bArr, i6, bArr.length - i6);
                } catch (EOFException e) {
                    if (!z || i6 <= 0) {
                        throw e;
                    }
                } catch (IOException e2) {
                    String message = e2.getMessage();
                    if (!z || i6 <= 0 || (!"CRC mismatch".equals(message) && !"Size mismatch".equals(message))) {
                        throw e2;
                    }
                } catch (OutOfMemoryError unused) {
                    LJ(inputStream);
                    return null;
                }
                if (read > 0) {
                    i6 += read;
                } else {
                    if (i6 > 0) {
                        if (c64738Paw != null) {
                            ((HashMap) c64738Paw.LJJJI).put("streamReadTime", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                            ((HashMap) c64738Paw.LJJJI).put("streamReadByteCount", Long.valueOf(i6));
                        }
                        iArr[0] = i6;
                        LJ(inputStream);
                        return bArr;
                    }
                    LJ(inputStream);
                    return null;
                }
            } while (i6 <= i);
            throw new C48185Ivd(i, i6);
        } catch (Throwable th) {
            LJ(inputStream);
            throw th;
        }
    }
}
