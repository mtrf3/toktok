package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class FF9 {
    public static final List<WeakReference<FFA>> LIZ = new ArrayList();

    public static void LIZ() {
        try {
            Iterator it = ((ArrayList) LIZ).iterator();
            while (it.hasNext()) {
                FFA ffa = (FFA) ((WeakReference) it.next()).get();
                if (ffa != null) {
                    ffa.LJFF();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
