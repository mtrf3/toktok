package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EPG {
    public static final EPG LIZ = new EPG();

    public static ArrayList LIZ(String srcDir) {
        o.LJIIIZ(srcDir, "srcDir");
        File[] files = new File(srcDir).listFiles();
        ArrayList arrayList = new ArrayList();
        o.LJIIIIZZ(files, "files");
        ArrayList arrayList2 = new ArrayList();
        for (File file : files) {
            String absolutePath = file.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "it.absolutePath");
            if (s.LJJJLZIJ(absolutePath, "custom_sticker", false)) {
                arrayList2.add(file);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }
}
