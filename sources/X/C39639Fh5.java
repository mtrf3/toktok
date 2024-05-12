package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Fh5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39639Fh5 {
    public static final List<String> LIZ = new CopyOnWriteArrayList();
    public static final List<String> LIZIZ = new CopyOnWriteArrayList();
    public static final List<String> LIZJ = new CopyOnWriteArrayList();
    public static final List<String> LIZLLL = new CopyOnWriteArrayList();

    public static String LIZ() {
        StringBuilder sb = new StringBuilder();
        Iterator it = ((CopyOnWriteArrayList) LIZ).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(" ==\n");
        }
        sb.append("-----------------------------------\n");
        Iterator it2 = ((CopyOnWriteArrayList) LIZIZ).iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append(" ==\n");
        }
        sb.append("-----------------------------------\n");
        Iterator it3 = ((CopyOnWriteArrayList) LIZJ).iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            sb.append(" ==\n");
        }
        sb.append("-----------------------------------\n");
        Iterator it4 = ((CopyOnWriteArrayList) LIZLLL).iterator();
        while (it4.hasNext()) {
            sb.append((String) it4.next());
            sb.append(" ==\n");
        }
        sb.append("-----------------------------------\n");
        return sb.toString();
    }
}
