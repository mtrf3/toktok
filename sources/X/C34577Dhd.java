package X;

import com.google.gson.g;
import com.google.gson.j;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Dhd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34577Dhd {
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();
    public static boolean LIZIZ = false;

    public static HashMap<String, Boolean> LIZ() {
        if (!LIZIZ) {
            synchronized (C34577Dhd.class) {
                if (!LIZIZ) {
                    g gVar = (g) C34578Dhe.LIZ.getValue();
                    if (gVar != null) {
                        Iterator<j> it = gVar.iterator();
                        while (it.hasNext()) {
                            LIZ.put((String) C09650Zl.LIZIZ.LIZJ(it.next(), String.class), Boolean.TRUE);
                        }
                    }
                    LIZIZ = true;
                }
            }
        }
        return LIZ;
    }
}
