package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class O1K {
    public static final List<String> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("http");
        arrayList.add("local_file");
        arrayList.add("assets");
        arrayList.add("https");
        arrayList.add("lynxview");
        LIZ = arrayList;
    }

    public static boolean LIZ(O1E config, String url) {
        o.LJIIJ(config, "config");
        o.LJIIJ(url, "url");
        if (!(!((ArrayList) config.LIZJ).isEmpty())) {
            return true;
        }
        Iterator it = ((ArrayList) config.LIZJ).iterator();
        while (it.hasNext()) {
            if (s.LJJJLZIJ(url, (String) it.next(), false)) {
                return false;
            }
        }
        return true;
    }

    public static void LIZIZ(O1I resource, O1L config) {
        o.LJIIJ(resource, "resource");
        o.LJIIJ(config, "config");
        boolean z = true;
        if (!ORZ.LJLJJI(resource.LJFF.getScheme(), LIZ) && resource.LJIIIIZZ == null && config.LJ.length() <= 0) {
            z = false;
        }
        resource.LJIIJJI = z;
    }
}
