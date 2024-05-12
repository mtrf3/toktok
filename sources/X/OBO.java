package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class OBO {
    public static int LIZJ;
    public static final ONJ LIZ = new ONJ("Frequency");
    public static final Keva LIZIZ = Keva.getRepo("repo_multi_survey");
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static final ArrayList<OMV> LJ = new ArrayList<>();

    public static List LIZ() {
        int i;
        ArrayList<OMV> arrayList = LJ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<OMV> it = arrayList.iterator();
        while (it.hasNext()) {
            OMV next = it.next();
            OMV omv = next;
            int i2 = omv.LIZIZ;
            if (i2 > 0 && (i = omv.LIZ) >= 0 && i == ((int) ((System.currentTimeMillis() / 1000) / 86400)) % i2) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
