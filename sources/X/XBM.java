package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.i0;
import java.io.File;
import java.util.List;
import ujb.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class XBM {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (str != null) {
            String str2 = C10820be.LIZ;
            if (o.LJJJJ(str, str2, false)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(C40689Fy1.LLFFF(1, str));
                LIZ2.append("_tmp");
                LIZ2.append(str2);
                return X1D.LIZIZ(LIZ2);
            }
            return i0.LJFF(str, "_tmp");
        }
        return null;
    }

    public static void LIZLLL(C10830bf c10830bf) {
        if (c10830bf != null && !C10820be.LJIILLIIL(c10830bf) && C10820be.LJFF(c10830bf)) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("remove file: ");
            LIZ2.append(c10830bf.LIZIZ);
            LIZ2.append(" failed!");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            c12310e3.getClass();
            C12310e3.LIZIZ("FileUtils", LIZIZ, null);
            String str = c10830bf.LIZIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(c10830bf.LIZIZ);
            LIZ3.append("_dirty");
            LJIIIIZZ(str, X1D.LIZIZ(LIZ3), true);
        }
    }

    public static boolean LJ(String str) {
        if (str != null) {
            boolean LJIILL = C10820be.LJIILL(str);
            if (!LJIILL && C10820be.LJ(str)) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("remove file: ");
                LIZ2.append(str);
                LIZ2.append(" failed!");
                String LIZIZ = X1D.LIZIZ(LIZ2);
                c12310e3.getClass();
                C12310e3.LIZIZ("FileUtils", LIZIZ, null);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str);
                LIZ3.append("_dirty");
                LJIIIIZZ(str, X1D.LIZIZ(LIZ3), true);
            }
            return LJIILL;
        }
        return false;
    }

    public static String LJFF(String str) {
        int LJJLIIJ;
        if (str == null || (LJJLIIJ = s.LJJLIIJ(str, C10820be.LIZ, 6)) < 0) {
            return null;
        }
        String substring = str.substring(LJJLIIJ + 1, str.length());
        kotlin.jvm.internal.o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static long LJI(String str) {
        long j;
        if (str == null) {
            return 0L;
        }
        C32621Pu LIZ2 = C10820be.LIZ(new File(str));
        if (LIZ2.LJLJL == EnumC10840bg.Directory) {
            List<C32621Pu> LJIILJJIL = C10820be.LJIILJJIL(str);
            if (LJIILJJIL == null) {
                return 0L;
            }
            long j2 = 0;
            for (C32621Pu c32621Pu : LJIILJJIL) {
                if (c32621Pu.LJLJL == EnumC10840bg.Directory) {
                    j = LJI(c32621Pu.LJLILLLLZI.LIZIZ);
                } else {
                    Long l = c32621Pu.LJLJJLL;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                }
                j2 += j;
            }
            return j2;
        }
        Long l2 = LIZ2.LJLJJLL;
        if (l2 == null) {
            return 0L;
        }
        return l2.longValue();
    }

    public static String LJII(String str) {
        int LJJLIIJ;
        if (str == null || (LJJLIIJ = s.LJJLIIJ(str, C10820be.LIZ, 6)) < 0) {
            return null;
        }
        String substring = str.substring(0, LJJLIIJ);
        kotlin.jvm.internal.o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static void LJIIIZ(String outFilePath, C84426XBm c84426XBm) {
        kotlin.jvm.internal.o.LJIIJ(outFilePath, "outFilePath");
        LIZIZ(c84426XBm, C10820be.LJIIL(outFilePath, false), 0L, null);
    }

    public static boolean LJIIIIZZ(String str, String destPath, boolean z) {
        kotlin.jvm.internal.o.LJIIJ(destPath, "destPath");
        if (str == null) {
            return false;
        }
        if (!new File(str).getAbsoluteFile().renameTo(new File(destPath).getAbsoluteFile())) {
            if (!z) {
                return false;
            }
            return C10820be.LJIIZILJ(new C10830bf(str), new C10830bf(destPath));
        }
        return true;
    }

    public static long LIZIZ(C84426XBm c84426XBm, C32631Pv c32631Pv, long j, InterfaceC88471Ynr interfaceC88471Ynr) {
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        int read = c84426XBm.LIZIZ.read(bArr, 0, FileUtils.BUFFER_SIZE);
        long j2 = 0;
        while (read > 0) {
            c32631Pv.LIZIZ(bArr, read);
            j2 += read;
            if (j2 < j && j > 0 && interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(Integer.valueOf((int) ((((float) j2) / ((float) j)) * 100)), Long.valueOf(j));
            }
            read = c84426XBm.LIZIZ.read(bArr, 0, FileUtils.BUFFER_SIZE);
        }
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(100, Long.valueOf(j));
        }
        c32631Pv.LIZ();
        c32631Pv.close();
        return j2;
    }

    public static String LIZJ(C32611Pt c32611Pt, C32631Pv c32631Pv, long j, InterfaceC88471Ynr interfaceC88471Ynr) {
        C1OW c1ow = new C1OW();
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        int LIZ2 = c32611Pt.LIZ(bArr, FileUtils.BUFFER_SIZE);
        long j2 = 0;
        while (LIZ2 > 0) {
            c32631Pv.LIZIZ(bArr, LIZ2);
            j2 += LIZ2;
            c1ow.LJFF(bArr, LIZ2);
            if (j2 < j && j > 0 && interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(Integer.valueOf((int) ((((float) j2) / ((float) j)) * 100)), Long.valueOf(j));
            }
            LIZ2 = c32611Pt.LIZ(bArr, FileUtils.BUFFER_SIZE);
        }
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(100, Long.valueOf(j));
        }
        byte[] LJ = c1ow.LJ();
        c32631Pv.LIZ();
        c32631Pv.close();
        return C09100Xi.LIZ(LJ);
    }
}
