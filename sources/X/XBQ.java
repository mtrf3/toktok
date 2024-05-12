package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBQ {
    public static String LIZJ(String fileName) {
        o.LJIIJ(fileName, "fileName");
        char[] cArr = new char[fileName.length()];
        int length = fileName.length();
        for (int i = 0; i < length; i++) {
            char charAt = fileName.charAt(i);
            cArr[i] = charAt;
            if (charAt != '_' && charAt != '-') {
                if (charAt >= 'a') {
                    if (charAt <= 'z') {
                    }
                    cArr[i] = '_';
                } else {
                    if (charAt >= '0' && charAt <= '9') {
                    }
                    cArr[i] = '_';
                }
            }
        }
        return new String(cArr);
    }

    public static void LIZIZ(C10830bf c10830bf, C10830bf c10830bf2, boolean z) {
        if (!z || !C10820be.LJFF(c10830bf2) || C10820be.LJIILLIIL(c10830bf2)) {
            if (C10820be.LJIIZILJ(c10830bf, c10830bf2)) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("rename file exception occur, from = ");
            LIZ.append(c10830bf);
            LIZ.append(",to = ");
            LIZ.append(c10830bf2);
            throw new C10850bh(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("delete file exception occur,file = ");
        LIZ2.append(c10830bf2);
        throw new C10850bh(X1D.LIZIZ(LIZ2));
    }

    public static XBL LIZ(String directory, int i, int i2, long j, XC4 xc4, boolean z) {
        C10830bf LIZ;
        o.LJIIJ(directory, "directory");
        if (j > 0) {
            if (i2 > 0) {
                if (!C10820be.LJ(directory)) {
                    C10820be.LJIIJJI(directory);
                    if (!C10820be.LJ(directory)) {
                        C12310e3 c12310e3 = C12310e3.LIZIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Cache directory error");
                        LIZ2.append(directory);
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        c12310e3.getClass();
                        C12310e3.LIZIZ("DiskLruCache", LIZIZ, null);
                    }
                }
                C10830bf LIZ3 = new C10830bf(directory).LIZ("journal.bkp");
                if (LIZ3 != null && C10820be.LJFF(LIZ3) && (LIZ = new C10830bf(directory).LIZ("journal")) != null && C10820be.LJFF(LIZ)) {
                    if (C10820be.LJFF(LIZ)) {
                        C10820be.LJIILLIIL(LIZ3);
                    } else {
                        XBL.LJIJJ.getClass();
                        LIZIZ(LIZ3, LIZ, false);
                    }
                }
                XBL xbl = new XBL(directory, i, i2, j, xc4, z);
                if (C10820be.LJFF(xbl.LIZ)) {
                    try {
                        xbl.LJIIL();
                        xbl.LJIIJ();
                        xbl.LJII.LIZ = Boolean.TRUE;
                        return xbl;
                    } catch (Exception e) {
                        C12310e3 c12310e32 = C12310e3.LIZIZ;
                        StringBuilder LIZIZ2 = C25620zW.LIZIZ("DiskLruCache ", directory, " is corrupt: ");
                        LIZIZ2.append(e.getMessage());
                        LIZIZ2.append(", removing");
                        String LIZIZ3 = X1D.LIZIZ(LIZIZ2);
                        c12310e32.getClass();
                        C12310e3.LIZIZ("DiskLruCache", LIZIZ3, null);
                        xbl.LIZLLL();
                    }
                }
                C10820be.LJIIJJI(directory);
                XBL xbl2 = new XBL(directory, i, i2, j, xc4, z);
                xbl2.LJIILJJIL();
                return xbl2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
