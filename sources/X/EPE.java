package X;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EPE {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(EPD.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C34865DmH.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    public static void LIZ() {
        ?? r5;
        if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
            return;
        }
        try {
            Context LIZIZ2 = EF7.LIZIZ();
            long LJI = EF7.LJI();
            File LLIIJLIL = C16880lQ.LLIIJLIL(LIZIZ2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("splitcompat/");
            LIZ2.append(LJI);
            LIZ2.append("/verified-splits");
            File file = new File(LLIIJLIL, X1D.LIZIZ(LIZ2));
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    r5 = new ArrayList();
                    for (File file2 : listFiles) {
                        if (file2.isFile() && o.LJ(OR7.LLLIILIL(file2), "apk")) {
                            r5.add(file2);
                        }
                    }
                } else {
                    r5 = C61878OQg.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : r5) {
                    String name = ((File) obj).getName();
                    o.LJIIIIZZ(name, "it.name");
                    if (ujb.o.LJJJLIIL(name, "config.", false)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file3 = (File) it.next();
                    C16880lQ.LLLZZIL(file3);
                    File LLIIJLIL2 = C16880lQ.LLIIJLIL(LIZIZ2);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("splitcompat/");
                    LIZ3.append(LJI);
                    LIZ3.append("/native-libraries/");
                    LIZ3.append(OR7.LLLIL(file3));
                    C16880lQ.LLLZZIL(new File(LLIIJLIL2, X1D.LIZIZ(LIZ3)));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : r5) {
                    String name2 = ((File) obj2).getName();
                    o.LJIIIIZZ(name2, "it.name");
                    if (s.LJJJLZIJ(name2, ".config.arm64_v8a", false)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    File it3 = (File) it2.next();
                    o.LJIIIIZZ(it3, "it");
                    arrayList3.add(s.LJJZZIII(".config.arm64_v8a", OR7.LLLIL(it3)));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : r5) {
                    File apkName = (File) obj3;
                    if (!arrayList3.isEmpty()) {
                        Iterator it4 = arrayList3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                String str = (String) it4.next();
                                o.LJIIIIZZ(apkName, "apkName");
                                if (OR7.LLLILZLLLI(apkName, str)) {
                                    arrayList4.add(obj3);
                                    break;
                                }
                            }
                        }
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    File file4 = (File) it5.next();
                    C16880lQ.LLLZZIL(file4);
                    File LLIIJLIL3 = C16880lQ.LLIIJLIL(LIZIZ2);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("splitcompat/");
                    LIZ4.append(LJI);
                    LIZ4.append("/native-libraries/");
                    LIZ4.append(OR7.LLLIL(file4));
                    C16880lQ.LLLZZIL(new File(LLIIJLIL3, X1D.LIZIZ(LIZ4)));
                }
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }
}
