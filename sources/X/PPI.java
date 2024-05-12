package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PPI {
    public static final C64537PUn LIZ = C64537PUn.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] LIZIZ = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] LIZJ = new String[64];
    public static final String[] LIZLLL = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = LIZLLL;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = PVA.LJIIJJI("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = LIZJ;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        StringBuilder LIZ2 = X1D.LIZ();
        strArr2[9] = JBR.LJFF(LIZ2, strArr2[1], "|PADDED", LIZ2);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i3 = 0;
        do {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = LIZJ;
            int i6 = i5 | i4;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(strArr3[i5]);
            LIZ3.append('|');
            LIZ3.append(strArr3[i4]);
            strArr3[i6] = X1D.LIZIZ(LIZ3);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(strArr3[i5]);
            LIZ4.append('|');
            strArr3[i6 | 8] = JBR.LJFF(LIZ4, strArr3[i4], "|PADDED", LIZ4);
            i3++;
        } while (i3 < 3);
        while (true) {
            String[] strArr4 = LIZJ;
            if (i < strArr4.length) {
                if (strArr4[i] == null) {
                    strArr4[i] = LIZLLL[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static void LIZIZ(String str, Object... objArr) {
        throw new IOException(PVA.LJIIJJI(str, objArr));
    }

    public static String LIZ(boolean z, int i, int i2, byte b, byte b2) {
        String LJIIJJI;
        String str;
        String str2;
        String[] strArr = LIZIZ;
        if (b < strArr.length) {
            LJIIJJI = strArr[b];
        } else {
            LJIIJJI = PVA.LJIIJJI("0x%02x", Byte.valueOf(b));
        }
        if (b2 == 0) {
            str = "";
        } else {
            if (b != 2 && b != 3) {
                if (b != 4 && b != 6) {
                    if (b != 7 && b != 8) {
                        String[] strArr2 = LIZJ;
                        if (b2 < strArr2.length) {
                            str = strArr2[b2];
                        } else {
                            str = LIZLLL[b2];
                        }
                        if (b == 5) {
                            if ((b2 & 4) != 0) {
                                str = str.replace("HEADERS", "PUSH_PROMISE");
                            }
                        } else if (b == 0 && (b2 & 32) != 0) {
                            str = str.replace("PRIORITY", "COMPRESSED");
                        }
                    }
                } else if (b2 == 1) {
                    str = "ACK";
                } else {
                    str = LIZLLL[b2];
                }
            }
            str = LIZLLL[b2];
        }
        Object[] objArr = new Object[5];
        if (z) {
            str2 = "<<";
        } else {
            str2 = ">>";
        }
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = LJIIJJI;
        objArr[4] = str;
        return PVA.LJIIJJI("%s 0x%08x %5d %-13s %s", objArr);
    }
}
