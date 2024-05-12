package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.PVx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64573PVx {
    public static final C64537PUn LIZ = C64537PUn.encodeUtf8("\"\\");
    public static final C64537PUn LIZIZ = C64537PUn.encodeUtf8("\t ,=");

    public static long LIZ(C64598PWw c64598PWw) {
        String LIZLLL = c64598PWw.LJLJJLL.LIZLLL("Content-Length");
        if (LIZLLL != null) {
            try {
                return CastLongProtector.parseLong(LIZLLL);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static boolean LIZIZ(C64598PWw c64598PWw) {
        if (c64598PWw.LJLIL.method().equals("HEAD")) {
            return false;
        }
        int i = c64598PWw.LJLJI;
        if (i >= 100 && ((i < 200 || i == 204 || i == 304) && LIZ(c64598PWw) == -1 && !"chunked".equalsIgnoreCase(c64598PWw.LIZ("Transfer-Encoding", null)))) {
            return false;
        }
        return true;
    }

    public static String LIZLLL(C64533PUj c64533PUj) {
        try {
            long LJI = c64533PUj.LJI(LIZIZ);
            if (LJI == -1) {
                LJI = c64533PUj.LJLILLLLZI;
            }
            if (LJI != 0) {
                return c64533PUj.LJJIFFI(LJI);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static int LJFF(C64533PUj c64533PUj) {
        int i = 0;
        while (!c64533PUj.LLJ() && c64533PUj.LJ(0L) == 61) {
            i++;
            c64533PUj.readByte();
        }
        return i;
    }

    public static boolean LJII(C64533PUj c64533PUj) {
        boolean z = false;
        while (!c64533PUj.LLJ()) {
            byte LJ = c64533PUj.LJ(0L);
            if (LJ == 44) {
                c64533PUj.readByte();
                z = true;
            } else {
                if (LJ != 32 && LJ != 9) {
                    break;
                }
                c64533PUj.readByte();
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [long] */
    public static int LIZJ(int i, String str) {
        try {
            i = CastLongProtector.parseLong(str);
            if (i > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (i < 0) {
                return 0;
            }
            return (int) i;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static void LJ(InterfaceC61701OJl interfaceC61701OJl, C64626PXy c64626PXy, C64606PXe c64606PXe) {
        List<C61702OJm> emptyList;
        if (interfaceC61701OJl == InterfaceC61701OJl.LIZ) {
            return;
        }
        List<String> LJIIJJI = c64606PXe.LJIIJJI("Set-Cookie");
        int size = LJIIJJI.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C61702OJm LIZIZ2 = C61702OJm.LIZIZ(c64626PXy, (String) ListProtector.get(LJIIJJI, i));
            if (LIZIZ2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LIZIZ2);
            }
        }
        if (arrayList != null) {
            emptyList = Collections.unmodifiableList(arrayList);
        } else {
            emptyList = Collections.emptyList();
        }
        if (emptyList.isEmpty()) {
            return;
        }
        interfaceC61701OJl.LIZIZ(c64626PXy, emptyList);
    }

    public static int LJI(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }
}
