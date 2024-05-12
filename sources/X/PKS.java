package X;

import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class PKS {
    public static C64311PLv<Integer, Pair<Long, String>> LIZ;
    public static boolean LIZIZ;

    public static void LIZ() {
        String[] list;
        int LJIIIIZZ;
        File file = new File(PKQ.LIZJ, "exit_info");
        if (file.exists() && (list = file.list()) != null && list.length > (LJIIIIZZ = PJA.LJIIIIZZ(50, "custom_event_settings", "npth_simple_setting", "exit_reason_limit"))) {
            Arrays.sort(list);
            for (LJIIIIZZ = PJA.LJIIIIZZ(50, "custom_event_settings", "npth_simple_setting", "exit_reason_limit"); LJIIIIZZ < list.length; LJIIIIZZ++) {
                PK8.LIZJ(new File(file, list[LJIIIIZZ]));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:146|45|46|47|(2:48|49)|50|(1:52)|121|122|123|124|55|(3:56|(0)(0)|118)|95|96|97|98|(1:99)|110|111) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d6, code lost:
    
        X.C78685UuP.LJLIL();
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03e7 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #3 {all -> 0x0067, blocks: (B:98:0x03db, B:99:0x03e1, B:101:0x03e7, B:108:0x03f2, B:103:0x03ed), top: B:97:0x03db, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ() {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKS.LIZJ():void");
    }

    public static String LIZIZ(int i, long j) {
        File file;
        C64311PLv<Integer, Pair<Long, String>> c64311PLv = LIZ;
        if (c64311PLv == null) {
            File file2 = new File(PKQ.LIZJ, "exit_info");
            LIZ = new C64311PLv<>();
            if (!file2.exists()) {
                c64311PLv = LIZ;
            } else {
                String[] list = file2.list();
                if (list == null) {
                    c64311PLv = LIZ;
                } else {
                    for (String str : list) {
                        String[] split = str.split("_");
                        if (split.length == 2) {
                            LIZ.add(Integer.valueOf((int) PKQ.LIZJ(-1L, split[1])), new Pair<>(Long.valueOf(PKQ.LIZJ(-1L, split[0])), str));
                        }
                    }
                    c64311PLv = LIZ;
                }
            }
        }
        List list2 = (List) c64311PLv.get(Integer.valueOf(i));
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (Math.abs(((Long) pair.first).longValue() - j) < 3000) {
                    File file3 = PKQ.LIZJ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("exit_info/");
                    LIZ2.append((String) pair.second);
                    file = new File(file3, X1D.LIZIZ(LIZ2));
                    break;
                }
            } else {
                file = null;
                break;
            }
        }
        if (file == null) {
            File file4 = PKQ.LIZJ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("exit_info/");
            LIZ3.append((String) ((Pair) ListProtector.get(list2, 0)).second);
            file = new File(file4, X1D.LIZIZ(LIZ3));
        }
        try {
            return PK8.LJ(file);
        } catch (IOException unused) {
            return null;
        }
    }
}
