package X;

import defpackage.i0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FPc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38916FPc {
    public static final C38917FPd LIZ = new C38917FPd((((int) Runtime.getRuntime().maxMemory()) / 1024) / 8);

    public static String LIZ(String url, List regexList, boolean z) {
        boolean z2;
        o.LJIIJ(url, "url");
        if (regexList == null || regexList.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = "";
        if (z2) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = LIZ.get(url);
        if (str2 != null) {
            System.out.println((Object) i0.LJFF("hit cache: ", str2));
            LIZIZ(currentTimeMillis, url, true);
            return str2;
        }
        if (z) {
            o.LJIIJ(regexList, "regexList");
            Iterator it = regexList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C38918FPe c38918FPe = (C38918FPe) it.next();
                if (c38918FPe.LJLILLLLZI.containsMatchIn(url)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(c38918FPe.LJLILLLLZI);
                    LIZ2.append(" match ");
                    LIZ2.append(c38918FPe.LJLIL);
                    System.out.print((Object) X1D.LIZIZ(LIZ2));
                    str = c38918FPe.LJLIL;
                    break;
                }
            }
            LIZ.put(url, str);
            LIZIZ(currentTimeMillis, url, false);
        }
        return str;
    }

    public static void LIZIZ(long j, String str, boolean z) {
        C40048Fng.LIZIZ(null, "regex_perf", C113554cx.LJJL(new OSZ("url", str), new OSZ("hit_cache", String.valueOf(z))), C51029K0z.LJJIIZI(new OSZ("regex_match_time", C44847Hit.LIZ(j))));
    }
}
